package com.calculadorasdefisica.calculadoradecinematica;

import static java.lang.Double.parseDouble;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.example.pruebaa.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Calculadora_MCU extends Fragment {

    private EditText ang,rapidez_ang,time,rapidez_tan,longitud_arc,radi,perio,frecu,aceleraci_centri;
    private Button btn_calcular;
    FloatingActionButton navegar;
    private Spinner spinner_angulo,spinner_velocidad_angular,spinner_tiempo,spinner_velocidad_tangencial,spinner_longitud_arco,spinner_radio,
            spinner_periodo,spinner_frecuencia,spinner_aceleracion_centripeta;





    public Calculadora_MCU() {

    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calculadora__m_c_u, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        spinner_angulo = view.findViewById(R.id.spiner_angulo_mcu);
        String[] medidas = {"rad  ","º  "};
        ArrayAdapter<String> adapter  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas);
        adapter.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_angulo.setAdapter(adapter);

        spinner_velocidad_angular = view.findViewById(R.id.spiner_rapidez_angular_mcu);
        String[] medidas2 = {"rad/s  ","º/s  "};
        ArrayAdapter<String> adapter2  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas2);
        adapter2.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_velocidad_angular.setAdapter(adapter2);


        spinner_tiempo = view.findViewById(R.id.spiner_tiempo_mcu);
        String[] medidas3 = {"s  ","h  "};
        ArrayAdapter<String> adapter3  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas3);
        adapter3.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_tiempo.setAdapter(adapter3);

        spinner_velocidad_tangencial = view.findViewById(R.id.spiner_rapidez_tangencial_mcu);
        String[] medidas4 = {"m/s  ","km/h  "};
        ArrayAdapter<String> adapter4  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas4);
        adapter4.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_velocidad_tangencial.setAdapter(adapter4);


        spinner_longitud_arco = view.findViewById(R.id.spiner_longitud_arco_mcu);
        String[] medidas5 = {"m  ","km  "};
        ArrayAdapter<String> adapter5  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas5);
        adapter5.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_longitud_arco.setAdapter(adapter5);


        spinner_radio = view.findViewById(R.id.spiner_radio_mcu);
        String[] medidas6 = {"m  ","km  "};
        ArrayAdapter<String> adapter6  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas6);
        adapter6.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_radio.setAdapter(adapter6);


        spinner_periodo = view.findViewById(R.id.spiner_periodo_mcu);
        String[] medidas7 = {"s  ","h  "};
        ArrayAdapter<String> adapter7  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas7);
        adapter7.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_periodo.setAdapter(adapter7);


        spinner_frecuencia = view.findViewById(R.id.spiner_frecuencia_mcu);
        String[] medidas8 = {"Hz  ","mHz  ","kHz  ","MHz  ","GHz  "};
        ArrayAdapter<String> adapter8 =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas8);
        adapter8.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_frecuencia.setAdapter(adapter8);


        spinner_aceleracion_centripeta = view.findViewById(R.id.spiner_aceleracion_centripeta_mcu);
        String[] medidas9 = {"m/s²  ","km/s²  "};
        ArrayAdapter<String> adapter9  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas9);
        adapter9.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_aceleracion_centripeta.setAdapter(adapter9);


        ang =view.findViewById(R.id.txtangulo_mcu);
        rapidez_ang=view.findViewById(R.id.txtrapidez_angular_mcu);
        time=view.findViewById(R.id.txttiempo_mcu);
        rapidez_tan=view.findViewById(R.id.txtrapidez_tangencial_mcu);
        longitud_arc=view.findViewById(R.id.txtlongitud_arco_mcu);
        radi=view.findViewById(R.id.txtradio_mcu);
        perio=view.findViewById(R.id.txtperiodo_mcu);
        frecu=view.findViewById(R.id.txtfrecuencia_mcu);
        aceleraci_centri=view.findViewById(R.id.txtaceleracion_centripeta_mcu);

        btn_calcular = view.findViewById(R.id.btn_calcular_mcu);
        navegar =  (FloatingActionButton) view.findViewById(R.id.navegar_mcu);







        btn_calcular.setOnClickListener(view1 -> {


            String angulo,rapidez_angular,tiempo,rapidez_tangencial,longitud_arco,radio,periodo,frecuencia,aceleracion_centripe,marcaval;



            angulo = ang.getText().toString();
            rapidez_angular = rapidez_ang.getText().toString();
            tiempo = time.getText().toString();
            rapidez_tangencial = rapidez_tan.getText().toString();
            longitud_arco = longitud_arc.getText().toString();
            radio = radi.getText().toString();
            periodo = perio.getText().toString();
            frecuencia = frecu.getText().toString();
            aceleracion_centripe = aceleraci_centri.getText().toString();



            String seleccion = spinner_angulo.getSelectedItem().toString();
            if(seleccion.equals("º  ") && !angulo.isEmpty()){
                double angulo2, conversion;
                angulo2 = parseDouble(angulo);
                conversion = Math.toRadians(angulo2);
                angulo = String.valueOf(conversion);
            }

            String seleccion2 = spinner_velocidad_angular.getSelectedItem().toString();
            if(seleccion2.equals("º/s  ") && !rapidez_angular.isEmpty()){
                double velocidad_angular2, conversion2;
                velocidad_angular2 = parseDouble(rapidez_angular);
                conversion2 = Math.toRadians(velocidad_angular2);
                rapidez_angular = String.valueOf(conversion2);
            }

            String seleccion3 = spinner_tiempo.getSelectedItem().toString();
            if(seleccion3.equals("h  ") && !tiempo.isEmpty()){
                double tiempo2, conversion3;
                tiempo2 = parseDouble(tiempo);
                conversion3 = tiempo2 * 3600;
                tiempo = String.valueOf(conversion3);
            }

            String seleccion4 = spinner_velocidad_tangencial.getSelectedItem().toString();
            if(seleccion4.equals("km/h  ") && !rapidez_tangencial.isEmpty()){
                double velocidad_tangencial2, conversion4;
                velocidad_tangencial2 = parseDouble(rapidez_tangencial);
                conversion4 = velocidad_tangencial2 / 3.6;
                rapidez_tangencial = String.valueOf(conversion4);
            }


            String seleccion5 = spinner_longitud_arco.getSelectedItem().toString();
            if(seleccion5.equals("km  ")&& !longitud_arco.isEmpty()){
                double longitud_arco2, conversion5;
                longitud_arco2 = parseDouble(longitud_arco);
                conversion5 = longitud_arco2 * 1000;
                longitud_arco = String.valueOf(conversion5);
            }

            String seleccion6 = spinner_radio.getSelectedItem().toString();
            if(seleccion6.equals("km  ")&& !radio.isEmpty()){
                double radio2, conversion6;
                radio2 = parseDouble(radio);
                conversion6 = radio2 * 1000;
                radio = String.valueOf(conversion6);
            }

            String seleccion7 = spinner_periodo.getSelectedItem().toString();
            if(seleccion7.equals("h  ")&& !periodo.isEmpty()){
                double periodo2, conversion7;
                periodo2 = parseDouble(periodo);
                conversion7 = periodo2 * 3600;
                periodo = String.valueOf(conversion7);
            }

            if(!frecuencia.isEmpty()){
                String seleccion8 = spinner_frecuencia.getSelectedItem().toString();
                double frecuencia2, conversion8 ;
                frecuencia2 = parseDouble(frecuencia);

                if(seleccion8.equals("mHz  ") ){
                    conversion8 = frecuencia2 / 1000;
                    frecuencia = String.valueOf(conversion8);
                }

                if(seleccion8.equals("kHz  ") ){
                    conversion8 = frecuencia2 * 1000;
                    frecuencia = String.valueOf(conversion8);
                }

                if(seleccion8.equals("MHz  ") ){
                    conversion8 = frecuencia2 *1000000;
                    frecuencia= String.valueOf(conversion8);
                }

                if(seleccion8.equals("GHz  ") ){
                    conversion8 = frecuencia2 *1000000000;
                    frecuencia= String.valueOf(conversion8);
                }
            }



            String seleccion9 = spinner_aceleracion_centripeta.getSelectedItem().toString();
            if(seleccion9.equals("km/h²  ") && !aceleracion_centripe.isEmpty()){
                double aceleracion2, conversion9;
                aceleracion2 = parseDouble(aceleracion_centripe);
                conversion9 = (aceleracion2 * 1000) / 12960000;
                aceleracion_centripe = String.valueOf(conversion9);
            }


            // formulas de rapidez angular


            if(rapidez_angular.isEmpty()){

                if(!angulo.isEmpty() && !tiempo.isEmpty()  ){

                    double n1,n2;
                    n1= parseDouble(angulo);
                    n2 = parseDouble(tiempo);

                    double rapidez_ang1= (n1 /n2);

                    rapidez_angular =  String.valueOf(rapidez_ang1);


                }



                rapidez_ang.setText(rapidez_angular);

            }





            /// fin formulas rapidez angular

//----------------------------------------------------------------------------------------------------------

            ///inicio formula radio


            if(!rapidez_tangencial.isEmpty() && !rapidez_angular.isEmpty() && radio.isEmpty()  ){

                double n1,n2;
                n1= parseDouble(rapidez_tangencial);
                n2= parseDouble(rapidez_angular);


                double radio1=  n1/n2 ;
                radio  = String.valueOf(radio1);

                radi.setText(radio);

            }

            ///fin formula radio
            //-------------------------------------------------------------------------------------------------------


//          inicio formulas rapidez tangencial

            if(rapidez_tangencial.isEmpty()){
                if(!radio.isEmpty() && !rapidez_angular.isEmpty()  ){

                    double n1,n2;
                    n1= parseDouble(radio);
                    n2= parseDouble(rapidez_angular);


                    double rapidez_tan1=   n2*n1 ;

                    rapidez_tangencial= String.valueOf(rapidez_tan1);

                }

                if(!longitud_arco.isEmpty() && !tiempo.isEmpty()    ){

                    double n1,n2;
                    n1= parseDouble(tiempo);
                    n2= parseDouble(longitud_arco);


                    double rapidez_tan1= (double) Math.round((  n2 / n1 )*100)/100;



                    rapidez_tangencial= String.valueOf(rapidez_tan1);

                }

                rapidez_tan.setText( rapidez_tangencial );
            }




            ///fin formula rapidez tangencial
            //-------------------------------------------------------------------------------------------------------


            //inicio formula longitud de arco

        if(longitud_arco.isEmpty()){
            if(!angulo.isEmpty() && !radio.isEmpty()  ){

                double n1,n2;
                n1= parseDouble(angulo);
                n2= parseDouble(radio);


                double longitud_arc1=   n2 * n1 ;


                longitud_arco = String.valueOf(longitud_arc1);


            }

            if(!rapidez_tangencial.isEmpty() && !tiempo.isEmpty()     ){

                double n1,n2;
                n1= parseDouble(rapidez_tangencial);
                n2= parseDouble(tiempo);

                double longitud_arc1=   n2 * n1 ;

                longitud_arco = String.valueOf(longitud_arc1);

            }

            longitud_arc.setText(longitud_arco );
        }



            ///fin formula longitud de arco
            //-------------------------------------------------------------------------------------------------------


            //inicio formula tiempo

            if(tiempo.isEmpty()){
                if(!rapidez_angular.isEmpty() && !angulo.isEmpty()    ){

                    double n1,n2;
                    n1= parseDouble(rapidez_angular);
                    n2= parseDouble(angulo);

                    double time1=   n2 / n1 ;

                    tiempo =String.valueOf(time1);

                }

                if(!longitud_arco.isEmpty() && !rapidez_tangencial.isEmpty()    ){

                    double n1,n2;
                    n1= parseDouble(longitud_arco);
                    n2= parseDouble(rapidez_tangencial);


                    double time1=   n1 / n2 ;

                    tiempo =String.valueOf(time1);


                    }

                time.setText(tiempo);


                }




            ///fin formula tiempo
            //-------------------------------------------------------------------------------------------------------


            //inicio formula angulo



            if(!tiempo.isEmpty() && !rapidez_angular.isEmpty() &&( angulo.isEmpty())  ){

                double n1,n2;
                n1= parseDouble(tiempo);
                n2= parseDouble(rapidez_angular);


                double angul=   n1 * n2 ;

                angulo=String.valueOf(angul);


                ang.setText( angulo);

            }



            ///fin formula angulo
            //-------------------------------------------------------------------------------------------------------


            //inicio formula aceleracion centripeta



            if(!radio.isEmpty() && !rapidez_angular.isEmpty() && aceleracion_centripe.isEmpty()  ){

                double n1,n2;
                n1= parseDouble(radio);
                n2= parseDouble(rapidez_angular);


                double aceleracion_centri=  Math.pow(n2,2) * n1 ;

                aceleracion_centripe = String.valueOf(aceleracion_centri);


            }

            if(!radio.isEmpty() && !rapidez_tangencial.isEmpty() &&  aceleracion_centripe.isEmpty()    ){

                double n1,n2;
                n1= parseDouble(radio);
                n2= parseDouble(rapidez_tangencial);


                double aceleracion_centri= Math.pow(n2,2) / n1 ;

                aceleracion_centripe = String.valueOf(aceleracion_centri);





            }

            ///fin formula aceleracion centripeta
            //-------------------------------------------------------------------------------------------------------


            //inicio formula periodo



            if(!frecuencia.isEmpty()    ){

                double n1;
                n1= parseDouble(frecuencia);

                double period= ( 1/n1 );

                periodo = String.valueOf(period);

            }

            perio.setText(periodo);

            ///fin formula periodo
            //-------------------------------------------------------------------------------------------------------


            //inicio formula frecuencia

            if (frecuencia.isEmpty()){

                if(!periodo.isEmpty()      ){

                    double n1,frecuenci ;

                    n1= parseDouble(periodo);

                    frecuenci=   (1/n1 );


                    frecuencia= String.valueOf(frecuenci);

                }


                if(!rapidez_angular.isEmpty()    ){

                    double n1;
                    n1= parseDouble(rapidez_angular);

                    double frecuenci= ( (  n1 / (2*Math.PI)  ));

                    frecuencia= String.valueOf(frecuenci);

                }

                frecu.setText(frecuencia );
            }



            ///fin formula periodo
            //-------------------------------------------------------------------------------------------------------

            aceleraci_centri.setText(aceleracion_centripe);

        });



        navegar.setOnClickListener(v -> {

            Navigation.findNavController(navegar).navigate(R.id.inf_mcu);
        });

        ImageButton limpiar = (ImageButton) view.findViewById(R.id.btn_limpiar_mcu);
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ang.setText("");
                rapidez_ang.setText("");
                time.setText("");
                rapidez_tan.setText("");
                longitud_arc.setText("");
                radi.setText("");
                perio.setText("");
                frecu.setText("");
                aceleraci_centri.setText("");
            }
        });

        ImageButton clear_angulo  = (ImageButton) view.findViewById(R.id.clear_angulo_mcu);
        clear_angulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ang.setText("");
            }
        });

        ImageButton clear_rapidez_angular  = (ImageButton) view.findViewById(R.id.clear_rapidez_angular_mcu);
        clear_rapidez_angular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rapidez_ang.setText("");
            }
        });

        ImageButton clear_tiempo  = (ImageButton) view.findViewById(R.id.clear_tiempo_mcu);
        clear_tiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time.setText("");
            }
        });

        ImageButton clear_rapidez_tangencial  = (ImageButton) view.findViewById(R.id.clear_rapidez_tangencial_mcu);
        clear_rapidez_tangencial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rapidez_tan.setText("");
            }
        });

        ImageButton clear_longitud_arco  = (ImageButton) view.findViewById(R.id.clear_longitud_arco_mcu);
        clear_longitud_arco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                longitud_arc.setText("");
            }
        });

        ImageButton clear_radio  = (ImageButton) view.findViewById(R.id.clear_radio_mcu);
        clear_radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radi.setText("");
            }
        });

        ImageButton clear_periodo  = (ImageButton) view.findViewById(R.id.clear_periodo_mcu);
        clear_periodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perio.setText("");
            }
        });

        ImageButton clear_frecuencia  = (ImageButton) view.findViewById(R.id.clear_frecuencia_mcu);
        clear_frecuencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frecu.setText("");
            }
        });

        ImageButton clear_aceleracion_centripeta  = (ImageButton) view.findViewById(R.id.clear_aceleracion_centripeta_mcu);
        clear_aceleracion_centripeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aceleraci_centri.setText("");
            }
        });




    }




}