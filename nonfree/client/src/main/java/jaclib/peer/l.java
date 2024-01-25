package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/l")
public class l extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/l", name = "<init>", descriptor = "(Lclient!jaclib/peer/fk;)V")
	public l(@OriginalArg(0) fk arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
