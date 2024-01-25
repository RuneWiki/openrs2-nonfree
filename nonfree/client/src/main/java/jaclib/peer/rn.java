package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/rn")
public class rn extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/rn", name = "<init>", descriptor = "(Lclient!jaclib/peer/pba;)V")
	public rn(@OriginalArg(0) pba arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
