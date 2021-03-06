package com.esc20.model;
// Generated Jan 4, 2019 3:52:00 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * BthrInsurCompany generated by hbm2java
 */
@Entity
@Table(name = "BTHR_INSUR_COMPANY", schema = "rsccc", catalog = "rsccc")
public class BthrInsurCompany implements java.io.Serializable {

	private String companyCd;
	private String companyName;
	private String addrNbr;
	private String addrStr;
	private String addrCity;
	private String addrSt;
	private String addrZip;
	private String addrZip4;
	private String phoneArea;
	private String phoneNbr;
	private String phoneExt;
	private String contact;
	private String module;
	private Set<BthrInsurPlan> bthrInsurPlans = new HashSet<BthrInsurPlan>(0);

	public BthrInsurCompany() {
	}

	public BthrInsurCompany(String companyCd, String companyName, String addrNbr, String addrStr, String addrCity,
			String addrSt, String addrZip, String addrZip4, String phoneArea, String phoneNbr, String phoneExt,
			String contact, String module) {
		this.companyCd = companyCd;
		this.companyName = companyName;
		this.addrNbr = addrNbr;
		this.addrStr = addrStr;
		this.addrCity = addrCity;
		this.addrSt = addrSt;
		this.addrZip = addrZip;
		this.addrZip4 = addrZip4;
		this.phoneArea = phoneArea;
		this.phoneNbr = phoneNbr;
		this.phoneExt = phoneExt;
		this.contact = contact;
		this.module = module;
	}

	public BthrInsurCompany(String companyCd, String companyName, String addrNbr, String addrStr, String addrCity,
			String addrSt, String addrZip, String addrZip4, String phoneArea, String phoneNbr, String phoneExt,
			String contact, String module, Set<BthrInsurPlan> bthrInsurPlans) {
		this.companyCd = companyCd;
		this.companyName = companyName;
		this.addrNbr = addrNbr;
		this.addrStr = addrStr;
		this.addrCity = addrCity;
		this.addrSt = addrSt;
		this.addrZip = addrZip;
		this.addrZip4 = addrZip4;
		this.phoneArea = phoneArea;
		this.phoneNbr = phoneNbr;
		this.phoneExt = phoneExt;
		this.contact = contact;
		this.module = module;
		this.bthrInsurPlans = bthrInsurPlans;
	}

	@Id

	@Column(name = "COMPANY_CD", nullable = false, length = 5)
	public String getCompanyCd() {
		return this.companyCd;
	}

	public void setCompanyCd(String companyCd) {
		this.companyCd = companyCd;
	}

	@Column(name = "COMPANY_NAME", nullable = false, length = 30)
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "ADDR_NBR", nullable = false, length = 8)
	public String getAddrNbr() {
		return this.addrNbr;
	}

	public void setAddrNbr(String addrNbr) {
		this.addrNbr = addrNbr;
	}

	@Column(name = "ADDR_STR", nullable = false, length = 20)
	public String getAddrStr() {
		return this.addrStr;
	}

	public void setAddrStr(String addrStr) {
		this.addrStr = addrStr;
	}

	@Column(name = "ADDR_CITY", nullable = false, length = 25)
	public String getAddrCity() {
		return this.addrCity;
	}

	public void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}

	@Column(name = "ADDR_ST", nullable = false, length = 2)
	public String getAddrSt() {
		return this.addrSt;
	}

	public void setAddrSt(String addrSt) {
		this.addrSt = addrSt;
	}

	@Column(name = "ADDR_ZIP", nullable = false, length = 5)
	public String getAddrZip() {
		return this.addrZip;
	}

	public void setAddrZip(String addrZip) {
		this.addrZip = addrZip;
	}

	@Column(name = "ADDR_ZIP4", nullable = false, length = 4)
	public String getAddrZip4() {
		return this.addrZip4;
	}

	public void setAddrZip4(String addrZip4) {
		this.addrZip4 = addrZip4;
	}

	@Column(name = "PHONE_AREA", nullable = false, length = 3)
	public String getPhoneArea() {
		return this.phoneArea;
	}

	public void setPhoneArea(String phoneArea) {
		this.phoneArea = phoneArea;
	}

	@Column(name = "PHONE_NBR", nullable = false, length = 7)
	public String getPhoneNbr() {
		return this.phoneNbr;
	}

	public void setPhoneNbr(String phoneNbr) {
		this.phoneNbr = phoneNbr;
	}

	@Column(name = "PHONE_EXT", nullable = false, length = 6)
	public String getPhoneExt() {
		return this.phoneExt;
	}

	public void setPhoneExt(String phoneExt) {
		this.phoneExt = phoneExt;
	}

	@Column(name = "CONTACT", nullable = false, length = 30)
	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bthrInsurCompany")
	public Set<BthrInsurPlan> getBthrInsurPlans() {
		return this.bthrInsurPlans;
	}

	public void setBthrInsurPlans(Set<BthrInsurPlan> bthrInsurPlans) {
		this.bthrInsurPlans = bthrInsurPlans;
	}

}
