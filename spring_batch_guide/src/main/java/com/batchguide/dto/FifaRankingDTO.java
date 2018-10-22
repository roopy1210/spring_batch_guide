package com.batchguide.dto;

public class FifaRankingDTO {

private String rank;
	
	private String rank_date;
	
	private String country_full;
	
	private String country_abrv;
	
	private double total_points;
	
	private int previous_points;
	
	private int rank_change;
	
	private double cur_year_avg;
	
	private double cur_year_avg_weighted;
	
	private double last_year_avg;
	
	private double last_year_avg_weighted;
	
	private double two_year_ago_avg;
	
	private double two_year_ago_weighted;
	
	private double three_year_ago_avg;
	
	private double three_year_ago_weighted;
	
	private String confederation;

	/**
	 * @return the rank
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(String rank) {
		this.rank = rank.trim();
	}

	/**
	 * @return the rank_date
	 */
	public String getRank_date() {
		return rank_date;
	}

	/**
	 * @param rank_date the rank_date to set
	 */
	public void setRank_date(String rank_date) {
		this.rank_date = rank_date.replace("-", "").trim();
	}

	/**
	 * @return the country_full
	 */
	public String getCountry_full() {
		return country_full;
	}

	/**
	 * @param country_full the country_full to set
	 */
	public void setCountry_full(String country_full) {
		this.country_full = country_full.trim();
	}

	/**
	 * @return the country_abrv
	 */
	public String getCountry_abrv() {
		return country_abrv;
	}

	/**
	 * @param country_abrv the country_abrv to set
	 */
	public void setCountry_abrv(String country_abrv) {
		this.country_abrv = country_abrv.trim();
	}

	/**
	 * @return the total_points
	 */
	public double getTotal_points() {
		return total_points;
	}

	/**
	 * @param total_points the total_points to set
	 */
	public void setTotal_points(double total_points) {
		this.total_points = total_points;
	}

	/**
	 * @return the previous_points
	 */
	public int getPrevious_points() {
		return previous_points;
	}

	/**
	 * @param previous_points the previous_points to set
	 */
	public void setPrevious_points(int previous_points) {
		this.previous_points = previous_points;
	}

	/**
	 * @return the rank_change
	 */
	public int getRank_change() {
		return rank_change;
	}

	/**
	 * @param rank_change the rank_change to set
	 */
	public void setRank_change(int rank_change) {
		this.rank_change = rank_change;
	}

	/**
	 * @return the cur_year_avg
	 */
	public double getCur_year_avg() {
		return cur_year_avg;
	}

	/**
	 * @param cur_year_avg the cur_year_avg to set
	 */
	public void setCur_year_avg(double cur_year_avg) {
		this.cur_year_avg = cur_year_avg;
	}

	/**
	 * @return the cur_year_avg_weighted
	 */
	public double getCur_year_avg_weighted() {
		return cur_year_avg_weighted;
	}

	/**
	 * @param cur_year_avg_weighted the cur_year_avg_weighted to set
	 */
	public void setCur_year_avg_weighted(double cur_year_avg_weighted) {
		this.cur_year_avg_weighted = cur_year_avg_weighted;
	}

	/**
	 * @return the last_year_avg
	 */
	public double getLast_year_avg() {
		return last_year_avg;
	}

	/**
	 * @param last_year_avg the last_year_avg to set
	 */
	public void setLast_year_avg(double last_year_avg) {
		this.last_year_avg = last_year_avg;
	}

	/**
	 * @return the last_year_avg_weighted
	 */
	public double getLast_year_avg_weighted() {
		return last_year_avg_weighted;
	}

	/**
	 * @param last_year_avg_weighted the last_year_avg_weighted to set
	 */
	public void setLast_year_avg_weighted(double last_year_avg_weighted) {
		this.last_year_avg_weighted = last_year_avg_weighted;
	}

	/**
	 * @return the two_year_ago_avg
	 */
	public double getTwo_year_ago_avg() {
		return two_year_ago_avg;
	}

	/**
	 * @param two_year_ago_avg the two_year_ago_avg to set
	 */
	public void setTwo_year_ago_avg(double two_year_ago_avg) {
		this.two_year_ago_avg = two_year_ago_avg;
	}

	/**
	 * @return the two_year_ago_weighted
	 */
	public double getTwo_year_ago_weighted() {
		return two_year_ago_weighted;
	}

	/**
	 * @param two_year_ago_weighted the two_year_ago_weighted to set
	 */
	public void setTwo_year_ago_weighted(double two_year_ago_weighted) {
		this.two_year_ago_weighted = two_year_ago_weighted;
	}

	/**
	 * @return the three_year_ago_avg
	 */
	public double getThree_year_ago_avg() {
		return three_year_ago_avg;
	}

	/**
	 * @param three_year_ago_avg the three_year_ago_avg to set
	 */
	public void setThree_year_ago_avg(double three_year_ago_avg) {
		this.three_year_ago_avg = three_year_ago_avg;
	}

	/**
	 * @return the three_year_ago_weighted
	 */
	public double getThree_year_ago_weighted() {
		return three_year_ago_weighted;
	}

	/**
	 * @param three_year_ago_weighted the three_year_ago_weighted to set
	 */
	public void setThree_year_ago_weighted(double three_year_ago_weighted) {
		this.three_year_ago_weighted = three_year_ago_weighted;
	}

	/**
	 * @return the confederation
	 */
	public String getConfederation() {
		return confederation;
	}

	/**
	 * @param confederation the confederation to set
	 */
	public void setConfederation(String confederation) {
		this.confederation = confederation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FifaRankingDTO [rank=" + rank + ", rank_date=" + rank_date + ", country_full=" + country_full
				+ ", country_abrv=" + country_abrv + ", total_points=" + total_points + ", previous_points="
				+ previous_points + ", rank_change=" + rank_change + ", cur_year_avg=" + cur_year_avg
				+ ", cur_year_avg_weighted=" + cur_year_avg_weighted + ", last_year_avg=" + last_year_avg
				+ ", last_year_avg_weighted=" + last_year_avg_weighted + ", two_year_ago_avg=" + two_year_ago_avg
				+ ", two_year_ago_weighted=" + two_year_ago_weighted + ", three_year_ago_avg=" + three_year_ago_avg
				+ ", three_year_ago_weighted=" + three_year_ago_weighted + ", confederation=" + confederation + "]";
	}

}
