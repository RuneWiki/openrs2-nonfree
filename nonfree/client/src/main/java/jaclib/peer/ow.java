package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/ow")
public final class ow {

	@OriginalMember(owner = "client!jaclib/peer/ow", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/ow", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/ow", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue c = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/ow", name = "a", descriptor = "(I)V")
	private void a(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(7) Reference local7 = this.c.poll();
			if (local7 == null) {
				return;
			}
			@Pc(12) PeerReference local12 = (PeerReference) local7;
			this.a(local12, -21325);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/ow", name = "a", descriptor = "(B)V")
	public void a(@OriginalArg(0) byte arg0) {
		this.a((int) 16042);
		while (this.a != null) {
			this.a(this.a, -21325);
		}
		this.a((int) 16042);
	}

	@OriginalMember(owner = "client!jaclib/peer/ow", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.a((int) 16042);
	}

	@OriginalMember(owner = "client!jaclib/peer/ow", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.b(0);
		if (arg0 == this.b) {
			this.b = arg0.b;
		}
		if (this.a == arg0) {
			this.a = arg0.a;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/ow", name = "a", descriptor = "(BLclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) byte arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a = this.a;
		arg1.b = null;
		if (this.b == null) {
			this.b = arg1;
		} else {
			this.a.b = arg1;
		}
		this.a = arg1;
	}
}
