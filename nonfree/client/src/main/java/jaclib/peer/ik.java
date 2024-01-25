package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/ik")
public final class ik {

	@OriginalMember(owner = "client!jaclib/peer/ik", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/ik", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/ik", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/ik", name = "a", descriptor = "(B)V")
	public void a(@OriginalArg(0) byte arg0) {
		this.b((byte) 34);
		while (this.a != null) {
			this.a(115, this.a);
		}
		this.b((byte) 34);
	}

	@OriginalMember(owner = "client!jaclib/peer/ik", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a = this.a;
		arg0.b = null;
		if (this.c == null) {
			this.c = arg0;
		} else {
			this.a.b = arg0;
		}
		this.a = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/ik", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.b((byte) 34);
	}

	@OriginalMember(owner = "client!jaclib/peer/ik", name = "b", descriptor = "(B)V")
	private void b(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.b.poll();
			if (local3 == null) {
				return;
			}
			@Pc(9) PeerReference local9 = (PeerReference) local3;
			this.a(121, local9);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/ik", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a(0);
		if (arg1 == this.a) {
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
