package local.hal.an91.android.saigoku33list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.Map;

public class TempleDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple_detail);

        //インテントオブジェクトを取得。
        Intent intent = getIntent();

        //リスト画面から渡されたデータを取得。
        String templeName = intent.getStringExtra("templeName");
        String templeNumber = intent.getStringExtra("templeNumber");

        //寺院名と札番号を表示させるTextViewを取得。を取得。
        TextView tvTempleName = findViewById(R.id.tvTempleName);
        TextView tvTempleNumber = findViewById(R.id.tvTempleNumber);

        //TextViewに寺院名と札番号を表示。
        tvTempleName.setText(templeName);
        tvTempleNumber.setText(templeNumber);
    }
    /**
     * 戻るボタンをタップしたときの処理。
     */
    public void onBackButtonClick(View view){
        finish();
    }
}