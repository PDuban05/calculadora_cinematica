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
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;


public class aceleracion extends Fragment {
    EditText kilometro_s2,metro_s2,milimetro_s2,micrometro_s2,nanometro_s2,milla_s2,yarda_s2,pie_s2,pulgada_s2,gal,galileo,aceleracion_gravedad;
   private String kilometro_s21,metro_s21,milimetro_s21,micrometro_s21,nanometro_s21,milla_s21,yarda_s21,pie_s21,pulgada_s21,gal1,galileo1,aceleracion_gravedad1;
   public AdView mAdView, mAdView2;


    public aceleracion() {
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
        return inflater.inflate(R.layout.fragment_aceleracion, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        mAdView = view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdImpression() {
                // Code to be executed when an impression is recorded
                // for an ad.
            }

            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }
        });


        mAdView2 = view.findViewById(R.id.adView1);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView2.loadAd(adRequest2);

        mAdView2.setAdListener(new AdListener() {
            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdImpression() {
                // Code to be executed when an impression is recorded
                // for an ad.
            }

            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }
        });

        kilometro_s2 = view.findViewById(R.id.kilometro_s2);
        metro_s2 = view.findViewById(R.id.metro_s2);
        milimetro_s2 = view.findViewById(R.id.milimetro_s2);
        micrometro_s2 = view.findViewById(R.id.micrometro_s2);
        nanometro_s2 = view.findViewById(R.id.nanometro_s2);
        milla_s2 = view.findViewById(R.id.milla_s2);
        yarda_s2 = view.findViewById(R.id.yarda_s2);
        pie_s2 = view.findViewById(R.id.pie_s2);
        pulgada_s2 = view.findViewById(R.id.pulgada_s2);
        gal = view.findViewById(R.id.gal);
        galileo = view.findViewById(R.id.galileo);
        aceleracion_gravedad = view.findViewById(R.id.aceleracion_gravedad);

        kilometro_s2.addTextChangedListener(changekilometro_s2);
        metro_s2.addTextChangedListener(changemetro_s2);
        milimetro_s2.addTextChangedListener(changemilimetro_s2);
        micrometro_s2.addTextChangedListener(changemicrometro_s2);
        nanometro_s2.addTextChangedListener(changenanometro_s2);
        milla_s2.addTextChangedListener(changemilla_s2);
        yarda_s2.addTextChangedListener(changeyarda_s2);
        pie_s2.addTextChangedListener(changepie_s2);
        pulgada_s2.addTextChangedListener(changepulgada_s2);
        gal.addTextChangedListener(changegal);
        galileo.addTextChangedListener(changegalileo);
        aceleracion_gravedad.addTextChangedListener(changeaceleracion_gravedad);
    }

    public TextWatcher changekilometro_s2= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            kilometro_s21 = kilometro_s2.getText().toString();
            boolean val = kilometro_s2.isFocused();
            try {
                if(!kilometro_s21.isEmpty() && val ==true){

                    metro_s2.setText(String.valueOf(parseDouble(kilometro_s21) * 1000));
                    milimetro_s2.setText(String.valueOf(parseDouble(kilometro_s21) * 1000000));
                    micrometro_s2.setText(String.valueOf(parseDouble(kilometro_s21) * (1 * Math.pow(10,9))));
                    nanometro_s2.setText(String.valueOf(parseDouble(kilometro_s21) * (1 * Math.pow(10,12))));
                    milla_s2.setText(String.valueOf(parseDouble(kilometro_s21) * 0.62137119223733));
                    yarda_s2.setText(String.valueOf(parseDouble(kilometro_s21) * 1093.61));
                    pie_s2.setText(String.valueOf(parseDouble(kilometro_s21) * 3280.84));
                    pulgada_s2.setText(String.valueOf(parseDouble(kilometro_s21) * 39370.08));
                    gal.setText(String.valueOf(parseDouble(kilometro_s21) * 100000));
                    galileo.setText(String.valueOf(parseDouble(kilometro_s21) * 100000));
                    aceleracion_gravedad.setText(String.valueOf(parseDouble(kilometro_s21) * 101.93679918451));

                }else if(kilometro_s21.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!kilometro_s21.isEmpty()){
                        String newcadena = kilometro_s21.substring ( 0, kilometro_s21.length() - 1 );
                        kilometro_s2.setText(newcadena);
                        kilometro_s2.setSelection(kilometro_s2.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = kilometro_s21.substring ( 0, kilometro_s21.length() - 2 );
                    kilometro_s2.setText(newcadena);
                    kilometro_s2.setSelection(kilometro_s2.getText().length());
                }
            }

        }
    };

    public TextWatcher changemetro_s2= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            metro_s21 = metro_s2.getText().toString();
            boolean val = metro_s2.isFocused();
            try {
                if(!metro_s21.isEmpty() && val ==true){

                    kilometro_s2.setText(String.valueOf(parseDouble(metro_s21) / 1000));
                    milimetro_s2.setText(String.valueOf(parseDouble(metro_s21) * 1000));
                    micrometro_s2.setText(String.valueOf(parseDouble(metro_s21) / 1000000  ));
                    nanometro_s2.setText(String.valueOf(parseDouble(metro_s21) * (1 * Math.pow(10,9))));
                    milla_s2.setText(String.valueOf(parseDouble(metro_s21) / 1609));
                    yarda_s2.setText(String.valueOf(parseDouble(metro_s21) * 1.094));
                    pie_s2.setText(String.valueOf(parseDouble(metro_s21) * 3.281));
                    pulgada_s2.setText(String.valueOf(parseDouble(metro_s21) * 39.37));
                    gal.setText(String.valueOf(parseDouble(metro_s21) * 100));
                    galileo.setText(String.valueOf(parseDouble(metro_s21) * 100));
                    aceleracion_gravedad.setText(String.valueOf(parseDouble(metro_s21) * 0.10193679918451));

                }else if(metro_s21.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!metro_s21.isEmpty()){
                        String newcadena = metro_s21.substring ( 0, metro_s21.length() - 1 );
                        metro_s2.setText(newcadena);
                        metro_s2.setSelection(metro_s2.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = metro_s21.substring ( 0, metro_s21.length() - 2 );
                    metro_s2.setText(newcadena);
                    metro_s2.setSelection(metro_s2.getText().length());
                }
            }

        }
    };

    public TextWatcher changemilimetro_s2= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            milimetro_s21 = milimetro_s2.getText().toString();
            boolean val = milimetro_s2.isFocused();
            try {
                if(!milimetro_s21.isEmpty() && val ==true){

                    kilometro_s2.setText(String.valueOf(parseDouble(milimetro_s21) / (1 * Math.pow(10,6))));
                    metro_s2.setText(String.valueOf(parseDouble(milimetro_s21) / 1000));
                    micrometro_s2.setText(String.valueOf(parseDouble(milimetro_s21) * 1000));
                    nanometro_s2.setText(String.valueOf(parseDouble(milimetro_s21) * (1 * Math.pow(10,6))));
                    milla_s2.setText(String.valueOf(parseDouble(milimetro_s21) / (1.609 * Math.pow(10,6))));
                    yarda_s2.setText(String.valueOf(parseDouble(milimetro_s21) / 914.4));
                    pie_s2.setText(String.valueOf(parseDouble(milimetro_s21) / 304.8));
                    pulgada_s2.setText(String.valueOf(parseDouble(milimetro_s21) / 25.4));
                    gal.setText(String.valueOf(parseDouble(milimetro_s21) / 10));
                    galileo.setText(String.valueOf(parseDouble(milimetro_s21) /10 ));
                    aceleracion_gravedad.setText(String.valueOf(parseDouble(milimetro_s21) / 9810 ));

                }else if(milimetro_s21.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!milimetro_s21.isEmpty()){
                        String newcadena = milimetro_s21.substring ( 0, milimetro_s21.length() - 1 );
                        milimetro_s2.setText(newcadena);
                        milimetro_s2.setSelection(milimetro_s2.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = milimetro_s21.substring ( 0, milimetro_s21.length() - 2 );
                    milimetro_s2.setText(newcadena);
                    milimetro_s2.setSelection(milimetro_s2.getText().length());
                }
            }

        }
    };

    public TextWatcher changemicrometro_s2= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            micrometro_s21 = micrometro_s2.getText().toString();
            boolean val = micrometro_s2.isFocused();
            try {
                if(!micrometro_s21.isEmpty() && val ==true){

                    kilometro_s2.setText(String.valueOf(parseDouble(micrometro_s21) / (1 * Math.pow(10,9))));
                    metro_s2.setText(String.valueOf(parseDouble(micrometro_s21) / (1 * Math.pow(10,6))));
                    milimetro_s2.setText(String.valueOf(parseDouble(micrometro_s21) / 1000));
                    nanometro_s2.setText(String.valueOf(parseDouble(micrometro_s21) * 1000));
                    milla_s2.setText(String.valueOf(parseDouble(micrometro_s21) / (1.609 * Math.pow(10,9))));
                    yarda_s2.setText(String.valueOf(parseDouble(micrometro_s21) /914400));
                    pie_s2.setText(String.valueOf(parseDouble(micrometro_s21) / 304800));
                    pulgada_s2.setText(String.valueOf(parseDouble(micrometro_s21) /25400));
                    gal.setText(String.valueOf(parseDouble(micrometro_s21) * 0.0001));
                    galileo.setText(String.valueOf(parseDouble(micrometro_s21) * 0.0001 ));
                    aceleracion_gravedad.setText(String.valueOf(parseDouble(micrometro_s21) * (1.0197 * Math.pow(10,-7)) ));

                }else if(micrometro_s21.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!micrometro_s21.isEmpty()){
                        String newcadena = micrometro_s21.substring ( 0, micrometro_s21.length() - 1 );
                        micrometro_s2.setText(newcadena);
                        micrometro_s2.setSelection(micrometro_s2.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = micrometro_s21.substring ( 0, micrometro_s21.length() - 2 );
                    micrometro_s2.setText(newcadena);
                    micrometro_s2.setSelection(micrometro_s2.getText().length());
                }
            }

        }
    };

    public TextWatcher changenanometro_s2= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            nanometro_s21 = nanometro_s2.getText().toString();
            boolean val = nanometro_s2.isFocused();
            try {
                if(!nanometro_s21.isEmpty() && val ==true){

                    kilometro_s2.setText(String.valueOf(parseDouble(nanometro_s21) / (1 * Math.pow(10,12))));
                    metro_s2.setText(String.valueOf(parseDouble(nanometro_s21) /(1 * Math.pow(10,9))));
                    milimetro_s2.setText(String.valueOf(parseDouble(nanometro_s21) / (1 * Math.pow(10,6))));
                    micrometro_s2.setText(String.valueOf(parseDouble(nanometro_s21) / 1000));
                    milla_s2.setText(String.valueOf(parseDouble(nanometro_s21) / (1.609 * Math.pow(10,12))));
                    yarda_s2.setText(String.valueOf(parseDouble(nanometro_s21) / (9.144 * Math.pow(10,8))));
                    pie_s2.setText(String.valueOf(parseDouble(nanometro_s21) / (3.048 * Math.pow(10,8))));
                    pulgada_s2.setText(String.valueOf(parseDouble(nanometro_s21) / (2.54 * Math.pow(10,7))));
                    gal.setText(String.valueOf(parseDouble(nanometro_s21) * (1 * Math.pow(10,-7))));
                    galileo.setText(String.valueOf(parseDouble(nanometro_s21) * (1 * Math.pow(10,-7)) ));
                    aceleracion_gravedad.setText(String.valueOf(parseDouble(nanometro_s21) *  (1.0197 * Math.pow(10,-10)) ));

                }else if(nanometro_s21.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!nanometro_s21.isEmpty()){
                        String newcadena = nanometro_s21.substring ( 0, nanometro_s21.length() - 1 );
                        nanometro_s2.setText(newcadena);
                        nanometro_s2.setSelection(nanometro_s2.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = nanometro_s21.substring ( 0, nanometro_s21.length() - 2 );
                    nanometro_s2.setText(newcadena);
                    nanometro_s2.setSelection(nanometro_s2.getText().length());
                }
            }

        }
    };

    public TextWatcher changemilla_s2= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            milla_s21 = milla_s2.getText().toString();
            boolean val = milla_s2.isFocused();
            try {
                if(!milla_s21.isEmpty() && val ==true){

                    kilometro_s2.setText(String.valueOf(parseDouble(milla_s21) * 1.609));
                    metro_s2.setText(String.valueOf(parseDouble(milla_s21) * 1609));
                    milimetro_s2.setText(String.valueOf(parseDouble(milla_s21) * (1.609 * Math.pow(10,6))));
                    micrometro_s2.setText(String.valueOf(parseDouble(milla_s21) * (1.609 * Math.pow(10,9))));
                    nanometro_s2.setText(String.valueOf(parseDouble(milla_s21) * (1.609 * Math.pow(10,12))));
                    yarda_s2.setText(String.valueOf(parseDouble(milla_s21) * 1760));
                    pie_s2.setText(String.valueOf(parseDouble(milla_s21) * 5280));
                    pulgada_s2.setText(String.valueOf(parseDouble(milla_s21) * 63360));
                    gal.setText(String.valueOf(parseDouble(milla_s21) *  160934.4));
                    galileo.setText(String.valueOf(parseDouble(milla_s21) *  160934.4 ));
                    aceleracion_gravedad.setText(String.valueOf(parseDouble(milla_s21) * 164.107416905875 ));

                }else if(milla_s21.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!milla_s21.isEmpty()){
                        String newcadena = milla_s21.substring ( 0, milla_s21.length() - 1 );
                        milla_s2.setText(newcadena);
                        milla_s2.setSelection(milla_s2.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = milla_s21.substring ( 0, milla_s21.length() - 2 );
                    milla_s2.setText(newcadena);
                    milla_s2.setSelection(milla_s2.getText().length());
                }
            }

        }
    };

    public TextWatcher changeyarda_s2= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            yarda_s21 = yarda_s2.getText().toString();
            boolean val = yarda_s2.isFocused();
            try {
                if(!yarda_s21.isEmpty() && val ==true){

                    kilometro_s2.setText(String.valueOf(parseDouble(yarda_s21) /  1094));
                    metro_s2.setText(String.valueOf(parseDouble(yarda_s21) / 1.094));
                    milimetro_s2.setText(String.valueOf(parseDouble(yarda_s21) * 914.4 ));
                    micrometro_s2.setText(String.valueOf(parseDouble(yarda_s21) * 914400));
                    nanometro_s2.setText(String.valueOf(parseDouble(yarda_s21) * ( 9.144 * Math.pow(10,8))));
                    milla_s2.setText(String.valueOf(parseDouble(yarda_s21) / 1760));
                    pie_s2.setText(String.valueOf(parseDouble(yarda_s21) * 3));
                    pulgada_s2.setText(String.valueOf(parseDouble(yarda_s21) * 36));
                    gal.setText(String.valueOf(parseDouble(yarda_s21) *  91.44));
                    galileo.setText(String.valueOf(parseDouble(yarda_s21) *  91.44 ));
                    aceleracion_gravedad.setText(String.valueOf(parseDouble(yarda_s21) * 0.0932428505145063 ));

                }else if(yarda_s21.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!yarda_s21.isEmpty()){
                        String newcadena = yarda_s21.substring ( 0, yarda_s21.length() - 1 );
                        yarda_s2.setText(newcadena);
                        yarda_s2.setSelection(yarda_s2.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = yarda_s21.substring ( 0, yarda_s21.length() - 2 );
                    yarda_s2.setText(newcadena);
                    yarda_s2.setSelection(yarda_s2.getText().length());
                }
            }

        }
    };

    public TextWatcher changepie_s2= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            pie_s21 = pie_s2.getText().toString();
            boolean val = pie_s2.isFocused();
            try {
                if(!pie_s21.isEmpty() && val ==true){

                    kilometro_s2.setText(String.valueOf(parseDouble(pie_s21) / 3281));
                    metro_s2.setText(String.valueOf(parseDouble(pie_s21) / 3.281));
                    milimetro_s2.setText(String.valueOf(parseDouble(pie_s21) * 304.8));
                    micrometro_s2.setText(String.valueOf(parseDouble(pie_s21) * 304800));
                    nanometro_s2.setText(String.valueOf(parseDouble(pie_s21) * ( 3.048 * Math.pow(10,8))));
                    milla_s2.setText(String.valueOf(parseDouble(pie_s21) / 5280));
                    yarda_s2.setText(String.valueOf(parseDouble(pie_s21) / 3));
                    pulgada_s2.setText(String.valueOf(parseDouble(pie_s21) * 12));
                    gal.setText(String.valueOf(parseDouble(pie_s21) *  30.4800000001219));
                    galileo.setText(String.valueOf(parseDouble(pie_s21) *  30.4800000001219 ));
                    aceleracion_gravedad.setText(String.valueOf(parseDouble(pie_s21) * 0.0311 ));

                }else if(pie_s21.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!pie_s21.isEmpty()){
                        String newcadena = pie_s21.substring ( 0, pie_s21.length() - 1 );
                        pie_s2.setText(newcadena);
                        pie_s2.setSelection(pie_s2.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = pie_s21.substring ( 0, pie_s21.length() - 2 );
                    pie_s2.setText(newcadena);
                    pie_s2.setSelection(pie_s2.getText().length());
                }
            }

        }
    };

    public TextWatcher changepulgada_s2= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            pulgada_s21 = pulgada_s2.getText().toString();
            boolean val = pulgada_s2.isFocused();
            try {
                if(!pulgada_s21.isEmpty() && val ==true){

                    kilometro_s2.setText(String.valueOf(parseDouble(pulgada_s21) / 39370));
                    metro_s2.setText(String.valueOf(parseDouble(pulgada_s21) / 39.37));
                    milimetro_s2.setText(String.valueOf(parseDouble(pulgada_s21) *  25.4));
                    micrometro_s2.setText(String.valueOf(parseDouble(pulgada_s21) * 25400));
                    nanometro_s2.setText(String.valueOf(parseDouble(pulgada_s21) * ( 2.54 * Math.pow(10,7))));
                    milla_s2.setText(String.valueOf(parseDouble(pulgada_s21) / 63360));
                    yarda_s2.setText(String.valueOf(parseDouble(pulgada_s21) / 36));
                    pie_s2.setText(String.valueOf(parseDouble(pulgada_s21) / 12));
                    gal.setText(String.valueOf(parseDouble(pulgada_s21) *  2.54000000001016));
                    galileo.setText(String.valueOf(parseDouble(pulgada_s21) *  2.54000000001016 ));
                    aceleracion_gravedad.setText(String.valueOf(parseDouble(pulgada_s21) * 0.0026 ));

                }else if(pulgada_s21.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!pulgada_s21.isEmpty()){
                        String newcadena = pulgada_s21.substring ( 0, pulgada_s21.length() - 1 );
                        pulgada_s2.setText(newcadena);
                        pulgada_s2.setSelection(pulgada_s2.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = pulgada_s21.substring ( 0, pulgada_s21.length() - 2 );
                    pulgada_s2.setText(newcadena);
                    pulgada_s2.setSelection(pulgada_s2.getText().length());
                }
            }

        }
    };

    public TextWatcher changegal= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            gal1 = gal.getText().toString();
            boolean val = gal.isFocused();
            try {
                if(!gal1.isEmpty() && val ==true){

                    kilometro_s2.setText(String.valueOf(parseDouble(gal1) * (1 * Math.pow(10,-5))));
                    metro_s2.setText(String.valueOf(parseDouble(gal1) * 0.01));
                    milimetro_s2.setText(String.valueOf(parseDouble(gal1) *  10));
                    micrometro_s2.setText(String.valueOf(parseDouble(gal1) * 10000));
                    nanometro_s2.setText(String.valueOf(parseDouble(gal1) * 10000000));
                    milla_s2.setText(String.valueOf(parseDouble(gal1) * (6.2137 * Math.pow(10,-6))));
                    yarda_s2.setText(String.valueOf(parseDouble(gal1) * 0.0109));
                    pie_s2.setText(String.valueOf(parseDouble(gal1) * 0.0328 ));
                    pulgada_s2.setText(String.valueOf(parseDouble(gal1) * 0.3937007874));
                    galileo.setText(String.valueOf(parseDouble(gal1) *  1 ));
                    aceleracion_gravedad.setText(String.valueOf(parseDouble(gal1) * 0.001 ));

                }else if(gal1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!gal1.isEmpty()){
                        String newcadena = gal1.substring ( 0, gal1.length() - 1 );
                        gal.setText(newcadena);
                        gal.setSelection(gal.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = gal1.substring ( 0, gal1.length() - 2 );
                    gal.setText(newcadena);
                    gal.setSelection(gal.getText().length());
                }
            }

        }
    };

    public TextWatcher changegalileo= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            galileo1 = galileo.getText().toString();
            boolean val = galileo.isFocused();
            try {
                if(!galileo1.isEmpty() && val ==true){

                    kilometro_s2.setText(String.valueOf(parseDouble( galileo1) * (1 * Math.pow(10,-5))));
                    metro_s2.setText(String.valueOf(parseDouble( galileo1) * 0.01));
                    milimetro_s2.setText(String.valueOf(parseDouble( galileo1) *  10));
                    micrometro_s2.setText(String.valueOf(parseDouble( galileo1) * 10000));
                    nanometro_s2.setText(String.valueOf(parseDouble( galileo1) * 10000000));
                    milla_s2.setText(String.valueOf(parseDouble( galileo1) * (6.2137 * Math.pow(10,-6))));
                    yarda_s2.setText(String.valueOf(parseDouble( galileo1) * 0.0109));
                    pie_s2.setText(String.valueOf(parseDouble( galileo1) * 0.0328 ));
                    pulgada_s2.setText(String.valueOf(parseDouble( galileo1) * 0.3937007874));
                    gal.setText(String.valueOf(parseDouble( galileo1) *  1 ));
                    aceleracion_gravedad.setText(String.valueOf(parseDouble( galileo1) * 0.001 ));

                }else if(galileo1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!galileo1.isEmpty()){
                        String newcadena = galileo1.substring ( 0, galileo1.length() - 1 );
                        galileo.setText(newcadena);
                        galileo.setSelection(galileo.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = galileo1.substring ( 0, galileo1.length() - 2 );
                    galileo.setText(newcadena);
                    galileo.setSelection(galileo.getText().length());
                }
            }

        }
    };

    public TextWatcher changeaceleracion_gravedad= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            aceleracion_gravedad1 = aceleracion_gravedad.getText().toString();
            boolean val = aceleracion_gravedad.isFocused();
            try {
                if(!aceleracion_gravedad1.isEmpty() && val ==true){

                    kilometro_s2.setText(String.valueOf(parseDouble( aceleracion_gravedad1) * 0.0098 ));
                    metro_s2.setText(String.valueOf(parseDouble( aceleracion_gravedad1) * 9.8066));
                    milimetro_s2.setText(String.valueOf(parseDouble( aceleracion_gravedad1) *  9806.65));
                    micrometro_s2.setText(String.valueOf(parseDouble( aceleracion_gravedad1) * 9806650));
                    nanometro_s2.setText(String.valueOf(parseDouble( aceleracion_gravedad1) *  9.806650000));
                    milla_s2.setText(String.valueOf(parseDouble( aceleracion_gravedad1) * 0.0061));
                    yarda_s2.setText(String.valueOf(parseDouble( aceleracion_gravedad1) * 10.7247));
                    pie_s2.setText(String.valueOf(parseDouble( aceleracion_gravedad1) * 32.174 ));
                    pulgada_s2.setText(String.valueOf(parseDouble( aceleracion_gravedad1) * 386.0886));
                    gal.setText(String.valueOf(parseDouble( aceleracion_gravedad1) *  980.665 ));
                    galileo.setText(String.valueOf(parseDouble( aceleracion_gravedad1) * 980.665 ));

                }else if(aceleracion_gravedad1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!aceleracion_gravedad1.isEmpty()){
                        String newcadena = aceleracion_gravedad1.substring ( 0, aceleracion_gravedad1.length() - 1 );
                        aceleracion_gravedad.setText(newcadena);
                        aceleracion_gravedad.setSelection(aceleracion_gravedad.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = aceleracion_gravedad1.substring ( 0, aceleracion_gravedad1.length() - 2 );
                    aceleracion_gravedad.setText(newcadena);
                    aceleracion_gravedad.setSelection(aceleracion_gravedad.getText().length());
                }
            }

        }
    };










    public void limpiar(){

    kilometro_s2.getText().clear();
    metro_s2.getText().clear();
    milimetro_s2.getText().clear();
    micrometro_s2.getText().clear();
    nanometro_s2.getText().clear();
    milla_s2.getText().clear();
    yarda_s2.getText().clear();
    pie_s2.getText().clear();
    pulgada_s2.getText().clear();
    gal.getText().clear();
    galileo.getText().clear();
    aceleracion_gravedad.getText().clear();

}



}