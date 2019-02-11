package com.esc20.model;
// Generated Jan 4, 2019 3:54:58 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BthrWrksCompRates generated by hbm2java
 */
@Entity
@Table(name = "BTHR_WRKS_COMP_RATES", schema = "rsccc", catalog = "rsccc")
public class BthrWrksCompRates implements java.io.Serializable {

	private BthrWrksCompRatesId id;
	private BigDecimal wrkCompNetRate;
	private BigDecimal wrkCompGrossRate;
	private String wrkCompDescr;
	private String module;

	public BthrWrksCompRates() {
	}

	public BthrWrksCompRates(BthrWrksCompRatesId id, BigDecimal wrkCompNetRate, BigDecimal wrkCompGrossRate,
			String wrkCompDescr, String module) {
		this.id = id;
		this.wrkCompNetRate = wrkCompNetRate;
		this.wrkCompGrossRate = wrkCompGrossRate;
		this.wrkCompDescr = wrkCompDescr;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "wrkComp", column = @Column(name = "WRK_COMP", nullable = false, length = 1)),
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)) })
	public BthrWrksCompRatesId getId() {
		return this.id;
	}

	public void setId(BthrWrksCompRatesId id) {
		this.id = id;
	}

	@Column(name = "WRK_COMP_NET_RATE", nullable = false, precision = 9, scale = 6)
	public BigDecimal getWrkCompNetRate() {
		return this.wrkCompNetRate;
	}

	public void setWrkCompNetRate(BigDecimal wrkCompNetRate) {
		this.wrkCompNetRate = wrkCompNetRate;
	}

	@Column(name = "WRK_COMP_GROSS_RATE", nullable = false, precision = 9, scale = 6)
	public BigDecimal getWrkCompGrossRate() {
		return this.wrkCompGrossRate;
	}

	public void setWrkCompGrossRate(BigDecimal wrkCompGrossRate) {
		this.wrkCompGrossRate = wrkCompGrossRate;
	}

	@Column(name = "WRK_COMP_DESCR", nullable = false, length = 20)
	public String getWrkCompDescr() {
		return this.wrkCompDescr;
	}

	public void setWrkCompDescr(String wrkCompDescr) {
		this.wrkCompDescr = wrkCompDescr;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
