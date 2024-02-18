package com.coderfaysal.sadstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class List_Item extends AppCompatActivity {

    ListView listView;
    TextView it_toolbar;
    public static ArrayList<HashMap<String, String>> listArrayList = new ArrayList<>();
    HomeAdapter homeAdapter = new HomeAdapter(listArrayList);
    public static String CLASS_NAME = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        it_toolbar = findViewById(R.id.it_toolbar);
        it_toolbar.setText(CLASS_NAME);


        listView = findViewById(R.id.listView);



        listView.setAdapter(homeAdapter);


    }

    private class HomeAdapter extends BaseAdapter {

        ArrayList<HashMap<String, String>> listArrayList;

        public HomeAdapter (ArrayList<HashMap<String, String>> arrayList) {
            this.listArrayList = arrayList;
        }

        @Override
        public int getCount() {
            return listArrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater = getLayoutInflater();
            View mainView = layoutInflater.inflate(R.layout.items, null);

            TextView title = mainView.findViewById(R.id.title);
            ImageView copy = mainView.findViewById(R.id.copy);
            ImageView share = mainView.findViewById(R.id.share);

            HashMap<String, String> hashMap = listArrayList.get(position);

            String tvText = hashMap.get("item");

            title.setText(tvText);

            copy.setOnClickListener(view -> {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("TextView", tvText);
                assert clipboardManager!= null;
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(getApplicationContext(), "Text Copied", Toast.LENGTH_SHORT).show();
            });

            share.setOnClickListener(view -> {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, tvText);
                shareIntent.setType("text/plain");
                shareIntent = Intent.createChooser(shareIntent, "Share Via:");
                startActivity(shareIntent);
            });



            return mainView;
        }
    }

}