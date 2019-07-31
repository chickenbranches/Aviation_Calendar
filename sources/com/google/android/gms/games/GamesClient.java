package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.C0153a.C0157c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.GamesMetadata.LoadGamesResult;
import com.google.android.gms.games.Players.LoadPlayersResult;
import com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult;
import com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult;
import com.google.android.gms.games.achievement.OnAchievementUpdatedListener;
import com.google.android.gms.games.achievement.OnAchievementsLoadedListener;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult;
import com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult;
import com.google.android.gms.games.leaderboard.OnLeaderboardMetadataLoadedListener;
import com.google.android.gms.games.leaderboard.OnLeaderboardScoresLoadedListener;
import com.google.android.gms.games.leaderboard.OnPlayerLeaderboardScoreLoadedListener;
import com.google.android.gms.games.leaderboard.OnScoreSubmittedListener;
import com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.google.android.gms.games.multiplayer.OnInvitationsLoadedListener;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback;
import com.google.android.gms.games.multiplayer.realtime.RealTimeReliableMessageSentListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchCanceledListener;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchInitiatedListener;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchLeftListener;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchLoadedListener;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdatedListener;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchesLoadedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult;
import com.google.android.gms.internal.C0600eg;
import com.google.android.gms.internal.C0639fl;
import java.util.List;

@Deprecated
public final class GamesClient implements GooglePlayServicesClient {
    public static final String EXTRA_EXCLUSIVE_BIT_MASK = "exclusive_bit_mask";
    public static final String EXTRA_INVITATION = "invitation";
    public static final String EXTRA_MAX_AUTOMATCH_PLAYERS = "max_automatch_players";
    public static final String EXTRA_MIN_AUTOMATCH_PLAYERS = "min_automatch_players";
    public static final String EXTRA_PLAYERS = "players";
    public static final String EXTRA_PLAYER_SEARCH_RESULTS = "player_search_results";
    public static final String EXTRA_ROOM = "room";
    public static final String EXTRA_TURN_BASED_MATCH = "turn_based_match";
    public static final int MAX_RELIABLE_MESSAGE_LEN = 1400;
    public static final int MAX_UNRELIABLE_MESSAGE_LEN = 1168;
    public static final int NOTIFICATION_TYPES_ALL = -1;
    public static final int NOTIFICATION_TYPES_MULTIPLAYER = 3;
    public static final int NOTIFICATION_TYPE_INVITATION = 1;
    public static final int NOTIFICATION_TYPE_MATCH_UPDATE = 2;
    public static final int STATUS_ACHIEVEMENT_NOT_INCREMENTAL = 3002;
    public static final int STATUS_ACHIEVEMENT_UNKNOWN = 3001;
    public static final int STATUS_ACHIEVEMENT_UNLOCKED = 3003;
    public static final int STATUS_ACHIEVEMENT_UNLOCK_FAILURE = 3000;
    public static final int STATUS_APP_MISCONFIGURED = 8;
    public static final int STATUS_CLIENT_RECONNECT_REQUIRED = 2;
    public static final int STATUS_GAME_NOT_FOUND = 9;
    public static final int STATUS_INTERNAL_ERROR = 1;
    public static final int STATUS_INVALID_REAL_TIME_ROOM_ID = 7002;
    public static final int STATUS_LICENSE_CHECK_FAILED = 7;
    public static final int STATUS_MATCH_ERROR_ALREADY_REMATCHED = 6505;
    public static final int STATUS_MATCH_ERROR_INACTIVE_MATCH = 6501;
    public static final int STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS = 6504;
    public static final int STATUS_MATCH_ERROR_INVALID_MATCH_STATE = 6502;
    public static final int STATUS_MATCH_ERROR_INVALID_PARTICIPANT_STATE = 6500;
    public static final int STATUS_MATCH_ERROR_LOCALLY_MODIFIED = 6507;
    public static final int STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION = 6503;
    public static final int STATUS_MATCH_NOT_FOUND = 6506;
    public static final int STATUS_MULTIPLAYER_DISABLED = 6003;
    public static final int STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED = 6000;
    public static final int STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE = 6002;
    public static final int STATUS_MULTIPLAYER_ERROR_INVALID_OPERATION = 6004;
    public static final int STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER = 6001;
    public static final int STATUS_NETWORK_ERROR_NO_DATA = 4;
    public static final int STATUS_NETWORK_ERROR_OPERATION_DEFERRED = 5;
    public static final int STATUS_NETWORK_ERROR_OPERATION_FAILED = 6;
    public static final int STATUS_NETWORK_ERROR_STALE_DATA = 3;
    public static final int STATUS_OK = 0;
    public static final int STATUS_OPERATION_IN_FLIGHT = 7007;
    public static final int STATUS_PARTICIPANT_NOT_CONNECTED = 7003;
    public static final int STATUS_REAL_TIME_CONNECTION_FAILED = 7000;
    public static final int STATUS_REAL_TIME_INACTIVE_ROOM = 7005;
    public static final int STATUS_REAL_TIME_MESSAGE_FAILED = -1;
    public static final int STATUS_REAL_TIME_MESSAGE_SEND_FAILED = 7001;
    public static final int STATUS_REAL_TIME_ROOM_NOT_JOINED = 7004;

