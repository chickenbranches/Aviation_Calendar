package com.chickenbranches.aviationcalendar;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;

public class EventList extends ListActivity {
    public static boolean IsClosingActivities = false;
    DBTools dbTools = new DBTools(this);
    TextView eventID;
    TextView eventTime;
    Intent intent;
    String value = "";

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0074R.layout.activity_main);
        this.value = getIntent().getStringExtra("key");
        ArrayList<HashMap<String, String>> eventList = this.dbTools.getAllEvents(this.value);
        if (eventList.size() != 0) {
            getListView().setOnItemClickListener(new OnItemClickListener() {
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    EventList.this.eventID = (TextView) view.findViewById(C0074R.C0076id.eventID);
                    String eventIdValue = EventList.this.eventID.getText().toString();
                    Intent theIndent = new Intent(EventList.this.getApplication(), EditEvent.class);
                    Bundle extras = new Bundle();
                    extras.putString("eventID", eventIdValue);
                    extras.putString("key", EventList.this.value);
                    theIndent.putExtras(extras);
                    EventList.this.startActivity(theIndent);
                }
            });
            setListAdapter(new SimpleAdapter(this, eventList, C0074R.layout.event_entry, new String[]{"eventID", "subject", "time"}, new int[]{C0074R.C0076id.eventID, C0074R.C0076id.eventSubject, C0074R.C0076id.eventTime}));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0074R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case C0074R.C0076id.update /*2131034160*/:
                checkUpdate();
                return true;
            case C0074R.C0076id.settings /*2131034161*/:
                changeSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void changeSettings() {
        Intent objIntent = new Intent(getApplication(), ChangeSettings.class);
        Bundle extras = new Bundle();
        extras.putString("settingID", "1");
        objIntent.putExtras(extras);
        startActivity(objIntent);
    }

    public void checkUpdate() {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")));
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        finish();
    }

    public void showAddEvent(View view) {
        Intent theIntent = new Intent(getApplication(), EventCreater.class);
        theIntent.putExtra("key", this.value);
        startActivity(theIntent);
        finish();
    }
}
