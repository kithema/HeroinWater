package com.example.heroinwater;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {
    String[] songs = {"2 DAYS NO LEAN","4 DAYS AFTER HB","4 MONTHS NO SMOKE","Bandit Petersburg","DREAMS MONEY CAN BUY", "NO COMMERCIAL LYRICS", "ODYSSEY" };
    int[] Images ={R.drawable.twodays, R.drawable.hb, R.drawable.smoke,R.drawable.bandit,R.drawable.dmcb, R.drawable.no, R.drawable.ody};
    String[] descriptions = {"Гана\n Забудь\nХайперпоп\n2к16\nБла-бла-бла\nЧёрная экономика\nБожественный план",
            "Эклер\nНагреваю",
            "Не Нужна\nSay What’s Real Freestyle",
            "Пхат\nНикогда\nСтарая волна\nНожик\nR.I.P. interlude\nЗависима\nТы так проста\nШоути лил бич\nХмурый\nСвобода\nДриллеры \nУблюдки \nДжанки \nПлен \nHero in Water\n",
            "Не вернуть\n2033\nЗависим\nМяу\nЛюбить буду\nРок стар\n 2 ЧАСА НОЧИ\nСоло + BUSHIDO ZHO\nМного\nОдин шаг\n Ща нормально\nСегодня\nВсё дизайнер\n Пугали\nНЕ ВЕЗЁТ",
            "В миноре\nНаряд\nPROJECT X\nНа ужин\nПромо + DooMee\nСимп\nОдаривает\nСо сцены\nПробки",
            "Чёрный лебедь\nНе помню\nСияешь 934-8777\n Во плоти\n Блики\nПротив ветра\nТайны\nDreamin Freestyle\nСваровски\nХай хилс + DooMee\nСдержал слово\n До замка\nЗамер\nЦентр\n Не тот парень"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView titleTextView = findViewById(R.id.titleTextView);
        ImageView planetImageView = findViewById(R.id.ImageView);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);

        int position = getIntent().getIntExtra("position", 0);

        titleTextView.setText(songs[position]);

        planetImageView.setImageResource(Images[position]);

        descriptionTextView.setText(descriptions[position]);
    }
}