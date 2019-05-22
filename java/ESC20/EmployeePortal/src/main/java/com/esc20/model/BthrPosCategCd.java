package com.esc20.model;
// Generated Jan 4, 2019 3:54:04 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BthrPosCategCd generated by hbm2java
 */
@Entity
@Table(name = "BTHR_POS_CATEG_CD", schema = "rsccc", catalog = "rsccc")
public class BthrPosCategCd implements java.io.Serializable {

	private String categCd;
	private String categDescr;
	private String module;

	public BthrPosCategCd() {
	}

	public BthrPosCategCd(String categCd, String categDescr, String module) {
		this.categCd = categCd;
		this.categDescr = categDescr;
		this.module = module;
	}

	@Id

	@Column(name = "CATEG_CD", nullable = false, length = 5)
	public String getCategCd() {
		return this.categCd;
	}

	public void setCategCd(String categCd) {
		this.categCd = categCd;
	}

	@Column(name = "CATEG_DESCR", nullable = false, length = 25)
	public String getCategDescr() {
		return this.categDescr;
	}

	public void setCategDescr(String categDescr) {
		this.categDescr = categDescr;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}