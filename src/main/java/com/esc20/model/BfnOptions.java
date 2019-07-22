package com.esc20.model;
// Generated Jan 10, 2019 9:13:30 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BfnOptions generated by hbm2java
 */
@Entity
@Table(name = "BFN_OPTIONS", schema = "rsccc", catalog = "rsccc")
public class BfnOptions implements java.io.Serializable {
	private static final long serialVersionUID = 1679135540070928360L;
	private char glFileId;
	private String districtId;
	private String perCurrent;
	private String perNext;
	private String perThird;
	private String perReqCurrent;
	private String perReqNext;
	private String perReqThird;
	private String perWork;
	private String perCafe;
	private String perAcctRcv;
	private String dueFromObj;
	private String dueFromSobj;
	private String beginSchDt;
	private String eomCutoff;
	private char poObjCdRestrict;
	private String lastEomDt;
	private char acctYr;
	private char finRptSortFlag;
	private char autoAddGlRec;
	private char prntVoidedChkOnRegister;
	private char boardApprvdPoOpt;
	private char prvFileId;
	private char currFileId;
	private char invoiceFileId3;
	private char reconOpt;
	private char teaNewResourceFlag;
	private char autoAssgnVendorNbr;
	private String nxtAvailVendorNbr;
	private String eftImmdDest;
	private String eftCoIdTyp5;
	private String eftOrigDfiId;
	private String eftBankCd;
	private String eftImmdOrigin;
	private char eftOriginStatCd;
	private String eftCoIdTyp8;
	private String eftEmplrOffsetAcct;
	private char checkFormInd;
	private String schYrFrom;
	private String schYrTo;
	private char assgnCashRcpt;
	private String nxtCashRcptNbr;
	private char useFixedAssetsXrefTbl;
	private char deferdPayableDtUsed;
	private char autoXferJvFinCks;
	private char autoXferJvPayCks;
	private String distEin;
	private char currClose;
	private String defaultAmendRsn;
	private String firstPaydateSchYr;
	private char assgnPaNbr;
	private int nxtAvailPaNbr;
	private char assgnJvNbr;
	private int nxtAvailJvNbr;
	private char chgPoReq;
	private String amendCutoffDt;
	private int lastChkNbr;
	private char prtDistEin;
	private String actfnd;
	private char actfndYr;
	private char actfndOffset;
	private char useFinClrFund;
	private char assgnCyrReqNbr;
	private String nxtAvailCyrReqNbr;
	private char assgnNyrReqNbr;
	private String nxtAvailNyrReqNbr;
	private char assgnCyrPoNbr;
	private String nxtAvailCyrPoNbr;
	private char assgnNyrPoNbr;
	private String nxtAvailNyrPoNbr;
	private String module;
	private char assgnAmendNbr;
	private String nxtAvailAmendNbr;
	private String indrctCostObj;
	private String indrctCostSobj;
	private char apprvlProcBar;
	private char resetApprvlPath;
	private char resetApprvlPathPur;
	private String eftAchSvcClasCd;
	private char dispGlInqWarn;
	private String strtAcctPer;
	private String eftFinImmdDest;
	private String eftFinCoIdTyp5;
	private String eftFinOrigDfiId;
	private String eftFinBankCd;
	private String eftFinImmdOrigin;
	private char eftFinOriginStatCd;
	private String eftFinCoIdTyp8;
	private String eftFinEmplrOffsetAcct;
	private String eftFinAchSvcClasCd;
	private int LEftRefNbr;

	public BfnOptions() {
	}

