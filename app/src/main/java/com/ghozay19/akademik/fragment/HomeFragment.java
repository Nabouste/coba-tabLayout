package com.ghozay19.akademik.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ghozay19.akademik.BusActivity;
import com.ghozay19.akademik.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    CarouselView carouselView;
    CardView cv;
//    image Url1 = "https://scontent-sit4-1.xx.fbcdn.net/v/t1.0-9/23130954_2274587745900817_8452213617686584341_n.jpg?_nc_cat=0&oh=716ee2f90d3be323829a8cf21bf3d19a&oe=5BE61966";
//    String Url2 = "https://scontent-sit4-1.xx.fbcdn.net/v/t1.0-9/23130954_2274587745900817_8452213617686584341_n.jpg?_nc_cat=0&oh=716ee2f90d3be323829a8cf21bf3d19a&oe=5BE61966";
    int[] sampleImages = {R.drawable.ic_launcher_background};

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
//
//        carouselView = view.findViewById(R.id.carouselView);
//        carouselView.setPageCount(sampleImages.length);
//        carouselView.setImageListener(imageListener);
cv = view.findViewById(R.id.cvBus);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),BusActivity.class);
                startActivity(intent);

            }
        });


        return view;
    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);


        }
    };


}
