package com.esc20.model;
// Generated Jan 4, 2019 3:47:57 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrThirdPartySickPayId generated by hbm2java
 */
@Embeddable
public class BhrThirdPartySickPayId implements java.io.Serializable {

	private char payFreq;
	private String empNbr;
	private char cyrNyrFlg;
	private String calYr;

	public BhrThirdPartySickPayId() {
	}

	public BhrThirdPartySickPayId(char payFreq, String empNbr, char cyrNyrFlg, String calYr) {
		this.payFreq = payFreq;
		this.empNbr = empNbr;
		this.cyrNyrFlg = cyrNyrFlg;
		this.calYr = calYr;
	}

	@Column(name = "PAY_FREQ", nullable = false, length = 1)
	public char getPayFreq() {
		return this.payFreq;
	}

	public void setPayFreq(char payFreq) {
		this.payFreq = payFreq;
	}

	@Column(name = "EMP_NBR", nullable = false, length = 6)
	public String getEmpNbr() {
		return this.empNbr;
	}

	public void setEmpNbr(String empNbr) {
		this.empNbr = empNbr;
	}

	@Column(name = "CYR_NYR_FLG", nullable = false, length = 1)
	public char getCyrNyrFlg() {
		return this.cyrNyrFlg;
	}

	public void setCyrNyrFlg(char cyrNyrFlg) {
		this.cyrNyrFlg = cyrNyrFlg;
	}

	@Column(name = "CAL_YR", nullable = false, length = 4)
	public String getCalYr() {
		return this.calYr;
	}

	public void setCalYr(String calYr) {
		this.calYr = calYr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrThirdPartySickPayId))
			return false;
		BhrThirdPartySickPayId castOther = (BhrThirdPartySickPayId) other;

		return (this.getPayFreq() == castOther.getPayFreq())
				&& ((this.getEmpNbr() == castOther.getEmpNbr()) || (this.getEmpNbr() != null
						&& castOther.getEmpNbr() != null && this.getEmpNbr().equals(castOther.getEmpNbr())))
				&& (this.getCyrNyrFlg() == castOther.getCyrNyrFlg())
				&& ((this.getCalYr() == castOther.getCalYr()) || (this.getCalYr() != null
						&& castOther.getCalYr() != null && this.getCalYr().equals(castOther.getCalYr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPayFreq();
		result = 37 * result + (getEmpNbr() == null ? 0 : this.getEmpNbr().hashCode());
		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + (getCalYr() == null ? 0 : this.getCalYr().hashCode());
		return result;
	}

}
