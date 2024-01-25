package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/qu")
public class qu extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/qu", name = "<init>", descriptor = "(Lclient!jaclib/peer/naa;)V")
	public qu(@OriginalArg(0) naa arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
