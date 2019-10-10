package com.example.dummyjson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ContentViewHolder> {

    //this context we will use to inflate the layout
    private Context mCtx;
    //we are storing all the products in a list
    private Response contentList;

    public ProductAdapter(Context mCtx, Response contentList) {
        this.mCtx = mCtx;
        this.contentList = contentList;
    }

    public ContentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.card_layout, null);
        return new ContentViewHolder(view);
    }

    public void onBindViewHolder(ContentViewHolder holder, int position) {
        //getting the product of the specified position

        List<MyorderItem> accSet =  contentList.getMyorder();

        for(int i=0;i<accSet.size();i++)
        {

        //holder.text_unpaid.setText(accSet.get(position).getOrderName());


         }
    }
        /*boolean isHeader = accSet.get(position).getIsHeader();
        holder.text_unpaidvalue.setText(accSet.get(position).getIsHeader());
        holder.text_unpaid.setText(accSet.get(position).getIsHeader());
        holder.text_unpaid.setText(accSet.get(position).getIsHeader());
        holder.text_unpaid.setText(accSet.get(position).getIsHeader());*/


        @Override
       public int getItemCount() {
        if (contentList != null) {
            return 2;
        } else {
            return 0;
        }
    }


    class ContentViewHolder extends RecyclerView.ViewHolder {

        TextView text_unpaid, text_unpaidvalue,
                text_tobeshipped, text_tobeshippedvalue, text_shipped, text_shippedvalue, text_indispute, text_indisputevalue,
                textheader, textheader2;

        ImageView img;

        public ContentViewHolder(View itemView) {
            super(itemView);


            img = itemView.findViewById(R.id.imageView);
            textheader = itemView.findViewById(R.id.text_header);
            textheader2 = itemView.findViewById(R.id.textheader2);
            text_unpaid = itemView.findViewById(R.id.txt_unpaid);
            text_unpaidvalue = itemView.findViewById(R.id.txt_unpaid_value);
            text_tobeshipped = itemView.findViewById(R.id.text_tobeshipped);
            text_tobeshippedvalue = itemView.findViewById(R.id.text_tobeship_value);
            text_shipped = itemView.findViewById(R.id.text_shipped);
            text_shippedvalue = itemView.findViewById(R.id.text_shipped_id);
            text_indispute = itemView.findViewById(R.id.text_dispute);
            text_indisputevalue = itemView.findViewById(R.id.textdisid);

        }
    }

}
