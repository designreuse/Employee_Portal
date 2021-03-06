package com.esc20.model;
// Generated Jan 4, 2019 3:51:06 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BthrEoyAccruCalId generated by hbm2java
 */
@Embeddable
public class BthrEoyAccruCalId implements java.io.Serializable {

	private char payFreq;
	private String dtStart;
	private String jobCd;
	private char cyrNyrFlg;
	private char hrlyDlyFlg;
	private char accruCd;

	public BthrEoyAccruCalId() {
	}

	public BthrEoyAccruCalId(char payFreq, String dtStart, String jobCd, char cyrNyrFlg, char hrlyDlyFlg,
			char accruCd) {
		this.payFreq = payFreq;
		this.dtStart = dtStart;
		this.jobCd = jobCd;
		this.cyrNyrFlg = cyrNyrFlg;
		this.hrlyDlyFlg = hrlyDlyFlg;
		this.accruCd = accruCd;
	}

	@Column(name = "PAY_FREQ", nullable = false, length = 1)
	public char getPayFreq() {
		return this.payFreq;
	}

	public void setPayFreq(char payFreq) {
		this.payFreq = payFreq;
	}

	@Column(name = "DT_START", nullable = false, length = 8)
	public String getDtStart() {
		return this.dtStart;
	}

	public void setDtStart(String dtStart) {
		this.dtStart = dtStart;
	}

	@Column(name = "JOB_CD", nullable = false, length = 4)
	public String getJobCd() {
		return this.jobCd;
	}

	public void setJobCd(String jobCd) {
		this.jobCd = jobCd;
	}

	@Column(name = "CYR_NYR_FLG", nullable = false, length = 1)
	public char getCyrNyrFlg() {
		return this.cyrNyrFlg;
	}

	public void setCyrNyrFlg(char cyrNyrFlg) {
		this.cyrNyrFlg = cyrNyrFlg;
	}

	@Column(name = "HRLY_DLY_FLG", nullable = false, length = 1)
	public char getHrlyDlyFlg() {
		return this.hrlyDlyFlg;
	}

	public void setHrlyDlyFlg(char hrlyDlyFlg) {
		this.hrlyDlyFlg = hrlyDlyFlg;
	}

	@Column(name = "ACCRU_CD", nullable = false, length = 1)
	public char getAccruCd() {
		return this.accruCd;
	}

	public void setAccruCd(char accruCd) {
		this.accruCd = accruCd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BthrEoyAccruCalId))
			return false;
		BthrEoyAccruCalId castOther = (BthrEoyAccruCalId) other;

		return (this.getPayFreq() == castOther.getPayFreq())
				&& ((this.getDtStart() == castOther.getDtStart()) || (this.getDtStart() != null
						&& castOther.getDtStart() != null && this.getDtStart().equals(castOther.getDtStart())))
				&& ((this.getJobCd() == castOther.getJobCd()) || (this.getJobCd() != null
						&& castOther.getJobCd() != null && this.getJobCd().equals(castOther.getJobCd())))
				&& (this.getCyrNyrFlg() == castOther.getCyrNyrFlg())
				&& (this.getHrlyDlyFlg() == castOther.getHrlyDlyFlg()) && (this.getAccruCd() == castOther.getAccruCd());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPayFreq();
		result = 37 * result + (getDtStart() == null ? 0 : this.getDtStart().hashCode());
		result = 37 * result + (getJobCd() == null ? 0 : this.getJobCd().hashCode());
		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + this.getHrlyDlyFlg();
		result = 37 * result + this.getAccruCd();
		return result;
	}

}
