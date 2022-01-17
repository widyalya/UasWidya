package simple.example.hewanpedia;

import static simple.example.hewanpedia.R.id.btn_buka_ras_Ular;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKucing,btnAnjing,btnUlar;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnKucing = findViewById(R.id.btn_buka_ras_kucing);
        btnUlar = findViewById(btn_buka_ras_Ular);
        btnAnjing = findViewById(R.id.btn_buka_ras_anjing);
        btnKucing.setOnClickListener(view -> bukaGaleri("Kucing"));
        btnUlar.setOnClickListener(view -> bukaGaleri("Ular"));
        btnAnjing.setOnClickListener(view -> bukaGaleri("Anjing"));
    }



    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}