package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/ca")
public final class ca {

	@OriginalMember(owner = "client!jaclib/peer/ca", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/ca", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/ca", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue c = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/ca", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a((byte) -102);
		if (this.b == arg0) {
			this.b = arg0.b;
		}
		if (arg0 == this.a) {
			this.a = arg0.a;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/ca", name = "b", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	public void b(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.b = null;
		arg0.a = this.a;
		if (this.b == null) {
			this.b = arg0;
		} else {
			this.a.b = arg0;
		}
		this.a = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/ca", name = "a", descriptor = "(B)V")
	private void a(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(7) Reference local7 = this.c.poll();
			if (local7 == null) {
				return;
			}
			@Pc(13) PeerReference local13 = (PeerReference) local7;
			this.a(local13, -23765);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/ca", name = "a", descriptor = "(Z)V")
	public void a(@OriginalArg(0) boolean arg0) {
		this.a((byte) 122);
	}

	@OriginalMember(owner = "client!jaclib/peer/ca", name = "b", descriptor = "(B)V")
	public void b(@OriginalArg(0) byte arg0) {
		this.a((byte) 108);
		while (this.a != null) {
			this.a(this.a, -23765);
		}
		this.a((byte) 122);
	}
}
