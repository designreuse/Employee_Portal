package com.esc20.model;
// Generated Jan 4, 2019 3:55:15 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DrDemo generated by hbm2java
 */
@Entity
@Table(name = "DR_DEMO", schema = "rsccc", catalog = "rsccc")
public class DrDemo implements java.io.Serializable {

	private DrDemoId id;
	private String distName;
	private String regionNbr;
	private String strNbrDist;
	private String strNameDist;
	private String cityNameDist;
	private String stateCd;
	private String zipDist;
	private String zip4Dist;
	private char strDirEdit;
	private String areaCdDist;
	private String phoneNbrDist;
	private String superdtNameL;
	private String superdtNameF;
	private String superdtNameM;
	private String title;
	private char genSuperdt;
	private String FAvalStateId;
	private String lstAvalStateId;
	private String nxtAvalStateId;
	private String coopFsclAgentDist;
	private String coopName;
	private String regDaySchDeafDist;
	private char assignIdNbrs;
	private String nxtAvalStuId;
	private char optEctUndelOrder;
	private char autoSpecPgmsWd;
	private char autoStateIdAssign;
	private char crsAddDropOpt;
	private String specPgmWdRsn;
	private char maintainRecStatOpt;
	private char actFndOrgZeroOpt;
	private char actFndOrgNonzeroOpt;
	private char actFndRestrOpt;
	private char saisdAutoAddGlOpt;
	private char bastropAddClrngFnd;
	private String foodSvcDir;
	private String foodSvcDirTitle;
	private char histGrdAvgOpt;
	private String defaultHomeLangCd;
	private char reqParPerm;
	private char displaySeOnSdsScreen;
	private char useFlapsUpdateNslp;
	private char recsReqSrc;
	private String lowGrdLvlForTrkng;
	private char flapsUseAddrOpt;
	private char preprintWdForm;
	private char universalDisciplineUpdt;
	private String faxPhone;
	private String faxAreaCd;
	private char campusWdRsn;
	private String distCntyName;
	private String distRegionId;
	private String distWebSite;
	private String distEmail;
	private char distType;
	private char stuAppStaffId;
	private char allowSpedImport;
	private Date lastImportDt;
	private char allowMtgr;

	public DrDemo() {
	}

