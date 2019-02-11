package com.esc20.model;
// Generated Jan 4, 2019 3:54:39 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BthrStSlryBkupPaycalcs5Id generated by hbm2java
 */
@Embeddable
public class BthrStSlryBkupPaycalcs5Id implements java.io.Serializable {

	private char cyrNyrFlg;
	private char stSalaryTyp;
	private String stSalaryDescr;
	private String stStp;
	private BigDecimal dailyRate;
	private String module;

	public BthrStSlryBkupPaycalcs5Id() {
	}

	public BthrStSlryBkupPaycalcs5Id(char cyrNyrFlg, char stSalaryTyp, String stSalaryDescr, String stStp,
			BigDecimal dailyRate, String module) {
		this.cyrNyrFlg = cyrNyrFlg;
		this.stSalaryTyp = stSalaryTyp;
		this.stSalaryDescr = stSalaryDescr;
		this.stStp = stStp;
		this.dailyRate = dailyRate;
		this.module = module;
	}

	@Column(name = "CYR_NYR_FLG", nullable = false, length = 1)
	public char getCyrNyrFlg() {
		return this.cyrNyrFlg;
	}

	public void setCyrNyrFlg(char cyrNyrFlg) {
		this.cyrNyrFlg = cyrNyrFlg;
	}

	@Column(name = "ST_SALARY_TYP", nullable = false, length = 1)
	public char getStSalaryTyp() {
		return this.stSalaryTyp;
	}

	public void setStSalaryTyp(char stSalaryTyp) {
		this.stSalaryTyp = stSalaryTyp;
	}

	@Column(name = "ST_SALARY_DESCR", nullable = false, length = 20)
	public String getStSalaryDescr() {
		return this.stSalaryDescr;
	}

	public void setStSalaryDescr(String stSalaryDescr) {
		this.stSalaryDescr = stSalaryDescr;
	}

	@Column(name = "ST_STP", nullable = false, length = 2)
	public String getStStp() {
		return this.stStp;
	}

	public void setStStp(String stStp) {
		this.stStp = stStp;
	}

	@Column(name = "DAILY_RATE", nullable = false, precision = 6, scale = 3)
	public BigDecimal getDailyRate() {
		return this.dailyRate;
	}

	public void setDailyRate(BigDecimal dailyRate) {
		this.dailyRate = dailyRate;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BthrStSlryBkupPaycalcs5Id))
			return false;
		BthrStSlryBkupPaycalcs5Id castOther = (BthrStSlryBkupPaycalcs5Id) other;

		return (this.getCyrNyrFlg() == castOther.getCyrNyrFlg())
				&& (this.getStSalaryTyp() == castOther.getStSalaryTyp())
				&& ((this.getStSalaryDescr() == castOther.getStSalaryDescr())
						|| (this.getStSalaryDescr() != null && castOther.getStSalaryDescr() != null
								&& this.getStSalaryDescr().equals(castOther.getStSalaryDescr())))
				&& ((this.getStStp() == castOther.getStStp()) || (this.getStStp() != null
						&& castOther.getStStp() != null && this.getStStp().equals(castOther.getStStp())))
				&& ((this.getDailyRate() == castOther.getDailyRate()) || (this.getDailyRate() != null
						&& castOther.getDailyRate() != null && this.getDailyRate().equals(castOther.getDailyRate())))
				&& ((this.getModule() == castOther.getModule()) || (this.getModule() != null
						&& castOther.getModule() != null && this.getModule().equals(castOther.getModule())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + this.getStSalaryTyp();
		result = 37 * result + (getStSalaryDescr() == null ? 0 : this.getStSalaryDescr().hashCode());
		result = 37 * result + (getStStp() == null ? 0 : this.getStStp().hashCode());
		result = 37 * result + (getDailyRate() == null ? 0 : this.getDailyRate().hashCode());
		result = 37 * result + (getModule() == null ? 0 : this.getModule().hashCode());
		return result;
	}

}
