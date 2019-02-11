package com.esc20.model;
// Generated Jan 4, 2019 3:53:34 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BthrMidPointBkupPaycalcs5 generated by hbm2java
 */
@Entity
@Table(name = "BTHR_MID_POINT_BKUP_PAYCALCS_5", schema = "rsccc", catalog = "rsccc")
public class BthrMidPointBkupPaycalcs5 implements java.io.Serializable {

	private BthrMidPointBkupPaycalcs5Id id;

	public BthrMidPointBkupPaycalcs5() {
	}

	public BthrMidPointBkupPaycalcs5(BthrMidPointBkupPaycalcs5Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "payGrd", column = @Column(name = "PAY_GRD", nullable = false, length = 3)),
			@AttributeOverride(name = "payTyp", column = @Column(name = "PAY_TYP", nullable = false, length = 1)),
			@AttributeOverride(name = "min", column = @Column(name = "MIN", nullable = false, precision = 6, scale = 3)),
			@AttributeOverride(name = "max", column = @Column(name = "MAX", nullable = false, precision = 6, scale = 3)),
			@AttributeOverride(name = "midPoint", column = @Column(name = "MID_POINT", nullable = false, precision = 6, scale = 3)),
			@AttributeOverride(name = "hrs", column = @Column(name = "HRS", nullable = false, precision = 4)),
			@AttributeOverride(name = "dockRateTyp", column = @Column(name = "DOCK_RATE_TYP", nullable = false, length = 1)),
			@AttributeOverride(name = "module", column = @Column(name = "MODULE", nullable = false, length = 25)) })
	public BthrMidPointBkupPaycalcs5Id getId() {
		return this.id;
	}

	public void setId(BthrMidPointBkupPaycalcs5Id id) {
		this.id = id;
	}

}
