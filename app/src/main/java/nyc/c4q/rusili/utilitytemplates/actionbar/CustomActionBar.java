package nyc.c4q.rusili.utilitytemplates.actionbar;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;

import nyc.c4q.rusili.utilitytemplates.R;

/**
 * Created by rusili on 2/6/17.
 */

public class CustomActionBar {

    public void modify(Activity activityParam){
        android.support.v7.app.ActionBar actionBar = ((AppCompatActivity) activityParam).getSupportActionBar();
        actionBar.setCustomView(R.layout.actionbar_layout);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
    }
}
