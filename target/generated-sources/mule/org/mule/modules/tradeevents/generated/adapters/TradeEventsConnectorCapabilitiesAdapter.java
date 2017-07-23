
package org.mule.modules.tradeevents.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.tradeevents.TradeEventsConnector;


/**
 * A <code>TradeEventsConnectorCapabilitiesAdapter</code> is a wrapper around {@link TradeEventsConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-23T02:49:49-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class TradeEventsConnectorCapabilitiesAdapter
    extends TradeEventsConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
