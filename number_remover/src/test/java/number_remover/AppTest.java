package number_remover;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testRemoveInteger() {
        assertEquals("It was  rain.", App.removeNumbers("It was 123 rain."));
    }

    @Test public void testRemoveFloat() {
        assertEquals("", App.removeNumbers("3.1415"));
    }

    @Test public void testRemoveBothFloatAndInteger() {
        assertEquals("A + B =  + ", App.removeNumbers("A + B = 2.786 + 4888884"));
    }
}
