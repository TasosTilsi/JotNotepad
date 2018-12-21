package com.tasostilsi.jotnotepad.Helpers;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SaveSharedPreferences {

    static final String FIRST_TIME_RUN = "first_time_run";

    private static SharedPreferences getSharedPreferences(Context ctx) {
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public static void setFirstTimeRun(Context ctx, Boolean firstTimeRun) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putBoolean(FIRST_TIME_RUN, firstTimeRun);
        editor.commit();
    }

    public static Boolean getFirstTimeRun(Context ctx) {
        return getSharedPreferences(ctx).getBoolean(FIRST_TIME_RUN, false);
    }
}
