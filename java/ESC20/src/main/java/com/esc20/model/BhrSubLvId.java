package com.esc20.model;
// Generated Jan 4, 2019 3:46:11 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrSubLvId generated by hbm2java
 */
@Embeddable
public class BhrSubLvId implements java.io.Serializable {

	private char teachPayFreq;
	private String teachEmpNbr;
	private char cyrNyrFlg;
	private String teachDtOfPay;
	private short teachLvSeq;
	private char subPayFreq;
	private String subEmpNbr;
	private String fund;
	private String func;
	private String obj;
	private String sobj;
	private String org;
	private char fsclYr;
	private String pgm;
	private char edSpan;
	private String projDtl;
	private String subDtOfPay;
	private char glFileId;
	private String suppSeqNbr;
	private String suppDts;
	private String suppDtOfPay;
	private String suppEmpNbr;
	private char suppPayFreq;

	public BhrSubLvId() {
	}

	public BhrSubLvId(char teachPayFreq, String teachEmpNbr, char cyrNyrFlg, String teachDtOfPay, short teachLvSeq,
			char subPayFreq, String subEmpNbr, String fund, String func, String obj, String sobj, String org,
			char fsclYr, String pgm, char edSpan, String projDtl, String subDtOfPay, char glFileId, String suppSeqNbr,
			String suppDts, String suppDtOfPay, String suppEmpNbr, char suppPayFreq) {
		this.teachPayFreq = teachPayFreq;
		this.teachEmpNbr = teachEmpNbr;
		this.cyrNyrFlg = cyrNyrFlg;
		this.teachDtOfPay = teachDtOfPay;
		this.teachLvSeq = teachLvSeq;
		this.subPayFreq = subPayFreq;
		this.subEmpNbr = subEmpNbr;
		this.fund = fund;
		this.func = func;
		this.obj = obj;
		this.sobj = sobj;
		this.org = org;
		this.fsclYr = fsclYr;
		this.pgm = pgm;
		this.edSpan = edSpan;
		this.projDtl = projDtl;
		this.subDtOfPay = subDtOfPay;
		this.glFileId = glFileId;
		this.suppSeqNbr = suppSeqNbr;
		this.suppDts = suppDts;
		this.suppDtOfPay = suppDtOfPay;
		this.suppEmpNbr = suppEmpNbr;
		this.suppPayFreq = suppPayFreq;
	}

	@Column(name = "TEACH_PAY_FREQ", nullable = false, length = 1)
	public char getTeachPayFreq() {
		return this.teachPayFreq;
	}

	public void setTeachPayFreq(char teachPayFreq) {
		this.teachPayFreq = teachPayFreq;
	}

	@Column(name = "TEACH_EMP_NBR", nullable = false, length = 6)
	public String getTeachEmpNbr() {
		return this.teachEmpNbr;
	}

	public void setTeachEmpNbr(String teachEmpNbr) {
		this.teachEmpNbr = teachEmpNbr;
	}

	@Column(name = "CYR_NYR_FLG", nullable = false, length = 1)
	public char getCyrNyrFlg() {
		return this.cyrNyrFlg;
	}

	public void setCyrNyrFlg(char cyrNyrFlg) {
		this.cyrNyrFlg = cyrNyrFlg;
	}

	@Column(name = "TEACH_DT_OF_PAY", nullable = false, length = 8)
	public String getTeachDtOfPay() {
		return this.teachDtOfPay;
	}

	public void setTeachDtOfPay(String teachDtOfPay) {
		this.teachDtOfPay = teachDtOfPay;
	}

	@Column(name = "TEACH_LV_SEQ", nullable = false, precision = 3, scale = 0)
	public short getTeachLvSeq() {
		return this.teachLvSeq;
	}

	public void setTeachLvSeq(short teachLvSeq) {
		this.teachLvSeq = teachLvSeq;
	}

	@Column(name = "SUB_PAY_FREQ", nullable = false, length = 1)
	public char getSubPayFreq() {
		return this.subPayFreq;
	}

	public void setSubPayFreq(char subPayFreq) {
		this.subPayFreq = subPayFreq;
	}

