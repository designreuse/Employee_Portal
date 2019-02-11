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
 * BhrTeamEd90 generated by hbm2java
 */
@Entity
@Table(name = "BHR_TEAM_ED90", schema = "rsccc", catalog = "rsccc")
public class BhrTeamEd90 implements java.io.Serializable {

	private BhrTeamEd90Id id;
	private String dtTerm;
	private char termRsnCd;
	private String fnlPayMon;
	private String fnlPayYr;
	private BigDecimal annlTrsGros;
	private String module;

	public BhrTeamEd90() {
	}

	public BhrTeamEd90(BhrTeamEd90Id id, String dtTerm, char termRsnCd, String fnlPayMon, String fnlPayYr,
			BigDecimal annlTrsGros, String module) {
		this.id = id;
		this.dtTerm = dtTerm;
		this.termRsnCd = termRsnCd;
		this.fnlPayMon = fnlPayMon;
		this.fnlPayYr = fnlPayYr;
		this.annlTrsGros = annlTrsGros;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "rptYr", column = @Column(name = "RPT_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "rptMon", column = @Column(name = "RPT_MON", nullable = false, length = 2)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)) })
	public BhrTeamEd90Id getId() {
		return this.id;
	}

	public void setId(BhrTeamEd90Id id) {
		this.id = id;
	}

	@Column(name = "DT_TERM", nullable = false, length = 8)
	public String getDtTerm() {
		return this.dtTerm;
	}

	public void setDtTerm(String dtTerm) {
		this.dtTerm = dtTerm;
	}

	@Column(name = "TERM_RSN_CD", nullable = false, length = 1)
	public char getTermRsnCd() {
		return this.termRsnCd;
	}

	public void setTermRsnCd(char termRsnCd) {
		this.termRsnCd = termRsnCd;
	}

	@Column(name = "FNL_PAY_MON", nullable = false, length = 2)
	public String getFnlPayMon() {
		return this.fnlPayMon;
	}

	public void setFnlPayMon(String fnlPayMon) {
		this.fnlPayMon = fnlPayMon;
	}

	@Column(name = "FNL_PAY_YR", nullable = false, length = 4)
	public String getFnlPayYr() {
		return this.fnlPayYr;
	}

	public void setFnlPayYr(String fnlPayYr) {
		this.fnlPayYr = fnlPayYr;
	}

	@Column(name = "ANNL_TRS_GROS", nullable = false, precision = 9)
	public BigDecimal getAnnlTrsGros() {
		return this.annlTrsGros;
	}

	public void setAnnlTrsGros(BigDecimal annlTrsGros) {
		this.annlTrsGros = annlTrsGros;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
