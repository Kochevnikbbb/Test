package kg.geektech.test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> rule =
            new ActivityScenarioRule<>(MainActivity.class);
    @Test
    public void textViewIsDisplayed(){
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(isDisplayed()));
    }

    @Test
    public void simpleSubCase(){

        onView(withId(R.id.et_num1)).perform(typeText("5"));
        onView(withId(R.id.et_num2)).perform(typeText("3"));
        onView(withId(R.id.btn_sub)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("2")));
    }

    @Test
    public void simpleMultiplyCase() {
        onView(withId(R.id.et_num1)).perform(typeText("5"));
        onView(withId(R.id.et_num2)).perform(typeText("2"));
        onView(withId(R.id.btn_mult)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("10")));
    }

    @Test
    public void simpleDivisionCase() {
        onView(withId(R.id.et_num1)).perform(typeText("5"));
        onView(withId(R.id.et_num2)).perform(typeText("2"));
        onView(withId(R.id.btn_div)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("2")));
    }

}
