package services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import domain.Productmanager;
import domain.SimpleProductManager;

@Configuration
@ComponentScan("com")
@EnableWebMvc
@Import({ ProductConfig.class, ProductManagerConfig.class })
public class AppConfig {

	@Bean
	public UrlBasedViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setSuffix("/WEB-INF/jsp/");
		resolver.setPrefix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

	@Bean
	public Productmanager personService() {
		return new SimpleProductManager();
	}
}
