package com.esc20.model;
// Generated Jan 4, 2019 3:42:57 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrHrlyDataXmital generated by hbm2java
 */
@Entity
@Table(name = "BHR_HRLY_DATA_XMITAL", schema = "rsccc", catalog = "rsccc")
public class BhrHrlyDataXmital implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrHrlyDataXmitalId id;
	private BigDecimal regHrsWrk;
	private BigDecimal absDed;
	private char adjSalaryCd;
	private BigDecimal daysEarned;
	private String campusId;
	private char dept;
	private String jobCd;
	private BigDecimal servRecDaysDeduct;
	private String userId;
	private String processDt;
	private char transmittalType;
	private String rsn;
	private char createdCip;
	private String module;
	private BigDecimal actHrs;
	private String actDt;

	public BhrHrlyDataXmital() {
	}

	public BhrHrlyDataXmital(BhrHrlyDataXmitalId id, BigDecimal regHrsWrk, BigDecimal absDed, char adjSalaryCd,
			BigDecimal daysEarned, String campusId, char dept, String jobCd, BigDecimal servRecDaysDeduct,
			String userId, String processDt, char transmittalType, String rsn, char createdCip, String module,
			BigDecimal actHrs, String actDt) {
		this.id = id;
		this.regHrsWrk = regHrsWrk;
		this.absDed = absDed;
		this.adjSalaryCd = adjSalaryCd;
		this.daysEarned = daysEarned;
		this.campusId = campusId;
		this.dept = dept;
		this.jobCd = jobCd;
		this.servRecDaysDeduct = servRecDaysDeduct;
		this.userId = userId;
		this.processDt = processDt;
		this.transmittalType = transmittalType;
		this.rsn = rsn;
		this.createdCip = createdCip;
		this.module = module;
		this.actHrs = actHrs;
		this.actDt = actDt;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "dtOfPay", column = @Column(name = "DT_OF_PAY", nullable = false, length = 8)),
			@AttributeOverride(name = "dts", column = @Column(name = "DTS", nullable = false, length = 16)),
			@AttributeOverride(name = "seqNbr", column = @Column(name = "SEQ_NBR", nullable = false, length = 5)) })
	public BhrHrlyDataXmitalId getId() {
		return this.id;
	}

	public void setId(BhrHrlyDataXmitalId id) {
		this.id = id;
	}

	@Column(name = "REG_HRS_WRK", nullable = false, precision = 5)
	public BigDecimal getRegHrsWrk() {
		return this.regHrsWrk;
	}

	public void setRegHrsWrk(BigDecimal regHrsWrk) {
		this.regHrsWrk = regHrsWrk;
	}

	@Column(name = "ABS_DED", nullable = false, precision = 7)
	public BigDecimal getAbsDed() {
		return this.absDed;
	}

	public void setAbsDed(BigDecimal absDed) {
		this.absDed = absDed;
	}

	@Column(name = "ADJ_SALARY_CD", nullable = false, length = 1)
	public char getAdjSalaryCd() {
		return this.adjSalaryCd;
	}

	public void setAdjSalaryCd(char adjSalaryCd) {
		this.adjSalaryCd = adjSalaryCd;
	}

	@Column(name = "DAYS_EARNED", nullable = false, precision = 5)
	public BigDecimal getDaysEarned() {
		return this.daysEarned;
	}

	public void setDaysEarned(BigDecimal daysEarned) {
		this.daysEarned = daysEarned;
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

	@Column(name = "JOB_CD", nullable = false, length = 4)
	public String getJobCd() {
		return this.jobCd;
	}

	public void setJobCd(String jobCd) {
		this.jobCd = jobCd;
	}

	@Column(name = "SERV_REC_DAYS_DEDUCT", nullable = false, precision = 5)
	public BigDecimal getServRecDaysDeduct() {
		return this.servRecDaysDeduct;
	}

	public void setServRecDaysDeduct(BigDecimal servRecDaysDeduct) {
		this.servRecDaysDeduct = servRecDaysDeduct;
	}

	@Column(name = "USER_ID", nullable = false, length = 12)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "PROCESS_DT", nullable = false, length = 8)
	public String getProcessDt() {
		return this.processDt;
	}

	public void setProcessDt(String processDt) {
		this.processDt = processDt;
	}

	@Column(name = "TRANSMITTAL_TYPE", nullable = false, length = 1)
	public char getTransmittalType() {
		return this.transmittalType;
	}

	public void setTransmittalType(char transmittalType) {
		this.transmittalType = transmittalType;
	}

	@Column(name = "RSN", nullable = false, length = 30)
	public String getRsn() {
		return this.rsn;
	}

	public void setRsn(String rsn) {
		this.rsn = rsn;
	}

	@Column(name = "CREATED_CIP", nullable = false, length = 1)
	public char getCreatedCip() {
		return this.createdCip;
	}

	public void setCreatedCip(char createdCip) {
		this.createdCip = createdCip;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Column(name = "ACT_HRS", nullable = false, precision = 5)
	public BigDecimal getActHrs() {
		return this.actHrs;
	}

	public void setActHrs(BigDecimal actHrs) {
		this.actHrs = actHrs;
	}

	@Column(name = "ACT_DT", nullable = false, length = 8)
	public String getActDt() {
		return this.actDt;
	}

	public void setActDt(String actDt) {
		this.actDt = actDt;
	}

}
