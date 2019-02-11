package com.esc20.model;
// Generated Jan 4, 2019 3:44:43 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrPmisPosCtrlRollbkId generated by hbm2java
 */
@Embeddable
public class BhrPmisPosCtrlRollbkId implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private char cyrNyrFlg;
	private char befOrAft;
	private char payFreq;
	private String occEmpNbr;
	private String dtsCipTrans;
	private String posNbr;
	private String billetNbr;
	private char posTyp;

	public BhrPmisPosCtrlRollbkId() {
	}

	public BhrPmisPosCtrlRollbkId(char cyrNyrFlg, char befOrAft, char payFreq, String occEmpNbr, String dtsCipTrans,
			String posNbr, String billetNbr, char posTyp) {
		this.cyrNyrFlg = cyrNyrFlg;
		this.befOrAft = befOrAft;
		this.payFreq = payFreq;
		this.occEmpNbr = occEmpNbr;
		this.dtsCipTrans = dtsCipTrans;
		this.posNbr = posNbr;
		this.billetNbr = billetNbr;
		this.posTyp = posTyp;
	}

	@Column(name = "CYR_NYR_FLG", nullable = false, length = 1)
	public char getCyrNyrFlg() {
		return this.cyrNyrFlg;
	}

	public void setCyrNyrFlg(char cyrNyrFlg) {
		this.cyrNyrFlg = cyrNyrFlg;
	}

	@Column(name = "BEF_OR_AFT", nullable = false, length = 1)
	public char getBefOrAft() {
		return this.befOrAft;
	}

	public void setBefOrAft(char befOrAft) {
		this.befOrAft = befOrAft;
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

	@Column(name = "DTS_CIP_TRANS", nullable = false, length = 16)
	public String getDtsCipTrans() {
		return this.dtsCipTrans;
	}

	public void setDtsCipTrans(String dtsCipTrans) {
		this.dtsCipTrans = dtsCipTrans;
	}

	@Column(name = "POS_NBR", nullable = false, length = 13)
	public String getPosNbr() {
		return this.posNbr;
	}

	public void setPosNbr(String posNbr) {
		this.posNbr = posNbr;
	}

	@Column(name = "BILLET_NBR", nullable = false, length = 5)
	public String getBilletNbr() {
		return this.billetNbr;
	}

	public void setBilletNbr(String billetNbr) {
		this.billetNbr = billetNbr;
	}

	@Column(name = "POS_TYP", nullable = false, length = 1)
	public char getPosTyp() {
		return this.posTyp;
	}

	public void setPosTyp(char posTyp) {
		this.posTyp = posTyp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrPmisPosCtrlRollbkId))
			return false;
		BhrPmisPosCtrlRollbkId castOther = (BhrPmisPosCtrlRollbkId) other;

		return (this.getCyrNyrFlg() == castOther.getCyrNyrFlg()) && (this.getBefOrAft() == castOther.getBefOrAft())
				&& (this.getPayFreq() == castOther.getPayFreq())
				&& ((this.getOccEmpNbr() == castOther.getOccEmpNbr()) || (this.getOccEmpNbr() != null
						&& castOther.getOccEmpNbr() != null && this.getOccEmpNbr().equals(castOther.getOccEmpNbr())))
				&& ((this.getDtsCipTrans() == castOther.getDtsCipTrans())
						|| (this.getDtsCipTrans() != null && castOther.getDtsCipTrans() != null
								&& this.getDtsCipTrans().equals(castOther.getDtsCipTrans())))
				&& ((this.getPosNbr() == castOther.getPosNbr()) || (this.getPosNbr() != null
						&& castOther.getPosNbr() != null && this.getPosNbr().equals(castOther.getPosNbr())))
				&& ((this.getBilletNbr() == castOther.getBilletNbr()) || (this.getBilletNbr() != null
						&& castOther.getBilletNbr() != null && this.getBilletNbr().equals(castOther.getBilletNbr())))
				&& (this.getPosTyp() == castOther.getPosTyp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + this.getBefOrAft();
		result = 37 * result + this.getPayFreq();
		result = 37 * result + (getOccEmpNbr() == null ? 0 : this.getOccEmpNbr().hashCode());
		result = 37 * result + (getDtsCipTrans() == null ? 0 : this.getDtsCipTrans().hashCode());
		result = 37 * result + (getPosNbr() == null ? 0 : this.getPosNbr().hashCode());
		result = 37 * result + (getBilletNbr() == null ? 0 : this.getBilletNbr().hashCode());
		result = 37 * result + this.getPosTyp();
		return result;
	}

}
