package com.esc20.model;
// Generated Jan 4, 2019 3:51:06 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BthrEoyAccruCalBkupPaycalcs5 generated by hbm2java
 */
@Entity
@Table(name = "BTHR_EOY_ACCRU_CAL_BKUP_PAYCALCS_5", schema = "rsccc", catalog = "rsccc")
public class BthrEoyAccruCalBkupPaycalcs5 implements java.io.Serializable {

	private BthrEoyAccruCalBkupPaycalcs5Id id;

	public BthrEoyAccruCalBkupPaycalcs5() {
	}

	public BthrEoyAccruCalBkupPaycalcs5(BthrEoyAccruCalBkupPaycalcs5Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "accruCd", column = @Column(name = "ACCRU_CD", nullable = false, length = 1)),
			@AttributeOverride(name = "dtStart", column = @Column(name = "DT_START", nullable = false, length = 8)),
			@AttributeOverride(name = "jobCd", column = @Column(name = "JOB_CD", nullable = false, length = 4)),
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "hrlyDlyFlg", column = @Column(name = "HRLY_DLY_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "unitsWrk", column = @Column(name = "UNITS_WRK", nullable = false, precision = 5)) })
	public BthrEoyAccruCalBkupPaycalcs5Id getId() {
		return this.id;
	}

	public void setId(BthrEoyAccruCalBkupPaycalcs5Id id) {
		this.id = id;
	}

}
