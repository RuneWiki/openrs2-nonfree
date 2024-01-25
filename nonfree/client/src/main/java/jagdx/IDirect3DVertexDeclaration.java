package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.ow;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DVertexDeclaration")
public final class IDirect3DVertexDeclaration extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DVertexDeclaration", name = "<init>", descriptor = "(Lclient!jaclib/peer/ow;)V")
	public IDirect3DVertexDeclaration(@OriginalArg(0) ow arg0) {
		super(arg0);
	}
}
