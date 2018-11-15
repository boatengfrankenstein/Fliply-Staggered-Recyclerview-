package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.wolfsoft.fliply_search_results_fliply.R;

import java.util.ArrayList;

import model.Search_Results_Fliply_Model;

/**
 * Created by wolfsoft4 on 21/9/18.
 */

public class Search_Results_Adapter extends RecyclerView.Adapter<Search_Results_Adapter.ViewHolder> {
    Context context;
    private ArrayList<Search_Results_Fliply_Model> search_results_fliply_modelArrayList;

    public Search_Results_Adapter(Context context, ArrayList<Search_Results_Fliply_Model> search_results_fliply_modelArrayList) {
        this.context = context;
        this.search_results_fliply_modelArrayList = search_results_fliply_modelArrayList;
    }

    @Override
    public Search_Results_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_search_results_fliply,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Search_Results_Adapter.ViewHolder holder, int position) {
        holder.bitmap5.setImageResource(search_results_fliply_modelArrayList.get(position).getBitmap5());
        holder.imgrs.setImageResource(search_results_fliply_modelArrayList.get(position).getImgrs());
        holder.txtdji.setText(search_results_fliply_modelArrayList.get(position).getTxtdji());
        holder.txtprice.setText(search_results_fliply_modelArrayList.get(position).getTxtprice());
    }

    @Override
    public int getItemCount() {
        return search_results_fliply_modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView  bitmap5,imgrs;
        TextView txtdji,txtprice;

        public ViewHolder(View itemView) {
            super(itemView);
            bitmap5=itemView.findViewById(R.id.bitmap5);
            imgrs=itemView.findViewById(R.id.imgrs);
            txtdji=itemView.findViewById(R.id.txtdji);
            txtprice=itemView.findViewById(R.id.txtprice);





        }
    }
}
