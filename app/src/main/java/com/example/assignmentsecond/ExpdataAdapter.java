package com.example.assignmentsecond;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ExpdataAdapter extends RecyclerView.Adapter<ExpdataAdapter.VersionVH> {
    List<VerData> dataList;

    public ExpdataAdapter(List<VerData> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent,false);
        return new VersionVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {
            VerData verdata= dataList.get(position);
            holder.dataName.setText(verdata.getDataname());
            holder.ExpendData1.setText(verdata.getExpdataone());
            holder.ExpendData2.setText(verdata.getExpdatatwo());

            boolean isExpendable = dataList.get(position).isExpendable();
            holder.expendableLayout.setVisibility(isExpendable ? View.VISIBLE: View.GONE);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class VersionVH extends RecyclerView.ViewHolder {
        TextView dataName, ExpendData1,ExpendData2;
          LinearLayout Llayout;
          RelativeLayout expendableLayout;

        public VersionVH(@NonNull View itemView) {
            super(itemView);

            dataName = itemView.findViewById(R.id.codeName);
            ExpendData1 = itemView.findViewById(R.id.expData);
            ExpendData2 = itemView.findViewById(R.id.expData2);

            Llayout = itemView.findViewById(R.id.linear_layout);
            expendableLayout = itemView.findViewById(R.id.expendable_layout);

            Llayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    VerData verdata = dataList.get(getAdapterPosition());
                    verdata.setExpendable(!verdata.isExpendable());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
