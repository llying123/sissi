package com.sissi.pipeline.in.presence.roster;

import com.sissi.context.JIDContext;
import com.sissi.pipeline.in.ProxyProcessor;
import com.sissi.protocol.Protocol;
import com.sissi.protocol.iq.roster.RosterSubscription;

/**
 * @author kim 2013-11-17
 */
public class PresenceRosterUnSubscribedProcessor extends ProxyProcessor {

	@Override
	public Boolean input(JIDContext context, Protocol protocol) {
		super.update(super.build(protocol.getTo()), context.getJid(), RosterSubscription.NONE.toString());
		return true;
	} 
}
