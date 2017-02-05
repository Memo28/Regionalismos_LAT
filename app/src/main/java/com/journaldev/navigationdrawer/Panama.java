package com.journaldev.navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class Panama extends ListFragment {


    public Panama() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_panama, container, false);

        String[] modismos_pa={"Arranque","Cocobola","Tinakero","Palo","Burundanga","Fitin","Buco","Llesca","Jeta","Pavo"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.rowlayout,R.id.txtitem,modismos_pa);
        setListAdapter(adapter);
        setRetainInstance(true);
        return rootview;
    }

}
