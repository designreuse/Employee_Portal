package com.esc20.model;
// Generated Jan 4, 2019 3:32:17 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrAca1095bEmpHist generated by hbm2java
 */
@Entity
@Table(name = "BHR_ACA_1095B_EMP_HIST", schema = "rsccc", catalog = "rsccc")
public class BhrAca1095bEmpHist implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2606673076446706626L;
	private BhrAca1095bEmpHistId id;
	private char covrgTyp;

	public BhrAca1095bEmpHist() {
	}

	public BhrAca1095bEmpHist(BhrAca1095bEmpHistId id, char covrgTyp) {
		this.id = id;
		this.covrgTyp = covrgTyp;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "calYr", column = @Column(name = "CAL_YR", nullable = false, length = 4)) })
	public BhrAca1095bEmpHistId getId() {
		return this.id;
	}

	public void setId(BhrAca1095bEmpHistId id) {
		this.id = id;
	}

	@Column(name = "COVRG_TYP", nullable = false, length = 1)
	public char getCovrgTyp() {
		return this.covrgTyp;
	}

	public void setCovrgTyp(char covrgTyp) {
		this.covrgTyp = covrgTyp;
	}

}
