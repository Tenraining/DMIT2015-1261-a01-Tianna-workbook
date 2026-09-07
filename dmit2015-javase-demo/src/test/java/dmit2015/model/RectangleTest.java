package dmit2015.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
class RectangleTest {
@Test
    void perimeter_whenRectangleIsCreated_shouldReturnCorrectPerimeter()
{
    Rectangle rectangle = new Rectangle(5, 5);
    assertThat(rectangle.perimeter()).isCloseTo(67, within(0.7));
}
}