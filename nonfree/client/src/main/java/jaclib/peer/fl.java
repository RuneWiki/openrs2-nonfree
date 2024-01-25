package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/fl")
public final class fl {

	@OriginalMember(owner = "client!jaclib/peer/fl", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/fl", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/fl", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/fl", name = "a", descriptor = "(Z)V")
	public void a(@OriginalArg(0) boolean arg0) {
		this.a(-49);
		while (this.c != null) {
			this.a(this.c, (int) -32427);
		}
		this.a(-52);
	}

	@OriginalMember(owner = "client!jaclib/peer/fl", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.a = null;
		arg0.b = this.c;
		if (this.a == null) {
			this.a = arg0;
		} else {
			this.c.a = arg0;
		}
		this.c = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/fl", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a(arg1 + 32545);
		if (this.c == arg0) {
			this.c = arg0.b;
		}
		if (arg0 == this.a) {
			this.a = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/fl", name = "a", descriptor = "(I)V")
	private void a(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.b.poll();
			if (local3 == null) {
				return;
			}
			@Pc(8) PeerReference local8 = (PeerReference) local3;
			this.a(local8, (int) -32427);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/fl", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.a(-58);
	}
}
