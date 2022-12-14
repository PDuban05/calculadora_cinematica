package com.calculadorasdefisica.calculadoradecinematica;

import static java.lang.Double.parseDouble;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.pruebaa.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class calculadora_tiro_vertical extends Fragment {

    private EditText gravedad,tiempo,altura,velocidad_inicial;
    private Button calcular;
    FloatingActionButton navegar;
    private Spinner spinner_gravedad,spinner_velocidad_inicial,spinner_tiempo,spinner_altura;
    private AdView mAdView, mAdView2;

    public calculadora_tiro_vertical() {
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
        return inflater.inflate(R.layout.fragment_calculadora_tiro_vertical, container, false);
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

        TextView name = getActivity().findViewById(R.id.name_fragments);
        name.setVisibility(View.VISIBLE);
        String text = getString(R.string.TV_tt);
        name.setText(text);

        ImageView mru = getActivity().findViewById(R.id.mru_v);
        ImageView mrua = getActivity().findViewById(R.id.mrua_v);
        ImageView mcu = getActivity().findViewById(R.id.mcu_v);
        ImageView mcua = getActivity().findViewById(R.id.mcua_v);
        ImageView mpcl = getActivity().findViewById(R.id.mpcl_v);
        ImageView tv = getActivity().findViewById(R.id.tv_v);
        ImageView ca = getActivity().findViewById(R.id.ca_v);

        mru.setVisibility(View.INVISIBLE);
        mrua.setVisibility(View.INVISIBLE);
        mcu.setVisibility(View.INVISIBLE);
        mcua.setVisibility(View.INVISIBLE);
        mpcl.setVisibility(View.INVISIBLE);
        tv.setVisibility(View.VISIBLE);
        ca.setVisibility(View.INVISIBLE);




        spinner_gravedad = view.findViewById(R.id.spiner_gravedad_tv);
        String[] medidas5 = {"m/s??  "};
        ArrayAdapter<String> adapter5  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas5);
        adapter5.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_gravedad.setAdapter(adapter5);

        spinner_altura = view.findViewById(R.id.spiner_altura_tv);
        String[] medidas = {"m  ","km  "};
        ArrayAdapter<String> adapter  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas);
        adapter.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_altura.setAdapter(adapter);

        spinner_velocidad_inicial = view.findViewById(R.id.spiner_velocidad_inicial_tv);
        String[] medidas2 = {"m/s  ","km/h  "};
        ArrayAdapter<String> adapter2  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas2);
        adapter2.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_velocidad_inicial.setAdapter(adapter2);


        spinner_tiempo = view.findViewById(R.id.spiner_tiempo_tv);
        String[] medidas4 = {"s  ","h  "};
        ArrayAdapter<String> adapter4  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas4);
        adapter4.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_tiempo.setAdapter(adapter4);


        gravedad= view.findViewById(R.id.txtgravedad_tv);
        tiempo= view.findViewById(R.id.txttiempo_tv);
        altura=view.findViewById(R.id.txtaltura_tv);
        velocidad_inicial=view.findViewById(R.id.txtvelocidad_inicial_tv);
        calcular=view.findViewById(R.id.btn_calcular_tv);
        navegar =  (FloatingActionButton) view.findViewById(R.id.navegar_tiro_vertical);

        cargarpreferencias();

        gravedad.addTextChangedListener(changemrua);
        tiempo.addTextChangedListener(changemrua);
        altura.addTextChangedListener(changemrua);
        velocidad_inicial.addTextChangedListener(changemrua);


        calcular.setOnClickListener(v -> {

            String gravedad1,tiempo1,altura1,velocidad_inicial1;

            gravedad1 = gravedad.getText().toString();
            tiempo1 = tiempo.getText().toString();
            altura1= altura.getText().toString();
            velocidad_inicial1 = velocidad_inicial.getText().toString();

            String seleccion = spinner_altura.getSelectedItem().toString();
            if(seleccion.equals("km  ")&& !altura1.isEmpty()){
                double altura2, conversion;
                altura2 = parseDouble(altura1);
                conversion = altura2  * 1000;
                altura1 = String.valueOf(conversion);
            }

            String seleccion4 = spinner_tiempo.getSelectedItem().toString();
            if(seleccion4.equals("h  ")&& !tiempo1.isEmpty()){
                double tiempo2, conversion4;
                tiempo2 = parseDouble(tiempo1);
                conversion4 = tiempo2 * 3600;
                tiempo1 = String.valueOf(conversion4);
            }

            String seleccion2 = spinner_velocidad_inicial.getSelectedItem().toString();
            if(seleccion2.equals("km/h  ") && !velocidad_inicial1.isEmpty()){
                double velocidad_inicial2, conversion2;
                velocidad_inicial2 = parseDouble(velocidad_inicial1);
                conversion2 = velocidad_inicial2 / 3.6;
                velocidad_inicial1 = String.valueOf(conversion2);
            }

           if(velocidad_inicial1.isEmpty()){
                if(!gravedad1.isEmpty() && !tiempo1.isEmpty() ){

                    double n1, n2, velo_ini;

                    n1 = parseDouble(gravedad1);
                    n2 = parseDouble(tiempo1);

                    velo_ini = n1 * n2 ;

                    velocidad_inicial1 = String.valueOf(velo_ini);

                }

                if(!gravedad1.isEmpty() && !altura1.isEmpty() ){

                    double n1, n2, velo_ini;

                    n1 = parseDouble(gravedad1);
                    n2 = parseDouble(altura1);

                    velo_ini = Math.sqrt(2*n1*n2) ;

                    velocidad_inicial1 = String.valueOf(velo_ini);

                }
                velocidad_inicial.setText(velocidad_inicial1);
            }


            if(!gravedad1.isEmpty() && !velocidad_inicial1.isEmpty() && tiempo1.isEmpty()){

                double n1, n2,time;

                n1 = parseDouble(gravedad1);
                n2 = parseDouble(velocidad_inicial1);

                time = n2 / n1 ;

                tiempo1= String.valueOf(time);
                tiempo.setText(tiempo1);

            }

            if(!gravedad1.isEmpty() && !velocidad_inicial1.isEmpty() && altura1.isEmpty()){

                double n1, n2,altu;

                n1 = parseDouble(gravedad1);
                n2 = parseDouble(velocidad_inicial1);

                altu = Math.pow(n2,2) / (2 * n1);

                altura1= String.valueOf(altu);
                altura.setText(altura1);
            }


        });




        navegar.setOnClickListener(v -> {
            Navigation.findNavController(navegar).navigate(R.id.inf_tiro_vertical);
            MediaPlayer sonido = MediaPlayer.create(getContext(),R.raw.btn);
            sonido.start();
        });

        ImageButton limpiar  = (ImageButton) view.findViewById(R.id.btn_limpiar_tv);
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                velocidad_inicial.setText("");
                tiempo.setText("");
                altura.setText("");
                gravedad.setText("");

            }
        });


        ImageButton clear_gravedad  = (ImageButton) view.findViewById(R.id.clear_gravedad_tv);
        clear_gravedad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gravedad.setText("");
            }
        });

        ImageButton clear_altura  = (ImageButton) view.findViewById(R.id.clear_altura_tv);
        clear_altura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altura.setText("");
            }
        });

        ImageButton clear_tiempo = (ImageButton) view.findViewById(R.id.clear_tiempo_tv);
        clear_tiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiempo.setText("");
            }
        });

        ImageButton clear_velocidad_inicial  = (ImageButton) view.findViewById(R.id.clear_velocidad_inicial_tv);
        clear_velocidad_inicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                velocidad_inicial.setText("");
            }
        });
    }


    private void cargarpreferencias(){

        SharedPreferences preferences = getContext().getSharedPreferences("pref_tv", Context.MODE_PRIVATE);
        String velocidad_inicial1 = preferences.getString("velocidad_inicial","");
        String tiempo1 = preferences.getString("tiempo","");
        String altura1 = preferences.getString("altura","");
        String gravedad1 = preferences.getString("gravedad","");


        velocidad_inicial.setText(velocidad_inicial1);
        tiempo.setText(tiempo1);
        altura.setText(altura1);
        gravedad.setText(gravedad1);

    }

    private void preferencias_tv (){

        SharedPreferences preferences = getContext().getSharedPreferences("pref_tv", Context.MODE_PRIVATE);

        String velocidad_inicial1 = velocidad_inicial.getText().toString();
        String tiempo1 = tiempo.getText().toString();
        String altura1 = altura.getText().toString();
        String gravedad1 = gravedad.getText().toString();



        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("velocidad_inicial",velocidad_inicial1);
        editor.putString("tiempo", tiempo1);
        editor.putString("altura",altura1);
        editor.putString("gravedad",gravedad1);



        editor.commit();


    }

    private TextWatcher changemrua = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            preferencias_tv();
        }
    };





}