package com.esc20.model;
// Generated Jan 4, 2019 3:38:21 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrBankDepositHistBkupPaycalcs5 generated by hbm2java
 */
@Entity
@Table(name = "BHR_BANK_DEPOSIT_HIST_BKUP_PAYCALCS_5", schema = "rsccc", catalog = "rsccc")
public class BhrBankDepositHistBkupPaycalcs5 implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrBankDepositHistBkupPaycalcs5Id id;

	public BhrBankDepositHistBkupPaycalcs5() {
	}

	public BhrBankDepositHistBkupPaycalcs5(BhrBankDepositHistBkupPaycalcs5Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "dtOfPay", column = @Column(name = "DT_OF_PAY", nullable = false, length = 8)),
			@AttributeOverride(name = "chkNbr", column = @Column(name = "CHK_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "voidOrIss", column = @Column(name = "VOID_OR_ISS", nullable = false, length = 1)),
			@AttributeOverride(name = "adjNbr", column = @Column(name = "ADJ_NBR", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "bankCd", column = @Column(name = "BANK_CD", nullable = false, length = 3)),
			@AttributeOverride(name = "bankAcctNbr", column = @Column(name = "BANK_ACCT_NBR", nullable = false, length = 17)),
			@AttributeOverride(name = "bankAcctTyp", column = @Column(name = "BANK_ACCT_TYP", nullable = false, length = 1)),
			@AttributeOverride(name = "bankAcctAmt", column = @Column(name = "BANK_ACCT_AMT", nullable = false, precision = 9)),
			@AttributeOverride(name = "bankOptFlg", column = @Column(name = "BANK_OPT_FLG", nullable = false, length = 1)) })
	public BhrBankDepositHistBkupPaycalcs5Id getId() {
		return this.id;
	}

	public void setId(BhrBankDepositHistBkupPaycalcs5Id id) {
		this.id = id;
	}

}
