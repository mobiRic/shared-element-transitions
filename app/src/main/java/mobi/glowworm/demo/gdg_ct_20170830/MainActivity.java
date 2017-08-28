package mobi.glowworm.demo.gdg_ct_20170830;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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
        launchActivity(ItemListActivity.class);
    }

}