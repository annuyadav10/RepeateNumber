package com.example.lenovo.repeatenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int[] array={0,1,2,3,4,5,6,7,7,8,9,10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.result);
        repeateArraynumber(array,array.length);
    }

    public void repeateArraynumber(int[] arr, int size)
    {
        int i, j;
        for (i = 0; i < size; i++)
        {
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] == arr[j])
                    textView.append(arr[i] + " ");
            }
        }
    }
}