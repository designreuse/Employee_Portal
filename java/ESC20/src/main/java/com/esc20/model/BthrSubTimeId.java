package com.esc20.model;
// Generated Jan 4, 2019 3:54:58 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BthrSubTimeId generated by hbm2java
 */
@Embeddable
public class BthrSubTimeId implements java.io.Serializable {

	private char tmOfDay;
	private String subTyp;
	private char cyrNyrFlg;

	public BthrSubTimeId() {
	}

	public BthrSubTimeId(char tmOfDay, String subTyp, char cyrNyrFlg) {
		this.tmOfDay = tmOfDay;
		this.subTyp = subTyp;
		this.cyrNyrFlg = cyrNyrFlg;
	}

	@Column(name = "TM_OF_DAY", nullable = false, length = 1)
	public char getTmOfDay() {
		return this.tmOfDay;
	}

	public void setTmOfDay(char tmOfDay) {
		this.tmOfDay = tmOfDay;
	}

	@Column(name = "SUB_TYP", nullable = false, length = 2)
	public String getSubTyp() {
		return this.subTyp;
	}

	public void setSubTyp(String subTyp) {
		this.subTyp = subTyp;
	}

	@Column(name = "CYR_NYR_FLG", nullable = false, length = 1)
	public char getCyrNyrFlg() {
		return this.cyrNyrFlg;
	}

	public void setCyrNyrFlg(char cyrNyrFlg) {
		this.cyrNyrFlg = cyrNyrFlg;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BthrSubTimeId))
			return false;
		BthrSubTimeId castOther = (BthrSubTimeId) other;

		return (this.getTmOfDay() == castOther.getTmOfDay())
				&& ((this.getSubTyp() == castOther.getSubTyp()) || (this.getSubTyp() != null
						&& castOther.getSubTyp() != null && this.getSubTyp().equals(castOther.getSubTyp())))
				&& (this.getCyrNyrFlg() == castOther.getCyrNyrFlg());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTmOfDay();
		result = 37 * result + (getSubTyp() == null ? 0 : this.getSubTyp().hashCode());
		result = 37 * result + this.getCyrNyrFlg();
		return result;
	}

}
