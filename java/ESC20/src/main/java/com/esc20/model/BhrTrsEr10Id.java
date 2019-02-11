package com.esc20.model;
// Generated Jan 4, 2019 3:47:57 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrTrsEr10Id generated by hbm2java
 */
@Embeddable
public class BhrTrsEr10Id implements java.io.Serializable {

	private String staffId;
	private String rptYr;
	private String rptMon;
	private char employTypCd;

	public BhrTrsEr10Id() {
	}

	public BhrTrsEr10Id(String staffId, String rptYr, String rptMon, char employTypCd) {
		this.staffId = staffId;
		this.rptYr = rptYr;
		this.rptMon = rptMon;
		this.employTypCd = employTypCd;
	}

	@Column(name = "STAFF_ID", nullable = false, length = 9)
	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	@Column(name = "RPT_YR", nullable = false, length = 4)
	public String getRptYr() {
		return this.rptYr;
	}

	public void setRptYr(String rptYr) {
		this.rptYr = rptYr;
	}

	@Column(name = "RPT_MON", nullable = false, length = 2)
	public String getRptMon() {
		return this.rptMon;
	}

	public void setRptMon(String rptMon) {
		this.rptMon = rptMon;
	}

	@Column(name = "EMPLOY_TYP_CD", nullable = false, length = 1)
	public char getEmployTypCd() {
		return this.employTypCd;
	}

	public void setEmployTypCd(char employTypCd) {
		this.employTypCd = employTypCd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrTrsEr10Id))
			return false;
		BhrTrsEr10Id castOther = (BhrTrsEr10Id) other;

		return ((this.getStaffId() == castOther.getStaffId()) || (this.getStaffId() != null
				&& castOther.getStaffId() != null && this.getStaffId().equals(castOther.getStaffId())))
				&& ((this.getRptYr() == castOther.getRptYr()) || (this.getRptYr() != null
						&& castOther.getRptYr() != null && this.getRptYr().equals(castOther.getRptYr())))
				&& ((this.getRptMon() == castOther.getRptMon()) || (this.getRptMon() != null
						&& castOther.getRptMon() != null && this.getRptMon().equals(castOther.getRptMon())))
				&& (this.getEmployTypCd() == castOther.getEmployTypCd());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getStaffId() == null ? 0 : this.getStaffId().hashCode());
		result = 37 * result + (getRptYr() == null ? 0 : this.getRptYr().hashCode());
		result = 37 * result + (getRptMon() == null ? 0 : this.getRptMon().hashCode());
		result = 37 * result + this.getEmployTypCd();
		return result;
	}

}
