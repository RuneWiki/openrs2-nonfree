package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/qd")
public final class qd {

	@OriginalMember(owner = "client!jaclib/peer/qd", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/qd", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/qd", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue c = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/qd", name = "b", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	private void b(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.a((int) 0);
		if (arg0 == this.b) {
			this.b = arg0.b;
		}
		if (arg0 == this.a) {
			this.a = arg0.a;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/qd", name = "c", descriptor = "(I)V")
	private void c(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(12) Reference local12 = this.c.poll();
			if (local12 == null) {
				return;
			}
			@Pc(18) PeerReference local18 = (PeerReference) local12;
			this.b(local18, (byte) 85);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/qd", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.c(7823);
		while (this.a != null) {
			this.b(this.a, (byte) 85);
		}
		this.c(7823);
	}

	@OriginalMember(owner = "client!jaclib/peer/qd", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.c(7823);
	}

	@OriginalMember(owner = "client!jaclib/peer/qd", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.b = null;
		arg0.a = this.a;
		if (this.b == null) {
			this.b = arg0;
		} else {
			this.a.b = arg0;
		}
		this.a = arg0;
	}
}
