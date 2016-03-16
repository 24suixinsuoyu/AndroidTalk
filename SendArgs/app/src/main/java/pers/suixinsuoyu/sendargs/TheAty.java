package pers.suixinsuoyu.sendargs;
/**
 * Created by 24suixinsuoyu on 16/2/22.
 * <p/>
 * stay hungry, stay foolish
 * ever youthful, ever weeping
 * think different, think independently
 * <p/>
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TheAty extends AppCompatActivity {

    private TextView tv;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_aty);
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


        tv = (TextView) findViewById(R.id.tv);
        editText = (EditText) findViewById(R.id.editText);

        Intent i = getIntent();
//        Bundle data = i.getBundleExtra("bundlename");
//        tv.setText(i.getStringExtra("data"));

//        tv.setText(String.format("name=%s,age=%d,name1=%s",data.getString("name"),data.getInt("age"),data.getString("name1","包中没有自己设的一个默认值")));

//        User user = (User) i.getSerializableExtra("user");
        User user = i.getParcelableExtra("user");

        tv.setText(String.format("User info(name=%s,age=%d)",user.getName(),user.getAge()));

        findViewById(R.id.btnSendBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("TheSendBackData",editText.getText().toString());
                setResult(1,i);
                finish();
            }
        });

    }

}
