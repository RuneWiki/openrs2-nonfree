package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/cv")
public final class cv {

	@OriginalMember(owner = "client!jaclib/peer/cv", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/cv", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/cv", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/cv", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.a((byte) 16);
		while (this.c != null) {
			this.a(arg0 ^ 0xFFFFC7D7, this.c);
		}
		this.a((byte) 16);
	}

	@OriginalMember(owner = "client!jaclib/peer/cv", name = "a", descriptor = "(B)V")
	private void a(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.b.poll();
			if (local3 == null) {
				return;
			}
			@Pc(8) PeerReference local8 = (PeerReference) local3;
			this.a((int) 30812, local8);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/cv", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.b(0);
		if (this.a == arg1) {
			this.a = arg1.a;
		}
		if (arg1 == this.c) {
			this.c = arg1.b;
		}
		if (arg1.a != null) {
			arg1.a.b = arg1.b;
		}
		if (arg1.b != null) {
			arg1.b.a = arg1.a;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/cv", name = "b", descriptor = "(B)V")
	public void b(@OriginalArg(0) byte arg0) {
		this.a((byte) 16);
	}

	@OriginalMember(owner = "client!jaclib/peer/cv", name = "a", descriptor = "(BLclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) byte arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.b = this.c;
		arg1.a = null;
		if (this.a == null) {
			this.a = arg1;
		} else {
			this.c.a = arg1;
		}
		this.c = arg1;
	}
}
