package com.example.mycount

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.mycount.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    var count = 0;
    var initTime = 0L;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.countButton.setOnClickListener {
                if (count == 0) {
                    initTime = System.currentTimeMillis()
                }
                var timeDiff = System.currentTimeMillis() - initTime
                var isAvailable: Boolean = timeDiff < 5 * 1000
                if (isAvailable) {
                    count++
                    binding.countText.text = "${count}"
                }
            }

        binding.resetButton.setOnClickListener {
            count = 0
            binding.countText.text = "${count}"
        }
            /*binding.countButton.setOnClickListener {
                if(binding.countButton.text == "start"){
                    binding.countButton.text = "Count up"

                    binding.chronometer.base = SystemClock.elapsedRealtime()
                    binding.chronometer.start();
                }else if(binding.countButton.text == "Count up")
                count++
                binding.countText.text = "${count}"
                if(binding.chronometer.base.equals(30L)){
                    binding.chronometer.base = SystemClock.elapsedRealtime()
                    binding.chronometer.stop();
                    binding.countButton.isEnabled = false
                    binding.countButton.text = "start"
                }
           binding.resetButton.setOnClickListener {
    count = 0
    binding.countText.text = "${count}"
    binding.countButton.isEnabled = true
    binding.chronometer.base = SystemClock.elapsedRealtime()
    binding.chronometer.stop()
}*/
    }
}