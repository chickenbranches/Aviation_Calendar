package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0600eg;
import java.util.Collections;
import java.util.List;

public class ActivityRecognitionResult implements SafeParcelable {
    public static final ActivityRecognitionResultCreator CREATOR = new ActivityRecognitionResultCreator();
    public static final String EXTRA_ACTIVITY_RESULT = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT";

    /* renamed from: kg */
    private final int f2423kg;

    /* renamed from: xm */
    List<DetectedActivity> f2424xm;

    /* renamed from: xn */
    long f2425xn;

    /* renamed from: xo */
    long f2426xo;

    public ActivityRecognitionResult(int versionCode, List<DetectedActivity> probableActivities, long timeMillis, long elapsedRealtimeMillis) {
        this.f2423kg = 1;
        this.f2424xm = probableActivities;
        this.f2425xn = timeMillis;
        this.f2426xo = elapsedRealtimeMillis;
    }

    public ActivityRecognitionResult(DetectedActivity mostProbableActivity, long time, long elapsedRealtimeMillis) {
        this(Collections.singletonList(mostProbableActivity), time, elapsedRealtimeMillis);
    }

    public ActivityRecognitionResult(List<DetectedActivity> probableActivities, long time, long elapsedRealtimeMillis) {
        C0600eg.m1553b(probableActivities != null && probableActivities.size() > 0, (Object) "Must have at least 1 detected activity");
        this.f2423kg = 1;
        this.f2424xm = probableActivities;
        this.f2425xn = time;
        this.f2426xo = elapsedRealtimeMillis;
    }

    public static ActivityRecognitionResult extractResult(Intent intent) {
        if (!hasResult(intent)) {
            return null;
        }
        return (ActivityRecognitionResult) intent.getExtras().get(EXTRA_ACTIVITY_RESULT);
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra(EXTRA_ACTIVITY_RESULT);
    }

    public int describeContents() {
        return 0;
    }

    public int getActivityConfidence(int activityType) {
        for (DetectedActivity detectedActivity : this.f2424xm) {
            if (detectedActivity.getType() == activityType) {
                return detectedActivity.getConfidence();
            }
        }
        return 0;
    }

    public long getElapsedRealtimeMillis() {
        return this.f2426xo;
    }

    public DetectedActivity getMostProbableActivity() {
        return (DetectedActivity) this.f2424xm.get(0);
    }

    public List<DetectedActivity> getProbableActivities() {
        return this.f2424xm;
    }

    public long getTime() {
        return this.f2425xn;
    }

    public int getVersionCode() {
        return this.f2423kg;
    }

    public String toString() {
        return "ActivityRecognitionResult [probableActivities=" + this.f2424xm + ", timeMillis=" + this.f2425xn + ", elapsedRealtimeMillis=" + this.f2426xo + "]";
    }

    public void writeToParcel(Parcel out, int flags) {
        ActivityRecognitionResultCreator.m3021a(this, out, flags);
    }
}
