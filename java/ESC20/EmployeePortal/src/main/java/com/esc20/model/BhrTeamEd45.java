package com.esc20.model;
// Generated Jan 4, 2019 3:47:38 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrTeamEd45 generated by hbm2java
 */
@Entity
@Table(name = "BHR_TEAM_ED45", schema = "rsccc", catalog = "rsccc")
public class BhrTeamEd45 implements java.io.Serializable {

	private BhrTeamEd45Id id;
	private char origEligFlg;
	private char origErsRetHlthElig;
	private String origEmplmntStrtDt;
	private String origContrDtBegin;
	private String origContrDtEnd;
	private byte origFteHrs;
	private char origEmplmntTypCd;
	private char origEmplrPaysFica;
	private char origPayUnit;
	private BigDecimal origHrlyPayRate;
	private char origNonStdWrkWk;
	private String newTrsPosCd;
	private char newEligFlg;
	private char newErsRetHlthElig;
	private String newEmplmntStrtDt;
	private String newContrDtBegin;
	private String newContrDtEnd;
	private String newFteHrs;
	private char newEmplmntTypCd;
	private char newEmplrPaysFica;
	private char newPayUnit;
	private String newHrlyPayRate;
	private char newNonStdWrkWk;
	private char adjRsnCd;
	private String module;

	public BhrTeamEd45() {
	}

