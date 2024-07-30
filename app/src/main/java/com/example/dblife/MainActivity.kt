package com.example.dblife

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.app.ActivityCompat
import com.example.dblife.ui.theme.DblifeTheme

private val REQUEST_PERMISSION_READ_PHONE_STATE: Int = 200;
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DblifeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }

        requestPermissionReadPhone()
    }

    fun requestPermissionReadPhone() {
        var permissions = arrayOf("android.permisson.READ_PHONE_NUMBERS")
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.R) {
            permissions += arrayOf("android.permission.READ_PHONE_STATE")
        }
        ActivityCompat.requestPermissions(this, permissions, REQUEST_PERMISSION_READ_PHONE_STATE)
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DblifeTheme {
        Greeting("Android")
    }
}