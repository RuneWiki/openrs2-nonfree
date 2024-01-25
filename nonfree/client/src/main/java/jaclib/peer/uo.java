package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/uo")
public class uo extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/uo", name = "<init>", descriptor = "(Lclient!jaclib/peer/ep;)V")
	public uo(@OriginalArg(0) ep arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
