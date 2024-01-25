package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/ik")
public class ik extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/ik", name = "<init>", descriptor = "(Lclient!jaclib/peer/jv;)V")
	public ik(@OriginalArg(0) jv arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
