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
 * BhrTransferTrans generated by hbm2java
 */
@Entity
@Table(name = "BHR_TRANSFER_TRANS", schema = "rsccc", catalog = "rsccc")
public class BhrTransferTrans implements java.io.Serializable {

	private BhrTransferTransId id;
	private String empNbr;
	private String dtOfPay;
	private String dedCd;
	private BigDecimal dedAmt;
	private String vendorNbr;
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
	private char indivSumFlg;
	private String caseNbr;
	private String causeNbr;
	private char liabTyp;
	private String chkNbr;
	private String checkDt;
	private char checkType;
	private String userId;
	private char chkCleared;
	private String reconDts;
	private String module;

	public BhrTransferTrans() {
	}

	public BhrTransferTrans(BhrTransferTransId id, String empNbr, String dtOfPay, String dedCd, BigDecimal dedAmt,
			String vendorNbr, char glFileId, String fund, String func, String obj, String sobj, String org, char fsclYr,
			String pgm, char edSpan, String projDtl, char indivSumFlg, String caseNbr, String causeNbr, char liabTyp,
			String chkNbr, String checkDt, char checkType, String userId, char chkCleared, String reconDts,
			String module) {
		this.id = id;
		this.empNbr = empNbr;
		this.dtOfPay = dtOfPay;
		this.dedCd = dedCd;
		this.dedAmt = dedAmt;
		this.vendorNbr = vendorNbr;
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
		this.indivSumFlg = indivSumFlg;
		this.caseNbr = caseNbr;
		this.causeNbr = causeNbr;
		this.liabTyp = liabTyp;
		this.chkNbr = chkNbr;
		this.checkDt = checkDt;
		this.checkType = checkType;
		this.userId = userId;
		this.chkCleared = chkCleared;
		this.reconDts = reconDts;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "dts", column = @Column(name = "DTS", nullable = false, length = 16)),
			@AttributeOverride(name = "seqNbr", column = @Column(name = "SEQ_NBR", nullable = false, length = 6)) })
	public BhrTransferTransId getId() {
		return this.id;
	}

	public void setId(BhrTransferTransId id) {
		this.id = id;
	}

	@Column(name = "EMP_NBR", nullable = false, length = 6)
	public String getEmpNbr() {
		return this.empNbr;
	}

	public void setEmpNbr(String empNbr) {
		this.empNbr = empNbr;
	}

	@Column(name = "DT_OF_PAY", nullable = false, length = 8)
	public String getDtOfPay() {
		return this.dtOfPay;
	}

	public void setDtOfPay(String dtOfPay) {
		this.dtOfPay = dtOfPay;
	}

	@Column(name = "DED_CD", nullable = false, length = 3)
	public String getDedCd() {
		return this.dedCd;
	}

	public void setDedCd(String dedCd) {
		this.dedCd = dedCd;
	}

	@Column(name = "DED_AMT", nullable = false, precision = 9)
	public BigDecimal getDedAmt() {
		return this.dedAmt;
	}

	public void setDedAmt(BigDecimal dedAmt) {
		this.dedAmt = dedAmt;
	}

	@Column(name = "VENDOR_NBR", nullable = false, length = 5)
	public String getVendorNbr() {
		return this.vendorNbr;
	}

	public void setVendorNbr(String vendorNbr) {
		this.vendorNbr = vendorNbr;
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

	@Column(name = "INDIV_SUM_FLG", nullable = false, length = 1)
	public char getIndivSumFlg() {
		return this.indivSumFlg;
	}

	public void setIndivSumFlg(char indivSumFlg) {
		this.indivSumFlg = indivSumFlg;
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

	@Column(name = "LIAB_TYP", nullable = false, length = 1)
	public char getLiabTyp() {
		return this.liabTyp;
	}

	public void setLiabTyp(char liabTyp) {
		this.liabTyp = liabTyp;
	}

	@Column(name = "CHK_NBR", nullable = false, length = 6)
	public String getChkNbr() {
		return this.chkNbr;
	}

	public void setChkNbr(String chkNbr) {
		this.chkNbr = chkNbr;
	}

	@Column(name = "CHECK_DT", nullable = false, length = 8)
	public String getCheckDt() {
		return this.checkDt;
	}

	public void setCheckDt(String checkDt) {
		this.checkDt = checkDt;
	}

	@Column(name = "CHECK_TYPE", nullable = false, length = 1)
	public char getCheckType() {
		return this.checkType;
	}

	public void setCheckType(char checkType) {
		this.checkType = checkType;
	}

	@Column(name = "USER_ID", nullable = false, length = 12)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "CHK_CLEARED", nullable = false, length = 1)
	public char getChkCleared() {
		return this.chkCleared;
	}

	public void setChkCleared(char chkCleared) {
		this.chkCleared = chkCleared;
	}

	@Column(name = "RECON_DTS", nullable = false, length = 16)
	public String getReconDts() {
		return this.reconDts;
	}

	public void setReconDts(String reconDts) {
		this.reconDts = reconDts;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
