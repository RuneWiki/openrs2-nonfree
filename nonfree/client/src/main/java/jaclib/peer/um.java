package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/um")
public class um extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/um", name = "<init>", descriptor = "(Lclient!jaclib/peer/mk;)V")
	public um(@OriginalArg(0) mk arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