	public DrDemo(DrDemoId id, String distName, String regionNbr, String strNbrDist, String strNameDist,
			String cityNameDist, String stateCd, String zipDist, String zip4Dist, char strDirEdit, String areaCdDist,
			String phoneNbrDist, String superdtNameL, String superdtNameF, String superdtNameM, String title,
			char genSuperdt, String FAvalStateId, String lstAvalStateId, String nxtAvalStateId,
			String coopFsclAgentDist, String coopName, String regDaySchDeafDist, char assignIdNbrs, String nxtAvalStuId,
			char optEctUndelOrder, char autoSpecPgmsWd, char autoStateIdAssign, char crsAddDropOpt, String specPgmWdRsn,
			char maintainRecStatOpt, char actFndOrgZeroOpt, char actFndOrgNonzeroOpt, char actFndRestrOpt,
			char saisdAutoAddGlOpt, char bastropAddClrngFnd, String foodSvcDir, String foodSvcDirTitle,
			char histGrdAvgOpt, String defaultHomeLangCd, char reqParPerm, char displaySeOnSdsScreen,
			char useFlapsUpdateNslp, char recsReqSrc, String lowGrdLvlForTrkng, char flapsUseAddrOpt,
			char preprintWdForm, char universalDisciplineUpdt, String faxPhone, String faxAreaCd, char campusWdRsn,
			String distCntyName, String distRegionId, String distWebSite, String distEmail, char distType,
			char stuAppStaffId, char allowSpedImport, char allowMtgr) {
		this.id = id;
		this.distName = distName;
		this.regionNbr = regionNbr;
		this.strNbrDist = strNbrDist;
		this.strNameDist = strNameDist;
		this.cityNameDist = cityNameDist;
		this.stateCd = stateCd;
		this.zipDist = zipDist;
		this.zip4Dist = zip4Dist;
		this.strDirEdit = strDirEdit;
		this.areaCdDist = areaCdDist;
		this.phoneNbrDist = phoneNbrDist;
		this.superdtNameL = superdtNameL;
		this.superdtNameF = superdtNameF;
		this.superdtNameM = superdtNameM;
		this.title = title;
		this.genSuperdt = genSuperdt;
		this.FAvalStateId = FAvalStateId;
		this.lstAvalStateId = lstAvalStateId;
		this.nxtAvalStateId = nxtAvalStateId;
		this.coopFsclAgentDist = coopFsclAgentDist;
		this.coopName = coopName;
		this.regDaySchDeafDist = regDaySchDeafDist;
		this.assignIdNbrs = assignIdNbrs;
		this.nxtAvalStuId = nxtAvalStuId;
		this.optEctUndelOrder = optEctUndelOrder;
		this.autoSpecPgmsWd = autoSpecPgmsWd;
		this.autoStateIdAssign = autoStateIdAssign;
		this.crsAddDropOpt = crsAddDropOpt;
		this.specPgmWdRsn = specPgmWdRsn;
		this.maintainRecStatOpt = maintainRecStatOpt;
		this.actFndOrgZeroOpt = actFndOrgZeroOpt;
		this.actFndOrgNonzeroOpt = actFndOrgNonzeroOpt;
		this.actFndRestrOpt = actFndRestrOpt;
		this.saisdAutoAddGlOpt = saisdAutoAddGlOpt;
		this.bastropAddClrngFnd = bastropAddClrngFnd;
		this.foodSvcDir = foodSvcDir;
		this.foodSvcDirTitle = foodSvcDirTitle;
		this.histGrdAvgOpt = histGrdAvgOpt;
		this.defaultHomeLangCd = defaultHomeLangCd;
		this.reqParPerm = reqParPerm;
		this.displaySeOnSdsScreen = displaySeOnSdsScreen;
		this.useFlapsUpdateNslp = useFlapsUpdateNslp;
		this.recsReqSrc = recsReqSrc;
		this.lowGrdLvlForTrkng = lowGrdLvlForTrkng;
		this.flapsUseAddrOpt = flapsUseAddrOpt;
		this.preprintWdForm = preprintWdForm;
		this.universalDisciplineUpdt = universalDisciplineUpdt;
		this.faxPhone = faxPhone;
		this.faxAreaCd = faxAreaCd;
		this.campusWdRsn = campusWdRsn;
		this.distCntyName = distCntyName;
		this.distRegionId = distRegionId;
		this.distWebSite = distWebSite;
		this.distEmail = distEmail;
		this.distType = distType;
		this.stuAppStaffId = stuAppStaffId;
		this.allowSpedImport = allowSpedImport;
		this.allowMtgr = allowMtgr;
	}

