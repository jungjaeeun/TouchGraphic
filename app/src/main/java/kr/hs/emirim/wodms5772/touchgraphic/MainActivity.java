package kr.hs.emirim.wodms5772.touchgraphic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void drawShape(View v){

    }

    class DrawShape extends View{
        DrawShape(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            //canvas를 도화지라 생각하고 paint로 그림그리기
            super.onDraw(canvas);
            float cx=getWidth()/2.0f;
            float cy=getHeight()/2.0f;
            Paint paint=new Paint();
            paint.setStrokeWidth(7);
            paint.setColor(Color.YELLOW);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(cx, cy, 100, paint);
            paint.setColor(Color.MAGENTA);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(10, 10, 210, 160, paint);
        }
    }
}
