package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/tja")
public class tja extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/tja", name = "<init>", descriptor = "(Lclient!jaclib/peer/bw;)V")
	public tja(@OriginalArg(0) bw arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
