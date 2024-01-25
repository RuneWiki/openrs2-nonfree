package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/ni")
public class ni extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/ni", name = "<init>", descriptor = "(Lclient!jaclib/peer/ik;)V")
	public ni(@OriginalArg(0) ik arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
