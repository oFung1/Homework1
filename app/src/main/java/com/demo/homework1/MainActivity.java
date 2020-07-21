//Oscar
package com.demo.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.opencv.android.InstallCallbackInterface;
import org.opencv.android.LoaderCallbackInterface;
import org.opencv.android.OpenCVLoader;
import org.opencv.android.Utils;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button2);
        final int[] count = {1};
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!OpenCVLoader.initDebug()) {
                    Log.d("Oscar", "Error OpenCV");
                } else {
                    Log.d("Oscar", "OpenCV OK");
                }
                Point firstPoint = new Point(0,0);
                Point secondPoint = new Point(0, 468);
                Point thirdPoint = new Point(750,468);
                Point fourthPoint = new Point(750, 0);
                Scalar lineColor = new Scalar(255,0,0,255);
                int lineWidth = 3;
                Mat img = null;
                if (count[0] == 1){
                    try{
                        img = Utils.loadResource(MainActivity.this,R.drawable.abcd, CvType.CV_8UC4);
                        Imgproc.line(img, firstPoint, secondPoint, lineColor, lineWidth);
                        Bitmap bitmap = Bitmap.createBitmap(img.width(), img.height(), Bitmap.Config.ARGB_8888);
                        Utils.matToBitmap(img, bitmap);
                        ImageView imgView = findViewById(R.id.imageView);
                        imgView.setImageBitmap(bitmap);
                        count[0]++;
                        Log.d("Oscar",""+count[0]);
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
                else if (count[0] == 2){
                    try{
                        img = Utils.loadResource(MainActivity.this,R.drawable.abcd, CvType.CV_8UC4);
                        Imgproc.line(img, firstPoint, secondPoint, lineColor, lineWidth);
                        Imgproc.line(img, secondPoint, thirdPoint, lineColor, lineWidth);
                        Bitmap bitmap = Bitmap.createBitmap(img.width(), img.height(), Bitmap.Config.ARGB_8888);
                        Utils.matToBitmap(img, bitmap);
                        ImageView imgView = findViewById(R.id.imageView);
                        imgView.setImageBitmap(bitmap);
                        count[0]++;
                        Log.d("Oscar",""+count[0]);
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
                else if (count[0] == 3){
                    try{
                        img = Utils.loadResource(MainActivity.this,R.drawable.abcd, CvType.CV_8UC4);
                        Imgproc.line(img, firstPoint, secondPoint, lineColor, lineWidth);
                        Imgproc.line(img, secondPoint, thirdPoint, lineColor, lineWidth);
                        Imgproc.line(img, thirdPoint, fourthPoint, lineColor, lineWidth);
                        Bitmap bitmap = Bitmap.createBitmap(img.width(), img.height(), Bitmap.Config.ARGB_8888);
                        Utils.matToBitmap(img, bitmap);
                        ImageView imgView = findViewById(R.id.imageView);
                        imgView.setImageBitmap(bitmap);
                        count[0]++;
                        Log.d("Oscar",""+count[0]);
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
                else if (count[0] == 4){
                    try{
                        img = Utils.loadResource(MainActivity.this,R.drawable.abcd, CvType.CV_8UC4);
                        Imgproc.line(img, firstPoint, secondPoint, lineColor, lineWidth);
                        Imgproc.line(img, secondPoint, thirdPoint, lineColor, lineWidth);
                        Imgproc.line(img, thirdPoint, fourthPoint, lineColor, lineWidth);
                        Imgproc.line(img, fourthPoint, firstPoint, lineColor, lineWidth);
                        Bitmap bitmap = Bitmap.createBitmap(img.width(), img.height(), Bitmap.Config.ARGB_8888);
                        Utils.matToBitmap(img, bitmap);
                        ImageView imgView = findViewById(R.id.imageView);
                        imgView.setImageBitmap(bitmap);
                        count[0]++;
                        Log.d("Oscar",""+count[0]);
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
                Log.d("Oscar",""+count[0]);
            }
        });
    }
}

//0-1-3
//1-2-6
//2-3-9