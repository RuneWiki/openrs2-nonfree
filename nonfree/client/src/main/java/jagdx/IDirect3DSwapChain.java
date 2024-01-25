package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.fk;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jagdx/IDirect3DSwapChain")
public final class IDirect3DSwapChain extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "b", descriptor = "Lclient!jaclib/peer/fk;")
	private final fk b;

	@OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "<init>", descriptor = "(Lclient!jaclib/peer/fk;)V")
	public IDirect3DSwapChain(@OriginalArg(0) fk arg0) {
		super(arg0);
		this.b = arg0;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "Present", descriptor = "(I)I")
	public native int Present(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "_GetBackBuffer", descriptor = "(IILclient!jagdx/IDirect3DSurface;)I")
	private native int _GetBackBuffer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) IDirect3DSurface arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DSwapChain", name = "a", descriptor = "(II)Lclient!jagdx/IDirect3DSurface;")
	public IDirect3DSurface a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) IDirect3DSurface local5 = new IDirect3DSurface(this.b);
		@Pc(11) int local11 = this._GetBackBuffer(arg0, arg1, local5);
		if (wu.a(99, (int) local11)) {
			throw new di(String.valueOf(local11));
		}
		return local5;
	}
}
