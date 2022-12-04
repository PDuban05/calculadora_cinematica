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

public class datos extends Fragment {

    EditText bit,kilobit,megabit,gigabit,terabit,petabit,bytes_,kilobyte,megabyte,gigabyte,terabyte,petabyte;
    String bit1,kilobit1,megabit1,gigabit1,terabit1,petabit1,bytes_1,kilobyte1,megabyte1,gigabyte1,terabyte1,petabyte1;



    public datos() {
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
        return inflater.inflate(R.layout.fragment_datos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        bit = view.findViewById(R.id.bit);
        kilobit = view.findViewById(R.id.kilobit);
        megabit = view.findViewById(R.id.megabit);
        gigabit = view.findViewById(R.id.gigabit);
        terabit = view.findViewById(R.id.terabit);
        petabit = view.findViewById(R.id.petabit);
        bytes_ = view.findViewById(R.id.bite_);
        kilobyte = view.findViewById(R.id.kilobyte);
        megabyte = view.findViewById(R.id.megabyte);
        gigabyte = view.findViewById(R.id.gigabyte);
        terabyte = view.findViewById(R.id.terabyte);
        petabyte =view.findViewById(R.id.petabyte);

        bit.addTextChangedListener(changebit);
        kilobit.addTextChangedListener(changekilobit);
        megabit.addTextChangedListener(changemegabit);
        gigabit.addTextChangedListener(changegigabit);
        terabit.addTextChangedListener(changeterabit);
        petabit.addTextChangedListener(changepetabit);

        bytes_.addTextChangedListener(changebyte);
        kilobyte.addTextChangedListener(changekilobyte);
        megabyte.addTextChangedListener(changemegabyte);
        gigabyte.addTextChangedListener(changegigabyte);
        terabyte.addTextChangedListener(changeterabyte);
        petabyte.addTextChangedListener(changepetabyte);

    }



    public TextWatcher changebit= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            bit1 = bit.getText().toString();
            boolean val = bit.isFocused();
            try {
                if(!bit1.isEmpty() && val ==true){

                    kilobit.setText(String.valueOf(parseDouble(bit1) * 0.001));
                    megabit.setText(String.valueOf(parseDouble(bit1) * (1 * Math.pow(10,-6))));
                    gigabit.setText(String.valueOf(parseDouble(bit1) * (1 * Math.pow(10,-9))));
                    terabit.setText(String.valueOf(parseDouble(bit1) * (1 * Math.pow(10,-12))));
                    petabit.setText(String.valueOf(parseDouble(bit1) * (1 * Math.pow(10,-15))));
                    bytes_.setText(String.valueOf(parseDouble(bit1) * 0.125));
                    kilobyte.setText(String.valueOf(parseDouble(bit1) * (1.25 * Math.pow(10,-4))));
                    megabyte.setText(String.valueOf(parseDouble(bit1) * (1.25 * Math.pow(10,-7))));
                    gigabyte.setText(String.valueOf(parseDouble(bit1) * (1.25 * Math.pow(10,-10))));
                    terabyte.setText(String.valueOf(parseDouble(bit1) * (1.25 * Math.pow(10,-13))));
                    petabyte.setText(String.valueOf(parseDouble(bit1) *(1.25 * Math.pow(10,-16))));

                }else if(bit1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!bit1.isEmpty()){
                        String newcadena = bit1.substring ( 0, bit1.length() - 1 );
                        bit.setText(newcadena);
                        bit.setSelection(bit.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = bit1.substring ( 0, bit1.length() - 2 );
                    bit.setText(newcadena);
                    bit.setSelection(bit.getText().length());
                }
            }
        }
    };

