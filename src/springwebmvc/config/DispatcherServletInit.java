package springwebmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class DispatcherServletInit extends AbstractAnnotationConfigDispatcherServletInitializer{
	public DispatcherServletInit() {
		System.out.println("DispatcherServletInit");
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() { //load the beans
		return new Class[] {WebApplicationContextConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"}; //all incoming requests
	}
}
