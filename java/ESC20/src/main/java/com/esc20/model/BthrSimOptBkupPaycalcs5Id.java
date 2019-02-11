package com.esc20.model;
// Generated Jan 4, 2019 3:54:39 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BthrSimOptBkupPaycalcs5Id generated by hbm2java
 */
@Embeddable
public class BthrSimOptBkupPaycalcs5Id implements java.io.Serializable {

	private char cyrNyrFlg;
	private String simName;
	private String simDescr;
	private String usrId;
	private char updtFrcstFlg;
	private char updtBudFlg;
	private char inclProposPos;
	private char inclVacSupplPos;
	private char incrPayStp;
	private byte maxAnnlPayStp;
	private byte maxHrlyPayStp;
	private char incrStStp;
	private char actToBudInd;
	private char updtBudAmtFlg;
	private char updtBudRndFlg;
	private char inclTrsOnbehalfCalcs;
	private String trsOnBehalfExpAcct;
	private char midpntSalUpdtFlg;
	private char incrSalToMidpntMin;
	private char inclTeaHlthIns;
	private String module;

	public BthrSimOptBkupPaycalcs5Id() {
	}

	public BthrSimOptBkupPaycalcs5Id(char cyrNyrFlg, String simName, String simDescr, String usrId, char updtFrcstFlg,
			char updtBudFlg, char inclProposPos, char inclVacSupplPos, char incrPayStp, byte maxAnnlPayStp,
			byte maxHrlyPayStp, char incrStStp, char actToBudInd, char updtBudAmtFlg, char updtBudRndFlg,
			char inclTrsOnbehalfCalcs, String trsOnBehalfExpAcct, char midpntSalUpdtFlg, char incrSalToMidpntMin,
			char inclTeaHlthIns, String module) {
		this.cyrNyrFlg = cyrNyrFlg;
		this.simName = simName;
		this.simDescr = simDescr;
		this.usrId = usrId;
		this.updtFrcstFlg = updtFrcstFlg;
		this.updtBudFlg = updtBudFlg;
		this.inclProposPos = inclProposPos;
		this.inclVacSupplPos = inclVacSupplPos;
		this.incrPayStp = incrPayStp;
		this.maxAnnlPayStp = maxAnnlPayStp;
		this.maxHrlyPayStp = maxHrlyPayStp;
		this.incrStStp = incrStStp;
		this.actToBudInd = actToBudInd;
		this.updtBudAmtFlg = updtBudAmtFlg;
		this.updtBudRndFlg = updtBudRndFlg;
		this.inclTrsOnbehalfCalcs = inclTrsOnbehalfCalcs;
		this.trsOnBehalfExpAcct = trsOnBehalfExpAcct;
		this.midpntSalUpdtFlg = midpntSalUpdtFlg;
		this.incrSalToMidpntMin = incrSalToMidpntMin;
		this.inclTeaHlthIns = inclTeaHlthIns;
		this.module = module;
	}

	@Column(name = "CYR_NYR_FLG", nullable = false, length = 1)
	public char getCyrNyrFlg() {
		return this.cyrNyrFlg;
	}

	public void setCyrNyrFlg(char cyrNyrFlg) {
		this.cyrNyrFlg = cyrNyrFlg;
	}

	@Column(name = "SIM_NAME", nullable = false, length = 7)
	public String getSimName() {
		return this.simName;
	}

	public void setSimName(String simName) {
		this.simName = simName;
	}

	@Column(name = "SIM_DESCR", nullable = false, length = 30)
	public String getSimDescr() {
		return this.simDescr;
	}

	public void setSimDescr(String simDescr) {
		this.simDescr = simDescr;
	}

	@Column(name = "USR_ID", nullable = false, length = 12)
	public String getUsrId() {
		return this.usrId;
	}

	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	@Column(name = "UPDT_FRCST_FLG", nullable = false, length = 1)
	public char getUpdtFrcstFlg() {
		return this.updtFrcstFlg;
	}

	public void setUpdtFrcstFlg(char updtFrcstFlg) {
		this.updtFrcstFlg = updtFrcstFlg;
	}

	@Column(name = "UPDT_BUD_FLG", nullable = false, length = 1)
	public char getUpdtBudFlg() {
		return this.updtBudFlg;
	}

	public void setUpdtBudFlg(char updtBudFlg) {
		this.updtBudFlg = updtBudFlg;
	}

