package com.freecodeofficial.videodownloaderapp.fragments.base;

import androidx.fragment.app.Fragment;

import com.freecodeofficial.videodownloaderapp.MyApp;
import com.freecodeofficial.videodownloaderapp.activities.MainActivity;

public class BaseFragment extends Fragment {

    public MainActivity getBaseActivity() {
        return (MainActivity) getActivity();
    }

    public MyApp getMyApp() {
        return (MyApp) getActivity().getApplication();
    }
}
