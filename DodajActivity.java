package uros.chemdry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

public class DodajActivity extends Activity implements View.OnClickListener,AdapterView.OnItemClickListener{

    private Button sacuvajDugme;

    public EditText pokupiIme;
    public EditText pokupiPrezime;
    public EditText pokupiAdresu;
    public EditText pokupiBrTelefona;
    public Spinner pokupiUslugu;

    Musterija musterija;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodaj);




        sacuvajDugme = (Button) findViewById(R.id.sacuvaj);
        sacuvajDugme.setOnClickListener(this);

        pokupiIme = (EditText) findViewById(R.id.imeEdit);
        pokupiPrezime = (EditText) findViewById(R.id.prezimeEdit);
        pokupiAdresu = (EditText) findViewById(R.id.adresaEdit);
        pokupiBrTelefona = (EditText) findViewById(R.id.telefonEdit);
        pokupiUslugu = (Spinner) findViewById(R.id.spinner);


        musterija = new Musterija("Uros", null, null, null, null);



    }

    @Override
    public void onClick(View v) {


        if(v == sacuvajDugme){


        String proslediIme = pokupiIme.getText().toString();
        String proslediPrezime = pokupiPrezime.getText().toString();
        String proslediAdresu = pokupiAdresu.getText().toString();
        String proslediBrTelefona = pokupiBrTelefona.getText().toString();

            musterija.setImeMusterije(proslediIme);
            musterija.setPrezimeMusterije(proslediPrezime);
            musterija.setAdresaMusterije(proslediAdresu);
            musterija.setBrTelMusterije(proslediBrTelefona);

            Log.d("IME", musterija.getImeMusterije());


            Intent intent = new Intent(this, MusterijeActivity.class);
            startActivity(intent);

        }

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



    }
}
