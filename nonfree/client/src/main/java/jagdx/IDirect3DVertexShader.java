package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.ge;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DVertexShader")
public final class IDirect3DVertexShader extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DVertexShader", name = "<init>", descriptor = "(Lclient!jaclib/peer/ge;)V")
	public IDirect3DVertexShader(@OriginalArg(0) ge arg0) {
		super(arg0);
	}
}
