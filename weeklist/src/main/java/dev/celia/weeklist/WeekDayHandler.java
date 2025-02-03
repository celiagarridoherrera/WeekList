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

    public List<String> getDays() {
        return new ArrayList<>(days);
    }

    public int getSizeList() {
        return days.size();
    }

    public void deleteDay(String day) {
        days.remove(day);
    }
    
    public String getSpecificDayByName(String day) {
        if (days.contains(day)) {
            return day;
        }
        return null;
    }

    public String getSpecificDayByIndex(int index) {
        return days.get(index);
    }

    public boolean dayExists (String day) {
        return days.contains(day);
    }

    public void sortAlphabetically() {
        days.sort(String::compareTo);
    }

    


}
