package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/od")
public class od extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/od", name = "<init>", descriptor = "(Lclient!jaclib/peer/bda;)V")
	public od(@OriginalArg(0) bda arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
