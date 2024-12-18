package com.iptrace.ipexample.dto;

public class GeoLocation {
	
	private String status;
	private String continent;
	private String continentCode;
	private String country;
	private String countryCode;
	private String region;
	private String regionName;
	private String city;
	private String district;
	private int zip;
	private double lat;
	private double lon;
	private String timezone;
	private double offset;
	private String currency;
	private String isp;
	private String org;
	private String as;
	private String asname;
	private String reverse;
	private boolean mobile;
	private boolean proxy;
	private boolean hosting;
	private String query;
	
	/**
	 * @param status
	 * @param continent
	 * @param continentCode
	 * @param country
	 * @param countryCode
	 * @param region
	 * @param regionName
	 * @param city
	 * @param district
	 * @param zip
	 * @param lat
	 * @param lon
	 * @param timezone
	 * @param offset
	 * @param currency
	 * @param isp
	 * @param org
	 * @param as
	 * @param asname
	 * @param reverse
	 * @param mobile
	 * @param proxy
	 * @param hosting
	 * @param query
	 */
	public GeoLocation(String status, String continent, String continentCode, String country, String countryCode,
			String region, String regionName, String city, String district, int zip, double lat, double lon,
			String timezone, double offset, String currency, String isp, String org, String as, String asname,
			String reverse, boolean mobile, boolean proxy, boolean hosting, String query) {
		super();
		this.status = status;
		this.continent = continent;
		this.continentCode = continentCode;
		this.country = country;
		this.countryCode = countryCode;
		this.region = region;
		this.regionName = regionName;
		this.city = city;
		this.district = district;
		this.zip = zip;
		this.lat = lat;
		this.lon = lon;
		this.timezone = timezone;
		this.offset = offset;
		this.currency = currency;
		this.isp = isp;
		this.org = org;
		this.as = as;
		this.asname = asname;
		this.reverse = reverse;
		this.mobile = mobile;
		this.proxy = proxy;
		this.hosting = hosting;
		this.query = query;
	}
	/**
	 * 
	 */
	public GeoLocation() {
		super();
	}
	@Override
	public String toString() {
		return "GeoLocation [status=" + status + ", continent=" + continent + ", continentCode=" + continentCode
				+ ", country=" + country + ", countryCode=" + countryCode + ", region=" + region + ", regionName="
				+ regionName + ", city=" + city + ", district=" + district + ", zip=" + zip + ", lat=" + lat + ", lon="
				+ lon + ", timezone=" + timezone + ", offset=" + offset + ", currency=" + currency + ", isp=" + isp
				+ ", org=" + org + ", as=" + as + ", asname=" + asname + ", reverse=" + reverse + ", mobile=" + mobile
				+ ", proxy=" + proxy + ", hosting=" + hosting + ", query=" + query + "]";
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}
	/**
	 * @param continent the continent to set
	 */
	public void setContinent(String continent) {
		this.continent = continent;
	}
	/**
	 * @return the continentCode
	 */
	public String getContinentCode() {
		return continentCode;
	}
	/**
	 * @param continentCode the continentCode to set
	 */
	public void setContinentCode(String continentCode) {
		this.continentCode = continentCode;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return the regionName
	 */
	public String getRegionName() {
		return regionName;
	}
	/**
	 * @param regionName the regionName to set
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}
	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * @return the zip
	 */
	public int getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(int zip) {
		this.zip = zip;
	}
	/**
	 * @return the lat
	 */
	public double getLat() {
		return lat;
	}
	/**
	 * @param lat the lat to set
	 */
	public void setLat(double lat) {
		this.lat = lat;
	}
	/**
	 * @return the lon
	 */
	public double getLon() {
		return lon;
	}
	/**
	 * @param lon the lon to set
	 */
	public void setLon(double lon) {
		this.lon = lon;
	}
	/**
	 * @return the timezone
	 */
	public String getTimezone() {
		return timezone;
	}
	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	/**
	 * @return the offset
	 */
	public double getOffset() {
		return offset;
	}
	/**
	 * @param offset the offset to set
	 */
	public void setOffset(double offset) {
		this.offset = offset;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the isp
	 */
	public String getIsp() {
		return isp;
	}
	/**
	 * @param isp the isp to set
	 */
	public void setIsp(String isp) {
		this.isp = isp;
	}
	/**
	 * @return the org
	 */
	public String getOrg() {
		return org;
	}
	/**
	 * @param org the org to set
	 */
	public void setOrg(String org) {
		this.org = org;
	}
	/**
	 * @return the as
	 */
	public String getAs() {
		return as;
	}
	/**
	 * @param as the as to set
	 */
	public void setAs(String as) {
		this.as = as;
	}
	/**
	 * @return the asname
	 */
	public String getAsname() {
		return asname;
	}
	/**
	 * @param asname the asname to set
	 */
	public void setAsname(String asname) {
		this.asname = asname;
	}
	/**
	 * @return the reverse
	 */
	public String getReverse() {
		return reverse;
	}
	/**
	 * @param reverse the reverse to set
	 */
	public void setReverse(String reverse) {
		this.reverse = reverse;
	}
	/**
	 * @return the mobile
	 */
	public boolean isMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(boolean mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the proxy
	 */
	public boolean isProxy() {
		return proxy;
	}
	/**
	 * @param proxy the proxy to set
	 */
	public void setProxy(boolean proxy) {
		this.proxy = proxy;
	}
	/**
	 * @return the hosting
	 */
	public boolean isHosting() {
		return hosting;
	}
	/**
	 * @param hosting the hosting to set
	 */
	public void setHosting(boolean hosting) {
		this.hosting = hosting;
	}
	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}
	/**
	 * @param query the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}
	

}
