import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public void run()
    {
        JSON_Worker json_worker = new JSON_Worker("./BE_data.json");
        Event_Vector event_vector = new Event_Vector();
        Event_Vector_Sorter event_vector_sorter = new Event_Vector_Sorter();
        Display_Manager display_manager = new Display_Manager();
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        json_worker.work(event_vector);
        event_vector_sorter.sortByProbability(event_vector);

        while(!stop)
        {
            int amount=0;
            try
            {
                display_manager.display_menu_probability(event_vector);
                amount = scanner.nextInt();
            }
            catch(InputMismatchException e)
            {
                display_manager.display_input_not_int();
                scanner.nextLine();
                continue;
            }
            if (amount <= event_vector.size()) for (int i = 0; i < amount; i++) { display_manager.display_result(event_vector.get(i), i + 1); }
            else display_manager.display_input_out_of_range();
            System.out.flush();
            if (amount == 0) { stop = true; }
        }
    }
}
