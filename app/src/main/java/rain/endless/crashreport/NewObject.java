package rain.endless.crashreport;

import android.os.Parcel;
import android.os.Parcelable;


/**
 * Created by RAINY on 5/3/2017.
 */

public class NewObject implements Parcelable {

    private String name;
    private int age;
    private String nick;

    public NewObject(String name, int age, String nick) {
        this.name = name;
        this.age = age;
        this.nick = nick;
    }

    private NewObject(Parcel in) {
        name = in.readString();
        age = in.readInt();
        nick = in.readString();
    }

    public static final Creator<NewObject> CREATOR = new Creator<NewObject>() {
        @Override
        public NewObject createFromParcel(Parcel in) {
            return new NewObject(in);
        }

        @Override
        public NewObject[] newArray(int size) {
            return new NewObject[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(age);
        parcel.writeString(nick);
    }

    @Override
    public String toString() {
        return "NewObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }
}
