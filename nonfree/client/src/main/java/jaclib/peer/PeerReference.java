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

	@OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "<init>", descriptor = "(Lclient!jaclib/peer/Peer;Lclient!jaclib/peer/am;)V")
	protected PeerReference(@OriginalArg(0) Peer arg0, @OriginalArg(1) am arg1) {
		super(arg0, arg1.c);
		arg1.a(this, (byte) 126);
	}

	@OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(B)Z")
	public final boolean a(@OriginalArg(0) byte arg0) {
		return this.peer != 0L;
	}

	@OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "releasePeer", descriptor = "(J)J")
	protected abstract long releasePeer(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "setPeer", descriptor = "(J)V")
	private void setPeer(@OriginalArg(0) long arg0) {
		this.b((byte) 82);
		this.peer = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "b", descriptor = "(B)J")
	public final long b(@OriginalArg(0) byte arg0) {
		@Pc(18) long local18;
		if (this.peer == 0L) {
			local18 = 0L;
		} else {
			local18 = this.releasePeer(this.peer);
			this.peer = 0L;
		}
		return local18;
	}
}
