
package org.mule.modules.tradeevents.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.tradeevents.TradeEventsConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>TradeEventsConnectorProcessAdapter</code> is a wrapper around {@link TradeEventsConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-23T02:41:58-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class TradeEventsConnectorProcessAdapter
    extends TradeEventsConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<TradeEventsConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, TradeEventsConnectorCapabilitiesAdapter> getProcessTemplate() {
        final TradeEventsConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,TradeEventsConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, TradeEventsConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, TradeEventsConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
