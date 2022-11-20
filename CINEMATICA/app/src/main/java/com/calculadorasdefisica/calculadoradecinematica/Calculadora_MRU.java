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
import android.widget.Toast;

import com.example.pruebaa.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Calculadora_MRU extends Fragment {

    private EditText tiempo,velocidad,distancia;

    private Button btn_calcular;
    private Spinner spinner1,spinner2,spinner3;
    FloatingActionButton navegar;


    public Calculadora_MRU() {
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
        return inflater.inflate(R.layout.fragment_calculadora__m_r_u, container, false);



    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        TextView name = getActivity().findViewById(R.id.name_fragments);
        name.setVisibility(View.VISIBLE);
        name.setText("MRU");

        ImageView mru = getActivity().findViewById(R.id.mru_v);
        ImageView mrua = getActivity().findViewById(R.id.mrua_v);
        ImageView mcu = getActivity().findViewById(R.id.mcu_v);
        ImageView mcua = getActivity().findViewById(R.id.mcua_v);
        ImageView mpcl = getActivity().findViewById(R.id.mpcl_v);
        ImageView tv = getActivity().findViewById(R.id.tv_v);
        ImageView ca = getActivity().findViewById(R.id.ca_v);

        mru.setVisibility(View.VISIBLE);
        mrua.setVisibility(View.INVISIBLE);
        mcu.setVisibility(View.INVISIBLE);
        mcua.setVisibility(View.INVISIBLE);
        mpcl.setVisibility(View.INVISIBLE);
        tv.setVisibility(View.INVISIBLE);
        ca.setVisibility(View.INVISIBLE);

        spinner1 = view.findViewById(R.id.spiner_distancia_mru);
        String[] medidas = {"m  ","km  "};
        ArrayAdapter<String> adapter  =new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas);
        adapter.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner1.setAdapter(adapter);

        spinner2 = view.findViewById(R.id.spiner_tiempo_mru);
        String[] medidas2 = {"s  ","h  "};
        ArrayAdapter<String> adapter2  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas2);
        adapter2.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner2.setAdapter(adapter2);

        spinner3 = view.findViewById(R.id.spiner_velocidad_mru);
        String[] medidas3 = {"m/s  ","km/h  "};
        ArrayAdapter<String> adapter3  = new ArrayAdapter<String>(getContext(),R.layout.color_spiner,medidas3);
        adapter3.setDropDownViewResource(R.layout.spiner_dropdown);
        spinner3.setAdapter(adapter3);







        tiempo =view.findViewById(R.id.txttiempo_mru);
        velocidad=view.findViewById(R.id.txtvelocidad_mru);
        distancia=view.findViewById(R.id.txtdistancia_mru);

        btn_calcular = view.findViewById(R.id.btn_calcular_mru);
        navegar =  (FloatingActionButton) view.findViewById(R.id.navegar_mru);



        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String time,velo,distanc;

                time = tiempo.getText().toString();
                velo = velocidad.getText().toString();
                distanc = distancia.getText().toString();





                String seleccion = spinner1.getSelectedItem().toString();
                if(seleccion.equals("km  ")&& !distanc.isEmpty()){
                    double distancia2, conversion;
                    distancia2 = parseDouble(distanc);
                    conversion = distancia2 * 1000;
                    distanc = String.valueOf(conversion);
                }


                String seleccion2 = spinner2.getSelectedItem().toString();
                if(seleccion2.equals("h  ") && !time.isEmpty()){
                    double tiempo2, conversion2;
                    tiempo2 = parseDouble(time);
                    conversion2 = tiempo2 * 3600;
                    time = String.valueOf(conversion2);
                }

                String seleccion3 = spinner3.getSelectedItem().toString();
                if(seleccion3.equals("k/h  ")&& !velo.isEmpty()){
                    double velocidad2, conversion3;
                    velocidad2 = parseDouble(velo);
                    conversion3 = velocidad2 / 3.6;
                    velo = String.valueOf(conversion3);
                }




                if (time.isEmpty() && velo.isEmpty() && distanc.isEmpty()){

                    Toast.makeText(getContext(),"Por favor llena dos campos",Toast.LENGTH_LONG).show();



                }else if(!time.isEmpty() && velo.isEmpty() && distanc.isEmpty()  || time.isEmpty() && !velo.isEmpty() && distanc.isEmpty() || time.isEmpty() && velo.isEmpty() && !distanc.isEmpty() ){

                    Toast.makeText(getContext(),"Por favor agrega otro valor al campo",Toast.LENGTH_LONG).show();

                }else if (!time.isEmpty() && !velo.isEmpty() && !distanc.isEmpty()) {


                    Toast.makeText(getContext(),"Por favor deja el campo vacio que deseas calcular",Toast.LENGTH_LONG).show();


                } else if(!time.isEmpty() && !velo.isEmpty()) {


                    float n1,n2;

                    n1 = Float.parseFloat(time);
                    n2= Float.parseFloat(velo);

                    double distan = (double) Math.round( (n2 * n1)*100) /100;

                    String result = String.valueOf(distan);
                    distancia.setText(result);



                }else if(!distanc.isEmpty() && !velo.isEmpty()) {

                    if(!velo.equals("0")){

                        float n3,n2;

                        n3 = Float.parseFloat(distanc);
                        n2= Float.parseFloat(velo);

                        double tiempo1 = (double) Math.round( (n3 / n2)*100) /100;

                        String result = String.valueOf(tiempo1);
                        tiempo.setText(result);


                    }else{
                        Toast.makeText(getContext(),"No es posible que la velocidad sea cero",Toast.LENGTH_LONG).show();

                    }


                }else if (!distanc.isEmpty() && !time.isEmpty()){

                    if(!time.equals("0")){
                        float n1,n2;

                        n1 = Float.parseFloat(time);
                        n2= Float.parseFloat(distanc);

                        double velocidad1 = (double) Math.round( (n2 / n1)*100) /100;

                        String result = String.valueOf(velocidad1);
                        velocidad.setText(result);
                    }else{
                        Toast.makeText(getContext(),"No es posible que el tiempo sea cero",Toast.LENGTH_LONG).show();

                    }




                }



            }
        });

        ImageButton limpiar  = (ImageButton) view.findViewById(R.id.btn_limpiar_mru);
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                velocidad.setText("");
                distancia.setText("");
                tiempo.setText("");
            }
        });


        navegar.setOnClickListener(v -> {

            Navigation.findNavController(navegar).navigate(R.id.inf_mru);
        });

        ImageButton clear_velocidad  = (ImageButton) view.findViewById(R.id.clear_velocidad_mru);
        clear_velocidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                velocidad.setText("");
            }
        });

        ImageButton clear_distancia  = (ImageButton) view.findViewById(R.id.clear_distancia_mru);
        clear_distancia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                distancia.setText("");
            }
        });

        ImageButton clear_tiempo = (ImageButton) view.findViewById(R.id.clear_tiempo_mru);
        clear_tiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiempo.setText("");
            }
        });







    }
}