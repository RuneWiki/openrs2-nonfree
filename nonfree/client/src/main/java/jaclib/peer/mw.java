package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/mw")
public class mw extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/mw", name = "<init>", descriptor = "(Lclient!jaclib/peer/bea;)V")
	public mw(@OriginalArg(0) bea arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