	public BfnOptions(char glFileId, String districtId, String perCurrent, String perNext, String perThird,
			String perReqCurrent, String perReqNext, String perReqThird, String perWork, String perCafe,
			String perAcctRcv, String dueFromObj, String dueFromSobj, String beginSchDt, String eomCutoff,
			char poObjCdRestrict, String lastEomDt, char acctYr, char finRptSortFlag, char autoAddGlRec,
			char prntVoidedChkOnRegister, char boardApprvdPoOpt, char prvFileId, char currFileId, char invoiceFileId3,
			char reconOpt, char teaNewResourceFlag, char autoAssgnVendorNbr, String nxtAvailVendorNbr,
			String eftImmdDest, String eftCoIdTyp5, String eftOrigDfiId, String eftBankCd, String eftImmdOrigin,
			char eftOriginStatCd, String eftCoIdTyp8, String eftEmplrOffsetAcct, char checkFormInd, String schYrFrom,
			String schYrTo, char assgnCashRcpt, String nxtCashRcptNbr, char useFixedAssetsXrefTbl,
			char deferdPayableDtUsed, char autoXferJvFinCks, char autoXferJvPayCks, String distEin, char currClose,
			String defaultAmendRsn, String firstPaydateSchYr, char assgnPaNbr, int nxtAvailPaNbr, char assgnJvNbr,
			int nxtAvailJvNbr, char chgPoReq, String amendCutoffDt, int lastChkNbr, char prtDistEin, String actfnd,
			char actfndYr, char actfndOffset, char useFinClrFund, char assgnCyrReqNbr, String nxtAvailCyrReqNbr,
			char assgnNyrReqNbr, String nxtAvailNyrReqNbr, char assgnCyrPoNbr, String nxtAvailCyrPoNbr,
			char assgnNyrPoNbr, String nxtAvailNyrPoNbr, String module, char assgnAmendNbr, String nxtAvailAmendNbr,
			String indrctCostObj, String indrctCostSobj, char apprvlProcBar, char resetApprvlPath,
			char resetApprvlPathPur, String eftAchSvcClasCd, char dispGlInqWarn, String strtAcctPer,
			String eftFinImmdDest, String eftFinCoIdTyp5, String eftFinOrigDfiId, String eftFinBankCd,
			String eftFinImmdOrigin, char eftFinOriginStatCd, String eftFinCoIdTyp8, String eftFinEmplrOffsetAcct,
			String eftFinAchSvcClasCd, int LEftRefNbr) {
		this.glFileId = glFileId;
		this.districtId = districtId;
		this.perCurrent = perCurrent;
		this.perNext = perNext;
		this.perThird = perThird;
		this.perReqCurrent = perReqCurrent;
		this.perReqNext = perReqNext;
		this.perReqThird = perReqThird;
		this.perWork = perWork;
		this.perCafe = perCafe;
		this.perAcctRcv = perAcctRcv;
		this.dueFromObj = dueFromObj;
		this.dueFromSobj = dueFromSobj;
		this.beginSchDt = beginSchDt;
		this.eomCutoff = eomCutoff;
		this.poObjCdRestrict = poObjCdRestrict;
		this.lastEomDt = lastEomDt;
		this.acctYr = acctYr;
		this.finRptSortFlag = finRptSortFlag;
		this.autoAddGlRec = autoAddGlRec;
		this.prntVoidedChkOnRegister = prntVoidedChkOnRegister;
		this.boardApprvdPoOpt = boardApprvdPoOpt;
		this.prvFileId = prvFileId;
		this.currFileId = currFileId;
		this.invoiceFileId3 = invoiceFileId3;
		this.reconOpt = reconOpt;
		this.teaNewResourceFlag = teaNewResourceFlag;
		this.autoAssgnVendorNbr = autoAssgnVendorNbr;
		this.nxtAvailVendorNbr = nxtAvailVendorNbr;
		this.eftImmdDest = eftImmdDest;
		this.eftCoIdTyp5 = eftCoIdTyp5;
		this.eftOrigDfiId = eftOrigDfiId;
		this.eftBankCd = eftBankCd;
		this.eftImmdOrigin = eftImmdOrigin;
		this.eftOriginStatCd = eftOriginStatCd;
		this.eftCoIdTyp8 = eftCoIdTyp8;
		this.eftEmplrOffsetAcct = eftEmplrOffsetAcct;
		this.checkFormInd = checkFormInd;
		this.schYrFrom = schYrFrom;
		this.schYrTo = schYrTo;
		this.assgnCashRcpt = assgnCashRcpt;
		this.nxtCashRcptNbr = nxtCashRcptNbr;
		this.useFixedAssetsXrefTbl = useFixedAssetsXrefTbl;
		this.deferdPayableDtUsed = deferdPayableDtUsed;
		this.autoXferJvFinCks = autoXferJvFinCks;
		this.autoXferJvPayCks = autoXferJvPayCks;
		this.distEin = distEin;
		this.currClose = currClose;
		this.defaultAmendRsn = defaultAmendRsn;
		this.firstPaydateSchYr = firstPaydateSchYr;
		this.assgnPaNbr = assgnPaNbr;
		this.nxtAvailPaNbr = nxtAvailPaNbr;
		this.assgnJvNbr = assgnJvNbr;
		this.nxtAvailJvNbr = nxtAvailJvNbr;
		this.chgPoReq = chgPoReq;
		this.amendCutoffDt = amendCutoffDt;
		this.lastChkNbr = lastChkNbr;
		this.prtDistEin = prtDistEin;
		this.actfnd = actfnd;
		this.actfndYr = actfndYr;
		this.actfndOffset = actfndOffset;
		this.useFinClrFund = useFinClrFund;
		this.assgnCyrReqNbr = assgnCyrReqNbr;
		this.nxtAvailCyrReqNbr = nxtAvailCyrReqNbr;
		this.assgnNyrReqNbr = assgnNyrReqNbr;
		this.nxtAvailNyrReqNbr = nxtAvailNyrReqNbr;
		this.assgnCyrPoNbr = assgnCyrPoNbr;
		this.nxtAvailCyrPoNbr = nxtAvailCyrPoNbr;
		this.assgnNyrPoNbr = assgnNyrPoNbr;
		this.nxtAvailNyrPoNbr = nxtAvailNyrPoNbr;
		this.module = module;
		this.assgnAmendNbr = assgnAmendNbr;
		this.nxtAvailAmendNbr = nxtAvailAmendNbr;
		this.indrctCostObj = indrctCostObj;
		this.indrctCostSobj = indrctCostSobj;
		this.apprvlProcBar = apprvlProcBar;
		this.resetApprvlPath = resetApprvlPath;
		this.resetApprvlPathPur = resetApprvlPathPur;
		this.eftAchSvcClasCd = eftAchSvcClasCd;
		this.dispGlInqWarn = dispGlInqWarn;
		this.strtAcctPer = strtAcctPer;
		this.eftFinImmdDest = eftFinImmdDest;
		this.eftFinCoIdTyp5 = eftFinCoIdTyp5;
		this.eftFinOrigDfiId = eftFinOrigDfiId;
		this.eftFinBankCd = eftFinBankCd;
		this.eftFinImmdOrigin = eftFinImmdOrigin;
		this.eftFinOriginStatCd = eftFinOriginStatCd;
		this.eftFinCoIdTyp8 = eftFinCoIdTyp8;
		this.eftFinEmplrOffsetAcct = eftFinEmplrOffsetAcct;
		this.eftFinAchSvcClasCd = eftFinAchSvcClasCd;
		this.LEftRefNbr = LEftRefNbr;
	}

