package com.esc20.model;
// Generated Jan 4, 2019 3:39:45 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * BhrEapPayAssgnMbr generated by hbm2java
 */
@Entity
@Table(name = "BHR_EAP_PAY_ASSGN_MBR", schema = "rsccc", catalog = "rsccc")
public class BhrEapPayAssgnMbr implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrEapPayAssgnMbrId id;
	private BhrEapPayAssgnGrp bhrEapPayAssgnGrp;
	private char reqrdField;
	private char docReqrd;
	private int seqNbr;
	private String module;

	public BhrEapPayAssgnMbr() {
	}

	public BhrEapPayAssgnMbr(BhrEapPayAssgnMbrId id, BhrEapPayAssgnGrp bhrEapPayAssgnGrp, char reqrdField,
			char docReqrd, int seqNbr, String module) {
		this.id = id;
		this.bhrEapPayAssgnGrp = bhrEapPayAssgnGrp;
		this.reqrdField = reqrdField;
		this.docReqrd = docReqrd;
		this.seqNbr = seqNbr;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "grpName", column = @Column(name = "GRP_NAME", nullable = false, length = 35)),
			@AttributeOverride(name = "mbrName", column = @Column(name = "MBR_NAME", nullable = false, length = 35)),
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)) })
	public BhrEapPayAssgnMbrId getId() {
		return this.id;
	}

	public void setId(BhrEapPayAssgnMbrId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "GRP_NAME", referencedColumnName = "GRP_NAME", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PAY_FREQ", referencedColumnName = "PAY_FREQ", nullable = false, insertable = false, updatable = false) })
	public BhrEapPayAssgnGrp getBhrEapPayAssgnGrp() {
		return this.bhrEapPayAssgnGrp;
	}

	public void setBhrEapPayAssgnGrp(BhrEapPayAssgnGrp bhrEapPayAssgnGrp) {
		this.bhrEapPayAssgnGrp = bhrEapPayAssgnGrp;
	}

	@Column(name = "REQRD_FIELD", nullable = false, length = 1)
	public char getReqrdField() {
		return this.reqrdField;
	}

	public void setReqrdField(char reqrdField) {
		this.reqrdField = reqrdField;
	}

	@Column(name = "DOC_REQRD", nullable = false, length = 1)
	public char getDocReqrd() {
		return this.docReqrd;
	}

	public void setDocReqrd(char docReqrd) {
		this.docReqrd = docReqrd;
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

}
