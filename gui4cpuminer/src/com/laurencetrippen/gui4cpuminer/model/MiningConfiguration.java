package com.laurencetrippen.gui4cpuminer.model;

public class MiningConfiguration {

	private Algorithm algorithm;
	private String username;
	private String password;
	private String url;
	private String coinbaseAddress;
	private String coinbaseSig;
	private String jsonConfigPath;
	private int threads;
	private int retries;
	private int retryPause = 30;
	private int timeout;
	private int scantime;
	private boolean noLongPoll = false;
	private boolean noGetwork = false;
	private boolean noGbt = false;
	private boolean noStratum = false;
	private boolean noRedirect = false;
	private boolean isQuiet = false;
	private boolean isDebug = false;
	private boolean enabledProtocolDumb = false;
	private boolean syslog = false;
	private boolean runInBackground = false;
	private boolean runBenchmark = false;

	public Algorithm getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(Algorithm algorithm) {
		this.algorithm = algorithm;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCoinbaseAddress() {
		return coinbaseAddress;
	}

	public void setCoinbaseAddress(String coinbaseAddress) {
		this.coinbaseAddress = coinbaseAddress;
	}

	public String getCoinbaseSig() {
		return coinbaseSig;
	}

	public void setCoinbaseSig(String coinbaseSig) {
		this.coinbaseSig = coinbaseSig;
	}

	public String getJsonConfigPath() {
		return jsonConfigPath;
	}

	public void setJsonConfigPath(String jsonConfigPath) {
		this.jsonConfigPath = jsonConfigPath;
	}

	public int getThreads() {
		return threads;
	}

	public void setThreads(int threads) {
		this.threads = threads;
	}

	public int getRetries() {
		return retries;
	}

	public void setRetries(int retries) {
		this.retries = retries;
	}

	public int getRetryPause() {
		return retryPause;
	}

	public void setRetryPause(int retryPause) {
		this.retryPause = retryPause;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public int getScantime() {
		return scantime;
	}

	public void setScantime(int scantime) {
		this.scantime = scantime;
	}

	public boolean isNoLongPoll() {
		return noLongPoll;
	}

	public void setNoLongPoll(boolean noLongPoll) {
		this.noLongPoll = noLongPoll;
	}

	public boolean isNoGetwork() {
		return noGetwork;
	}

	public void setNoGetwork(boolean noGetwork) {
		this.noGetwork = noGetwork;
	}

	public boolean isNoGbt() {
		return noGbt;
	}

	public void setNoGbt(boolean noGbt) {
		this.noGbt = noGbt;
	}

	public boolean isNoStratum() {
		return noStratum;
	}

	public void setNoStratum(boolean noStratum) {
		this.noStratum = noStratum;
	}

	public boolean isNoRedirect() {
		return noRedirect;
	}

	public void setNoRedirect(boolean noRedirect) {
		this.noRedirect = noRedirect;
	}

	public boolean isQuiet() {
		return isQuiet;
	}

	public void setQuiet(boolean isQuiet) {
		this.isQuiet = isQuiet;
	}

	public boolean isDebug() {
		return isDebug;
	}

	public void setDebug(boolean isDebug) {
		this.isDebug = isDebug;
	}

	public boolean isEnabledProtocolDumb() {
		return enabledProtocolDumb;
	}

	public void setEnabledProtocolDumb(boolean enabledProtocolDumb) {
		this.enabledProtocolDumb = enabledProtocolDumb;
	}

	public boolean isSyslog() {
		return syslog;
	}

	public void setSyslog(boolean syslog) {
		this.syslog = syslog;
	}

	public boolean isRunInBackground() {
		return runInBackground;
	}

	public void setRunInBackground(boolean runInBackground) {
		this.runInBackground = runInBackground;
	}

	public boolean isRunBenchmark() {
		return runBenchmark;
	}

	public void setRunBenchmark(boolean runBenchmark) {
		this.runBenchmark = runBenchmark;
	}
}