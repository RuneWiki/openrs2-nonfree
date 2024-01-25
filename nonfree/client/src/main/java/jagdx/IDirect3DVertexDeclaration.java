package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.uca;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DVertexDeclaration")
public final class IDirect3DVertexDeclaration extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DVertexDeclaration", name = "<init>", descriptor = "(Lclient!jaclib/peer/uca;)V")
	public IDirect3DVertexDeclaration(@OriginalArg(0) uca arg0) {
		super(arg0);
	}
}
