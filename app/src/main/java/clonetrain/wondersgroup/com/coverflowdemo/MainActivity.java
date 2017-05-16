package clonetrain.wondersgroup.com.coverflowdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.missmess.coverflowview.CoverFlowView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CoverFlowView coverFlowView = (CoverFlowView) findViewById(R.id.coverflow_view);


        SampleImageAdapter adapter = new SampleImageAdapter();
        coverFlowView.setAdapter(adapter);
    }
}
