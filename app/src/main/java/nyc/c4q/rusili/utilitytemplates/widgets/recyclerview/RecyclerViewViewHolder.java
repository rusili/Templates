package nyc.c4q.rusili.utilitytemplates.widgets.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.rusili.utilitytemplates.R;

public class RecyclerViewViewHolder extends RecyclerView.ViewHolder {
    private static View mView;

    public RecyclerViewViewHolder (ViewGroup parent) {
        super(inflateView(parent));
    }

    private static View inflateView (ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        mView = inflater.inflate(R.layout.recyclerview_viewholder, parent, false);
        return mView;
    }

    public void bind () {

    }
}
