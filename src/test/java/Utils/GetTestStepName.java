package Utils;

import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.EventHandler;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.PickleStepTestStep;
import io.cucumber.plugin.event.TestStepStarted;

public class GetTestStepName implements ConcurrentEventListener{

    public static String currentStepName;

    public EventHandler<TestStepStarted> stepHandler = new EventHandler<TestStepStarted>() {


        @Override
        public void receive(TestStepStarted testStepStarted) {}
    };



    @Override
    public void setEventPublisher(EventPublisher eventPublisher) {

    }
}
