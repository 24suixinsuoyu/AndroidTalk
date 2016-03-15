package pers.suixinsuoyu.activitylifecycle;
/**
 * Created by 24suixinsuoyu on 16/2/21.
 * <p/>
 * stay hungry, stay foolish 求知若饥,虚心若愚
 * ever youthful, ever weeping 永远年轻,永远热泪盈眶
 * think different, think independently 非同凡想,独立思考
 * <p/>
 * 牛逼的人那么多,我会是其中一个
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        System.out.println("A onCreate");

        findViewById(R.id.btnStartBAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("A onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("A onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        System.out.println("A onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("A onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("A onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        System.out.println("A onDestroy");
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
