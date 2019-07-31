package com.chickenbranches.aviationcalendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import com.google.android.gms.plus.PlusShare;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;

public class EventCreater extends Activity implements OnClickListener {
    Button addEventButton;
    String amOrPm = "AM";
    DBTools dbTools = new DBTools(this);
    EditText descriptionEditText;
    RadioButton fifteen;
    RadioGroup notificationRadioGroup;
    NotificationMethods notificationTools = new NotificationMethods(this);
    Button passedDayMonthYearButton;
    int selectedHour;
    String selectedMinuteString = null;
    RadioButton selectedRadioButton;
    RadioButton sixty;
    EditText subjectEditText;
    RadioButton thirty;
    TimePicker timePicker;
    String value = "";

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0074R.layout.event_view);
        this.value = getIntent().getStringExtra("key");
        this.passedDayMonthYearButton = (Button) findViewById(C0074R.C0076id.passedDayMonthYear);
        this.passedDayMonthYearButton.setText(this.value);
        this.addEventButton = (Button) findViewById(C0074R.C0076id.addEventButton);
        this.addEventButton.setOnClickListener(this);
        this.subjectEditText = (EditText) findViewById(C0074R.C0076id.subjectEditText);
        this.timePicker = (TimePicker) findViewById(C0074R.C0076id.timePicker);
        this.descriptionEditText = (EditText) findViewById(C0074R.C0076id.descriptionEditText);
        this.fifteen = (RadioButton) findViewById(C0074R.C0076id.fifteen);
        this.thirty = (RadioButton) findViewById(C0074R.C0076id.thirty);
        this.sixty = (RadioButton) findViewById(C0074R.C0076id.sixty);
        this.notificationRadioGroup = (RadioGroup) findViewById(C0074R.C0076id.notificationRadioGroup);
        this.notificationRadioGroup.check(this.fifteen.getId());
    }

    public void addNewEvent(View view) {
        this.selectedRadioButton = (RadioButton) findViewById(this.notificationRadioGroup.getCheckedRadioButtonId());
        int notificationDelivery = Integer.parseInt(this.selectedRadioButton.getText().toString().split(" ")[0]);
        if (notificationDelivery == 1) {
            notificationDelivery = 60;
        }
        this.selectedHour = this.notificationTools.SetSelectedHour(this.timePicker.getCurrentHour().intValue());
        this.selectedMinuteString = this.notificationTools.formatMinuteValue(this.timePicker.getCurrentMinute().intValue());
        if (this.timePicker.getCurrentHour().intValue() > 11) {
            this.amOrPm = this.notificationTools.setPm();
        }
        HashMap<String, String> queryValuesMap = new HashMap<>();
        queryValuesMap.put("subject", this.subjectEditText.getText().toString());
        queryValuesMap.put("time", new StringBuilder(String.valueOf(String.valueOf(this.selectedHour))).append(":").append(this.selectedMinuteString).append(" ").append(this.amOrPm).toString());
        queryValuesMap.put("date", this.value);
        queryValuesMap.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, this.descriptionEditText.getText().toString());
        this.dbTools.insertEvent(queryValuesMap);
        if (this.dbTools.checkNotificationSetting("notifications").equals("Enabled")) {
            int eventHour = this.timePicker.getCurrentHour().intValue();
            int eventMinute = this.timePicker.getCurrentMinute().intValue() - notificationDelivery;
            if (eventMinute < 0) {
                eventMinute = this.notificationTools.notificationMinute(eventMinute);
                eventHour = this.notificationTools.notificationHour(eventHour);
            }
            String[] dayOfEvent = this.value.split("-");
            sendNotification(eventMinute, eventHour, this.notificationTools.notificationDay(dayOfEvent[0]), this.notificationTools.notifcationMonth(dayOfEvent[1]), this.notificationTools.notificationYear(dayOfEvent[2]), this.subjectEditText.getText().toString(), this.descriptionEditText.getText().toString());
        }
        callSimpleCalendar(view);
    }

    public void sendNotification(int minute, int hour, int day, int month, int year, String subject, String description) {
        int i1 = new Random().nextInt(99);
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(System.currentTimeMillis());
        cal.clear();
        cal.set(year, month, day, hour, minute);
        Intent intent = new Intent(this, MyAlarmService.class);
        intent.putExtra("subject", subject);
        intent.putExtra(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, description);
        ((AlarmManager) getSystemService("alarm")).set(1, cal.getTimeInMillis(), PendingIntent.getService(this, i1, intent, 0));
    }

    public void callSimpleCalendar(View view) {
        Intent theIntent = new Intent(getApplication(), EventList.class);
        theIntent.putExtra("key", this.value);
        startActivity(theIntent);
        finish();
    }

    public void onClick(View v) {
        addNewEvent(v);
    }
}
