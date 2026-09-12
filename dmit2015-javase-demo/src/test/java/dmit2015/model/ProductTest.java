package dmit2015.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class ProductTest {

    //– methodName_scenario_expectedBehavior
    //Arrange: setup objects and data.
    //Act: call the method
    //Assert: verify results


    //Test 1 — Verify Product Name
    //Create a product with name "Laptop" and price 1200. Verify that getName() returns "Laptop".
    @Test
    void getName_productName_shouldReturnLaptop()
    {
        Product currentProduct = new Product("Laptop", 1200);
        String actualName = currentProduct.getName();
        assertThat(actualName).isEqualTo("Laptop");
    }
    //Test 2 — Verify Product Price
    //Using the same valid constructor inputs, verify that getPrice() returns 1200. Together, Tests 1 and 2 verify valid object creation.
    @Test
    void getPrice_productPrice_shouldReturn1200()
    {
        Product currentProduct = new Product("Laptop", 1200);
        double actualPrice = currentProduct.getPrice();
        assertThat(actualPrice).isCloseTo(1200, within(0.01));
    }
    //Test 3 — Verify Tax Calculation
    //Calculate the expected total independently for a price of 1200 and 5% tax.
    //Verify that getPriceWithTax() returns 1260, using a tolerance of 0.01 for the double comparison.
    @Test
    void getPriceWithTax_expectedTotal_shouldContainTax()
    {
        Product currentProduct = new Product("Laptop", 1200);
        double actualPrice = currentProduct.getPriceWithTax();
        assertThat(actualPrice).isCloseTo(1260, within(0.01));
    }
    //Test 4 — Verify Invalid Product Name
    //Test each of these names with a valid price of 100:
            //null
            //""
            //" "
    //For each input, verify that the constructor throws IllegalArgumentException and that the message contains required.

    @Test
    void




    /*
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
    */
}
