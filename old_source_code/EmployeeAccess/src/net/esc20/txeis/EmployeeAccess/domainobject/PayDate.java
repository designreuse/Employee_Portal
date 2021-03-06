package net.esc20.txeis.EmployeeAccess.domainobject;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import net.esc20.txeis.EmployeeAccess.domainobject.reference.Frequency;
import net.esc20.txeis.EmployeeAccess.util.StringUtil;


public class PayDate  implements Serializable {

	private static final long serialVersionUID = -1023249528812172648L;
	
	private String dateFreq ="";
	private String dateFreqVoidAdjChk= "";
	private String voidIssue = "";
	private String adjNumber="";
	private String checkNumber="";
	private String label="";
	
	public static PayDate getPaydate(String dateString) {
		
		PayDate tempPayDate = new PayDate();
		tempPayDate.setDateFreqVoidAdjChk(dateString);
		tempPayDate.setDateFreq(StringUtil.left(dateString, 9));
		DateFormat df = new SimpleDateFormat ("yyyyMMdd");
		Date date = null;
		String tempDateString = StringUtil.left(dateString, 8);
		String tempFreq = StringUtil.mid(dateString, 9, 1);
		String tempVoid = StringUtil.mid(dateString, 10, 1);
		String tempAdj = StringUtil.mid(dateString, 11, 1);
		String tempChk = StringUtil.mid(dateString, 12);
		
		tempPayDate.setVoidIssue(tempVoid);
		tempPayDate.setAdjNumber(tempAdj);
		tempPayDate.setCheckNumber(tempChk);
		
		
		try {
			date = df.parse(tempDateString);
		} catch (ParseException e) {
//			log.info("Date Parse Error.");
		}
		StringBuffer displayLabel = new StringBuffer();
		displayLabel.append(new SimpleDateFormat("MMMM dd, yyyy").format(date));
		displayLabel.append(" ");
		displayLabel.append(Frequency.getFrequency(tempFreq));
		displayLabel.append(" Payroll");
		displayLabel.append(" ");
		if(tempVoid.equals("I"))
		{
			displayLabel.append(" Reissue ");
		}
		else if(tempVoid.equals("V"))
		{
			displayLabel.append(" Void ");
		}
		if(!tempVoid.equals("0"))
		{
			displayLabel.append(" Adjustment ");
			displayLabel.append(tempAdj);
		}
		tempPayDate.setLabel(displayLabel.toString());
		
		return tempPayDate;
	}
	
	public String getDateFreq() {
		return dateFreq;
	}
	public void setDateFreq(String dateFreq) {
		this.dateFreq = dateFreq;
	}
	
	public String getDateFreqVoidAdjChk() {
		return dateFreqVoidAdjChk;
	}

	public void setDateFreqVoidAdjChk(String dateFreqVoidAdjChk) {
		this.dateFreqVoidAdjChk = dateFreqVoidAdjChk;
	}

	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getVoidIssue() {
		return voidIssue;
	}

	public void setVoidIssue(String voidIssue) {
		this.voidIssue = voidIssue;
	}

	public String getAdjNumber() {
		return adjNumber;
	}

	public void setAdjNumber(String adjNumber) {
		this.adjNumber = adjNumber;
	}

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	
	
	
	
}
