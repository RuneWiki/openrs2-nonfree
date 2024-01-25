package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/pi")
public final class pi {

	@OriginalMember(owner = "client!jaclib/peer/pi", name = "a", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference a;

	@OriginalMember(owner = "client!jaclib/peer/pi", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/pi", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue b = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/pi", name = "a", descriptor = "(ILclient!jaclib/peer/PeerReference;)V")
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) PeerReference arg1) {
		arg1.a = this.a;
		arg1.b = null;
		if (this.c == null) {
			this.c = arg1;
		} else {
			this.a.b = arg1;
		}
		this.a = arg1;
	}

	@OriginalMember(owner = "client!jaclib/peer/pi", name = "a", descriptor = "(Z)V")
	public void a(@OriginalArg(0) boolean arg0) {
		this.a((byte) -75);
		while (this.a != null) {
			this.a(this.a, (byte) -8);
		}
		this.a((byte) -40);
	}

	@OriginalMember(owner = "client!jaclib/peer/pi", name = "a", descriptor = "(B)V")
	private void a(@OriginalArg(0) byte arg0) {
		while (true) {
			@Pc(7) Reference local7 = this.b.poll();
			if (local7 == null) {
				return;
			}
			@Pc(14) PeerReference local14 = (PeerReference) local7;
			this.a(local14, (byte) -8);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/pi", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.a((byte) -16);
		if (arg0 == this.c) {
			this.c = arg0.b;
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

	@OriginalMember(owner = "client!jaclib/peer/pi", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.a((byte) -81);
	}
}