	public DrDemo(DrDemoId id, String distName, String regionNbr, String strNbrDist, String strNameDist,
			String cityNameDist, String stateCd, String zipDist, String zip4Dist, char strDirEdit, String areaCdDist,
			String phoneNbrDist, String superdtNameL, String superdtNameF, String superdtNameM, String title,
			char genSuperdt, String FAvalStateId, String lstAvalStateId, String nxtAvalStateId,
			String coopFsclAgentDist, String coopName, String regDaySchDeafDist, char assignIdNbrs, String nxtAvalStuId,
			char optEctUndelOrder, char autoSpecPgmsWd, char autoStateIdAssign, char crsAddDropOpt, String specPgmWdRsn,
			char maintainRecStatOpt, char actFndOrgZeroOpt, char actFndOrgNonzeroOpt, char actFndRestrOpt,
			char saisdAutoAddGlOpt, char bastropAddClrngFnd, String foodSvcDir, String foodSvcDirTitle,
			char histGrdAvgOpt, String defaultHomeLangCd, char reqParPerm, char displaySeOnSdsScreen,
			char useFlapsUpdateNslp, char recsReqSrc, String lowGrdLvlForTrkng, char flapsUseAddrOpt,
			char preprintWdForm, char universalDisciplineUpdt, String faxPhone, String faxAreaCd, char campusWdRsn,
			String distCntyName, String distRegionId, String distWebSite, String distEmail, char distType,
			char stuAppStaffId, char allowSpedImport, Date lastImportDt, char allowMtgr) {
		this.id = id;
		this.distName = distName;
		this.regionNbr = regionNbr;
		this.strNbrDist = strNbrDist;
		this.strNameDist = strNameDist;
		this.cityNameDist = cityNameDist;
		this.stateCd = stateCd;
		this.zipDist = zipDist;
		this.zip4Dist = zip4Dist;
		this.strDirEdit = strDirEdit;
		this.areaCdDist = areaCdDist;
		this.phoneNbrDist = phoneNbrDist;
		this.superdtNameL = superdtNameL;
		this.superdtNameF = superdtNameF;
		this.superdtNameM = superdtNameM;
		this.title = title;
		this.genSuperdt = genSuperdt;
		this.FAvalStateId = FAvalStateId;
		this.lstAvalStateId = lstAvalStateId;
		this.nxtAvalStateId = nxtAvalStateId;
		this.coopFsclAgentDist = coopFsclAgentDist;
		this.coopName = coopName;
		this.regDaySchDeafDist = regDaySchDeafDist;
		this.assignIdNbrs = assignIdNbrs;
		this.nxtAvalStuId = nxtAvalStuId;
		this.optEctUndelOrder = optEctUndelOrder;
		this.autoSpecPgmsWd = autoSpecPgmsWd;
		this.autoStateIdAssign = autoStateIdAssign;
		this.crsAddDropOpt = crsAddDropOpt;
		this.specPgmWdRsn = specPgmWdRsn;
		this.maintainRecStatOpt = maintainRecStatOpt;
		this.actFndOrgZeroOpt = actFndOrgZeroOpt;
		this.actFndOrgNonzeroOpt = actFndOrgNonzeroOpt;
		this.actFndRestrOpt = actFndRestrOpt;
		this.saisdAutoAddGlOpt = saisdAutoAddGlOpt;
		this.bastropAddClrngFnd = bastropAddClrngFnd;
		this.foodSvcDir = foodSvcDir;
		this.foodSvcDirTitle = foodSvcDirTitle;
		this.histGrdAvgOpt = histGrdAvgOpt;
		this.defaultHomeLangCd = defaultHomeLangCd;
		this.reqParPerm = reqParPerm;
		this.displaySeOnSdsScreen = displaySeOnSdsScreen;
		this.useFlapsUpdateNslp = useFlapsUpdateNslp;
		this.recsReqSrc = recsReqSrc;
		this.lowGrdLvlForTrkng = lowGrdLvlForTrkng;
		this.flapsUseAddrOpt = flapsUseAddrOpt;
		this.preprintWdForm = preprintWdForm;
		this.universalDisciplineUpdt = universalDisciplineUpdt;
		this.faxPhone = faxPhone;
		this.faxAreaCd = faxAreaCd;
		this.campusWdRsn = campusWdRsn;
		this.distCntyName = distCntyName;
		this.distRegionId = distRegionId;
		this.distWebSite = distWebSite;
		this.distEmail = distEmail;
		this.distType = distType;
		this.stuAppStaffId = stuAppStaffId;
		this.allowSpedImport = allowSpedImport;
		this.lastImportDt = lastImportDt;
		this.allowMtgr = allowMtgr;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "schYr", column = @Column(name = "SCH_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "distId", column = @Column(name = "DIST_ID", nullable = false, length = 6)) })
	public DrDemoId getId() {
		return this.id;
	}

	public void setId(DrDemoId id) {
		this.id = id;
	}

	@Column(name = "DIST_NAME", nullable = false, length = 34)
	public String getDistName() {
		return this.distName;
	}

	public void setDistName(String distName) {
		this.distName = distName;
	}

	@Column(name = "REGION_NBR", nullable = false, length = 2)
	public String getRegionNbr() {
		return this.regionNbr;
	}

	public void setRegionNbr(String regionNbr) {
		this.regionNbr = regionNbr;
	}

	@Column(name = "STR_NBR_DIST", nullable = false, length = 9)
	public String getStrNbrDist() {
		return this.strNbrDist;
	}

	public void setStrNbrDist(String strNbrDist) {
		this.strNbrDist = strNbrDist;
	}

	@Column(name = "STR_NAME_DIST", nullable = false, length = 19)
	public String getStrNameDist() {
		return this.strNameDist;
	}

	public void setStrNameDist(String strNameDist) {
		this.strNameDist = strNameDist;
	}

	@Column(name = "CITY_NAME_DIST", nullable = false, length = 17)
	public String getCityNameDist() {
		return this.cityNameDist;
	}

	public void setCityNameDist(String cityNameDist) {
		this.cityNameDist = cityNameDist;
	}

	@Column(name = "STATE_CD", nullable = false, length = 2)
	public String getStateCd() {
		return this.stateCd;
	}

	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}

	@Column(name = "ZIP_DIST", nullable = false, length = 5)
	public String getZipDist() {
		return this.zipDist;
	}

	public void setZipDist(String zipDist) {
		this.zipDist = zipDist;
	}

	@Column(name = "ZIP4_DIST", nullable = false, length = 4)
	public String getZip4Dist() {
		return this.zip4Dist;
	}

	public void setZip4Dist(String zip4Dist) {
		this.zip4Dist = zip4Dist;
	}

	@Column(name = "STR_DIR_EDIT", nullable = false, length = 1)
	public char getStrDirEdit() {
		return this.strDirEdit;
	}

	public void setStrDirEdit(char strDirEdit) {
		this.strDirEdit = strDirEdit;
	}

	@Column(name = "AREA_CD_DIST", nullable = false, length = 3)
	public String getAreaCdDist() {
		return this.areaCdDist;
	}

	public void setAreaCdDist(String areaCdDist) {
		this.areaCdDist = areaCdDist;
	}

	@Column(name = "PHONE_NBR_DIST", nullable = false, length = 7)
	public String getPhoneNbrDist() {
		return this.phoneNbrDist;
	}

	public void setPhoneNbrDist(String phoneNbrDist) {
		this.phoneNbrDist = phoneNbrDist;
	}

	@Column(name = "SUPERDT_NAME_L", nullable = false, length = 25)
	public String getSuperdtNameL() {
		return this.superdtNameL;
	}

	public void setSuperdtNameL(String superdtNameL) {
		this.superdtNameL = superdtNameL;
	}

	@Column(name = "SUPERDT_NAME_F", nullable = false, length = 17)
	public String getSuperdtNameF() {
		return this.superdtNameF;
	}

	public void setSuperdtNameF(String superdtNameF) {
		this.superdtNameF = superdtNameF;
	}

	@Column(name = "SUPERDT_NAME_M", nullable = false, length = 14)
	public String getSuperdtNameM() {
		return this.superdtNameM;
	}

	public void setSuperdtNameM(String superdtNameM) {
		this.superdtNameM = superdtNameM;
	}

	@Column(name = "TITLE", nullable = false, length = 5)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "GEN_SUPERDT", nullable = false, length = 1)
	public char getGenSuperdt() {
		return this.genSuperdt;
	}

