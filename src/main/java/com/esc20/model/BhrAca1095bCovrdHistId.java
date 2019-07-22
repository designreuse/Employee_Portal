package com.esc20.model;
// Generated Jan 4, 2019 3:32:17 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrAca1095bCovrdHistId generated by hbm2java
 */
@Embeddable
public class BhrAca1095bCovrdHistId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6173217758331958116L;
	private String empNbr;
	private String calYr;
	private byte seqNbr;

	public BhrAca1095bCovrdHistId() {
	}

	public BhrAca1095bCovrdHistId(String empNbr, String calYr, byte seqNbr) {
		this.empNbr = empNbr;
		this.calYr = calYr;
		this.seqNbr = seqNbr;
	}

	@Column(name = "EMP_NBR", nullable = false, length = 6)
	public String getEmpNbr() {
		return this.empNbr;
	}

	public void setEmpNbr(String empNbr) {
		this.empNbr = empNbr;
	}

	@Column(name = "CAL_YR", nullable = false, length = 4)
	public String getCalYr() {
		return this.calYr;
	}

	public void setCalYr(String calYr) {
		this.calYr = calYr;
	}

	@Column(name = "SEQ_NBR", nullable = false, precision = 2, scale = 0)
	public byte getSeqNbr() {
		return this.seqNbr;
	}

	public void setSeqNbr(byte seqNbr) {
		this.seqNbr = seqNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrAca1095bCovrdHistId))
			return false;
		BhrAca1095bCovrdHistId castOther = (BhrAca1095bCovrdHistId) other;

		return ((this.getEmpNbr() == castOther.getEmpNbr()) || (this.getEmpNbr() != null
				&& castOther.getEmpNbr() != null && this.getEmpNbr().equals(castOther.getEmpNbr())))
				&& ((this.getCalYr() == castOther.getCalYr()) || (this.getCalYr() != null
						&& castOther.getCalYr() != null && this.getCalYr().equals(castOther.getCalYr())))
				&& (this.getSeqNbr() == castOther.getSeqNbr());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEmpNbr() == null ? 0 : this.getEmpNbr().hashCode());
		result = 37 * result + (getCalYr() == null ? 0 : this.getCalYr().hashCode());
		result = 37 * result + this.getSeqNbr();
		return result;
	}

}