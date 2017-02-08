package uros.chemdry;

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MusterijeActivity extends Activity implements AdapterView.OnItemClickListener, View.OnClickListener {

    MusterijaAdapter adapter;
    Musterija musterija;

    private LinearLayout pozadina;
    private CheckBox placeno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musterije);


        pozadina = (LinearLayout) findViewById(R.id.probaID);
        placeno = (CheckBox) findViewById(R.id.checkBox);

        adapter = new MusterijaAdapter(this);

        //Zakucane vrednosti cisto da vidim da nesto ubacuje u listu


        Musterija karakter=new  Musterija("Uros","Visekruna","Karadjordjeva 1","0695383606", "Kamion");
        adapter.addItem(karakter);




        ListView list= (ListView) findViewById(R.id.ListaID);
        list.setAdapter(adapter);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {






    }


    @Override
    public void onClick(View v) {


    }
}
