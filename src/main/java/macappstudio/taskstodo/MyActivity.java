package macappstudio.taskstodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void toNoteActivity(View view) {
        Intent intent = new Intent(this, NoteActivity.class);
        startActivity(intent);

    }
}
