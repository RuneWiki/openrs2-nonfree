package jaclib.peer;

import java.lang.ref.WeakReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/PeerReference")
public abstract class PeerReference extends WeakReference {

	@OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	public PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	public PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "<init>", descriptor = "(Lclient!jaclib/peer/Peer;Lclient!jaclib/peer/aaa;)V")
	protected PeerReference(@OriginalArg(0) Peer arg0, @OriginalArg(1) aaa arg1) {
		super(arg0, arg1.c);
		arg1.a(11343, this);
	}

	@OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "releasePeer", descriptor = "(J)J")
	protected abstract long releasePeer(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(B)Z")
	public final boolean a(@OriginalArg(0) byte arg0) {
		return this.peer != 0L;
	}

	@OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "setPeer", descriptor = "(J)V")
	private void setPeer(@OriginalArg(0) long arg0) {
		this.a((int) 0);
		this.peer = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(I)J")
	public final long a(@OriginalArg(0) int arg0) {
		@Pc(8) long local8;
		if (this.peer == 0L) {
			local8 = 0L;
		} else {
			local8 = this.releasePeer(this.peer);
			this.peer = 0L;
		}
		return local8;
	}
}
