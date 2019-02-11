package com.esc20.model;
// Generated Jan 4, 2019 3:42:57 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrNyPayrollBudget generated by hbm2java
 */
@Entity
@Table(name = "BHR_NY_PAYROLL_BUDGET", schema = "rsccc", catalog = "rsccc")
public class BhrNyPayrollBudget implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrNyPayrollBudgetId id;
	private BigDecimal acctAmt;
	private String trsGrantCd;
	private String budRecTyp;
	private char acctTyp;
	private BigDecimal acctPct;
	private char wrkComp;
	private char expense373;
	private char origFsclYr;
	private byte nbrPensnPers;

	public BhrNyPayrollBudget() {
	}

	public BhrNyPayrollBudget(BhrNyPayrollBudgetId id, BigDecimal acctAmt, String trsGrantCd, String budRecTyp,
			char acctTyp, BigDecimal acctPct, char wrkComp, char expense373, char origFsclYr, byte nbrPensnPers) {
		this.id = id;
		this.acctAmt = acctAmt;
		this.trsGrantCd = trsGrantCd;
		this.budRecTyp = budRecTyp;
		this.acctTyp = acctTyp;
		this.acctPct = acctPct;
		this.wrkComp = wrkComp;
		this.expense373 = expense373;
		this.origFsclYr = origFsclYr;
		this.nbrPensnPers = nbrPensnPers;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "jobCd", column = @Column(name = "JOB_CD", nullable = false, length = 4)),
			@AttributeOverride(name = "fund", column = @Column(name = "FUND", nullable = false, length = 3)),
			@AttributeOverride(name = "func", column = @Column(name = "FUNC", nullable = false, length = 2)),
			@AttributeOverride(name = "obj", column = @Column(name = "OBJ", nullable = false, length = 4)),
			@AttributeOverride(name = "sobj", column = @Column(name = "SOBJ", nullable = false, length = 2)),
			@AttributeOverride(name = "org", column = @Column(name = "ORG", nullable = false, length = 3)),
			@AttributeOverride(name = "fsclYr", column = @Column(name = "FSCL_YR", nullable = false, length = 1)),
			@AttributeOverride(name = "pgm", column = @Column(name = "PGM", nullable = false, length = 2)),
			@AttributeOverride(name = "edSpan", column = @Column(name = "ED_SPAN", nullable = false, length = 1)),
			@AttributeOverride(name = "projDtl", column = @Column(name = "PROJ_DTL", nullable = false, length = 2)),
			@AttributeOverride(name = "glFileId", column = @Column(name = "GL_FILE_ID", nullable = false, length = 1)),
			@AttributeOverride(name = "seqNbr", column = @Column(name = "SEQ_NBR", nullable = false, precision = 3, scale = 0)) })
	public BhrNyPayrollBudgetId getId() {
		return this.id;
	}

	public void setId(BhrNyPayrollBudgetId id) {
		this.id = id;
	}

	@Column(name = "ACCT_AMT", nullable = false, precision = 9)
	public BigDecimal getAcctAmt() {
		return this.acctAmt;
	}

	public void setAcctAmt(BigDecimal acctAmt) {
		this.acctAmt = acctAmt;
	}

	@Column(name = "TRS_GRANT_CD", nullable = false, length = 2)
	public String getTrsGrantCd() {
		return this.trsGrantCd;
	}

	public void setTrsGrantCd(String trsGrantCd) {
		this.trsGrantCd = trsGrantCd;
	}

	@Column(name = "BUD_REC_TYP", nullable = false, length = 8)
	public String getBudRecTyp() {
		return this.budRecTyp;
	}

	public void setBudRecTyp(String budRecTyp) {
		this.budRecTyp = budRecTyp;
	}

	@Column(name = "ACCT_TYP", nullable = false, length = 1)
	public char getAcctTyp() {
		return this.acctTyp;
	}

	public void setAcctTyp(char acctTyp) {
		this.acctTyp = acctTyp;
	}

	@Column(name = "ACCT_PCT", nullable = false, precision = 7, scale = 5)
	public BigDecimal getAcctPct() {
		return this.acctPct;
	}

	public void setAcctPct(BigDecimal acctPct) {
		this.acctPct = acctPct;
	}

	@Column(name = "WRK_COMP", nullable = false, length = 1)
	public char getWrkComp() {
		return this.wrkComp;
	}

	public void setWrkComp(char wrkComp) {
		this.wrkComp = wrkComp;
	}

	@Column(name = "EXPENSE_373", nullable = false, length = 1)
	public char getExpense373() {
		return this.expense373;
	}

	public void setExpense373(char expense373) {
		this.expense373 = expense373;
	}

	@Column(name = "ORIG_FSCL_YR", nullable = false, length = 1)
	public char getOrigFsclYr() {
		return this.origFsclYr;
	}

	public void setOrigFsclYr(char origFsclYr) {
		this.origFsclYr = origFsclYr;
	}

	@Column(name = "NBR_PENSN_PERS", nullable = false, precision = 2, scale = 0)
	public byte getNbrPensnPers() {
		return this.nbrPensnPers;
	}

	public void setNbrPensnPers(byte nbrPensnPers) {
		this.nbrPensnPers = nbrPensnPers;
	}

}
