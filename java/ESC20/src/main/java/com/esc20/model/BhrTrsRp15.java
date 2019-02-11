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
 * BhrTrsRp15 generated by hbm2java
 */
@Entity
@Table(name = "BHR_TRS_RP15", schema = "rsccc", catalog = "rsccc")
public class BhrTrsRp15 implements java.io.Serializable {

	private BhrTrsRp15Id id;
	private BigDecimal netDiffTrsGross;
	private BigDecimal netDiffMonContrib;
	private char specSvcShelt;
	private BigDecimal specSvcDedAmt;
	private char adjRsnCd;
	private byte nbrDaysWrkedPay;
	private String module;

	public BhrTrsRp15() {
	}

	public BhrTrsRp15(BhrTrsRp15Id id, BigDecimal netDiffTrsGross, BigDecimal netDiffMonContrib, char specSvcShelt,
			BigDecimal specSvcDedAmt, char adjRsnCd, byte nbrDaysWrkedPay, String module) {
		this.id = id;
		this.netDiffTrsGross = netDiffTrsGross;
		this.netDiffMonContrib = netDiffMonContrib;
		this.specSvcShelt = specSvcShelt;
		this.specSvcDedAmt = specSvcDedAmt;
		this.adjRsnCd = adjRsnCd;
		this.nbrDaysWrkedPay = nbrDaysWrkedPay;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "rptMon", column = @Column(name = "RPT_MON", nullable = false, length = 2)),
			@AttributeOverride(name = "rptYr", column = @Column(name = "RPT_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "staffId", column = @Column(name = "STAFF_ID", nullable = false, length = 9)),
			@AttributeOverride(name = "rptMonOrigRec", column = @Column(name = "RPT_MON_ORIG_REC", nullable = false, length = 2)),
			@AttributeOverride(name = "rptYrOrigRec", column = @Column(name = "RPT_YR_ORIG_REC", nullable = false, length = 4)) })
	public BhrTrsRp15Id getId() {
		return this.id;
	}

	public void setId(BhrTrsRp15Id id) {
		this.id = id;
	}

	@Column(name = "NET_DIFF_TRS_GROSS", nullable = false, precision = 9)
	public BigDecimal getNetDiffTrsGross() {
		return this.netDiffTrsGross;
	}

	public void setNetDiffTrsGross(BigDecimal netDiffTrsGross) {
		this.netDiffTrsGross = netDiffTrsGross;
	}

	@Column(name = "NET_DIFF_MON_CONTRIB", nullable = false, precision = 7)
	public BigDecimal getNetDiffMonContrib() {
		return this.netDiffMonContrib;
	}

	public void setNetDiffMonContrib(BigDecimal netDiffMonContrib) {
		this.netDiffMonContrib = netDiffMonContrib;
	}

	@Column(name = "SPEC_SVC_SHELT", nullable = false, length = 1)
	public char getSpecSvcShelt() {
		return this.specSvcShelt;
	}

	public void setSpecSvcShelt(char specSvcShelt) {
		this.specSvcShelt = specSvcShelt;
	}

	@Column(name = "SPEC_SVC_DED_AMT", nullable = false, precision = 9)
	public BigDecimal getSpecSvcDedAmt() {
		return this.specSvcDedAmt;
	}

	public void setSpecSvcDedAmt(BigDecimal specSvcDedAmt) {
		this.specSvcDedAmt = specSvcDedAmt;
	}

	@Column(name = "ADJ_RSN_CD", nullable = false, length = 1)
	public char getAdjRsnCd() {
		return this.adjRsnCd;
	}

	public void setAdjRsnCd(char adjRsnCd) {
		this.adjRsnCd = adjRsnCd;
	}

	@Column(name = "NBR_DAYS_WRKED_PAY", nullable = false, precision = 2, scale = 0)
	public byte getNbrDaysWrkedPay() {
		return this.nbrDaysWrkedPay;
	}

	public void setNbrDaysWrkedPay(byte nbrDaysWrkedPay) {
		this.nbrDaysWrkedPay = nbrDaysWrkedPay;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
