package com.example.pc.practicatema4pmdm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PrimerFragmentBoton3 extends Fragment {
    TextView txtFragment;
    //TextView txtActivity;
//Button boton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_primer_boton3, container, false);
        return view;
    }

}
