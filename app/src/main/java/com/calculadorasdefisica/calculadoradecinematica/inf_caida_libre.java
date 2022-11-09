package com.calculadorasdefisica.calculadoradecinematica;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.pruebaa.R;
import com.google.android.material.appbar.AppBarLayout;


public class inf_caida_libre extends Fragment {



    public inf_caida_libre() {
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
        return inflater.inflate(R.layout.fragment_inf_caida_libre, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RelativeLayout layout = getActivity().findViewById(R.id.head);
        ViewGroup.LayoutParams params = layout.getLayoutParams();
        params.height = 0;
        layout.setLayoutParams(params);
        TextView name = getActivity().findViewById(R.id.name_fragments);
        name.setVisibility(View.INVISIBLE);













    }
}