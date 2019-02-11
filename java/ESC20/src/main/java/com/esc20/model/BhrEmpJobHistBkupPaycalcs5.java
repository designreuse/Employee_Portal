package com.esc20.model;
// Generated Jan 4, 2019 3:40:12 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrEmpJobHistBkupPaycalcs5 generated by hbm2java
 */
@Entity
@Table(name = "BHR_EMP_JOB_HIST_BKUP_PAYCALCS_5", schema = "rsccc", catalog = "rsccc")
public class BhrEmpJobHistBkupPaycalcs5 implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrEmpJobHistBkupPaycalcs5Id id;

	public BhrEmpJobHistBkupPaycalcs5() {
	}

	public BhrEmpJobHistBkupPaycalcs5(BhrEmpJobHistBkupPaycalcs5Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "jobCd", column = @Column(name = "JOB_CD", nullable = false, length = 4)),
			@AttributeOverride(name = "dtOfPay", column = @Column(name = "DT_OF_PAY", nullable = false, length = 8)),
			@AttributeOverride(name = "chkNbr", column = @Column(name = "CHK_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "voidOrIss", column = @Column(name = "VOID_OR_ISS", nullable = false, length = 1)),
			@AttributeOverride(name = "adjNbr", column = @Column(name = "ADJ_NBR", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "primJob", column = @Column(name = "PRIM_JOB", nullable = false, length = 1)),
			@AttributeOverride(name = "pctAssgnd", column = @Column(name = "PCT_ASSGND", nullable = false, precision = 3)),
			@AttributeOverride(name = "campusId", column = @Column(name = "CAMPUS_ID", nullable = false, length = 3)),
			@AttributeOverride(name = "dept", column = @Column(name = "DEPT", nullable = false, length = 1)),
			@AttributeOverride(name = "eeoc", column = @Column(name = "EEOC", nullable = false, length = 2)),
			@AttributeOverride(name = "contrAmt", column = @Column(name = "CONTR_AMT", nullable = false, precision = 9)),
			@AttributeOverride(name = "contrRemainAmt", column = @Column(name = "CONTR_REMAIN_AMT", nullable = false, precision = 9)),
			@AttributeOverride(name = "contrCal", column = @Column(name = "CONTR_CAL", nullable = false, length = 2)),
			@AttributeOverride(name = "contrDtBegin", column = @Column(name = "CONTR_DT_BEGIN", nullable = false, length = 8)),
			@AttributeOverride(name = "contrDtEnd", column = @Column(name = "CONTR_DT_END", nullable = false, length = 8)),
			@AttributeOverride(name = "contrNonStdFlg", column = @Column(name = "CONTR_NON_STD_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "contrDays", column = @Column(name = "CONTR_DAYS", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "stStep", column = @Column(name = "ST_STEP", nullable = false, length = 2)),
			@AttributeOverride(name = "stMinSalary", column = @Column(name = "ST_MIN_SALARY", nullable = false, precision = 9)),
			@AttributeOverride(name = "yrsCarLad", column = @Column(name = "YRS_CAR_LAD", nullable = false, precision = 1, scale = 0)),
			@AttributeOverride(name = "payType", column = @Column(name = "PAY_TYPE", nullable = false, length = 1)),
			@AttributeOverride(name = "payRate", column = @Column(name = "PAY_RATE", nullable = false, precision = 9)),
			@AttributeOverride(name = "payGrd", column = @Column(name = "PAY_GRD", nullable = false, length = 3)),
			@AttributeOverride(name = "paySched", column = @Column(name = "PAY_SCHED", nullable = false, length = 1)),
			@AttributeOverride(name = "payStep", column = @Column(name = "PAY_STEP", nullable = false, length = 2)),
			@AttributeOverride(name = "maxDays", column = @Column(name = "MAX_DAYS", nullable = false, length = 3)),
			@AttributeOverride(name = "exemptStat", column = @Column(name = "EXEMPT_STAT", nullable = false, length = 1)),
			@AttributeOverride(name = "dlyRateOfPay", column = @Column(name = "DLY_RATE_OF_PAY", nullable = false, precision = 7, scale = 3)),
			@AttributeOverride(name = "regHrsWrk", column = @Column(name = "REG_HRS_WRK", nullable = false, precision = 5)),
			@AttributeOverride(name = "hrsPerDay", column = @Column(name = "HRS_PER_DAY", nullable = false, precision = 5, scale = 3)),
			@AttributeOverride(name = "nbrDaysEmpld", column = @Column(name = "NBR_DAYS_EMPLD", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "nbrDaysOff", column = @Column(name = "NBR_DAYS_OFF", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "nbrAnnualPymts", column = @Column(name = "NBR_ANNUAL_PYMTS", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "nbrRemainPymts", column = @Column(name = "NBR_REMAIN_PYMTS", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "ovtmEligFlg", column = @Column(name = "OVTM_ELIG_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "ovtmRate", column = @Column(name = "OVTM_RATE", nullable = false, precision = 5)),
			@AttributeOverride(name = "wrkComp", column = @Column(name = "WRK_COMP", nullable = false, length = 1)),
			@AttributeOverride(name = "wrkCompRemain", column = @Column(name = "WRK_COMP_REMAIN", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "trsPosCd", column = @Column(name = "TRS_POS_CD", nullable = false, length = 2)),
			@AttributeOverride(name = "stMinSalaryPct", column = @Column(name = "ST_MIN_SALARY_PCT", nullable = false, precision = 3)),
			@AttributeOverride(name = "nbrMonContr", column = @Column(name = "NBR_MON_CONTR", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "xmitalHrsWrk", column = @Column(name = "XMITAL_HRS_WRK", nullable = false, precision = 5)),
			@AttributeOverride(name = "accruJob", column = @Column(name = "ACCRU_JOB", nullable = false, length = 1)),
			@AttributeOverride(name = "dtPayoff", column = @Column(name = "DT_PAYOFF", nullable = false, length = 8)),
			@AttributeOverride(name = "accruCd", column = @Column(name = "ACCRU_CD", nullable = false, length = 1)),
			@AttributeOverride(name = "wrkCompAnnlPymts", column = @Column(name = "WRK_COMP_ANNL_PYMTS", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "daysWrk", column = @Column(name = "DAYS_WRK", nullable = false, precision = 5)),
			@AttributeOverride(name = "accruRate", column = @Column(name = "ACCRU_RATE", nullable = false, precision = 7, scale = 3)),
			@AttributeOverride(name = "hrlyRate", column = @Column(name = "HRLY_RATE", nullable = false, precision = 5)),
			@AttributeOverride(name = "incrPayStp", column = @Column(name = "INCR_PAY_STP", nullable = false, length = 1)),
			@AttributeOverride(name = "vacantPos", column = @Column(name = "VACANT_POS", nullable = false, length = 1)),
			@AttributeOverride(name = "ovtmHrsWrk", column = @Column(name = "OVTM_HRS_WRK", nullable = false, precision = 5)),
			@AttributeOverride(name = "wklyHrsSched", column = @Column(name = "WKLY_HRS_SCHED", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "grosPayTot", column = @Column(name = "GROS_PAY_TOT", nullable = false, precision = 9)),
			@AttributeOverride(name = "nonTrsAllowAdj", column = @Column(name = "NON_TRS_ALLOW_ADJ", nullable = false, precision = 9)),
			@AttributeOverride(name = "trsGros", column = @Column(name = "TRS_GROS", nullable = false, precision = 9)),
			@AttributeOverride(name = "perforPayGros", column = @Column(name = "PERFOR_PAY_GROS", nullable = false, precision = 9)),
			@AttributeOverride(name = "trsSalRed", column = @Column(name = "TRS_SAL_RED", nullable = false, precision = 7)),
			@AttributeOverride(name = "trsDpstIns", column = @Column(name = "TRS_DPST_INS", nullable = false, precision = 7)),
			@AttributeOverride(name = "emplrTrsCareContrib", column = @Column(name = "EMPLR_TRS_CARE_CONTRIB", nullable = false, precision = 7)),
			@AttributeOverride(name = "trsGrantGros", column = @Column(name = "TRS_GRANT_GROS", nullable = false, precision = 7)),
			@AttributeOverride(name = "trsGrantDpst", column = @Column(name = "TRS_GRANT_DPST", nullable = false, precision = 7)),
			@AttributeOverride(name = "trsGrantCare", column = @Column(name = "TRS_GRANT_CARE", nullable = false, precision = 7)),
			@AttributeOverride(name = "emplrNewTrsPensnContrib", column = @Column(name = "EMPLR_NEW_TRS_PENSN_CONTRIB", nullable = false, precision = 7)),
			@AttributeOverride(name = "emplrRetPensnSurchg", column = @Column(name = "EMPLR_RET_PENSN_SURCHG", nullable = false, precision = 7)),
			@AttributeOverride(name = "emplrTrsCareSurchg", column = @Column(name = "EMPLR_TRS_CARE_SURCHG", nullable = false, precision = 7)),
			@AttributeOverride(name = "dockAmt", column = @Column(name = "DOCK_AMT", nullable = false, precision = 7)),
			@AttributeOverride(name = "stMinSal", column = @Column(name = "ST_MIN_SAL", nullable = false, precision = 7)),
			@AttributeOverride(name = "whollySepAmt", column = @Column(name = "WHOLLY_SEP_AMT", nullable = false, precision = 7)),
			@AttributeOverride(name = "non373SupplSal", column = @Column(name = "NON_373_SUPPL_SAL", nullable = false, precision = 7)),
			@AttributeOverride(name = "whollySepAmtThisPyrl", column = @Column(name = "WHOLLY_SEP_AMT_THIS_PYRL", nullable = false, precision = 7)),
			@AttributeOverride(name = "childNutrGrantCd", column = @Column(name = "CHILD_NUTR_GRANT_CD", nullable = false, length = 2)),
			@AttributeOverride(name = "childNutrGrantGros", column = @Column(name = "CHILD_NUTR_GRANT_GROS", nullable = false, precision = 7)),
			@AttributeOverride(name = "childNutrGrantDpst", column = @Column(name = "CHILD_NUTR_GRANT_DPST", nullable = false, precision = 7)),
			@AttributeOverride(name = "childNutrGrantCare", column = @Column(name = "CHILD_NUTR_GRANT_CARE", nullable = false, precision = 7)),
			@AttributeOverride(name = "whollySepGrantGros", column = @Column(name = "WHOLLY_SEP_GRANT_GROS", nullable = false, precision = 7)),
			@AttributeOverride(name = "whollySepGrantDpst", column = @Column(name = "WHOLLY_SEP_GRANT_DPST", nullable = false, precision = 7)),
			@AttributeOverride(name = "whollySepGrantCare", column = @Column(name = "WHOLLY_SEP_GRANT_CARE", nullable = false, precision = 7)),
			@AttributeOverride(name = "module", column = @Column(name = "MODULE", nullable = false, length = 25)) })
	public BhrEmpJobHistBkupPaycalcs5Id getId() {
		return this.id;
	}

	public void setId(BhrEmpJobHistBkupPaycalcs5Id id) {
		this.id = id;
	}

}
