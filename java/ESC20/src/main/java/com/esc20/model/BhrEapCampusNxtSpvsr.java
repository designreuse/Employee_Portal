package com.esc20.model;
// Generated Jan 4, 2019 3:39:45 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrEapCampusNxtSpvsr generated by hbm2java
 */
@Entity
@Table(name = "BHR_EAP_CAMPUS_NXT_SPVSR", schema = "rsccc", catalog = "rsccc")
public class BhrEapCampusNxtSpvsr implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrEapCampusNxtSpvsrId id;
	private String module;

	public BhrEapCampusNxtSpvsr() {
	}

	public BhrEapCampusNxtSpvsr(BhrEapCampusNxtSpvsrId id, String module) {
		this.id = id;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "campusId", column = @Column(name = "CAMPUS_ID", nullable = false, length = 3)),
			@AttributeOverride(name = "dept", column = @Column(name = "DEPT", nullable = false, length = 1)),
			@AttributeOverride(name = "spvsrEmpNbr", column = @Column(name = "SPVSR_EMP_NBR", nullable = false, length = 6)) })
	public BhrEapCampusNxtSpvsrId getId() {
		return this.id;
	}

	public void setId(BhrEapCampusNxtSpvsrId id) {
		this.id = id;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
