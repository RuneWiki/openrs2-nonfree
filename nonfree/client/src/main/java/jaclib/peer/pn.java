package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/pn")
public class pn extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/pn", name = "<init>", descriptor = "(Lclient!jaclib/peer/k;)V")
	public pn(@OriginalArg(0) k arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
