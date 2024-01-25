package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/gga")
public class gga extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/gga", name = "<init>", descriptor = "(Lclient!jaclib/peer/ku;)V")
	public gga(@OriginalArg(0) ku arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
