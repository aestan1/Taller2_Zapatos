package com.example.android.taller2_zapatos;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    private Resources resources;
    private TextView total;
    private TextView unit;
    private Spinner sexo;
    private Spinner tipo;
    private Spinner marca;
    private String sex[];
    private String tip[];
    private String marc[];
    private EditText cant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        total=(TextView)findViewById(R.id.lblPrecioTotal);
        unit=(TextView)findViewById(R.id.lblPrecioUnitario);
        cant=(EditText)findViewById(R.id.txtCantidad);
        sexo=(Spinner)findViewById(R.id.cmbSexo);
        tipo=(Spinner)findViewById(R.id.cmbTipo);
        marca=(Spinner)findViewById(R.id.cmbMarca);
        resources = this.getResources();
        sex = resources.getStringArray(R.array.sexo);
        tip = resources.getStringArray(R.array.tipo);
        marc = resources.getStringArray(R.array.marca);


        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sex);
        sexo.setAdapter(adapter1);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, tip);
        tipo.setAdapter(adapter2);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, marc);
        marca.setAdapter(adapter3);

    }


    //M  E  T  O  D  O  S
    public boolean validar(){
        int se, ma, ti;
        se = sexo.getSelectedItemPosition();
        ti = tipo.getSelectedItemPosition();
        ma = marca.getSelectedItemPosition();


        if(cant.getText().toString().isEmpty()) {
            cant.setError(resources.getString(R.string.mensaje_error_1));
            return false;
        }

        if(Integer.parseInt(cant.getText().toString()) <= 0) {
            cant.setError(resources.getString(R.string.mensaje_error_1));
            return false;
        }


        if(se==0) {
            Toast.makeText(this, resources.getString(R.string.mensaje_error_2), Toast.LENGTH_SHORT ).show();
            return false;
        }
        if(ti==0) {
            Toast.makeText(this, resources.getString(R.string.mensaje_error_3), Toast.LENGTH_SHORT ).show();
            return false;
        }
        if(ma==0) {
            Toast.makeText(this, resources.getString(R.string.mensaje_error_4), Toast.LENGTH_SHORT ).show();
            return false;
        }
        return true;
    }

    public void calcular (View v){
        double  resultado=0, compraTotal=0;
        int se, ma, ti, can;
        total.setText("");
        if(validar()) {
            se = sexo.getSelectedItemPosition();
            ti = tipo.getSelectedItemPosition();
            ma = marca.getSelectedItemPosition();



            can = Integer.parseInt(cant.getText().toString());


            if(se==1 && ti==1 && ma==1){
                resultado=120000;
            }

            else if(se==1 && ti==1 && ma==2){
                resultado=140000;
            }

            else if(se==1 && ti==1 && ma==3){
                resultado=130000;
            }

            else if(se==1 && ti==2 && ma==1){
                resultado=50000;
            }

            else if(se==1 && ti==2 && ma==2){
                resultado=80000;
            }

            else if(se==1 && ti==2 && ma==3){
                resultado=100000;
            }

            else if(se==2 && ti==1 && ma==1){
                resultado=100000;
            }

            else if(se==2 && ti==1 && ma==2){
                resultado=130000;
            }

            else if(se==2 && ti==1 && ma==3){
                resultado=110000;
            }

            else if(se==2 && ti==2 && ma==1){
                resultado=60000;
            }

            else if(se==2 && ti==2 && ma==2){
                resultado=70000;
            }

            else if(se==2 && ti==2 && ma==3){
                resultado=120000;
            }

            compraTotal=resultado;
            compraTotal= compraTotal*can;

                unit.setText("$: " + String.format("%.0f", resultado));
                total.setText("$: "+ String.format("%.0f", compraTotal));

        }
    }

    public void limpiar (View v){
        total.setText("");
        unit.setText("");
        cant.setText("");
        sexo.setSelection(0);
        tipo.setSelection(0);
        marca.setSelection(0);

    }


}
