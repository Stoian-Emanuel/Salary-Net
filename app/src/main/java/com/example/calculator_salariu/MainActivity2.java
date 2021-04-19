package com.example.calculator_salariu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        String salariu = String.valueOf(intent.getIntExtra("SALARY", 0));
        String salariu_euro = String.valueOf(intent.getIntExtra("SAL_EURO", 0));

        String salariu_net = String.valueOf(intent.getIntExtra("NET_SALARY", 0));
        String salariu_net_euro = String.valueOf(intent.getIntExtra("SAL_NET_EURO", 0));


        String cas = String.valueOf(intent.getIntExtra("CAS", 0));
        String cas_euro = String.valueOf(intent.getIntExtra("CAS_EURO", 0));

        String cass = String.valueOf(intent.getIntExtra("CASS", 0));
        String cass_euro = String.valueOf(intent.getIntExtra("CASS_EURO", 0));

        String impozit = String.valueOf(intent.getIntExtra("IMPOZIT", 0));
        String impozit_euro = String.valueOf(intent.getIntExtra("IMPOZIT_EURO", 0));


        TextView afis_sal = findViewById(R.id.txtVw_getSalBr);
        TextView afis_sal_euro = findViewById(R.id.txtVw_getSalBrEuro);

        TextView afis_net_sal = findViewById(R.id.txtVw_getSalNet);
        TextView afis_net_sal_euro = findViewById(R.id.txtVw_getSalNetEuro);

        TextView afis_CAS = findViewById(R.id.txtVw_getCAS);
        TextView afis_CAS_euro = findViewById(R.id.txtVw_getCasEuro);

        TextView afis_CASS = findViewById(R.id.txtVw_getCASS);
        TextView afis_CASS_euro = findViewById(R.id.txtVw_getCassEuro);

        TextView afis_impozit = findViewById(R.id.txtVw_getImpozit);
        TextView afis_impozit_euro = findViewById(R.id.txtVw_getImpozitEuro);


        afis_sal.setText(salariu);
        afis_sal_euro.setText(salariu_euro);

        afis_net_sal.setText(salariu_net);
        afis_net_sal_euro.setText(salariu_net_euro);

        afis_CAS.setText(cas);
        afis_CAS_euro.setText(cas_euro);

        afis_CASS.setText(cass);
        afis_CASS_euro.setText(cass_euro);

        afis_impozit.setText(impozit);
        afis_impozit_euro.setText(impozit_euro);

    }
}