package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/of")
public final class of {

	@OriginalMember(owner = "client!jaclib/peer/of", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/of", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/of", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/of", name = "a", descriptor = "(B)V")
	public void a(@OriginalArg(0) byte arg0) {
		this.b((byte) -114);
	}

	@OriginalMember(owner = "client!jaclib/peer/of", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.b((byte) -114);
		while (this.a != null) {
			this.a(this.a, 127);
		}
		this.b((byte) -114);
	}

	@OriginalMember(owner = "client!jaclib/peer/of", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.b((byte) 100);
		if (this.a == arg0) {
			this.a = arg0.a;
		}
		if (arg0 == this.c) {
			this.c = arg0.b;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/of", name = "b", descriptor = "(B)V")
	private void b(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.b.poll();
			if (local3 == null) {
				return;
			}
			@Pc(10) PeerReference local10 = (PeerReference) local3;
			this.a(local10, arg0 + 240);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/of", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.b = null;
		arg1.a = this.a;
		if (this.c == null) {
			this.c = arg1;
		} else {
			this.a.b = arg1;
		}
		this.a = arg1;
	}
}
