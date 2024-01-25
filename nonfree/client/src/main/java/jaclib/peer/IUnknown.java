package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/IUnknown")
public class IUnknown extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "<init>", descriptor = "(Lclient!jaclib/peer/pi;)V")
	public IUnknown(@OriginalArg(0) pi arg0) {
		this.reference = new IUnknownReference(this, arg0);
	}

	@OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "a", descriptor = "(Z)J")
	public final long a(@OriginalArg(0) boolean arg0) {
		return super.a();
	}

	@OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "AddRef", descriptor = "()J")
	private native long AddRef();
}
