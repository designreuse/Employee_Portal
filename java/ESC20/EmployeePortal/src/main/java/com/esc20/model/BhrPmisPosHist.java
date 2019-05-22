package com.esc20.model;
// Generated Jan 4, 2019 3:44:43 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrPmisPosHist generated by hbm2java
 */
@Entity
@Table(name = "BHR_PMIS_POS_HIST", schema = "rsccc", catalog = "rsccc")
public class BhrPmisPosHist implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrPmisPosHistId id;
	private String dtAuth;
	private String dtFill;
	private String dtVac;
	private String dtEntry;
	private String vacRsn;
	private String posSchYr;
	private char payFreq;
	private String occEmpNbr;
	private String nameL;
	private String nameF;
	private String nameM;
	private char nameGen;
	private char payConcpt;
	private String occPayGrd;
	private String occPayStp;
	private char occPaySched;
	private BigDecimal salAmt;
	private BigDecimal maxDays;
	private BigDecimal actDays;
	private BigDecimal nbrDaysOff;
	private BigDecimal actHrlyDlyRate;
	private String extraDutyCd;
	private char supplTyp;
	private BigDecimal hrsPerDay;
	private BigDecimal dayEmpldPct;
	private BigDecimal pctOfYr;
	private String contrDtBeg;
	private String contrDtEnd;
	private String dtPayoff;
	private String jobCd;
	private char primJob;
	private short nbrRemainPymts;
	private String campusId;
	private char dept;
	private BigDecimal equivUnts;
	private char foyEoyInd;
	private String createByCd;
	private String frstPaydtCd;
	private char supplPay1time;
	private char occPayTyp;
	private String module;
	private String posDescr;

	public BhrPmisPosHist() {
	}

	public BhrPmisPosHist(BhrPmisPosHistId id, String dtAuth, String dtFill, String dtVac, String dtEntry,
			String vacRsn, String posSchYr, char payFreq, String occEmpNbr, String nameL, String nameF, String nameM,
			char nameGen, char payConcpt, String occPayGrd, String occPayStp, char occPaySched, BigDecimal salAmt,
			BigDecimal maxDays, BigDecimal actDays, BigDecimal nbrDaysOff, BigDecimal actHrlyDlyRate,
			String extraDutyCd, char supplTyp, BigDecimal hrsPerDay, BigDecimal dayEmpldPct, BigDecimal pctOfYr,
			String contrDtBeg, String contrDtEnd, String dtPayoff, String jobCd, char primJob, short nbrRemainPymts,
			String campusId, char dept, BigDecimal equivUnts, char foyEoyInd, String createByCd, String frstPaydtCd,
			char supplPay1time, char occPayTyp, String module, String posDescr) {
		this.id = id;
		this.dtAuth = dtAuth;
		this.dtFill = dtFill;
		this.dtVac = dtVac;
		this.dtEntry = dtEntry;
		this.vacRsn = vacRsn;
		this.posSchYr = posSchYr;
		this.payFreq = payFreq;
		this.occEmpNbr = occEmpNbr;
		this.nameL = nameL;
		this.nameF = nameF;
		this.nameM = nameM;
		this.nameGen = nameGen;
		this.payConcpt = payConcpt;
		this.occPayGrd = occPayGrd;
		this.occPayStp = occPayStp;
		this.occPaySched = occPaySched;
		this.salAmt = salAmt;
		this.maxDays = maxDays;
		this.actDays = actDays;
		this.nbrDaysOff = nbrDaysOff;
		this.actHrlyDlyRate = actHrlyDlyRate;
		this.extraDutyCd = extraDutyCd;
		this.supplTyp = supplTyp;
		this.hrsPerDay = hrsPerDay;
		this.dayEmpldPct = dayEmpldPct;
		this.pctOfYr = pctOfYr;
		this.contrDtBeg = contrDtBeg;
		this.contrDtEnd = contrDtEnd;
		this.dtPayoff = dtPayoff;
		this.jobCd = jobCd;
		this.primJob = primJob;
		this.nbrRemainPymts = nbrRemainPymts;
		this.campusId = campusId;
		this.dept = dept;
		this.equivUnts = equivUnts;
		this.foyEoyInd = foyEoyInd;
		this.createByCd = createByCd;
		this.frstPaydtCd = frstPaydtCd;
		this.supplPay1time = supplPay1time;
		this.occPayTyp = occPayTyp;
		this.module = module;
		this.posDescr = posDescr;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "posNbr", column = @Column(name = "POS_NBR", nullable = false, length = 13)),
			@AttributeOverride(name = "billetNbr", column = @Column(name = "BILLET_NBR", nullable = false, length = 5)),
			@AttributeOverride(name = "posTyp", column = @Column(name = "POS_TYP", nullable = false, length = 1)),
			@AttributeOverride(name = "dts", column = @Column(name = "DTS", nullable = false, length = 16)) })
	public BhrPmisPosHistId getId() {
		return this.id;
	}

	public void setId(BhrPmisPosHistId id) {
		this.id = id;
	}

	@Column(name = "DT_AUTH", nullable = false, length = 8)
	public String getDtAuth() {
		return this.dtAuth;
	}

	public void setDtAuth(String dtAuth) {
		this.dtAuth = dtAuth;
	}

	@Column(name = "DT_FILL", nullable = false, length = 8)
	public String getDtFill() {
		return this.dtFill;
	}

	public void setDtFill(String dtFill) {
		this.dtFill = dtFill;
	}

	@Column(name = "DT_VAC", nullable = false, length = 8)
	public String getDtVac() {
		return this.dtVac;
	}

	public void setDtVac(String dtVac) {
		this.dtVac = dtVac;
	}

	@Column(name = "DT_ENTRY", nullable = false, length = 8)
	public String getDtEntry() {
		return this.dtEntry;
	}

	public void setDtEntry(String dtEntry) {
		this.dtEntry = dtEntry;
	}

	@Column(name = "VAC_RSN", nullable = false, length = 2)
	public String getVacRsn() {
		return this.vacRsn;
	}

	public void setVacRsn(String vacRsn) {
		this.vacRsn = vacRsn;
	}

	@Column(name = "POS_SCH_YR", nullable = false, length = 4)
	public String getPosSchYr() {
		return this.posSchYr;
	}

	public void setPosSchYr(String posSchYr) {
		this.posSchYr = posSchYr;
	}

	@Column(name = "PAY_FREQ", nullable = false, length = 1)
	public char getPayFreq() {
		return this.payFreq;
	}

	public void setPayFreq(char payFreq) {
		this.payFreq = payFreq;
	}

	@Column(name = "OCC_EMP_NBR", nullable = false, length = 6)
	public String getOccEmpNbr() {
		return this.occEmpNbr;
	}

	public void setOccEmpNbr(String occEmpNbr) {
		this.occEmpNbr = occEmpNbr;
	}

	@Column(name = "NAME_L", nullable = false, length = 25)
	public String getNameL() {
		return this.nameL;
	}

	public void setNameL(String nameL) {
		this.nameL = nameL;
	}

	@Column(name = "NAME_F", nullable = false, length = 17)
	public String getNameF() {
		return this.nameF;
	}

	public void setNameF(String nameF) {
		this.nameF = nameF;
	}

	@Column(name = "NAME_M", nullable = false, length = 14)
	public String getNameM() {
		return this.nameM;
	}

	public void setNameM(String nameM) {
		this.nameM = nameM;
	}

	@Column(name = "NAME_GEN", nullable = false, length = 1)
	public char getNameGen() {
		return this.nameGen;
	}

	public void setNameGen(char nameGen) {
		this.nameGen = nameGen;
	}

	@Column(name = "PAY_CONCPT", nullable = false, length = 1)
	public char getPayConcpt() {
		return this.payConcpt;
	}

	public void setPayConcpt(char payConcpt) {
		this.payConcpt = payConcpt;
	}

	@Column(name = "OCC_PAY_GRD", nullable = false, length = 3)
	public String getOccPayGrd() {
		return this.occPayGrd;
	}

	public void setOccPayGrd(String occPayGrd) {
		this.occPayGrd = occPayGrd;
	}

	@Column(name = "OCC_PAY_STP", nullable = false, length = 2)
	public String getOccPayStp() {
		return this.occPayStp;
	}

	public void setOccPayStp(String occPayStp) {
		this.occPayStp = occPayStp;
	}

	@Column(name = "OCC_PAY_SCHED", nullable = false, length = 1)
	public char getOccPaySched() {
		return this.occPaySched;
	}

	public void setOccPaySched(char occPaySched) {
		this.occPaySched = occPaySched;
	}

	@Column(name = "SAL_AMT", nullable = false, precision = 9)
	public BigDecimal getSalAmt() {
		return this.salAmt;
	}

	public void setSalAmt(BigDecimal salAmt) {
		this.salAmt = salAmt;
	}

	@Column(name = "MAX_DAYS", nullable = false, precision = 5, scale = 1)
	public BigDecimal getMaxDays() {
		return this.maxDays;
	}

	public void setMaxDays(BigDecimal maxDays) {
		this.maxDays = maxDays;
	}

	@Column(name = "ACT_DAYS", nullable = false, precision = 5, scale = 1)
	public BigDecimal getActDays() {
		return this.actDays;
	}

	public void setActDays(BigDecimal actDays) {
		this.actDays = actDays;
	}

	@Column(name = "NBR_DAYS_OFF", nullable = false, precision = 3, scale = 1)
	public BigDecimal getNbrDaysOff() {
		return this.nbrDaysOff;
	}

	public void setNbrDaysOff(BigDecimal nbrDaysOff) {
		this.nbrDaysOff = nbrDaysOff;
	}

	@Column(name = "ACT_HRLY_DLY_RATE", nullable = false, precision = 7, scale = 3)
	public BigDecimal getActHrlyDlyRate() {
		return this.actHrlyDlyRate;
	}

	public void setActHrlyDlyRate(BigDecimal actHrlyDlyRate) {
		this.actHrlyDlyRate = actHrlyDlyRate;
	}

	@Column(name = "EXTRA_DUTY_CD", nullable = false, length = 2)
	public String getExtraDutyCd() {
		return this.extraDutyCd;
	}

	public void setExtraDutyCd(String extraDutyCd) {
		this.extraDutyCd = extraDutyCd;
	}

	@Column(name = "SUPPL_TYP", nullable = false, length = 1)
	public char getSupplTyp() {
		return this.supplTyp;
	}

	public void setSupplTyp(char supplTyp) {
		this.supplTyp = supplTyp;
	}

	@Column(name = "HRS_PER_DAY", nullable = false, precision = 5, scale = 3)
	public BigDecimal getHrsPerDay() {
		return this.hrsPerDay;
	}

	public void setHrsPerDay(BigDecimal hrsPerDay) {
		this.hrsPerDay = hrsPerDay;
	}

	@Column(name = "DAY_EMPLD_PCT", nullable = false, precision = 3)
	public BigDecimal getDayEmpldPct() {
		return this.dayEmpldPct;
	}

	public void setDayEmpldPct(BigDecimal dayEmpldPct) {
		this.dayEmpldPct = dayEmpldPct;
	}

	@Column(name = "PCT_OF_YR", nullable = false, precision = 3)
	public BigDecimal getPctOfYr() {
		return this.pctOfYr;
	}

	public void setPctOfYr(BigDecimal pctOfYr) {
		this.pctOfYr = pctOfYr;
	}

	@Column(name = "CONTR_DT_BEG", nullable = false, length = 8)
	public String getContrDtBeg() {
		return this.contrDtBeg;
	}

	public void setContrDtBeg(String contrDtBeg) {
		this.contrDtBeg = contrDtBeg;
	}

	@Column(name = "CONTR_DT_END", nullable = false, length = 8)
	public String getContrDtEnd() {
		return this.contrDtEnd;
	}

	public void setContrDtEnd(String contrDtEnd) {
		this.contrDtEnd = contrDtEnd;
	}

	@Column(name = "DT_PAYOFF", nullable = false, length = 8)
	public String getDtPayoff() {
		return this.dtPayoff;
	}

	public void setDtPayoff(String dtPayoff) {
		this.dtPayoff = dtPayoff;
	}

	@Column(name = "JOB_CD", nullable = false, length = 4)
	public String getJobCd() {
		return this.jobCd;
	}

	public void setJobCd(String jobCd) {
		this.jobCd = jobCd;
	}

	@Column(name = "PRIM_JOB", nullable = false, length = 1)
	public char getPrimJob() {
		return this.primJob;
	}

	public void setPrimJob(char primJob) {
		this.primJob = primJob;
	}

	@Column(name = "NBR_REMAIN_PYMTS", nullable = false, precision = 3, scale = 0)
	public short getNbrRemainPymts() {
		return this.nbrRemainPymts;
	}

	public void setNbrRemainPymts(short nbrRemainPymts) {
		this.nbrRemainPymts = nbrRemainPymts;
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

	@Column(name = "EQUIV_UNTS", nullable = false, precision = 3)
	public BigDecimal getEquivUnts() {
		return this.equivUnts;
	}

	public void setEquivUnts(BigDecimal equivUnts) {
		this.equivUnts = equivUnts;
	}

	@Column(name = "FOY_EOY_IND", nullable = false, length = 1)
	public char getFoyEoyInd() {
		return this.foyEoyInd;
	}

	public void setFoyEoyInd(char foyEoyInd) {
		this.foyEoyInd = foyEoyInd;
	}

	@Column(name = "CREATE_BY_CD", nullable = false, length = 3)
	public String getCreateByCd() {
		return this.createByCd;
	}

	public void setCreateByCd(String createByCd) {
		this.createByCd = createByCd;
	}

	@Column(name = "FRST_PAYDT_CD", nullable = false, length = 3)
	public String getFrstPaydtCd() {
		return this.frstPaydtCd;
	}

	public void setFrstPaydtCd(String frstPaydtCd) {
		this.frstPaydtCd = frstPaydtCd;
	}

	@Column(name = "SUPPL_PAY_1TIME", nullable = false, length = 1)
	public char getSupplPay1time() {
		return this.supplPay1time;
	}

	public void setSupplPay1time(char supplPay1time) {
		this.supplPay1time = supplPay1time;
	}

	@Column(name = "OCC_PAY_TYP", nullable = false, length = 1)
	public char getOccPayTyp() {
		return this.occPayTyp;
	}

	public void setOccPayTyp(char occPayTyp) {
		this.occPayTyp = occPayTyp;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Column(name = "POS_DESCR", nullable = false, length = 30)
	public String getPosDescr() {
		return this.posDescr;
	}

	public void setPosDescr(String posDescr) {
		this.posDescr = posDescr;
	}

}