package com.example.panguangyi.drawabledemo0601;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ivLevelList,ivClip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivLevelList = (ImageView) findViewById(R.id.iv_levellist);
        findViewById(R.id.btn_change_level).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivLevelList.setImageLevel(1);
            }
        });
        //自上而下裁剪一半图片
        ivClip = (ImageView) findViewById(R.id.iv_clip);
        ClipDrawable clipDrawable = (ClipDrawable) ivClip.getDrawable();
        clipDrawable.setLevel(5000);
    }
}
