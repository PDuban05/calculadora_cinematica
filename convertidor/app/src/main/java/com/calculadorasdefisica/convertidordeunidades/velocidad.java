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
import android.widget.Button;
import android.widget.EditText;

import com.example.convertidordeunidades.R;


public class velocidad extends Fragment {
    EditText metro_segundo, kilometro_hora,milla_hora,pie_segundo, nudo,mach,velocidad_luz;
    String metro_segundo1, kilometro_hora1,milla_hora1,pie_segundo1, nudo1,mach1,velocidad_luz1;
    public velocidad() {
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
        return inflater.inflate(R.layout.fragment_velocidad, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        metro_segundo = view.findViewById(R.id.metro_segundo);
        kilometro_hora = view.findViewById(R.id.kilometro_hora);
        milla_hora = view.findViewById(R.id.milla_hora);
        pie_segundo = view.findViewById(R.id.pie_segundo);
        nudo = view.findViewById(R.id.nudo);
        mach = view.findViewById(R.id.mach);
        velocidad_luz = view.findViewById(R.id.velocidad_luz);

        metro_segundo.addTextChangedListener(changemetro_segundo);
        kilometro_hora.addTextChangedListener(changekilometro_hora);
        milla_hora.addTextChangedListener(changemilla_hora);
        pie_segundo.addTextChangedListener(changepie_segundo);
        nudo.addTextChangedListener(changenudo);
        mach.addTextChangedListener(changemach);
        velocidad_luz.addTextChangedListener(changevelocidad_luz);

    }

    public TextWatcher changemetro_segundo= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            metro_segundo1 = metro_segundo.getText().toString();
            boolean val = metro_segundo.isFocused();

            try {
                if(!metro_segundo1.isEmpty() && val ==true){

                    kilometro_hora.setText(String.valueOf(parseDouble(metro_segundo1) * 3.6 ));
                    milla_hora.setText(String.valueOf(parseDouble(metro_segundo1) * 2.2369 ));
                    pie_segundo.setText(String.valueOf(parseDouble(metro_segundo1) * 3.2808 ));
                    nudo.setText(String.valueOf(parseDouble(metro_segundo1) * 1.9438 ));
                    mach.setText(String.valueOf(parseDouble(metro_segundo1) * 0.0029 ));
                    velocidad_luz.setText(String.valueOf(parseDouble(metro_segundo1) * (3.3356409519815204 *  Math.pow(10,-9))));

                }else if(metro_segundo1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!metro_segundo1.isEmpty()){
                        String newcadena = metro_segundo1.substring ( 0, metro_segundo1.length() - 1 );
                        metro_segundo.setText(newcadena);
                        metro_segundo.setSelection(metro_segundo.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = metro_segundo1.substring ( 0, metro_segundo1.length() - 2 );
                    metro_segundo.setText(newcadena);
                    metro_segundo.setSelection(metro_segundo.getText().length());
                }
            }


        }
    };

    public TextWatcher changekilometro_hora= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            kilometro_hora1 = kilometro_hora.getText().toString();
            boolean val = kilometro_hora.isFocused();

