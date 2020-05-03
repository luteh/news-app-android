package com.luteh.newsapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.rule.ActivityTestRule
import com.luteh.newsapp.presentation.main.MainActivity
import org.hamcrest.CoreMatchers.allOf
import org.junit.Rule
import org.junit.Test

/**
 * Created by Luthfan Maftuh on 5/3/2020.
 */
class MainScreenTest {

    @get:Rule
    var activityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun btmNavView_clickOnAllItems() {
        openFavoriteScreen()

        openAccountScreen()

        openHomeScreen()
    }

    private fun openFavoriteScreen() {
        onView(allOf(withContentDescription(R.string.title_favorite), ViewMatchers.isDisplayed()))
            .perform(ViewActions.click())
    }

    private fun openAccountScreen() {
        onView(allOf(withContentDescription(R.string.title_account), ViewMatchers.isDisplayed()))
            .perform(ViewActions.click())
    }

    private fun openHomeScreen() {
        onView(allOf(withContentDescription(R.string.title_home), ViewMatchers.isDisplayed()))
            .perform(ViewActions.click())
    }

}