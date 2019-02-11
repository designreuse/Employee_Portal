package com.esc20.model;
// Generated Jan 4, 2019 3:50:32 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BthrApplyLvOpt generated by hbm2java
 */
@Entity
@Table(name = "BTHR_APPLY_LV_OPT", schema = "rsccc", catalog = "rsccc")
public class BthrApplyLvOpt implements java.io.Serializable {

	private char opt;
	private String descr;

	public BthrApplyLvOpt() {
	}

	public BthrApplyLvOpt(char opt, String descr) {
		this.opt = opt;
		this.descr = descr;
	}

	@Id

	@Column(name = "OPT", nullable = false, length = 1)
	public char getOpt() {
		return this.opt;
	}

	public void setOpt(char opt) {
		this.opt = opt;
	}

	@Column(name = "DESCR", nullable = false, length = 30)
	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

}
