package com.calculadorasdefisica.convertidordeunidades;

import static java.lang.Double.parseDouble;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.TextKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.convertidordeunidades.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;


public class fuerza extends Fragment {

    EditText newton,kilonewton,gramo_fuerza,kilogramo_fuerza, libra_fuerza,onza_fuerza,joule_metro,dina,poundal,pondio;
    String newton1,kilonewton1,gramo_fuerza1,kilogramo_fuerza1,libra_fuerza1,onza_fuerza1,joule_metro1,dina1,poundal1,pondio1;

    private AdView mAdView, mAdView2;



    public fuerza() {
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
        return inflater.inflate(R.layout.fragment_fuerza, container, false);
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

        newton = view.findViewById(R.id.newton);
        kilonewton = view.findViewById(R.id.kilonewton);
        gramo_fuerza = view.findViewById(R.id.gramo_fuerza);
        kilogramo_fuerza = view.findViewById(R.id.kilogramo_fuerza);
        libra_fuerza = view.findViewById(R.id.libra_fuerza);
        onza_fuerza = view.findViewById(R.id.onza_fuerza);
        joule_metro = view.findViewById(R.id.joule_metro);
        dina = view.findViewById(R.id.dina);
        poundal = view.findViewById(R.id.poundal);
        pondio = view.findViewById(R.id.pondio);

        newton.addTextChangedListener(changenewton);
        kilonewton.addTextChangedListener(changekilonewton);
        gramo_fuerza.addTextChangedListener(changegramo_fuerza);
        kilogramo_fuerza.addTextChangedListener(changekilogramo_fuerza);
        libra_fuerza.addTextChangedListener(changelibra_fuerza);
        onza_fuerza.addTextChangedListener(changeonza_fuerza);
        joule_metro.addTextChangedListener(changejoule_metro);
        dina.addTextChangedListener(changedina);
        poundal.addTextChangedListener(changepoundal);
        pondio.addTextChangedListener(changepondio);


    }

    public TextWatcher changenewton = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {

            newton1 = newton.getText().toString();
            boolean val = newton.isFocused();

            try {
                if(!newton1.isEmpty() && val ==true){


                    kilonewton.setText(String.valueOf(parseDouble( newton1) * 0.001));
                    gramo_fuerza.setText(String.valueOf(parseDouble(newton1) * 101.9716 ));
                    kilogramo_fuerza.setText(String.valueOf(parseDouble(newton1) * 0.102));
                    libra_fuerza.setText(String.valueOf(parseDouble(newton1) * 0.2248));
                    onza_fuerza.setText(String.valueOf(parseDouble(newton1) *  3.5969));
                    joule_metro.setText(String.valueOf(parseDouble(newton1) * 1));
                    dina.setText(String.valueOf(parseDouble(newton1) * 100000));
                    poundal.setText(String.valueOf(parseDouble(newton1) * 7.233));
                    pondio.setText(String.valueOf(parseDouble(newton1) * 101.9716));




                }else if(newton1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!newton1.isEmpty()){
                        String newcadena = newton1.substring ( 0, newton1.length() - 1 );
                        newton.setText(newcadena);
                        newton.setSelection(newton.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = newton1.substring ( 0, newton1.length() - 2 );
                    newton.setText(newcadena);
                    newton.setSelection(newton.getText().length());
                }
            }

        }
    };

