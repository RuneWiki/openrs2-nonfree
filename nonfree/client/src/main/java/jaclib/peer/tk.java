package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/tk")
public class tk extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/tk", name = "<init>", descriptor = "(Lclient!jaclib/peer/cv;)V")
	public tk(@OriginalArg(0) cv arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
