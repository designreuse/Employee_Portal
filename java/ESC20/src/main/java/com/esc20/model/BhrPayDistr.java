package com.esc20.model;
// Generated Jan 4, 2019 3:44:27 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrPayDistr generated by hbm2java
 */
@Entity
@Table(name = "BHR_PAY_DISTR", schema = "rsccc", catalog = "rsccc")
public class BhrPayDistr implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrPayDistrId id;
	private char acctTyp;
	private String payActy;
	private char wrkComp;
	private char glFileId;
	private String fund;
	private String func;
	private String obj;
	private String sobj;
	private String org;
	private char fsclYr;
	private String pgm;
	private char edSpan;
	private String projDtl;
	private BigDecimal acctAmt;
	private BigDecimal acctPct;
	private short acctPymts;
	private String trsGrantCd;
	private String extraDutyCd;
	private char expense373;
	private char contribAcctFlg;
	private short acctSeq;
	private char perforPay;
	private String module;

	public BhrPayDistr() {
	}

	public BhrPayDistr(BhrPayDistrId id, char acctTyp, String payActy, char wrkComp, char glFileId, String fund,
			String func, String obj, String sobj, String org, char fsclYr, String pgm, char edSpan, String projDtl,
			BigDecimal acctAmt, BigDecimal acctPct, short acctPymts, String trsGrantCd, String extraDutyCd,
			char expense373, char contribAcctFlg, short acctSeq, char perforPay, String module) {
		this.id = id;
		this.acctTyp = acctTyp;
		this.payActy = payActy;
		this.wrkComp = wrkComp;
		this.glFileId = glFileId;
		this.fund = fund;
		this.func = func;
		this.obj = obj;
		this.sobj = sobj;
		this.org = org;
		this.fsclYr = fsclYr;
		this.pgm = pgm;
		this.edSpan = edSpan;
		this.projDtl = projDtl;
		this.acctAmt = acctAmt;
		this.acctPct = acctPct;
		this.acctPymts = acctPymts;
		this.trsGrantCd = trsGrantCd;
		this.extraDutyCd = extraDutyCd;
		this.expense373 = expense373;
		this.contribAcctFlg = contribAcctFlg;
		this.acctSeq = acctSeq;
		this.perforPay = perforPay;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "jobCd", column = @Column(name = "JOB_CD", nullable = false, length = 4)),
			@AttributeOverride(name = "distrSeq", column = @Column(name = "DISTR_SEQ", nullable = false, precision = 3, scale = 0)) })
	public BhrPayDistrId getId() {
		return this.id;
	}

	public void setId(BhrPayDistrId id) {
		this.id = id;
	}

	@Column(name = "ACCT_TYP", nullable = false, length = 1)
	public char getAcctTyp() {
		return this.acctTyp;
	}

	public void setAcctTyp(char acctTyp) {
		this.acctTyp = acctTyp;
	}

	@Column(name = "PAY_ACTY", nullable = false, length = 2)
	public String getPayActy() {
		return this.payActy;
	}

	public void setPayActy(String payActy) {
		this.payActy = payActy;
	}

	@Column(name = "WRK_COMP", nullable = false, length = 1)
	public char getWrkComp() {
		return this.wrkComp;
	}

	public void setWrkComp(char wrkComp) {
		this.wrkComp = wrkComp;
	}

	@Column(name = "GL_FILE_ID", nullable = false, length = 1)
	public char getGlFileId() {
		return this.glFileId;
	}

	public void setGlFileId(char glFileId) {
		this.glFileId = glFileId;
	}

	@Column(name = "FUND", nullable = false, length = 3)
	public String getFund() {
		return this.fund;
	}

	public void setFund(String fund) {
		this.fund = fund;
	}

	@Column(name = "FUNC", nullable = false, length = 2)
	public String getFunc() {
		return this.func;
	}

	public void setFunc(String func) {
		this.func = func;
	}

	@Column(name = "OBJ", nullable = false, length = 4)
	public String getObj() {
		return this.obj;
	}

	public void setObj(String obj) {
		this.obj = obj;
	}

	@Column(name = "SOBJ", nullable = false, length = 2)
	public String getSobj() {
		return this.sobj;
	}

	public void setSobj(String sobj) {
		this.sobj = sobj;
	}

	@Column(name = "ORG", nullable = false, length = 3)
	public String getOrg() {
		return this.org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	@Column(name = "FSCL_YR", nullable = false, length = 1)
	public char getFsclYr() {
		return this.fsclYr;
	}

	public void setFsclYr(char fsclYr) {
		this.fsclYr = fsclYr;
	}

	@Column(name = "PGM", nullable = false, length = 2)
	public String getPgm() {
		return this.pgm;
	}

	public void setPgm(String pgm) {
		this.pgm = pgm;
	}

	@Column(name = "ED_SPAN", nullable = false, length = 1)
	public char getEdSpan() {
		return this.edSpan;
	}

	public void setEdSpan(char edSpan) {
		this.edSpan = edSpan;
	}

	@Column(name = "PROJ_DTL", nullable = false, length = 2)
	public String getProjDtl() {
		return this.projDtl;
	}

	public void setProjDtl(String projDtl) {
		this.projDtl = projDtl;
	}

	@Column(name = "ACCT_AMT", nullable = false, precision = 9)
	public BigDecimal getAcctAmt() {
		return this.acctAmt;
	}

	public void setAcctAmt(BigDecimal acctAmt) {
		this.acctAmt = acctAmt;
	}

	@Column(name = "ACCT_PCT", nullable = false, precision = 7, scale = 5)
	public BigDecimal getAcctPct() {
		return this.acctPct;
	}

	public void setAcctPct(BigDecimal acctPct) {
		this.acctPct = acctPct;
	}

	@Column(name = "ACCT_PYMTS", nullable = false, precision = 3, scale = 0)
	public short getAcctPymts() {
		return this.acctPymts;
	}

	public void setAcctPymts(short acctPymts) {
		this.acctPymts = acctPymts;
	}

	@Column(name = "TRS_GRANT_CD", nullable = false, length = 2)
	public String getTrsGrantCd() {
		return this.trsGrantCd;
	}

	public void setTrsGrantCd(String trsGrantCd) {
		this.trsGrantCd = trsGrantCd;
	}

	@Column(name = "EXTRA_DUTY_CD", nullable = false, length = 2)
	public String getExtraDutyCd() {
		return this.extraDutyCd;
	}

	public void setExtraDutyCd(String extraDutyCd) {
		this.extraDutyCd = extraDutyCd;
	}

	@Column(name = "EXPENSE_373", nullable = false, length = 1)
	public char getExpense373() {
		return this.expense373;
	}

	public void setExpense373(char expense373) {
		this.expense373 = expense373;
	}

	@Column(name = "CONTRIB_ACCT_FLG", nullable = false, length = 1)
	public char getContribAcctFlg() {
		return this.contribAcctFlg;
	}

	public void setContribAcctFlg(char contribAcctFlg) {
		this.contribAcctFlg = contribAcctFlg;
	}

	@Column(name = "ACCT_SEQ", nullable = false, precision = 3, scale = 0)
	public short getAcctSeq() {
		return this.acctSeq;
	}

	public void setAcctSeq(short acctSeq) {
		this.acctSeq = acctSeq;
	}

	@Column(name = "PERFOR_PAY", nullable = false, length = 1)
	public char getPerforPay() {
		return this.perforPay;
	}

	public void setPerforPay(char perforPay) {
		this.perforPay = perforPay;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