	public BhrTeamEd45(BhrTeamEd45Id id, char origEligFlg, char origErsRetHlthElig, String origEmplmntStrtDt,
			String origContrDtBegin, String origContrDtEnd, byte origFteHrs, char origEmplmntTypCd,
			char origEmplrPaysFica, char origPayUnit, BigDecimal origHrlyPayRate, char origNonStdWrkWk,
			String newTrsPosCd, char newEligFlg, char newErsRetHlthElig, String newEmplmntStrtDt,
			String newContrDtBegin, String newContrDtEnd, String newFteHrs, char newEmplmntTypCd, char newEmplrPaysFica,
			char newPayUnit, String newHrlyPayRate, char newNonStdWrkWk, char adjRsnCd, String module) {
		this.id = id;
		this.origEligFlg = origEligFlg;
		this.origErsRetHlthElig = origErsRetHlthElig;
		this.origEmplmntStrtDt = origEmplmntStrtDt;
		this.origContrDtBegin = origContrDtBegin;
		this.origContrDtEnd = origContrDtEnd;
		this.origFteHrs = origFteHrs;
		this.origEmplmntTypCd = origEmplmntTypCd;
		this.origEmplrPaysFica = origEmplrPaysFica;
		this.origPayUnit = origPayUnit;
		this.origHrlyPayRate = origHrlyPayRate;
		this.origNonStdWrkWk = origNonStdWrkWk;
		this.newTrsPosCd = newTrsPosCd;
		this.newEligFlg = newEligFlg;
		this.newErsRetHlthElig = newErsRetHlthElig;
		this.newEmplmntStrtDt = newEmplmntStrtDt;
		this.newContrDtBegin = newContrDtBegin;
		this.newContrDtEnd = newContrDtEnd;
		this.newFteHrs = newFteHrs;
		this.newEmplmntTypCd = newEmplmntTypCd;
		this.newEmplrPaysFica = newEmplrPaysFica;
		this.newPayUnit = newPayUnit;
		this.newHrlyPayRate = newHrlyPayRate;
		this.newNonStdWrkWk = newNonStdWrkWk;
		this.adjRsnCd = adjRsnCd;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "rptYr", column = @Column(name = "RPT_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "rptMon", column = @Column(name = "RPT_MON", nullable = false, length = 2)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "origTrsPosCd", column = @Column(name = "ORIG_TRS_POS_CD", nullable = false, length = 2)) })
	public BhrTeamEd45Id getId() {
		return this.id;
	}

	public void setId(BhrTeamEd45Id id) {
		this.id = id;
	}

	@Column(name = "ORIG_ELIG_FLG", nullable = false, length = 1)
	public char getOrigEligFlg() {
		return this.origEligFlg;
	}

	public void setOrigEligFlg(char origEligFlg) {
		this.origEligFlg = origEligFlg;
	}

	@Column(name = "ORIG_ERS_RET_HLTH_ELIG", nullable = false, length = 1)
	public char getOrigErsRetHlthElig() {
		return this.origErsRetHlthElig;
	}

	public void setOrigErsRetHlthElig(char origErsRetHlthElig) {
		this.origErsRetHlthElig = origErsRetHlthElig;
	}

	@Column(name = "ORIG_EMPLMNT_STRT_DT", nullable = false, length = 8)
	public String getOrigEmplmntStrtDt() {
		return this.origEmplmntStrtDt;
	}

	public void setOrigEmplmntStrtDt(String origEmplmntStrtDt) {
		this.origEmplmntStrtDt = origEmplmntStrtDt;
	}

	@Column(name = "ORIG_CONTR_DT_BEGIN", nullable = false, length = 8)
	public String getOrigContrDtBegin() {
		return this.origContrDtBegin;
	}

	public void setOrigContrDtBegin(String origContrDtBegin) {
		this.origContrDtBegin = origContrDtBegin;
	}

	@Column(name = "ORIG_CONTR_DT_END", nullable = false, length = 8)
	public String getOrigContrDtEnd() {
		return this.origContrDtEnd;
	}

	public void setOrigContrDtEnd(String origContrDtEnd) {
		this.origContrDtEnd = origContrDtEnd;
	}

	@Column(name = "ORIG_FTE_HRS", nullable = false, precision = 2, scale = 0)
	public byte getOrigFteHrs() {
		return this.origFteHrs;
	}

	public void setOrigFteHrs(byte origFteHrs) {
		this.origFteHrs = origFteHrs;
	}

	@Column(name = "ORIG_EMPLMNT_TYP_CD", nullable = false, length = 1)
	public char getOrigEmplmntTypCd() {
		return this.origEmplmntTypCd;
	}

	public void setOrigEmplmntTypCd(char origEmplmntTypCd) {
		this.origEmplmntTypCd = origEmplmntTypCd;
	}

	@Column(name = "ORIG_EMPLR_PAYS_FICA", nullable = false, length = 1)
	public char getOrigEmplrPaysFica() {
		return this.origEmplrPaysFica;
	}

	public void setOrigEmplrPaysFica(char origEmplrPaysFica) {
		this.origEmplrPaysFica = origEmplrPaysFica;
	}

	@Column(name = "ORIG_PAY_UNIT", nullable = false, length = 1)
	public char getOrigPayUnit() {
		return this.origPayUnit;
	}

	public void setOrigPayUnit(char origPayUnit) {
		this.origPayUnit = origPayUnit;
	}

	@Column(name = "ORIG_HRLY_PAY_RATE", nullable = false, precision = 5)
	public BigDecimal getOrigHrlyPayRate() {
		return this.origHrlyPayRate;
	}

	public void setOrigHrlyPayRate(BigDecimal origHrlyPayRate) {
		this.origHrlyPayRate = origHrlyPayRate;
	}

	@Column(name = "ORIG_NON_STD_WRK_WK", nullable = false, length = 1)
	public char getOrigNonStdWrkWk() {
		return this.origNonStdWrkWk;
	}

	public void setOrigNonStdWrkWk(char origNonStdWrkWk) {
		this.origNonStdWrkWk = origNonStdWrkWk;
	}

	@Column(name = "NEW_TRS_POS_CD", nullable = false, length = 2)
	public String getNewTrsPosCd() {
		return this.newTrsPosCd;
	}

	public void setNewTrsPosCd(String newTrsPosCd) {
		this.newTrsPosCd = newTrsPosCd;
	}

	@Column(name = "NEW_ELIG_FLG", nullable = false, length = 1)
	public char getNewEligFlg() {
		return this.newEligFlg;
	}

	public void setNewEligFlg(char newEligFlg) {
		this.newEligFlg = newEligFlg;
	}

	@Column(name = "NEW_ERS_RET_HLTH_ELIG", nullable = false, length = 1)
	public char getNewErsRetHlthElig() {
		return this.newErsRetHlthElig;
	}

	public void setNewErsRetHlthElig(char newErsRetHlthElig) {
		this.newErsRetHlthElig = newErsRetHlthElig;
	}

	@Column(name = "NEW_EMPLMNT_STRT_DT", nullable = false, length = 8)
	public String getNewEmplmntStrtDt() {
		return this.newEmplmntStrtDt;
	}

	public void setNewEmplmntStrtDt(String newEmplmntStrtDt) {
		this.newEmplmntStrtDt = newEmplmntStrtDt;
	}

	@Column(name = "NEW_CONTR_DT_BEGIN", nullable = false, length = 8)
	public String getNewContrDtBegin() {
		return this.newContrDtBegin;
	}

	public void setNewContrDtBegin(String newContrDtBegin) {
		this.newContrDtBegin = newContrDtBegin;
	}

	@Column(name = "NEW_CONTR_DT_END", nullable = false, length = 8)
	public String getNewContrDtEnd() {
		return this.newContrDtEnd;
	}

	public void setNewContrDtEnd(String newContrDtEnd) {
		this.newContrDtEnd = newContrDtEnd;
	}

	@Column(name = "NEW_FTE_HRS", nullable = false, length = 2)
	public String getNewFteHrs() {
		return this.newFteHrs;
	}

	public void setNewFteHrs(String newFteHrs) {
		this.newFteHrs = newFteHrs;
	}

	@Column(name = "NEW_EMPLMNT_TYP_CD", nullable = false, length = 1)
	public char getNewEmplmntTypCd() {
		return this.newEmplmntTypCd;
	}

	public void setNewEmplmntTypCd(char newEmplmntTypCd) {
		this.newEmplmntTypCd = newEmplmntTypCd;
	}

	@Column(name = "NEW_EMPLR_PAYS_FICA", nullable = false, length = 1)
	public char getNewEmplrPaysFica() {
		return this.newEmplrPaysFica;
	}

	public void setNewEmplrPaysFica(char newEmplrPaysFica) {
		this.newEmplrPaysFica = newEmplrPaysFica;
	}

	@Column(name = "NEW_PAY_UNIT", nullable = false, length = 1)
	public char getNewPayUnit() {
		return this.newPayUnit;
	}

	public void setNewPayUnit(char newPayUnit) {
		this.newPayUnit = newPayUnit;
	}

	@Column(name = "NEW_HRLY_PAY_RATE", nullable = false, length = 6)
	public String getNewHrlyPayRate() {
		return this.newHrlyPayRate;
	}

	public void setNewHrlyPayRate(String newHrlyPayRate) {
		this.newHrlyPayRate = newHrlyPayRate;
	}

	@Column(name = "NEW_NON_STD_WRK_WK", nullable = false, length = 1)
	public char getNewNonStdWrkWk() {
		return this.newNonStdWrkWk;
	}

	public void setNewNonStdWrkWk(char newNonStdWrkWk) {
		this.newNonStdWrkWk = newNonStdWrkWk;
	}

	@Column(name = "ADJ_RSN_CD", nullable = false, length = 1)
	public char getAdjRsnCd() {
		return this.adjRsnCd;
	}

	public void setAdjRsnCd(char adjRsnCd) {
		this.adjRsnCd = adjRsnCd;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}