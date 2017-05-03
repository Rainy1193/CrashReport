package rain.endless.crashreport;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by RAINY on 5/3/2017.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        NewObject newObject = getIntent().getParcelableExtra("ParcelKey");
        Log.e("Sana", newObject.toString());
        Log.e("Description","She so cute");
    }
}
