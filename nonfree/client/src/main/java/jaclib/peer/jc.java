package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/jc")
public class jc extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/jc", name = "<init>", descriptor = "(Lclient!jaclib/peer/jd;)V")
	public jc(@OriginalArg(0) jd arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
