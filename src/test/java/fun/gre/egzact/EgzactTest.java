package fun.gre.egzact;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class EgzactTest {
    @Test
    public void testStairr() {
        System.out.println(Egzact.stairr("aa bb cc dd ee ff gg", " "));
        System.out.println(Egzact.stairr(Arrays.asList("1 2 3", "a b c", "e f g"), " "));
        System.out.println(Egzact.stairl("aa bb cc dd ee ff gg", " "));
        System.out.println(Egzact.stairl(Arrays.asList("1 2 3", "a b c", "e f g"), " "));
        Egzact.stairr(Arrays.asList("1 2 3", "a b c", "e f g"), " ").forEach( s -> {
            System.out.println(Egzact.stairl(String.join(" ", s), " "));
        });
        assertTrue("Sample", true);
    }
}
