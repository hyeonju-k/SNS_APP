package com.example.community.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.community.R;
import com.example.community.view.PostInfo;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.GalleryViewHolder> {
    private ArrayList<PostInfo> mDataset;
    private Activity activity;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class GalleryViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public CardView cardView;
        public GalleryViewHolder(CardView v){
            super(v);
            cardView = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MainAdapter(Activity activity, ArrayList<PostInfo> myDataset)
    {this.activity = activity;
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public MainAdapter.GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        // create a new view
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false);

        final GalleryViewHolder galleryViewHolder = new GalleryViewHolder(cardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return galleryViewHolder;

    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull final GalleryViewHolder holder, int position){

        CardView cardView = holder.cardView;

        TextView textView = cardView.findViewById(R.id.textView);
        textView.setText(mDataset.get(position).getTitle());

        // - get element from your dataset at this position
        // - replace the contents of the view with that element



        /*
        // filePath : mDataset.get(position)
        Bitmap bmp = BitmapFactory.decodeFile(mDataset.get(position));
        imageView.setImageBitmap(bmp);
        */

        // RESIZING

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount(){
        return mDataset.size();
    }

}
