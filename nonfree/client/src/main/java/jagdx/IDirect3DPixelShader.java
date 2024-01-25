package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.mba;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DPixelShader")
public final class IDirect3DPixelShader extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DPixelShader", name = "<init>", descriptor = "(Lclient!jaclib/peer/mba;)V")
	public IDirect3DPixelShader(@OriginalArg(0) mba arg0) {
		super(arg0);
	}
}
