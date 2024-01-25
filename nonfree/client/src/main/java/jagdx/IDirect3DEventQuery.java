package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.ge;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DEventQuery")
public final class IDirect3DEventQuery extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DEventQuery", name = "<init>", descriptor = "(Lclient!jaclib/peer/ge;)V")
	public IDirect3DEventQuery(@OriginalArg(0) ge arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DEventQuery", name = "Issue", descriptor = "()I")
	public native int Issue();

	@OriginalMember(owner = "client!jagdx/IDirect3DEventQuery", name = "IsSignaled", descriptor = "()I")
	public native int IsSignaled();
}
