package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.C0161b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.C0324d;
import com.google.android.gms.games.Player;
import com.google.android.gms.internal.C0564ds;
import com.google.android.gms.internal.C0596ee;
import com.google.android.gms.internal.C0596ee.C0598a;
import com.google.android.gms.plus.PlusShare;

/* renamed from: com.google.android.gms.games.achievement.a */
public final class C0321a extends C0161b implements Achievement {
    C0321a(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public String getAchievementId() {
        return getString("external_achievement_id");
    }

    public int getCurrentSteps() {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        C0564ds.m1397p(z);
        return getInteger("current_steps");
    }

    public String getDescription() {
        return getString(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION);
    }

    public void getDescription(CharArrayBuffer dataOut) {
        mo2412a(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, dataOut);
    }

    public String getFormattedCurrentSteps() {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        C0564ds.m1397p(z);
        return getString("formatted_current_steps");
    }

    public void getFormattedCurrentSteps(CharArrayBuffer dataOut) {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        C0564ds.m1397p(z);
        mo2412a("formatted_current_steps", dataOut);
    }

    public String getFormattedTotalSteps() {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        C0564ds.m1397p(z);
        return getString("formatted_total_steps");
    }

    public void getFormattedTotalSteps(CharArrayBuffer dataOut) {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        C0564ds.m1397p(z);
        mo2412a("formatted_total_steps", dataOut);
    }

    public long getLastUpdatedTimestamp() {
        return getLong("last_updated_timestamp");
    }

    public String getName() {
        return getString("name");
    }

    public void getName(CharArrayBuffer dataOut) {
        mo2412a("name", dataOut);
    }

    public Player getPlayer() {
        return new C0324d(this.f319nE, this.f320nG);
    }

    public Uri getRevealedImageUri() {
        return mo2410L("revealed_icon_image_uri");
    }

    public int getState() {
        return getInteger("state");
    }

    public int getTotalSteps() {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        C0564ds.m1397p(z);
        return getInteger("total_steps");
    }

    public int getType() {
        return getInteger("type");
    }

    public Uri getUnlockedImageUri() {
        return mo2410L("unlocked_icon_image_uri");
    }

    public String toString() {
        C0598a a = C0596ee.m1542e(this).mo3971a("id", getAchievementId()).mo3971a("name", getName()).mo3971a("state", Integer.valueOf(getState())).mo3971a("type", Integer.valueOf(getType()));
        if (getType() == 1) {
            a.mo3971a("steps", getCurrentSteps() + "/" + getTotalSteps());
        }
        return a.toString();
    }
}
