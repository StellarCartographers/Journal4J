package elite.dangerous.journal.events.travel;

import elite.dangerous.journal.Event;

public class Touchdown extends Event
{

    public boolean playerControlled;

    public double latitude, longitude;

    public String nearestDestination;

    public String nearestDestinationLocalised;

}