package com.esc20.model;
// Generated Jan 4, 2019 3:36:22 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrAca1095cEmpHist generated by hbm2java
 */
@Entity
@Table(name = "BHR_ACA_1095C_EMP_HIST", schema = "rsccc", catalog = "rsccc")
public class BhrAca1095cEmpHist implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrAca1095cEmpHistId id;
	private String offrOfCovrg;
	private BigDecimal empShr;
	private String safeHrbr;
	private char selfIns;
	private String planStrtMon;

	public BhrAca1095cEmpHist() {
	}

	public BhrAca1095cEmpHist(BhrAca1095cEmpHistId id, String offrOfCovrg, BigDecimal empShr, String safeHrbr,
			char selfIns, String planStrtMon) {
		this.id = id;
		this.offrOfCovrg = offrOfCovrg;
		this.empShr = empShr;
		this.safeHrbr = safeHrbr;
		this.selfIns = selfIns;
		this.planStrtMon = planStrtMon;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "calYr", column = @Column(name = "CAL_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "calMon", column = @Column(name = "CAL_MON", nullable = false, length = 3)) })
	public BhrAca1095cEmpHistId getId() {
		return this.id;
	}

	public void setId(BhrAca1095cEmpHistId id) {
		this.id = id;
	}

	@Column(name = "OFFR_OF_COVRG", nullable = false, length = 2)
	public String getOffrOfCovrg() {
		return this.offrOfCovrg;
	}

	public void setOffrOfCovrg(String offrOfCovrg) {
		this.offrOfCovrg = offrOfCovrg;
	}

	@Column(name = "EMP_SHR", nullable = false, precision = 7)
	public BigDecimal getEmpShr() {
		return this.empShr;
	}

	public void setEmpShr(BigDecimal empShr) {
		this.empShr = empShr;
	}

	@Column(name = "SAFE_HRBR", nullable = false, length = 2)
	public String getSafeHrbr() {
		return this.safeHrbr;
	}

	public void setSafeHrbr(String safeHrbr) {
		this.safeHrbr = safeHrbr;
	}

	@Column(name = "SELF_INS", nullable = false, length = 1)
	public char getSelfIns() {
		return this.selfIns;
	}

	public void setSelfIns(char selfIns) {
		this.selfIns = selfIns;
	}

	@Column(name = "PLAN_STRT_MON", nullable = false, length = 2)
	public String getPlanStrtMon() {
		return this.planStrtMon;
	}

	public void setPlanStrtMon(String planStrtMon) {
		this.planStrtMon = planStrtMon;
	}

}
