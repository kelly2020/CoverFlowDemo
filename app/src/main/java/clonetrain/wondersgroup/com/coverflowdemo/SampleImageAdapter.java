package clonetrain.wondersgroup.com.coverflowdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.missmess.coverflowview.ACoverFlowAdapter;
import com.squareup.picasso.Picasso;

/**
 * Created by zhangwentao on 16/10/31.
 * Description :
 * Version :
 */
public class SampleImageAdapter extends ACoverFlowAdapter<SampleImageAdapter.ViewHolder> {
    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int type) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cover_img, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder vh, int position) {
//        vh.imageView.setImageResource(R.mipmap.bg);
    }

    class ViewHolder extends ACoverFlowAdapter.ViewHolder {
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
//            imageView = (ImageView) itemView.findViewById(R.id.img);
        }
    }
}