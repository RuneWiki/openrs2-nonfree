package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/dj")
public final class dj {

	@OriginalMember(owner = "client!jaclib/peer/dj", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/dj", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/dj", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue c = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/dj", name = "a", descriptor = "(B)V")
	private void a(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(11) Reference local11 = this.c.poll();
			if (local11 == null) {
				return;
			}
			@Pc(16) PeerReference local16 = (PeerReference) local11;
			this.a((byte) -41, local16);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/dj", name = "b", descriptor = "(B)V")
	public void b(@OriginalArg(0) byte arg0) {
		this.a((byte) -108);
		while (this.b != null) {
			this.a((byte) -41, this.b);
		}
		this.a((byte) -124);
	}

	@OriginalMember(owner = "client!jaclib/peer/dj", name = "c", descriptor = "(B)V")
	public void c(@OriginalArg(0) byte arg0) {
		this.a((byte) -63);
	}

	@OriginalMember(owner = "client!jaclib/peer/dj", name = "a", descriptor = "(ZLclient!jaclib/peer/PeerReference;)V")
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

	@OriginalMember(owner = "client!jaclib/peer/dj", name = "a", descriptor = "(BLclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) byte arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a(arg0 + 30849);
		if (this.a == arg1) {
			this.a = arg1.b;
		}
		if (arg1 == this.b) {
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
