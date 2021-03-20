package com.example.sampleconstraintlayout0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    Button btnLogin;
    EditText edemail, edpassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignin);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();
                String email = "hanif@mail.com";
                String pass = "123";

                if (nama.isEmpty() || password.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan password wajib diisi.",
                            Toast.LENGTH_LONG);
                    t.show();
                } else{
                    if (nama.equals(email) && password.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses",
                                Toast.LENGTH_LONG);
                        t.show();

                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());

                        b.putString("b", password.trim());

                        Intent i = new Intent(getApplicationContext(), ActivityHasil.class);

                        i.putExtras(b);

                        startActivity(i);
                    } else{
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Gagal", Toast.LENGTH_LONG);

                        t.show();
                    }
                }

            }
        });
    }
}
