package com.calculadorasdefisica.calculadoradecinematica;

import static java.lang.Double.parseDouble;

import android.content.Context;
import android.content.SharedPreferences;
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


public class calculadora_MCUA extends Fragment {

    private EditText angulo,rapidez_angular_inicial,rapidez_angular_final,aceleracion_angular,tiempo,
            radio,longitud_arco,rapidez_tangencial_inicial,rapidez_tangencial_final,aceleracion_tangencial;
    private Button btn_calcular_mcua;
    FloatingActionButton navegar;
    private Spinner spinner_angulo,spinner_velocidad_angular_inicial,spinner_velocidad_angular_final,spinner_aceleracion_angular,spinner_tiempo,
            spinner_velocidad_tangencial_inicial,spinner_velocidad_tangencial_final,
            spinner_longitud_arco,spinner_radio, spinner_aceleracion_tangencial;

    private AdView mAdView, mAdView2;


    public calculadora_MCUA() {
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
        return inflater.inflate(R.layout.fragment_calculadora__m_c_u_a, container, false);
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
        name.setText("MCUA");

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
        mcua.setVisibility(View.VISIBLE);
        mpcl.setVisibility(View.INVISIBLE);
        tv.setVisibility(View.INVISIBLE);
        ca.setVisibility(View.INVISIBLE);

        spinner_angulo = view.findViewById(R.id.spiner_angulo_mcua);
        String[] medidas = {"rad  ","??  "};
        ArrayAdapter<String> adapter  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas);
        adapter.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_angulo.setAdapter(adapter);

