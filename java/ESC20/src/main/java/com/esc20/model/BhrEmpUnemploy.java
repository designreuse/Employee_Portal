package com.esc20.model;
// Generated Jan 4, 2019 3:42:31 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * BhrEmpUnemploy generated by hbm2java
 */
@Entity
@Table(name = "BHR_EMP_UNEMPLOY", schema = "rsccc", catalog = "rsccc")
public class BhrEmpUnemploy implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrEmpUnemployId id;
	private BhrEmpPay bhrEmpPay;
	private BigDecimal unempGross;
	private BigDecimal unempInsAmt;
	private String module;

	public BhrEmpUnemploy() {
	}

	public BhrEmpUnemploy(BhrEmpUnemployId id, BhrEmpPay bhrEmpPay, BigDecimal unempGross, BigDecimal unempInsAmt,
			String module) {
		this.id = id;
		this.bhrEmpPay = bhrEmpPay;
		this.unempGross = unempGross;
		this.unempInsAmt = unempInsAmt;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "calYr", column = @Column(name = "CAL_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "quarter", column = @Column(name = "QUARTER", nullable = false, length = 1)) })
	public BhrEmpUnemployId getId() {
		return this.id;
	}

	public void setId(BhrEmpUnemployId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CYR_NYR_FLG", referencedColumnName = "PAY_FREQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PAY_FREQ", referencedColumnName = "EMP_NBR", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "EMP_NBR", referencedColumnName = "CYR_NYR_FLG", nullable = false, insertable = false, updatable = false) })
	public BhrEmpPay getBhrEmpPay() {
		return this.bhrEmpPay;
	}

	public void setBhrEmpPay(BhrEmpPay bhrEmpPay) {
		this.bhrEmpPay = bhrEmpPay;
	}

	@Column(name = "UNEMP_GROSS", nullable = false, precision = 9)
	public BigDecimal getUnempGross() {
		return this.unempGross;
	}

	public void setUnempGross(BigDecimal unempGross) {
		this.unempGross = unempGross;
	}

	@Column(name = "UNEMP_INS_AMT", nullable = false, precision = 9)
	public BigDecimal getUnempInsAmt() {
		return this.unempInsAmt;
	}

	public void setUnempInsAmt(BigDecimal unempInsAmt) {
		this.unempInsAmt = unempInsAmt;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
