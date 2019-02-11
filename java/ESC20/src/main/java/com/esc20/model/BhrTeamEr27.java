package com.esc20.model;
// Generated Jan 4, 2019 3:47:38 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrTeamEr27 generated by hbm2java
 */
@Entity
@Table(name = "BHR_TEAM_ER27", schema = "rsccc", catalog = "rsccc")
public class BhrTeamEr27 implements java.io.Serializable {

	private BhrTeamEr27Id id;
	private String origTrsPosCd;
	private char origRetEmplmntTypCd;
	private short netDiffActHrsWrked;
	private byte netDiffDaysWrked;
	private char zeroDaysRsnCd;
	private BigDecimal netDiffGrosPayTot;
	private BigDecimal netDiffEmplrRetPensnSurchg;
	private BigDecimal netDiffEmplrTrsCareSurchg;
	private String origContrDtBegin;
	private String origContrDtEnd;
	private char origThrdPartyPay;
	private String newTrsPosCd;
	private char newRetEmplmntTypCd;
	private String newContrDtBegin;
	private String newContrDtEnd;
	private char newThrdPartyPay;
	private char adjRsnCd;
	private String module;

	public BhrTeamEr27() {
	}

	public BhrTeamEr27(BhrTeamEr27Id id, String origTrsPosCd, char origRetEmplmntTypCd, short netDiffActHrsWrked,
			byte netDiffDaysWrked, char zeroDaysRsnCd, BigDecimal netDiffGrosPayTot,
			BigDecimal netDiffEmplrRetPensnSurchg, BigDecimal netDiffEmplrTrsCareSurchg, String origContrDtBegin,
			String origContrDtEnd, char origThrdPartyPay, String newTrsPosCd, char newRetEmplmntTypCd,
			String newContrDtBegin, String newContrDtEnd, char newThrdPartyPay, char adjRsnCd, String module) {
		this.id = id;
		this.origTrsPosCd = origTrsPosCd;
		this.origRetEmplmntTypCd = origRetEmplmntTypCd;
		this.netDiffActHrsWrked = netDiffActHrsWrked;
		this.netDiffDaysWrked = netDiffDaysWrked;
		this.zeroDaysRsnCd = zeroDaysRsnCd;
		this.netDiffGrosPayTot = netDiffGrosPayTot;
		this.netDiffEmplrRetPensnSurchg = netDiffEmplrRetPensnSurchg;
		this.netDiffEmplrTrsCareSurchg = netDiffEmplrTrsCareSurchg;
		this.origContrDtBegin = origContrDtBegin;
		this.origContrDtEnd = origContrDtEnd;
		this.origThrdPartyPay = origThrdPartyPay;
		this.newTrsPosCd = newTrsPosCd;
		this.newRetEmplmntTypCd = newRetEmplmntTypCd;
		this.newContrDtBegin = newContrDtBegin;
		this.newContrDtEnd = newContrDtEnd;
		this.newThrdPartyPay = newThrdPartyPay;
		this.adjRsnCd = adjRsnCd;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "rptYr", column = @Column(name = "RPT_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "rptMon", column = @Column(name = "RPT_MON", nullable = false, length = 2)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "adjRptYr", column = @Column(name = "ADJ_RPT_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "adjRptMon", column = @Column(name = "ADJ_RPT_MON", nullable = false, length = 2)) })
	public BhrTeamEr27Id getId() {
		return this.id;
	}

	public void setId(BhrTeamEr27Id id) {
		this.id = id;
	}

	@Column(name = "ORIG_TRS_POS_CD", nullable = false, length = 2)
	public String getOrigTrsPosCd() {
		return this.origTrsPosCd;
	}

	public void setOrigTrsPosCd(String origTrsPosCd) {
		this.origTrsPosCd = origTrsPosCd;
	}

	@Column(name = "ORIG_RET_EMPLMNT_TYP_CD", nullable = false, length = 1)
	public char getOrigRetEmplmntTypCd() {
		return this.origRetEmplmntTypCd;
	}

	public void setOrigRetEmplmntTypCd(char origRetEmplmntTypCd) {
		this.origRetEmplmntTypCd = origRetEmplmntTypCd;
	}

	@Column(name = "NET_DIFF_ACT_HRS_WRKED", nullable = false, precision = 3, scale = 0)
	public short getNetDiffActHrsWrked() {
		return this.netDiffActHrsWrked;
	}

	public void setNetDiffActHrsWrked(short netDiffActHrsWrked) {
		this.netDiffActHrsWrked = netDiffActHrsWrked;
	}

	@Column(name = "NET_DIFF_DAYS_WRKED", nullable = false, precision = 2, scale = 0)
	public byte getNetDiffDaysWrked() {
		return this.netDiffDaysWrked;
	}

	public void setNetDiffDaysWrked(byte netDiffDaysWrked) {
		this.netDiffDaysWrked = netDiffDaysWrked;
	}

	@Column(name = "ZERO_DAYS_RSN_CD", nullable = false, length = 1)
	public char getZeroDaysRsnCd() {
		return this.zeroDaysRsnCd;
	}

	public void setZeroDaysRsnCd(char zeroDaysRsnCd) {
		this.zeroDaysRsnCd = zeroDaysRsnCd;
	}

	@Column(name = "NET_DIFF_GROS_PAY_TOT", nullable = false, precision = 9)
	public BigDecimal getNetDiffGrosPayTot() {
		return this.netDiffGrosPayTot;
	}

	public void setNetDiffGrosPayTot(BigDecimal netDiffGrosPayTot) {
		this.netDiffGrosPayTot = netDiffGrosPayTot;
	}

	@Column(name = "NET_DIFF_EMPLR_RET_PENSN_SURCHG", nullable = false, precision = 7)
	public BigDecimal getNetDiffEmplrRetPensnSurchg() {
		return this.netDiffEmplrRetPensnSurchg;
	}

	public void setNetDiffEmplrRetPensnSurchg(BigDecimal netDiffEmplrRetPensnSurchg) {
		this.netDiffEmplrRetPensnSurchg = netDiffEmplrRetPensnSurchg;
	}

	@Column(name = "NET_DIFF_EMPLR_TRS_CARE_SURCHG", nullable = false, precision = 7)
	public BigDecimal getNetDiffEmplrTrsCareSurchg() {
		return this.netDiffEmplrTrsCareSurchg;
	}

	public void setNetDiffEmplrTrsCareSurchg(BigDecimal netDiffEmplrTrsCareSurchg) {
		this.netDiffEmplrTrsCareSurchg = netDiffEmplrTrsCareSurchg;
	}

	@Column(name = "ORIG_CONTR_DT_BEGIN", nullable = false, length = 8)
	public String getOrigContrDtBegin() {
		return this.origContrDtBegin;
	}

	public void setOrigContrDtBegin(String origContrDtBegin) {
		this.origContrDtBegin = origContrDtBegin;
	}

	@Column(name = "ORIG_CONTR_DT_END", nullable = false, length = 8)
	public String getOrigContrDtEnd() {
		return this.origContrDtEnd;
	}

	public void setOrigContrDtEnd(String origContrDtEnd) {
		this.origContrDtEnd = origContrDtEnd;
	}

	@Column(name = "ORIG_THRD_PARTY_PAY", nullable = false, length = 1)
	public char getOrigThrdPartyPay() {
		return this.origThrdPartyPay;
	}

	public void setOrigThrdPartyPay(char origThrdPartyPay) {
		this.origThrdPartyPay = origThrdPartyPay;
	}

	@Column(name = "NEW_TRS_POS_CD", nullable = false, length = 2)
	public String getNewTrsPosCd() {
		return this.newTrsPosCd;
	}

	public void setNewTrsPosCd(String newTrsPosCd) {
		this.newTrsPosCd = newTrsPosCd;
	}

	@Column(name = "NEW_RET_EMPLMNT_TYP_CD", nullable = false, length = 1)
	public char getNewRetEmplmntTypCd() {
		return this.newRetEmplmntTypCd;
	}

	public void setNewRetEmplmntTypCd(char newRetEmplmntTypCd) {
		this.newRetEmplmntTypCd = newRetEmplmntTypCd;
	}

	@Column(name = "NEW_CONTR_DT_BEGIN", nullable = false, length = 8)
	public String getNewContrDtBegin() {
		return this.newContrDtBegin;
	}

	public void setNewContrDtBegin(String newContrDtBegin) {
		this.newContrDtBegin = newContrDtBegin;
	}

	@Column(name = "NEW_CONTR_DT_END", nullable = false, length = 8)
	public String getNewContrDtEnd() {
		return this.newContrDtEnd;
	}

	public void setNewContrDtEnd(String newContrDtEnd) {
		this.newContrDtEnd = newContrDtEnd;
	}

	@Column(name = "NEW_THRD_PARTY_PAY", nullable = false, length = 1)
	public char getNewThrdPartyPay() {
		return this.newThrdPartyPay;
	}

	public void setNewThrdPartyPay(char newThrdPartyPay) {
		this.newThrdPartyPay = newThrdPartyPay;
	}

	@Column(name = "ADJ_RSN_CD", nullable = false, length = 1)
	public char getAdjRsnCd() {
		return this.adjRsnCd;
	}

	public void setAdjRsnCd(char adjRsnCd) {
		this.adjRsnCd = adjRsnCd;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
