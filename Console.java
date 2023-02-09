import java.util.Scanner;

public abstract class Console {
    public Event_Vector event_vector;
    public Display_Manager display_manager;
    public Scanner scanner;

    public Console(Event_Vector event_vector, Display_Manager display_manager, Scanner scanner)
    {
        this.event_vector = event_vector;
        this.display_manager = display_manager;
        this.scanner = scanner;
    }

    public void run() {}
}
