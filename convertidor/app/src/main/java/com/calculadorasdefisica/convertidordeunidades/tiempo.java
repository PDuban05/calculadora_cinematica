package com.calculadorasdefisica.convertidordeunidades;

import static java.lang.Double.parseDouble;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
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


public class tiempo extends Fragment {

    private  EditText segundos,minutos,horas,dias,semanas,meses,años,decadas,siglos,milenios;
    private  String segundos1,minutos1,horas1,dias1,semanas1,meses1,años1,decadas1,siglos1,milenios1;
    private AdView mAdView, mAdView2;



    public tiempo() {
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
        return inflater.inflate(R.layout.fragment_tiempo, container, false);
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

        segundos = view.findViewById(R.id.segundos);
        minutos = view.findViewById(R.id.minutos);
        horas = view.findViewById(R.id.horas);
        dias = view.findViewById(R.id.dias);
        semanas = view.findViewById(R.id.semanas);
        meses = view.findViewById(R.id.meses);
        años = view.findViewById(R.id.años);
        decadas = view.findViewById(R.id.decadas);
        siglos = view.findViewById(R.id.siglos);
        milenios = view.findViewById(R.id.milenios);

        segundos.addTextChangedListener(changesegundo);
        minutos.addTextChangedListener(changeminutos);
        horas.addTextChangedListener(changehoras);
        dias.addTextChangedListener(changedias);
        semanas.addTextChangedListener(changesemanas);
        meses.addTextChangedListener(changemeses);
        años.addTextChangedListener(changeaños);
        decadas.addTextChangedListener(changedecadas);
        siglos.addTextChangedListener(changesiglos);
        milenios.addTextChangedListener(changemilenios);

    }

    public TextWatcher changesegundo= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {



            segundos1 = segundos.getText().toString();
            boolean val = segundos.isFocused();

            try {
                if(!segundos1.isEmpty() && val ==true){

                    minutos.setText(String.valueOf(parseDouble(segundos1) / 60 ));
                    horas.setText(String.valueOf(parseDouble(segundos1) / 3600));
                    dias.setText(String.valueOf(parseDouble(segundos1) / 86400));
                    semanas.setText(String.valueOf(parseDouble(segundos1) / 604800 ));
                    meses.setText(String.valueOf(parseDouble(segundos1)  / (2.628 *  Math.pow(10,6)) ));
                    años.setText(String.valueOf(parseDouble(segundos1) / (3.154 *  Math.pow(10,7))));
                    decadas.setText(String.valueOf(parseDouble(segundos1) / (3.154 *  Math.pow(10,8))));
                    siglos.setText(String.valueOf(parseDouble(segundos1) / (3.154 *  Math.pow(10,9))));
                    milenios.setText(String.valueOf(parseDouble(segundos1) / (3.154 *  Math.pow(10,10))));

                }else if(segundos1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!segundos1.isEmpty()){
                        String newcadena = segundos1.substring ( 0, segundos1.length() - 1 );
                        segundos.setText(newcadena);
                        segundos.setSelection(segundos.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = segundos1.substring ( 0, segundos1.length() - 2 );
                    segundos.setText(newcadena);
                    segundos.setSelection(segundos.getText().length());
                }
            }


        }
    };

    public TextWatcher changeminutos= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            minutos1 = minutos.getText().toString();
            boolean val = minutos.isFocused();

