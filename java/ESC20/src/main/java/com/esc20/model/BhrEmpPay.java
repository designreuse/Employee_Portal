package com.esc20.model;
// Generated Jan 4, 2019 3:42:31 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * BhrEmpPay generated by hbm2java
 */
@Entity
@Table(name = "BHR_EMP_PAY", schema = "rsccc", catalog = "rsccc")
public class BhrEmpPay implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrEmpPayId id;
	private Character statCd;
	private String payCampus;
	private Character payDept;
	private Character unempEligFlg;
	private BigDecimal extraDutyAnnual;
	private BigDecimal extraDutyAnnualLocl;
	private Character maritalStatTax;
	private Integer nbrTaxExempts;
	private Character ficaElig;
	private Character taxExempt;
	private BigDecimal minFoundAmt;
	private Short nbrMonContr;
	private Short actDaysContr;
	private Character eic;
	private String dtPayoff;
	private BigDecimal longevityPay;
	private String trsBeginDt;
	private Character trsClassCd;
	private Character trsFeePaidFlg;
	private Character trsStatCd;
	private Character trsNonStdCd;
	private Character trsNonStdZero;
	private Character trsNonStdRpt;
	private BigDecimal trsNonStdGross;
	private BigDecimal trsNonStdDeposit;
	private BigDecimal busAllowanceNontax;
	private String busAllowancePaymntsNontax;
	private Character accruCd;
	private BigDecimal accruRate;
	private BigDecimal accruDaysEarned;
	private String dtLUpdate;
	private String dtLPayrun;
	private String dtLAdj;
	private BigDecimal loclPay;
	private Character catastrophicLvFlg;
	private BigDecimal dockRate;
	private Character frozenFlg;
	private String sickLvBank;
	private String nonInstrParaProCd;
	private Integer stp0Salary;
	private String excPersBusSem;
	private String stOldPayGrd;
	private BigDecimal whollySepAmt;
	private Character eoyAccruFlg;
	private String certMon;
	private BigDecimal busAllowanceTax;
	private String busAllowancePaymntsTax;
	private Character trsActiveCareEligFlg;
	private BigDecimal trsSupplRemainComp;
	private Short trsSupplNbrRemainPymts;
	private boolean trsSupplCompFactor;
	private Character trsSupplEligCd;
	private String dtEnd90DayPer;
	private String module;
	private Character newPmisEmpFlg;
	private Set<BhrEmpUnemploy> bhrEmpUnemploys = new HashSet<BhrEmpUnemploy>(0);

	public BhrEmpPay() {
	}

	public BhrEmpPay(BhrEmpPayId id, Character statCd, String payCampus, Character payDept, Character unempEligFlg,
			BigDecimal extraDutyAnnual, BigDecimal extraDutyAnnualLocl, Character maritalStatTax, Integer nbrTaxExempts,
			Character ficaElig, Character taxExempt, BigDecimal minFoundAmt, Short nbrMonContr, Short actDaysContr, Character eic,
			String dtPayoff, BigDecimal longevityPay, String trsBeginDt, Character trsClassCd, Character trsFeePaidFlg,
			Character trsStatCd, Character trsNonStdCd, Character trsNonStdZero, Character trsNonStdRpt, BigDecimal trsNonStdGross,
			BigDecimal trsNonStdDeposit, BigDecimal busAllowanceNontax, String busAllowancePaymntsNontax, Character accruCd,
			BigDecimal accruRate, BigDecimal accruDaysEarned, String dtLUpdate, String dtLPayrun, String dtLAdj,
			BigDecimal loclPay, Character catastrophicLvFlg, BigDecimal dockRate, Character frozenFlg, String sickLvBank,
			String nonInstrParaProCd, Integer stp0Salary, String excPersBusSem, String stOldPayGrd, BigDecimal whollySepAmt,
			Character eoyAccruFlg, String certMon, BigDecimal busAllowanceTax, String busAllowancePaymntsTax,
			Character trsActiveCareEligFlg, BigDecimal trsSupplRemainComp, Short trsSupplNbrRemainPymts,
			boolean trsSupplCompFactor, Character trsSupplEligCd, String dtEnd90DayPer, String module, Character newPmisEmpFlg) {
		this.id = id;
		this.statCd = statCd;
		this.payCampus = payCampus;
		this.payDept = payDept;
		this.unempEligFlg = unempEligFlg;
		this.extraDutyAnnual = extraDutyAnnual;
		this.extraDutyAnnualLocl = extraDutyAnnualLocl;
		this.maritalStatTax = maritalStatTax;
		this.nbrTaxExempts = nbrTaxExempts;
		this.ficaElig = ficaElig;
		this.taxExempt = taxExempt;
		this.minFoundAmt = minFoundAmt;
		this.nbrMonContr = nbrMonContr;
		this.actDaysContr = actDaysContr;
		this.eic = eic;
		this.dtPayoff = dtPayoff;
		this.longevityPay = longevityPay;
		this.trsBeginDt = trsBeginDt;
		this.trsClassCd = trsClassCd;
		this.trsFeePaidFlg = trsFeePaidFlg;
		this.trsStatCd = trsStatCd;
		this.trsNonStdCd = trsNonStdCd;
		this.trsNonStdZero = trsNonStdZero;
		this.trsNonStdRpt = trsNonStdRpt;
		this.trsNonStdGross = trsNonStdGross;
		this.trsNonStdDeposit = trsNonStdDeposit;
		this.busAllowanceNontax = busAllowanceNontax;
		this.busAllowancePaymntsNontax = busAllowancePaymntsNontax;
		this.accruCd = accruCd;
		this.accruRate = accruRate;
		this.accruDaysEarned = accruDaysEarned;
		this.dtLUpdate = dtLUpdate;
		this.dtLPayrun = dtLPayrun;
		this.dtLAdj = dtLAdj;
		this.loclPay = loclPay;
		this.catastrophicLvFlg = catastrophicLvFlg;
		this.dockRate = dockRate;
		this.frozenFlg = frozenFlg;
		this.sickLvBank = sickLvBank;
		this.nonInstrParaProCd = nonInstrParaProCd;
		this.stp0Salary = stp0Salary;
		this.excPersBusSem = excPersBusSem;
		this.stOldPayGrd = stOldPayGrd;
		this.whollySepAmt = whollySepAmt;
		this.eoyAccruFlg = eoyAccruFlg;
		this.certMon = certMon;
		this.busAllowanceTax = busAllowanceTax;
		this.busAllowancePaymntsTax = busAllowancePaymntsTax;
		this.trsActiveCareEligFlg = trsActiveCareEligFlg;
		this.trsSupplRemainComp = trsSupplRemainComp;
		this.trsSupplNbrRemainPymts = trsSupplNbrRemainPymts;
		this.trsSupplCompFactor = trsSupplCompFactor;
		this.trsSupplEligCd = trsSupplEligCd;
		this.dtEnd90DayPer = dtEnd90DayPer;
		this.module = module;
		this.newPmisEmpFlg = newPmisEmpFlg;
	}

	public BhrEmpPay(BhrEmpPayId id, Character statCd, String payCampus, Character payDept, Character unempEligFlg,
			BigDecimal extraDutyAnnual, BigDecimal extraDutyAnnualLocl, Character maritalStatTax, Integer nbrTaxExempts,
			Character ficaElig, Character taxExempt, BigDecimal minFoundAmt, Short nbrMonContr, Short actDaysContr, Character eic,
			String dtPayoff, BigDecimal longevityPay, String trsBeginDt, Character trsClassCd, Character trsFeePaidFlg,
			Character trsStatCd, Character trsNonStdCd, Character trsNonStdZero, Character trsNonStdRpt, BigDecimal trsNonStdGross,
			BigDecimal trsNonStdDeposit, BigDecimal busAllowanceNontax, String busAllowancePaymntsNontax, Character accruCd,
			BigDecimal accruRate, BigDecimal accruDaysEarned, String dtLUpdate, String dtLPayrun, String dtLAdj,
			BigDecimal loclPay, Character catastrophicLvFlg, BigDecimal dockRate, Character frozenFlg, String sickLvBank,
			String nonInstrParaProCd, Integer stp0Salary, String excPersBusSem, String stOldPayGrd, BigDecimal whollySepAmt,
			Character eoyAccruFlg, String certMon, BigDecimal busAllowanceTax, String busAllowancePaymntsTax,
			Character trsActiveCareEligFlg, BigDecimal trsSupplRemainComp, Short trsSupplNbrRemainPymts,
			boolean trsSupplCompFactor, Character trsSupplEligCd, String dtEnd90DayPer, String module, Character newPmisEmpFlg,
			Set<BhrEmpUnemploy> bhrEmpUnemploys) {
		this.id = id;
		this.statCd = statCd;
		this.payCampus = payCampus;
		this.payDept = payDept;
		this.unempEligFlg = unempEligFlg;
		this.extraDutyAnnual = extraDutyAnnual;
		this.extraDutyAnnualLocl = extraDutyAnnualLocl;
		this.maritalStatTax = maritalStatTax;
		this.nbrTaxExempts = nbrTaxExempts;
		this.ficaElig = ficaElig;
		this.taxExempt = taxExempt;
		this.minFoundAmt = minFoundAmt;
		this.nbrMonContr = nbrMonContr;
		this.actDaysContr = actDaysContr;
		this.eic = eic;
		this.dtPayoff = dtPayoff;
		this.longevityPay = longevityPay;
		this.trsBeginDt = trsBeginDt;
		this.trsClassCd = trsClassCd;
		this.trsFeePaidFlg = trsFeePaidFlg;
		this.trsStatCd = trsStatCd;
		this.trsNonStdCd = trsNonStdCd;
		this.trsNonStdZero = trsNonStdZero;
		this.trsNonStdRpt = trsNonStdRpt;
		this.trsNonStdGross = trsNonStdGross;
		this.trsNonStdDeposit = trsNonStdDeposit;
		this.busAllowanceNontax = busAllowanceNontax;
		this.busAllowancePaymntsNontax = busAllowancePaymntsNontax;
		this.accruCd = accruCd;
		this.accruRate = accruRate;
		this.accruDaysEarned = accruDaysEarned;
		this.dtLUpdate = dtLUpdate;
		this.dtLPayrun = dtLPayrun;
		this.dtLAdj = dtLAdj;
		this.loclPay = loclPay;
		this.catastrophicLvFlg = catastrophicLvFlg;
		this.dockRate = dockRate;
		this.frozenFlg = frozenFlg;
		this.sickLvBank = sickLvBank;
		this.nonInstrParaProCd = nonInstrParaProCd;
		this.stp0Salary = stp0Salary;
		this.excPersBusSem = excPersBusSem;
		this.stOldPayGrd = stOldPayGrd;
		this.whollySepAmt = whollySepAmt;
		this.eoyAccruFlg = eoyAccruFlg;
		this.certMon = certMon;
		this.busAllowanceTax = busAllowanceTax;
		this.busAllowancePaymntsTax = busAllowancePaymntsTax;
		this.trsActiveCareEligFlg = trsActiveCareEligFlg;
		this.trsSupplRemainComp = trsSupplRemainComp;
		this.trsSupplNbrRemainPymts = trsSupplNbrRemainPymts;
		this.trsSupplCompFactor = trsSupplCompFactor;
		this.trsSupplEligCd = trsSupplEligCd;
		this.dtEnd90DayPer = dtEnd90DayPer;
		this.module = module;
		this.newPmisEmpFlg = newPmisEmpFlg;
		this.bhrEmpUnemploys = bhrEmpUnemploys;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)) })
	public BhrEmpPayId getId() {
		return this.id;
	}

	public void setId(BhrEmpPayId id) {
		this.id = id;
	}

	@Column(name = "STAT_CD", nullable = false, length = 1)
	public Character getStatCd() {
		return this.statCd;
	}

	public void setStatCd(Character statCd) {
		this.statCd = statCd;
	}

	@Column(name = "PAY_CAMPUS", nullable = false, length = 3)
	public String getPayCampus() {
		return this.payCampus;
	}

	public void setPayCampus(String payCampus) {
		this.payCampus = payCampus;
	}

	@Column(name = "PAY_DEPT", nullable = false, length = 1)
	public Character getPayDept() {
		return this.payDept;
	}

	public void setPayDept(Character payDept) {
		this.payDept = payDept;
	}

	@Column(name = "UNEMP_ELIG_FLG", nullable = false, length = 1)
	public Character getUnempEligFlg() {
		return this.unempEligFlg;
	}

	public void setUnempEligFlg(Character unempEligFlg) {
		this.unempEligFlg = unempEligFlg;
	}

	@Column(name = "EXTRA_DUTY_ANNUAL", nullable = false, precision = 9)
	public BigDecimal getExtraDutyAnnual() {
		return this.extraDutyAnnual;
	}

	public void setExtraDutyAnnual(BigDecimal extraDutyAnnual) {
		this.extraDutyAnnual = extraDutyAnnual;
	}

	@Column(name = "EXTRA_DUTY_ANNUAL_LOCL", nullable = false, precision = 9)
	public BigDecimal getExtraDutyAnnualLocl() {
		return this.extraDutyAnnualLocl;
	}

	public void setExtraDutyAnnualLocl(BigDecimal extraDutyAnnualLocl) {
		this.extraDutyAnnualLocl = extraDutyAnnualLocl;
	}

	@Column(name = "MARITAL_STAT_TAX", nullable = false, length = 1)
	public Character getMaritalStatTax() {
		return this.maritalStatTax;
	}

	public void setMaritalStatTax(Character maritalStatTax) {
		this.maritalStatTax = maritalStatTax;
	}

	@Column(name = "NBR_TAX_EXEMPTS", nullable = false, precision = 3, scale = 0)
	public Integer getNbrTaxExempts() {
		return this.nbrTaxExempts;
	}

	public void setNbrTaxExempts(Integer nbrTaxExempts) {
		this.nbrTaxExempts = nbrTaxExempts;
	}

	@Column(name = "FICA_ELIG", nullable = false, length = 1)
	public Character getFicaElig() {
		return this.ficaElig;
	}

	public void setFicaElig(Character ficaElig) {
		this.ficaElig = ficaElig;
	}

	@Column(name = "TAX_EXEMPT", nullable = false, length = 1)
	public Character getTaxExempt() {
		return this.taxExempt;
	}

	public void setTaxExempt(Character taxExempt) {
		this.taxExempt = taxExempt;
	}

	@Column(name = "MIN_FOUND_AMT", nullable = false, precision = 9)
	public BigDecimal getMinFoundAmt() {
		return this.minFoundAmt;
	}

	public void setMinFoundAmt(BigDecimal minFoundAmt) {
		this.minFoundAmt = minFoundAmt;
	}

	@Column(name = "NBR_MON_CONTR", nullable = false, precision = 3, scale = 0)
	public Short getNbrMonContr() {
		return this.nbrMonContr;
	}

	public void setNbrMonContr(Short nbrMonContr) {
		this.nbrMonContr = nbrMonContr;
	}

	@Column(name = "ACT_DAYS_CONTR", nullable = false, precision = 3, scale = 0)
	public Short getActDaysContr() {
		return this.actDaysContr;
	}

	public void setActDaysContr(Short actDaysContr) {
		this.actDaysContr = actDaysContr;
	}

	@Column(name = "EIC", nullable = false, length = 1)
	public Character getEic() {
		return this.eic;
	}

	public void setEic(Character eic) {
		this.eic = eic;
	}

	@Column(name = "DT_PAYOFF", nullable = false, length = 8)
	public String getDtPayoff() {
		return this.dtPayoff;
	}

	public void setDtPayoff(String dtPayoff) {
		this.dtPayoff = dtPayoff;
	}

	@Column(name = "LONGEVITY_PAY", nullable = false, precision = 9)
	public BigDecimal getLongevityPay() {
		return this.longevityPay;
	}

	public void setLongevityPay(BigDecimal longevityPay) {
		this.longevityPay = longevityPay;
	}

	@Column(name = "TRS_BEGIN_DT", nullable = false, length = 8)
	public String getTrsBeginDt() {
		return this.trsBeginDt;
	}

	public void setTrsBeginDt(String trsBeginDt) {
		this.trsBeginDt = trsBeginDt;
	}

	@Column(name = "TRS_CLASS_CD", nullable = false, length = 1)
	public Character getTrsClassCd() {
		return this.trsClassCd;
	}

	public void setTrsClassCd(Character trsClassCd) {
		this.trsClassCd = trsClassCd;
	}

	@Column(name = "TRS_FEE_PAID_FLG", nullable = false, length = 1)
	public Character getTrsFeePaidFlg() {
		return this.trsFeePaidFlg;
	}

	public void setTrsFeePaidFlg(Character trsFeePaidFlg) {
		this.trsFeePaidFlg = trsFeePaidFlg;
	}

	@Column(name = "TRS_STAT_CD", nullable = false, length = 1)
	public Character getTrsStatCd() {
		return this.trsStatCd;
	}

	public void setTrsStatCd(Character trsStatCd) {
		this.trsStatCd = trsStatCd;
	}

	@Column(name = "TRS_NON_STD_CD", nullable = false, length = 1)
	public Character getTrsNonStdCd() {
		return this.trsNonStdCd;
	}

	public void setTrsNonStdCd(Character trsNonStdCd) {
		this.trsNonStdCd = trsNonStdCd;
	}

	@Column(name = "TRS_NON_STD_ZERO", nullable = false, length = 1)
	public Character getTrsNonStdZero() {
		return this.trsNonStdZero;
	}

	public void setTrsNonStdZero(Character trsNonStdZero) {
		this.trsNonStdZero = trsNonStdZero;
	}

	@Column(name = "TRS_NON_STD_RPT", nullable = false, length = 1)
	public Character getTrsNonStdRpt() {
		return this.trsNonStdRpt;
	}

	public void setTrsNonStdRpt(Character trsNonStdRpt) {
		this.trsNonStdRpt = trsNonStdRpt;
	}

	@Column(name = "TRS_NON_STD_GROSS", nullable = false, precision = 9)
	public BigDecimal getTrsNonStdGross() {
		return this.trsNonStdGross;
	}

	public void setTrsNonStdGross(BigDecimal trsNonStdGross) {
		this.trsNonStdGross = trsNonStdGross;
	}

	@Column(name = "TRS_NON_STD_DEPOSIT", nullable = false, precision = 9)
	public BigDecimal getTrsNonStdDeposit() {
		return this.trsNonStdDeposit;
	}

	public void setTrsNonStdDeposit(BigDecimal trsNonStdDeposit) {
		this.trsNonStdDeposit = trsNonStdDeposit;
	}

	@Column(name = "BUS_ALLOWANCE_NONTAX", nullable = false, precision = 9)
	public BigDecimal getBusAllowanceNontax() {
		return this.busAllowanceNontax;
	}

	public void setBusAllowanceNontax(BigDecimal busAllowanceNontax) {
		this.busAllowanceNontax = busAllowanceNontax;
	}

	@Column(name = "BUS_ALLOWANCE_PAYMNTS_NONTAX", nullable = false, length = 2)
	public String getBusAllowancePaymntsNontax() {
		return this.busAllowancePaymntsNontax;
	}

	public void setBusAllowancePaymntsNontax(String busAllowancePaymntsNontax) {
		this.busAllowancePaymntsNontax = busAllowancePaymntsNontax;
	}

	@Column(name = "ACCRU_CD", nullable = false, length = 1)
	public Character getAccruCd() {
		return this.accruCd;
	}

	public void setAccruCd(Character accruCd) {
		this.accruCd = accruCd;
	}

	@Column(name = "ACCRU_RATE", nullable = false, precision = 7, scale = 3)
	public BigDecimal getAccruRate() {
		return this.accruRate;
	}

	public void setAccruRate(BigDecimal accruRate) {
		this.accruRate = accruRate;
	}

	@Column(name = "ACCRU_DAYS_EARNED", nullable = false, precision = 5)
	public BigDecimal getAccruDaysEarned() {
		return this.accruDaysEarned;
	}

	public void setAccruDaysEarned(BigDecimal accruDaysEarned) {
		this.accruDaysEarned = accruDaysEarned;
	}

	@Column(name = "DT_L_UPDATE", nullable = false, length = 8)
	public String getDtLUpdate() {
		return this.dtLUpdate;
	}

	public void setDtLUpdate(String dtLUpdate) {
		this.dtLUpdate = dtLUpdate;
	}

	@Column(name = "DT_L_PAYRUN", nullable = false, length = 8)
	public String getDtLPayrun() {
		return this.dtLPayrun;
	}

	public void setDtLPayrun(String dtLPayrun) {
		this.dtLPayrun = dtLPayrun;
	}

	@Column(name = "DT_L_ADJ", nullable = false, length = 8)
	public String getDtLAdj() {
		return this.dtLAdj;
	}

	public void setDtLAdj(String dtLAdj) {
		this.dtLAdj = dtLAdj;
	}

	@Column(name = "LOCL_PAY", nullable = false, precision = 9)
	public BigDecimal getLoclPay() {
		return this.loclPay;
	}

	public void setLoclPay(BigDecimal loclPay) {
		this.loclPay = loclPay;
	}

	@Column(name = "CATASTROPHIC_LV_FLG", nullable = false, length = 1)
	public Character getCatastrophicLvFlg() {
		return this.catastrophicLvFlg;
	}

	public void setCatastrophicLvFlg(Character catastrophicLvFlg) {
		this.catastrophicLvFlg = catastrophicLvFlg;
	}

	@Column(name = "DOCK_RATE", nullable = false, precision = 7, scale = 3)
	public BigDecimal getDockRate() {
		return this.dockRate;
	}

	public void setDockRate(BigDecimal dockRate) {
		this.dockRate = dockRate;
	}

	@Column(name = "FROZEN_FLG", nullable = false, length = 1)
	public Character getFrozenFlg() {
		return this.frozenFlg;
	}

	public void setFrozenFlg(Character frozenFlg) {
		this.frozenFlg = frozenFlg;
	}

	@Column(name = "SICK_LV_BANK", nullable = false, length = 2)
	public String getSickLvBank() {
		return this.sickLvBank;
	}

	public void setSickLvBank(String sickLvBank) {
		this.sickLvBank = sickLvBank;
	}

	@Column(name = "NON_INSTR_PARA_PRO_CD", nullable = false, length = 2)
	public String getNonInstrParaProCd() {
		return this.nonInstrParaProCd;
	}

	public void setNonInstrParaProCd(String nonInstrParaProCd) {
		this.nonInstrParaProCd = nonInstrParaProCd;
	}

	@Column(name = "STP_0_SALARY", nullable = false, precision = 5, scale = 0)
	public Integer getStp0Salary() {
		return this.stp0Salary;
	}

	public void setStp0Salary(Integer stp0Salary) {
		this.stp0Salary = stp0Salary;
	}

	@Column(name = "EXC_PERS_BUS_SEM", nullable = false, length = 2)
	public String getExcPersBusSem() {
		return this.excPersBusSem;
	}

	public void setExcPersBusSem(String excPersBusSem) {
		this.excPersBusSem = excPersBusSem;
	}

	@Column(name = "ST_OLD_PAY_GRD", nullable = false, length = 3)
	public String getStOldPayGrd() {
		return this.stOldPayGrd;
	}

	public void setStOldPayGrd(String stOldPayGrd) {
		this.stOldPayGrd = stOldPayGrd;
	}

	@Column(name = "WHOLLY_SEP_AMT", nullable = false, precision = 7)
	public BigDecimal getWhollySepAmt() {
		return this.whollySepAmt;
	}

	public void setWhollySepAmt(BigDecimal whollySepAmt) {
		this.whollySepAmt = whollySepAmt;
	}

	@Column(name = "EOY_ACCRU_FLG", nullable = false, length = 1)
	public Character getEoyAccruFlg() {
		return this.eoyAccruFlg;
	}

	public void setEoyAccruFlg(Character eoyAccruFlg) {
		this.eoyAccruFlg = eoyAccruFlg;
	}

	@Column(name = "CERT_MON", nullable = false, length = 2)
	public String getCertMon() {
		return this.certMon;
	}

	public void setCertMon(String certMon) {
		this.certMon = certMon;
	}

	@Column(name = "BUS_ALLOWANCE_TAX", nullable = false, precision = 9)
	public BigDecimal getBusAllowanceTax() {
		return this.busAllowanceTax;
	}

	public void setBusAllowanceTax(BigDecimal busAllowanceTax) {
		this.busAllowanceTax = busAllowanceTax;
	}

	@Column(name = "BUS_ALLOWANCE_PAYMNTS_TAX", nullable = false, length = 2)
	public String getBusAllowancePaymntsTax() {
		return this.busAllowancePaymntsTax;
	}

	public void setBusAllowancePaymntsTax(String busAllowancePaymntsTax) {
		this.busAllowancePaymntsTax = busAllowancePaymntsTax;
	}

	@Column(name = "TRS_ACTIVE_CARE_ELIG_FLG", nullable = false, length = 1)
	public Character getTrsActiveCareEligFlg() {
		return this.trsActiveCareEligFlg;
	}

	public void setTrsActiveCareEligFlg(Character trsActiveCareEligFlg) {
		this.trsActiveCareEligFlg = trsActiveCareEligFlg;
	}

	@Column(name = "TRS_SUPPL_REMAIN_COMP", nullable = false, precision = 7)
	public BigDecimal getTrsSupplRemainComp() {
		return this.trsSupplRemainComp;
	}

	public void setTrsSupplRemainComp(BigDecimal trsSupplRemainComp) {
		this.trsSupplRemainComp = trsSupplRemainComp;
	}

	@Column(name = "TRS_SUPPL_NBR_REMAIN_PYMTS", nullable = false, precision = 3, scale = 0)
	public Short getTrsSupplNbrRemainPymts() {
		return this.trsSupplNbrRemainPymts;
	}

	public void setTrsSupplNbrRemainPymts(Short trsSupplNbrRemainPymts) {
		this.trsSupplNbrRemainPymts = trsSupplNbrRemainPymts;
	}

	@Column(name = "TRS_SUPPL_COMP_FACTOR", nullable = false, precision = 1, scale = 0)
	public boolean isTrsSupplCompFactor() {
		return this.trsSupplCompFactor;
	}

	public void setTrsSupplCompFactor(boolean trsSupplCompFactor) {
		this.trsSupplCompFactor = trsSupplCompFactor;
	}

	@Column(name = "TRS_SUPPL_ELIG_CD", nullable = false, length = 1)
	public Character getTrsSupplEligCd() {
		return this.trsSupplEligCd;
	}

	public void setTrsSupplEligCd(Character trsSupplEligCd) {
		this.trsSupplEligCd = trsSupplEligCd;
	}

	@Column(name = "DT_END_90_DAY_PER", nullable = false, length = 8)
	public String getDtEnd90DayPer() {
		return this.dtEnd90DayPer;
	}

	public void setDtEnd90DayPer(String dtEnd90DayPer) {
		this.dtEnd90DayPer = dtEnd90DayPer;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Column(name = "NEW_PMIS_EMP_FLG", nullable = false, length = 1)
	public Character getNewPmisEmpFlg() {
		return this.newPmisEmpFlg;
	}

	public void setNewPmisEmpFlg(Character newPmisEmpFlg) {
		this.newPmisEmpFlg = newPmisEmpFlg;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bhrEmpPay")
	public Set<BhrEmpUnemploy> getBhrEmpUnemploys() {
		return this.bhrEmpUnemploys;
	}

	public void setBhrEmpUnemploys(Set<BhrEmpUnemploy> bhrEmpUnemploys) {
		this.bhrEmpUnemploys = bhrEmpUnemploys;
	}

}
