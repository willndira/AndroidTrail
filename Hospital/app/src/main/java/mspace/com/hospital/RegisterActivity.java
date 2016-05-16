package mspace.com.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText etFullnames , etUsername ,etEmail ,etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etFullnames = (EditText)findViewById(R.id.eTfullNames);
        etEmail = (EditText)findViewById(R.id.eTemail);
        etUsername = (EditText)findViewById(R.id.etUsername);
        etPassword = (EditText)findViewById(R.id.eTpassword);



    }
}
