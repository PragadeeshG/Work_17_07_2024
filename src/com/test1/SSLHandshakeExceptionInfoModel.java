package com.test1;

public class SSLHandshakeExceptionInfoModel {
	private Integer keyStoreFileName;
	private String companyName;
	private String mainInfo;
	private String keyStoreStatus;
	private String prodValue;
	private String nonProdValue;
	private String ssIProxyEngine;
	private String ssIProxyVerify;
	private String ssIProxyCheckPeerCN;
	private String ssIProxyCheckPeerName;
	private String proxyRequests;
	private String proxyTimeout;
	private String modifiedDate;

	public SSLHandshakeExceptionInfoModel() {

	}

	public SSLHandshakeExceptionInfoModel(Integer keyStoreFileName, String companyName, String mainInfo,
			String keyStoreStatus, String prodValue, String nonProdValue, String ssIProxyEngine, String ssIProxyVerify,
			String ssIProxyCheckPeerCN, String ssIProxyCheckPeerName, String proxyRequests, String proxyTimeout,
			String modifiedDate) {
		super();
		this.keyStoreFileName = keyStoreFileName;
		this.companyName = companyName;
		this.mainInfo = mainInfo;
		this.keyStoreStatus = keyStoreStatus;
		this.prodValue = prodValue;
		this.nonProdValue = nonProdValue;
		this.ssIProxyEngine = ssIProxyEngine;
		this.ssIProxyVerify = ssIProxyVerify;
		this.ssIProxyCheckPeerCN = ssIProxyCheckPeerCN;
		this.ssIProxyCheckPeerName = ssIProxyCheckPeerName;
		this.proxyRequests = proxyRequests;
		this.proxyTimeout = proxyTimeout;
		this.modifiedDate = modifiedDate;
	}

	public Integer getKeyStoreFileName() {
		return keyStoreFileName;
	}

	public void setKeyStoreFileName(Integer keyStoreFileName) {
		this.keyStoreFileName = keyStoreFileName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getMainInfo() {
		return mainInfo;
	}

	public void setMainInfo(String mainInfo) {
		this.mainInfo = mainInfo;
	}

	public String getKeyStoreStatus() {
		return keyStoreStatus;
	}

	public void setKeyStoreStatus(String keyStoreStatus) {
		this.keyStoreStatus = keyStoreStatus;
	}

	public String getProdValue() {
		return prodValue;
	}

	public void setProdValue(String prodValue) {
		this.prodValue = prodValue;
	}

	public String getNonProdValue() {
		return nonProdValue;
	}

	public void setNonProdValue(String nonProdValue) {
		this.nonProdValue = nonProdValue;
	}

	public String getSsIProxyEngine() {
		return ssIProxyEngine;
	}

	public void setSsIProxyEngine(String ssIProxyEngine) {
		this.ssIProxyEngine = ssIProxyEngine;
	}

	public String getSsIProxyVerify() {
		return ssIProxyVerify;
	}

	public void setSsIProxyVerify(String ssIProxyVerify) {
		this.ssIProxyVerify = ssIProxyVerify;
	}

	public String getSsIProxyCheckPeerCN() {
		return ssIProxyCheckPeerCN;
	}

	public void setSsIProxyCheckPeerCN(String ssIProxyCheckPeerCN) {
		this.ssIProxyCheckPeerCN = ssIProxyCheckPeerCN;
	}

	public String getSsIProxyCheckPeerName() {
		return ssIProxyCheckPeerName;
	}

	public void setSsIProxyCheckPeerName(String ssIProxyCheckPeerName) {
		this.ssIProxyCheckPeerName = ssIProxyCheckPeerName;
	}

	public String getProxyRequests() {
		return proxyRequests;
	}

	public void setProxyRequests(String proxyRequests) {
		this.proxyRequests = proxyRequests;
	}

	public String getProxyTimeout() {
		return proxyTimeout;
	}

	public void setProxyTimeout(String proxyTimeout) {
		this.proxyTimeout = proxyTimeout;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
