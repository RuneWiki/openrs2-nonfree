package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/gs")
public class gs extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/gs", name = "<init>", descriptor = "(Lclient!jaclib/peer/pe;)V")
	public gs(@OriginalArg(0) pe arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
