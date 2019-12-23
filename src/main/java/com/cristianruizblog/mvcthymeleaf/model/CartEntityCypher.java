package com.cristianruizblog.mvcthymeleaf.model;

import java.io.Serializable;

public class CartEntityCypher implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String IDACQUIRER;
	private String IDCOMMERCE;
	private String TERMINALCODE;
	private String XMLREQ;
	private String DIGITALSIGN;
	private String SESSIONKEY;

	public String getIDACQUIRER() {
		return IDACQUIRER;
	}

	public void setIDACQUIRER(String iDACQUIRER) {
		IDACQUIRER = iDACQUIRER;
	}

	public String getIDCOMMERCE() {
		return IDCOMMERCE;
	}

	public void setIDCOMMERCE(String iDCOMMERCE) {
		IDCOMMERCE = iDCOMMERCE;
	}

	public String getTERMINALCODE() {
		return TERMINALCODE;
	}

	public void setTERMINALCODE(String tERMINALCODE) {
		TERMINALCODE = tERMINALCODE;
	}

	public String getXMLREQ() {
		return XMLREQ;
	}

	public void setXMLREQ(String xMLREQ) {
		XMLREQ = xMLREQ;
	}

	public String getDIGITALSIGN() {
		return DIGITALSIGN;
	}

	public void setDIGITALSIGN(String dIGITALSIGN) {
		DIGITALSIGN = dIGITALSIGN;
	}

	public String getSESSIONKEY() {
		return SESSIONKEY;
	}

	public void setSESSIONKEY(String sESSIONKEY) {
		SESSIONKEY = sESSIONKEY;
	}
}
