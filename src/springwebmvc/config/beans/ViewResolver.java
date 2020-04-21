package springwebmvc.config.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
public class ViewResolver extends InternalResourceViewResolver{
	public ViewResolver() {
		super();
		setPrefix("/WEB-INF/views/");
		setSuffix(".jsp");
	}
}
