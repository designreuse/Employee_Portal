package com.esc20.model;
// Generated Jan 4, 2019 3:40:12 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrEmpDeduct generated by hbm2java
 */
@Entity
@Table(name = "BHR_EMP_DEDUCT", schema = "rsccc", catalog = "rsccc")
public class BhrEmpDeduct implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrEmpDeductId id;
	private BigDecimal empAmt;
	private BigDecimal emplrAmt;
	private boolean emplrContribFactor;
	private short dedRemain;
	private char cafeFlg;
	private char refundElig;
	private String caseNbr;
	private String causeNbr;
	private String bankCd;
	private String bankAcctNbr;
	private char bankAcctTyp;
	private char bankPrenote;
	private boolean teaHealthInsContribFactor;
	private String module;

	public BhrEmpDeduct() {
	}

	public BhrEmpDeduct(BhrEmpDeductId id, BigDecimal empAmt, BigDecimal emplrAmt, boolean emplrContribFactor,
			short dedRemain, char cafeFlg, char refundElig, String caseNbr, String causeNbr, String bankCd,
			String bankAcctNbr, char bankAcctTyp, char bankPrenote, boolean teaHealthInsContribFactor, String module) {
		this.id = id;
		this.empAmt = empAmt;
		this.emplrAmt = emplrAmt;
		this.emplrContribFactor = emplrContribFactor;
		this.dedRemain = dedRemain;
		this.cafeFlg = cafeFlg;
		this.refundElig = refundElig;
		this.caseNbr = caseNbr;
		this.causeNbr = causeNbr;
		this.bankCd = bankCd;
		this.bankAcctNbr = bankAcctNbr;
		this.bankAcctTyp = bankAcctTyp;
		this.bankPrenote = bankPrenote;
		this.teaHealthInsContribFactor = teaHealthInsContribFactor;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "dedCd", column = @Column(name = "DED_CD", nullable = false, length = 3)),
			@AttributeOverride(name = "dedSeq", column = @Column(name = "DED_SEQ", nullable = false, length = 1)),
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)) })
	public BhrEmpDeductId getId() {
		return this.id;
	}

	public void setId(BhrEmpDeductId id) {
		this.id = id;
	}

	@Column(name = "EMP_AMT", nullable = false, precision = 7)
	public BigDecimal getEmpAmt() {
		return this.empAmt;
	}

	public void setEmpAmt(BigDecimal empAmt) {
		this.empAmt = empAmt;
	}

	@Column(name = "EMPLR_AMT", nullable = false, precision = 7)
	public BigDecimal getEmplrAmt() {
		return this.emplrAmt;
	}

	public void setEmplrAmt(BigDecimal emplrAmt) {
		this.emplrAmt = emplrAmt;
	}

	@Column(name = "EMPLR_CONTRIB_FACTOR", nullable = false, precision = 1, scale = 0)
	public boolean isEmplrContribFactor() {
		return this.emplrContribFactor;
	}

	public void setEmplrContribFactor(boolean emplrContribFactor) {
		this.emplrContribFactor = emplrContribFactor;
	}

	@Column(name = "DED_REMAIN", nullable = false, precision = 3, scale = 0)
	public short getDedRemain() {
		return this.dedRemain;
	}

	public void setDedRemain(short dedRemain) {
		this.dedRemain = dedRemain;
	}

	@Column(name = "CAFE_FLG", nullable = false, length = 1)
	public char getCafeFlg() {
		return this.cafeFlg;
	}

	public void setCafeFlg(char cafeFlg) {
		this.cafeFlg = cafeFlg;
	}

	@Column(name = "REFUND_ELIG", nullable = false, length = 1)
	public char getRefundElig() {
		return this.refundElig;
	}

	public void setRefundElig(char refundElig) {
		this.refundElig = refundElig;
	}

	@Column(name = "CASE_NBR", nullable = false, length = 20)
	public String getCaseNbr() {
		return this.caseNbr;
	}

	public void setCaseNbr(String caseNbr) {
		this.caseNbr = caseNbr;
	}

	@Column(name = "CAUSE_NBR", nullable = false, length = 12)
	public String getCauseNbr() {
		return this.causeNbr;
	}

	public void setCauseNbr(String causeNbr) {
		this.causeNbr = causeNbr;
	}

	@Column(name = "BANK_CD", nullable = false, length = 3)
	public String getBankCd() {
		return this.bankCd;
	}

	public void setBankCd(String bankCd) {
		this.bankCd = bankCd;
	}

	@Column(name = "BANK_ACCT_NBR", nullable = false, length = 17)
	public String getBankAcctNbr() {
		return this.bankAcctNbr;
	}

	public void setBankAcctNbr(String bankAcctNbr) {
		this.bankAcctNbr = bankAcctNbr;
	}

	@Column(name = "BANK_ACCT_TYP", nullable = false, length = 1)
	public char getBankAcctTyp() {
		return this.bankAcctTyp;
	}

	public void setBankAcctTyp(char bankAcctTyp) {
		this.bankAcctTyp = bankAcctTyp;
	}

	@Column(name = "BANK_PRENOTE", nullable = false, length = 1)
	public char getBankPrenote() {
		return this.bankPrenote;
	}

	public void setBankPrenote(char bankPrenote) {
		this.bankPrenote = bankPrenote;
	}

	@Column(name = "TEA_HEALTH_INS_CONTRIB_FACTOR", nullable = false, precision = 1, scale = 0)
	public boolean isTeaHealthInsContribFactor() {
		return this.teaHealthInsContribFactor;
	}

	public void setTeaHealthInsContribFactor(boolean teaHealthInsContribFactor) {
		this.teaHealthInsContribFactor = teaHealthInsContribFactor;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}