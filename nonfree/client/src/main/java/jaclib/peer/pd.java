package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/pd")
public class pd extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/pd", name = "<init>", descriptor = "(Lclient!jaclib/peer/wn;)V")
	public pd(@OriginalArg(0) wn arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
