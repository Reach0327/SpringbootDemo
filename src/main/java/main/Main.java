package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import repositories.ProductRepository;
import services.ProductDeliveryService;

public class Main {
    public static void main(String[] args) {

        /**
         * Context can be configured by:
         * XML
         * Annotations
         */
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            // Get bean by name, class, or use @Primary tag
            ProductDeliveryService service = context.getBean(ProductDeliveryService.class);
            service.addSomeProducts();
        }
    }
}
