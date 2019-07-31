package com.google.android.gms.internal;

import android.os.Parcel;
import android.support.p000v4.util.TimeUtils;
import com.google.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0613es.C0614a;
import com.google.android.gms.plus.PlusShare;
import com.google.android.gms.plus.model.moments.ItemScope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ib */
public final class C0900ib extends C0613es implements SafeParcelable, ItemScope {
    public static final C0901ic CREATOR = new C0901ic();

    /* renamed from: Ep */
    private static final HashMap<String, C0614a<?, ?>> f2203Ep = new HashMap<>();

    /* renamed from: AI */
    private String f2204AI;

    /* renamed from: EA */
    private C0900ib f2205EA;

    /* renamed from: EB */
    private List<C0900ib> f2206EB;

    /* renamed from: EC */
    private String f2207EC;

    /* renamed from: ED */
    private String f2208ED;

    /* renamed from: EE */
    private C0900ib f2209EE;

    /* renamed from: EF */
    private String f2210EF;

    /* renamed from: EG */
    private String f2211EG;

    /* renamed from: EH */
    private String f2212EH;

    /* renamed from: EI */
    private List<C0900ib> f2213EI;

    /* renamed from: EJ */
    private String f2214EJ;

    /* renamed from: EK */
    private String f2215EK;

    /* renamed from: EL */
    private String f2216EL;

    /* renamed from: EM */
    private String f2217EM;

    /* renamed from: EN */
    private String f2218EN;

    /* renamed from: EO */
    private String f2219EO;

    /* renamed from: EP */
    private String f2220EP;

    /* renamed from: EQ */
    private String f2221EQ;

    /* renamed from: ER */
    private C0900ib f2222ER;

    /* renamed from: ES */
    private String f2223ES;

    /* renamed from: ET */
    private String f2224ET;

    /* renamed from: EU */
    private String f2225EU;

    /* renamed from: EV */
    private C0900ib f2226EV;

    /* renamed from: EW */
    private C0900ib f2227EW;

    /* renamed from: EX */
    private C0900ib f2228EX;

    /* renamed from: EY */
    private List<C0900ib> f2229EY;

    /* renamed from: EZ */
    private String f2230EZ;

    /* renamed from: Eq */
    private final Set<Integer> f2231Eq;

    /* renamed from: Er */
    private C0900ib f2232Er;

    /* renamed from: Es */
    private List<String> f2233Es;

    /* renamed from: Et */
    private C0900ib f2234Et;

    /* renamed from: Eu */
    private String f2235Eu;

    /* renamed from: Ev */
    private String f2236Ev;

    /* renamed from: Ew */
    private String f2237Ew;

    /* renamed from: Ex */
    private List<C0900ib> f2238Ex;

    /* renamed from: Ey */
    private int f2239Ey;

    /* renamed from: Ez */
    private List<C0900ib> f2240Ez;

    /* renamed from: Fa */
    private String f2241Fa;

    /* renamed from: Fb */
    private String f2242Fb;

    /* renamed from: Fc */
    private String f2243Fc;

    /* renamed from: Fd */
    private C0900ib f2244Fd;

    /* renamed from: Fe */
    private String f2245Fe;

    /* renamed from: Ff */
    private String f2246Ff;

    /* renamed from: Fg */
    private String f2247Fg;

    /* renamed from: Fh */
    private C0900ib f2248Fh;

    /* renamed from: Fi */
    private String f2249Fi;

    /* renamed from: Fj */
    private String f2250Fj;

    /* renamed from: Fk */
    private String f2251Fk;

    /* renamed from: Fl */
    private String f2252Fl;

    /* renamed from: iH */
    private String f2253iH;

    /* renamed from: kg */
    private final int f2254kg;
    private String mName;

    /* renamed from: sJ */
    private String f2255sJ;

    /* renamed from: uS */
    private String f2256uS;

    /* renamed from: xw */
    private double f2257xw;

    /* renamed from: xx */
    private double f2258xx;

