package iti.mvp_assignment.main_activity.presenter;

import iti.mvp_assignment.main_activity.model.Counter;

public class MainActivityPresenter {
    private Counter counter;  //object from the model.
    private View view;  //object from the view.

    public MainActivityPresenter(View view) {
        this.counter = new Counter();
        this.view = view;
    }

    // the function that will be called in the MainActivity when the FAB pressed.
    public void updateCounter(){
        counter.incrementCount(); // for increasing the counter.
        view.updateCounterTextView(counter.getCount()); // to show the count on the screen.

    }

    //interface for the View functionality
    public interface View{
        void updateCounterTextView(int count);
    }
}
