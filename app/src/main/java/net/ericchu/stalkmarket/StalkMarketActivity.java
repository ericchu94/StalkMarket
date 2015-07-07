package net.ericchu.stalkmarket;

import android.app.Activity;
import android.os.Bundle;


public class StalkMarketActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stalk_market);

        if (savedInstanceState != null)
            return;

        TownsFragment towns = new TownsFragment();
        getFragmentManager().beginTransaction().add(R.id.frameLayout, towns).commit();
    }
}
