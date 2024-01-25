package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/qr")
public final class qr {

	@OriginalMember(owner = "client!jaclib/peer/qr", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/qr", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/qr", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue a = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/qr", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	public void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.b = null;
		arg0.a = this.b;
		if (this.c == null) {
			this.c = arg0;
		} else {
			this.b.b = arg0;
		}
		this.b = arg0;
	}

	@OriginalMember(owner = "client!jaclib/peer/qr", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;I)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) int arg1) {
		arg0.a(false);
		if (this.b == arg0) {
			this.b = arg0.a;
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

	@OriginalMember(owner = "client!jaclib/peer/qr", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.b(arg0 + 2418);
	}

	@OriginalMember(owner = "client!jaclib/peer/qr", name = "b", descriptor = "(I)V")
	private void b(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(7) Reference local7 = this.a.poll();
			if (local7 == null) {
				return;
			}
			@Pc(13) PeerReference local13 = (PeerReference) local7;
			this.a(local13, arg0 + 15579);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/qr", name = "c", descriptor = "(I)V")
	public void c(@OriginalArg(0) int arg0) {
		this.b(arg0 - 43981);
		while (this.b != null) {
			this.a(this.b, (int) -128);
		}
		this.b(-15480);
	}
}
