package com.stephy.flickrbrowser;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Stephy on 1/17/2016.
 */
public class FlickrImageViewHolder extends RecyclerView.ViewHolder {

        protected ImageView thumbnail;
        protected TextView title;

        public FlickrImageViewHolder(View view) {
                super(view);
                this.thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
                this.title = (TextView) view.findViewById(R.id.title);
        }
}
