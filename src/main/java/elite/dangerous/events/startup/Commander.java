package elite.dangerous.events.startup;

import com.google.gson.annotations.SerializedName;

import elite.dangerous.Trigger;
import elite.dangerous.base.Event;

/**
 * The Class Commander.
 */
public class Commander extends Event implements Trigger {

	/**
     * The name.
     */
	public String name;
	
	/**
     * The fid.
     */
	@SerializedName("FID")
	public String fid;

}