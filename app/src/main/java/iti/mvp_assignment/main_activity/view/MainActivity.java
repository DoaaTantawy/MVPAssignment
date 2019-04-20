package iti.mvp_assignment.main_activity.view;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import iti.mvp_assignment.R;
import iti.mvp_assignment.main_activity.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityPresenter.View {
    private MainActivityPresenter presenter; // object from the presenter

    //UI components.
    private TextView counterTextView;
    private FloatingActionButton incrementButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainActivityPresenter(this);
        counterTextView=(TextView)findViewById(R.id.counterTextView);
        incrementButton=(FloatingActionButton) findViewById(R.id.incrementBtn);
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.updateCounter(); // calling the presenter method that is responsible of increasing the count.
            }
        });

    }

    // the implementation of the View interface method.
    @Override
    public void updateCounterTextView(int count) {
        String counterString=""+count;
        counterTextView.setText(counterString); // just getting the count and viewing it on the screen.
    }
}
