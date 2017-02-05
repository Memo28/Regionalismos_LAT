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
public class Uruguay extends ListFragment {


    public Uruguay() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_uruguay, container, false);


        String[] modismos_ur={"Afanar","A todo trapo","Bichicome","Cana","De la Planta","Garronear","Roñoso","Terraja"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.rowlayout,R.id.txtitem,modismos_ur);
        setListAdapter(adapter);
        setRetainInstance(true);
        return rootview;
    }

}
