package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/md")
public class md extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/md", name = "<init>", descriptor = "(Lclient!jaclib/peer/mba;)V")
	public md(@OriginalArg(0) mba arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
