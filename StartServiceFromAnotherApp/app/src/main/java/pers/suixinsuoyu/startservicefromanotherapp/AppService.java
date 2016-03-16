package pers.suixinsuoyu.startservicefromanotherapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class AppService extends Service {
    public AppService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new IAppServiceRemoteBinder.Stub() {
            @Override
            public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

            }

            @Override
            public void setData(String data) throws RemoteException {
                AppService.this.serviceData = data;
            }
        };
    }

    @Override
    public void onCreate() {
        super.onCreate();

        System.out.println("Service Started");

        new Thread() {
            @Override
            public void run() {
                super.run();

                int i = 0;
                running = true;
                while (running) {

                    i++;
                    System.out.println(i+": "+serviceData);

                    try {
                        Thread.sleep(1000);
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

        System.out.println("Service destroyed");

        running = false;
    }

    private String serviceData = "这是外部服务的默认数据";
    private boolean running = false;
}
