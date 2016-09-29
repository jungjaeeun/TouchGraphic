package kr.hs.emirim.wodms5772.touchgraphic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    static final int lINE=1, RECT=2, CIRCLE=3;
    int chooseShape=CIRCLE;
    DrawShape ds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ds=new DrawShape(getApplicationContext());
        LinearLayout linear=(LinearLayout)findViewById(R.id.linear_view);
        linear.addView(ds);
    }

    public void drawShape(View v){
        switch(v.getId()){
            case R.id.but_line:
                chooseShape=lINE;
                break;
            case R.id.but_rect:
                chooseShape=RECT;
                break;
            case R.id.but_circle:
                chooseShape=CIRCLE;
                break;
        }
        ds.invalidate();
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
            paint.setColor(Color.BLUE);
            paint.setStyle(Paint.Style.STROKE);
            switch (chooseShape) {
                case lINE:
                    canvas.drawLine(50, 100, 650, 100, paint);
                    break;
                case RECT:
                    paint.setColor(Color.MAGENTA);
                    paint.setStyle(Paint.Style.FILL);
                    canvas.drawRect(100, 100, 500, 250, paint);
                    break;
                case CIRCLE:
                    canvas.drawCircle(cx, cy, 200, paint);
                    break;
            }
        }
    }
}
