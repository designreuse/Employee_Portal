package com.esc20.model;
// Generated Jan 4, 2019 3:44:27 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrPayDeductHistBkupPaycalcs5Id generated by hbm2java
 */
@Embeddable
public class BhrPayDeductHistBkupPaycalcs5Id implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private char cyrNyrFlg;
	private char payFreq;
	private String empNbr;
	private String dtOfPay;
	private String chkNbr;
	private char voidOrIss;
	private short adjNbr;
	private String dedCd;
	private char dedSeq;
	private BigDecimal dedAmt;
	private short dedRemain;
	private short dedTaken;
	private char cafeFlg;
	private BigDecimal emplrAmt;
	private boolean emplrContribFactor;
	private char refundFlg;
	private String caseNbr;
	private String causeNbr;
	private BigDecimal teaHealthInsContrib;
	private boolean teaHealthInsContribFactor;
	private char w2EmplrHlthcare;

	public BhrPayDeductHistBkupPaycalcs5Id() {
	}

	public BhrPayDeductHistBkupPaycalcs5Id(char cyrNyrFlg, char payFreq, String empNbr, String dtOfPay, String chkNbr,
			char voidOrIss, short adjNbr, String dedCd, char dedSeq, BigDecimal dedAmt, short dedRemain, short dedTaken,
			char cafeFlg, BigDecimal emplrAmt, boolean emplrContribFactor, char refundFlg, String caseNbr,
			String causeNbr, BigDecimal teaHealthInsContrib, boolean teaHealthInsContribFactor, char w2EmplrHlthcare) {
		this.cyrNyrFlg = cyrNyrFlg;
		this.payFreq = payFreq;
		this.empNbr = empNbr;
		this.dtOfPay = dtOfPay;
		this.chkNbr = chkNbr;
		this.voidOrIss = voidOrIss;
		this.adjNbr = adjNbr;
		this.dedCd = dedCd;
		this.dedSeq = dedSeq;
		this.dedAmt = dedAmt;
		this.dedRemain = dedRemain;
		this.dedTaken = dedTaken;
		this.cafeFlg = cafeFlg;
		this.emplrAmt = emplrAmt;
		this.emplrContribFactor = emplrContribFactor;
		this.refundFlg = refundFlg;
		this.caseNbr = caseNbr;
		this.causeNbr = causeNbr;
		this.teaHealthInsContrib = teaHealthInsContrib;
		this.teaHealthInsContribFactor = teaHealthInsContribFactor;
		this.w2EmplrHlthcare = w2EmplrHlthcare;
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

	@Column(name = "DED_AMT", nullable = false, precision = 9)
	public BigDecimal getDedAmt() {
		return this.dedAmt;
	}

	public void setDedAmt(BigDecimal dedAmt) {
		this.dedAmt = dedAmt;
	}

	@Column(name = "DED_REMAIN", nullable = false, precision = 3, scale = 0)
	public short getDedRemain() {
		return this.dedRemain;
	}

	public void setDedRemain(short dedRemain) {
		this.dedRemain = dedRemain;
	}

	@Column(name = "DED_TAKEN", nullable = false, precision = 3, scale = 0)
	public short getDedTaken() {
		return this.dedTaken;
	}

	public void setDedTaken(short dedTaken) {
		this.dedTaken = dedTaken;
	}

	@Column(name = "CAFE_FLG", nullable = false, length = 1)
	public char getCafeFlg() {
		return this.cafeFlg;
	}

	public void setCafeFlg(char cafeFlg) {
		this.cafeFlg = cafeFlg;
	}

	@Column(name = "EMPLR_AMT", nullable = false, precision = 7)
	public BigDecimal getEmplrAmt() {
		return this.emplrAmt;
	}

	public void setEmplrAmt(BigDecimal emplrAmt) {
		this.emplrAmt = emplrAmt;
	}

	@Column(name = "EMPLR_CONTRIB_FACTOR", nullable = false, precision = 1, scale = 0)
	public boolean isEmplrContribFactor() {
		return this.emplrContribFactor;
	}

	public void setEmplrContribFactor(boolean emplrContribFactor) {
		this.emplrContribFactor = emplrContribFactor;
	}

	@Column(name = "REFUND_FLG", nullable = false, length = 1)
	public char getRefundFlg() {
		return this.refundFlg;
	}

	public void setRefundFlg(char refundFlg) {
		this.refundFlg = refundFlg;
	}

	@Column(name = "CASE_NBR", nullable = false, length = 20)
	public String getCaseNbr() {
		return this.caseNbr;
	}

	public void setCaseNbr(String caseNbr) {
		this.caseNbr = caseNbr;
	}

	@Column(name = "CAUSE_NBR", nullable = false, length = 12)
	public String getCauseNbr() {
		return this.causeNbr;
	}

	public void setCauseNbr(String causeNbr) {
		this.causeNbr = causeNbr;
	}

	@Column(name = "TEA_HEALTH_INS_CONTRIB", nullable = false, precision = 7)
	public BigDecimal getTeaHealthInsContrib() {
		return this.teaHealthInsContrib;
	}

	public void setTeaHealthInsContrib(BigDecimal teaHealthInsContrib) {
		this.teaHealthInsContrib = teaHealthInsContrib;
	}

	@Column(name = "TEA_HEALTH_INS_CONTRIB_FACTOR", nullable = false, precision = 1, scale = 0)
	public boolean isTeaHealthInsContribFactor() {
		return this.teaHealthInsContribFactor;
	}

	public void setTeaHealthInsContribFactor(boolean teaHealthInsContribFactor) {
		this.teaHealthInsContribFactor = teaHealthInsContribFactor;
	}

	@Column(name = "W2_EMPLR_HLTHCARE", nullable = false, length = 1)
	public char getW2EmplrHlthcare() {
		return this.w2EmplrHlthcare;
	}

	public void setW2EmplrHlthcare(char w2EmplrHlthcare) {
		this.w2EmplrHlthcare = w2EmplrHlthcare;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrPayDeductHistBkupPaycalcs5Id))
			return false;
		BhrPayDeductHistBkupPaycalcs5Id castOther = (BhrPayDeductHistBkupPaycalcs5Id) other;

		return (this.getCyrNyrFlg() == castOther.getCyrNyrFlg()) && (this.getPayFreq() == castOther.getPayFreq())
				&& ((this.getEmpNbr() == castOther.getEmpNbr()) || (this.getEmpNbr() != null
						&& castOther.getEmpNbr() != null && this.getEmpNbr().equals(castOther.getEmpNbr())))
				&& ((this.getDtOfPay() == castOther.getDtOfPay()) || (this.getDtOfPay() != null
						&& castOther.getDtOfPay() != null && this.getDtOfPay().equals(castOther.getDtOfPay())))
				&& ((this.getChkNbr() == castOther.getChkNbr()) || (this.getChkNbr() != null
						&& castOther.getChkNbr() != null && this.getChkNbr().equals(castOther.getChkNbr())))
				&& (this.getVoidOrIss() == castOther.getVoidOrIss()) && (this.getAdjNbr() == castOther.getAdjNbr())
				&& ((this.getDedCd() == castOther.getDedCd()) || (this.getDedCd() != null
						&& castOther.getDedCd() != null && this.getDedCd().equals(castOther.getDedCd())))
				&& (this.getDedSeq() == castOther.getDedSeq())
				&& ((this.getDedAmt() == castOther.getDedAmt()) || (this.getDedAmt() != null
						&& castOther.getDedAmt() != null && this.getDedAmt().equals(castOther.getDedAmt())))
				&& (this.getDedRemain() == castOther.getDedRemain()) && (this.getDedTaken() == castOther.getDedTaken())
				&& (this.getCafeFlg() == castOther.getCafeFlg())
				&& ((this.getEmplrAmt() == castOther.getEmplrAmt()) || (this.getEmplrAmt() != null
						&& castOther.getEmplrAmt() != null && this.getEmplrAmt().equals(castOther.getEmplrAmt())))
				&& (this.isEmplrContribFactor() == castOther.isEmplrContribFactor())
				&& (this.getRefundFlg() == castOther.getRefundFlg())
				&& ((this.getCaseNbr() == castOther.getCaseNbr()) || (this.getCaseNbr() != null
						&& castOther.getCaseNbr() != null && this.getCaseNbr().equals(castOther.getCaseNbr())))
				&& ((this.getCauseNbr() == castOther.getCauseNbr()) || (this.getCauseNbr() != null
						&& castOther.getCauseNbr() != null && this.getCauseNbr().equals(castOther.getCauseNbr())))
				&& ((this.getTeaHealthInsContrib() == castOther.getTeaHealthInsContrib())
						|| (this.getTeaHealthInsContrib() != null && castOther.getTeaHealthInsContrib() != null
								&& this.getTeaHealthInsContrib().equals(castOther.getTeaHealthInsContrib())))
				&& (this.isTeaHealthInsContribFactor() == castOther.isTeaHealthInsContribFactor())
				&& (this.getW2EmplrHlthcare() == castOther.getW2EmplrHlthcare());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + this.getPayFreq();
		result = 37 * result + (getEmpNbr() == null ? 0 : this.getEmpNbr().hashCode());
		result = 37 * result + (getDtOfPay() == null ? 0 : this.getDtOfPay().hashCode());
		result = 37 * result + (getChkNbr() == null ? 0 : this.getChkNbr().hashCode());
		result = 37 * result + this.getVoidOrIss();
		result = 37 * result + this.getAdjNbr();
		result = 37 * result + (getDedCd() == null ? 0 : this.getDedCd().hashCode());
		result = 37 * result + this.getDedSeq();
		result = 37 * result + (getDedAmt() == null ? 0 : this.getDedAmt().hashCode());
		result = 37 * result + this.getDedRemain();
		result = 37 * result + this.getDedTaken();
		result = 37 * result + this.getCafeFlg();
		result = 37 * result + (getEmplrAmt() == null ? 0 : this.getEmplrAmt().hashCode());
		result = 37 * result + (this.isEmplrContribFactor() ? 1 : 0);
		result = 37 * result + this.getRefundFlg();
		result = 37 * result + (getCaseNbr() == null ? 0 : this.getCaseNbr().hashCode());
		result = 37 * result + (getCauseNbr() == null ? 0 : this.getCauseNbr().hashCode());
		result = 37 * result + (getTeaHealthInsContrib() == null ? 0 : this.getTeaHealthInsContrib().hashCode());
		result = 37 * result + (this.isTeaHealthInsContribFactor() ? 1 : 0);
		result = 37 * result + this.getW2EmplrHlthcare();
		return result;
	}

}