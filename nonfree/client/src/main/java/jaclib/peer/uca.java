package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/uca")
public class uca extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/uca", name = "<init>", descriptor = "(Lclient!jaclib/peer/wf;)V")
	public uca(@OriginalArg(0) wf arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
