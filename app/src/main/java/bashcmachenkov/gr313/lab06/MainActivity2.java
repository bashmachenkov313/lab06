package bashcmachenkov.gr313.lab06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText txt_title,txt_content;
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt_content = findViewById(R.id.input_content);
        txt_title = findViewById(R.id.input_title);

        Intent i = getIntent();

        pos = i.getIntExtra("my note index",1);
        txt_title.setText(i.getStringExtra("my note title"));
        txt_content.setText(i.getStringExtra("my note content"));

    }

    public void on_cancel_click(View v)
    {
        finish();
    }

    public void on_save_click(View v)
    {
        Intent i = new Intent();

        i.putExtra("my note index",pos);
        i.putExtra("my note title",txt_title.getText().toString());
        i.putExtra("my note content",txt_content.getText().toString());

        setResult(RESULT_OK,i);
        finish();
    }
}