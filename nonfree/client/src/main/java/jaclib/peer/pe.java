package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/pe")
public final class pe {

	@OriginalMember(owner = "client!jaclib/peer/pe", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/pe", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/pe", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue a = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/pe", name = "a", descriptor = "(I)V")
	private void a(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(11) Reference local11 = this.a.poll();
			if (local11 == null) {
				return;
			}
			@Pc(17) PeerReference local17 = (PeerReference) local11;
			this.a(local17, (byte) 12);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/pe", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.a(0);
		if (arg0 == this.b) {
			this.b = arg0.b;
		}
		if (arg0 == this.c) {
			this.c = arg0.a;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/pe", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a = this.c;
		arg1.b = null;
		if (this.b == null) {
			this.b = arg1;
		} else {
			this.c.b = arg1;
		}
		this.c = arg1;
	}

	@OriginalMember(owner = "client!jaclib/peer/pe", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.a(-88);
	}

	@OriginalMember(owner = "client!jaclib/peer/pe", name = "c", descriptor = "(I)V")
	public void c(@OriginalArg(0) int arg0) {
		this.a(105);
		while (this.c != null) {
			this.a(this.c, (byte) 120);
		}
		this.a(41);
	}
}
