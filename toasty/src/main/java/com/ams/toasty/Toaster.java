package com.ams.toasty;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void EasyToast(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
