package com.iptrace.ipexample.service.impl;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.iptrace.ipexample.controller.IpTraceController;
import com.iptrace.ipexample.dto.GeoLocation;
import com.iptrace.ipexample.entity.GeoLocationEntity;
import com.iptrace.ipexample.repository.GeoLocationRepository;
import com.iptrace.ipexample.service.IpTraceService;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class IpTraceServiceImpl implements IpTraceService{
	
	Logger LOGER = LoggerFactory.getLogger(IpTraceController.class);
	
	@Autowired
    private GeoLocationRepository geoRepository;
	
	private static final String API_URL = "http://ip-api.com/json/?fields=status,message,continent,continentCode,country,countryCode,region,regionName,city,district,zip,lat,lon,timezone,offset,currency,isp,org,as,asname,reverse,mobile,proxy,hosting,query";
	
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
        String url = API_URL;

        RestTemplate restTemplate = new RestTemplate();
        GeoLocation response = restTemplate.getForObject(url, GeoLocation.class);

        JSONObject jsonResponse = new JSONObject(response);

        // Check if the API response has a successful status
        if ("fail".equals(jsonResponse.getString("status"))) {
            throw new RuntimeException("Failed to retrieve geolocation data for IP: " + ipAddress);
        }
        
        GeoLocationEntity geoLocation = new GeoLocationEntity();
        geoLocation.setStatus(response.getStatus());
        geoLocation.setContinent(response.getContinent());
        geoLocation.setContinentCode(response.getContinentCode());
        geoLocation.setCountry(response.getCountry());
        geoLocation.setCountryCode(response.getCountryCode());
        geoLocation.setRegion(response.getRegion());
        geoLocation.setRegionName(response.getRegionName());
        geoLocation.setCity(response.getCity());
        geoLocation.setDistrict(response.getDistrict());
        geoLocation.setZip(response.getZip());
        geoLocation.setLat(response.getLat());
        geoLocation.setLon(response.getLon());
        geoLocation.setTimezone(response.getTimezone());
        geoLocation.setOffset(response.getOffset());
        geoLocation.setCurrency(response.getCurrency());
        geoLocation.setIsp(response.getIsp());
        geoLocation.setOrg(response.getOrg());
        geoLocation.setAs(response.getAs());
        geoLocation.setAsname(response.getAsname());
        geoLocation.setReverse(response.getReverse());
        geoLocation.setMobile(response.isMobile());
        geoLocation.setProxy(response.isProxy());
        geoLocation.setHosting(response.isHosting());
        geoLocation.setIpAddress(response.getQuery());
        
        geoRepository.save(geoLocation);
        return response;
	}
}