	@Id

	@Column(name = "GL_FILE_ID", nullable = false, length = 1)
	public char getGlFileId() {
		return this.glFileId;
	}

	public void setGlFileId(char glFileId) {
		this.glFileId = glFileId;
	}

	@Column(name = "DISTRICT_ID", nullable = false, length = 6)
	public String getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	@Column(name = "PER_CURRENT", nullable = false, length = 2)
	public String getPerCurrent() {
		return this.perCurrent;
	}

	public void setPerCurrent(String perCurrent) {
		this.perCurrent = perCurrent;
	}

	@Column(name = "PER_NEXT", nullable = false, length = 2)
	public String getPerNext() {
		return this.perNext;
	}

	public void setPerNext(String perNext) {
		this.perNext = perNext;
	}

	@Column(name = "PER_THIRD", nullable = false, length = 2)
	public String getPerThird() {
		return this.perThird;
	}

	public void setPerThird(String perThird) {
		this.perThird = perThird;
	}

	@Column(name = "PER_REQ_CURRENT", nullable = false, length = 2)
	public String getPerReqCurrent() {
		return this.perReqCurrent;
	}

	public void setPerReqCurrent(String perReqCurrent) {
		this.perReqCurrent = perReqCurrent;
	}

	@Column(name = "PER_REQ_NEXT", nullable = false, length = 2)
	public String getPerReqNext() {
		return this.perReqNext;
	}

	public void setPerReqNext(String perReqNext) {
		this.perReqNext = perReqNext;
	}

	@Column(name = "PER_REQ_THIRD", nullable = false, length = 2)
	public String getPerReqThird() {
		return this.perReqThird;
	}

	public void setPerReqThird(String perReqThird) {
		this.perReqThird = perReqThird;
	}

	@Column(name = "PER_WORK", nullable = false, length = 2)
	public String getPerWork() {
		return this.perWork;
	}

	public void setPerWork(String perWork) {
		this.perWork = perWork;
	}

	@Column(name = "PER_CAFE", nullable = false, length = 2)
	public String getPerCafe() {
		return this.perCafe;
	}

	public void setPerCafe(String perCafe) {
		this.perCafe = perCafe;
	}

	@Column(name = "PER_ACCT_RCV", nullable = false, length = 2)
	public String getPerAcctRcv() {
		return this.perAcctRcv;
	}

	public void setPerAcctRcv(String perAcctRcv) {
		this.perAcctRcv = perAcctRcv;
	}

	@Column(name = "DUE_FROM_OBJ", nullable = false, length = 4)
	public String getDueFromObj() {
		return this.dueFromObj;
	}

	public void setDueFromObj(String dueFromObj) {
		this.dueFromObj = dueFromObj;
	}

	@Column(name = "DUE_FROM_SOBJ", nullable = false, length = 2)
	public String getDueFromSobj() {
		return this.dueFromSobj;
	}

	public void setDueFromSobj(String dueFromSobj) {
		this.dueFromSobj = dueFromSobj;
	}

	@Column(name = "BEGIN_SCH_DT", nullable = false, length = 8)
	public String getBeginSchDt() {
		return this.beginSchDt;
	}

	public void setBeginSchDt(String beginSchDt) {
		this.beginSchDt = beginSchDt;
	}

