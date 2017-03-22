package com.practice.dev.tinkerpatch_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tinkerpatch.sdk.TinkerPatch;

/**
 * 此demo参考官方的demo而来，接入比tinker简单多了，比较友好的是支持锁屏后生效
 */
public class MainActivity extends AppCompatActivity {

    private Button request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        request = (Button) findViewById(R.id.request);
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //immediately 为 true, 每次强制访问服务器更新
                TinkerPatch.with().fetchPatchUpdate(true);
            }
        });
    }
}
