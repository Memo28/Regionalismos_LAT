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
public class Venezuela extends ListFragment {


    public Venezuela() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.fragment_venezuela, container, false);


        String[] modismos_vz={"Pana","Chamo","Fino","Chimbo","Na'guara","Chulo","Burda","Peroles","Catire","Bulla",
        "Bochinche","Bululu","Despelote","Cambur","Echar los perros","Carajito","Pure","Labia"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.rowlayout,R.id.txtitem,modismos_vz);
        setListAdapter(adapter);
        setRetainInstance(true);

        return rootview;
    }

}
