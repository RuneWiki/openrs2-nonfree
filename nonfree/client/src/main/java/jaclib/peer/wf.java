package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/wf")
public final class wf {

	@OriginalMember(owner = "client!jaclib/peer/wf", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/wf", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/wf", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue a = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/wf", name = "a", descriptor = "(B)V")
	public void a(@OriginalArg(0) byte arg0) {
		this.a((int) 15165);
	}

	@OriginalMember(owner = "client!jaclib/peer/wf", name = "a", descriptor = "(BLclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) byte arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a = this.b;
		arg1.b = null;
		if (this.c == null) {
			this.c = arg1;
		} else {
			this.b.b = arg1;
		}
		this.b = arg1;
	}

	@OriginalMember(owner = "client!jaclib/peer/wf", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a(true);
		if (this.b == arg1) {
			this.b = arg1.a;
		}
		if (this.c == arg1) {
			this.c = arg1.b;
		}
		if (arg1.b != null) {
			arg1.b.a = arg1.a;
		}
		if (arg1.a != null) {
			arg1.a.b = arg1.b;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/wf", name = "a", descriptor = "(I)V")
	private void a(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.a.poll();
			if (local3 == null) {
				return;
			}
			@Pc(9) PeerReference local9 = (PeerReference) local3;
			this.a((int) 16087, local9);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/wf", name = "b", descriptor = "(B)V")
	public void b(@OriginalArg(0) byte arg0) {
		this.a((int) 15165);
		while (this.b != null) {
			this.a((int) 16087, this.b);
		}
		this.a((int) 15165);
	}
}
