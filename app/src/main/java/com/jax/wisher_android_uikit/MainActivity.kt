package com.jax.wisher_android_uikit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.jax.wisher_android_uikit.ui.theme.WisherandroiduikitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WisherandroiduikitTheme {
                
            }
        }
    }
}
