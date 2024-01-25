package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/jd")
public class jd extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/jd", name = "<init>", descriptor = "(Lclient!jaclib/peer/fl;)V")
	public jd(@OriginalArg(0) fl arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
