package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/ma")
public class ma extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/ma", name = "<init>", descriptor = "(Lclient!jaclib/peer/qd;)V")
	public ma(@OriginalArg(0) qd arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
