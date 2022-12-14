package com.calculadorasdefisica.calculadoradecinematica;

import static java.lang.Double.parseDouble;

import android.annotation.SuppressLint;
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


public class caida_libre extends Fragment {

    private EditText gravedad,tiempo,altura,velocidad_inicial,velocidad_final;
    private Button calcular;
    FloatingActionButton navegar;
    private Spinner spinner_gravedad,spinner_velocidad_final,spinner_velocidad_inicial,spinner_tiempo,spinner_altura;
    private AdView mAdView, mAdView2;






    public caida_libre() {
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
        return inflater.inflate(R.layout.fragment_caida_libre, container, false);



    }


    @SuppressLint("StringFormatInvalid")
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
        String text = getString(R.string.CA_tt);
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
        tv.setVisibility(View.INVISIBLE);
        ca.setVisibility(View.VISIBLE);



        spinner_gravedad = view.findViewById(R.id.spiner_gravedad_cl);
        String[] medidas5 = {"m/s??  "};
        ArrayAdapter<String> adapter5  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas5);
        adapter5.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_gravedad.setAdapter(adapter5);

        spinner_altura = view.findViewById(R.id.spiner_altura_cl);
        String[] medidas = {"m  ","km  "};
        ArrayAdapter<String> adapter  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas);
        adapter.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_altura.setAdapter(adapter);

        spinner_velocidad_inicial = view.findViewById(R.id.spiner_velocidad_inicial_cl);
        String[] medidas2 = {"m/s  ","km/h  "};
        ArrayAdapter<String> adapter2  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas2);
        adapter2.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_velocidad_inicial.setAdapter(adapter2);

        spinner_velocidad_final = view.findViewById(R.id.spiner_velocidad_final_cl);
        String[] medidas3 = {"m/s  ","km/h  "};
        ArrayAdapter<String> adapter3  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas3);
        adapter3.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_velocidad_final.setAdapter(adapter3);

        spinner_tiempo = view.findViewById(R.id.spiner_tiempo_cl);
        String[] medidas4 = {"s  ","h  "};
        ArrayAdapter<String> adapter4  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas4);
        adapter4.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_tiempo.setAdapter(adapter4);





        gravedad = view.findViewById(R.id.txtgravedad_cl);
        tiempo = view.findViewById(R.id.txttiempo_cl);
        altura = view.findViewById(R.id.txtaltura_cl);
        velocidad_inicial= view.findViewById(R.id.txtvelocidad_inicial_cl);
        velocidad_final = view.findViewById(R.id.txtvelocidad_final_cl);

        calcular=view.findViewById(R.id.btn_calcular_cl);
        navegar =  (FloatingActionButton) view.findViewById(R.id.navegar_caida_libre);
        cargarpreferencias();

        gravedad.addTextChangedListener(changecl);
        tiempo.addTextChangedListener(changecl);
        altura.addTextChangedListener(changecl);
        velocidad_inicial.addTextChangedListener(changecl);
        velocidad_final.addTextChangedListener(changecl);


        calcular.setOnClickListener(v -> {

            String graved,tempo,altur,velo_inicial,velo_final;

            graved = gravedad.getText().toString();
            tempo = tiempo.getText().toString();
            altur = altura.getText().toString();
            velo_inicial= velocidad_inicial.getText().toString();
            velo_final = velocidad_final.getText().toString();



            String seleccion = spinner_altura.getSelectedItem().toString();
            if(seleccion.equals("km  ")&&!altur.isEmpty()){
                double altura2, conversion;
                altura2 = parseDouble(altur);
                conversion = altura2  * 1000;
                altur = String.valueOf(conversion);
            }

            String seleccion4 = spinner_tiempo.getSelectedItem().toString();
            if(seleccion4.equals("h  ")&& !tempo.isEmpty()){
                double tiempo2, conversion4;
                tiempo2 = parseDouble(tempo);
                conversion4 = tiempo2 * 3600;
                tempo = String.valueOf(conversion4);
            }

            String seleccion2 = spinner_velocidad_inicial.getSelectedItem().toString();
            if(seleccion2.equals("km/h  ")&& !velo_inicial.isEmpty()){
                double velocidad_inicial2, conversion2;
                velocidad_inicial2 = parseDouble(velo_inicial);
                conversion2 = velocidad_inicial2 / 3.6;
                velo_inicial = String.valueOf(conversion2);
            }

            String seleccion3 = spinner_velocidad_final.getSelectedItem().toString();
            if(seleccion3.equals("km/h  ") && !velo_final.isEmpty()){
                double velocidad_final2, conversion3;
                velocidad_final2 = parseDouble(velo_final);
                conversion3 = velocidad_final2 / 3.6;
                velo_final = String.valueOf(conversion3);
            }


            if(velo_inicial.isEmpty()){

                velo_inicial="0";

            }

            if(velo_final.isEmpty()){

                //  Velocidad Final = velocidad inicial + Gravedad * Tiempo

                if(!velo_inicial.isEmpty() && !graved.isEmpty() && !tempo.isEmpty() && velo_final.isEmpty() ){

                    double  n1,n2,n3, velocidad_fin;

                    n1 = parseDouble(velo_inicial);
                    n2 = parseDouble(graved);
                    n3=parseDouble(tempo);

                    velocidad_fin = n1+n2*n3;
                    velo_final = String.valueOf(velocidad_fin);



                }

                // ???(velocidad inicial?? + 2 * Gravedad * Altura)

                if(!velo_inicial.isEmpty() && !graved.isEmpty() && !altur.isEmpty() && velo_final.isEmpty() ){

                    double  n1,n2,n3, velocidad_fin;

                    n1 = parseDouble(velo_inicial);
                    n2 = parseDouble(graved);
                    n3=parseDouble(altur);

                    velocidad_fin = Math.sqrt(Math.pow(n1,2) + (2 * n2 * n3));

                    velo_final = String.valueOf(velocidad_fin);



                }


                velocidad_final.setText(velo_final);
            }



            //Tiempo


            // Tiempo = (Velocidad final - Velocidad inicial) / Gravedad


            if(!velo_final.isEmpty() && !velo_inicial.isEmpty() && !graved.isEmpty() && tempo.isEmpty()){

                double n1 , n2 , n3 , tempoo;

                n1 = parseDouble(velo_final);
                n2 = parseDouble(velo_inicial);
                n3 = parseDouble(graved);

                tempoo= (n1 - n2)/n3;

                tempo= String.valueOf(tempoo);

                tiempo.setText(tempo);
            }




            // altura
            if (altur.isEmpty()){
                // Altura = (Gravedad * Tiempo??) /2

                if( !graved.isEmpty() && !tempo.isEmpty() ){

                    double n1,n2,alt;

                    n1 = parseDouble(graved);
                    n2 = parseDouble(tempo);


                    alt= (n1 * Math.pow(n2,2))/2;

                    altur= String.valueOf(alt);


                }

                //Altura = Velocidad inicial * tiempo + (Gravedad * Tiempo??) /2

                if( !graved.isEmpty() && !tempo.isEmpty() && velo_inicial!="0" ){

                    double n1,n2,n3,alt;

                    n1 = parseDouble(graved);
                    n2 = parseDouble(tempo);
                    n3 = parseDouble(velo_inicial);


                    alt= n3 *n2 +(n1 * Math.pow(n2,2))/2;

                    altur= String.valueOf(alt);


                }
                altura.setText(altur);
            }




            // gravedad

            //Gravedad = (Velocidad final - Velocidad inicial) / Tiempo

            if(!velo_inicial.isEmpty() && !velo_final.isEmpty() && !tempo.isEmpty() && graved.isEmpty()){

                double n1,n2,n3,gra;

                n1 = parseDouble(velo_final);
                n2 = parseDouble(tempo);
                n3 = parseDouble(velo_inicial);


                gra= (n1 - n3)/n2;
                graved= String.valueOf(gra);

                gravedad.setText(graved);
            }


        });



        navegar.setOnClickListener(v -> {

            Navigation.findNavController(navegar).navigate(R.id.inf_caida_libre);
            MediaPlayer sonido = MediaPlayer.create(getContext(),R.raw.btn);
            sonido.start();
        });

        ImageButton limpiar  = (ImageButton) view.findViewById(R.id.btn_limpiar_cl);
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gravedad.getText().clear();
                altura.getText().clear();
                tiempo.getText().clear();
                velocidad_final.getText().clear();
                velocidad_inicial.getText().clear();
            }
        });


        ImageButton clear_gravedad  = (ImageButton) view.findViewById(R.id.clear_gravedad_cl);
        clear_gravedad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gravedad.getText().clear();

            }
        });


        ImageButton clear_tiempo  = (ImageButton) view.findViewById(R.id.clear_time_cl);
        clear_tiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiempo.getText().clear();
            }
        });

        ImageButton clear_altura  = (ImageButton) view.findViewById(R.id.clear_altura_cl);
        clear_altura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altura.getText().clear();
            }
        });

        ImageButton clear_velocidad_inicial  = (ImageButton) view.findViewById(R.id.clear_velocidad_inicial_cl);
        clear_velocidad_inicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                velocidad_inicial.getText().clear();
            }
        });

        ImageButton clear_velocidad_final  = (ImageButton) view.findViewById(R.id.clear_velocidad_final_cl);
        clear_velocidad_final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                velocidad_final.getText().clear();
            }
        });
    }

    private void cargarpreferencias(){

        SharedPreferences preferences = getContext().getSharedPreferences("pref_cl", Context.MODE_PRIVATE);
        String gravedad1 = preferences.getString("gravedad","");
        String altura1 = preferences.getString("altura","");
        String tiempo1 = preferences.getString("tiempo","");
        String velocidad_final1 = preferences.getString("velocidad_final","");
        String velocidad_inicial1 = preferences.getString("velocidad_inicial","");

        gravedad.setText(gravedad1);
        altura.setText(altura1);
        tiempo.setText(tiempo1);
        velocidad_final.setText(velocidad_final1);
        velocidad_inicial.setText(velocidad_inicial1);

    }

    private void preferencias_cl (){

        SharedPreferences preferences = getContext().getSharedPreferences("pref_cl", Context.MODE_PRIVATE);

        String gravedad1 = gravedad.getText().toString();
        String altura1 = altura.getText().toString();
        String tiempo1= tiempo.getText().toString();
        String velocidad_final1= velocidad_final.getText().toString();
        String velocidad_inicial1= velocidad_inicial.getText().toString();


        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("gravedad",gravedad1);
        editor.putString("altura",altura1);
        editor.putString("tiempo",tiempo1);
        editor.putString("velocidad_final",velocidad_final1);
        editor.putString("velocidad_inicial",velocidad_inicial1);

        editor.commit();


    }

    private TextWatcher changecl = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            preferencias_cl();
        }
    };







}