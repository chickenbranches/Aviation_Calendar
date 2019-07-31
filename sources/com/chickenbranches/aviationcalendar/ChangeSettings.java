package com.chickenbranches.aviationcalendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.HashMap;

public class ChangeSettings extends Activity {
    DBTools dbTools = new DBTools(this);
    RadioButton notificationRBDisabled;
    RadioButton notificationRBEnabled;
    RadioButton notificationRadioButton;
    RadioGroup notificationRadioGroup;
    String value = "";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0074R.layout.settings);
        this.notificationRBDisabled = (RadioButton) findViewById(C0074R.C0076id.radio1);
        this.notificationRBEnabled = (RadioButton) findViewById(C0074R.C0076id.radio0);
        setButton();
    }

    public void setButton() {
        if (this.dbTools.checkNotificationSetting("notifications").equals("Enabled")) {
            this.notificationRBEnabled.setChecked(true);
        } else {
            this.notificationRBDisabled.setChecked(true);
        }
    }

    public void saveSettings(View view) {
        HashMap<String, String> queryValuesMap = new HashMap<>();
        this.notificationRadioGroup = (RadioGroup) findViewById(C0074R.C0076id.radioGroup1);
        this.notificationRadioButton = (RadioButton) findViewById(this.notificationRadioGroup.getCheckedRadioButtonId());
        queryValuesMap.put("settingID", getIntent().getExtras().getString("settingID"));
        queryValuesMap.put("setting", "notifications");
        queryValuesMap.put("choice", this.notificationRadioButton.getText().toString());
        if (this.dbTools.checkNotificationSetting("notifications").equals("Nothing")) {
            this.dbTools.createSetting(queryValuesMap);
        } else {
            this.dbTools.updateSetting(queryValuesMap);
        }
        finish();
    }

    public void callMainActivity(View view) {
        EventList.IsClosingActivities = true;
        startActivity(new Intent(getApplication(), SimpleCalendarViewActivity.class));
        finish();
    }
}
