package com.esc20.model;
// Generated Jan 4, 2019 3:54:58 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BthrUnemployBkupPaycalcs5 generated by hbm2java
 */
@Entity
@Table(name = "BTHR_UNEMPLOY_BKUP_PAYCALCS_5", schema = "rsccc", catalog = "rsccc")
public class BthrUnemployBkupPaycalcs5 implements java.io.Serializable {

	private BthrUnemployBkupPaycalcs5Id id;

	public BthrUnemployBkupPaycalcs5() {
	}

	public BthrUnemployBkupPaycalcs5(BthrUnemployBkupPaycalcs5Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "taxYr", column = @Column(name = "TAX_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "expenseUnemployTax", column = @Column(name = "EXPENSE_UNEMPLOY_TAX", nullable = false, length = 1)),
			@AttributeOverride(name = "emplrTyp", column = @Column(name = "EMPLR_TYP", nullable = false, length = 1)),
			@AttributeOverride(name = "unemployRate", column = @Column(name = "UNEMPLOY_RATE", nullable = false, precision = 7, scale = 6)),
			@AttributeOverride(name = "unemployFicaMax", column = @Column(name = "UNEMPLOY_FICA_MAX", nullable = false, precision = 9)),
			@AttributeOverride(name = "unemployGrossSalary", column = @Column(name = "UNEMPLOY_GROSS_SALARY", nullable = false, precision = 9)),
			@AttributeOverride(name = "module", column = @Column(name = "MODULE", nullable = false, length = 25)) })
	public BthrUnemployBkupPaycalcs5Id getId() {
		return this.id;
	}

	public void setId(BthrUnemployBkupPaycalcs5Id id) {
		this.id = id;
	}

}