package com.example.smartwaste;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// Adapter class that connects slide data (SlideItem) to the ViewPager2 / RecyclerView
public class SlideAdapter extends RecyclerView.Adapter<SlideAdapter.SlideViewHolder> {
    // List to hold all slide data (images, titles, descriptions)
    private List<SlideItem> slideItems;

    // Constructor that takes a list of SlideItem objects
    public SlideAdapter(List<SlideItem> slideItems) {
        this.slideItems = slideItems;
    }

    // Called when a new ViewHolder is created (only happens for visible slides)
    @NonNull
    @Override
    public SlideViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the slide layout (slide_item.xml) for each item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.slide_item, parent, false);
        return new SlideViewHolder(view);
    }

    // Called to bind data to each ViewHolder (connects data to the views)
    @Override
    public void onBindViewHolder(@NonNull SlideViewHolder holder, int position) {
        SlideItem item = slideItems.get(position);
        holder.imageView.setImageResource(item.getImageId());
        holder.title.setText(item.getTitle());
        holder.description.setText(item.getDescription());
    }

    // Returns the total number of slides in the list
    @Override
    public int getItemCount() {
        return slideItems.size();
    }

    // ViewHolder class that holds references to the views in each slide_item.xml
    public static class SlideViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title, description;

        // Link XML views to Java variables
        public SlideViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.slideImage);
            title = itemView.findViewById(R.id.slideTitle);
            description = itemView.findViewById(R.id.slideDesc);
        }
    }
}
