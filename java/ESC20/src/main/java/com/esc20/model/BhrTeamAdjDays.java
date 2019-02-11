package com.esc20.model;
// Generated Jan 4, 2019 3:46:21 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrTeamAdjDays generated by hbm2java
 */
@Entity
@Table(name = "BHR_TEAM_ADJ_DAYS", schema = "rsccc", catalog = "rsccc")
public class BhrTeamAdjDays implements java.io.Serializable {

	private BhrTeamAdjDaysId id;
	private byte adjNbrDaysWrkedPay;
	private String rptYrPost;
	private String rptMonPost;
	private String comnt;
	private String dtLUpdt;
	private String userId;
	private char trsRetiree;
	private String module;

	public BhrTeamAdjDays() {
	}

	public BhrTeamAdjDays(BhrTeamAdjDaysId id, byte adjNbrDaysWrkedPay, String rptYrPost, String rptMonPost,
			String comnt, String dtLUpdt, String userId, char trsRetiree, String module) {
		this.id = id;
		this.adjNbrDaysWrkedPay = adjNbrDaysWrkedPay;
		this.rptYrPost = rptYrPost;
		this.rptMonPost = rptMonPost;
		this.comnt = comnt;
		this.dtLUpdt = dtLUpdt;
		this.userId = userId;
		this.trsRetiree = trsRetiree;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "trsPosCd", column = @Column(name = "TRS_POS_CD", nullable = false, length = 2)),
			@AttributeOverride(name = "dtBegAdj", column = @Column(name = "DT_BEG_ADJ", nullable = false, length = 8)),
			@AttributeOverride(name = "dtEndAdj", column = @Column(name = "DT_END_ADJ", nullable = false, length = 8)) })
	public BhrTeamAdjDaysId getId() {
		return this.id;
	}

	public void setId(BhrTeamAdjDaysId id) {
		this.id = id;
	}

	@Column(name = "ADJ_NBR_DAYS_WRKED_PAY", nullable = false, precision = 2, scale = 0)
	public byte getAdjNbrDaysWrkedPay() {
		return this.adjNbrDaysWrkedPay;
	}

	public void setAdjNbrDaysWrkedPay(byte adjNbrDaysWrkedPay) {
		this.adjNbrDaysWrkedPay = adjNbrDaysWrkedPay;
	}

	@Column(name = "RPT_YR_POST", nullable = false, length = 4)
	public String getRptYrPost() {
		return this.rptYrPost;
	}

	public void setRptYrPost(String rptYrPost) {
		this.rptYrPost = rptYrPost;
	}

	@Column(name = "RPT_MON_POST", nullable = false, length = 2)
	public String getRptMonPost() {
		return this.rptMonPost;
	}

	public void setRptMonPost(String rptMonPost) {
		this.rptMonPost = rptMonPost;
	}

	@Column(name = "COMNT", nullable = false, length = 100)
	public String getComnt() {
		return this.comnt;
	}

	public void setComnt(String comnt) {
		this.comnt = comnt;
	}

	@Column(name = "DT_L_UPDT", nullable = false, length = 8)
	public String getDtLUpdt() {
		return this.dtLUpdt;
	}

	public void setDtLUpdt(String dtLUpdt) {
		this.dtLUpdt = dtLUpdt;
	}

	@Column(name = "USER_ID", nullable = false, length = 12)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "TRS_RETIREE", nullable = false, length = 1)
	public char getTrsRetiree() {
		return this.trsRetiree;
	}

	public void setTrsRetiree(char trsRetiree) {
		this.trsRetiree = trsRetiree;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