    /* renamed from: te */
    private final C0639fl f597te;

    @Deprecated
    public static final class Builder {

        /* renamed from: jD */
        private final ConnectionCallbacks f670jD;

        /* renamed from: jE */
        private final OnConnectionFailedListener f671jE;

        /* renamed from: jF */
        private String[] f672jF = {Scopes.GAMES};

        /* renamed from: jG */
        private String f673jG = "<<default account>>";
        private final Context mContext;

        /* renamed from: tA */
        private boolean f674tA = true;

        /* renamed from: tB */
        private int f675tB = 17;

        /* renamed from: tx */
        private String f676tx;

        /* renamed from: ty */
        private int f677ty = 49;

        /* renamed from: tz */
        private View f678tz;

        public Builder(Context context, ConnectionCallbacks connectedListener, OnConnectionFailedListener connectionFailedListener) {
            this.mContext = context;
            this.f676tx = context.getPackageName();
            this.f670jD = connectedListener;
            this.f671jE = connectionFailedListener;
        }

        public GamesClient create() {
            return new GamesClient(this.mContext, this.f676tx, this.f673jG, this.f670jD, this.f671jE, this.f672jF, this.f677ty, this.f678tz, this.f674tA, this.f675tB);
        }

        public Builder setAccountName(String accountName) {
            this.f673jG = (String) C0600eg.m1554f(accountName);
            return this;
        }

        public Builder setGravityForPopups(int gravity) {
            this.f677ty = gravity;
            return this;
        }

        public Builder setScopes(String... scopes) {
            this.f672jF = scopes;
            return this;
        }

        public Builder setShowConnectingPopup(boolean showConnectingPopup) {
            this.f674tA = showConnectingPopup;
            this.f675tB = 17;
            return this;
        }

        public Builder setShowConnectingPopup(boolean showConnectingPopup, int gravity) {
            this.f674tA = showConnectingPopup;
            this.f675tB = gravity;
            return this;
        }

        public Builder setViewForPopups(View gamesContentView) {
            this.f678tz = (View) C0600eg.m1554f(gamesContentView);
            return this;
        }
    }

    private GamesClient(Context context, String gamePackageName, String accountName, ConnectionCallbacks connectedListener, OnConnectionFailedListener connectionFailedListener, String[] scopes, int gravity, View gamesContentView, boolean showConnectingPopup, int connectingPopupGravity) {
        this.f597te = new C0639fl(context, gamePackageName, accountName, connectedListener, connectionFailedListener, scopes, gravity, gamesContentView, false, showConnectingPopup, connectingPopupGravity);
    }

    @Deprecated
    public void acceptTurnBasedInvitation(final OnTurnBasedMatchInitiatedListener listener, String invitationId) {
        this.f597te.mo4188e(new C0157c<InitiateMatchResult>() {
            /* renamed from: a */
            public void mo2048a(InitiateMatchResult initiateMatchResult) {
                listener.onTurnBasedMatchInitiated(initiateMatchResult.getStatus().getStatusCode(), initiateMatchResult.getMatch());
            }
        }, invitationId);
    }

    @Deprecated
    public void cancelTurnBasedMatch(final OnTurnBasedMatchCanceledListener listener, String matchId) {
        this.f597te.mo4191g(new C0157c<CancelMatchResult>() {
            /* renamed from: a */
            public void mo2048a(CancelMatchResult cancelMatchResult) {
                listener.onTurnBasedMatchCanceled(cancelMatchResult.getStatus().getStatusCode(), cancelMatchResult.getMatchId());
            }
        }, matchId);
    }

    @Deprecated
    public void cancelTurnBasedMatch(String matchId) {
        this.f597te.mo4191g(new C0157c<CancelMatchResult>() {
            /* renamed from: a */
            public void mo2048a(CancelMatchResult cancelMatchResult) {
            }
        }, matchId);
    }

