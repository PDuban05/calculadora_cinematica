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


public class volumen extends Fragment {

    EditText litro,decilitro,mililitro,metro_3,centimetro_3,yarda_3,pie_3,pulgada_3,barril,galon;
    String litro1,decilitro1,mililitro1,metro_31,centimetro_31,yarda_31,pie_31,pulgada_31,barril1,galon1;

    public volumen() {
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
        return inflater.inflate(R.layout.fragment_volumen, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        litro = view.findViewById(R.id.litro);
        decilitro = view.findViewById(R.id.decilitro);
        mililitro = view.findViewById(R.id.mililitro);
        metro_3 = view.findViewById(R.id.metro_3);
        centimetro_3 = view.findViewById(R.id.centimetro_3);
        yarda_3 = view.findViewById(R.id.yarda_3);
        pie_3 = view.findViewById(R.id.pie_3);
        pulgada_3 = view.findViewById(R.id.pulgada_3);
        barril = view.findViewById(R.id.barril);
        galon = view.findViewById(R.id.galon);

        litro.addTextChangedListener(changelitro);
        decilitro.addTextChangedListener(changedecilitro);
        mililitro.addTextChangedListener(changemililitro);
        metro_3.addTextChangedListener(changemetro_3);
        centimetro_3.addTextChangedListener(changecentimetro_3);
        yarda_3.addTextChangedListener(changeyarda_3);
        pie_3.addTextChangedListener(changepie_3);
        pulgada_3.addTextChangedListener(changepulgada_3);
        barril.addTextChangedListener(changebarril);
        galon.addTextChangedListener(changegalon);

    }

    public TextWatcher changelitro= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            litro1 = litro.getText().toString();
            boolean val = litro.isFocused();
            try {
                if(!litro1.isEmpty() && val ==true){

                    decilitro.setText(String.valueOf(parseDouble(litro1) * 10));
                    mililitro.setText(String.valueOf(parseDouble(litro1) * 1000));
                    metro_3.setText(String.valueOf(parseDouble(litro1) * 0.001));
                    centimetro_3.setText(String.valueOf(parseDouble(litro1) * 1000));
                    yarda_3.setText(String.valueOf(parseDouble(litro1) * 0.0013));
                    pie_3.setText(String.valueOf(parseDouble(litro1) * 0.0353));
                    pulgada_3.setText(String.valueOf(parseDouble(litro1) * 61.0237));
                    barril.setText(String.valueOf(parseDouble(litro1) * 0.0084));
                    galon.setText(String.valueOf(parseDouble(litro1) * 0.2642));


                }else if(litro1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!litro1.isEmpty()){
                        String newcadena = litro1.substring ( 0, litro1.length() - 1 );
                        litro.setText(newcadena);
                        litro.setSelection(litro.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = litro1.substring ( 0, litro1.length() - 2 );
                    litro.setText(newcadena);
                    litro.setSelection(litro.getText().length());
                }
            }
        }
    };

