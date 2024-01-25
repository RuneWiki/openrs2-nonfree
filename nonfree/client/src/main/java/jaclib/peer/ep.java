package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/ep")
public final class ep {

	@OriginalMember(owner = "client!jaclib/peer/ep", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/ep", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/ep", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue c = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/ep", name = "a", descriptor = "(Z)V")
	public void a(@OriginalArg(0) boolean arg0) {
		this.b((byte) -58);
		while (this.b != null) {
			this.a(this.b, -20076);
		}
		this.b((byte) -58);
	}

	@OriginalMember(owner = "client!jaclib/peer/ep", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.b((byte) -89);
		if (arg0 == this.a) {
			this.a = arg0.b;
		}
		if (this.b == arg0) {
			this.b = arg0.a;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/ep", name = "a", descriptor = "(B)V")
	public void a(@OriginalArg(0) byte arg0) {
		this.b((byte) -58);
	}

	@OriginalMember(owner = "client!jaclib/peer/ep", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a = this.b;
		arg1.b = null;
		if (this.a == null) {
			this.a = arg1;
		} else {
			this.b.b = arg1;
		}
		this.b = arg1;
	}

	@OriginalMember(owner = "client!jaclib/peer/ep", name = "b", descriptor = "(B)V")
	private void b(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(11) Reference local11 = this.c.poll();
			if (local11 == null) {
				return;
			}
			@Pc(16) PeerReference local16 = (PeerReference) local11;
			this.a(local16, -20076);
		}
	}
}
