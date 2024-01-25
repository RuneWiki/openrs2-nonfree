package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/tc")
public final class tc {

	@OriginalMember(owner = "client!jaclib/peer/tc", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/tc", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/tc", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue c = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/tc", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a = null;
		arg0.b = this.a;
		if (this.b == null) {
			this.b = arg0;
		} else {
			this.a.a = arg0;
		}
		this.a = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/tc", name = "a", descriptor = "(Z)V")
	public void a(@OriginalArg(0) boolean arg0) {
		this.b(true);
		while (this.a != null) {
			this.a(true, this.a);
		}
		this.b(arg0);
	}

	@OriginalMember(owner = "client!jaclib/peer/tc", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.b(true);
	}

	@OriginalMember(owner = "client!jaclib/peer/tc", name = "a", descriptor = "(ZLclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) boolean arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a(0);
		if (this.a == arg1) {
			this.a = arg1.b;
		}
		if (arg1 == this.b) {
			this.b = arg1.a;
		}
		if (arg1.a != null) {
			arg1.a.b = arg1.b;
		}
		if (arg1.b != null) {
			arg1.b.a = arg1.a;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/tc", name = "b", descriptor = "(Z)V")
	private void b(@OriginalArg(0) boolean arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.c.poll();
			if (local3 == null) {
				return;
			}
			@Pc(9) PeerReference local9 = (PeerReference) local3;
			this.a(true, local9);
		}
	}
}
