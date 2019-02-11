package com.esc20.model;
// Generated Jan 4, 2019 3:52:00 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BthrLvUntsConvId generated by hbm2java
 */
@Embeddable
public class BthrLvUntsConvId implements java.io.Serializable {

	private char payFreq;
	private String lvTyp;
	private byte upToMin;
	private BigDecimal upToHr;

	public BthrLvUntsConvId() {
	}

	public BthrLvUntsConvId(char payFreq, String lvTyp, byte upToMin, BigDecimal upToHr) {
		this.payFreq = payFreq;
		this.lvTyp = lvTyp;
		this.upToMin = upToMin;
		this.upToHr = upToHr;
	}

	@Column(name = "PAY_FREQ", nullable = false, length = 1)
	public char getPayFreq() {
		return this.payFreq;
	}

	public void setPayFreq(char payFreq) {
		this.payFreq = payFreq;
	}

	@Column(name = "LV_TYP", nullable = false, length = 2)
	public String getLvTyp() {
		return this.lvTyp;
	}

	public void setLvTyp(String lvTyp) {
		this.lvTyp = lvTyp;
	}

	@Column(name = "UP_TO_MIN", nullable = false, precision = 2, scale = 0)
	public byte getUpToMin() {
		return this.upToMin;
	}

	public void setUpToMin(byte upToMin) {
		this.upToMin = upToMin;
	}

	@Column(name = "UP_TO_HR", nullable = false, precision = 4)
	public BigDecimal getUpToHr() {
		return this.upToHr;
	}

	public void setUpToHr(BigDecimal upToHr) {
		this.upToHr = upToHr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BthrLvUntsConvId))
			return false;
		BthrLvUntsConvId castOther = (BthrLvUntsConvId) other;

		return (this.getPayFreq() == castOther.getPayFreq())
				&& ((this.getLvTyp() == castOther.getLvTyp()) || (this.getLvTyp() != null
						&& castOther.getLvTyp() != null && this.getLvTyp().equals(castOther.getLvTyp())))
				&& (this.getUpToMin() == castOther.getUpToMin())
				&& ((this.getUpToHr() == castOther.getUpToHr()) || (this.getUpToHr() != null
						&& castOther.getUpToHr() != null && this.getUpToHr().equals(castOther.getUpToHr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPayFreq();
		result = 37 * result + (getLvTyp() == null ? 0 : this.getLvTyp().hashCode());
		result = 37 * result + this.getUpToMin();
		result = 37 * result + (getUpToHr() == null ? 0 : this.getUpToHr().hashCode());
		return result;
	}

}
