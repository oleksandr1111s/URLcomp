package com.example.urlcomp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageButton btnComp1, btnComp2, btnComp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnComp1 = findViewById(R.id.btnComp1);
        btnComp1.setOnClickListener(v ->openURL("https://hard.rozetka.com.ua/ua/samsung-ls57cg952nixua/p558200787/"));

        btnComp2 = findViewById(R.id.btnComp2);
        btnComp2.setOnClickListener(v ->openURL("https://hard.rozetka.com.ua/ua/600232483/p600232483/"));

        btnComp3 = findViewById(R.id.btnComp3);
        btnComp3.setOnClickListener(v ->openURL("https://samsungshop.com.ua/tv-audio/monitors/monitor-samsung-ls24r350fzixci.html"));
    }
    private void openURL(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}