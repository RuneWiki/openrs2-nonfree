package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/uda")
public class uda extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/uda", name = "<init>", descriptor = "(Lclient!jaclib/peer/hb;)V")
	public uda(@OriginalArg(0) hb arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
