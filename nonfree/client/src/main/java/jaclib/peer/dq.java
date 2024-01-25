package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/dq")
public final class dq {

	@OriginalMember(owner = "client!jaclib/peer/dq", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/dq", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/dq", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/dq", name = "c", descriptor = "(I)V")
	public void c(@OriginalArg(0) int arg0) {
		this.a(-18553);
	}

	@OriginalMember(owner = "client!jaclib/peer/dq", name = "a", descriptor = "(I)V")
	private void a(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(7) Reference local7 = this.b.poll();
			if (local7 == null) {
				return;
			}
			@Pc(15) PeerReference local15 = (PeerReference) local7;
			this.a(local15, true);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/dq", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.b = this.a;
		arg0.a = null;
		if (this.c == null) {
			this.c = arg0;
		} else {
			this.a.a = arg0;
		}
		this.a = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/dq", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;Z)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) boolean arg1) {
		arg0.a((byte) 67);
		if (arg0 == this.a) {
			this.a = arg0.b;
		}
		if (arg0 == this.c) {
			this.c = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/dq", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.a(-18553);
		while (this.a != null) {
			this.a(this.a, true);
		}
		this.a(-18553);
	}
}
