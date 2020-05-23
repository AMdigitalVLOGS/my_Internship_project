package com.amdigitalvlogs.internship08;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAccessorAdapter extends FragmentPagerAdapter {

    public TabsAccessorAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {

        switch (i) {

            case 0:
                PARTNERS_Fragment PARTNERS_Fragment = new PARTNERS_Fragment();
                return PARTNERS_Fragment;
            case 1:
                TRIPPLAN_Fragment TRIPPLAN_Fragment = new TRIPPLAN_Fragment();
                return TRIPPLAN_Fragment;
            case 2:
                STARTTRIPFragment contactsFragment = new STARTTRIPFragment();
                return contactsFragment;
            default:
                return null;


        }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {


            case 0:

                return "PARTNERS";
            case 1:

                return "TRIP PLAN";
            case 2:


                return "START TRIP";

            default:
                return null;
        }
    }
}
