package com.esc20.model;
// Generated Jan 4, 2019 3:54:58 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BthrTerminationRsn generated by hbm2java
 */
@Entity
@Table(name = "BTHR_TERMINATION_RSN", schema = "rsccc", catalog = "rsccc")
public class BthrTerminationRsn implements java.io.Serializable {

	private String rsn;
	private String descr;
	private String module;

	public BthrTerminationRsn() {
	}

	public BthrTerminationRsn(String rsn, String descr, String module) {
		this.rsn = rsn;
		this.descr = descr;
		this.module = module;
	}

	@Id

	@Column(name = "RSN", nullable = false, length = 2)
	public String getRsn() {
		return this.rsn;
	}

	public void setRsn(String rsn) {
		this.rsn = rsn;
	}

	@Column(name = "DESCR", nullable = false, length = 50)
	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
