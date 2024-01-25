package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/io")
public final class io {

	@OriginalMember(owner = "client!jaclib/peer/io", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/io", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/io", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue a = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/io", name = "b", descriptor = "(I)V")
	public void b(@OriginalArg(0) int arg0) {
		this.c(9379);
		while (this.b != null) {
			this.a(-24978, this.b);
		}
		this.c(9379);
	}

	@OriginalMember(owner = "client!jaclib/peer/io", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	private void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a((byte) 117);
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

	@OriginalMember(owner = "client!jaclib/peer/io", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a = this.b;
		arg0.b = null;
		if (this.c == null) {
			this.c = arg0;
		} else {
			this.b.b = arg0;
		}
		this.b = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/io", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.c(9379);
	}

	@OriginalMember(owner = "client!jaclib/peer/io", name = "c", descriptor = "(I)V")
	private void c(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(3) Reference local3 = this.a.poll();
			if (local3 == null) {
				return;
			}
			@Pc(11) PeerReference local11 = (PeerReference) local3;
			this.a(-24978, local11);
		}
	}
}
