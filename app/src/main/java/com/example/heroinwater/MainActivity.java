package com.example.heroinwater;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String[] songs = {"2 DAYS NO LEAN","4 DAYS AFTER HB","4 MONTHS NO SMOKE","Bandit Petersburg","DREAMS MONEY CAN BUY", "NO COMMERCIAL LYRICS", "ODYSSEY" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.albumsList);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, songs);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(MainActivity.this, About.class);

            intent.putExtra("position", position);

            startActivity(intent);
        });
    }
}
/*
    private void setInitialData(){

        herons.add(new State ("2 DAYS NO LEAN", R.drawable.twodays));
        herons.add(new State ("4 DAYS AFTER HB", R.drawable.hb));
        herons.add(new State ("4 MONTHS NO SMOKE", R.drawable.smoke));
        herons.add(new State ("Bandit Petersburg", R.drawable.bandit));
        herons.add(new State ("DREAMS MONEY CAN BUY", R.drawable.dmcb));
        herons.add(new State ("NO COMMERCIAL LYRICS", R.drawable.no));
        herons.add(new State ("ODYSSEY", R.drawable.ody));
    }
}*/
