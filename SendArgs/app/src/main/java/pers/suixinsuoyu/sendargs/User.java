package pers.suixinsuoyu.sendargs;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 24suixinsuoyu on 16/2/23.
 * <p/>
 * stay hungry, stay foolish 求知若饥,虚心若愚
 * ever youthful, ever weeping 永远年轻,永远热泪盈眶
 * think different, think independently 非同凡想,独立思考
 * <p/>
 * 牛逼的人那么多,我会是其中一个
 */
//public class User implements Serializable {
public class User implements Parcelable{
    private String name;
    private int age;

    protected User(Parcel in) {
        name = in.readString();
        age = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in.readString(),in.readInt());
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public User(String name,int age){
        this.name = name;
        this.age  = age;
    }
}