    public TextWatcher changekilonewton = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            kilonewton1 = kilonewton.getText().toString();
            boolean val = kilonewton.isFocused();
            try {
                if(!kilonewton1.isEmpty() && val ==true){


                    newton.setText(String.valueOf(parseDouble( kilonewton1) * 1000));
                    gramo_fuerza.setText(String.valueOf(parseDouble( kilonewton1) * 101971.6213 ));
                    kilogramo_fuerza.setText(String.valueOf(parseDouble( kilonewton1) * 101.9716));
                    libra_fuerza.setText(String.valueOf(parseDouble( kilonewton1) * 224.8089));
                    onza_fuerza.setText(String.valueOf(parseDouble( kilonewton1) *  3596.9431));
                    joule_metro.setText(String.valueOf(parseDouble( kilonewton1) * 1000));
                    dina.setText(String.valueOf(parseDouble( kilonewton1) * (1 * Math.pow(10,8))));
                    poundal.setText(String.valueOf(parseDouble( kilonewton1) * 7233.0139));
                    pondio.setText(String.valueOf(parseDouble( kilonewton1) * 101971.6213));


                }else if(kilonewton1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!kilonewton1.isEmpty()){
                        String newcadena = kilonewton1.substring ( 0, kilonewton1.length() - 1 );
                        kilonewton.setText(newcadena);
                        kilonewton.setSelection(kilonewton.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = kilonewton1.substring ( 0, kilonewton1.length() - 2 );
                    kilonewton.setText(newcadena);
                    kilonewton.setSelection(kilonewton.getText().length());
                }
            }

        }
    };

    public TextWatcher changegramo_fuerza = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            gramo_fuerza1 = gramo_fuerza.getText().toString();
            boolean val = gramo_fuerza.isFocused();
            try {
                if(!gramo_fuerza1.isEmpty() && val ==true){


                    newton.setText(String.valueOf(parseDouble( gramo_fuerza1) * 0.0098));
                    kilonewton.setText(String.valueOf(parseDouble( gramo_fuerza1) * (9.8067 * Math.pow(10,-6)) ));
                    kilogramo_fuerza.setText(String.valueOf(parseDouble( gramo_fuerza1) * 0.001));
                    libra_fuerza.setText(String.valueOf(parseDouble( gramo_fuerza1) * 0.0022));
                    onza_fuerza.setText(String.valueOf(parseDouble( gramo_fuerza1) *  0.0353));
                    joule_metro.setText(String.valueOf(parseDouble( gramo_fuerza1) * 0.0098));
                    dina.setText(String.valueOf(parseDouble( gramo_fuerza1) * 980.665));
                    poundal.setText(String.valueOf(parseDouble( gramo_fuerza1) * 0.0709));
                    pondio.setText(String.valueOf(parseDouble( gramo_fuerza1) * 1));


                }else if(gramo_fuerza1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!gramo_fuerza1.isEmpty()){
                        String newcadena = gramo_fuerza1.substring ( 0, gramo_fuerza1.length() - 1 );
                        gramo_fuerza.setText(newcadena);
                        gramo_fuerza.setSelection(gramo_fuerza.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = gramo_fuerza1.substring ( 0, gramo_fuerza1.length() - 2 );
                    gramo_fuerza.setText(newcadena);
                    gramo_fuerza.setSelection(gramo_fuerza.getText().length());
                }
            }

        }
    };

    public TextWatcher changekilogramo_fuerza = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            kilogramo_fuerza1 = kilogramo_fuerza.getText().toString();
            boolean val = kilogramo_fuerza.isFocused();
            try {
                if(!kilogramo_fuerza1.isEmpty() && val ==true){


                    newton.setText(String.valueOf(parseDouble( kilogramo_fuerza1) * 9.8067));
                    kilonewton.setText(String.valueOf(parseDouble( kilogramo_fuerza1) * 0.0098 ));
                    gramo_fuerza.setText(String.valueOf(parseDouble( kilogramo_fuerza1) * 1000));
                    libra_fuerza.setText(String.valueOf(parseDouble( kilogramo_fuerza1) * 2.2046));
                    onza_fuerza.setText(String.valueOf(parseDouble( kilogramo_fuerza1) *  35.274));
                    joule_metro.setText(String.valueOf(parseDouble( kilogramo_fuerza1) * 9.8067));
                    dina.setText(String.valueOf(parseDouble( kilogramo_fuerza1) * 980665));
                    poundal.setText(String.valueOf(parseDouble( kilogramo_fuerza1) * 70.9316));
                    pondio.setText(String.valueOf(parseDouble( kilogramo_fuerza1) * 1000));


                }else if(kilogramo_fuerza1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!kilogramo_fuerza1.isEmpty()){
                        String newcadena = kilogramo_fuerza1.substring ( 0, kilogramo_fuerza1.length() - 1 );
                        kilogramo_fuerza.setText(newcadena);
                        kilogramo_fuerza.setSelection(kilogramo_fuerza.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = kilogramo_fuerza1.substring ( 0, kilogramo_fuerza1.length() - 2 );
                    kilogramo_fuerza.setText(newcadena);
                    kilogramo_fuerza.setSelection(kilogramo_fuerza.getText().length());
                }
            }

        }
    };

    public TextWatcher changelibra_fuerza = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            libra_fuerza1 = libra_fuerza.getText().toString();
            boolean val = libra_fuerza.isFocused();
            try {
                if(!libra_fuerza1.isEmpty() && val ==true){

                    newton.setText(String.valueOf(parseDouble( libra_fuerza1) * 4.4482));
                    kilonewton.setText(String.valueOf(parseDouble( libra_fuerza1) * 0.0044 ));
                    gramo_fuerza.setText(String.valueOf(parseDouble( libra_fuerza1) * 453.5924));
                    kilogramo_fuerza.setText(String.valueOf(parseDouble( libra_fuerza1) * 0.4536));
                    onza_fuerza.setText(String.valueOf(parseDouble( libra_fuerza1) *  16));
                    joule_metro.setText(String.valueOf(parseDouble( libra_fuerza1) * 4.4482));
                    dina.setText(String.valueOf(parseDouble( libra_fuerza1) * 444822.1615));
                    poundal.setText(String.valueOf(parseDouble( libra_fuerza1) * 32.174));
                    pondio.setText(String.valueOf(parseDouble( libra_fuerza1) * 453.5924));

                }else if(libra_fuerza1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!libra_fuerza1.isEmpty()){
                        String newcadena = libra_fuerza1.substring ( 0, libra_fuerza1.length() - 1 );
                        libra_fuerza.setText(newcadena);
                        libra_fuerza.setSelection(libra_fuerza.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = libra_fuerza1.substring ( 0, libra_fuerza1.length() - 2 );
                    libra_fuerza.setText(newcadena);
                    libra_fuerza.setSelection(libra_fuerza.getText().length());
                }
            }

        }
    };

    public TextWatcher changeonza_fuerza = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            onza_fuerza1 = onza_fuerza.getText().toString();
            boolean val = onza_fuerza.isFocused();
            try {
                if(!onza_fuerza1.isEmpty() && val ==true){

                    newton.setText(String.valueOf(parseDouble( onza_fuerza1) * 0.278));
                    kilonewton.setText(String.valueOf(parseDouble( onza_fuerza1) * (2.7801 * Math.pow(10,-4)) ));
                    gramo_fuerza.setText(String.valueOf(parseDouble( onza_fuerza1) * 28.3495));
                    kilogramo_fuerza.setText(String.valueOf(parseDouble( onza_fuerza1) * 0.0283));
                    libra_fuerza.setText(String.valueOf(parseDouble( onza_fuerza1) *  0.0625));
                    joule_metro.setText(String.valueOf(parseDouble( onza_fuerza1) * 0.278));
                    dina.setText(String.valueOf(parseDouble( onza_fuerza1) * 27801.3851));
                    poundal.setText(String.valueOf(parseDouble( onza_fuerza1) * 2.0109));
                    pondio.setText(String.valueOf(parseDouble( onza_fuerza1) * 28.3495));

                }else if(onza_fuerza1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!onza_fuerza1.isEmpty()){
                        String newcadena = onza_fuerza1.substring ( 0, onza_fuerza1.length() - 1 );
                        onza_fuerza.setText(newcadena);
                        onza_fuerza.setSelection(onza_fuerza.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = onza_fuerza1.substring ( 0, onza_fuerza1.length() - 2 );
                    onza_fuerza.setText(newcadena);
                    onza_fuerza.setSelection(onza_fuerza.getText().length());
                }
            }

        }
    };

    public TextWatcher changejoule_metro = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            joule_metro1 = joule_metro.getText().toString();
            boolean val = joule_metro.isFocused();
            try {
                if(!joule_metro1.isEmpty() && val ==true){

                    newton.setText(String.valueOf(parseDouble( joule_metro1) * 1));
                    kilonewton.setText(String.valueOf(parseDouble( joule_metro1) * 0.001 ));
                    gramo_fuerza.setText(String.valueOf(parseDouble( joule_metro1) * 101.9716));
                    kilogramo_fuerza.setText(String.valueOf(parseDouble( joule_metro1) * 0.102));
                    libra_fuerza.setText(String.valueOf(parseDouble( joule_metro1) *  0.2248));
                    onza_fuerza.setText(String.valueOf(parseDouble( joule_metro1) * 3.5969));
                    dina.setText(String.valueOf(parseDouble( joule_metro1) * 100000));
                    poundal.setText(String.valueOf(parseDouble( joule_metro1) * 7.233));
                    pondio.setText(String.valueOf(parseDouble( joule_metro1) * 101.9716));

                }else if(joule_metro1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!joule_metro1.isEmpty()){
                        String newcadena = joule_metro1.substring ( 0, joule_metro1.length() - 1 );
                        joule_metro.setText(newcadena);
                        joule_metro.setSelection(joule_metro.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = joule_metro1.substring ( 0, joule_metro1.length() - 2 );
                    joule_metro.setText(newcadena);
                    joule_metro.setSelection(joule_metro.getText().length());
                }
            }

        }
    };

    public TextWatcher changedina = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            dina1 = dina.getText().toString();
            boolean val = dina.isFocused();
            try {
                if(!dina1.isEmpty() && val ==true){

                    newton.setText(String.valueOf(parseDouble( dina1) * (1 * Math.pow(10,-5))));
                    kilonewton.setText(String.valueOf(parseDouble( dina1) * (1 * Math.pow(10,-8)) ));
                    gramo_fuerza.setText(String.valueOf(parseDouble( dina1) * 0.001));
                    kilogramo_fuerza.setText(String.valueOf(parseDouble( dina1) * (1.0197 * Math.pow(10,-6))));
                    libra_fuerza.setText(String.valueOf(parseDouble( dina1) *  (2.2481 * Math.pow(10,-6))));
                    onza_fuerza.setText(String.valueOf(parseDouble( dina1) * (3.5969 * Math.pow(10,-5))));
                    joule_metro.setText(String.valueOf(parseDouble( dina1) * (1 * Math.pow(10,-5))));
                    poundal.setText(String.valueOf(parseDouble( dina1) * (7.233 * Math.pow(10,-5))));
                    pondio.setText(String.valueOf(parseDouble( dina1) * 0.001));

                }else if(dina1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!dina1.isEmpty()){
                        String newcadena = dina1.substring ( 0, dina1.length() - 1 );
                        dina.setText(newcadena);
                        dina.setSelection(dina.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = dina1.substring ( 0, dina1.length() - 2 );
                    dina.setText(newcadena);
                    dina.setSelection(dina.getText().length());
                }
            }

        }
    };

    public TextWatcher changepoundal = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            poundal1 = poundal.getText().toString();
            boolean val = poundal.isFocused();
            try {
                if(!poundal1.isEmpty() && val ==true){

                    newton.setText(String.valueOf(parseDouble( poundal1) * 0.1383));
                    kilonewton.setText(String.valueOf(parseDouble( poundal1) * (1.3825 * Math.pow(10,-8)) ));
                    gramo_fuerza.setText(String.valueOf(parseDouble( poundal1) * 14.0981));
                    kilogramo_fuerza.setText(String.valueOf(parseDouble( poundal1) * 0.0141));
                    libra_fuerza.setText(String.valueOf(parseDouble( poundal1) *  0.0311));
                    onza_fuerza.setText(String.valueOf(parseDouble( poundal1) * 0.4973));
                    joule_metro.setText(String.valueOf(parseDouble( poundal1) * 0.1383));
                    dina.setText(String.valueOf(parseDouble( poundal1) * 13825.4954));
                    pondio.setText(String.valueOf(parseDouble( poundal1) * 14.0981));

                }else if(poundal1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!poundal1.isEmpty()){
                        String newcadena = poundal1.substring ( 0, poundal1.length() - 1 );
                        poundal.setText(newcadena);
                        poundal.setSelection(poundal.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = poundal1.substring ( 0, poundal1.length() - 2 );
                    poundal.setText(newcadena);
                    poundal.setSelection(poundal.getText().length());
                }
            }

        }
    };

    public TextWatcher changepondio = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            pondio1 = pondio.getText().toString();
            boolean val = pondio.isFocused();
            try {
                if(!pondio1.isEmpty() && val ==true){

                    newton.setText(String.valueOf(parseDouble( pondio1) * 0.0098));
                    kilonewton.setText(String.valueOf(parseDouble( pondio1) * (9.8067 * Math.pow(10,-6)) ));
                    gramo_fuerza.setText(String.valueOf(parseDouble( pondio1) * 1));
                    kilogramo_fuerza.setText(String.valueOf(parseDouble( pondio1) * 0.001));
                    libra_fuerza.setText(String.valueOf(parseDouble( pondio1) *  0.0022));
                    onza_fuerza.setText(String.valueOf(parseDouble( pondio1) * 0.0353));
                    joule_metro.setText(String.valueOf(parseDouble( pondio1) * 0.0098));
                    dina.setText(String.valueOf(parseDouble( pondio1) * 980.665));
                    poundal.setText(String.valueOf(parseDouble( pondio1) * 0.0709));

                }else if(pondio1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!pondio1.isEmpty()){
                        String newcadena = pondio1.substring ( 0, pondio1.length() - 1 );
                        pondio.setText(newcadena);
                        pondio.setSelection(pondio.getText().length());

                    }
                }catch (Exception e1){

                    String newcadena = pondio1.substring ( 0, pondio1.length() - 2 );
                    pondio.setText(newcadena);
                    pondio.setSelection(pondio.getText().length());
                }
            }

        }
    };









    public  void limpiar (){

        TextKeyListener.clear(newton.getText());
        TextKeyListener.clear(kilonewton.getText());
        TextKeyListener.clear(kilogramo_fuerza.getText());
        TextKeyListener.clear(gramo_fuerza.getText());
        TextKeyListener.clear(libra_fuerza.getText());
        TextKeyListener.clear(onza_fuerza.getText());
        TextKeyListener.clear(joule_metro.getText());
        TextKeyListener.clear(dina.getText());
        TextKeyListener.clear(poundal.getText());
        TextKeyListener.clear(pondio.getText());


    }

}