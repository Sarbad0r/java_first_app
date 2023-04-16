package utils;

import android.content.Context;
import android.widget.Toast;

import com.example.app_learning_with_java.R;

public class Utils {
//2a0de7cbb57d00300cb62dc288068e45

    //https://api.openweathermap.org/data/2.5/weather?q=Dushanbe&lang=ru&appid=2a0de7cbb57d00300cb62dc288068e45

    private String checkThenReturnCloud() {
        return "";
    }


    public static void checkUserField(Context context, String text) {
        if (text.isEmpty()) {
            Toast.makeText(context, R.string.toast_empty_field, Toast.LENGTH_LONG).show();
            return;
        }
        System.out.println("ds");
    }
}
