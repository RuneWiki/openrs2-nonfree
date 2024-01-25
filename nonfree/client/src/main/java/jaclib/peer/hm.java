package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/hm")
public class hm extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/hm", name = "<init>", descriptor = "(Lclient!jaclib/peer/bd;)V")
	public hm(@OriginalArg(0) bd arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
