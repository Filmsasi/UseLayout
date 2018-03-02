package org.marfaresys.uselayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_send;
    private Button btn_clr;
    private TextView txtV_res;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_send = findViewById(R.id.btn_send);
        Button btn_clr = findViewById(R.id.btn_clr);
        final TextView txtV_res = findViewById(R.id.txtV_res);
        editText = findViewById(R.id.edt_);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(editText.getText().toString())) {
                    txtV_res.setText(R.string.result_correct);
                }
                else {
                    txtV_res.setText(R.string.result_incorrect);
                }
            }
        });

        btn_clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtV_res.setText("");
                editText.setText("");
            }
        });
    }
}
