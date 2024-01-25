package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/gca")
public final class gca {

	@OriginalMember(owner = "client!jaclib/peer/gca", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/gca", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/gca", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue a = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/gca", name = "a", descriptor = "(ZLclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) boolean arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.b = null;
		arg1.a = this.b;
		if (this.c == null) {
			this.c = arg1;
		} else {
			this.b.b = arg1;
		}
		this.b = arg1;
	}

	@OriginalMember(owner = "client!jaclib/peer/gca", name = "a", descriptor = "(BLclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) byte arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.b((byte) 75);
		if (this.c == arg1) {
			this.c = arg1.b;
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

	@OriginalMember(owner = "client!jaclib/peer/gca", name = "a", descriptor = "(B)V")
	public void a(@OriginalArg(0) byte arg0) {
		this.a(arg0 - 3);
	}

	@OriginalMember(owner = "client!jaclib/peer/gca", name = "a", descriptor = "(I)V")
	private void a(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(10) Reference local10 = this.a.poll();
			if (local10 == null) {
				return;
			}
			@Pc(17) PeerReference local17 = (PeerReference) local10;
			this.a((byte) -125, local17);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/gca", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.a((int) -85);
		while (this.b != null) {
			this.a((byte) -113, this.b);
		}
		this.a(arg0 ^ 0xFFFFA79E);
	}
}
