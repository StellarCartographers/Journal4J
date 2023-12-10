package elite.dangerous.journal.events.travel;

import elite.dangerous.journal.base.Event;
import lombok.EliteObject;

@EliteObject
public class DockingCancelled extends Event
{

    private String stationName;

    private String stationType;

    private long   marketID;

}
