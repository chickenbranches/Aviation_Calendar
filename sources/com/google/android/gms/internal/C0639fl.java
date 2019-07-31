package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.GamesMetadata.LoadGamesResult;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.Players.LoadPlayersResult;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult;
import com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult;
import com.google.android.gms.games.leaderboard.C0326a;
import com.google.android.gms.games.leaderboard.C0329d;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult;
import com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.ParticipantUtils;
import com.google.android.gms.games.multiplayer.realtime.C0342a;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult;
import com.google.android.gms.internal.C0569dw.C0572c;
import com.google.android.gms.internal.C0569dw.C0573d;
import com.google.android.gms.internal.C0569dw.C0574e;
import com.google.android.gms.internal.C0569dw.C0576g;
import com.google.android.gms.internal.C0708fp.C0709a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.fl */
public final class C0639fl extends C0569dw<C0708fp> implements ConnectionCallbacks, OnConnectionFailedListener {

    /* renamed from: jG */
    private final String f1626jG;

    /* renamed from: tA */
    private boolean f1627tA;

    /* renamed from: tB */
    private int f1628tB;

    /* renamed from: tO */
    private final String f1629tO;

    /* renamed from: tP */
    private final Map<String, RealTimeSocket> f1630tP;

    /* renamed from: tQ */
    private PlayerEntity f1631tQ;

    /* renamed from: tR */
    private GameEntity f1632tR;

    /* renamed from: tS */
    private final C0711fq f1633tS;

    /* renamed from: tT */
    private boolean f1634tT;

    /* renamed from: tU */
    private final Binder f1635tU;

    /* renamed from: tV */
    private final long f1636tV;

    /* renamed from: tW */
    private final boolean f1637tW;

    /* renamed from: tX */
    private final int f1638tX;

    /* renamed from: com.google.android.gms.internal.fl$a */
    abstract class C0640a extends C0679c {

        /* renamed from: tY */
        private final ArrayList<String> f1639tY = new ArrayList<>();

        C0640a(RoomStatusUpdateListener roomStatusUpdateListener, DataHolder dataHolder, String[] strArr) {
            super(roomStatusUpdateListener, dataHolder);
            for (String add : strArr) {
                this.f1639tY.add(add);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4222a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            mo4223a(roomStatusUpdateListener, room, this.f1639tY);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4223a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList);
    }

    /* renamed from: com.google.android.gms.internal.fl$aa */
    final class C0641aa extends C0571b<RoomStatusUpdateListener> {

        /* renamed from: up */
        private final String f1642up;

        C0641aa(RoomStatusUpdateListener roomStatusUpdateListener, String str) {
            super(roomStatusUpdateListener);
            this.f1642up = str;
        }

