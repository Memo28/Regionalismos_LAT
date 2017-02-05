package com.journaldev.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by anupamchugh on 10/12/15.
 */
public class Chile extends ListFragment {

    public Chile() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_chile, container, false);


        String[] modismos_ch={"Hueon","Micro","Coleto","Flaites","Luca","Maricón","Aweonao"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.rowlayout,R.id.txtitem,modismos_ch);
        setListAdapter(adapter);
        setRetainInstance(true);
        return rootView;
    }

}
