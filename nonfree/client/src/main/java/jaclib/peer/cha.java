package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/cha")
public class cha extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/cha", name = "<init>", descriptor = "(Lclient!jaclib/peer/vv;)V")
	public cha(@OriginalArg(0) vv arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
