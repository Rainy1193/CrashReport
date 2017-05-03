package rain.endless.crashreport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.tvHello);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewObject obj = new NewObject("Sana", 20, "Cute");
                Bundle b = new Bundle();
                b.putParcelable("ParcelKey", obj);
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtras(b);
                startActivity(i);
            }
        });

    }
}
