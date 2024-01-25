package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/bda")
public final class bda {

	@OriginalMember(owner = "client!jaclib/peer/bda", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/bda", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/bda", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/bda", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.b(10633);
		while (this.a != null) {
			this.b(this.a, (byte) -75);
		}
		this.b(arg0 ^ 0x20AD);
	}

	@OriginalMember(owner = "client!jaclib/peer/bda", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.b = this.a;
		arg0.a = null;
		if (this.c == null) {
			this.c = arg0;
		} else {
			this.a.a = arg0;
		}
		this.a = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/bda", name = "b", descriptor = "(I)V")
	private void b(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(7) Reference local7 = this.b.poll();
			if (local7 == null) {
				return;
			}
			@Pc(12) PeerReference local12 = (PeerReference) local7;
			this.b(local12, (byte) -38);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/bda", name = "c", descriptor = "(I)V")
	public void c(@OriginalArg(0) int arg0) {
		this.b(arg0 ^ 0xFFFFE6E4);
	}

	@OriginalMember(owner = "client!jaclib/peer/bda", name = "b", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	private void b(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.b(-79);
		if (this.a == arg0) {
			this.a = arg0.b;
		}
		if (arg0 == this.c) {
			this.c = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
	}
}
