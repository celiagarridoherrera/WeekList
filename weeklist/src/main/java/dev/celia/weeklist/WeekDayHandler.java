package dev.celia.weeklist;

import java.util.List;
import java.util.ArrayList;

public class WeekDayHandler {
    private List<String> days;

    public WeekDayHandler() {
        days = new ArrayList<>();
    }

    public void createList() {
        days.clear();
        days.addAll(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    }

}