        /* renamed from: a */
        public void mo3743b(RoomStatusUpdateListener roomStatusUpdateListener) {
            if (roomStatusUpdateListener != null) {
                roomStatusUpdateListener.onP2PConnected(this.f1642up);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$ab */
    final class C0642ab extends C0571b<RoomStatusUpdateListener> {

        /* renamed from: up */
        private final String f1644up;

        C0642ab(RoomStatusUpdateListener roomStatusUpdateListener, String str) {
            super(roomStatusUpdateListener);
            this.f1644up = str;
        }

        /* renamed from: a */
        public void mo3743b(RoomStatusUpdateListener roomStatusUpdateListener) {
            if (roomStatusUpdateListener != null) {
                roomStatusUpdateListener.onP2PDisconnected(this.f1644up);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$ac */
    final class C0643ac extends C0640a {
        C0643ac(RoomStatusUpdateListener roomStatusUpdateListener, DataHolder dataHolder, String[] strArr) {
            super(roomStatusUpdateListener, dataHolder, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4223a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeersConnected(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$ad */
    final class C0644ad extends C0640a {
        C0644ad(RoomStatusUpdateListener roomStatusUpdateListener, DataHolder dataHolder, String[] strArr) {
            super(roomStatusUpdateListener, dataHolder, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4223a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeerDeclined(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$ae */
    final class C0645ae extends C0640a {
        C0645ae(RoomStatusUpdateListener roomStatusUpdateListener, DataHolder dataHolder, String[] strArr) {
            super(roomStatusUpdateListener, dataHolder, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4223a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeersDisconnected(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$af */
    final class C0646af extends C0640a {
        C0646af(RoomStatusUpdateListener roomStatusUpdateListener, DataHolder dataHolder, String[] strArr) {
            super(roomStatusUpdateListener, dataHolder, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4223a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeerInvitedToRoom(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$ag */
    final class C0647ag extends C0640a {
        C0647ag(RoomStatusUpdateListener roomStatusUpdateListener, DataHolder dataHolder, String[] strArr) {
            super(roomStatusUpdateListener, dataHolder, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4223a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeerJoined(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$ah */
    final class C0648ah extends C0640a {
        C0648ah(RoomStatusUpdateListener roomStatusUpdateListener, DataHolder dataHolder, String[] strArr) {
            super(roomStatusUpdateListener, dataHolder, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4223a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeerLeft(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$ai */
    final class C0649ai extends C0638fk {

        /* renamed from: jW */
        private final C0157c<LoadPlayerScoreResult> f1651jW;

        C0649ai(C0157c<LoadPlayerScoreResult> cVar) {
            this.f1651jW = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        /* renamed from: D */
        public void mo4107D(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0650aj<Object>(this.f1651jW, dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$aj */
    final class C0650aj extends C0573d<C0157c<LoadPlayerScoreResult>> implements LoadPlayerScoreResult {

        /* renamed from: jY */
        private final Status f1653jY;

        /* renamed from: uq */
        private final C0329d f1655uq;

        C0650aj(C0157c<LoadPlayerScoreResult> cVar, DataHolder dataHolder) {
            super(cVar, dataHolder);
            this.f1653jY = new Status(dataHolder.getStatusCode());
            LeaderboardScoreBuffer leaderboardScoreBuffer = new LeaderboardScoreBuffer(dataHolder);
            try {
                if (leaderboardScoreBuffer.getCount() > 0) {
                    this.f1655uq = (C0329d) leaderboardScoreBuffer.get(0).freeze();
                } else {
                    this.f1655uq = null;
                }
            } finally {
                leaderboardScoreBuffer.close();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3746a(C0157c<LoadPlayerScoreResult> cVar, DataHolder dataHolder) {
            cVar.mo2048a(this);
        }

        public LeaderboardScore getScore() {
            return this.f1655uq;
        }

        public Status getStatus() {
            return this.f1653jY;
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$ak */
    final class C0651ak extends C0638fk {

        /* renamed from: jW */
        private final C0157c<LoadPlayersResult> f1656jW;

        C0651ak(C0157c<LoadPlayersResult> cVar) {
            this.f1656jW = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        /* renamed from: e */
        public void mo4124e(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0652al<Object>(this.f1656jW, dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$al */
    final class C0652al extends C0655ao<C0157c<LoadPlayersResult>> implements LoadPlayersResult {

        /* renamed from: ur */
        private final PlayerBuffer f1659ur;

        C0652al(C0157c<LoadPlayersResult> cVar, DataHolder dataHolder) {
            super(cVar, dataHolder);
            this.f1659ur = new PlayerBuffer(dataHolder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3746a(C0157c<LoadPlayersResult> cVar, DataHolder dataHolder) {
            cVar.mo2048a(this);
        }

        public PlayerBuffer getPlayers() {
            return this.f1659ur;
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$am */
    final class C0653am extends C0571b<ReliableMessageSentCallback> {

        /* renamed from: mC */
        private final int f1660mC;

        /* renamed from: us */
        private final String f1662us;

        /* renamed from: ut */
        private final int f1663ut;

        C0653am(ReliableMessageSentCallback reliableMessageSentCallback, int i, int i2, String str) {
            super(reliableMessageSentCallback);
            this.f1660mC = i;
            this.f1663ut = i2;
            this.f1662us = str;
        }

        /* renamed from: a */
        public void mo3743b(ReliableMessageSentCallback reliableMessageSentCallback) {
            if (reliableMessageSentCallback != null) {
                reliableMessageSentCallback.onRealTimeMessageSent(this.f1660mC, this.f1663ut, this.f1662us);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$an */
    final class C0654an extends C0638fk {

        /* renamed from: uu */
        final ReliableMessageSentCallback f1665uu;

        public C0654an(ReliableMessageSentCallback reliableMessageSentCallback) {
            this.f1665uu = reliableMessageSentCallback;
        }

        /* renamed from: b */
        public void mo4116b(int i, int i2, String str) {
            C0639fl.this.mo3887a((C0571b<?>) new C0653am<Object>(this.f1665uu, i, i2, str));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$ao */
    abstract class C0655ao<R extends C0157c<?>> extends C0573d<R> implements Releasable, Result {

        /* renamed from: jY */
        final Status f1666jY;

        /* renamed from: nE */
        final DataHolder f1667nE;

        public C0655ao(R r, DataHolder dataHolder) {
            super(r, dataHolder);
            this.f1666jY = new Status(dataHolder.getStatusCode());
            this.f1667nE = dataHolder;
        }

        public Status getStatus() {
            return this.f1666jY;
        }

        public void release() {
            if (this.f1667nE != null) {
                this.f1667nE.close();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$ap */
    final class C0656ap extends C0679c {
        C0656ap(RoomStatusUpdateListener roomStatusUpdateListener, DataHolder dataHolder) {
            super(roomStatusUpdateListener, dataHolder);
        }

        /* renamed from: a */
        public void mo4222a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            roomStatusUpdateListener.onRoomAutoMatching(room);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$aq */
    final class C0657aq extends C0638fk {

        /* renamed from: uv */
        private final RoomUpdateListener f1671uv;

        /* renamed from: uw */
        private final RoomStatusUpdateListener f1672uw;

        /* renamed from: ux */
        private final RealTimeMessageReceivedListener f1673ux;

        public C0657aq(RoomUpdateListener roomUpdateListener) {
            this.f1671uv = (RoomUpdateListener) C0600eg.m1552b(roomUpdateListener, (Object) "Callbacks must not be null");
            this.f1672uw = null;
            this.f1673ux = null;
        }

        public C0657aq(RoomUpdateListener roomUpdateListener, RoomStatusUpdateListener roomStatusUpdateListener, RealTimeMessageReceivedListener realTimeMessageReceivedListener) {
            this.f1671uv = (RoomUpdateListener) C0600eg.m1552b(roomUpdateListener, (Object) "Callbacks must not be null");
            this.f1672uw = roomStatusUpdateListener;
            this.f1673ux = realTimeMessageReceivedListener;
        }

        /* renamed from: a */
        public void mo4111a(DataHolder dataHolder, String[] strArr) {
            C0639fl.this.mo3887a((C0571b<?>) new C0646af<Object>(this.f1672uw, dataHolder, strArr));
        }

        /* renamed from: b */
        public void mo4118b(DataHolder dataHolder, String[] strArr) {
            C0639fl.this.mo3887a((C0571b<?>) new C0647ag<Object>(this.f1672uw, dataHolder, strArr));
        }

        /* renamed from: c */
        public void mo4120c(DataHolder dataHolder, String[] strArr) {
            C0639fl.this.mo3887a((C0571b<?>) new C0648ah<Object>(this.f1672uw, dataHolder, strArr));
        }

        /* renamed from: d */
        public void mo4123d(DataHolder dataHolder, String[] strArr) {
            C0639fl.this.mo3887a((C0571b<?>) new C0644ad<Object>(this.f1672uw, dataHolder, strArr));
        }

        /* renamed from: e */
        public void mo4125e(DataHolder dataHolder, String[] strArr) {
            C0639fl.this.mo3887a((C0571b<?>) new C0643ac<Object>(this.f1672uw, dataHolder, strArr));
        }

        /* renamed from: f */
        public void mo4127f(DataHolder dataHolder, String[] strArr) {
            C0639fl.this.mo3887a((C0571b<?>) new C0645ae<Object>(this.f1672uw, dataHolder, strArr));
        }

        public void onLeftRoom(int statusCode, String externalRoomId) {
            C0639fl.this.mo3887a((C0571b<?>) new C0698v<Object>(this.f1671uv, statusCode, externalRoomId));
        }

        public void onP2PConnected(String participantId) {
            C0639fl.this.mo3887a((C0571b<?>) new C0641aa<Object>(this.f1672uw, participantId));
        }

        public void onP2PDisconnected(String participantId) {
            C0639fl.this.mo3887a((C0571b<?>) new C0642ab<Object>(this.f1672uw, participantId));
        }

        public void onRealTimeMessageReceived(RealTimeMessage message) {
            C0639fl.this.mo3887a((C0571b<?>) new C0702z<Object>(this.f1673ux, message));
        }

        /* renamed from: t */
        public void mo4150t(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0660at<Object>(this.f1671uv, dataHolder));
        }

        /* renamed from: u */
        public void mo4151u(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0693q<Object>(this.f1671uv, dataHolder));
        }

        /* renamed from: v */
        public void mo4152v(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0659as<Object>(this.f1672uw, dataHolder));
        }

        /* renamed from: w */
        public void mo4153w(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0656ap<Object>(this.f1672uw, dataHolder));
        }

        /* renamed from: x */
        public void mo4154x(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0658ar<Object>(this.f1671uv, dataHolder));
        }

        /* renamed from: y */
        public void mo4155y(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0684h<Object>(this.f1672uw, dataHolder));
        }

        /* renamed from: z */
        public void mo4156z(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0685i<Object>(this.f1672uw, dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$ar */
    final class C0658ar extends C0667b {
        C0658ar(RoomUpdateListener roomUpdateListener, DataHolder dataHolder) {
            super(roomUpdateListener, dataHolder);
        }

        /* renamed from: a */
        public void mo4229a(RoomUpdateListener roomUpdateListener, Room room, int i) {
            roomUpdateListener.onRoomConnected(i, room);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$as */
    final class C0659as extends C0679c {
        C0659as(RoomStatusUpdateListener roomStatusUpdateListener, DataHolder dataHolder) {
            super(roomStatusUpdateListener, dataHolder);
        }

        /* renamed from: a */
        public void mo4222a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            roomStatusUpdateListener.onRoomConnecting(room);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$at */
    final class C0660at extends C0667b {
        public C0660at(RoomUpdateListener roomUpdateListener, DataHolder dataHolder) {
            super(roomUpdateListener, dataHolder);
        }

        /* renamed from: a */
        public void mo4229a(RoomUpdateListener roomUpdateListener, Room room, int i) {
            roomUpdateListener.onRoomCreated(i, room);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$au */
    final class C0661au extends C0638fk {

        /* renamed from: jW */
        private final C0157c<Status> f1677jW;

        public C0661au(C0157c<Status> cVar) {
            this.f1677jW = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        public void onSignOutComplete() {
            C0639fl.this.mo3887a((C0571b<?>) new C0662av<Object>(this.f1677jW, new Status(0)));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$av */
    final class C0662av extends C0571b<C0157c<Status>> {

        /* renamed from: jY */
        private final Status f1679jY;

        public C0662av(C0157c<Status> cVar, Status status) {
            super(cVar);
            this.f1679jY = status;
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }

        /* renamed from: c */
        public void mo3743b(C0157c<Status> cVar) {
            cVar.mo2048a(this.f1679jY);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$aw */
    final class C0663aw extends C0638fk {

        /* renamed from: jW */
        private final C0157c<SubmitScoreResult> f1681jW;

        public C0663aw(C0157c<SubmitScoreResult> cVar) {
            this.f1681jW = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        /* renamed from: d */
        public void mo4122d(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0664ax<Object>(this.f1681jW, dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$ax */
    final class C0664ax extends C0655ao<C0157c<SubmitScoreResult>> implements SubmitScoreResult {

        /* renamed from: uy */
        private final ScoreSubmissionData f1684uy;

        public C0664ax(C0157c<SubmitScoreResult> cVar, DataHolder dataHolder) {
            super(cVar, dataHolder);
            this.f1684uy = new ScoreSubmissionData(dataHolder);
        }

        /* renamed from: a */
        public void mo3746a(C0157c<SubmitScoreResult> cVar, DataHolder dataHolder) {
            cVar.mo2048a(this);
        }

        public ScoreSubmissionData getScoreData() {
            return this.f1684uy;
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$ay */
    abstract class C0665ay<T extends C0157c<?>> extends C0655ao<T> {

        /* renamed from: un */
        final TurnBasedMatch f1686un;

        C0665ay(T t, DataHolder dataHolder) {
            super(t, dataHolder);
            TurnBasedMatchBuffer turnBasedMatchBuffer = new TurnBasedMatchBuffer(dataHolder);
            try {
                if (turnBasedMatchBuffer.getCount() > 0) {
                    this.f1686un = (TurnBasedMatch) ((TurnBasedMatch) turnBasedMatchBuffer.get(0)).freeze();
                } else {
                    this.f1686un = null;
                }
            } finally {
                turnBasedMatchBuffer.close();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3746a(T t, DataHolder dataHolder) {
            mo4234i(t);
        }

        public TurnBasedMatch getMatch() {
            return this.f1686un;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public abstract void mo4234i(T t);
    }

    /* renamed from: com.google.android.gms.internal.fl$az */
    final class C0666az extends C0638fk {

        /* renamed from: uz */
        private final C0157c<CancelMatchResult> f1688uz;

        public C0666az(C0157c<CancelMatchResult> cVar) {
            this.f1688uz = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        public void onTurnBasedMatchCanceled(int statusCode, String matchId) {
            C0639fl.this.mo3887a((C0571b<?>) new C0668ba<Object>(this.f1688uz, new Status(statusCode), matchId));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$b */
    abstract class C0667b extends C0573d<RoomUpdateListener> {
        C0667b(RoomUpdateListener roomUpdateListener, DataHolder dataHolder) {
            super(roomUpdateListener, dataHolder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3746a(RoomUpdateListener roomUpdateListener, DataHolder dataHolder) {
            mo4229a(roomUpdateListener, C0639fl.this.m1757E(dataHolder), dataHolder.getStatusCode());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4229a(RoomUpdateListener roomUpdateListener, Room room, int i);
    }

    /* renamed from: com.google.android.gms.internal.fl$ba */
    final class C0668ba extends C0571b<C0157c<CancelMatchResult>> implements CancelMatchResult {

        /* renamed from: jY */
        private final Status f1690jY;

        /* renamed from: uA */
        private final String f1692uA;

        C0668ba(C0157c<CancelMatchResult> cVar, Status status, String str) {
            super(cVar);
            this.f1690jY = status;
            this.f1692uA = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }

        /* renamed from: c */
        public void mo3743b(C0157c<CancelMatchResult> cVar) {
            cVar.mo2048a(this);
        }

        public String getMatchId() {
            return this.f1692uA;
        }

        public Status getStatus() {
            return this.f1690jY;
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$bb */
    final class C0669bb extends C0638fk {

        /* renamed from: uB */
        private final C0157c<InitiateMatchResult> f1694uB;

        public C0669bb(C0157c<InitiateMatchResult> cVar) {
            this.f1694uB = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        /* renamed from: n */
        public void mo4135n(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0670bc<Object>(this.f1694uB, dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$bc */
    final class C0670bc extends C0665ay<C0157c<InitiateMatchResult>> implements InitiateMatchResult {
        C0670bc(C0157c<InitiateMatchResult> cVar, DataHolder dataHolder) {
            super(cVar, dataHolder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo4234i(C0157c<InitiateMatchResult> cVar) {
            cVar.mo2048a(this);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$bd */
    final class C0671bd extends C0638fk {

        /* renamed from: uC */
        private final C0157c<LeaveMatchResult> f1697uC;

        public C0671bd(C0157c<LeaveMatchResult> cVar) {
            this.f1697uC = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        /* renamed from: p */
        public void mo4146p(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0672be<Object>(this.f1697uC, dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$be */
    final class C0672be extends C0665ay<C0157c<LeaveMatchResult>> implements LeaveMatchResult {
        C0672be(C0157c<LeaveMatchResult> cVar, DataHolder dataHolder) {
            super(cVar, dataHolder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo4234i(C0157c<LeaveMatchResult> cVar) {
            cVar.mo2048a(this);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$bf */
    final class C0673bf extends C0638fk {

        /* renamed from: uD */
        private final C0157c<LoadMatchResult> f1700uD;

        public C0673bf(C0157c<LoadMatchResult> cVar) {
            this.f1700uD = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        /* renamed from: m */
        public void mo4134m(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0674bg<Object>(this.f1700uD, dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$bg */
    final class C0674bg extends C0665ay<C0157c<LoadMatchResult>> implements LoadMatchResult {
        C0674bg(C0157c<LoadMatchResult> cVar, DataHolder dataHolder) {
            super(cVar, dataHolder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo4234i(C0157c<LoadMatchResult> cVar) {
            cVar.mo2048a(this);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$bh */
    final class C0675bh extends C0638fk {

        /* renamed from: uE */
        private final C0157c<UpdateMatchResult> f1703uE;

        public C0675bh(C0157c<UpdateMatchResult> cVar) {
            this.f1703uE = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        /* renamed from: o */
        public void mo4136o(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0676bi<Object>(this.f1703uE, dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$bi */
    final class C0676bi extends C0665ay<C0157c<UpdateMatchResult>> implements UpdateMatchResult {
        C0676bi(C0157c<UpdateMatchResult> cVar, DataHolder dataHolder) {
            super(cVar, dataHolder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo4234i(C0157c<UpdateMatchResult> cVar) {
            cVar.mo2048a(this);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$bj */
    final class C0677bj extends C0638fk {

        /* renamed from: uF */
        private final C0157c<LoadMatchesResult> f1706uF;

        public C0677bj(C0157c<LoadMatchesResult> cVar) {
            this.f1706uF = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        /* renamed from: a */
        public void mo4108a(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            C0639fl.this.mo3887a((C0571b<?>) new C0678bk<Object>(this.f1706uF, new Status(i), bundle));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$bk */
    final class C0678bk extends C0571b<C0157c<LoadMatchesResult>> implements LoadMatchesResult {

        /* renamed from: jY */
        private final Status f1707jY;

        /* renamed from: uG */
        private final LoadMatchesResponse f1709uG;

        C0678bk(C0157c<LoadMatchesResult> cVar, Status status, Bundle bundle) {
            super(cVar);
            this.f1707jY = status;
            this.f1709uG = new LoadMatchesResponse(bundle);
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo3743b(C0157c<LoadMatchesResult> cVar) {
            cVar.mo2048a(this);
        }

        public LoadMatchesResponse getMatches() {
            return this.f1709uG;
        }

        public Status getStatus() {
            return this.f1707jY;
        }

        public void release() {
            this.f1709uG.close();
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$c */
    abstract class C0679c extends C0573d<RoomStatusUpdateListener> {
        C0679c(RoomStatusUpdateListener roomStatusUpdateListener, DataHolder dataHolder) {
            super(roomStatusUpdateListener, dataHolder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3746a(RoomStatusUpdateListener roomStatusUpdateListener, DataHolder dataHolder) {
            mo4222a(roomStatusUpdateListener, C0639fl.this.m1757E(dataHolder));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4222a(RoomStatusUpdateListener roomStatusUpdateListener, Room room);
    }

    /* renamed from: com.google.android.gms.internal.fl$d */
    final class C0680d extends C0638fk {

        /* renamed from: jW */
        private final C0157c<UpdateAchievementResult> f1711jW;

        C0680d(C0157c<UpdateAchievementResult> cVar) {
            this.f1711jW = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        public void onAchievementUpdated(int statusCode, String achievementId) {
            C0639fl.this.mo3887a((C0571b<?>) new C0681e<Object>(this.f1711jW, statusCode, achievementId));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$e */
    final class C0681e extends C0571b<C0157c<UpdateAchievementResult>> implements UpdateAchievementResult {

        /* renamed from: jY */
        private final Status f1713jY;

        /* renamed from: ua */
        private final String f1715ua;

        C0681e(C0157c<UpdateAchievementResult> cVar, int i, String str) {
            super(cVar);
            this.f1713jY = new Status(i);
            this.f1715ua = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo3743b(C0157c<UpdateAchievementResult> cVar) {
            cVar.mo2048a(this);
        }

        public String getAchievementId() {
            return this.f1715ua;
        }

        public Status getStatus() {
            return this.f1713jY;
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$f */
    final class C0682f extends C0638fk {

        /* renamed from: jW */
        private final C0157c<LoadAchievementsResult> f1716jW;

        C0682f(C0157c<LoadAchievementsResult> cVar) {
            this.f1716jW = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        /* renamed from: b */
        public void mo4117b(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0683g<Object>(this.f1716jW, dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$g */
    final class C0683g extends C0655ao<C0157c<LoadAchievementsResult>> implements LoadAchievementsResult {

        /* renamed from: ub */
        private final AchievementBuffer f1719ub;

        C0683g(C0157c<LoadAchievementsResult> cVar, DataHolder dataHolder) {
            super(cVar, dataHolder);
            this.f1719ub = new AchievementBuffer(dataHolder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3746a(C0157c<LoadAchievementsResult> cVar, DataHolder dataHolder) {
            cVar.mo2048a(this);
        }

        public AchievementBuffer getAchievements() {
            return this.f1719ub;
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$h */
    final class C0684h extends C0679c {
        C0684h(RoomStatusUpdateListener roomStatusUpdateListener, DataHolder dataHolder) {
            super(roomStatusUpdateListener, dataHolder);
        }

        /* renamed from: a */
        public void mo4222a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            roomStatusUpdateListener.onConnectedToRoom(room);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$i */
    final class C0685i extends C0679c {
        C0685i(RoomStatusUpdateListener roomStatusUpdateListener, DataHolder dataHolder) {
            super(roomStatusUpdateListener, dataHolder);
        }

        /* renamed from: a */
        public void mo4222a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            roomStatusUpdateListener.onDisconnectedFromRoom(room);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$j */
    final class C0686j extends C0638fk {

        /* renamed from: jW */
        private final C0157c<LoadGamesResult> f1722jW;

        C0686j(C0157c<LoadGamesResult> cVar) {
            this.f1722jW = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        /* renamed from: g */
        public void mo4128g(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0687k<Object>(this.f1722jW, dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$k */
    final class C0687k extends C0655ao<C0157c<LoadGamesResult>> implements LoadGamesResult {

        /* renamed from: uc */
        private final GameBuffer f1725uc;

        C0687k(C0157c<LoadGamesResult> cVar, DataHolder dataHolder) {
            super(cVar, dataHolder);
            this.f1725uc = new GameBuffer(dataHolder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3746a(C0157c<LoadGamesResult> cVar, DataHolder dataHolder) {
            cVar.mo2048a(this);
        }

        public GameBuffer getGames() {
            return this.f1725uc;
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$l */
    final class C0688l extends C0638fk {

        /* renamed from: ud */
        private final OnInvitationReceivedListener f1727ud;

        C0688l(OnInvitationReceivedListener onInvitationReceivedListener) {
            this.f1727ud = onInvitationReceivedListener;
        }

        /* renamed from: l */
        public void mo4133l(DataHolder dataHolder) {
            InvitationBuffer invitationBuffer = new InvitationBuffer(dataHolder);
            Invitation invitation = null;
            try {
                if (invitationBuffer.getCount() > 0) {
                    invitation = (Invitation) ((Invitation) invitationBuffer.get(0)).freeze();
                }
                if (invitation != null) {
                    C0639fl.this.mo3887a((C0571b<?>) new C0689m<Object>(this.f1727ud, invitation));
                }
            } finally {
                invitationBuffer.close();
            }
        }

        public void onInvitationRemoved(String invitationId) {
            C0639fl.this.mo3887a((C0571b<?>) new C0690n<Object>(this.f1727ud, invitationId));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$m */
    final class C0689m extends C0571b<OnInvitationReceivedListener> {

        /* renamed from: ue */
        private final Invitation f1729ue;

        C0689m(OnInvitationReceivedListener onInvitationReceivedListener, Invitation invitation) {
            super(onInvitationReceivedListener);
            this.f1729ue = invitation;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3743b(OnInvitationReceivedListener onInvitationReceivedListener) {
            onInvitationReceivedListener.onInvitationReceived(this.f1729ue);
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$n */
    final class C0690n extends C0571b<OnInvitationReceivedListener> {

        /* renamed from: uf */
        private final String f1731uf;

        C0690n(OnInvitationReceivedListener onInvitationReceivedListener, String str) {
            super(onInvitationReceivedListener);
            this.f1731uf = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3743b(OnInvitationReceivedListener onInvitationReceivedListener) {
            onInvitationReceivedListener.onInvitationRemoved(this.f1731uf);
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$o */
    final class C0691o extends C0638fk {

        /* renamed from: jW */
        private final C0157c<LoadInvitationsResult> f1732jW;

        C0691o(C0157c<LoadInvitationsResult> cVar) {
            this.f1732jW = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        /* renamed from: k */
        public void mo4132k(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0692p<Object>(this.f1732jW, dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$p */
    final class C0692p extends C0655ao<C0157c<LoadInvitationsResult>> implements LoadInvitationsResult {

        /* renamed from: ug */
        private final InvitationBuffer f1735ug;

        C0692p(C0157c<LoadInvitationsResult> cVar, DataHolder dataHolder) {
            super(cVar, dataHolder);
            this.f1735ug = new InvitationBuffer(dataHolder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3746a(C0157c<LoadInvitationsResult> cVar, DataHolder dataHolder) {
            cVar.mo2048a(this);
        }

        public InvitationBuffer getInvitations() {
            return this.f1735ug;
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$q */
    final class C0693q extends C0667b {
        public C0693q(RoomUpdateListener roomUpdateListener, DataHolder dataHolder) {
            super(roomUpdateListener, dataHolder);
        }

        /* renamed from: a */
        public void mo4229a(RoomUpdateListener roomUpdateListener, Room room, int i) {
            roomUpdateListener.onJoinedRoom(i, room);
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$r */
    final class C0694r extends C0638fk {

        /* renamed from: jW */
        private final C0157c<LoadScoresResult> f1737jW;

        C0694r(C0157c<LoadScoresResult> cVar) {
            this.f1737jW = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        /* renamed from: a */
        public void mo4110a(DataHolder dataHolder, DataHolder dataHolder2) {
            C0639fl.this.mo3887a((C0571b<?>) new C0695s<Object>(this.f1737jW, dataHolder, dataHolder2));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$s */
    final class C0695s extends C0655ao<C0157c<LoadScoresResult>> implements LoadScoresResult {

        /* renamed from: uh */
        private final C0326a f1740uh;

        /* renamed from: ui */
        private final LeaderboardScoreBuffer f1741ui;

        /* JADX INFO: finally extract failed */
        C0695s(C0157c<LoadScoresResult> cVar, DataHolder dataHolder, DataHolder dataHolder2) {
            super(cVar, dataHolder2);
            LeaderboardBuffer leaderboardBuffer = new LeaderboardBuffer(dataHolder);
            try {
                if (leaderboardBuffer.getCount() > 0) {
                    this.f1740uh = (C0326a) ((Leaderboard) leaderboardBuffer.get(0)).freeze();
                } else {
                    this.f1740uh = null;
                }
                leaderboardBuffer.close();
                this.f1741ui = new LeaderboardScoreBuffer(dataHolder2);
            } catch (Throwable th) {
                leaderboardBuffer.close();
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3746a(C0157c<LoadScoresResult> cVar, DataHolder dataHolder) {
            cVar.mo2048a(this);
        }

        public Leaderboard getLeaderboard() {
            return this.f1740uh;
        }

        public LeaderboardScoreBuffer getScores() {
            return this.f1741ui;
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$t */
    final class C0696t extends C0638fk {

        /* renamed from: jW */
        private final C0157c<LeaderboardMetadataResult> f1742jW;

        C0696t(C0157c<LeaderboardMetadataResult> cVar) {
            this.f1742jW = (C0157c) C0600eg.m1552b(cVar, (Object) "Holder must not be null");
        }

        /* renamed from: c */
        public void mo4119c(DataHolder dataHolder) {
            C0639fl.this.mo3887a((C0571b<?>) new C0697u<Object>(this.f1742jW, dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$u */
    final class C0697u extends C0655ao<C0157c<LeaderboardMetadataResult>> implements LeaderboardMetadataResult {

        /* renamed from: uj */
        private final LeaderboardBuffer f1745uj;

        C0697u(C0157c<LeaderboardMetadataResult> cVar, DataHolder dataHolder) {
            super(cVar, dataHolder);
            this.f1745uj = new LeaderboardBuffer(dataHolder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3746a(C0157c<LeaderboardMetadataResult> cVar, DataHolder dataHolder) {
            cVar.mo2048a(this);
        }

        public LeaderboardBuffer getLeaderboards() {
            return this.f1745uj;
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$v */
    final class C0698v extends C0571b<RoomUpdateListener> {

        /* renamed from: mC */
        private final int f1746mC;

        /* renamed from: uk */
        private final String f1748uk;

        C0698v(RoomUpdateListener roomUpdateListener, int i, String str) {
            super(roomUpdateListener);
            this.f1746mC = i;
            this.f1748uk = str;
        }

        /* renamed from: a */
        public void mo3743b(RoomUpdateListener roomUpdateListener) {
            roomUpdateListener.onLeftRoom(this.f1746mC, this.f1748uk);
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$w */
    final class C0699w extends C0571b<OnTurnBasedMatchUpdateReceivedListener> {

        /* renamed from: ul */
        private final String f1750ul;

        C0699w(OnTurnBasedMatchUpdateReceivedListener onTurnBasedMatchUpdateReceivedListener, String str) {
            super(onTurnBasedMatchUpdateReceivedListener);
            this.f1750ul = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3743b(OnTurnBasedMatchUpdateReceivedListener onTurnBasedMatchUpdateReceivedListener) {
            onTurnBasedMatchUpdateReceivedListener.onTurnBasedMatchRemoved(this.f1750ul);
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$x */
    final class C0700x extends C0638fk {

        /* renamed from: um */
        private final OnTurnBasedMatchUpdateReceivedListener f1752um;

        C0700x(OnTurnBasedMatchUpdateReceivedListener onTurnBasedMatchUpdateReceivedListener) {
            this.f1752um = onTurnBasedMatchUpdateReceivedListener;
        }

        public void onTurnBasedMatchRemoved(String matchId) {
            C0639fl.this.mo3887a((C0571b<?>) new C0699w<Object>(this.f1752um, matchId));
        }

        /* renamed from: q */
        public void mo4147q(DataHolder dataHolder) {
            TurnBasedMatchBuffer turnBasedMatchBuffer = new TurnBasedMatchBuffer(dataHolder);
            TurnBasedMatch turnBasedMatch = null;
            try {
                if (turnBasedMatchBuffer.getCount() > 0) {
                    turnBasedMatch = (TurnBasedMatch) ((TurnBasedMatch) turnBasedMatchBuffer.get(0)).freeze();
                }
                if (turnBasedMatch != null) {
                    C0639fl.this.mo3887a((C0571b<?>) new C0701y<Object>(this.f1752um, turnBasedMatch));
                }
            } finally {
                turnBasedMatchBuffer.close();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$y */
    final class C0701y extends C0571b<OnTurnBasedMatchUpdateReceivedListener> {

        /* renamed from: un */
        private final TurnBasedMatch f1754un;

        C0701y(OnTurnBasedMatchUpdateReceivedListener onTurnBasedMatchUpdateReceivedListener, TurnBasedMatch turnBasedMatch) {
            super(onTurnBasedMatchUpdateReceivedListener);
            this.f1754un = turnBasedMatch;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3743b(OnTurnBasedMatchUpdateReceivedListener onTurnBasedMatchUpdateReceivedListener) {
            onTurnBasedMatchUpdateReceivedListener.onTurnBasedMatchReceived(this.f1754un);
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }
    }

    /* renamed from: com.google.android.gms.internal.fl$z */
    final class C0702z extends C0571b<RealTimeMessageReceivedListener> {

        /* renamed from: uo */
        private final RealTimeMessage f1756uo;

        C0702z(RealTimeMessageReceivedListener realTimeMessageReceivedListener, RealTimeMessage realTimeMessage) {
            super(realTimeMessageReceivedListener);
            this.f1756uo = realTimeMessage;
        }

        /* renamed from: a */
        public void mo3743b(RealTimeMessageReceivedListener realTimeMessageReceivedListener) {
            if (realTimeMessageReceivedListener != null) {
                realTimeMessageReceivedListener.onRealTimeMessageReceived(this.f1756uo);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: aL */
        public void mo3742aL() {
        }
    }

    @Deprecated
    public C0639fl(Context context, String str, String str2, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener, String[] strArr, int i, View view, boolean z, boolean z2, int i2) {
        this(context, str, str2, new C0572c(connectionCallbacks), new C0576g(onConnectionFailedListener), strArr, i, view, z, z2, i2, 4368);
    }

    public C0639fl(Context context, String str, String str2, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String[] strArr, int i, View view, boolean z, boolean z2, int i2, int i3) {
        super(context, connectionCallbacks, onConnectionFailedListener, strArr);
        this.f1634tT = false;
        this.f1627tA = false;
        this.f1629tO = str;
        this.f1626jG = (String) C0600eg.m1554f(str2);
        this.f1635tU = new Binder();
        this.f1630tP = new HashMap();
        this.f1633tS = C0711fq.m2241a(this, i);
        setViewForPopups(view);
        this.f1627tA = z2;
        this.f1628tB = i2;
        this.f1636tV = (long) hashCode();
        this.f1637tW = z;
        this.f1638tX = i3;
        registerConnectionCallbacks((ConnectionCallbacks) this);
        registerConnectionFailedListener((OnConnectionFailedListener) this);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public Room m1757E(DataHolder dataHolder) {
        C0342a aVar = new C0342a(dataHolder);
        Room room = null;
        try {
            if (aVar.getCount() > 0) {
                room = (Room) ((Room) aVar.get(0)).freeze();
            }
            return room;
        } finally {
            aVar.close();
        }
    }

    /* renamed from: ae */
    private RealTimeSocket m1759ae(String str) {
        try {
            String ag = ((C0708fp) mo3890bQ()).mo4292ag(str);
            if (ag == null) {
                return null;
            }
            LocalSocket localSocket = new LocalSocket();
            try {
                localSocket.connect(new LocalSocketAddress(ag));
                C0715fr frVar = new C0715fr(localSocket, str);
                this.f1630tP.put(str, frVar);
                return frVar;
            } catch (IOException e) {
                C0704fn.m1920d("GamesClientImpl", "connect() call failed on socket: " + e.getMessage());
                return null;
            }
        } catch (RemoteException e2) {
            C0704fn.m1920d("GamesClientImpl", "Unable to create socket. Service died.");
            return null;
        }
    }

    /* renamed from: dc */
    private void m1760dc() {
        this.f1631tQ = null;
    }

    /* renamed from: de */
    private void m1761de() {
        for (RealTimeSocket close : this.f1630tP.values()) {
            try {
                close.close();
            } catch (IOException e) {
                C0704fn.m1918a("GamesClientImpl", "IOException:", e);
            }
        }
        this.f1630tP.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public C0708fp mo2643p(IBinder iBinder) {
        return C0709a.m2125H(iBinder);
    }

    /* renamed from: a */
    public int mo4158a(ReliableMessageSentCallback reliableMessageSentCallback, byte[] bArr, String str, String str2) {
        try {
            return ((C0708fp) mo3890bQ()).mo4254a((C0705fo) new C0654an(reliableMessageSentCallback), bArr, str, str2);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return -1;
        }
    }

    /* renamed from: a */
    public int mo4159a(byte[] bArr, String str, String[] strArr) {
        C0600eg.m1552b(strArr, (Object) "Participant IDs must not be null");
        try {
            return ((C0708fp) mo3890bQ()).mo4298b(bArr, str, strArr);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2637a(int i, IBinder iBinder, Bundle bundle) {
        if (i == 0 && bundle != null) {
            this.f1634tT = bundle.getBoolean("show_welcome_popup");
        }
        super.mo2637a(i, iBinder, bundle);
    }

    /* renamed from: a */
    public void mo4160a(IBinder iBinder, Bundle bundle) {
        if (isConnected()) {
            try {
                ((C0708fp) mo3890bQ()).mo4258a(iBinder, bundle);
            } catch (RemoteException e) {
                C0704fn.m1919c("GamesClientImpl", "service died");
            }
        }
    }

    /* renamed from: a */
    public void mo4161a(C0157c<LoadPlayersResult> cVar, int i, boolean z, boolean z2) {
        try {
            ((C0708fp) mo3890bQ()).mo4262a((C0705fo) new C0651ak(cVar), i, z, z2);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo4162a(C0157c<LoadScoresResult> cVar, LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2) {
        try {
            ((C0708fp) mo3890bQ()).mo4265a((C0705fo) new C0694r(cVar), leaderboardScoreBuffer.mo3104dq().mo3158dr(), i, i2);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo4163a(C0157c<InitiateMatchResult> cVar, TurnBasedMatchConfig turnBasedMatchConfig) {
        try {
            ((C0708fp) mo3890bQ()).mo4261a((C0705fo) new C0669bb(cVar), turnBasedMatchConfig.getVariant(), turnBasedMatchConfig.getMinPlayers(), turnBasedMatchConfig.getInvitedPlayerIds(), turnBasedMatchConfig.getAutoMatchCriteria());
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo4164a(C0157c<LoadPlayersResult> cVar, String str) {
        try {
            ((C0708fp) mo3890bQ()).mo4317c((C0705fo) new C0651ak(cVar), str);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo4165a(C0157c<UpdateAchievementResult> cVar, String str, int i) {
        try {
            ((C0708fp) mo3890bQ()).mo4270a((C0705fo) cVar == null ? null : new C0680d(cVar), str, i, this.f1633tS.mo4388dn(), this.f1633tS.mo4387dm());
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo4166a(C0157c<LoadScoresResult> cVar, String str, int i, int i2, int i3, boolean z) {
        try {
            ((C0708fp) mo3890bQ()).mo4269a((C0705fo) new C0694r(cVar), str, i, i2, i3, z);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo4167a(C0157c<LoadPlayersResult> cVar, String str, int i, boolean z, boolean z2) {
        if (!str.equals("playedWith")) {
            throw new IllegalArgumentException("Invalid player collection: " + str);
        }
        try {
            ((C0708fp) mo3890bQ()).mo4327d(new C0651ak(cVar), str, i, z, z2);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo4168a(C0157c<SubmitScoreResult> cVar, String str, long j, String str2) {
        try {
            ((C0708fp) mo3890bQ()).mo4275a((C0705fo) cVar == null ? null : new C0663aw(cVar), str, j, str2);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo4169a(C0157c<LeaveMatchResult> cVar, String str, String str2) {
        try {
            ((C0708fp) mo3890bQ()).mo4328d((C0705fo) new C0671bd(cVar), str, str2);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo4170a(C0157c<LoadPlayerScoreResult> cVar, String str, String str2, int i, int i2) {
        try {
            ((C0708fp) mo3890bQ()).mo4278a((C0705fo) new C0649ai(cVar), str, str2, i, i2);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo4171a(C0157c<LeaderboardMetadataResult> cVar, String str, boolean z) {
        try {
            ((C0708fp) mo3890bQ()).mo4320c((C0705fo) new C0696t(cVar), str, z);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo4172a(C0157c<UpdateMatchResult> cVar, String str, byte[] bArr, String str2, ParticipantResult[] participantResultArr) {
        try {
            ((C0708fp) mo3890bQ()).mo4284a((C0705fo) new C0675bh(cVar), str, bArr, str2, participantResultArr);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo4173a(C0157c<UpdateMatchResult> cVar, String str, byte[] bArr, ParticipantResult[] participantResultArr) {
        try {
            ((C0708fp) mo3890bQ()).mo4285a((C0705fo) new C0675bh(cVar), str, bArr, participantResultArr);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo4174a(C0157c<LeaderboardMetadataResult> cVar, boolean z) {
        try {
            ((C0708fp) mo3890bQ()).mo4313b((C0705fo) new C0696t(cVar), z);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo4175a(C0157c<LoadMatchesResult> cVar, int[] iArr) {
        try {
            ((C0708fp) mo3890bQ()).mo4289a((C0705fo) new C0677bj(cVar), iArr);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2638a(C0590ec ecVar, C0574e eVar) throws RemoteException {
        String locale = getContext().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.f1637tW);
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", this.f1627tA);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", this.f1628tB);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", this.f1638tX);
        ecVar.mo3951a(eVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName(), this.f1626jG, mo3888bO(), this.f1629tO, this.f1633tS.mo4388dn(), locale, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3736a(String... strArr) {
        boolean z = false;
        boolean z2 = false;
        for (String str : strArr) {
            if (str.equals(Scopes.GAMES)) {
                z2 = true;
            } else if (str.equals("https://www.googleapis.com/auth/games.firstparty")) {
                z = true;
            }
        }
        if (z) {
            C0600eg.m1550a(!z2, String.format("Cannot have both %s and %s!", new Object[]{Scopes.GAMES, "https://www.googleapis.com/auth/games.firstparty"}));
            return;
        }
        C0600eg.m1550a(z2, String.format("Games APIs requires %s to function.", new Object[]{Scopes.GAMES}));
    }

    /* renamed from: aU */
    public Bundle mo2319aU() {
        try {
            Bundle aU = ((C0708fp) mo3890bQ()).mo4290aU();
            if (aU == null) {
                return aU;
            }
            aU.setClassLoader(C0639fl.class.getClassLoader());
            return aU;
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public String mo2639am() {
        return "com.google.android.gms.games.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: an */
    public String mo2640an() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    /* renamed from: b */
    public void mo4176b(C0157c<Status> cVar) {
        try {
            ((C0708fp) mo3890bQ()).mo4259a(new C0661au(cVar));
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo4177b(C0157c<UpdateAchievementResult> cVar, String str) {
        try {
            ((C0708fp) mo3890bQ()).mo4276a((C0705fo) cVar == null ? null : new C0680d(cVar), str, this.f1633tS.mo4388dn(), this.f1633tS.mo4387dm());
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo4178b(C0157c<UpdateAchievementResult> cVar, String str, int i) {
        try {
            ((C0708fp) mo3890bQ()).mo4306b((C0705fo) cVar == null ? null : new C0680d(cVar), str, i, this.f1633tS.mo4388dn(), this.f1633tS.mo4387dm());
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo4179b(C0157c<LoadScoresResult> cVar, String str, int i, int i2, int i3, boolean z) {
        try {
            ((C0708fp) mo3890bQ()).mo4305b(new C0694r(cVar), str, i, i2, i3, z);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo4180b(C0157c<LoadAchievementsResult> cVar, boolean z) {
        try {
            ((C0708fp) mo3890bQ()).mo4287a((C0705fo) new C0682f(cVar), z);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: c */
    public void mo4181c(C0157c<UpdateAchievementResult> cVar, String str) {
        try {
            ((C0708fp) mo3890bQ()).mo4308b((C0705fo) cVar == null ? null : new C0680d(cVar), str, this.f1633tS.mo4388dn(), this.f1633tS.mo4387dm());
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    public void clearNotifications(int notificationTypes) {
        try {
            ((C0708fp) mo3890bQ()).clearNotifications(notificationTypes);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    public void connect() {
        m1760dc();
        super.connect();
    }

    public void createRoom(RoomConfig config) {
        try {
            ((C0708fp) mo3890bQ()).mo4266a((C0705fo) new C0657aq(config.getRoomUpdateListener(), config.getRoomStatusUpdateListener(), config.getMessageReceivedListener()), (IBinder) this.f1635tU, config.getVariant(), config.getInvitedPlayerIds(), config.getAutoMatchCriteria(), config.isSocketEnabled(), this.f1636tV);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: d */
    public void mo4184d(C0157c<InitiateMatchResult> cVar, String str) {
        try {
            ((C0708fp) mo3890bQ()).mo4376n(new C0669bb(cVar), str);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: dd */
    public int mo4185dd() {
        try {
            return ((C0708fp) mo3890bQ()).mo4330dd();
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return 4368;
        }
    }

    /* renamed from: df */
    public void mo4186df() {
        if (isConnected()) {
            try {
                ((C0708fp) mo3890bQ()).mo4331df();
            } catch (RemoteException e) {
                C0704fn.m1919c("GamesClientImpl", "service died");
            }
        }
    }

    public void disconnect() {
        this.f1634tT = false;
        if (isConnected()) {
            try {
                C0708fp fpVar = (C0708fp) mo3890bQ();
                fpVar.mo4331df();
                fpVar.mo4368j(this.f1636tV);
            } catch (RemoteException e) {
                C0704fn.m1919c("GamesClientImpl", "Failed to notify client disconnect.");
            }
        }
        m1761de();
        super.disconnect();
    }

    public void dismissTurnBasedMatch(String matchId) {
        try {
            ((C0708fp) mo3890bQ()).mo4296ak(matchId);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: e */
    public void mo4188e(C0157c<InitiateMatchResult> cVar, String str) {
        try {
            ((C0708fp) mo3890bQ()).mo4377o(new C0669bb(cVar), str);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: f */
    public void mo4189f(C0157c<LeaveMatchResult> cVar, String str) {
        try {
            ((C0708fp) mo3890bQ()).mo4379q(new C0671bd(cVar), str);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: g */
    public void mo4190g(C0157c<LoadGamesResult> cVar) {
        try {
            ((C0708fp) mo3890bQ()).mo4324d(new C0686j(cVar));
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: g */
    public void mo4191g(C0157c<CancelMatchResult> cVar, String str) {
        try {
            ((C0708fp) mo3890bQ()).mo4378p(new C0666az(cVar), str);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    public Intent getAchievementsIntent() {
        try {
            return ((C0708fp) mo3890bQ()).getAchievementsIntent();
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return null;
        }
    }

    public Intent getAllLeaderboardsIntent() {
        try {
            return ((C0708fp) mo3890bQ()).getAllLeaderboardsIntent();
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return null;
        }
    }

    public String getAppId() {
        try {
            return ((C0708fp) mo3890bQ()).getAppId();
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return null;
        }
    }

    public String getCurrentAccountName() {
        try {
            return ((C0708fp) mo3890bQ()).getCurrentAccountName();
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return null;
        }
    }

    public Game getCurrentGame() {
        GameBuffer gameBuffer;
        mo3889bP();
        synchronized (this) {
            if (this.f1632tR == null) {
                try {
                    gameBuffer = new GameBuffer(((C0708fp) mo3890bQ()).mo4334di());
                    if (gameBuffer.getCount() > 0) {
                        this.f1632tR = (GameEntity) gameBuffer.get(0).freeze();
                    }
                    gameBuffer.close();
                } catch (RemoteException e) {
                    C0704fn.m1919c("GamesClientImpl", "service died");
                } catch (Throwable th) {
                    gameBuffer.close();
                    throw th;
                }
            }
        }
        return this.f1632tR;
    }

    public Player getCurrentPlayer() {
        PlayerBuffer playerBuffer;
        mo3889bP();
        synchronized (this) {
            if (this.f1631tQ == null) {
                try {
                    playerBuffer = new PlayerBuffer(((C0708fp) mo3890bQ()).mo4332dg());
                    if (playerBuffer.getCount() > 0) {
                        this.f1631tQ = (PlayerEntity) playerBuffer.get(0).freeze();
                    }
                    playerBuffer.close();
                } catch (RemoteException e) {
                    C0704fn.m1919c("GamesClientImpl", "service died");
                } catch (Throwable th) {
                    playerBuffer.close();
                    throw th;
                }
            }
        }
        return this.f1631tQ;
    }

    public String getCurrentPlayerId() {
        try {
            return ((C0708fp) mo3890bQ()).getCurrentPlayerId();
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return null;
        }
    }

    public Intent getInvitationInboxIntent() {
        try {
            return ((C0708fp) mo3890bQ()).getInvitationInboxIntent();
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return null;
        }
    }

    public Intent getLeaderboardIntent(String leaderboardId) {
        try {
            return ((C0708fp) mo3890bQ()).getLeaderboardIntent(leaderboardId);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return null;
        }
    }

    public Intent getMatchInboxIntent() {
        try {
            return ((C0708fp) mo3890bQ()).getMatchInboxIntent();
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return null;
        }
    }

    public int getMaxTurnBasedMatchDataSize() {
        try {
            return ((C0708fp) mo3890bQ()).getMaxTurnBasedMatchDataSize();
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return 2;
        }
    }

    public Intent getPlayerSearchIntent() {
        try {
            return ((C0708fp) mo3890bQ()).getPlayerSearchIntent();
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return null;
        }
    }

    public Intent getRealTimeSelectOpponentsIntent(int minPlayers, int maxPlayers, boolean allowAutomatch) {
        try {
            return ((C0708fp) mo3890bQ()).getRealTimeSelectOpponentsIntent(minPlayers, maxPlayers, allowAutomatch);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return null;
        }
    }

    public RealTimeSocket getRealTimeSocketForParticipant(String roomId, String participantId) {
        if (participantId == null || !ParticipantUtils.m789am(participantId)) {
            throw new IllegalArgumentException("Bad participant ID");
        }
        RealTimeSocket realTimeSocket = (RealTimeSocket) this.f1630tP.get(participantId);
        return (realTimeSocket == null || realTimeSocket.isClosed()) ? m1759ae(participantId) : realTimeSocket;
    }

    public Intent getRealTimeWaitingRoomIntent(Room room, int minParticipantsToStart) {
        try {
            return ((C0708fp) mo3890bQ()).mo4255a((RoomEntity) room.freeze(), minParticipantsToStart);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return null;
        }
    }

    public Intent getSettingsIntent() {
        try {
            return ((C0708fp) mo3890bQ()).getSettingsIntent();
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return null;
        }
    }

    public Intent getTurnBasedSelectOpponentsIntent(int minPlayers, int maxPlayers, boolean allowAutomatch) {
        try {
            return ((C0708fp) mo3890bQ()).getTurnBasedSelectOpponentsIntent(minPlayers, maxPlayers, allowAutomatch);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: h */
    public void mo4209h(C0157c<LoadInvitationsResult> cVar) {
        try {
            ((C0708fp) mo3890bQ()).mo4338e((C0705fo) new C0691o(cVar));
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: h */
    public void mo4210h(C0157c<LoadMatchResult> cVar, String str) {
        try {
            ((C0708fp) mo3890bQ()).mo4380r(new C0673bf(cVar), str);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: i */
    public void mo4211i(String str, int i) {
        try {
            ((C0708fp) mo3890bQ()).mo4366i(str, i);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    /* renamed from: j */
    public void mo4212j(String str, int i) {
        try {
            ((C0708fp) mo3890bQ()).mo4369j(str, i);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    public void joinRoom(RoomConfig config) {
        try {
            ((C0708fp) mo3890bQ()).mo4267a((C0705fo) new C0657aq(config.getRoomUpdateListener(), config.getRoomStatusUpdateListener(), config.getMessageReceivedListener()), (IBinder) this.f1635tU, config.getInvitationId(), config.isSocketEnabled(), this.f1636tV);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    public void leaveRoom(RoomUpdateListener listener, String roomId) {
        try {
            ((C0708fp) mo3890bQ()).mo4340e((C0705fo) new C0657aq(listener), roomId);
            m1761de();
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    public void onConnected(Bundle connectionHint) {
        if (this.f1634tT) {
            this.f1633tS.mo4386dl();
            this.f1634tT = false;
        }
    }

    public void onConnectionFailed(ConnectionResult result) {
        this.f1634tT = false;
    }

    public void onConnectionSuspended(int cause) {
    }

    public void registerInvitationListener(OnInvitationReceivedListener listener) {
        try {
            ((C0708fp) mo3890bQ()).mo4263a((C0705fo) new C0688l(listener), this.f1636tV);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    public void registerMatchUpdateListener(OnTurnBasedMatchUpdateReceivedListener listener) {
        try {
            ((C0708fp) mo3890bQ()).mo4302b((C0705fo) new C0700x(listener), this.f1636tV);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    public int sendUnreliableRealTimeMessageToAll(byte[] messageData, String roomId) {
        try {
            return ((C0708fp) mo3890bQ()).mo4298b(messageData, roomId, (String[]) null);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
            return -1;
        }
    }

    public void setGravityForPopups(int gravity) {
        this.f1633tS.setGravity(gravity);
    }

    public void setViewForPopups(View gamesContentView) {
        this.f1633tS.mo4389e(gamesContentView);
    }

    public void unregisterInvitationListener() {
        try {
            ((C0708fp) mo3890bQ()).mo4370k(this.f1636tV);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }

    public void unregisterMatchUpdateListener() {
        try {
            ((C0708fp) mo3890bQ()).mo4373l(this.f1636tV);
        } catch (RemoteException e) {
            C0704fn.m1919c("GamesClientImpl", "service died");
        }
    }
}
