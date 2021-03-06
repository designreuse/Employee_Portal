package com.esc20.model;
// Generated Jan 4, 2019 3:43:59 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrPayrunOptionsId generated by hbm2java
 */
@Embeddable
public class BhrPayrunOptionsId implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private char payFreq;
	private String dtOfPay;
	private String schYr;
	private short adjNbr;

	public BhrPayrunOptionsId() {
	}

	public BhrPayrunOptionsId(char payFreq, String dtOfPay, String schYr, short adjNbr) {
		this.payFreq = payFreq;
		this.dtOfPay = dtOfPay;
		this.schYr = schYr;
		this.adjNbr = adjNbr;
	}

	@Column(name = "PAY_FREQ", nullable = false, length = 1)
	public char getPayFreq() {
		return this.payFreq;
	}

	public void setPayFreq(char payFreq) {
		this.payFreq = payFreq;
	}

	@Column(name = "DT_OF_PAY", nullable = false, length = 8)
	public String getDtOfPay() {
		return this.dtOfPay;
	}

	public void setDtOfPay(String dtOfPay) {
		this.dtOfPay = dtOfPay;
	}

	@Column(name = "SCH_YR", nullable = false, length = 4)
	public String getSchYr() {
		return this.schYr;
	}

	public void setSchYr(String schYr) {
		this.schYr = schYr;
	}

	@Column(name = "ADJ_NBR", nullable = false, precision = 3, scale = 0)
	public short getAdjNbr() {
		return this.adjNbr;
	}

	public void setAdjNbr(short adjNbr) {
		this.adjNbr = adjNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrPayrunOptionsId))
			return false;
		BhrPayrunOptionsId castOther = (BhrPayrunOptionsId) other;

		return (this.getPayFreq() == castOther.getPayFreq())
				&& ((this.getDtOfPay() == castOther.getDtOfPay()) || (this.getDtOfPay() != null
						&& castOther.getDtOfPay() != null && this.getDtOfPay().equals(castOther.getDtOfPay())))
				&& ((this.getSchYr() == castOther.getSchYr()) || (this.getSchYr() != null
						&& castOther.getSchYr() != null && this.getSchYr().equals(castOther.getSchYr())))
				&& (this.getAdjNbr() == castOther.getAdjNbr());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPayFreq();
		result = 37 * result + (getDtOfPay() == null ? 0 : this.getDtOfPay().hashCode());
		result = 37 * result + (getSchYr() == null ? 0 : this.getSchYr().hashCode());
		result = 37 * result + this.getAdjNbr();
		return result;
	}

}
