package bemoore.programming.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@Slf4j
public class WebAppInitializer implements WebApplicationInitializer {
    private static final String DISPATCHER_SERVLET_NAME = "dispatcher";
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        log.info("onStartup Hit");

        // Create a spring application context => this class is different from the guess the number project as it uses the web class.
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        // Register the webConfig class
        context.register(Webconfig.class);

        // Create the dispatcher servlet and pass the spring context as arg
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

        // Register and  Configure dispatcher Servlet
        ServletRegistration.Dynamic registration = servletContext.addServlet(DISPATCHER_SERVLET_NAME, dispatcherServlet);

        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}
