package com.esc20.model;
// Generated Jan 4, 2019 3:51:33 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BthrFedIncomeTaxId generated by hbm2java
 */
@Embeddable
public class BthrFedIncomeTaxId implements java.io.Serializable {

	private char marriedSingleFlg;
	private short seqNbr;
	private String taxYr;
	private char payFreq;

	public BthrFedIncomeTaxId() {
	}

	public BthrFedIncomeTaxId(char marriedSingleFlg, short seqNbr, String taxYr, char payFreq) {
		this.marriedSingleFlg = marriedSingleFlg;
		this.seqNbr = seqNbr;
		this.taxYr = taxYr;
		this.payFreq = payFreq;
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

	@Column(name = "TAX_YR", nullable = false, length = 4)
	public String getTaxYr() {
		return this.taxYr;
	}

	public void setTaxYr(String taxYr) {
		this.taxYr = taxYr;
	}

	@Column(name = "PAY_FREQ", nullable = false, length = 1)
	public char getPayFreq() {
		return this.payFreq;
	}

	public void setPayFreq(char payFreq) {
		this.payFreq = payFreq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BthrFedIncomeTaxId))
			return false;
		BthrFedIncomeTaxId castOther = (BthrFedIncomeTaxId) other;

		return (this.getMarriedSingleFlg() == castOther.getMarriedSingleFlg())
				&& (this.getSeqNbr() == castOther.getSeqNbr())
				&& ((this.getTaxYr() == castOther.getTaxYr()) || (this.getTaxYr() != null
						&& castOther.getTaxYr() != null && this.getTaxYr().equals(castOther.getTaxYr())))
				&& (this.getPayFreq() == castOther.getPayFreq());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getMarriedSingleFlg();
		result = 37 * result + this.getSeqNbr();
		result = 37 * result + (getTaxYr() == null ? 0 : this.getTaxYr().hashCode());
		result = 37 * result + this.getPayFreq();
		return result;
	}

}