	public void setGenSuperdt(char genSuperdt) {
		this.genSuperdt = genSuperdt;
	}

	@Column(name = "F_AVAL_STATE_ID", nullable = false, length = 9)
	public String getFAvalStateId() {
		return this.FAvalStateId;
	}

	public void setFAvalStateId(String FAvalStateId) {
		this.FAvalStateId = FAvalStateId;
	}

	@Column(name = "LST_AVAL_STATE_ID", nullable = false, length = 9)
	public String getLstAvalStateId() {
		return this.lstAvalStateId;
	}

	public void setLstAvalStateId(String lstAvalStateId) {
		this.lstAvalStateId = lstAvalStateId;
	}

	@Column(name = "NXT_AVAL_STATE_ID", nullable = false, length = 9)
	public String getNxtAvalStateId() {
		return this.nxtAvalStateId;
	}

	public void setNxtAvalStateId(String nxtAvalStateId) {
		this.nxtAvalStateId = nxtAvalStateId;
	}

	@Column(name = "COOP_FSCL_AGENT_DIST", nullable = false, length = 6)
	public String getCoopFsclAgentDist() {
		return this.coopFsclAgentDist;
	}

	public void setCoopFsclAgentDist(String coopFsclAgentDist) {
		this.coopFsclAgentDist = coopFsclAgentDist;
	}

