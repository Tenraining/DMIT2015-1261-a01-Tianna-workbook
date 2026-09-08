package dmit2015.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void when_productIsNullEmptyOrWhitespace()
    {
        /*
        // Arrange
        Product currentProduct = new Product();
        */
    }
    /*
    @Test
    void when_priceLessThanOrEqualToZero()
    {
        assertThatThrownBy(() ->
                new Product("Price must be greater than 0",-1.49)
        ).isInstanceOf(IllegalArgumentException.class);
    }
    */
}

/*

    Reject a null, empty, or whitespace-only name by throwing IllegalArgumentException with the message Product name is required.
    Reject a price less than or equal to zero by throwing IllegalArgumentException with the message Price must be greater than 0.
    Implement public double getPriceWithTax() to return the price including 5% tax: price * 1.05.
     */