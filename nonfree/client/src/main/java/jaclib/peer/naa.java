package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/naa")
public final class naa {

	@OriginalMember(owner = "client!jaclib/peer/naa", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/naa", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/naa", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue c = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/naa", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.b = null;
		arg0.a = this.b;
		if (this.a == null) {
			this.a = arg0;
		} else {
			this.b.b = arg0;
		}
		this.b = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/naa", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a(true);
		if (arg0 == this.b) {
			this.b = arg0.a;
		}
		if (arg0 == this.a) {
			this.a = arg0.b;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/naa", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.b(-17941);
		while (this.b != null) {
			this.a(this.b, (int) 23735);
		}
		this.b(-17941);
	}

	@OriginalMember(owner = "client!jaclib/peer/naa", name = "b", descriptor = "(I)V")
	private void b(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.c.poll();
			if (local3 == null) {
				return;
			}
			@Pc(10) PeerReference local10 = (PeerReference) local3;
			this.a(local10, (int) 23735);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/naa", name = "c", descriptor = "(I)V")
	public void c(@OriginalArg(0) int arg0) {
		this.b(-17941);
	}
}
