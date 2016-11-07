package com.unifacs.eds2.adaptersample;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.recycler_view)
    RecyclerView rvList;

    List<String> list;

    @AfterViews
    protected void init() {
        updateList();

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        ListAdapter listAdapter = new ListAdapter(this, list);

        rvList.setHasFixedSize(true);
        rvList.setLayoutManager(llm);
        rvList.setAdapter(listAdapter);
    }

    private void updateList() {
        list = new ArrayList<>();
        list.add("Ciencia da Computaçao");
        list.add("Sistema de Informaçao");
    }

}
