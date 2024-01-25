package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.wn;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jagdx/IDirect3D")
public final class IDirect3D extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "b", descriptor = "Lclient!jaclib/peer/wn;")
	private final wn b;

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "a", descriptor = "(ILclient!jaclib/peer/wn;)Lclient!jagdx/IDirect3D;")
	public static IDirect3D a(@OriginalArg(0) int arg0, @OriginalArg(1) wn arg1) {
		@Pc(4) IDirect3D local4 = new IDirect3D(arg1);
		@Pc(8) int local8 = _Direct3DCreate(arg0, local4);
		if (fe.a((int) 32025, local8)) {
			throw new dk(String.valueOf(local8));
		}
		return local4;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "_Direct3DCreate", descriptor = "(ILclient!jagdx/IDirect3D;)I")
	private static native int _Direct3DCreate(@OriginalArg(0) int arg0, @OriginalArg(1) IDirect3D arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "<init>", descriptor = "(Lclient!jaclib/peer/wn;)V")
	private IDirect3D(@OriginalArg(0) wn arg0) {
		super(arg0);
		this.b = arg0;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "CheckDeviceFormat", descriptor = "(IIIIII)I")
	public native int CheckDeviceFormat(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "CheckDeviceMultiSampleType", descriptor = "(IIIZI)I")
	public native int CheckDeviceMultiSampleType(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "_GetAdapterDisplayMode", descriptor = "(ILclient!jagdx/D3DDISPLAYMODE;)I")
	private native int _GetAdapterDisplayMode(@OriginalArg(0) int arg0, @OriginalArg(1) D3DDISPLAYMODE arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "a", descriptor = "(II)Lclient!jagdx/D3DADAPTER_IDENTIFIER;")
	public D3DADAPTER_IDENTIFIER a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) D3DADAPTER_IDENTIFIER local3 = new D3DADAPTER_IDENTIFIER();
		@Pc(9) int local9 = this._GetAdapterIdentifier(arg0, arg1, local3);
		if (fe.a((int) 32025, local9)) {
			throw new dk(String.valueOf(local9));
		}
		return local3;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "_GetAdapterIdentifier", descriptor = "(IILclient!jagdx/D3DADAPTER_IDENTIFIER;)I")
	private native int _GetAdapterIdentifier(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) D3DADAPTER_IDENTIFIER arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "CheckDepthStencilMatch", descriptor = "(IIIII)I")
	public native int CheckDepthStencilMatch(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "b", descriptor = "(II)Lclient!jagdx/D3DCAPS;")
	public D3DCAPS b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) D3DCAPS local3 = new D3DCAPS();
		@Pc(9) int local9 = this._GetDeviceCaps(arg0, arg1, local3);
		if (fe.a((int) 32025, local9)) {
			throw new dk(String.valueOf(local9));
		}
		return local3;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "a", descriptor = "(IILjava/awt/Canvas;ILclient!jagdx/D3DPRESENT_PARAMETERS;)Lclient!jagdx/IDirect3DDevice;")
	public IDirect3DDevice a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) int arg3, @OriginalArg(4) D3DPRESENT_PARAMETERS arg4) {
		@Pc(5) IDirect3DDevice local5 = new IDirect3DDevice(this.b);
		@Pc(14) int local14 = this._CreateDevice(arg0, arg1, arg2, arg3, arg4, local5);
		if (fe.a((int) 32025, local14)) {
			throw new dk(String.valueOf(local14));
		}
		return local5;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "_CreateDevice", descriptor = "(IILjava/awt/Canvas;ILclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/IDirect3DDevice;)I")
	private native int _CreateDevice(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) int arg3, @OriginalArg(4) D3DPRESENT_PARAMETERS arg4, @OriginalArg(5) IDirect3DDevice arg5);

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "b", descriptor = "(I)Lclient!jagdx/D3DDISPLAYMODE;")
	public D3DDISPLAYMODE b(@OriginalArg(0) int arg0) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		@Pc(8) int local8 = this._GetAdapterDisplayMode(arg0, local3);
		if (fe.a((int) 32025, local8)) {
			throw new dk(String.valueOf(local8));
		}
		return local3;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "_GetDeviceCaps", descriptor = "(IILclient!jagdx/D3DCAPS;)I")
	private native int _GetDeviceCaps(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) D3DCAPS arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3D", name = "CheckDeviceType", descriptor = "(IIIIZ)I")
	public native int CheckDeviceType(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
