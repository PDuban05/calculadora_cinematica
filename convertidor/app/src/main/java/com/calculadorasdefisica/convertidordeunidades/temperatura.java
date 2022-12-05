package com.calculadorasdefisica.convertidordeunidades;

import static java.lang.Double.parseDouble;

import android.content.SharedPreferences;
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


public class temperatura extends Fragment {

    EditText celsius,fahrenheit,kelvin,rankine,delisle,newton,reaumur,romer;
    String celsius1,fahrenheit1,kelvin1,rankine1,delisle1,newton1,reaumur1,romer1;

    private AdView mAdView, mAdView2;

    public temperatura() {
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
        return inflater.inflate(R.layout.fragment_temperatura, container, false);
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

        celsius = view.findViewById(R.id.celsius);
        fahrenheit = view.findViewById(R.id.fahrenheit);
        kelvin = view.findViewById(R.id.kelvin);
        rankine = view.findViewById(R.id.rankine);
        delisle = view.findViewById(R.id.delisle);
        newton = view.findViewById(R.id.newton_t);
        reaumur = view.findViewById(R.id.reaumur);
        romer = view.findViewById(R.id.romer);

        celsius.addTextChangedListener(changecelsius);
        fahrenheit.addTextChangedListener(changefahrenheit);
        kelvin.addTextChangedListener(changekelvin);
        rankine.addTextChangedListener(changerankine);
        delisle.addTextChangedListener(changedelisle);
        newton.addTextChangedListener(changenewton);
        reaumur.addTextChangedListener(changereaumur);
        romer.addTextChangedListener(changeromer);
    }

