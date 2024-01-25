package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/ih")
public class ih extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/ih", name = "<init>", descriptor = "(Lclient!jaclib/peer/er;)V")
	public ih(@OriginalArg(0) er arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
