package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/er")
public final class er {

	@OriginalMember(owner = "client!jaclib/peer/er", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/er", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/er", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue c = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/er", name = "a", descriptor = "(B)V")
	private void a(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(11) Reference local11 = this.c.poll();
			if (local11 == null) {
				return;
			}
			@Pc(17) PeerReference local17 = (PeerReference) local11;
			this.b(local17, -14535);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/er", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
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

	@OriginalMember(owner = "client!jaclib/peer/er", name = "b", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void b(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a(true);
		if (this.b == arg0) {
			this.b = arg0.a;
		}
		if (arg0 == this.a) {
			this.a = arg0.b;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/er", name = "b", descriptor = "(B)V")
	public void b(@OriginalArg(0) byte arg0) {
		this.a((byte) -35);
	}

	@OriginalMember(owner = "client!jaclib/peer/er", name = "a", descriptor = "(Z)V")
	public void a(@OriginalArg(0) boolean arg0) {
		this.a((byte) -111);
		while (this.a != null) {
			this.b(this.a, -14535);
		}
		this.a((byte) -110);
	}
}
