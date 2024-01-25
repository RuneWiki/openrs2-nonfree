package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/aaa")
public final class aaa {

	@OriginalMember(owner = "client!jaclib/peer/aaa", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/aaa", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/aaa", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue c = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/aaa", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.c(arg0 ^ 0xFFFFC6BB);
	}

	@OriginalMember(owner = "client!jaclib/peer/aaa", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a = this.a;
		arg1.b = null;
		if (this.b == null) {
			this.b = arg1;
		} else {
			this.a.b = arg1;
		}
		this.a = arg1;
	}

	@OriginalMember(owner = "client!jaclib/peer/aaa", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a((int) 0);
		if (arg0 == this.a) {
			this.a = arg0.a;
		}
		if (arg0 == this.b) {
			this.b = arg0.b;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/aaa", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.c(22326);
		while (this.a != null) {
			this.a(this.a, 3537);
		}
		this.c(arg0 + 14704);
	}

	@OriginalMember(owner = "client!jaclib/peer/aaa", name = "c", descriptor = "(I)V")
	private void c(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(9) Reference local9 = this.c.poll();
			if (local9 == null) {
				return;
			}
			@Pc(16) PeerReference local16 = (PeerReference) local9;
			this.a(local16, arg0 ^ 0x5AE7);
		}
	}
}
