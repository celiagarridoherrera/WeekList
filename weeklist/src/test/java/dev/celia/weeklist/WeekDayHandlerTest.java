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
    public void testGetSizeList() {
        WeekDayHandler handler = new WeekDayHandler();
        handler.createList();
        assertEquals(7, handler.getSizeList());
    }

    @Test
    public void testDeleteDay() {
        WeekDayHandler handler = new WeekDayHandler();
        handler.createList();
        handler.deleteDay("Monday");
        assertFalse(handler.getDays().contains("Monday"));
        
    }

    @Test
    public void testSpecificDayByName() {
        WeekDayHandler handler = new WeekDayHandler();
        handler.createList();
        assertEquals("Monday", handler.getSpecificDayByName("Monday"));
        assertEquals("Friday", handler.getSpecificDayByName("Friday"));
        assertNull(handler.getSpecificDayByName("Caturday"));
    }

    @Test
    public void testSpecificDayByIndex() {
        WeekDayHandler handler = new WeekDayHandler();
        handler.createList();
        assertEquals("Monday", handler.getSpecificDayByIndex(0));
        assertEquals("Sunday", handler.getSpecificDayByIndex(6));
        assertThrows(IndexOutOfBoundsException.class, () -> handler.getSpecificDayByIndex(7));
    }

    @Test
    public void testDayExists() {
        WeekDayHandler handler = new WeekDayHandler();
        handler.createList();
        assertTrue(handler.dayExists("Monday"));
        assertFalse(handler.dayExists("Caturday"));
    }

    @Test
    public void testSortAlphabetically() {
        WeekDayHandler handler = new WeekDayHandler();
        handler.createList();
        handler.sortAlphabetically();
        List<String> expected = List.of("Friday", "Monday", "Saturday", "Sunday", "Thursday", "Tuesday", "Wednesday");
        assertEquals(expected, handler.getDays());
        
    }

    @Test
    void testeEmptyList() {
        WeekDayHandler handler = new WeekDayHandler();
        handler.createList();
        handler.createList();
        handler.emptyList();
        assertTrue(handler.getDays().isEmpty());
        
    }    
}
