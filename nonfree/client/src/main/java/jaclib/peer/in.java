package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/in")
public final class in {

	@OriginalMember(owner = "client!jaclib/peer/in", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/in", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/in", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue c = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/in", name = "a", descriptor = "(B)V")
	private void a(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(10) Reference local10 = this.c.poll();
			if (local10 == null) {
				return;
			}
			@Pc(17) PeerReference local17 = (PeerReference) local10;
			this.a(local17, (byte) 87);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/in", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.b(0);
		if (arg0 == this.b) {
			this.b = arg0.b;
		}
		if (this.a == arg0) {
			this.a = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/in", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.a((byte) -110);
		while (this.b != null) {
			this.a(this.b, (byte) 87);
		}
		this.a((byte) -110);
	}

	@OriginalMember(owner = "client!jaclib/peer/in", name = "b", descriptor = "(B)V")
	public void b(@OriginalArg(0) byte arg0) {
		this.a((byte) -110);
	}

	@OriginalMember(owner = "client!jaclib/peer/in", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.b = this.b;
		arg1.a = null;
		if (this.a == null) {
			this.a = arg1;
		} else {
			this.b.a = arg1;
		}
		this.b = arg1;
	}
}