        spinner_velocidad_angular_inicial = view.findViewById(R.id.spiner_rapidez_angular_inicial_mcua);
        String[] medidas2 = {"rad/s  ","??/s  "};
        ArrayAdapter<String> adapter2  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas2);
        adapter2.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_velocidad_angular_inicial.setAdapter(adapter2);


        spinner_velocidad_angular_final = view.findViewById(R.id.spiner_rapidez_angular_final_mcua);
        String[] medidas3 = {"rad/s  ","??/s  "};
        ArrayAdapter<String> adapter3  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas3);
        adapter3.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_velocidad_angular_final.setAdapter(adapter3);

        spinner_aceleracion_angular = view.findViewById(R.id.spiner_aceleracion_angular_mcua);
        String[] medidas4 = {"rad/s??  ","??/s??  "};
        ArrayAdapter<String> adapter4  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas4);
        adapter4.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_aceleracion_angular.setAdapter(adapter4);

        spinner_tiempo = view.findViewById(R.id.spiner_tiempo_mcua);
        String[] medidas5 = {"s  ","h  "};
        ArrayAdapter<String> adapter5  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas5);
        adapter5.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_tiempo.setAdapter(adapter5);

        spinner_radio = view.findViewById(R.id.spiner_radio_mcua);
        String[] medidas6 = {"m  ","km  "};
        ArrayAdapter<String> adapter6  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas6);
        adapter6.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_radio.setAdapter(adapter6);

        spinner_longitud_arco = view.findViewById(R.id.spiner_longitud_arco_mcua);
        String[] medidas7 = {"m  ","km  "};
        ArrayAdapter<String> adapter7  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas7);
        adapter7.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_longitud_arco.setAdapter(adapter7);

        spinner_velocidad_tangencial_inicial = view.findViewById(R.id.spiner_rapidez_tangencial_inicial_mcua);
        String[] medidas8 = {"m/s  ","km/h  "};
        ArrayAdapter<String> adapter8 =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas8);
        adapter8.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_velocidad_tangencial_inicial.setAdapter(adapter8);

        spinner_velocidad_tangencial_final = view.findViewById(R.id.spiner_rapidez_tangencial_final_mcua);
        String[] medidas9 = {"m/s  ","km/h  "};
        ArrayAdapter<String> adapter9 =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas9);
        adapter9.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_velocidad_tangencial_final.setAdapter(adapter9);


        spinner_aceleracion_tangencial = view.findViewById(R.id.spiner_aceleracion_tangencial_mcua);
        String[] medidas10 = {"m/s??  ","km/s??  "};
        ArrayAdapter<String> adapter10  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas10);
        adapter10.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_aceleracion_tangencial.setAdapter(adapter10);



        angulo = view.findViewById(R.id.txtangulo_mcua);
        rapidez_angular_inicial = view.findViewById(R.id.txtrapidez_angular_inicial_mcua);
        rapidez_angular_final = view.findViewById(R.id.txtrapidez_angular_final_mcua);
        aceleracion_angular = view.findViewById(R.id.txtaceleracion_angular_mcua);
        tiempo= view.findViewById(R.id.txttiempo_mcua);
        radio= view.findViewById(R.id.txtradio_mcua);
        longitud_arco= view.findViewById(R.id.txtlongitud_arco_mcua);
        rapidez_tangencial_inicial = view.findViewById(R.id.txtrapidez_tangencial_inicial_mcua);
        rapidez_tangencial_final = view.findViewById(R.id.txtrapidez_tangencial_final_mcua);
        aceleracion_tangencial = view.findViewById(R.id.txtaceleracion_tangencial_mcua);

        btn_calcular_mcua = view.findViewById(R.id.btn_calcular_mcua);
        navegar =  (FloatingActionButton) view.findViewById(R.id.navegar_mcua);

        cargarpreferencias();

        angulo.addTextChangedListener(changemcua);
        rapidez_angular_inicial.addTextChangedListener(changemcua);
        rapidez_angular_final.addTextChangedListener(changemcua);
        aceleracion_angular.addTextChangedListener(changemcua);
        tiempo.addTextChangedListener(changemcua);
        radio.addTextChangedListener(changemcua);
        longitud_arco.addTextChangedListener(changemcua);
        rapidez_tangencial_inicial.addTextChangedListener(changemcua);
        rapidez_tangencial_final.addTextChangedListener(changemcua);
        aceleracion_tangencial.addTextChangedListener(changemcua);

        btn_calcular_mcua.setOnClickListener(v -> {

            String angle,rapidez_angular_ini,rapidez_angular_fin,aceleracion_angle,time,radi,longitud_arc,rapidez_tangencial_ini,rapidez_tangencial_fin, aceleracion_tangenci;

            angle= angulo.getText().toString();
            rapidez_angular_ini = rapidez_angular_inicial.getText().toString();
            rapidez_angular_fin = rapidez_angular_final.getText().toString();
            aceleracion_angle = aceleracion_angular.getText().toString();
            time = tiempo.getText().toString();
            radi= radio.getText().toString();
            longitud_arc=longitud_arco.getText().toString();
            rapidez_tangencial_ini  = rapidez_tangencial_inicial.getText().toString();
            rapidez_tangencial_fin= rapidez_tangencial_final.getText().toString();
            aceleracion_tangenci = aceleracion_tangencial.getText().toString();

            String seleccion = spinner_angulo.getSelectedItem().toString();
            if(seleccion.equals("??  ")&& !angle.isEmpty() ){
                double angulo2, conversion;
                angulo2 = parseDouble(angle);
                conversion = Math.toRadians(angulo2);
                angle = String.valueOf(conversion);
            }

            String seleccion2 = spinner_velocidad_angular_inicial.getSelectedItem().toString();
            if(seleccion2.equals("??/s  ") && !rapidez_angular_ini.isEmpty()){
                double velocidad_angular_inicial2, conversion2;
                velocidad_angular_inicial2 = parseDouble(rapidez_angular_ini);
                conversion2 = Math.toRadians(velocidad_angular_inicial2);
                rapidez_angular_ini = String.valueOf(conversion2);
            }

            String seleccion3 = spinner_velocidad_angular_final.getSelectedItem().toString();
            if(seleccion3.equals("??/s  ") && !rapidez_angular_fin.isEmpty()){
                double velocidad_angular_final2, conversion3;
                velocidad_angular_final2 = parseDouble(rapidez_angular_fin);
                conversion3 = Math.toRadians(velocidad_angular_final2);
                rapidez_angular_fin = String.valueOf(conversion3);
            }

            String seleccion4 = spinner_aceleracion_angular.getSelectedItem().toString();
            if(seleccion4.equals("??/s??  ") && !aceleracion_angle.isEmpty()){
                double aceleracion_angular2, conversion4;
                aceleracion_angular2 = parseDouble(aceleracion_angle);
                conversion4 = Math.toRadians(aceleracion_angular2);
                aceleracion_angle = String.valueOf(conversion4);
            }

            String seleccion5 = spinner_tiempo.getSelectedItem().toString();
            if(seleccion5.equals("h  ") && !time.isEmpty()){
                double tiempo2, conversion5;
                tiempo2 = parseDouble(time);
                conversion5 = tiempo2 * 3600;
                time = String.valueOf(conversion5);
            }

            String seleccion6 = spinner_radio.getSelectedItem().toString();
            if(seleccion6.equals("km  ") && !radi.isEmpty()){
                double radio2, conversion6;
                radio2 = parseDouble(radi);
                conversion6 = radio2 * 1000;
                radi = String.valueOf(conversion6);
            }


            String seleccion7 = spinner_longitud_arco.getSelectedItem().toString();
            if(seleccion7.equals("km  ")&& !longitud_arc.isEmpty()){
                double longitud_arco2, conversion7;
                longitud_arco2 = parseDouble(longitud_arc);
                conversion7 = longitud_arco2 * 1000;
                longitud_arc = String.valueOf(conversion7);
            }


            String seleccion8 = spinner_velocidad_tangencial_inicial.getSelectedItem().toString();
            if(seleccion8.equals("km/h  ") && !rapidez_angular_ini.isEmpty()){
                double velocidad_tangencial_inicial2, conversion8;
                velocidad_tangencial_inicial2 = parseDouble(rapidez_tangencial_ini);
                conversion8 = velocidad_tangencial_inicial2 / 3.6;
                rapidez_tangencial_ini = String.valueOf(conversion8);
            }

            String seleccion9 = spinner_velocidad_tangencial_final.getSelectedItem().toString();
            if(seleccion9.equals("km/h  ") && !rapidez_angular_fin.isEmpty()){
                double velocidad_tangencial_final2, conversion9;
                velocidad_tangencial_final2 = parseDouble(rapidez_tangencial_fin);
                conversion9 = velocidad_tangencial_final2 / 3.6;
                rapidez_tangencial_fin = String.valueOf(conversion9);
            }

            String seleccion10 = spinner_aceleracion_tangencial.getSelectedItem().toString();
            if(seleccion10.equals("km/h??  ")&& !aceleracion_tangenci.isEmpty()){
                double aceleracion_tangencial2, conversion10;
                aceleracion_tangencial2 = parseDouble(aceleracion_tangenci);
                conversion10 = (aceleracion_tangencial2 * 1000) / 12960000;
                aceleracion_tangenci = String.valueOf(conversion10);
            }





            //radio

            if(radi.isEmpty()){
                if(!longitud_arc.isEmpty() && !angle.isEmpty()){

                    double n1, n2,radioo;

                    n1 = parseDouble(longitud_arc) ;
                    n2= parseDouble(angle);


                    radioo = n2/n1;

                    radi = String.valueOf(radioo);


                }

                if(!aceleracion_angle.isEmpty() && !aceleracion_tangenci.isEmpty() ){

                    double n1, n2,radioo;

                    n1 = parseDouble(aceleracion_tangenci) ;
                    n2= parseDouble(aceleracion_angle);


                    radioo = n2/n1;

                    radi= String.valueOf(radioo);

                }
                radio.setText(radi);
            }








// formulas angulares//////




// velocidad angular final


    // Velocidad angular final =  Velocidad angular inicial ?? aceleraci??n angular * tiempo


            if(rapidez_angular_fin.isEmpty()){
                if(!rapidez_angular_ini.isEmpty() && !aceleracion_angle.isEmpty() && !time.isEmpty() ){

                    double n1, n2,n3,velocidad_ang_fin;

                    n1 = parseDouble(rapidez_angular_ini) ;
                    n2= parseDouble(aceleracion_angle);
                    n3=parseDouble(time);

                    velocidad_ang_fin = n1 + (n2) * n3 ;

                    rapidez_angular_fin = String.valueOf(velocidad_ang_fin);

                }



                //Velocidad angular Final?? = Velocidad angular incial?? ?? 2 * aceleraci??n angular * angulo ??

                if(!rapidez_angular_ini.isEmpty() && !aceleracion_angle.isEmpty() && !angle.isEmpty()  ){

                    double n1, n2,n3,velocidad_ang_fin;

                    n1 = parseDouble(rapidez_angular_ini);
                    n2= parseDouble(aceleracion_angle);
                    n3=parseDouble(angle);

                    velocidad_ang_fin = Math.sqrt( Math.pow(n1,2) + 2 * n2 * n3 ) ;

                    rapidez_angular_fin = String.valueOf(velocidad_ang_fin);

                }

                //velocidad angular final = ((2 * angulo) / tiempo) - velocidad angular inicial

                if(!angle.isEmpty() && !time.isEmpty() && !rapidez_angular_ini.isEmpty()  ){

                    double n1, n2,n3,velocidad_ang_fin;

                    n1 = parseDouble(rapidez_angular_ini) ;
                    n2= parseDouble(time);
                    n3=parseDouble(angle);

                    velocidad_ang_fin = ((2 * n3) / n2) - n1 ;

                    rapidez_angular_fin = String.valueOf(velocidad_ang_fin);


                }

                rapidez_angular_final.setText(rapidez_angular_fin);

            }


            /// fin velocidad angular final

  //------------------------------------------------------------------------------------


            //velocidad angular  inicial

    //velocidad angular inicial = velocidad angular final - (aceleracion angular * tiempo)

            if(rapidez_angular_ini.isEmpty()){

                if(!rapidez_angular_fin.isEmpty() && !aceleracion_angle.isEmpty() && !time.isEmpty()  ){

                    double n1, n2,n3,velocidad_angular_inic;

                    n1 = parseDouble(rapidez_angular_fin) ;
                    n2= parseDouble(aceleracion_angle);
                    n3=parseDouble(time);

                    velocidad_angular_inic =n1 - (n2 * n3) ;

                    rapidez_angular_ini = String.valueOf(velocidad_angular_inic);



                }

                //    1/ tiempo * (angulo - (aceleracion angular * tiempo??)/2)

                if(!angle.isEmpty() && !aceleracion_angle.isEmpty() && !time.isEmpty() ){

                    double n1, n2,n3,velocidad_angular_inic;

                    n1 = parseDouble(angle) ;
                    n2= parseDouble(aceleracion_angle);
                    n3=parseDouble(time);

                    velocidad_angular_inic =1/ n3 * (n1 - (n2 * Math.pow(n3,2))/2) ;

                    rapidez_angular_ini = String.valueOf(velocidad_angular_inic);


                }


                //velocidad angular inicial = ((2 * angulo)/tiempo) - velocidad angular final



                if(!angle.isEmpty() && !rapidez_angular_fin.isEmpty() && !time.isEmpty() ){

                    double n1, n2,n3,velocidad_angular_inic;

                    n1 = parseDouble(angle) ;
                    n2= parseDouble(rapidez_angular_fin);
                    n3=parseDouble(time);

                    velocidad_angular_inic =((2 * n1)/n3) - n2 ;

                    rapidez_angular_ini = String.valueOf(velocidad_angular_inic);


                }


                //velocidad angular inicial?? = velocidad angular final?? - 2 aceleracion angular * angulo


                if(!aceleracion_angle.isEmpty() && !rapidez_angular_fin.isEmpty() && !angle.isEmpty() && rapidez_angular_ini.isEmpty() ){

                    double n1, n2,n3,velocidad_angular_inic;

                    n1 = parseDouble(angle) ;
                    n2= parseDouble(rapidez_angular_fin);
                    n3=parseDouble(aceleracion_angle);

                    velocidad_angular_inic = Math.sqrt(Math.pow(n2,2) - (2 *n3 * n1) ) ;

                    rapidez_angular_ini = String.valueOf(velocidad_angular_inic);


                }
                rapidez_angular_inicial.setText(rapidez_angular_ini);
            }





            /// fin velocidad angular inicial

            //------------------------------------------------------------------------------------


            //tiempo

            if(time.isEmpty()){
                //tiempo = (velocidad angular final - velocidad angular inicial)/aceleracion angular

                if(!aceleracion_angle.isEmpty() && !rapidez_angular_fin.isEmpty() && !rapidez_angular_ini.isEmpty()  ){

                    double n1, n2,n3, tiemp;

                    n1 = parseDouble(rapidez_angular_ini) ;
                    n2= parseDouble(rapidez_angular_fin);
                    n3=parseDouble(aceleracion_angle);

                    tiemp = (n2 - n1)/n3 ;

                    time = String.valueOf(tiemp);




                }



                //tiempo = (- velocidad angular inicial + raiz(velocidad angular inicial?? + 2 * aceleracion angular * angulo ))/ aceleracion angular

                if(!aceleracion_angle.isEmpty() && !angle.isEmpty() && !rapidez_angular_ini.isEmpty()  ){

                    double n1, n2,n3, tiemp;

                    n1 = parseDouble(rapidez_angular_ini) ;
                    n2= parseDouble(angle);
                    n3=parseDouble(aceleracion_angle);

                    tiemp = (- n1 + Math.sqrt( Math.pow(n1,2)  + 2 * n3 * n2 ))/ n3;

                    time = String.valueOf(tiemp);


                }


                //tiempo = (2 * angulo) / velocidad angular inicial + velocidad angular final


                if(!rapidez_angular_fin.isEmpty() && !angle.isEmpty() && !rapidez_angular_ini.isEmpty()  ){

                    double n1, n2,n3, tiemp;

                    n1 = parseDouble(rapidez_angular_ini) ;
                    n2= parseDouble(angle);
                    n3=parseDouble(rapidez_angular_fin);

                    tiemp = (2 * n2) / (n1 + n3);

                    time = String.valueOf(tiemp);

                }
                tiempo.setText(time);
                }




            /// fin tiempo

            //------------------------------------------------------------------------------------


            //aceleracion angular


        // aceleracion angular = (velocidad angular final - velocidad angular inicial) / tiempo

            if(aceleracion_angle.isEmpty()){

                if(!rapidez_angular_fin.isEmpty() && !time.isEmpty() && !rapidez_angular_ini.isEmpty()  ){

                    double n1, n2,n3, aceleracion_ang;

                    n1 = parseDouble(rapidez_angular_ini) ;
                    n2= parseDouble(time);
                    n3=parseDouble(rapidez_angular_fin);

                    aceleracion_ang = (n3 - n1) / n2;

                    aceleracion_angle = String.valueOf(aceleracion_ang);

                }

                //aceleracion angular = 2*(angulo - (velocidad angular inicial * tiempo)) / tiempo??

                if(!angle.isEmpty() && !time.isEmpty() && !rapidez_angular_ini.isEmpty() ){

                    double n1, n2,n3, aceleracion_ang;

                    n1 = parseDouble(rapidez_angular_ini) ;
                    n2= parseDouble(time);
                    n3=parseDouble(angle);

                    aceleracion_ang = 2*(n3 - (n1 * n2)) /  Math.pow(n2,2);

                    aceleracion_angle = String.valueOf(aceleracion_ang);


                }


                // aceleracion angular = (velocidad angular final?? - velocidad angular inicial??) / (2 * angulo)

                if(!angle.isEmpty() && !rapidez_angular_fin.isEmpty() && !rapidez_angular_ini.isEmpty()  ){

                    double n1, n2,n3, aceleracion_ang;

                    n1 = parseDouble(rapidez_angular_ini) ;
                    n2= parseDouble(rapidez_angular_fin);
                    n3=parseDouble(angle);

                    aceleracion_ang = ( Math.pow(n2,2) - Math.pow(n1,2) ) / (2 * n3);

                    aceleracion_angle = String.valueOf(aceleracion_ang);


                }

                aceleracion_angular.setText(aceleracion_angle);
            }




            /// fin aceleracion angular

            //------------------------------------------------------------------------------------


            //angulo

                if(angle.isEmpty()){
                    if(!aceleracion_angle.isEmpty() && !time.isEmpty() && !rapidez_angular_ini.isEmpty()  ){

                        double n1, n2,n3, angul;

                        n1 = parseDouble(rapidez_angular_ini) ;
                        n2= parseDouble(aceleracion_angle);
                        n3=parseDouble(time);

                        angul =  n1 * n3 + (n2 * Math.pow(n3,2) ) / 2;

                        angle = String.valueOf(angul);

                    }


                    //??ngulo ?? = ((velocidad angular inicial + velocidad angular final) /2 ) * tiempo

                    if(!rapidez_angular_fin.isEmpty() && !time.isEmpty() && !rapidez_angular_ini.isEmpty()  ){

                        double n1, n2,n3, angul;

                        n1 = parseDouble(rapidez_angular_ini) ;
                        n2= parseDouble(rapidez_angular_fin);
                        n3=parseDouble(time);

                        angul =  ((n1 + n2) /2 ) * n3;

                        angle = String.valueOf(angul);


                    }


                    //angulo ?? = (velocidad angular final?? + velocidad angular inicial??) / 2 aceleraci??n angular

                    if(!rapidez_angular_fin.isEmpty() && !aceleracion_angle.isEmpty() && !rapidez_angular_ini.isEmpty()  ){

                        double n1, n2,n3, angul;

                        n1 = parseDouble(rapidez_angular_ini) ;
                        n2= parseDouble(rapidez_angular_fin);
                        n3=parseDouble(aceleracion_angle);
                        angul =  ( Math.pow(n2,2) - Math.pow(n1,2) )/ ( 2 * n3);

                        angle = String.valueOf(angul);

                    }
                    angulo.setText(angle);

                }
            //??ngulo ?? = Velocidad angular inicial * tiempo ?? (aceleracion angular * tiempo??) / 2








            /// fin angulo

            //------------------------------------------------------------------------------------


            //Formulas tangenciales









            if(rapidez_tangencial_fin.isEmpty()){

                // velocidad tangencial final

                // Velocidad tangencial final = Velocidad tangencial inicial ?? aceleraci??n tangencial * tiempo


                if(!rapidez_tangencial_ini.isEmpty() && !aceleracion_tangenci.isEmpty() && !time.isEmpty() ){

                    double n1, n2,n3, rapidez_tan_ini;

                    n1 = parseDouble(rapidez_tangencial_ini) ;
                    n2= parseDouble(time);
                    n3=parseDouble(aceleracion_tangenci);

                    rapidez_tan_ini= n1 + n3 * n2;

                    rapidez_tangencial_fin = String.valueOf(rapidez_tan_ini);




                }



                //Velocidad tangencial Final?? = Velocidad tangencial incial?? ?? 2 * aceleraci??n tangencial * longitud de arco

                if(!rapidez_tangencial_ini.isEmpty() && !aceleracion_tangenci.isEmpty() && !longitud_arc.isEmpty()  ){

                    double n1, n2,n3, rapidez_tan_ini;

                    n1 = parseDouble(rapidez_tangencial_ini) ;
                    n2= parseDouble(longitud_arc);
                    n3=parseDouble(aceleracion_tangenci);

                    rapidez_tan_ini= Math.sqrt( Math.pow(n1,2) + (2 * n3 * n2));

                    rapidez_tangencial_fin = String.valueOf(rapidez_tan_ini);




                }


                // velocidad tangencial final = ((2 * longitud de arco)/ tiempo) - velocidad tangencial inicial

                if(!rapidez_tangencial_ini.isEmpty() && !time.isEmpty() && !longitud_arc.isEmpty()  ){

                    double n1, n2,n3, rapidez_tan_ini;

                    n1 = parseDouble(rapidez_tangencial_ini) ;
                    n2= parseDouble(longitud_arc);
                    n3=parseDouble(time);

                    rapidez_tan_ini= ((2 * n2)/ n3) - n1;

                    rapidez_tangencial_fin = String.valueOf(rapidez_tan_ini);


                }

                rapidez_tangencial_final.setText(rapidez_tangencial_fin);

            }






            ///fin  velocidad tangencial final

            //------------------------------------------------------------------------------------


            //Velocidad tangecial inicial

            //velocidad tangencial inicial = velocidad tangencial final - (aceleracion tangencial * tiempo)

               if(rapidez_tangencial_ini.isEmpty()){
                   if(!rapidez_tangencial_fin.isEmpty() && !time.isEmpty() && !aceleracion_tangenci.isEmpty()  ){

                       double n1, n2,n3, rapidez_tan_ini;

                       n1 = parseDouble(rapidez_tangencial_fin) ;
                       n2= parseDouble(aceleracion_tangenci);
                       n3=parseDouble(time);

                       rapidez_tan_ini= n1 - (n2 * n3);

                       rapidez_tangencial_ini = String.valueOf(rapidez_tan_ini);




                   }




                   // velocidad tangencial inicial = 1/tiempo * (longitud de arco - (aceleracion tangencial * tiempo??)/2)

                   if(!longitud_arc.isEmpty() && !time.isEmpty() && !aceleracion_tangenci.isEmpty()  ){

                       double n1, n2,n3, rapidez_tan_ini;

                       n1 = parseDouble(longitud_arc) ;
                       n2= parseDouble(aceleracion_tangenci);
                       n3=parseDouble(time);

                       rapidez_tan_ini= 1/n3 * (n1 - (n2 * Math.pow(n3,2) )/2);

                       rapidez_tangencial_ini = String.valueOf(rapidez_tan_ini);




                   }


                   // velocidad tangencial inicial = ((2 * longitud de arco) / tiempo) -  velocidad tangencial final

                   if(!longitud_arc.isEmpty() && !time.isEmpty() && !rapidez_tangencial_fin.isEmpty()  ){

                       double n1, n2,n3, rapidez_tan_ini;

                       n1 = parseDouble(longitud_arc) ;
                       n2= parseDouble(rapidez_tangencial_fin);
                       n3=parseDouble(time);

                       rapidez_tan_ini= ((2 * n1) / n3) -  n2;

                       rapidez_tangencial_ini = String.valueOf(rapidez_tan_ini);


                   }

                   // velocidad tangencial inicial?? = velocidad tangencial final?? - (2* aceleracion tangencial * longirud de arco)

                   if(!longitud_arc.isEmpty() && !aceleracion_tangenci.isEmpty() && !rapidez_tangencial_fin.isEmpty()  ){

                       double n1, n2,n3, rapidez_tan_ini;

                       n1 = parseDouble(longitud_arc) ;
                       n2= parseDouble(rapidez_tangencial_fin);
                       n3=parseDouble(aceleracion_tangenci);

                       rapidez_tan_ini= Math.sqrt(  Math.pow(n2,2) - (2* n3 * n1));

                       rapidez_tangencial_ini = String.valueOf(rapidez_tan_ini);


                   }
                   rapidez_tangencial_inicial.setText(rapidez_tangencial_ini);
               }




            ///fin  velocidad tangencial inicial

            //------------------------------------------------------------------------------------


            //Tiempo

            if(time.isEmpty()){

                //tiempo = (velocidad tangencial final - velocidad tangencial inicial) / aceleracion tangencial


                if(!rapidez_tangencial_ini.isEmpty() && !aceleracion_tangenci.isEmpty() && !rapidez_tangencial_fin.isEmpty()  ){

                    double n1, n2,n3, tiemp;

                    n1 = parseDouble(rapidez_tangencial_ini) ;
                    n2= parseDouble(rapidez_tangencial_fin);
                    n3=parseDouble(aceleracion_tangenci);

                    tiemp= (n2 - n1) / n3;

                    time = String.valueOf(tiemp);

                }

                //tiempo = (- velocidad tangencial inicial raiz(velocidad tangencial inicial??  + 2 * aceleracion tangencial * longitud de arco)) / aceleracion tangencial

                if(!rapidez_tangencial_ini.isEmpty() && !aceleracion_tangenci.isEmpty() && !longitud_arc.isEmpty()  ){

                    double n1, n2,n3, tiemp;

                    n1 = parseDouble(rapidez_tangencial_ini) ;
                    n2= parseDouble(longitud_arc);
                    n3=parseDouble(aceleracion_tangenci);

                    tiemp= (- n1 + Math.sqrt( Math.pow(n1,2)  + 2 * n3 * n2)) / n3;

                    time = String.valueOf(tiemp);

                }

                //tiempo = (2 * longitud de arco) / velocidad tangencial inicial + velocidad tangencial final


                if(!rapidez_tangencial_ini.isEmpty() && !rapidez_tangencial_fin.isEmpty() && !longitud_arc.isEmpty()  ){

                    double n1, n2,n3, tiemp;

                    n1 = parseDouble(rapidez_tangencial_ini) ;
                    n2= parseDouble(longitud_arc);
                    n3=parseDouble(rapidez_tangencial_fin);

                    tiemp= (2 * n2) / (n1 + n3);

                    time = String.valueOf(tiemp);

                }
                tiempo.setText(time);

            }





            ///fin  tiempo


            //------------------------------------------------------------------------------------


            //aceleracion tangencial

            if(aceleracion_tangenci.isEmpty()){

                //aceleracion tangencial = (velocidad tangencial final - velocidad tangencial inicial) / tiempo

                if(!rapidez_tangencial_ini.isEmpty() && !rapidez_tangencial_fin.isEmpty() && !time.isEmpty()  ){

                    double n1, n2,n3, aceleracion_tange;

                    n1 = parseDouble(rapidez_tangencial_ini) ;
                    n2= parseDouble(time);
                    n3=parseDouble(rapidez_tangencial_fin);

                    aceleracion_tange= (n3 - n1) / n2;

                    aceleracion_tangenci = String.valueOf(aceleracion_tange);




                }


                //aceleracion tangencial = 2(Longitud de arco - (velocidad tangencial inicial * tiempo)) / t??

                if(!rapidez_tangencial_ini.isEmpty() && !longitud_arc.isEmpty() && !time.isEmpty()  ){

                    double n1, n2,n3, aceleracion_tange;

                    n1 = parseDouble(rapidez_tangencial_ini) ;
                    n2= parseDouble(time);
                    n3=parseDouble(longitud_arc);

                    aceleracion_tange= 2*(n3 - (n1* n2)) / Math.pow(n2,2) ;

                    aceleracion_tangenci = String.valueOf(aceleracion_tange);




                }


                //aceleracion tangencial = (velocidad tangencial final?? - velocidad tangencial inicial??) / (2 * longitud de arco)

                if(!rapidez_tangencial_ini.isEmpty() && !longitud_arc.isEmpty() && !rapidez_tangencial_fin.isEmpty()  ){

                    double n1, n2,n3, aceleracion_tange;

                    n1 = parseDouble(rapidez_tangencial_ini) ;
                    n2= parseDouble(rapidez_tangencial_fin);
                    n3=parseDouble(longitud_arc);

                    aceleracion_tange= ( Math.pow(n2,2) - Math.pow(n1,2)) / (2 * n3) ;

                    aceleracion_tangenci = String.valueOf(aceleracion_tange);

                }

                aceleracion_tangencial.setText(aceleracion_tangenci);

            }






            ///fin aceleracion tangencial


            //------------------------------------------------------------------------------------


            //longitud de arco


            if(longitud_arc.isEmpty()){
                //Longitud de arco = Velocidad tangencial inicial * tiempo ?? (aceleracion tangencial * tiempo??) / 2

                if(!rapidez_tangencial_ini.isEmpty() && !time.isEmpty() && !aceleracion_tangenci.isEmpty()  ){

                    double n1, n2,n3, longitud_ar;

                    n1 = parseDouble(rapidez_tangencial_ini) ;
                    n2= parseDouble(time);
                    n3=parseDouble(aceleracion_tangenci);

                    longitud_ar=n1 * n2 + (n3 * Math.pow(n2,2) ) / 2 ;

                    longitud_arc= String.valueOf(longitud_ar);


                }


                //Longitud de arco = ((velocidad tangencial inicial + velocidad tangencial final) /2 ) * tiempo

                if(!rapidez_tangencial_ini.isEmpty() && !time.isEmpty() && !rapidez_tangencial_fin.isEmpty()  ){

                    double n1, n2,n3, longitud_ar;

                    n1 = parseDouble(rapidez_tangencial_ini) ;
                    n2= parseDouble(time);
                    n3=parseDouble(rapidez_tangencial_fin);

                    longitud_ar=((n1 + n3) /2 ) * n2 ;

                    longitud_arc= String.valueOf(longitud_ar);


                }



                //Longitud de arco = (velocidad tangencial final?? + velocidad tangencial inicial??)/ 2 * aceleracion tangencial

                if(!rapidez_tangencial_ini.isEmpty() && !aceleracion_tangenci.isEmpty() && !rapidez_tangencial_fin.isEmpty()  ){

                    double n1, n2,n3, longitud_ar;

                    n1 = parseDouble(rapidez_tangencial_ini) ;
                    n2= parseDouble(aceleracion_tangenci);
                    n3=parseDouble(rapidez_tangencial_fin);

                    longitud_ar= ( Math.pow(n3,2) - Math.pow(n1,2))/ (2 * n2);

                    longitud_arc= String.valueOf(longitud_ar);

                }

                //Longitud de arco = Radio * angulo

                if(!radi.isEmpty() && !angle.isEmpty()){

                    double n1, n2, longitud_ar;

                    n1 = parseDouble(radi) ;
                    n2= parseDouble(angle);


                    longitud_ar= n1 * n2;

                    longitud_arc= String.valueOf(longitud_ar);

                }




                longitud_arco.setText(longitud_arc);
            }

        });



        navegar.setOnClickListener(v -> {

            Navigation.findNavController(navegar).navigate(R.id.inf_mcua);
        });

        ImageButton limpiar = (ImageButton) view.findViewById(R.id.btn_limpiar_mcua);
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio.setText("");
                longitud_arco.setText("");
                aceleracion_tangencial.setText("");
                rapidez_tangencial_inicial.setText("");
                rapidez_tangencial_final.setText("");
                angulo.setText("");
                aceleracion_angular.setText("");
                tiempo.setText("");
                rapidez_angular_inicial.setText("");
                rapidez_angular_final.setText("");
            }
        });



        ImageButton clear_radio  = (ImageButton) view.findViewById(R.id.clear_radio_mcua);
        clear_radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio.setText("");
            }
        });

        ImageButton clear_longitud_arco  = (ImageButton) view.findViewById(R.id.clear_longitud_arco_mcua);
        clear_longitud_arco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                longitud_arco.setText("");
            }
        });

        ImageButton clear_aceleracion_tangencial  = (ImageButton) view.findViewById(R.id.clear_aceleracion_tangencial_mcua);
        clear_aceleracion_tangencial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aceleracion_tangencial.setText("");
            }
        });

        ImageButton clear_rapidez_tangencial_inicial  = (ImageButton) view.findViewById(R.id.clear_rapidez_tangencial_inicial_mcua);
        clear_rapidez_tangencial_inicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rapidez_tangencial_inicial.setText("");
            }
        });

        ImageButton clear_rapidez_tangencial_final  = (ImageButton) view.findViewById(R.id.clear_rapidez_tangencial_final_mcua);
        clear_rapidez_tangencial_final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rapidez_tangencial_final.setText("");
            }
        });

        ImageButton clear_angulo = (ImageButton) view.findViewById(R.id.clear_angulo_mcua);
        clear_angulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angulo.setText("");
            }
        });

        ImageButton clear_aceleracion_angular = (ImageButton) view.findViewById(R.id.clear_aceleracion_angular_mcua);
        clear_aceleracion_angular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aceleracion_angular.setText("");
            }
        });

        ImageButton clear_tiempo = (ImageButton) view.findViewById(R.id.clear_tiempo_mcua);
        clear_tiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiempo.setText("");
            }
        });

        ImageButton clear_rapidez_angular_inicial  = (ImageButton) view.findViewById(R.id.clear_rapidez_angular_inicial_mcua);
        clear_rapidez_angular_inicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rapidez_angular_inicial.setText("");
            }
        });

        ImageButton clear_rapidez_angular_final  = (ImageButton) view.findViewById(R.id.clear_rapidez_angular_final_mcua);
        clear_rapidez_angular_final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rapidez_angular_final.setText("");
            }
        });

    }

    private void cargarpreferencias(){

        SharedPreferences preferences = getContext().getSharedPreferences("pref_mcua", Context.MODE_PRIVATE);
        String radio1 = preferences.getString("radio","");
        String longitud_arco1 = preferences.getString("longitud_arco","");
        String aceleracion_tangencial1= preferences.getString("aceleracion_tangencial","");
        String rapidez_tangencial_inicial1 = preferences.getString("rapidez_tangencial_inicial","");
        String rapidez_tangencial_final1 = preferences.getString("rapidez_tangencial_final","");
        String angulo1 = preferences.getString("angulo","");
        String aceleracion_angular1 = preferences.getString("aceleracion_angular","");
        String tiempo1 = preferences.getString("tiempo","");
        String rapidez_angular_inicial1 = preferences.getString("rapidez_angular_inicial","");
        String rapidez_angular_final1 = preferences.getString("rapidez_angular_final","");

        radio.setText(radio1);
        longitud_arco.setText(longitud_arco1);
        aceleracion_tangencial.setText(aceleracion_tangencial1);
        rapidez_tangencial_inicial.setText(rapidez_tangencial_inicial1);
        rapidez_tangencial_final.setText(rapidez_tangencial_final1);
        angulo.setText(angulo1);
        aceleracion_angular.setText(aceleracion_angular1);
        tiempo.setText(tiempo1);
        rapidez_angular_inicial.setText(rapidez_angular_inicial1);
        rapidez_angular_final.setText(rapidez_angular_final1);

    }

    private void preferencias_mcua (){

        SharedPreferences preferences = getContext().getSharedPreferences("pref_mcua", Context.MODE_PRIVATE);

        String radio1 = radio.getText().toString();
        String longitud_arco1 = longitud_arco.getText().toString();
        String aceleracion_tangencial1 = aceleracion_tangencial.getText().toString();
        String rapidez_tangencial_inicial1= rapidez_tangencial_inicial.getText().toString();
        String rapidez_tangencial_final1= rapidez_tangencial_final.getText().toString();
        String angulo1 = angulo.getText().toString();
        String aceleracion_angular1= aceleracion_angular.getText().toString();
        String tiempo1= tiempo.getText().toString();
        String rapidez_angular_inicial1= rapidez_angular_inicial.getText().toString();
        String rapidez_angular_final1= rapidez_angular_final.getText().toString();

        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("radio",radio1);
        editor.putString("longitud_arco",longitud_arco1);
        editor.putString("aceleracion_tangencial",aceleracion_tangencial1);
        editor.putString("rapidez_tangencial_inicial",rapidez_angular_inicial1);
        editor.putString("rapidez_tangencial_final",rapidez_tangencial_final1);
        editor.putString("angulo",angulo1);
        editor.putString("aceleracion_angular",aceleracion_angular1);
        editor.putString("tiempo",tiempo1);
        editor.putString("rapidez_angular_inicial",rapidez_angular_inicial1);
        editor.putString("rapidez_angular_final",rapidez_angular_final1);


        editor.commit();


    }

    private TextWatcher changemcua = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            preferencias_mcua();
        }
    };



}