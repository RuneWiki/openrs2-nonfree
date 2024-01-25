package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/qla")
public class qla extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/qla", name = "<init>", descriptor = "(Lclient!jaclib/peer/bu;)V")
	public qla(@OriginalArg(0) bu arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
