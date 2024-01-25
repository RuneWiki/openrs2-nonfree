package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/wl")
public final class wl {

	@OriginalMember(owner = "client!jaclib/peer/wl", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/wl", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/wl", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue c = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/wl", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.a((byte) 34);
		while (this.a != null) {
			this.a(this.a, -2538);
		}
		this.a((byte) 13);
	}

	@OriginalMember(owner = "client!jaclib/peer/wl", name = "a", descriptor = "(B)V")
	private void a(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.c.poll();
			if (local3 == null) {
				return;
			}
			@Pc(9) PeerReference local9 = (PeerReference) local3;
			this.a(local9, -2538);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/wl", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.a((byte) 74);
	}

	@OriginalMember(owner = "client!jaclib/peer/wl", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a((byte) -122);
		if (arg0 == this.b) {
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

	@OriginalMember(owner = "client!jaclib/peer/wl", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.b = this.a;
		arg1.a = null;
		if (this.b == null) {
			this.b = arg1;
		} else {
			this.a.a = arg1;
		}
		this.a = arg1;
	}
}
