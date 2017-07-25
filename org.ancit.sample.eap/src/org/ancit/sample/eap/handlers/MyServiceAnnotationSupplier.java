package org.ancit.sample.eap.handlers;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.suppliers.ExtendedObjectSupplier;
import org.eclipse.e4.core.di.suppliers.IObjectDescriptor;
import org.eclipse.e4.core.di.suppliers.IRequestor;
import org.osgi.service.component.annotations.Component;


@Component(service=ExtendedObjectSupplier.class,
property="dependency.injection.annotation=org.ancit.sample.eap.handlers.Prefix")
public class MyServiceAnnotationSupplier extends ExtendedObjectSupplier {

	@Inject
	private MyService myService;

	@Override
	public Object get(IObjectDescriptor descriptor, IRequestor requestor, boolean track, boolean group) {

		Prefix prefix = descriptor.getQualifier(Prefix.class);
		String myPrefix = prefix.prefix();
		System.out.println("Prefix: " +myPrefix);
		myService.setPrefix(myPrefix);
		return myService;
	}

}
