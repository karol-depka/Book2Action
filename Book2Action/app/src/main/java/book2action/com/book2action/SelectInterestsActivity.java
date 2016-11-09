package book2action.com.book2action;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectInterestsActivity extends AppCompatActivity
        implements
        SelectInterestsFragment.OnFragmentInteractionListener,
        RateYourselfOnHabitActivity.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_interests);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fragment_host_layout, new SelectInterestsFragment(), "select_interests");
        ft.commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void goToRateYourselfOnHabit() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_host_layout, new RateYourselfOnHabitActivity());
//        ft.add(R.id.fragment_host_layout, new RateYourselfOnHabitActivity(), "someKey");
        ft.commit();
    }
}
