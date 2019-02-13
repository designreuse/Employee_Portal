package com.esc20.model;
// Generated Feb 13, 2019 1:49:13 PM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BeaAlert generated by hbm2java
 */
@Entity
@Table(name = "BEA_ALERT", schema = "rsccc", catalog = "rsccc")
public class BeaAlert implements java.io.Serializable {

	private long id;
	private String msgFrom;
	private String msgTo;
	private String msgContent;
	private String status;

	public BeaAlert() {
	}

	public BeaAlert(long id, String msgFrom, String msgTo, String msgContent, String status) {
		this.id = id;
		this.msgFrom = msgFrom;
		this.msgTo = msgTo;
		this.msgContent = msgContent;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "msg_from", nullable = false, length = 10)
	public String getMsgFrom() {
		return this.msgFrom;
	}

	public void setMsgFrom(String msgFrom) {
		this.msgFrom = msgFrom;
	}

	@Column(name = "msg_to", nullable = false, length = 10)
	public String getMsgTo() {
		return this.msgTo;
	}

	public void setMsgTo(String msgTo) {
		this.msgTo = msgTo;
	}

	@Column(name = "msg_content", nullable = false, length = 255)
	public String getMsgContent() {
		return this.msgContent;
	}

	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	@Column(name = "status", nullable = false, length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
