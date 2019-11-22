package com.example.mandira_3rd_assignment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mandira_3rd_assignment.HomeActivity;
import com.example.mandira_3rd_assignment.R;
import com.example.mandira_3rd_assignment.adapter.studentadapter;

public class homefrag extends Fragment {

    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_home,container,false);
        recyclerView = view.findViewById(R.id.recyclerView);
        studentadapter studentAdapter = new studentadapter(getContext(), HomeActivity.studentsList);
        recyclerView.setAdapter(studentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }
}
