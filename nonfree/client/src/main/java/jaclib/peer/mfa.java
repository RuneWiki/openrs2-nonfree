package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/mfa")
public class mfa extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/mfa", name = "<init>", descriptor = "(Lclient!jaclib/peer/jaa;)V")
	public mfa(@OriginalArg(0) jaa arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
