package test.impiger.com.mvpdagger2.mainscreen;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import javax.inject.Inject;

import test.impiger.com.mvpdagger2.App;
import test.impiger.com.mvpdagger2.R;
import test.impiger.com.mvpdagger2.data.TestClass;

public class ThirdActivity extends AppCompatActivity {
    @Inject
    TestClass testClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
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
        ((App) getApplicationContext()).getTestComponent().inject(this);
        System.out.println("XXXXX ThirdActivity[" + testClass.getCode() + "]");
        testClass.setCode(50);
        System.out.println("XXXXX ThirdActivit2[" + testClass.getCode() + "]");
    }

}
