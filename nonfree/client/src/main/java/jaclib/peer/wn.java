package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/wn")
public final class wn {

	@OriginalMember(owner = "client!jaclib/peer/wn", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/wn", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/wn", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue a = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/wn", name = "a", descriptor = "(Z)V")
	public void a(@OriginalArg(0) boolean arg0) {
		this.a(22009);
		while (this.b != null) {
			this.a(true, this.b);
		}
		this.a(22009);
	}

	@OriginalMember(owner = "client!jaclib/peer/wn", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a = null;
		arg0.b = this.b;
		if (this.c == null) {
			this.c = arg0;
		} else {
			this.b.a = arg0;
		}
		this.b = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/wn", name = "b", descriptor = "(Z)V")
	public void b(@OriginalArg(0) boolean arg0) {
		this.a(22009);
	}

	@OriginalMember(owner = "client!jaclib/peer/wn", name = "a", descriptor = "(I)V")
	private void a(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.a.poll();
			if (local3 == null) {
				return;
			}
			@Pc(9) PeerReference local9 = (PeerReference) local3;
			this.a(true, local9);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/wn", name = "a", descriptor = "(ZLclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) boolean arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a(84);
		if (this.c == arg1) {
			this.c = arg1.a;
		}
		if (this.b == arg1) {
			this.b = arg1.b;
		}
		if (arg1.a != null) {
			arg1.a.b = arg1.b;
		}
		if (arg1.b != null) {
			arg1.b.a = arg1.a;
		}
	}
}
