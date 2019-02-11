package com.esc20.model;
// Generated Jan 4, 2019 3:51:33 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BthrHrlyDlySalaryBkupPaycalcs5Id generated by hbm2java
 */
@Embeddable
public class BthrHrlyDlySalaryBkupPaycalcs5Id implements java.io.Serializable {

	private char cyrNyrFlg;
	private String payGrd;
	private String payStep;
	private char sched;
	private BigDecimal payAmt;
	private BigDecimal hrsPerDay;
	private BigDecimal estOvtmHrs;
	private char payTyp;
	private String module;

	public BthrHrlyDlySalaryBkupPaycalcs5Id() {
	}

	public BthrHrlyDlySalaryBkupPaycalcs5Id(char cyrNyrFlg, String payGrd, String payStep, char sched,
			BigDecimal payAmt, BigDecimal hrsPerDay, BigDecimal estOvtmHrs, char payTyp, String module) {
		this.cyrNyrFlg = cyrNyrFlg;
		this.payGrd = payGrd;
		this.payStep = payStep;
		this.sched = sched;
		this.payAmt = payAmt;
		this.hrsPerDay = hrsPerDay;
		this.estOvtmHrs = estOvtmHrs;
		this.payTyp = payTyp;
		this.module = module;
	}

	@Column(name = "CYR_NYR_FLG", nullable = false, length = 1)
	public char getCyrNyrFlg() {
		return this.cyrNyrFlg;
	}

	public void setCyrNyrFlg(char cyrNyrFlg) {
		this.cyrNyrFlg = cyrNyrFlg;
	}

	@Column(name = "PAY_GRD", nullable = false, length = 3)
	public String getPayGrd() {
		return this.payGrd;
	}

	public void setPayGrd(String payGrd) {
		this.payGrd = payGrd;
	}

	@Column(name = "PAY_STEP", nullable = false, length = 2)
	public String getPayStep() {
		return this.payStep;
	}

	public void setPayStep(String payStep) {
		this.payStep = payStep;
	}

	@Column(name = "SCHED", nullable = false, length = 1)
	public char getSched() {
		return this.sched;
	}

	public void setSched(char sched) {
		this.sched = sched;
	}

	@Column(name = "PAY_AMT", nullable = false, precision = 6, scale = 3)
	public BigDecimal getPayAmt() {
		return this.payAmt;
	}

	public void setPayAmt(BigDecimal payAmt) {
		this.payAmt = payAmt;
	}

	@Column(name = "HRS_PER_DAY", nullable = false, precision = 5)
	public BigDecimal getHrsPerDay() {
		return this.hrsPerDay;
	}

	public void setHrsPerDay(BigDecimal hrsPerDay) {
		this.hrsPerDay = hrsPerDay;
	}

	@Column(name = "EST_OVTM_HRS", nullable = false, precision = 5, scale = 1)
	public BigDecimal getEstOvtmHrs() {
		return this.estOvtmHrs;
	}

	public void setEstOvtmHrs(BigDecimal estOvtmHrs) {
		this.estOvtmHrs = estOvtmHrs;
	}

	@Column(name = "PAY_TYP", nullable = false, length = 1)
	public char getPayTyp() {
		return this.payTyp;
	}

	public void setPayTyp(char payTyp) {
		this.payTyp = payTyp;
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
		if (!(other instanceof BthrHrlyDlySalaryBkupPaycalcs5Id))
			return false;
		BthrHrlyDlySalaryBkupPaycalcs5Id castOther = (BthrHrlyDlySalaryBkupPaycalcs5Id) other;

		return (this.getCyrNyrFlg() == castOther.getCyrNyrFlg())
				&& ((this.getPayGrd() == castOther.getPayGrd()) || (this.getPayGrd() != null
						&& castOther.getPayGrd() != null && this.getPayGrd().equals(castOther.getPayGrd())))
				&& ((this.getPayStep() == castOther.getPayStep()) || (this.getPayStep() != null
						&& castOther.getPayStep() != null && this.getPayStep().equals(castOther.getPayStep())))
				&& (this.getSched() == castOther.getSched())
				&& ((this.getPayAmt() == castOther.getPayAmt()) || (this.getPayAmt() != null
						&& castOther.getPayAmt() != null && this.getPayAmt().equals(castOther.getPayAmt())))
				&& ((this.getHrsPerDay() == castOther.getHrsPerDay()) || (this.getHrsPerDay() != null
						&& castOther.getHrsPerDay() != null && this.getHrsPerDay().equals(castOther.getHrsPerDay())))
				&& ((this.getEstOvtmHrs() == castOther.getEstOvtmHrs()) || (this.getEstOvtmHrs() != null
						&& castOther.getEstOvtmHrs() != null && this.getEstOvtmHrs().equals(castOther.getEstOvtmHrs())))
				&& (this.getPayTyp() == castOther.getPayTyp())
				&& ((this.getModule() == castOther.getModule()) || (this.getModule() != null
						&& castOther.getModule() != null && this.getModule().equals(castOther.getModule())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + (getPayGrd() == null ? 0 : this.getPayGrd().hashCode());
		result = 37 * result + (getPayStep() == null ? 0 : this.getPayStep().hashCode());
		result = 37 * result + this.getSched();
		result = 37 * result + (getPayAmt() == null ? 0 : this.getPayAmt().hashCode());
		result = 37 * result + (getHrsPerDay() == null ? 0 : this.getHrsPerDay().hashCode());
		result = 37 * result + (getEstOvtmHrs() == null ? 0 : this.getEstOvtmHrs().hashCode());
		result = 37 * result + this.getPayTyp();
		result = 37 * result + (getModule() == null ? 0 : this.getModule().hashCode());
		return result;
	}

}
