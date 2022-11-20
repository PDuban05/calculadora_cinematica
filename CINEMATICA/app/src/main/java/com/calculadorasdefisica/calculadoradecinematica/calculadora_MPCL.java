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
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.pruebaa.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class calculadora_MPCL extends Fragment {

    private EditText gravedad, angulo_tiro, velocidad_inicial,velocidad_inicial_x,velocidad_inicial_y,tiempo,tiempo_vuelo,altura_inicial,altura_maxima,desplazamiento_horizontal;
    private Button calcular;
    FloatingActionButton navegar;
    private Spinner spinner_gravedad,spinner_angulo,spinner_velocidad_inicial,spinner_velocidad_inicial_x,spinner_velocidad_inicial_y,spinner_tiempo,
    spinner_tiempo_vuelo,spinner_altura_inicial,spinner_altura_maxima,spinner_desplazamiento_horizontal;





    public calculadora_MPCL() {
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
        return inflater.inflate(R.layout.fragment_calculadora__m_p_c_l, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView name = getActivity().findViewById(R.id.name_fragments);
        name.setVisibility(View.VISIBLE);
        name.setText("MPCL");

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
        mpcl.setVisibility(View.VISIBLE);
        tv.setVisibility(View.INVISIBLE);
        ca.setVisibility(View.INVISIBLE);

        spinner_gravedad = view.findViewById(R.id.spiner_gravedad_mcpl);
        String[] medidas5 = {"m/s²  "};
        ArrayAdapter<String> adapter5  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas5);
        adapter5.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_gravedad.setAdapter(adapter5);

        spinner_angulo = view.findViewById(R.id.spiner_angulo_tiro_mcpl);
        String[] medidas = {"rad  ","º  "};
        ArrayAdapter<String> adapter  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas);
        adapter.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_angulo.setAdapter(adapter);

        spinner_velocidad_inicial = view.findViewById(R.id.spiner_velocidad_inicial_mcpl);
        String[] medidas2 = {"m/s  ","km/h  "};
        ArrayAdapter<String> adapter2  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas2);
        adapter2.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_velocidad_inicial.setAdapter(adapter2);

        spinner_velocidad_inicial_x = view.findViewById(R.id.spiner_velocidad_inicial_x_mcpl);
        String[] medidas3 = {"m/s  ","km/h  "};
        ArrayAdapter<String> adapter3  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas3);
        adapter3.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_velocidad_inicial_x.setAdapter(adapter3);

        spinner_velocidad_inicial_y = view.findViewById(R.id.spiner_velocidad_inicial_y_mpcl);
        String[] medidas4 = {"m/s  ","km/h  "};
        ArrayAdapter<String> adapter4  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas4);
        adapter4.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_velocidad_inicial_y.setAdapter(adapter4);

        spinner_tiempo = view.findViewById(R.id.spiner_tiempo_mpcl);
        String[] medidas6 = {"s  ","h  "};
        ArrayAdapter<String> adapter6  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas6);
        adapter6.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_tiempo.setAdapter(adapter6);


        spinner_tiempo_vuelo = view.findViewById(R.id.spiner_tiempo_vuelo_mcpl);
        String[] medidas7 = {"s  ","h  "};
        ArrayAdapter<String> adapter7  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas7);
        adapter7.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_tiempo_vuelo.setAdapter(adapter7);

        spinner_altura_inicial = view.findViewById(R.id.spiner_altura_inicia_mpcl);
        String[] medidas8 = {"m  ","km  "};
        ArrayAdapter<String> adapter8  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas8);
        adapter8.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_altura_inicial.setAdapter(adapter8);

        spinner_altura_maxima = view.findViewById(R.id.spiner_altura_maxima_mpcl);
        String[] medidas9 = {"m  ","km  "};
        ArrayAdapter<String> adapter9  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas9);
        adapter9.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_altura_maxima.setAdapter(adapter9);

        spinner_desplazamiento_horizontal = view.findViewById(R.id.spiner_desplzamiento_horizontal_mcpl);
        String[] medidas10= {"m  ","km  "};
        ArrayAdapter<String> adapter10  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas10);
        adapter10.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner_desplazamiento_horizontal.setAdapter(adapter10);







        gravedad= view.findViewById(R.id.txtgravedad_mpcl);
        angulo_tiro = view.findViewById(R.id.txt_angulo_tiro_mpcl);
        velocidad_inicial= view.findViewById(R.id.txt_velocidad_inicial_mpcl);
        velocidad_inicial_x = view.findViewById(R.id.txt_velocidad_inicial_x_mpcl);
        velocidad_inicial_y=view.findViewById(R.id.txt_velocidad_inicial_y_mpcl);
        tiempo= view.findViewById(R.id.txt_tiempo_mpcl);
        tiempo_vuelo= view.findViewById(R.id.txt_tiempo_vuelo_mpcl);
        altura_inicial= view.findViewById(R.id.txt_altura_inicial_mpcl);
        altura_maxima = view.findViewById(R.id.txt_altura_maxima_mpcl);
        desplazamiento_horizontal = view.findViewById(R.id.txt_desplazamiento_horizontal_mpcl);

        calcular= view.findViewById(R.id.btn_calcular_mpcl);
        navegar = (FloatingActionButton) view.findViewById(R.id.navegar_mpcl);

        calcular.setOnClickListener(v -> {

        String gravedad1,angulo_tiro1,velocidad_inicial_1,velocidad_inicial_x1,velocidad_inicial_y1,tiempo1,tiempo_vuelo1,altura_inicial1,altura_maxima1,desplazamiento_horizontal1;

        gravedad1= gravedad.getText().toString();
        angulo_tiro1 = angulo_tiro.getText().toString();
        velocidad_inicial_1 = velocidad_inicial.getText().toString();
        velocidad_inicial_x1= velocidad_inicial_x.getText().toString();
        velocidad_inicial_y1= velocidad_inicial_y.getText().toString();
        tiempo1=tiempo.getText().toString();
        tiempo_vuelo1= tiempo_vuelo.getText().toString();
        altura_inicial1 = altura_inicial.getText().toString();
        altura_maxima1=altura_maxima.getText().toString();
        desplazamiento_horizontal1 = desplazamiento_horizontal.getText().toString();


            String seleccion = spinner_angulo.getSelectedItem().toString();
            if(seleccion.equals("º  ")&& !angulo_tiro1.isEmpty()){
                double angulo2, conversion;
                angulo2 = parseDouble(angulo_tiro1);
                conversion = Math.toRadians(angulo2);
                angulo_tiro1 = String.valueOf(conversion);
            }


            String seleccion2 = spinner_velocidad_inicial.getSelectedItem().toString();
            if(seleccion2.equals("km/h  ")&& !velocidad_inicial_1.isEmpty() ){
                double velocidad_inicial2, conversion2;
                velocidad_inicial2 = parseDouble(velocidad_inicial_1);
                conversion2 = velocidad_inicial2 / 3.6;
                velocidad_inicial_1 = String.valueOf(conversion2);
            }

            String seleccion3 = spinner_velocidad_inicial_x.getSelectedItem().toString();
            if(seleccion3.equals("km/h  ") && !velocidad_inicial_x1.isEmpty()){
                double velocidad_inicial_x2, conversion2;
                velocidad_inicial_x2 = parseDouble(velocidad_inicial_x1);
                conversion2 = velocidad_inicial_x2 / 3.6;
                velocidad_inicial_x1 = String.valueOf(conversion2);
            }

            String seleccion4 = spinner_velocidad_inicial_y.getSelectedItem().toString();
            if(seleccion4.equals("km/h  ") && !velocidad_inicial_y1.isEmpty()){
                double velocidad_inicial2, conversion2;
                velocidad_inicial2 = parseDouble(velocidad_inicial_y1);
                conversion2 = velocidad_inicial2 / 3.6;
                velocidad_inicial_y1 = String.valueOf(conversion2);
            }

            String seleccion5 = spinner_tiempo.getSelectedItem().toString();
            if(seleccion5.equals("h  ")&& !tiempo1.isEmpty()){
                double tiempo2, conversion4;
                tiempo2 = parseDouble(tiempo1);
                conversion4 = tiempo2 * 3600;
                tiempo1 = String.valueOf(conversion4);
            }

            String seleccion6 = spinner_tiempo_vuelo.getSelectedItem().toString();
            if(seleccion6.equals("h  ") && !tiempo_vuelo1.isEmpty()){
                double tiempo2, conversion4;
                tiempo2 = parseDouble(tiempo_vuelo1);
                conversion4 = tiempo2 * 3600;
                tiempo_vuelo1 = String.valueOf(conversion4);
            }

            String seleccion7 = spinner_altura_inicial.getSelectedItem().toString();
            if(seleccion7.equals("km  ") && !altura_inicial1.isEmpty()){
                double altura2, conversion;
                altura2 = parseDouble(altura_inicial1);
                conversion = altura2  * 1000;
                altura_inicial1 = String.valueOf(conversion);
            }

            String seleccion8 = spinner_altura_maxima.getSelectedItem().toString();
            if(seleccion8.equals("km  ") && !altura_maxima1.isEmpty()){
                double altura2, conversion;
                altura2 = parseDouble(altura_maxima1);
                conversion = altura2  * 1000;
                altura_maxima1 = String.valueOf(conversion);
            }


            String seleccion9 = spinner_desplazamiento_horizontal.getSelectedItem().toString();
            if(seleccion9.equals("km  ") && !desplazamiento_horizontal1.isEmpty()){
                double desplazamiento_horizontal_2, conversion;
                desplazamiento_horizontal_2 = parseDouble(desplazamiento_horizontal1);
                conversion = desplazamiento_horizontal_2  * 1000;
                desplazamiento_horizontal1 = String.valueOf(conversion);
            }





// velocidad inicial


            if(!velocidad_inicial_1.isEmpty() && !angulo_tiro1.isEmpty() && !gravedad1.isEmpty() && altura_maxima1.isEmpty()){

                double gravedad2,angulo_tiro2,velocidad_inicial_2,altura_maxima2;
                gravedad2 = parseDouble(gravedad1);
                angulo_tiro2 = parseDouble(angulo_tiro1);
                velocidad_inicial_2 = parseDouble(velocidad_inicial_1);

                double anguloz= Math.toRadians(angulo_tiro2);

                altura_maxima2 = (Math.pow(velocidad_inicial_2,2) * Math.sin(anguloz*2)) / (2 * gravedad2);

                altura_maxima1 = String.valueOf(altura_maxima2);

                altura_maxima.setText(altura_maxima1);
            }

            if(velocidad_inicial_1.isEmpty()){



                if(!gravedad1.isEmpty() && !altura_maxima1.isEmpty() && !angulo_tiro1.isEmpty()){

                    double gravedad2,angulo_tiro2,velocidad_inicial_2,altura_maxima2;
                    gravedad2 = parseDouble(gravedad1);
                    angulo_tiro2 = parseDouble(angulo_tiro1);
                    altura_maxima2 = parseDouble(altura_maxima1);

                    double anguloz= Math.toRadians(angulo_tiro2);

                    velocidad_inicial_2 = Math.sqrt(2 * gravedad2 * altura_maxima2) / (Math.sin(2*anguloz));

                    velocidad_inicial_1 = String.valueOf(velocidad_inicial_2);


                }

                if(!gravedad1.isEmpty() && !tiempo1.isEmpty() && !angulo_tiro1.isEmpty()){

                    double gravedad2,angulo_tiro2,velocidad_inicial_2,tiempo2;
                    gravedad2 = parseDouble(gravedad1);
                    angulo_tiro2 = parseDouble(angulo_tiro1);
                    tiempo2 = parseDouble(tiempo1);

                    double anguloz= Math.toRadians(angulo_tiro2);


                    velocidad_inicial_2 = (gravedad2 * tiempo2) / (2 * Math.sin(anguloz));

                    velocidad_inicial_1 = String.valueOf(velocidad_inicial_2);
                }

                if(!gravedad1.isEmpty() && !desplazamiento_horizontal1.isEmpty() && !angulo_tiro1.isEmpty()){

                    double gravedad2,angulo_tiro2,velocidad_inicial_2,desplazamiento_horizontal2;
                    gravedad2 = parseDouble(gravedad1);
                    angulo_tiro2 = parseDouble(angulo_tiro1);
                    desplazamiento_horizontal2 = parseDouble(desplazamiento_horizontal1);

                    double anguloz= Math.toRadians(angulo_tiro2);


                    velocidad_inicial_2 = Math.sqrt((gravedad2 * desplazamiento_horizontal2)/(Math.sin(2 * anguloz)));

                    velocidad_inicial_1 = String.valueOf(velocidad_inicial_2);

                }
                velocidad_inicial.setText( velocidad_inicial_1);
            }



            // velocidad inicial en x

            if(velocidad_inicial_x1.isEmpty()){

                if(!velocidad_inicial_1.isEmpty() && !angulo_tiro1.isEmpty() ){
                    double angulo_tiro2,velocidad_inicial_2,velocidad_inicial_x2;

                    angulo_tiro2 = parseDouble(angulo_tiro1);
                    velocidad_inicial_2 = parseDouble(velocidad_inicial_1);

                    double anguloz= Math.toRadians(angulo_tiro2);


                    velocidad_inicial_x2= velocidad_inicial_2 * Math.cos(anguloz);

                    velocidad_inicial_x1 = String.valueOf(velocidad_inicial_x2);
                }


                if(!desplazamiento_horizontal1.isEmpty() && !tiempo1.isEmpty() ){
                    double desplazamiento_horizontal2 ,tiempo2,velocidad_inicial_x2;

                    desplazamiento_horizontal2 = parseDouble(desplazamiento_horizontal1);
                    tiempo2 = parseDouble(tiempo1);

                    velocidad_inicial_x2=  desplazamiento_horizontal2 / tiempo2;

                    velocidad_inicial_x1 = String.valueOf(velocidad_inicial_x2);
                }
                velocidad_inicial_x.setText(velocidad_inicial_x1);
            }

            // velocidad inicial en y

            if(velocidad_inicial_y1.isEmpty()){

                if(!velocidad_inicial_1.isEmpty() && !angulo_tiro1.isEmpty() ){
                    double angulo_tiro2,velocidad_inicial_2,velocidad_inicial_y2;

                    angulo_tiro2 = parseDouble(angulo_tiro1);
                    velocidad_inicial_2 = parseDouble(velocidad_inicial_1);

                    double anguloz= Math.toRadians(angulo_tiro2);

                    velocidad_inicial_y2= velocidad_inicial_2 * Math.sin(anguloz);
                    velocidad_inicial_y1 = String.valueOf(velocidad_inicial_y2);

                }


                if(!gravedad1.isEmpty() && !tiempo1.isEmpty() && !altura_inicial1.isEmpty() ){
                    double tiempo2,gravedad2,altura_inicial2,velocidad_inicial_y2;

                    tiempo2 = parseDouble(tiempo1);
                    gravedad2 = parseDouble(gravedad1);
                    altura_inicial2= parseDouble(altura_inicial1);

                    velocidad_inicial_y2= 1/tiempo2 * (altura_inicial2 + (gravedad2 * Math.pow(tiempo2,2))/2);

                    velocidad_inicial_y1 = String.valueOf(velocidad_inicial_y2);

                }

                if(!gravedad1.isEmpty()&& !altura_inicial1.isEmpty() ){
                    double gravedad2,altura_inicial2,velocidad_inicial_y2;
                    gravedad2 = parseDouble(gravedad1);
                    altura_inicial2= parseDouble(altura_inicial1);

                    velocidad_inicial_y2= 2 * gravedad2 * altura_inicial2 ;

                    velocidad_inicial_y1 = String.valueOf(velocidad_inicial_y2);
                }
                velocidad_inicial_y.setText(velocidad_inicial_y1);
            }


// tiempo

            if (tiempo1.isEmpty()){

                if (!velocidad_inicial_y1.isEmpty() && !gravedad1.isEmpty() && !altura_inicial1.isEmpty()){

                    double gravedad2,altura_inicial2,velocidad_inicial_y2,tiempo2;
                    gravedad2 = parseDouble(gravedad1);
                    altura_inicial2= parseDouble(altura_inicial1);
                    velocidad_inicial_y2= parseDouble(velocidad_inicial_y1);

                    tiempo2= (- velocidad_inicial_y2 + Math.sqrt( Math.pow(velocidad_inicial_y2,2)  + 2 * gravedad2 * altura_inicial2))/ gravedad2 ;

                    tiempo1 = String.valueOf(tiempo2);
                }

                if (!desplazamiento_horizontal1.isEmpty() && !velocidad_inicial_x1.isEmpty()){

                    double desplazamiento_horizontal2,velocidad_inicial_x2,tiempo2;
                    desplazamiento_horizontal2 = parseDouble(desplazamiento_horizontal1);
                    velocidad_inicial_x2= parseDouble(velocidad_inicial_x1);

                    tiempo2= desplazamiento_horizontal2 / velocidad_inicial_x2;

                    tiempo1 = String.valueOf(tiempo2);
                }

                if(!tiempo_vuelo1.isEmpty()){

                    double tiempo_vuelo2,tiempo2;
                    tiempo_vuelo2 = parseDouble(tiempo_vuelo1);
                    tiempo2 = tiempo_vuelo2 / 2;
                    tiempo1 =String.valueOf(tiempo2);



                }
                tiempo.setText(tiempo1);
            }


            // tiempo de vuelo


            if(tiempo_vuelo1.isEmpty()){

                if(!velocidad_inicial_1.isEmpty() && !angulo_tiro1.isEmpty() && !gravedad1.isEmpty()){

                    double velocidad_inicial2,angulo_tiro2,gravedad2,tiempo_vuelo2;

                    velocidad_inicial2 = parseDouble(velocidad_inicial_1);
                    angulo_tiro2= parseDouble(angulo_tiro1);
                    gravedad2 = parseDouble(gravedad1);
                    double anguloz= Math.toRadians(angulo_tiro2);

                    tiempo_vuelo2 = (2 * velocidad_inicial2 * Math.sin(anguloz)) / gravedad2;

                    tiempo_vuelo1 = String.valueOf(tiempo_vuelo2);


                }

                if(!tiempo1.isEmpty()){

                    double tiempo_vuelo2,tiempo2;

                    tiempo2 = parseDouble(tiempo1);
                    tiempo_vuelo2 = tiempo2 * 2;

                    tiempo_vuelo1 = String.valueOf(tiempo_vuelo2);
                }
                tiempo_vuelo.setText(tiempo_vuelo1);

            }


            // desplazamiento horizontal

            if(desplazamiento_horizontal1.isEmpty()){

                if(!velocidad_inicial_x1.isEmpty() && !tiempo1.isEmpty()){
                    double velocidad_inicial_x2,tiempo2,desplazamiento_horizontal2;

                    velocidad_inicial_x2 = parseDouble(velocidad_inicial_x1);
                    tiempo2 = parseDouble(tiempo1);

                    desplazamiento_horizontal2 = velocidad_inicial_x2 * tiempo2;

                    desplazamiento_horizontal1 = String.valueOf(desplazamiento_horizontal2);

                }
                desplazamiento_horizontal.setText(desplazamiento_horizontal1);

            }









        });








        navegar.setOnClickListener(v -> {

           Navigation.findNavController(navegar).navigate(R.id.inf_mpcl);
        });

        ImageButton limpiar = (ImageButton) view.findViewById(R.id.btn_limpiar_mpcl);
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gravedad.setText("");
                angulo_tiro.setText("");
                velocidad_inicial.setText("");
                velocidad_inicial_x.setText("");
                velocidad_inicial_y.setText("");
                tiempo.setText("");
                tiempo_vuelo.setText("");
                altura_inicial.setText("");
                altura_maxima.setText("");
                desplazamiento_horizontal.setText("");
            }
        });


        ImageButton clear_gravedad  = (ImageButton) view.findViewById(R.id.clear_gravedad_MPCL);
        clear_gravedad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gravedad.setText("");
            }
        });

        ImageButton clear_angulo  = (ImageButton) view.findViewById(R.id.clear_angulo_MPCL);
        clear_angulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angulo_tiro.setText("");
            }
        });

        ImageButton clear_velocidad_inicial  = (ImageButton) view.findViewById(R.id.clear_velocidad_inicial_MPCL);
        clear_velocidad_inicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                velocidad_inicial.setText("");
            }
        });

        ImageButton clear_velocidad_inicial_x = (ImageButton) view.findViewById(R.id.clear_velocida_inicial_x_MPCL);
        clear_velocidad_inicial_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                velocidad_inicial_x.setText("");
            }
        });

        ImageButton clear_velocidad_inicial_y  = (ImageButton) view.findViewById(R.id.clear_velocidad_inicial_y_MPCL);
        clear_velocidad_inicial_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                velocidad_inicial_y.setText("");
            }
        });

        ImageButton clear_tiempo  = (ImageButton) view.findViewById(R.id.clear_tiempo_MPCL);
        clear_tiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiempo.setText("");
            }
        });

        ImageButton clear_tiempo_vuelo  = (ImageButton) view.findViewById(R.id.clear_tiempo_vuelo_MPCL);
        clear_tiempo_vuelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiempo_vuelo.setText("");
            }
        });

        ImageButton clear_altura_inicial  = (ImageButton) view.findViewById(R.id.clear_altura_inicial_MPCL);
        clear_altura_inicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altura_inicial.setText("");
            }
        });


        ImageButton clear_altura_maxima  = (ImageButton) view.findViewById(R.id.clear_altura_maxima_MPCL);
        clear_altura_maxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altura_maxima.setText("");
            }
        });

        ImageButton clear_desplazamiento_horizontal  = (ImageButton) view.findViewById(R.id.clear_desplazamiento_horizontal_MPCL);
        clear_desplazamiento_horizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desplazamiento_horizontal.setText("");
            }
        });




    }
}