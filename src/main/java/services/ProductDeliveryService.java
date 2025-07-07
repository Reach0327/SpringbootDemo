package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ProductRepository;

@Service
public class ProductDeliveryService {
      //Make fields as private as possible
      private final ProductRepository productRepository;

      @Autowired
      // Will be injected in the parameter in the constructor
      // Gives more control with what the constructor does
      public ProductDeliveryService(ProductRepository productRepository) {
          this.productRepository = productRepository;
      }

      public void addSomeProducts() {
          productRepository.add();
          productRepository.add();
          productRepository.add();
    }
}
