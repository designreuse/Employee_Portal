package com.esc20.model;
// Generated Jan 4, 2019 3:46:11 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrSubLv generated by hbm2java
 */
@Entity
@Table(name = "BHR_SUB_LV", schema = "rsccc", catalog = "rsccc")
public class BhrSubLv implements java.io.Serializable {

	private BhrSubLvId id;
	private BigDecimal teachLvUnitsUsed;
	private char tmOfDay;
	private char wrkComp;
	private String subTyp;
	private String campusId;
	private char dept;
	private String trsGrantCd;
	private BigDecimal payAmt;
	private String dtCreate;
	private String dtLUpdate;
	private String absRsn;
	private String dtOfAbs;
	private String userId;
	private char taxedBenefitFlg;
	private char expense373;
	private String processDt;
	private BigDecimal unitsPerDay;
	private String module;
	private BigDecimal actHrs;
	private String actDt;
	private String lvTyp;

	public BhrSubLv() {
	}

	public BhrSubLv(BhrSubLvId id, BigDecimal teachLvUnitsUsed, char tmOfDay, char wrkComp, String subTyp,
			String campusId, char dept, String trsGrantCd, BigDecimal payAmt, String dtCreate, String dtLUpdate,
			String absRsn, String dtOfAbs, String userId, char taxedBenefitFlg, char expense373, String processDt,
			BigDecimal unitsPerDay, String module, BigDecimal actHrs, String actDt, String lvTyp) {
		this.id = id;
		this.teachLvUnitsUsed = teachLvUnitsUsed;
		this.tmOfDay = tmOfDay;
		this.wrkComp = wrkComp;
		this.subTyp = subTyp;
		this.campusId = campusId;
		this.dept = dept;
		this.trsGrantCd = trsGrantCd;
		this.payAmt = payAmt;
		this.dtCreate = dtCreate;
		this.dtLUpdate = dtLUpdate;
		this.absRsn = absRsn;
		this.dtOfAbs = dtOfAbs;
		this.userId = userId;
		this.taxedBenefitFlg = taxedBenefitFlg;
		this.expense373 = expense373;
		this.processDt = processDt;
		this.unitsPerDay = unitsPerDay;
		this.module = module;
		this.actHrs = actHrs;
		this.actDt = actDt;
		this.lvTyp = lvTyp;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "teachPayFreq", column = @Column(name = "TEACH_PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "teachEmpNbr", column = @Column(name = "TEACH_EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "teachDtOfPay", column = @Column(name = "TEACH_DT_OF_PAY", nullable = false, length = 8)),
			@AttributeOverride(name = "teachLvSeq", column = @Column(name = "TEACH_LV_SEQ", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "subPayFreq", column = @Column(name = "SUB_PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "subEmpNbr", column = @Column(name = "SUB_EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "fund", column = @Column(name = "FUND", nullable = false, length = 3)),
			@AttributeOverride(name = "func", column = @Column(name = "FUNC", nullable = false, length = 2)),
			@AttributeOverride(name = "obj", column = @Column(name = "OBJ", nullable = false, length = 4)),
			@AttributeOverride(name = "sobj", column = @Column(name = "SOBJ", nullable = false, length = 2)),
			@AttributeOverride(name = "org", column = @Column(name = "ORG", nullable = false, length = 3)),
			@AttributeOverride(name = "fsclYr", column = @Column(name = "FSCL_YR", nullable = false, length = 1)),
			@AttributeOverride(name = "pgm", column = @Column(name = "PGM", nullable = false, length = 2)),
			@AttributeOverride(name = "edSpan", column = @Column(name = "ED_SPAN", nullable = false, length = 1)),
			@AttributeOverride(name = "projDtl", column = @Column(name = "PROJ_DTL", nullable = false, length = 2)),
			@AttributeOverride(name = "subDtOfPay", column = @Column(name = "SUB_DT_OF_PAY", nullable = false, length = 8)),
			@AttributeOverride(name = "glFileId", column = @Column(name = "GL_FILE_ID", nullable = false, length = 1)),
			@AttributeOverride(name = "suppSeqNbr", column = @Column(name = "SUPP_SEQ_NBR", nullable = false, length = 5)),
			@AttributeOverride(name = "suppDts", column = @Column(name = "SUPP_DTS", nullable = false, length = 16)),
			@AttributeOverride(name = "suppDtOfPay", column = @Column(name = "SUPP_DT_OF_PAY", nullable = false, length = 8)),
			@AttributeOverride(name = "suppEmpNbr", column = @Column(name = "SUPP_EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "suppPayFreq", column = @Column(name = "SUPP_PAY_FREQ", nullable = false, length = 1)) })
	public BhrSubLvId getId() {
		return this.id;
	}

	public void setId(BhrSubLvId id) {
		this.id = id;
	}

	@Column(name = "TEACH_LV_UNITS_USED", nullable = false, precision = 7, scale = 3)
	public BigDecimal getTeachLvUnitsUsed() {
		return this.teachLvUnitsUsed;
	}

	public void setTeachLvUnitsUsed(BigDecimal teachLvUnitsUsed) {
		this.teachLvUnitsUsed = teachLvUnitsUsed;
	}

	@Column(name = "TM_OF_DAY", nullable = false, length = 1)
	public char getTmOfDay() {
		return this.tmOfDay;
	}

	public void setTmOfDay(char tmOfDay) {
		this.tmOfDay = tmOfDay;
	}

	@Column(name = "WRK_COMP", nullable = false, length = 1)
	public char getWrkComp() {
		return this.wrkComp;
	}

	public void setWrkComp(char wrkComp) {
		this.wrkComp = wrkComp;
	}

	@Column(name = "SUB_TYP", nullable = false, length = 2)
	public String getSubTyp() {
		return this.subTyp;
	}

	public void setSubTyp(String subTyp) {
		this.subTyp = subTyp;
	}

	@Column(name = "CAMPUS_ID", nullable = false, length = 3)
	public String getCampusId() {
		return this.campusId;
	}

	public void setCampusId(String campusId) {
		this.campusId = campusId;
	}

	@Column(name = "DEPT", nullable = false, length = 1)
	public char getDept() {
		return this.dept;
	}

	public void setDept(char dept) {
		this.dept = dept;
	}

	@Column(name = "TRS_GRANT_CD", nullable = false, length = 2)
	public String getTrsGrantCd() {
		return this.trsGrantCd;
	}

	public void setTrsGrantCd(String trsGrantCd) {
		this.trsGrantCd = trsGrantCd;
	}

	@Column(name = "PAY_AMT", nullable = false, precision = 5)
	public BigDecimal getPayAmt() {
		return this.payAmt;
	}

	public void setPayAmt(BigDecimal payAmt) {
		this.payAmt = payAmt;
	}

	@Column(name = "DT_CREATE", nullable = false, length = 8)
	public String getDtCreate() {
		return this.dtCreate;
	}

	public void setDtCreate(String dtCreate) {
		this.dtCreate = dtCreate;
	}

	@Column(name = "DT_L_UPDATE", nullable = false, length = 8)
	public String getDtLUpdate() {
		return this.dtLUpdate;
	}

	public void setDtLUpdate(String dtLUpdate) {
		this.dtLUpdate = dtLUpdate;
	}

	@Column(name = "ABS_RSN", nullable = false, length = 2)
	public String getAbsRsn() {
		return this.absRsn;
	}

	public void setAbsRsn(String absRsn) {
		this.absRsn = absRsn;
	}

	@Column(name = "DT_OF_ABS", nullable = false, length = 8)
	public String getDtOfAbs() {
		return this.dtOfAbs;
	}

	public void setDtOfAbs(String dtOfAbs) {
		this.dtOfAbs = dtOfAbs;
	}

	@Column(name = "USER_ID", nullable = false, length = 12)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "TAXED_BENEFIT_FLG", nullable = false, length = 1)
	public char getTaxedBenefitFlg() {
		return this.taxedBenefitFlg;
	}

	public void setTaxedBenefitFlg(char taxedBenefitFlg) {
		this.taxedBenefitFlg = taxedBenefitFlg;
	}

	@Column(name = "EXPENSE_373", nullable = false, length = 1)
	public char getExpense373() {
		return this.expense373;
	}

	public void setExpense373(char expense373) {
		this.expense373 = expense373;
	}

	@Column(name = "PROCESS_DT", nullable = false, length = 8)
	public String getProcessDt() {
		return this.processDt;
	}

	public void setProcessDt(String processDt) {
		this.processDt = processDt;
	}

	@Column(name = "UNITS_PER_DAY", nullable = false, precision = 3, scale = 1)
	public BigDecimal getUnitsPerDay() {
		return this.unitsPerDay;
	}

	public void setUnitsPerDay(BigDecimal unitsPerDay) {
		this.unitsPerDay = unitsPerDay;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Column(name = "ACT_HRS", nullable = false, precision = 5)
	public BigDecimal getActHrs() {
		return this.actHrs;
	}

	public void setActHrs(BigDecimal actHrs) {
		this.actHrs = actHrs;
	}

	@Column(name = "ACT_DT", nullable = false, length = 8)
	public String getActDt() {
		return this.actDt;
	}

	public void setActDt(String actDt) {
		this.actDt = actDt;
	}

	@Column(name = "LV_TYP", nullable = false, length = 2)
	public String getLvTyp() {
		return this.lvTyp;
	}

	public void setLvTyp(String lvTyp) {
		this.lvTyp = lvTyp;
	}

}
