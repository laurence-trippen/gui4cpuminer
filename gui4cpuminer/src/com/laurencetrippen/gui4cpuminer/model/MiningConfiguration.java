package com.laurencetrippen.gui4cpuminer.model;

import java.util.ArrayList;
import java.util.List;

import com.laurencetrippen.jpg.ConfigFile;
import com.laurencetrippen.jpg.ConfigProperty;

@ConfigFile(path = Resources.CONFIG_FILE)
public class MiningConfiguration {

	private String[] algorithms;
	
	@ConfigProperty
	private String username;
	
	@ConfigProperty
	private String password;
	
	@ConfigProperty
	private String url;
	
	@ConfigProperty
	private String coinbaseAddress;
	
	@ConfigProperty
	private String coinbaseSig;
	
	@ConfigProperty
	private String jsonConfigPath;
	
	@ConfigProperty
	private int threads;
	
	@ConfigProperty
	private int retries;
	
	@ConfigProperty
	private int retryPause = 30;
	
	@ConfigProperty
	private int timeout;
	
	@ConfigProperty
	private int scantime;
	
	@ConfigProperty
	private boolean noLongPoll = false;
	
	@ConfigProperty
	private boolean noGetwork = false;
	
	@ConfigProperty
	private boolean noGbt = false;
	
	@ConfigProperty
	private boolean noStratum = false;
	
	@ConfigProperty
	private boolean noRedirect = false;
	
	@ConfigProperty
	private boolean isQuiet = false;
	
	@ConfigProperty
	private boolean isDebug = false;
	
	@ConfigProperty
	private boolean enabledProtocolDumb = false;
	
	@ConfigProperty
	private boolean syslog = false;
	
	@ConfigProperty
	private boolean runInBackground = false;
	
	@ConfigProperty
	private boolean runBenchmark = false;

	public MiningConfiguration() {
		this.algorithms = new String[3];
		this.algorithms[0] = "Scrypt";
		this.algorithms[1] = "sha256d";
		this.algorithms[2] = "SHA_256d";
	}
	
	public List<String> generateArguments() {
		List<String> arguments = new ArrayList<>();
		
		if (username != null && !username.isEmpty()) {
			arguments.add("--user=" + username);
			arguments.add("--pass=" + password);
		}
		
		if (url != null && !url.isEmpty()) {
			arguments.add("--url=" + url);
		}
		
		if (coinbaseAddress != null && !coinbaseAddress.isEmpty()) {
			arguments.add("--coinbase-addr=" + coinbaseAddress);
		}
		
		if (coinbaseSig != null && !coinbaseSig.isEmpty()) {
			arguments.add("--coinbase-sig=" + coinbaseSig);
		}
		
		if (jsonConfigPath != null && !jsonConfigPath.isEmpty()) {
			arguments.add("");
		}
		
		return arguments;
	}
	
	public String[] getAlgorithms() {
		return algorithms;
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