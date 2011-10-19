package net.nkzn.android.sample.inflate;

import java.util.ArrayList;
import java.util.List;

import net.nkzn.android.sample.inflate.entity.DataDetail;
import net.nkzn.android.sample.inflate.entity.DataDetailContent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data);
        
        List<DataDetail> dataDetails = getDataDetails();
        DataDetailAdapter adapter = new DataDetailAdapter(this, 0, dataDetails);
        
        ListView lvDataDetails = (ListView)findViewById(R.id.lv_data_details);
        lvDataDetails.setAdapter(adapter);
    }

    /**
     * テストデータ生成
     * @return
     */
	private List<DataDetail> getDataDetails() {

		List<DataDetail> details = new ArrayList<DataDetail>();
		
		DataDetailContent ddc1 = new DataDetailContent("こんてんとねーむ１", "こんてんとばりゅー１");
		DataDetailContent ddc2 = new DataDetailContent("こんてんとねーむ２", "こんてんとばりゅー２");
		DataDetailContent ddc3 = new DataDetailContent("こんてんとねーむ３", "こんてんとばりゅー３");
		DataDetailContent ddc4 = new DataDetailContent("こんてんとねーむ４", "こんてんとばりゅー４");
		
		DataDetail dd1 = new DataDetail("でぃてーるねーむ１", "でぃてーるばりゅー１");
		dd1.addDetailContents(ddc1);
		dd1.addDetailContents(ddc2);
		
		DataDetail dd2 = new DataDetail("でぃてーるねーむ２", "でぃてーるばりゅー２");
		dd2.addDetailContents(ddc2);
		dd2.addDetailContents(ddc3);
		
		DataDetail dd3 = new DataDetail("でぃてーるねーむ３", "でぃてーるばりゅー３");
		dd3.addDetailContents(ddc3);
		dd3.addDetailContents(ddc4);
		
		DataDetail dd4 = new DataDetail("でぃてーるねーむ４", "でぃてーるばりゅー４");
		dd4.addDetailContents(ddc1);
		dd4.addDetailContents(ddc2);
		dd4.addDetailContents(ddc3);
		dd4.addDetailContents(ddc4);
		
		details.add(dd1);
		details.add(dd2);
		details.add(dd3);
		details.add(dd4);
		
		return details;
	}
}