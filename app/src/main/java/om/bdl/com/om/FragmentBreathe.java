package om.bdl.com.om;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Timer;
import java.util.TimerTask;

public class FragmentBreathe extends Fragment {

    private Timer timer;
    private TimerTask timerTask;
    TextView inhale;
    int count = 0;

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
         inhale = (TextView) getView().findViewById(R.id.textView3);
         startTimer();
    }

    public void startTimer() {
        timer = new Timer();
        timerTask = new TimerTask() {
            @Override
            public void run() {
                //Download file here and refresh
                count++;
                if (count % 2 == 0) {
                    inhale.setText("now Inhale..");
                } else {
                    inhale.setText("and Exhale..");
                }

                timer.schedule(timerTask,0);
            }
        };
    }
}
