package com.example.a1126;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Face_Page extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,back_btn;
    private TextView result_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face__page);
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
            result_txt.setText("症狀:眼睛痠痛\n可能狀況:眼壓過高、用眼過度\n解決方法:閉目休息，勿長時間使用手機、看電視");
        }
    };
    private View.OnClickListener bEvent2 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:視力模糊\n可能症狀:青光眼\n解決方法:立即尋求眼科醫師幫助");
        }
    };
    private View.OnClickListener bEvent3 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:鼻塞流鼻水\n可能狀況:過敏、感冒\n解決方法:出外務必配戴口罩，或是尋求耳鼻喉科醫師協助，服用抗組織胺等藥物");
        }
    };
    private View.OnClickListener bEvent4 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:皮膚搔癢\n可能狀況:季節性敏感\n解決方法:多補充水分及擦乳液，洗臉時勿用太熱的水，若病情嚴重請尋求皮膚科醫生協助");
        }
    };
    private View.OnClickListener bEvent5 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:牙齒疼痛\n可能狀況:蛀牙\n解決方法:保持口腔及牙齒清潔，飯後記得使用牙線清理牙縫，並立即尋求牙科醫生協助");
        }
    };
    private View.OnClickListener bEvent6 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:牙齦流血\n可能狀況:牙周病\n解決方法:立即尋求牙科醫生協助，並定期回診");
        }
    };
    private View.OnClickListener bEvent_goback = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Face_Page.this.finish();
        }
    };
}
