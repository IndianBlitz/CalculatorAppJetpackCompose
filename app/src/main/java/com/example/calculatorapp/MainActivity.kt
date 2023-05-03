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
import com.notkamui.keval.Keval

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
    val (EquationString, setEquationString) = remember { mutableStateOf(""); }


    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF050214))
    )
    {

        DisplayBox(equation = EquationString, setEquationString)




        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            OneBtn(EquationString, setEquationString)
            TwoBtn(EquationString, setEquationString)
            ThreeBtn(EquationString, setEquationString)
            FourBtn(EquationString, setEquationString)
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {

            FiveBtn(EquationString, setEquationString)
            SixBtn(EquationString, setEquationString)
            SevenBtn(EquationString, setEquationString)
            EightBtn(EquationString, setEquationString)

        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {


            NineBtn(EquationString, setEquationString)
            ZeroBtn(EquationString, setEquationString)
            MinusBtn(EquationString, setEquationString)
            PlusBtn(EquationString, setEquationString)
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {


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

        )
}


@Composable
fun OneBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = {

        onpressedBtn(eqn + "1")


    }) {
        Text(text = "1")
    }
}


@Composable
fun TwoBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = {

        onpressedBtn(eqn + "2")


    }) {
        Text(text = "2")
    }
}


@Composable
fun ThreeBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = {

        onpressedBtn(eqn + "3")


    }) {
        Text(text = "3")
    }
}


@Composable
fun FourBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = {

        onpressedBtn(eqn + "4")


    }) {
        Text(text = "4")
    }
}


@Composable
fun FiveBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = { onpressedBtn(eqn+"5") }) {
        Text(text = "5")
    }
}


@Composable
fun SixBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = {

        onpressedBtn(eqn + "6")


    }) {
        Text(text = "6")
    }
}


@Composable
fun SevenBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = {

        onpressedBtn(eqn + "7")


    }) {
        Text(text = "7")
    }
}


@Composable
fun EightBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = {

        onpressedBtn(eqn + "8")


    }) {
        Text(text = "8")
    }
}


@Composable
fun NineBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = {

        onpressedBtn(eqn + "9")


    }) {
        Text(text = "9")
    }
}

@Composable
fun ZeroBtn(eqn: String, onpressedBtn: (String) -> Unit) {
    Button(onClick = {

        onpressedBtn(eqn + "0")


    }) {
        Text(text = "0")
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













