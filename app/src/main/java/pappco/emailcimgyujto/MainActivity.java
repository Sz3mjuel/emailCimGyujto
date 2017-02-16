package pappco.emailcimgyujto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Player> playerArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewAdapter adapter = new listViewAdapter(this, playerArrayList);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

    }
}
