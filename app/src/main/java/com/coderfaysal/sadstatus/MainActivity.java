package com.coderfaysal.sadstatus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    HashMap <String, String> hashMap;
    ArrayList <HashMap <String, String>> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        hashMap = new HashMap<>();
        hashMap.put("title", "Emotional");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Sad Status");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Ovimani");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Failure");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Depressed");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Heartbreaking");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Poor Status");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Upset Status");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Unfortunate");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Rejected");
        arrayList.add(hashMap);


        MyAdapter myAdapter = new MyAdapter();
        gridView.setAdapter(myAdapter);



    }


    public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View myView;

            LayoutInflater layoutInflater = getLayoutInflater();
            myView = layoutInflater.inflate(R.layout.main_item, null);

            TextView sad_title = myView.findViewById(R.id.sad_title);
            CardView main_lay = myView.findViewById(R.id.main_lay);

            HashMap <String, String> hashMap = arrayList.get(i);

            String tvTitle = hashMap.get("title");

            sad_title.setText(tvTitle);

            main_lay.setOnClickListener(view1 -> {

                if (tvTitle.equals("Emotional")){
                    EMOTIONAL();
                    List_Item.CLASS_NAME = "Emotional";
                    startActivity(new Intent(MainActivity.this, List_Item.class));
                } else if (tvTitle.equals("Sad Status")){
                    SAD_STATUS();
                    List_Item.CLASS_NAME = "Sad Status";
                    startActivity(new Intent(MainActivity.this, List_Item.class));
                } else if (tvTitle.equals("Ovimani")){
                    OVIMANI();
                    List_Item.CLASS_NAME = "Ovimani";
                    startActivity(new Intent(MainActivity.this, List_Item.class));
                } else if (tvTitle.equals("Failure")){
                    FAILURE();
                    List_Item.CLASS_NAME = "Failure";
                    startActivity(new Intent(MainActivity.this, List_Item.class));
                } else if (tvTitle.equals("Depressed")){
                    DEPRESSED();
                    List_Item.CLASS_NAME = "Depressed";
                    startActivity(new Intent(MainActivity.this, List_Item.class));
                } else if (tvTitle.equals("Heartbreaking")){
                    HEART_BREAKING();
                    List_Item.CLASS_NAME = "Heartbreaking";
                    startActivity(new Intent(MainActivity.this, List_Item.class));
                } else if (tvTitle.equals("Poor Status")){
                    POOR();
                    List_Item.CLASS_NAME = "Poor Status";
                    startActivity(new Intent(MainActivity.this, List_Item.class));
                } else if (tvTitle.equals("Upset Status")){
                    UPSET();
                    List_Item.CLASS_NAME = "Upset Status";
                    startActivity(new Intent(MainActivity.this, List_Item.class));
                } else if (tvTitle.equals("Unfortunate")){
                    UNFORTUNATE();
                    List_Item.CLASS_NAME = "Unfortunate";
                    startActivity(new Intent(MainActivity.this, List_Item.class));
                } else if (tvTitle.equals("Rejected")){
                    REJECTED();
                    List_Item.CLASS_NAME = "Rejected";
                    startActivity(new Intent(MainActivity.this, List_Item.class));
                }




            });




            return myView;
        }
    }


    public void EMOTIONAL(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("item", "তারা বলে যে একটি ছবি 1000 শব্দ বলে, কিন্তু যখন আমি তোমাকে দেখি তখন আমি 3টি দেখি: আমি তোমাকে ভালোবাসি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আপনি আমার কাছে কতটা বোঝাতে চেয়েছিলেন তা বলার জন্য আমি শব্দের অভাব করি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "একজন আত্মার সঙ্গী হলেন এমন একজন যিনি আপনাকে অন্য কারো মতো বোঝেন না, চিরকাল আপনার জন্য থাকবেন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "তুমি যদি একশ হতে বাঁচো, আমি একদিন শত বিয়োগ হয়ে বাঁচতে চাই।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমরা একসাথে থাকতাম এবং আমাদের বই থাকতাম এবং রাতে একসাথে বিছানায় উষ্ণ থাকতাম।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আপনি এবং আমি, যেন আমাদেরকে স্বর্গে চুম্বন করতে শেখানো হয়েছে এবং একসাথে পৃথিবীতে পাঠানো হয়েছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমি এক মুহূর্তের সন্দেহ ছিল না. আমি তোমাকে ভালোবাসি. আমি আপনাকে পুরোপুরি বিশ্বাস করি। তুমি আমার প্রিয়তম।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "প্রেম তাদের সব আউট সবচেয়ে শক্তিশালী আবেগ; এটি আপনার জীবনকে আনন্দ এবং সুখের রঙে পূর্ণ করে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আপনি কখনোই সত্যিকারের সুখী হবেন না যদি আপনি ক্রমাগত সেই জিনিসগুলো ধরে রাখেন যা আপনাকে দুঃখ দেয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আপনি যখন খুশি হন, আপনি সঙ্গীত উপভোগ করেন। কিন্তু, আপনি যখন দুঃখিত, আপনি গানের কথা বুঝতে পারেন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "এবং আজ যদি আপনি যা করেছেন তা নিজেকে একসাথে ধরে রাখতে, আমি আপনার জন্য গর্বিত।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "কখনও কখনও, জীবন আপনাকে চারপাশে লাথি দেবে, কিন্তু শীঘ্রই বা পরে, আপনি বুঝতে পারবেন আপনি কেবল একজন বেঁচে থাকা নন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আপনি একজন যোদ্ধা, এবং আপনি জীবন আপনার পথ নিক্ষেপ করার চেয়ে শক্তিশালী।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "কিছু দিন শুধু খারাপ দিন, এই সব. সুখ জানতে হলে দুঃখ অনুভব করতে হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমি নিজেকে মনে করিয়ে দিচ্ছি যে প্রতিটি দিন একটি ভাল দিন হতে যাচ্ছে না, এটি ঠিক এমনই হয়!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আপনার যা আছে তার জন্য কৃতজ্ঞ হোন: আপনি আরও বেশি কিছু পাবেন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "যে কোন বোকা খুশি হতে পারে। আমাদের কাঁদায় এমন জিনিস থেকে সৌন্দর্য তৈরি করতে সত্যিকারের হৃদয়ের একজন মানুষকে লাগে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "এমন অনেক কিছু আছে যা আপনি আপনার জীবদ্দশায় নিয়ন্ত্রণ করতে পারবেন না; আপনি নিয়ন্ত্রণ করতে পারেন শুধুমাত্র জিনিস আপনার প্রতিক্রিয়া।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সুখ থেকে নিজেকে রক্ষা না করে আপনি নিজেকে দুঃখ থেকে রক্ষা করতে পারবেন না।");
        arrayList.add(hashMap);

        List_Item.listArrayList = arrayList;
    }


    public void SAD_STATUS(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("item", "মায়া বড়ই অদ্ভুত না দেয় ভুলতে না দেয় ভালো থাকতে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "প্রয়োজনে সম্পর্কটা ভেঙে দিও তবু বিশ্বাস টুকু আগলে রেখো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "চিন্তা নেই প্রিয়, আমি আর ফিরবো না তোমার ঐ অভিনয়ের শহরে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমার আমি কখন তোমাতে হারিয়ে গেছি বুঝতেই পারিনি। তোমাতে বিভোর হয়ে আমি নিজেকে কখন বিলীন করে দিয়েছি, সেটাও বুঝতে পারিনি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "খুব সাহস করে একটা স্বপ্ন দেখেছিলাম। কখনও ভাবিনি নিমিষেই স্বপ্নটা মাটিতে মিশে যাবে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "মা-বাবার আদরের মেয়েটা যে একটু একটু করে নিজেকে কখন শেষ করেছে, সেই খবর মা-বাবা রাখেনি। যত্নে বড় করা মেয়েটাকে আগলে ধরে রাখতে পারেনি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "তুমি যদি একটিবার বলতে আমায়, আমি সব মায়া ত্যাগ করে কবেই চলে যেতাম! যদি একটিবার বলতে ভালোবাসনা, আমি তো কবেই তোমায় মুক্ত করে দিতাম!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমি জীবনের প্রতিটি পদে উপলব্ধি করেছি, কেউ কারো জন্যে নয়।দেরিতে হলেও আমি বুঝতে পেরেছি, নিজেকে একলাই চলতে হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ছেলে বলেছিল- মা, আমি বাড়ি ফিরছি, নিয়ে নতুন শাড়ী।ছেলে আমার বাড়ি ফিরলো, চড়ে লাশের গাড়ি!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমি আর একাকীত্বে ভয় পাইনা। একাকীত্ব আমায় ভালোবাসে। আমি ভালোবাসি। তাইতো এতোগুলো বছরেও আমাদের মাঝে কেউ আসতে পারলোনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সময়েরও রং আছে। কখনো কালো, কখনো বা সাদা। দুটো রংকেই ভালোবাসতে হবে। সাদা-কালো দিয়েই জীবনের ছবি আঁকতে হবে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ভাবছি এবার বিদ্রোহটা নিজের সাথেই করবো। মন কেন যে তোমায় ভালোবাসে, এর উত্তর খুঁজে বের করবো। তোমায় ভালোবেসে নিঃস্ব আমি, ভাবছি বিদ্রোহটা নিজের সাথেই করবো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমার নিরবতা তোমার হৃদয় স্পর্শ করতে পারেনি। তাই আমি শব্দ দিয়েও তোমায় বুঝানোর চেষ্টা করিনি। শুধু নিরবে চলে এসেছি…");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমার ক্ষত বিক্ষত হৃদয় নিয়ে, তোমার সামনে দাঁড়াবার সাহস নেই। তোমার ভালোবাসা চাওয়ার অধিকারও নেই। শুধু দূর থেকে বলতে চাই, ভালো থেকো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "যে আমার মনের খবর রাখেনা, তার আমার জীবনের খবর রাখার প্রয়োজন নেই।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "বাবার হাত ছেড়ে যেদিন থেকে চলতে শিখেছি, সেদিন থেকেই বুঝেছি বাস্তবতা কল্পনার চেয়েও কঠিন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "মধ্যবিত্তের স্বপ্ন দেখা বারণ।কারো কাছো কোন আবদার করা বারণ।মধ্যবিত্তের কাঁদতে মানা।প্রয়োজনে হাত পাততে মানা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "চীলেকোঠার একটা ঘর চাই। যেই ঘরে কোন দু:খ নাই।তুমি আর আমি, আমাদের ছোট্ট সংসার! বেশ, আমার আর কিছু চাওয়ার নাই।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমি প্রেমে পড়েছি বার বার। মনও ভেঙেছি বার বার। রক্ত ঝড়া মন নিয়েই তোমার ভালোবেসি আবার। আর তুমি! মন ভেঙেছো প্রতিবার।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "যতোটা যত্ন করে মা-বাবা সন্তানকে বড় করে, ততোটা যত্ন করে যদি সন্তানের মনের খবর রাখতো! হতাশায় পড়ে হয়তো কাউকেই আত্মহত্যা কিংবা মাদকের পথ বেছে নিতে হতোনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "পরিবারের ইচ্ছে মতোই বিয়েটা হয়েছিলো আমার। স্বপ্নগুলোর সাথে সাথে আত্মাটাও মরে গেছে আমার।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "দুনিয়ার এই মায়াজালে আমি এমন ভাবে ডুবে গেছি, বাচার কোন পথই খুঁজে পাচ্ছিনা আর!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "রাতটা যেন আমার ক্ষতগুলোর মতোই গভীর। শুধু পার্থক্য এটাই রাতের কাছে চাঁদ আছে। কিন্তু আমার কাছে কিছুই নেই।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সবটুকু ভালোবাসা শুধু তোমার জন্যই তুলে রেখেছিলাম। জানতাম না তো, আমার ভালোবাসা তোমার কাছে মূল্যহীন।");
        arrayList.add(hashMap);

        List_Item.listArrayList = arrayList;
    }


    public void OVIMANI(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("item", "অভিমান হল ভালোবাসার একটি আবেগি বহিঃপ্রকাশ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "যতবার তোমাকে ভুলতে চাই বা ভুলে যাওয়ার চেষ্টা করি তত বেশি করে তুমি আমার হৃদয়ের কাছাকাছি চলে আসো ; অভিমান বোধহয় ভালবাসা বাড়িয়ে দিয়ে যায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ভালোবাসায় অভিমান আছে বলেই তো প্রেমের স্বাদ এত মিষ্টি মধুর।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "মন থেকে কাউকে নিজের থেকেও আপন ভাবলে তার অবহেলা সহ্য করার ক্ষমতা থাকে না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "অভিমান নামক রোগটি ভালোবাসা নামক ওষুধেই একমাত্র নিরাময় হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "রাগ অভিমানের পাশাপাশি ক্ষমা করতেও জানতে হবে; তাহলেই যেকোনো সম্পর্ক দীর্ঘস্থায়ী হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "অভিমান সৃষ্টি হয় মানুষের হৃদয়ের গভীর গোপন অন্তঃস্থলে যেখানে কেউ স্পর্শ করতে পারে না ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "রাগ,অভিমান ও অভিযোগ বুদ্ধিহীন ও দূর্বলেরা করে। যারা চালাক তারা পরিস্থিতি পরিবর্তন করার বুদ্ধি ও কৌশল প্রয়োগ করে থাকে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "অভিমান বড়ই আদুরে; সে রাগ আর ক্রোধের মতন অনুভূতিহীন নয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "যে ভালোবাসায় মান অভিমানের পালা থাকে না সে ভালোবাসা আর যা কিছু হোক না কেন ; ‘প্রেম’ নয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "প্রিয় মানুষটির উপর যতোই অভিমান করে থাক না কেনো, তার কথা দিনে একবার হলেও মনে পড়বেই, আর সেটাই বলে দেয় যে আজও তাকে ভুলতে পারা যায় নি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "অভিমান ভালোবাসা বাড়ায় ঠিক ই কিন্তু সেই অভিমান পুঞ্জীভূত হতে হতে কখন যে একটি সম্পর্কের বিচ্ছেদ ঘটায় তা কেউ জানে না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "অন্যের ওপর অভিমান করে নিজের মনকে কষ্ট দেওয়া হল সবথেকে বোকামি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "যে মানুষ অভিমানের মূল্য ও মর্যাদা দেয় না সে প্রকৃত প্রেমিক নয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "প্রিয়জনের অভিমানকে একটু অবহেলায় ছাড়লে সেটি নিজের অজান্তেই একটা প্রাচীর তৈরী করে ফেলে; যা ভাঙা খুবই কঠিন।");
        arrayList.add(hashMap);

        List_Item.listArrayList = arrayList;
    }


    public void FAILURE(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("item", "সফল মানুষের সাথে একজন অসফল মানুষের প্রধান পার্থক্য কেবলমাত্র শক্তি বা জ্ঞান নয়। পার্থক্যটি নিহিত আছে সত্যিকারের সফল হওয়ার ইচ্ছায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "একজন মানুষ এই মুহূর্তে কতটা উপরে আছে, তা দিয়ে সাফল্য মাপা উচিত নয়। একদম নিচে পড়ে যাওয়ার পর সে নিজেকে কতটা ওপরে তুলতে পারে – সেটাই আসল কথা।”");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ব্যর্থতার ছাই থেকে সাফল্যের প্রাসাদ নিমান করো। হতাশা আর ব্যর্থতা , এই দুটো জিনিস ই হলো সাফল্যের প্রাসাদের দুই মূল ভিত্তিপ্রস্তর।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সমালোচনা করার মতন তোমার যদি কেউ না থাকে, তাহলে জানবে তোমার সফল হওয়ার সম্ভাবনা নেই বললেই চলে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "অতীতের সাফল্য অনেকসময় ভবিষ্যতের ব্যর্থতার দিকে নিয়ে যায়। তবে যদি প্রতিটি ব্যর্থতা থেকে শিক্ষা নেওয়া যায়, তবে দিন শেষে সেই মানুষ টি একজন সফল মানুষ হিসেবে প্রতিপন্ন হবেই।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ব্যর্থতাকে ভয় করার পরিবর্তে , চেষ্টা না করে বসে থাকাকেই ভয় পাওয়া উচিত ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ব্যর্থতা প্রকৃতপক্ষে নতুন করে শুরু করার একটা সুবর্ণ সুযোগ, যা পরোক্ষভাবে মানুষকে বলে দেয় যে আগেরবারের থেকে এবারে তাকে কিঞ্চিৎ বেশি বুদ্ধি খাটাতে হবে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "প্রকৃতপক্ষে মানুষ কখনও ব্যর্থ হয় না, সে কেবল একটা পর্যায়ে এসে হার মেনে নেয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "যতক্ষণ না একজন মানুষ হার মানছে সে কখনই ব্যর্থ হতে পারেনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সাফল্যের অর্থই হল নিজের উৎসাহ না হারিয়ে একটার পর একটা ব্যর্থতাকে অতিক্রম করে যাওয়া।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "মানুষের জন্ম হয় সাফল্যের সুখ লাভ করার জন্য ব্যর্থতার জালে নিমজ্জিত হওয়ার জন্য নয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সাফল্যকে কখনই আপনার মাথায় চড়তে দেবেন না; ব্যর্থতা যেন কখনও আপনার মনে না বাসা বাঁধে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সর্বদা সাফল্যের পথ কে ধরেই ব্যর্থতাকে অতিক্রম করতে হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ব্যর্থতা নিচে পড়ে থাকে না , ব্যর্থতা সেটাই যা ওপরে উত্তীর্ণ হতে অস্বীকার করায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "একজন সফল ব্যক্তি ব্যর্থতার আশঙ্কা করেন না কারণ তিনি জানেন যে ব্যর্থতা থেকেই শিক্ষা নিয়ে প্রকৃত অর্থে বেড়ে ওঠা যায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সফল হওয়া যদি কোনো মানুষের দৃঢ় সংকল্প হয় তবে ব্যর্থতা কখনই তাকে ছাপিয়ে যেতে পারবে না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ব্যর্থতা থেকেও আফসোসের ভীতি অনেক বেশি ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সাফল্যের দ্বারা কোনো মানুষকে বিচার করবেন না, কতবার পড়ে গিয়ে সে আবার ফিরে এসেছে , উঠতে পেরেছে তা দিয়ে তাকে বিচার করা উচিত।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সাতবার ব্যর্থতা সিঁড়িতে পড়ে গিয়েও অষ্টমবার উঠতে পারাটাই হলো জীবনে সাফল্যের আসল রহস্য।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "বেশিরভাগ মহান ব্যক্তিরা তাদের বৃহত্তম ব্যর্থতার কেবলমাত্র এক ধাপ অতিক্রম করেই তাদের জীবনের বৃহত্তম সাফল্য অর্জন করেছেন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সাফল্য উদযাপন করা ভাল, তবে ব্যর্থতার পাঠগুলি তে মনোযোগ দেওয়া আরও গুরুত্বপূর্ণ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সাফল্যকে ব্যর্থতা থেকে আলাদা করার একটিমাত্র পথ হ’ল একটি শেষ প্রচেষ্টা। আরও একবার চেষ্টা করুন ; আপনি ভাগ্যবান হবেন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ব্যর্থতা একটি পথ; এটি কোন শেষ রাস্তা নয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "বাস্তব বিশ্বে স্মার্ট লোকেরা ব্যর্থ হয় এবং মধ্যবিত্ত সাধারণ মানুষেরা সফল হয়ে উঠে আসেন। মানুষকে ব্যর্থ বা সফল করে তোলে তার দক্ষতা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "রানীর মতো ভাবুন। একজন রানী ব্যর্থ হতে ভয় পান না। ব্যর্থতা মহানতার আরেকটি পদক্ষেপ ।");
        arrayList.add(hashMap);

        List_Item.listArrayList = arrayList;
    }


    public void DEPRESSED(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("item", "সম্ভবত ডিপ্রেশন নিজেকে অনেকগুলি উত্তরহীন প্রশ্ন জিজ্ঞাসা করার কারণে হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ডিপ্রেশন একটি ঘন অন্ধকার কুয়াশার মধ্যে বসবাস। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "মনে হচ্ছে আমি ভেতরে ভেতরে ধীরে ধীরে মরে যাচ্ছি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমার সবথেকে বড় সমস্যা হচ্ছে সবকিছুকে অতিরিক্ত চিন্তা করা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ডিপ্রেশন আপনার জীবনের আলো নিভিয়ে  দিবে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "মানুষ অনুভূতি নিয়ে খেলতে ভালোবাসে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমরা বাস্তবের চেয়ে কল্পনায় বেশি কষ্ট পাই।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমরা যাকে ভালবাসি তার অনুপস্থিতি মৃত্যুর চেয়েও খারাপ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ডিপ্রেশন এমন কোনো যুদ্ধ নয় যেটা আপনি জিতেছেন। এটা এমন একটি যুদ্ধ যা আপনি প্রতিদিন লড়ছেন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "প্রত্যেক মানুষেরই তার গোপন দুঃখ থাকে যা বিশ্ব জানে না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমরা অনেকেই হতাশার আবেগের সাথে খুব পরিচিত ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আপনি ডিপ্রেশন বুঝতে পারবেন না যতক্ষণ না আপনি একটি খালি ঘরে নিজের উপস্থিতি সহ্য করতে পারবেন না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমার এমন ক্ষত রয়েছে যা শরীরে কখনও দেখা যায় না। যা রক্তপাতের চেয়ে গভীর এবং বেশি ক্ষতিকারক।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ডিপ্রেশন এমন একটি শরীরে বাস করে যা বেঁচে থাকার জন্য লড়াই করে, এমন একটি মন যা মারা যাওয়ার চেষ্টা করে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ডিপ্রেশন একটি ভবিষ্যত গঠনে অক্ষমতা।");
        arrayList.add(hashMap);

        List_Item.listArrayList = arrayList;
    }


    public void HEART_BREAKING(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("item", "আপনি কখনই ব্যথা জানতে পারবেন না যতক্ষণ না আপনি আপনার প্রিয় ব্যক্তির চোখের দিকে তাকান এবং তারা দূরে তাকায়। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমি জানি না কেন তারা এটাকে হার্টব্রেক বলে। মনে হচ্ছে আমার শরীরের অন্যান্য অংশও ভেঙে গেছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "পৃথিবীর সবচেয়ে খারাপ অনুভূতি হল যখন আপনি অন্য কাউকে ভালোবাসতে পারবেন না কারণ আপনার হৃদয় এখনও তারই আছে যে এটি ভেঙেছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "কান্না হল এমন একটি উপায় যা আপনার চোখ কথা বলে যখন আপনার মুখ আপনার হৃদয় কতটা ভেঙেছে তা ব্যাখ্যা করতে পারে না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমি তোমার কথা ভাবি. কিন্তু আমি আর বলি না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমি তোমাকে আমার হৃদয় দিয়েছি, আমি এটিকে টুকরো টুকরো করে ফিরে পাব বলে আশা করিনি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "কখনও কখনও একটি ভাঙা হৃদয় অন্য কিছুর ভাঙা মেরামত করতে পারে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমার অংশের জন্য, আমি আমার হৃদয় ভেঙে যাওয়া পছন্দ করি। এটা খুব সুন্দর, ফাটল মধ্যে ভোর-ক্যালিডোস্কোপিক।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "এই মুহূর্ত পর্যন্ত, আমি বুঝতে পারিনি যে কেউ আপনার হৃদয় দুবার ভেঙে দিতে পারে, একই ফল্ট লাইন বরাবর।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আপনি আমার কাছে শুধু তারকা ছিলেন না। তুমি ছিলে আমার পুরো আকাশ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "তুমি আমার প্রাণ তোমার মুঠিতে এবং আমার হৃদয় তোমার দাঁতে রেখে চলে গেছ, এবং আমি তাদের কোনটিই ফেরত চাই না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "তুমি আমার হৃদয়ের ডানা মেলে উড়ে এসে আমাকে উড়াল দিয়েছ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "যে একই দেখতে পায় না তার চোখে চিরকালের স্বাদ পাওয়া কী বেদনাদায়ক জিনিস।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সবচেয়ে দুঃখের বিষয় হল একজনের কাছে এক মিনিট হওয়া যখন আপনি তাকে আপনার অনন্তকাল করে ফেলেছেন।");
        arrayList.add(hashMap);

        List_Item.listArrayList = arrayList;
    }

    public void POOR(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("item", "বিজয়ীরা ভিন্ন কিছু করে না, তারা কোনো কিছুকে ভিন্নভাবে করে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "তুমি জীবনে কতবার হেরেছ তাতে কিছু যায় আসে না, কারণ তোমার একটি জেতা হল সমস্ত হারের যোগ্য জবাব।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "শেষ নিঃশ্বাস পর্যন্ত চেষ্টা করা উচিত। হয় লক্ষ্য অর্জিত হবে বা অভিজ্ঞতা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "নিজেকে এতটা দুর্বল হতে দিও না যে তোমার কারো অনুগ্রহের প্রয়োজন হয়। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ওরা তোমাকে নিয়ে ঠাট্টা করুক , তোমাকে নিয়ে হাসুক , তোমাকে আঘাত করুক , অবজ্ঞা করুক তাতে কিছুই হবে না । কিন্তু তারা যেন তোমাকে থামাতে না পারে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "যে ব্যাপারে তুমি সত্যিই বিশ্বাস করো , সে ব্যাপারে কখনো হাল ছেড়ো না , পথ তুমি খুঁজে পাবেই ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সহজে জেতার আনন্দ কোথায় ? বাধা যত বিশাল , বিজয়ের আনন্দও ততই বাঁধভাঙ্গা ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "কখনো হাল ছেড়ে দিও না । এখনকার এই দাঁতে দাঁত চেপে করা কষ্টগুলো তোমাকে বিজয়ীর খেতাব দেবে সারাজীবনের জন্য ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "তোমার জীবনে তুমি যা নিয়েই কাজ করো , তাকে সবচেয়ে ভালো ভাবে করার চেষ্টা করো । এমন ভাবে করো , যেন তোমার আগে পরে কেউ এতটা ভালো করে করতে না পারে ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমি ব্যর্থতাকে মেনে নিতে পারি , কিন্তু আমি চেষ্টা না করাকে মেনে নিতে পারি না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "কখনো ভেঙে পড়ো না । পৃথিবীতে যা কিছু হারিয়ে যায় , অন্য কোন রূপে সেটি ঠিকই আবার ফিরে আসে জীবনে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "তোমার স্বপ্ন আর তোমার মাঝে দাঁড়িয়ে আছে কেবল একটি জিনিস , সেটি হচ্ছে অজুহাত ! যে মুহূর্ত থেকে তুমি নিজেকে অজুহাত দেখানো বন্ধ করে কাজ শুরু করবে , সে মুহূর্ত থেকে তোমার স্বপ্ন আর স্বপ্ন থাকবে না —- সেটি বাস্তবে রূপ নিতে শুরু করবে ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সাফল্যের মূল মন্ত্র হল যা আমরা ভয় পাই তার উপর নয় বরং আমরা যা চাই তার উপর আমাদের চেতন মনকে কেন্দ্রীভূত করা ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আকাশের দিকে তাকাও । আমরা একা নই । পুরো মহাবিশ্ব আমাদের প্রতি বন্ধুত্বসুলভ । যারা স্বপ্ন দেখে এবং কাজ করে শুধুমাত্র তাদেরকেই শ্রেষ্ঠটা দেওয়ার জন্য চক্রান্তে লিপ্ত এই বিশ্ব ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ব্যর্থতাকে ভয় করার বদলে চেষ্টা না করে বসে থাকাকে ভয় করো ।");
        arrayList.add(hashMap);

        List_Item.listArrayList = arrayList;
    }

    public void UPSET(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("item", "মরার কথা মাথায় আসলেও, সাহসে হয় না। তবে বাঁচার চেয়ে মরাটা বোধহয় সোজা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আওয়াজ তুলতে চেয়েও আমি পারিনা। মনের কথাগুলোও মুখে বোঝাতে পারিনা। অনুভূতিহীন হয়ে বোবা হয়েই রই।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "যে বার বার হোচট খেয়েও উঠে দাড়াতে জানে, চলার ভয়টা সে কখনোই পায়না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "শুধু একবার তাকে দেখার বড্ড ইচ্ছে জেগেছিল আমার। শুধু একবার প্রশ্ন করার ইচ্ছে জেগেছিল,’কেন ঠকালে আমায়?");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ভালোবাসার মানুষ অনেক আছে, কিন্তু মনকে বুঝার মানুষ খুব পরিমানেই আছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "দিন শেষে সূর্যটাও বুঝিয়ে দেয় যে, সময় শেষ হলে সবাই হারিয়ে যাবে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ভালোবাসার মানুষ ছেড়ে চলে গেলে, তখন সুন্দর পৃথিবীকেও অসুন্দর মনে হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "টাকার জন্য হয়ত একদিন অনেক স্বপ্ন ভেঙ্গে যাবে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "স্বপ্ন দেখা খুবই সহজ, কিন্তু বাস্তবতাকে বুঝে উঠা খুবই কঠিন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ছোট একটি অভিমান হয়ত একদিন বড় কোনো দূরত্বের সৃষ্টি করে দিবে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "খারাপ তখনই লাগে, যখন পরিস্থিতির কারনে আপন মানুষদের কাছেও খারাপ হয়ে যায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ভালোবাসাটা এতটা কষ্টের, যে এটি প্রকাশ করাটা কষ্টের, আবার ভূলে যাওয়াটাও কষ্টের।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "পৃথিবী এতই বিস্ময়কর যে, দিন শেষে সূর্যটাও হারিয়ে যায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমি এখন এতটাই বেকার যে, আপন মানুষ গুলো প্রতিনিয়তই দূরে সরে যাচ্ছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "দিনশেষে যে পরিবারটাই সেরা, টাকা জন্য আজকে সে পরিবারটার কাছে যেতে পারছিনা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "নতুন সময় এবং সুযোগ অনেক আসবেই, কিন্তু হারানো সময় আর সুযোগ আর ফিরে আসবে না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সমাপ্ত এই জীবনে হয়ত একদিন অনেক কিছুই অসমাপ্ত থেকে যাবে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "হয়ত একদিন স্বপ্নগুলো পূরন হবে কিন্তু আমি নিজ চোখে দেখতে পারবো না।");
        arrayList.add(hashMap);

        List_Item.listArrayList = arrayList;
    }

    public void UNFORTUNATE(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("item", "যখন মুখের ভাষা শেষ হয়ে যায় তখন নীরবতা কথা বলা শুরু করে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "পাশে থাকার মতো অনেকে থাকলেও যাকে পাশে চাই সে তো আর নেই।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সবার বেস্ট ফ্রেন্ড ছেড়ে চলে গেলেও আমার বেস্ট ফ্রেন্ড কখনো আমাকে ছেড়ে চলে যায়নি, কারণ আমার বেস্ট ফ্রেন্ড হলো দুঃখ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "জীবন থেকে পাওয়া অন্যতম একটি শিক্ষা হলো চাইলেই সবার প্রিয় হওয়া যায় না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "শেষটা হয়তো এমন হতো না যদি তুমিও আমার মত প্রেমে না পড়ে মায়ায় পড়তে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "কিছু মানুষ জীবনে আসে শুধু বিশ্বাস ভাঙার জন্য।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "নিষ্ঠুর শহরে আমি তার অসহায় শিকার।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "নিজের জীবনের গল্প অবশ্যই নায়ক হওয়া উচিত কেননা কেউ একজন আপনার নাম টি তার গল্পের ভিলেন চরিত্রে লিখে রেখেছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "স্বার্থের দুনিয়ায় এক নিঃস্বার্থ নাম হলো মা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "মানুষ পূর্ণতার আশা জাগিয়ে শূন্যতা উপহার দিয়ে চলে যায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "ভুলেও কারো দীর্ঘশ্বাসের কারণ হইয়ো না কেননা সে তোমাকে ছেড়ে দিলেও প্রকৃতি ছাড় দিবেনা কারণ Revenge of the nature বলতে একটা কথা আছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "এই শহরের মানুষ মন বোঝার চেয়ে ভুল বুঝে বেশি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "তার সাথে কথা বলতে ইচ্ছে করলেও এখন তাকে ডাকা বারণ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "নিস্তব্ধ শহরে নিজের অস্তিত্ব হারিয়ে ফেলেছি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "মন খারাপ তো আর সবার জন্য হয় না, কিন্তু যার জন্য হয় সেও তো বোঝে না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "বদলে যাইনি প্রিয় শুধু বাস্তবতা বুঝতে শিখেছি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "এই শহরে কেউ ভালো নেই চারিদিকে শুধু হারানোর চিৎকার।");
        arrayList.add(hashMap);

        List_Item.listArrayList = arrayList;
    }

    public void REJECTED(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("item", "যার জন্য সারা পৃথিবী ভুলে গিয়েছিলাম, আজ সে অন্য কারো জন্য আমাকে ভুলে গেছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "শান্তি বিক্রি করে শুধু কষ্ট পেয়েছি, অপরিচিতকে আপন করে প্রিয়জনকে হারিয়েছি .!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সময় বদলেছে, বদলে গেছো তুমি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "হাসির কারণ বদলেছে, কিন্তু কান্নার কারণ এখনও শুধু তুমি");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমি তোমাকে ছাড়া জীবনের কাছে কিছু চাইনি,আর জীবন আমাকে সবকিছু দিয়েছে তুমি ছাড়া।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "কেউ এক ফোঁটা ভালোবাসার জন্য আকুল ছিল আর কারো মন সাগর দিয়েও ভরেনি ..!!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সে যদি আমাকে ভুলে সুখী হয় তবে অভিযোগ কি,আর আমি তাকে সুখী না দেখলে ভালোবাসা কিসের।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "কেন তোমাকে এত ভালোবেসে ফেললাম, এই আফসোস সারাজীবন থেকে যাবে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আজ ছায়াকে জিজ্ঞেস করলাম, তুমি আমার সাথে হাঁটছ কেন, সেও হেসে বলল, তোমার সাথে আর কে আছে?");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "কষ্ট এই নয় যে সে আমাকে ছেরে চলে গেছে, কষ্ট হল চলে যাওয়ার পরেও সে আমার মধ্যে রয়ে গেছে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "আমি তোমাকে ভুলে যাব, একটু ধৈর্য্য ধর,তোমার মত স্বার্থপর হতে একটু সময় লাগবে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "কোনো সম্পর্কই অসম্পূর্ণ থাকে না, শুধু তা পূরণ করার ইচ্ছা দুই দিকেই থাকা উচিত।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "সম্পর্ক ধীরে ধীরে শেষ হয়, হঠাৎ করেই জানা যায়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "কারো জন্য সে আমাকে ভুলে গেলেও কিছু যায় আসে না, আমিও তার জন্য সারা পৃথিবী ভুলে গিয়েছিলাম।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("item", "কাউকে ভালোবেসে তাকে হারিয়ে চুপ হয়ে যাওয়ার কষ্ট কি জানেন ?");
        arrayList.add(hashMap);

        List_Item.listArrayList = arrayList;
    }






}