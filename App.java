/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.net.MalformedURLException;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
        Amazonsearch amazonsearch = new Amazonsearch(); // Initialize your test class

        //TODO: call your test case functions one after other here

        amazonsearch.testCase01();

    //  Amazonsearch amazonsearch = new Amazonsearch();

        // amazonsearch.testCase01();
        //END Tests
        // amazonsearch.endTest();

      //  tests.endTest(); // End your test by clearning connections and closing browser
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}
