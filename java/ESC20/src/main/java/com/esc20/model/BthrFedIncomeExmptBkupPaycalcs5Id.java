package com.esc20.model;
// Generated Jan 4, 2019 3:51:33 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BthrFedIncomeExmptBkupPaycalcs5Id generated by hbm2java
 */
@Embeddable
public class BthrFedIncomeExmptBkupPaycalcs5Id implements java.io.Serializable {

	private String taxYr;
	private BigDecimal biWklyAmt;
	private BigDecimal semiMnthlyAmt;
	private BigDecimal mnthlyAmt;
	private String module;

	public BthrFedIncomeExmptBkupPaycalcs5Id() {
	}

	public BthrFedIncomeExmptBkupPaycalcs5Id(String taxYr, BigDecimal biWklyAmt, BigDecimal semiMnthlyAmt,
			BigDecimal mnthlyAmt, String module) {
		this.taxYr = taxYr;
		this.biWklyAmt = biWklyAmt;
		this.semiMnthlyAmt = semiMnthlyAmt;
		this.mnthlyAmt = mnthlyAmt;
		this.module = module;
	}

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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BthrFedIncomeExmptBkupPaycalcs5Id))
			return false;
		BthrFedIncomeExmptBkupPaycalcs5Id castOther = (BthrFedIncomeExmptBkupPaycalcs5Id) other;

		return ((this.getTaxYr() == castOther.getTaxYr()) || (this.getTaxYr() != null && castOther.getTaxYr() != null
				&& this.getTaxYr().equals(castOther.getTaxYr())))
				&& ((this.getBiWklyAmt() == castOther.getBiWklyAmt()) || (this.getBiWklyAmt() != null
						&& castOther.getBiWklyAmt() != null && this.getBiWklyAmt().equals(castOther.getBiWklyAmt())))
				&& ((this.getSemiMnthlyAmt() == castOther.getSemiMnthlyAmt())
						|| (this.getSemiMnthlyAmt() != null && castOther.getSemiMnthlyAmt() != null
								&& this.getSemiMnthlyAmt().equals(castOther.getSemiMnthlyAmt())))
				&& ((this.getMnthlyAmt() == castOther.getMnthlyAmt()) || (this.getMnthlyAmt() != null
						&& castOther.getMnthlyAmt() != null && this.getMnthlyAmt().equals(castOther.getMnthlyAmt())))
				&& ((this.getModule() == castOther.getModule()) || (this.getModule() != null
						&& castOther.getModule() != null && this.getModule().equals(castOther.getModule())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTaxYr() == null ? 0 : this.getTaxYr().hashCode());
		result = 37 * result + (getBiWklyAmt() == null ? 0 : this.getBiWklyAmt().hashCode());
		result = 37 * result + (getSemiMnthlyAmt() == null ? 0 : this.getSemiMnthlyAmt().hashCode());
		result = 37 * result + (getMnthlyAmt() == null ? 0 : this.getMnthlyAmt().hashCode());
		result = 37 * result + (getModule() == null ? 0 : this.getModule().hashCode());
		return result;
	}

}
