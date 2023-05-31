package testing;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HiFriendTest {

    @Test
    public void testGreeting() {
        HiFriend obj = new HiFriend();

        String name = "Larry Sprinkle";
        String expectedGreeting = "Hi " + name + "!";
        assertEquals(expectedGreeting, obj.getGreeting(name));
    }


}
