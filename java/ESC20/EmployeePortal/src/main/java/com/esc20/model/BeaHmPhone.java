package com.esc20.model;
// Generated Jan 4, 2019 3:30:30 PM by Hibernate Tools 4.3.5.Final

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BeaHmPhone generated by hbm2java
 */
@Entity
@Table(name = "BEA_HM_PHONE", schema = "rsccc", catalog = "rsccc")
public class BeaHmPhone implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BeaHmPhoneId id;
	private String phoneArea;
	private String phoneNbr;
	private String phoneAreaNew;
	private String phoneNbrNew;
	private String apprvdDts;
	private Integer apprvrUsrId;
	private Character statCd;

	public BeaHmPhone() {
	}

	public BeaHmPhone(BeaHmPhoneId id, String phoneArea, String phoneNbr, String phoneAreaNew, String phoneNbrNew,
			String apprvdDts, Integer apprvrUsrId, Character statCd) {
		this.id = id;
		this.phoneArea = phoneArea;
		this.phoneNbr = phoneNbr;
		this.phoneAreaNew = phoneAreaNew;
		this.phoneNbrNew = phoneNbrNew;
		this.apprvdDts = apprvdDts;
		this.apprvrUsrId = apprvrUsrId;
		this.statCd = statCd;
	}

	public BeaHmPhone(BhrEmpDemo demo) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
		BeaHmPhoneId id = new BeaHmPhoneId();
		id.setEmpNbr(demo.getEmpNbr());
		id.setReqDts(sdf.format(new Date()).substring(0, 16));
		this.id = id;
		this.phoneArea = demo.getPhoneArea();
		this.phoneNbr = demo.getPhoneNbr();
		this.phoneAreaNew = demo.getPhoneArea();
		this.phoneNbrNew = demo.getPhoneNbr();
		this.apprvdDts = "";
		this.apprvrUsrId = -1;
		this.statCd = 'P';
	}
	
	public BeaHmPhone(BhrEmpDemo demo, String empNbr, String reqDts, String phoneAreaNew, String phoneNbrNew, Character statCd) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
		BeaHmPhoneId id = new BeaHmPhoneId();
		id.setEmpNbr(empNbr);
		id.setReqDts(reqDts);
		this.id = id;
		this.phoneArea = demo.getPhoneArea()==null?"":demo.getPhoneArea();
		this.phoneAreaNew = phoneAreaNew;
		this.phoneNbr = demo.getPhoneNbr()==null?"":demo.getPhoneNbr();
		this.phoneNbrNew = phoneNbrNew;
		
		if("A".equals(statCd.toString())) {
			this.apprvdDts = sdf.format(new Date()).substring(0, 16);
			this.apprvrUsrId = 0;
		}else {
			this.apprvdDts = "";
			this.apprvrUsrId = -1;
		}
		this.statCd = statCd;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "reqDts", column = @Column(name = "REQ_DTS", nullable = false, length = 16)) })
	public BeaHmPhoneId getId() {
		return this.id;
	}

	public void setId(BeaHmPhoneId id) {
		this.id = id;
	}

	@Column(name = "PHONE_AREA", nullable = false, length = 3)
	public String getPhoneArea() {
		return this.phoneArea;
	}

	public void setPhoneArea(String phoneArea) {
		this.phoneArea = phoneArea;
	}

	@Column(name = "PHONE_NBR", nullable = false, length = 7)
	public String getPhoneNbr() {
		return this.phoneNbr;
	}

	public void setPhoneNbr(String phoneNbr) {
		this.phoneNbr = phoneNbr;
	}

	@Column(name = "PHONE_AREA_NEW", nullable = false, length = 3)
	public String getPhoneAreaNew() {
		return this.phoneAreaNew;
	}

	public void setPhoneAreaNew(String phoneAreaNew) {
		this.phoneAreaNew = phoneAreaNew;
	}

	@Column(name = "PHONE_NBR_NEW", nullable = false, length = 7)
	public String getPhoneNbrNew() {
		return this.phoneNbrNew;
	}

	public void setPhoneNbrNew(String phoneNbrNew) {
		this.phoneNbrNew = phoneNbrNew;
	}

	@Column(name = "APPRVD_DTS", nullable = false, length = 16)
	public String getApprvdDts() {
		return this.apprvdDts;
	}

	public void setApprvdDts(String apprvdDts) {
		this.apprvdDts = apprvdDts;
	}

	@Column(name = "APPRVR_USR_ID", nullable = false)
	public Integer getApprvrUsrId() {
		return this.apprvrUsrId;
	}

	public void setApprvrUsrId(Integer apprvrUsrId) {
		this.apprvrUsrId = apprvrUsrId;
	}

	@Column(name = "STAT_CD", nullable = false, length = 1)
	public Character getStatCd() {
		return this.statCd;
	}

	public void setStatCd(Character statCd) {
		this.statCd = statCd;
	}

}