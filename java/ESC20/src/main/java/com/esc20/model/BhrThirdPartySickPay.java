package com.esc20.model;
// Generated Jan 4, 2019 3:47:57 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrThirdPartySickPay generated by hbm2java
 */
@Entity
@Table(name = "BHR_THIRD_PARTY_SICK_PAY", schema = "rsccc", catalog = "rsccc")
public class BhrThirdPartySickPay implements java.io.Serializable {

	private BhrThirdPartySickPayId id;
	private char ficaTyp;
	private BigDecimal sickNontax;
	private BigDecimal sickPayWhGross;
	private BigDecimal sickPayWhTax;
	private BigDecimal sickPayFicaGross;
	private BigDecimal sickPayFicaTax;
	private BigDecimal sickPayMedGross;
	private BigDecimal sickPayMedTax;
	private String module;

	public BhrThirdPartySickPay() {
	}

	public BhrThirdPartySickPay(BhrThirdPartySickPayId id, char ficaTyp, BigDecimal sickNontax,
			BigDecimal sickPayWhGross, BigDecimal sickPayWhTax, BigDecimal sickPayFicaGross, BigDecimal sickPayFicaTax,
			BigDecimal sickPayMedGross, BigDecimal sickPayMedTax, String module) {
		this.id = id;
		this.ficaTyp = ficaTyp;
		this.sickNontax = sickNontax;
		this.sickPayWhGross = sickPayWhGross;
		this.sickPayWhTax = sickPayWhTax;
		this.sickPayFicaGross = sickPayFicaGross;
		this.sickPayFicaTax = sickPayFicaTax;
		this.sickPayMedGross = sickPayMedGross;
		this.sickPayMedTax = sickPayMedTax;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "calYr", column = @Column(name = "CAL_YR", nullable = false, length = 4)) })
	public BhrThirdPartySickPayId getId() {
		return this.id;
	}

	public void setId(BhrThirdPartySickPayId id) {
		this.id = id;
	}

	@Column(name = "FICA_TYP", nullable = false, length = 1)
	public char getFicaTyp() {
		return this.ficaTyp;
	}

	public void setFicaTyp(char ficaTyp) {
		this.ficaTyp = ficaTyp;
	}

	@Column(name = "SICK_NONTAX", nullable = false, precision = 9)
	public BigDecimal getSickNontax() {
		return this.sickNontax;
	}

	public void setSickNontax(BigDecimal sickNontax) {
		this.sickNontax = sickNontax;
	}

	@Column(name = "SICK_PAY_WH_GROSS", nullable = false, precision = 9)
	public BigDecimal getSickPayWhGross() {
		return this.sickPayWhGross;
	}

	public void setSickPayWhGross(BigDecimal sickPayWhGross) {
		this.sickPayWhGross = sickPayWhGross;
	}

	@Column(name = "SICK_PAY_WH_TAX", nullable = false, precision = 9)
	public BigDecimal getSickPayWhTax() {
		return this.sickPayWhTax;
	}

	public void setSickPayWhTax(BigDecimal sickPayWhTax) {
		this.sickPayWhTax = sickPayWhTax;
	}

	@Column(name = "SICK_PAY_FICA_GROSS", nullable = false, precision = 9)
	public BigDecimal getSickPayFicaGross() {
		return this.sickPayFicaGross;
	}

	public void setSickPayFicaGross(BigDecimal sickPayFicaGross) {
		this.sickPayFicaGross = sickPayFicaGross;
	}

	@Column(name = "SICK_PAY_FICA_TAX", nullable = false, precision = 9)
	public BigDecimal getSickPayFicaTax() {
		return this.sickPayFicaTax;
	}

	public void setSickPayFicaTax(BigDecimal sickPayFicaTax) {
		this.sickPayFicaTax = sickPayFicaTax;
	}

	@Column(name = "SICK_PAY_MED_GROSS", nullable = false, precision = 9)
	public BigDecimal getSickPayMedGross() {
		return this.sickPayMedGross;
	}

	public void setSickPayMedGross(BigDecimal sickPayMedGross) {
		this.sickPayMedGross = sickPayMedGross;
	}

	@Column(name = "SICK_PAY_MED_TAX", nullable = false, precision = 9)
	public BigDecimal getSickPayMedTax() {
		return this.sickPayMedTax;
	}

	public void setSickPayMedTax(BigDecimal sickPayMedTax) {
		this.sickPayMedTax = sickPayMedTax;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
