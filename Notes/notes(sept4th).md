1. Right click the name of the class
2. Click "Show Context Actions"
3. Click "create test"
4. Change test library to JUnit6
5. Ok
6. It's ok if there's an error right now, it's a common error since we're missing a dependency
7. Create a new dependency in pom.xml
```
<dependencies>
        
</dependencies>
```
8. Grab the dependency (Jupiter means its ver 5 or higher)
   `https://mvnrepository.com/search?q=junit`
   ```
   <!-- Source: https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter -->
   <dependencies>
   <dependency>
       <groupId>org.junit.jupiter</groupId>
       <artifactId>junit-jupiter</artifactId>
       <version>6.1.3</version>
       <scope>test</scope>
   </dependency>
   </dependencies>
   ```
9. Pop it into the pom.xml file
10. Make sure to rebuild every time you modify `pom.xml`
11. Errors should disappear after rebuilding
12. `<scope>test</scope> ` means this dependency is only for the test folder we made earlier
13. `import static org.assertj.core.api.AssertionsForClassTypes.*;`
```
class CircleTest {
    @Test
    void area_whenCircleIsCreated_shouldReturnCorrectArea()
    {
        Circle circle = new Circle(5); //type the 5 first before the radius
        assertThat(circle.area()).isCloseTo(78.54, within(0.01));
    }}
```
If it's red ->
import static method -> org.assertJ... -> click
14. Press play button -> runs the unit tests!