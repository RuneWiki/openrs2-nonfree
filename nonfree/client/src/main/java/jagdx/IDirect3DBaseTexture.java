package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.jv;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DBaseTexture")
public class IDirect3DBaseTexture extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DBaseTexture", name = "<init>", descriptor = "(Lclient!jaclib/peer/jv;)V")
	public IDirect3DBaseTexture(@OriginalArg(0) jv arg0) {
		super(arg0);
	}
}
