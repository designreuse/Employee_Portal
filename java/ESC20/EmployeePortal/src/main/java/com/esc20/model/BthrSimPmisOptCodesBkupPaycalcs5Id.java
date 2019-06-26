package com.esc20.model;
// Generated Jan 4, 2019 3:54:39 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BthrSimPmisOptCodesBkupPaycalcs5Id generated by hbm2java
 */
@Embeddable
public class BthrSimPmisOptCodesBkupPaycalcs5Id implements java.io.Serializable {

	private char cyrNyrFlg;
	private char recTyp;
	private String simName;
	private String recCd;
	private String module;

	public BthrSimPmisOptCodesBkupPaycalcs5Id() {
	}

	public BthrSimPmisOptCodesBkupPaycalcs5Id(char cyrNyrFlg, char recTyp, String simName, String recCd,
			String module) {
		this.cyrNyrFlg = cyrNyrFlg;
		this.recTyp = recTyp;
		this.simName = simName;
		this.recCd = recCd;
		this.module = module;
	}

	@Column(name = "CYR_NYR_FLG", nullable = false, length = 1)
	public char getCyrNyrFlg() {
		return this.cyrNyrFlg;
	}

	public void setCyrNyrFlg(char cyrNyrFlg) {
		this.cyrNyrFlg = cyrNyrFlg;
	}

	@Column(name = "REC_TYP", nullable = false, length = 1)
	public char getRecTyp() {
		return this.recTyp;
	}

	public void setRecTyp(char recTyp) {
		this.recTyp = recTyp;
	}

	@Column(name = "SIM_NAME", nullable = false, length = 7)
	public String getSimName() {
		return this.simName;
	}

	public void setSimName(String simName) {
		this.simName = simName;
	}

	@Column(name = "REC_CD", nullable = false, length = 4)
	public String getRecCd() {
		return this.recCd;
	}

	public void setRecCd(String recCd) {
		this.recCd = recCd;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BthrSimPmisOptCodesBkupPaycalcs5Id))
			return false;
		BthrSimPmisOptCodesBkupPaycalcs5Id castOther = (BthrSimPmisOptCodesBkupPaycalcs5Id) other;

		return (this.getCyrNyrFlg() == castOther.getCyrNyrFlg()) && (this.getRecTyp() == castOther.getRecTyp())
				&& ((this.getSimName() == castOther.getSimName()) || (this.getSimName() != null
						&& castOther.getSimName() != null && this.getSimName().equals(castOther.getSimName())))
				&& ((this.getRecCd() == castOther.getRecCd()) || (this.getRecCd() != null
						&& castOther.getRecCd() != null && this.getRecCd().equals(castOther.getRecCd())))
				&& ((this.getModule() == castOther.getModule()) || (this.getModule() != null
						&& castOther.getModule() != null && this.getModule().equals(castOther.getModule())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + this.getRecTyp();
		result = 37 * result + (getSimName() == null ? 0 : this.getSimName().hashCode());
		result = 37 * result + (getRecCd() == null ? 0 : this.getRecCd().hashCode());
		result = 37 * result + (getModule() == null ? 0 : this.getModule().hashCode());
		return result;
	}

}