	@Column(name = "EOM_CUTOFF", nullable = false, length = 8)
	public String getEomCutoff() {
		return this.eomCutoff;
	}

	public void setEomCutoff(String eomCutoff) {
		this.eomCutoff = eomCutoff;
	}

	@Column(name = "PO_OBJ_CD_RESTRICT", nullable = false, length = 1)
	public char getPoObjCdRestrict() {
		return this.poObjCdRestrict;
	}

	public void setPoObjCdRestrict(char poObjCdRestrict) {
		this.poObjCdRestrict = poObjCdRestrict;
	}

	@Column(name = "LAST_EOM_DT", nullable = false, length = 8)
	public String getLastEomDt() {
		return this.lastEomDt;
	}

	public void setLastEomDt(String lastEomDt) {
		this.lastEomDt = lastEomDt;
	}

	@Column(name = "ACCT_YR", nullable = false, length = 1)
	public char getAcctYr() {
		return this.acctYr;
	}

	public void setAcctYr(char acctYr) {
		this.acctYr = acctYr;
	}

	@Column(name = "FIN_RPT_SORT_FLAG", nullable = false, length = 1)
	public char getFinRptSortFlag() {
		return this.finRptSortFlag;
	}

	public void setFinRptSortFlag(char finRptSortFlag) {
		this.finRptSortFlag = finRptSortFlag;
	}

	@Column(name = "AUTO_ADD_GL_REC", nullable = false, length = 1)
	public char getAutoAddGlRec() {
		return this.autoAddGlRec;
	}

	public void setAutoAddGlRec(char autoAddGlRec) {
		this.autoAddGlRec = autoAddGlRec;
	}

	@Column(name = "PRNT_VOIDED_CHK_ON_REGISTER", nullable = false, length = 1)
	public char getPrntVoidedChkOnRegister() {
		return this.prntVoidedChkOnRegister;
	}

	public void setPrntVoidedChkOnRegister(char prntVoidedChkOnRegister) {
		this.prntVoidedChkOnRegister = prntVoidedChkOnRegister;
	}

	@Column(name = "BOARD_APPRVD_PO_OPT", nullable = false, length = 1)
	public char getBoardApprvdPoOpt() {
		return this.boardApprvdPoOpt;
	}

	public void setBoardApprvdPoOpt(char boardApprvdPoOpt) {
		this.boardApprvdPoOpt = boardApprvdPoOpt;
	}

	@Column(name = "PRV_FILE_ID", nullable = false, length = 1)
	public char getPrvFileId() {
		return this.prvFileId;
	}

	public void setPrvFileId(char prvFileId) {
		this.prvFileId = prvFileId;
	}

	@Column(name = "CURR_FILE_ID", nullable = false, length = 1)
	public char getCurrFileId() {
		return this.currFileId;
	}

	public void setCurrFileId(char currFileId) {
		this.currFileId = currFileId;
	}

	@Column(name = "INVOICE_FILE_ID3", nullable = false, length = 1)
	public char getInvoiceFileId3() {
		return this.invoiceFileId3;
	}

	public void setInvoiceFileId3(char invoiceFileId3) {
		this.invoiceFileId3 = invoiceFileId3;
	}

	@Column(name = "RECON_OPT", nullable = false, length = 1)
	public char getReconOpt() {
		return this.reconOpt;
	}

	public void setReconOpt(char reconOpt) {
		this.reconOpt = reconOpt;
	}

	@Column(name = "TEA_NEW_RESOURCE_FLAG", nullable = false, length = 1)
	public char getTeaNewResourceFlag() {
		return this.teaNewResourceFlag;
	}

	public void setTeaNewResourceFlag(char teaNewResourceFlag) {
		this.teaNewResourceFlag = teaNewResourceFlag;
	}

	@Column(name = "AUTO_ASSGN_VENDOR_NBR", nullable = false, length = 1)
	public char getAutoAssgnVendorNbr() {
		return this.autoAssgnVendorNbr;
	}

	public void setAutoAssgnVendorNbr(char autoAssgnVendorNbr) {
		this.autoAssgnVendorNbr = autoAssgnVendorNbr;
	}

	@Column(name = "NXT_AVAIL_VENDOR_NBR", nullable = false, length = 5)
	public String getNxtAvailVendorNbr() {
		return this.nxtAvailVendorNbr;
	}

	public void setNxtAvailVendorNbr(String nxtAvailVendorNbr) {
		this.nxtAvailVendorNbr = nxtAvailVendorNbr;
	}

	@Column(name = "EFT_IMMD_DEST", nullable = false, length = 10)
	public String getEftImmdDest() {
		return this.eftImmdDest;
	}

	public void setEftImmdDest(String eftImmdDest) {
		this.eftImmdDest = eftImmdDest;
	}

