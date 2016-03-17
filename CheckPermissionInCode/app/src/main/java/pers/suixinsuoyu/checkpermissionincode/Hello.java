package pers.suixinsuoyu.checkpermissionincode;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by 24suixinsuoyu on 16/3/7. All rights reserved.
 * <p/>
 * stay hungry, stay foolish
 * ever youthful, ever weeping
 * think different, think independently
 * <p/>
 */
public class Hello {

    public static final String PERMISSION_SAY_HELLO = "com.jikexueyuan.checkpermissionincode.permission.SAY_HELLO";

    public static void sayHello(Context context) {

        int checkResult = context.checkCallingOrSelfPermission(PERMISSION_SAY_HELLO);

        if (checkResult != PackageManager.PERMISSION_GRANTED) {
            throw new SecurityException("执行sayHello方法需要有com.jikexueyuan.checkpermissionincode.permission.SAY_HELLO权限");
        }

        System.out.println("Hello jikexueyuan");
    }
}
