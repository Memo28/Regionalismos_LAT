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
public class Peru extends ListFragment {


    public Peru() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_peru, container, false);


        String[] modismos_pe={"Causa","Hazme la taba","Tombo","Jamear","Que palta","Jato","Chibolo"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.rowlayout,R.id.txtitem,modismos_pe);
        setListAdapter(adapter);
        setRetainInstance(true);


        return rootview;
    }

}
