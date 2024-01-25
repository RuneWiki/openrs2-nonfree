package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/dea")
public class dea extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/dea", name = "<init>", descriptor = "(Lclient!jaclib/peer/aaa;)V")
	public dea(@OriginalArg(0) aaa arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
