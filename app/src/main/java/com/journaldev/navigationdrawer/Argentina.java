package com.journaldev.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by anupamchugh on 10/12/15.
 */
public class Argentina extends ListFragment {

    public Argentina() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_argentina, container, false);

        String[] modismos_ar={"Bondi","Guita","Morfar","Chupar","Rati","Ramera","Chucheta"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.rowlayout,R.id.txtitem,modismos_ar);
        setListAdapter(adapter);
        setRetainInstance(true);


        return rootView;
    }

    //Listener de ListView

    public void onListItemClick(ListView l, View view, int position, long id){
        ViewGroup viewGroup = (ViewGroup) view;
        TextView txt = (TextView) viewGroup.findViewById(R.id.txtitem);
        Toast.makeText(getActivity(),txt.getText().toString(), Toast.LENGTH_LONG).show();


    }

}
