package com.esc20.model;
// Generated Jan 4, 2019 3:55:15 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CrDemoId generated by hbm2java
 */
@Embeddable
public class CrDemoId implements java.io.Serializable {

	private String schYr;
	private String campusId;

	public CrDemoId() {
	}

	public CrDemoId(String schYr, String campusId) {
		this.schYr = schYr;
		this.campusId = campusId;
	}

	@Column(name = "SCH_YR", nullable = false, length = 4)
	public String getSchYr() {
		return this.schYr;
	}

	public void setSchYr(String schYr) {
		this.schYr = schYr;
	}

	@Column(name = "CAMPUS_ID", nullable = false, length = 3)
	public String getCampusId() {
		return this.campusId;
	}

	public void setCampusId(String campusId) {
		this.campusId = campusId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CrDemoId))
			return false;
		CrDemoId castOther = (CrDemoId) other;

		return ((this.getSchYr() == castOther.getSchYr()) || (this.getSchYr() != null && castOther.getSchYr() != null
				&& this.getSchYr().equals(castOther.getSchYr())))
				&& ((this.getCampusId() == castOther.getCampusId()) || (this.getCampusId() != null
						&& castOther.getCampusId() != null && this.getCampusId().equals(castOther.getCampusId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSchYr() == null ? 0 : this.getSchYr().hashCode());
		result = 37 * result + (getCampusId() == null ? 0 : this.getCampusId().hashCode());
		return result;
	}

}