	@Column(name = "INCL_PROPOS_POS", nullable = false, length = 1)
	public char getInclProposPos() {
		return this.inclProposPos;
	}

	public void setInclProposPos(char inclProposPos) {
		this.inclProposPos = inclProposPos;
	}

	@Column(name = "INCL_VAC_SUPPL_POS", nullable = false, length = 1)
	public char getInclVacSupplPos() {
		return this.inclVacSupplPos;
	}

	public void setInclVacSupplPos(char inclVacSupplPos) {
		this.inclVacSupplPos = inclVacSupplPos;
	}

	@Column(name = "INCR_PAY_STP", nullable = false, length = 1)
	public char getIncrPayStp() {
		return this.incrPayStp;
	}

	public void setIncrPayStp(char incrPayStp) {
		this.incrPayStp = incrPayStp;
	}

	@Column(name = "MAX_ANNL_PAY_STP", nullable = false, precision = 2, scale = 0)
	public byte getMaxAnnlPayStp() {
		return this.maxAnnlPayStp;
	}

	public void setMaxAnnlPayStp(byte maxAnnlPayStp) {
		this.maxAnnlPayStp = maxAnnlPayStp;
	}

	@Column(name = "MAX_HRLY_PAY_STP", nullable = false, precision = 2, scale = 0)
	public byte getMaxHrlyPayStp() {
		return this.maxHrlyPayStp;
	}

	public void setMaxHrlyPayStp(byte maxHrlyPayStp) {
		this.maxHrlyPayStp = maxHrlyPayStp;
	}

	@Column(name = "INCR_ST_STP", nullable = false, length = 1)
	public char getIncrStStp() {
		return this.incrStStp;
	}

	public void setIncrStStp(char incrStStp) {
		this.incrStStp = incrStStp;
	}

	@Column(name = "ACT_TO_BUD_IND", nullable = false, length = 1)
	public char getActToBudInd() {
		return this.actToBudInd;
	}

	public void setActToBudInd(char actToBudInd) {
		this.actToBudInd = actToBudInd;
	}

	@Column(name = "UPDT_BUD_AMT_FLG", nullable = false, length = 1)
	public char getUpdtBudAmtFlg() {
		return this.updtBudAmtFlg;
	}

	public void setUpdtBudAmtFlg(char updtBudAmtFlg) {
		this.updtBudAmtFlg = updtBudAmtFlg;
	}

	@Column(name = "UPDT_BUD_RND_FLG", nullable = false, length = 1)
	public char getUpdtBudRndFlg() {
		return this.updtBudRndFlg;
	}

	public void setUpdtBudRndFlg(char updtBudRndFlg) {
		this.updtBudRndFlg = updtBudRndFlg;
	}

	@Column(name = "INCL_TRS_ONBEHALF_CALCS", nullable = false, length = 1)
	public char getInclTrsOnbehalfCalcs() {
		return this.inclTrsOnbehalfCalcs;
	}

	public void setInclTrsOnbehalfCalcs(char inclTrsOnbehalfCalcs) {
		this.inclTrsOnbehalfCalcs = inclTrsOnbehalfCalcs;
	}

	@Column(name = "TRS_ON_BEHALF_EXP_ACCT", nullable = false, length = 20)
	public String getTrsOnBehalfExpAcct() {
		return this.trsOnBehalfExpAcct;
	}

	public void setTrsOnBehalfExpAcct(String trsOnBehalfExpAcct) {
		this.trsOnBehalfExpAcct = trsOnBehalfExpAcct;
	}

	@Column(name = "MIDPNT_SAL_UPDT_FLG", nullable = false, length = 1)
	public char getMidpntSalUpdtFlg() {
		return this.midpntSalUpdtFlg;
	}

	public void setMidpntSalUpdtFlg(char midpntSalUpdtFlg) {
		this.midpntSalUpdtFlg = midpntSalUpdtFlg;
	}

	@Column(name = "INCR_SAL_TO_MIDPNT_MIN", nullable = false, length = 1)
	public char getIncrSalToMidpntMin() {
		return this.incrSalToMidpntMin;
	}

	public void setIncrSalToMidpntMin(char incrSalToMidpntMin) {
		this.incrSalToMidpntMin = incrSalToMidpntMin;
	}

	@Column(name = "INCL_TEA_HLTH_INS", nullable = false, length = 1)
	public char getInclTeaHlthIns() {
		return this.inclTeaHlthIns;
	}

