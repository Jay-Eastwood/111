package com.jnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //用id获得ViewText控件对象
        TextView item_tv;
        item_tv = findViewById(R.id.hello);
        item_tv.setText("minecraft！");
        //用资源id获得字符串
        item_tv.setText(this.getString(R.string.app_world));
        //用资源名称获取字符串
        Context context=this.getApplicationContext();
        String RESName="hello";
        context.getResources().getIdentifier(RESName, "id", context.getPackageName());
        int helloworld=context.getResources().getIdentifier(RESName,"string",context.getPackageName());
        item_tv.setText(this.getString(helloworld));

    }
}
