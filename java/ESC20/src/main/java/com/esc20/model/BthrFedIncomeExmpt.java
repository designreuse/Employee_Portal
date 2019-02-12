package com.esc20.model;
// Generated Jan 4, 2019 3:51:33 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BthrFedIncomeExmpt generated by hbm2java
 */
@Entity
@Table(name = "BTHR_FED_INCOME_EXMPT", schema = "rsccc", catalog = "rsccc")
public class BthrFedIncomeExmpt implements java.io.Serializable {

	private String taxYr;
	private BigDecimal biWklyAmt;
	private BigDecimal semiMnthlyAmt;
	private BigDecimal mnthlyAmt;
	private String module;

	public BthrFedIncomeExmpt() {
	}

	public BthrFedIncomeExmpt(String taxYr, BigDecimal biWklyAmt, BigDecimal semiMnthlyAmt, BigDecimal mnthlyAmt,
			String module) {
		this.taxYr = taxYr;
		this.biWklyAmt = biWklyAmt;
		this.semiMnthlyAmt = semiMnthlyAmt;
		this.mnthlyAmt = mnthlyAmt;
		this.module = module;
	}

	@Id

	@Column(name = "TAX_YR", nullable = false, length = 4)
	public String getTaxYr() {
		return this.taxYr;
	}

	public void setTaxYr(String taxYr) {
		this.taxYr = taxYr;
	}

	@Column(name = "BI_WKLY_AMT", nullable = false, precision = 7)
	public BigDecimal getBiWklyAmt() {
		return this.biWklyAmt;
	}

	public void setBiWklyAmt(BigDecimal biWklyAmt) {
		this.biWklyAmt = biWklyAmt;
	}

	@Column(name = "SEMI_MNTHLY_AMT", nullable = false, precision = 7)
	public BigDecimal getSemiMnthlyAmt() {
		return this.semiMnthlyAmt;
	}

	public void setSemiMnthlyAmt(BigDecimal semiMnthlyAmt) {
		this.semiMnthlyAmt = semiMnthlyAmt;
	}

	@Column(name = "MNTHLY_AMT", nullable = false, precision = 9)
	public BigDecimal getMnthlyAmt() {
		return this.mnthlyAmt;
	}

	public void setMnthlyAmt(BigDecimal mnthlyAmt) {
		this.mnthlyAmt = mnthlyAmt;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}