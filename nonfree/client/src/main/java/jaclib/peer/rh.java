package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/rh")
public final class rh {

	@OriginalMember(owner = "client!jaclib/peer/rh", name = "b", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference b;

	@OriginalMember(owner = "client!jaclib/peer/rh", name = "c", descriptor = "Lclient!jaclib/peer/PeerReference;")
	private PeerReference c;

	@OriginalMember(owner = "client!jaclib/peer/rh", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
	public final ReferenceQueue a = new ReferenceQueue();

	@OriginalMember(owner = "client!jaclib/peer/rh", name = "a", descriptor = "(I)V")
	public void a(@OriginalArg(0) int arg0) {
		this.b(arg0 ^ 0xFFFFDBA1);
	}

	@OriginalMember(owner = "client!jaclib/peer/rh", name = "a", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	private void a(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.a(-87);
		if (this.c == arg0) {
			this.c = arg0.b;
		}
		if (arg0 == this.b) {
			this.b = arg0.a;
		}
		if (arg0.b != null) {
			arg0.b.a = arg0.a;
		}
		if (arg0.a != null) {
			arg0.a.b = arg0.b;
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/rh", name = "a", descriptor = "(Z)V")
	public void a(@OriginalArg(0) boolean arg0) {
		this.b(-102);
		while (this.b != null) {
			this.a(this.b, (byte) 65);
		}
		this.b(-104);
	}

	@OriginalMember(owner = "client!jaclib/peer/rh", name = "b", descriptor = "(I)V")
	private void b(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(10) Reference local10 = this.a.poll();
			if (local10 == null) {
				return;
			}
			@Pc(17) PeerReference local17 = (PeerReference) local10;
			this.a(local17, (byte) 82);
		}
	}

	@OriginalMember(owner = "client!jaclib/peer/rh", name = "b", descriptor = "(Lclient!jaclib/peer/PeerReference;B)V")
	public void b(@OriginalArg(0) PeerReference arg0, @OriginalArg(1) byte arg1) {
		arg0.a = this.b;
		arg0.b = null;
		if (this.c == null) {
			this.c = arg0;
		} else {
			this.b.b = arg0;
		}
		this.b = arg0;
	}
}
