package com.example.a1126;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaRecorder;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Body_Page extends AppCompatActivity {
    private boolean busy;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,back_btn;
    private TextView result_txt;
    private TextView resultText;
    TextView textResult;
    ImageButton record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body__page);
        initUI();

        setListener();
    }
    private void initUI(){
        busy = false;
        textResult = findViewById(R.id.textView);
        record = findViewById(R.id.btn_record);
        resultText = findViewById(R.id.resultText);
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
            result_txt.setText("症狀:下腹痛\n可能狀況:腸梗阻、闌尾炎、便秘\n解決方法:若為急性疼痛立即尋求專業醫師協助，若為便祕影起的疼痛可以適度按摩肚臍旁三指的穴道促進腸子蠕動");
        }
    };
    private View.OnClickListener bEvent2 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:胃痛\n可能狀況:脹氣、胃炎\n解決方法:若有服用會造成胃炎的激素類藥物請先停止，並尋求醫師協助。若為脹氣則適度按摩肚臍周圍的穴道");
        }
    };
    private View.OnClickListener bEvent3 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:胸痛\n可能症狀:急性心肌梗塞、心包膜疾病、主動脈剝離\n解決方法:請緊急尋求醫師協助");
        }
    };
    private View.OnClickListener bEvent4 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:腰痛\n可能症狀:腰部肌肉疲勞、脊柱骨質增生等疾病\n解決方法:保持良好坐姿，適度運動，並尋求醫師協助");
        }
    };
    private View.OnClickListener bEvent5 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:背痛\n可能症狀:背部肌肉疲勞、脊柱骨質增生等疾病\n解決方法:保持良好坐姿，適度運動，並尋求醫師協助");
        }
    };
    private View.OnClickListener bEvent6 = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            result_txt.setText("症狀:心臟痛\n可能症狀:心絞痛、心肌梗塞\n解決方法:請緊急尋求醫師協助");
        }
    };
    private View.OnClickListener bEvent_goback = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Body_Page.this.finish();
        }
    };

}