	public void setInclTeaHlthIns(char inclTeaHlthIns) {
		this.inclTeaHlthIns = inclTeaHlthIns;
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
		if (!(other instanceof BthrSimOptBkupPaycalcs5Id))
			return false;
		BthrSimOptBkupPaycalcs5Id castOther = (BthrSimOptBkupPaycalcs5Id) other;

		return (this.getCyrNyrFlg() == castOther.getCyrNyrFlg())
				&& ((this.getSimName() == castOther.getSimName()) || (this.getSimName() != null
						&& castOther.getSimName() != null && this.getSimName().equals(castOther.getSimName())))
				&& ((this.getSimDescr() == castOther.getSimDescr()) || (this.getSimDescr() != null
						&& castOther.getSimDescr() != null && this.getSimDescr().equals(castOther.getSimDescr())))
				&& ((this.getUsrId() == castOther.getUsrId()) || (this.getUsrId() != null
						&& castOther.getUsrId() != null && this.getUsrId().equals(castOther.getUsrId())))
				&& (this.getUpdtFrcstFlg() == castOther.getUpdtFrcstFlg())
				&& (this.getUpdtBudFlg() == castOther.getUpdtBudFlg())
				&& (this.getInclProposPos() == castOther.getInclProposPos())
				&& (this.getInclVacSupplPos() == castOther.getInclVacSupplPos())
				&& (this.getIncrPayStp() == castOther.getIncrPayStp())
				&& (this.getMaxAnnlPayStp() == castOther.getMaxAnnlPayStp())
				&& (this.getMaxHrlyPayStp() == castOther.getMaxHrlyPayStp())
				&& (this.getIncrStStp() == castOther.getIncrStStp())
				&& (this.getActToBudInd() == castOther.getActToBudInd())
				&& (this.getUpdtBudAmtFlg() == castOther.getUpdtBudAmtFlg())
				&& (this.getUpdtBudRndFlg() == castOther.getUpdtBudRndFlg())
				&& (this.getInclTrsOnbehalfCalcs() == castOther.getInclTrsOnbehalfCalcs())
				&& ((this.getTrsOnBehalfExpAcct() == castOther.getTrsOnBehalfExpAcct())
						|| (this.getTrsOnBehalfExpAcct() != null && castOther.getTrsOnBehalfExpAcct() != null
								&& this.getTrsOnBehalfExpAcct().equals(castOther.getTrsOnBehalfExpAcct())))
				&& (this.getMidpntSalUpdtFlg() == castOther.getMidpntSalUpdtFlg())
				&& (this.getIncrSalToMidpntMin() == castOther.getIncrSalToMidpntMin())
				&& (this.getInclTeaHlthIns() == castOther.getInclTeaHlthIns())
				&& ((this.getModule() == castOther.getModule()) || (this.getModule() != null
						&& castOther.getModule() != null && this.getModule().equals(castOther.getModule())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + (getSimName() == null ? 0 : this.getSimName().hashCode());
		result = 37 * result + (getSimDescr() == null ? 0 : this.getSimDescr().hashCode());
		result = 37 * result + (getUsrId() == null ? 0 : this.getUsrId().hashCode());
		result = 37 * result + this.getUpdtFrcstFlg();
		result = 37 * result + this.getUpdtBudFlg();
		result = 37 * result + this.getInclProposPos();
		result = 37 * result + this.getInclVacSupplPos();
		result = 37 * result + this.getIncrPayStp();
		result = 37 * result + this.getMaxAnnlPayStp();
		result = 37 * result + this.getMaxHrlyPayStp();
		result = 37 * result + this.getIncrStStp();
		result = 37 * result + this.getActToBudInd();
		result = 37 * result + this.getUpdtBudAmtFlg();
		result = 37 * result + this.getUpdtBudRndFlg();
		result = 37 * result + this.getInclTrsOnbehalfCalcs();
		result = 37 * result + (getTrsOnBehalfExpAcct() == null ? 0 : this.getTrsOnBehalfExpAcct().hashCode());
		result = 37 * result + this.getMidpntSalUpdtFlg();
		result = 37 * result + this.getIncrSalToMidpntMin();
		result = 37 * result + this.getInclTeaHlthIns();
		result = 37 * result + (getModule() == null ? 0 : this.getModule().hashCode());
		return result;
	}

}
