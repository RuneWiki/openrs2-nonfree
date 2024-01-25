package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/am")
public final class am {

	@OriginalMember(owner = "client!jaclib/peer/am", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/am", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/am", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue c = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/am", name = "a", descriptor = "(B)V")
	public void a(@OriginalArg(0) byte arg0) {
		this.a((int) 119);
	}

	@OriginalMember(owner = "client!jaclib/peer/am", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.b = this.b;
		arg0.a = null;
		if (this.a == null) {
			this.a = arg0;
		} else {
			this.b.a = arg0;
		}
		this.b = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/am", name = "b", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	private void b(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.b((byte) 101);
		if (arg0 == this.b) {
			this.b = arg0.b;
		}
		if (this.a == arg0) {
			this.a = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/am", name = "b", descriptor = "(B)V")
	public void b(@OriginalArg(0) byte arg0) {
		this.a((int) 117);
		while (this.b != null) {
			this.b(this.b, (byte) -26);
		}
		this.a((int) 90);
	}

	@OriginalMember(owner = "client!jaclib/peer/am", name = "a", descriptor = "(I)V")
	private void a(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(10) Reference local10 = this.c.poll();
			if (local10 == null) {
				return;
			}
			@Pc(16) PeerReference local16 = (PeerReference) local10;
			this.b(local16, (byte) -26);
		}
	}
}
