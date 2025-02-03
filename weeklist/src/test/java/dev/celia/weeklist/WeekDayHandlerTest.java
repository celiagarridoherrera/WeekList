package dev.celia.weeklist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;


public class WeekDayHandlerTest {


    @Test
    public void testCreateList() {
        WeekDayHandler handler = new WeekDayHandler();
        handler.createList();
        List<String> expected = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        assertEquals(expected, handler.getDays());
    }

    @Test
    public void testGetDays() {
        WeekDayHandler handler = new WeekDayHandler();
        handler.createList();
        List<String> days = handler.getDays();
        assertNotNull(days);
        assertEquals(7, days.size());
        
    }

    @Test
    public void tesGetSizeList() {
        WeekDayHandler handler = new WeekDayHandler();
        handler.createList();
        assertEquals(7, handler.getSizeList());
    }

    @Test
    void testDeleteDay() {
        WeekDayHandler handler = new WeekDayHandler();
        handler.createList();
        handler.deleteDay("Monday");
        assertFalse(handler.getDays().contains("Monday"));
        
    }

    @Test
    void testSpecificDayByName() {
        WeekDayHandler handler = new WeekDayHandler();
        handler.createList();
        assertEquals("Monday", handler.getSpecificDayByName("Monday"));
        assertEquals("Friday", handler.getSpecificDayByName("Friday"));
        assertNull(handler.getSpecificDayByName("Caturday"));
    }

    
    
    
}
