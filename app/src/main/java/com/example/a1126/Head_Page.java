package com.example.a1126;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Head_Page extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,back_btn;
    private TextView result_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head__page);
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
            result_txt.setText("症狀:頭脹痛\n可能狀況:高血壓、輕微頭痛\n解決方法:若為高血壓族群請按時服藥回診，若為輕微頭痛則適度休息，避免吹冷風");
        }
    };
    private View.OnClickListener bEvent2 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:偏頭痛\n可能狀況:偏頭痛\n解決方法:避免風寒、噪音並臥床休息，亦可使用溫水浸泡手部，促進血液循和緩解頭痛");
        }
    };
    private View.OnClickListener bEvent3 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:太陽穴、婆子疼痛\n可能症狀:緊縮性頭痛\n解決方法:放鬆心情，避免長時間維持通一個姿勢，若很嚴重請尋求醫師協助，服用肌肉鬆弛劑等藥物");
        }
    };
    private View.OnClickListener bEvent4 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:急性頭痛、發燒\n可能症狀:感染頭痛\n解決方法:尋求醫師協助，服用感冒藥物");
        }
    };
    private View.OnClickListener bEvent5 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:頭痛附帶視力模糊\n可能症狀:青光眼、腦瘤\n解決方法:請立即尋求醫師協助，確認病因");
        }
    };
    private View.OnClickListener bEvent6 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:頭痛伴隨流鼻水\n可能症狀:流感、一般感冒\n解決方法:尋求醫師協助，服用感冒藥物");
        }
    };
    private View.OnClickListener bEvent_goback = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Head_Page.this.finish();
        }
    };
}