    @Deprecated
    public void clearAllNotifications() {
        this.f597te.clearNotifications(-1);
    }

    @Deprecated
    public void clearNotifications(int notificationTypes) {
        this.f597te.clearNotifications(notificationTypes);
    }

    @Deprecated
    public void connect() {
        this.f597te.connect();
    }

    @Deprecated
    public void createRoom(RoomConfig config) {
        this.f597te.createRoom(config);
    }

    @Deprecated
    public void createTurnBasedMatch(final OnTurnBasedMatchInitiatedListener listener, TurnBasedMatchConfig config) {
        this.f597te.mo4163a((C0157c<InitiateMatchResult>) new C0157c<InitiateMatchResult>() {
            /* renamed from: a */
            public void mo2048a(InitiateMatchResult initiateMatchResult) {
                listener.onTurnBasedMatchInitiated(initiateMatchResult.getStatus().getStatusCode(), initiateMatchResult.getMatch());
            }
        }, config);
    }

    @Deprecated
    public void declineRoomInvitation(String invitationId) {
        this.f597te.mo4212j(invitationId, 0);
    }

    @Deprecated
    public void declineTurnBasedInvitation(String invitationId) {
        this.f597te.mo4212j(invitationId, 1);
    }

    @Deprecated
    public void disconnect() {
        this.f597te.disconnect();
    }

    @Deprecated
    public void dismissRoomInvitation(String invitationId) {
        this.f597te.mo4211i(invitationId, 0);
    }

    @Deprecated
    public void dismissTurnBasedInvitation(String invitationId) {
        this.f597te.mo4211i(invitationId, 1);
    }

    @Deprecated
    public void dismissTurnBasedMatch(String matchId) {
        this.f597te.dismissTurnBasedMatch(matchId);
    }

    @Deprecated
    public void finishTurnBasedMatch(final OnTurnBasedMatchUpdatedListener listener, String matchId) {
        this.f597te.mo4173a((C0157c<UpdateMatchResult>) new C0157c<UpdateMatchResult>() {
            /* renamed from: a */
            public void mo2048a(UpdateMatchResult updateMatchResult) {
                listener.onTurnBasedMatchUpdated(updateMatchResult.getStatus().getStatusCode(), updateMatchResult.getMatch());
            }
        }, matchId, (byte[]) null, (ParticipantResult[]) null);
    }

    @Deprecated
    public void finishTurnBasedMatch(OnTurnBasedMatchUpdatedListener listener, String matchId, byte[] matchData, List<ParticipantResult> results) {
        finishTurnBasedMatch(listener, matchId, matchData, results == null ? null : (ParticipantResult[]) results.toArray(new ParticipantResult[results.size()]));
    }

    @Deprecated
    public void finishTurnBasedMatch(final OnTurnBasedMatchUpdatedListener listener, String matchId, byte[] matchData, ParticipantResult... results) {
        this.f597te.mo4173a((C0157c<UpdateMatchResult>) new C0157c<UpdateMatchResult>() {
            /* renamed from: a */
            public void mo2048a(UpdateMatchResult updateMatchResult) {
                listener.onTurnBasedMatchUpdated(updateMatchResult.getStatus().getStatusCode(), updateMatchResult.getMatch());
            }
        }, matchId, matchData, results);
    }

    @Deprecated
    public Intent getAchievementsIntent() {
        return this.f597te.getAchievementsIntent();
    }

    @Deprecated
    public Intent getAllLeaderboardsIntent() {
        return this.f597te.getAllLeaderboardsIntent();
    }

    @Deprecated
    public String getAppId() {
        return this.f597te.getAppId();
    }

    @Deprecated
    public String getCurrentAccountName() {
        return this.f597te.getCurrentAccountName();
    }

    @Deprecated
    public Game getCurrentGame() {
        return this.f597te.getCurrentGame();
    }

    @Deprecated
    public Player getCurrentPlayer() {
        return this.f597te.getCurrentPlayer();
    }

    @Deprecated
    public String getCurrentPlayerId() {
        return this.f597te.getCurrentPlayerId();
    }

    @Deprecated
    public Intent getInvitationInboxIntent() {
        return this.f597te.getInvitationInboxIntent();
    }

    @Deprecated
    public Intent getLeaderboardIntent(String leaderboardId) {
        return this.f597te.getLeaderboardIntent(leaderboardId);
    }

    @Deprecated
    public Intent getMatchInboxIntent() {
        return this.f597te.getMatchInboxIntent();
    }

