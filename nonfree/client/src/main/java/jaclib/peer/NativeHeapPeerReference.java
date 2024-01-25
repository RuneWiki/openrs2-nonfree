package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/NativeHeapPeerReference")
public final class NativeHeapPeerReference extends PeerReference {

	@OriginalMember(owner = "client!jaclib/peer/NativeHeapPeerReference", name = "<init>", descriptor = "(Lclient!jaclib/peer/dea;Lclient!jaclib/peer/aaa;)V")
	public NativeHeapPeerReference(@OriginalArg(0) dea arg0, @OriginalArg(1) aaa arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jaclib/peer/NativeHeapPeerReference", name = "releasePeer", descriptor = "(J)J")
	protected native long releasePeer(@OriginalArg(0) long arg0);
}
