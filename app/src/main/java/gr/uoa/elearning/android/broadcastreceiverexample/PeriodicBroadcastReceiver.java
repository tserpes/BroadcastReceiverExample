package gr.uoa.elearning.android.broadcastreceiverexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by tserpes on 30/03/17.
 */

public class PeriodicBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Periodic Broadcast Intent Received!",Toast.LENGTH_SHORT).show();
    }
}
