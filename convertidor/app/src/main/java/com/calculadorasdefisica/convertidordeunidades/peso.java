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


public class peso extends Fragment {

    EditText miligramo,gramo,kilogramo,tonelada,libra,onza,quilate,grano,newton;
    String miligramo1,gramo1,kilogramo1,tonelada1,libra1,onza1,quilate1,grano1,newton1;

    public peso() {
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
        return inflater.inflate(R.layout.fragment_peso, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        miligramo = view.findViewById(R.id.miligramo);
        gramo = view.findViewById(R.id.gramo);
        kilogramo = view.findViewById(R.id.kilogramo);
        tonelada = view.findViewById(R.id.tonelada);
        libra = view.findViewById(R.id.libra);
        onza = view.findViewById(R.id.onza);
        quilate = view.findViewById(R.id.quilate);
        grano = view.findViewById(R.id.grano);
        newton = view.findViewById(R.id.newton_p);

        miligramo.addTextChangedListener(changemiligramo);
        gramo.addTextChangedListener(changegramo);
        kilogramo.addTextChangedListener(changekilogramo);
        tonelada.addTextChangedListener(changetonelada);
    }

    public TextWatcher changemiligramo= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            miligramo1 = miligramo.getText().toString();
            boolean val = miligramo.isFocused();
            try {
                if(!miligramo1.isEmpty() && val ==true){

                    gramo.setText(String.valueOf(parseDouble(miligramo1) * 0.001));
                    kilogramo.setText(String.valueOf(parseDouble(miligramo1) * (1 * Math.pow(10,-6))));
                    tonelada.setText(String.valueOf(parseDouble(miligramo1) * (1 * Math.pow(10,-9))));
                    libra.setText(String.valueOf(parseDouble(miligramo1) * (2.2046 * Math.pow(10,-6))));
                    onza.setText(String.valueOf(parseDouble(miligramo1) * (3.5274 * Math.pow(10,-5))));
                    quilate.setText(String.valueOf(parseDouble(miligramo1) * 0.005));
                    grano.setText(String.valueOf(parseDouble(miligramo1) * 0.0154));
                    newton.setText(String.valueOf(parseDouble(miligramo1) * (9.8066 * Math.pow(10,-6))));


                }else if(miligramo1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!miligramo1.isEmpty()){
                        String newcadena = miligramo1.substring ( 0, miligramo1.length() - 1 );
                        miligramo.setText(newcadena);
                        miligramo.setSelection(miligramo.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = miligramo1.substring ( 0, miligramo1.length() - 2 );
                    miligramo.setText(newcadena);
                    miligramo.setSelection(miligramo.getText().length());
                }
            }
        }
    };

    public TextWatcher changegramo= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            gramo1 = gramo.getText().toString();
            boolean val = gramo.isFocused();
            try {
                if(!gramo1.isEmpty() && val ==true){

                    miligramo.setText(String.valueOf(parseDouble(gramo1) * 1000));
                    kilogramo.setText(String.valueOf(parseDouble(gramo1) * 0.001));
                    tonelada.setText(String.valueOf(parseDouble(gramo1) * (1 * Math.pow(10,-6))));
                    libra.setText(String.valueOf(parseDouble(gramo1) * 0.0022));
                    onza.setText(String.valueOf(parseDouble(gramo1) * 0.0353));
                    quilate.setText(String.valueOf(parseDouble(gramo1) * 5));
                    grano.setText(String.valueOf(parseDouble(gramo1) * 15.4324));
                    newton.setText(String.valueOf(parseDouble(gramo1) * 0.0098));


                }else if(gramo1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!gramo1.isEmpty()){
                        String newcadena = gramo1.substring ( 0, gramo1.length() - 1 );
                        gramo.setText(newcadena);
                        gramo.setSelection(gramo.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = gramo1.substring ( 0, gramo1.length() - 2 );
                    gramo.setText(newcadena);
                    gramo.setSelection(gramo.getText().length());
                }
            }
        }
    };

    public TextWatcher changekilogramo= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            kilogramo1 = kilogramo.getText().toString();
            boolean val = kilogramo.isFocused();
            try {
                if(!kilogramo1.isEmpty() && val ==true){

                    miligramo.setText(String.valueOf(parseDouble(kilogramo1) * 1000000));
                    gramo.setText(String.valueOf(parseDouble(kilogramo1) * 1000));
                    tonelada.setText(String.valueOf(parseDouble(kilogramo1) * 0.001));
                    libra.setText(String.valueOf(parseDouble(kilogramo1) * 2.2046));
                    onza.setText(String.valueOf(parseDouble(kilogramo1) * 35.274));
                    quilate.setText(String.valueOf(parseDouble(kilogramo1) * 5000));
                    grano.setText(String.valueOf(parseDouble(kilogramo1) * 15432.3584));
                    newton.setText(String.valueOf(parseDouble(kilogramo1) * 9.8067));


                }else if(kilogramo1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!kilogramo1.isEmpty()){
                        String newcadena = kilogramo1.substring ( 0, kilogramo1.length() - 1 );
                        kilogramo.setText(newcadena);
                        kilogramo.setSelection(kilogramo.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = kilogramo1.substring ( 0, kilogramo1.length() - 2 );
                    kilogramo.setText(newcadena);
                    kilogramo.setSelection(kilogramo.getText().length());
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

            tonelada1 = tonelada.getText().toString();
            boolean val = tonelada.isFocused();
            try {
                if(!tonelada1.isEmpty() && val ==true){

                    miligramo.setText(String.valueOf(parseDouble(tonelada1) * (1*Math.pow(10,9))));
                    gramo.setText(String.valueOf(parseDouble(tonelada1) * 1000000));
                    kilogramo.setText(String.valueOf(parseDouble(tonelada1) * 1000));
                    libra.setText(String.valueOf(parseDouble(tonelada1) * 2204.6226));
                    onza.setText(String.valueOf(parseDouble(tonelada1) * 35273.9619));
                    quilate.setText(String.valueOf(parseDouble(tonelada1) * 5000000));
                    grano.setText(String.valueOf(parseDouble(tonelada1) * (1.5432 *Math.pow(10,7))));
                    newton.setText(String.valueOf(parseDouble(tonelada1) * 9806.65));


                }else if(tonelada1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!tonelada1.isEmpty()){
                        String newcadena = tonelada1.substring ( 0, tonelada1.length() - 1 );
                        tonelada.setText(newcadena);
                        tonelada.setSelection(tonelada.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = tonelada1.substring ( 0, tonelada1.length() - 2 );
                    tonelada.setText(newcadena);
                    tonelada.setSelection(tonelada.getText().length());
                }
            }
        }
    };


    public void limpiar(){

        miligramo.getText().clear();
        gramo.getText().clear();
        kilogramo.getText().clear();
        tonelada.getText().clear();
        libra.getText().clear();
        onza.getText().clear();
        quilate.getText().clear();
        grano.getText().clear();
        newton.getText().clear();

    }
}