package com.calculadorasdefisica.calculadoradecinematica;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.pruebaa.R;
import com.example.pruebaa.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;


import java.lang.reflect.Method;


public class inicio extends Fragment {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;


    MainActivity setname;



    public inicio() {
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
        return inflater.inflate(R.layout.fragment_inicio, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView name = getActivity().findViewById(R.id.name_fragments);
        String text = getString(R.string.inicio);
        name.setText(text);




        Button mru = view.findViewById(R.id.mru_home);
        Button mcua = view.findViewById(R.id.mcua_home);
        Button mrua = view.findViewById(R.id.mrua_home);
        Button mpcl = view.findViewById(R.id.mpcl_home);
        Button mcu = view.findViewById(R.id.mcu_home);
        Button tv = view.findViewById(R.id.tv_home);
        Button ca = view.findViewById(R.id.ca_home);

        mru.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.calculadora_MRU);
        });

        mcua.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.calculadora_MCUA);
        });

        mrua.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.calculadora_MRUA);
        });

        mpcl.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.calculadora_MPCL);
        });

        mcu.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.calculadora_MCU);
        });

        tv.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.calculadora_tiro_vertical);
        });

        ca.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.caida_libre2);
        });

    }
}