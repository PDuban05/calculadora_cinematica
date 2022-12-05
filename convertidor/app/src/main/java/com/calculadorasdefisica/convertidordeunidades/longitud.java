package com.calculadorasdefisica.convertidordeunidades;

import static java.lang.Double.parseDouble;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.convertidordeunidades.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;


public class longitud extends Fragment {

    EditText micrometro,milimetro,centimetro,metro,kilometro,pulgada,pie, yarda,furlong,milla,milla_nautica,año_luz,parsec,unidad_astronomica,angstrom,mil;
    String micrometro1,milimetro1,centimetro1,metro1,kilometro1,pulgada1,pie1, yarda1,furlong1,milla1,milla_nautica1,año_luz1,parsec1,unidad_astronomica1,angstrom1,mil1;
    private AdView mAdView, mAdView2;

    public longitud() {
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
        return inflater.inflate(R.layout.fragment_longitud, container, false);
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





        micrometro = view.findViewById(R.id.micrometro);
        milimetro = view.findViewById(R.id.milimetro);
        centimetro= view.findViewById(R.id.centimetro);
        metro = view.findViewById(R.id.metro);
        kilometro = view.findViewById(R.id.kilometro);
        pulgada = view.findViewById(R.id.pulgada);
        pie = view.findViewById(R.id.pie);
        yarda = view.findViewById(R.id.yarda);
        furlong = view.findViewById(R.id.furlong);
        milla = view.findViewById(R.id.milla);
        milla_nautica = view.findViewById(R.id.milla_nautica);
        año_luz = view.findViewById(R.id.año_luz);
        parsec = view.findViewById(R.id.parsec);
        unidad_astronomica = view.findViewById(R.id.unidad_astronomica);
        angstrom = view.findViewById(R.id.angstron);
        mil = view.findViewById(R.id.mil);


        micrometro.addTextChangedListener(changemicrometro);
        milimetro.addTextChangedListener(changemilimetro);
        centimetro.addTextChangedListener(changecentimetro);
        metro.addTextChangedListener(changemetros);
        kilometro.addTextChangedListener(changekilometros);
        pulgada.addTextChangedListener(changepulgada);
        pie.addTextChangedListener(changepie);
        yarda.addTextChangedListener(changeyarda);
        furlong.addTextChangedListener(changefurlong);
        milla.addTextChangedListener(changemilla);
        milla_nautica.addTextChangedListener(changemilla_nautica);
        año_luz.addTextChangedListener(changeaño_luz);
        parsec.addTextChangedListener(changeparsec);
        unidad_astronomica.addTextChangedListener(changeunidad_astronomica);
        angstrom.addTextChangedListener(changeangstrom);
        mil.addTextChangedListener(changemil);





    }
    public TextWatcher changemicrometro= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            micrometro1 = micrometro.getText().toString();
            boolean val = micrometro.isFocused();
            try {
                if(!micrometro1.isEmpty() && val ==true){

                    milimetro.setText(String.valueOf(parseDouble(micrometro1) / 1000));
                    centimetro.setText(String.valueOf(parseDouble(micrometro1) / 10000));
                    metro.setText(String.valueOf(parseDouble(micrometro1) / 1000000));
                    kilometro.setText(String.valueOf(parseDouble(micrometro1) / 1000000000));
                    pulgada.setText(String.valueOf(parseDouble(micrometro1) / 25400));
                    pie.setText(String.valueOf(parseDouble(micrometro1) / 304800));
                    yarda.setText(String.valueOf(parseDouble(micrometro1) / 914400));
                    furlong.setText(String.valueOf(parseDouble(micrometro1) / 201200000));
                    milla.setText(String.valueOf(parseDouble(micrometro1) / 1609000000));
                    milla_nautica.setText(String.valueOf(parseDouble(micrometro1) / 1852000000));
                    año_luz.setText(String.valueOf(parseDouble(micrometro1) * (1.0570234105227  *  Math.pow(10,-22))));
                    parsec.setText(String.valueOf(parseDouble(micrometro1) *(3.240779 *  Math.pow(10,-23))));
                    unidad_astronomica.setText(String.valueOf(parseDouble(micrometro1) * (6.684589 *  Math.pow(10,-18))));
                    angstrom.setText(String.valueOf(parseDouble(micrometro1) * 10000));
                    mil.setText(String.valueOf(parseDouble(micrometro1) / 25.4));

                }else if(micrometro1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!micrometro1.isEmpty()){
                        String newcadena = micrometro1.substring ( 0, micrometro1.length() - 1 );
                        micrometro.setText(newcadena);
                        micrometro.setSelection(micrometro.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = micrometro1.substring ( 0, micrometro1.length() - 2 );
                    micrometro.setText(newcadena);
                    micrometro.setSelection(micrometro.getText().length());
                }
            }

        }
    };

    public TextWatcher changemilimetro= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            milimetro1 = milimetro.getText().toString();
            boolean val = milimetro.isFocused();

            try {
                if(!milimetro1.isEmpty() && val ==true){

                    micrometro.setText(String.valueOf(parseDouble(milimetro1) * 1000));
                    centimetro.setText(String.valueOf(parseDouble(milimetro1) / 10));
                    metro.setText(String.valueOf(parseDouble(milimetro1) / 1000));
                    kilometro.setText(String.valueOf(parseDouble(milimetro1) / 1000000));
                    pulgada.setText(String.valueOf(parseDouble(milimetro1) / 25.4));
                    pie.setText(String.valueOf(parseDouble(milimetro1) / 304.8));
                    yarda.setText(String.valueOf(parseDouble(milimetro1) / 914.4));
                    furlong.setText(String.valueOf(parseDouble(milimetro1) / 201200));
                    milla.setText(String.valueOf(parseDouble(milimetro1) / 1609000));
                    milla_nautica.setText(String.valueOf(parseDouble(milimetro1) / 1852000));
                    año_luz.setText(String.valueOf(parseDouble(milimetro1) * (1.0570234105227001 *  Math.pow(10,-19))));
                    parsec.setText(String.valueOf(parseDouble(milimetro1) *(3.240779 *  Math.pow(10,-20))));
                    unidad_astronomica.setText(String.valueOf(parseDouble(milimetro1) * ( 6.684589 *  Math.pow(10,-15))));
                    angstrom.setText(String.valueOf(parseDouble(milimetro1) * 10000000));
                    mil.setText(String.valueOf(parseDouble(milimetro1) * 39.37));


                }else if(milimetro1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!milimetro1.isEmpty()){
                        String newcadena = milimetro1.substring ( 0, milimetro1.length() - 1 );
                        milimetro.setText(newcadena);
                        milimetro.setSelection(milimetro.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = milimetro1.substring ( 0, milimetro1.length() - 2 );
                    milimetro.setText(newcadena);
                    milimetro.setSelection(milimetro.getText().length());
                }
            }


        }
    };

    public TextWatcher changecentimetro= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            centimetro1 = centimetro.getText().toString();
            boolean val = centimetro.isFocused();
            try {
                if(!centimetro1.isEmpty() && val ==true){

                    micrometro.setText(String.valueOf(parseDouble(centimetro1) * 10000));
                    milimetro.setText(String.valueOf(parseDouble(centimetro1) * 10));
                    metro.setText(String.valueOf(parseDouble(centimetro1) / 100));
                    kilometro.setText(String.valueOf(parseDouble(centimetro1) / 100000));
                    pulgada.setText(String.valueOf(parseDouble(centimetro1) / 2.54));
                    pie.setText(String.valueOf(parseDouble(centimetro1) / 30.48));
                    yarda.setText(String.valueOf(parseDouble(centimetro1) / 91.44));
                    furlong.setText(String.valueOf(parseDouble(centimetro1) / 20120));
                    milla.setText(String.valueOf(parseDouble(centimetro1) /  160900));
                    milla_nautica.setText(String.valueOf(parseDouble(centimetro1) / 185200));
                    año_luz.setText(String.valueOf(parseDouble(centimetro1) * (1.0570234105227 *  Math.pow(10,-18))));
                    parsec.setText(String.valueOf(parseDouble(centimetro1) *(3.2407790000000005 *  Math.pow(10,-19))));
                    unidad_astronomica.setText(String.valueOf(parseDouble(centimetro1) * ( 6.684589000000001 *  Math.pow(10,-14))));
                    angstrom.setText(String.valueOf(parseDouble(centimetro1) * 100000000));
                    mil.setText(String.valueOf(parseDouble(centimetro1) * 393.7));


                }else if(centimetro1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!centimetro1.isEmpty()){
                        String newcadena = centimetro1.substring ( 0, centimetro1.length() - 1 );
                        centimetro.setText(newcadena);
                        centimetro.setSelection(centimetro.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = centimetro1.substring ( 0, centimetro1.length() - 2 );
                    centimetro.setText(newcadena);
                    centimetro.setSelection(centimetro.getText().length());
                }
            }

        }
    };

    public TextWatcher changemetros= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            metro1 = metro.getText().toString();
            boolean val = metro.isFocused();

            try {
                if(!metro1.isEmpty() && val ==true){

                    micrometro.setText(String.valueOf(parseDouble(metro1) * 1000000));
                    milimetro.setText(String.valueOf(parseDouble(metro1) * 1000));
                    centimetro.setText(String.valueOf(parseDouble(metro1) * 100));
                    kilometro.setText(String.valueOf(parseDouble(metro1) / 1000));
                    pulgada.setText(String.valueOf(parseDouble(metro1) * 39.37));
                    pie.setText(String.valueOf(parseDouble(metro1) * 3.281));
                    yarda.setText(String.valueOf(parseDouble(metro1) * 1.094));
                    furlong.setText(String.valueOf(parseDouble(metro1) / 201.2));
                    milla.setText(String.valueOf(parseDouble(metro1) /  1609));
                    milla_nautica.setText(String.valueOf(parseDouble(metro1) / 1852));
                    año_luz.setText(String.valueOf(parseDouble(metro1) * (1.0570234105227 *  Math.pow(10,-16))));
                    parsec.setText(String.valueOf(parseDouble(metro1) *(3.240779 *  Math.pow(10,-17))));
                    unidad_astronomica.setText(String.valueOf(parseDouble(metro1) * ( 6.684589 *  Math.pow(10,-12))));
                    angstrom.setText(String.valueOf(parseDouble(metro1) * ( 1 *  Math.pow(10,10))));
                    mil.setText(String.valueOf(parseDouble(metro1) * 39370));


                }else if(metro1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!metro1.isEmpty()){
                        String newcadena = metro1.substring ( 0, metro1.length() - 1 );
                        metro.setText(newcadena);
                        metro.setSelection(metro.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = metro1.substring ( 0, metro1.length() - 2 );
                    metro.setText(newcadena);
                    metro.setSelection(metro.getText().length());
                }
            }


        }
    };

    public TextWatcher changekilometros= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            kilometro1 = kilometro.getText().toString();
            boolean val = kilometro.isFocused();
            try {
                if(!kilometro1.isEmpty() && val ==true){

                    micrometro.setText(String.valueOf(parseDouble(kilometro1) * 1000000000));
                    milimetro.setText(String.valueOf(parseDouble(kilometro1) * 1000000));
                    centimetro.setText(String.valueOf(parseDouble(kilometro1) * 100000));
                    metro.setText(String.valueOf(parseDouble(kilometro1) * 1000));
                    pulgada.setText(String.valueOf(parseDouble(kilometro1) * 39370));
                    pie.setText(String.valueOf(parseDouble(kilometro1) * 3281));
                    yarda.setText(String.valueOf(parseDouble(kilometro1) * 1094));
                    furlong.setText(String.valueOf(parseDouble(kilometro1) *  4.971));
                    milla.setText(String.valueOf(parseDouble(kilometro1) /  1.609));
                    milla_nautica.setText(String.valueOf(parseDouble(kilometro1) / 1.852));
                    año_luz.setText(String.valueOf(parseDouble(kilometro1) * (1.0570234105227 *  Math.pow(10,-13))));
                    parsec.setText(String.valueOf(parseDouble(kilometro1) *(3.2407790000000004 *  Math.pow(10,-14))));
                    unidad_astronomica.setText(String.valueOf(parseDouble(kilometro1) * (6.6845890000000005 *  Math.pow(10,-9))));
                    angstrom.setText(String.valueOf(parseDouble(kilometro1) * ( 1 *  Math.pow(10,13))));
                    mil.setText(String.valueOf(parseDouble(kilometro1) * 39370000));


                }else if(kilometro1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!kilometro1.isEmpty()){
                        String newcadena = kilometro1.substring ( 0, kilometro1.length() - 1 );
                        kilometro.setText(newcadena);
                        kilometro.setSelection(kilometro.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = kilometro1.substring ( 0, kilometro1.length() - 2 );
                    kilometro.setText(newcadena);
                    kilometro.setSelection(kilometro.getText().length());
                }
            }

        }
    };

    public TextWatcher changepulgada= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            pulgada1 = pulgada.getText().toString();
            boolean val = pulgada.isFocused();
            try {
                if(!pulgada1.isEmpty() && val ==true){

                    micrometro.setText(String.valueOf(parseDouble(pulgada1) * 25400));
                    milimetro.setText(String.valueOf(parseDouble(pulgada1) *  25.4));
                    centimetro.setText(String.valueOf(parseDouble(pulgada1) * 2.54));
                    metro.setText(String.valueOf(parseDouble(pulgada1) / 39.37));
                    kilometro.setText(String.valueOf(parseDouble(pulgada1) /  39370));
                    pie.setText(String.valueOf(parseDouble(pulgada1) / 12));
                    yarda.setText(String.valueOf(parseDouble(pulgada1) / 36));
                    furlong.setText(String.valueOf(parseDouble(pulgada1) / 7920));
                    milla.setText(String.valueOf(parseDouble(pulgada1) / 63360));
                    milla_nautica.setText(String.valueOf(parseDouble(pulgada1) / 72910));
                    año_luz.setText(String.valueOf(parseDouble(pulgada1) * (2.6848394627276578 *  Math.pow(10,-18))));
                    parsec.setText(String.valueOf(parseDouble(pulgada1) *( 8.231578660000001 *  Math.pow(10,-19))));
                    unidad_astronomica.setText(String.valueOf(parseDouble(pulgada1) * (1.697885606 *  Math.pow(10,-13))));
                    angstrom.setText(String.valueOf(parseDouble(pulgada1) * ( 2.54 *  Math.pow(10,8))));
                    mil.setText(String.valueOf(parseDouble(pulgada1) * 1000));


                }else if(pulgada1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!pulgada1.isEmpty()){
                        String newcadena = pulgada1.substring ( 0, pulgada1.length() - 1 );
                        pulgada.setText(newcadena);
                        pulgada.setSelection(pulgada.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = pulgada1.substring ( 0, pulgada1.length() - 2 );
                    pulgada.setText(newcadena);
                    pulgada.setSelection(pulgada.getText().length());
                }
            }

        }
    };

    public TextWatcher changepie= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            pie1 = pie.getText().toString();
            boolean val = pie.isFocused();

            try {
                if(!pie1.isEmpty() && val ==true){

                    micrometro.setText(String.valueOf(parseDouble(pie1) * 304800));
                    milimetro.setText(String.valueOf(parseDouble(pie1) * 304.8));
                    centimetro.setText(String.valueOf(parseDouble(pie1) * 30.48));
                    metro.setText(String.valueOf(parseDouble(pie1) / 3.281));
                    kilometro.setText(String.valueOf(parseDouble(pie1) / 3281));
                    pulgada.setText(String.valueOf(parseDouble(pie1) * 12));
                    yarda.setText(String.valueOf(parseDouble(pie1) / 3));
                    furlong.setText(String.valueOf(parseDouble(pie1) / 660));
                    milla.setText(String.valueOf(parseDouble(pie1) /  5280));
                    milla_nautica.setText(String.valueOf(parseDouble(pie1) / 6076));
                    año_luz.setText(String.valueOf(parseDouble(pie1) * (3.22180735527319 *  Math.pow(10,-17))));
                    parsec.setText(String.valueOf(parseDouble(pie1) *(9.877894392000002 *  Math.pow(10,-18))));
                    unidad_astronomica.setText(String.valueOf(parseDouble(pie1) * ( 2.0374627272 *  Math.pow(10,-12))));
                    angstrom.setText(String.valueOf(parseDouble(pie1) * ( 3.048 *  Math.pow(10,9))));
                    mil.setText(String.valueOf(parseDouble(pie1) * 12000));


                }else if(pie1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!pie1.isEmpty()){
                        String newcadena = pie1.substring ( 0, pie1.length() - 1 );
                        pie.setText(newcadena);
                        pie.setSelection(pie.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = pie1.substring ( 0, pie1.length() - 2 );
                    pie.setText(newcadena);
                    pie.setSelection(pie.getText().length());
                }
            }


        }
    };

    public TextWatcher changeyarda= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            yarda1 = yarda.getText().toString();
            boolean val = yarda.isFocused();

            try {
                if(!yarda1.isEmpty() && val ==true){

                    micrometro.setText(String.valueOf(parseDouble(yarda1) * 914400));
                    milimetro.setText(String.valueOf(parseDouble(yarda1) * 914.4));
                    centimetro.setText(String.valueOf(parseDouble(yarda1) * 91.44));
                    metro.setText(String.valueOf(parseDouble(yarda1) / 1.094));
                    kilometro.setText(String.valueOf(parseDouble(yarda1) / 1094));
                    pulgada.setText(String.valueOf(parseDouble(yarda1) * 36));
                    pie.setText(String.valueOf(parseDouble(yarda1) * 3));
                    furlong.setText(String.valueOf(parseDouble(yarda1) / 220));
                    milla.setText(String.valueOf(parseDouble(yarda1) /  1760));
                    milla_nautica.setText(String.valueOf(parseDouble(yarda1) / 2025));
                    año_luz.setText(String.valueOf(parseDouble(yarda1) * (9.665422065819568 *  Math.pow(10,-17))));
                    parsec.setText(String.valueOf(parseDouble(yarda1) *(2.9633683176 *  Math.pow(10,-17))));
                    unidad_astronomica.setText(String.valueOf(parseDouble(yarda1) * ( 6.1123881816*  Math.pow(10,-12))));
                    angstrom.setText(String.valueOf(parseDouble(yarda1) * ( 9.144 *  Math.pow(10,9))));
                    mil.setText(String.valueOf(parseDouble(yarda1) * 36000));


                }else if(yarda1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!yarda1.isEmpty()){
                        String newcadena = yarda1.substring ( 0, yarda1.length() - 1 );
                        yarda.setText(newcadena);
                        yarda.setSelection(yarda.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = yarda1.substring ( 0, yarda1.length() - 2 );
                    yarda.setText(newcadena);
                    yarda.setSelection(yarda.getText().length());
                }
            }


        }
    };

    public TextWatcher changefurlong= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            furlong1 = furlong.getText().toString();
            boolean val = furlong.isFocused();
            try {
                if(!furlong1.isEmpty() && val ==true){

                    micrometro.setText(String.valueOf(parseDouble(furlong1) * (2.012 *  Math.pow(10,8))));
                    milimetro.setText(String.valueOf(parseDouble(furlong1) * 201200));
                    centimetro.setText(String.valueOf(parseDouble(furlong1) * 20120));
                    metro.setText(String.valueOf(parseDouble(furlong1) * 201.2));
                    kilometro.setText(String.valueOf(parseDouble(furlong1) / 4.971));
                    pulgada.setText(String.valueOf(parseDouble(furlong1) * 7920));
                    pie.setText(String.valueOf(parseDouble(furlong1) * 660));
                    yarda.setText(String.valueOf(parseDouble(furlong1) * 220));
                    milla.setText(String.valueOf(parseDouble(furlong1) /  8));
                    milla_nautica.setText(String.valueOf(parseDouble(furlong1) / 9.206));
                    año_luz.setText(String.valueOf(parseDouble(furlong1) * (2.126392854480305*  Math.pow(10,-14))));
                    parsec.setText(String.valueOf(parseDouble(furlong1) *(6.5194102987200005 *  Math.pow(10,-15))));
                    unidad_astronomica.setText(String.valueOf(parseDouble(furlong1) * ( 1.3447253999520001 *  Math.pow(10,-9))));
                    angstrom.setText(String.valueOf(parseDouble(furlong1) * ( 2.012 *  Math.pow(10,12))));
                    mil.setText(String.valueOf(parseDouble(furlong1) * (  7.92 *  Math.pow(10,6))));


                }else if(furlong1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!furlong1.isEmpty()){
                        String newcadena = furlong1.substring ( 0, furlong1.length() - 1 );
                        furlong.setText(newcadena);
                        furlong.setSelection(furlong.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = furlong1.substring ( 0, furlong1.length() - 2 );
                    furlong.setText(newcadena);
                    furlong.setSelection(furlong.getText().length());
                }
            }

        }
    };

    public TextWatcher changemilla= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            milla1 = milla.getText().toString();
            boolean val = milla.isFocused();

            try {
                if(!milla1.isEmpty() && val ==true){

                    micrometro.setText(String.valueOf(parseDouble(milla1) * (1.609 *  Math.pow(10,9))));
                    milimetro.setText(String.valueOf(parseDouble(milla1) * (1.609 *  Math.pow(10,6))));
                    centimetro.setText(String.valueOf(parseDouble(milla1) * 160900));
                    metro.setText(String.valueOf(parseDouble(milla1) * 1609));
                    kilometro.setText(String.valueOf(parseDouble(milla1) * 1.609));
                    pulgada.setText(String.valueOf(parseDouble(milla1) * 63360));
                    pie.setText(String.valueOf(parseDouble(milla1) * 5280));
                    yarda.setText(String.valueOf(parseDouble(milla1) * 1760));
                    furlong.setText(String.valueOf(parseDouble(milla1) *  8));
                    milla_nautica.setText(String.valueOf(parseDouble(milla1) / 1.151));
                    año_luz.setText(String.valueOf(parseDouble(milla1) * (1.701114283584244 *  Math.pow(10,-13))));
                    parsec.setText(String.valueOf(parseDouble(milla1) *(5.2155282389760004 *  Math.pow(10,-14))));
                    unidad_astronomica.setText(String.valueOf(parseDouble(milla1) * ( 1.0757803199616001 *  Math.pow(10,-8))));
                    angstrom.setText(String.valueOf(parseDouble(milla1) * ( 1.609 *  Math.pow(10,13))));
                    mil.setText(String.valueOf(parseDouble(milla1) * ( 6.33 *  Math.pow(10,7)) ));


                }else if(milla1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!milla1.isEmpty()){
                        String newcadena = milla1.substring ( 0, milla1.length() - 1 );
                        milla.setText(newcadena);
                        milla.setSelection(milla.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = milla1.substring ( 0, milla1.length() - 2 );
                    milla.setText(newcadena);
                    milla.setSelection(milla.getText().length());
                }
            }


        }
    };

    public TextWatcher changemilla_nautica= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            milla_nautica1 = milla_nautica.getText().toString();
            boolean val = milla_nautica.isFocused();

            try{
                if(!milla_nautica1.isEmpty() && val ==true){

                    micrometro.setText(String.valueOf(parseDouble(milla_nautica1) * (1.852*  Math.pow(10,9))));
                    milimetro.setText(String.valueOf(parseDouble(milla_nautica1) * (1.852*  Math.pow(10,6))));
                    centimetro.setText(String.valueOf(parseDouble(milla_nautica1) * 185200));
                    metro.setText(String.valueOf(parseDouble(milla_nautica1) * 1852));
                    kilometro.setText(String.valueOf(parseDouble(milla_nautica1) * 1.852));
                    pulgada.setText(String.valueOf(parseDouble(milla_nautica1) * 72910));
                    pie.setText(String.valueOf(parseDouble(milla_nautica1) * 6076));
                    yarda.setText(String.valueOf(parseDouble(milla_nautica1) * 2025));
                    furlong.setText(String.valueOf(parseDouble(milla_nautica1) * 9.206));
                    milla.setText(String.valueOf(parseDouble(milla_nautica1) *  1.151));
                    año_luz.setText(String.valueOf(parseDouble(milla_nautica1) * (1.9576073562880405*  Math.pow(10,-13))));
                    parsec.setText(String.valueOf(parseDouble(milla_nautica1) *(6.001922708 *  Math.pow(10,-14))));
                    unidad_astronomica.setText(String.valueOf(parseDouble(milla_nautica1) * ( 1.2379858828 *  Math.pow(10,-8))));
                    angstrom.setText(String.valueOf(parseDouble(milla_nautica1) * ( 1.852 *  Math.pow(10,13))));
                    mil.setText(String.valueOf(parseDouble(milla_nautica1) * (7.291 *  Math.pow(10,7))));


                }else if(milla_nautica1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!milla_nautica1.isEmpty()){
                        String newcadena = milla_nautica1.substring ( 0, milla_nautica1.length() - 1 );
                        milla_nautica.setText(newcadena);
                        milla_nautica.setSelection(milla_nautica.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = milla_nautica1.substring ( 0, milla_nautica1.length() - 2 );
                    milla_nautica.setText(newcadena);
                    milla_nautica.setSelection(milla_nautica.getText().length());
                }
            }

        }
    };

    public TextWatcher changeaño_luz= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            año_luz1 = año_luz.getText().toString();
            boolean val = año_luz.isFocused();

            try {
                if(!año_luz1.isEmpty() && val ==true){

                    micrometro.setText(String.valueOf(parseDouble(año_luz1) * (9.461 *  Math.pow(10,21))));
                    milimetro.setText(String.valueOf(parseDouble(año_luz1) * (9.461 *  Math.pow(10,18))));
                    centimetro.setText(String.valueOf(parseDouble(año_luz1) * (9.461 *  Math.pow(10,17))));
                    metro.setText(String.valueOf(parseDouble(año_luz1) * (9.461 *  Math.pow(10,15))));
                    kilometro.setText(String.valueOf(parseDouble(año_luz1) *  (9.461 *  Math.pow(10,12))));
                    pulgada.setText(String.valueOf(parseDouble(año_luz1) * (3.725 *  Math.pow(10,17))));
                    pie.setText(String.valueOf(parseDouble(año_luz1) * (3.104 *  Math.pow(10,16))));
                    yarda.setText(String.valueOf(parseDouble(año_luz1) * (1.035 *  Math.pow(10,16))));
                    furlong.setText(String.valueOf(parseDouble(año_luz1) * (4.703 *  Math.pow(10,13))));
                    milla.setText(String.valueOf(parseDouble(año_luz1) *  (5.879 *  Math.pow(10,12))));
                    milla_nautica.setText(String.valueOf(parseDouble(año_luz1) * (5.108 *  Math.pow(10,-12))));
                    parsec.setText(String.valueOf(parseDouble(año_luz1) /  3.262 ));
                    unidad_astronomica.setText(String.valueOf(parseDouble(año_luz1) * 63240 ));
                    angstrom.setText(String.valueOf(parseDouble(año_luz1) * ( 9.461 *  Math.pow(10,25))));
                    mil.setText(String.valueOf(parseDouble(año_luz1) * ( 3.725 *  Math.pow(10,20))));

                }else if(año_luz1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!año_luz1.isEmpty()){
                        String newcadena = año_luz1.substring ( 0, año_luz1.length() - 1 );
                        año_luz.setText(newcadena);
                        año_luz.setSelection(año_luz.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = año_luz1.substring ( 0, año_luz1.length() - 2 );
                    año_luz.setText(newcadena);
                    año_luz.setSelection(año_luz.getText().length());
                }
            }


        }
    };

    public TextWatcher changeparsec= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            parsec1 = parsec.getText().toString();
            boolean val = parsec.isFocused();

            try {
                if(!parsec1.isEmpty() && val ==true){

                    micrometro.setText(String.valueOf(parseDouble(parsec1) * (3.086 *  Math.pow(10,22))));
                    milimetro.setText(String.valueOf(parseDouble(parsec1) * (3.086 *  Math.pow(10,19))));
                    centimetro.setText(String.valueOf(parseDouble(parsec1) * (3.086 *  Math.pow(10,18))));
                    metro.setText(String.valueOf(parseDouble(parsec1) * (3.086 *  Math.pow(10,16))));
                    kilometro.setText(String.valueOf(parseDouble(parsec1) *  (3.086 *  Math.pow(10,13))));
                    pulgada.setText(String.valueOf(parseDouble(parsec1) * (1.215 *  Math.pow(10,18))));
                    pie.setText(String.valueOf(parseDouble(parsec1) * (1.012 *  Math.pow(10,17))));
                    yarda.setText(String.valueOf(parseDouble(parsec1) * (3.375 *  Math.pow(10,16))));
                    furlong.setText(String.valueOf(parseDouble(parsec1) * (1.534 *  Math.pow(10,14))));
                    milla.setText(String.valueOf(parseDouble(parsec1) *  (1.917 *  Math.pow(10,13))));
                    milla_nautica.setText(String.valueOf(parseDouble(parsec1) * (1.666 *  Math.pow(10,13))));
                    año_luz.setText(String.valueOf(parseDouble(parsec1) * 3.262 ));
                    unidad_astronomica.setText(String.valueOf(parseDouble(parsec1) * 206300 ));
                    angstrom.setText(String.valueOf(parseDouble(parsec1) * ( 3.086 *  Math.pow(10,26))));
                    mil.setText(String.valueOf(parseDouble(parsec1) * ( 1.215 *  Math.pow(10,21))));

                }else if(parsec1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!parsec1.isEmpty()){
                        String newcadena = parsec1.substring ( 0, parsec1.length() - 1 );
                        parsec.setText(newcadena);
                        parsec.setSelection(parsec.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = parsec1.substring ( 0, parsec1.length() - 2 );
                    parsec.setText(newcadena);
                    parsec.setSelection(parsec.getText().length());
                }
            }


        }
    };

    public TextWatcher changeunidad_astronomica= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            unidad_astronomica1 = unidad_astronomica.getText().toString();
            boolean val = unidad_astronomica.isFocused();

            try {
                if(!unidad_astronomica1.isEmpty() && val ==true){

                    micrometro.setText(String.valueOf(parseDouble(unidad_astronomica1) * (1.496 *  Math.pow(10,17))));
                    milimetro.setText(String.valueOf(parseDouble(unidad_astronomica1) * (1.496 *  Math.pow(10,14))));
                    centimetro.setText(String.valueOf(parseDouble(unidad_astronomica1) * (1.496 *  Math.pow(10,13))));
                    metro.setText(String.valueOf(parseDouble(unidad_astronomica1) * (1.496 *  Math.pow(10,11))));
                    kilometro.setText(String.valueOf(parseDouble(unidad_astronomica1) *  (1.496 *  Math.pow(10,8))));
                    pulgada.setText(String.valueOf(parseDouble(unidad_astronomica1) * (5.89 *  Math.pow(10,12))));
                    pie.setText(String.valueOf(parseDouble(unidad_astronomica1) * ( 4.908 *  Math.pow(10,11))));
                    yarda.setText(String.valueOf(parseDouble(unidad_astronomica1) * (1.636 *  Math.pow(10,11))));
                    furlong.setText(String.valueOf(parseDouble(unidad_astronomica1) * ( 7.436 *  Math.pow(10,8))));
                    milla.setText(String.valueOf(parseDouble(unidad_astronomica1) *  (9.296 *  Math.pow(10,7))));
                    milla_nautica.setText(String.valueOf(parseDouble(unidad_astronomica1) * (8.078 *  Math.pow(10,7))));
                    año_luz.setText(String.valueOf(parseDouble(unidad_astronomica1) / 63240));
                    parsec.setText(String.valueOf(parseDouble(unidad_astronomica1) / 206300));
                    angstrom.setText(String.valueOf(parseDouble(unidad_astronomica1) * ( 1.496*  Math.pow(10,21))));
                    mil.setText(String.valueOf(parseDouble(unidad_astronomica1) * ( 5.89 *  Math.pow(10,15))));

                }else if(unidad_astronomica1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!unidad_astronomica1.isEmpty()){
                        String newcadena = unidad_astronomica1.substring ( 0, unidad_astronomica1.length() - 1 );
                        unidad_astronomica.setText(newcadena);
                        unidad_astronomica.setSelection(unidad_astronomica.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = unidad_astronomica1.substring ( 0, unidad_astronomica1.length() - 2 );
                    unidad_astronomica.setText(newcadena);
                    unidad_astronomica.setSelection(unidad_astronomica.getText().length());
                }
            }


        }
    };

    public TextWatcher changeangstrom= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            angstrom1 = angstrom.getText().toString();
            boolean val = angstrom.isFocused();
            try {
                if(!angstrom1.isEmpty() && val ==true){

                    micrometro.setText(String.valueOf(parseDouble(angstrom1) / 10000));
                    milimetro.setText(String.valueOf(parseDouble(angstrom1) / (1 *  Math.pow(10,7))));
                    centimetro.setText(String.valueOf(parseDouble(angstrom1) / (1 *  Math.pow(10,8))));
                    metro.setText(String.valueOf(parseDouble(angstrom1) / (1 *  Math.pow(10,10))));
                    kilometro.setText(String.valueOf(parseDouble(angstrom1) /  (1 *  Math.pow(10,13))));
                    pulgada.setText(String.valueOf(parseDouble(angstrom1) / (2.54 *  Math.pow(10,8))));
                    pie.setText(String.valueOf(parseDouble(angstrom1) / ( 3.048 *  Math.pow(10,9))));
                    yarda.setText(String.valueOf(parseDouble(angstrom1) / (9.144 *  Math.pow(10,9))));
                    furlong.setText(String.valueOf(parseDouble(angstrom1) / ( 2.012 *  Math.pow(10,12))));
                    milla.setText(String.valueOf(parseDouble(angstrom1) /  ( 1.609 *  Math.pow(10,13))));
                    milla_nautica.setText(String.valueOf(parseDouble(angstrom1) / (1.852 *  Math.pow(10,13))));
                    año_luz.setText(String.valueOf(parseDouble(angstrom1) / ( 9.461*  Math.pow(10,25))));
                    parsec.setText(String.valueOf(parseDouble(angstrom1) / ( 3.086 *  Math.pow(10,26))));
                    unidad_astronomica.setText(String.valueOf(parseDouble(angstrom1) / ( 1.496 *  Math.pow(10,21))));
                    mil.setText(String.valueOf(parseDouble(angstrom1) / 254000));

                }else if(angstrom1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!angstrom1.isEmpty()){
                        String newcadena = angstrom1.substring ( 0, angstrom1.length() - 1 );
                        angstrom.setText(newcadena);
                        angstrom.setSelection(angstrom.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = angstrom1.substring ( 0, angstrom1.length() - 2 );
                    angstrom.setText(newcadena);
                    angstrom.setSelection(angstrom.getText().length());
                }
            }

        }
    };

    public TextWatcher changemil= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            mil1 = mil.getText().toString();
            boolean val = mil.isFocused();

            try {
                if(!mil1.isEmpty() && val ==true){

                    micrometro.setText(String.valueOf(parseDouble(mil1) * 25.4));
                    milimetro.setText(String.valueOf(parseDouble(mil1) / 39.37));
                    centimetro.setText(String.valueOf(parseDouble(mil1) / 393.7));
                    metro.setText(String.valueOf(parseDouble(mil1) / 39370));
                    kilometro.setText(String.valueOf(parseDouble(mil1) /  (3.937 *  Math.pow(10,7))));
                    pulgada.setText(String.valueOf(parseDouble(mil1) / 1000));
                    pie.setText(String.valueOf(parseDouble(mil1) / 12000 ));
                    yarda.setText(String.valueOf(parseDouble(mil1) / 36000));
                    furlong.setText(String.valueOf(parseDouble(mil1) / ( 7.92 *  Math.pow(10,6))));
                    milla.setText(String.valueOf(parseDouble(mil1) /  ( 6.336 *  Math.pow(10,7))));
                    milla_nautica.setText(String.valueOf(parseDouble(mil1) / (7.291 *  Math.pow(10,7))));
                    año_luz.setText(String.valueOf(parseDouble(mil1) / ( 3.725 *  Math.pow(10,20))));
                    parsec.setText(String.valueOf(parseDouble(mil1) / ( 1.215 *  Math.pow(10,21))));
                    unidad_astronomica.setText(String.valueOf(parseDouble(mil1) / (  5.89 *  Math.pow(10,15))));
                    angstrom.setText(String.valueOf(parseDouble(mil1) * 254000));

                }else if(mil1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!mil1.isEmpty()){
                        String newcadena = mil1.substring ( 0, mil1.length() - 1 );
                        mil.setText(newcadena);
                        mil.setSelection(mil.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = mil1.substring ( 0, mil1.length() - 2 );
                    mil.setText(newcadena);
                    mil.setSelection(mil.getText().length());
                }
            }


        }
    };

    public void limpiar(){
        milimetro.getText().clear();
        micrometro.getText().clear();
        centimetro.getText().clear();
        metro.getText().clear();
        kilometro.getText().clear();
        pulgada.getText().clear();
        pie.getText().clear();
        yarda.getText().clear();
        furlong.getText().clear();
        milla.getText().clear();
        milla_nautica.getText().clear();
        año_luz.getText().clear();
        parsec.getText().clear();
        unidad_astronomica.getText().clear();
        angstrom.getText().clear();
        mil.getText().clear();


    }
















}
