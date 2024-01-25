package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/je")
public class je extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/je", name = "<init>", descriptor = "(Lclient!jaclib/peer/dba;)V")
	public je(@OriginalArg(0) dba arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
