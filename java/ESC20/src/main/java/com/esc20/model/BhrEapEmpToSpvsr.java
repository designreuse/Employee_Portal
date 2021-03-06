package com.esc20.model;
// Generated Jan 4, 2019 3:39:45 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BhrEapEmpToSpvsr generated by hbm2java
 */
@Entity
@Table(name = "BHR_EAP_EMP_TO_SPVSR", schema = "rsccc", catalog = "rsccc")
public class BhrEapEmpToSpvsr implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private String empEmpNbr;
	private String spvsrEmpNbr;
	private String module;

	public BhrEapEmpToSpvsr() {
	}

	public BhrEapEmpToSpvsr(String empEmpNbr, String spvsrEmpNbr, String module) {
		this.empEmpNbr = empEmpNbr;
		this.spvsrEmpNbr = spvsrEmpNbr;
		this.module = module;
	}

	@Id

	@Column(name = "EMP_EMP_NBR", nullable = false, length = 6)
	public String getEmpEmpNbr() {
		return this.empEmpNbr;
	}

	public void setEmpEmpNbr(String empEmpNbr) {
		this.empEmpNbr = empEmpNbr;
	}

	@Column(name = "SPVSR_EMP_NBR", nullable = false, length = 6)
	public String getSpvsrEmpNbr() {
		return this.spvsrEmpNbr;
	}

	public void setSpvsrEmpNbr(String spvsrEmpNbr) {
		this.spvsrEmpNbr = spvsrEmpNbr;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
