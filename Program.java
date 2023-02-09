public class Program {

    public void run()
    {
        JSON_Worker json_worker = new JSON_Worker("./BE_data.json");
        Event_Vector event_vector = new Event_Vector();

        json_worker.work(event_vector);

        for (Event event : event_vector)
        {
            System.out.println(event.getSport_event_id());
            System.out.println(event.getCompetitor_home().getName());
            System.out.println(event.getVenue().getId());
        }

    }
}
