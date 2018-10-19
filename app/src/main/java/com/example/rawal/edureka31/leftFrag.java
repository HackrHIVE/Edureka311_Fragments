package com.example.rawal.edureka31;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class leftFrag extends Fragment implements AdapterView.OnItemClickListener {


    ListView listview;
    ArrayAdapter<String> adapter;
    public leftFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_left, container, false );
        listview = view.findViewById( R.id.listview );
        adapter = new ArrayAdapter<>( getContext(),android.R.layout.simple_list_item_1 );
        adapter.add( "Black" );
        adapter.add( "Red" );
        adapter.add( "Green" );
        adapter.add( "Blue" );
        adapter.add( "Gray" );
        listview.setAdapter( adapter );
        listview.setOnItemClickListener( this );
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String color = adapter.getItem( i );
        switch (color){
            case "Black":
                rightFrag.colorChanger("#212121");
                Toast.makeText( getContext(), "Changing Color of the Right Fragment to Black", Toast.LENGTH_SHORT ).show();
                break;
            case "Red":
                rightFrag.colorChanger("#ba000d");
                Toast.makeText( getContext(), "Changing Color of the Right Fragment to Red", Toast.LENGTH_SHORT ).show();
                break;
            case "Green":
                rightFrag.colorChanger("#66bb6a");
                Toast.makeText( getContext(), "Changing Color of the Right Fragment to Green", Toast.LENGTH_SHORT ).show();
                break;
            case "Blue":
                rightFrag.colorChanger("#2196f3");
                Toast.makeText( getContext(), "Changing Color of the Right Fragment to Blue", Toast.LENGTH_SHORT ).show();
                break;
            case "Gray":
                rightFrag.colorChanger("#757575");
                Toast.makeText( getContext(), "Changing Color of the Right Fragment to Gray", Toast.LENGTH_SHORT ).show();
                break;
        }
    }
}
