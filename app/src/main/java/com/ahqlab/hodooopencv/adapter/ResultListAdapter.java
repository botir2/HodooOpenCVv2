package com.ahqlab.hodooopencv.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ahqlab.hodooopencv.R;
import com.ahqlab.hodooopencv.activity.AnalysisActivity;
import com.ahqlab.hodooopencv.domain.ComburResult;
import com.ahqlab.hodooopencv.util.HodooUtil;

import java.util.ArrayList;
import java.util.List;

public class ResultListAdapter extends RecyclerView.Adapter<ResultListAdapter.ListViewHolder> {
    private final String TAG = com.ahqlab.hodooopencv.adapter.ResultListAdapter.class.getSimpleName();

    private Context mContext;
    private List<ComburResult> mResults = new ArrayList<>();
    private LayoutInflater mInflater;
    private ColorListCallback mColorListCallback;

    public ResultListAdapter(Context context, List<ComburResult> results,  ColorListCallback callback) {
        mContext = context;
        mResults = results;
        //mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mInflater = LayoutInflater.from( context );
        this.mColorListCallback = callback;
    }

    public interface ColorListCallback {
        void setOnItemClickListener( int position );
    }

    @NonNull
    @Override
    public ResultListAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View itemView = mInflater.inflate(R.layout.item_combur_result, viewGroup, false);
        return new ListViewHolder(itemView, mColorListCallback);
    }

    @Override
    public void onBindViewHolder(@NonNull ResultListAdapter.ListViewHolder holder, int position) {
        holder.comburTitle.setText(mResults.get(position).getComburTitle());
        holder.resultStr.setText(mResults.get(position).getResultMsg());
        LinearLayout colorImgWrap = new LinearLayout(mContext);
        colorImgWrap.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(HodooUtil.dpToPx(10), HodooUtil.dpToPx(10));
        params.setMargins(HodooUtil.dpToPx(5), 0, 0, 0);
        for ( int i = 0; i < mResults.get(position).getImgs().length; i++ ){
            ImageView colorImg = new ImageView(mContext);
            colorImg.setPadding(HodooUtil.dpToPx(1), HodooUtil.dpToPx(1), HodooUtil.dpToPx(1), HodooUtil.dpToPx(1));
            //colorImg.setLayoutParams(params);
            //colorImg.setImageResource(mResults.get(position).getImgs()[i]);
            if ( i == mResults.get(position).getResultPosition())
                colorImg.setImageResource(mResults.get(position).getImgs()[i]);
                System.out.println("value is__________ : " + mResults.get( position ).getResultPosition());
            colorImgWrap.addView(colorImg);
        }
        holder.comburColorWrap.addView(colorImgWrap);
        holder.setIsRecyclable(false); // stop adding Recyclerview returning same items in all positions? [duplicate]
        Log.e(TAG, "Scroll start");
    }


    @Override
    public int getItemCount() {
        if(mResults != null)
            return mResults.size();
        return 0;

    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView comburTitle;
        private TextView resultStr;
        private LinearLayout comburColorWrap;
        private LinearLayout Lists;
        private int items[];
        private ImageView[] imgviews;
        ResultListAdapter.ColorListCallback mColorListCallback;

        public ListViewHolder(@NonNull View itemView, ResultListAdapter.ColorListCallback callback) {
            super( itemView );
            comburTitle = itemView.findViewById(R.id.combur_title);
            resultStr = itemView.findViewById(R.id.result_str);
            comburColorWrap =itemView.findViewById( R.id.combur_color_wrap);
            Lists = itemView.findViewById( R.id.lists);
            mColorListCallback = callback;
            Lists.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mColorListCallback.setOnItemClickListener(getAdapterPosition());
                }
            });
        }

        @Override
        public void onClick(View view) {
            //mColorListCallback.setOnItemClickListener(getAdapterPosition());
        }




       /* @SuppressWarnings("unchecked")
        public <T extends View> T $(View itemView, int id) {
            return (T) itemView.findViewById(id);
        }*/


    }
}
