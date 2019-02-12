package com.esc20.model;
// Generated Jan 4, 2019 3:54:04 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BthrPosActnRsn generated by hbm2java
 */
@Entity
@Table(name = "BTHR_POS_ACTN_RSN", schema = "rsccc", catalog = "rsccc")
public class BthrPosActnRsn implements java.io.Serializable {

	private String actnCd;
	private String actnDescr;
	private String terminRsn;
	private String module;

	public BthrPosActnRsn() {
	}

	public BthrPosActnRsn(String actnCd, String actnDescr, String terminRsn, String module) {
		this.actnCd = actnCd;
		this.actnDescr = actnDescr;
		this.terminRsn = terminRsn;
		this.module = module;
	}

	@Id

	@Column(name = "ACTN_CD", nullable = false, length = 2)
	public String getActnCd() {
		return this.actnCd;
	}

	public void setActnCd(String actnCd) {
		this.actnCd = actnCd;
	}

	@Column(name = "ACTN_DESCR", nullable = false, length = 30)
	public String getActnDescr() {
		return this.actnDescr;
	}

	public void setActnDescr(String actnDescr) {
		this.actnDescr = actnDescr;
	}

	@Column(name = "TERMIN_RSN", nullable = false, length = 2)
	public String getTerminRsn() {
		return this.terminRsn;
	}

	public void setTerminRsn(String terminRsn) {
		this.terminRsn = terminRsn;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}