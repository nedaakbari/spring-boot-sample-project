package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello(), containsString("Hello"));
//    assertThat(greeter.sayHello(), containsString("1"));
    }

    @Test
    public void greeterSaysHello2() {
        assertThat(greeter.sayHello(), containsString("Hello"));
//    assertThat(greeter.sayHello(), containsString("1"));
    }

}