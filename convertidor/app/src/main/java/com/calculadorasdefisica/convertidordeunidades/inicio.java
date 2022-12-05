package com.calculadorasdefisica.convertidordeunidades;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.convertidordeunidades.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class inicio extends Fragment {

private AdView mAdView, mAdView2;



    public inicio() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MobileAds.initialize(getContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });



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



        Button longitud = view.findViewById(R.id.btn_longitud);
        Button velocidad = view.findViewById(R.id.btn_velocidad);
        Button tiempo = view.findViewById(R.id.btn_tiempo);
        Button aceleracion = view.findViewById(R.id.aceleracion);
        Button energia = view.findViewById(R.id.energia);
        Button fuerza = view.findViewById(R.id.fuerza);
        Button poder = view.findViewById(R.id.poder);
        Button datos = view.findViewById(R.id.almacenamiento_datos);
        Button volumen = view.findViewById(R.id.volumen);
        Button masa = view.findViewById(R.id.peso);
        Button temperatura = view.findViewById(R.id.temperatura);

        longitud.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.longitud);
        });

        velocidad.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.velocidad);
        });

        tiempo.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.tiempo);
        });

        aceleracion.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.aceleracion);
        });

        energia.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.energia2);
        });

        fuerza.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.fuerza2);
        });

        poder.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.poder2);
        });

        datos.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.datos);
        });

        volumen.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.volumen);
        });

        masa.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.peso2);
        });

        temperatura.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.temperatura2);
        });
    }


}