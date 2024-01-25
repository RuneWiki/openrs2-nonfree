package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/jd")
public final class jd {

	@OriginalMember(owner = "client!jaclib/peer/jd", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/jd", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/jd", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue a = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/jd", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.b = null;
		arg0.a = this.c;
		if (this.b == null) {
			this.b = arg0;
		} else {
			this.c.b = arg0;
		}
		this.c = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/jd", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.b(15119);
	}

	@OriginalMember(owner = "client!jaclib/peer/jd", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a((int) -5352);
		if (this.c == arg1) {
			this.c = arg1.a;
		}
		if (this.b == arg1) {
			this.b = arg1.b;
		}
		if (arg1.b != null) {
			arg1.b.a = arg1.a;
		}
		if (arg1.a != null) {
			arg1.a.b = arg1.b;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/jd", name = "b", descriptor = "(I)V")
	private void b(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.a.poll();
			if (local3 == null) {
				return;
			}
			@Pc(9) PeerReference local9 = (PeerReference) local3;
			this.a(arg0 - 15080, local9);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/jd", name = "c", descriptor = "(I)V")
	public void c(@OriginalArg(0) int arg0) {
		this.b(15119);
		while (this.c != null) {
			this.a(-120, this.c);
		}
		this.b(15119);
	}
}
