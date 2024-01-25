package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/pba")
public final class pba {

	@OriginalMember(owner = "client!jaclib/peer/pba", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/pba", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/pba", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/pba", name = "a", descriptor = "(B)V")
	public void a(@OriginalArg(0) byte arg0) {
		this.a(arg0 - 22496);
		while (this.a != null) {
			this.b(-105, this.a);
		}
		this.a((int) -22448);
	}

	@OriginalMember(owner = "client!jaclib/peer/pba", name = "b", descriptor = "(B)V")
	public void b(@OriginalArg(0) byte arg0) {
		this.a((int) -22448);
	}

	@OriginalMember(owner = "client!jaclib/peer/pba", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.b = null;
		arg1.a = this.a;
		if (this.c == null) {
			this.c = arg1;
		} else {
			this.a.b = arg1;
		}
		this.a = arg1;
	}

	@OriginalMember(owner = "client!jaclib/peer/pba", name = "a", descriptor = "(I)V")
	private void a(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(9) Reference local9 = this.b.poll();
			if (local9 == null) {
				return;
			}
			@Pc(14) PeerReference local14 = (PeerReference) local9;
			this.b(-87, local14);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/pba", name = "b", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	private void b(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.b(-8405);
		if (this.a == arg1) {
			this.a = arg1.a;
		}
		if (this.c == arg1) {
			this.c = arg1.b;
		}
		if (arg1.b != null) {
			arg1.b.a = arg1.a;
		}
		if (arg1.a != null) {
			arg1.a.b = arg1.b;
		}
	}
}
