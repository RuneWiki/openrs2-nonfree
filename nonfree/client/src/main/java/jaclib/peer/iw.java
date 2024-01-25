package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/iw")
public final class iw {

	@OriginalMember(owner = "client!jaclib/peer/iw", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/iw", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/iw", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/iw", name = "a", descriptor = "(I)V")
	private void a(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.b.poll();
			if (local3 == null) {
				return;
			}
			@Pc(10) PeerReference local10 = (PeerReference) local3;
			this.a(local10, (int) 760);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/iw", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.b(-121);
		if (arg0 == this.c) {
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

	@OriginalMember(owner = "client!jaclib/peer/iw", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.a(-2698);
		while (this.c != null) {
			this.a(this.c, (int) 760);
		}
		this.a(-2698);
	}

	@OriginalMember(owner = "client!jaclib/peer/iw", name = "c", descriptor = "(I)V")
	public void c(@OriginalArg(0) int arg0) {
		this.a(-2698);
	}

	@OriginalMember(owner = "client!jaclib/peer/iw", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.a = null;
		arg0.b = this.c;
		if (this.a == null) {
			this.a = arg0;
		} else {
			this.c.a = arg0;
		}
		this.c = arg0;
	}
}
