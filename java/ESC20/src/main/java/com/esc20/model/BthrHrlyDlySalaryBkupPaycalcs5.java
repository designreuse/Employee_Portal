package com.esc20.model;
// Generated Jan 4, 2019 3:51:33 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BthrHrlyDlySalaryBkupPaycalcs5 generated by hbm2java
 */
@Entity
@Table(name = "BTHR_HRLY_DLY_SALARY_BKUP_PAYCALCS_5", schema = "rsccc", catalog = "rsccc")
public class BthrHrlyDlySalaryBkupPaycalcs5 implements java.io.Serializable {

	private BthrHrlyDlySalaryBkupPaycalcs5Id id;

	public BthrHrlyDlySalaryBkupPaycalcs5() {
	}

	public BthrHrlyDlySalaryBkupPaycalcs5(BthrHrlyDlySalaryBkupPaycalcs5Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "payGrd", column = @Column(name = "PAY_GRD", nullable = false, length = 3)),
			@AttributeOverride(name = "payStep", column = @Column(name = "PAY_STEP", nullable = false, length = 2)),
			@AttributeOverride(name = "sched", column = @Column(name = "SCHED", nullable = false, length = 1)),
			@AttributeOverride(name = "payAmt", column = @Column(name = "PAY_AMT", nullable = false, precision = 6, scale = 3)),
			@AttributeOverride(name = "hrsPerDay", column = @Column(name = "HRS_PER_DAY", nullable = false, precision = 5)),
			@AttributeOverride(name = "estOvtmHrs", column = @Column(name = "EST_OVTM_HRS", nullable = false, precision = 5, scale = 1)),
			@AttributeOverride(name = "payTyp", column = @Column(name = "PAY_TYP", nullable = false, length = 1)),
			@AttributeOverride(name = "module", column = @Column(name = "MODULE", nullable = false, length = 25)) })
	public BthrHrlyDlySalaryBkupPaycalcs5Id getId() {
		return this.id;
	}

	public void setId(BthrHrlyDlySalaryBkupPaycalcs5Id id) {
		this.id = id;
	}

}
