package gr.uoa.elearning.android.broadcastreceiverexample;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by tserpes on 30/03/17.
 */

public class AirplaneModeBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        AlarmManager manager = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
        Intent i = new Intent(context,PeriodicBroadcastReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context,200,i,PendingIntent.FLAG_CANCEL_CURRENT);
        manager.setRepeating(AlarmManager.RTC,System.currentTimeMillis()+1000,10000,pendingIntent);
        Toast.makeText(context, "Alarm set to 10sec!", Toast.LENGTH_SHORT).show();
    }
}
