package com.esc20.model;
// Generated Jan 4, 2019 3:42:57 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrNyPayrollBudgetBkupPaycalcs5 generated by hbm2java
 */
@Entity
@Table(name = "BHR_NY_PAYROLL_BUDGET_BKUP_PAYCALCS_5", schema = "rsccc", catalog = "rsccc")
public class BhrNyPayrollBudgetBkupPaycalcs5 implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrNyPayrollBudgetBkupPaycalcs5Id id;

	public BhrNyPayrollBudgetBkupPaycalcs5() {
	}

	public BhrNyPayrollBudgetBkupPaycalcs5(BhrNyPayrollBudgetBkupPaycalcs5Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "jobCd", column = @Column(name = "JOB_CD", nullable = false, length = 4)),
			@AttributeOverride(name = "seqNbr", column = @Column(name = "SEQ_NBR", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "glFileId", column = @Column(name = "GL_FILE_ID", nullable = false, length = 1)),
			@AttributeOverride(name = "fund", column = @Column(name = "FUND", nullable = false, length = 3)),
			@AttributeOverride(name = "func", column = @Column(name = "FUNC", nullable = false, length = 2)),
			@AttributeOverride(name = "obj", column = @Column(name = "OBJ", nullable = false, length = 4)),
			@AttributeOverride(name = "sobj", column = @Column(name = "SOBJ", nullable = false, length = 2)),
			@AttributeOverride(name = "org", column = @Column(name = "ORG", nullable = false, length = 3)),
			@AttributeOverride(name = "fsclYr", column = @Column(name = "FSCL_YR", nullable = false, length = 1)),
			@AttributeOverride(name = "pgm", column = @Column(name = "PGM", nullable = false, length = 2)),
			@AttributeOverride(name = "edSpan", column = @Column(name = "ED_SPAN", nullable = false, length = 1)),
			@AttributeOverride(name = "projDtl", column = @Column(name = "PROJ_DTL", nullable = false, length = 2)),
			@AttributeOverride(name = "acctAmt", column = @Column(name = "ACCT_AMT", nullable = false, precision = 9)),
			@AttributeOverride(name = "trsGrantCd", column = @Column(name = "TRS_GRANT_CD", nullable = false, length = 2)),
			@AttributeOverride(name = "budRecTyp", column = @Column(name = "BUD_REC_TYP", nullable = false, length = 8)),
			@AttributeOverride(name = "acctTyp", column = @Column(name = "ACCT_TYP", nullable = false, length = 1)),
			@AttributeOverride(name = "acctPct", column = @Column(name = "ACCT_PCT", nullable = false, precision = 7, scale = 5)),
			@AttributeOverride(name = "wrkComp", column = @Column(name = "WRK_COMP", nullable = false, length = 1)),
			@AttributeOverride(name = "expense373", column = @Column(name = "EXPENSE_373", nullable = false, length = 1)),
			@AttributeOverride(name = "origFsclYr", column = @Column(name = "ORIG_FSCL_YR", nullable = false, length = 1)),
			@AttributeOverride(name = "nbrPensnPers", column = @Column(name = "NBR_PENSN_PERS", nullable = false, precision = 2, scale = 0)) })
	public BhrNyPayrollBudgetBkupPaycalcs5Id getId() {
		return this.id;
	}

	public void setId(BhrNyPayrollBudgetBkupPaycalcs5Id id) {
		this.id = id;
	}

}
