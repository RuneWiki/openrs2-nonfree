package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/jv")
public final class jv {

	@OriginalMember(owner = "client!jaclib/peer/jv", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/jv", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/jv", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/jv", name = "a", descriptor = "(B)V")
	public void a(@OriginalArg(0) byte arg0) {
		this.b((byte) 42);
	}

	@OriginalMember(owner = "client!jaclib/peer/jv", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a((int) -14186);
		if (arg1 == this.c) {
			this.c = arg1.b;
		}
		if (arg1 == this.a) {
			this.a = arg1.a;
		}
		if (arg1.a != null) {
			arg1.a.b = arg1.b;
		}
		if (arg1.b != null) {
			arg1.b.a = arg1.a;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/jv", name = "b", descriptor = "(B)V")
	private void b(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.b.poll();
			if (local3 == null) {
				return;
			}
			@Pc(10) PeerReference local10 = (PeerReference) local3;
			this.a(arg0 - 31244, local10);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/jv", name = "c", descriptor = "(B)V")
	public void c(@OriginalArg(0) byte arg0) {
		this.b((byte) 42);
		while (this.c != null) {
			this.a(-31202, this.c);
		}
		this.b((byte) 42);
	}

	@OriginalMember(owner = "client!jaclib/peer/jv", name = "b", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a = null;
		arg1.b = this.c;
		if (this.a == null) {
			this.a = arg1;
		} else {
			this.c.a = arg1;
		}
		this.c = arg1;
	}
}
