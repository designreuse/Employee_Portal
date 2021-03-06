package com.esc20.model;
// Generated Jan 4, 2019 3:42:57 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BhrOptions generated by hbm2java
 */
@Entity
@Table(name = "BHR_OPTIONS", schema = "rsccc", catalog = "rsccc")
public class BhrOptions implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private String distId;
	private String trsDistId;
	private String twcId;
	private char useDirectDeposit;
	private char calcAccruSalary;
	private char fundToTrsGrant;
	private BigDecimal trsCei;
	private char numericChkAmt;
	private char distryByAmtPer;
	private char reducFicaGross;
	private char autoPayrate;
	private char autoDaily;
	private char autoAbsence;
	private char autoAccrual;
	private char autoOvertime;
	private char autoAssignEmp;
	private char lvEarnedUsed;
	private BigDecimal standardHrs;
	private String lvTypSick;
	private String lvTypPerson;
	private char sumBenefits;
	private BigDecimal maxGross;
	private char expenseEmplrContrib;
	private char glFileId;
	private String ovtObjPro;
	private String ovtObjPara;
	private String ovtObjOther;
	private String nxtAvailEmpNbr;
	private String payClearingFund;
	private char payClearingFundYr;
	private BigDecimal teaHlthInsContribPay4;
	private String teaHlthInsContribObjPay4;
	private String teaHlthInsContribSobjPay4;
	private BigDecimal teaHlthInsContribPay5;
	private String teaHlthInsContribObjPay5;
	private String teaHlthInsContribSobjPay5;
	private char automateTraqsRec;
	private String automateTrsRptYr;
	private String automateTrsRptMon;
	private String teaHealthInsContribDedCd;
	private BigDecimal teaHlthInsContribPay6;
	private String teaHlthInsContribObjPay6;
	private String teaHlthInsContribSobjPay6;
	private String trsSupplCompFund;
	private String trsSupplCompFunc;
	private String trsSupplCompObj;
	private String trsSupplCompSobj;
	private String trsSupplCompOrg;
	private char trsSupplCompFsclYr;
	private String trsSupplCompPgm;
	private char trsSupplCompEdSpan;
	private String trsSupplCompProjDtl;
	private char trsSupplCompWrkComp;
	private BigDecimal supplTaxRate;
	private String emplrContribFund;
	private String emplrContribFunc;
	private String emplrContribObj;
	private String emplrContribSobj;
	private String emplrContribOrg;
	private char emplrContribFsclYr;
	private String emplrContribPgm;
	private char emplrContribEdSpan;
	private String emplrContribProjDtl;
	private String firstPaydateSchYrPay4;
	private String firstPaydateSchYrPay5;
	private String firstPaydateSchYrPay6;
	private String peimsCdYr;
	private char nyAutomateTraqsRec;
	private String nyAutomateTrsRptYr;
	private String nyAutomateTrsRptMon;
	private String nyTrsOnbehalfAcctCd;
	private char simUpdt;
	private char nyExclTrsOnbehalf;
	private String module;
	private char eftOpt;
	private char teamPaydtTrsMonActDt;
	private char teamActHrsSchedHrs;

	public BhrOptions() {
	}

	public BhrOptions(String distId, String trsDistId, String twcId, char useDirectDeposit, char calcAccruSalary,
			char fundToTrsGrant, BigDecimal trsCei, char numericChkAmt, char distryByAmtPer, char reducFicaGross,
			char autoPayrate, char autoDaily, char autoAbsence, char autoAccrual, char autoOvertime, char autoAssignEmp,
			char lvEarnedUsed, BigDecimal standardHrs, String lvTypSick, String lvTypPerson, char sumBenefits,
			BigDecimal maxGross, char expenseEmplrContrib, char glFileId, String ovtObjPro, String ovtObjPara,
			String ovtObjOther, String nxtAvailEmpNbr, String payClearingFund, char payClearingFundYr,
			BigDecimal teaHlthInsContribPay4, String teaHlthInsContribObjPay4, String teaHlthInsContribSobjPay4,
			BigDecimal teaHlthInsContribPay5, String teaHlthInsContribObjPay5, String teaHlthInsContribSobjPay5,
			char automateTraqsRec, String automateTrsRptYr, String automateTrsRptMon, String teaHealthInsContribDedCd,
			BigDecimal teaHlthInsContribPay6, String teaHlthInsContribObjPay6, String teaHlthInsContribSobjPay6,
			String trsSupplCompFund, String trsSupplCompFunc, String trsSupplCompObj, String trsSupplCompSobj,
			String trsSupplCompOrg, char trsSupplCompFsclYr, String trsSupplCompPgm, char trsSupplCompEdSpan,
			String trsSupplCompProjDtl, char trsSupplCompWrkComp, BigDecimal supplTaxRate, String emplrContribFund,
			String emplrContribFunc, String emplrContribObj, String emplrContribSobj, String emplrContribOrg,
			char emplrContribFsclYr, String emplrContribPgm, char emplrContribEdSpan, String emplrContribProjDtl,
			String firstPaydateSchYrPay4, String firstPaydateSchYrPay5, String firstPaydateSchYrPay6, String peimsCdYr,
			char nyAutomateTraqsRec, String nyAutomateTrsRptYr, String nyAutomateTrsRptMon, String nyTrsOnbehalfAcctCd,
			char simUpdt, char nyExclTrsOnbehalf, String module, char eftOpt, char teamPaydtTrsMonActDt,
			char teamActHrsSchedHrs) {
		this.distId = distId;
		this.trsDistId = trsDistId;
		this.twcId = twcId;
		this.useDirectDeposit = useDirectDeposit;
		this.calcAccruSalary = calcAccruSalary;
		this.fundToTrsGrant = fundToTrsGrant;
		this.trsCei = trsCei;
		this.numericChkAmt = numericChkAmt;
		this.distryByAmtPer = distryByAmtPer;
		this.reducFicaGross = reducFicaGross;
		this.autoPayrate = autoPayrate;
		this.autoDaily = autoDaily;
		this.autoAbsence = autoAbsence;
		this.autoAccrual = autoAccrual;
		this.autoOvertime = autoOvertime;
		this.autoAssignEmp = autoAssignEmp;
		this.lvEarnedUsed = lvEarnedUsed;
		this.standardHrs = standardHrs;
		this.lvTypSick = lvTypSick;
		this.lvTypPerson = lvTypPerson;
		this.sumBenefits = sumBenefits;
		this.maxGross = maxGross;
		this.expenseEmplrContrib = expenseEmplrContrib;
		this.glFileId = glFileId;
		this.ovtObjPro = ovtObjPro;
		this.ovtObjPara = ovtObjPara;
		this.ovtObjOther = ovtObjOther;
		this.nxtAvailEmpNbr = nxtAvailEmpNbr;
		this.payClearingFund = payClearingFund;
		this.payClearingFundYr = payClearingFundYr;
		this.teaHlthInsContribPay4 = teaHlthInsContribPay4;
		this.teaHlthInsContribObjPay4 = teaHlthInsContribObjPay4;
		this.teaHlthInsContribSobjPay4 = teaHlthInsContribSobjPay4;
		this.teaHlthInsContribPay5 = teaHlthInsContribPay5;
		this.teaHlthInsContribObjPay5 = teaHlthInsContribObjPay5;
		this.teaHlthInsContribSobjPay5 = teaHlthInsContribSobjPay5;
		this.automateTraqsRec = automateTraqsRec;
		this.automateTrsRptYr = automateTrsRptYr;
		this.automateTrsRptMon = automateTrsRptMon;
		this.teaHealthInsContribDedCd = teaHealthInsContribDedCd;
		this.teaHlthInsContribPay6 = teaHlthInsContribPay6;
		this.teaHlthInsContribObjPay6 = teaHlthInsContribObjPay6;
		this.teaHlthInsContribSobjPay6 = teaHlthInsContribSobjPay6;
		this.trsSupplCompFund = trsSupplCompFund;
		this.trsSupplCompFunc = trsSupplCompFunc;
		this.trsSupplCompObj = trsSupplCompObj;
		this.trsSupplCompSobj = trsSupplCompSobj;
		this.trsSupplCompOrg = trsSupplCompOrg;
		this.trsSupplCompFsclYr = trsSupplCompFsclYr;
		this.trsSupplCompPgm = trsSupplCompPgm;
		this.trsSupplCompEdSpan = trsSupplCompEdSpan;
		this.trsSupplCompProjDtl = trsSupplCompProjDtl;
		this.trsSupplCompWrkComp = trsSupplCompWrkComp;
		this.supplTaxRate = supplTaxRate;
		this.emplrContribFund = emplrContribFund;
		this.emplrContribFunc = emplrContribFunc;
		this.emplrContribObj = emplrContribObj;
		this.emplrContribSobj = emplrContribSobj;
		this.emplrContribOrg = emplrContribOrg;
		this.emplrContribFsclYr = emplrContribFsclYr;
		this.emplrContribPgm = emplrContribPgm;
		this.emplrContribEdSpan = emplrContribEdSpan;
		this.emplrContribProjDtl = emplrContribProjDtl;
		this.firstPaydateSchYrPay4 = firstPaydateSchYrPay4;
		this.firstPaydateSchYrPay5 = firstPaydateSchYrPay5;
		this.firstPaydateSchYrPay6 = firstPaydateSchYrPay6;
		this.peimsCdYr = peimsCdYr;
		this.nyAutomateTraqsRec = nyAutomateTraqsRec;
		this.nyAutomateTrsRptYr = nyAutomateTrsRptYr;
		this.nyAutomateTrsRptMon = nyAutomateTrsRptMon;
		this.nyTrsOnbehalfAcctCd = nyTrsOnbehalfAcctCd;
		this.simUpdt = simUpdt;
		this.nyExclTrsOnbehalf = nyExclTrsOnbehalf;
		this.module = module;
		this.eftOpt = eftOpt;
		this.teamPaydtTrsMonActDt = teamPaydtTrsMonActDt;
		this.teamActHrsSchedHrs = teamActHrsSchedHrs;
	}

	@Id

	@Column(name = "DIST_ID", nullable = false, length = 6)
	public String getDistId() {
		return this.distId;
	}

	public void setDistId(String distId) {
		this.distId = distId;
	}

	@Column(name = "TRS_DIST_ID", nullable = false, length = 4)
	public String getTrsDistId() {
		return this.trsDistId;
	}

	public void setTrsDistId(String trsDistId) {
		this.trsDistId = trsDistId;
	}

	@Column(name = "TWC_ID", nullable = false, length = 9)
	public String getTwcId() {
		return this.twcId;
	}

	public void setTwcId(String twcId) {
		this.twcId = twcId;
	}

	@Column(name = "USE_DIRECT_DEPOSIT", nullable = false, length = 1)
	public char getUseDirectDeposit() {
		return this.useDirectDeposit;
	}

	public void setUseDirectDeposit(char useDirectDeposit) {
		this.useDirectDeposit = useDirectDeposit;
	}

	@Column(name = "CALC_ACCRU_SALARY", nullable = false, length = 1)
	public char getCalcAccruSalary() {
		return this.calcAccruSalary;
	}

	public void setCalcAccruSalary(char calcAccruSalary) {
		this.calcAccruSalary = calcAccruSalary;
	}

	@Column(name = "FUND_TO_TRS_GRANT", nullable = false, length = 1)
	public char getFundToTrsGrant() {
		return this.fundToTrsGrant;
	}

	public void setFundToTrsGrant(char fundToTrsGrant) {
		this.fundToTrsGrant = fundToTrsGrant;
	}

	@Column(name = "TRS_CEI", nullable = false, precision = 5, scale = 4)
	public BigDecimal getTrsCei() {
		return this.trsCei;
	}

	public void setTrsCei(BigDecimal trsCei) {
		this.trsCei = trsCei;
	}

	@Column(name = "NUMERIC_CHK_AMT", nullable = false, length = 1)
	public char getNumericChkAmt() {
		return this.numericChkAmt;
	}

	public void setNumericChkAmt(char numericChkAmt) {
		this.numericChkAmt = numericChkAmt;
	}

	@Column(name = "DISTRY_BY_AMT_PER", nullable = false, length = 1)
	public char getDistryByAmtPer() {
		return this.distryByAmtPer;
	}

	public void setDistryByAmtPer(char distryByAmtPer) {
		this.distryByAmtPer = distryByAmtPer;
	}

	@Column(name = "REDUC_FICA_GROSS", nullable = false, length = 1)
	public char getReducFicaGross() {
		return this.reducFicaGross;
	}

	public void setReducFicaGross(char reducFicaGross) {
		this.reducFicaGross = reducFicaGross;
	}

	@Column(name = "AUTO_PAYRATE", nullable = false, length = 1)
	public char getAutoPayrate() {
		return this.autoPayrate;
	}

	public void setAutoPayrate(char autoPayrate) {
		this.autoPayrate = autoPayrate;
	}

	@Column(name = "AUTO_DAILY", nullable = false, length = 1)
	public char getAutoDaily() {
		return this.autoDaily;
	}

	public void setAutoDaily(char autoDaily) {
		this.autoDaily = autoDaily;
	}

	@Column(name = "AUTO_ABSENCE", nullable = false, length = 1)
	public char getAutoAbsence() {
		return this.autoAbsence;
	}

	public void setAutoAbsence(char autoAbsence) {
		this.autoAbsence = autoAbsence;
	}

	@Column(name = "AUTO_ACCRUAL", nullable = false, length = 1)
	public char getAutoAccrual() {
		return this.autoAccrual;
	}

	public void setAutoAccrual(char autoAccrual) {
		this.autoAccrual = autoAccrual;
	}

	@Column(name = "AUTO_OVERTIME", nullable = false, length = 1)
	public char getAutoOvertime() {
		return this.autoOvertime;
	}

	public void setAutoOvertime(char autoOvertime) {
		this.autoOvertime = autoOvertime;
	}

	@Column(name = "AUTO_ASSIGN_EMP", nullable = false, length = 1)
	public char getAutoAssignEmp() {
		return this.autoAssignEmp;
	}

	public void setAutoAssignEmp(char autoAssignEmp) {
		this.autoAssignEmp = autoAssignEmp;
	}

	@Column(name = "LV_EARNED_USED", nullable = false, length = 1)
	public char getLvEarnedUsed() {
		return this.lvEarnedUsed;
	}

	public void setLvEarnedUsed(char lvEarnedUsed) {
		this.lvEarnedUsed = lvEarnedUsed;
	}

	@Column(name = "STANDARD_HRS", nullable = false, precision = 2, scale = 1)
	public BigDecimal getStandardHrs() {
		return this.standardHrs;
	}

	public void setStandardHrs(BigDecimal standardHrs) {
		this.standardHrs = standardHrs;
	}

	@Column(name = "LV_TYP_SICK", nullable = false, length = 2)
	public String getLvTypSick() {
		return this.lvTypSick;
	}

	public void setLvTypSick(String lvTypSick) {
		this.lvTypSick = lvTypSick;
	}

	@Column(name = "LV_TYP_PERSON", nullable = false, length = 2)
	public String getLvTypPerson() {
		return this.lvTypPerson;
	}

	public void setLvTypPerson(String lvTypPerson) {
		this.lvTypPerson = lvTypPerson;
	}

	@Column(name = "SUM_BENEFITS", nullable = false, length = 1)
	public char getSumBenefits() {
		return this.sumBenefits;
	}

	public void setSumBenefits(char sumBenefits) {
		this.sumBenefits = sumBenefits;
	}

	@Column(name = "MAX_GROSS", nullable = false, precision = 9)
	public BigDecimal getMaxGross() {
		return this.maxGross;
	}

	public void setMaxGross(BigDecimal maxGross) {
		this.maxGross = maxGross;
	}

	@Column(name = "EXPENSE_EMPLR_CONTRIB", nullable = false, length = 1)
	public char getExpenseEmplrContrib() {
		return this.expenseEmplrContrib;
	}

	public void setExpenseEmplrContrib(char expenseEmplrContrib) {
		this.expenseEmplrContrib = expenseEmplrContrib;
	}

	@Column(name = "GL_FILE_ID", nullable = false, length = 1)
	public char getGlFileId() {
		return this.glFileId;
	}

	public void setGlFileId(char glFileId) {
		this.glFileId = glFileId;
	}

	@Column(name = "OVT_OBJ_PRO", nullable = false, length = 4)
	public String getOvtObjPro() {
		return this.ovtObjPro;
	}

	public void setOvtObjPro(String ovtObjPro) {
		this.ovtObjPro = ovtObjPro;
	}

	@Column(name = "OVT_OBJ_PARA", nullable = false, length = 4)
	public String getOvtObjPara() {
		return this.ovtObjPara;
	}

	public void setOvtObjPara(String ovtObjPara) {
		this.ovtObjPara = ovtObjPara;
	}

	@Column(name = "OVT_OBJ_OTHER", nullable = false, length = 4)
	public String getOvtObjOther() {
		return this.ovtObjOther;
	}

	public void setOvtObjOther(String ovtObjOther) {
		this.ovtObjOther = ovtObjOther;
	}

	@Column(name = "NXT_AVAIL_EMP_NBR", nullable = false, length = 6)
	public String getNxtAvailEmpNbr() {
		return this.nxtAvailEmpNbr;
	}

	public void setNxtAvailEmpNbr(String nxtAvailEmpNbr) {
		this.nxtAvailEmpNbr = nxtAvailEmpNbr;
	}

	@Column(name = "PAY_CLEARING_FUND", nullable = false, length = 3)
	public String getPayClearingFund() {
		return this.payClearingFund;
	}

	public void setPayClearingFund(String payClearingFund) {
		this.payClearingFund = payClearingFund;
	}

	@Column(name = "PAY_CLEARING_FUND_YR", nullable = false, length = 1)
	public char getPayClearingFundYr() {
		return this.payClearingFundYr;
	}

	public void setPayClearingFundYr(char payClearingFundYr) {
		this.payClearingFundYr = payClearingFundYr;
	}

	@Column(name = "TEA_HLTH_INS_CONTRIB_PAY4", nullable = false, precision = 9)
	public BigDecimal getTeaHlthInsContribPay4() {
		return this.teaHlthInsContribPay4;
	}

	public void setTeaHlthInsContribPay4(BigDecimal teaHlthInsContribPay4) {
		this.teaHlthInsContribPay4 = teaHlthInsContribPay4;
	}

	@Column(name = "TEA_HLTH_INS_CONTRIB_OBJ_PAY4", nullable = false, length = 4)
	public String getTeaHlthInsContribObjPay4() {
		return this.teaHlthInsContribObjPay4;
	}

	public void setTeaHlthInsContribObjPay4(String teaHlthInsContribObjPay4) {
		this.teaHlthInsContribObjPay4 = teaHlthInsContribObjPay4;
	}

	@Column(name = "TEA_HLTH_INS_CONTRIB_SOBJ_PAY4", nullable = false, length = 2)
	public String getTeaHlthInsContribSobjPay4() {
		return this.teaHlthInsContribSobjPay4;
	}

	public void setTeaHlthInsContribSobjPay4(String teaHlthInsContribSobjPay4) {
		this.teaHlthInsContribSobjPay4 = teaHlthInsContribSobjPay4;
	}

	@Column(name = "TEA_HLTH_INS_CONTRIB_PAY5", nullable = false, precision = 9)
	public BigDecimal getTeaHlthInsContribPay5() {
		return this.teaHlthInsContribPay5;
	}

	public void setTeaHlthInsContribPay5(BigDecimal teaHlthInsContribPay5) {
		this.teaHlthInsContribPay5 = teaHlthInsContribPay5;
	}

	@Column(name = "TEA_HLTH_INS_CONTRIB_OBJ_PAY5", nullable = false, length = 4)
	public String getTeaHlthInsContribObjPay5() {
		return this.teaHlthInsContribObjPay5;
	}

	public void setTeaHlthInsContribObjPay5(String teaHlthInsContribObjPay5) {
		this.teaHlthInsContribObjPay5 = teaHlthInsContribObjPay5;
	}

	@Column(name = "TEA_HLTH_INS_CONTRIB_SOBJ_PAY5", nullable = false, length = 2)
	public String getTeaHlthInsContribSobjPay5() {
		return this.teaHlthInsContribSobjPay5;
	}

	public void setTeaHlthInsContribSobjPay5(String teaHlthInsContribSobjPay5) {
		this.teaHlthInsContribSobjPay5 = teaHlthInsContribSobjPay5;
	}

	@Column(name = "AUTOMATE_TRAQS_REC", nullable = false, length = 1)
	public char getAutomateTraqsRec() {
		return this.automateTraqsRec;
	}

	public void setAutomateTraqsRec(char automateTraqsRec) {
		this.automateTraqsRec = automateTraqsRec;
	}

	@Column(name = "AUTOMATE_TRS_RPT_YR", nullable = false, length = 4)
	public String getAutomateTrsRptYr() {
		return this.automateTrsRptYr;
	}

	public void setAutomateTrsRptYr(String automateTrsRptYr) {
		this.automateTrsRptYr = automateTrsRptYr;
	}

	@Column(name = "AUTOMATE_TRS_RPT_MON", nullable = false, length = 2)
	public String getAutomateTrsRptMon() {
		return this.automateTrsRptMon;
	}

	public void setAutomateTrsRptMon(String automateTrsRptMon) {
		this.automateTrsRptMon = automateTrsRptMon;
	}

	@Column(name = "TEA_HEALTH_INS_CONTRIB_DED_CD", nullable = false, length = 3)
	public String getTeaHealthInsContribDedCd() {
		return this.teaHealthInsContribDedCd;
	}

	public void setTeaHealthInsContribDedCd(String teaHealthInsContribDedCd) {
		this.teaHealthInsContribDedCd = teaHealthInsContribDedCd;
	}

	@Column(name = "TEA_HLTH_INS_CONTRIB_PAY6", nullable = false, precision = 9)
	public BigDecimal getTeaHlthInsContribPay6() {
		return this.teaHlthInsContribPay6;
	}

	public void setTeaHlthInsContribPay6(BigDecimal teaHlthInsContribPay6) {
		this.teaHlthInsContribPay6 = teaHlthInsContribPay6;
	}

	@Column(name = "TEA_HLTH_INS_CONTRIB_OBJ_PAY6", nullable = false, length = 4)
	public String getTeaHlthInsContribObjPay6() {
		return this.teaHlthInsContribObjPay6;
	}

	public void setTeaHlthInsContribObjPay6(String teaHlthInsContribObjPay6) {
		this.teaHlthInsContribObjPay6 = teaHlthInsContribObjPay6;
	}

	@Column(name = "TEA_HLTH_INS_CONTRIB_SOBJ_PAY6", nullable = false, length = 2)
	public String getTeaHlthInsContribSobjPay6() {
		return this.teaHlthInsContribSobjPay6;
	}

	public void setTeaHlthInsContribSobjPay6(String teaHlthInsContribSobjPay6) {
		this.teaHlthInsContribSobjPay6 = teaHlthInsContribSobjPay6;
	}

	@Column(name = "TRS_SUPPL_COMP_FUND", nullable = false, length = 3)
	public String getTrsSupplCompFund() {
		return this.trsSupplCompFund;
	}

	public void setTrsSupplCompFund(String trsSupplCompFund) {
		this.trsSupplCompFund = trsSupplCompFund;
	}

	@Column(name = "TRS_SUPPL_COMP_FUNC", nullable = false, length = 2)
	public String getTrsSupplCompFunc() {
		return this.trsSupplCompFunc;
	}

	public void setTrsSupplCompFunc(String trsSupplCompFunc) {
		this.trsSupplCompFunc = trsSupplCompFunc;
	}

	@Column(name = "TRS_SUPPL_COMP_OBJ", nullable = false, length = 4)
	public String getTrsSupplCompObj() {
		return this.trsSupplCompObj;
	}

	public void setTrsSupplCompObj(String trsSupplCompObj) {
		this.trsSupplCompObj = trsSupplCompObj;
	}

	@Column(name = "TRS_SUPPL_COMP_SOBJ", nullable = false, length = 2)
	public String getTrsSupplCompSobj() {
		return this.trsSupplCompSobj;
	}

	public void setTrsSupplCompSobj(String trsSupplCompSobj) {
		this.trsSupplCompSobj = trsSupplCompSobj;
	}

	@Column(name = "TRS_SUPPL_COMP_ORG", nullable = false, length = 3)
	public String getTrsSupplCompOrg() {
		return this.trsSupplCompOrg;
	}

	public void setTrsSupplCompOrg(String trsSupplCompOrg) {
		this.trsSupplCompOrg = trsSupplCompOrg;
	}

	@Column(name = "TRS_SUPPL_COMP_FSCL_YR", nullable = false, length = 1)
	public char getTrsSupplCompFsclYr() {
		return this.trsSupplCompFsclYr;
	}

	public void setTrsSupplCompFsclYr(char trsSupplCompFsclYr) {
		this.trsSupplCompFsclYr = trsSupplCompFsclYr;
	}

	@Column(name = "TRS_SUPPL_COMP_PGM", nullable = false, length = 2)
	public String getTrsSupplCompPgm() {
		return this.trsSupplCompPgm;
	}

	public void setTrsSupplCompPgm(String trsSupplCompPgm) {
		this.trsSupplCompPgm = trsSupplCompPgm;
	}

	@Column(name = "TRS_SUPPL_COMP_ED_SPAN", nullable = false, length = 1)
	public char getTrsSupplCompEdSpan() {
		return this.trsSupplCompEdSpan;
	}

	public void setTrsSupplCompEdSpan(char trsSupplCompEdSpan) {
		this.trsSupplCompEdSpan = trsSupplCompEdSpan;
	}

	@Column(name = "TRS_SUPPL_COMP_PROJ_DTL", nullable = false, length = 2)
	public String getTrsSupplCompProjDtl() {
		return this.trsSupplCompProjDtl;
	}

	public void setTrsSupplCompProjDtl(String trsSupplCompProjDtl) {
		this.trsSupplCompProjDtl = trsSupplCompProjDtl;
	}

	@Column(name = "TRS_SUPPL_COMP_WRK_COMP", nullable = false, length = 1)
	public char getTrsSupplCompWrkComp() {
		return this.trsSupplCompWrkComp;
	}

	public void setTrsSupplCompWrkComp(char trsSupplCompWrkComp) {
		this.trsSupplCompWrkComp = trsSupplCompWrkComp;
	}

	@Column(name = "SUPPL_TAX_RATE", nullable = false, precision = 5, scale = 4)
	public BigDecimal getSupplTaxRate() {
		return this.supplTaxRate;
	}

	public void setSupplTaxRate(BigDecimal supplTaxRate) {
		this.supplTaxRate = supplTaxRate;
	}

	@Column(name = "EMPLR_CONTRIB_FUND", nullable = false, length = 3)
	public String getEmplrContribFund() {
		return this.emplrContribFund;
	}

	public void setEmplrContribFund(String emplrContribFund) {
		this.emplrContribFund = emplrContribFund;
	}

	@Column(name = "EMPLR_CONTRIB_FUNC", nullable = false, length = 2)
	public String getEmplrContribFunc() {
		return this.emplrContribFunc;
	}

	public void setEmplrContribFunc(String emplrContribFunc) {
		this.emplrContribFunc = emplrContribFunc;
	}

	@Column(name = "EMPLR_CONTRIB_OBJ", nullable = false, length = 4)
	public String getEmplrContribObj() {
		return this.emplrContribObj;
	}

	public void setEmplrContribObj(String emplrContribObj) {
		this.emplrContribObj = emplrContribObj;
	}

	@Column(name = "EMPLR_CONTRIB_SOBJ", nullable = false, length = 2)
	public String getEmplrContribSobj() {
		return this.emplrContribSobj;
	}

	public void setEmplrContribSobj(String emplrContribSobj) {
		this.emplrContribSobj = emplrContribSobj;
	}

	@Column(name = "EMPLR_CONTRIB_ORG", nullable = false, length = 3)
	public String getEmplrContribOrg() {
		return this.emplrContribOrg;
	}

	public void setEmplrContribOrg(String emplrContribOrg) {
		this.emplrContribOrg = emplrContribOrg;
	}

	@Column(name = "EMPLR_CONTRIB_FSCL_YR", nullable = false, length = 1)
	public char getEmplrContribFsclYr() {
		return this.emplrContribFsclYr;
	}

	public void setEmplrContribFsclYr(char emplrContribFsclYr) {
		this.emplrContribFsclYr = emplrContribFsclYr;
	}

	@Column(name = "EMPLR_CONTRIB_PGM", nullable = false, length = 2)
	public String getEmplrContribPgm() {
		return this.emplrContribPgm;
	}

	public void setEmplrContribPgm(String emplrContribPgm) {
		this.emplrContribPgm = emplrContribPgm;
	}

	@Column(name = "EMPLR_CONTRIB_ED_SPAN", nullable = false, length = 1)
	public char getEmplrContribEdSpan() {
		return this.emplrContribEdSpan;
	}

	public void setEmplrContribEdSpan(char emplrContribEdSpan) {
		this.emplrContribEdSpan = emplrContribEdSpan;
	}

	@Column(name = "EMPLR_CONTRIB_PROJ_DTL", nullable = false, length = 2)
	public String getEmplrContribProjDtl() {
		return this.emplrContribProjDtl;
	}

	public void setEmplrContribProjDtl(String emplrContribProjDtl) {
		this.emplrContribProjDtl = emplrContribProjDtl;
	}

	@Column(name = "FIRST_PAYDATE_SCH_YR_PAY4", nullable = false, length = 8)
	public String getFirstPaydateSchYrPay4() {
		return this.firstPaydateSchYrPay4;
	}

	public void setFirstPaydateSchYrPay4(String firstPaydateSchYrPay4) {
		this.firstPaydateSchYrPay4 = firstPaydateSchYrPay4;
	}

	@Column(name = "FIRST_PAYDATE_SCH_YR_PAY5", nullable = false, length = 8)
	public String getFirstPaydateSchYrPay5() {
		return this.firstPaydateSchYrPay5;
	}

	public void setFirstPaydateSchYrPay5(String firstPaydateSchYrPay5) {
		this.firstPaydateSchYrPay5 = firstPaydateSchYrPay5;
	}

	@Column(name = "FIRST_PAYDATE_SCH_YR_PAY6", nullable = false, length = 8)
	public String getFirstPaydateSchYrPay6() {
		return this.firstPaydateSchYrPay6;
	}

	public void setFirstPaydateSchYrPay6(String firstPaydateSchYrPay6) {
		this.firstPaydateSchYrPay6 = firstPaydateSchYrPay6;
	}

	@Column(name = "PEIMS_CD_YR", nullable = false, length = 4)
	public String getPeimsCdYr() {
		return this.peimsCdYr;
	}

	public void setPeimsCdYr(String peimsCdYr) {
		this.peimsCdYr = peimsCdYr;
	}

	@Column(name = "NY_AUTOMATE_TRAQS_REC", nullable = false, length = 1)
	public char getNyAutomateTraqsRec() {
		return this.nyAutomateTraqsRec;
	}

	public void setNyAutomateTraqsRec(char nyAutomateTraqsRec) {
		this.nyAutomateTraqsRec = nyAutomateTraqsRec;
	}

	@Column(name = "NY_AUTOMATE_TRS_RPT_YR", nullable = false, length = 4)
	public String getNyAutomateTrsRptYr() {
		return this.nyAutomateTrsRptYr;
	}

	public void setNyAutomateTrsRptYr(String nyAutomateTrsRptYr) {
		this.nyAutomateTrsRptYr = nyAutomateTrsRptYr;
	}

	@Column(name = "NY_AUTOMATE_TRS_RPT_MON", nullable = false, length = 2)
	public String getNyAutomateTrsRptMon() {
		return this.nyAutomateTrsRptMon;
	}

	public void setNyAutomateTrsRptMon(String nyAutomateTrsRptMon) {
		this.nyAutomateTrsRptMon = nyAutomateTrsRptMon;
	}

	@Column(name = "NY_TRS_ONBEHALF_ACCT_CD", nullable = false, length = 20)
	public String getNyTrsOnbehalfAcctCd() {
		return this.nyTrsOnbehalfAcctCd;
	}

	public void setNyTrsOnbehalfAcctCd(String nyTrsOnbehalfAcctCd) {
		this.nyTrsOnbehalfAcctCd = nyTrsOnbehalfAcctCd;
	}

	@Column(name = "SIM_UPDT", nullable = false, length = 1)
	public char getSimUpdt() {
		return this.simUpdt;
	}

	public void setSimUpdt(char simUpdt) {
		this.simUpdt = simUpdt;
	}

	@Column(name = "NY_EXCL_TRS_ONBEHALF", nullable = false, length = 1)
	public char getNyExclTrsOnbehalf() {
		return this.nyExclTrsOnbehalf;
	}

	public void setNyExclTrsOnbehalf(char nyExclTrsOnbehalf) {
		this.nyExclTrsOnbehalf = nyExclTrsOnbehalf;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Column(name = "EFT_OPT", nullable = false, length = 1)
	public char getEftOpt() {
		return this.eftOpt;
	}

	public void setEftOpt(char eftOpt) {
		this.eftOpt = eftOpt;
	}

	@Column(name = "TEAM_PAYDT_TRS_MON_ACT_DT", nullable = false, length = 1)
	public char getTeamPaydtTrsMonActDt() {
		return this.teamPaydtTrsMonActDt;
	}

	public void setTeamPaydtTrsMonActDt(char teamPaydtTrsMonActDt) {
		this.teamPaydtTrsMonActDt = teamPaydtTrsMonActDt;
	}

	@Column(name = "TEAM_ACT_HRS_SCHED_HRS", nullable = false, length = 1)
	public char getTeamActHrsSchedHrs() {
		return this.teamActHrsSchedHrs;
	}

	public void setTeamActHrsSchedHrs(char teamActHrsSchedHrs) {
		this.teamActHrsSchedHrs = teamActHrsSchedHrs;
	}

}
