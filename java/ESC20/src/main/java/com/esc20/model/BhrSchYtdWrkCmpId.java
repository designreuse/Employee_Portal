package com.esc20.model;
// Generated Jan 4, 2019 3:45:09 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrSchYtdWrkCmpId generated by hbm2java
 */
@Embeddable
public class BhrSchYtdWrkCmpId implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private char payFreq;
	private String empNbr;
	private char cyrNyrFlg;
	private String schYr;
	private char wrkComp;

	public BhrSchYtdWrkCmpId() {
	}

	public BhrSchYtdWrkCmpId(char payFreq, String empNbr, char cyrNyrFlg, String schYr, char wrkComp) {
		this.payFreq = payFreq;
		this.empNbr = empNbr;
		this.cyrNyrFlg = cyrNyrFlg;
		this.schYr = schYr;
		this.wrkComp = wrkComp;
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

	@Column(name = "SCH_YR", nullable = false, length = 4)
	public String getSchYr() {
		return this.schYr;
	}

	public void setSchYr(String schYr) {
		this.schYr = schYr;
	}

	@Column(name = "WRK_COMP", nullable = false, length = 1)
	public char getWrkComp() {
		return this.wrkComp;
	}

	public void setWrkComp(char wrkComp) {
		this.wrkComp = wrkComp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrSchYtdWrkCmpId))
			return false;
		BhrSchYtdWrkCmpId castOther = (BhrSchYtdWrkCmpId) other;

		return (this.getPayFreq() == castOther.getPayFreq())
				&& ((this.getEmpNbr() == castOther.getEmpNbr()) || (this.getEmpNbr() != null
						&& castOther.getEmpNbr() != null && this.getEmpNbr().equals(castOther.getEmpNbr())))
				&& (this.getCyrNyrFlg() == castOther.getCyrNyrFlg())
				&& ((this.getSchYr() == castOther.getSchYr()) || (this.getSchYr() != null
						&& castOther.getSchYr() != null && this.getSchYr().equals(castOther.getSchYr())))
				&& (this.getWrkComp() == castOther.getWrkComp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPayFreq();
		result = 37 * result + (getEmpNbr() == null ? 0 : this.getEmpNbr().hashCode());
		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + (getSchYr() == null ? 0 : this.getSchYr().hashCode());
		result = 37 * result + this.getWrkComp();
		return result;
	}

}
