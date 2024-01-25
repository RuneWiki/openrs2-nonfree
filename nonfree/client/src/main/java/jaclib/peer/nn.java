package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/nn")
public class nn extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/nn", name = "<init>", descriptor = "(Lclient!jaclib/peer/dq;)V")
	public nn(@OriginalArg(0) dq arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
