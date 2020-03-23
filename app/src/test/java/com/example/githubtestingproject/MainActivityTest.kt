package com.example.githubtestingproject

import android.os.Build
import android.widget.TextView
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import com.example.githubtestingproject.MainActivity
import junit.framework.TestCase.assertTrue

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.P])
class MainActivityTest {

    private lateinit var mainActivity:MainActivity

    @Before
    fun setup(){
        mainActivity=Robolectric.buildActivity(MainActivity::class.java).create().start().resume().get()
    }

    @Test
    fun testGithubAction(){
        val helloTextView=mainActivity.findViewById(R.id.helloTv) as TextView
        helloTextView.text="Hello Github"
        assertTrue("Test Successfull",helloTextView.text.toString()=="Hello Github")
    }
}
