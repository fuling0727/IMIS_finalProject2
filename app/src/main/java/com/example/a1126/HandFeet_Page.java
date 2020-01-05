package com.example.a1126;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HandFeet_Page extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,back_btn;
    private TextView result_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hand_feet__page);
        initUI();
        setListener();
    }
    private void initUI(){
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        result_txt = findViewById(R.id.textView3);
        back_btn = findViewById(R.id.button7);
    }
    private void setListener(){
        btn1.setOnClickListener(bEvent1);
        btn2.setOnClickListener(bEvent2);
        btn3.setOnClickListener(bEvent3);
        btn4.setOnClickListener(bEvent4);
        btn5.setOnClickListener(bEvent5);
        btn6.setOnClickListener(bEvent6);
        back_btn.setOnClickListener(bEvent_goback);
    }
    private View.OnClickListener bEvent1 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:手腕疼痛\n可能狀況:關節炎、扭傷、腱鞘炎\n解決方法:尋求骨科醫師協助，進行藥物治療和物理治療");
        }
    };
    private View.OnClickListener bEvent2 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:髖關節疼痛發熱\n可能狀況:化膿性關節炎\n解決方法:尋求骨科醫師協助，進行藥物治療");
        }
    };
    private View.OnClickListener bEvent3 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:肩膀關節疼痛\n可能狀況:五十肩\n解決方法:尋求骨科醫師協助，進行藥物治療和物理治療");
        }
    };
    private View.OnClickListener bEvent4 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:膝關節疼痛\n可能狀況:關節炎\n解決方法:避免過度使用膝蓋，並尋求骨科醫師協助，進行藥物治療和物理治療");
        }
    };
    private View.OnClickListener bEvent5 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:手指疼痛無發張開\n可能狀況:板機指\n解決方法:可熱敷減輕疼痛，若很嚴重請尋求骨科醫師協助，進行藥物治療和物理治療");
        }
    };
    private View.OnClickListener bEvent6 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:早上時關節疼痛\n可能狀況:類風濕關節炎\n解決方法:進行適度、輕微的活動，並持續配合醫師及物理治療師的治療");
        }
    };
    private View.OnClickListener bEvent_goback = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            HandFeet_Page.this.finish();
        }
    };
}
