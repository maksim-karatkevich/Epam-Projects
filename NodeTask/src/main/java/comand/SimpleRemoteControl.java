package comand;

/**
 * Created by maksim_kevich on 4/25/16.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttomWasPressed() {
        slot.execute();
    }
}
