package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/ku")
public final class ku {

	@OriginalMember(owner = "client!jaclib/peer/ku", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/ku", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/ku", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/ku", name = "a", descriptor = "(BLclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) byte arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a = null;
		arg1.b = this.c;
		if (this.a == null) {
			this.a = arg1;
		} else {
			this.c.a = arg1;
		}
		this.c = arg1;
	}

	@OriginalMember(owner = "client!jaclib/peer/ku", name = "a", descriptor = "(Z)V")
	private void a(@OriginalArg(0) boolean arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.b.poll();
			if (local3 == null) {
				return;
			}
			@Pc(9) PeerReference local9 = (PeerReference) local3;
			this.a(local9, 14090);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/ku", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.a(false);
	}

	@OriginalMember(owner = "client!jaclib/peer/ku", name = "a", descriptor = "(B)V")
	public void a(@OriginalArg(0) byte arg0) {
		this.a(false);
		while (this.c != null) {
			this.a(this.c, 14090);
		}
		this.a(false);
	}

	@OriginalMember(owner = "client!jaclib/peer/ku", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a(false);
		if (this.c == arg0) {
			this.c = arg0.b;
		}
		if (arg0 == this.a) {
			this.a = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
	}
}
