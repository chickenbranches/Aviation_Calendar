package com.chickenbranches.aviationcalendar;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.plus.PlusShare;
import java.util.ArrayList;
import java.util.HashMap;

public class DBTools extends SQLiteOpenHelper {
    public DBTools(Context applicationcontext) {
        super(applicationcontext, "event.db", null, 1);
    }

    public void onCreate(SQLiteDatabase database) {
        database.execSQL("CREATE TABLE settings ( settingID INTEGER PRIMARY KEY, setting TEXT, choice TEXT)");
        database.execSQL("CREATE TABLE events ( eventID INTEGER PRIMARY KEY, subject TEXT, time TEXT, date TEXT, description TEXT)");
    }

    public void onUpgrade(SQLiteDatabase database, int version_old, int current_version) {
        database.execSQL("DROP TABLE IF EXISTS events");
        database.execSQL("DROP TABLE IF EXISTS settings");
        onCreate(database);
    }

    public void insertEvent(HashMap<String, String> queryValues) {
        SQLiteDatabase database = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("subject", (String) queryValues.get("subject"));
        values.put("time", (String) queryValues.get("time"));
        values.put("date", (String) queryValues.get("date"));
        values.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, (String) queryValues.get(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION));
        database.insert("events", null, values);
        database.close();
    }

    public void createSetting(HashMap<String, String> queryValues) {
        SQLiteDatabase database = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("setting", (String) queryValues.get("setting"));
        values.put("choice", (String) queryValues.get("choice"));
        database.insert("settings", null, values);
        database.close();
    }

    public void updateSetting(HashMap<String, String> queryValues) {
        SQLiteDatabase database = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("setting", (String) queryValues.get("setting"));
        values.put("choice", (String) queryValues.get("choice"));
        database.update("settings", values, "settingID = ?", new String[]{(String) queryValues.get("settingID")});
        database.close();
    }

    public String checkNotificationSetting(String settingOption) {
        SQLiteDatabase database = getReadableDatabase();
        String contactId = "Nothing";
        Cursor c = database.rawQuery("SELECT * FROM " + "settings" + " where setting = '" + settingOption + "'", null);
        if (c != null && c.moveToFirst()) {
            contactId = c.getString(c.getColumnIndex("choice"));
        }
        database.close();
        return contactId;
    }

    public void updateEvent(HashMap<String, String> queryValues) {
        SQLiteDatabase database = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("subject", (String) queryValues.get("subject"));
        values.put("time", (String) queryValues.get("time"));
        values.put("date", (String) queryValues.get("date"));
        values.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, (String) queryValues.get(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION));
        database.update("events", values, "eventID = ?", new String[]{(String) queryValues.get("eventID")});
        database.close();
    }

    public void deleteEvent(String id) {
        SQLiteDatabase database = getWritableDatabase();
        database.execSQL("DELETE FROM events WHERE eventID='" + id + "'");
        database.close();
    }

    public ArrayList<HashMap<String, String>> getAllEvents(String value) {
        ArrayList<HashMap<String, String>> eventArrayList = new ArrayList<>();
        String selectQuery = "SELECT  * FROM events where date='" + value + "'";
        SQLiteDatabase database = getWritableDatabase();
        Cursor cursor = database.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                HashMap<String, String> eventMap = new HashMap<>();
                eventMap.put("eventID", cursor.getString(0));
                eventMap.put("subject", cursor.getString(1));
                eventMap.put("time", cursor.getString(2));
                eventMap.put("date", cursor.getString(3));
                eventMap.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, cursor.getString(4));
                eventArrayList.add(eventMap);
            } while (cursor.moveToNext());
        }
        database.close();
        return eventArrayList;
    }

    public HashMap<String, String> getEventInfo(String id) {
        HashMap<String, String> eventMap = new HashMap<>();
        SQLiteDatabase database = getReadableDatabase();
        Cursor cursor = database.rawQuery("SELECT * FROM events where eventID='" + id + "'", null);
        if (cursor.moveToFirst()) {
            do {
                eventMap.put("subject", cursor.getString(1));
                eventMap.put("time", cursor.getString(2));
                eventMap.put("date", cursor.getString(3));
                eventMap.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, cursor.getString(4));
            } while (cursor.moveToNext());
        }
        database.close();
        return eventMap;
    }
}
