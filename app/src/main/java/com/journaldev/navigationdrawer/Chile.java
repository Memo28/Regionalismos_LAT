package com.journaldev.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by anupamchugh on 10/12/15.
 */
public class Chile extends ListFragment {
    DatabaseReference dref;
    final HashMap<String,String> modismos_hash = new HashMap<String, String>();
    public Chile() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_chile, container, false);
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
                        if("Chile".equals(data_paises.getKey())){
                            Iterator<DataSnapshot> it_palabras = data_paises.getChildren().iterator();
                            while (it_palabras.hasNext()){
                                DataSnapshot data_palbras = (DataSnapshot) it_palabras.next();
                                System.out.println("Datos"+data_palbras.getKey());
                                modismos_ar.add(data_palbras.getKey());
                                modismos_hash.put(data_palbras.getKey(), (String) data_palbras.getValue());
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
        return rootView;
    }


    //Listener de ListView

    public void onListItemClick(ListView l, View view, int position, long id){
        ViewGroup viewGroup = (ViewGroup) view;
        TextView txt = (TextView) viewGroup.findViewById(R.id.txtitem);
        Intent intent = new Intent(Chile.this.getActivity(), Information_Activity.class);
        intent.putExtra("Significado",modismos_hash.get(txt.getText().toString()));
        startActivity(intent);
    }

}
