package com.esc20.model;
// Generated Jan 4, 2019 3:32:17 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrAca1095bCovrdHist generated by hbm2java
 */
@Entity
@Table(name = "BHR_ACA_1095B_COVRD_HIST", schema = "rsccc", catalog = "rsccc")
public class BhrAca1095bCovrdHist implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1379451432076945378L;
	private BhrAca1095bCovrdHistId id;
	private String nameF;
	private String nameM;
	private String nameL;
	private char nameGen;
	private String ssn;
	private String dob;
	private char monAll;
	private char mon01;
	private char mon02;
	private char mon03;
	private char mon04;
	private char mon05;
	private char mon06;
	private char mon07;
	private char mon08;
	private char mon09;
	private char mon10;
	private char mon11;
	private char mon12;

	public BhrAca1095bCovrdHist() {
	}

	public BhrAca1095bCovrdHist(BhrAca1095bCovrdHistId id, String nameF, String nameM, String nameL, char nameGen,
			String ssn, String dob, char monAll, char mon01, char mon02, char mon03, char mon04, char mon05, char mon06,
			char mon07, char mon08, char mon09, char mon10, char mon11, char mon12) {
		this.id = id;
		this.nameF = nameF;
		this.nameM = nameM;
		this.nameL = nameL;
		this.nameGen = nameGen;
		this.ssn = ssn;
		this.dob = dob;
		this.monAll = monAll;
		this.mon01 = mon01;
		this.mon02 = mon02;
		this.mon03 = mon03;
		this.mon04 = mon04;
		this.mon05 = mon05;
		this.mon06 = mon06;
		this.mon07 = mon07;
		this.mon08 = mon08;
		this.mon09 = mon09;
		this.mon10 = mon10;
		this.mon11 = mon11;
		this.mon12 = mon12;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "calYr", column = @Column(name = "CAL_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "seqNbr", column = @Column(name = "SEQ_NBR", nullable = false, precision = 2, scale = 0)) })
	public BhrAca1095bCovrdHistId getId() {
		return this.id;
	}

	public void setId(BhrAca1095bCovrdHistId id) {
		this.id = id;
	}

	@Column(name = "NAME_F", nullable = false, length = 17)
	public String getNameF() {
		return this.nameF;
	}

	public void setNameF(String nameF) {
		this.nameF = nameF;
	}

	@Column(name = "NAME_M", nullable = false, length = 14)
	public String getNameM() {
		return this.nameM;
	}

	public void setNameM(String nameM) {
		this.nameM = nameM;
	}

	@Column(name = "NAME_L", nullable = false, length = 25)
	public String getNameL() {
		return this.nameL;
	}

	public void setNameL(String nameL) {
		this.nameL = nameL;
	}

	@Column(name = "NAME_GEN", nullable = false, length = 1)
	public char getNameGen() {
		return this.nameGen;
	}

	public void setNameGen(char nameGen) {
		this.nameGen = nameGen;
	}

	@Column(name = "SSN", nullable = false, length = 9)
	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Column(name = "DOB", nullable = false, length = 8)
	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Column(name = "MON_ALL", nullable = false, length = 1)
	public char getMonAll() {
		return this.monAll;
	}

	public void setMonAll(char monAll) {
		this.monAll = monAll;
	}

	@Column(name = "MON_01", nullable = false, length = 1)
	public char getMon01() {
		return this.mon01;
	}

	public void setMon01(char mon01) {
		this.mon01 = mon01;
	}

	@Column(name = "MON_02", nullable = false, length = 1)
	public char getMon02() {
		return this.mon02;
	}

	public void setMon02(char mon02) {
		this.mon02 = mon02;
	}

	@Column(name = "MON_03", nullable = false, length = 1)
	public char getMon03() {
		return this.mon03;
	}

	public void setMon03(char mon03) {
		this.mon03 = mon03;
	}

	@Column(name = "MON_04", nullable = false, length = 1)
	public char getMon04() {
		return this.mon04;
	}

	public void setMon04(char mon04) {
		this.mon04 = mon04;
	}

	@Column(name = "MON_05", nullable = false, length = 1)
	public char getMon05() {
		return this.mon05;
	}

	public void setMon05(char mon05) {
		this.mon05 = mon05;
	}

	@Column(name = "MON_06", nullable = false, length = 1)
	public char getMon06() {
		return this.mon06;
	}

	public void setMon06(char mon06) {
		this.mon06 = mon06;
	}

	@Column(name = "MON_07", nullable = false, length = 1)
	public char getMon07() {
		return this.mon07;
	}

	public void setMon07(char mon07) {
		this.mon07 = mon07;
	}

	@Column(name = "MON_08", nullable = false, length = 1)
	public char getMon08() {
		return this.mon08;
	}

	public void setMon08(char mon08) {
		this.mon08 = mon08;
	}

	@Column(name = "MON_09", nullable = false, length = 1)
	public char getMon09() {
		return this.mon09;
	}

	public void setMon09(char mon09) {
		this.mon09 = mon09;
	}

	@Column(name = "MON_10", nullable = false, length = 1)
	public char getMon10() {
		return this.mon10;
	}

	public void setMon10(char mon10) {
		this.mon10 = mon10;
	}

	@Column(name = "MON_11", nullable = false, length = 1)
	public char getMon11() {
		return this.mon11;
	}

	public void setMon11(char mon11) {
		this.mon11 = mon11;
	}

	@Column(name = "MON_12", nullable = false, length = 1)
	public char getMon12() {
		return this.mon12;
	}

	public void setMon12(char mon12) {
		this.mon12 = mon12;
	}

}
