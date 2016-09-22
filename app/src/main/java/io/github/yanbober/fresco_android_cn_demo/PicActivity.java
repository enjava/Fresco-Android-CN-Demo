package io.github.yanbober.fresco_android_cn_demo;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by en on 2016/9/22.
 */
public class PicActivity extends Activity {

    private SimpleDraweeView mSimpleDraweeView;
    //private Creater mCreater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // Fresco.initialize(PicActivity.this);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏

        setContentView(R.layout.activity_pic);



        mSimpleDraweeView = (SimpleDraweeView) findViewById(R.id.iddrawee);
       // mCreater = new Creater();
        //初始化HTTP的图片数据源
        //mCreater.init(Creater.Type.NET);
        //显示一张HTTP的GIF图片
        DraweeController draweeController1 = Fresco.newDraweeControllerBuilder()
                .setUri(Uri.parse("http://www.zhn.party/c.gif"))
                .setAutoPlayAnimations(true)
                .build();
        mSimpleDraweeView.setController(draweeController1);

    }
}
