package nyc.c4q.rusili.utilitytemplates.widgets.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter {
    private List<?> rvList;

    public RecyclerViewAdapter(List<?> listParam){
        this.rvList = listParam;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        return new RecyclerViewViewHolder(parent);
    }

    @Override
    public void onBindViewHolder (RecyclerView.ViewHolder holder, int position) {
        RecyclerViewViewHolder recyclerViewViewHolder = (RecyclerViewViewHolder) holder;
        recyclerViewViewHolder.bind();
    }

    @Override
    public int getItemCount () {
        return rvList.size();
    }
}
