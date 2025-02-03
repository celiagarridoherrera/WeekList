package dev.celia.weeklist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeekDayHandlerTest {

    @Test
    public void testCreateList() {
        WeekDayHandler handler = new WeekDayHandler();
        handler.createList();
        List<String> expected = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        assertEquals(expected, handler.getDays());    
    }
}
