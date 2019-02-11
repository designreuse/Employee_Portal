package com.esc20.model;
// Generated Jan 4, 2019 3:31:47 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrAca1094cAleMbrMonId generated by hbm2java
 */
@Embeddable
public class BhrAca1094cAleMbrMonId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2115351473153101124L;
	private String calYr;
	private String mon;

	public BhrAca1094cAleMbrMonId() {
	}

	public BhrAca1094cAleMbrMonId(String calYr, String mon) {
		this.calYr = calYr;
		this.mon = mon;
	}

	@Column(name = "CAL_YR", nullable = false, length = 4)
	public String getCalYr() {
		return this.calYr;
	}

	public void setCalYr(String calYr) {
		this.calYr = calYr;
	}

	@Column(name = "MON", nullable = false, length = 3)
	public String getMon() {
		return this.mon;
	}

	public void setMon(String mon) {
		this.mon = mon;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrAca1094cAleMbrMonId))
			return false;
		BhrAca1094cAleMbrMonId castOther = (BhrAca1094cAleMbrMonId) other;

		return ((this.getCalYr() == castOther.getCalYr()) || (this.getCalYr() != null && castOther.getCalYr() != null
				&& this.getCalYr().equals(castOther.getCalYr())))
				&& ((this.getMon() == castOther.getMon()) || (this.getMon() != null && castOther.getMon() != null
						&& this.getMon().equals(castOther.getMon())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCalYr() == null ? 0 : this.getCalYr().hashCode());
		result = 37 * result + (getMon() == null ? 0 : this.getMon().hashCode());
		return result;
	}

}
