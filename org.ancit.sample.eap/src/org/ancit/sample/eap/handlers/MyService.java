package org.ancit.sample.eap.handlers;

public class MyService {

	private String prefix;
	
	private String myService;

	public MyService() {
		myService="Truck food service";
	}

	public String getMyService() {
		return getPrefix()+ myService;
	}

	public void setMyService(String myService) {
		this.myService = myService;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

}