	@Column(name = "COOP_NAME", nullable = false, length = 30)
	public String getCoopName() {
		return this.coopName;
	}

	public void setCoopName(String coopName) {
		this.coopName = coopName;
	}

	@Column(name = "REG_DAY_SCH_DEAF_DIST", nullable = false, length = 6)
	public String getRegDaySchDeafDist() {
		return this.regDaySchDeafDist;
	}

	public void setRegDaySchDeafDist(String regDaySchDeafDist) {
		this.regDaySchDeafDist = regDaySchDeafDist;
	}

	@Column(name = "ASSIGN_ID_NBRS", nullable = false, length = 1)
	public char getAssignIdNbrs() {
		return this.assignIdNbrs;
	}

	public void setAssignIdNbrs(char assignIdNbrs) {
		this.assignIdNbrs = assignIdNbrs;
	}

	@Column(name = "NXT_AVAL_STU_ID", nullable = false, length = 6)
	public String getNxtAvalStuId() {
		return this.nxtAvalStuId;
	}

	public void setNxtAvalStuId(String nxtAvalStuId) {
		this.nxtAvalStuId = nxtAvalStuId;
	}

	@Column(name = "OPT_ECT_UNDEL_ORDER", nullable = false, length = 1)
	public char getOptEctUndelOrder() {
		return this.optEctUndelOrder;
	}

	public void setOptEctUndelOrder(char optEctUndelOrder) {
		this.optEctUndelOrder = optEctUndelOrder;
	}

	@Column(name = "AUTO_SPEC_PGMS_WD", nullable = false, length = 1)
	public char getAutoSpecPgmsWd() {
		return this.autoSpecPgmsWd;
	}

	public void setAutoSpecPgmsWd(char autoSpecPgmsWd) {
		this.autoSpecPgmsWd = autoSpecPgmsWd;
	}

	@Column(name = "AUTO_STATE_ID_ASSIGN", nullable = false, length = 1)
	public char getAutoStateIdAssign() {
		return this.autoStateIdAssign;
	}

	public void setAutoStateIdAssign(char autoStateIdAssign) {
		this.autoStateIdAssign = autoStateIdAssign;
	}

	@Column(name = "CRS_ADD_DROP_OPT", nullable = false, length = 1)
	public char getCrsAddDropOpt() {
		return this.crsAddDropOpt;
	}

	public void setCrsAddDropOpt(char crsAddDropOpt) {
		this.crsAddDropOpt = crsAddDropOpt;
	}

	@Column(name = "SPEC_PGM_WD_RSN", nullable = false, length = 2)
	public String getSpecPgmWdRsn() {
		return this.specPgmWdRsn;
	}

	public void setSpecPgmWdRsn(String specPgmWdRsn) {
		this.specPgmWdRsn = specPgmWdRsn;
	}

	@Column(name = "MAINTAIN_REC_STAT_OPT", nullable = false, length = 1)
	public char getMaintainRecStatOpt() {
		return this.maintainRecStatOpt;
	}

	public void setMaintainRecStatOpt(char maintainRecStatOpt) {
		this.maintainRecStatOpt = maintainRecStatOpt;
	}

	@Column(name = "ACT_FND_ORG_ZERO_OPT", nullable = false, length = 1)
	public char getActFndOrgZeroOpt() {
		return this.actFndOrgZeroOpt;
	}

	public void setActFndOrgZeroOpt(char actFndOrgZeroOpt) {
		this.actFndOrgZeroOpt = actFndOrgZeroOpt;
	}

	@Column(name = "ACT_FND_ORG_NONZERO_OPT", nullable = false, length = 1)
	public char getActFndOrgNonzeroOpt() {
		return this.actFndOrgNonzeroOpt;
	}

