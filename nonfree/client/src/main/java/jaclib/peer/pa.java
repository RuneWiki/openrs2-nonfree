package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/pa")
public class pa extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/pa", name = "<init>", descriptor = "(Lclient!jaclib/peer/am;)V")
	public pa(@OriginalArg(0) am arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
