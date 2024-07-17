package com.test1;

public class SSLHandshakeException {
	private Integer keyStoreFileName;
	private Integer keystorePassword;
	private String serverRoot;
	private Integer serverInter;
	private String mainCert;
	private String certType;
	private String trustoreType;
	private String orgName;
	private String caName;
	private String validity;
	private String remarks;

	public SSLHandshakeException() {

	}

	public SSLHandshakeException(Integer keyStoreFileName, Integer keystorePassword, String serverRoot,
			Integer serverInter, String mainCert, String certType, String trustoreType, String orgName, String caName,
			String validity, String remarks) {
		super();
		this.keyStoreFileName = keyStoreFileName;
		this.keystorePassword = keystorePassword;
		this.serverRoot = serverRoot;
		this.serverInter = serverInter;
		this.mainCert = mainCert;
		this.certType = certType;
		this.trustoreType = trustoreType;
		this.orgName = orgName;
		this.caName = caName;
		this.validity = validity;
		this.remarks = remarks;
	}

	public Integer getKeyStoreFileName() {
		return keyStoreFileName;
	}

	public void setKeyStoreFileName(Integer keyStoreFileName) {
		this.keyStoreFileName = keyStoreFileName;
	}

	public Integer getKeystorePassword() {
		return keystorePassword;
	}

	public void setKeystorePassword(Integer keystorePassword) {
		this.keystorePassword = keystorePassword;
	}

	public String getServerRoot() {
		return serverRoot;
	}

	public void setServerRoot(String serverRoot) {
		this.serverRoot = serverRoot;
	}

	public Integer getServerInter() {
		return serverInter;
	}

	public void setServerInter(Integer serverInter) {
		this.serverInter = serverInter;
	}

	public String getMainCert() {
		return mainCert;
	}

	public void setMainCert(String mainCert) {
		this.mainCert = mainCert;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getTrustoreType() {
		return trustoreType;
	}

	public void setTrustoreType(String trustoreType) {
		this.trustoreType = trustoreType;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getCaName() {
		return caName;
	}

	public void setCaName(String caName) {
		this.caName = caName;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
