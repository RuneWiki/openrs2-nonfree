package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/mf")
public class mf extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/mf", name = "<init>", descriptor = "(Lclient!jaclib/peer/io;)V")
	public mf(@OriginalArg(0) io arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
