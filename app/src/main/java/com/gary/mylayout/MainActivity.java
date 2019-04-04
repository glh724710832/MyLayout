package com.gary.mylayout;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText usernameEt;
    EditText pwdEt;
    Button loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day03);
        initView();
    }

    private void initView(){
        usernameEt = findViewById(R.id.username_et);
        pwdEt = findViewById(R.id.pwd_et);

        loginBtn = findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(usernameEt.getText().toString())){
                    Toast.makeText(getApplicationContext(),"账号不能为空，请输入您的账号！",Toast.LENGTH_SHORT).show();
                }else if(TextUtils.isEmpty(pwdEt.getText().toString())){
                    Toast.makeText(getApplicationContext(),"密码不能为空，请输入您的密码！",Toast.LENGTH_SHORT).show();
                }else{
                    if(usernameEt.getText().toString().length() != 11){
                        Toast.makeText(getApplicationContext(),"请输入有效的手机号码！",Toast.LENGTH_SHORT).show();
                    }else if(pwdEt.getText().toString().length() < 6){
                        Toast.makeText(getApplicationContext(),"密码必须大于6位！",Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "用户名:" + usernameEt.getText().toString() + "  密码：" + pwdEt.getText().toString(), Toast.LENGTH_SHORT).show();
                    }
                }

//                Toast.makeText(getApplicationContext(),"点击了登录123213213",Toast.LENGTH_SHORT).show();

//                Log.w("监听","用户点击了登录按钮");
//
//                Log.e("用户名：",usernameEt.getText().toString());
//
//                Log.e("密码：",pwdEt.getText().toString());






            }
        });



    }
}
