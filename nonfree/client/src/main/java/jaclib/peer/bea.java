package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/bea")
public final class bea {

	@OriginalMember(owner = "client!jaclib/peer/bea", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/bea", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/bea", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue c = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/bea", name = "a", descriptor = "(B)V")
	public void a(@OriginalArg(0) byte arg0) {
		this.c((byte) -82);
		while (this.b != null) {
			this.a(-54, this.b);
		}
		this.c((byte) -31);
	}

	@OriginalMember(owner = "client!jaclib/peer/bea", name = "b", descriptor = "(B)V")
	public void b(@OriginalArg(0) byte arg0) {
		this.c((byte) -15);
	}

	@OriginalMember(owner = "client!jaclib/peer/bea", name = "a", descriptor = "(ZLclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) boolean arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a = this.b;
		arg1.b = null;
		if (this.a == null) {
			this.a = arg1;
		} else {
			this.b.b = arg1;
		}
		this.b = arg1;
	}

	@OriginalMember(owner = "client!jaclib/peer/bea", name = "c", descriptor = "(B)V")
	private void c(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.c.poll();
			if (local3 == null) {
				return;
			}
			@Pc(9) PeerReference local9 = (PeerReference) local3;
			this.a(-72, local9);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/bea", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a(-23);
		if (arg1 == this.a) {
			this.a = arg1.b;
		}
		if (this.b == arg1) {
			this.b = arg1.a;
		}
		if (arg1.b != null) {
			arg1.b.a = arg1.a;
		}
		if (arg1.a != null) {
			arg1.a.b = arg1.b;
		}
	}
}
