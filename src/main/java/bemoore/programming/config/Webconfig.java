package bemoore.programming.config;

import bemoore.programming.util.ViewNames;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "bemoore.programming")
public class Webconfig implements WebMvcConfigurer {

    // Constants //

    private static final String RESOLVER_PREFIX = "/WEB-INF/view/";
    private static final String RESOLVER_SUFFIX = ".jsp";

    // Bean methods
    @Bean
    public ViewResolver viewResolver(){
        UrlBasedViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix(RESOLVER_PREFIX);
        viewResolver.setSuffix(RESOLVER_SUFFIX);
        return viewResolver;
    }
    // Responsible for the Home view


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName(ViewNames.HOME);
    }
}
