package com.esc20.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esc20.dao.BankDao;
import com.esc20.dao.OptionsDao;
import com.esc20.dao.ReferenceDao;
import com.esc20.model.BthrBankCodes;
import com.esc20.nonDBModels.Bank;
import com.esc20.nonDBModels.BankRequest;
import com.esc20.nonDBModels.Code;
import com.esc20.nonDBModels.Criteria;
import com.esc20.nonDBModels.Options;
import com.esc20.nonDBModels.Page;

@Service
public class BankService {

	private Logger logger = LoggerFactory.getLogger(BankService.class);

	@Autowired
	private BankDao bankDao;

	@Autowired
	private OptionsDao optionsDao;

	@Autowired
	private ReferenceDao referenceDao;

	public List<BthrBankCodes> getAllBanks() {
		return bankDao.getAll();
	}

	public List<BthrBankCodes> getAllBanks(Page p) {
		return bankDao.getAll(p);
	}
	
	public List<BthrBankCodes> getAllBanks(Criteria criteria , Page p) {
		return bankDao.getAll(criteria,p);
	}

	public List<BthrBankCodes> getBanksByEntity(BthrBankCodes bbc) {
		return bankDao.getBanksByEntity(bbc);
	}

	public List<Bank> getAccounts(String employeeNumber, String frequency) {
		return bankDao.getAccounts(employeeNumber, frequency);
	}

	public List<BankRequest> getAccountRequests(String employeeNumber, String frequency) {
		return bankDao.getAccountRequests(employeeNumber, frequency);
	}

	public int insertNextYearAccounts(String employeeNumber) {
		return bankDao.insertNextYearAccounts(employeeNumber);
	}

	public int deleteNextYearAccounts(String employeeNumber) {
		return bankDao.deleteNextYearAccounts(employeeNumber);
	}

	public int updateAccountRequest(Boolean autoApprove, String employeeNumber, String frequency,
			Bank payrollAccountInfo, Bank accountInfo, Bank accountInfoPending) {
		return bankDao.updateAccountRequest(autoApprove, employeeNumber, frequency, payrollAccountInfo, accountInfo,
				accountInfoPending);
	}

	public int insertAccountRequest(Boolean autoApprove, String employeeNumber, String frequency,
			Bank payrollAccountInfo, Bank accountInfo) {
		return bankDao.insertAccountRequest(autoApprove, employeeNumber, frequency, payrollAccountInfo, accountInfo);
	}

	public int deleteAccountRequest(String employeeNumber, String frequency, Bank accountInfo,
			Bank accountInfoPending) {
		return bankDao.deleteAccountRequest(employeeNumber, frequency, accountInfo,
				accountInfoPending);
	}
	
	public boolean checkSameBank(Bank oldBank, Bank newBank) {
		
		boolean banksSame = true;
		
		if(!oldBank.getAccountNumber().equals(newBank.getAccountNumber()))
		{
			banksSame = false;
		}
		if(!oldBank.getAccountType().getCode().equals(newBank.getAccountType().getCode()))
		{
			banksSame = false;
		}
		if(oldBank.getDepositAmount().getAmount() != (newBank.getDepositAmount().getAmount()))
		{
			banksSame = false;
		}
		if(!oldBank.getCode().getCode().equals(newBank.getCode().getCode()))
		{
			banksSame = false;
		}
			
		return banksSame;
		
	}

	public int insertAccountApprove(String employeeNumber, String frequency, Bank payrollAccountInfo) {

		Options o = optionsDao.getOptions();
		String prenote = "";

		if (o.getPreNote().equals("Y")) {
			prenote = "P";
		}

		return bankDao.insertAccountApprove(employeeNumber, frequency, prenote, payrollAccountInfo);
	}

	public int updateAccountApprove(String employeeNumber, String frequency, Bank payrollAccountInfo,
			Bank accountInfo) {
		Options o = optionsDao.getOptions();
		String prenote = "";

		if (o.getPreNote().equals("Y")) {
			prenote = "P";
		}
		return bankDao.updateAccountApprove(employeeNumber, frequency, prenote, payrollAccountInfo, accountInfo);
	}

	public int deleteAccountApprove(String employeeNumber, String frequency, Bank accountInfo) {
		return bankDao.deleteAccountApprove(employeeNumber, frequency, accountInfo);
	}

	public Boolean getAutoApproveAccountInfo(String frequency) {
		return bankDao.getAutoApproveAccountInfo(frequency);
	}

	public Integer getDirectDepositLimit() {
		return bankDao.getDirectDepositLimit();
	}

	public Code getDdAccountType(String t) {

		return bankDao.getDdAccountType(t);
	}

	public Code getBank(String b) {

		return bankDao.getBank(b);
	}

	public Code getPayrollFrequencies(String empNbr, String code) {
		return bankDao.getPayrollFrequencies(empNbr, code);
	}

	public Boolean checkSameRequest(Bank b, BankRequest br) {
		if (b.getAccountNumber().equals(br.getAccountNumber()) && b.getCode().equals(br.getCode())
				&& b.getAccountType().equals(br.getAccountType())) {
			return true;
		}

		return false;
	}

	public Boolean checkSameRequest(BankRequest b, BankRequest br) {

		if (b.getAccountNumber().equals(br.getAccountNumber()) && b.getCode().equals(br.getCode())
//				&& b.getAccountType().equals(br.getAccountType())
				) {
			return true;
		}

		return false;
	}
}
