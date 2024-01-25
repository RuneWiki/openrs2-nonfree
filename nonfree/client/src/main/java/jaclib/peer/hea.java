package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/hea")
public final class hea {

	@OriginalMember(owner = "client!jaclib/peer/hea", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/hea", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/hea", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue c = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/hea", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.a(false);
	}

	@OriginalMember(owner = "client!jaclib/peer/hea", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.b = this.b;
		arg0.a = null;
		if (this.a == null) {
			this.a = arg0;
		} else {
			this.b.a = arg0;
		}
		this.b = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/hea", name = "a", descriptor = "(Z)V")
	private void a(@OriginalArg(0) boolean arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.c.poll();
			if (local3 == null) {
				return;
			}
			@Pc(9) PeerReference local9 = (PeerReference) local3;
			this.a(true, local9);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/hea", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.a(false);
		while (this.b != null) {
			this.a(true, this.b);
		}
		this.a(false);
	}

	@OriginalMember(owner = "client!jaclib/peer/hea", name = "a", descriptor = "(ZLclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) boolean arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a(arg0);
		if (this.a == arg1) {
			this.a = arg1.a;
		}
		if (arg1 == this.b) {
			this.b = arg1.b;
		}
		if (arg1.a != null) {
			arg1.a.b = arg1.b;
		}
		if (arg1.b != null) {
			arg1.b.a = arg1.a;
		}
	}
}
