package com.esc20.model;
// Generated Jan 4, 2019 3:42:57 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrPayrollInterfaceBkupPaycalcs5 generated by hbm2java
 */
@Entity
@Table(name = "BHR_PAYROLL_INTERFACE_BKUP_PAYCALCS_5", schema = "rsccc", catalog = "rsccc")
public class BhrPayrollInterfaceBkupPaycalcs5 implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrPayrollInterfaceBkupPaycalcs5Id id;

	public BhrPayrollInterfaceBkupPaycalcs5() {
	}

	public BhrPayrollInterfaceBkupPaycalcs5(BhrPayrollInterfaceBkupPaycalcs5Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "dtOfPay", column = @Column(name = "DT_OF_PAY", nullable = false, length = 8)),
			@AttributeOverride(name = "schYr", column = @Column(name = "SCH_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "adjNbr", column = @Column(name = "ADJ_NBR", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "seqNbr", column = @Column(name = "SEQ_NBR", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "acctPer", column = @Column(name = "ACCT_PER", nullable = false, length = 2)),
			@AttributeOverride(name = "fund", column = @Column(name = "FUND", nullable = false, length = 3)),
			@AttributeOverride(name = "fsclYr", column = @Column(name = "FSCL_YR", nullable = false, length = 1)),
			@AttributeOverride(name = "func", column = @Column(name = "FUNC", nullable = false, length = 2)),
			@AttributeOverride(name = "obj", column = @Column(name = "OBJ", nullable = false, length = 4)),
			@AttributeOverride(name = "sobj", column = @Column(name = "SOBJ", nullable = false, length = 2)),
			@AttributeOverride(name = "org", column = @Column(name = "ORG", nullable = false, length = 3)),
			@AttributeOverride(name = "pgm", column = @Column(name = "PGM", nullable = false, length = 2)),
			@AttributeOverride(name = "edSpan", column = @Column(name = "ED_SPAN", nullable = false, length = 1)),
			@AttributeOverride(name = "projDtl", column = @Column(name = "PROJ_DTL", nullable = false, length = 2)),
			@AttributeOverride(name = "jvNbr", column = @Column(name = "JV_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "jeDescr", column = @Column(name = "JE_DESCR", nullable = false, length = 30)),
			@AttributeOverride(name = "amt", column = @Column(name = "AMT", nullable = false, precision = 11)),
			@AttributeOverride(name = "finTranType", column = @Column(name = "FIN_TRAN_TYPE", nullable = false, length = 1)),
			@AttributeOverride(name = "glFileId", column = @Column(name = "GL_FILE_ID", nullable = false, length = 1)),
			@AttributeOverride(name = "jvNbrDescr", column = @Column(name = "JV_NBR_DESCR", nullable = false, length = 30)) })
	public BhrPayrollInterfaceBkupPaycalcs5Id getId() {
		return this.id;
	}

	public void setId(BhrPayrollInterfaceBkupPaycalcs5Id id) {
		this.id = id;
	}

}
