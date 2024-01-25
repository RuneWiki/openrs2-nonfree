package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/Peer")
public abstract class Peer {

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "reference", descriptor = "Lclient!jaclib/peer/PeerReference;")
	protected PeerReference reference;

	static {
		init(PeerReference.class);
	}

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "init", descriptor = "(Ljava/lang/Class;)V")
	private static native void init(@OriginalArg(0) Class arg0);

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "<init>", descriptor = "()V")
	protected Peer() {
	}

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "()J")
	protected long a() {
		return this.reference.a(57);
	}

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "(B)Z")
	protected final boolean a(@OriginalArg(0) byte arg0) {
		return this.reference.a(false);
	}
}
