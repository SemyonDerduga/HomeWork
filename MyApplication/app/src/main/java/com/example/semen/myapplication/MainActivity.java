package com.example.semen.myapplication;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

        @Override
        public void onCreate(Bundle savedInstanceState){
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                //Создаем новый поток:
                Thread splash_time = new Thread()
                {
                        public void run()
                        {
                                try
                                {
                                        //Целое значение время отображения картинки:
                                        int SplashTimer = 0;
                                        //Запускаем цикл длиной в 2 секунды:
                                        while(SplashTimer < 2000) {
                                                sleep(100);
                                                SplashTimer = SplashTimer +100;
                                        };
                                }
                                catch (InterruptedException e) {
                                        e.printStackTrace(); }
                                finally {
                                        //Закрываем activity:
                                        finish();
                                        startActivity(new Intent(MainActivity.this, first.class));
                                }
                        }

                };
                splash_time.start();
        }
}