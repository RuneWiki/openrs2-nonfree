package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/qs")
public class qs extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/qs", name = "<init>", descriptor = "(Lclient!jaclib/peer/gca;)V")
	public qs(@OriginalArg(0) gca arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
