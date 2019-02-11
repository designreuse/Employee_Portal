package com.esc20.model;
// Generated Jan 4, 2019 3:51:33 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BthrFedIncomeTaxBkupPaycalcs5Id generated by hbm2java
 */
@Embeddable
public class BthrFedIncomeTaxBkupPaycalcs5Id implements java.io.Serializable {

	private String taxYr;
	private char marriedSingleFlg;
	private short seqNbr;
	private char payFreq;
	private int overAmt;
	private int notOver;
	private BigDecimal taxAmt;
	private BigDecimal pct;
	private int inExcess;
	private String module;

	public BthrFedIncomeTaxBkupPaycalcs5Id() {
	}

	public BthrFedIncomeTaxBkupPaycalcs5Id(String taxYr, char marriedSingleFlg, short seqNbr, char payFreq, int overAmt,
			int notOver, BigDecimal taxAmt, BigDecimal pct, int inExcess, String module) {
		this.taxYr = taxYr;
		this.marriedSingleFlg = marriedSingleFlg;
		this.seqNbr = seqNbr;
		this.payFreq = payFreq;
		this.overAmt = overAmt;
		this.notOver = notOver;
		this.taxAmt = taxAmt;
		this.pct = pct;
		this.inExcess = inExcess;
		this.module = module;
	}

	@Column(name = "TAX_YR", nullable = false, length = 4)
	public String getTaxYr() {
		return this.taxYr;
	}

	public void setTaxYr(String taxYr) {
		this.taxYr = taxYr;
	}

	@Column(name = "MARRIED_SINGLE_FLG", nullable = false, length = 1)
	public char getMarriedSingleFlg() {
		return this.marriedSingleFlg;
	}

	public void setMarriedSingleFlg(char marriedSingleFlg) {
		this.marriedSingleFlg = marriedSingleFlg;
	}

	@Column(name = "SEQ_NBR", nullable = false, precision = 3, scale = 0)
	public short getSeqNbr() {
		return this.seqNbr;
	}

	public void setSeqNbr(short seqNbr) {
		this.seqNbr = seqNbr;
	}

	@Column(name = "PAY_FREQ", nullable = false, length = 1)
	public char getPayFreq() {
		return this.payFreq;
	}

	public void setPayFreq(char payFreq) {
		this.payFreq = payFreq;
	}

	@Column(name = "OVER_AMT", nullable = false, precision = 7, scale = 0)
	public int getOverAmt() {
		return this.overAmt;
	}

	public void setOverAmt(int overAmt) {
		this.overAmt = overAmt;
	}

	@Column(name = "NOT_OVER", nullable = false, precision = 7, scale = 0)
	public int getNotOver() {
		return this.notOver;
	}

	public void setNotOver(int notOver) {
		this.notOver = notOver;
	}

	@Column(name = "TAX_AMT", nullable = false, precision = 9)
	public BigDecimal getTaxAmt() {
		return this.taxAmt;
	}

	public void setTaxAmt(BigDecimal taxAmt) {
		this.taxAmt = taxAmt;
	}

	@Column(name = "PCT", nullable = false, precision = 4, scale = 3)
	public BigDecimal getPct() {
		return this.pct;
	}

	public void setPct(BigDecimal pct) {
		this.pct = pct;
	}

	@Column(name = "IN_EXCESS", nullable = false, precision = 7, scale = 0)
	public int getInExcess() {
		return this.inExcess;
	}

	public void setInExcess(int inExcess) {
		this.inExcess = inExcess;
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
		if (!(other instanceof BthrFedIncomeTaxBkupPaycalcs5Id))
			return false;
		BthrFedIncomeTaxBkupPaycalcs5Id castOther = (BthrFedIncomeTaxBkupPaycalcs5Id) other;

		return ((this.getTaxYr() == castOther.getTaxYr()) || (this.getTaxYr() != null && castOther.getTaxYr() != null
				&& this.getTaxYr().equals(castOther.getTaxYr())))
				&& (this.getMarriedSingleFlg() == castOther.getMarriedSingleFlg())
				&& (this.getSeqNbr() == castOther.getSeqNbr()) && (this.getPayFreq() == castOther.getPayFreq())
				&& (this.getOverAmt() == castOther.getOverAmt()) && (this.getNotOver() == castOther.getNotOver())
				&& ((this.getTaxAmt() == castOther.getTaxAmt()) || (this.getTaxAmt() != null
						&& castOther.getTaxAmt() != null && this.getTaxAmt().equals(castOther.getTaxAmt())))
				&& ((this.getPct() == castOther.getPct()) || (this.getPct() != null && castOther.getPct() != null
						&& this.getPct().equals(castOther.getPct())))
				&& (this.getInExcess() == castOther.getInExcess())
				&& ((this.getModule() == castOther.getModule()) || (this.getModule() != null
						&& castOther.getModule() != null && this.getModule().equals(castOther.getModule())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTaxYr() == null ? 0 : this.getTaxYr().hashCode());
		result = 37 * result + this.getMarriedSingleFlg();
		result = 37 * result + this.getSeqNbr();
		result = 37 * result + this.getPayFreq();
		result = 37 * result + this.getOverAmt();
		result = 37 * result + this.getNotOver();
		result = 37 * result + (getTaxAmt() == null ? 0 : this.getTaxAmt().hashCode());
		result = 37 * result + (getPct() == null ? 0 : this.getPct().hashCode());
		result = 37 * result + this.getInExcess();
		result = 37 * result + (getModule() == null ? 0 : this.getModule().hashCode());
		return result;
	}

}
