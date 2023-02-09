import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public void run()
    {
        JSON_Worker json_worker = new JSON_Worker("./BE_data.json");
        Event_Vector event_vector = new Event_Vector();
        Event_Vector_Sorter event_vector_sorter = new Event_Vector_Sorter();
        Console_Manager console_manager = new Console_Manager(event_vector);

        json_worker.work(event_vector);
        event_vector_sorter.sortByProbability(event_vector);
        console_manager.run();
    }
}
