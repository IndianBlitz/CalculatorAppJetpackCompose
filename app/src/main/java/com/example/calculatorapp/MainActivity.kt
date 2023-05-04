package com.example.calculatorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.notkamui.keval.Keval
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}


@Preview(showBackground = true, widthDp = 500, heightDp = 900)
@Composable
fun MainScreen() {
    val (EquationString, setEquationString) = remember { mutableStateOf(""); }


    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF050214))
    )
    {

        DisplayBox(equation = EquationString, setEquationString)




        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp), horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically,) {
            OneBtn(EquationString, setEquationString)
            TwoBtn(EquationString, setEquationString)
            ThreeBtn(EquationString, setEquationString)

        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp), horizontalArrangement = Arrangement.SpaceEvenly) {

            FourBtn(EquationString, setEquationString)
            FiveBtn(EquationString, setEquationString)
            SixBtn(EquationString, setEquationString)


        }
//
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp), horizontalArrangement = Arrangement.SpaceEvenly) {


            SevenBtn(EquationString, setEquationString )
            EightBtn(EquationString, setEquationString )
            NineBtn(EquationString, setEquationString)
        }

        Row(modifier = Modifier.fillMaxWidth().padding(top = 30.dp), horizontalArrangement = Arrangement.SpaceEvenly) {


            ZeroBtn(EquationString, setEquationString)

        }

        Row(modifier = Modifier.fillMaxWidth().padding(top = 30.dp), horizontalArrangement = Arrangement.SpaceEvenly) {


            MutilplyBtn(EquationString, setEquationString)
            DivideBtn(EquationString, setEquationString)
            ModBtn(EquationString, setEquationString)
            EqualBtn(EquationString, setEquationString)
        }



    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DisplayBox(equation: String, onvalueChange: (String) -> Unit) {
    TextField(
        value = equation, onValueChange = { onvalueChange(it) },


        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.2f),
            textStyle = androidx.compose.ui.text.TextStyle(fontSize = 50.sp)

        )
}


@Composable
fun OneBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = { onpressedBtn(eqn + "1") } , modifier = Modifier, colors = ButtonDefaults.buttonColors(containerColor = Color(0x9FFFC107))) {
        Text(text = "1", fontSize = 30.sp, modifier = Modifier.padding(start = 20.dp, end = 20.dp))
    }
}











@Composable
fun TwoBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button( onClick = { onpressedBtn(eqn + "2")} ,colors = ButtonDefaults.buttonColors(containerColor = Color(0x9FFFC107))) {
        Text(text = "2",fontSize = 30.sp, modifier = Modifier.padding(start = 20.dp, end = 20.dp))
    }
}


@Composable
fun ThreeBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = { onpressedBtn(eqn + "3") },colors = ButtonDefaults.buttonColors(containerColor = Color(0x9FFFC107))) {
        Text(text = "3",fontSize = 30.sp, modifier = Modifier.padding(start = 20.dp, end = 20.dp))
    }
}


















@Composable
fun FourBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = { onpressedBtn(eqn + "4") },colors = ButtonDefaults.buttonColors(containerColor = Color(0x9FFFC107))) {
        Text(text = "4",fontSize = 30.sp, modifier = Modifier.padding(start = 20.dp, end = 20.dp))
    }
}


@Composable
fun FiveBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = { onpressedBtn(eqn + "5") },colors = ButtonDefaults.buttonColors(containerColor = Color(0x9FFFC107))) {
        Text(text = "5",fontSize = 30.sp, modifier = Modifier.padding(start = 20.dp, end = 20.dp))
    }
}


@Composable
fun SixBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = { onpressedBtn(eqn + "6") },colors = ButtonDefaults.buttonColors(containerColor = Color(0x9FFFC107))) {
        Text(text = "6",fontSize = 30.sp, modifier = Modifier.padding(start = 20.dp, end = 20.dp))
    }
}












@Composable
fun SevenBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = { onpressedBtn(eqn + "7") },colors = ButtonDefaults.buttonColors(containerColor = Color(0x9FFFC107))) {
        Text(text = "7",fontSize = 30.sp, modifier = Modifier.padding(start = 20.dp, end = 20.dp))
    }

}


@Composable
fun EightBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = { onpressedBtn(eqn + "8") },colors = ButtonDefaults.buttonColors(containerColor = Color(0x9FFFC107))) {
        Text(text = "8",fontSize = 30.sp, modifier = Modifier.padding(start = 20.dp, end = 20.dp))
    }
}


@Composable
fun NineBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = { onpressedBtn(eqn + "9") },colors = ButtonDefaults.buttonColors(containerColor = Color(0x9FFFC107))) {
        Text(text = "9",fontSize = 30.sp, modifier = Modifier.padding(start = 20.dp, end = 20.dp))
    }
}













@Composable
fun ZeroBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = { onpressedBtn(eqn + "0") },colors = ButtonDefaults.buttonColors(containerColor = Color(0x9FFFC107))) {
        Text(text = "0",fontSize = 30.sp, modifier = Modifier.padding(start = 20.dp, end = 20.dp))
    }
}


@Composable
fun PlusBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = {

        onpressedBtn("$eqn+")


    }) {
        Text(text = "+")
    }
}

@Composable
fun MinusBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = {

        onpressedBtn("$eqn-")


    }) {
        Text(text = "-")
    }
}


@Composable
fun MutilplyBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = {

        onpressedBtn("$eqn*")


    }) {
        Text(text = "X")
    }
}

@Composable
fun DivideBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = {

        onpressedBtn("$eqn/")


    }) {
        Text(text = "/")
    }
}

@Composable
fun ModBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = {

        onpressedBtn("$eqn%")


    }) {
        Text(text = "%")
    }
}


fun convertEquationToResult(equation: String): Int {
    Keval{

    }
    return Keval.eval(equation).toInt();
}

@Composable
fun EqualBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = {

        val result:Int = convertEquationToResult(eqn);
        onpressedBtn(result.toString())


    }) {
        Text(text = "=")
    }
}













