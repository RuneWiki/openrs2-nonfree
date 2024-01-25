package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/mk")
public final class mk {

	@OriginalMember(owner = "client!jaclib/peer/mk", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/mk", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/mk", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue a = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/mk", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a = null;
		arg0.b = this.c;
		if (this.b == null) {
			this.b = arg0;
		} else {
			this.c.a = arg0;
		}
		this.c = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/mk", name = "b", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void b(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a(arg1 + 24871);
		if (this.c == arg0) {
			this.c = arg0.b;
		}
		if (this.b == arg0) {
			this.b = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/mk", name = "a", descriptor = "(B)V")
	private void a(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.a.poll();
			if (local3 == null) {
				return;
			}
			@Pc(8) PeerReference local8 = (PeerReference) local3;
			this.b(local8, -24995);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/mk", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.a((byte) 86);
	}

	@OriginalMember(owner = "client!jaclib/peer/mk", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.a((byte) -57);
		while (this.c != null) {
			this.b(this.c, -24995);
		}
		this.a((byte) 127);
	}
}
