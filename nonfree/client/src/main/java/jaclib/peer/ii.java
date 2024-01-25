package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/ii")
public class ii extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/ii", name = "<init>", descriptor = "(Lclient!jaclib/peer/of;)V")
	public ii(@OriginalArg(0) of arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
