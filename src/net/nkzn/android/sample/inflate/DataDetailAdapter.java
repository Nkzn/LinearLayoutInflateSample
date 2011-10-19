package net.nkzn.android.sample.inflate;

import java.util.List;

import net.nkzn.android.sample.inflate.entity.DataDetail;
import net.nkzn.android.sample.inflate.entity.DataDetailContent;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DataDetailAdapter extends ArrayAdapter<DataDetail> {

	LayoutInflater mInflater;
	Context context;
	
	public DataDetailAdapter(Context context, int textViewResourceId,
			List<DataDetail> list) {
		super(context, textViewResourceId, list);

		mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		this.context = context;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		DataDetail item = (DataDetail)getItem(position);
		
		View view = mInflater.inflate(R.layout.data_detail, null);
		
		TextView tvDetailName = (TextView)view.findViewById(R.id.tv_detailname);
		tvDetailName.setText(item.getDetailName());
		
		TextView tvDetailValue = (TextView)view.findViewById(R.id.tv_detailvalue);
		tvDetailValue.setText(item.getDetailValue());
		
		List<DataDetailContent> detailContents = item.getDetailContents();
		DataDetailContentAdapter adapter = new DataDetailContentAdapter(context, 0, detailContents);
		
		ListView lvDataDetailContents = (ListView)view.findViewById(R.id.lv_data_detail_contents);
		lvDataDetailContents.setAdapter(adapter);
		
		return view;
	}
	
}
