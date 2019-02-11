package com.esc20.model;
// Generated Jan 4, 2019 3:39:45 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * BhrEapDemoAssgnGrp generated by hbm2java
 */
@Entity
@Table(name = "BHR_EAP_DEMO_ASSGN_GRP", schema = "rsccc", catalog = "rsccc")
public class BhrEapDemoAssgnGrp implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private String grpName;
	private char optCd;
	private char autoApprv;
	private int apprvrUsrId;
	private int seqNbr;
	private String module;
	private Set<BhrEapDemoAssgnMbr> bhrEapDemoAssgnMbrs = new HashSet<BhrEapDemoAssgnMbr>(0);

	public BhrEapDemoAssgnGrp() {
	}

	public BhrEapDemoAssgnGrp(String grpName, char optCd, char autoApprv, int apprvrUsrId, int seqNbr, String module) {
		this.grpName = grpName;
		this.optCd = optCd;
		this.autoApprv = autoApprv;
		this.apprvrUsrId = apprvrUsrId;
		this.seqNbr = seqNbr;
		this.module = module;
	}

	public BhrEapDemoAssgnGrp(String grpName, char optCd, char autoApprv, int apprvrUsrId, int seqNbr, String module,
			Set<BhrEapDemoAssgnMbr> bhrEapDemoAssgnMbrs) {
		this.grpName = grpName;
		this.optCd = optCd;
		this.autoApprv = autoApprv;
		this.apprvrUsrId = apprvrUsrId;
		this.seqNbr = seqNbr;
		this.module = module;
		this.bhrEapDemoAssgnMbrs = bhrEapDemoAssgnMbrs;
	}

	@Id

	@Column(name = "GRP_NAME", nullable = false, length = 35)
	public String getGrpName() {
		return this.grpName;
	}

	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}

	@Column(name = "OPT_CD", nullable = false, length = 1)
	public char getOptCd() {
		return this.optCd;
	}

	public void setOptCd(char optCd) {
		this.optCd = optCd;
	}

	@Column(name = "AUTO_APPRV", nullable = false, length = 1)
	public char getAutoApprv() {
		return this.autoApprv;
	}

	public void setAutoApprv(char autoApprv) {
		this.autoApprv = autoApprv;
	}

	@Column(name = "APPRVR_USR_ID", nullable = false)
	public int getApprvrUsrId() {
		return this.apprvrUsrId;
	}

	public void setApprvrUsrId(int apprvrUsrId) {
		this.apprvrUsrId = apprvrUsrId;
	}

	@Column(name = "SEQ_NBR", nullable = false)
	public int getSeqNbr() {
		return this.seqNbr;
	}

	public void setSeqNbr(int seqNbr) {
		this.seqNbr = seqNbr;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bhrEapDemoAssgnGrp")
	public Set<BhrEapDemoAssgnMbr> getBhrEapDemoAssgnMbrs() {
		return this.bhrEapDemoAssgnMbrs;
	}

	public void setBhrEapDemoAssgnMbrs(Set<BhrEapDemoAssgnMbr> bhrEapDemoAssgnMbrs) {
		this.bhrEapDemoAssgnMbrs = bhrEapDemoAssgnMbrs;
	}

}
