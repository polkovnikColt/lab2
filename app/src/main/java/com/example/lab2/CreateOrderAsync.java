package com.example.lab2;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.Random;

public class CreateOrderAsync extends AsyncTask<Void, Void,String> {

    private WeakReference<TextView> uiText;

    public CreateOrderAsync(TextView view) {
        uiText = new WeakReference<>(view);
    }

    @Override
    protected String doInBackground(Void... voids) {
        Random rand = new Random();
        int res = rand.nextInt(20);
        int ms = res * 200;

        try {
            Thread.sleep(ms);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Order created after waiting " + ms + " ms";
    }

    protected void onPostExecute(String mes) {
        uiText.get().setText(mes);
    }
}
