package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/mh")
public class mh extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/mh", name = "<init>", descriptor = "(Lclient!jaclib/peer/rh;)V")
	public mh(@OriginalArg(0) rh arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
