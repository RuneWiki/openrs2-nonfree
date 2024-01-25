package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/jj")
public class jj extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/jj", name = "<init>", descriptor = "(Lclient!jaclib/peer/in;)V")
	public jj(@OriginalArg(0) in arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
