package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/fe")
public class fe extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/fe", name = "<init>", descriptor = "(Lclient!jaclib/peer/ca;)V")
	public fe(@OriginalArg(0) ca arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
