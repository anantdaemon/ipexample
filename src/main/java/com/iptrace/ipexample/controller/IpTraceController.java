package com.iptrace.ipexample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iptrace.ipexample.dto.GeoLocation;
import com.iptrace.ipexample.service.IpTraceService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class IpTraceController {
	
	@Autowired
	IpTraceService ipService;
	
	Logger LOGER = LoggerFactory.getLogger(IpTraceController.class);
	
    @GetMapping("/client-ip")
    public GeoLocation getClientIP(HttpServletRequest request) {
    	GeoLocation clientLocation = ipService.getClientIpAddress(request);
        return clientLocation;
    }

}
