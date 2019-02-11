package com.esc20.model;
// Generated Jan 4, 2019 3:36:55 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrActHrsWrkedBkupPaycalcs5 generated by hbm2java
 */
@Entity
@Table(name = "BHR_ACT_HRS_WRKED_BKUP_PAYCALCS_5", schema = "rsccc", catalog = "rsccc")
public class BhrActHrsWrkedBkupPaycalcs5 implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrActHrsWrkedBkupPaycalcs5Id id;

	public BhrActHrsWrkedBkupPaycalcs5() {
	}

	public BhrActHrsWrkedBkupPaycalcs5(BhrActHrsWrkedBkupPaycalcs5Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "dtOfPay", column = @Column(name = "DT_OF_PAY", nullable = false, length = 8)),
			@AttributeOverride(name = "actDt", column = @Column(name = "ACT_DT", nullable = false, length = 8)),
			@AttributeOverride(name = "actHrs", column = @Column(name = "ACT_HRS", nullable = false, precision = 5)),
			@AttributeOverride(name = "trsMon", column = @Column(name = "TRS_MON", nullable = false, length = 2)),
			@AttributeOverride(name = "module", column = @Column(name = "MODULE", nullable = false, length = 25)),
			@AttributeOverride(name = "jobCd", column = @Column(name = "JOB_CD", nullable = false, length = 4)) })
	public BhrActHrsWrkedBkupPaycalcs5Id getId() {
		return this.id;
	}

	public void setId(BhrActHrsWrkedBkupPaycalcs5Id id) {
		this.id = id;
	}

}
