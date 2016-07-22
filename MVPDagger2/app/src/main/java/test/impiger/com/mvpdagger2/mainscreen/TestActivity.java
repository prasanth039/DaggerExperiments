package test.impiger.com.mvpdagger2.mainscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.List;

import javax.inject.Inject;

import test.impiger.com.mvpdagger2.App;
import test.impiger.com.mvpdagger2.R;
import test.impiger.com.mvpdagger2.data.Post;
import test.impiger.com.mvpdagger2.data.TestClass;

public class TestActivity extends AppCompatActivity implements MainScreenContract.View {


    @Inject
    TestClass testClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_acivity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            }
        });
        ((App)getApplicationContext()).getTestComponent().inject(this);

        System.out.println("XXXXX TestActivity[" + testClass.getCode() + "]");
        testClass.setCode(50);
        System.out.println("XXXXX TestActivity2[" + testClass.getCode() + "]");
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showPosts(List<Post> posts) {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void showComplete() {

    }
}

