package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/vo")
public final class vo {

	@OriginalMember(owner = "client!jaclib/peer/vo", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/vo", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/vo", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue a = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/vo", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.b((byte) 67);
		while (this.c != null) {
			this.a(true, this.c);
		}
		this.b((byte) 77);
	}

	@OriginalMember(owner = "client!jaclib/peer/vo", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a = null;
		arg1.b = this.c;
		if (this.b == null) {
			this.b = arg1;
		} else {
			this.c.a = arg1;
		}
		this.c = arg1;
	}

	@OriginalMember(owner = "client!jaclib/peer/vo", name = "a", descriptor = "(ZLclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) boolean arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a(0);
		if (this.b == arg1) {
			this.b = arg1.a;
		}
		if (this.c == arg1) {
			this.c = arg1.b;
		}
		if (arg1.a != null) {
			arg1.a.b = arg1.b;
		}
		if (arg1.b != null) {
			arg1.b.a = arg1.a;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/vo", name = "a", descriptor = "(B)V")
	public void a(@OriginalArg(0) byte arg0) {
		this.b((byte) 61);
	}

	@OriginalMember(owner = "client!jaclib/peer/vo", name = "b", descriptor = "(B)V")
	private void b(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.a.poll();
			if (local3 == null) {
				return;
			}
			@Pc(9) PeerReference local9 = (PeerReference) local3;
			this.a(true, local9);
		}
	}
}
