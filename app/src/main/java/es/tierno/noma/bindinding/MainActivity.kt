package es.tierno.noma.bindinding

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.tierno.noma.bindinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // ********************* - no se borra nunca el super -******************************
        super.onCreate(savedInstanceState)

        //Inicializamos el binding / layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtId.text= getString(R.string.hola_david)
        binding.buttonPush.setOnClickListener {
            Toast.makeText(this, getString(R.string.botton_pulsado),Toast.LENGTH_SHORT).show()
        }



    }
}