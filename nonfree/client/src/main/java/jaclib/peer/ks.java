package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/ks")
public final class ks {

	@OriginalMember(owner = "client!jaclib/peer/ks", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/ks", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/ks", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/ks", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.b((byte) -92);
		while (this.c != null) {
			this.a(this.c, 9980);
		}
		this.b((byte) -92);
	}

	@OriginalMember(owner = "client!jaclib/peer/ks", name = "a", descriptor = "(ZLclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) boolean arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.b = null;
		arg1.a = this.c;
		if (this.a == null) {
			this.a = arg1;
		} else {
			this.c.b = arg1;
		}
		this.c = arg1;
	}

	@OriginalMember(owner = "client!jaclib/peer/ks", name = "a", descriptor = "(B)V")
	public void a(@OriginalArg(0) byte arg0) {
		this.b((byte) -92);
	}

	@OriginalMember(owner = "client!jaclib/peer/ks", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a(arg1 - 15697);
		if (this.c == arg0) {
			this.c = arg0.a;
		}
		if (this.a == arg0) {
			this.a = arg0.b;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/ks", name = "b", descriptor = "(B)V")
	private void b(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.b.poll();
			if (local3 == null) {
				return;
			}
			@Pc(9) PeerReference local9 = (PeerReference) local3;
			this.a(local9, arg0 ^ 0xFFFFD958);
		}
	}
}
