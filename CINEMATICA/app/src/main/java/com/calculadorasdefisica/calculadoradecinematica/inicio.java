package com.calculadorasdefisica.calculadoradecinematica;

import android.media.MediaPlayer;
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

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pruebaa.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;


import java.lang.reflect.Method;


public class inicio extends Fragment {

    private AdView mAdView, mAdView2;






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

        try {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.P) {
                TextView name = getActivity().requireViewById(R.id.app_bar_main).findViewById(R.id.name_fragments);
                String text = getString(R.string.inicio);
                name.setText(text);


                ImageView mru = getActivity().requireViewById(R.id.app_bar_main).findViewById(R.id.mru_v);
                ImageView mrua = getActivity().requireViewById(R.id.app_bar_main).findViewById(R.id.mrua_v);
                ImageView mcu = getActivity().requireViewById(R.id.app_bar_main).findViewById(R.id.mcu_v);
                ImageView mcua = getActivity().requireViewById(R.id.app_bar_main).findViewById(R.id.mcua_v);
                ImageView mpcl = getActivity().requireViewById(R.id.app_bar_main).findViewById(R.id.mpcl_v);
                ImageView tv = getActivity().requireViewById(R.id.app_bar_main).findViewById(R.id.tv_v);
                ImageView ca = getActivity().requireViewById(R.id.app_bar_main).findViewById(R.id.ca_v);

                mru.setVisibility(View.VISIBLE);
                mrua.setVisibility(View.VISIBLE);
                mcu.setVisibility(View.VISIBLE);
                mcua.setVisibility(View.VISIBLE);
                mpcl.setVisibility(View.VISIBLE);
                tv.setVisibility(View.VISIBLE);
                ca.setVisibility(View.VISIBLE);



            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        Button mru = view.findViewById(R.id.mru_home);
        Button mcua = view.findViewById(R.id.mcua_home);
        Button mrua = view.findViewById(R.id.mrua_home);
        Button mpcl = view.findViewById(R.id.mpcl_home);
        Button mcu = view.findViewById(R.id.mcu_home);
        Button tv = view.findViewById(R.id.tv_home);
        Button ca = view.findViewById(R.id.ca_home);
        MediaPlayer sonido = MediaPlayer.create(getContext(),R.raw.btn);


        mru.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.calculadora_MRU);
            sonido.start();
        });

        mcua.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.calculadora_MCUA);
            sonido.start();
        });

        mrua.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.calculadora_MRUA);
            sonido.start();
        });

        mpcl.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.calculadora_MPCL);
            sonido.start();
        });

        mcu.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.calculadora_MCU);
            sonido.start();
        });

        tv.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.calculadora_tiro_vertical);
            sonido.start();
        });

        ca.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.caida_libre2);
            sonido.start();
        });

    }
}