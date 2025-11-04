package com.example.smartwaste;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class OnboardingSliderActivity extends AppCompatActivity {
    ViewPager2 viewPage;
    SlideAdapter slideAdapter;
    Button btnNext, btnSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_onboarding_slider);

        // views
        viewPage = findViewById(R.id.viewPager);
        btnNext = findViewById(R.id.btnNext);
        btnSkip = findViewById(R.id.btnSkip);

        // list of slides
        List<SlideItem> slides = new ArrayList<>();
        slides.add(new SlideItem(R.drawable.slide_image2, "Welcome", "SmartWaste helps you manage waste efficiently"));
        slides.add(new SlideItem(R.drawable.slide_image1, "Recycle", "Learn how to recycle and keep your environment clean"));
        slides.add(new SlideItem(R.drawable.slide_image3, "Join Us", "Be part of a green and smart community"));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}