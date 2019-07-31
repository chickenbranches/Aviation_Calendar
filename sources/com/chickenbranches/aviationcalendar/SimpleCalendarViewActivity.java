package com.chickenbranches.aviationcalendar;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p000v4.internal.view.SupportMenu;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class SimpleCalendarViewActivity extends Activity implements OnClickListener {
    private static final String dateTemplate = "MMMM yyyy";
    private Calendar _calendar;
    private GridCellAdapter adapter;
    private final String[] backgrounds = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
    private GridView calendarView;
    private Button currentMonth;
    /* access modifiers changed from: private */
    public int currentPhoneMonth;
    DBTools dbTools = new DBTools(this);
    ImageView imageView;
    private int month;
    private ImageView nextMonth;
    private ImageView prevMonth;
    int resID = 1;
    private final String[] videos = {"https://www.youtube.com/watch?v=sg7vKvO_ETk", "https://www.youtube.com/watch?v=nM_ZB7jqxz8", "https://www.youtube.com/watch?v=e_Q6Vb9xJM0", "https://www.youtube.com/watch?v=wJNAzcI6zdc", "https://www.youtube.com/watch?v=ai4j30-5fAQ"};
    private int year;

    public class GridCellAdapter extends BaseAdapter implements OnClickListener {
        private static final int DAY_OFFSET = 1;
        private final Context _context;
        private int currentDayOfMonth;
        private int currentWeekDay;
        private int daysInMonth;
        private final int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        private Button gridcell;
        private final List<String> list;
        private final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        public GridCellAdapter(Context context, int textViewResourceId, int month, int year) {
            this._context = context;
            this.list = new ArrayList();
            Calendar calendar = Calendar.getInstance();
            setCurrentDayOfMonth(calendar.get(5));
            setCurrentWeekDay(calendar.get(7));
            printMonth(month, year);
        }

        private String getMonthAsString(int i) {
            return this.months[i];
        }

        private int getNumberOfDaysOfMonth(int i) {
            return this.daysOfMonth[i];
        }

        public String getItem(int position) {
            return (String) this.list.get(position);
        }

        public int getCount() {
            return this.list.size();
        }

        private void printMonth(int mm, int yy) {
            int prevMonth;
            int nextMonth;
            int nextYear;
            int prevYear;
            int daysInPrevMonth;
            int currentMonth = mm - 1;
            this.daysInMonth = getNumberOfDaysOfMonth(currentMonth);
            GregorianCalendar cal = new GregorianCalendar(yy, currentMonth, 1);
            if (currentMonth == 11) {
                prevMonth = currentMonth - 1;
                daysInPrevMonth = getNumberOfDaysOfMonth(prevMonth);
                nextMonth = 0;
                prevYear = yy;
                nextYear = yy + 1;
            } else if (currentMonth == 0) {
                prevMonth = 11;
                prevYear = yy - 1;
                nextYear = yy;
                daysInPrevMonth = getNumberOfDaysOfMonth(11);
                nextMonth = 1;
            } else {
                prevMonth = currentMonth - 1;
                nextMonth = currentMonth + 1;
                nextYear = yy;
                prevYear = yy;
                daysInPrevMonth = getNumberOfDaysOfMonth(prevMonth);
            }
            int trailingSpaces = cal.get(7) - 1;
            if (cal.isLeapYear(cal.get(1)) && mm == 1) {
                this.daysInMonth++;
            }
            for (int i = 0; i < trailingSpaces; i++) {
                this.list.add(new StringBuilder(String.valueOf(String.valueOf((daysInPrevMonth - trailingSpaces) + 1 + i))).append("-GREY").append("-").append(getMonthAsString(prevMonth)).append("-").append(prevYear).toString());
            }
            for (int i2 = 1; i2 <= this.daysInMonth; i2++) {
                ArrayList<HashMap<String, String>> eventList = SimpleCalendarViewActivity.this.dbTools.getAllEvents(String.valueOf(i2) + "-" + getMonthAsString(currentMonth) + "-" + yy);
                if (i2 == getCurrentDayOfMonth() && SimpleCalendarViewActivity.this.currentPhoneMonth == currentMonth) {
                    this.list.add(String.valueOf(i2) + "-BLUE" + "-" + getMonthAsString(currentMonth) + "-" + yy);
                } else if (eventList.size() != 0) {
                    this.list.add(String.valueOf(i2) + "-RED" + "-" + getMonthAsString(currentMonth) + "-" + yy);
                } else {
                    this.list.add(String.valueOf(i2) + "-WHITE" + "-" + getMonthAsString(currentMonth) + "-" + yy);
                }
            }
            for (int i3 = 0; i3 < this.list.size() % 7; i3++) {
                this.list.add(new StringBuilder(String.valueOf(String.valueOf(i3 + 1))).append("-GREY").append("-").append(getMonthAsString(nextMonth)).append("-").append(nextYear).toString());
            }
        }

        public long getItemId(int position) {
            return (long) position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;
            if (row == null) {
                row = ((LayoutInflater) this._context.getSystemService("layout_inflater")).inflate(C0074R.layout.calendar_day_gridcell, parent, false);
            }
            this.gridcell = (Button) row.findViewById(C0074R.C0076id.calendar_day_gridcell);
            this.gridcell.setOnClickListener(this);
            String[] day_color = ((String) this.list.get(position)).split("-");
            String theday = day_color[0];
            String themonth = day_color[2];
            String theyear = day_color[3];
            this.gridcell.setText(theday);
            this.gridcell.setTag(new StringBuilder(String.valueOf(theday)).append("-").append(themonth).append("-").append(theyear).toString());
            if (day_color[1].equals("GREY")) {
                this.gridcell.setTextColor(-3355444);
            }
            if (day_color[1].equals("WHITE")) {
                this.gridcell.setTextColor(-1);
            }
            if (day_color[1].equals("RED")) {
                this.gridcell.setTextColor(SupportMenu.CATEGORY_MASK);
                this.gridcell.setTextSize(24.0f);
            }
            if (day_color[1].equals("BLUE")) {
                this.gridcell.setTextColor(-16711936);
                this.gridcell.setTextSize(24.0f);
            }
            return row;
        }

        public void onClick(View view) {
            String date_month_year = (String) view.getTag();
            Intent myIntent = new Intent(SimpleCalendarViewActivity.this, EventList.class);
            myIntent.putExtra("key", date_month_year);
            SimpleCalendarViewActivity.this.startActivity(myIntent);
        }

        public int getCurrentDayOfMonth() {
            return this.currentDayOfMonth;
        }

        private void setCurrentDayOfMonth(int currentDayOfMonth2) {
            this.currentDayOfMonth = currentDayOfMonth2;
        }

        public void setCurrentWeekDay(int currentWeekDay2) {
            this.currentWeekDay = currentWeekDay2;
        }

        public int getCurrentWeekDay() {
            return this.currentWeekDay;
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0074R.layout.simple_calendar_view);
        this.imageView = (ImageView) findViewById(C0074R.C0076id.image);
        this.imageView.setImageResource(C0074R.C0075drawable.wallpaper);
        this.imageView.setFocusable(true);
        this.imageView.setOnClickListener(this);
        this._calendar = Calendar.getInstance(Locale.getDefault());
        this.month = this._calendar.get(2) + 1;
        this.currentPhoneMonth = this.month - 1;
        this.year = this._calendar.get(1);
        this.resID = getResources().getIdentifier(this.backgrounds[this.month - 1], "drawable", "com.chickenbranches.aviationcalendar");
        this.imageView.setImageResource(this.resID);
        this.prevMonth = (ImageView) findViewById(C0074R.C0076id.prevMonth);
        this.prevMonth.setOnClickListener(this);
        this.currentMonth = (Button) findViewById(C0074R.C0076id.currentMonth);
        this.currentMonth.setText(DateFormat.format(dateTemplate, this._calendar.getTime()));
        this.nextMonth = (ImageView) findViewById(C0074R.C0076id.nextMonth);
        this.nextMonth.setOnClickListener(this);
        this.calendarView = (GridView) findViewById(C0074R.C0076id.calendar);
        this.adapter = new GridCellAdapter(getApplicationContext(), C0074R.C0076id.calendar_day_gridcell, this.month, this.year);
        this.adapter.notifyDataSetChanged();
        this.calendarView.setAdapter(this.adapter);
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
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://americadimensions.com/calendar/index.php/android-calendar-app-download")));
    }

    private void setGridCellAdapterToDate(int month2, int year2) {
        HashMap<String, String> queryValuesMap = new HashMap<>();
        queryValuesMap.put("settingID", "1");
        queryValuesMap.put("setting", "notifications");
        queryValuesMap.put("choice", "Enabled");
        if (this.dbTools.checkNotificationSetting("notifications").equals("Nothing")) {
            this.dbTools.createSetting(queryValuesMap);
        }
        this.adapter = new GridCellAdapter(getApplicationContext(), C0074R.C0076id.calendar_day_gridcell, month2, year2);
        this._calendar.set(year2, month2 - 1, this._calendar.get(5));
        this.currentMonth.setText(DateFormat.format(dateTemplate, this._calendar.getTime()));
        this.adapter.notifyDataSetChanged();
        this.calendarView.setAdapter(this.adapter);
    }

    private void loadPhoto(ImageView imageView2, int width, int height) {
        ImageView tempImageView = imageView2;
        Builder imageDialog = new Builder(this);
        View layout = ((LayoutInflater) getSystemService("layout_inflater")).inflate(C0074R.layout.custom_fullimage_dialog, (ViewGroup) findViewById(C0074R.C0076id.layout_root));
        ((ImageView) layout.findViewById(C0074R.C0076id.fullimage)).setImageDrawable(tempImageView.getDrawable());
        imageDialog.setView(layout);
        imageDialog.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        imageDialog.create();
        imageDialog.show();
    }

    public void onClick(View v) {
        if (v == this.imageView) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.videos[new Random().nextInt(5)])));
        }
        if (v == this.prevMonth) {
            if (this.month <= 1) {
                this.month = 12;
                this.year--;
                this.imageView.setImageResource(getResources().getIdentifier(this.backgrounds[this.month - 1], "drawable", "com.chickenbranches.aviationcalendar"));
            } else {
                this.month--;
                this.imageView.setImageResource(getResources().getIdentifier(this.backgrounds[this.month - 1], "drawable", "com.chickenbranches.aviationcalendar"));
            }
            if (this.month == 2 && this.year == 2014) {
                this.prevMonth.setVisibility(4);
            } else {
                this.nextMonth.setVisibility(0);
            }
            setGridCellAdapterToDate(this.month, this.year);
        }
        if (v == this.nextMonth) {
            if (this.month > 11) {
                this.month = 1;
                this.year++;
                this.imageView.setImageResource(getResources().getIdentifier(this.backgrounds[this.month - 1], "drawable", "com.chickenbranches.aviationcalendar"));
            } else {
                this.month++;
                this.imageView.setImageResource(getResources().getIdentifier(this.backgrounds[this.month - 1], "drawable", "com.chickenbranches.aviationcalendar"));
            }
            if (this.month == 12 && this.year == 2015) {
                this.nextMonth.setVisibility(4);
            } else {
                this.prevMonth.setVisibility(0);
            }
            setGridCellAdapterToDate(this.month, this.year);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        setGridCellAdapterToDate(this.month, this.year);
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
