package com.esc20.model;
// Generated Jan 4, 2019 3:42:57 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrInsurCoverageId generated by hbm2java
 */
@Embeddable
public class BhrInsurCoverageId implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private String empNbr;
	private char cyrNyrFlg;
	private String companyCd;
	private String planNbr;
	private short seqNbr;

	public BhrInsurCoverageId() {
	}

	public BhrInsurCoverageId(String empNbr, char cyrNyrFlg, String companyCd, String planNbr, short seqNbr) {
		this.empNbr = empNbr;
		this.cyrNyrFlg = cyrNyrFlg;
		this.companyCd = companyCd;
		this.planNbr = planNbr;
		this.seqNbr = seqNbr;
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

	@Column(name = "COMPANY_CD", nullable = false, length = 5)
	public String getCompanyCd() {
		return this.companyCd;
	}

	public void setCompanyCd(String companyCd) {
		this.companyCd = companyCd;
	}

	@Column(name = "PLAN_NBR", nullable = false, length = 20)
	public String getPlanNbr() {
		return this.planNbr;
	}

	public void setPlanNbr(String planNbr) {
		this.planNbr = planNbr;
	}

	@Column(name = "SEQ_NBR", nullable = false, precision = 3, scale = 0)
	public short getSeqNbr() {
		return this.seqNbr;
	}

	public void setSeqNbr(short seqNbr) {
		this.seqNbr = seqNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrInsurCoverageId))
			return false;
		BhrInsurCoverageId castOther = (BhrInsurCoverageId) other;

		return ((this.getEmpNbr() == castOther.getEmpNbr()) || (this.getEmpNbr() != null
				&& castOther.getEmpNbr() != null && this.getEmpNbr().equals(castOther.getEmpNbr())))
				&& (this.getCyrNyrFlg() == castOther.getCyrNyrFlg())
				&& ((this.getCompanyCd() == castOther.getCompanyCd()) || (this.getCompanyCd() != null
						&& castOther.getCompanyCd() != null && this.getCompanyCd().equals(castOther.getCompanyCd())))
				&& ((this.getPlanNbr() == castOther.getPlanNbr()) || (this.getPlanNbr() != null
						&& castOther.getPlanNbr() != null && this.getPlanNbr().equals(castOther.getPlanNbr())))
				&& (this.getSeqNbr() == castOther.getSeqNbr());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEmpNbr() == null ? 0 : this.getEmpNbr().hashCode());
		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + (getCompanyCd() == null ? 0 : this.getCompanyCd().hashCode());
		result = 37 * result + (getPlanNbr() == null ? 0 : this.getPlanNbr().hashCode());
		result = 37 * result + this.getSeqNbr();
		return result;
	}

}
