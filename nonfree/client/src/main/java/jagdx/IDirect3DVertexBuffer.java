package jagdx;

import jaclib.memory.Source;
import jaclib.peer.IUnknown;
import jaclib.peer.pba;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DVertexBuffer")
public final class IDirect3DVertexBuffer extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "b", descriptor = "I")
	public int b;

	@OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "<init>", descriptor = "(Lclient!jaclib/peer/pba;)V")
	public IDirect3DVertexBuffer(@OriginalArg(0) pba arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "_Update", descriptor = "(JIII)Z")
	private native boolean _Update(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "a", descriptor = "()J")
	@Override
	protected long a() {
		this.b = 0;
		return super.a();
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IIII)Z")
	public boolean a(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null || arg3 > arg0.getSize() + arg1) {
			throw new jha("");
		} else if (this.b + arg2 < arg3) {
			throw new jha("");
		} else {
			return this._Update(arg0.getAddress() + (long) arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "Unlock", descriptor = "()I")
	public native int Unlock();

	@OriginalMember(owner = "client!jagdx/IDirect3DVertexBuffer", name = "Lock", descriptor = "(IIILclient!jagdx/GeometryBuffer;)I")
	public native int Lock(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) GeometryBuffer arg3);
}
