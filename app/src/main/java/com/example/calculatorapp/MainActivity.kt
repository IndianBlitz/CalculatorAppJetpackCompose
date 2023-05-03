package com.example.calculatorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}


@Preview(showBackground = true, widthDp = 500, heightDp = 400)
@Composable
fun MainScreen() {
        val (EquationString,setEquationString) = remember { mutableStateOf(""); }


    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF050214)))
    {

        DisplayBox(equation = EquationString,setEquationString)




        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            OneBtn(EquationString,setEquationString)
            TwoBtn()
            ThreeBtn()
            FourBtn()
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {

            FiveBtn()
            SixBtn()
            SevenBtn()
            EightBtn()

        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {


            NineBtn()
            ZeroBtn()
            MinusBtn()
            PlusBtn()
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {


            MutilplyBtn()
            DivideBtn()
            ModBtn()
            EqualBtn()
        }

    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun  DisplayBox(equation:String,onvalueChange:(String)->Unit){
    TextField(value = equation, onValueChange = {onvalueChange(it)}, modifier = Modifier

        .fillMaxWidth()
        .fillMaxHeight(.2f),

    )
}









@Composable
fun OneBtn( eqn:String,onpressedBtn: (String) -> Unit){
    Button(onClick = {

        onpressedBtn(eqn+"1")


    }) {
        Text(text = "1")
    }
}




@Composable
fun TwoBtn(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "2")
    }
}




@Composable
fun ThreeBtn(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "3")
    }
}


@Composable
fun FourBtn(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "4")
    }
}


@Composable
fun FiveBtn(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "5")
    }
}


@Composable
fun SixBtn(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "6")
    }
}



@Composable
fun SevenBtn(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "7")
    }
}



@Composable
fun EightBtn(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "8")
    }
}


@Composable
fun NineBtn(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "9")
    }
}

@Composable
fun ZeroBtn(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "0")
    }
}






@Composable
fun PlusBtn(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "+")
    }
}

@Composable
fun MinusBtn(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "-")
    }
}


@Composable
fun MutilplyBtn(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "x")
    }
}

@Composable
fun DivideBtn(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "/")
    }
}

@Composable
fun ModBtn(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "%")
    }
}


@Composable
fun EqualBtn(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "=")
    }
}













