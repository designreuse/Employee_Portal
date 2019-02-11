package com.esc20.model;
// Generated Jan 4, 2019 3:47:57 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrTrsGrantsBkupPaycalcs5 generated by hbm2java
 */
@Entity
@Table(name = "BHR_TRS_GRANTS_BKUP_PAYCALCS_5", schema = "rsccc", catalog = "rsccc")
public class BhrTrsGrantsBkupPaycalcs5 implements java.io.Serializable {

	private BhrTrsGrantsBkupPaycalcs5Id id;

	public BhrTrsGrantsBkupPaycalcs5() {
	}

	public BhrTrsGrantsBkupPaycalcs5(BhrTrsGrantsBkupPaycalcs5Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "schYr", column = @Column(name = "SCH_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "trsMonth", column = @Column(name = "TRS_MONTH", nullable = false, length = 2)),
			@AttributeOverride(name = "trsGrantCd", column = @Column(name = "TRS_GRANT_CD", nullable = false, length = 2)),
			@AttributeOverride(name = "trsGrantGross", column = @Column(name = "TRS_GRANT_GROSS", nullable = false, precision = 9)),
			@AttributeOverride(name = "trsGrantDeposit", column = @Column(name = "TRS_GRANT_DEPOSIT", nullable = false, precision = 9)),
			@AttributeOverride(name = "trsGrantCare", column = @Column(name = "TRS_GRANT_CARE", nullable = false, precision = 7)),
			@AttributeOverride(name = "trsGrantIns", column = @Column(name = "TRS_GRANT_INS", nullable = false, precision = 7)),
			@AttributeOverride(name = "emplrNewTrsGross", column = @Column(name = "EMPLR_NEW_TRS_GROSS", nullable = false, precision = 9)),
			@AttributeOverride(name = "fromChildNutr", column = @Column(name = "FROM_CHILD_NUTR", nullable = false, length = 1)) })
	public BhrTrsGrantsBkupPaycalcs5Id getId() {
		return this.id;
	}

	public void setId(BhrTrsGrantsBkupPaycalcs5Id id) {
		this.id = id;
	}

}
