package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/pr")
public class pr extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/pr", name = "<init>", descriptor = "(Lclient!jaclib/peer/uca;)V")
	public pr(@OriginalArg(0) uca arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
