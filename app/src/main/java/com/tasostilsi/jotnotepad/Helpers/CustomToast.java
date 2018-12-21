package com.tasostilsi.jotnotepad.Helpers;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.tasostilsi.jotnotepad.R;

public class CustomToast {

    public CustomToast() {

    }

    public static void createToast(Activity activity, String message, Integer duration) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View customToast = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) activity.findViewById(R.id.custom_toast));
        TextView toastText = customToast.findViewById(R.id.toast_text);
        toastText.setText(message);

        Toast toast = new Toast(activity);
        toast.setView(customToast);
        toast.setGravity(Gravity.TOP, 0, 0);
        toast.setDuration(duration);
        toast.show();
    }
}
