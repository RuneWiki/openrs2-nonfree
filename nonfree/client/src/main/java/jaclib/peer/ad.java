package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/ad")
public class ad extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/ad", name = "<init>", descriptor = "(Lclient!jaclib/peer/hea;)V")
	public ad(@OriginalArg(0) hea arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
