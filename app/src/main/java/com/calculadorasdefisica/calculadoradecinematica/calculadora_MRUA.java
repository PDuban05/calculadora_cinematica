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
import android.widget.TextView;

import com.example.pruebaa.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class calculadora_MRUA extends Fragment {

    private EditText tiempo_mrua,distancia_mrua,v1,v2,a;
    private TextView resultado_mrua;
    private Button btn_calcular_mrua;
    FloatingActionButton navegar;
    private Spinner spinner_distancia,spinner_velocidad_inicial,spinner_velocidad_final,spinner_tiempo,spinner_aceleracion;

    public calculadora_MRUA() {
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
        return inflater.inflate(R.layout.fragment_calculadora__m_r_u_a, container, false);
    }




    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        spinner_distancia = view.findViewById(R.id.spiner_distancia_mrua);
        String[] medidas = {"m  ","km  "};
        ArrayAdapter<String> adapter  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas);
        adapter.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_distancia.setAdapter(adapter);

        spinner_velocidad_inicial = view.findViewById(R.id.spiner_velocidad_inicial_mrua);
        String[] medidas2 = {"m/s  ","km/h  "};
        ArrayAdapter<String> adapter2  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas2);
        adapter2.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_velocidad_inicial.setAdapter(adapter2);

        spinner_velocidad_final = view.findViewById(R.id.spiner_velocidad_final_mrua);
        String[] medidas3 = {"m/s  ","km/h  "};
        ArrayAdapter<String> adapter3  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas3);
        adapter3.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_velocidad_final.setAdapter(adapter3);

        spinner_tiempo = view.findViewById(R.id.spiner_tiempo_mrua);
        String[] medidas4 = {"s  ","h  "};
        ArrayAdapter<String> adapter4  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas4);
        adapter4.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_tiempo.setAdapter(adapter4);

        spinner_aceleracion = view.findViewById(R.id.spiner_aceleracion_mrua);
        String[] medidas5 = {"m/s²  ","km/h²  "};
        ArrayAdapter<String> adapter5  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas5);
        adapter5.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_aceleracion.setAdapter(adapter5);








        tiempo_mrua =view.findViewById(R.id.txttiempo_mrua);
        distancia_mrua=view.findViewById(R.id.txtdistancia_mrua);
        v1=view.findViewById(R.id.txtvelocidad_inicial_mrua);
        v2=view.findViewById(R.id.txtvelocidad_final_mrua);
        a=view.findViewById(R.id.txtaceleracion_mrua);


        btn_calcular_mrua = view.findViewById(R.id.btn_calcular_mrua);
        navegar =  (FloatingActionButton) view.findViewById(R.id.navegar_mrua);


        btn_calcular_mrua.setOnClickListener(view1 -> {

            String time,velocidad_inicial,velocidad_final,distancia, ac;


            time = tiempo_mrua.getText().toString();
            velocidad_inicial = v1.getText().toString();
            velocidad_final=v2.getText().toString();
            distancia=distancia_mrua.getText().toString();
            ac= a.getText().toString();


            String seleccion = spinner_distancia.getSelectedItem().toString();
            if(seleccion.equals("km  ") && !distancia.isEmpty()){
                double distancia2, conversion;
                distancia2 = parseDouble(distancia);
                conversion = distancia2 * 1000;
                distancia = String.valueOf(conversion);
            }

            String seleccion2 = spinner_velocidad_inicial.getSelectedItem().toString();
            if(seleccion2.equals("km/h  ") && !velocidad_inicial.isEmpty()){
                double velocidad_inicial2, conversion2;
                velocidad_inicial2 = parseDouble(velocidad_inicial);
                conversion2 = velocidad_inicial2 / 3.6;
                velocidad_inicial = String.valueOf(conversion2);
            }

            String seleccion3 = spinner_velocidad_final.getSelectedItem().toString();
            if(seleccion3.equals("km/h  ") && !velocidad_final.isEmpty()){
                double velocidad_final2, conversion3;
                velocidad_final2 = parseDouble(velocidad_final);
                conversion3 = velocidad_final2 / 3.6;
                velocidad_final = String.valueOf(conversion3);
            }

            String seleccion4 = spinner_tiempo.getSelectedItem().toString();
            if(seleccion4.equals("h  ") && !time.isEmpty()){
                double tiempo2, conversion4;
                tiempo2 = parseDouble(time);
                conversion4 = tiempo2 * 3600;
                time = String.valueOf(conversion4);
            }

            String seleccion5 = spinner_aceleracion.getSelectedItem().toString();
            if(seleccion5.equals("km/h²  ") && !ac.isEmpty()){
                double aceleracion2, conversion5;
                aceleracion2 = parseDouble(ac);
                conversion5 = (aceleracion2 * 1000) / 12960000;
                ac = String.valueOf(conversion5);
            }




//inicio formulas distancia mrua


            if(distancia.isEmpty()){
                String  result_distance="";

                if(!velocidad_inicial.isEmpty() && !time.isEmpty() && !ac.isEmpty() ){

                    float n1,n2,n3;

                    n1 = Float.parseFloat(velocidad_inicial);
                    n2= Float.parseFloat(ac);
                    n3 = Float.parseFloat(time);

                    double n3e= Math.pow(n3,2);
                    double distan = (n1 * n3 + (1 * n2 * n3e ) / 2)  ;

                    distancia = Double.toString(distan);

                }

                if(!velocidad_final.isEmpty() && !time.isEmpty() && !ac.isEmpty()   ){

                    float n1,n2,n3;

                    n1 = Float.parseFloat(velocidad_final);
                    n2= Float.parseFloat(ac);
                    n3 = Float.parseFloat(time);

                    double n3e= Math.pow(n3,2);
                    double distan =  (n1 * n3 - (1 * n2 * n3e ) / 2);

                    distancia = Double.toString(distan);


                }


                if(!velocidad_final.isEmpty() && !time.isEmpty() && !velocidad_inicial.isEmpty()   ){

                    float n1,n2,n3;

                    n1 = Float.parseFloat(velocidad_final);
                    n2= Float.parseFloat(velocidad_inicial);
                    n3 = Float.parseFloat(time);

                    double distan =  ((n2 + n1) / 2 * n3) ;


                    distancia = Double.toString(distan);

                }

                distancia_mrua.setText(distancia);

            }


            //fin formulas distancia mrua

//---------------------------------------------------------------------------------------------//

            // inicio formulas velocidad inicial

               String result_velocidad_inicial ="";

            if(velocidad_inicial.isEmpty()){
                if(!velocidad_final.isEmpty() && !time.isEmpty() && !ac.isEmpty()   ){

                    float n1,n2,n3;

                    n1 = Float.parseFloat(velocidad_final);
                    n2= Float.parseFloat(ac);
                    n3 = Float.parseFloat(time);

                    double velocidad_ini =  (n1 - n2 * n3) ;

                    velocidad_inicial = Double.toString(velocidad_ini);

                }


                if(!velocidad_final.isEmpty() && !distancia.isEmpty() && !ac.isEmpty()    ){

                    float n1,n2,n3;

                    n1 = Float.parseFloat(velocidad_final);
                    n2= Float.parseFloat(ac);
                    n3 = Float.parseFloat(distancia);

                    double velocidad_ini =  Math.sqrt(Math.pow(n1,2) -2 * ( n2 * n3 ) );


                    velocidad_inicial = Double.toString(velocidad_ini);

                }


                if(!velocidad_final.isEmpty() && !distancia.isEmpty() && !time.isEmpty()    ){

                    float n1,n2,n3;

                    n1 = Float.parseFloat(velocidad_final);
                    n2= Float.parseFloat(time);
                    n3 = Float.parseFloat(distancia);

                    double velocidad_ini =  (2* (n3/n2) - n1) ;


                    velocidad_inicial = Double.toString(velocidad_ini);

                }


                if(!ac.isEmpty() && !distancia.isEmpty() && !time.isEmpty()   ){

                    float n1,n2,n3;

                    n1 = Float.parseFloat(ac);
                    n2= Float.parseFloat(time);
                    n3 = Float.parseFloat(distancia);

                    double velocidad_ini = ((n3 / n2) - 0.5 * (n1 * n2));


                    velocidad_inicial = Double.toString(velocidad_ini);


                }

                v1.setText(velocidad_inicial);

            }



            // fin formulas velocidad inicial

            //---------------------------------------------------------------------------------------------//

            // inicio formulas velocidad final


            if(velocidad_final.isEmpty()){
                String result_velocidad_final="";

                if(!velocidad_inicial.isEmpty() && !ac.isEmpty() && !time.isEmpty()){

                    float n1,n2,n3;

                    n1 = Float.parseFloat(ac);
                    n2= Float.parseFloat(time);
                    n3 = Float.parseFloat(velocidad_inicial);

                    double velocidad_fin =  (n3+ (n1*n2));

                    velocidad_final = Double.toString(velocidad_fin);

                }


                if(!velocidad_inicial.isEmpty() && !ac.isEmpty() && !distancia.isEmpty()    ){

                    float n1,n2,n3;

                    n1 = Float.parseFloat(ac);
                    n2= Float.parseFloat(distancia);
                    n3 = Float.parseFloat(velocidad_inicial);

                    double velocidad_fin =  Math.sqrt( Math.pow(n3,2) + 2 * (n1 * n2));



                    velocidad_final = Double.toString(velocidad_fin);


                }


                if(!velocidad_inicial.isEmpty() && !time.isEmpty() && !distancia.isEmpty()    ){

                    float n1,n2,n3;

                    n1 = Float.parseFloat(time);
                    n2= Float.parseFloat(distancia);
                    n3 = Float.parseFloat(velocidad_inicial);

                    double velocidad_fin =  ( 2 * (n2 / n1) - n3  );
                    velocidad_final = Double.toString(velocidad_fin);

                }

                v2.setText(velocidad_final);
            }



            // fin formulas velocidad final

            //---------------------------------------------------------------------------------------------//

            // inicio formulas tiempo

            if (time.isEmpty()){
                String result_tiempo ="";

                if(!velocidad_inicial.isEmpty() && !velocidad_final.isEmpty() && !ac.isEmpty()    ){

                    float n1,n2,n3;

                    n1 = Float.parseFloat(velocidad_final);
                    n2= Float.parseFloat(ac);
                    n3 = Float.parseFloat(velocidad_inicial);

                    double tiempo =  ((n1 - n3) / n2);


                    time = Double.toString(tiempo);

                }

                if(!velocidad_inicial.isEmpty() && !velocidad_final.isEmpty() && !distancia.isEmpty()    ){

                    float n1,n2,n3;

                    n1 = Float.parseFloat(velocidad_final);
                    n2= Float.parseFloat(distancia);
                    n3 = Float.parseFloat(velocidad_inicial);

                    double tiempo =(2 * n2) /  (n3 + n1);


                    time = Double.toString(tiempo);

                }
                tiempo_mrua.setText(time);
            }



            // fin formulas tiempo
            //---------------------------------------------------------------------------------------------//

            // inicio formulas aceleración

            if(ac.isEmpty()){
                String result_aceleracion = "";

                if(!velocidad_inicial.isEmpty() && !velocidad_final.isEmpty() && !time.isEmpty()  && ac!="0"  ){

                    float n1,n2,n3;

                    n1 = Float.parseFloat(velocidad_final);
                    n2= Float.parseFloat(time);
                    n3 = Float.parseFloat(velocidad_inicial);

                    double aceleracion = (((n1 - n3) /  n2));
                    ac= Double.toString(aceleracion);


                }


                if(!velocidad_inicial.isEmpty() && !distancia.isEmpty() && !time.isEmpty()   ){

                    float n1,n2,n3;

                    n1 = Float.parseFloat(distancia);
                    n2= Float.parseFloat(time);
                    n3 = Float.parseFloat(velocidad_inicial);

                    double aceleracion = (n1 - (n3 * n2)) /  (0.5 * Math.pow(n2,2));

                    ac= Double.toString(aceleracion);


                }


                if(!velocidad_final.isEmpty() && !distancia.isEmpty() && !velocidad_inicial.isEmpty()   ){

                    float n1,n2,n3;

                    n1 = Float.parseFloat(distancia);
                    n2= Float.parseFloat(velocidad_inicial);
                    n3 = Float.parseFloat(velocidad_final);

                    double aceleracion = (Math.pow(n3,2) - Math.pow(n2,2) ) / (2 * n1) ;

                    ac= Double.toString(aceleracion);


                }

                a.setText(ac);

            }
        });




        navegar.setOnClickListener(v -> {

            Navigation.findNavController(navegar).navigate(R.id.inf_mrua);
        });


        ImageButton limpiar = (ImageButton) view.findViewById(R.id.btn_limpiar_mrua);
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiempo_mrua.setText("");
                distancia_mrua.setText("");
                v1.setText("");
                v2.setText("");
                a.setText("");
            }
        });

        ImageButton clear_tiempo = (ImageButton) view.findViewById(R.id.clear_tiempo_mrua);
        clear_tiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiempo_mrua.setText("");
            }
        });

        ImageButton clear_distancia = (ImageButton) view.findViewById(R.id.clear_distancia_mrua);
        clear_distancia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                distancia_mrua.setText("");
            }
        });

        ImageButton clear_velocidad_inicial = (ImageButton) view.findViewById(R.id.clear_velocidad_inicial_mrua);
        clear_velocidad_inicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.setText("");
            }
        });

        ImageButton clear_velocidad_final = (ImageButton) view.findViewById(R.id.clear_velocidad_final_mrua);
        clear_velocidad_final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2.setText("");
            }
        });

        ImageButton clear_aceleracion = (ImageButton) view.findViewById(R.id.clear_aceleracion_mrua);
        clear_aceleracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText("");
            }
        });











    }




}