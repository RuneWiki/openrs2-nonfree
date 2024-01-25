package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/fb")
public class fb extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/fb", name = "<init>", descriptor = "(Lclient!jaclib/peer/hr;)V")
	public fb(@OriginalArg(0) hr arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
