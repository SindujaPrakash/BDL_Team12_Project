package om.bdl.com.om;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class FragmentBreathe extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //just change the fragment_dashboard
        //with the fragment you want to inflate
        //like if the class is HomeFragment it should have R.layout.home_fragment
        //if it is DashboardFragment it should have R.layout.fragment_dashboard
        return inflater.inflate(R.layout.fragment_breathe, null);
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ImageView imageView = (ImageView) getView().findViewById(R.id.imageView3);
        Glide.with(this)
                .load(R.drawable.breathegif)
                .into(imageView);
    }
}
