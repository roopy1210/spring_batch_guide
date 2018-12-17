package com.batchguide.dto;

public class BlackFridayDTO {

	private String user_id;
	
	private String product_id;
	
	private String gender;
	
	private String age;
	
	private String occupation;
	
	private String city_category;
	
	private String stay_in_current_city_years;
	
	private String marital_status;
	
	private String product_category_1;
	
	private String product_category_2;
	
	private String product_category_3;
	
	private String purchase;

	/**
	 * @return the user_id
	 */
	public String getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id.trim();;
	}

	/**
	 * @return the product_id
	 */
	public String getProduct_id() {
		return product_id;
	}

	/**
	 * @param product_id the product_id to set
	 */
	public void setProduct_id(String product_id) {
		this.product_id = product_id.trim();;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender.trim();;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age.trim();;
	}

	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}

	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation.trim();;
	}

	/**
	 * @return the city_category
	 */
	public String getCity_category() {
		return city_category;
	}

	/**
	 * @param city_category the city_category to set
	 */
	public void setCity_category(String city_category) {
		this.city_category = city_category.trim();;
	}

	/**
	 * @return the stay_in_current_city_years
	 */
	public String getStay_in_current_city_years() {
		return stay_in_current_city_years;
	}

	/**
	 * @param stay_in_current_city_years the stay_in_current_city_years to set
	 */
	public void setStay_in_current_city_years(String stay_in_current_city_years) {
		this.stay_in_current_city_years = stay_in_current_city_years.trim();;
	}

	/**
	 * @return the marital_status
	 */
	public String getMarital_status() {
		return marital_status;
	}

	/**
	 * @param marital_status the marital_status to set
	 */
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status.trim();;
	}

	/**
	 * @return the product_category_1
	 */
	public String getProduct_category_1() {
		return product_category_1;
	}

	/**
	 * @param product_category_1 the product_category_1 to set
	 */
	public void setProduct_category_1(String product_category_1) {
		this.product_category_1 = product_category_1.trim();;
	}

	/**
	 * @return the product_category_2
	 */
	public String getProduct_category_2() {
		return product_category_2;
	}

	/**
	 * @param product_category_2 the product_category_2 to set
	 */
	public void setProduct_category_2(String product_category_2) {
		this.product_category_2 = product_category_2.trim();;
	}

	/**
	 * @return the product_category_3
	 */
	public String getProduct_category_3() {
		return product_category_3;
	}

	/**
	 * @param product_category_3 the product_category_3 to set
	 */
	public void setProduct_category_3(String product_category_3) {
		this.product_category_3 = product_category_3.trim();;
	}

	/**
	 * @return the purchase
	 */
	public String getPurchase() {
		return purchase;
	}

	/**
	 * @param purchase the purchase to set
	 */
	public void setPurchase(String purchase) {
		this.purchase = purchase.trim();;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BlackFridayDTO [user_id=" + user_id + ", product_id=" + product_id + ", gender=" + gender + ", age="
				+ age + ", occupation=" + occupation + ", city_category=" + city_category
				+ ", stay_in_current_city_years=" + stay_in_current_city_years + ", marital_status=" + marital_status
				+ ", product_category_1=" + product_category_1 + ", product_category_2=" + product_category_2
				+ ", product_category_3=" + product_category_3 + ", purchase=" + purchase + "]";
	}
}