    public TextWatcher changekilobit= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            kilobit1 = kilobit.getText().toString();
            boolean val = kilobit.isFocused();
            try {
                if(!kilobit1.isEmpty() && val ==true){

                    bit.setText(String.valueOf(parseDouble(kilobit1) * 1000));
                    megabit.setText(String.valueOf(parseDouble(kilobit1) * 0.001));
                    gigabit.setText(String.valueOf(parseDouble(kilobit1) * (1 * Math.pow(10,-6))));
                    terabit.setText(String.valueOf(parseDouble(kilobit1) * (1 * Math.pow(10,-9))));
                    petabit.setText(String.valueOf(parseDouble(kilobit1) * (1 * Math.pow(10,-12))));
                    bytes_.setText(String.valueOf(parseDouble(kilobit1) * 125));
                    kilobyte.setText(String.valueOf(parseDouble(kilobit1) * 0.125));
                    megabyte.setText(String.valueOf(parseDouble(kilobit1) * (1.25 * Math.pow(10,-4))));
                    gigabyte.setText(String.valueOf(parseDouble(kilobit1) * (1.25 * Math.pow(10,-7))));
                    terabyte.setText(String.valueOf(parseDouble(kilobit1) * (1.25 * Math.pow(10,-10))));
                    petabyte.setText(String.valueOf(parseDouble(kilobit1) *(1.25 * Math.pow(10,-13))));

                }else if(kilobit1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!kilobit1.isEmpty()){
                        String newcadena = kilobit1.substring ( 0, kilobit1.length() - 1 );
                        kilobit.setText(newcadena);
                        kilobit.setSelection(kilobit.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = kilobit1.substring ( 0, kilobit1.length() - 2 );
                    kilobit.setText(newcadena);
                    kilobit.setSelection(kilobit.getText().length());
                }
            }
        }
    };

    public TextWatcher changemegabit= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            megabit1 = megabit.getText().toString();
            boolean val = megabit.isFocused();
            try {
                if(!megabit1.isEmpty() && val ==true){

                    bit.setText(String.valueOf(parseDouble(megabit1) * 1000000));
                    kilobit.setText(String.valueOf(parseDouble(megabit1) * 1000));
                    gigabit.setText(String.valueOf(parseDouble(megabit1) * 0.001));
                    terabit.setText(String.valueOf(parseDouble(megabit1) * (1 * Math.pow(10,-6))));
                    petabit.setText(String.valueOf(parseDouble(megabit1) * (1 * Math.pow(10,-9))));
                    bytes_.setText(String.valueOf(parseDouble(megabit1) * 125000));
                    kilobyte.setText(String.valueOf(parseDouble(megabit1) * 125));
                    megabyte.setText(String.valueOf(parseDouble(megabit1) * 0.125));
                    gigabyte.setText(String.valueOf(parseDouble(megabit1) * (1.25 * Math.pow(10,-4))));
                    terabyte.setText(String.valueOf(parseDouble(megabit1) * (1.25 * Math.pow(10,-7))));
                    petabyte.setText(String.valueOf(parseDouble(megabit1) *(1.25 * Math.pow(10,-10))));

                }else if(megabit1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!megabit1.isEmpty()){
                        String newcadena = megabit1.substring ( 0, megabit1.length() - 1 );
                        megabit.setText(newcadena);
                        megabit.setSelection(megabit.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = megabit1.substring ( 0, megabit1.length() - 2 );
                    megabit.setText(newcadena);
                    megabit.setSelection(megabit.getText().length());
                }
            }
        }
    };

    public TextWatcher changegigabit= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            gigabit1 = gigabit.getText().toString();
            boolean val = gigabit.isFocused();
            try {
                if(!gigabit1.isEmpty() && val ==true){

                    bit.setText(String.valueOf(parseDouble(gigabit1) * (1 * Math.pow(10,9)) ));
                    kilobit.setText(String.valueOf(parseDouble(gigabit1) * 1000000));
                    megabit.setText(String.valueOf(parseDouble(gigabit1) * 1000));
                    terabit.setText(String.valueOf(parseDouble(gigabit1) * 0.001));
                    petabit.setText(String.valueOf(parseDouble(gigabit1) * (1 * Math.pow(10,-6))));
                    bytes_.setText(String.valueOf(parseDouble(gigabit1) * (1.25 * Math.pow(10,8))));
                    kilobyte.setText(String.valueOf(parseDouble(gigabit1) * 125000));
                    megabyte.setText(String.valueOf(parseDouble(gigabit1) * 125));
                    gigabyte.setText(String.valueOf(parseDouble(gigabit1) * 0.125));
                    terabyte.setText(String.valueOf(parseDouble(gigabit1) * (1.25 * Math.pow(10,-4))));
                    petabyte.setText(String.valueOf(parseDouble(gigabit1) *(1.25 * Math.pow(10,-7))));

                }else if(gigabit1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!gigabit1.isEmpty()){
                        String newcadena = gigabit1.substring ( 0, gigabit1.length() - 1 );
                        gigabit.setText(newcadena);
                        gigabit.setSelection(gigabit.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = gigabit1.substring ( 0, gigabit1.length() - 2 );
                    gigabit.setText(newcadena);
                    gigabit.setSelection(gigabit.getText().length());
                }
            }
        }
    };

    public TextWatcher changeterabit= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            terabit1 = terabit.getText().toString();
            boolean val = terabit.isFocused();
            try {
                if(!terabit1.isEmpty() && val ==true){

                    bit.setText(String.valueOf(parseDouble(terabit1) * (1 * Math.pow(10,12)) ));
                    kilobit.setText(String.valueOf(parseDouble(terabit1) *  (1 * Math.pow(10,9))));
                    megabit.setText(String.valueOf(parseDouble(terabit1) * 1000000));
                    gigabit.setText(String.valueOf(parseDouble(terabit1) * 1000));
                    petabit.setText(String.valueOf(parseDouble(terabit1) * 0.001));
                    bytes_.setText(String.valueOf(parseDouble(terabit1) * (1.25 * Math.pow(10,11))));
                    kilobyte.setText(String.valueOf(parseDouble(terabit1) * (1.25 * Math.pow(10,8))));
                    megabyte.setText(String.valueOf(parseDouble(terabit1) * 125000));
                    gigabyte.setText(String.valueOf(parseDouble(terabit1) * 125));
                    terabyte.setText(String.valueOf(parseDouble(terabit1) * 0.125));
                    petabyte.setText(String.valueOf(parseDouble(terabit1) *(1.25 * Math.pow(10,-4))));

                }else if(terabit1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!terabit1.isEmpty()){
                        String newcadena = terabit1.substring ( 0, terabit1.length() - 1 );
                        terabit.setText(newcadena);
                        terabit.setSelection(terabit.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = terabit1.substring ( 0, terabit1.length() - 2 );
                    terabit.setText(newcadena);
                    terabit.setSelection(terabit.getText().length());
                }
            }
        }
    };

    public TextWatcher changepetabit= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            petabit1 = petabit.getText().toString();
            boolean val = petabit.isFocused();
            try {
                if(!petabit1.isEmpty() && val ==true){

                    bit.setText(String.valueOf(parseDouble(petabit1) * (10 * Math.pow(10,14)) ));
                    kilobit.setText(String.valueOf(parseDouble(petabit1) *  (10 * Math.pow(10,11))));
                    megabit.setText(String.valueOf(parseDouble(petabit1) * (10 * Math.pow(10,8))));
                    gigabit.setText(String.valueOf(parseDouble(petabit1) * 1000000));
                    terabit.setText(String.valueOf(parseDouble(petabit1) * 1000));
                    bytes_.setText(String.valueOf(parseDouble(petabit1) * (1.25 * Math.pow(10,14))));
                    kilobyte.setText(String.valueOf(parseDouble(petabit1) * (1.25 * Math.pow(10,11))));
                    megabyte.setText(String.valueOf(parseDouble(petabit1) * (1.25 * Math.pow(10,8))));
                    gigabyte.setText(String.valueOf(parseDouble(petabit1) * 125000));
                    terabyte.setText(String.valueOf(parseDouble(petabit1) * 125));
                    petabyte.setText(String.valueOf(parseDouble(petabit1) *0.125));

                }else if(petabit1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!petabit1.isEmpty()){
                        String newcadena = petabit1.substring ( 0, petabit1.length() - 1 );
                        petabit.setText(newcadena);
                        petabit.setSelection(petabit.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = petabit1.substring ( 0, petabit1.length() - 2 );
                    petabit.setText(newcadena);
                    petabit.setSelection(petabit.getText().length());
                }
            }
        }
    };

    public TextWatcher changebyte= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            bytes_1 = bytes_.getText().toString();
            boolean val = bytes_.isFocused();
            try {
                if(!bytes_1.isEmpty() && val ==true){

                    bit.setText(String.valueOf(parseDouble(bytes_1) * 8 ));
                    kilobit.setText(String.valueOf(parseDouble(bytes_1) *  0.008));
                    megabit.setText(String.valueOf(parseDouble(bytes_1) * (8 * Math.pow(10,-6))));
                    gigabit.setText(String.valueOf(parseDouble(bytes_1) * (8 * Math.pow(10,-9))));
                    terabit.setText(String.valueOf(parseDouble(bytes_1) * (8 * Math.pow(10,-12))));
                    petabit.setText(String.valueOf(parseDouble(bytes_1) * (8 * Math.pow(10,-15))));
                    kilobyte.setText(String.valueOf(parseDouble(bytes_1) * 0.001));
                    megabyte.setText(String.valueOf(parseDouble(bytes_1) * (1 * Math.pow(10,-6))));
                    gigabyte.setText(String.valueOf(parseDouble(bytes_1) * (1 * Math.pow(10,-9))));
                    terabyte.setText(String.valueOf(parseDouble(bytes_1) * (1 * Math.pow(10,-12))));
                    petabyte.setText(String.valueOf(parseDouble(bytes_1) *(1 * Math.pow(10,-15))));

                }else if(bytes_1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!bytes_1.isEmpty()){
                        String newcadena = bytes_1.substring ( 0, bytes_1.length() - 1 );
                        bytes_.setText(newcadena);
                        bytes_.setSelection(bytes_.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = bytes_1.substring ( 0, bytes_1.length() - 2 );
                    bytes_.setText(newcadena);
                    bytes_.setSelection(bytes_.getText().length());
                }
            }
        }
    };

    public TextWatcher changekilobyte= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            kilobyte1 = kilobyte.getText().toString();
            boolean val = kilobyte.isFocused();
            try {
                if(!kilobyte1.isEmpty() && val ==true){

                    bit.setText(String.valueOf(parseDouble(kilobyte1) * 8000 ));
                    kilobit.setText(String.valueOf(parseDouble(kilobyte1) *  8));
                    megabit.setText(String.valueOf(parseDouble(kilobyte1) * 0.008));
                    gigabit.setText(String.valueOf(parseDouble(kilobyte1) * (8 * Math.pow(10,-6))));
                    terabit.setText(String.valueOf(parseDouble(kilobyte1) * (8 * Math.pow(10,-9))));
                    petabit.setText(String.valueOf(parseDouble(kilobyte1) * (8 * Math.pow(10,-12))));
                    bytes_.setText(String.valueOf(parseDouble(kilobyte1) * 1000));
                    megabyte.setText(String.valueOf(parseDouble(kilobyte1) * 0.001));
                    gigabyte.setText(String.valueOf(parseDouble(kilobyte1) * (1 * Math.pow(10,-6))));
                    terabyte.setText(String.valueOf(parseDouble(kilobyte1) * (1 * Math.pow(10,-9))));
                    petabyte.setText(String.valueOf(parseDouble(kilobyte1) *(1 * Math.pow(10,-12))));

                }else if(kilobyte1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!kilobyte1.isEmpty()){
                        String newcadena = kilobyte1.substring ( 0, kilobyte1.length() - 1 );
                        kilobyte.setText(newcadena);
                        kilobyte.setSelection(kilobyte.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = kilobyte1.substring ( 0, kilobyte1.length() - 2 );
                    kilobyte.setText(newcadena);
                    kilobyte.setSelection(kilobyte.getText().length());
                }
            }
        }
    };

    public TextWatcher changemegabyte= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            megabyte1 = megabyte.getText().toString();
            boolean val = megabyte.isFocused();
            try {
                if(!megabyte1.isEmpty() && val ==true){

                    bit.setText(String.valueOf(parseDouble(megabyte1) * 8000000 ));
                    kilobit.setText(String.valueOf(parseDouble(megabyte1) *  8000));
                    megabit.setText(String.valueOf(parseDouble(megabyte1) * 8));
                    gigabit.setText(String.valueOf(parseDouble(megabyte1) * 0.008));
                    terabit.setText(String.valueOf(parseDouble(megabyte1) * (8 * Math.pow(10,-6))));
                    petabit.setText(String.valueOf(parseDouble(megabyte1) * (8 * Math.pow(10,-9))));
                    bytes_.setText(String.valueOf(parseDouble(megabyte1) * 1000000));
                    kilobyte.setText(String.valueOf(parseDouble(megabyte1) * 1000));
                    gigabyte.setText(String.valueOf(parseDouble(megabyte1) * 0.001));
                    terabyte.setText(String.valueOf(parseDouble(megabyte1) * (1 * Math.pow(10,-6))));
                    petabyte.setText(String.valueOf(parseDouble(megabyte1) *(1 * Math.pow(10,-9))));

                }else if(megabyte1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!megabyte1.isEmpty()){
                        String newcadena = megabyte1.substring ( 0, megabyte1.length() - 1 );
                        megabyte.setText(newcadena);
                        megabyte.setSelection(megabyte.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = megabyte1.substring ( 0, megabyte1.length() - 2 );
                    megabyte.setText(newcadena);
                    megabyte.setSelection(megabyte.getText().length());
                }
            }
        }
    };

    public TextWatcher changegigabyte= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            gigabyte1 = gigabyte.getText().toString();
            boolean val = gigabyte.isFocused();
            try {
                if(!gigabyte1.isEmpty() && val ==true){

                    bit.setText(String.valueOf(parseDouble(gigabyte1) *(8 * Math.pow(10,9)) ));
                    kilobit.setText(String.valueOf(parseDouble(gigabyte1) *  8000000));
                    megabit.setText(String.valueOf(parseDouble(gigabyte1) * 8000));
                    gigabit.setText(String.valueOf(parseDouble(gigabyte1) * 8));
                    terabit.setText(String.valueOf(parseDouble(gigabyte1) * 0.008));
                    petabit.setText(String.valueOf(parseDouble(gigabyte1) * (8 * Math.pow(10,-6))));
                    bytes_.setText(String.valueOf(parseDouble(gigabyte1) * (1 * Math.pow(10,9))));
                    kilobyte.setText(String.valueOf(parseDouble(gigabyte1) * 1000000));
                    megabyte.setText(String.valueOf(parseDouble(gigabyte1) * 1000));
                    terabyte.setText(String.valueOf(parseDouble(gigabyte1) * 0.001));
                    petabyte.setText(String.valueOf(parseDouble(gigabyte1) *(1 * Math.pow(10,-6))));

                }else if(gigabyte1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!gigabyte1.isEmpty()){
                        String newcadena = gigabyte1.substring ( 0, gigabyte1.length() - 1 );
                        gigabyte.setText(newcadena);
                        gigabyte.setSelection(gigabyte.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = gigabyte1.substring ( 0, gigabyte1.length() - 2 );
                    gigabyte.setText(newcadena);
                    gigabyte.setSelection(gigabyte.getText().length());
                }
            }
        }
    };

    public TextWatcher changeterabyte= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            terabyte1 = terabyte.getText().toString();
            boolean val = terabyte.isFocused();
            try {
                if(!terabyte1.isEmpty() && val ==true){

                    bit.setText(String.valueOf(parseDouble(terabyte1) *(8 * Math.pow(10,12)) ));
                    kilobit.setText(String.valueOf(parseDouble(terabyte1) * (8 * Math.pow(10,9))));
                    megabit.setText(String.valueOf(parseDouble(terabyte1) * 8000000));
                    gigabit.setText(String.valueOf(parseDouble(terabyte1) * 8000));
                    terabit.setText(String.valueOf(parseDouble(terabyte1) * 8));
                    petabit.setText(String.valueOf(parseDouble(terabyte1) *0.008));
                    bytes_.setText(String.valueOf(parseDouble(terabyte1) * (1 * Math.pow(10,12))));
                    kilobyte.setText(String.valueOf(parseDouble(terabyte1) * (1 * Math.pow(10,9))));
                    megabyte.setText(String.valueOf(parseDouble(terabyte1) * 1000000));
                    gigabyte.setText(String.valueOf(parseDouble(terabyte1) * 1000));
                    petabyte.setText(String.valueOf(parseDouble(terabyte1) *0.001));

                }else if(terabyte1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!terabyte1.isEmpty()){
                        String newcadena = terabyte1.substring ( 0, terabyte1.length() - 1 );
                        terabyte.setText(newcadena);
                        terabyte.setSelection(terabyte.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = terabyte1.substring ( 0, terabyte1.length() - 2 );
                    terabyte.setText(newcadena);
                    terabyte.setSelection(terabyte.getText().length());
                }
            }
        }
    };

    public TextWatcher changepetabyte= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
        @Override
        public void afterTextChanged(Editable s) {

            petabyte1 = petabyte.getText().toString();
            boolean val = petabyte.isFocused();
            try {
                if(!petabyte1.isEmpty() && val ==true){

                    bit.setText(String.valueOf(parseDouble(petabyte1) *(8 * Math.pow(10,15)) ));
                    kilobit.setText(String.valueOf(parseDouble(petabyte1) * (8 * Math.pow(10,12))));
                    megabit.setText(String.valueOf(parseDouble(petabyte1) * (8 * Math.pow(10,9))));
                    gigabit.setText(String.valueOf(parseDouble(petabyte1) * 8000000));
                    terabit.setText(String.valueOf(parseDouble(petabyte1) * 8000));
                    petabit.setText(String.valueOf(parseDouble(petabyte1) * 8));
                    bytes_.setText(String.valueOf(parseDouble(petabyte1) * (10 * Math.pow(10,14))));
                    kilobyte.setText(String.valueOf(parseDouble(petabyte1) * (10 * Math.pow(10,11))));
                    megabyte.setText(String.valueOf(parseDouble(petabyte1) * (10 * Math.pow(10,8))));
                    gigabyte.setText(String.valueOf(parseDouble(petabyte1) * 1000000));
                    terabyte.setText(String.valueOf(parseDouble(petabyte1) *1000));

                }else if(petabyte1.isEmpty()){
                    limpiar();
                }
            }catch (Exception e){

                try{
                    if (!petabyte1.isEmpty()){
                        String newcadena = petabyte1.substring ( 0, petabyte1.length() - 1 );
                        petabyte.setText(newcadena);
                        petabyte.setSelection(petabyte.getText().length());
                    }
                }catch (Exception e1){

                    String newcadena = petabyte1.substring ( 0, petabyte1.length() - 2 );
                    petabyte.setText(newcadena);
                    petabyte.setSelection(petabyte.getText().length());
                }
            }
        }
    };




    public void limpiar (){

        bit.getText().clear();
        kilobit.getText().clear();
        megabit.getText().clear();
        gigabit.getText().clear();
        terabit.getText().clear();
        petabit.getText().clear();
        bytes_.getText().clear();
        kilobyte.getText().clear();
        megabyte.getText().clear();
        gigabyte.getText().clear();
        terabyte.getText().clear();
        petabyte.getText().clear();

    }
}