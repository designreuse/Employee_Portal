package com.esc20.model;
// Generated Jan 4, 2019 3:44:27 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrPayDeductHistId generated by hbm2java
 */
@Embeddable
public class BhrPayDeductHistId implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private char payFreq;
	private String empNbr;
	private char cyrNyrFlg;
	private String dtOfPay;
	private String chkNbr;
	private char voidOrIss;
	private short adjNbr;
	private String dedCd;
	private char dedSeq;

	public BhrPayDeductHistId() {
	}

	public BhrPayDeductHistId(char payFreq, String empNbr, char cyrNyrFlg, String dtOfPay, String chkNbr,
			char voidOrIss, short adjNbr, String dedCd, char dedSeq) {
		this.payFreq = payFreq;
		this.empNbr = empNbr;
		this.cyrNyrFlg = cyrNyrFlg;
		this.dtOfPay = dtOfPay;
		this.chkNbr = chkNbr;
		this.voidOrIss = voidOrIss;
		this.adjNbr = adjNbr;
		this.dedCd = dedCd;
		this.dedSeq = dedSeq;
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

	@Column(name = "CYR_NYR_FLG", nullable = false, length = 1)
	public char getCyrNyrFlg() {
		return this.cyrNyrFlg;
	}

	public void setCyrNyrFlg(char cyrNyrFlg) {
		this.cyrNyrFlg = cyrNyrFlg;
	}

	@Column(name = "DT_OF_PAY", nullable = false, length = 8)
	public String getDtOfPay() {
		return this.dtOfPay;
	}

	public void setDtOfPay(String dtOfPay) {
		this.dtOfPay = dtOfPay;
	}

	@Column(name = "CHK_NBR", nullable = false, length = 6)
	public String getChkNbr() {
		return this.chkNbr;
	}

	public void setChkNbr(String chkNbr) {
		this.chkNbr = chkNbr;
	}

	@Column(name = "VOID_OR_ISS", nullable = false, length = 1)
	public char getVoidOrIss() {
		return this.voidOrIss;
	}

	public void setVoidOrIss(char voidOrIss) {
		this.voidOrIss = voidOrIss;
	}

	@Column(name = "ADJ_NBR", nullable = false, precision = 3, scale = 0)
	public short getAdjNbr() {
		return this.adjNbr;
	}

	public void setAdjNbr(short adjNbr) {
		this.adjNbr = adjNbr;
	}

	@Column(name = "DED_CD", nullable = false, length = 3)
	public String getDedCd() {
		return this.dedCd;
	}

	public void setDedCd(String dedCd) {
		this.dedCd = dedCd;
	}

	@Column(name = "DED_SEQ", nullable = false, length = 1)
	public char getDedSeq() {
		return this.dedSeq;
	}

	public void setDedSeq(char dedSeq) {
		this.dedSeq = dedSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrPayDeductHistId))
			return false;
		BhrPayDeductHistId castOther = (BhrPayDeductHistId) other;

		return (this.getPayFreq() == castOther.getPayFreq())
				&& ((this.getEmpNbr() == castOther.getEmpNbr()) || (this.getEmpNbr() != null
						&& castOther.getEmpNbr() != null && this.getEmpNbr().equals(castOther.getEmpNbr())))
				&& (this.getCyrNyrFlg() == castOther.getCyrNyrFlg())
				&& ((this.getDtOfPay() == castOther.getDtOfPay()) || (this.getDtOfPay() != null
						&& castOther.getDtOfPay() != null && this.getDtOfPay().equals(castOther.getDtOfPay())))
				&& ((this.getChkNbr() == castOther.getChkNbr()) || (this.getChkNbr() != null
						&& castOther.getChkNbr() != null && this.getChkNbr().equals(castOther.getChkNbr())))
				&& (this.getVoidOrIss() == castOther.getVoidOrIss()) && (this.getAdjNbr() == castOther.getAdjNbr())
				&& ((this.getDedCd() == castOther.getDedCd()) || (this.getDedCd() != null
						&& castOther.getDedCd() != null && this.getDedCd().equals(castOther.getDedCd())))
				&& (this.getDedSeq() == castOther.getDedSeq());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPayFreq();
		result = 37 * result + (getEmpNbr() == null ? 0 : this.getEmpNbr().hashCode());
		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + (getDtOfPay() == null ? 0 : this.getDtOfPay().hashCode());
		result = 37 * result + (getChkNbr() == null ? 0 : this.getChkNbr().hashCode());
		result = 37 * result + this.getVoidOrIss();
		result = 37 * result + this.getAdjNbr();
		result = 37 * result + (getDedCd() == null ? 0 : this.getDedCd().hashCode());
		result = 37 * result + this.getDedSeq();
		return result;
	}

}
