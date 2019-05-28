package com.esc20.model;
// Generated Jan 4, 2019 3:46:21 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrSupplXmitalId generated by hbm2java
 */
@Embeddable
public class BhrSupplXmitalId implements java.io.Serializable {
	private static final long serialVersionUID = -4938722212173580052L;
	private char payFreq;
	private String empNbr;
	private char cyrNyrFlg;
	private String dtOfPay;
	private String dts;
	private String seqNbr;

	public BhrSupplXmitalId() {
	}

	public BhrSupplXmitalId(char payFreq, String empNbr, char cyrNyrFlg, String dtOfPay, String dts, String seqNbr) {
		this.payFreq = payFreq;
		this.empNbr = empNbr;
		this.cyrNyrFlg = cyrNyrFlg;
		this.dtOfPay = dtOfPay;
		this.dts = dts;
		this.seqNbr = seqNbr;
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

	@Column(name = "DTS", nullable = false, length = 16)
	public String getDts() {
		return this.dts;
	}

	public void setDts(String dts) {
		this.dts = dts;
	}

	@Column(name = "SEQ_NBR", nullable = false, length = 5)
	public String getSeqNbr() {
		return this.seqNbr;
	}

	public void setSeqNbr(String seqNbr) {
		this.seqNbr = seqNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrSupplXmitalId))
			return false;
		BhrSupplXmitalId castOther = (BhrSupplXmitalId) other;

		return (this.getPayFreq() == castOther.getPayFreq())
				&& ((this.getEmpNbr() == castOther.getEmpNbr()) || (this.getEmpNbr() != null
						&& castOther.getEmpNbr() != null && this.getEmpNbr().equals(castOther.getEmpNbr())))
				&& (this.getCyrNyrFlg() == castOther.getCyrNyrFlg())
				&& ((this.getDtOfPay() == castOther.getDtOfPay()) || (this.getDtOfPay() != null
						&& castOther.getDtOfPay() != null && this.getDtOfPay().equals(castOther.getDtOfPay())))
				&& ((this.getDts() == castOther.getDts()) || (this.getDts() != null && castOther.getDts() != null
						&& this.getDts().equals(castOther.getDts())))
				&& ((this.getSeqNbr() == castOther.getSeqNbr()) || (this.getSeqNbr() != null
						&& castOther.getSeqNbr() != null && this.getSeqNbr().equals(castOther.getSeqNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPayFreq();
		result = 37 * result + (getEmpNbr() == null ? 0 : this.getEmpNbr().hashCode());
		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + (getDtOfPay() == null ? 0 : this.getDtOfPay().hashCode());
		result = 37 * result + (getDts() == null ? 0 : this.getDts().hashCode());
		result = 37 * result + (getSeqNbr() == null ? 0 : this.getSeqNbr().hashCode());
		return result;
	}

}
