package com.sarang.torang.di.login_di

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ProvideLoginScreen(onLogin : ()->Unit = {}){
    Box(Modifier.fillMaxSize()) {
        Column(
            Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "로그인을 해주세요.")
            Button(onClick = onLogin) {
                Text(text = "LOG IN WITH EMAIL")
            }
        }
    }
}