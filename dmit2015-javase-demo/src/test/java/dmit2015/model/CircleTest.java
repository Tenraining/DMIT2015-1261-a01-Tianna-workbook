package dmit2015.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*; //* does em all
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.assertj.core.api.AssertionsForClassTypes.within;

class CircleTest {
    @Test
    void area_whenCircleIsCreated_shouldReturnCorrectArea()
    {
        Circle circle = new Circle(5); //type the 5 first before the radius
        assertThat(circle.area()).isCloseTo(78.54, within(0.01));
    }

}