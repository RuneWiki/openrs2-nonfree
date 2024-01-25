package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/hr")
public final class hr {

	@OriginalMember(owner = "client!jaclib/peer/hr", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/hr", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/hr", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/hr", name = "a", descriptor = "(BLclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) byte arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a(0);
		if (arg1 == this.c) {
			this.c = arg1.b;
		}
		if (arg1 == this.a) {
			this.a = arg1.a;
		}
		if (arg1.b != null) {
			arg1.b.a = arg1.a;
		}
		if (arg1.a != null) {
			arg1.a.b = arg1.b;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/hr", name = "a", descriptor = "(I)V")
	private void a(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.b.poll();
			if (local3 == null) {
				return;
			}
			@Pc(8) PeerReference local8 = (PeerReference) local3;
			this.a((byte) -64, local8);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/hr", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.a(-93);
		while (this.a != null) {
			this.a((byte) -99, this.a);
		}
		this.a(-117);
	}

	@OriginalMember(owner = "client!jaclib/peer/hr", name = "c", descriptor = "(I)V")
	public void c(@OriginalArg(0) int arg0) {
		this.a(-75);
	}

	@OriginalMember(owner = "client!jaclib/peer/hr", name = "b", descriptor = "(BLclient!jaclib/peer/PeerReference;)V")
	public void b(@OriginalArg(0) byte arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a = this.a;
		arg1.b = null;
		if (this.c == null) {
			this.c = arg1;
		} else {
			this.a.b = arg1;
		}
		this.a = arg1;
	}
}