            try {
                if(!minutos1.isEmpty() && val ==true){

                    segundos.setText(String.valueOf(parseDouble(minutos1) * 60 ));
                    horas.setText(String.valueOf(parseDouble(minutos1) / 60));
                    dias.setText(String.valueOf(parseDouble(minutos1) / 1440 ));
                    semanas.setText(String.valueOf(parseDouble(minutos1) / 10080 ));
                    meses.setText(String.valueOf(parseDouble(minutos1) / 43800 ));
                    años.setText(String.valueOf(parseDouble(minutos1) / 525600));
                    decadas.setText(String.valueOf(parseDouble(minutos1) / (5.256 *  Math.pow(10,6))));
                    siglos.setText(String.valueOf(parseDouble(minutos1) / ( 5.256 *  Math.pow(10,7))));
                    milenios.setText(String.valueOf(parseDouble(minutos1) / ( 5.256 *  Math.pow(10,8))));

                }else if(minutos1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!minutos1.isEmpty()){
                        String newcadena = minutos1.substring ( 0, minutos1.length() - 1 );
                        minutos.setText(newcadena);
                        minutos.setSelection(minutos.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = minutos1.substring ( 0, minutos1.length() - 2 );
                    minutos.setText(newcadena);
                    minutos.setSelection(minutos.getText().length());
                }
            }


        }
    };

    public TextWatcher changehoras= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            horas1 = horas.getText().toString();
            boolean val = horas.isFocused();

            try{
                if(!horas1.isEmpty() && val ==true){

                    segundos.setText(String.valueOf(parseDouble(horas1) * 3600 ));
                    minutos.setText(String.valueOf(parseDouble(horas1) * 60));
                    dias.setText(String.valueOf(parseDouble(horas1) / 24 ));
                    semanas.setText(String.valueOf(parseDouble(horas1) / 168 ));
                    meses.setText(String.valueOf(parseDouble(horas1) / 730 ));
                    años.setText(String.valueOf(parseDouble(horas1) /  8760));
                    decadas.setText(String.valueOf(parseDouble(horas1) / 87600));
                    siglos.setText(String.valueOf(parseDouble(horas1) / 876000));
                    milenios.setText(String.valueOf(parseDouble(horas1) / 8760000));

                }else if(horas1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!horas1.isEmpty()){
                        String newcadena = horas1.substring ( 0, horas1.length() - 1 );
                        horas.setText(newcadena);
                        horas.setSelection(horas.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = horas1.substring ( 0, horas1.length() - 2 );
                    horas.setText(newcadena);
                    horas.setSelection(horas.getText().length());
                }
            }


        }
    };

    public TextWatcher changedias= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            dias1 = dias.getText().toString();
            boolean val = dias.isFocused();

            try {
                if(!dias1.isEmpty() && val ==true){

                    segundos.setText(String.valueOf(parseDouble(dias1) * 86400));
                    minutos.setText(String.valueOf(parseDouble(dias1) * 1440));
                    horas.setText(String.valueOf(parseDouble(dias1) * 24 ));
                    semanas.setText(String.valueOf(parseDouble(dias1) / 7 ));
                    meses.setText(String.valueOf(parseDouble(dias1) / 30.417));
                    años.setText(String.valueOf(parseDouble(dias1) /  365));
                    decadas.setText(String.valueOf(parseDouble(dias1) / 3650));
                    siglos.setText(String.valueOf(parseDouble(dias1) / 36500));
                    milenios.setText(String.valueOf(parseDouble(dias1) / 365000));

                }else if(dias1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!dias1.isEmpty()){
                        String newcadena = dias1.substring ( 0, dias1.length() - 1 );
                        dias.setText(newcadena);
                        dias.setSelection(dias.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = dias1.substring ( 0, dias1.length() - 2 );
                    dias.setText(newcadena);
                    dias.setSelection(dias.getText().length());
                }
            }


        }
    };

    public TextWatcher changesemanas= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            semanas1 = semanas.getText().toString();
            boolean val = semanas.isFocused();

        try{
            if(!semanas1.isEmpty() && val ==true){

                segundos.setText(String.valueOf(parseDouble(semanas1) * 604800));
                minutos.setText(String.valueOf(parseDouble(semanas1) * 10080));
                horas.setText(String.valueOf(parseDouble(semanas1) * 168 ));
                dias.setText(String.valueOf(parseDouble(semanas1) * 7 ));
                meses.setText(String.valueOf(parseDouble(semanas1) / 4.345));
                años.setText(String.valueOf(parseDouble(semanas1) /  52.143));
                decadas.setText(String.valueOf(parseDouble(semanas1) / 521.4));
                siglos.setText(String.valueOf(parseDouble(semanas1) / 5214));
                milenios.setText(String.valueOf(parseDouble(semanas1) / 365000));

            }else if(semanas1.isEmpty()){
                limpiar();
            }
        }catch (Exception e){

            try{
                if (!semanas1.isEmpty()){
                    String newcadena = semanas1.substring ( 0, semanas1.length() - 1 );
                    semanas.setText(newcadena);
                    semanas.setSelection(semanas.getText().length());
                }
            }catch (Exception e1){

                String newcadena = semanas1.substring ( 0, semanas1.length() - 2 );
                semanas.setText(newcadena);
                semanas.setSelection(semanas.getText().length());
            }
        }

        }
    };

    public TextWatcher changemeses= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            meses1 = meses.getText().toString();
            boolean val = meses.isFocused();

            try {
                if(!meses1.isEmpty() && val ==true){

                    segundos.setText(String.valueOf(parseDouble(meses1) * (2.628 *  Math.pow(10,6))));
                    minutos.setText(String.valueOf(parseDouble(meses1) * 43800));
                    horas.setText(String.valueOf(parseDouble(meses1) * 730 ));
                    dias.setText(String.valueOf(parseDouble(meses1) * 30.417));
                    semanas.setText(String.valueOf(parseDouble(meses1) * 4.345));
                    años.setText(String.valueOf(parseDouble(meses1) /  12));
                    decadas.setText(String.valueOf(parseDouble(meses1) / 120));
                    siglos.setText(String.valueOf(parseDouble(meses1) / 1200));
                    milenios.setText(String.valueOf(parseDouble(meses1) / 12000));

                }else if(meses1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!meses1.isEmpty()){
                        String newcadena = meses1.substring ( 0, meses1.length() - 1 );
                        meses.setText(newcadena);
                        meses.setSelection(meses.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = meses1.substring ( 0, meses1.length() - 2 );
                    meses.setText(newcadena);
                    meses.setSelection(meses.getText().length());
                }
            }


        }
    };

    public TextWatcher changeaños= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            años1 = años.getText().toString();
            boolean val = años.isFocused();

            try {
                if(!años1.isEmpty() && val ==true){

                    segundos.setText(String.valueOf(parseDouble(años1) * (3.154 *  Math.pow(10,7))));
                    minutos.setText(String.valueOf(parseDouble(años1) * 525600));
                    horas.setText(String.valueOf(parseDouble(años1) *  8760));
                    dias.setText(String.valueOf(parseDouble(años1) * 365));
                    semanas.setText(String.valueOf(parseDouble(años1) * 52.143));
                    meses.setText(String.valueOf(parseDouble(años1) *  12));
                    decadas.setText(String.valueOf(parseDouble(años1) / 10));
                    siglos.setText(String.valueOf(parseDouble(años1) / 100));
                    milenios.setText(String.valueOf(parseDouble(años1) / 1000));

                }else if(años1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!años1.isEmpty()){
                        String newcadena = años1.substring ( 0, años1.length() - 1 );
                        años.setText(newcadena);
                        años.setSelection(años.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = años1.substring ( 0, años1.length() - 2 );
                    años.setText(newcadena);
                    años.setSelection(años.getText().length());
                }
            }

        }
    };

    public TextWatcher changedecadas= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            decadas1 = decadas.getText().toString();
            boolean val = decadas.isFocused();

            try {
                if(!decadas1.isEmpty() && val ==true){

                    segundos.setText(String.valueOf(parseDouble(decadas1) * (3.154 *  Math.pow(10,8))));
                    minutos.setText(String.valueOf(parseDouble(decadas1) * (5.256 *  Math.pow(10,6))));
                    horas.setText(String.valueOf(parseDouble(decadas1) *  87600));
                    dias.setText(String.valueOf(parseDouble(decadas1) *  3650));
                    semanas.setText(String.valueOf(parseDouble(decadas1) * 521.4));
                    meses.setText(String.valueOf(parseDouble(decadas1) *  120));
                    años.setText(String.valueOf(parseDouble(decadas1) * 10));
                    siglos.setText(String.valueOf(parseDouble(decadas1) / 10));
                    milenios.setText(String.valueOf(parseDouble(decadas1) / 100));

                }else if(decadas1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!decadas1.isEmpty()){
                        String newcadena = decadas1.substring ( 0, decadas1.length() - 1 );
                        decadas.setText(newcadena);
                        decadas.setSelection(decadas.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = decadas1.substring ( 0, decadas1.length() - 2 );
                    decadas.setText(newcadena);
                    decadas.setSelection(decadas.getText().length());
                }
            }


        }
    };

    public TextWatcher changesiglos= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            siglos1 = siglos.getText().toString();
            boolean val = siglos.isFocused();

            try {
                if(!siglos1.isEmpty() && val ==true){

                    segundos.setText(String.valueOf(parseDouble(siglos1) * (3.154 *  Math.pow(10,9))));
                    minutos.setText(String.valueOf(parseDouble(siglos1) * (5.256 *  Math.pow(10,7))));
                    horas.setText(String.valueOf(parseDouble(siglos1) *  876000));
                    dias.setText(String.valueOf(parseDouble(siglos1) *  36500));
                    semanas.setText(String.valueOf(parseDouble(siglos1) *  5214));
                    meses.setText(String.valueOf(parseDouble(siglos1) *  1200));
                    años.setText(String.valueOf(parseDouble(siglos1) * 100));
                    decadas.setText(String.valueOf(parseDouble(siglos1) * 10));
                    milenios.setText(String.valueOf(parseDouble(siglos1) / 10));

                }else if(siglos1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!siglos1.isEmpty()){
                        String newcadena = siglos1.substring ( 0, siglos1.length() - 1 );
                        siglos.setText(newcadena);
                        siglos.setSelection(siglos.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = siglos1.substring ( 0, siglos1.length() - 2 );
                    siglos.setText(newcadena);
                    siglos.setSelection(siglos.getText().length());
                }
            }


        }
    };

    public TextWatcher changemilenios= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            milenios1 = milenios.getText().toString();
            boolean val = milenios.isFocused();

            try {
                if(!milenios1.isEmpty() && val ==true){

                    segundos.setText(String.valueOf(parseDouble(milenios1) * (3.154 *  Math.pow(10,10))));
                    minutos.setText(String.valueOf(parseDouble(milenios1) * (5.256 *  Math.pow(10,8))));
                    horas.setText(String.valueOf(parseDouble(milenios1) *  ( 8.76 *  Math.pow(10,6))));
                    dias.setText(String.valueOf(parseDouble(milenios1) *  365000));
                    semanas.setText(String.valueOf(parseDouble(milenios1) *  52140));
                    meses.setText(String.valueOf(parseDouble(milenios1) *  12000));
                    años.setText(String.valueOf(parseDouble(milenios1) * 1000));
                    decadas.setText(String.valueOf(parseDouble(milenios1) * 100));
                    siglos.setText(String.valueOf(parseDouble(milenios1) * 10));

                }else if(milenios1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!milenios1.isEmpty()){
                        String newcadena = milenios1.substring ( 0, milenios1.length() - 1 );
                        milenios.setText(newcadena);
                        milenios.setSelection(milenios.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = milenios1.substring ( 0, milenios1.length() - 2 );
                    milenios.setText(newcadena);
                    milenios.setSelection(milenios.getText().length());
                }
            }

        }
    };








    public void limpiar(){
        segundos.getText().clear();
        minutos.getText().clear();
        horas.getText().clear();
        dias.getText().clear();
        semanas.getText().clear();
        meses.getText().clear();
        años.getText().clear();
        decadas.getText().clear();
        siglos.getText().clear();
        milenios.getText().clear();
    }


}
