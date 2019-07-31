package com.chickenbranches.aviationcalendar;

import android.content.Context;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class NotificationMethods {
    Context context;

    public NotificationMethods(Context context2) {
        this.context = context2;
    }

    public int SetSelectedHour(int selectedHour) {
        if (selectedHour > 12) {
            return selectedHour - 12;
        }
        return selectedHour;
    }

    public String setPm() {
        return "PM";
    }

    public String formatMinuteValue(int selectedMinute) {
        if (selectedMinute < 10) {
            return "0" + String.valueOf(selectedMinute);
        }
        return String.valueOf(selectedMinute);
    }

    public int notificationYear(String selectedYear) {
        return Integer.parseInt(selectedYear);
    }

    public int notifcationMonth(String selectedMonth) {
        Calendar cal = Calendar.getInstance();
        try {
            cal.setTime(new SimpleDateFormat("MMM").parse(selectedMonth));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return cal.get(2);
    }

    public int notificationDay(String selectedDay) {
        return Integer.parseInt(selectedDay);
    }

    public int notificationMinute(int eventMinute) {
        return eventMinute + 60;
    }

    public int notificationHour(int eventHour) {
        return eventHour - 1;
    }
}
