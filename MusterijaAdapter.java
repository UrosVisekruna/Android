package uros.chemdry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Uros on 2/7/2017.
 */
public class MusterijaAdapter extends BaseAdapter {
    ArrayList<Musterija> ListaMusterija = new ArrayList<Musterija>();
    Context context;


    public MusterijaAdapter(Context c) {
        this.context = c;
    }

    protected void addItem(Musterija m){

        ListaMusterija.add(m);
    }

    @Override
    public int getCount() {
        return ListaMusterija.size();
    }

    @Override
    public Object getItem(int position) {
        return ListaMusterija.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Musterija musterija = ListaMusterija.get(position);

        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.sadrzaj_liste, null);

        TextView IME=(TextView) v.findViewById(R.id.textIme);
        IME.setText(musterija.imeMusterije);


        TextView PREZIME=(TextView) v.findViewById(R.id.textPrezime);
        PREZIME.setText(musterija.prezimeMusterije);


        TextView ADRESA=(TextView) v.findViewById(R.id.textAdresa);
        ADRESA.setText(musterija.adresaMusterije);


        TextView BROJ=(TextView) v.findViewById(R.id.textTelefon);
        BROJ.setText(musterija.brTelMusterije);

        TextView USLUGA=(TextView) v.findViewById(R.id.tektUsluga);
        USLUGA.setText(musterija.uslugaMusteriji);




        return v;
    }
}
