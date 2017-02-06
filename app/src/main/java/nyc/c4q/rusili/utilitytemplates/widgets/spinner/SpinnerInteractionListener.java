package nyc.c4q.rusili.utilitytemplates.widgets.spinner;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;

// A listener that is necessary with the SpinnerInflater.class to listen for onClicks
// Parameters:  1) Layout/Container ID

public class SpinnerInteractionListener implements AdapterView.OnItemSelectedListener, View.OnTouchListener {
    boolean userSelect = false;
    private View mView;
    private int containerID;

    public SpinnerInteractionListener (int containerIDParam) {
        this.containerID = containerIDParam;
    }

    @Override
    public boolean onTouch (View v, MotionEvent event) {
        userSelect = true;
        return false;
    }

    @Override
    public void onItemSelected (AdapterView <?> parent, View view, int position, long id) {
        this.mView = view;
        if (userSelect) {
            switch (position) {
                case 1:
                case 2:
            }
            userSelect = false;
        }
    }

    @Override
    public void onNothingSelected (AdapterView <?> parent) {
    }

}
