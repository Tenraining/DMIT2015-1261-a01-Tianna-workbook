package dmit2015.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


class ProductTest {

    //– methodName_scenario_expectedBehavior
    //Arrange: setup objects and data.
    //Act: call the method
    //Assert: verify results

    @Test
    void constructor_whenProductIsWhitespace_shouldThrowException()
    {
        assertThatThrownBy(()->
                new Product("", 0)).isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    void constructor_whenProductIsEmpty_shouldThrowException()
    {
        assertThatThrownBy(()->
                new Product(" ", 0)).isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    void constructor_whenProductIsNull_shouldThrowException()
    {
        assertThatThrownBy(()->
                new Product(null, 0)).isInstanceOf(IllegalArgumentException.class);
    }



    @Test
    void when_priceLessThanOrEqualToZero()
    {
        assertThatThrownBy(() ->
                new Product("Price must be greater than 0",-1.49)
        ).isInstanceOf(IllegalArgumentException.class);
    }

}
   /*
    [x]Define private fields String name and double price.
    [x]Create a constructor with the signature public Product(String name, double price).
    [x]Reject a null, empty, or whitespace-only name by throwing IllegalArgumentException with the message Product name is required.
    [x]Reject a price less than or equal to zero by throwing IllegalArgumentException with the message Price must be greater than 0.
    [x]Store valid constructor arguments in the fields.
    [x]Provide getName() and getPrice() getters.
    [x]Implement public double getPriceWithTax() to return the price including 5% tax: price * 1.05.
     */