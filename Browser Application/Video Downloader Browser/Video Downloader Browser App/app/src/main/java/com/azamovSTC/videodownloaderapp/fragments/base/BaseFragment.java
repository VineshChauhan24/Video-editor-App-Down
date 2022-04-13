package com.azamovSTC.videodownloaderapp.fragments.base;

import androidx.fragment.app.Fragment;

import com.azamovSTC.videodownloaderapp.MyApp;
import com.azamovSTC.videodownloaderapp.activities.MainActivity;

public class BaseFragment extends Fragment {

    public MainActivity getBaseActivity() {
        return (MainActivity) getActivity();
    }

    public MyApp getMyApp() {
        return (MyApp) getActivity().getApplication();
    }
}
