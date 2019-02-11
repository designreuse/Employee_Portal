package com.esc20.model;
// Generated Jan 4, 2019 3:54:39 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BthrSimPmisOptDedBkupPaycalcs5 generated by hbm2java
 */
@Entity
@Table(name = "BTHR_SIM_PMIS_OPT_DED_BKUP_PAYCALCS_5", schema = "rsccc", catalog = "rsccc")
public class BthrSimPmisOptDedBkupPaycalcs5 implements java.io.Serializable {

	private BthrSimPmisOptDedBkupPaycalcs5Id id;

	public BthrSimPmisOptDedBkupPaycalcs5() {
	}

	public BthrSimPmisOptDedBkupPaycalcs5(BthrSimPmisOptDedBkupPaycalcs5Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "simName", column = @Column(name = "SIM_NAME", nullable = false, length = 7)),
			@AttributeOverride(name = "dedCd", column = @Column(name = "DED_CD", nullable = false, length = 3)),
			@AttributeOverride(name = "empAmt", column = @Column(name = "EMP_AMT", nullable = false, precision = 7)),
			@AttributeOverride(name = "emplrAmt", column = @Column(name = "EMPLR_AMT", nullable = false, precision = 7)),
			@AttributeOverride(name = "teaHlthInsAmt", column = @Column(name = "TEA_HLTH_INS_AMT", nullable = false, precision = 7)),
			@AttributeOverride(name = "inclVacPos", column = @Column(name = "INCL_VAC_POS", nullable = false, length = 1)),
			@AttributeOverride(name = "module", column = @Column(name = "MODULE", nullable = false, length = 25)) })
	public BthrSimPmisOptDedBkupPaycalcs5Id getId() {
		return this.id;
	}

	public void setId(BthrSimPmisOptDedBkupPaycalcs5Id id) {
		this.id = id;
	}

}
