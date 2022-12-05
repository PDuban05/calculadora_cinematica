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


public class energia extends Fragment {

    EditText megajoule,kilojoule,joule,kilowatt_hora,watt_hora,btu_it,caloria_it,tonelada_explosivos,kilogramo_fuerza_metro,pie_libra_fuerza,pie_poundal,ergio,electronvolt;
    String megajoule1,kilojoule1,joule1,kilowatt_hora1,watt_hora1,btu_it1,caloria_it1,tonelada_explosivos1,kilogramo_fuerza_metro1,pie_libra_fuerza1,pie_poundal1,ergio1,electronvolt1;
    private AdView mAdView, mAdView2;

    public energia() {
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
        return inflater.inflate(R.layout.fragment_energia, container, false);
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

    megajoule = view.findViewById(R.id.megajoule);
    kilojoule = view.findViewById(R.id.kilojoule);
    joule = view.findViewById(R.id.joule);
    kilowatt_hora = view.findViewById(R.id.kilowatt_hora);
    watt_hora = view.findViewById(R.id.watt_hora);
    btu_it = view.findViewById(R.id.btu_it);
    caloria_it = view.findViewById(R.id.caloria_it);
    tonelada_explosivos = view.findViewById(R.id.tonelada_explosivos);
    kilogramo_fuerza_metro = view.findViewById(R.id.kilogramo_fuerza_metro);
    pie_libra_fuerza = view.findViewById(R.id.pie_libra_fuerza);
    pie_poundal = view.findViewById(R.id.pie_poundal);
    ergio = view.findViewById(R.id.ergio);
    electronvolt = view.findViewById(R.id.electronvolt);

    megajoule.addTextChangedListener(changemegajoule);
    kilojoule.addTextChangedListener(changekilojoule);
    joule.addTextChangedListener(changejoule);
    kilowatt_hora.addTextChangedListener(changekilowatt_hora);
    watt_hora.addTextChangedListener(changewatt_hora);
    btu_it.addTextChangedListener(changebtu);
    caloria_it.addTextChangedListener(changecaloria);
    tonelada_explosivos.addTextChangedListener(changetonelada);
    kilogramo_fuerza_metro.addTextChangedListener(changekilogramo_fuerza_metro);
    pie_libra_fuerza.addTextChangedListener(changepie_libra_fuerza);
    pie_poundal.addTextChangedListener(changepie_poundal);
    ergio.addTextChangedListener(changeergio);
    electronvolt.addTextChangedListener(changeelectronvolt);

    }

