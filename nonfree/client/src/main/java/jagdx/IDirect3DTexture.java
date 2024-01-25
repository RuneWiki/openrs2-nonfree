package jagdx;

import jaclib.peer.dba;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DTexture")
public final class IDirect3DTexture extends IDirect3DBaseTexture {

	@OriginalMember(owner = "client!jagdx/IDirect3DTexture", name = "<init>", descriptor = "(Lclient!jaclib/peer/dba;)V")
	public IDirect3DTexture(@OriginalArg(0) dba arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DTexture", name = "UnlockRect", descriptor = "(I)Z")
	public native boolean UnlockRect(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DTexture", name = "LockRect", descriptor = "(IIIIIILclient!jagdx/PixelBuffer;)I")
	public native int LockRect(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) PixelBuffer arg6);
}
