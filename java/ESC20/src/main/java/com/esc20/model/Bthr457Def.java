package com.esc20.model;
// Generated Jan 4, 2019 3:48:53 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Bthr457Def generated by hbm2java
 */
@Entity
@Table(name = "BTHR_457_DEF", schema = "rsccc", catalog = "rsccc")
public class Bthr457Def implements java.io.Serializable {

	private String taxYr;
	private BigDecimal emp457Pct;
	private BigDecimal emplr457Pct;
	private String module;

	public Bthr457Def() {
	}

	public Bthr457Def(String taxYr, BigDecimal emp457Pct, BigDecimal emplr457Pct, String module) {
		this.taxYr = taxYr;
		this.emp457Pct = emp457Pct;
		this.emplr457Pct = emplr457Pct;
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

	@Column(name = "EMP_457_PCT", nullable = false, precision = 5, scale = 4)
	public BigDecimal getEmp457Pct() {
		return this.emp457Pct;
	}

	public void setEmp457Pct(BigDecimal emp457Pct) {
		this.emp457Pct = emp457Pct;
	}

	@Column(name = "EMPLR_457_PCT", nullable = false, precision = 5, scale = 4)
	public BigDecimal getEmplr457Pct() {
		return this.emplr457Pct;
	}

	public void setEmplr457Pct(BigDecimal emplr457Pct) {
		this.emplr457Pct = emplr457Pct;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
