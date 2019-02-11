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
 * BeaW4 generated by hbm2java
 */
@Entity
@Table(name = "BEA_W4", schema = "rsccc", catalog = "rsccc")
public class BeaW4 implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BeaW4Id id;
	private Character maritalStatTax;
	private Integer nbrTaxExempts;
	private Character maritalStatTaxNew;
	private Integer nbrTaxExemptsNew;
	private String apprvdDts;
	private Integer apprvrUsrId;
	private Character statCd;

	public BeaW4(BhrEmpPay pay) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
		BeaW4Id id = new BeaW4Id();
		id.setEmpNbr(pay.getId().getEmpNbr());
		id.setPayFreq(pay.getId().getPayFreq());
		id.setReqDts(sdf.format(new Date()).substring(0, 16));
		this.id = id;
		this.maritalStatTax = pay.getMaritalStatTax();
		this.maritalStatTaxNew = pay.getMaritalStatTax();
		this.nbrTaxExempts = pay.getNbrTaxExempts();
		this.nbrTaxExemptsNew = pay.getNbrTaxExempts();
		this.apprvdDts = "";
		this.apprvrUsrId = -1;
		this.statCd = 'P';
	}

	public BeaW4(BeaW4Id id, Character maritalStatTax, Integer nbrTaxExempts, Character maritalStatTaxNew, Integer nbrTaxExemptsNew,
			String apprvdDts, Integer apprvrUsrId, Character statCd) {
		this.id = id;
		this.maritalStatTax = maritalStatTax;
		this.nbrTaxExempts = nbrTaxExempts;
		this.maritalStatTaxNew = maritalStatTaxNew;
		this.nbrTaxExemptsNew = nbrTaxExemptsNew;
		this.apprvdDts = apprvdDts;
		this.apprvrUsrId = apprvrUsrId;
		this.statCd = statCd;
	}
	
	public BeaW4(BhrEmpPay demo, String empNbr,Character payFreq, String reqDts, Character maritalStatTaxNew, Integer nbrTaxExemptsNew, Character statCd) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
		BeaW4Id id = new BeaW4Id();
		id.setEmpNbr(empNbr);
		id.setPayFreq(payFreq);
		id.setReqDts(reqDts);
		this.id = id;
		this.maritalStatTax = demo.getMaritalStatTax()==null?'\0':demo.getMaritalStatTax();
		this.maritalStatTaxNew = maritalStatTaxNew;
		this.nbrTaxExempts = demo.getNbrTaxExempts()==null?'\0':demo.getNbrTaxExempts();
		this.nbrTaxExemptsNew = nbrTaxExemptsNew;
		
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
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "reqDts", column = @Column(name = "REQ_DTS", nullable = false, length = 16)) })
	public BeaW4Id getId() {
		return this.id;
	}

	public void setId(BeaW4Id id) {
		this.id = id;
	}

	@Column(name = "MARITAL_STAT_TAX", nullable = false, length = 1)
	public Character getMaritalStatTax() {
		return this.maritalStatTax;
	}

	public void setMaritalStatTax(Character maritalStatTax) {
		this.maritalStatTax = maritalStatTax;
	}

	@Column(name = "NBR_TAX_EXEMPTS", nullable = false)
	public Integer getNbrTaxExempts() {
		return this.nbrTaxExempts;
	}

	public void setNbrTaxExempts(Integer nbrTaxExempts) {
		this.nbrTaxExempts = nbrTaxExempts;
	}

	@Column(name = "MARITAL_STAT_TAX_NEW", nullable = false, length = 1)
	public Character getMaritalStatTaxNew() {
		return this.maritalStatTaxNew;
	}

	public void setMaritalStatTaxNew(Character maritalStatTaxNew) {
		this.maritalStatTaxNew = maritalStatTaxNew;
	}

	@Column(name = "NBR_TAX_EXEMPTS_NEW", nullable = false)
	public Integer getNbrTaxExemptsNew() {
		return this.nbrTaxExemptsNew;
	}

	public void setNbrTaxExemptsNew(Integer nbrTaxExemptsNew) {
		this.nbrTaxExemptsNew = nbrTaxExemptsNew;
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
