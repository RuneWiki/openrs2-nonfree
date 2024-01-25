package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/eb")
public class eb extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/eb", name = "<init>", descriptor = "(Lclient!jaclib/peer/ow;)V")
	public eb(@OriginalArg(0) ow arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
