package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/bi")
public class bi extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/bi", name = "<init>", descriptor = "(Lclient!jaclib/peer/ge;)V")
	public bi(@OriginalArg(0) ge arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
