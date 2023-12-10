package elite.dangerous.journal.events.backpack;

import elite.dangerous.journal.base.Event;
import lombok.EliteObject;

@EliteObject
public class UseConsumable extends Event
{
    private String name;

    private String type;
}
