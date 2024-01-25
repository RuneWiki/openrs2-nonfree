package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/bw")
public final class bw {

	@OriginalMember(owner = "client!jaclib/peer/bw", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/bw", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/bw", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/bw", name = "a", descriptor = "(B)V")
	public void a(@OriginalArg(0) byte arg0) {
		this.a((int) -32045);
	}

	@OriginalMember(owner = "client!jaclib/peer/bw", name = "b", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a = null;
		arg1.b = this.a;
		if (this.c == null) {
			this.c = arg1;
		} else {
			this.a.a = arg1;
		}
		this.a = arg1;
	}

	@OriginalMember(owner = "client!jaclib/peer/bw", name = "a", descriptor = "(I)V")
	private void a(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.b.poll();
			if (local3 == null) {
				return;
			}
			@Pc(11) PeerReference local11 = (PeerReference) local3;
			this.a(arg0 ^ 0xFFFFBB6A, local11);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/bw", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.b((byte) -73);
		if (this.a == arg1) {
			this.a = arg1.b;
		}
		if (arg1 == this.c) {
			this.c = arg1.a;
		}
		if (arg1.a != null) {
			arg1.a.b = arg1.b;
		}
		if (arg1.b != null) {
			arg1.b.a = arg1.a;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/bw", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.a((int) -32045);
		while (this.a != null) {
			this.a(14777, this.a);
		}
		this.a((int) -32045);
	}
}