    public TextWatcher changedecilitro = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            decilitro1 = decilitro.getText().toString();
            boolean val = decilitro.isFocused();
            try {
                if(!decilitro1.isEmpty() && val ==true){

                    litro.setText(String.valueOf(parseDouble(decilitro1) * 0.1));
                    mililitro.setText(String.valueOf(parseDouble(decilitro1) * 100));
                    metro_3.setText(String.valueOf(parseDouble(decilitro1) * (1*Math.pow(10,-4))));
                    centimetro_3.setText(String.valueOf(parseDouble(decilitro1) * 100));
                    yarda_3.setText(String.valueOf(parseDouble(decilitro1) * (1.308*Math.pow(10,-4))));
                    pie_3.setText(String.valueOf(parseDouble(decilitro1) * 0.0035));
                    pulgada_3.setText(String.valueOf(parseDouble(decilitro1) * 6.1024));
                    barril.setText(String.valueOf(parseDouble(decilitro1) * (8.3864 *Math.pow(10,-4))));
                    galon.setText(String.valueOf(parseDouble(decilitro1) * 0.0264));


                }else if(decilitro1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!decilitro1.isEmpty()){
                        String newcadena = decilitro1.substring ( 0, decilitro1.length() - 1 );
                        decilitro.setText(newcadena);
                        decilitro.setSelection(decilitro.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = decilitro1.substring ( 0, decilitro1.length() - 2 );
                    decilitro.setText(newcadena);
                    decilitro.setSelection(decilitro.getText().length());
                }
            }
        }
    };

    public TextWatcher changemililitro = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            mililitro1 = mililitro.getText().toString();
            boolean val = mililitro.isFocused();
            try {
                if(!mililitro1.isEmpty() && val ==true){

                    litro.setText(String.valueOf(parseDouble(mililitro1) * 0.001));
                    decilitro.setText(String.valueOf(parseDouble(mililitro1) * 0.01));
                    metro_3.setText(String.valueOf(parseDouble(mililitro1) * (1*Math.pow(10,-6))));
                    centimetro_3.setText(String.valueOf(parseDouble(mililitro1) * 1));
                    yarda_3.setText(String.valueOf(parseDouble(mililitro1) * (1.308*Math.pow(10,-6))));
                    pie_3.setText(String.valueOf(parseDouble(mililitro1) * (3.5315*Math.pow(10,-5))));
                    pulgada_3.setText(String.valueOf(parseDouble(mililitro1) * 0.061));
                    barril.setText(String.valueOf(parseDouble(mililitro1) * (8.3864 *Math.pow(10,-6))));
                    galon.setText(String.valueOf(parseDouble(mililitro1) * (2.6417*Math.pow(10,-4))));


                }else if(mililitro1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!mililitro1.isEmpty()){
                        String newcadena = mililitro1.substring ( 0, mililitro1.length() - 1 );
                        mililitro.setText(newcadena);
                        mililitro.setSelection(mililitro.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = mililitro1.substring ( 0, mililitro1.length() - 2 );
                    mililitro.setText(newcadena);
                    mililitro.setSelection(mililitro.getText().length());
                }
            }
        }
    };

    public TextWatcher changemetro_3 = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            metro_31 = metro_3.getText().toString();
            boolean val = metro_3.isFocused();
            try {
                if(!metro_31.isEmpty() && val ==true){

                    litro.setText(String.valueOf(parseDouble(metro_31) * 1000));
                    decilitro.setText(String.valueOf(parseDouble(metro_31) * 10000));
                    mililitro.setText(String.valueOf(parseDouble(metro_31) * 1000000));
                    centimetro_3.setText(String.valueOf(parseDouble(metro_31) * 1000000));
                    yarda_3.setText(String.valueOf(parseDouble(metro_31) * 1.308));
                    pie_3.setText(String.valueOf(parseDouble(metro_31) * 35.3147));
                    pulgada_3.setText(String.valueOf(parseDouble(metro_31) * 61023.7441));
                    barril.setText(String.valueOf(parseDouble(metro_31) * 8.3864));
                    galon.setText(String.valueOf(parseDouble(metro_31) * 264.1721));


                }else if(metro_31.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!metro_31.isEmpty()){
                        String newcadena = metro_31.substring ( 0, metro_31.length() - 1 );
                        metro_3.setText(newcadena);
                        metro_3.setSelection(metro_3.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = metro_31.substring ( 0, metro_31.length() - 2 );
                    metro_3.setText(newcadena);
                    metro_3.setSelection(metro_3.getText().length());
                }
            }
        }
    };

    public TextWatcher changecentimetro_3 = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            centimetro_31 = centimetro_3.getText().toString();
            boolean val = centimetro_3.isFocused();
            try {
                if(!centimetro_31.isEmpty() && val ==true){

                    litro.setText(String.valueOf(parseDouble(centimetro_31) * 0.001));
                    decilitro.setText(String.valueOf(parseDouble(centimetro_31) * 0.01));
                    mililitro.setText(String.valueOf(parseDouble(centimetro_31) * 1));
                    metro_3.setText(String.valueOf(parseDouble(centimetro_31) * (1 * Math.pow(10,-6))));
                    yarda_3.setText(String.valueOf(parseDouble(centimetro_31) * (1.308 * Math.pow(10,-6))));
                    pie_3.setText(String.valueOf(parseDouble(centimetro_31) * (3.5315 * Math.pow(10,-5))));
                    pulgada_3.setText(String.valueOf(parseDouble(centimetro_31) * 0.061));
                    barril.setText(String.valueOf(parseDouble(centimetro_31) * (8.3864 * Math.pow(10,-6))));
                    galon.setText(String.valueOf(parseDouble(centimetro_31) * (2.6417 * Math.pow(10,-4))));


                }else if(centimetro_31.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!centimetro_31.isEmpty()){
                        String newcadena = centimetro_31.substring ( 0, centimetro_31.length() - 1 );
                        centimetro_3.setText(newcadena);
                        centimetro_3.setSelection(centimetro_3.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = centimetro_31.substring ( 0, centimetro_31.length() - 2 );
                    centimetro_3.setText(newcadena);
                    centimetro_3.setSelection(centimetro_3.getText().length());
                }
            }
        }
    };

    public TextWatcher changeyarda_3 = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            yarda_31 = yarda_3.getText().toString();
            boolean val = yarda_3.isFocused();
            try {
                if(!yarda_31.isEmpty() && val ==true){

                    litro.setText(String.valueOf(parseDouble(yarda_31) * 764.5549));
                    decilitro.setText(String.valueOf(parseDouble(yarda_31) * 7645.5486));
                    mililitro.setText(String.valueOf(parseDouble(yarda_31) * 764554.858));
                    metro_3.setText(String.valueOf(parseDouble(yarda_31) * 0.7646));
                    centimetro_3.setText(String.valueOf(parseDouble(yarda_31) * 764554.858));
                    pie_3.setText(String.valueOf(parseDouble(yarda_31) * 27));
                    pulgada_3.setText(String.valueOf(parseDouble(yarda_31) * 46656));
                    barril.setText(String.valueOf(parseDouble(yarda_31) * 6.4119));
                    galon.setText(String.valueOf(parseDouble(yarda_31) * 201.974));


                }else if(yarda_31.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!yarda_31.isEmpty()){
                        String newcadena = yarda_31.substring ( 0, yarda_31.length() - 1 );
                        yarda_3.setText(newcadena);
                        yarda_3.setSelection(yarda_3.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = yarda_31.substring ( 0, yarda_31.length() - 2 );
                    yarda_3.setText(newcadena);
                    yarda_3.setSelection(yarda_3.getText().length());
                }
            }
        }
    };

    public TextWatcher changepie_3 = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            pie_31 = pie_3.getText().toString();
            boolean val = pie_3.isFocused();
            try {
                if(!pie_31.isEmpty() && val ==true){

                    litro.setText(String.valueOf(parseDouble(pie_31) * 28.3168));
                    decilitro.setText(String.valueOf(parseDouble(pie_31) * 283.1685));
                    mililitro.setText(String.valueOf(parseDouble(pie_31) * 28316.8466));
                    metro_3.setText(String.valueOf(parseDouble(pie_31) * 0.0283));
                    centimetro_3.setText(String.valueOf(parseDouble(pie_31) * 28316.8466));
                    yarda_3.setText(String.valueOf(parseDouble(pie_31) * 0.037));
                    pulgada_3.setText(String.valueOf(parseDouble(pie_31) * 1728));
                    barril.setText(String.valueOf(parseDouble(pie_31) * 0.2375));
                    galon.setText(String.valueOf(parseDouble(pie_31) * 7.4805));


                }else if(pie_31.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!pie_31.isEmpty()){
                        String newcadena = pie_31.substring ( 0, pie_31.length() - 1 );
                        pie_3.setText(newcadena);
                        pie_3.setSelection(pie_3.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = pie_31.substring ( 0, pie_31.length() - 2 );
                    pie_3.setText(newcadena);
                    pie_3.setSelection(pie_3.getText().length());
                }
            }
        }
    };

    public TextWatcher changepulgada_3 = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            pulgada_31 = pulgada_3.getText().toString();
            boolean val = pulgada_3.isFocused();
            try {
                if(!pulgada_31.isEmpty() && val ==true){

                    litro.setText(String.valueOf(parseDouble(pulgada_31) * 0.0164));
                    decilitro.setText(String.valueOf(parseDouble(pulgada_31) * 0.1639));
                    mililitro.setText(String.valueOf(parseDouble(pulgada_31) * 16.3871));
                    metro_3.setText(String.valueOf(parseDouble(pulgada_31) * (1.6387 * Math.pow(10,-5))));
                    centimetro_3.setText(String.valueOf(parseDouble(pulgada_31) * 16.3871));
                    yarda_3.setText(String.valueOf(parseDouble(pulgada_31) * (2.1433 * Math.pow(10,-5))));
                    pie_3.setText(String.valueOf(parseDouble(pulgada_31) * (5.787 * Math.pow(10,-4))));
                    barril.setText(String.valueOf(parseDouble(pulgada_31) * (1.3743 * Math.pow(10,-4))));
                    galon.setText(String.valueOf(parseDouble(pulgada_31) * 0.0043));


                }else if(pulgada_31.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!pulgada_31.isEmpty()){
                        String newcadena = pulgada_31.substring ( 0, pulgada_31.length() - 1 );
                        pulgada_3.setText(newcadena);
                        pulgada_3.setSelection(pulgada_3.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = pulgada_31.substring ( 0, pulgada_31.length() - 2 );
                    pulgada_3.setText(newcadena);
                    pulgada_3.setSelection(pulgada_3.getText().length());
                }
            }
        }
    };

    public TextWatcher changebarril = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            barril1 = barril.getText().toString();
            boolean val = barril.isFocused();
            try {
                if(!barril1.isEmpty() && val ==true){

                    litro.setText(String.valueOf(parseDouble(barril1) * 119.2405));
                    decilitro.setText(String.valueOf(parseDouble(barril1) * 1192.4047));
                    mililitro.setText(String.valueOf(parseDouble(barril1) * 119240.4712));
                    metro_3.setText(String.valueOf(parseDouble(barril1) * 0.1192));
                    centimetro_3.setText(String.valueOf(parseDouble(barril1) * 119240.4712));
                    yarda_3.setText(String.valueOf(parseDouble(barril1) * 0.156));
                    pie_3.setText(String.valueOf(parseDouble(barril1) * 4.2109));
                    pulgada_3.setText(String.valueOf(parseDouble(barril1) * 7276.5));
                    galon.setText(String.valueOf(parseDouble(barril1) * 31.5));


                }else if(barril1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!barril1.isEmpty()){
                        String newcadena = barril1.substring ( 0, barril1.length() - 1 );
                        barril.setText(newcadena);
                        barril.setSelection(barril.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = barril1.substring ( 0, barril1.length() - 2 );
                    barril.setText(newcadena);
                    barril.setSelection(barril.getText().length());
                }
            }
        }
    };

    public TextWatcher changegalon = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            galon1 = galon.getText().toString();
            boolean val = galon.isFocused();
            try {
                if(!galon1.isEmpty() && val ==true){

                    litro.setText(String.valueOf(parseDouble(galon1) * 3.7854));
                    decilitro.setText(String.valueOf(parseDouble(galon1) * 37.8541));
                    mililitro.setText(String.valueOf(parseDouble(galon1) * 3785.4118));
                    metro_3.setText(String.valueOf(parseDouble(galon1) * 0.0038));
                    centimetro_3.setText(String.valueOf(parseDouble(galon1) * 3785.4118));
                    yarda_3.setText(String.valueOf(parseDouble(galon1) * 0.005));
                    pie_3.setText(String.valueOf(parseDouble(galon1) * 0.1337));
                    pulgada_3.setText(String.valueOf(parseDouble(galon1) * 231));
                    barril.setText(String.valueOf(parseDouble(galon1) * 0.0317));


                }else if(galon1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!galon1.isEmpty()){
                        String newcadena = galon1.substring ( 0, galon1.length() - 1 );
                        galon.setText(newcadena);
                        galon.setSelection(galon.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = galon1.substring ( 0, galon1.length() - 2 );
                    galon.setText(newcadena);
                    galon.setSelection(galon.getText().length());
                }
            }
        }
    };



    public void limpiar(){

        litro.getText().clear();
        decilitro.getText().clear();
        mililitro.getText().clear();
        metro_3.getText().clear();
        centimetro_3.getText().clear();
        yarda_3.getText().clear();
        pie_3.getText().clear();
        pulgada_3.getText().clear();
        barril.getText().clear();
        galon.getText().clear();

    }
}