package com.batchguide.vo;

public class FifaRankingVO {

	private int rnk;
	
	private String rnkDate;
	
	private String countryFull;
	
	private String countryAbrv;
	
	private double totalPoints;
	
	private int previousPoints;
	
	private int rankChange;
	
	private double curYearAvg;
	
	private double curYearAvgWeighted;
	
	private double lastYearAvg;
	
	private double lastYearAvgWeighted;
	
	private double twoYearAgoAvg;
	
	private double twoYearAgoWeighted;
	
	private double threeYearAgoAvg;
	
	private double threeYearAgoWeighted;
	
	private String confederation;

	/**
	 * @return the rnk
	 */
	public int getRnk() {
		return rnk;
	}

	/**
	 * @param rnk the rnk to set
	 */
	public void setRnk(int rnk) {
		this.rnk = rnk;
	}

	/**
	 * @return the rnkDate
	 */
	public String getRnkDate() {
		return rnkDate;
	}

	/**
	 * @param rnkDate the rnkDate to set
	 */
	public void setRnkDate(String rnkDate) {
		this.rnkDate = rnkDate;
	}

	/**
	 * @return the countryFull
	 */
	public String getCountryFull() {
		return countryFull;
	}

	/**
	 * @param countryFull the countryFull to set
	 */
	public void setCountryFull(String countryFull) {
		this.countryFull = countryFull;
	}

	/**
	 * @return the countryAbrv
	 */
	public String getCountryAbrv() {
		return countryAbrv;
	}

	/**
	 * @param countryAbrv the countryAbrv to set
	 */
	public void setCountryAbrv(String countryAbrv) {
		this.countryAbrv = countryAbrv;
	}

	/**
	 * @return the totalPoints
	 */
	public double getTotalPoints() {
		return totalPoints;
	}

	/**
	 * @param totalPoints the totalPoints to set
	 */
	public void setTotalPoints(double totalPoints) {
		this.totalPoints = totalPoints;
	}

	/**
	 * @return the previousPoints
	 */
	public int getPreviousPoints() {
		return previousPoints;
	}

	/**
	 * @param previousPoints the previousPoints to set
	 */
	public void setPreviousPoints(int previousPoints) {
		this.previousPoints = previousPoints;
	}

	/**
	 * @return the rankChange
	 */
	public int getRankChange() {
		return rankChange;
	}

	/**
	 * @param rankChange the rankChange to set
	 */
	public void setRankChange(int rankChange) {
		this.rankChange = rankChange;
	}

	/**
	 * @return the curYearAvg
	 */
	public double getCurYearAvg() {
		return curYearAvg;
	}

	/**
	 * @param curYearAvg the curYearAvg to set
	 */
	public void setCurYearAvg(double curYearAvg) {
		this.curYearAvg = curYearAvg;
	}

	/**
	 * @return the curYearAvgWeighted
	 */
	public double getCurYearAvgWeighted() {
		return curYearAvgWeighted;
	}

	/**
	 * @param curYearAvgWeighted the curYearAvgWeighted to set
	 */
	public void setCurYearAvgWeighted(double curYearAvgWeighted) {
		this.curYearAvgWeighted = curYearAvgWeighted;
	}

	/**
	 * @return the lastYearAvg
	 */
	public double getLastYearAvg() {
		return lastYearAvg;
	}

	/**
	 * @param lastYearAvg the lastYearAvg to set
	 */
	public void setLastYearAvg(double lastYearAvg) {
		this.lastYearAvg = lastYearAvg;
	}

	/**
	 * @return the lastYearAvgWeighted
	 */
	public double getLastYearAvgWeighted() {
		return lastYearAvgWeighted;
	}

	/**
	 * @param lastYearAvgWeighted the lastYearAvgWeighted to set
	 */
	public void setLastYearAvgWeighted(double lastYearAvgWeighted) {
		this.lastYearAvgWeighted = lastYearAvgWeighted;
	}

	/**
	 * @return the twoYearAgoAvg
	 */
	public double getTwoYearAgoAvg() {
		return twoYearAgoAvg;
	}

	/**
	 * @param twoYearAgoAvg the twoYearAgoAvg to set
	 */
	public void setTwoYearAgoAvg(double twoYearAgoAvg) {
		this.twoYearAgoAvg = twoYearAgoAvg;
	}

	/**
	 * @return the twoYearAgoWeighted
	 */
	public double getTwoYearAgoWeighted() {
		return twoYearAgoWeighted;
	}

	/**
	 * @param twoYearAgoWeighted the twoYearAgoWeighted to set
	 */
	public void setTwoYearAgoWeighted(double twoYearAgoWeighted) {
		this.twoYearAgoWeighted = twoYearAgoWeighted;
	}

	/**
	 * @return the threeYearAgoAvg
	 */
	public double getThreeYearAgoAvg() {
		return threeYearAgoAvg;
	}

	/**
	 * @param threeYearAgoAvg the threeYearAgoAvg to set
	 */
	public void setThreeYearAgoAvg(double threeYearAgoAvg) {
		this.threeYearAgoAvg = threeYearAgoAvg;
	}

	/**
	 * @return the threeYearAgoWeighted
	 */
	public double getThreeYearAgoWeighted() {
		return threeYearAgoWeighted;
	}

	/**
	 * @param threeYearAgoWeighted the threeYearAgoWeighted to set
	 */
	public void setThreeYearAgoWeighted(double threeYearAgoWeighted) {
		this.threeYearAgoWeighted = threeYearAgoWeighted;
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
		return "FifaRankingVO [rnk=" + rnk + ", rnkDate=" + rnkDate + ", countryFull=" + countryFull + ", countryAbrv="
				+ countryAbrv + ", totalPoints=" + totalPoints + ", previousPoints=" + previousPoints + ", rankChange="
				+ rankChange + ", curYearAvg=" + curYearAvg + ", curYearAvgWeighted=" + curYearAvgWeighted
				+ ", lastYearAvg=" + lastYearAvg + ", lastYearAvgWeighted=" + lastYearAvgWeighted + ", twoYearAgoAvg="
				+ twoYearAgoAvg + ", twoYearAgoWeighted=" + twoYearAgoWeighted + ", threeYearAgoAvg=" + threeYearAgoAvg
				+ ", threeYearAgoWeighted=" + threeYearAgoWeighted + ", confederation=" + confederation + "]";
	}

	

}
