package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/ab")
public class ab extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/ab", name = "<init>", descriptor = "(Lclient!jaclib/peer/tc;)V")
	public ab(@OriginalArg(0) tc arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
