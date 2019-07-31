package com.chickenbranches.aviationcalendar;

import android.annotation.TargetApi;
import android.app.IntentService;
import android.app.NotificationManager;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.media.RingtoneManager;
import android.support.p000v4.app.NotificationCompat.Builder;
import com.google.android.gms.plus.PlusShare;
import java.util.Random;

public class MyAlarmService extends IntentService {
    public MyAlarmService() {
        super("ReminderService");
    }

    /* access modifiers changed from: protected */
    @TargetApi(16)
    public void onHandleIntent(Intent intent) {
        String subject = intent.getStringExtra("subject");
        String description = intent.getStringExtra(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION);
        int i1 = new Random().nextInt(9999);
        Builder mBuilder = new Builder(this).setSound(RingtoneManager.getDefaultUri(2)).setOnlyAlertOnce(true).setSmallIcon(C0074R.C0075drawable.icon).setContentTitle(subject).setContentText(description);
        Intent resultIntent = new Intent(this, SimpleCalendarViewActivity.class);
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(SimpleCalendarViewActivity.class);
        stackBuilder.addNextIntent(resultIntent);
        mBuilder.setContentIntent(stackBuilder.getPendingIntent(0, 134217728));
        ((NotificationManager) getSystemService("notification")).notify(i1, mBuilder.build());
    }
}