	@Column(name = "SUB_EMP_NBR", nullable = false, length = 6)
	public String getSubEmpNbr() {
		return this.subEmpNbr;
	}

	public void setSubEmpNbr(String subEmpNbr) {
		this.subEmpNbr = subEmpNbr;
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

	@Column(name = "SUB_DT_OF_PAY", nullable = false, length = 8)
	public String getSubDtOfPay() {
		return this.subDtOfPay;
	}

	public void setSubDtOfPay(String subDtOfPay) {
		this.subDtOfPay = subDtOfPay;
	}

	@Column(name = "GL_FILE_ID", nullable = false, length = 1)
	public char getGlFileId() {
		return this.glFileId;
	}

	public void setGlFileId(char glFileId) {
		this.glFileId = glFileId;
	}

	@Column(name = "SUPP_SEQ_NBR", nullable = false, length = 5)
	public String getSuppSeqNbr() {
		return this.suppSeqNbr;
	}

	public void setSuppSeqNbr(String suppSeqNbr) {
		this.suppSeqNbr = suppSeqNbr;
	}

	@Column(name = "SUPP_DTS", nullable = false, length = 16)
	public String getSuppDts() {
		return this.suppDts;
	}

	public void setSuppDts(String suppDts) {
		this.suppDts = suppDts;
	}

	@Column(name = "SUPP_DT_OF_PAY", nullable = false, length = 8)
	public String getSuppDtOfPay() {
		return this.suppDtOfPay;
	}

	public void setSuppDtOfPay(String suppDtOfPay) {
		this.suppDtOfPay = suppDtOfPay;
	}

	@Column(name = "SUPP_EMP_NBR", nullable = false, length = 6)
	public String getSuppEmpNbr() {
		return this.suppEmpNbr;
	}

	public void setSuppEmpNbr(String suppEmpNbr) {
		this.suppEmpNbr = suppEmpNbr;
	}

	@Column(name = "SUPP_PAY_FREQ", nullable = false, length = 1)
	public char getSuppPayFreq() {
		return this.suppPayFreq;
	}

	public void setSuppPayFreq(char suppPayFreq) {
		this.suppPayFreq = suppPayFreq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrSubLvId))
			return false;
		BhrSubLvId castOther = (BhrSubLvId) other;

