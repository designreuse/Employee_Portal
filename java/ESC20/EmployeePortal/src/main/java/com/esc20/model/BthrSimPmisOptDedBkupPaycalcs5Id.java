package com.esc20.model;
// Generated Jan 4, 2019 3:54:39 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BthrSimPmisOptDedBkupPaycalcs5Id generated by hbm2java
 */
@Embeddable
public class BthrSimPmisOptDedBkupPaycalcs5Id implements java.io.Serializable {

	private char cyrNyrFlg;
	private String simName;
	private String dedCd;
	private BigDecimal empAmt;
	private BigDecimal emplrAmt;
	private BigDecimal teaHlthInsAmt;
	private char inclVacPos;
	private String module;

	public BthrSimPmisOptDedBkupPaycalcs5Id() {
	}

	public BthrSimPmisOptDedBkupPaycalcs5Id(char cyrNyrFlg, String simName, String dedCd, BigDecimal empAmt,
			BigDecimal emplrAmt, BigDecimal teaHlthInsAmt, char inclVacPos, String module) {
		this.cyrNyrFlg = cyrNyrFlg;
		this.simName = simName;
		this.dedCd = dedCd;
		this.empAmt = empAmt;
		this.emplrAmt = emplrAmt;
		this.teaHlthInsAmt = teaHlthInsAmt;
		this.inclVacPos = inclVacPos;
		this.module = module;
	}

	@Column(name = "CYR_NYR_FLG", nullable = false, length = 1)
	public char getCyrNyrFlg() {
		return this.cyrNyrFlg;
	}

	public void setCyrNyrFlg(char cyrNyrFlg) {
		this.cyrNyrFlg = cyrNyrFlg;
	}

	@Column(name = "SIM_NAME", nullable = false, length = 7)
	public String getSimName() {
		return this.simName;
	}

	public void setSimName(String simName) {
		this.simName = simName;
	}

	@Column(name = "DED_CD", nullable = false, length = 3)
	public String getDedCd() {
		return this.dedCd;
	}

	public void setDedCd(String dedCd) {
		this.dedCd = dedCd;
	}

	@Column(name = "EMP_AMT", nullable = false, precision = 7)
	public BigDecimal getEmpAmt() {
		return this.empAmt;
	}

	public void setEmpAmt(BigDecimal empAmt) {
		this.empAmt = empAmt;
	}

	@Column(name = "EMPLR_AMT", nullable = false, precision = 7)
	public BigDecimal getEmplrAmt() {
		return this.emplrAmt;
	}

	public void setEmplrAmt(BigDecimal emplrAmt) {
		this.emplrAmt = emplrAmt;
	}

	@Column(name = "TEA_HLTH_INS_AMT", nullable = false, precision = 7)
	public BigDecimal getTeaHlthInsAmt() {
		return this.teaHlthInsAmt;
	}

	public void setTeaHlthInsAmt(BigDecimal teaHlthInsAmt) {
		this.teaHlthInsAmt = teaHlthInsAmt;
	}

	@Column(name = "INCL_VAC_POS", nullable = false, length = 1)
	public char getInclVacPos() {
		return this.inclVacPos;
	}

	public void setInclVacPos(char inclVacPos) {
		this.inclVacPos = inclVacPos;
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
		if (!(other instanceof BthrSimPmisOptDedBkupPaycalcs5Id))
			return false;
		BthrSimPmisOptDedBkupPaycalcs5Id castOther = (BthrSimPmisOptDedBkupPaycalcs5Id) other;

		return (this.getCyrNyrFlg() == castOther.getCyrNyrFlg())
				&& ((this.getSimName() == castOther.getSimName()) || (this.getSimName() != null
						&& castOther.getSimName() != null && this.getSimName().equals(castOther.getSimName())))
				&& ((this.getDedCd() == castOther.getDedCd()) || (this.getDedCd() != null
						&& castOther.getDedCd() != null && this.getDedCd().equals(castOther.getDedCd())))
				&& ((this.getEmpAmt() == castOther.getEmpAmt()) || (this.getEmpAmt() != null
						&& castOther.getEmpAmt() != null && this.getEmpAmt().equals(castOther.getEmpAmt())))
				&& ((this.getEmplrAmt() == castOther.getEmplrAmt()) || (this.getEmplrAmt() != null
						&& castOther.getEmplrAmt() != null && this.getEmplrAmt().equals(castOther.getEmplrAmt())))
				&& ((this.getTeaHlthInsAmt() == castOther.getTeaHlthInsAmt())
						|| (this.getTeaHlthInsAmt() != null && castOther.getTeaHlthInsAmt() != null
								&& this.getTeaHlthInsAmt().equals(castOther.getTeaHlthInsAmt())))
				&& (this.getInclVacPos() == castOther.getInclVacPos())
				&& ((this.getModule() == castOther.getModule()) || (this.getModule() != null
						&& castOther.getModule() != null && this.getModule().equals(castOther.getModule())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + (getSimName() == null ? 0 : this.getSimName().hashCode());
		result = 37 * result + (getDedCd() == null ? 0 : this.getDedCd().hashCode());
		result = 37 * result + (getEmpAmt() == null ? 0 : this.getEmpAmt().hashCode());
		result = 37 * result + (getEmplrAmt() == null ? 0 : this.getEmplrAmt().hashCode());
		result = 37 * result + (getTeaHlthInsAmt() == null ? 0 : this.getTeaHlthInsAmt().hashCode());
		result = 37 * result + this.getInclVacPos();
		result = 37 * result + (getModule() == null ? 0 : this.getModule().hashCode());
		return result;
	}

}