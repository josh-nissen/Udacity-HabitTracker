package com.android.nissen.habittracker;

import android.provider.BaseColumns;

/**
 * Created by Josh Nissen on 3/30/2017.
 */

public class HabitContract {

    public static final class HabitEntry implements BaseColumns {


        public static final String TABLE_NAME = "habit";

        public static final String ID = "id";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_HABIT = "habit";
        public static final String COLUMN_LOCATION = "location";
        public static final String COLUMN_DATE = "date";
    }
}
