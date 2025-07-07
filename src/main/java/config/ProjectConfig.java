package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Can have both XML and Annotations in the same config
@Configuration
@ComponentScan(basePackages = {"services", "repositories"})
public class ProjectConfig {
}
