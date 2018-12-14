import org.junit.Test;

import static org.junit.Assert.*;

public class DreieckTest {

    @Test
    public void test001() {

        Dreieck dreieck = new Dreieck(10, 10, 90);

        System.out.println(dreieck.output());

    }

}