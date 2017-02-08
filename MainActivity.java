package uros.chemdry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{



    private Button DodajButton;
    private Button ListaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DodajButton = (Button) findViewById(R.id.dodaj);
        DodajButton.setOnClickListener(this);

        ListaButton = (Button) findViewById(R.id.lista);
        ListaButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == DodajButton) {

            Intent intent = new Intent(this, DodajActivity.class);
            startActivity(intent);
        } else if (v == ListaButton) {

            Intent intent = new Intent(this, MusterijeActivity.class);
            startActivity(intent);

        }
    }
}
