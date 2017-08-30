package mobi.glowworm.demo.gdg_ct_20170830;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import mobi.glowworm.demo.gdg_ct_20170830._1_basic_initial_list.ItemListActivity_1;
import mobi.glowworm.demo.gdg_ct_20170830._2_basic_transitions.ItemListActivity_2;
import mobi.glowworm.demo.gdg_ct_20170830._3_polished_basics.ItemListActivity_3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.title_item_list);
        actionBar.setSubtitle(R.string.app_name);
    }

    private void launchActivity(@NonNull Class<? extends Activity> activity) {
        startActivity(new Intent(this, activity));

    }

    public void onClick_1(View view) {
        launchActivity(ItemListActivity_1.class);
    }

    public void onClick_2(View view) {
        launchActivity(ItemListActivity_2.class);
    }

    public void onClick_3(View view) {
        launchActivity(ItemListActivity_3.class);
    }

}
