package tn.esprit.devops_project.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ProductTest {

    @Test
    public void testProductCreation() {
        // Create a Product instance
        Product product = new Product();

        // Set values for testing
        product.setIdProduct(1L);
        product.setTitle("Test Product");
        product.setPrice(10.0f);
        product.setQuantity(5);
        product.setCategory(ProductCategory.ELECTRONICS);

        // Test getters
        assertEquals(1L, product.getIdProduct());
        assertEquals("Test Product", product.getTitle());
        assertEquals(10.0f, product.getPrice());
        assertEquals(5, product.getQuantity());
        assertEquals(ProductCategory.ELECTRONICS, product.getCategory());

           // Test setters
        product.setIdProduct(2L);
        product.setTitle("Test Product 2");
        product.setPrice(20.0f);
        product.setQuantity(10);
        product.setCategory(ProductCategory.BOOKS);
//WORK WITH ASSERTION
        assertEquals(2L, product.getIdProduct());
        assertEquals("Test Product 2", product.getTitle());
        assertEquals(20.0f, product.getPrice());
        assertEquals(10, product.getQuantity());
        assertEquals(ProductCategory.BOOKS, product.getCategory());

    }
}