package nyc.c4q.rusili.utilitytemplates.widgets.spinner;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

// Creates a spinner in the action bar
// Parameters:  1) Parent activity
//              2) Layout/Container ID
// Needs:       1) Spinner widget ID
//              2) Categories

public class SpinnerInflater {
    private Activity mActivity;

    public SpinnerInflater (Activity activityParam) {
        this.mActivity = activityParam;
    }

    public void setUp (int containerIDParam) {
        Spinner spinner = (Spinner) mActivity.findViewById(0);

        // Spinner Drop down elements
        List <String> categories = new ArrayList <String>();
        categories.add("Settings:");

        // Creating adapter for spinner
        ArrayAdapter <String> dataAdapter = new ArrayAdapter <String>(mActivity, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        SpinnerInteractionListener listener = new SpinnerInteractionListener(containerIDParam);
        spinner.setOnTouchListener(listener);
        spinner.setOnItemSelectedListener(listener);
    }
}
