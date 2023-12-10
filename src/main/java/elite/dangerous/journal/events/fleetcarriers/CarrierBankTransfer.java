package elite.dangerous.journal.events.fleetcarriers;

import elite.dangerous.journal.base.Event;
import lombok.EliteObject;

@EliteObject
public class CarrierBankTransfer extends Event
{
    private long deposit, whithdraw, carrierID, playerBalance, carrierBalance;
}
