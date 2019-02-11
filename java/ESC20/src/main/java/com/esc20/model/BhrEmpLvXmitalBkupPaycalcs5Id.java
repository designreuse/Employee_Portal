package com.esc20.model;
// Generated Jan 4, 2019 3:40:36 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrEmpLvXmitalBkupPaycalcs5Id generated by hbm2java
 */
@Embeddable
public class BhrEmpLvXmitalBkupPaycalcs5Id implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private char cyrNyrFlg;
	private char payFreq;
	private String empNbr;
	private String dtOfPay;
	private short lvSeq;
	private String lvTyp;
	private String absRsn;
	private String dtOfAbs;
	private String begTime;
	private BigDecimal lvUnitsUsed;
	private BigDecimal lvUnitsEarned;
	private String subst;
	private String rsn;
	private String processDt;
	private String userId;
	private String module;
	private int lvId;

	public BhrEmpLvXmitalBkupPaycalcs5Id() {
	}

	public BhrEmpLvXmitalBkupPaycalcs5Id(char cyrNyrFlg, char payFreq, String empNbr, String dtOfPay, short lvSeq,
			String lvTyp, String absRsn, String dtOfAbs, String begTime, BigDecimal lvUnitsUsed,
			BigDecimal lvUnitsEarned, String subst, String rsn, String processDt, String userId, String module,
			int lvId) {
		this.cyrNyrFlg = cyrNyrFlg;
		this.payFreq = payFreq;
		this.empNbr = empNbr;
		this.dtOfPay = dtOfPay;
		this.lvSeq = lvSeq;
		this.lvTyp = lvTyp;
		this.absRsn = absRsn;
		this.dtOfAbs = dtOfAbs;
		this.begTime = begTime;
		this.lvUnitsUsed = lvUnitsUsed;
		this.lvUnitsEarned = lvUnitsEarned;
		this.subst = subst;
		this.rsn = rsn;
		this.processDt = processDt;
		this.userId = userId;
		this.module = module;
		this.lvId = lvId;
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

	@Column(name = "DT_OF_PAY", nullable = false, length = 8)
	public String getDtOfPay() {
		return this.dtOfPay;
	}

	public void setDtOfPay(String dtOfPay) {
		this.dtOfPay = dtOfPay;
	}

	@Column(name = "LV_SEQ", nullable = false, precision = 3, scale = 0)
	public short getLvSeq() {
		return this.lvSeq;
	}

	public void setLvSeq(short lvSeq) {
		this.lvSeq = lvSeq;
	}

	@Column(name = "LV_TYP", nullable = false, length = 2)
	public String getLvTyp() {
		return this.lvTyp;
	}

	public void setLvTyp(String lvTyp) {
		this.lvTyp = lvTyp;
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

	@Column(name = "BEG_TIME", nullable = false, length = 6)
	public String getBegTime() {
		return this.begTime;
	}

	public void setBegTime(String begTime) {
		this.begTime = begTime;
	}

	@Column(name = "LV_UNITS_USED", nullable = false, precision = 7, scale = 3)
	public BigDecimal getLvUnitsUsed() {
		return this.lvUnitsUsed;
	}

	public void setLvUnitsUsed(BigDecimal lvUnitsUsed) {
		this.lvUnitsUsed = lvUnitsUsed;
	}

	@Column(name = "LV_UNITS_EARNED", nullable = false, precision = 7, scale = 3)
	public BigDecimal getLvUnitsEarned() {
		return this.lvUnitsEarned;
	}

	public void setLvUnitsEarned(BigDecimal lvUnitsEarned) {
		this.lvUnitsEarned = lvUnitsEarned;
	}

	@Column(name = "SUBST", nullable = false, length = 2)
	public String getSubst() {
		return this.subst;
	}

	public void setSubst(String subst) {
		this.subst = subst;
	}

	@Column(name = "RSN", nullable = false, length = 20)
	public String getRsn() {
		return this.rsn;
	}

	public void setRsn(String rsn) {
		this.rsn = rsn;
	}

	@Column(name = "PROCESS_DT", nullable = false, length = 8)
	public String getProcessDt() {
		return this.processDt;
	}

	public void setProcessDt(String processDt) {
		this.processDt = processDt;
	}

	@Column(name = "USER_ID", nullable = false, length = 12)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Column(name = "LV_ID", nullable = false)
	public int getLvId() {
		return this.lvId;
	}

	public void setLvId(int lvId) {
		this.lvId = lvId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrEmpLvXmitalBkupPaycalcs5Id))
			return false;
		BhrEmpLvXmitalBkupPaycalcs5Id castOther = (BhrEmpLvXmitalBkupPaycalcs5Id) other;

		return (this.getCyrNyrFlg() == castOther.getCyrNyrFlg()) && (this.getPayFreq() == castOther.getPayFreq())
				&& ((this.getEmpNbr() == castOther.getEmpNbr()) || (this.getEmpNbr() != null
						&& castOther.getEmpNbr() != null && this.getEmpNbr().equals(castOther.getEmpNbr())))
				&& ((this.getDtOfPay() == castOther.getDtOfPay()) || (this.getDtOfPay() != null
						&& castOther.getDtOfPay() != null && this.getDtOfPay().equals(castOther.getDtOfPay())))
				&& (this.getLvSeq() == castOther.getLvSeq())
				&& ((this.getLvTyp() == castOther.getLvTyp()) || (this.getLvTyp() != null
						&& castOther.getLvTyp() != null && this.getLvTyp().equals(castOther.getLvTyp())))
				&& ((this.getAbsRsn() == castOther.getAbsRsn()) || (this.getAbsRsn() != null
						&& castOther.getAbsRsn() != null && this.getAbsRsn().equals(castOther.getAbsRsn())))
				&& ((this.getDtOfAbs() == castOther.getDtOfAbs()) || (this.getDtOfAbs() != null
						&& castOther.getDtOfAbs() != null && this.getDtOfAbs().equals(castOther.getDtOfAbs())))
				&& ((this.getBegTime() == castOther.getBegTime()) || (this.getBegTime() != null
						&& castOther.getBegTime() != null && this.getBegTime().equals(castOther.getBegTime())))
				&& ((this.getLvUnitsUsed() == castOther.getLvUnitsUsed())
						|| (this.getLvUnitsUsed() != null && castOther.getLvUnitsUsed() != null
								&& this.getLvUnitsUsed().equals(castOther.getLvUnitsUsed())))
				&& ((this.getLvUnitsEarned() == castOther.getLvUnitsEarned())
						|| (this.getLvUnitsEarned() != null && castOther.getLvUnitsEarned() != null
								&& this.getLvUnitsEarned().equals(castOther.getLvUnitsEarned())))
				&& ((this.getSubst() == castOther.getSubst()) || (this.getSubst() != null
						&& castOther.getSubst() != null && this.getSubst().equals(castOther.getSubst())))
				&& ((this.getRsn() == castOther.getRsn()) || (this.getRsn() != null && castOther.getRsn() != null
						&& this.getRsn().equals(castOther.getRsn())))
				&& ((this.getProcessDt() == castOther.getProcessDt()) || (this.getProcessDt() != null
						&& castOther.getProcessDt() != null && this.getProcessDt().equals(castOther.getProcessDt())))
				&& ((this.getUserId() == castOther.getUserId()) || (this.getUserId() != null
						&& castOther.getUserId() != null && this.getUserId().equals(castOther.getUserId())))
				&& ((this.getModule() == castOther.getModule()) || (this.getModule() != null
						&& castOther.getModule() != null && this.getModule().equals(castOther.getModule())))
				&& (this.getLvId() == castOther.getLvId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + this.getPayFreq();
		result = 37 * result + (getEmpNbr() == null ? 0 : this.getEmpNbr().hashCode());
		result = 37 * result + (getDtOfPay() == null ? 0 : this.getDtOfPay().hashCode());
		result = 37 * result + this.getLvSeq();
		result = 37 * result + (getLvTyp() == null ? 0 : this.getLvTyp().hashCode());
		result = 37 * result + (getAbsRsn() == null ? 0 : this.getAbsRsn().hashCode());
		result = 37 * result + (getDtOfAbs() == null ? 0 : this.getDtOfAbs().hashCode());
		result = 37 * result + (getBegTime() == null ? 0 : this.getBegTime().hashCode());
		result = 37 * result + (getLvUnitsUsed() == null ? 0 : this.getLvUnitsUsed().hashCode());
		result = 37 * result + (getLvUnitsEarned() == null ? 0 : this.getLvUnitsEarned().hashCode());
		result = 37 * result + (getSubst() == null ? 0 : this.getSubst().hashCode());
		result = 37 * result + (getRsn() == null ? 0 : this.getRsn().hashCode());
		result = 37 * result + (getProcessDt() == null ? 0 : this.getProcessDt().hashCode());
		result = 37 * result + (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result + (getModule() == null ? 0 : this.getModule().hashCode());
		result = 37 * result + this.getLvId();
		return result;
	}

}
