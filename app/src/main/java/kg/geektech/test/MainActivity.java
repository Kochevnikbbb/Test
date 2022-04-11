package kg.geektech.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import kg.geektech.test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private CustomMath customMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        customMath = new CustomMath();
        setContentView(binding.getRoot());

        binding.btnAdd.setOnClickListener(view -> {
            binding.tvResult.setVisibility(View.VISIBLE);
        });

        binding.btnSub.setOnClickListener(view -> {
            int a = Integer.parseInt(binding.etNum1.getText().toString());
            int b = Integer.parseInt(binding.etNum2.getText().toString());
            binding.tvResult.setText(customMath.sub(a,b));
        });

        binding.btnDiv.setOnClickListener(view -> {
            int a = Integer.parseInt(binding.etNum1.getText().toString());
            int b = Integer.parseInt(binding.etNum2.getText().toString());
            binding.tvResult.setText(customMath.div(a,b));
        });

        binding.btnMult.setOnClickListener(view -> {
            int a = Integer.parseInt(binding.etNum1.getText().toString());
            int b = Integer.parseInt(binding.etNum2.getText().toString());
            binding.tvResult.setText(customMath.multiply(a, b));
        });
    }
}