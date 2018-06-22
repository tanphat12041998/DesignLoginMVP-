package com.example.nguye.designlogin.Model_User.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import com.example.nguye.designlogin.Model_User.Presenter.Presenter;
import com.example.nguye.designlogin.R;


public class MainActivity extends AppCompatActivity implements MainView {
    private Button btnClick;
    private EditText editTextUserName, editTextPassword;
    private TextView error;
    private Presenter presenter;

    protected void onCreate(final Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        Init();

        presenter = new Presenter(MainActivity.this);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.CheckLogin(editTextUserName.getText().toString(), editTextPassword.getText().toString());
            }
        });
    }
//    public void LoginSuccess(){
//        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//        startActivity(intent);
//    }
//    public void LoginFail(){
//        error.setText("irrconrect Username or Password");
//    }
    public void Init(){
        btnClick            = (Button) findViewById(R.id.buttonClick1);
        editTextUserName    = (EditText)findViewById(R.id.editTextUserName);
        editTextPassword    = (EditText)findViewById(R.id.editTextPassword);
        error               = (TextView)findViewById(R.id.textView2);
    }

    @Override
    public void LoginSuccess() {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void LoginFail() {
        error.setText("Incorrect Username or Pasword");
    }
}
