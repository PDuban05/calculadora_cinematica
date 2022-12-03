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
        kilowatt.addTextChangedListener(changekilowatt);
        watt.addTextChangedListener(changewatt);
        miliwatt.addTextChangedListener(changemiliwatt);
        cv.addTextChangedListener(changecv);
        btu_hora.addTextChangedListener(changebtu_hora);
        caloria_hora.addTextChangedListener(changecaloria_hora);
        pie_libra_hora.addTextChangedListener(changepielibra_hora);
        joule_segundo.addTextChangedListener(changejoule_segundo);
        ergio_segundo.addTextChangedListener(changeergio_segundo);


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

    public TextWatcher changekilowatt = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            kilowatt1 = kilowatt.getText().toString();
            boolean val = kilowatt.isFocused();
            try {
                if(!kilowatt1.isEmpty() && val ==true){

                    megawatt.setText(String.valueOf(parseDouble( kilowatt1) * 0.001));
                    watt.setText(String.valueOf(parseDouble( kilowatt1) * 1000 ));
                    miliwatt.setText(String.valueOf(parseDouble( kilowatt1) * 1000000));
                    cv.setText(String.valueOf(parseDouble( kilowatt1) * 1.341));
                    btu_hora.setText(String.valueOf(parseDouble( kilowatt1) * 3412.1416));
                    caloria_hora.setText(String.valueOf(parseDouble( kilowatt1) * 859845.7374));
                    pie_libra_hora.setText(String.valueOf(parseDouble( kilowatt1) * 2655223.7374 ));
                    joule_segundo.setText(String.valueOf(parseDouble( kilowatt1) * 1000));
                    ergio_segundo.setText(String.valueOf(parseDouble( kilowatt1) * (1 * Math.pow(10,10))));

                }else if(kilowatt1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!kilowatt1.isEmpty()){
                        String newcadena = kilowatt1.substring ( 0, kilowatt1.length() - 1 );
                        kilowatt.setText(newcadena);
                        kilowatt.setSelection(kilowatt.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = kilowatt1.substring ( 0, kilowatt1.length() - 2 );
                    kilowatt.setText(newcadena);
                    kilowatt.setSelection(kilowatt.getText().length());
                }
            }

        }
    };

    public TextWatcher changewatt = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            watt1 = watt.getText().toString();
            boolean val = watt.isFocused();
            try {
                if(!watt1.isEmpty() && val ==true){

                    megawatt.setText(String.valueOf(parseDouble( watt1) * (1 * Math.pow(10,-6))));
                    kilowatt.setText(String.valueOf(parseDouble( watt1) *  0.001 ));
                    miliwatt.setText(String.valueOf(parseDouble( watt1) * 1000));
                    cv.setText(String.valueOf(parseDouble( watt1) * 0.0013));
                    btu_hora.setText(String.valueOf(parseDouble( watt1) * 3.4121));
                    caloria_hora.setText(String.valueOf(parseDouble( watt1) * 859.8452));
                    pie_libra_hora.setText(String.valueOf(parseDouble( watt1) * 2655.2237));
                    joule_segundo.setText(String.valueOf(parseDouble( watt1) * 1));
                    ergio_segundo.setText(String.valueOf(parseDouble( watt1) * (1 * Math.pow(10,7))));

                }else if(watt1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!watt1.isEmpty()){
                        String newcadena = watt1.substring ( 0, watt1.length() - 1 );
                        watt.setText(newcadena);
                        watt.setSelection(watt.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = watt1.substring ( 0, watt1.length() - 2 );
                    watt.setText(newcadena);
                    watt.setSelection(watt.getText().length());
                }
            }

        }
    };

    public TextWatcher changemiliwatt = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            miliwatt1 = miliwatt.getText().toString();
            boolean val = miliwatt.isFocused();
            try {
                if(!miliwatt1.isEmpty() && val ==true){

                    miliwatt.setText(String.valueOf(parseDouble( miliwatt1) * (1 * Math.pow(10,-9))));
                    kilowatt.setText(String.valueOf(parseDouble( miliwatt1) *(1 * Math.pow(10,-6)) ));
                    watt.setText(String.valueOf(parseDouble( miliwatt1) * 0.001));
                    cv.setText(String.valueOf(parseDouble( miliwatt1) * (1.341 * Math.pow(10,-6))));
                    btu_hora.setText(String.valueOf(parseDouble( miliwatt1) * 0.0034 ));
                    caloria_hora.setText(String.valueOf(parseDouble( miliwatt1) * 0.8598));
                    pie_libra_hora.setText(String.valueOf(parseDouble( miliwatt1) * 2.6552));
                    joule_segundo.setText(String.valueOf(parseDouble( miliwatt1) * 0.001));
                    ergio_segundo.setText(String.valueOf(parseDouble( miliwatt1) * 10000));

                }else if(miliwatt1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!miliwatt1.isEmpty()){
                        String newcadena = miliwatt1.substring ( 0, miliwatt1.length() - 1 );
                        miliwatt.setText(newcadena);
                        miliwatt.setSelection(miliwatt.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = miliwatt1.substring ( 0, miliwatt1.length() - 2 );
                    miliwatt.setText(newcadena);
                    miliwatt.setSelection(miliwatt.getText().length());
                }
            }

        }
    };

    public TextWatcher changecv = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            cv1 = cv.getText().toString();
            boolean val = cv.isFocused();
            try {
                if(!cv1.isEmpty() && val ==true){

                    megawatt.setText(String.valueOf(parseDouble( cv1) * (7.457 * Math.pow(10,-4))));
                    kilowatt.setText(String.valueOf(parseDouble( cv1) * 0.7457 ));
                    watt.setText(String.valueOf(parseDouble( cv1) * 745.6999));
                    miliwatt.setText(String.valueOf(parseDouble( cv1) * 745699.8716));
                    btu_hora.setText(String.valueOf(parseDouble( cv1) * 2544.4336 ));
                    caloria_hora.setText(String.valueOf(parseDouble( cv1) * 641186.476));
                    pie_libra_hora.setText(String.valueOf(parseDouble( cv1) * 1980000));
                    joule_segundo.setText(String.valueOf(parseDouble( cv1) * 745.6999));
                    ergio_segundo.setText(String.valueOf(parseDouble( cv1) * (7.457 * Math.pow(10,9))));

                }else if(cv1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!cv1.isEmpty()){
                        String newcadena = cv1.substring ( 0, cv1.length() - 1 );
                        cv.setText(newcadena);
                        cv.setSelection(cv.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = cv1.substring ( 0, cv1.length() - 2 );
                    cv.setText(newcadena);
                    cv.setSelection(cv.getText().length());
                }
            }

        }
    };

    public TextWatcher changebtu_hora = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            btu_hora1 = btu_hora.getText().toString();
            boolean val = btu_hora.isFocused();
            try {
                if(!btu_hora1.isEmpty() && val ==true){

                    megawatt.setText(String.valueOf(parseDouble( btu_hora1) * (2.9307 * Math.pow(10,-7))));
                    kilowatt.setText(String.valueOf(parseDouble( btu_hora1) * (2.9307 * Math.pow(10,-4)) ));
                    watt.setText(String.valueOf(parseDouble( btu_hora1) * 0.2931));
                    miliwatt.setText(String.valueOf(parseDouble( btu_hora1) * 293.0711));
                    cv.setText(String.valueOf(parseDouble( btu_hora1) * (3.930 * Math.pow(10,-4)) ));
                    caloria_hora.setText(String.valueOf(parseDouble( btu_hora1) * 251.9958 ));
                    pie_libra_hora.setText(String.valueOf(parseDouble( btu_hora1) * 778.1693));
                    joule_segundo.setText(String.valueOf(parseDouble( btu_hora1) * 0.2931));
                    ergio_segundo.setText(String.valueOf(parseDouble( btu_hora1) * 2930710.7017));

                }else if(btu_hora1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!btu_hora1.isEmpty()){
                        String newcadena = btu_hora1.substring ( 0, btu_hora1.length() - 1 );
                        btu_hora.setText(newcadena);
                        btu_hora.setSelection(btu_hora.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = btu_hora1.substring ( 0, btu_hora1.length() - 2 );
                    btu_hora.setText(newcadena);
                    btu_hora.setSelection(btu_hora.getText().length());
                }
            }

        }
    };

    public TextWatcher changecaloria_hora = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            caloria_hora1 = caloria_hora.getText().toString();
            boolean val = caloria_hora.isFocused();
            try {
                if(!caloria_hora1.isEmpty() && val ==true){

                    megawatt.setText(String.valueOf(parseDouble( caloria_hora1) * (1.163 * Math.pow(10,-9))));
                    kilowatt.setText(String.valueOf(parseDouble( caloria_hora1) * (1.163 * Math.pow(10,-6)) ));
                    watt.setText(String.valueOf(parseDouble( caloria_hora1) * 0.0012));
                    miliwatt.setText(String.valueOf(parseDouble( caloria_hora1) * 1.163));
                    cv.setText(String.valueOf(parseDouble( caloria_hora1) * (1.5596 * Math.pow(10,-6)) ));
                    btu_hora.setText(String.valueOf(parseDouble( caloria_hora1) * 0.004 ));
                    pie_libra_hora.setText(String.valueOf(parseDouble( caloria_hora1) * 3.088));
                    joule_segundo.setText(String.valueOf(parseDouble( caloria_hora1) * 0.0012));
                    ergio_segundo.setText(String.valueOf(parseDouble( caloria_hora1) * 11630));

                }else if(caloria_hora1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!caloria_hora1.isEmpty()){
                        String newcadena = caloria_hora1.substring ( 0, caloria_hora1.length() - 1 );
                        caloria_hora.setText(newcadena);
                        caloria_hora.setSelection(caloria_hora.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = caloria_hora1.substring ( 0, caloria_hora1.length() - 2 );
                    caloria_hora.setText(newcadena);
                    caloria_hora.setSelection(caloria_hora.getText().length());
                }
            }

        }
    };

    public TextWatcher changepielibra_hora = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            pie_libra_hora1 = pie_libra_hora.getText().toString();
            boolean val = pie_libra_hora.isFocused();
            try {
                if(!pie_libra_hora1.isEmpty() && val ==true){

                    megawatt.setText(String.valueOf(parseDouble( pie_libra_hora1) * (3.7662 * Math.pow(10,-10))));
                    kilowatt.setText(String.valueOf(parseDouble( pie_libra_hora1) * (3.7662 * Math.pow(10,-7)) ));
                    watt.setText(String.valueOf(parseDouble( pie_libra_hora1) * (3.7662 * Math.pow(10,-4))));
                    miliwatt.setText(String.valueOf(parseDouble( pie_libra_hora1) * 0.3766));
                    cv.setText(String.valueOf(parseDouble( pie_libra_hora1) * (5.0505 * Math.pow(10,-7)) ));
                    btu_hora.setText(String.valueOf(parseDouble( pie_libra_hora1) * 0.0013 ));
                    caloria_hora.setText(String.valueOf(parseDouble( pie_libra_hora1) * 0.3238));
                    joule_segundo.setText(String.valueOf(parseDouble( pie_libra_hora1) * (3.7662 * Math.pow(10,-4))));
                    ergio_segundo.setText(String.valueOf(parseDouble( pie_libra_hora1) * 3766.161));

                }else if(pie_libra_hora1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!pie_libra_hora1.isEmpty()){
                        String newcadena = pie_libra_hora1.substring ( 0, pie_libra_hora1.length() - 1 );
                        pie_libra_hora.setText(newcadena);
                        pie_libra_hora.setSelection(pie_libra_hora.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = pie_libra_hora1.substring ( 0, pie_libra_hora1.length() - 2 );
                    pie_libra_hora.setText(newcadena);
                    pie_libra_hora.setSelection(pie_libra_hora.getText().length());
                }
            }

        }
    };

    public TextWatcher changejoule_segundo = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            joule_segundo1 = joule_segundo.getText().toString();
            boolean val = joule_segundo.isFocused();
            try {
                if(!joule_segundo1.isEmpty() && val ==true){

                    megawatt.setText(String.valueOf(parseDouble( joule_segundo1) * (1 * Math.pow(10,-6))));
                    kilowatt.setText(String.valueOf(parseDouble( joule_segundo1) * 0.001 ));
                    watt.setText(String.valueOf(parseDouble( joule_segundo1) * 1 ));
                    miliwatt.setText(String.valueOf(parseDouble( joule_segundo1) * 1000));
                    cv.setText(String.valueOf(parseDouble( joule_segundo1) * 0.0013 ));
                    btu_hora.setText(String.valueOf(parseDouble( joule_segundo1) * 3.4121 ));
                    caloria_hora.setText(String.valueOf(parseDouble( joule_segundo1) * 859.8452));
                    pie_libra_hora.setText(String.valueOf(parseDouble( joule_segundo1) * 2655.2237));
                    ergio_segundo.setText(String.valueOf(parseDouble( joule_segundo1) * (1 * Math.pow(10,7))));

                }else if(joule_segundo1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!joule_segundo1.isEmpty()){
                        String newcadena = joule_segundo1.substring ( 0, joule_segundo1.length() - 1 );
                        joule_segundo.setText(newcadena);
                        joule_segundo.setSelection(joule_segundo.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = joule_segundo1.substring ( 0, joule_segundo1.length() - 2 );
                    joule_segundo.setText(newcadena);
                    joule_segundo.setSelection(joule_segundo.getText().length());
                }
            }

        }
    };

    public TextWatcher changeergio_segundo = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            ergio_segundo1 = ergio_segundo.getText().toString();
            boolean val = ergio_segundo.isFocused();
            try {
                if(!ergio_segundo1.isEmpty() && val ==true){

                    megawatt.setText(String.valueOf(parseDouble( ergio_segundo1) * (10 * Math.pow(10,-14))));
                    kilowatt.setText(String.valueOf(parseDouble( ergio_segundo1) *  (1 * Math.pow(10,-10)) ));
                    watt.setText(String.valueOf(parseDouble( ergio_segundo1) *  (1 * Math.pow(10,-7)) ));
                    miliwatt.setText(String.valueOf(parseDouble( ergio_segundo1) *  (10 * Math.pow(10,-5))));
                    cv.setText(String.valueOf(parseDouble( ergio_segundo1) *  (1.341 * Math.pow(10,-10)) ));
                    btu_hora.setText(String.valueOf(parseDouble( ergio_segundo1) *  (3.4121 * Math.pow(10,-7)) ));
                    caloria_hora.setText(String.valueOf(parseDouble( ergio_segundo1) * (8.5985 * Math.pow(10,-5))));
                    pie_libra_hora.setText(String.valueOf(parseDouble( ergio_segundo1) * (2.6552 * Math.pow(10,-4))));
                    joule_segundo.setText(String.valueOf(parseDouble( ergio_segundo1) * (1 * Math.pow(10,7))));

                }else if(ergio_segundo1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!ergio_segundo1.isEmpty()){
                        String newcadena = ergio_segundo1.substring ( 0, ergio_segundo1.length() - 1 );
                        ergio_segundo.setText(newcadena);
                        ergio_segundo.setSelection(ergio_segundo.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = ergio_segundo1.substring ( 0, ergio_segundo1.length() - 2 );
                    ergio_segundo.setText(newcadena);
                    ergio_segundo.setSelection(ergio_segundo.getText().length());
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