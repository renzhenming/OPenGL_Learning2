package com.example.cj.videoeditor.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.cj.videoeditor.R;
import com.example.cj.videoeditor.activity.test.CameraViewTest;

public class TestCameraPreviewActivity extends AppCompatActivity {

    private CameraViewTest cameraView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_camera_preview);
        cameraView = (CameraViewTest) findViewById(R.id.camera_view);
    }
}
