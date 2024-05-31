package xyz.dg.appdg;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editTextA;
    private EditText editTextB;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTextA = findViewById(R.id.editTextNumberA);
        editTextB = findViewById(R.id.editTextNumberB);
        textViewResultado = findViewById(R.id.textViewResultado);
    }

    public void sumar(View view){
        double operacion = Double.parseDouble(editTextA.getText().toString()) + Double.parseDouble(editTextB.getText().toString());
        textViewResultado.setText(operacion + " ");
    }

    public void restar(View view){
        double operacion = Double.parseDouble(editTextA.getText().toString()) - Double.parseDouble(editTextB.getText().toString());
        textViewResultado.setText(operacion + " ");
    }

    public void Multiplicar(View view){
        double operacion = Double.parseDouble(editTextA.getText().toString()) * Double.parseDouble(editTextB.getText().toString());
        textViewResultado.setText(operacion + " ");
    }

    public void Dividir (View view){
        double operacion = Double.parseDouble(editTextA.getText().toString()) / Double.parseDouble(editTextB.getText().toString());
        textViewResultado.setText(operacion + " ");
    }

}