	@Column(name = "EFT_CO_ID_TYP5", nullable = false, length = 10)
	public String getEftCoIdTyp5() {
		return this.eftCoIdTyp5;
	}

	public void setEftCoIdTyp5(String eftCoIdTyp5) {
		this.eftCoIdTyp5 = eftCoIdTyp5;
	}

	@Column(name = "EFT_ORIG_DFI_ID", nullable = false, length = 8)
	public String getEftOrigDfiId() {
		return this.eftOrigDfiId;
	}

	public void setEftOrigDfiId(String eftOrigDfiId) {
		this.eftOrigDfiId = eftOrigDfiId;
	}

	@Column(name = "EFT_BANK_CD", nullable = false, length = 3)
	public String getEftBankCd() {
		return this.eftBankCd;
	}

	public void setEftBankCd(String eftBankCd) {
		this.eftBankCd = eftBankCd;
	}

	@Column(name = "EFT_IMMD_ORIGIN", nullable = false, length = 10)
	public String getEftImmdOrigin() {
		return this.eftImmdOrigin;
	}

	public void setEftImmdOrigin(String eftImmdOrigin) {
		this.eftImmdOrigin = eftImmdOrigin;
	}

	@Column(name = "EFT_ORIGIN_STAT_CD", nullable = false, length = 1)
	public char getEftOriginStatCd() {
		return this.eftOriginStatCd;
	}

	public void setEftOriginStatCd(char eftOriginStatCd) {
		this.eftOriginStatCd = eftOriginStatCd;
	}

	@Column(name = "EFT_CO_ID_TYP8", nullable = false, length = 10)
	public String getEftCoIdTyp8() {
		return this.eftCoIdTyp8;
	}

	public void setEftCoIdTyp8(String eftCoIdTyp8) {
		this.eftCoIdTyp8 = eftCoIdTyp8;
	}

	@Column(name = "EFT_EMPLR_OFFSET_ACCT", nullable = false, length = 17)
	public String getEftEmplrOffsetAcct() {
		return this.eftEmplrOffsetAcct;
	}

	public void setEftEmplrOffsetAcct(String eftEmplrOffsetAcct) {
		this.eftEmplrOffsetAcct = eftEmplrOffsetAcct;
	}

	@Column(name = "CHECK_FORM_IND", nullable = false, length = 1)
	public char getCheckFormInd() {
		return this.checkFormInd;
	}

	public void setCheckFormInd(char checkFormInd) {
		this.checkFormInd = checkFormInd;
	}

	@Column(name = "SCH_YR_FROM", nullable = false, length = 4)
	public String getSchYrFrom() {
		return this.schYrFrom;
	}

	public void setSchYrFrom(String schYrFrom) {
		this.schYrFrom = schYrFrom;
	}

	@Column(name = "SCH_YR_TO", nullable = false, length = 4)
	public String getSchYrTo() {
		return this.schYrTo;
	}

	public void setSchYrTo(String schYrTo) {
		this.schYrTo = schYrTo;
	}

	@Column(name = "ASSGN_CASH_RCPT", nullable = false, length = 1)
	public char getAssgnCashRcpt() {
		return this.assgnCashRcpt;
	}

	public void setAssgnCashRcpt(char assgnCashRcpt) {
		this.assgnCashRcpt = assgnCashRcpt;
	}

	@Column(name = "NXT_CASH_RCPT_NBR", nullable = false, length = 6)
	public String getNxtCashRcptNbr() {
		return this.nxtCashRcptNbr;
	}

	public void setNxtCashRcptNbr(String nxtCashRcptNbr) {
		this.nxtCashRcptNbr = nxtCashRcptNbr;
	}

	@Column(name = "USE_FIXED_ASSETS_XREF_TBL", nullable = false, length = 1)
	public char getUseFixedAssetsXrefTbl() {
		return this.useFixedAssetsXrefTbl;
	}

	public void setUseFixedAssetsXrefTbl(char useFixedAssetsXrefTbl) {
		this.useFixedAssetsXrefTbl = useFixedAssetsXrefTbl;
	}

	@Column(name = "DEFERD_PAYABLE_DT_USED", nullable = false, length = 1)
	public char getDeferdPayableDtUsed() {
		return this.deferdPayableDtUsed;
	}

	public void setDeferdPayableDtUsed(char deferdPayableDtUsed) {
		this.deferdPayableDtUsed = deferdPayableDtUsed;
	}

	@Column(name = "AUTO_XFER_JV_FIN_CKS", nullable = false, length = 1)
	public char getAutoXferJvFinCks() {
		return this.autoXferJvFinCks;
	}

	public void setAutoXferJvFinCks(char autoXferJvFinCks) {
		this.autoXferJvFinCks = autoXferJvFinCks;
	}

