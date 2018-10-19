package com.example.rawal.edureka31;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class rightFrag extends Fragment {


    static FrameLayout frameLayout;
    public rightFrag() {
        // Required empty public constructor
    }

    static void colorChanger(String color){
        frameLayout.setBackgroundColor( Color.parseColor(color) );
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_right, container, false );
        frameLayout = view.findViewById( R.id.rightFragment );

        return view;
    }

}
