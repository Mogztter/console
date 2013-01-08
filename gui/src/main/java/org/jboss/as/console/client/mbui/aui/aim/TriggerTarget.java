package org.jboss.as.console.client.mbui.aui.aim;

import java.util.Set;

/**
 * @author Heiko Braun
 * @date 10/31/12
 */
public interface TriggerTarget {

    boolean isTriggeredBy(Trigger<TriggerType> event);

    Set<Trigger<TriggerType>> getInputs();

    void setInputs(Trigger<TriggerType>... trigger);
}
