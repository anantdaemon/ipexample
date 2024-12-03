package com.iptrace.ipexample.service.impl;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.iptrace.ipexample.controller.IpTraceController;
import com.iptrace.ipexample.dto.GeoLocation;
import com.iptrace.ipexample.service.IpTraceService;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class IpTraceServiceImpl implements IpTraceService{
	
	Logger LOGER = LoggerFactory.getLogger(IpTraceController.class);
	
	private static final String API_URL = "http://ip-api.com/json/";
	
	public GeoLocation getClientIpAddress(HttpServletRequest request) {
		LOGER.info("\n\nRequest "+request.getRemoteAddr().toString());
        String clientIp = request.getHeader("X-Forwarded-For");
        if (clientIp == null || clientIp.isEmpty() || "unknown".equalsIgnoreCase(clientIp)) {
            clientIp = request.getRemoteAddr();
        }
        return getGeoLocationByIp(clientIp);
    }
	
	
	/**
	 * ip-api service is used in this example, but you can switch to other services like ipinfo.io
	 * 
	 * @param ipAddress
	 * @return
	 */
	private GeoLocation getGeoLocationByIp(String ipAddress) {
        String url = API_URL + ipAddress;

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        JSONObject jsonResponse = new JSONObject(response);

        // Check if the API response has a successful status
        if ("fail".equals(jsonResponse.getString("status"))) {
            throw new RuntimeException("Failed to retrieve geolocation data for IP: " + ipAddress);
        }

        double latitude = jsonResponse.getDouble("lat");
        double longitude = jsonResponse.getDouble("lon");

        return new GeoLocation(latitude, longitude);
    } 

}