		return (this.getTeachPayFreq() == castOther.getTeachPayFreq())
				&& ((this.getTeachEmpNbr() == castOther.getTeachEmpNbr())
						|| (this.getTeachEmpNbr() != null && castOther.getTeachEmpNbr() != null
								&& this.getTeachEmpNbr().equals(castOther.getTeachEmpNbr())))
				&& (this.getCyrNyrFlg() == castOther.getCyrNyrFlg())
				&& ((this.getTeachDtOfPay() == castOther.getTeachDtOfPay())
						|| (this.getTeachDtOfPay() != null && castOther.getTeachDtOfPay() != null
								&& this.getTeachDtOfPay().equals(castOther.getTeachDtOfPay())))
				&& (this.getTeachLvSeq() == castOther.getTeachLvSeq())
				&& (this.getSubPayFreq() == castOther.getSubPayFreq())
				&& ((this.getSubEmpNbr() == castOther.getSubEmpNbr()) || (this.getSubEmpNbr() != null
						&& castOther.getSubEmpNbr() != null && this.getSubEmpNbr().equals(castOther.getSubEmpNbr())))
				&& ((this.getFund() == castOther.getFund()) || (this.getFund() != null && castOther.getFund() != null
						&& this.getFund().equals(castOther.getFund())))
				&& ((this.getFunc() == castOther.getFunc()) || (this.getFunc() != null && castOther.getFunc() != null
						&& this.getFunc().equals(castOther.getFunc())))
				&& ((this.getObj() == castOther.getObj()) || (this.getObj() != null && castOther.getObj() != null
						&& this.getObj().equals(castOther.getObj())))
				&& ((this.getSobj() == castOther.getSobj()) || (this.getSobj() != null && castOther.getSobj() != null
						&& this.getSobj().equals(castOther.getSobj())))
				&& ((this.getOrg() == castOther.getOrg()) || (this.getOrg() != null
						&& castOther.getOrg() != null && this.getOrg().equals(castOther.getOrg())))
				&& (this.getFsclYr() == castOther.getFsclYr())
				&& ((this.getPgm() == castOther.getPgm()) || (this.getPgm() != null
						&& castOther.getPgm() != null && this.getPgm().equals(castOther.getPgm())))
				&& (this.getEdSpan() == castOther.getEdSpan())
				&& ((this.getProjDtl() == castOther.getProjDtl()) || (this.getProjDtl() != null
						&& castOther.getProjDtl() != null && this.getProjDtl().equals(castOther.getProjDtl())))
				&& ((this.getSubDtOfPay() == castOther.getSubDtOfPay()) || (this.getSubDtOfPay() != null
						&& castOther.getSubDtOfPay() != null && this.getSubDtOfPay().equals(castOther.getSubDtOfPay())))
				&& (this.getGlFileId() == castOther.getGlFileId())
				&& ((this.getSuppSeqNbr() == castOther.getSuppSeqNbr()) || (this.getSuppSeqNbr() != null
						&& castOther.getSuppSeqNbr() != null && this.getSuppSeqNbr().equals(castOther.getSuppSeqNbr())))
				&& ((this.getSuppDts() == castOther.getSuppDts()) || (this.getSuppDts() != null
						&& castOther.getSuppDts() != null && this.getSuppDts().equals(castOther.getSuppDts())))
				&& ((this.getSuppDtOfPay() == castOther.getSuppDtOfPay())
						|| (this.getSuppDtOfPay() != null && castOther.getSuppDtOfPay() != null
								&& this.getSuppDtOfPay().equals(castOther.getSuppDtOfPay())))
				&& ((this.getSuppEmpNbr() == castOther.getSuppEmpNbr()) || (this.getSuppEmpNbr() != null
						&& castOther.getSuppEmpNbr() != null && this.getSuppEmpNbr().equals(castOther.getSuppEmpNbr())))
				&& (this.getSuppPayFreq() == castOther.getSuppPayFreq());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTeachPayFreq();
		result = 37 * result + (getTeachEmpNbr() == null ? 0 : this.getTeachEmpNbr().hashCode());
		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + (getTeachDtOfPay() == null ? 0 : this.getTeachDtOfPay().hashCode());
		result = 37 * result + this.getTeachLvSeq();
		result = 37 * result + this.getSubPayFreq();
		result = 37 * result + (getSubEmpNbr() == null ? 0 : this.getSubEmpNbr().hashCode());
		result = 37 * result + (getFund() == null ? 0 : this.getFund().hashCode());
		result = 37 * result + (getFunc() == null ? 0 : this.getFunc().hashCode());
		result = 37 * result + (getObj() == null ? 0 : this.getObj().hashCode());
		result = 37 * result + (getSobj() == null ? 0 : this.getSobj().hashCode());
		result = 37 * result + (getOrg() == null ? 0 : this.getOrg().hashCode());
		result = 37 * result + this.getFsclYr();
		result = 37 * result + (getPgm() == null ? 0 : this.getPgm().hashCode());
		result = 37 * result + this.getEdSpan();
		result = 37 * result + (getProjDtl() == null ? 0 : this.getProjDtl().hashCode());
		result = 37 * result + (getSubDtOfPay() == null ? 0 : this.getSubDtOfPay().hashCode());
		result = 37 * result + this.getGlFileId();
		result = 37 * result + (getSuppSeqNbr() == null ? 0 : this.getSuppSeqNbr().hashCode());
		result = 37 * result + (getSuppDts() == null ? 0 : this.getSuppDts().hashCode());
		result = 37 * result + (getSuppDtOfPay() == null ? 0 : this.getSuppDtOfPay().hashCode());
		result = 37 * result + (getSuppEmpNbr() == null ? 0 : this.getSuppEmpNbr().hashCode());
		result = 37 * result + this.getSuppPayFreq();
		return result;
	}

}
