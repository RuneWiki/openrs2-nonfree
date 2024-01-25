package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/k")
public final class k {

	@OriginalMember(owner = "client!jaclib/peer/k", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/k", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/k", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/k", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.c(127);
	}

	@OriginalMember(owner = "client!jaclib/peer/k", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;Z)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) boolean arg1) {
		arg0.b = this.c;
		arg0.a = null;
		if (this.a == null) {
			this.a = arg0;
		} else {
			this.c.a = arg0;
		}
		this.c = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/k", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.c(-107);
		while (this.c != null) {
			this.a(true, this.c);
		}
		this.c(124);
	}

	@OriginalMember(owner = "client!jaclib/peer/k", name = "a", descriptor = "(ZLclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) boolean arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a(false);
		if (this.a == arg1) {
			this.a = arg1.a;
		}
		if (this.c == arg1) {
			this.c = arg1.b;
		}
		if (arg1.a != null) {
			arg1.a.b = arg1.b;
		}
		if (arg1.b != null) {
			arg1.b.a = arg1.a;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/k", name = "c", descriptor = "(I)V")
	private void c(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(11) Reference local11 = this.b.poll();
			if (local11 == null) {
				return;
			}
			@Pc(17) PeerReference local17 = (PeerReference) local11;
			this.a(true, local17);
		}
	}
}
