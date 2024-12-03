package com.iptrace.ipexample.service;

import com.iptrace.ipexample.dto.GeoLocation;

import jakarta.servlet.http.HttpServletRequest;

public interface IpTraceService {

	public GeoLocation getClientIpAddress(HttpServletRequest request);
}
