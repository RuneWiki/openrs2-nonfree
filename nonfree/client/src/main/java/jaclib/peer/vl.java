package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/vl")
public class vl extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/vl", name = "<init>", descriptor = "(Lclient!jaclib/peer/wl;)V")
	public vl(@OriginalArg(0) wl arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
