package com.example.calotiket;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView btnnavViewId;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnnavViewId = findViewById(R.id.bottomNavViewId);
        frameLayout = findViewById(R.id.frameLayoutId);

        btnnavViewId.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.accountId:
                        btnnavViewId.setItemBackgroundResource(R.color.design_default_color_primary);
                            setFragment(new AccountFragment());
                        return true;

                    case R.id.transportId:
                        btnnavViewId.setItemBackgroundResource(R.color.design_default_color_on_primary);
                            setFragment(new TransportFragment());
                        return true;

                    case R.id.homeId:
                        btnnavViewId.setItemBackgroundResource(R.color.design_default_color_secondary);
                            setFragment(new HomeFragment());
                        return true;

                        default:
                        return false;


                }

            }
        });

    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayoutId,fragment);
        fragmentTransaction.commit();

    }
}