package com.example.poseexercise

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.poseexercise.views.fragment.HomeFragment
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HomeFragmentTest {

    private lateinit var scenario: FragmentScenario<HomeFragment>
    @Before
    fun setUp() {
        val scenario = launchFragmentInContainer<HomeFragment>()
        scenario.moveToState(Lifecycle.State.RESUMED)
    }
    @Test
    fun homeFragmentTest() {
        onView(withId(R.id.progress_layout)).check(matches(isDisplayed()))
        onView(withId(R.id.recentActivityLayout)).check(matches(isDisplayed()))
        onView(withId(R.id.todayPlanScrollView)).check(matches(isDisplayed()))
    }

}