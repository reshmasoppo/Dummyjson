package com.example.dummyjson;

import android.accounts.Account;
import android.content.Context;
import android.opengl.Visibility;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ContentViewHolder> {
    public static final String TAG = ProductAdapter.class.getSimpleName();
    //this context we will use to inflate the layout
    private Context mCtx;
    //we are storing all the products in a list
    private Response contentList;

    public ProductAdapter(Context mCtx, Response contentList) {
        this.mCtx = mCtx;
        this.contentList = contentList;
    }

    public ContentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_json,parent,false);
        return new ContentViewHolder(view);
    }

    public void onBindViewHolder(ContentViewHolder holder, int position) {

        List<MyorderItem> myorderItemCurrentList = contentList.getMyorder();
        List<ProfilesettingsItem> profilesettingsItemCurrentList = contentList.getProfilesettings();
        List<AccountsettingsItem> accountsettingsItemCurrentList = contentList.getAccountsettings();

        if (position == 0) {

            List<String> orders = new ArrayList<>();
            holder.textheader.setText(String.valueOf(myorderItemCurrentList.get(position).getHeaderTitle()));
            holder.textheader2.setText(String.valueOf(myorderItemCurrentList.get(position).getTextLeft()));

            for (int i = 1; i < myorderItemCurrentList.size(); i++) {
                String orderName = String.valueOf(myorderItemCurrentList.get(i).getOrderName());
                orders.add(orderName);
            }
            Log.d(TAG, "onBindViewHolder: " + orders.toString());
            holder.text_unpaid.setText(orders.get(0));
            holder.text_tobeshipped.setText(orders.get(1));
            holder.text_shipped.setText(orders.get(2));
            holder.text_indispute.setText(orders.get(3));

            List<String> ordervalueList = new ArrayList<>();

            for (int i = 1; i < myorderItemCurrentList.size(); i++) {
                String ordervalue = String.valueOf(myorderItemCurrentList.get(i).getOrderValue());
                ordervalueList.add(ordervalue);
            }
            Log.d(TAG, "onBindViewHolder: " + ordervalueList.toString());
            holder.text_unpaidvalue.setText(ordervalueList.get(0));
            holder.text_tobeshippedvalue.setText(ordervalueList.get(1));
            holder.text_shippedvalue.setText(ordervalueList.get(2));
            holder.text_indisputevalue.setText(ordervalueList.get(3));

        } else if (position == 1) {
            List<String> profileList = new ArrayList<>();

            holder.textheader.setText(String.valueOf(profilesettingsItemCurrentList.get(0).getHeaderTitle()));
            holder.textheader2.setText(String.valueOf(profilesettingsItemCurrentList.get(0).getTextLeft()));

            for (int i = 1; i < profilesettingsItemCurrentList.size(); i++) {
                String ProfileName = String.valueOf(profilesettingsItemCurrentList.get(i).getProfileData());
                profileList.add(ProfileName);
            }
            Log.d(TAG, "onBindViewHolder: " + profileList.toString());
            holder.text_unpaid.setText(profileList.get(0));
            holder.text_tobeshipped.setText(profileList.get(1));
            holder.text_shipped.setText(profileList.get(2));
            holder.text_indispute.setText(profileList.get(3));


            List<String> profilevalueList = new ArrayList<>();
          //  holder.textheader.setText(String.valueOf(profilesettingsItemCurrentList.get(position).getHeaderTitle()));
           // holder.textheader2.setText(String.valueOf(profilesettingsItemCurrentList.get(position).getTextLeft()));

            for (int i = 1; i < profilesettingsItemCurrentList.size(); i++) {
                String profilevalue = String.valueOf(profilesettingsItemCurrentList.get(i).getProfileDesc());
                profilevalueList.add(profilevalue);
            }
            Log.d(TAG, "onBindViewHolder: " + profilevalueList.toString());
            holder.text_unpaidvalue.setText(profilevalueList.get(0));
            holder.text_unpaidvalue.setBackgroundDrawable(null);
            holder.text_tobeshippedvalue.setText(profilevalueList.get(1));
            holder.text_tobeshippedvalue.setBackgroundDrawable(null);
            holder.text_shippedvalue.setText(profilevalueList.get(2));
            holder.text_shippedvalue.setBackgroundDrawable(null);
            holder.text_indisputevalue.setText(profilevalueList.get(3));
            holder.text_indisputevalue.setBackgroundDrawable(null);

        } else if (position == 2) {
            List<String> AccountList = new ArrayList<>();

            holder.textheader.setText(String.valueOf(accountsettingsItemCurrentList.get(0).getHeaderTitle()));
            holder.textheader2.setText(String.valueOf(accountsettingsItemCurrentList.get(0).getTextLeft()));

            for (int i = 1; i < accountsettingsItemCurrentList.size(); i++) {
                String AccountName = String.valueOf(accountsettingsItemCurrentList.get(i).getAccountDetails());
                AccountList.add(AccountName);
            }
            Log.d(TAG, "onBindViewHolder: " + AccountList.toString());
            holder.text_unpaid.setText(AccountList.get(0));
            holder.text_tobeshipped.setText(AccountList.get(1));
            holder.text_shipped.setText(AccountList.get(2));
            holder.text_indispute.setText(AccountList.get(3));
            holder.text_indisputevalue.setVisibility(View.GONE);
            holder.text_unpaidvalue.setBackgroundDrawable(null);
            holder.text_unpaidvalue.setVisibility(View.GONE);
            holder.text_tobeshippedvalue.setBackgroundDrawable(null);
            holder.text_tobeshippedvalue.setVisibility(View.GONE);
            holder.text_indisputevalue.setVisibility(View.GONE);
            holder.text_shippedvalue.setVisibility(View.GONE);
            holder.text_shippedvalue.setBackgroundDrawable(null);
        }

    }
    @Override
    public int getItemCount() {
        if (contentList != null) {
            return 3;

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
