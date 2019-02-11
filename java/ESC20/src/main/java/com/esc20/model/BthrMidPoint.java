package com.esc20.model;
// Generated Jan 4, 2019 3:53:34 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BthrMidPoint generated by hbm2java
 */
@Entity
@Table(name = "BTHR_MID_POINT", schema = "rsccc", catalog = "rsccc")
public class BthrMidPoint implements java.io.Serializable {

	private BthrMidPointId id;
	private BigDecimal min;
	private BigDecimal max;
	private BigDecimal midPoint;
	private BigDecimal hrs;
	private char dockRateTyp;
	private String module;

	public BthrMidPoint() {
	}

	public BthrMidPoint(BthrMidPointId id, BigDecimal min, BigDecimal max, BigDecimal midPoint, BigDecimal hrs,
			char dockRateTyp, String module) {
		this.id = id;
		this.min = min;
		this.max = max;
		this.midPoint = midPoint;
		this.hrs = hrs;
		this.dockRateTyp = dockRateTyp;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "payGrd", column = @Column(name = "PAY_GRD", nullable = false, length = 3)),
			@AttributeOverride(name = "payTyp", column = @Column(name = "PAY_TYP", nullable = false, length = 1)) })
	public BthrMidPointId getId() {
		return this.id;
	}

	public void setId(BthrMidPointId id) {
		this.id = id;
	}

	@Column(name = "MIN", nullable = false, precision = 6, scale = 3)
	public BigDecimal getMin() {
		return this.min;
	}

	public void setMin(BigDecimal min) {
		this.min = min;
	}

	@Column(name = "MAX", nullable = false, precision = 6, scale = 3)
	public BigDecimal getMax() {
		return this.max;
	}

	public void setMax(BigDecimal max) {
		this.max = max;
	}

	@Column(name = "MID_POINT", nullable = false, precision = 6, scale = 3)
	public BigDecimal getMidPoint() {
		return this.midPoint;
	}

	public void setMidPoint(BigDecimal midPoint) {
		this.midPoint = midPoint;
	}

	@Column(name = "HRS", nullable = false, precision = 4)
	public BigDecimal getHrs() {
		return this.hrs;
	}

	public void setHrs(BigDecimal hrs) {
		this.hrs = hrs;
	}

	@Column(name = "DOCK_RATE_TYP", nullable = false, length = 1)
	public char getDockRateTyp() {
		return this.dockRateTyp;
	}

	public void setDockRateTyp(char dockRateTyp) {
		this.dockRateTyp = dockRateTyp;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
