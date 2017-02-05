package com.journaldev.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class Bolivia extends ListFragment {

    public Bolivia() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_bolivia, container, false);


        String[] modismos_bo={"Bondi","Guita","Morfar","Chupar","Rati","Ramera","Chucheta","Campera",
                "Bombacha","Calzoncillo","Boludez","Pelotudez","Pibe","Tengo lija","Birra","Churrasco"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.rowlayout,R.id.txtitem,modismos_bo);
        setListAdapter(adapter);
        setRetainInstance(true);
        return rootView;
    }

}
