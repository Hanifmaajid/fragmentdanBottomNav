package com.example.calotiket;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class TransportFragment extends Fragment {


    View v;
    RecyclerView recyclerView;
    List<ModalClass> mList;
    Adapter adapter;

    public TransportFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_transport, container, false);

        recyclerView=v.findViewById(R.id.recyclerViewId);

        adapter= new Adapter(mList, getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mList=new ArrayList<>();
        mList.add(new ModalClass(R.drawable.pesawat,"Pesawat Domestic"));
        mList.add(new ModalClass(R.drawable.kapal,"Kapal Pesiar"));
        mList.add(new ModalClass(R.drawable.kereta,"Kereta MRT"));
        mList.add(new ModalClass(R.drawable.bus,"Bus Patas"));
        mList.add(new ModalClass(R.drawable.becak,"Becak Nyaman"));
        mList.add(new ModalClass(R.drawable.andhong,"Andhong Malbor"));
        mList.add(new ModalClass(R.drawable.kuda,"Kuda Balap"));

    }
}