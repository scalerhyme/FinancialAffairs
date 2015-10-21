package com.scalerhyme.app.financialaffairs;

import android.app.FragmentManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RecordActivity extends AppCompatActivity
    implements OutcomeRecordFragment.OnFragmentInteractionListener {

    OutcomeRecordFragment outcomeRecordFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        FragmentManager fragmentManager = getFragmentManager();
        //outcomeRecordFragment = (OutcomeRecordFragment) fragmentManager.findFragmentById(R.id.record_fragment_container);

        //if (outcomeRecordFragment == null)
        if (savedInstanceState == null)
        {
            outcomeRecordFragment = new OutcomeRecordFragment();
            fragmentManager.beginTransaction().add(R.id.record_fragment_container, outcomeRecordFragment).commit();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
