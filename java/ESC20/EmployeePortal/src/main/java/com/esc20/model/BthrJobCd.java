package com.esc20.model;
// Generated Jan 4, 2019 3:52:00 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BthrJobCd generated by hbm2java
 */
@Entity
@Table(name = "BTHR_JOB_CD", schema = "rsccc", catalog = "rsccc")
public class BthrJobCd implements java.io.Serializable {

	private BthrJobCdId id;
	private String jobCdDescr;
	private char grpCd;
	private String eeoc;
	private String defltDistr;
	private char salaryConcept;
	private String trs118IssueUnit;
	private BigDecimal avgSal;
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
	private char incrPayStp;
	private char fspSalClasCd;
	private char accruCd;
	private char wrkComp;
	private String module;
	private byte fteHrs;

	public BthrJobCd() {
	}

	public BthrJobCd(BthrJobCdId id, String jobCdDescr, char grpCd, String eeoc, String defltDistr, char salaryConcept,
			String trs118IssueUnit, BigDecimal avgSal, char glFileId, String fund, String func, String obj, String sobj,
			String org, char fsclYr, String pgm, char edSpan, String projDtl, char incrPayStp, char fspSalClasCd,
			char accruCd, char wrkComp, String module, byte fteHrs) {
		this.id = id;
		this.jobCdDescr = jobCdDescr;
		this.grpCd = grpCd;
		this.eeoc = eeoc;
		this.defltDistr = defltDistr;
		this.salaryConcept = salaryConcept;
		this.trs118IssueUnit = trs118IssueUnit;
		this.avgSal = avgSal;
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
		this.incrPayStp = incrPayStp;
		this.fspSalClasCd = fspSalClasCd;
		this.accruCd = accruCd;
		this.wrkComp = wrkComp;
		this.module = module;
		this.fteHrs = fteHrs;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "jobCd", column = @Column(name = "JOB_CD", nullable = false, length = 4)),
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)) })
	public BthrJobCdId getId() {
		return this.id;
	}

	public void setId(BthrJobCdId id) {
		this.id = id;
	}

	@Column(name = "JOB_CD_DESCR", nullable = false, length = 30)
	public String getJobCdDescr() {
		return this.jobCdDescr;
	}

	public void setJobCdDescr(String jobCdDescr) {
		this.jobCdDescr = jobCdDescr;
	}

	@Column(name = "GRP_CD", nullable = false, length = 1)
	public char getGrpCd() {
		return this.grpCd;
	}

	public void setGrpCd(char grpCd) {
		this.grpCd = grpCd;
	}

	@Column(name = "EEOC", nullable = false, length = 2)
	public String getEeoc() {
		return this.eeoc;
	}

	public void setEeoc(String eeoc) {
		this.eeoc = eeoc;
	}

	@Column(name = "DEFLT_DISTR", nullable = false, length = 20)
	public String getDefltDistr() {
		return this.defltDistr;
	}

	public void setDefltDistr(String defltDistr) {
		this.defltDistr = defltDistr;
	}

	@Column(name = "SALARY_CONCEPT", nullable = false, length = 1)
	public char getSalaryConcept() {
		return this.salaryConcept;
	}

	public void setSalaryConcept(char salaryConcept) {
		this.salaryConcept = salaryConcept;
	}

	@Column(name = "TRS_118_ISSUE_UNIT", nullable = false, length = 3)
	public String getTrs118IssueUnit() {
		return this.trs118IssueUnit;
	}

	public void setTrs118IssueUnit(String trs118IssueUnit) {
		this.trs118IssueUnit = trs118IssueUnit;
	}

	@Column(name = "AVG_SAL", nullable = false, precision = 9)
	public BigDecimal getAvgSal() {
		return this.avgSal;
	}

	public void setAvgSal(BigDecimal avgSal) {
		this.avgSal = avgSal;
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

	@Column(name = "INCR_PAY_STP", nullable = false, length = 1)
	public char getIncrPayStp() {
		return this.incrPayStp;
	}

	public void setIncrPayStp(char incrPayStp) {
		this.incrPayStp = incrPayStp;
	}

	@Column(name = "FSP_SAL_CLAS_CD", nullable = false, length = 1)
	public char getFspSalClasCd() {
		return this.fspSalClasCd;
	}

	public void setFspSalClasCd(char fspSalClasCd) {
		this.fspSalClasCd = fspSalClasCd;
	}

	@Column(name = "ACCRU_CD", nullable = false, length = 1)
	public char getAccruCd() {
		return this.accruCd;
	}

	public void setAccruCd(char accruCd) {
		this.accruCd = accruCd;
	}

	@Column(name = "WRK_COMP", nullable = false, length = 1)
	public char getWrkComp() {
		return this.wrkComp;
	}

	public void setWrkComp(char wrkComp) {
		this.wrkComp = wrkComp;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Column(name = "FTE_HRS", nullable = false, precision = 2, scale = 0)
	public byte getFteHrs() {
		return this.fteHrs;
	}

	public void setFteHrs(byte fteHrs) {
		this.fteHrs = fteHrs;
	}

}