package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/dba")
public final class dba {

	@OriginalMember(owner = "client!jaclib/peer/dba", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/dba", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/dba", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/dba", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a((byte) 84);
		if (arg0 == this.c) {
			this.c = arg0.a;
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

	@OriginalMember(owner = "client!jaclib/peer/dba", name = "a", descriptor = "(I)V")
	private void a(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(7) Reference local7 = this.b.poll();
			if (local7 == null) {
				return;
			}
			@Pc(13) PeerReference local13 = (PeerReference) local7;
			this.a(local13, 12600);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/dba", name = "a", descriptor = "(Z)V")
	public void a(@OriginalArg(0) boolean arg0) {
		this.a(-85);
	}

	@OriginalMember(owner = "client!jaclib/peer/dba", name = "b", descriptor = "(Z)V")
	public void b(@OriginalArg(0) boolean arg0) {
		this.a(-103);
		while (this.a != null) {
			this.a(this.a, 12600);
		}
		this.a(-101);
	}

	@OriginalMember(owner = "client!jaclib/peer/dba", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a = null;
		arg1.b = this.a;
		if (this.c == null) {
			this.c = arg1;
		} else {
			this.a.a = arg1;
		}
		this.a = arg1;
	}
}
