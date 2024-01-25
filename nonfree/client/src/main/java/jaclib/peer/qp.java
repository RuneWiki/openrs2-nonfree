package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/qp")
public class qp extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/qp", name = "<init>", descriptor = "(Lclient!jaclib/peer/pi;)V")
	public qp(@OriginalArg(0) pi arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
