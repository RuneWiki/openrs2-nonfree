package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/jl")
public class jl extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/jl", name = "<init>", descriptor = "(Lclient!jaclib/peer/qr;)V")
	public jl(@OriginalArg(0) qr arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