	@Column(name = "AUTO_XFER_JV_PAY_CKS", nullable = false, length = 1)
	public char getAutoXferJvPayCks() {
		return this.autoXferJvPayCks;
	}

	public void setAutoXferJvPayCks(char autoXferJvPayCks) {
		this.autoXferJvPayCks = autoXferJvPayCks;
	}

	@Column(name = "DIST_EIN", nullable = false, length = 9)
	public String getDistEin() {
		return this.distEin;
	}

	public void setDistEin(String distEin) {
		this.distEin = distEin;
	}

	@Column(name = "CURR_CLOSE", nullable = false, length = 1)
	public char getCurrClose() {
		return this.currClose;
	}

	public void setCurrClose(char currClose) {
		this.currClose = currClose;
	}

	@Column(name = "DEFAULT_AMEND_RSN", nullable = false, length = 30)
	public String getDefaultAmendRsn() {
		return this.defaultAmendRsn;
	}

	public void setDefaultAmendRsn(String defaultAmendRsn) {
		this.defaultAmendRsn = defaultAmendRsn;
	}

	@Column(name = "FIRST_PAYDATE_SCH_YR", nullable = false, length = 8)
	public String getFirstPaydateSchYr() {
		return this.firstPaydateSchYr;
	}

	public void setFirstPaydateSchYr(String firstPaydateSchYr) {
		this.firstPaydateSchYr = firstPaydateSchYr;
	}

	@Column(name = "ASSGN_PA_NBR", nullable = false, length = 1)
	public char getAssgnPaNbr() {
		return this.assgnPaNbr;
	}

	public void setAssgnPaNbr(char assgnPaNbr) {
		this.assgnPaNbr = assgnPaNbr;
	}

	@Column(name = "NXT_AVAIL_PA_NBR", nullable = false, precision = 6, scale = 0)
	public int getNxtAvailPaNbr() {
		return this.nxtAvailPaNbr;
	}

	public void setNxtAvailPaNbr(int nxtAvailPaNbr) {
		this.nxtAvailPaNbr = nxtAvailPaNbr;
	}

	@Column(name = "ASSGN_JV_NBR", nullable = false, length = 1)
	public char getAssgnJvNbr() {
		return this.assgnJvNbr;
	}

	public void setAssgnJvNbr(char assgnJvNbr) {
		this.assgnJvNbr = assgnJvNbr;
	}

	@Column(name = "NXT_AVAIL_JV_NBR", nullable = false, precision = 6, scale = 0)
	public int getNxtAvailJvNbr() {
		return this.nxtAvailJvNbr;
	}

	public void setNxtAvailJvNbr(int nxtAvailJvNbr) {
		this.nxtAvailJvNbr = nxtAvailJvNbr;
	}

	@Column(name = "CHG_PO_REQ", nullable = false, length = 1)
	public char getChgPoReq() {
		return this.chgPoReq;
	}

	public void setChgPoReq(char chgPoReq) {
		this.chgPoReq = chgPoReq;
	}

	@Column(name = "AMEND_CUTOFF_DT", nullable = false, length = 8)
	public String getAmendCutoffDt() {
		return this.amendCutoffDt;
	}

	public void setAmendCutoffDt(String amendCutoffDt) {
		this.amendCutoffDt = amendCutoffDt;
	}

	@Column(name = "LAST_CHK_NBR", nullable = false, precision = 6, scale = 0)
	public int getLastChkNbr() {
		return this.lastChkNbr;
	}

	public void setLastChkNbr(int lastChkNbr) {
		this.lastChkNbr = lastChkNbr;
	}

	@Column(name = "PRT_DIST_EIN", nullable = false, length = 1)
	public char getPrtDistEin() {
		return this.prtDistEin;
	}

	public void setPrtDistEin(char prtDistEin) {
		this.prtDistEin = prtDistEin;
	}

	@Column(name = "ACTFND", nullable = false, length = 3)
	public String getActfnd() {
		return this.actfnd;
	}

	public void setActfnd(String actfnd) {
		this.actfnd = actfnd;
	}

	@Column(name = "ACTFND_YR", nullable = false, length = 1)
	public char getActfndYr() {
		return this.actfndYr;
	}

	public void setActfndYr(char actfndYr) {
		this.actfndYr = actfndYr;
	}

	@Column(name = "ACTFND_OFFSET", nullable = false, length = 1)
	public char getActfndOffset() {
		return this.actfndOffset;
	}

	public void setActfndOffset(char actfndOffset) {
		this.actfndOffset = actfndOffset;
	}

	@Column(name = "USE_FIN_CLR_FUND", nullable = false, length = 1)
	public char getUseFinClrFund() {
		return this.useFinClrFund;
	}

	public void setUseFinClrFund(char useFinClrFund) {
		this.useFinClrFund = useFinClrFund;
	}

