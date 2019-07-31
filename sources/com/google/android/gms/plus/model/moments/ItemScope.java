package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.C0900ib;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface ItemScope extends Freezable<ItemScope> {

    public static class Builder {

        /* renamed from: AI */
        private String f2685AI;

        /* renamed from: EA */
        private C0900ib f2686EA;

        /* renamed from: EB */
        private List<C0900ib> f2687EB;

        /* renamed from: EC */
        private String f2688EC;

        /* renamed from: ED */
        private String f2689ED;

        /* renamed from: EE */
        private C0900ib f2690EE;

        /* renamed from: EF */
        private String f2691EF;

        /* renamed from: EG */
        private String f2692EG;

        /* renamed from: EH */
        private String f2693EH;

        /* renamed from: EI */
        private List<C0900ib> f2694EI;

        /* renamed from: EJ */
        private String f2695EJ;

        /* renamed from: EK */
        private String f2696EK;

        /* renamed from: EL */
        private String f2697EL;

        /* renamed from: EM */
        private String f2698EM;

        /* renamed from: EN */
        private String f2699EN;

        /* renamed from: EO */
        private String f2700EO;

        /* renamed from: EP */
        private String f2701EP;

        /* renamed from: EQ */
        private String f2702EQ;

        /* renamed from: ER */
        private C0900ib f2703ER;

        /* renamed from: ES */
        private String f2704ES;

        /* renamed from: ET */
        private String f2705ET;

        /* renamed from: EU */
        private String f2706EU;

        /* renamed from: EV */
        private C0900ib f2707EV;

        /* renamed from: EW */
        private C0900ib f2708EW;

        /* renamed from: EX */
        private C0900ib f2709EX;

        /* renamed from: EY */
        private List<C0900ib> f2710EY;

        /* renamed from: EZ */
        private String f2711EZ;

        /* renamed from: Eq */
        private final Set<Integer> f2712Eq = new HashSet();

        /* renamed from: Er */
        private C0900ib f2713Er;

        /* renamed from: Es */
        private List<String> f2714Es;

        /* renamed from: Et */
        private C0900ib f2715Et;

        /* renamed from: Eu */
        private String f2716Eu;

        /* renamed from: Ev */
        private String f2717Ev;

        /* renamed from: Ew */
        private String f2718Ew;

        /* renamed from: Ex */
        private List<C0900ib> f2719Ex;

        /* renamed from: Ey */
        private int f2720Ey;

        /* renamed from: Ez */
        private List<C0900ib> f2721Ez;

        /* renamed from: Fa */
        private String f2722Fa;

        /* renamed from: Fb */
        private String f2723Fb;

        /* renamed from: Fc */
        private String f2724Fc;

        /* renamed from: Fd */
        private C0900ib f2725Fd;

        /* renamed from: Fe */
        private String f2726Fe;

        /* renamed from: Ff */
        private String f2727Ff;

        /* renamed from: Fg */
        private String f2728Fg;

        /* renamed from: Fh */
        private C0900ib f2729Fh;

        /* renamed from: Fi */
        private String f2730Fi;

        /* renamed from: Fj */
        private String f2731Fj;

        /* renamed from: Fk */
        private String f2732Fk;

        /* renamed from: Fl */
        private String f2733Fl;

        /* renamed from: iH */
        private String f2734iH;
        private String mName;

        /* renamed from: sJ */
        private String f2735sJ;

        /* renamed from: uS */
        private String f2736uS;

        /* renamed from: xw */
        private double f2737xw;

        /* renamed from: xx */
        private double f2738xx;

        public ItemScope build() {
            return new C0900ib(this.f2712Eq, this.f2713Er, this.f2714Es, this.f2715Et, this.f2716Eu, this.f2717Ev, this.f2718Ew, this.f2719Ex, this.f2720Ey, this.f2721Ez, this.f2686EA, this.f2687EB, this.f2688EC, this.f2689ED, this.f2690EE, this.f2691EF, this.f2692EG, this.f2693EH, this.f2694EI, this.f2695EJ, this.f2696EK, this.f2697EL, this.f2735sJ, this.f2698EM, this.f2699EN, this.f2700EO, this.f2701EP, this.f2702EQ, this.f2703ER, this.f2704ES, this.f2705ET, this.f2736uS, this.f2706EU, this.f2707EV, this.f2737xw, this.f2708EW, this.f2738xx, this.mName, this.f2709EX, this.f2710EY, this.f2711EZ, this.f2722Fa, this.f2723Fb, this.f2724Fc, this.f2725Fd, this.f2726Fe, this.f2727Ff, this.f2728Fg, this.f2729Fh, this.f2730Fi, this.f2731Fj, this.f2685AI, this.f2734iH, this.f2732Fk, this.f2733Fl);
        }

        public Builder setAbout(ItemScope about) {
            this.f2713Er = (C0900ib) about;
            this.f2712Eq.add(Integer.valueOf(2));
            return this;
        }

        public Builder setAdditionalName(List<String> additionalName) {
            this.f2714Es = additionalName;
            this.f2712Eq.add(Integer.valueOf(3));
            return this;
        }

        public Builder setAddress(ItemScope address) {
            this.f2715Et = (C0900ib) address;
            this.f2712Eq.add(Integer.valueOf(4));
            return this;
        }

        public Builder setAddressCountry(String addressCountry) {
            this.f2716Eu = addressCountry;
            this.f2712Eq.add(Integer.valueOf(5));
            return this;
        }

        public Builder setAddressLocality(String addressLocality) {
            this.f2717Ev = addressLocality;
            this.f2712Eq.add(Integer.valueOf(6));
            return this;
        }

        public Builder setAddressRegion(String addressRegion) {
            this.f2718Ew = addressRegion;
            this.f2712Eq.add(Integer.valueOf(7));
            return this;
        }

        public Builder setAssociated_media(List<ItemScope> associated_media) {
            this.f2719Ex = associated_media;
            this.f2712Eq.add(Integer.valueOf(8));
            return this;
        }

        public Builder setAttendeeCount(int attendeeCount) {
            this.f2720Ey = attendeeCount;
            this.f2712Eq.add(Integer.valueOf(9));
            return this;
        }

        public Builder setAttendees(List<ItemScope> attendees) {
            this.f2721Ez = attendees;
            this.f2712Eq.add(Integer.valueOf(10));
            return this;
        }

        public Builder setAudio(ItemScope audio) {
            this.f2686EA = (C0900ib) audio;
            this.f2712Eq.add(Integer.valueOf(11));
            return this;
        }

        public Builder setAuthor(List<ItemScope> author) {
            this.f2687EB = author;
            this.f2712Eq.add(Integer.valueOf(12));
            return this;
        }

        public Builder setBestRating(String bestRating) {
            this.f2688EC = bestRating;
            this.f2712Eq.add(Integer.valueOf(13));
            return this;
        }

        public Builder setBirthDate(String birthDate) {
            this.f2689ED = birthDate;
            this.f2712Eq.add(Integer.valueOf(14));
            return this;
        }

        public Builder setByArtist(ItemScope byArtist) {
            this.f2690EE = (C0900ib) byArtist;
            this.f2712Eq.add(Integer.valueOf(15));
            return this;
        }

        public Builder setCaption(String caption) {
            this.f2691EF = caption;
            this.f2712Eq.add(Integer.valueOf(16));
            return this;
        }

        public Builder setContentSize(String contentSize) {
            this.f2692EG = contentSize;
            this.f2712Eq.add(Integer.valueOf(17));
            return this;
        }

        public Builder setContentUrl(String contentUrl) {
            this.f2693EH = contentUrl;
            this.f2712Eq.add(Integer.valueOf(18));
            return this;
        }

        public Builder setContributor(List<ItemScope> contributor) {
            this.f2694EI = contributor;
            this.f2712Eq.add(Integer.valueOf(19));
            return this;
        }

        public Builder setDateCreated(String dateCreated) {
            this.f2695EJ = dateCreated;
            this.f2712Eq.add(Integer.valueOf(20));
            return this;
        }

        public Builder setDateModified(String dateModified) {
            this.f2696EK = dateModified;
            this.f2712Eq.add(Integer.valueOf(21));
            return this;
        }

        public Builder setDatePublished(String datePublished) {
            this.f2697EL = datePublished;
            this.f2712Eq.add(Integer.valueOf(22));
            return this;
        }

        public Builder setDescription(String description) {
            this.f2735sJ = description;
            this.f2712Eq.add(Integer.valueOf(23));
            return this;
        }

        public Builder setDuration(String duration) {
            this.f2698EM = duration;
            this.f2712Eq.add(Integer.valueOf(24));
            return this;
        }

        public Builder setEmbedUrl(String embedUrl) {
            this.f2699EN = embedUrl;
            this.f2712Eq.add(Integer.valueOf(25));
            return this;
        }

        public Builder setEndDate(String endDate) {
            this.f2700EO = endDate;
            this.f2712Eq.add(Integer.valueOf(26));
            return this;
        }

        public Builder setFamilyName(String familyName) {
            this.f2701EP = familyName;
            this.f2712Eq.add(Integer.valueOf(27));
            return this;
        }

        public Builder setGender(String gender) {
            this.f2702EQ = gender;
            this.f2712Eq.add(Integer.valueOf(28));
            return this;
        }

        public Builder setGeo(ItemScope geo) {
            this.f2703ER = (C0900ib) geo;
            this.f2712Eq.add(Integer.valueOf(29));
            return this;
        }

        public Builder setGivenName(String givenName) {
            this.f2704ES = givenName;
            this.f2712Eq.add(Integer.valueOf(30));
            return this;
        }

        public Builder setHeight(String height) {
            this.f2705ET = height;
            this.f2712Eq.add(Integer.valueOf(31));
            return this;
        }

        public Builder setId(String id) {
            this.f2736uS = id;
            this.f2712Eq.add(Integer.valueOf(32));
            return this;
        }

        public Builder setImage(String image) {
            this.f2706EU = image;
            this.f2712Eq.add(Integer.valueOf(33));
            return this;
        }

        public Builder setInAlbum(ItemScope inAlbum) {
            this.f2707EV = (C0900ib) inAlbum;
            this.f2712Eq.add(Integer.valueOf(34));
            return this;
        }

        public Builder setLatitude(double latitude) {
            this.f2737xw = latitude;
            this.f2712Eq.add(Integer.valueOf(36));
            return this;
        }

        public Builder setLocation(ItemScope location) {
            this.f2708EW = (C0900ib) location;
            this.f2712Eq.add(Integer.valueOf(37));
            return this;
        }

        public Builder setLongitude(double longitude) {
            this.f2738xx = longitude;
            this.f2712Eq.add(Integer.valueOf(38));
            return this;
        }

        public Builder setName(String name) {
            this.mName = name;
            this.f2712Eq.add(Integer.valueOf(39));
            return this;
        }

        public Builder setPartOfTVSeries(ItemScope partOfTVSeries) {
            this.f2709EX = (C0900ib) partOfTVSeries;
            this.f2712Eq.add(Integer.valueOf(40));
            return this;
        }

        public Builder setPerformers(List<ItemScope> performers) {
            this.f2710EY = performers;
            this.f2712Eq.add(Integer.valueOf(41));
            return this;
        }

        public Builder setPlayerType(String playerType) {
            this.f2711EZ = playerType;
            this.f2712Eq.add(Integer.valueOf(42));
            return this;
        }

        public Builder setPostOfficeBoxNumber(String postOfficeBoxNumber) {
            this.f2722Fa = postOfficeBoxNumber;
            this.f2712Eq.add(Integer.valueOf(43));
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.f2723Fb = postalCode;
            this.f2712Eq.add(Integer.valueOf(44));
            return this;
        }

        public Builder setRatingValue(String ratingValue) {
            this.f2724Fc = ratingValue;
            this.f2712Eq.add(Integer.valueOf(45));
            return this;
        }

        public Builder setReviewRating(ItemScope reviewRating) {
            this.f2725Fd = (C0900ib) reviewRating;
            this.f2712Eq.add(Integer.valueOf(46));
            return this;
        }

        public Builder setStartDate(String startDate) {
            this.f2726Fe = startDate;
            this.f2712Eq.add(Integer.valueOf(47));
            return this;
        }

        public Builder setStreetAddress(String streetAddress) {
            this.f2727Ff = streetAddress;
            this.f2712Eq.add(Integer.valueOf(48));
            return this;
        }

        public Builder setText(String text) {
            this.f2728Fg = text;
            this.f2712Eq.add(Integer.valueOf(49));
            return this;
        }

        public Builder setThumbnail(ItemScope thumbnail) {
            this.f2729Fh = (C0900ib) thumbnail;
            this.f2712Eq.add(Integer.valueOf(50));
            return this;
        }

        public Builder setThumbnailUrl(String thumbnailUrl) {
            this.f2730Fi = thumbnailUrl;
            this.f2712Eq.add(Integer.valueOf(51));
            return this;
        }

        public Builder setTickerSymbol(String tickerSymbol) {
            this.f2731Fj = tickerSymbol;
            this.f2712Eq.add(Integer.valueOf(52));
            return this;
        }

        public Builder setType(String type) {
            this.f2685AI = type;
            this.f2712Eq.add(Integer.valueOf(53));
            return this;
        }

        public Builder setUrl(String url) {
            this.f2734iH = url;
            this.f2712Eq.add(Integer.valueOf(54));
            return this;
        }

        public Builder setWidth(String width) {
            this.f2732Fk = width;
            this.f2712Eq.add(Integer.valueOf(55));
            return this;
        }

        public Builder setWorstRating(String worstRating) {
            this.f2733Fl = worstRating;
            this.f2712Eq.add(Integer.valueOf(56));
            return this;
        }
    }

    ItemScope getAbout();

    List<String> getAdditionalName();

    ItemScope getAddress();

    String getAddressCountry();

    String getAddressLocality();

    String getAddressRegion();

    List<ItemScope> getAssociated_media();

    int getAttendeeCount();

    List<ItemScope> getAttendees();

    ItemScope getAudio();

    List<ItemScope> getAuthor();

    String getBestRating();

    String getBirthDate();

    ItemScope getByArtist();

    String getCaption();

    String getContentSize();

    String getContentUrl();

    List<ItemScope> getContributor();

    String getDateCreated();

    String getDateModified();

    String getDatePublished();

    String getDescription();

    String getDuration();

    String getEmbedUrl();

    String getEndDate();

    String getFamilyName();

    String getGender();

    ItemScope getGeo();

    String getGivenName();

    String getHeight();

    String getId();

    String getImage();

    ItemScope getInAlbum();

    double getLatitude();

    ItemScope getLocation();

    double getLongitude();

    String getName();

    ItemScope getPartOfTVSeries();

    List<ItemScope> getPerformers();

    String getPlayerType();

    String getPostOfficeBoxNumber();

    String getPostalCode();

    String getRatingValue();

    ItemScope getReviewRating();

    String getStartDate();

    String getStreetAddress();

    String getText();

    ItemScope getThumbnail();

    String getThumbnailUrl();

    String getTickerSymbol();

    String getType();

    String getUrl();

    String getWidth();

    String getWorstRating();

    boolean hasAbout();

    boolean hasAdditionalName();

    boolean hasAddress();

    boolean hasAddressCountry();

    boolean hasAddressLocality();

    boolean hasAddressRegion();

    boolean hasAssociated_media();

    boolean hasAttendeeCount();

    boolean hasAttendees();

    boolean hasAudio();

    boolean hasAuthor();

    boolean hasBestRating();

    boolean hasBirthDate();

    boolean hasByArtist();

    boolean hasCaption();

    boolean hasContentSize();

    boolean hasContentUrl();

    boolean hasContributor();

    boolean hasDateCreated();

    boolean hasDateModified();

    boolean hasDatePublished();

    boolean hasDescription();

    boolean hasDuration();

    boolean hasEmbedUrl();

    boolean hasEndDate();

    boolean hasFamilyName();

    boolean hasGender();

    boolean hasGeo();

    boolean hasGivenName();

    boolean hasHeight();

    boolean hasId();

    boolean hasImage();

    boolean hasInAlbum();

    boolean hasLatitude();

    boolean hasLocation();

    boolean hasLongitude();

    boolean hasName();

    boolean hasPartOfTVSeries();

    boolean hasPerformers();

    boolean hasPlayerType();

    boolean hasPostOfficeBoxNumber();

    boolean hasPostalCode();

    boolean hasRatingValue();

    boolean hasReviewRating();

    boolean hasStartDate();

    boolean hasStreetAddress();

    boolean hasText();

    boolean hasThumbnail();

    boolean hasThumbnailUrl();

    boolean hasTickerSymbol();

    boolean hasType();

    boolean hasUrl();

    boolean hasWidth();

    boolean hasWorstRating();
}