    @Deprecated
    public int getMaxTurnBasedMatchDataSize() {
        return this.f597te.getMaxTurnBasedMatchDataSize();
    }

    @Deprecated
    public Intent getPlayerSearchIntent() {
        return this.f597te.getPlayerSearchIntent();
    }

    @Deprecated
    public Intent getRealTimeSelectOpponentsIntent(int minPlayers, int maxPlayers) {
        return this.f597te.getRealTimeSelectOpponentsIntent(minPlayers, maxPlayers, true);
    }

    @Deprecated
    public Intent getRealTimeSelectOpponentsIntent(int minPlayers, int maxPlayers, boolean allowAutomatch) {
        return this.f597te.getRealTimeSelectOpponentsIntent(minPlayers, maxPlayers, allowAutomatch);
    }

    @Deprecated
    public RealTimeSocket getRealTimeSocketForParticipant(String roomId, String participantId) {
        return this.f597te.getRealTimeSocketForParticipant(roomId, participantId);
    }

    @Deprecated
    public Intent getRealTimeWaitingRoomIntent(Room room, int minParticipantsToStart) {
        return this.f597te.getRealTimeWaitingRoomIntent(room, minParticipantsToStart);
    }

    @Deprecated
    public Intent getSettingsIntent() {
        return this.f597te.getSettingsIntent();
    }

    @Deprecated
    public void getTurnBasedMatch(final OnTurnBasedMatchLoadedListener listener, String matchId) {
        this.f597te.mo4210h(new C0157c<LoadMatchResult>() {
            /* renamed from: a */
            public void mo2048a(LoadMatchResult loadMatchResult) {
                listener.onTurnBasedMatchLoaded(loadMatchResult.getStatus().getStatusCode(), loadMatchResult.getMatch());
            }
        }, matchId);
    }

    @Deprecated
    public Intent getTurnBasedSelectOpponentsIntent(int minPlayers, int maxPlayers) {
        return this.f597te.getTurnBasedSelectOpponentsIntent(minPlayers, maxPlayers, true);
    }

    @Deprecated
    public Intent getTurnBasedSelectOpponentsIntent(int minPlayers, int maxPlayers, boolean allowAutomatch) {
        return this.f597te.getTurnBasedSelectOpponentsIntent(minPlayers, maxPlayers, allowAutomatch);
    }

    @Deprecated
    public void incrementAchievement(String id, int numSteps) {
        this.f597te.mo4165a(null, id, numSteps);
    }

    @Deprecated
    public void incrementAchievementImmediate(final OnAchievementUpdatedListener listener, String id, int numSteps) {
        this.f597te.mo4165a((C0157c<UpdateAchievementResult>) new C0157c<UpdateAchievementResult>() {
            /* renamed from: a */
            public void mo2048a(UpdateAchievementResult updateAchievementResult) {
                listener.onAchievementUpdated(updateAchievementResult.getStatus().getStatusCode(), updateAchievementResult.getAchievementId());
            }
        }, id, numSteps);
    }

    @Deprecated
    public boolean isConnected() {
        return this.f597te.isConnected();
    }

    @Deprecated
    public boolean isConnecting() {
        return this.f597te.isConnecting();
    }

    @Deprecated
    public boolean isConnectionCallbacksRegistered(ConnectionCallbacks listener) {
        return this.f597te.isConnectionCallbacksRegistered(listener);
    }

