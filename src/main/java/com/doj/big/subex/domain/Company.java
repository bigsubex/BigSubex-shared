/**
 * 
 */
package com.doj.big.subex.domain;

import java.io.Serializable;

/**
 * @author Dinesh.Rajput
 *
 */
public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String dnbnumber;
	private String firmName;
	private String place;
	private String land;
	private String knowAs;
	private String zip;
	private String street;
	private String street2;
	private String district;
	private String postOffice;
	private String postBoxOffice;
	private String url;
	private String city;
	private String country;
	private String inputBy;
	private String inputOn;
	private String updatedBy;
	private String updatedOn;
	
	public String getDnbnumber() {
		return dnbnumber;
	}
	public void setDnbnumber(String dnbnumber) {
		this.dnbnumber = dnbnumber;
	}
	public String getFirmName() {
		return firmName;
	}
	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public String getKnowAs() {
		return knowAs;
	}
	public void setKnowAs(String knowAs) {
		this.knowAs = knowAs;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPostOffice() {
		return postOffice;
	}
	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}
	public String getPostBoxOffice() {
		return postBoxOffice;
	}
	public void setPostBoxOffice(String postBoxOffice) {
		this.postBoxOffice = postBoxOffice;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getInputBy() {
		return inputBy;
	}
	public void setInputBy(String inputBy) {
		this.inputBy = inputBy;
	}
	public String getInputOn() {
		return inputOn;
	}
	public void setInputOn(String inputOn) {
		this.inputOn = inputOn;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}
	
}
