package com.esc20.model;
// Generated Jan 4, 2019 3:47:38 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrTeamEd20Id generated by hbm2java
 */
@Embeddable
public class BhrTeamEd20Id implements java.io.Serializable {

	private String rptYr;
	private String rptMon;
	private String empNbr;

	public BhrTeamEd20Id() {
	}

	public BhrTeamEd20Id(String rptYr, String rptMon, String empNbr) {
		this.rptYr = rptYr;
		this.rptMon = rptMon;
		this.empNbr = empNbr;
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

	@Column(name = "EMP_NBR", nullable = false, length = 6)
	public String getEmpNbr() {
		return this.empNbr;
	}

	public void setEmpNbr(String empNbr) {
		this.empNbr = empNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrTeamEd20Id))
			return false;
		BhrTeamEd20Id castOther = (BhrTeamEd20Id) other;

		return ((this.getRptYr() == castOther.getRptYr()) || (this.getRptYr() != null && castOther.getRptYr() != null
				&& this.getRptYr().equals(castOther.getRptYr())))
				&& ((this.getRptMon() == castOther.getRptMon()) || (this.getRptMon() != null
						&& castOther.getRptMon() != null && this.getRptMon().equals(castOther.getRptMon())))
				&& ((this.getEmpNbr() == castOther.getEmpNbr()) || (this.getEmpNbr() != null
						&& castOther.getEmpNbr() != null && this.getEmpNbr().equals(castOther.getEmpNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRptYr() == null ? 0 : this.getRptYr().hashCode());
		result = 37 * result + (getRptMon() == null ? 0 : this.getRptMon().hashCode());
		result = 37 * result + (getEmpNbr() == null ? 0 : this.getEmpNbr().hashCode());
		return result;
	}

}