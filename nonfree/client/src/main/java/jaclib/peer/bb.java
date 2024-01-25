package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/bb")
public class bb extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/bb", name = "<init>", descriptor = "(Lclient!jaclib/peer/pb;)V")
	public bb(@OriginalArg(0) pb arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