            try {
                if(!kilometro_hora1.isEmpty() && val ==true){

                    metro_segundo.setText(String.valueOf(parseDouble(kilometro_hora1) * 0.277778 ));
                    milla_hora.setText(String.valueOf(parseDouble(kilometro_hora1) * 0.621371 ));
                    pie_segundo.setText(String.valueOf(parseDouble(kilometro_hora1) * 0.911344 ));
                    nudo.setText(String.valueOf(parseDouble(kilometro_hora1) * 0.539957 ));
                    mach.setText(String.valueOf(parseDouble(kilometro_hora1) * (8.163 *  Math.pow(10,-4)) ));
                    velocidad_luz.setText(String.valueOf(parseDouble(kilometro_hora1) * (9.2657 *  Math.pow(10,-10))));

                }else if(kilometro_hora1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!kilometro_hora1.isEmpty()){
                        String newcadena = kilometro_hora1.substring ( 0, kilometro_hora1.length() - 1 );
                        kilometro_hora.setText(newcadena);
                        kilometro_hora.setSelection(kilometro_hora.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = kilometro_hora1.substring ( 0, kilometro_hora1.length() - 2 );
                    kilometro_hora.setText(newcadena);
                    kilometro_hora.setSelection(kilometro_hora.getText().length());
                }
            }


        }
    };

    public TextWatcher changemilla_hora= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            milla_hora1 = milla_hora.getText().toString();
            boolean val = milla_hora.isFocused();

            try {
                if(!milla_hora1.isEmpty() && val ==true){

                    kilometro_hora.setText(String.valueOf(parseDouble(milla_hora1) * 1.6093));
                    metro_segundo.setText(String.valueOf(parseDouble(milla_hora1) * 0.44704 ));
                    pie_segundo.setText(String.valueOf(parseDouble(milla_hora1) * 1.4667 ));
                    nudo.setText(String.valueOf(parseDouble(milla_hora1) * 0.868977 ));
                    mach.setText(String.valueOf(parseDouble(milla_hora1) * 0.0013 ));
                    velocidad_luz.setText(String.valueOf(parseDouble(milla_hora1) * (1.4912 *  Math.pow(10,-9))));

                }else if(milla_hora1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!milla_hora1.isEmpty()){
                        String newcadena = milla_hora1.substring ( 0, milla_hora1.length() - 1 );
                        milla_hora.setText(newcadena);
                        milla_hora.setSelection(milla_hora.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = milla_hora1.substring ( 0, milla_hora1.length() - 2 );
                    milla_hora.setText(newcadena);
                    milla_hora.setSelection(milla_hora.getText().length());
                }
            }


        }
    };

    public TextWatcher changepie_segundo= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            pie_segundo1= pie_segundo.getText().toString();
            boolean val = pie_segundo.isFocused();

            try {
                if(!pie_segundo1.isEmpty() && val ==true){

                    kilometro_hora.setText(String.valueOf(parseDouble(pie_segundo1) * 1.0973));
                    metro_segundo.setText(String.valueOf(parseDouble(pie_segundo1) * 0.3048 ));
                    milla_hora.setText(String.valueOf(parseDouble(pie_segundo1) * 0.681818 ));
                    nudo.setText(String.valueOf(parseDouble(pie_segundo1) * 0.592484 ));
                    mach.setText(String.valueOf(parseDouble(pie_segundo1) * (8.9571 *  Math.pow(10,-4)) ));
                    velocidad_luz.setText(String.valueOf(parseDouble(pie_segundo1) * (1.016 *  Math.pow(10,-9))));

                }else if(pie_segundo1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!pie_segundo1.isEmpty()){
                        String newcadena = pie_segundo1.substring ( 0, pie_segundo1.length() - 1 );
                        pie_segundo.setText(newcadena);
                        pie_segundo.setSelection(pie_segundo.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = pie_segundo1.substring ( 0, pie_segundo1.length() - 2 );
                    pie_segundo.setText(newcadena);
                    pie_segundo.setSelection(pie_segundo.getText().length());
                }
            }

        }
    };

    public TextWatcher changenudo= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            nudo1= nudo.getText().toString();
            boolean val = nudo.isFocused();

            try {
                if(!nudo1.isEmpty() && val ==true){

                    kilometro_hora.setText(String.valueOf(parseDouble(nudo1) * 1.852));
                    metro_segundo.setText(String.valueOf(parseDouble(nudo1) * 0.5144 ));
                    milla_hora.setText(String.valueOf(parseDouble(nudo1) * 1.1508));
                    pie_segundo.setText(String.valueOf(parseDouble(nudo1) * 1.6878));
                    mach.setText(String.valueOf(parseDouble(nudo1) * 0.0015 ));
                    velocidad_luz.setText(String.valueOf(parseDouble(nudo1) * (1.716 *  Math.pow(10,-9))));

                }else if(nudo1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!nudo1.isEmpty()){
                        String newcadena = nudo1.substring ( 0, nudo1.length() - 1 );
                        nudo.setText(newcadena);
                        nudo.setSelection(nudo.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = nudo1.substring ( 0, nudo1.length() - 2 );
                    nudo.setText(newcadena);
                    nudo.setSelection(nudo.getText().length());
                }
            }

        }
    };

    public TextWatcher changemach= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            mach1= mach.getText().toString();
            boolean val = mach.isFocused();
            try {
                if(!mach1.isEmpty() && val ==true){

                    kilometro_hora.setText(String.valueOf(parseDouble(mach1) * 1225.044));
                    metro_segundo.setText(String.valueOf(parseDouble(mach1) * 340.29 ));
                    milla_hora.setText(String.valueOf(parseDouble(mach1) * 761.2071));
                    pie_segundo.setText(String.valueOf(parseDouble(mach1) * 1116.437));
                    nudo.setText(String.valueOf(parseDouble(mach1) * 661.4714 ));
                    velocidad_luz.setText(String.valueOf(parseDouble(mach1) * (1.1351 *  Math.pow(10,-6))));

                }else if(mach1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!mach1.isEmpty()){
                        String newcadena = mach1.substring ( 0, mach1.length() - 1 );
                        mach.setText(newcadena);
                        mach.setSelection(mach.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = mach1.substring ( 0, mach1.length() - 2 );
                    mach.setText(newcadena);
                    mach.setSelection(mach.getText().length());
                }
            }

        }
    };

    public TextWatcher changevelocidad_luz= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            velocidad_luz1= velocidad_luz.getText().toString();
            boolean val = velocidad_luz.isFocused();

            try {
                if(!velocidad_luz1.isEmpty() && val ==true){

                    kilometro_hora.setText(String.valueOf(parseDouble(velocidad_luz1) * (1.0793 *  Math.pow(10,9))));
                    metro_segundo.setText(String.valueOf(parseDouble(velocidad_luz1) *  (2.9979 *  Math.pow(10,8) )));
                    milla_hora.setText(String.valueOf(parseDouble(velocidad_luz1) *  (6.7062 *  Math.pow(10,8))));
                    pie_segundo.setText(String.valueOf(parseDouble(velocidad_luz1) *  (9.8357 *  Math.pow(10,8))));
                    nudo.setText(String.valueOf(parseDouble(velocidad_luz1) *  (5.8275 *  Math.pow(10,8)) ));
                    mach.setText(String.valueOf(parseDouble(velocidad_luz1) * 880991.09));

                }else if(velocidad_luz1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!velocidad_luz1.isEmpty()){
                        String newcadena = velocidad_luz1.substring ( 0, velocidad_luz1.length() - 1 );
                        velocidad_luz.setText(newcadena);
                        velocidad_luz.setSelection(velocidad_luz.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = velocidad_luz1.substring ( 0, velocidad_luz1.length() - 2 );
                    velocidad_luz.setText(newcadena);
                    velocidad_luz.setSelection(velocidad_luz.getText().length());
                }
            }


        }
    };




    public void limpiar(){
        metro_segundo.getText().clear();
        kilometro_hora.getText().clear();
        milla_hora.getText().clear();
        pie_segundo.getText().clear();
        nudo.getText().clear();
        mach.getText().clear();
        velocidad_luz.getText().clear();
    }



}