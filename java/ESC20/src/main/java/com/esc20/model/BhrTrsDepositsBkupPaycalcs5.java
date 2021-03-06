package com.esc20.model;
// Generated Jan 4, 2019 3:47:57 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrTrsDepositsBkupPaycalcs5 generated by hbm2java
 */
@Entity
@Table(name = "BHR_TRS_DEPOSITS_BKUP_PAYCALCS_5", schema = "rsccc", catalog = "rsccc")
public class BhrTrsDepositsBkupPaycalcs5 implements java.io.Serializable {

	private BhrTrsDepositsBkupPaycalcs5Id id;

	public BhrTrsDepositsBkupPaycalcs5() {
	}

	public BhrTrsDepositsBkupPaycalcs5(BhrTrsDepositsBkupPaycalcs5Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "schYr", column = @Column(name = "SCH_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "trsMonth", column = @Column(name = "TRS_MONTH", nullable = false, length = 2)),
			@AttributeOverride(name = "trsGross", column = @Column(name = "TRS_GROSS", nullable = false, precision = 9)),
			@AttributeOverride(name = "trsDeposit", column = @Column(name = "TRS_DEPOSIT", nullable = false, precision = 9)),
			@AttributeOverride(name = "trsDepositCare", column = @Column(name = "TRS_DEPOSIT_CARE", nullable = false, precision = 7)),
			@AttributeOverride(name = "trsDepositIns", column = @Column(name = "TRS_DEPOSIT_INS", nullable = false, precision = 7)),
			@AttributeOverride(name = "trsFee", column = @Column(name = "TRS_FEE", nullable = false, precision = 5)),
			@AttributeOverride(name = "monSupplSalary", column = @Column(name = "MON_SUPPL_SALARY", nullable = false, precision = 9)),
			@AttributeOverride(name = "monStMinSalary", column = @Column(name = "MON_ST_MIN_SALARY", nullable = false, precision = 9)),
			@AttributeOverride(name = "monWhollySepSalary", column = @Column(name = "MON_WHOLLY_SEP_SALARY", nullable = false, precision = 9)),
			@AttributeOverride(name = "monTrsDock", column = @Column(name = "MON_TRS_DOCK", nullable = false, precision = 7)),
			@AttributeOverride(name = "perforPayGross", column = @Column(name = "PERFOR_PAY_GROSS", nullable = false, precision = 9)),
			@AttributeOverride(name = "perforPayDeposit", column = @Column(name = "PERFOR_PAY_DEPOSIT", nullable = false, precision = 9)),
			@AttributeOverride(name = "perforPayIns", column = @Column(name = "PERFOR_PAY_INS", nullable = false, precision = 7)),
			@AttributeOverride(name = "emplrNewTrsGross", column = @Column(name = "EMPLR_NEW_TRS_GROSS", nullable = false, precision = 9)),
			@AttributeOverride(name = "emplrNewTrsPensnContrib", column = @Column(name = "EMPLR_NEW_TRS_PENSN_CONTRIB", nullable = false, precision = 7)),
			@AttributeOverride(name = "emplrTrsCareContrib", column = @Column(name = "EMPLR_TRS_CARE_CONTRIB", nullable = false, precision = 7)),
			@AttributeOverride(name = "module", column = @Column(name = "MODULE", nullable = false, length = 25)) })
	public BhrTrsDepositsBkupPaycalcs5Id getId() {
		return this.id;
	}

	public void setId(BhrTrsDepositsBkupPaycalcs5Id id) {
		this.id = id;
	}

}
