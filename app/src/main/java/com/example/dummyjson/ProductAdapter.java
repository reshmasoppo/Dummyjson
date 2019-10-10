package com.example.dummyjson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ContentViewHolder > {

    //this context we will use to inflate the layout
    private Context mCtx;
    //we are storing all the products in a list
    private List<Content> contentList;

   public ProductAdapter(Context mCtx,List<Content>contentList)
{
    this.mCtx = mCtx;
    this.contentList = contentList;
}

   public ContentViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.card_layout, null);
        return new ContentViewHolder (view);
    }


    public void onBindViewHolder(ContentViewHolder holder, int position) {

        //getting the product of the specified position
        Content content = contentList.get(position);

        //binding the data with the viewholder views

        holder.textView_name.setText(content.getWishlistName());
        holder.textView_city.setText(content.getWishlistDescription());

       // holder.img.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));


}

    @Override
    public int getItemCount() {
        if (contentList != null) {
            return contentList.size();
        } else {
            return 0;
        }
    }


    class ContentViewHolder extends RecyclerView.ViewHolder {

        TextView textView_name, textView_city;
        ImageView img;

        public ContentViewHolder(View itemView) {
            super(itemView);

            //img = itemView.findViewById(R.id.imageview);
            textView_city = itemView.findViewById(R.id.text_city);
            textView_name = itemView.findViewById(R.id.text_fullname);



        }
    }

}
