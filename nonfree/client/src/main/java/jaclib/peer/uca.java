package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/uca")
public final class uca {

	@OriginalMember(owner = "client!jaclib/peer/uca", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/uca", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/uca", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/uca", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.a((byte) -71);
	}

	@OriginalMember(owner = "client!jaclib/peer/uca", name = "a", descriptor = "(B)V")
	private void a(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.b.poll();
			if (local3 == null) {
				return;
			}
			@Pc(10) PeerReference local10 = (PeerReference) local3;
			this.a(local10, -9808);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/uca", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a((int) 0);
		if (arg0 == this.c) {
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

	@OriginalMember(owner = "client!jaclib/peer/uca", name = "a", descriptor = "(BLclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) byte arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a = this.c;
		arg1.b = null;
		if (this.a == null) {
			this.a = arg1;
		} else {
			this.c.b = arg1;
		}
		this.c = arg1;
	}

	@OriginalMember(owner = "client!jaclib/peer/uca", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.a((byte) -102);
		while (this.c != null) {
			this.a(this.c, -9808);
		}
		this.a((byte) -109);
	}
}
