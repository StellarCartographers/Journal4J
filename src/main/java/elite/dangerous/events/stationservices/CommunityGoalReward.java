package elite.dangerous.events.stationservices;

import com.google.gson.annotations.SerializedName;

import elite.dangerous.Trigger;
import elite.dangerous.base.Event;

/**
 * The Class CommunityGoalReward.
 */
public class CommunityGoalReward extends Event implements Trigger {

	/**
     * The cgid.
     */
	@SerializedName("CGID")
	public Integer cgid;
	
	/**
     * The reward.
     */
	public Integer reward;
	
	/**
     * The name.
     */
	public String name;
	
	/**
     * The system.
     */
	public String system;

}