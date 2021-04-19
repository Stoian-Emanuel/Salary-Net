package com.example.calculator_salariu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int taxe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= findViewById(R.id.button);
        final EditText sal= findViewById(R.id.edTxt_salariu);
        TextView CAS = findViewById(R.id.txtVw_getCAS);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double euro_curs =4.91;


                int s = Integer.parseInt(sal.getText().toString());
                int s_eur = (int) (s / euro_curs);

                int cas = (int) (s * (25.0f / 100.0f));
                int cas_eur = (int) (cas / euro_curs);

                int cass = (int) (s * (10.0f / 100.0f));
                int cass_eur = (int) (cass / euro_curs);



                int impozit =  (int) (s * (32.0f / cas));
                int impozit_eur = (int) (impozit / euro_curs);

                taxe = cas + cass + impozit;


                int s_net = s - taxe;
                int s_net_eur = (int) (s_net / euro_curs);




                Intent intent = new Intent(MainActivity.this, MainActivity2.class);







                intent.putExtra("SALARY", s);
                intent.putExtra("SAL_EURO", s_eur);

                intent.putExtra("NET_SALARY", s_net);
                intent.putExtra("SAL_NET_EURO", s_net_eur);



                intent.putExtra("CAS", cas);
                intent.putExtra("CAS_EURO", cas_eur);

                intent.putExtra("CASS", cass);
                intent.putExtra("CASS_EURO", cass_eur);

                intent.putExtra("IMPOZIT", impozit);
                intent.putExtra("IMPOZIT_EURO", impozit_eur);

                startActivity(intent);



            }
        });
    }
}