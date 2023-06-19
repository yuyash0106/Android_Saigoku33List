package local.hal.an91.android.saigoku33list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //画面部品ListViewを取得。
        ListView lvList = findViewById(R.id.lvList);

        //simpleAdapterで使用するListオブジェクトを用意。
        List<Map<String,String>> templeList = new ArrayList<>();

        //1
        Map<String,String> temple = new HashMap<>();
        temple.put("name","青岸渡寺");
        temple.put("number","第一番");
        templeList.add(temple);

        //2
       temple = new HashMap<>();
        temple.put("name","金剛宝寺");
        temple.put("number","第二番");
        templeList.add(temple);

        //3
        temple = new HashMap<>();
        temple.put("name","粉河寺");
        temple.put("number","第三番");
        templeList.add(temple);

        //4
        temple = new HashMap<>();
        temple.put("name","施福寺");
        temple.put("number","第四番");
        templeList.add(temple);

        //5
        temple = new HashMap<>();
        temple.put("name","葛井寺");
        temple.put("number","第五番");
        templeList.add(temple);

        //6
        temple = new HashMap<>();
        temple.put("name","南法華寺");
        temple.put("number","第六番");
        templeList.add(temple);

        //7
        temple = new HashMap<>();
        temple.put("name","岡寺");
        temple.put("number","第七番");
        templeList.add(temple);

        //8
        temple = new HashMap<>();
        temple.put("name","長谷寺");
        temple.put("number","第八番");
        templeList.add(temple);

        //9
        temple = new HashMap<>();
        temple.put("name","南円堂");
        temple.put("number","第九番");
        templeList.add(temple);

        //10
        temple = new HashMap<>();
        temple.put("name","三室戸寺");
        temple.put("number","第十番");
        templeList.add(temple);

        //11
        temple = new HashMap<>();
        temple.put("name","上醍醐 准胝堂");
        temple.put("number","第十一番");
        templeList.add(temple);

        //12
        temple = new HashMap<>();
        temple.put("name","正法寺");
        temple.put("number","第十二番");
        templeList.add(temple);

        //13
        temple = new HashMap<>();
        temple.put("name","石山寺");
        temple.put("number","第十三番");
        templeList.add(temple);

        //14
        temple = new HashMap<>();
        temple.put("name","三井寺");
        temple.put("number","第十四番");
        templeList.add(temple);

        //15
        temple = new HashMap<>();
        temple.put("name","今熊野観音寺");
        temple.put("number","第十五番");
        templeList.add(temple);

        //16
        temple = new HashMap<>();
        temple.put("name","清水寺");
        temple.put("number","第十六番");
        templeList.add(temple);

        //17
        temple = new HashMap<>();
        temple.put("name","六波羅蜜寺");
        temple.put("number","第十七番");
        templeList.add(temple);

        //18
        temple = new HashMap<>();
        temple.put("name","六角堂 頂法寺");
        temple.put("number","第十八番");
        templeList.add(temple);

        //19
        temple = new HashMap<>();
        temple.put("name","革堂 行願寺");
        temple.put("number","第十九番");
        templeList.add(temple);

        //20
        temple = new HashMap<>();
        temple.put("name","善峯寺");
        temple.put("number","第二十番");
        templeList.add(temple);

        //21
        temple = new HashMap<>();
        temple.put("name","穴太寺");
        temple.put("number","第二十一番");
        templeList.add(temple);

        //22
        temple = new HashMap<>();
        temple.put("name","総持寺");
        temple.put("number","第二十二番");
        templeList.add(temple);

        //23
        temple = new HashMap<>();
        temple.put("name","勝尾寺");
        temple.put("number","第二十三番");
        templeList.add(temple);

        //24
        temple = new HashMap<>();
        temple.put("name","中山寺");
        temple.put("number","第二十四番");
        templeList.add(temple);

        //25
        temple = new HashMap<>();
        temple.put("name","播州清水寺");
        temple.put("number","第二十五番");
        templeList.add(temple);

        //26
        temple = new HashMap<>();
        temple.put("name","一乗寺");
        temple.put("number","第二十六番");
        templeList.add(temple);

        //27
        temple = new HashMap<>();
        temple.put("name","圓教寺");
        temple.put("number","第二十七番");
        templeList.add(temple);

        //28
        temple = new HashMap<>();
        temple.put("name","成相寺");
        temple.put("number","第二十八番");
        templeList.add(temple);

        //29
        temple = new HashMap<>();
        temple.put("name","松尾寺");
        temple.put("number","第二十九番");
        templeList.add(temple);

        //30
        temple = new HashMap<>();
        temple.put("name","宝厳寺");
        temple.put("number","第三十番");
        templeList.add(temple);

        //31
        temple = new HashMap<>();
        temple.put("name","長命寺");
        temple.put("number","第三十一番");
        templeList.add(temple);

        //32
        temple = new HashMap<>();
        temple.put("name","観音正寺");
        temple.put("number","第三十二番");
        templeList.add(temple);

        //33
        temple = new HashMap<>();
        temple.put("name","華厳寺");
        temple.put("number","第三十三番");
        templeList.add(temple);


        //SimpleAdapter第四引数from用データの用意。
        String[] from = {"number","name"};

        //SimpleAdapter第５引数to用データの用意。
        int[] to = {android.R.id.text1,android.R.id.text2};

        //SimpleAdapterを生成。
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,templeList,android.R.layout.simple_list_item_2,from,to);

        //アダプタの登録。
        lvList.setAdapter(adapter);

     //リストタップのリスナクラス登録。
     lvList.setOnItemClickListener(new ListItemClickListener());
    }
 /**
  * リストがタップされたときの処理が記述されたメンバクラス。
  */
 private class ListItemClickListener implements AdapterView.OnItemClickListener{

  @Override
  public void onItemClick(AdapterView<?> parent, View view,int position,long id){
   //タップされた行のデータを取得。
   Map<String,String> item = (Map<String, String>) parent.getItemAtPosition(position);

   //寺院名と札番号を取得。
   String templeName = item.get("name");
   String templeNumber = item.get("number");

   //インテントオブジェクトを生成。。
   Intent intent = new Intent(MainActivity.this,TempleDetailActivity.class);

   //第2画面に送るデータを格納。
   intent.putExtra("templeName",templeName);
   intent.putExtra("templeNumber",templeNumber);

   //第2画面の起動。
   startActivity(intent);
  }
 }

}