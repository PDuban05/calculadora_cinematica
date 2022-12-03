package com.calculadorasdefisica.convertidordeunidades;

import static java.lang.Double.parseDouble;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.convertidordeunidades.R;


public class poder extends Fragment {

    EditText megawatt,kilowatt,watt,miliwatt,cv,btu_hora,caloria_hora,pie_libra_hora,joule_segundo,ergio_segundo;
    String megawatt1,kilowatt1,watt1,miliwatt1,cv1,btu_hora1,caloria_hora1,pie_libra_hora1,joule_segundo1,ergio_segundo1;



    public poder() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_poder, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        megawatt = view.findViewById(R.id.megawatt);
        kilowatt = view.findViewById(R.id.kilowatt);
        watt = view.findViewById(R.id.watt);
        miliwatt = view.findViewById(R.id.miliwatt);
        cv = view.findViewById(R.id.cv);
        btu_hora = view.findViewById(R.id.btu_hora);
        caloria_hora = view.findViewById(R.id.caloria_hora);
        pie_libra_hora = view.findViewById(R.id.pie_libra_hora);
        joule_segundo = view.findViewById(R.id.joule_segundo);
        ergio_segundo = view.findViewById(R.id.ergio_segundo);


        megawatt.addTextChangedListener(changemegawatt);

    }

    public TextWatcher changemegawatt = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            megawatt1 = megawatt.getText().toString();
            boolean val = megawatt.isFocused();
            try {
                if(!megawatt1.isEmpty() && val ==true){

                    kilowatt.setText(String.valueOf(parseDouble( megawatt1) * 1000));
                    watt.setText(String.valueOf(parseDouble( megawatt1) * 1000000 ));
                    miliwatt.setText(String.valueOf(parseDouble( megawatt1) * (1 * Math.pow(10,9))));
                    cv.setText(String.valueOf(parseDouble( megawatt1) * 1341.0221));
                    btu_hora.setText(String.valueOf(parseDouble( megawatt1) * 3412141.6331));
                    caloria_hora.setText(String.valueOf(parseDouble( megawatt1) * (8.5985 *Math.pow(10,8))));
                    pie_libra_hora.setText(String.valueOf(parseDouble( megawatt1) * (2.6552 *Math.pow(10,9)) ));
                    joule_segundo.setText(String.valueOf(parseDouble( megawatt1) * 1000000));
                    ergio_segundo.setText(String.valueOf(parseDouble( megawatt1) * (1 *Math.pow(10,13))));

                }else if(megawatt1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!megawatt1.isEmpty()){
                        String newcadena = megawatt1.substring ( 0, megawatt1.length() - 1 );
                        megawatt.setText(newcadena);
                        megawatt.setSelection(megawatt.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = megawatt1.substring ( 0, megawatt1.length() - 2 );
                    megawatt.setText(newcadena);
                    megawatt.setSelection(megawatt.getText().length());
                }
            }

        }
    };

    public void limpiar(){

        megawatt.getText().clear();
        kilowatt.getText().clear();
        watt.getText().clear();
        miliwatt.getText().clear();
        cv.getText().clear();
        btu_hora.getText().clear();
        caloria_hora.getText().clear();
        pie_libra_hora.getText().clear();
        joule_segundo.getText().clear();
        ergio_segundo.getText().clear();

    }




}