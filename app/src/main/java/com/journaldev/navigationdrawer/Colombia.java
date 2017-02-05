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
public class Colombia extends ListFragment {


    public Colombia() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_colombia, container, false);
        String[] modismos_co={"Chimba","Bacano","Chevere","Camellar","Ñapa","Repechaje","Parcero","Lucas","Menudo",
        "Pea","Jinchera","Estar Pelado","Azarar","Visage","Patoniar","Andar con Tula","Filo"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.rowlayout,R.id.txtitem,modismos_co);
        setListAdapter(adapter);
        setRetainInstance(true);


        return rootview;
    }

}
