package pers.suixinsuoyu.connectservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {

    private String innerdata = "这是Service 内部 onCreate 方法的默认信息";
    private boolean running = false;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new Binder();
    }

    public class Binder extends android.os.Binder {
        public void setData (String data) {
            MyService.this.innerdata = data;
        }

        public MyService getService() {
            return MyService.this;
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        innerdata = intent.getStringExtra("intentData");

        System.out.println(innerdata);
        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public void onCreate() {
        super.onCreate();

        new Thread(){
            @Override
            public void run() {
                super.run();

                int i = 0;

                running = true;
                while (running){

                    i++;

                    String str = i + ": " + innerdata;

//                    System.out.println(str);

                    if (callback != null) {
                        callback.onDataChange(str);
                    }

                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();

        running = false;
    }

    private Callback callback = null;

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public Callback getCallback() {
        return callback;
    }

    public static interface Callback {
        void onDataChange(String data);
    }
}
