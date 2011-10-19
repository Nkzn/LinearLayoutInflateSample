package net.nkzn.android.sample.inflate;

import java.util.List;

import net.nkzn.android.sample.inflate.entity.DataDetailContent;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class DataDetailContentAdapter extends ArrayAdapter<DataDetailContent> {

	LayoutInflater mInflater;
	Context context;
	
	public DataDetailContentAdapter(Context context, int textViewResourceId,
			List<DataDetailContent> list) {
		super(context, textViewResourceId, list);

		mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		this.context = context;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		DataDetailContent item = (DataDetailContent)getItem(position);
		
		View view = mInflater.inflate(R.layout.data_detail_content, null);
		
		TextView tvDetailName = (TextView)view.findViewById(R.id.tv_contentname);
		tvDetailName.setText(item.getContentName());
		
		TextView tvDetailValue = (TextView)view.findViewById(R.id.tv_contentvalue);
		tvDetailValue.setText(item.getContentValue());
		
		return view;
	}
	
}