	@Column(name = "ASSGN_CYR_REQ_NBR", nullable = false, length = 1)
	public char getAssgnCyrReqNbr() {
		return this.assgnCyrReqNbr;
	}

	public void setAssgnCyrReqNbr(char assgnCyrReqNbr) {
		this.assgnCyrReqNbr = assgnCyrReqNbr;
	}

	@Column(name = "NXT_AVAIL_CYR_REQ_NBR", nullable = false, length = 6)
	public String getNxtAvailCyrReqNbr() {
		return this.nxtAvailCyrReqNbr;
	}

	public void setNxtAvailCyrReqNbr(String nxtAvailCyrReqNbr) {
		this.nxtAvailCyrReqNbr = nxtAvailCyrReqNbr;
	}

	@Column(name = "ASSGN_NYR_REQ_NBR", nullable = false, length = 1)
	public char getAssgnNyrReqNbr() {
		return this.assgnNyrReqNbr;
	}

	public void setAssgnNyrReqNbr(char assgnNyrReqNbr) {
		this.assgnNyrReqNbr = assgnNyrReqNbr;
	}

	@Column(name = "NXT_AVAIL_NYR_REQ_NBR", nullable = false, length = 6)
	public String getNxtAvailNyrReqNbr() {
		return this.nxtAvailNyrReqNbr;
	}

	public void setNxtAvailNyrReqNbr(String nxtAvailNyrReqNbr) {
		this.nxtAvailNyrReqNbr = nxtAvailNyrReqNbr;
	}

	@Column(name = "ASSGN_CYR_PO_NBR", nullable = false, length = 1)
	public char getAssgnCyrPoNbr() {
		return this.assgnCyrPoNbr;
	}

	public void setAssgnCyrPoNbr(char assgnCyrPoNbr) {
		this.assgnCyrPoNbr = assgnCyrPoNbr;
	}

	@Column(name = "NXT_AVAIL_CYR_PO_NBR", nullable = false, length = 6)
	public String getNxtAvailCyrPoNbr() {
		return this.nxtAvailCyrPoNbr;
	}

	public void setNxtAvailCyrPoNbr(String nxtAvailCyrPoNbr) {
		this.nxtAvailCyrPoNbr = nxtAvailCyrPoNbr;
	}

	@Column(name = "ASSGN_NYR_PO_NBR", nullable = false, length = 1)
	public char getAssgnNyrPoNbr() {
		return this.assgnNyrPoNbr;
	}

	public void setAssgnNyrPoNbr(char assgnNyrPoNbr) {
		this.assgnNyrPoNbr = assgnNyrPoNbr;
	}

	@Column(name = "NXT_AVAIL_NYR_PO_NBR", nullable = false, length = 6)
	public String getNxtAvailNyrPoNbr() {
		return this.nxtAvailNyrPoNbr;
	}

