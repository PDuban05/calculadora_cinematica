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
        libra.addTextChangedListener(changelibra);
        onza.addTextChangedListener(changeonza);
        quilate.addTextChangedListener(changequilate);
        grano.addTextChangedListener(changegrano);
        newton.addTextChangedListener(changenewton);
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

    public TextWatcher changelibra= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            libra1 = libra.getText().toString();
            boolean val = libra.isFocused();
            try {
                if(!libra1.isEmpty() && val ==true){

                    miligramo.setText(String.valueOf(parseDouble(libra1) * 453592.37));
                    gramo.setText(String.valueOf(parseDouble(libra1) * 453.5924));
                    kilogramo.setText(String.valueOf(parseDouble(libra1) * 0.4536));
                    tonelada.setText(String.valueOf(parseDouble(libra1) * (4.5359 *Math.pow(10,-4))));
                    onza.setText(String.valueOf(parseDouble(libra1) * 16));
                    quilate.setText(String.valueOf(parseDouble(libra1) * 2267.9619));
                    grano.setText(String.valueOf(parseDouble(libra1) * 7000));
                    newton.setText(String.valueOf(parseDouble(libra1) * 4.4482));


                }else if(libra1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!libra1.isEmpty()){
                        String newcadena = libra1.substring ( 0, libra1.length() - 1 );
                        libra.setText(newcadena);
                        libra.setSelection(libra.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = libra1.substring ( 0, libra1.length() - 2 );
                    libra.setText(newcadena);
                    libra.setSelection(libra.getText().length());
                }
            }
        }
    };

    public TextWatcher changeonza= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            onza1 = onza.getText().toString();
            boolean val = onza.isFocused();
            try {
                if(!onza1.isEmpty() && val ==true){

                    miligramo.setText(String.valueOf(parseDouble(onza1) * 28349.5231));
                    gramo.setText(String.valueOf(parseDouble(onza1) * 28.3495));
                    kilogramo.setText(String.valueOf(parseDouble(onza1) * 0.0283));
                    tonelada.setText(String.valueOf(parseDouble(onza1) * (2.835 *Math.pow(10,-5))));
                    libra.setText(String.valueOf(parseDouble(onza1) * 0.0625));
                    quilate.setText(String.valueOf(parseDouble(onza1) * 141.7476));
                    grano.setText(String.valueOf(parseDouble(onza1) * 437.5));
                    newton.setText(String.valueOf(parseDouble(onza1) * 0.278));


                }else if(onza1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!onza1.isEmpty()){
                        String newcadena = onza1.substring ( 0, onza1.length() - 1 );
                        onza.setText(newcadena);
                        onza.setSelection(onza.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = onza1.substring ( 0, onza1.length() - 2 );
                    onza.setText(newcadena);
                    onza.setSelection(onza.getText().length());
                }
            }
        }
    };

    public TextWatcher changequilate= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            quilate1 = quilate.getText().toString();
            boolean val = quilate.isFocused();
            try {
                if(!quilate1.isEmpty() && val ==true){

                    miligramo.setText(String.valueOf(parseDouble(quilate1) * 200));
                    gramo.setText(String.valueOf(parseDouble(quilate1) * 0.2));
                    kilogramo.setText(String.valueOf(parseDouble(quilate1) * (2*Math.pow(10,-4))));
                    tonelada.setText(String.valueOf(parseDouble(quilate1) * (2 *Math.pow(10,-7))));
                    libra.setText(String.valueOf(parseDouble(quilate1) * (4.4092 *Math.pow(10,-4))));
                    onza.setText(String.valueOf(parseDouble(quilate1) * 0.0071));
                    grano.setText(String.valueOf(parseDouble(quilate1) * 3.0865));
                    newton.setText(String.valueOf(parseDouble(quilate1) * 0.002));


                }else if(quilate1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!quilate1.isEmpty()){
                        String newcadena = quilate1.substring ( 0, quilate1.length() - 1 );
                        quilate.setText(newcadena);
                        quilate.setSelection(quilate.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = quilate1.substring ( 0, quilate1.length() - 2 );
                    quilate.setText(newcadena);
                    quilate.setSelection(quilate.getText().length());
                }
            }
        }
    };

    public TextWatcher changegrano= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            grano1 = grano.getText().toString();
            boolean val = grano.isFocused();
            try {
                if(!grano1.isEmpty() && val ==true){

                    miligramo.setText(String.valueOf(parseDouble(grano1) * 64.7989));
                    gramo.setText(String.valueOf(parseDouble(grano1) * 0.0648));
                    kilogramo.setText(String.valueOf(parseDouble(grano1) * (6.4799*Math.pow(10,-5))));
                    tonelada.setText(String.valueOf(parseDouble(grano1) * (6.4799 *Math.pow(10,-8))));
                    libra.setText(String.valueOf(parseDouble(grano1) * (1.4286 *Math.pow(10,-4))));
                    onza.setText(String.valueOf(parseDouble(grano1) * 0.0023));
                    quilate.setText(String.valueOf(parseDouble(grano1) * 0.324));
                    newton.setText(String.valueOf(parseDouble(grano1) * (6.3546 *Math.pow(10,-4)) ));


                }else if(grano1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!grano1.isEmpty()){
                        String newcadena = grano1.substring ( 0, grano1.length() - 1 );
                        grano.setText(newcadena);
                        grano.setSelection(grano.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = grano1.substring ( 0, grano1.length() - 2 );
                    grano.setText(newcadena);
                    grano.setSelection(grano.getText().length());
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

                    miligramo.setText(String.valueOf(parseDouble(newton1) * 101971.6213));
                    gramo.setText(String.valueOf(parseDouble(newton1) * 101.9716));
                    kilogramo.setText(String.valueOf(parseDouble(newton1) * 0.102));
                    tonelada.setText(String.valueOf(parseDouble(newton1) * (1.0197 *Math.pow(10,-4))));
                    libra.setText(String.valueOf(parseDouble(newton1) * 0.2248 ));
                    onza.setText(String.valueOf(parseDouble(newton1) * 3.5969));
                    quilate.setText(String.valueOf(parseDouble(newton1) * 509.8581));
                    grano.setText(String.valueOf(parseDouble(newton1) * 1573.6626 ));


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