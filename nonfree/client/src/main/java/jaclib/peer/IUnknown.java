package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/IUnknown")
public class IUnknown extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "<init>", descriptor = "(Lclient!jaclib/peer/ca;)V")
	public IUnknown(@OriginalArg(0) ca arg0) {
		this.reference = new IUnknownReference(this, arg0);
	}

	@OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "b", descriptor = "(I)J")
	public final long b(@OriginalArg(0) int arg0) {
		return super.a();
	}

	@OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "AddRef", descriptor = "()J")
	private native long AddRef();
}
