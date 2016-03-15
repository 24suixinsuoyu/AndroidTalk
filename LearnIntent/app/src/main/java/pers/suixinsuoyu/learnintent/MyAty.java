package pers.suixinsuoyu.learnintent;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by 24suixinsuoyu on 16/2/24. All rights reserved.
 * <p/>
 * stay hungry, stay foolish
 * ever youthful, ever weeping
 * think different, think independently
 * <p/>
 */
public class MyAty extends Activity {


    public static final String ACTION = "com.jikexueyuan.learnintent.intent.action.MyAty";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_myaty);

    }
}
