package com.journaldev.navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * A simple {@link Fragment} subclass.
 */
public class Costa_Rica extends ListFragment {

    DatabaseReference dref;
    public Costa_Rica() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootview=(ViewGroup) inflater.inflate(R.layout.fragment_costa__rica, container, false);
        dref= FirebaseDatabase.getInstance().getReference();
        final ArrayList<String> modismos_ar = new ArrayList<String>();
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.rowlayout,R.id.txtitem,modismos_ar);
        setListAdapter(adapter);
        setRetainInstance(true);
        dref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.hasChildren()){
                    Iterator<DataSnapshot> it_paises = dataSnapshot.getChildren().iterator();
                    while (it_paises.hasNext()){
                        DataSnapshot data_paises = (DataSnapshot) it_paises.next();
                        if("Costa Rica".equals(data_paises.getKey())){
                            Iterator<DataSnapshot> it_palabras = data_paises.getChildren().iterator();
                            while (it_palabras.hasNext()){
                                DataSnapshot data_palbras = (DataSnapshot) it_palabras.next();
                                System.out.println("Datos"+data_palbras.getKey());
                                modismos_ar.add(data_palbras.getKey());
                                adapter.notifyDataSetChanged();
                            }
                        }
                    }
                }
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        return rootview;
    }

}