    public TextWatcher changemegajoule= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            megajoule1 = megajoule.getText().toString();
            boolean val = megajoule.isFocused();
            try {
                if(!megajoule1.isEmpty() && val ==true){


                    kilojoule.setText(String.valueOf(parseDouble( megajoule1) * 1000));
                    joule.setText(String.valueOf(parseDouble( megajoule1) * (1 * Math.pow(10,6))));
                    kilowatt_hora.setText(String.valueOf(parseDouble( megajoule1) / 3.6));
                    watt_hora.setText(String.valueOf(parseDouble( megajoule1) / 0.0036));
                    btu_it.setText(String.valueOf(parseDouble( megajoule1) * 947.8));
                    caloria_it.setText(String.valueOf(parseDouble( megajoule1) * 239000));
                    tonelada_explosivos.setText(String.valueOf(parseDouble( megajoule1) * (2.3901 * Math.pow(10,-4))));
                    kilogramo_fuerza_metro.setText(String.valueOf(parseDouble( megajoule1) * 101971.621300936 ));
                    pie_libra_fuerza.setText(String.valueOf(parseDouble( megajoule1) * 737562.1492772 ));
                    pie_poundal.setText(String.valueOf(parseDouble( megajoule1) * 23730360.4571 ));
                    ergio.setText(String.valueOf(parseDouble( megajoule1) * (1*Math.pow(10,13))));
                    electronvolt.setText(String.valueOf(parseDouble( megajoule1) * (6.242 * Math.pow(10,24)) ));

                }else if(megajoule1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!megajoule1.isEmpty()){
                        String newcadena = megajoule1.substring ( 0, megajoule1.length() - 1 );
                        megajoule.setText(newcadena);
                        megajoule.setSelection(megajoule.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = megajoule1.substring ( 0, megajoule1.length() - 2 );
                    megajoule.setText(newcadena);
                    megajoule.setSelection(megajoule.getText().length());
                }
            }

        }
    };

    public TextWatcher changekilojoule= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            kilojoule1 = kilojoule.getText().toString();
            boolean val = kilojoule.isFocused();
            try {
                if(!kilojoule1.isEmpty() && val ==true){


                    megajoule.setText(String.valueOf(parseDouble( kilojoule1) / 1000));
                    joule.setText(String.valueOf(parseDouble( kilojoule1) * 1000));
                    kilowatt_hora.setText(String.valueOf(parseDouble( kilojoule1) * (2.7778 *  Math.pow(10,-4))));
                    watt_hora.setText(String.valueOf(parseDouble( kilojoule1) * 0.2778));
                    btu_it.setText(String.valueOf(parseDouble( kilojoule1) * 0.9478));
                    caloria_it.setText(String.valueOf(parseDouble( kilojoule1) * 238.8459));
                    tonelada_explosivos.setText(String.valueOf(parseDouble( kilojoule1) * (2.3901 * Math.pow(10,-7))));
                    kilogramo_fuerza_metro.setText(String.valueOf(parseDouble( kilojoule1) * 101.9716));
                    pie_libra_fuerza.setText(String.valueOf(parseDouble( kilojoule1) * 737.5621 ));
                    pie_poundal.setText(String.valueOf(parseDouble( kilojoule1) * 23730.3605 ));
                    ergio.setText(String.valueOf(parseDouble( kilojoule1) * (1*Math.pow(10,10))));
                    electronvolt.setText(String.valueOf(parseDouble( kilojoule1) * (6.241 * Math.pow(10,21)) ));

                }else if(kilojoule1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!kilojoule1.isEmpty()){
                        String newcadena = kilojoule1.substring ( 0, kilojoule1.length() - 1 );
                        kilojoule.setText(newcadena);
                        kilojoule.setSelection(kilojoule.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = kilojoule1.substring ( 0, kilojoule1.length() - 2 );
                    kilojoule.setText(newcadena);
                    kilojoule.setSelection(kilojoule.getText().length());
                }
            }

        }
    };

    public TextWatcher changejoule= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            joule1 = joule.getText().toString();
            boolean val = joule.isFocused();
            try {
                if(!joule1.isEmpty() && val ==true){


                    megajoule.setText(String.valueOf(parseDouble( joule1) * (1 * Math.pow(10,-6))));
                    kilojoule.setText(String.valueOf(parseDouble( joule1) * 0.001 ));
                    kilowatt_hora.setText(String.valueOf(parseDouble( joule1) * (2.7778 * Math.pow(10,-7))));
                    watt_hora.setText(String.valueOf(parseDouble( joule1) * (2.7778 * Math.pow(10,-4))));
                    btu_it.setText(String.valueOf(parseDouble( joule1) *  (9.478 * Math.pow(10,-4))));
                    caloria_it.setText(String.valueOf(parseDouble( joule1) * 0.2388));
                    tonelada_explosivos.setText(String.valueOf(parseDouble( joule1) * (2.3901 * Math.pow(10,-10))));
                    kilogramo_fuerza_metro.setText(String.valueOf(parseDouble( joule1) * 0.102 ));
                    pie_libra_fuerza.setText(String.valueOf(parseDouble( joule1) * 0.7376 ));
                    pie_poundal.setText(String.valueOf(parseDouble( joule1) *  23.7304 ));
                    ergio.setText(String.valueOf(parseDouble( joule1) * (1*Math.pow(10,7))));
                    electronvolt.setText(String.valueOf(parseDouble( joule1) * (6.2415 * Math.pow(10,18)) ));

                }else if(joule1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!joule1.isEmpty()){
                        String newcadena = joule1.substring ( 0, joule1.length() - 1 );
                        joule.setText(newcadena);
                        joule.setSelection(joule.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = joule1.substring ( 0, joule1.length() - 2 );
                    joule.setText(newcadena);
                    joule.setSelection(joule.getText().length());
                }
            }

        }
    };

    public TextWatcher changekilowatt_hora= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            kilowatt_hora1 = kilowatt_hora.getText().toString();
            boolean val = kilowatt_hora.isFocused();
            try {
                if(!kilowatt_hora1.isEmpty() && val ==true){


                    megajoule.setText(String.valueOf(parseDouble( kilowatt_hora1) * 3.6));
                    kilojoule.setText(String.valueOf(parseDouble( kilowatt_hora1) * 3600 ));
                    joule.setText(String.valueOf(parseDouble( kilowatt_hora1) * 3600000));
                    watt_hora.setText(String.valueOf(parseDouble( kilowatt_hora1) * 1000));
                    btu_it.setText(String.valueOf(parseDouble( kilowatt_hora1) *  3412.1416));
                    caloria_it.setText(String.valueOf(parseDouble( kilowatt_hora1) * 859845.2279));
                    tonelada_explosivos.setText(String.valueOf(parseDouble( kilowatt_hora1) * (8.6042 * Math.pow(10,-4))));
                    kilogramo_fuerza_metro.setText(String.valueOf(parseDouble( kilowatt_hora1) * 367098.8367 ));
                    pie_libra_fuerza.setText(String.valueOf(parseDouble( kilowatt_hora1) * 2655223.7374 ));
                    pie_poundal.setText(String.valueOf(parseDouble( kilowatt_hora1) *  (8.5429 * Math.pow(10,7)) ));
                    ergio.setText(String.valueOf(parseDouble( kilowatt_hora1) * (3.6*Math.pow(10,13))));
                    electronvolt.setText(String.valueOf(parseDouble( kilowatt_hora1) * (2.2469* Math.pow(10,25)) ));

                }else if(kilowatt_hora1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!kilowatt_hora1.isEmpty()){
                        String newcadena = kilowatt_hora1.substring ( 0, kilowatt_hora1.length() - 1 );
                        kilowatt_hora.setText(newcadena);
                        kilowatt_hora.setSelection(kilowatt_hora.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = kilowatt_hora1.substring ( 0, kilowatt_hora1.length() - 2 );
                    kilowatt_hora.setText(newcadena);
                    kilowatt_hora.setSelection(kilowatt_hora.getText().length());
                }
            }

        }
    };

    public TextWatcher changewatt_hora= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            watt_hora1 = watt_hora.getText().toString();
            boolean val = watt_hora.isFocused();
            try {
                if(!watt_hora1.isEmpty() && val ==true){


                    megajoule.setText(String.valueOf(parseDouble( watt_hora1) * 0.0036));
                    kilojoule.setText(String.valueOf(parseDouble( watt_hora1) * 3.6 ));
                    joule.setText(String.valueOf(parseDouble( watt_hora1) * 3600));
                    kilowatt_hora.setText(String.valueOf(parseDouble( watt_hora1) * 0.001));
                    btu_it.setText(String.valueOf(parseDouble( watt_hora1) *  3.4121));
                    caloria_it.setText(String.valueOf(parseDouble( watt_hora1) * 859.8452));
                    tonelada_explosivos.setText(String.valueOf(parseDouble( watt_hora1) * (8.6042 * Math.pow(10,-7))));
                    kilogramo_fuerza_metro.setText(String.valueOf(parseDouble( watt_hora1) * 367.0978 ));
                    pie_libra_fuerza.setText(String.valueOf(parseDouble( watt_hora1) * 2655.2237));
                    pie_poundal.setText(String.valueOf(parseDouble( watt_hora1) *  85429.2976 ));
                    ergio.setText(String.valueOf(parseDouble( watt_hora1) * (3.6 * Math.pow(10,10))));
                    electronvolt.setText(String.valueOf(parseDouble( watt_hora1) * (2.2469* Math.pow(10,22)) ));

                }else if(watt_hora1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!watt_hora1.isEmpty()){
                        String newcadena = watt_hora1.substring ( 0, watt_hora1.length() - 1 );
                        watt_hora.setText(newcadena);
                        watt_hora.setSelection(watt_hora.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = watt_hora1.substring ( 0, watt_hora1.length() - 2 );
                    watt_hora.setText(newcadena);
                    watt_hora.setSelection(watt_hora.getText().length());
                }
            }

        }
    };

    public TextWatcher changebtu= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            btu_it1 = btu_it.getText().toString();
            boolean val = btu_it.isFocused();
            try {
                if(!btu_it1.isEmpty() && val ==true){


                    megajoule.setText(String.valueOf(parseDouble( btu_it1) * 0.0011));
                    kilojoule.setText(String.valueOf(parseDouble( btu_it1) * 1.0551 ));
                    joule.setText(String.valueOf(parseDouble( btu_it1) * 1055.0559));
                    kilowatt_hora.setText(String.valueOf(parseDouble( btu_it1) * (2.9307 * Math.pow(10,-4))));
                    watt_hora.setText(String.valueOf(parseDouble( btu_it1) *  0.2931));
                    caloria_it.setText(String.valueOf(parseDouble( btu_it1) * 251.9958));
                    tonelada_explosivos.setText(String.valueOf(parseDouble( btu_it1) * (2.5216 * Math.pow(10,-7))));
                    kilogramo_fuerza_metro.setText(String.valueOf(parseDouble( btu_it1) * 107.5858 ));
                    pie_libra_fuerza.setText(String.valueOf(parseDouble( btu_it1) * 778.1693));
                    pie_poundal.setText(String.valueOf(parseDouble( btu_it1) *  25036.8557 ));
                    ergio.setText(String.valueOf(parseDouble( btu_it1) * (1.0551 * Math.pow(10,10))));
                    electronvolt.setText(String.valueOf(parseDouble( btu_it1) * (6.5851* Math.pow(10,21)) ));

                }else if(btu_it1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!btu_it1.isEmpty()){
                        String newcadena = btu_it1.substring ( 0, btu_it1.length() - 1 );
                        btu_it.setText(newcadena);
                        btu_it.setSelection(btu_it.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = btu_it1.substring ( 0, btu_it1.length() - 2 );
                    btu_it.setText(newcadena);
                    btu_it.setSelection(btu_it.getText().length());
                }
            }

        }
    };

    public TextWatcher changecaloria= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            caloria_it1 = caloria_it.getText().toString();
            boolean val = caloria_it.isFocused();
            try {
                if(!caloria_it1.isEmpty() && val ==true){


                    megajoule.setText(String.valueOf(parseDouble( caloria_it1) * (4.1868 * Math.pow(10,-6))));
                    kilojoule.setText(String.valueOf(parseDouble( caloria_it1) * 0.0042 ));
                    joule.setText(String.valueOf(parseDouble( caloria_it1) * 4.1868));
                    kilowatt_hora.setText(String.valueOf(parseDouble( caloria_it1) * (1.163 * Math.pow(10,-6))));
                    watt_hora.setText(String.valueOf(parseDouble( caloria_it1) *  0.0012));
                    btu_it.setText(String.valueOf(parseDouble( caloria_it1) * 0.004));
                    tonelada_explosivos.setText(String.valueOf(parseDouble( caloria_it1) * (1.0007 * Math.pow(10,-9))));
                    kilogramo_fuerza_metro.setText(String.valueOf(parseDouble( caloria_it1) * 0.4269 ));
                    pie_libra_fuerza.setText(String.valueOf(parseDouble( caloria_it1) * 3.088));
                    pie_poundal.setText(String.valueOf(parseDouble( caloria_it1) *  99.3543));
                    ergio.setText(String.valueOf(parseDouble( caloria_it1) * (4.1868 * Math.pow(10,7))));
                    electronvolt.setText(String.valueOf(parseDouble( caloria_it1) * (2.6132* Math.pow(10,19)) ));

                }else if(caloria_it1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!caloria_it1.isEmpty()){
                        String newcadena = caloria_it1.substring ( 0, caloria_it1.length() - 1 );
                        caloria_it.setText(newcadena);
                        caloria_it.setSelection(caloria_it.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = caloria_it1.substring ( 0, caloria_it1.length() - 2 );
                    caloria_it.setText(newcadena);
                    caloria_it.setSelection(caloria_it.getText().length());
                }
            }

        }
    };

    public TextWatcher changetonelada= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            tonelada_explosivos1 = tonelada_explosivos.getText().toString();
            boolean val = tonelada_explosivos.isFocused();
            try {
                if(!tonelada_explosivos1.isEmpty() && val ==true){


                    megajoule.setText(String.valueOf(parseDouble( tonelada_explosivos1) * 4184 ));
                    kilojoule.setText(String.valueOf(parseDouble( tonelada_explosivos1) * 4184000));
                    joule.setText(String.valueOf(parseDouble( tonelada_explosivos1) * (4.184 * Math.pow(10,9))));
                    kilowatt_hora.setText(String.valueOf(parseDouble( tonelada_explosivos1) * 1162.2222));
                    watt_hora.setText(String.valueOf(parseDouble( tonelada_explosivos1) *  1162222.2222));
                    btu_it.setText(String.valueOf(parseDouble( tonelada_explosivos1) * 3965666.8314));
                    caloria_it.setText(String.valueOf(parseDouble( tonelada_explosivos1) * (9.9933 * Math.pow(10,8))));
                    kilogramo_fuerza_metro.setText(String.valueOf(parseDouble( tonelada_explosivos1) * (4.2665 * Math.pow(10,8))));
                    pie_libra_fuerza.setText(String.valueOf(parseDouble( tonelada_explosivos1) * (3.086 * Math.pow(10,9))));
                    pie_poundal.setText(String.valueOf(parseDouble( tonelada_explosivos1) *  (9.9288 * Math.pow(10,10))));
                    ergio.setText(String.valueOf(parseDouble( tonelada_explosivos1) * (4.184 * Math.pow(10,16))));
                    electronvolt.setText(String.valueOf(parseDouble( tonelada_explosivos1) * (2.6132 * Math.pow(10,28))));

                }else if(tonelada_explosivos1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!tonelada_explosivos1.isEmpty()){
                        String newcadena = tonelada_explosivos1.substring ( 0, tonelada_explosivos1.length() - 1 );
                        tonelada_explosivos.setText(newcadena);
                        tonelada_explosivos.setSelection(tonelada_explosivos.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = tonelada_explosivos1.substring ( 0, tonelada_explosivos1.length() - 2 );
                    tonelada_explosivos.setText(newcadena);
                    tonelada_explosivos.setSelection(tonelada_explosivos.getText().length());
                }
            }

        }
    };

    public TextWatcher changekilogramo_fuerza_metro= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            kilogramo_fuerza_metro1 = kilogramo_fuerza_metro.getText().toString();
            boolean val = kilogramo_fuerza_metro.isFocused();
            try {
                if(!kilogramo_fuerza_metro1.isEmpty() && val ==true){


                    megajoule.setText(String.valueOf(parseDouble( kilogramo_fuerza_metro1) * (9.8066 * Math.pow(10,-6))));
                    kilojoule.setText(String.valueOf(parseDouble( kilogramo_fuerza_metro1) * 0.0098 ));
                    joule.setText(String.valueOf(parseDouble( kilogramo_fuerza_metro1) * 9.8066));
                    kilowatt_hora.setText(String.valueOf(parseDouble( kilogramo_fuerza_metro1) * (2.7241 * Math.pow(10,-6))));
                    watt_hora.setText(String.valueOf(parseDouble( kilogramo_fuerza_metro1) *  0.0027));
                    btu_it.setText(String.valueOf(parseDouble( kilogramo_fuerza_metro1) * 0.0093));
                    caloria_it.setText(String.valueOf(parseDouble( kilogramo_fuerza_metro1) * 2.3423));
                    tonelada_explosivos.setText(String.valueOf(parseDouble( kilogramo_fuerza_metro1) * (2.3438 * Math.pow(10,-9))));
                    pie_libra_fuerza.setText(String.valueOf(parseDouble( kilogramo_fuerza_metro1) * 7.233));
                    pie_poundal.setText(String.valueOf(parseDouble( kilogramo_fuerza_metro1) *  232.7153));
                    ergio.setText(String.valueOf(parseDouble( kilogramo_fuerza_metro1) * (9.8066 * Math.pow(10,7))));
                    electronvolt.setText(String.valueOf(parseDouble( kilogramo_fuerza_metro1) * (6.1208* Math.pow(10,19)) ));

                }else if(kilogramo_fuerza_metro1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!kilogramo_fuerza_metro1.isEmpty()){
                        String newcadena = kilogramo_fuerza_metro1.substring ( 0, kilogramo_fuerza_metro1.length() - 1 );
                        kilogramo_fuerza_metro.setText(newcadena);
                        kilogramo_fuerza_metro.setSelection(kilogramo_fuerza_metro.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = kilogramo_fuerza_metro1.substring ( 0, kilogramo_fuerza_metro1.length() - 2 );
                    kilogramo_fuerza_metro.setText(newcadena);
                    kilogramo_fuerza_metro.setSelection(kilogramo_fuerza_metro.getText().length());
                }
            }

        }
    };

    public TextWatcher changepie_libra_fuerza= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            pie_libra_fuerza1 = pie_libra_fuerza.getText().toString();
            boolean val = pie_libra_fuerza.isFocused();
            try {
                if(!pie_libra_fuerza1.isEmpty() && val ==true){


                    megajoule.setText(String.valueOf(parseDouble( pie_libra_fuerza1) * (1.3558 * Math.pow(10,-6))));
                    kilojoule.setText(String.valueOf(parseDouble( pie_libra_fuerza1) * 0.0014 ));
                    joule.setText(String.valueOf(parseDouble( pie_libra_fuerza1) * 1.3558));
                    kilowatt_hora.setText(String.valueOf(parseDouble( pie_libra_fuerza1) * (3.7662 * Math.pow(10,-7))));
                    watt_hora.setText(String.valueOf(parseDouble( pie_libra_fuerza1) *  (3.7662 * Math.pow(10,-7))));
                    btu_it.setText(String.valueOf(parseDouble( pie_libra_fuerza1) * 0.0013));
                    caloria_it.setText(String.valueOf(parseDouble( pie_libra_fuerza1) * 0.3238));
                    tonelada_explosivos.setText(String.valueOf(parseDouble( pie_libra_fuerza1) * (3.2405 * Math.pow(10,-10))));
                    kilogramo_fuerza_metro.setText(String.valueOf(parseDouble( pie_libra_fuerza1) * 0.1383));
                    pie_poundal.setText(String.valueOf(parseDouble( pie_libra_fuerza1) *  32.174));
                    ergio.setText(String.valueOf(parseDouble( pie_libra_fuerza1) * (1.3558 * Math.pow(10,7))));
                    electronvolt.setText(String.valueOf(parseDouble( pie_libra_fuerza1) * (8.4623 * Math.pow(10,18)) ));

                }else if(pie_libra_fuerza1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!pie_libra_fuerza1.isEmpty()){
                        String newcadena = pie_libra_fuerza1.substring ( 0, pie_libra_fuerza1.length() - 1 );
                        pie_libra_fuerza.setText(newcadena);
                        pie_libra_fuerza.setSelection(pie_libra_fuerza.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = pie_libra_fuerza1.substring ( 0, pie_libra_fuerza1.length() - 2 );
                    pie_libra_fuerza.setText(newcadena);
                    pie_libra_fuerza.setSelection(pie_libra_fuerza.getText().length());
                }
            }

        }
    };

    public TextWatcher changepie_poundal= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            pie_poundal1 = pie_poundal.getText().toString();
            boolean val = pie_poundal.isFocused();
            try {
                if(!pie_poundal1.isEmpty() && val ==true){


                    megajoule.setText(String.valueOf(parseDouble( pie_poundal1) * (4.214 * Math.pow(10,-8))));
                    kilojoule.setText(String.valueOf(parseDouble( pie_poundal1) * (4.214 * Math.pow(10,-5)) ));
                    joule.setText(String.valueOf(parseDouble( pie_poundal1) * 0.0421));
                    kilowatt_hora.setText(String.valueOf(parseDouble( pie_poundal1) * (1.1706 * Math.pow(10,-8))));
                    watt_hora.setText(String.valueOf(parseDouble( pie_poundal1) *  (1.1706 * Math.pow(10,-5))));
                    btu_it.setText(String.valueOf(parseDouble( pie_poundal1) * (3.9941 * Math.pow(10,-5))));
                    caloria_it.setText(String.valueOf(parseDouble( pie_poundal1) * 0.0101));
                    tonelada_explosivos.setText(String.valueOf(parseDouble( pie_poundal1) * (1.0072 * Math.pow(10,-11))));
                    kilogramo_fuerza_metro.setText(String.valueOf(parseDouble( pie_poundal1) * 0.0043));
                    pie_libra_fuerza.setText(String.valueOf(parseDouble( pie_poundal1) *  0.0311));
                    ergio.setText(String.valueOf(parseDouble( pie_poundal1) * 42140.1));
                    electronvolt.setText(String.valueOf(parseDouble( pie_poundal1) * (2.6302 * Math.pow(10,17)) ));

                }else if(pie_poundal1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!pie_poundal1.isEmpty()){
                        String newcadena = pie_poundal1.substring ( 0, pie_poundal1.length() - 1 );
                        pie_poundal.setText(newcadena);
                        pie_poundal.setSelection(pie_poundal.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = pie_poundal1.substring ( 0, pie_poundal1.length() - 2 );
                    pie_poundal.setText(newcadena);
                    pie_poundal.setSelection(pie_poundal.getText().length());
                }
            }

        }
    };

    public TextWatcher changeergio= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            ergio1 = ergio.getText().toString();
            boolean val = ergio.isFocused();
            try {
                if(!ergio1.isEmpty() && val ==true){


                    megajoule.setText(String.valueOf(parseDouble( ergio1) / (1 * Math.pow(10,13))));
                    kilojoule.setText(String.valueOf(parseDouble( ergio1) * (1 * Math.pow(10,-10)) ));
                    joule.setText(String.valueOf(parseDouble( ergio1) * (1 * Math.pow(10,-7))));
                    kilowatt_hora.setText(String.valueOf(parseDouble( ergio1) * (2.7778 * Math.pow(10,-14))));
                    watt_hora.setText(String.valueOf(parseDouble( ergio1) *  (2.7778 * Math.pow(10,-11))));
                    btu_it.setText(String.valueOf(parseDouble( ergio1) * (9.4782 * Math.pow(10,-11))));
                    caloria_it.setText(String.valueOf(parseDouble( ergio1) * (2.3885 * Math.pow(10,-8))));
                    tonelada_explosivos.setText(String.valueOf(parseDouble( ergio1) * (2.3901 * Math.pow(10,-17))));
                    kilogramo_fuerza_metro.setText(String.valueOf(parseDouble( ergio1) * (1.0197 * Math.pow(10,-8))));
                    pie_libra_fuerza.setText(String.valueOf(parseDouble( ergio1) * (7.3756 * Math.pow(10,-8))));
                    pie_poundal.setText(String.valueOf(parseDouble( ergio1) * (2.373 * Math.pow(10,-6))));
                    electronvolt.setText(String.valueOf(parseDouble( ergio1) * (6.2415 * Math.pow(10,11)) ));

                }else if(ergio1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!ergio1.isEmpty()){
                        String newcadena = ergio1.substring ( 0, ergio1.length() - 1 );
                        ergio.setText(newcadena);
                        ergio.setSelection(ergio.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = ergio1.substring ( 0, ergio1.length() - 2 );
                    ergio.setText(newcadena);
                    ergio.setSelection(ergio.getText().length());
                }
            }

        }
    };

    public TextWatcher changeelectronvolt = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            electronvolt1 = electronvolt.getText().toString();
            boolean val = electronvolt.isFocused();
            try {
                if(!electronvolt1.isEmpty() && val ==true){


                    megajoule.setText(String.valueOf(parseDouble( electronvolt1) * (1.6022 * Math.pow(10,-25))));
                    kilojoule.setText(String.valueOf(parseDouble( electronvolt1) * (1.6022 * Math.pow(10,-22)) ));
                    joule.setText(String.valueOf(parseDouble( electronvolt1) * (1.0622 * Math.pow(10,-19))));
                    kilowatt_hora.setText(String.valueOf(parseDouble( electronvolt1) * (4.4505 * Math.pow(10,-26))));
                    watt_hora.setText(String.valueOf(parseDouble( electronvolt1) *  (4.4505 * Math.pow(10,-23))));
                    btu_it.setText(String.valueOf(parseDouble( electronvolt1) * (1.5186 * Math.pow(10,-22))));
                    caloria_it.setText(String.valueOf(parseDouble( electronvolt1) * (3.8267 * Math.pow(10,-20))));
                    tonelada_explosivos.setText(String.valueOf(parseDouble( electronvolt1) * (3.8293 * Math.pow(10,-29))));
                    kilogramo_fuerza_metro.setText(String.valueOf(parseDouble( electronvolt1) * (1.6338 * Math.pow(10,-20))));
                    pie_libra_fuerza.setText(String.valueOf(parseDouble( electronvolt1) * (1.1817 * Math.pow(10,-19))));
                    pie_poundal.setText(String.valueOf(parseDouble( electronvolt1) * (3.802 * Math.pow(10,-18))));
                    ergio.setText(String.valueOf(parseDouble( electronvolt1) * (1.6022 * Math.pow(10,-12)) ));

                }else if(electronvolt1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!electronvolt1.isEmpty()){
                        String newcadena = electronvolt1.substring ( 0, electronvolt1.length() - 1 );
                        electronvolt.setText(newcadena);
                        electronvolt.setSelection(electronvolt.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = electronvolt1.substring ( 0, electronvolt1.length() - 2 );
                    electronvolt.setText(newcadena);
                    electronvolt.setSelection(electronvolt.getText().length());
                }
            }

        }
    };




    public void limpiar(){

        megajoule.getText().clear();
        kilojoule.getText().clear();
        joule.getText().clear();
        kilowatt_hora.getText().clear();
        watt_hora.getText().clear();
        btu_it.getText().clear();
        caloria_it.getText().clear();
        tonelada_explosivos.getText().clear();
        kilogramo_fuerza_metro.getText().clear();
        pie_libra_fuerza.getText().clear();
        pie_poundal.getText().clear();
        ergio.getText().clear();
        electronvolt.getText().clear();

    }



}