    static {
        f2203Ep.put("about", C0614a.m1609a("about", 2, C0900ib.class));
        f2203Ep.put("additionalName", C0614a.m1616h("additionalName", 3));
        f2203Ep.put("address", C0614a.m1609a("address", 4, C0900ib.class));
        f2203Ep.put("addressCountry", C0614a.m1615g("addressCountry", 5));
        f2203Ep.put("addressLocality", C0614a.m1615g("addressLocality", 6));
        f2203Ep.put("addressRegion", C0614a.m1615g("addressRegion", 7));
        f2203Ep.put("associated_media", C0614a.m1610b("associated_media", 8, C0900ib.class));
        f2203Ep.put("attendeeCount", C0614a.m1612d("attendeeCount", 9));
        f2203Ep.put("attendees", C0614a.m1610b("attendees", 10, C0900ib.class));
        f2203Ep.put("audio", C0614a.m1609a("audio", 11, C0900ib.class));
        f2203Ep.put("author", C0614a.m1610b("author", 12, C0900ib.class));
        f2203Ep.put("bestRating", C0614a.m1615g("bestRating", 13));
        f2203Ep.put("birthDate", C0614a.m1615g("birthDate", 14));
        f2203Ep.put("byArtist", C0614a.m1609a("byArtist", 15, C0900ib.class));
        f2203Ep.put("caption", C0614a.m1615g("caption", 16));
        f2203Ep.put("contentSize", C0614a.m1615g("contentSize", 17));
        f2203Ep.put("contentUrl", C0614a.m1615g("contentUrl", 18));
        f2203Ep.put("contributor", C0614a.m1610b("contributor", 19, C0900ib.class));
        f2203Ep.put("dateCreated", C0614a.m1615g("dateCreated", 20));
        f2203Ep.put("dateModified", C0614a.m1615g("dateModified", 21));
        f2203Ep.put("datePublished", C0614a.m1615g("datePublished", 22));
        f2203Ep.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, C0614a.m1615g(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, 23));
        f2203Ep.put("duration", C0614a.m1615g("duration", 24));
        f2203Ep.put("embedUrl", C0614a.m1615g("embedUrl", 25));
        f2203Ep.put("endDate", C0614a.m1615g("endDate", 26));
        f2203Ep.put("familyName", C0614a.m1615g("familyName", 27));
        f2203Ep.put("gender", C0614a.m1615g("gender", 28));
        f2203Ep.put("geo", C0614a.m1609a("geo", 29, C0900ib.class));
        f2203Ep.put("givenName", C0614a.m1615g("givenName", 30));
        f2203Ep.put("height", C0614a.m1615g("height", 31));
        f2203Ep.put("id", C0614a.m1615g("id", 32));
        f2203Ep.put("image", C0614a.m1615g("image", 33));
        f2203Ep.put("inAlbum", C0614a.m1609a("inAlbum", 34, C0900ib.class));
        f2203Ep.put("latitude", C0614a.m1613e("latitude", 36));
        f2203Ep.put("location", C0614a.m1609a("location", 37, C0900ib.class));
        f2203Ep.put("longitude", C0614a.m1613e("longitude", 38));
        f2203Ep.put("name", C0614a.m1615g("name", 39));
        f2203Ep.put("partOfTVSeries", C0614a.m1609a("partOfTVSeries", 40, C0900ib.class));
        f2203Ep.put("performers", C0614a.m1610b("performers", 41, C0900ib.class));
        f2203Ep.put("playerType", C0614a.m1615g("playerType", 42));
        f2203Ep.put("postOfficeBoxNumber", C0614a.m1615g("postOfficeBoxNumber", 43));
        f2203Ep.put("postalCode", C0614a.m1615g("postalCode", 44));
        f2203Ep.put("ratingValue", C0614a.m1615g("ratingValue", 45));
        f2203Ep.put("reviewRating", C0614a.m1609a("reviewRating", 46, C0900ib.class));
        f2203Ep.put("startDate", C0614a.m1615g("startDate", 47));
        f2203Ep.put("streetAddress", C0614a.m1615g("streetAddress", 48));
        f2203Ep.put("text", C0614a.m1615g("text", 49));
        f2203Ep.put("thumbnail", C0614a.m1609a("thumbnail", 50, C0900ib.class));
        f2203Ep.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_THUMBNAIL_URL, C0614a.m1615g(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_THUMBNAIL_URL, 51));
        f2203Ep.put("tickerSymbol", C0614a.m1615g("tickerSymbol", 52));
        f2203Ep.put("type", C0614a.m1615g("type", 53));
        f2203Ep.put(PlusShare.KEY_CALL_TO_ACTION_URL, C0614a.m1615g(PlusShare.KEY_CALL_TO_ACTION_URL, 54));
        f2203Ep.put("width", C0614a.m1615g("width", 55));
        f2203Ep.put("worstRating", C0614a.m1615g("worstRating", 56));
    }

    public C0900ib() {
        this.f2254kg = 1;
        this.f2231Eq = new HashSet();
    }

    C0900ib(Set<Integer> set, int i, C0900ib ibVar, List<String> list, C0900ib ibVar2, String str, String str2, String str3, List<C0900ib> list2, int i2, List<C0900ib> list3, C0900ib ibVar3, List<C0900ib> list4, String str4, String str5, C0900ib ibVar4, String str6, String str7, String str8, List<C0900ib> list5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, C0900ib ibVar5, String str18, String str19, String str20, String str21, C0900ib ibVar6, double d, C0900ib ibVar7, double d2, String str22, C0900ib ibVar8, List<C0900ib> list6, String str23, String str24, String str25, String str26, C0900ib ibVar9, String str27, String str28, String str29, C0900ib ibVar10, String str30, String str31, String str32, String str33, String str34, String str35) {
        this.f2231Eq = set;
        this.f2254kg = i;
        this.f2232Er = ibVar;
        this.f2233Es = list;
        this.f2234Et = ibVar2;
        this.f2235Eu = str;
        this.f2236Ev = str2;
        this.f2237Ew = str3;
        this.f2238Ex = list2;
        this.f2239Ey = i2;
        this.f2240Ez = list3;
        this.f2205EA = ibVar3;
        this.f2206EB = list4;
        this.f2207EC = str4;
        this.f2208ED = str5;
        this.f2209EE = ibVar4;
        this.f2210EF = str6;
        this.f2211EG = str7;
        this.f2212EH = str8;
        this.f2213EI = list5;
        this.f2214EJ = str9;
        this.f2215EK = str10;
        this.f2216EL = str11;
        this.f2255sJ = str12;
        this.f2217EM = str13;
        this.f2218EN = str14;
        this.f2219EO = str15;
        this.f2220EP = str16;
        this.f2221EQ = str17;
        this.f2222ER = ibVar5;
        this.f2223ES = str18;
        this.f2224ET = str19;
        this.f2256uS = str20;
        this.f2225EU = str21;
        this.f2226EV = ibVar6;
        this.f2257xw = d;
        this.f2227EW = ibVar7;
        this.f2258xx = d2;
        this.mName = str22;
        this.f2228EX = ibVar8;
        this.f2229EY = list6;
        this.f2230EZ = str23;
        this.f2241Fa = str24;
        this.f2242Fb = str25;
        this.f2243Fc = str26;
        this.f2244Fd = ibVar9;
        this.f2245Fe = str27;
        this.f2246Ff = str28;
        this.f2247Fg = str29;
        this.f2248Fh = ibVar10;
        this.f2249Fi = str30;
        this.f2250Fj = str31;
        this.f2204AI = str32;
        this.f2253iH = str33;
        this.f2251Fk = str34;
        this.f2252Fl = str35;
    }

    public C0900ib(Set<Integer> set, C0900ib ibVar, List<String> list, C0900ib ibVar2, String str, String str2, String str3, List<C0900ib> list2, int i, List<C0900ib> list3, C0900ib ibVar3, List<C0900ib> list4, String str4, String str5, C0900ib ibVar4, String str6, String str7, String str8, List<C0900ib> list5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, C0900ib ibVar5, String str18, String str19, String str20, String str21, C0900ib ibVar6, double d, C0900ib ibVar7, double d2, String str22, C0900ib ibVar8, List<C0900ib> list6, String str23, String str24, String str25, String str26, C0900ib ibVar9, String str27, String str28, String str29, C0900ib ibVar10, String str30, String str31, String str32, String str33, String str34, String str35) {
        this.f2231Eq = set;
        this.f2254kg = 1;
        this.f2232Er = ibVar;
        this.f2233Es = list;
        this.f2234Et = ibVar2;
        this.f2235Eu = str;
        this.f2236Ev = str2;
        this.f2237Ew = str3;
        this.f2238Ex = list2;
        this.f2239Ey = i;
        this.f2240Ez = list3;
        this.f2205EA = ibVar3;
        this.f2206EB = list4;
        this.f2207EC = str4;
        this.f2208ED = str5;
        this.f2209EE = ibVar4;
        this.f2210EF = str6;
        this.f2211EG = str7;
        this.f2212EH = str8;
        this.f2213EI = list5;
        this.f2214EJ = str9;
        this.f2215EK = str10;
        this.f2216EL = str11;
        this.f2255sJ = str12;
        this.f2217EM = str13;
        this.f2218EN = str14;
        this.f2219EO = str15;
        this.f2220EP = str16;
        this.f2221EQ = str17;
        this.f2222ER = ibVar5;
        this.f2223ES = str18;
        this.f2224ET = str19;
        this.f2256uS = str20;
        this.f2225EU = str21;
        this.f2226EV = ibVar6;
        this.f2257xw = d;
        this.f2227EW = ibVar7;
        this.f2258xx = d2;
        this.mName = str22;
        this.f2228EX = ibVar8;
        this.f2229EY = list6;
        this.f2230EZ = str23;
        this.f2241Fa = str24;
        this.f2242Fb = str25;
        this.f2243Fc = str26;
        this.f2244Fd = ibVar9;
        this.f2245Fe = str27;
        this.f2246Ff = str28;
        this.f2247Fg = str29;
        this.f2248Fh = ibVar10;
        this.f2249Fi = str30;
        this.f2250Fj = str31;
        this.f2204AI = str32;
        this.f2253iH = str33;
        this.f2251Fk = str34;
        this.f2252Fl = str35;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public Object mo4033V(String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public boolean mo4034W(String str) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo4038a(C0614a aVar) {
        return this.f2231Eq.contains(Integer.valueOf(aVar.mo4051cq()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo4039b(C0614a aVar) {
        switch (aVar.mo4051cq()) {
            case 2:
                return this.f2232Er;
            case 3:
                return this.f2233Es;
            case 4:
                return this.f2234Et;
            case 5:
                return this.f2235Eu;
            case 6:
                return this.f2236Ev;
            case 7:
                return this.f2237Ew;
            case 8:
                return this.f2238Ex;
            case 9:
                return Integer.valueOf(this.f2239Ey);
            case 10:
                return this.f2240Ez;
            case 11:
                return this.f2205EA;
            case 12:
                return this.f2206EB;
            case 13:
                return this.f2207EC;
            case 14:
                return this.f2208ED;
            case 15:
                return this.f2209EE;
            case 16:
                return this.f2210EF;
            case 17:
                return this.f2211EG;
            case 18:
                return this.f2212EH;
            case TimeUtils.HUNDRED_DAY_FIELD_LEN /*19*/:
                return this.f2213EI;
            case 20:
                return this.f2214EJ;
            case 21:
                return this.f2215EK;
            case 22:
                return this.f2216EL;
            case 23:
                return this.f2255sJ;
            case 24:
                return this.f2217EM;
            case 25:
                return this.f2218EN;
            case 26:
                return this.f2219EO;
            case 27:
                return this.f2220EP;
            case 28:
                return this.f2221EQ;
            case 29:
                return this.f2222ER;
            case 30:
                return this.f2223ES;
            case 31:
                return this.f2224ET;
            case 32:
                return this.f2256uS;
            case 33:
                return this.f2225EU;
            case 34:
                return this.f2226EV;
            case 36:
                return Double.valueOf(this.f2257xw);
            case 37:
                return this.f2227EW;
            case 38:
                return Double.valueOf(this.f2258xx);
            case 39:
                return this.mName;
            case 40:
                return this.f2228EX;
            case 41:
                return this.f2229EY;
            case 42:
                return this.f2230EZ;
            case 43:
                return this.f2241Fa;
            case 44:
                return this.f2242Fb;
            case 45:
                return this.f2243Fc;
            case 46:
                return this.f2244Fd;
            case 47:
                return this.f2245Fe;
            case 48:
                return this.f2246Ff;
            case 49:
                return this.f2247Fg;
            case AdSize.PORTRAIT_AD_HEIGHT /*50*/:
                return this.f2248Fh;
            case 51:
                return this.f2249Fi;
            case 52:
                return this.f2250Fj;
            case 53:
                return this.f2204AI;
            case 54:
                return this.f2253iH;
            case 55:
                return this.f2251Fk;
            case 56:
                return this.f2252Fl;
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo4051cq());
        }
    }

    /* renamed from: cj */
    public HashMap<String, C0614a<?, ?>> mo4040cj() {
        return f2203Ep;
    }

    public int describeContents() {
        C0901ic icVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0900ib)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0900ib ibVar = (C0900ib) obj;
        for (C0614a aVar : f2203Ep.values()) {
            if (mo4038a(aVar)) {
                if (!ibVar.mo4038a(aVar)) {
                    return false;
                }
                if (!mo4039b(aVar).equals(ibVar.mo4039b(aVar))) {
                    return false;
                }
            } else if (ibVar.mo4038a(aVar)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fa */
    public Set<Integer> mo4800fa() {
        return this.f2231Eq;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fb */
    public C0900ib mo4801fb() {
        return this.f2232Er;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fc */
    public C0900ib mo4802fc() {
        return this.f2234Et;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fd */
    public List<C0900ib> mo4803fd() {
        return this.f2238Ex;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fe */
    public List<C0900ib> mo4804fe() {
        return this.f2240Ez;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ff */
    public C0900ib mo4805ff() {
        return this.f2205EA;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fg */
    public List<C0900ib> mo4806fg() {
        return this.f2206EB;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fh */
    public C0900ib mo4807fh() {
        return this.f2209EE;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fi */
    public List<C0900ib> mo4808fi() {
        return this.f2213EI;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fj */
    public C0900ib mo4809fj() {
        return this.f2222ER;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fk */
    public C0900ib mo4810fk() {
        return this.f2226EV;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fl */
    public C0900ib mo4811fl() {
        return this.f2227EW;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fm */
    public C0900ib mo4812fm() {
        return this.f2228EX;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fn */
    public List<C0900ib> mo4813fn() {
        return this.f2229EY;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fo */
    public C0900ib mo4814fo() {
        return this.f2244Fd;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: fp */
    public C0900ib mo4815fp() {
        return this.f2248Fh;
    }

    /* renamed from: fq */
    public C0900ib freeze() {
        return this;
    }

    public ItemScope getAbout() {
        return this.f2232Er;
    }

    public List<String> getAdditionalName() {
        return this.f2233Es;
    }

    public ItemScope getAddress() {
        return this.f2234Et;
    }

    public String getAddressCountry() {
        return this.f2235Eu;
    }

    public String getAddressLocality() {
        return this.f2236Ev;
    }

    public String getAddressRegion() {
        return this.f2237Ew;
    }

    public List<ItemScope> getAssociated_media() {
        return (ArrayList) this.f2238Ex;
    }

    public int getAttendeeCount() {
        return this.f2239Ey;
    }

    public List<ItemScope> getAttendees() {
        return (ArrayList) this.f2240Ez;
    }

    public ItemScope getAudio() {
        return this.f2205EA;
    }

    public List<ItemScope> getAuthor() {
        return (ArrayList) this.f2206EB;
    }

    public String getBestRating() {
        return this.f2207EC;
    }

    public String getBirthDate() {
        return this.f2208ED;
    }

    public ItemScope getByArtist() {
        return this.f2209EE;
    }

    public String getCaption() {
        return this.f2210EF;
    }

    public String getContentSize() {
        return this.f2211EG;
    }

    public String getContentUrl() {
        return this.f2212EH;
    }

    public List<ItemScope> getContributor() {
        return (ArrayList) this.f2213EI;
    }

    public String getDateCreated() {
        return this.f2214EJ;
    }

    public String getDateModified() {
        return this.f2215EK;
    }

    public String getDatePublished() {
        return this.f2216EL;
    }

    public String getDescription() {
        return this.f2255sJ;
    }

    public String getDuration() {
        return this.f2217EM;
    }

    public String getEmbedUrl() {
        return this.f2218EN;
    }

    public String getEndDate() {
        return this.f2219EO;
    }

    public String getFamilyName() {
        return this.f2220EP;
    }

    public String getGender() {
        return this.f2221EQ;
    }

    public ItemScope getGeo() {
        return this.f2222ER;
    }

    public String getGivenName() {
        return this.f2223ES;
    }

    public String getHeight() {
        return this.f2224ET;
    }

    public String getId() {
        return this.f2256uS;
    }

    public String getImage() {
        return this.f2225EU;
    }

    public ItemScope getInAlbum() {
        return this.f2226EV;
    }

    public double getLatitude() {
        return this.f2257xw;
    }

    public ItemScope getLocation() {
        return this.f2227EW;
    }

    public double getLongitude() {
        return this.f2258xx;
    }

    public String getName() {
        return this.mName;
    }

    public ItemScope getPartOfTVSeries() {
        return this.f2228EX;
    }

    public List<ItemScope> getPerformers() {
        return (ArrayList) this.f2229EY;
    }

    public String getPlayerType() {
        return this.f2230EZ;
    }

    public String getPostOfficeBoxNumber() {
        return this.f2241Fa;
    }

    public String getPostalCode() {
        return this.f2242Fb;
    }

    public String getRatingValue() {
        return this.f2243Fc;
    }

    public ItemScope getReviewRating() {
        return this.f2244Fd;
    }

    public String getStartDate() {
        return this.f2245Fe;
    }

    public String getStreetAddress() {
        return this.f2246Ff;
    }

    public String getText() {
        return this.f2247Fg;
    }

    public ItemScope getThumbnail() {
        return this.f2248Fh;
    }

    public String getThumbnailUrl() {
        return this.f2249Fi;
    }

    public String getTickerSymbol() {
        return this.f2250Fj;
    }

    public String getType() {
        return this.f2204AI;
    }

    public String getUrl() {
        return this.f2253iH;
    }

    /* access modifiers changed from: 0000 */
    public int getVersionCode() {
        return this.f2254kg;
    }

    public String getWidth() {
        return this.f2251Fk;
    }

    public String getWorstRating() {
        return this.f2252Fl;
    }

    public boolean hasAbout() {
        return this.f2231Eq.contains(Integer.valueOf(2));
    }

    public boolean hasAdditionalName() {
        return this.f2231Eq.contains(Integer.valueOf(3));
    }

    public boolean hasAddress() {
        return this.f2231Eq.contains(Integer.valueOf(4));
    }

    public boolean hasAddressCountry() {
        return this.f2231Eq.contains(Integer.valueOf(5));
    }

    public boolean hasAddressLocality() {
        return this.f2231Eq.contains(Integer.valueOf(6));
    }

    public boolean hasAddressRegion() {
        return this.f2231Eq.contains(Integer.valueOf(7));
    }

    public boolean hasAssociated_media() {
        return this.f2231Eq.contains(Integer.valueOf(8));
    }

    public boolean hasAttendeeCount() {
        return this.f2231Eq.contains(Integer.valueOf(9));
    }

    public boolean hasAttendees() {
        return this.f2231Eq.contains(Integer.valueOf(10));
    }

    public boolean hasAudio() {
        return this.f2231Eq.contains(Integer.valueOf(11));
    }

    public boolean hasAuthor() {
        return this.f2231Eq.contains(Integer.valueOf(12));
    }

    public boolean hasBestRating() {
        return this.f2231Eq.contains(Integer.valueOf(13));
    }

    public boolean hasBirthDate() {
        return this.f2231Eq.contains(Integer.valueOf(14));
    }

    public boolean hasByArtist() {
        return this.f2231Eq.contains(Integer.valueOf(15));
    }

    public boolean hasCaption() {
        return this.f2231Eq.contains(Integer.valueOf(16));
    }

    public boolean hasContentSize() {
        return this.f2231Eq.contains(Integer.valueOf(17));
    }

    public boolean hasContentUrl() {
        return this.f2231Eq.contains(Integer.valueOf(18));
    }

    public boolean hasContributor() {
        return this.f2231Eq.contains(Integer.valueOf(19));
    }

    public boolean hasDateCreated() {
        return this.f2231Eq.contains(Integer.valueOf(20));
    }

    public boolean hasDateModified() {
        return this.f2231Eq.contains(Integer.valueOf(21));
    }

    public boolean hasDatePublished() {
        return this.f2231Eq.contains(Integer.valueOf(22));
    }

    public boolean hasDescription() {
        return this.f2231Eq.contains(Integer.valueOf(23));
    }

    public boolean hasDuration() {
        return this.f2231Eq.contains(Integer.valueOf(24));
    }

    public boolean hasEmbedUrl() {
        return this.f2231Eq.contains(Integer.valueOf(25));
    }

    public boolean hasEndDate() {
        return this.f2231Eq.contains(Integer.valueOf(26));
    }

    public boolean hasFamilyName() {
        return this.f2231Eq.contains(Integer.valueOf(27));
    }

    public boolean hasGender() {
        return this.f2231Eq.contains(Integer.valueOf(28));
    }

    public boolean hasGeo() {
        return this.f2231Eq.contains(Integer.valueOf(29));
    }

    public boolean hasGivenName() {
        return this.f2231Eq.contains(Integer.valueOf(30));
    }

    public boolean hasHeight() {
        return this.f2231Eq.contains(Integer.valueOf(31));
    }

    public boolean hasId() {
        return this.f2231Eq.contains(Integer.valueOf(32));
    }

    public boolean hasImage() {
        return this.f2231Eq.contains(Integer.valueOf(33));
    }

    public boolean hasInAlbum() {
        return this.f2231Eq.contains(Integer.valueOf(34));
    }

    public boolean hasLatitude() {
        return this.f2231Eq.contains(Integer.valueOf(36));
    }

    public boolean hasLocation() {
        return this.f2231Eq.contains(Integer.valueOf(37));
    }

    public boolean hasLongitude() {
        return this.f2231Eq.contains(Integer.valueOf(38));
    }

    public boolean hasName() {
        return this.f2231Eq.contains(Integer.valueOf(39));
    }

    public boolean hasPartOfTVSeries() {
        return this.f2231Eq.contains(Integer.valueOf(40));
    }

    public boolean hasPerformers() {
        return this.f2231Eq.contains(Integer.valueOf(41));
    }

    public boolean hasPlayerType() {
        return this.f2231Eq.contains(Integer.valueOf(42));
    }

    public boolean hasPostOfficeBoxNumber() {
        return this.f2231Eq.contains(Integer.valueOf(43));
    }

    public boolean hasPostalCode() {
        return this.f2231Eq.contains(Integer.valueOf(44));
    }

    public boolean hasRatingValue() {
        return this.f2231Eq.contains(Integer.valueOf(45));
    }

    public boolean hasReviewRating() {
        return this.f2231Eq.contains(Integer.valueOf(46));
    }

    public boolean hasStartDate() {
        return this.f2231Eq.contains(Integer.valueOf(47));
    }

    public boolean hasStreetAddress() {
        return this.f2231Eq.contains(Integer.valueOf(48));
    }

    public boolean hasText() {
        return this.f2231Eq.contains(Integer.valueOf(49));
    }

    public boolean hasThumbnail() {
        return this.f2231Eq.contains(Integer.valueOf(50));
    }

    public boolean hasThumbnailUrl() {
        return this.f2231Eq.contains(Integer.valueOf(51));
    }

    public boolean hasTickerSymbol() {
        return this.f2231Eq.contains(Integer.valueOf(52));
    }

    public boolean hasType() {
        return this.f2231Eq.contains(Integer.valueOf(53));
    }

    public boolean hasUrl() {
        return this.f2231Eq.contains(Integer.valueOf(54));
    }

    public boolean hasWidth() {
        return this.f2231Eq.contains(Integer.valueOf(55));
    }

    public boolean hasWorstRating() {
        return this.f2231Eq.contains(Integer.valueOf(56));
    }

    public int hashCode() {
        int i = 0;
        Iterator it = f2203Ep.values().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            C0614a aVar = (C0614a) it.next();
            if (mo4038a(aVar)) {
                i = mo4039b(aVar).hashCode() + i2 + aVar.mo4051cq();
            } else {
                i = i2;
            }
        }
    }

    public boolean isDataValid() {
        return true;
    }

    public void writeToParcel(Parcel out, int flags) {
        C0901ic icVar = CREATOR;
        C0901ic.m2708a(this, out, flags);
    }
}
