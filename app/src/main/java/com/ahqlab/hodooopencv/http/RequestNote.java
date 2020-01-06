package com.ahqlab.hodooopencv.http;

import android.database.Cursor;
import android.os.AsyncTask;
import android.util.Log;

import com.ahqlab.hodooopencv.domain.HsvValue;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RequestNote {

    public interface HodooCallback {
        <T> void onResponse( Response<T> response );
        void onFailure( String error );
    }




    public <T> T request (final Call<T> requester, final HodooCallback callback) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                requester.enqueue(new Callback<T>() {
                    @Override
                    public void onResponse(Call<T> call, Response<T> response) {
                        callback.onResponse(response);
                    }

                    @Override
                    public void onFailure(Call<T> call, Throwable t) {
                        callback.onFailure(t.getMessage());
                    }
                });
                try {
                    requester.clone().execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }.execute();

        return null;
    }





}