	public void setNxtAvailNyrPoNbr(String nxtAvailNyrPoNbr) {
		this.nxtAvailNyrPoNbr = nxtAvailNyrPoNbr;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Column(name = "ASSGN_AMEND_NBR", nullable = false, length = 1)
	public char getAssgnAmendNbr() {
		return this.assgnAmendNbr;
	}

	public void setAssgnAmendNbr(char assgnAmendNbr) {
		this.assgnAmendNbr = assgnAmendNbr;
	}

	@Column(name = "NXT_AVAIL_AMEND_NBR", nullable = false, length = 6)
	public String getNxtAvailAmendNbr() {
		return this.nxtAvailAmendNbr;
	}

	public void setNxtAvailAmendNbr(String nxtAvailAmendNbr) {
		this.nxtAvailAmendNbr = nxtAvailAmendNbr;
	}

	@Column(name = "INDRCT_COST_OBJ", nullable = false, length = 4)
	public String getIndrctCostObj() {
		return this.indrctCostObj;
	}

	public void setIndrctCostObj(String indrctCostObj) {
		this.indrctCostObj = indrctCostObj;
	}

	@Column(name = "INDRCT_COST_SOBJ", nullable = false, length = 2)
	public String getIndrctCostSobj() {
		return this.indrctCostSobj;
	}

	public void setIndrctCostSobj(String indrctCostSobj) {
		this.indrctCostSobj = indrctCostSobj;
	}

	@Column(name = "APPRVL_PROC_BAR", nullable = false, length = 1)
	public char getApprvlProcBar() {
		return this.apprvlProcBar;
	}

	public void setApprvlProcBar(char apprvlProcBar) {
		this.apprvlProcBar = apprvlProcBar;
	}

	@Column(name = "RESET_APPRVL_PATH", nullable = false, length = 1)
	public char getResetApprvlPath() {
		return this.resetApprvlPath;
	}

	public void setResetApprvlPath(char resetApprvlPath) {
		this.resetApprvlPath = resetApprvlPath;
	}

	@Column(name = "RESET_APPRVL_PATH_PUR", nullable = false, length = 1)
	public char getResetApprvlPathPur() {
		return this.resetApprvlPathPur;
	}

	public void setResetApprvlPathPur(char resetApprvlPathPur) {
		this.resetApprvlPathPur = resetApprvlPathPur;
	}

	@Column(name = "EFT_ACH_SVC_CLAS_CD", nullable = false, length = 3)
	public String getEftAchSvcClasCd() {
		return this.eftAchSvcClasCd;
	}

	public void setEftAchSvcClasCd(String eftAchSvcClasCd) {
		this.eftAchSvcClasCd = eftAchSvcClasCd;
	}

	@Column(name = "DISP_GL_INQ_WARN", nullable = false, length = 1)
	public char getDispGlInqWarn() {
		return this.dispGlInqWarn;
	}

	public void setDispGlInqWarn(char dispGlInqWarn) {
		this.dispGlInqWarn = dispGlInqWarn;
	}

	@Column(name = "STRT_ACCT_PER", nullable = false, length = 2)
	public String getStrtAcctPer() {
		return this.strtAcctPer;
	}

	public void setStrtAcctPer(String strtAcctPer) {
		this.strtAcctPer = strtAcctPer;
	}

	@Column(name = "EFT_FIN_IMMD_DEST", nullable = false, length = 10)
	public String getEftFinImmdDest() {
		return this.eftFinImmdDest;
	}

	public void setEftFinImmdDest(String eftFinImmdDest) {
		this.eftFinImmdDest = eftFinImmdDest;
	}

	@Column(name = "EFT_FIN_CO_ID_TYP5", nullable = false, length = 10)
	public String getEftFinCoIdTyp5() {
		return this.eftFinCoIdTyp5;
	}

	public void setEftFinCoIdTyp5(String eftFinCoIdTyp5) {
		this.eftFinCoIdTyp5 = eftFinCoIdTyp5;
	}

	@Column(name = "EFT_FIN_ORIG_DFI_ID", nullable = false, length = 8)
	public String getEftFinOrigDfiId() {
		return this.eftFinOrigDfiId;
	}

	public void setEftFinOrigDfiId(String eftFinOrigDfiId) {
		this.eftFinOrigDfiId = eftFinOrigDfiId;
	}

	@Column(name = "EFT_FIN_BANK_CD", nullable = false, length = 3)
	public String getEftFinBankCd() {
		return this.eftFinBankCd;
	}

	public void setEftFinBankCd(String eftFinBankCd) {
		this.eftFinBankCd = eftFinBankCd;
	}

	@Column(name = "EFT_FIN_IMMD_ORIGIN", nullable = false, length = 10)
	public String getEftFinImmdOrigin() {
		return this.eftFinImmdOrigin;
	}

	public void setEftFinImmdOrigin(String eftFinImmdOrigin) {
		this.eftFinImmdOrigin = eftFinImmdOrigin;
	}

	@Column(name = "EFT_FIN_ORIGIN_STAT_CD", nullable = false, length = 1)
	public char getEftFinOriginStatCd() {
		return this.eftFinOriginStatCd;
	}

	public void setEftFinOriginStatCd(char eftFinOriginStatCd) {
		this.eftFinOriginStatCd = eftFinOriginStatCd;
	}

	@Column(name = "EFT_FIN_CO_ID_TYP8", nullable = false, length = 10)
	public String getEftFinCoIdTyp8() {
		return this.eftFinCoIdTyp8;
	}

	public void setEftFinCoIdTyp8(String eftFinCoIdTyp8) {
		this.eftFinCoIdTyp8 = eftFinCoIdTyp8;
	}

	@Column(name = "EFT_FIN_EMPLR_OFFSET_ACCT", nullable = false, length = 17)
	public String getEftFinEmplrOffsetAcct() {
		return this.eftFinEmplrOffsetAcct;
	}

	public void setEftFinEmplrOffsetAcct(String eftFinEmplrOffsetAcct) {
		this.eftFinEmplrOffsetAcct = eftFinEmplrOffsetAcct;
	}

	@Column(name = "EFT_FIN_ACH_SVC_CLAS_CD", nullable = false, length = 3)
	public String getEftFinAchSvcClasCd() {
		return this.eftFinAchSvcClasCd;
	}

	public void setEftFinAchSvcClasCd(String eftFinAchSvcClasCd) {
		this.eftFinAchSvcClasCd = eftFinAchSvcClasCd;
	}

	@Column(name = "L_EFT_REF_NBR", nullable = false, precision = 5, scale = 0)
	public int getLEftRefNbr() {
		return this.LEftRefNbr;
	}

	public void setLEftRefNbr(int LEftRefNbr) {
		this.LEftRefNbr = LEftRefNbr;
	}

}