package com.esc20.model;
// Generated Jan 4, 2019 3:30:30 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AppUser generated by hbm2java
 */
@Entity
@Table(name = "APP_USER", schema = "rsccc", catalog = "rsccc")
public class AppUser implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private long userId;
	private String userName;
	private String userPwd;
	private long cmpId;
	private String usrEmail;

	public AppUser() {
	}

	public AppUser(long userId, String userName, String userPwd, long cmpId, String usrEmail) {
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.cmpId = cmpId;
		this.usrEmail = usrEmail;
	}

	@Id

	@Column(name = "USER_ID", nullable = false)
	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Column(name = "USER_NAME", nullable = false, length = 45)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "USER_PWD", nullable = false, length = 45)
	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	@Column(name = "CMP_ID", nullable = false)
	public long getCmpId() {
		return this.cmpId;
	}

	public void setCmpId(long cmpId) {
		this.cmpId = cmpId;
	}

	@Column(name = "USR_EMAIL", nullable = false, length = 45)
	public String getUsrEmail() {
		return this.usrEmail;
	}

	public void setUsrEmail(String usrEmail) {
		this.usrEmail = usrEmail;
	}

}
