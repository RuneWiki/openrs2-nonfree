package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/dh")
public class dh extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/dh", name = "<init>", descriptor = "(Lclient!jaclib/peer/hk;)V")
	public dh(@OriginalArg(0) hk arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