    public TextWatcher changecelsius= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            celsius1 = celsius.getText().toString();
            boolean val = celsius.isFocused();
            try {
                if(!celsius1.isEmpty() && val ==true){

                    fahrenheit.setText(String.valueOf(parseDouble(celsius1) * 9/5 +32));
                    kelvin.setText(String.valueOf(parseDouble(celsius1) +273.15));
                    rankine.setText(String.valueOf((parseDouble(celsius1) +273.15)*9/5));
                    delisle.setText(String.valueOf((100 - parseDouble(celsius1)) * 3/2));
                    newton.setText(String.valueOf(parseDouble(celsius1) * 33/100 ));
                    reaumur.setText(String.valueOf(parseDouble(celsius1) * 4/5));
                    romer.setText(String.valueOf(parseDouble(celsius1) * 21/40 +7.5));

                }else if(celsius1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!celsius1.isEmpty()){
                        String newcadena = celsius1.substring ( 0, celsius1.length() - 1 );
                        celsius.setText(newcadena);
                        celsius.setSelection(celsius.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = celsius1.substring ( 0, celsius1.length() - 2 );
                    celsius.setText(newcadena);
                    celsius.setSelection(celsius.getText().length());
                }
            }
        }
    };

    public TextWatcher changefahrenheit= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            fahrenheit1 = fahrenheit.getText().toString();
            boolean val = fahrenheit.isFocused();
            try {
                if(!fahrenheit1.isEmpty() && val ==true){

                    celsius.setText(String.valueOf((parseDouble(fahrenheit1)-32 )* 5/9 ));
                    kelvin.setText(String.valueOf((parseDouble(fahrenheit1) +459.67) * 5/9));
                    rankine.setText(String.valueOf(parseDouble(fahrenheit1)+459.67) );
                    delisle.setText(String.valueOf((212 - parseDouble(fahrenheit1)) * 5/6));
                    newton.setText(String.valueOf((parseDouble(fahrenheit1) -32 )* 11/60 ));
                    reaumur.setText(String.valueOf((parseDouble(fahrenheit1) -32) * 4/9));
                    romer.setText(String.valueOf((parseDouble(fahrenheit1)-32) * 7/24 +7.5));

                }else if(fahrenheit1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!fahrenheit1.isEmpty()){
                        String newcadena = fahrenheit1.substring ( 0, fahrenheit1.length() - 1 );
                        fahrenheit.setText(newcadena);
                        fahrenheit.setSelection(fahrenheit.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = fahrenheit1.substring ( 0, fahrenheit1.length() - 2 );
                    fahrenheit.setText(newcadena);
                    fahrenheit.setSelection(fahrenheit.getText().length());
                }
            }
        }
    };

    public TextWatcher changekelvin= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            kelvin1 = kelvin.getText().toString();
            boolean val = kelvin.isFocused();
            try {
                if(!kelvin1.isEmpty() && val ==true){

                    celsius.setText(String.valueOf(parseDouble(kelvin1)-273.15 ));
                    fahrenheit.setText(String.valueOf(parseDouble(kelvin1)* 9/5 -459.67));
                    rankine.setText(String.valueOf(parseDouble(kelvin1) * 9/5) );
                    delisle.setText(String.valueOf((373.15 - parseDouble(kelvin1)) * 3/2));
                    newton.setText(String.valueOf((parseDouble(kelvin1) -273.15 )* 33/100 ));
                    reaumur.setText(String.valueOf((parseDouble(kelvin1) -273.15) * 4/5));
                    romer.setText(String.valueOf((parseDouble(kelvin1)-273.15) * 21/40 +7.5));

                }else if(kelvin1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!kelvin1.isEmpty()){
                        String newcadena = kelvin1.substring ( 0, kelvin1.length() - 1 );
                        kelvin.setText(newcadena);
                        kelvin.setSelection(kelvin.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = kelvin1.substring ( 0, kelvin1.length() - 2 );
                    kelvin.setText(newcadena);
                    kelvin.setSelection(kelvin.getText().length());
                }
            }
        }
    };

    public TextWatcher changerankine= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            rankine1 = rankine.getText().toString();
            boolean val = rankine.isFocused();
            try {
                if(!rankine1.isEmpty() && val ==true){

                    celsius.setText(String.valueOf((parseDouble(rankine1)-491.67) * 5/9 ));
                    fahrenheit.setText(String.valueOf(parseDouble(rankine1) -459.67));
                    kelvin.setText(String.valueOf(parseDouble(rankine1) * 5/9) );
                    delisle.setText(String.valueOf((671.67 - parseDouble(rankine1)) * 5/6));
                    newton.setText(String.valueOf((parseDouble(rankine1) -491.67 )* 11/60 ));
                    reaumur.setText(String.valueOf((parseDouble(rankine1) -491.67) * 4/9));
                    romer.setText(String.valueOf((parseDouble(rankine1)-491.67) * 7/24 +7.5));

                }else if(rankine1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!rankine1.isEmpty()){
                        String newcadena = rankine1.substring ( 0, rankine1.length() - 1 );
                        rankine.setText(newcadena);
                        rankine.setSelection(rankine.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = rankine1.substring ( 0, rankine1.length() - 2 );
                    rankine.setText(newcadena);
                    rankine.setSelection(rankine.getText().length());
                }
            }
        }
    };

    public TextWatcher changedelisle= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            delisle1 = delisle.getText().toString();
            boolean val = delisle.isFocused();
            try {
                if(!delisle1.isEmpty() && val ==true){

                    celsius.setText(String.valueOf(100-parseDouble(delisle1) *2/3) );
                    fahrenheit.setText(String.valueOf(212-parseDouble(delisle1) * 6/5));
                    kelvin.setText(String.valueOf(373.15 - parseDouble(delisle1) * 2/3) );
                    rankine.setText(String.valueOf((671.67 - parseDouble(delisle1)) * 6/5));
                    newton.setText(String.valueOf((33-parseDouble(delisle1)  )* 11/50 ));
                    reaumur.setText(String.valueOf((80-parseDouble(delisle1) ) * 8/15));
                    romer.setText(String.valueOf((60-parseDouble(delisle1)) * 7/20));

                }else if(delisle1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!delisle1.isEmpty()){
                        String newcadena = delisle1.substring ( 0, delisle1.length() - 1 );
                        delisle.setText(newcadena);
                        delisle.setSelection(delisle.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = delisle1.substring ( 0, delisle1.length() - 2 );
                    delisle.setText(newcadena);
                    delisle.setSelection(delisle.getText().length());
                }
            }
        }
    };

    public TextWatcher changenewton= new TextWatcher() {
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

                    celsius.setText(String.valueOf(parseDouble(newton1) *100/33) );
                    fahrenheit.setText(String.valueOf(parseDouble(newton1) *60/11 + 32));
                    kelvin.setText(String.valueOf(parseDouble(newton1) * 100/33+273.15) );
                    rankine.setText(String.valueOf( parseDouble(newton1) *60/11 +491.67));
                    delisle.setText(String.valueOf((33-parseDouble(newton1)  )* 50/11 ));
                    reaumur.setText(String.valueOf(parseDouble(newton1)  * 80/33));
                    romer.setText(String.valueOf(parseDouble(newton1)*35/22 + 7.5));

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

    public TextWatcher changereaumur= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            reaumur1 = reaumur.getText().toString();
            boolean val = reaumur.isFocused();
            try {
                if(!reaumur1.isEmpty() && val ==true){

                    celsius.setText(String.valueOf(parseDouble(reaumur1) * 5/4) );
                    fahrenheit.setText(String.valueOf(parseDouble(reaumur1) *9/4 + 32));
                    kelvin.setText(String.valueOf(parseDouble(reaumur1) * 5/4 +273.15) );
                    rankine.setText(String.valueOf( parseDouble(reaumur1) *9/4 +491.67));
                    delisle.setText(String.valueOf((80-parseDouble(reaumur1)  )* 15/8 ));
                    newton.setText(String.valueOf(parseDouble(reaumur1)  * 33/80 ));
                    romer.setText(String.valueOf(parseDouble(reaumur1)*21/32 + 7.5));

                }else if(reaumur1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!reaumur1.isEmpty()){
                        String newcadena = reaumur1.substring ( 0, reaumur1.length() - 1 );
                        reaumur.setText(newcadena);
                        reaumur.setSelection(reaumur.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = reaumur1.substring ( 0, reaumur1.length() - 2 );
                    reaumur.setText(newcadena);
                    reaumur.setSelection(reaumur.getText().length());
                }
            }
        }
    };

    public TextWatcher changeromer= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            romer1 = romer.getText().toString();
            boolean val = romer.isFocused();
            try {
                if(!romer1.isEmpty() && val ==true){

                    celsius.setText(String.valueOf((parseDouble(romer1)-7.5 )*40/21) );
                    fahrenheit.setText(String.valueOf((parseDouble(romer1)-7.5) *24/7 + 32));
                    kelvin.setText(String.valueOf((parseDouble(romer1)-7.5 )* 40/21 +273.15) );
                    rankine.setText(String.valueOf( (parseDouble(romer1)-7.5) *24/7 +491.67));
                    delisle.setText(String.valueOf((60-parseDouble(romer1)  )* 20/7 ));
                    newton.setText(String.valueOf((parseDouble(romer1)-7.5 ) * 22/35 ));
                    reaumur.setText(String.valueOf((parseDouble(romer1)-7.5)*32/21));

                }else if(romer1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!romer1.isEmpty()){
                        String newcadena = romer1.substring ( 0, romer1.length() - 1 );
                        romer.setText(newcadena);
                        romer.setSelection(romer.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = romer1.substring ( 0, romer1.length() - 2 );
                    romer.setText(newcadena);
                    romer.setSelection(romer.getText().length());
                }
            }
        }
    };

    public void limpiar(){

        celsius.getText().clear();
        fahrenheit.getText().clear();
        kelvin.getText().clear();
        rankine.getText().clear();
        delisle.getText().clear();
        newton.getText().clear();
        reaumur.getText().clear();
        romer.getText().clear();

    }
}