    @Deprecated
    public boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener listener) {
        return this.f597te.isConnectionFailedListenerRegistered(listener);
    }

    @Deprecated
    public void joinRoom(RoomConfig config) {
        this.f597te.joinRoom(config);
    }

    @Deprecated
    public void leaveRoom(RoomUpdateListener listener, String roomId) {
        this.f597te.leaveRoom(listener, roomId);
    }

    @Deprecated
    public void leaveTurnBasedMatch(final OnTurnBasedMatchLeftListener listener, String matchId) {
        this.f597te.mo4189f(new C0157c<LeaveMatchResult>() {
            /* renamed from: a */
            public void mo2048a(LeaveMatchResult leaveMatchResult) {
                listener.onTurnBasedMatchLeft(leaveMatchResult.getStatus().getStatusCode(), leaveMatchResult.getMatch());
            }
        }, matchId);
    }

    @Deprecated
    public void leaveTurnBasedMatchDuringTurn(final OnTurnBasedMatchLeftListener listener, String matchId, String pendingParticipantId) {
        this.f597te.mo4169a((C0157c<LeaveMatchResult>) new C0157c<LeaveMatchResult>() {
            /* renamed from: a */
            public void mo2048a(LeaveMatchResult leaveMatchResult) {
                listener.onTurnBasedMatchLeft(leaveMatchResult.getStatus().getStatusCode(), leaveMatchResult.getMatch());
            }
        }, matchId, pendingParticipantId);
    }

    @Deprecated
    public void loadAchievements(final OnAchievementsLoadedListener listener, boolean forceReload) {
        this.f597te.mo4180b((C0157c<LoadAchievementsResult>) new C0157c<LoadAchievementsResult>() {
            /* renamed from: a */
            public void mo2048a(LoadAchievementsResult loadAchievementsResult) {
                listener.onAchievementsLoaded(loadAchievementsResult.getStatus().getStatusCode(), loadAchievementsResult.getAchievements());
            }
        }, forceReload);
    }

    @Deprecated
    public void loadCurrentPlayerLeaderboardScore(final OnPlayerLeaderboardScoreLoadedListener listener, String leaderboardId, int span, int leaderboardCollection) {
        this.f597te.mo4170a((C0157c<LoadPlayerScoreResult>) new C0157c<LoadPlayerScoreResult>() {
            /* renamed from: a */
            public void mo2048a(LoadPlayerScoreResult loadPlayerScoreResult) {
                listener.onPlayerLeaderboardScoreLoaded(loadPlayerScoreResult.getStatus().getStatusCode(), loadPlayerScoreResult.getScore());
            }
        }, (String) null, leaderboardId, span, leaderboardCollection);
    }

    @Deprecated
    public void loadGame(final OnGamesLoadedListener listener) {
        this.f597te.mo4190g(new C0157c<LoadGamesResult>() {
            /* renamed from: a */
            public void mo2048a(LoadGamesResult loadGamesResult) {
                listener.onGamesLoaded(loadGamesResult.getStatus().getStatusCode(), loadGamesResult.getGames());
            }
        });
    }

    @Deprecated
    public void loadInvitablePlayers(final OnPlayersLoadedListener listener, int pageSize, boolean forceReload) {
        this.f597te.mo4161a((C0157c<LoadPlayersResult>) new C0157c<LoadPlayersResult>() {
            /* renamed from: a */
            public void mo2048a(LoadPlayersResult loadPlayersResult) {
                listener.onPlayersLoaded(loadPlayersResult.getStatus().getStatusCode(), loadPlayersResult.getPlayers());
            }
        }, pageSize, false, forceReload);
    }

    @Deprecated
    public void loadInvitations(final OnInvitationsLoadedListener listener) {
        this.f597te.mo4209h(new C0157c<LoadInvitationsResult>() {
            /* renamed from: a */
            public void mo2048a(LoadInvitationsResult loadInvitationsResult) {
                listener.onInvitationsLoaded(loadInvitationsResult.getStatus().getStatusCode(), loadInvitationsResult.getInvitations());
            }
        });
    }

    @Deprecated
    public void loadLeaderboardMetadata(final OnLeaderboardMetadataLoadedListener listener, String leaderboardId, boolean forceReload) {
        this.f597te.mo4171a((C0157c<LeaderboardMetadataResult>) new C0157c<LeaderboardMetadataResult>() {
            /* renamed from: a */
            public void mo2048a(LeaderboardMetadataResult leaderboardMetadataResult) {
                listener.onLeaderboardMetadataLoaded(leaderboardMetadataResult.getStatus().getStatusCode(), leaderboardMetadataResult.getLeaderboards());
            }
        }, leaderboardId, forceReload);
    }

    @Deprecated
    public void loadLeaderboardMetadata(final OnLeaderboardMetadataLoadedListener listener, boolean forceReload) {
        this.f597te.mo4174a((C0157c<LeaderboardMetadataResult>) new C0157c<LeaderboardMetadataResult>() {
            /* renamed from: a */
            public void mo2048a(LeaderboardMetadataResult leaderboardMetadataResult) {
                listener.onLeaderboardMetadataLoaded(leaderboardMetadataResult.getStatus().getStatusCode(), leaderboardMetadataResult.getLeaderboards());
            }
        }, forceReload);
    }

    @Deprecated
    public void loadMoreInvitablePlayers(final OnPlayersLoadedListener listener, int pageSize) {
        this.f597te.mo4161a((C0157c<LoadPlayersResult>) new C0157c<LoadPlayersResult>() {
            /* renamed from: a */
            public void mo2048a(LoadPlayersResult loadPlayersResult) {
                listener.onPlayersLoaded(loadPlayersResult.getStatus().getStatusCode(), loadPlayersResult.getPlayers());
            }
        }, pageSize, true, false);
    }

    @Deprecated
    public void loadMoreScores(final OnLeaderboardScoresLoadedListener listener, LeaderboardScoreBuffer buffer, int maxResults, int pageDirection) {
        this.f597te.mo4162a((C0157c<LoadScoresResult>) new C0157c<LoadScoresResult>() {
            /* renamed from: a */
            public void mo2048a(LoadScoresResult loadScoresResult) {
                listener.onLeaderboardScoresLoaded(loadScoresResult.getStatus().getStatusCode(), loadScoresResult.getLeaderboard(), loadScoresResult.getScores());
            }
        }, buffer, maxResults, pageDirection);
    }

    @Deprecated
    public void loadPlayer(final OnPlayersLoadedListener listener, String playerId) {
        this.f597te.mo4164a((C0157c<LoadPlayersResult>) new C0157c<LoadPlayersResult>() {
            /* renamed from: a */
            public void mo2048a(LoadPlayersResult loadPlayersResult) {
                listener.onPlayersLoaded(loadPlayersResult.getStatus().getStatusCode(), loadPlayersResult.getPlayers());
            }
        }, playerId);
    }

    @Deprecated
    public void loadPlayerCenteredScores(final OnLeaderboardScoresLoadedListener listener, String leaderboardId, int span, int leaderboardCollection, int maxResults) {
        this.f597te.mo4179b(new C0157c<LoadScoresResult>() {
            /* renamed from: a */
            public void mo2048a(LoadScoresResult loadScoresResult) {
                listener.onLeaderboardScoresLoaded(loadScoresResult.getStatus().getStatusCode(), loadScoresResult.getLeaderboard(), loadScoresResult.getScores());
            }
        }, leaderboardId, span, leaderboardCollection, maxResults, false);
    }

    @Deprecated
    public void loadPlayerCenteredScores(final OnLeaderboardScoresLoadedListener listener, String leaderboardId, int span, int leaderboardCollection, int maxResults, boolean forceReload) {
        this.f597te.mo4179b(new C0157c<LoadScoresResult>() {
            /* renamed from: a */
            public void mo2048a(LoadScoresResult loadScoresResult) {
                listener.onLeaderboardScoresLoaded(loadScoresResult.getStatus().getStatusCode(), loadScoresResult.getLeaderboard(), loadScoresResult.getScores());
            }
        }, leaderboardId, span, leaderboardCollection, maxResults, forceReload);
    }

    @Deprecated
    public void loadTopScores(final OnLeaderboardScoresLoadedListener listener, String leaderboardId, int span, int leaderboardCollection, int maxResults) {
        this.f597te.mo4166a(new C0157c<LoadScoresResult>() {
            /* renamed from: a */
            public void mo2048a(LoadScoresResult loadScoresResult) {
                listener.onLeaderboardScoresLoaded(loadScoresResult.getStatus().getStatusCode(), loadScoresResult.getLeaderboard(), loadScoresResult.getScores());
            }
        }, leaderboardId, span, leaderboardCollection, maxResults, false);
    }

    @Deprecated
    public void loadTopScores(final OnLeaderboardScoresLoadedListener listener, String leaderboardId, int span, int leaderboardCollection, int maxResults, boolean forceReload) {
        this.f597te.mo4166a(new C0157c<LoadScoresResult>() {
            /* renamed from: a */
            public void mo2048a(LoadScoresResult loadScoresResult) {
                listener.onLeaderboardScoresLoaded(loadScoresResult.getStatus().getStatusCode(), loadScoresResult.getLeaderboard(), loadScoresResult.getScores());
            }
        }, leaderboardId, span, leaderboardCollection, maxResults, forceReload);
    }

    @Deprecated
    public void loadTurnBasedMatches(final OnTurnBasedMatchesLoadedListener listener, int... matchTurnStatuses) {
        this.f597te.mo4175a((C0157c<LoadMatchesResult>) new C0157c<LoadMatchesResult>() {
            /* renamed from: a */
            public void mo2048a(LoadMatchesResult loadMatchesResult) {
                listener.onTurnBasedMatchesLoaded(loadMatchesResult.getStatus().getStatusCode(), loadMatchesResult.getMatches());
            }
        }, matchTurnStatuses);
    }

    @Deprecated
    public void reconnect() {
        this.f597te.disconnect();
        this.f597te.connect();
    }

    @Deprecated
    public void registerConnectionCallbacks(ConnectionCallbacks listener) {
        this.f597te.registerConnectionCallbacks(listener);
    }

    @Deprecated
    public void registerConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f597te.registerConnectionFailedListener(listener);
    }

    @Deprecated
    public void registerInvitationListener(OnInvitationReceivedListener listener) {
        this.f597te.registerInvitationListener(listener);
    }

    @Deprecated
    public void registerMatchUpdateListener(OnTurnBasedMatchUpdateReceivedListener listener) {
        this.f597te.registerMatchUpdateListener(listener);
    }

    @Deprecated
    public void rematchTurnBasedMatch(final OnTurnBasedMatchInitiatedListener listener, String matchId) {
        this.f597te.mo4184d(new C0157c<InitiateMatchResult>() {
            /* renamed from: a */
            public void mo2048a(InitiateMatchResult initiateMatchResult) {
                listener.onTurnBasedMatchInitiated(initiateMatchResult.getStatus().getStatusCode(), initiateMatchResult.getMatch());
            }
        }, matchId);
    }

    @Deprecated
    public void revealAchievement(String id) {
        this.f597te.mo4177b(null, id);
    }

    @Deprecated
    public void revealAchievementImmediate(final OnAchievementUpdatedListener listener, String id) {
        this.f597te.mo4177b((C0157c<UpdateAchievementResult>) new C0157c<UpdateAchievementResult>() {
            /* renamed from: a */
            public void mo2048a(UpdateAchievementResult updateAchievementResult) {
                listener.onAchievementUpdated(updateAchievementResult.getStatus().getStatusCode(), updateAchievementResult.getAchievementId());
            }
        }, id);
    }

    @Deprecated
    public int sendReliableRealTimeMessage(final RealTimeReliableMessageSentListener listener, byte[] messageData, String roomId, String recipientParticipantId) {
        return this.f597te.mo4158a((ReliableMessageSentCallback) new ReliableMessageSentCallback() {
            public void onRealTimeMessageSent(int statusCode, int tokenId, String recipientParticipantId) {
                listener.onRealTimeMessageSent(statusCode, tokenId, recipientParticipantId);
            }
        }, messageData, roomId, recipientParticipantId);
    }

    @Deprecated
    public int sendUnreliableRealTimeMessage(byte[] messageData, String roomId, String recipientParticipantId) {
        return this.f597te.mo4159a(messageData, roomId, new String[]{recipientParticipantId});
    }

    @Deprecated
    public int sendUnreliableRealTimeMessage(byte[] messageData, String roomId, List<String> recipientParticipantIds) {
        return this.f597te.mo4159a(messageData, roomId, (String[]) recipientParticipantIds.toArray(new String[recipientParticipantIds.size()]));
    }

    @Deprecated
    public int sendUnreliableRealTimeMessageToAll(byte[] messageData, String roomId) {
        return this.f597te.sendUnreliableRealTimeMessageToAll(messageData, roomId);
    }

    @Deprecated
    public void setAchievementSteps(String id, int numSteps) {
        this.f597te.mo4178b(null, id, numSteps);
    }

    @Deprecated
    public void setAchievementStepsImmediate(final OnAchievementUpdatedListener listener, String id, int numSteps) {
        this.f597te.mo4178b(new C0157c<UpdateAchievementResult>() {
            /* renamed from: a */
            public void mo2048a(UpdateAchievementResult updateAchievementResult) {
                listener.onAchievementUpdated(updateAchievementResult.getStatus().getStatusCode(), updateAchievementResult.getAchievementId());
            }
        }, id, numSteps);
    }

    @Deprecated
    public void setGravityForPopups(int gravity) {
        this.f597te.setGravityForPopups(gravity);
    }

    @Deprecated
    public void setViewForPopups(View gamesContentView) {
        C0600eg.m1554f(gamesContentView);
        this.f597te.setViewForPopups(gamesContentView);
    }

    @Deprecated
    public void signOut() {
        this.f597te.mo4176b(new C0157c<Status>() {
            /* renamed from: a */
            public void mo2048a(Status status) {
            }
        });
    }

    @Deprecated
    public void signOut(final OnSignOutCompleteListener listener) {
        this.f597te.mo4176b(new C0157c<Status>() {
            /* renamed from: a */
            public void mo2048a(Status status) {
                listener.onSignOutComplete();
            }
        });
    }

    @Deprecated
    public void submitScore(String leaderboardId, long score) {
        this.f597te.mo4168a(null, leaderboardId, score, (String) null);
    }

    @Deprecated
    public void submitScore(String leaderboardId, long score, String scoreTag) {
        this.f597te.mo4168a(null, leaderboardId, score, scoreTag);
    }

    @Deprecated
    public void submitScoreImmediate(final OnScoreSubmittedListener listener, String leaderboardId, long score) {
        this.f597te.mo4168a((C0157c<SubmitScoreResult>) new C0157c<SubmitScoreResult>() {
            /* renamed from: a */
            public void mo2048a(SubmitScoreResult submitScoreResult) {
                listener.onScoreSubmitted(submitScoreResult.getStatus().getStatusCode(), new com.google.android.gms.games.leaderboard.SubmitScoreResult(submitScoreResult.getScoreData().mo3140dx()));
            }
        }, leaderboardId, score, (String) null);
    }

    @Deprecated
    public void submitScoreImmediate(final OnScoreSubmittedListener listener, String leaderboardId, long score, String scoreTag) {
        this.f597te.mo4168a((C0157c<SubmitScoreResult>) new C0157c<SubmitScoreResult>() {
            /* renamed from: a */
            public void mo2048a(SubmitScoreResult submitScoreResult) {
                listener.onScoreSubmitted(submitScoreResult.getStatus().getStatusCode(), new com.google.android.gms.games.leaderboard.SubmitScoreResult(submitScoreResult.getScoreData().mo3140dx()));
            }
        }, leaderboardId, score, scoreTag);
    }

    @Deprecated
    public void takeTurn(final OnTurnBasedMatchUpdatedListener listener, String matchId, byte[] matchData, String pendingParticipantId) {
        this.f597te.mo4172a((C0157c<UpdateMatchResult>) new C0157c<UpdateMatchResult>() {
            /* renamed from: a */
            public void mo2048a(UpdateMatchResult updateMatchResult) {
                listener.onTurnBasedMatchUpdated(updateMatchResult.getStatus().getStatusCode(), updateMatchResult.getMatch());
            }
        }, matchId, matchData, pendingParticipantId, (ParticipantResult[]) null);
    }

    @Deprecated
    public void takeTurn(final OnTurnBasedMatchUpdatedListener listener, String matchId, byte[] matchData, String pendingParticipantId, List<ParticipantResult> results) {
        this.f597te.mo4172a((C0157c<UpdateMatchResult>) new C0157c<UpdateMatchResult>() {
            /* renamed from: a */
            public void mo2048a(UpdateMatchResult updateMatchResult) {
                listener.onTurnBasedMatchUpdated(updateMatchResult.getStatus().getStatusCode(), updateMatchResult.getMatch());
            }
        }, matchId, matchData, pendingParticipantId, results == null ? null : (ParticipantResult[]) results.toArray(new ParticipantResult[results.size()]));
    }

    @Deprecated
    public void takeTurn(final OnTurnBasedMatchUpdatedListener listener, String matchId, byte[] matchData, String pendingParticipantId, ParticipantResult... results) {
        this.f597te.mo4172a((C0157c<UpdateMatchResult>) new C0157c<UpdateMatchResult>() {
            /* renamed from: a */
            public void mo2048a(UpdateMatchResult updateMatchResult) {
                listener.onTurnBasedMatchUpdated(updateMatchResult.getStatus().getStatusCode(), updateMatchResult.getMatch());
            }
        }, matchId, matchData, pendingParticipantId, results);
    }

    @Deprecated
    public void unlockAchievement(String id) {
        this.f597te.mo4181c(null, id);
    }

    @Deprecated
    public void unlockAchievementImmediate(final OnAchievementUpdatedListener listener, String id) {
        this.f597te.mo4181c(new C0157c<UpdateAchievementResult>() {
            /* renamed from: a */
            public void mo2048a(UpdateAchievementResult updateAchievementResult) {
                listener.onAchievementUpdated(updateAchievementResult.getStatus().getStatusCode(), updateAchievementResult.getAchievementId());
            }
        }, id);
    }

    @Deprecated
    public void unregisterConnectionCallbacks(ConnectionCallbacks listener) {
        this.f597te.unregisterConnectionCallbacks(listener);
    }

    @Deprecated
    public void unregisterConnectionFailedListener(OnConnectionFailedListener listener) {
        this.f597te.unregisterConnectionFailedListener(listener);
    }

    @Deprecated
    public void unregisterInvitationListener() {
        this.f597te.unregisterInvitationListener();
    }

    @Deprecated
    public void unregisterMatchUpdateListener() {
        this.f597te.unregisterMatchUpdateListener();
    }
}
