 
package org.ancit.sample.eap.handlers;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;

public class MyAnnotation {
	
	
	
	@Execute
	public void execute(@Prefix(prefix = "The Great")MyService myservice) {
		System.out.println(myservice.getMyService());
		System.out.println(myservice.getPrefix());
	}
	
	@PostConstruct
	public void construct(@Prefix(prefix="My Great...") MyService myservice)
	{
		System.out.println(myservice.getPrefix());
		System.out.println(myservice.getMyService());
	}
}