	public void setActFndOrgNonzeroOpt(char actFndOrgNonzeroOpt) {
		this.actFndOrgNonzeroOpt = actFndOrgNonzeroOpt;
	}

	@Column(name = "ACT_FND_RESTR_OPT", nullable = false, length = 1)
	public char getActFndRestrOpt() {
		return this.actFndRestrOpt;
	}

	public void setActFndRestrOpt(char actFndRestrOpt) {
		this.actFndRestrOpt = actFndRestrOpt;
	}

	@Column(name = "SAISD_AUTO_ADD_GL_OPT", nullable = false, length = 1)
	public char getSaisdAutoAddGlOpt() {
		return this.saisdAutoAddGlOpt;
	}

	public void setSaisdAutoAddGlOpt(char saisdAutoAddGlOpt) {
		this.saisdAutoAddGlOpt = saisdAutoAddGlOpt;
	}

	@Column(name = "BASTROP_ADD_CLRNG_FND", nullable = false, length = 1)
	public char getBastropAddClrngFnd() {
		return this.bastropAddClrngFnd;
	}

	public void setBastropAddClrngFnd(char bastropAddClrngFnd) {
		this.bastropAddClrngFnd = bastropAddClrngFnd;
	}

	@Column(name = "FOOD_SVC_DIR", nullable = false, length = 25)
	public String getFoodSvcDir() {
		return this.foodSvcDir;
	}

	public void setFoodSvcDir(String foodSvcDir) {
		this.foodSvcDir = foodSvcDir;
	}

	@Column(name = "FOOD_SVC_DIR_TITLE", nullable = false, length = 45)
	public String getFoodSvcDirTitle() {
		return this.foodSvcDirTitle;
	}

	public void setFoodSvcDirTitle(String foodSvcDirTitle) {
		this.foodSvcDirTitle = foodSvcDirTitle;
	}

	@Column(name = "HIST_GRD_AVG_OPT", nullable = false, length = 1)
	public char getHistGrdAvgOpt() {
		return this.histGrdAvgOpt;
	}

	public void setHistGrdAvgOpt(char histGrdAvgOpt) {
		this.histGrdAvgOpt = histGrdAvgOpt;
	}

	@Column(name = "DEFAULT_HOME_LANG_CD", nullable = false, length = 2)
	public String getDefaultHomeLangCd() {
		return this.defaultHomeLangCd;
	}

	public void setDefaultHomeLangCd(String defaultHomeLangCd) {
		this.defaultHomeLangCd = defaultHomeLangCd;
	}

	@Column(name = "REQ_PAR_PERM", nullable = false, length = 1)
	public char getReqParPerm() {
		return this.reqParPerm;
	}

	public void setReqParPerm(char reqParPerm) {
		this.reqParPerm = reqParPerm;
	}

	@Column(name = "DISPLAY_SE_ON_SDS_SCREEN", nullable = false, length = 1)
	public char getDisplaySeOnSdsScreen() {
		return this.displaySeOnSdsScreen;
	}

	public void setDisplaySeOnSdsScreen(char displaySeOnSdsScreen) {
		this.displaySeOnSdsScreen = displaySeOnSdsScreen;
	}

	@Column(name = "USE_FLAPS_UPDATE_NSLP", nullable = false, length = 1)
	public char getUseFlapsUpdateNslp() {
		return this.useFlapsUpdateNslp;
	}

	public void setUseFlapsUpdateNslp(char useFlapsUpdateNslp) {
		this.useFlapsUpdateNslp = useFlapsUpdateNslp;
	}

	@Column(name = "RECS_REQ_SRC", nullable = false, length = 1)
	public char getRecsReqSrc() {
		return this.recsReqSrc;
	}

	public void setRecsReqSrc(char recsReqSrc) {
		this.recsReqSrc = recsReqSrc;
	}

	@Column(name = "LOW_GRD_LVL_FOR_TRKNG", nullable = false, length = 2)
	public String getLowGrdLvlForTrkng() {
		return this.lowGrdLvlForTrkng;
	}

