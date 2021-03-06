package com.esc20.model;
// Generated Jan 4, 2019 3:44:27 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrPayDistrBkupPaycalcs5Id generated by hbm2java
 */
@Embeddable
public class BhrPayDistrBkupPaycalcs5Id implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private char cyrNyrFlg;
	private char payFreq;
	private String empNbr;
	private String jobCd;
	private short distrSeq;
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

	public BhrPayDistrBkupPaycalcs5Id() {
	}

	public BhrPayDistrBkupPaycalcs5Id(char cyrNyrFlg, char payFreq, String empNbr, String jobCd, short distrSeq,
			char acctTyp, String payActy, char wrkComp, char glFileId, String fund, String func, String obj,
			String sobj, String org, char fsclYr, String pgm, char edSpan, String projDtl, BigDecimal acctAmt,
			BigDecimal acctPct, short acctPymts, String trsGrantCd, String extraDutyCd, char expense373,
			char contribAcctFlg, short acctSeq, char perforPay, String module) {
		this.cyrNyrFlg = cyrNyrFlg;
		this.payFreq = payFreq;
		this.empNbr = empNbr;
		this.jobCd = jobCd;
		this.distrSeq = distrSeq;
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

	@Column(name = "CYR_NYR_FLG", nullable = false, length = 1)
	public char getCyrNyrFlg() {
		return this.cyrNyrFlg;
	}

	public void setCyrNyrFlg(char cyrNyrFlg) {
		this.cyrNyrFlg = cyrNyrFlg;
	}

	@Column(name = "PAY_FREQ", nullable = false, length = 1)
	public char getPayFreq() {
		return this.payFreq;
	}

	public void setPayFreq(char payFreq) {
		this.payFreq = payFreq;
	}

	@Column(name = "EMP_NBR", nullable = false, length = 6)
	public String getEmpNbr() {
		return this.empNbr;
	}

	public void setEmpNbr(String empNbr) {
		this.empNbr = empNbr;
	}

	@Column(name = "JOB_CD", nullable = false, length = 4)
	public String getJobCd() {
		return this.jobCd;
	}

	public void setJobCd(String jobCd) {
		this.jobCd = jobCd;
	}

	@Column(name = "DISTR_SEQ", nullable = false, precision = 3, scale = 0)
	public short getDistrSeq() {
		return this.distrSeq;
	}

	public void setDistrSeq(short distrSeq) {
		this.distrSeq = distrSeq;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrPayDistrBkupPaycalcs5Id))
			return false;
		BhrPayDistrBkupPaycalcs5Id castOther = (BhrPayDistrBkupPaycalcs5Id) other;

		return (this.getCyrNyrFlg() == castOther.getCyrNyrFlg()) && (this.getPayFreq() == castOther.getPayFreq())
				&& ((this.getEmpNbr() == castOther.getEmpNbr()) || (this.getEmpNbr() != null
						&& castOther.getEmpNbr() != null && this.getEmpNbr().equals(castOther.getEmpNbr())))
				&& ((this.getJobCd() == castOther.getJobCd()) || (this.getJobCd() != null
						&& castOther.getJobCd() != null && this.getJobCd().equals(castOther.getJobCd())))
				&& (this.getDistrSeq() == castOther.getDistrSeq()) && (this.getAcctTyp() == castOther.getAcctTyp())
				&& ((this.getPayActy() == castOther.getPayActy()) || (this.getPayActy() != null
						&& castOther.getPayActy() != null && this.getPayActy().equals(castOther.getPayActy())))
				&& (this.getWrkComp() == castOther.getWrkComp()) && (this.getGlFileId() == castOther.getGlFileId())
				&& ((this.getFund() == castOther.getFund()) || (this.getFund() != null && castOther.getFund() != null
						&& this.getFund().equals(castOther.getFund())))
				&& ((this.getFunc() == castOther.getFunc()) || (this.getFunc() != null && castOther.getFunc() != null
						&& this.getFunc().equals(castOther.getFunc())))
				&& ((this.getObj() == castOther.getObj()) || (this.getObj() != null && castOther.getObj() != null
						&& this.getObj().equals(castOther.getObj())))
				&& ((this.getSobj() == castOther.getSobj()) || (this.getSobj() != null && castOther.getSobj() != null
						&& this.getSobj().equals(castOther.getSobj())))
				&& ((this.getOrg() == castOther.getOrg()) || (this.getOrg() != null
						&& castOther.getOrg() != null && this.getOrg().equals(castOther.getOrg())))
				&& (this.getFsclYr() == castOther.getFsclYr())
				&& ((this.getPgm() == castOther.getPgm()) || (this.getPgm() != null
						&& castOther.getPgm() != null && this.getPgm().equals(castOther.getPgm())))
				&& (this.getEdSpan() == castOther.getEdSpan())
				&& ((this.getProjDtl() == castOther.getProjDtl()) || (this.getProjDtl() != null
						&& castOther.getProjDtl() != null && this.getProjDtl().equals(castOther.getProjDtl())))
				&& ((this.getAcctAmt() == castOther.getAcctAmt()) || (this.getAcctAmt() != null
						&& castOther.getAcctAmt() != null && this.getAcctAmt().equals(castOther.getAcctAmt())))
				&& ((this.getAcctPct() == castOther.getAcctPct()) || (this.getAcctPct() != null
						&& castOther.getAcctPct() != null && this.getAcctPct().equals(castOther.getAcctPct())))
				&& (this.getAcctPymts() == castOther.getAcctPymts())
				&& ((this.getTrsGrantCd() == castOther.getTrsGrantCd()) || (this.getTrsGrantCd() != null
						&& castOther.getTrsGrantCd() != null && this.getTrsGrantCd().equals(castOther.getTrsGrantCd())))
				&& ((this.getExtraDutyCd() == castOther.getExtraDutyCd())
						|| (this.getExtraDutyCd() != null && castOther.getExtraDutyCd() != null
								&& this.getExtraDutyCd().equals(castOther.getExtraDutyCd())))
				&& (this.getExpense373() == castOther.getExpense373())
				&& (this.getContribAcctFlg() == castOther.getContribAcctFlg())
				&& (this.getAcctSeq() == castOther.getAcctSeq()) && (this.getPerforPay() == castOther.getPerforPay())
				&& ((this.getModule() == castOther.getModule()) || (this.getModule() != null
						&& castOther.getModule() != null && this.getModule().equals(castOther.getModule())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + this.getPayFreq();
		result = 37 * result + (getEmpNbr() == null ? 0 : this.getEmpNbr().hashCode());
		result = 37 * result + (getJobCd() == null ? 0 : this.getJobCd().hashCode());
		result = 37 * result + this.getDistrSeq();
		result = 37 * result + this.getAcctTyp();
		result = 37 * result + (getPayActy() == null ? 0 : this.getPayActy().hashCode());
		result = 37 * result + this.getWrkComp();
		result = 37 * result + this.getGlFileId();
		result = 37 * result + (getFund() == null ? 0 : this.getFund().hashCode());
		result = 37 * result + (getFunc() == null ? 0 : this.getFunc().hashCode());
		result = 37 * result + (getObj() == null ? 0 : this.getObj().hashCode());
		result = 37 * result + (getSobj() == null ? 0 : this.getSobj().hashCode());
		result = 37 * result + (getOrg() == null ? 0 : this.getOrg().hashCode());
		result = 37 * result + this.getFsclYr();
		result = 37 * result + (getPgm() == null ? 0 : this.getPgm().hashCode());
		result = 37 * result + this.getEdSpan();
		result = 37 * result + (getProjDtl() == null ? 0 : this.getProjDtl().hashCode());
		result = 37 * result + (getAcctAmt() == null ? 0 : this.getAcctAmt().hashCode());
		result = 37 * result + (getAcctPct() == null ? 0 : this.getAcctPct().hashCode());
		result = 37 * result + this.getAcctPymts();
		result = 37 * result + (getTrsGrantCd() == null ? 0 : this.getTrsGrantCd().hashCode());
		result = 37 * result + (getExtraDutyCd() == null ? 0 : this.getExtraDutyCd().hashCode());
		result = 37 * result + this.getExpense373();
		result = 37 * result + this.getContribAcctFlg();
		result = 37 * result + this.getAcctSeq();
		result = 37 * result + this.getPerforPay();
		result = 37 * result + (getModule() == null ? 0 : this.getModule().hashCode());
		return result;
	}

}
