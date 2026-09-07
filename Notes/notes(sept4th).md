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
   <dependency>
       <groupId>org.junit.jupiter</groupId>
       <artifactId>junit-jupiter</artifactId>
       <version>6.1.3</version>
       <scope>test</scope>
   </dependency>
   ```
9. Pop it into the pom.xml file
10. Make sure to rebuild every time you modify `pom.xml`
11. Errors should disappear after rebuilding