package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/gd")
public class gd extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/gd", name = "<init>", descriptor = "(Lclient!jaclib/peer/dj;)V")
	public gd(@OriginalArg(0) dj arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
