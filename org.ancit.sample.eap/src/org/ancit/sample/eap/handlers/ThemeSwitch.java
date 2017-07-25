 
package org.ancit.sample.eap.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.css.swt.theme.IThemeEngine;

public class ThemeSwitch {
	 private static final String DEFAULT_THEME = "org.ancit.sample.eap.theme.default";
	    private static final String MY_THEME = "org.ancit.sample.eap.theme.mytheme";

	    
	@Execute
	public void execute(IThemeEngine engine) {
		if (!engine.getActiveTheme().getId().equals(DEFAULT_THEME))
		{
			engine.setTheme(DEFAULT_THEME, false);
		}
		else
		{
			engine.setTheme(MY_THEME, false);
		}
	}
		
}