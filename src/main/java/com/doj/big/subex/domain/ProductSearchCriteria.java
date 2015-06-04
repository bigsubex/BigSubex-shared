/**
 * 
 */
package com.doj.big.subex.domain;

/**
 * @author Dinesh.Rajput
 *
 */
public class ProductSearchCriteria {
	
	private String part_group;
	private String product_family;
	private String ordered_by;
	private String offered_by;
	private String year;
	
	public String getPart_group() {
		return part_group;
	}
	public void setPart_group(String part_group) {
		this.part_group = part_group;
	}
	public String getProduct_family() {
		return product_family;
	}
	public void setProduct_family(String product_family) {
		this.product_family = product_family;
	}
	public String getOrdered_by() {
		return ordered_by;
	}
	public void setOrdered_by(String ordered_by) {
		this.ordered_by = ordered_by;
	}
	public String getOffered_by() {
		return offered_by;
	}
	public void setOffered_by(String offered_by) {
		this.offered_by = offered_by;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
}
