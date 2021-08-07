package com.shuja.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.math.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Connecting Input Display TextViews
        var userInput:TextView=findViewById(R.id.Input)
        var answer:TextView=findViewById(R.id.answerOutput)

        // Connecting all function buttons of all layouts
        var clear:Button=findViewById(R.id.clearButton)
        var remove:Button=findViewById(R.id.deleteButton)
        var sin:Button=findViewById(R.id.sinButton)
        var cos:Button=findViewById(R.id.cosButton)
        var tan:Button=findViewById(R.id.tanButton)
        var add:Button=findViewById(R.id.addButton)
        var sub:Button=findViewById(R.id.subButton)
        var mul:Button=findViewById(R.id.mulButton)
        var div:Button=findViewById(R.id.divButton)
        var equal:Button=findViewById(R.id.equalButton)

        //Connecting all numeric buttons of all layouts
        var one:Button=findViewById(R.id.oneButton)
        var two:Button=findViewById(R.id.twoButton)
        var three:Button=findViewById(R.id.threeButton)
        var four:Button=findViewById(R.id.fourButton)
        var five:Button=findViewById(R.id.fiveButton)
        var six:Button=findViewById(R.id.sixButton)
        var seven:Button=findViewById(R.id.sevenButton)
        var eight:Button=findViewById(R.id.eightButton)
        var nine:Button=findViewById(R.id.nineButton)
        var zero:Button=findViewById(R.id.zeroButton)

        var runTime=0
        var storeRunTime=0
        var remember="nothing"

        one.setOnClickListener({
            if(answer.text=="Cleared")
                answer.setText("")
            if(!(runTime>0)) // means we will not multiply it with 10
                runTime=1
            else // It is not our first number so multiplication by 10 will be done here
            {
                runTime=(runTime*10)+1
            }

            userInput.setText(""+runTime)
        })
        two.setOnClickListener({
            if(answer.text=="Cleared")
                answer.setText("")
            if(!(runTime>0)) // means we will not multiply it with 10
                runTime=2
            else // It is not our first number so multiplication by 10 will be done here
            {
                runTime=(runTime*10)+2
            }
            userInput.setText(""+runTime)
        })
        three.setOnClickListener({
            if(answer.text=="Cleared")
                answer.setText("")
            if(!(runTime>0)) // means we will not multiply it with 10
                runTime=3
            else // It is not our first number so multiplication by 10 will be done here
            {
                runTime=(runTime*10)+3
            }
            userInput.setText(""+runTime)
        })
        four.setOnClickListener({
            if(answer.text=="Cleared")
                answer.setText("")
            if(!(runTime>0)) // means we will not multiply it with 10
                runTime=4
            else // It is not our first number so multiplication by 10 will be done here
            {
                runTime=(runTime*10)+4
            }
            userInput.setText(""+runTime)
        })
        five.setOnClickListener({
            if(answer.text=="Cleared")
                answer.setText("")
            if(!(runTime>0)) // means we will not multiply it with 10
                runTime=5
            else // It is not our first number so multiplication by 10 will be done here
            {
                runTime=(runTime*10)+5
            }
            userInput.setText(""+runTime)
        })
        six.setOnClickListener({
            if(answer.text=="Cleared")
                answer.setText("")
            if(!(runTime>0)) // means we will not multiply it with 10
                runTime=6
            else // It is not our first number so multiplication by 10 will be done here
            {
                runTime=(runTime*10)+6
            }
            userInput.setText(""+runTime)
        })
        seven.setOnClickListener({
            if(answer.text=="Cleared")
                answer.setText("")
            if(!(runTime>0)) // means we will not multiply it with 10
                runTime=7
            else // It is not our first number so multiplication by 10 will be done here
            {
                runTime=(runTime*10)+7
            }
            userInput.setText(""+runTime)
        })
        eight.setOnClickListener({
            if(answer.text=="Cleared")
                answer.setText("")
            if(!(runTime>0)) // means we will not multiply it with 10
                runTime=8
            else // It is not our first number so multiplication by 10 will be done here
            {
                runTime=(runTime*10)+8
            }
            userInput.setText(""+runTime)
        })
        nine.setOnClickListener({
            if(answer.text=="Cleared")
                answer.setText("")
            if(!(runTime>0)) // means we will not multiply it with 10
                runTime=9
            else // It is not our first number so multiplication by 10 will be done here
            {
                runTime=(runTime*10)+9
            }
            userInput.setText(""+runTime)
        })
        zero.setOnClickListener({
            if(answer.text=="Cleared")
                answer.setText("")
            if (!(runTime > 0)) //
                Toast.makeText(baseContext, "Cannot start with zero", Toast.LENGTH_SHORT).show()
            else // It is not our first number so multiplication by 10 will be done here
            {
                runTime = (runTime * 10) + 0
                userInput.setText(""+runTime)
            }
        })
        clear.setOnClickListener({
            runTime=0
            storeRunTime=0
            answer.setText("Cleared")
            userInput.setText("")
        })
        remove.setOnClickListener({
            if(runTime>0)
            {
                runTime=runTime/10
                if(runTime<1)
                    userInput.setText("")
                else
                    userInput.setText(""+runTime)
            }
        })

        add.setOnClickListener({

            if(!(runTime>0))
            {
                answer.setText("Input Error")
            }
            else
            {
                if(remember=="+")
                    storeRunTime=storeRunTime+runTime
                else if(remember=="-")
                    storeRunTime=storeRunTime-runTime
                else if(remember=="/")
                    storeRunTime=storeRunTime/runTime
                else if(remember=="*")
                    storeRunTime=storeRunTime*runTime
                else {
                    storeRunTime = storeRunTime + runTime
                }
                remember="+"
                runTime=0
                answer.setText("= "+storeRunTime)
            }
        })

        sub.setOnClickListener({

            if(!(runTime>0))
            {
                answer.setText("Input Error")
            }
            else
            {
                if(remember=="+")
                    storeRunTime=storeRunTime+runTime
                else if(remember=="-")
                    storeRunTime=storeRunTime-runTime
                else if(remember=="/")
                    storeRunTime=storeRunTime/runTime
                else if(remember=="*")
                    storeRunTime=storeRunTime*runTime
                else {
                    storeRunTime = storeRunTime + runTime
                }
                remember="-"
                runTime=0
                answer.setText("= "+storeRunTime)
            }
        })

        mul.setOnClickListener({

            if(!(runTime>0))
            {
                answer.setText("Input Error")
            }
            else
            {
                if(remember=="+")
                    storeRunTime=storeRunTime+runTime
                else if(remember=="-")
                    storeRunTime=storeRunTime-runTime
                else if(remember=="/")
                    storeRunTime=storeRunTime/runTime
                else if(remember=="*")
                    storeRunTime=storeRunTime*runTime
                else {
                    storeRunTime = storeRunTime + runTime
                }
                remember="*"
                runTime=0
                answer.setText("= "+storeRunTime)
            }
        })

        div.setOnClickListener({

            if(!(runTime>0))
            {
                answer.setText("Input Error")
            }
            else
            {
                if(remember=="+")
                    storeRunTime=storeRunTime+runTime
                else if(remember=="-")
                    storeRunTime=storeRunTime-runTime
                else if(remember=="/")
                    storeRunTime=storeRunTime/runTime
                else if(remember=="*")
                    storeRunTime=storeRunTime*runTime
                else {
                    storeRunTime = storeRunTime + runTime
                }
                remember="/"
                runTime=0
                answer.setText("= "+storeRunTime)
            }
        })

        equal.setOnClickListener({
            if(!(runTime>0))
                answer.setText("")
            else
            {
                if(remember=="+")
                    storeRunTime=storeRunTime+runTime
                else if(remember=="-")
                    storeRunTime=storeRunTime-runTime
                else if(remember=="/")
                    storeRunTime=storeRunTime/runTime
                else if(remember=="*")
                    storeRunTime=storeRunTime*runTime

                remember="nothing"
                runTime=storeRunTime
                userInput.setText("")
                answer.setText("= "+storeRunTime)
                storeRunTime=0
            }

        })

        sin.setOnClickListener({

            if(!(runTime>0))
            {
                answer.setText("Input Error")
            }
            else
            {
                if(remember=="+")
                    storeRunTime=storeRunTime+runTime
                else if(remember=="-")
                    storeRunTime=storeRunTime-runTime
                else if(remember=="/")
                    storeRunTime=storeRunTime/runTime
                else if(remember=="-")
                    storeRunTime=storeRunTime/runTime
                else
                    storeRunTime=runTime

                answer.setText("= "+(sin(storeRunTime.toDouble())))
                remember="nothing"
                runTime=0
                storeRunTime=0
            }
        })

        cos.setOnClickListener({

            if(!(runTime>0))
            {
                answer.setText("Input Error")
            }
            else
            {
                if(remember=="+")
                    storeRunTime=storeRunTime+runTime
                else if(remember=="-")
                    storeRunTime=storeRunTime-runTime
                else if(remember=="/")
                    storeRunTime=storeRunTime/runTime
                else if(remember=="-")
                    storeRunTime=storeRunTime/runTime
                else
                    storeRunTime=runTime

                answer.setText("= "+(cos(storeRunTime.toDouble())))
                remember="nothing"
                runTime=0
                storeRunTime=0
            }
        })

        tan.setOnClickListener({

            if(!(runTime>0))
            {
                answer.setText("Input Error")
            }
            else
            {
                if(remember=="+")
                    storeRunTime=storeRunTime+runTime
                else if(remember=="-")
                    storeRunTime=storeRunTime-runTime
                else if(remember=="/")
                    storeRunTime=storeRunTime/runTime
                else if(remember=="-")
                    storeRunTime=storeRunTime/runTime
                else
                    storeRunTime=runTime

                answer.setText("= "+(tan(storeRunTime.toDouble())))
                remember="nothing"
                runTime=0
                storeRunTime=0
            }
        })

    }
}