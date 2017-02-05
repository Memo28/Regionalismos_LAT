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
public class Costa_Rica extends ListFragment {


    public Costa_Rica() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootview=(ViewGroup) inflater.inflate(R.layout.fragment_costa__rica, container, false);

        String[] modismos_cr={"Playo","Carepicha","Hacerse el Ruso","Tapis","Jupa","Pijiado","Puro","Picha","Tortillera",
                "Chorizo","Birra","Sarpe","Blanco","Mico","Tico","Andar con Tula","Filo"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.rowlayout,R.id.txtitem,modismos_cr);
        setListAdapter(adapter);
        setRetainInstance(true);

        return rootview;
    }

}