	public void setLowGrdLvlForTrkng(String lowGrdLvlForTrkng) {
		this.lowGrdLvlForTrkng = lowGrdLvlForTrkng;
	}

	@Column(name = "FLAPS_USE_ADDR_OPT", nullable = false, length = 1)
	public char getFlapsUseAddrOpt() {
		return this.flapsUseAddrOpt;
	}

	public void setFlapsUseAddrOpt(char flapsUseAddrOpt) {
		this.flapsUseAddrOpt = flapsUseAddrOpt;
	}

	@Column(name = "PREPRINT_WD_FORM", nullable = false, length = 1)
	public char getPreprintWdForm() {
		return this.preprintWdForm;
	}

	public void setPreprintWdForm(char preprintWdForm) {
		this.preprintWdForm = preprintWdForm;
	}

	@Column(name = "UNIVERSAL_DISCIPLINE_UPDT", nullable = false, length = 1)
	public char getUniversalDisciplineUpdt() {
		return this.universalDisciplineUpdt;
	}

	public void setUniversalDisciplineUpdt(char universalDisciplineUpdt) {
		this.universalDisciplineUpdt = universalDisciplineUpdt;
	}

	@Column(name = "FAX_PHONE", nullable = false, length = 7)
	public String getFaxPhone() {
		return this.faxPhone;
	}

	public void setFaxPhone(String faxPhone) {
		this.faxPhone = faxPhone;
	}

	@Column(name = "FAX_AREA_CD", nullable = false, length = 3)
	public String getFaxAreaCd() {
		return this.faxAreaCd;
	}

	public void setFaxAreaCd(String faxAreaCd) {
		this.faxAreaCd = faxAreaCd;
	}

	@Column(name = "CAMPUS_WD_RSN", nullable = false, length = 1)
	public char getCampusWdRsn() {
		return this.campusWdRsn;
	}

	public void setCampusWdRsn(char campusWdRsn) {
		this.campusWdRsn = campusWdRsn;
	}

	@Column(name = "DIST_CNTY_NAME", nullable = false, length = 20)
	public String getDistCntyName() {
		return this.distCntyName;
	}

	public void setDistCntyName(String distCntyName) {
		this.distCntyName = distCntyName;
	}

	@Column(name = "DIST_REGION_ID", nullable = false, length = 6)
	public String getDistRegionId() {
		return this.distRegionId;
	}

	public void setDistRegionId(String distRegionId) {
		this.distRegionId = distRegionId;
	}

	@Column(name = "DIST_WEB_SITE", nullable = false)
	public String getDistWebSite() {
		return this.distWebSite;
	}

	public void setDistWebSite(String distWebSite) {
		this.distWebSite = distWebSite;
	}

	@Column(name = "DIST_EMAIL", nullable = false)
	public String getDistEmail() {
		return this.distEmail;
	}

	public void setDistEmail(String distEmail) {
		this.distEmail = distEmail;
	}

	@Column(name = "DIST_TYPE", nullable = false, length = 1)
	public char getDistType() {
		return this.distType;
	}

	public void setDistType(char distType) {
		this.distType = distType;
	}

	@Column(name = "STU_APP_STAFF_ID", nullable = false, length = 1)
	public char getStuAppStaffId() {
		return this.stuAppStaffId;
	}

	public void setStuAppStaffId(char stuAppStaffId) {
		this.stuAppStaffId = stuAppStaffId;
	}

	@Column(name = "ALLOW_SPED_IMPORT", nullable = false, length = 1)
	public char getAllowSpedImport() {
		return this.allowSpedImport;
	}

	public void setAllowSpedImport(char allowSpedImport) {
		this.allowSpedImport = allowSpedImport;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_IMPORT_DT", length = 23)
	public Date getLastImportDt() {
		return this.lastImportDt;
	}

	public void setLastImportDt(Date lastImportDt) {
		this.lastImportDt = lastImportDt;
	}

	@Column(name = "ALLOW_MTGR", nullable = false, length = 1)
	public char getAllowMtgr() {
		return this.allowMtgr;
	}

	public void setAllowMtgr(char allowMtgr) {
		this.allowMtgr = allowMtgr;
	}

}
