package com.esc20.model;
// Generated Jan 4, 2019 3:47:57 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrTrsMd30Md31Id generated by hbm2java
 */
@Embeddable
public class BhrTrsMd30Md31Id implements java.io.Serializable {

	private String rptMon;
	private String rptYr;
	private String staffId;

	public BhrTrsMd30Md31Id() {
	}

	public BhrTrsMd30Md31Id(String rptMon, String rptYr, String staffId) {
		this.rptMon = rptMon;
		this.rptYr = rptYr;
		this.staffId = staffId;
	}

	@Column(name = "RPT_MON", nullable = false, length = 2)
	public String getRptMon() {
		return this.rptMon;
	}

	public void setRptMon(String rptMon) {
		this.rptMon = rptMon;
	}

	@Column(name = "RPT_YR", nullable = false, length = 4)
	public String getRptYr() {
		return this.rptYr;
	}

	public void setRptYr(String rptYr) {
		this.rptYr = rptYr;
	}

	@Column(name = "STAFF_ID", nullable = false, length = 9)
	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrTrsMd30Md31Id))
			return false;
		BhrTrsMd30Md31Id castOther = (BhrTrsMd30Md31Id) other;

		return ((this.getRptMon() == castOther.getRptMon()) || (this.getRptMon() != null
				&& castOther.getRptMon() != null && this.getRptMon().equals(castOther.getRptMon())))
				&& ((this.getRptYr() == castOther.getRptYr()) || (this.getRptYr() != null
						&& castOther.getRptYr() != null && this.getRptYr().equals(castOther.getRptYr())))
				&& ((this.getStaffId() == castOther.getStaffId()) || (this.getStaffId() != null
						&& castOther.getStaffId() != null && this.getStaffId().equals(castOther.getStaffId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRptMon() == null ? 0 : this.getRptMon().hashCode());
		result = 37 * result + (getRptYr() == null ? 0 : this.getRptYr().hashCode());
		result = 37 * result + (getStaffId() == null ? 0 : this.getStaffId().hashCode());
		return result;
	}

}
