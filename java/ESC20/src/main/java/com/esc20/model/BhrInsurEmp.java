package com.esc20.model;
// Generated Jan 4, 2019 3:42:57 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * BhrInsurEmp generated by hbm2java
 */
@Entity
@Table(name = "BHR_INSUR_EMP", schema = "rsccc", catalog = "rsccc")
public class BhrInsurEmp implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrInsurEmpId id;
	private char planTyp;
	private String empInsurId;
	private String module;

	public BhrInsurEmp() {
	}

	public BhrInsurEmp(BhrInsurEmpId id, char planTyp, String empInsurId, String module) {
		this.id = id;
		this.planTyp = planTyp;
		this.empInsurId = empInsurId;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "companyCd", column = @Column(name = "COMPANY_CD", nullable = false, length = 5)),
			@AttributeOverride(name = "planNbr", column = @Column(name = "PLAN_NBR", nullable = false, length = 20)) })
	public BhrInsurEmpId getId() {
		return this.id;
	}

	public void setId(BhrInsurEmpId id) {
		this.id = id;
	}

	@Column(name = "PLAN_TYP", nullable = false, length = 1)
	public char getPlanTyp() {
		return this.planTyp;
	}

	public void setPlanTyp(char planTyp) {
		this.planTyp = planTyp;
	}

	@Column(name = "EMP_INSUR_ID", nullable = false, length = 20)
	public String getEmpInsurId() {
		return this.empInsurId;
	}

	public void setEmpInsurId(String empInsurId) {
		this.empInsurId = empInsurId;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
