/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pricedisplay;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test public void testPriceDisplay() {
        App test = new App();
        assertEquals("The price for item: Apple is 10.99", test.getPriceLabel("Apple", 10.99));
    }
}
