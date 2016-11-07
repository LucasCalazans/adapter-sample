package com.unifacs.eds2.adaptersample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {

    private List<String> list;
    private LayoutInflater layoutInflater;

    public ListAdapter(Context context, List<String> list) {
        this.list = list;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(R.layout.item_layout, parent, false);
        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        holder.title.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView title;

        public ListViewHolder(View listItem) {
            super(listItem);

            title = (TextView) listItem.findViewById(R.id.item_title);
        }
    }
}
