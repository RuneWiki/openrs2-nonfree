package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/ge")
public final class ge {

	@OriginalMember(owner = "client!jaclib/peer/ge", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/ge", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/ge", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue c = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/ge", name = "a", descriptor = "(B)V")
	private void a(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.c.poll();
			if (local3 == null) {
				return;
			}
			@Pc(10) PeerReference local10 = (PeerReference) local3;
			this.a(116, local10);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/ge", name = "b", descriptor = "(B)V")
	public void b(@OriginalArg(0) byte arg0) {
		this.a((byte) -44);
		while (this.b != null) {
			this.a(117, this.b);
		}
		this.a((byte) -72);
	}

	@OriginalMember(owner = "client!jaclib/peer/ge", name = "a", descriptor = "(Z)V")
	public void a(@OriginalArg(0) boolean arg0) {
		this.a((byte) -56);
	}

	@OriginalMember(owner = "client!jaclib/peer/ge", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;Z)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) boolean arg1) {
		arg0.a = null;
		arg0.b = this.b;
		if (this.a == null) {
			this.a = arg0;
		} else {
			this.b.a = arg0;
		}
		this.b = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/ge", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a(2450);
		if (this.a == arg1) {
			this.a = arg1.a;
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
