package com.jagex;

import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;
import jagdx.p;
import jagdx.q;
import jagdx.v;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apn")
public class Class86_Sub1_Sub1 extends Class86_Sub1 {

	@OriginalMember(owner = "client!apn", name = "ik", descriptor = "I")
	static final int anInt2715 = 3;

	@OriginalMember(owner = "client!apn", name = "iv", descriptor = "[I")
	static final int[] anIntArray247 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!apn", name = "jz", descriptor = "[I")
	static final int[] anIntArray248 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!apn", name = "ib", descriptor = "Lclient!agz;")
	Class105_Sub2 aClass105_Sub2_2;

	@OriginalMember(owner = "client!apn", name = "if", descriptor = "J")
	long aLong118;

	@OriginalMember(owner = "client!apn", name = "is", descriptor = "Z")
	boolean aBoolean421;

	@OriginalMember(owner = "client!apn", name = "hi", descriptor = "J")
	long aLong113 = 0L;

	@OriginalMember(owner = "client!apn", name = "ha", descriptor = "J")
	long aLong119 = 0L;

	@OriginalMember(owner = "client!apn", name = "hj", descriptor = "Lclient!zm;")
	Class695 aClass695_32 = new Class695();

	@OriginalMember(owner = "client!apn", name = "hh", descriptor = "Z")
	boolean aBoolean412 = false;

	@OriginalMember(owner = "client!apn", name = "hb", descriptor = "J")
	long aLong115 = 0L;

	@OriginalMember(owner = "client!apn", name = "hg", descriptor = "J")
	long aLong116 = 0L;

	@OriginalMember(owner = "client!apn", name = "hv", descriptor = "J")
	long aLong117 = 0L;

	@OriginalMember(owner = "client!apn", name = "hk", descriptor = "Z")
	boolean aBoolean413 = false;

	@OriginalMember(owner = "client!apn", name = "ix", descriptor = "[F")
	final float[] aFloatArray68 = new float[16];

	@OriginalMember(owner = "client!apn", name = "iz", descriptor = "I")
	int anInt2712 = 128;

	@OriginalMember(owner = "client!apn", name = "ia", descriptor = "I")
	int anInt2710 = 0;

	@OriginalMember(owner = "client!apn", name = "ij", descriptor = "[J")
	long[] aLongArray13 = new long[this.anInt2712];

	@OriginalMember(owner = "client!apn", name = "ir", descriptor = "J")
	long aLong114 = 0L;

	@OriginalMember(owner = "client!apn", name = "im", descriptor = "[J")
	long[] aLongArray15 = new long[3];

	@OriginalMember(owner = "client!apn", name = "io", descriptor = "[J")
	long[] aLongArray14 = new long[3];

	@OriginalMember(owner = "client!apn", name = "il", descriptor = "[I")
	int[] anIntArray246 = new int[3];

	@OriginalMember(owner = "client!apn", name = "ih", descriptor = "I")
	int anInt2714 = 0;

	@OriginalMember(owner = "client!apn", name = "ie", descriptor = "I")
	int anInt2711 = 0;

	@OriginalMember(owner = "client!apn", name = "hd", descriptor = "I")
	final int anInt2713;

	@OriginalMember(owner = "client!apn", name = "hp", descriptor = "I")
	final int anInt2709;

	@OriginalMember(owner = "client!apn", name = "hn", descriptor = "Lclient!jagdx/D3DDISPLAYMODE;")
	final D3DDISPLAYMODE aD3DDISPLAYMODE1;

	@OriginalMember(owner = "client!apn", name = "hf", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS2;

	@OriginalMember(owner = "client!apn", name = "id", descriptor = "Lclient!jagdx/D3DCAPS;")
	final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!apn", name = "ii", descriptor = "Z")
	final boolean aBoolean414;

	@OriginalMember(owner = "client!apn", name = "it", descriptor = "Z")
	final boolean aBoolean422;

	@OriginalMember(owner = "client!apn", name = "iw", descriptor = "Z")
	final boolean aBoolean416;

	@OriginalMember(owner = "client!apn", name = "ip", descriptor = "Z")
	final boolean aBoolean415;

	@OriginalMember(owner = "client!apn", name = "in", descriptor = "Z")
	final boolean aBoolean411;

	@OriginalMember(owner = "client!apn", name = "ig", descriptor = "Z")
	final boolean aBoolean417;

	@OriginalMember(owner = "client!apn", name = "ic", descriptor = "Z")
	final boolean aBoolean418;

	@OriginalMember(owner = "client!apn", name = "iy", descriptor = "Z")
	final boolean aBoolean419;

	@OriginalMember(owner = "client!apn", name = "iu", descriptor = "Z")
	final boolean aBoolean420;

	@OriginalMember(owner = "client!apn", name = "hy", descriptor = "[Z")
	boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!apn", name = "hs", descriptor = "[Z")
	boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!apn", name = "hm", descriptor = "[Z")
	boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!apn", name = "he", descriptor = "[Lclient!lo;")
	Class382[] aClass382Array1;

	@OriginalMember(owner = "client!apn", name = "hx", descriptor = "[Z")
	boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!apn", name = "ho", descriptor = "[I")
	int[] anIntArray245;

	@OriginalMember(owner = "client!apn", name = "iq", descriptor = "Lclient!oi;")
	Class442 aClass442_77;

	@OriginalMember(owner = "client!apn", name = "wu", descriptor = "()Z", line = 68)
	@Override
	public boolean method20688() {
		return (this.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!apn", name = "wp", descriptor = "()Z", line = 68)
	@Override
	public boolean method20685() {
		return (this.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!apn", name = "wb", descriptor = "()Z", line = 68)
	@Override
	public boolean method20687() {
		return (this.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!apn", name = "wh", descriptor = "()Z", line = 68)
	@Override
	public boolean method20686() {
		return (this.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!apn", name = "rg", descriptor = "()Z", line = 68)
	@Override
	public boolean method20630() {
		return (this.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!apn", name = "rp", descriptor = "()Z", line = 72)
	@Override
	public boolean method20681() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!apn", name = "ww", descriptor = "()Z", line = 72)
	@Override
	public boolean method20700() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!apn", name = "wr", descriptor = "()Z", line = 72)
	@Override
	public boolean method20620() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!apn", name = "wv", descriptor = "(Z)Z", line = 76)
	@Override
	public boolean method20680(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean419;
		} else {
			return this.aBoolean419 && this.aBoolean420;
		}
	}

	@OriginalMember(owner = "client!apn", name = "rn", descriptor = "(Z)Z", line = 76)
	@Override
	public boolean method20612(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean419;
		} else {
			return this.aBoolean419 && this.aBoolean420;
		}
	}

	@OriginalMember(owner = "client!apn", name = "wx", descriptor = "(Z)Z", line = 76)
	@Override
	public boolean method20690(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean419;
		} else {
			return this.aBoolean419 && this.aBoolean420;
		}
	}

	@OriginalMember(owner = "client!apn", name = "wm", descriptor = "(Z)Z", line = 76)
	@Override
	public boolean method20740(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean419;
		} else {
			return this.aBoolean419 && this.aBoolean420;
		}
	}

	@OriginalMember(owner = "client!apn", name = "wd", descriptor = "(Z)Z", line = 76)
	@Override
	public boolean method20614(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean419;
		} else {
			return this.aBoolean419 && this.aBoolean420;
		}
	}

	@OriginalMember(owner = "client!apn", name = "agc", descriptor = "(Ljava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;Lclient!pw;Ljava/lang/Integer;)Lclient!dx;", line = 82)
	static Class86 method19529(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface44 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface45 arg5, @OriginalArg(6) Class478 arg6, @OriginalArg(7) Integer arg7) {
		@Pc(1) Class86_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(7) long local7 = IDirect3D.Direct3DCreate();
			@Pc(11) D3DCAPS local11 = new D3DCAPS();
			IDirect3D.GetDeviceCaps(local7, local3, local5, local11);
			if ((local11.RasterCaps & 0x1000000) == 0) {
				throw new RuntimeException("");
			} else if (local11.MaxSimultaneousTextures < 2) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local11.MaxActiveLights > 0 && local11.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local11.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(151) D3DPRESENT_PARAMETERS local151 = new D3DPRESENT_PARAMETERS(arg0);
				local151.Windowed = true;
				local151.EnableAutoDepthStencil = true;
				local151.BackBufferWidth = arg0.getWidth();
				local151.BackBufferHeight = arg0.getHeight();
				local151.BackBufferCount = 1;
				local151.PresentationInterval = Integer.MIN_VALUE;
				@Pc(175) D3DDISPLAYMODE local175 = new D3DDISPLAYMODE();
				if (!method19588(local3, local5, local7, arg7, local175, local151)) {
					throw new RuntimeException("");
				}
				@Pc(191) int local191 = 0;
				if ((local11.DevCaps & 0x100000) != 0) {
					local191 |= 0x10;
				}
				@Pc(202) long local202 = 0L;
				try {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 | 0x40, local151);
				} catch (@Pc(214) q local214) {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 & 0xFFEFFFFF | 0x20, local151);
				}
				local1 = new Class86_Sub1_Sub1(local3, local5, local7, local202, local175, local151, local11, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
				if (!local1.aHashtable6.containsKey(arg0)) {
					Class487.method29986(arg0);
					local1.method19951(arg0, new Class92_Sub2_Sub1_Sub1(local1, arg0, arg0.getWidth(), arg0.getHeight(), true));
				}
				local1.method19959(arg0);
				local1.method20412();
				return local1;
			}
		} catch (@Pc(276) RuntimeException local276) {
			if (local1 != null) {
				local1.method20113();
			}
			throw local276;
		}
	}

	@OriginalMember(owner = "client!apn", name = "ahl", descriptor = "(Ljava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;Lclient!pw;Ljava/lang/Integer;)Lclient!dx;", line = 82)
	static Class86 method19530(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface44 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface45 arg5, @OriginalArg(6) Class478 arg6, @OriginalArg(7) Integer arg7) {
		@Pc(1) Class86_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(7) long local7 = IDirect3D.Direct3DCreate();
			@Pc(11) D3DCAPS local11 = new D3DCAPS();
			IDirect3D.GetDeviceCaps(local7, local3, local5, local11);
			if ((local11.RasterCaps & 0x1000000) == 0) {
				throw new RuntimeException("");
			} else if (local11.MaxSimultaneousTextures < 2) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local11.MaxActiveLights > 0 && local11.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local11.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(151) D3DPRESENT_PARAMETERS local151 = new D3DPRESENT_PARAMETERS(arg0);
				local151.Windowed = true;
				local151.EnableAutoDepthStencil = true;
				local151.BackBufferWidth = arg0.getWidth();
				local151.BackBufferHeight = arg0.getHeight();
				local151.BackBufferCount = 1;
				local151.PresentationInterval = Integer.MIN_VALUE;
				@Pc(175) D3DDISPLAYMODE local175 = new D3DDISPLAYMODE();
				if (!method19588(local3, local5, local7, arg7, local175, local151)) {
					throw new RuntimeException("");
				}
				@Pc(191) int local191 = 0;
				if ((local11.DevCaps & 0x100000) != 0) {
					local191 |= 0x10;
				}
				@Pc(202) long local202 = 0L;
				try {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 | 0x40, local151);
				} catch (@Pc(214) q local214) {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 & 0xFFEFFFFF | 0x20, local151);
				}
				local1 = new Class86_Sub1_Sub1(local3, local5, local7, local202, local175, local151, local11, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
				if (!local1.aHashtable6.containsKey(arg0)) {
					Class487.method29986(arg0);
					local1.method19951(arg0, new Class92_Sub2_Sub1_Sub1(local1, arg0, arg0.getWidth(), arg0.getHeight(), true));
				}
				local1.method19959(arg0);
				local1.method20412();
				return local1;
			}
		} catch (@Pc(276) RuntimeException local276) {
			if (local1 != null) {
				local1.method20113();
			}
			throw local276;
		}
	}

	@OriginalMember(owner = "client!apn", name = "aha", descriptor = "(Ljava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;Lclient!pw;Ljava/lang/Integer;)Lclient!dx;", line = 82)
	static Class86 method19531(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface44 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface45 arg5, @OriginalArg(6) Class478 arg6, @OriginalArg(7) Integer arg7) {
		@Pc(1) Class86_Sub1_Sub1 local1 = null;
		try {
			@Pc(3) byte local3 = 0;
			@Pc(5) byte local5 = 1;
			@Pc(7) long local7 = IDirect3D.Direct3DCreate();
			@Pc(11) D3DCAPS local11 = new D3DCAPS();
			IDirect3D.GetDeviceCaps(local7, local3, local5, local11);
			if ((local11.RasterCaps & 0x1000000) == 0) {
				throw new RuntimeException("");
			} else if (local11.MaxSimultaneousTextures < 2) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x8) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x40) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x200) == 0) {
				throw new RuntimeException("");
			} else if ((local11.TextureOpCaps & 0x2000000) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			} else if ((local11.SrcBlendCaps & local11.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			} else if (local11.MaxActiveLights > 0 && local11.MaxActiveLights < 2) {
				throw new RuntimeException("");
			} else if (local11.MaxStreams < 5) {
				throw new RuntimeException("");
			} else {
				@Pc(151) D3DPRESENT_PARAMETERS local151 = new D3DPRESENT_PARAMETERS(arg0);
				local151.Windowed = true;
				local151.EnableAutoDepthStencil = true;
				local151.BackBufferWidth = arg0.getWidth();
				local151.BackBufferHeight = arg0.getHeight();
				local151.BackBufferCount = 1;
				local151.PresentationInterval = Integer.MIN_VALUE;
				@Pc(175) D3DDISPLAYMODE local175 = new D3DDISPLAYMODE();
				if (!method19588(local3, local5, local7, arg7, local175, local151)) {
					throw new RuntimeException("");
				}
				@Pc(191) int local191 = 0;
				if ((local11.DevCaps & 0x100000) != 0) {
					local191 |= 0x10;
				}
				@Pc(202) long local202 = 0L;
				try {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 | 0x40, local151);
				} catch (@Pc(214) q local214) {
					local202 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 & 0xFFEFFFFF | 0x20, local151);
				}
				local1 = new Class86_Sub1_Sub1(local3, local5, local7, local202, local175, local151, local11, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
				if (!local1.aHashtable6.containsKey(arg0)) {
					Class487.method29986(arg0);
					local1.method19951(arg0, new Class92_Sub2_Sub1_Sub1(local1, arg0, arg0.getWidth(), arg0.getHeight(), true));
				}
				local1.method19959(arg0);
				local1.method20412();
				return local1;
			}
		} catch (@Pc(276) RuntimeException local276) {
			if (local1 != null) {
				local1.method20113();
			}
			throw local276;
		}
	}

	@OriginalMember(owner = "client!apn", name = "<init>", descriptor = "(IIJJLclient!jagdx/D3DDISPLAYMODE;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;Lclient!pw;I)V", line = 135)
	Class86_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) long arg3, @OriginalArg(4) D3DDISPLAYMODE arg4, @OriginalArg(5) D3DPRESENT_PARAMETERS arg5, @OriginalArg(6) D3DCAPS arg6, @OriginalArg(7) Class209 arg7, @OriginalArg(8) Interface24 arg8, @OriginalArg(9) Interface44 arg9, @OriginalArg(10) Interface47 arg10, @OriginalArg(11) Interface45 arg11, @OriginalArg(12) Class478 arg12, @OriginalArg(13) int arg13) {
		super(arg7, arg8, arg9, arg10, arg11, arg12, arg13, 0);
		try {
			this.anInt2713 = arg0;
			this.anInt2709 = arg1;
			this.aLong113 = arg2;
			this.aLong119 = arg3;
			this.aD3DDISPLAYMODE1 = arg4;
			this.aD3DPRESENT_PARAMETERS2 = arg5;
			this.aD3DCAPS1 = arg6;
			this.aLong115 = D3DLIGHT.Create();
			this.aLong116 = D3DLIGHT.Create();
			this.aLong117 = D3DLIGHT.Create();
			this.anInt2848 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.anInt2849 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean414 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean457 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean458 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean422 = (this.aD3DCAPS1.TextureCaps & 0x8000) != 0;
			this.aBoolean416 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean415 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean454 = this.aD3DCAPS1.NumSimultaneousRTs > 0;
			this.aBoolean459 = this.aBoolean454;
			this.aBoolean455 = this.aD3DCAPS1.NumSimultaneousRTs > 0;
			this.aBoolean453 = this.anInt2844 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong113, this.anInt2713, this.anInt2709, this.aD3DPRESENT_PARAMETERS2.BackBufferFormat, true, 2) == 0;
			this.aBoolean456 = this.aD3DCAPS1.NumSimultaneousRTs > 0 && this.anInt2844 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong113, this.anInt2713, this.anInt2709, 113, true, 2) == 0;
			this.aBoolean411 = IDirect3D.CheckDeviceFormat(this.aLong113, this.anInt2713, this.anInt2709, this.aD3DPRESENT_PARAMETERS2.BackBufferFormat, 0, 1, method20606('A', 'T', 'O', 'C')) == 0;
			this.aBoolean417 = IDirect3D.CheckDeviceFormat(this.aLong113, this.anInt2713, this.anInt2709, this.aD3DPRESENT_PARAMETERS2.BackBufferFormat, 0, 1, method20606('A', '2', 'M', '1')) == 0;
			this.aBoolean418 = IDirect3D.CheckDeviceFormat(this.aLong113, this.anInt2713, this.anInt2709, this.aD3DPRESENT_PARAMETERS2.BackBufferFormat, 0, 1, method20606('S', 'S', 'A', 'A')) == 0;
			this.aBoolean438 = (this.aD3DCAPS1.PrimitiveMiscCaps & 0x20000) != 0;
			this.aBoolean419 = IDirect3D.CheckDeviceFormat(this.aLong113, this.anInt2713, this.anInt2709, this.aD3DDISPLAYMODE1.Format, 524288, 3, 113) == 0;
			this.aBoolean420 = IDirect3D.CheckDeviceFormat(this.aLong113, this.anInt2713, this.anInt2709, this.aD3DDISPLAYMODE1.Format, 524288, 3, 116) == 0;
			this.aBooleanArray14 = new boolean[this.anInt2848];
			this.aBooleanArray11 = new boolean[this.anInt2848];
			this.aBooleanArray12 = new boolean[this.anInt2848];
			this.aClass382Array1 = new Class382[this.anInt2848];
			this.aBooleanArray13 = new boolean[this.anInt2848];
			this.anIntArray245 = new int[this.anInt2848];
			@Pc(401) Class455 local401 = new Class455();
			local401.method29423(1.0F, -1.0F, 0.5F);
			local401.method29436(0.0F, 0.0F, 0.5F);
			this.aClass442_77 = new Class442();
			this.aClass442_77.method28969(local401);
			IDirect3DDevice.BeginScene(this.aLong119);
		} catch (@Pc(426) Throwable local426) {
			local426.printStackTrace();
			this.method19929();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!apn", name = "si", descriptor = "()V", line = 187)
	@Override
	void method20425() {
		for (@Pc(5) Class77_Sub6 local5 = (Class77_Sub6) this.aClass695_32.method36395(); local5 != null; local5 = (Class77_Sub6) this.aClass695_32.method36406()) {
			@Pc(11) Interface49 local11 = (Interface49) local5.anObject5;
			local11.method12664();
			if (local11 == this.aClass92_6) {
				local11.method23508();
			}
		}
		super.method20425();
	}

	@OriginalMember(owner = "client!apn", name = "yu", descriptor = "()V", line = 187)
	@Override
	void method20426() {
		for (@Pc(5) Class77_Sub6 local5 = (Class77_Sub6) this.aClass695_32.method36395(); local5 != null; local5 = (Class77_Sub6) this.aClass695_32.method36406()) {
			@Pc(11) Interface49 local11 = (Interface49) local5.anObject5;
			local11.method12664();
			if (local11 == this.aClass92_6) {
				local11.method23508();
			}
		}
		super.method20425();
	}

	@OriginalMember(owner = "client!apn", name = "yv", descriptor = "()V", line = 187)
	@Override
	void method20428() {
		for (@Pc(5) Class77_Sub6 local5 = (Class77_Sub6) this.aClass695_32.method36395(); local5 != null; local5 = (Class77_Sub6) this.aClass695_32.method36406()) {
			@Pc(11) Interface49 local11 = (Interface49) local5.anObject5;
			local11.method12664();
			if (local11 == this.aClass92_6) {
				local11.method23508();
			}
		}
		super.method20425();
	}

	@OriginalMember(owner = "client!apn", name = "ys", descriptor = "()V", line = 187)
	@Override
	void method20427() {
		for (@Pc(5) Class77_Sub6 local5 = (Class77_Sub6) this.aClass695_32.method36395(); local5 != null; local5 = (Class77_Sub6) this.aClass695_32.method36406()) {
			@Pc(11) Interface49 local11 = (Interface49) local5.anObject5;
			local11.method12664();
			if (local11 == this.aClass92_6) {
				local11.method23508();
			}
		}
		super.method20425();
	}

	@OriginalMember(owner = "client!apn", name = "sy", descriptor = "()V", line = 196)
	@Override
	void method20421() {
		this.method20077();
		for (@Pc(7) Class77_Sub6 local7 = (Class77_Sub6) this.aClass695_32.method36395(); local7 != null; local7 = (Class77_Sub6) this.aClass695_32.method36406()) {
			@Pc(13) Interface49 local13 = (Interface49) local7.anObject5;
			local13.method23506();
		}
		super.method20421();
	}

	@OriginalMember(owner = "client!apn", name = "xy", descriptor = "()V", line = 196)
	@Override
	void method20422() {
		this.method20077();
		for (@Pc(7) Class77_Sub6 local7 = (Class77_Sub6) this.aClass695_32.method36395(); local7 != null; local7 = (Class77_Sub6) this.aClass695_32.method36406()) {
			@Pc(13) Interface49 local13 = (Interface49) local7.anObject5;
			local13.method23506();
		}
		super.method20421();
	}

	@OriginalMember(owner = "client!apn", name = "xv", descriptor = "()V", line = 196)
	@Override
	void method20423() {
		this.method20077();
		for (@Pc(7) Class77_Sub6 local7 = (Class77_Sub6) this.aClass695_32.method36395(); local7 != null; local7 = (Class77_Sub6) this.aClass695_32.method36406()) {
			@Pc(13) Interface49 local13 = (Interface49) local7.anObject5;
			local13.method23506();
		}
		super.method20421();
	}

	@OriginalMember(owner = "client!apn", name = "xf", descriptor = "()V", line = 196)
	@Override
	void method20424() {
		this.method20077();
		for (@Pc(7) Class77_Sub6 local7 = (Class77_Sub6) this.aClass695_32.method36395(); local7 != null; local7 = (Class77_Sub6) this.aClass695_32.method36406()) {
			@Pc(13) Interface49 local13 = (Interface49) local7.anObject5;
			local13.method23506();
		}
		super.method20421();
	}

	@OriginalMember(owner = "client!apn", name = "agu", descriptor = "(II)Z", line = 205)
	boolean method19532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong119);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong119, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong119, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong119, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong119, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong119, 0L);
			this.method20421();
			this.aD3DPRESENT_PARAMETERS2.BackBufferWidth = arg0;
			this.aD3DPRESENT_PARAMETERS2.BackBufferHeight = arg1;
			this.aD3DPRESENT_PARAMETERS2.BackBufferCount = 1;
			if (method19588(this.anInt2713, this.anInt2709, this.aLong113, this.anInt2844, this.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong119, this.aD3DPRESENT_PARAMETERS2);
				if (p.method27710(local15)) {
					this.aBoolean412 = false;
					this.method20425();
					this.method20417();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!apn", name = "ahk", descriptor = "(II)Z", line = 205)
	boolean method19533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong119);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong119, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong119, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong119, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong119, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong119, 0L);
			this.method20421();
			this.aD3DPRESENT_PARAMETERS2.BackBufferWidth = arg0;
			this.aD3DPRESENT_PARAMETERS2.BackBufferHeight = arg1;
			this.aD3DPRESENT_PARAMETERS2.BackBufferCount = 1;
			if (method19588(this.anInt2713, this.anInt2709, this.aLong113, this.anInt2844, this.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong119, this.aD3DPRESENT_PARAMETERS2);
				if (p.method27710(local15)) {
					this.aBoolean412 = false;
					this.method20425();
					this.method20417();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!apn", name = "ahp", descriptor = "(II)Z", line = 205)
	boolean method19534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong119);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong119, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong119, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong119, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong119, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong119, 0L);
			this.method20421();
			this.aD3DPRESENT_PARAMETERS2.BackBufferWidth = arg0;
			this.aD3DPRESENT_PARAMETERS2.BackBufferHeight = arg1;
			this.aD3DPRESENT_PARAMETERS2.BackBufferCount = 1;
			if (method19588(this.anInt2713, this.anInt2709, this.aLong113, this.anInt2844, this.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong119, this.aD3DPRESENT_PARAMETERS2);
				if (p.method27710(local15)) {
					this.aBoolean412 = false;
					this.method20425();
					this.method20417();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!apn", name = "rw", descriptor = "()V", line = 231)
	@Override
	void method20417() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2848; local1++) {
			IDirect3DDevice.SetSamplerState(this.aLong119, local1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong119, local1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong119, local1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong119, local1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong119, local1, 2, 1);
			this.aClass382Array1[local1] = Class382.aClass382_5;
			@Pc(48) boolean[] local48 = this.aBooleanArray14;
			this.aBooleanArray11[local1] = true;
			local48[local1] = true;
			this.aBooleanArray13[local1] = false;
			this.anIntArray245[local1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong119, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong119, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong119, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong119, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong119, 24, 0);
		IDirect3DDevice.method27704(this.aLong119, 206, this.aBoolean438);
		IDirect3DDevice.SetRenderState(this.aLong119, 181, 0);
		this.method19574();
		IDirect3DDevice.SetRenderState(this.aLong119, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong119, 145, 1);
		IDirect3DDevice.method27700(this.aLong119, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong119, 35, 3);
		IDirect3DDevice.method27700(this.aLong119, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong115, 3);
		D3DLIGHT.SetType(this.aLong116, 3);
		D3DLIGHT.SetType(this.aLong117, 1);
		this.aBoolean413 = false;
		super.method20417();
	}

	@OriginalMember(owner = "client!apn", name = "xc", descriptor = "()V", line = 231)
	@Override
	void method20418() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2848; local1++) {
			IDirect3DDevice.SetSamplerState(this.aLong119, local1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong119, local1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong119, local1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong119, local1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong119, local1, 2, 1);
			this.aClass382Array1[local1] = Class382.aClass382_5;
			@Pc(48) boolean[] local48 = this.aBooleanArray14;
			this.aBooleanArray11[local1] = true;
			local48[local1] = true;
			this.aBooleanArray13[local1] = false;
			this.anIntArray245[local1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong119, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong119, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong119, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong119, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong119, 24, 0);
		IDirect3DDevice.method27704(this.aLong119, 206, this.aBoolean438);
		IDirect3DDevice.SetRenderState(this.aLong119, 181, 0);
		this.method19574();
		IDirect3DDevice.SetRenderState(this.aLong119, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong119, 145, 1);
		IDirect3DDevice.method27700(this.aLong119, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong119, 35, 3);
		IDirect3DDevice.method27700(this.aLong119, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong115, 3);
		D3DLIGHT.SetType(this.aLong116, 3);
		D3DLIGHT.SetType(this.aLong117, 1);
		this.aBoolean413 = false;
		super.method20417();
	}

	@OriginalMember(owner = "client!apn", name = "xh", descriptor = "()V", line = 231)
	@Override
	void method20416() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2848; local1++) {
			IDirect3DDevice.SetSamplerState(this.aLong119, local1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong119, local1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong119, local1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong119, local1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong119, local1, 2, 1);
			this.aClass382Array1[local1] = Class382.aClass382_5;
			@Pc(48) boolean[] local48 = this.aBooleanArray14;
			this.aBooleanArray11[local1] = true;
			local48[local1] = true;
			this.aBooleanArray13[local1] = false;
			this.anIntArray245[local1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong119, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong119, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong119, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong119, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong119, 24, 0);
		IDirect3DDevice.method27704(this.aLong119, 206, this.aBoolean438);
		IDirect3DDevice.SetRenderState(this.aLong119, 181, 0);
		this.method19574();
		IDirect3DDevice.SetRenderState(this.aLong119, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong119, 145, 1);
		IDirect3DDevice.method27700(this.aLong119, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong119, 35, 3);
		IDirect3DDevice.method27700(this.aLong119, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong115, 3);
		D3DLIGHT.SetType(this.aLong116, 3);
		D3DLIGHT.SetType(this.aLong117, 1);
		this.aBoolean413 = false;
		super.method20417();
	}

	@OriginalMember(owner = "client!apn", name = "ew", descriptor = "()Lclient!do;", line = 266)
	@Override
	public Class208 method20084() {
		@Pc(3) D3DADAPTER_IDENTIFIER local3 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong113, this.anInt2713, 0, local3);
		return new Class208(local3.VendorID, this.method20390() ? "Direct3D FF" : "Direct3D", 9, local3.Description, local3.DriverVersion, this.method20390());
	}

	@OriginalMember(owner = "client!apn", name = "eu", descriptor = "()Lclient!do;", line = 266)
	@Override
	public Class208 method20372() {
		@Pc(3) D3DADAPTER_IDENTIFIER local3 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong113, this.anInt2713, 0, local3);
		return new Class208(local3.VendorID, this.method20390() ? "Direct3D FF" : "Direct3D", 9, local3.Description, local3.DriverVersion, this.method20390());
	}

	@OriginalMember(owner = "client!apn", name = "y", descriptor = "()Lclient!do;", line = 266)
	@Override
	public Class208 method20046() {
		@Pc(3) D3DADAPTER_IDENTIFIER local3 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong113, this.anInt2713, 0, local3);
		return new Class208(local3.VendorID, this.method20390() ? "Direct3D FF" : "Direct3D", 9, local3.Description, local3.DriverVersion, this.method20390());
	}

	@OriginalMember(owner = "client!apn", name = "ea", descriptor = "(II)V", line = 272)
	@Override
	void method20152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		if (this.aBoolean412) {
			if (!this.method19532(this.aClass92_Sub2_6.method23491(), this.aClass92_Sub2_6.method23493())) {
				return;
			}
			((Class92_Sub2_Sub1_Sub1) this.aClass92_Sub2_6).method12664();
		} else {
			IDirect3DDevice.EndScene(this.aLong119);
		}
		@Pc(25) int local25 = this.aClass92_Sub2_6.method23348();
		if (p.method27707(local25)) {
			this.aBoolean412 = true;
			this.aClass92_Sub2_6.method23506();
		} else {
			IDirect3DDevice.BeginScene(this.aLong119);
			if (this.anInterface24_55 != null) {
				this.anInterface24_55.method4227();
			}
		}
	}

	@OriginalMember(owner = "client!apn", name = "ec", descriptor = "(II)V", line = 272)
	@Override
	void method20153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		if (this.aBoolean412) {
			if (!this.method19532(this.aClass92_Sub2_6.method23491(), this.aClass92_Sub2_6.method23493())) {
				return;
			}
			((Class92_Sub2_Sub1_Sub1) this.aClass92_Sub2_6).method12664();
		} else {
			IDirect3DDevice.EndScene(this.aLong119);
		}
		@Pc(25) int local25 = this.aClass92_Sub2_6.method23348();
		if (p.method27707(local25)) {
			this.aBoolean412 = true;
			this.aClass92_Sub2_6.method23506();
		} else {
			IDirect3DDevice.BeginScene(this.aLong119);
			if (this.anInterface24_55 != null) {
				this.anInterface24_55.method4227();
			}
		}
	}

	@OriginalMember(owner = "client!apn", name = "t", descriptor = "(II)V", line = 272)
	@Override
	void method20047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		if (this.aBoolean412) {
			if (!this.method19532(this.aClass92_Sub2_6.method23491(), this.aClass92_Sub2_6.method23493())) {
				return;
			}
			((Class92_Sub2_Sub1_Sub1) this.aClass92_Sub2_6).method12664();
		} else {
			IDirect3DDevice.EndScene(this.aLong119);
		}
		@Pc(25) int local25 = this.aClass92_Sub2_6.method23348();
		if (p.method27707(local25)) {
			this.aBoolean412 = true;
			this.aClass92_Sub2_6.method23506();
		} else {
			IDirect3DDevice.BeginScene(this.aLong119);
			if (this.anInterface24_55 != null) {
				this.anInterface24_55.method4227();
			}
		}
	}

	@OriginalMember(owner = "client!apn", name = "q", descriptor = "()V", line = 288)
	@Override
	public void method20331() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong119);
		if (p.method27710(IDirect3DEventQuery.Issue(local3))) {
			while (true) {
				@Pc(10) int local10 = IDirect3DEventQuery.IsSignaled(local3);
				if (local10 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		IUnknown.Release(local3);
	}

	@OriginalMember(owner = "client!apn", name = "el", descriptor = "()V", line = 288)
	@Override
	public void method20154() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong119);
		if (p.method27710(IDirect3DEventQuery.Issue(local3))) {
			while (true) {
				@Pc(10) int local10 = IDirect3DEventQuery.IsSignaled(local3);
				if (local10 != 1) {
					break;
				}
				Thread.yield();
			}
		}
		IUnknown.Release(local3);
	}

	@OriginalMember(owner = "client!apn", name = "d", descriptor = "()V", line = 300)
	@Override
	void method20113() {
		super.method20113();
		if (this.aLong115 != 0L) {
			D3DLIGHT.Destroy(this.aLong115);
			this.aLong115 = 0L;
		}
		if (this.aLong116 != 0L) {
			D3DLIGHT.Destroy(this.aLong116);
			this.aLong116 = 0L;
		}
		if (this.aLong117 != 0L) {
			D3DLIGHT.Destroy(this.aLong117);
			this.aLong117 = 0L;
		}
		if (this.aLong119 != 0L) {
			IDirect3DDevice.Destroy(this.aLong119);
			this.aLong119 = 0L;
		}
		if (this.aLong113 != 0L) {
			IUnknown.Release(this.aLong113);
			this.aLong113 = 0L;
		}
	}

	@OriginalMember(owner = "client!apn", name = "mc", descriptor = "()V", line = 300)
	@Override
	void method20315() {
		super.method20113();
		if (this.aLong115 != 0L) {
			D3DLIGHT.Destroy(this.aLong115);
			this.aLong115 = 0L;
		}
		if (this.aLong116 != 0L) {
			D3DLIGHT.Destroy(this.aLong116);
			this.aLong116 = 0L;
		}
		if (this.aLong117 != 0L) {
			D3DLIGHT.Destroy(this.aLong117);
			this.aLong117 = 0L;
		}
		if (this.aLong119 != 0L) {
			IDirect3DDevice.Destroy(this.aLong119);
			this.aLong119 = 0L;
		}
		if (this.aLong113 != 0L) {
			IUnknown.Release(this.aLong113);
			this.aLong113 = 0L;
		}
	}

	@OriginalMember(owner = "client!apn", name = "mn", descriptor = "()V", line = 300)
	@Override
	void method20332() {
		super.method20113();
		if (this.aLong115 != 0L) {
			D3DLIGHT.Destroy(this.aLong115);
			this.aLong115 = 0L;
		}
		if (this.aLong116 != 0L) {
			D3DLIGHT.Destroy(this.aLong116);
			this.aLong116 = 0L;
		}
		if (this.aLong117 != 0L) {
			D3DLIGHT.Destroy(this.aLong117);
			this.aLong117 = 0L;
		}
		if (this.aLong119 != 0L) {
			IDirect3DDevice.Destroy(this.aLong119);
			this.aLong119 = 0L;
		}
		if (this.aLong113 != 0L) {
			IUnknown.Release(this.aLong113);
			this.aLong113 = 0L;
		}
	}

	@OriginalMember(owner = "client!apn", name = "ms", descriptor = "()V", line = 300)
	@Override
	void method20333() {
		super.method20113();
		if (this.aLong115 != 0L) {
			D3DLIGHT.Destroy(this.aLong115);
			this.aLong115 = 0L;
		}
		if (this.aLong116 != 0L) {
			D3DLIGHT.Destroy(this.aLong116);
			this.aLong116 = 0L;
		}
		if (this.aLong117 != 0L) {
			D3DLIGHT.Destroy(this.aLong117);
			this.aLong117 = 0L;
		}
		if (this.aLong119 != 0L) {
			IDirect3DDevice.Destroy(this.aLong119);
			this.aLong119 = 0L;
		}
		if (this.aLong113 != 0L) {
			IUnknown.Release(this.aLong113);
			this.aLong113 = 0L;
		}
	}

	@OriginalMember(owner = "client!apn", name = "hc", descriptor = "()V", line = 324)
	@Override
	void method19932() {
		super.finalize();
	}

	@OriginalMember(owner = "client!apn", name = "hd", descriptor = "()V", line = 324)
	@Override
	void method19933() {
		super.finalize();
	}

	@OriginalMember(owner = "client!apn", name = "hp", descriptor = "()V", line = 324)
	@Override
	void method19934() {
		super.finalize();
	}

	@OriginalMember(owner = "client!apn", name = "finalize", descriptor = "()V", line = 324)
	@Override
	void finalize() {
		super.finalize();
	}

	@OriginalMember(owner = "client!apn", name = "sq", descriptor = "()F", line = 328)
	@Override
	public float method20664() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!apn", name = "yg", descriptor = "()F", line = 328)
	@Override
	public float method20679() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!apn", name = "mt", descriptor = "()Lclient!aeo;", line = 332)
	@Override
	public Class92_Sub1 method20325() {
		return new Class92_Sub1_Sub2_Sub1(this);
	}

	@OriginalMember(owner = "client!apn", name = "mi", descriptor = "()Lclient!aeo;", line = 332)
	@Override
	public Class92_Sub1 method20326() {
		return new Class92_Sub1_Sub2_Sub1(this);
	}

	@OriginalMember(owner = "client!apn", name = "ac", descriptor = "()Lclient!aeo;", line = 332)
	@Override
	public Class92_Sub1 method20063() {
		return new Class92_Sub1_Sub2_Sub1(this);
	}

	@OriginalMember(owner = "client!apn", name = "ad", descriptor = "(Ljava/awt/Canvas;II)Lclient!aer;", line = 336)
	@Override
	Class92_Sub2 method20062(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class92_Sub2_Sub1_Sub1(this, arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!apn", name = "fx", descriptor = "(Ljava/awt/Canvas;II)Lclient!aer;", line = 336)
	@Override
	Class92_Sub2 method20053(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class92_Sub2_Sub1_Sub1(this, arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!apn", name = "fr", descriptor = "(Ljava/awt/Canvas;II)Lclient!aer;", line = 336)
	@Override
	Class92_Sub2 method20182(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class92_Sub2_Sub1_Sub1(this, arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!apn", name = "ml", descriptor = "(IILclient!dt;Lclient!dl;I)Lclient!df;", line = 340)
	@Override
	public Interface21 method20073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4) {
		return new Class454(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!apn", name = "mj", descriptor = "(IILclient!dt;Lclient!dl;I)Lclient!df;", line = 340)
	@Override
	public Interface21 method20327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4) {
		return new Class454(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!apn", name = "av", descriptor = "(IILclient!dt;Lclient!dl;I)Lclient!df;", line = 340)
	@Override
	public Interface21 method20376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4) {
		return new Class454(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!apn", name = "at", descriptor = "(II)Lclient!de;", line = 344)
	@Override
	public Interface20 method20064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class435(this, Class206.aClass206_21, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!apn", name = "mr", descriptor = "(II)Lclient!de;", line = 344)
	@Override
	public Interface20 method20328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class435(this, Class206.aClass206_21, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!apn", name = "mv", descriptor = "(II)Lclient!de;", line = 344)
	@Override
	public Interface20 method20329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class435(this, Class206.aClass206_21, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!apn", name = "mb", descriptor = "(II)Lclient!de;", line = 344)
	@Override
	public Interface20 method20356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class435(this, Class206.aClass206_21, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!apn", name = "ae", descriptor = "(III)Lclient!de;", line = 348)
	@Override
	public Interface20 method20065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class435(this, Class206.aClass206_21, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!apn", name = "me", descriptor = "(III)Lclient!de;", line = 348)
	@Override
	public Interface20 method20357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class435(this, Class206.aClass206_21, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!apn", name = "mg", descriptor = "(III)Lclient!de;", line = 348)
	@Override
	public Interface20 method20363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class435(this, Class206.aClass206_21, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!apn", name = "ags", descriptor = "(Lclient!nf;)Lclient!aje;", line = 352)
	Class77_Sub6 method19535(@OriginalArg(0) Interface49 arg0) {
		for (@Pc(5) Class77_Sub6 local5 = (Class77_Sub6) this.aClass695_32.method36395(); local5 != null; local5 = (Class77_Sub6) this.aClass695_32.method36406()) {
			if (local5.anObject5 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!apn", name = "ahu", descriptor = "(Lclient!nf;)Lclient!aje;", line = 352)
	Class77_Sub6 method19536(@OriginalArg(0) Interface49 arg0) {
		for (@Pc(5) Class77_Sub6 local5 = (Class77_Sub6) this.aClass695_32.method36395(); local5 != null; local5 = (Class77_Sub6) this.aClass695_32.method36406()) {
			if (local5.anObject5 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!apn", name = "ahs", descriptor = "(Lclient!nf;)Lclient!aje;", line = 352)
	Class77_Sub6 method19537(@OriginalArg(0) Interface49 arg0) {
		for (@Pc(5) Class77_Sub6 local5 = (Class77_Sub6) this.aClass695_32.method36395(); local5 != null; local5 = (Class77_Sub6) this.aClass695_32.method36406()) {
			if (local5.anObject5 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!apn", name = "ahd", descriptor = "(Lclient!nf;)Lclient!aje;", line = 352)
	Class77_Sub6 method19538(@OriginalArg(0) Interface49 arg0) {
		for (@Pc(5) Class77_Sub6 local5 = (Class77_Sub6) this.aClass695_32.method36395(); local5 != null; local5 = (Class77_Sub6) this.aClass695_32.method36406()) {
			if (local5.anObject5 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!apn", name = "agr", descriptor = "(Lclient!nf;)V", line = 359)
	void method19539(@OriginalArg(0) Interface49 arg0) {
		if (this.method19535(arg0) == null) {
			this.aClass695_32.method36383(new Class77_Sub6(arg0));
		}
	}

	@OriginalMember(owner = "client!apn", name = "ahz", descriptor = "(Lclient!nf;)V", line = 359)
	void method19540(@OriginalArg(0) Interface49 arg0) {
		if (this.method19535(arg0) == null) {
			this.aClass695_32.method36383(new Class77_Sub6(arg0));
		}
	}

	@OriginalMember(owner = "client!apn", name = "aho", descriptor = "(Lclient!nf;)V", line = 359)
	void method19541(@OriginalArg(0) Interface49 arg0) {
		if (this.method19535(arg0) == null) {
			this.aClass695_32.method36383(new Class77_Sub6(arg0));
		}
	}

	@OriginalMember(owner = "client!apn", name = "ahw", descriptor = "(Lclient!nf;)V", line = 363)
	void method19542(@OriginalArg(0) Interface49 arg0) {
		@Pc(3) Class77_Sub6 local3 = this.method19535(arg0);
		if (local3 != null) {
			local3.method24063();
		}
	}

	@OriginalMember(owner = "client!apn", name = "agl", descriptor = "(Lclient!nf;)V", line = 363)
	void method19543(@OriginalArg(0) Interface49 arg0) {
		@Pc(3) Class77_Sub6 local3 = this.method19535(arg0);
		if (local3 != null) {
			local3.method24063();
		}
	}

	@OriginalMember(owner = "client!apn", name = "ah", descriptor = "(IIII)[I", line = 368)
	@Override
	public int[] method20066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20012();
		@Pc(3) int[] local3 = null;
		@Pc(8) long local8 = IDirect3DDevice.GetRenderTarget(this.aLong119, 0);
		@Pc(18) long local18 = IDirect3DDevice.CreateRenderTarget(this.aLong119, arg2, arg3, 21, 0, 0, true);
		@Pc(33) int local33 = IDirect3DDevice.StretchRect(this.aLong119, local8, arg0, arg1, arg2, arg3, local18, 0, 0, arg2, arg3, 1);
		this.method20393(arg2 * arg3 * 4);
		if (p.method27710(local33)) {
			local3 = new int[arg2 * arg3];
			IDirect3DSurface.Download(local18, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong121);
			this.aByteBuffer7.clear();
			this.aByteBuffer7.asIntBuffer().get(local3);
		}
		IUnknown.Release(local8);
		IUnknown.Release(local18);
		return local3;
	}

	@OriginalMember(owner = "client!apn", name = "fc", descriptor = "(IIII)[I", line = 368)
	@Override
	public int[] method20347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20012();
		@Pc(3) int[] local3 = null;
		@Pc(8) long local8 = IDirect3DDevice.GetRenderTarget(this.aLong119, 0);
		@Pc(18) long local18 = IDirect3DDevice.CreateRenderTarget(this.aLong119, arg2, arg3, 21, 0, 0, true);
		@Pc(33) int local33 = IDirect3DDevice.StretchRect(this.aLong119, local8, arg0, arg1, arg2, arg3, local18, 0, 0, arg2, arg3, 1);
		this.method20393(arg2 * arg3 * 4);
		if (p.method27710(local33)) {
			local3 = new int[arg2 * arg3];
			IDirect3DSurface.Download(local18, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong121);
			this.aByteBuffer7.clear();
			this.aByteBuffer7.asIntBuffer().get(local3);
		}
		IUnknown.Release(local8);
		IUnknown.Release(local18);
		return local3;
	}

	@OriginalMember(owner = "client!apn", name = "gr", descriptor = "(IIII)[I", line = 368)
	@Override
	public int[] method20184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20012();
		@Pc(3) int[] local3 = null;
		@Pc(8) long local8 = IDirect3DDevice.GetRenderTarget(this.aLong119, 0);
		@Pc(18) long local18 = IDirect3DDevice.CreateRenderTarget(this.aLong119, arg2, arg3, 21, 0, 0, true);
		@Pc(33) int local33 = IDirect3DDevice.StretchRect(this.aLong119, local8, arg0, arg1, arg2, arg3, local18, 0, 0, arg2, arg3, 1);
		this.method20393(arg2 * arg3 * 4);
		if (p.method27710(local33)) {
			local3 = new int[arg2 * arg3];
			IDirect3DSurface.Download(local18, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong121);
			this.aByteBuffer7.clear();
			this.aByteBuffer7.asIntBuffer().get(local3);
		}
		IUnknown.Release(local8);
		IUnknown.Release(local18);
		return local3;
	}

	@OriginalMember(owner = "client!apn", name = "as", descriptor = "()V", line = 385)
	@Override
	public void method20067() {
	}

	@OriginalMember(owner = "client!apn", name = "gi", descriptor = "()V", line = 385)
	@Override
	public void method20186() {
	}

	@OriginalMember(owner = "client!apn", name = "ga", descriptor = "()V", line = 385)
	@Override
	public void method20188() {
	}

	@OriginalMember(owner = "client!apn", name = "gc", descriptor = "()V", line = 385)
	@Override
	public void method20189() {
	}

	@OriginalMember(owner = "client!apn", name = "gt", descriptor = "()V", line = 385)
	@Override
	public void method20187() {
	}

	@OriginalMember(owner = "client!apn", name = "gj", descriptor = "()V", line = 385)
	@Override
	public void method20223() {
	}

	@OriginalMember(owner = "client!apn", name = "aq", descriptor = "()Z", line = 388)
	@Override
	public boolean method20068() {
		return true;
	}

	@OriginalMember(owner = "client!apn", name = "gz", descriptor = "()Z", line = 388)
	@Override
	public boolean method20191() {
		return true;
	}

	@OriginalMember(owner = "client!apn", name = "agp", descriptor = "(II)V", line = 392)
	void method19544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20077();
		this.method19976(arg0, arg1);
		this.aLong114 = IDirect3DDevice.CreateRenderTarget(this.aLong119, arg0, arg1, method19578(Class212.aClass212_18, Class206.aClass206_23), 0, 0, false);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.aLongArray14[local21] = IDirect3DDevice.CreateOffscreenPlainSurface(this.aLong119, arg0, arg1, method19578(Class212.aClass212_18, Class206.aClass206_23), 2);
		}
		this.method20393(arg0 * arg1 * 4);
	}

	@OriginalMember(owner = "client!apn", name = "ahi", descriptor = "(II)V", line = 392)
	void method19545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20077();
		this.method19976(arg0, arg1);
		this.aLong114 = IDirect3DDevice.CreateRenderTarget(this.aLong119, arg0, arg1, method19578(Class212.aClass212_18, Class206.aClass206_23), 0, 0, false);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.aLongArray14[local21] = IDirect3DDevice.CreateOffscreenPlainSurface(this.aLong119, arg0, arg1, method19578(Class212.aClass212_18, Class206.aClass206_23), 2);
		}
		this.method20393(arg0 * arg1 * 4);
	}

	@OriginalMember(owner = "client!apn", name = "ahx", descriptor = "(II)V", line = 392)
	void method19546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20077();
		this.method19976(arg0, arg1);
		this.aLong114 = IDirect3DDevice.CreateRenderTarget(this.aLong119, arg0, arg1, method19578(Class212.aClass212_18, Class206.aClass206_23), 0, 0, false);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.aLongArray14[local21] = IDirect3DDevice.CreateOffscreenPlainSurface(this.aLong119, arg0, arg1, method19578(Class212.aClass212_18, Class206.aClass206_23), 2);
		}
		this.method20393(arg0 * arg1 * 4);
	}

	@OriginalMember(owner = "client!apn", name = "am", descriptor = "()Z", line = 402)
	@Override
	public boolean method20069() {
		if (this.aBoolean412) {
			return false;
		} else {
			return this.aLongArray15[this.anInt2711] == 0L;
		}
	}

	@OriginalMember(owner = "client!apn", name = "gb", descriptor = "()Z", line = 402)
	@Override
	public boolean method20192() {
		if (this.aBoolean412) {
			return false;
		} else {
			return this.aLongArray15[this.anInt2711] == 0L;
		}
	}

	@OriginalMember(owner = "client!apn", name = "gu", descriptor = "()Z", line = 412)
	@Override
	public boolean method20193() {
		return true;
	}

	@OriginalMember(owner = "client!apn", name = "ay", descriptor = "()Z", line = 412)
	@Override
	public boolean method20172() {
		return true;
	}

	@OriginalMember(owner = "client!apn", name = "af", descriptor = "()Z", line = 416)
	@Override
	public boolean method20371() {
		return false;
	}

	@OriginalMember(owner = "client!apn", name = "gk", descriptor = "()Z", line = 416)
	@Override
	public boolean method20358() {
		return false;
	}

	@OriginalMember(owner = "client!apn", name = "gp", descriptor = "()Z", line = 416)
	@Override
	public boolean method20195() {
		return false;
	}

	@OriginalMember(owner = "client!apn", name = "aa", descriptor = "(III)V", line = 420)
	@Override
	public void method20072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aLong114 == 0L) {
			this.method19544(arg1, arg2);
		}
		@Pc(13) long local13 = IDirect3DDevice.GetRenderTarget(this.aLong119, 0);
		if (p.method27707(IDirect3DDevice.StretchRect(this.aLong119, local13, 0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), this.aLong114, this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615, 2))) {
		}
		IUnknown.Release(local13);
		IDirect3DDevice.GetRenderTargetData(this.aLong119, this.aLong114, this.aLongArray14[this.anInt2711]);
		@Pc(63) long local63 = IDirect3DDevice.CreateEventQuery(this.aLong119);
		if (p.method27710(IDirect3DEventQuery.Issue(local63))) {
			this.aLongArray15[this.anInt2711] = local63;
		}
		this.anIntArray246[this.anInt2711] = arg0;
		if (++this.anInt2711 >= 3) {
			this.anInt2711 = 0;
		}
	}

	@OriginalMember(owner = "client!apn", name = "gf", descriptor = "(III)V", line = 420)
	@Override
	public void method20197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aLong114 == 0L) {
			this.method19544(arg1, arg2);
		}
		@Pc(13) long local13 = IDirect3DDevice.GetRenderTarget(this.aLong119, 0);
		if (p.method27707(IDirect3DDevice.StretchRect(this.aLong119, local13, 0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), this.aLong114, this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615, 2))) {
		}
		IUnknown.Release(local13);
		IDirect3DDevice.GetRenderTargetData(this.aLong119, this.aLong114, this.aLongArray14[this.anInt2711]);
		@Pc(63) long local63 = IDirect3DDevice.CreateEventQuery(this.aLong119);
		if (p.method27710(IDirect3DEventQuery.Issue(local63))) {
			this.aLongArray15[this.anInt2711] = local63;
		}
		this.anIntArray246[this.anInt2711] = arg0;
		if (++this.anInt2711 >= 3) {
			this.anInt2711 = 0;
		}
	}

	@OriginalMember(owner = "client!apn", name = "an", descriptor = "()I", line = 435)
	@Override
	public int method20070() {
		if (this.aLongArray15[this.anInt2714] == 0L) {
			return -1;
		} else if (p.method27710(IDirect3DEventQuery.IsSignaled(this.aLongArray15[this.anInt2714]))) {
			return this.anIntArray246[this.anInt2714];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!apn", name = "gq", descriptor = "()I", line = 435)
	@Override
	public int method20380() {
		if (this.aLongArray15[this.anInt2714] == 0L) {
			return -1;
		} else if (p.method27710(IDirect3DEventQuery.IsSignaled(this.aLongArray15[this.anInt2714]))) {
			return this.anIntArray246[this.anInt2714];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!apn", name = "ge", descriptor = "()I", line = 435)
	@Override
	public int method20288() {
		if (this.aLongArray15[this.anInt2714] == 0L) {
			return -1;
		} else if (p.method27710(IDirect3DEventQuery.IsSignaled(this.aLongArray15[this.anInt2714]))) {
			return this.anIntArray246[this.anInt2714];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!apn", name = "ab", descriptor = "()V", line = 440)
	@Override
	public void method20366() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray15[local1] != 0L) {
				IUnknown.Release(this.aLongArray15[local1]);
				this.aLongArray15[local1] = 0L;
			}
		}
		this.anInt2711 = 0;
		this.anInt2714 = 0;
	}

	@OriginalMember(owner = "client!apn", name = "gd", descriptor = "()V", line = 440)
	@Override
	public void method20200() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray15[local1] != 0L) {
				IUnknown.Release(this.aLongArray15[local1]);
				this.aLongArray15[local1] = 0L;
			}
		}
		this.anInt2711 = 0;
		this.anInt2714 = 0;
	}

	@OriginalMember(owner = "client!apn", name = "go", descriptor = "()V", line = 440)
	@Override
	public void method20054() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray15[local1] != 0L) {
				IUnknown.Release(this.aLongArray15[local1]);
				this.aLongArray15[local1] = 0L;
			}
		}
		this.anInt2711 = 0;
		this.anInt2714 = 0;
	}

	@OriginalMember(owner = "client!apn", name = "gx", descriptor = "()V", line = 440)
	@Override
	public void method20198() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray15[local1] != 0L) {
				IUnknown.Release(this.aLongArray15[local1]);
				this.aLongArray15[local1] = 0L;
			}
		}
		this.anInt2711 = 0;
		this.anInt2714 = 0;
	}

	@OriginalMember(owner = "client!apn", name = "gv", descriptor = "()V", line = 440)
	@Override
	public void method20199() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray15[local1] != 0L) {
				IUnknown.Release(this.aLongArray15[local1]);
				this.aLongArray15[local1] = 0L;
			}
		}
		this.anInt2711 = 0;
		this.anInt2714 = 0;
	}

	@OriginalMember(owner = "client!apn", name = "gn", descriptor = "()V", line = 440)
	@Override
	public void method20044() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray15[local1] != 0L) {
				IUnknown.Release(this.aLongArray15[local1]);
				this.aLongArray15[local1] = 0L;
			}
		}
		this.anInt2711 = 0;
		this.anInt2714 = 0;
	}

	@OriginalMember(owner = "client!apn", name = "ap", descriptor = "(II)J", line = 451)
	@Override
	public long method20138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method19547(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!apn", name = "nn", descriptor = "(II)J", line = 451)
	@Override
	public long method20337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method19547(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!apn", name = "gh", descriptor = "(II[I[I)V", line = 455)
	@Override
	public void method20204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method19547(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apn", name = "az", descriptor = "(II[I[I)V", line = 455)
	@Override
	public void method20075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method19547(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apn", name = "gs", descriptor = "(II[I[I)V", line = 455)
	@Override
	public void method20202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method19547(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apn", name = "gl", descriptor = "(II[I[I)V", line = 455)
	@Override
	public void method20203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method19547(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apn", name = "gm", descriptor = "(II[I[I)V", line = 455)
	@Override
	public void method20150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method19547(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apn", name = "agi", descriptor = "(II[I[I)J", line = 459)
	long method19547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (this.aLongArray15[this.anInt2714] != 0L) {
			IUnknown.Release(this.aLongArray15[this.anInt2714]);
			this.aLongArray15[this.anInt2714] = 0L;
		}
		this.aByteBuffer7.clear();
		IDirect3DSurface.Download(this.aLongArray14[this.anInt2714], 0, 0, arg0, arg1, arg0 * 4, 0, this.aLong121);
		if (++this.anInt2714 >= 3) {
			this.anInt2714 = 0;
		}
		if (arg2 == null) {
			return this.aLong121;
		} else {
			this.aByteBuffer7.asIntBuffer().get(arg2);
			return 0L;
		}
	}

	@OriginalMember(owner = "client!apn", name = "ahe", descriptor = "(II[I[I)J", line = 459)
	long method19548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (this.aLongArray15[this.anInt2714] != 0L) {
			IUnknown.Release(this.aLongArray15[this.anInt2714]);
			this.aLongArray15[this.anInt2714] = 0L;
		}
		this.aByteBuffer7.clear();
		IDirect3DSurface.Download(this.aLongArray14[this.anInt2714], 0, 0, arg0, arg1, arg0 * 4, 0, this.aLong121);
		if (++this.anInt2714 >= 3) {
			this.anInt2714 = 0;
		}
		if (arg2 == null) {
			return this.aLong121;
		} else {
			this.aByteBuffer7.asIntBuffer().get(arg2);
			return 0L;
		}
	}

	@OriginalMember(owner = "client!apn", name = "aw", descriptor = "(J)V", line = 475)
	@Override
	public void method20074(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!apn", name = "gg", descriptor = "(J)V", line = 475)
	@Override
	public void method20201(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!apn", name = "bj", descriptor = "()V", line = 478)
	@Override
	public void method20077() {
		if (this.aLong114 != 0L) {
			IUnknown.Release(this.aLong114);
			this.aLong114 = 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			if (this.aLongArray15[local13] != 0L) {
				IUnknown.Release(this.aLongArray15[local13]);
				this.aLongArray15[local13] = 0L;
			}
			if (this.aLongArray14[local13] != 0L) {
				IUnknown.Release(this.aLongArray14[local13]);
				this.aLongArray14[local13] = 0L;
			}
		}
		this.anInt2711 = 0;
		this.anInt2714 = 0;
	}

	@OriginalMember(owner = "client!apn", name = "gw", descriptor = "()V", line = 478)
	@Override
	public void method20130() {
		if (this.aLong114 != 0L) {
			IUnknown.Release(this.aLong114);
			this.aLong114 = 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			if (this.aLongArray15[local13] != 0L) {
				IUnknown.Release(this.aLongArray15[local13]);
				this.aLongArray15[local13] = 0L;
			}
			if (this.aLongArray14[local13] != 0L) {
				IUnknown.Release(this.aLongArray14[local13]);
				this.aLongArray14[local13] = 0L;
			}
		}
		this.anInt2711 = 0;
		this.anInt2714 = 0;
	}

	@OriginalMember(owner = "client!apn", name = "hl", descriptor = "()V", line = 478)
	@Override
	public void method20287() {
		if (this.aLong114 != 0L) {
			IUnknown.Release(this.aLong114);
			this.aLong114 = 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			if (this.aLongArray15[local13] != 0L) {
				IUnknown.Release(this.aLongArray15[local13]);
				this.aLongArray15[local13] = 0L;
			}
			if (this.aLongArray14[local13] != 0L) {
				IUnknown.Release(this.aLongArray14[local13]);
				this.aLongArray14[local13] = 0L;
			}
		}
		this.anInt2711 = 0;
		this.anInt2714 = 0;
	}

	@OriginalMember(owner = "client!apn", name = "ds", descriptor = "(Lclient!da;Lclient!da;FLclient!da;)Lclient!da;", line = 497)
	@Override
	public Class91 method20220(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class91 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!apn", name = "kd", descriptor = "(Lclient!da;Lclient!da;FLclient!da;)Lclient!da;", line = 497)
	@Override
	public Class91 method20252(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class91 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!apn", name = "bg", descriptor = "(II)V", line = 501)
	@Override
	public void method20125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		IDirect3DDevice.Clear(this.aLong119, arg0, arg1, 1.0F, 0);
	}

	@OriginalMember(owner = "client!apn", name = "id", descriptor = "(II)V", line = 501)
	@Override
	public void method20226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		IDirect3DDevice.Clear(this.aLong119, arg0, arg1, 1.0F, 0);
	}

	@OriginalMember(owner = "client!apn", name = "ii", descriptor = "(II)V", line = 501)
	@Override
	public void method20227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		IDirect3DDevice.Clear(this.aLong119, arg0, arg1, 1.0F, 0);
	}

	@OriginalMember(owner = "client!apn", name = "ip", descriptor = "(II)V", line = 501)
	@Override
	public void method20228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		IDirect3DDevice.Clear(this.aLong119, arg0, arg1, 1.0F, 0);
	}

	@OriginalMember(owner = "client!apn", name = "za", descriptor = "()V", line = 505)
	@Override
	void method20704() {
		if (this.aClass92_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong119, this.anInt2798 + this.anInt2820, this.anInt2825 + this.anInt2821, this.anInt2822, this.anInt2829, this.aFloat193, this.aFloat194);
		}
	}

	@OriginalMember(owner = "client!apn", name = "zd", descriptor = "()V", line = 505)
	@Override
	void method20649() {
		if (this.aClass92_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong119, this.anInt2798 + this.anInt2820, this.anInt2825 + this.anInt2821, this.anInt2822, this.anInt2829, this.aFloat193, this.aFloat194);
		}
	}

	@OriginalMember(owner = "client!apn", name = "zr", descriptor = "()V", line = 505)
	@Override
	void method20705() {
		if (this.aClass92_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong119, this.anInt2798 + this.anInt2820, this.anInt2825 + this.anInt2821, this.anInt2822, this.anInt2829, this.aFloat193, this.aFloat194);
		}
	}

	@OriginalMember(owner = "client!apn", name = "zh", descriptor = "()V", line = 505)
	@Override
	void method20633() {
		if (this.aClass92_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong119, this.anInt2798 + this.anInt2820, this.anInt2825 + this.anInt2821, this.anInt2822, this.anInt2829, this.aFloat193, this.aFloat194);
		}
	}

	@OriginalMember(owner = "client!apn", name = "sp", descriptor = "()V", line = 505)
	@Override
	void method20617() {
		if (this.aClass92_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong119, this.anInt2798 + this.anInt2820, this.anInt2825 + this.anInt2821, this.anInt2822, this.anInt2829, this.aFloat193, this.aFloat194);
		}
	}

	@OriginalMember(owner = "client!apn", name = "sn", descriptor = "()V", line = 509)
	@Override
	void method20618() {
		IDirect3DDevice.SetScissorRect(this.aLong119, this.anInt2798 + this.anInt2815, this.anInt2825 + this.anInt2813, this.anInt2816, this.anInt2814);
	}

	@OriginalMember(owner = "client!apn", name = "zq", descriptor = "()V", line = 509)
	@Override
	void method20615() {
		IDirect3DDevice.SetScissorRect(this.aLong119, this.anInt2798 + this.anInt2815, this.anInt2825 + this.anInt2813, this.anInt2816, this.anInt2814);
	}

	@OriginalMember(owner = "client!apn", name = "zo", descriptor = "()V", line = 509)
	@Override
	void method20706() {
		IDirect3DDevice.SetScissorRect(this.aLong119, this.anInt2798 + this.anInt2815, this.anInt2825 + this.anInt2813, this.anInt2816, this.anInt2814);
	}

	@OriginalMember(owner = "client!apn", name = "sm", descriptor = "()V", line = 513)
	@Override
	void method20619() {
		IDirect3DDevice.method27704(this.aLong119, 174, this.aBoolean461);
	}

	@OriginalMember(owner = "client!apn", name = "zp", descriptor = "()V", line = 513)
	@Override
	void method20707() {
		IDirect3DDevice.method27704(this.aLong119, 174, this.aBoolean461);
	}

	@OriginalMember(owner = "client!apn", name = "zl", descriptor = "()V", line = 513)
	@Override
	void method20708() {
		IDirect3DDevice.method27704(this.aLong119, 174, this.aBoolean461);
	}

	@OriginalMember(owner = "client!apn", name = "agb", descriptor = "(J)V", line = 517)
	final void method19549(@OriginalArg(0) long arg0) {
		this.aLong118 = arg0;
		IDirect3DDevice.SetVertexShader(this.aLong119, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "ahf", descriptor = "(J)V", line = 517)
	final void method19550(@OriginalArg(0) long arg0) {
		this.aLong118 = arg0;
		IDirect3DDevice.SetVertexShader(this.aLong119, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "ahq", descriptor = "(J)V", line = 522)
	final void method19551(@OriginalArg(0) long arg0) {
		IDirect3DDevice.SetPixelShader(this.aLong119, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "ahh", descriptor = "(J)V", line = 522)
	final void method19552(@OriginalArg(0) long arg0) {
		IDirect3DDevice.SetPixelShader(this.aLong119, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "agv", descriptor = "(J)V", line = 522)
	final void method19553(@OriginalArg(0) long arg0) {
		IDirect3DDevice.SetPixelShader(this.aLong119, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "rx", descriptor = "(Lclient!oi;Lclient!oi;Lclient!oi;)V", line = 526)
	@Override
	public void method20736(@OriginalArg(0) Class442 arg0, @OriginalArg(1) Class442 arg1, @OriginalArg(2) Class442 arg2) {
		IDirect3DDevice.SetTransform(this.aLong119, 256, arg0.aFloatArray109);
		IDirect3DDevice.SetTransform(this.aLong119, 2, arg1.aFloatArray109);
		IDirect3DDevice.SetTransform(this.aLong119, 3, arg2.aFloatArray109);
	}

	@OriginalMember(owner = "client!apn", name = "xx", descriptor = "(Lclient!oi;Lclient!oi;Lclient!oi;)V", line = 526)
	@Override
	public void method20678(@OriginalArg(0) Class442 arg0, @OriginalArg(1) Class442 arg1, @OriginalArg(2) Class442 arg2) {
		IDirect3DDevice.SetTransform(this.aLong119, 256, arg0.aFloatArray109);
		IDirect3DDevice.SetTransform(this.aLong119, 2, arg1.aFloatArray109);
		IDirect3DDevice.SetTransform(this.aLong119, 3, arg2.aFloatArray109);
	}

	@OriginalMember(owner = "client!apn", name = "tf", descriptor = "(Lclient!oi;)V", line = 532)
	@Override
	public void method20675(@OriginalArg(0) Class442 arg0) {
		arg0.method28965(this.aClass442_77);
	}

	@OriginalMember(owner = "client!apn", name = "agq", descriptor = "(Lclient!oi;)V", line = 532)
	@Override
	public void method20774(@OriginalArg(0) Class442 arg0) {
		arg0.method28965(this.aClass442_77);
	}

	@OriginalMember(owner = "client!apn", name = "tr", descriptor = "()V", line = 536)
	@Override
	void method20623() {
		IDirect3DDevice.method27704(this.aLong119, 7, this.aBoolean449 && this.aBoolean442);
	}

	@OriginalMember(owner = "client!apn", name = "aai", descriptor = "()V", line = 536)
	@Override
	void method20712() {
		IDirect3DDevice.method27704(this.aLong119, 7, this.aBoolean449 && this.aBoolean442);
	}

	@OriginalMember(owner = "client!apn", name = "aah", descriptor = "()V", line = 540)
	@Override
	void method20713() {
		IDirect3DDevice.method27704(this.aLong119, 14, this.aBoolean440 && this.aBoolean441);
	}

	@OriginalMember(owner = "client!apn", name = "tg", descriptor = "()V", line = 540)
	@Override
	void method20624() {
		IDirect3DDevice.method27704(this.aLong119, 14, this.aBoolean440 && this.aBoolean441);
	}

	@OriginalMember(owner = "client!apn", name = "aao", descriptor = "()V", line = 540)
	@Override
	void method20714() {
		IDirect3DDevice.method27704(this.aLong119, 14, this.aBoolean440 && this.aBoolean441);
	}

	@OriginalMember(owner = "client!apn", name = "tp", descriptor = "()V", line = 544)
	@Override
	void method20629() {
		if (this.aBoolean434) {
			IDirect3DDevice.method27704(this.aLong119, 137, this.aBoolean436 && !this.aBoolean444);
		}
	}

	@OriginalMember(owner = "client!apn", name = "abb", descriptor = "()V", line = 544)
	@Override
	void method20715() {
		if (this.aBoolean434) {
			IDirect3DDevice.method27704(this.aLong119, 137, this.aBoolean436 && !this.aBoolean444);
		}
	}

	@OriginalMember(owner = "client!apn", name = "abj", descriptor = "()V", line = 544)
	@Override
	void method20672() {
		if (this.aBoolean434) {
			IDirect3DDevice.method27704(this.aLong119, 137, this.aBoolean436 && !this.aBoolean444);
		}
	}

	@OriginalMember(owner = "client!apn", name = "tq", descriptor = "()V", line = 550)
	@Override
	void method20668() {
		if (this.aBoolean434) {
			D3DLIGHT.SetAmbient(this.aLong115, this.aFloat195 * this.aFloat203, this.aFloat209 * this.aFloat203, this.aFloat196 * this.aFloat203, 0.0F);
			this.aBoolean413 = false;
		}
	}

	@OriginalMember(owner = "client!apn", name = "abl", descriptor = "()V", line = 550)
	@Override
	void method20716() {
		if (this.aBoolean434) {
			D3DLIGHT.SetAmbient(this.aLong115, this.aFloat195 * this.aFloat203, this.aFloat209 * this.aFloat203, this.aFloat196 * this.aFloat203, 0.0F);
			this.aBoolean413 = false;
		}
	}

	@OriginalMember(owner = "client!apn", name = "ts", descriptor = "()V", line = 557)
	@Override
	void method20631() {
		if (!this.aBoolean434) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean443 ? this.aFloat204 : 0.0F;
		@Pc(19) float local19 = this.aBoolean443 ? -this.aFloat208 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong115, local10 * this.aFloat195, local10 * this.aFloat209, local10 * this.aFloat196, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong116, local19 * this.aFloat195, local19 * this.aFloat209, local19 * this.aFloat196, 0.0F);
		this.aBoolean413 = false;
	}

	@OriginalMember(owner = "client!apn", name = "abi", descriptor = "()V", line = 557)
	@Override
	void method20717() {
		if (!this.aBoolean434) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean443 ? this.aFloat204 : 0.0F;
		@Pc(19) float local19 = this.aBoolean443 ? -this.aFloat208 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong115, local10 * this.aFloat195, local10 * this.aFloat209, local10 * this.aFloat196, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong116, local19 * this.aFloat195, local19 * this.aFloat209, local19 * this.aFloat196, 0.0F);
		this.aBoolean413 = false;
	}

	@OriginalMember(owner = "client!apn", name = "abs", descriptor = "()V", line = 557)
	@Override
	void method20699() {
		if (!this.aBoolean434) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean443 ? this.aFloat204 : 0.0F;
		@Pc(19) float local19 = this.aBoolean443 ? -this.aFloat208 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong115, local10 * this.aFloat195, local10 * this.aFloat209, local10 * this.aFloat196, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong116, local19 * this.aFloat195, local19 * this.aFloat209, local19 * this.aFloat196, 0.0F);
		this.aBoolean413 = false;
	}

	@OriginalMember(owner = "client!apn", name = "afy", descriptor = "()V", line = 567)
	@Override
	void method20767() {
		if (this.aBoolean434) {
			D3DLIGHT.SetDirection(this.aLong115, -this.aFloatArray71[0], -this.aFloatArray71[1], -this.aFloatArray71[2]);
			D3DLIGHT.SetDirection(this.aLong116, -this.aFloatArray72[0], -this.aFloatArray72[1], -this.aFloatArray72[2]);
			this.aBoolean413 = false;
		}
	}

	@OriginalMember(owner = "client!apn", name = "tx", descriptor = "()V", line = 567)
	@Override
	void method20689() {
		if (this.aBoolean434) {
			D3DLIGHT.SetDirection(this.aLong115, -this.aFloatArray71[0], -this.aFloatArray71[1], -this.aFloatArray71[2]);
			D3DLIGHT.SetDirection(this.aLong116, -this.aFloatArray72[0], -this.aFloatArray72[1], -this.aFloatArray72[2]);
			this.aBoolean413 = false;
		}
	}

	@OriginalMember(owner = "client!apn", name = "tw", descriptor = "()V", line = 575)
	@Override
	void method20632() {
		this.method20631();
		this.method20698();
	}

	@OriginalMember(owner = "client!apn", name = "abx", descriptor = "()V", line = 575)
	@Override
	void method20719() {
		this.method20631();
		this.method20698();
	}

	@OriginalMember(owner = "client!apn", name = "abv", descriptor = "()V", line = 575)
	@Override
	void method20654() {
		this.method20631();
		this.method20698();
	}

	@OriginalMember(owner = "client!apn", name = "abg", descriptor = "()V", line = 575)
	@Override
	void method20720() {
		this.method20631();
		this.method20698();
	}

	@OriginalMember(owner = "client!apn", name = "ta", descriptor = "()V", line = 580)
	@Override
	void method20698() {
		if (!this.aBoolean434 || this.aBoolean413) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong119, 0, false);
		IDirect3DDevice.LightEnable(this.aLong119, 1, false);
		IDirect3DDevice.SetLight(this.aLong119, 0, this.aLong115);
		IDirect3DDevice.SetLight(this.aLong119, 1, this.aLong116);
		IDirect3DDevice.LightEnable(this.aLong119, 0, true);
		IDirect3DDevice.LightEnable(this.aLong119, 1, true);
		this.aBoolean413 = true;
	}

	@OriginalMember(owner = "client!apn", name = "abw", descriptor = "()V", line = 580)
	@Override
	void method20718() {
		if (!this.aBoolean434 || this.aBoolean413) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong119, 0, false);
		IDirect3DDevice.LightEnable(this.aLong119, 1, false);
		IDirect3DDevice.SetLight(this.aLong119, 0, this.aLong115);
		IDirect3DDevice.SetLight(this.aLong119, 1, this.aLong116);
		IDirect3DDevice.LightEnable(this.aLong119, 0, true);
		IDirect3DDevice.LightEnable(this.aLong119, 1, true);
		this.aBoolean413 = true;
	}

	@OriginalMember(owner = "client!apn", name = "abk", descriptor = "()V", line = 580)
	@Override
	void method20666() {
		if (!this.aBoolean434 || this.aBoolean413) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong119, 0, false);
		IDirect3DDevice.LightEnable(this.aLong119, 1, false);
		IDirect3DDevice.SetLight(this.aLong119, 0, this.aLong115);
		IDirect3DDevice.SetLight(this.aLong119, 1, this.aLong116);
		IDirect3DDevice.LightEnable(this.aLong119, 0, true);
		IDirect3DDevice.LightEnable(this.aLong119, 1, true);
		this.aBoolean413 = true;
	}

	@OriginalMember(owner = "client!apn", name = "abp", descriptor = "()V", line = 580)
	@Override
	void method20640() {
		if (!this.aBoolean434 || this.aBoolean413) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong119, 0, false);
		IDirect3DDevice.LightEnable(this.aLong119, 1, false);
		IDirect3DDevice.SetLight(this.aLong119, 0, this.aLong115);
		IDirect3DDevice.SetLight(this.aLong119, 1, this.aLong116);
		IDirect3DDevice.LightEnable(this.aLong119, 0, true);
		IDirect3DDevice.LightEnable(this.aLong119, 1, true);
		this.aBoolean413 = true;
	}

	@OriginalMember(owner = "client!apn", name = "abf", descriptor = "()V", line = 594)
	@Override
	void method20721() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2806; local1++) {
			@Pc(10) Class77_Sub22 local10 = this.aClass77_Sub22Array18[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method13557();
			@Pc(24) float local24 = local10.method13561() / 255.0F;
			D3DLIGHT.SetPosition(this.aLong117, (float) local10.method13544(), (float) local10.method13550(), (float) local10.method13552());
			D3DLIGHT.SetDiffuse(this.aLong117, (float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong117, 0.0F, 0.0F, 1.0F / (float) (local10.method13555() * local10.method13555()));
			D3DLIGHT.SetRange(this.aLong117, (float) local10.method13555());
			IDirect3DDevice.SetLight(this.aLong119, local14, this.aLong117);
			IDirect3DDevice.LightEnable(this.aLong119, local14, true);
		}
		while (local1 < this.anInt2828) {
			IDirect3DDevice.LightEnable(this.aLong119, local1 + 2, false);
			local1++;
		}
	}

	@OriginalMember(owner = "client!apn", name = "tt", descriptor = "()V", line = 594)
	@Override
	void method20647() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2806; local1++) {
			@Pc(10) Class77_Sub22 local10 = this.aClass77_Sub22Array18[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method13557();
			@Pc(24) float local24 = local10.method13561() / 255.0F;
			D3DLIGHT.SetPosition(this.aLong117, (float) local10.method13544(), (float) local10.method13550(), (float) local10.method13552());
			D3DLIGHT.SetDiffuse(this.aLong117, (float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong117, 0.0F, 0.0F, 1.0F / (float) (local10.method13555() * local10.method13555()));
			D3DLIGHT.SetRange(this.aLong117, (float) local10.method13555());
			IDirect3DDevice.SetLight(this.aLong119, local14, this.aLong117);
			IDirect3DDevice.LightEnable(this.aLong119, local14, true);
		}
		while (local1 < this.anInt2828) {
			IDirect3DDevice.LightEnable(this.aLong119, local1 + 2, false);
			local1++;
		}
	}

	@OriginalMember(owner = "client!apn", name = "abd", descriptor = "()V", line = 594)
	@Override
	void method20722() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2806; local1++) {
			@Pc(10) Class77_Sub22 local10 = this.aClass77_Sub22Array18[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method13557();
			@Pc(24) float local24 = local10.method13561() / 255.0F;
			D3DLIGHT.SetPosition(this.aLong117, (float) local10.method13544(), (float) local10.method13550(), (float) local10.method13552());
			D3DLIGHT.SetDiffuse(this.aLong117, (float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong117, 0.0F, 0.0F, 1.0F / (float) (local10.method13555() * local10.method13555()));
			D3DLIGHT.SetRange(this.aLong117, (float) local10.method13555());
			IDirect3DDevice.SetLight(this.aLong119, local14, this.aLong117);
			IDirect3DDevice.LightEnable(this.aLong119, local14, true);
		}
		while (local1 < this.anInt2828) {
			IDirect3DDevice.LightEnable(this.aLong119, local1 + 2, false);
			local1++;
		}
	}

	@OriginalMember(owner = "client!apn", name = "tl", descriptor = "(Lclient!dt;Lclient!dl;)Z", line = 613)
	@Override
	boolean method20676(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return p.method27710(IDirect3D.GetAdapterDisplayMode(this.aLong113, this.anInt2713, local3)) && p.method27710(IDirect3D.CheckDeviceFormat(this.aLong113, this.anInt2713, this.anInt2709, local3.Format, 0, 3, method19578(arg0, arg1)));
	}

	@OriginalMember(owner = "client!apn", name = "abq", descriptor = "(Lclient!dt;Lclient!dl;)Z", line = 613)
	@Override
	boolean method20723(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return p.method27710(IDirect3D.GetAdapterDisplayMode(this.aLong113, this.anInt2713, local3)) && p.method27710(IDirect3D.CheckDeviceFormat(this.aLong113, this.anInt2713, this.anInt2709, local3.Format, 0, 3, method19578(arg0, arg1)));
	}

	@OriginalMember(owner = "client!apn", name = "uk", descriptor = "(Lclient!dt;Lclient!dl;)Z", line = 618)
	@Override
	boolean method20691(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return p.method27710(IDirect3D.GetAdapterDisplayMode(this.aLong113, this.anInt2713, local3)) && p.method27710(IDirect3D.CheckDeviceFormat(this.aLong113, this.anInt2713, this.anInt2709, local3.Format, 0, 4, method19578(arg0, arg1)));
	}

	@OriginalMember(owner = "client!apn", name = "aby", descriptor = "(Lclient!dt;Lclient!dl;)Z", line = 618)
	@Override
	boolean method20703(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return p.method27710(IDirect3D.GetAdapterDisplayMode(this.aLong113, this.anInt2713, local3)) && p.method27710(IDirect3D.CheckDeviceFormat(this.aLong113, this.anInt2713, this.anInt2709, local3.Format, 0, 4, method19578(arg0, arg1)));
	}

	@OriginalMember(owner = "client!apn", name = "aba", descriptor = "(Lclient!dt;Lclient!dl;)Z", line = 618)
	@Override
	boolean method20637(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return p.method27710(IDirect3D.GetAdapterDisplayMode(this.aLong113, this.anInt2713, local3)) && p.method27710(IDirect3D.CheckDeviceFormat(this.aLong113, this.anInt2713, this.anInt2709, local3.Format, 0, 4, method19578(arg0, arg1)));
	}

	@OriginalMember(owner = "client!apn", name = "acq", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!ks;", line = 623)
	@Override
	Interface37 method20726(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class116_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apn", name = "ul", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!ks;", line = 623)
	@Override
	Interface37 method20634(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class116_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apn", name = "abh", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!ks;", line = 623)
	@Override
	Interface37 method20627(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class116_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apn", name = "acl", descriptor = "(IIZ[III)Lclient!ks;", line = 627)
	@Override
	Interface37 method20671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class116_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apn", name = "un", descriptor = "(IIZ[III)Lclient!ks;", line = 627)
	@Override
	Interface37 method20693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class116_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apn", name = "acb", descriptor = "(IIZ[III)Lclient!ks;", line = 627)
	@Override
	Interface37 method20710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class116_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apn", name = "acp", descriptor = "(IIZ[III)Lclient!ks;", line = 627)
	@Override
	Interface37 method20669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class116_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apn", name = "uy", descriptor = "(Lclient!dt;IIZ[BII)Lclient!ks;", line = 631)
	@Override
	Interface37 method20635(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class116_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!apn", name = "aco", descriptor = "(Lclient!dt;IIZ[BII)Lclient!ks;", line = 631)
	@Override
	Interface37 method20727(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class116_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!apn", name = "ace", descriptor = "(Lclient!dt;IIZ[FII)Lclient!ks;", line = 635)
	@Override
	Interface37 method20728(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class116_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!apn", name = "uq", descriptor = "(Lclient!dt;IIZ[FII)Lclient!ks;", line = 635)
	@Override
	Interface37 method20636(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class116_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!apn", name = "acy", descriptor = "(Lclient!dt;IIZ[FII)Lclient!ks;", line = 635)
	@Override
	Interface37 method20683(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class116_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!apn", name = "agk", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!lx;", line = 639)
	@Override
	Interface43 method20769(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class116_Sub1_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apn", name = "ug", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!lx;", line = 639)
	@Override
	Interface43 method20639(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class116_Sub1_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apn", name = "agd", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!lx;", line = 639)
	@Override
	Interface43 method20768(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class116_Sub1_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apn", name = "act", descriptor = "(IZ[[I)Lclient!le;", line = 643)
	@Override
	Interface40 method20733(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class116_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!apn", name = "acm", descriptor = "(IZ[[I)Lclient!le;", line = 643)
	@Override
	Interface40 method20674(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class116_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!apn", name = "acf", descriptor = "(IZ[[I)Lclient!le;", line = 643)
	@Override
	Interface40 method20732(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class116_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!apn", name = "uu", descriptor = "(IZ[[I)Lclient!le;", line = 643)
	@Override
	Interface40 method20638(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class116_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!apn", name = "ur", descriptor = "(Lclient!dt;IIIZ[B)Lclient!kn;", line = 647)
	@Override
	Interface34 method20766(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class116_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apn", name = "acg", descriptor = "(Lclient!dt;IIIZ[B)Lclient!kn;", line = 647)
	@Override
	Interface34 method20731(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class116_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apn", name = "aca", descriptor = "(Lclient!dt;IIIZ[B)Lclient!kn;", line = 647)
	@Override
	Interface34 method20734(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class116_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apn", name = "ack", descriptor = "(Lclient!dt;IIIZ[B)Lclient!kn;", line = 647)
	@Override
	Interface34 method20616(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class116_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apn", name = "agg", descriptor = "(Lclient!nt;)V", line = 651)
	final void method19554(@OriginalArg(0) Class116 arg0) {
		IDirect3DDevice.SetTexture(this.aLong119, this.anInt2832, arg0.method10852());
		if (this.aBoolean434 && !this.aBooleanArray12[this.anInt2832]) {
			this.aBooleanArray12[this.anInt2832] = true;
			this.method20646();
			this.method20645();
		}
	}

	@OriginalMember(owner = "client!apn", name = "ahv", descriptor = "(Lclient!ahs;)V", line = 660)
	final void method19555(@OriginalArg(0) Class116_Sub1 arg0) {
		this.method19554(arg0);
		if (this.aBooleanArray14[this.anInt2832] != arg0.aBoolean206) {
			IDirect3DDevice.SetSamplerState(this.aLong119, this.anInt2832, 1, arg0.aBoolean206 ? 1 : 3);
			this.aBooleanArray14[this.anInt2832] = arg0.aBoolean206;
		}
		if (this.aBooleanArray11[this.anInt2832] != arg0.aBoolean207) {
			IDirect3DDevice.SetSamplerState(this.aLong119, this.anInt2832, 2, arg0.aBoolean207 ? 1 : 3);
			this.aBooleanArray11[this.anInt2832] = arg0.aBoolean207;
		}
	}

	@OriginalMember(owner = "client!apn", name = "ahm", descriptor = "(Lclient!ahs;)V", line = 660)
	final void method19556(@OriginalArg(0) Class116_Sub1 arg0) {
		this.method19554(arg0);
		if (this.aBooleanArray14[this.anInt2832] != arg0.aBoolean206) {
			IDirect3DDevice.SetSamplerState(this.aLong119, this.anInt2832, 1, arg0.aBoolean206 ? 1 : 3);
			this.aBooleanArray14[this.anInt2832] = arg0.aBoolean206;
		}
		if (this.aBooleanArray11[this.anInt2832] != arg0.aBoolean207) {
			IDirect3DDevice.SetSamplerState(this.aLong119, this.anInt2832, 2, arg0.aBoolean207 ? 1 : 3);
			this.aBooleanArray11[this.anInt2832] = arg0.aBoolean207;
		}
	}

	@OriginalMember(owner = "client!apn", name = "aga", descriptor = "(Lclient!ahs;)V", line = 660)
	final void method19557(@OriginalArg(0) Class116_Sub1 arg0) {
		this.method19554(arg0);
		if (this.aBooleanArray14[this.anInt2832] != arg0.aBoolean206) {
			IDirect3DDevice.SetSamplerState(this.aLong119, this.anInt2832, 1, arg0.aBoolean206 ? 1 : 3);
			this.aBooleanArray14[this.anInt2832] = arg0.aBoolean206;
		}
		if (this.aBooleanArray11[this.anInt2832] != arg0.aBoolean207) {
			IDirect3DDevice.SetSamplerState(this.aLong119, this.anInt2832, 2, arg0.aBoolean207 ? 1 : 3);
			this.aBooleanArray11[this.anInt2832] = arg0.aBoolean207;
		}
	}

	@OriginalMember(owner = "client!apn", name = "ago", descriptor = "(Lclient!ahr;)V", line = 672)
	final void method19558(@OriginalArg(0) Class116_Sub2 arg0) {
		this.method19554(arg0);
		if (!this.aBooleanArray14[this.anInt2832]) {
			IDirect3DDevice.SetSamplerState(this.aLong119, this.anInt2832, 1, 1);
			this.aBooleanArray14[this.anInt2832] = true;
		}
		if (!this.aBooleanArray11[this.anInt2832]) {
			IDirect3DDevice.SetSamplerState(this.aLong119, this.anInt2832, 2, 1);
			this.aBooleanArray11[this.anInt2832] = true;
		}
	}

	@OriginalMember(owner = "client!apn", name = "ahj", descriptor = "(Lclient!ahr;)V", line = 672)
	final void method19559(@OriginalArg(0) Class116_Sub2 arg0) {
		this.method19554(arg0);
		if (!this.aBooleanArray14[this.anInt2832]) {
			IDirect3DDevice.SetSamplerState(this.aLong119, this.anInt2832, 1, 1);
			this.aBooleanArray14[this.anInt2832] = true;
		}
		if (!this.aBooleanArray11[this.anInt2832]) {
			IDirect3DDevice.SetSamplerState(this.aLong119, this.anInt2832, 2, 1);
			this.aBooleanArray11[this.anInt2832] = true;
		}
	}

	@OriginalMember(owner = "client!apn", name = "aip", descriptor = "(Lclient!ahr;)V", line = 672)
	final void method19560(@OriginalArg(0) Class116_Sub2 arg0) {
		this.method19554(arg0);
		if (!this.aBooleanArray14[this.anInt2832]) {
			IDirect3DDevice.SetSamplerState(this.aLong119, this.anInt2832, 1, 1);
			this.aBooleanArray14[this.anInt2832] = true;
		}
		if (!this.aBooleanArray11[this.anInt2832]) {
			IDirect3DDevice.SetSamplerState(this.aLong119, this.anInt2832, 2, 1);
			this.aBooleanArray11[this.anInt2832] = true;
		}
	}

	@OriginalMember(owner = "client!apn", name = "aid", descriptor = "(Lclient!ahr;)V", line = 672)
	final void method19561(@OriginalArg(0) Class116_Sub2 arg0) {
		this.method19554(arg0);
		if (!this.aBooleanArray14[this.anInt2832]) {
			IDirect3DDevice.SetSamplerState(this.aLong119, this.anInt2832, 1, 1);
			this.aBooleanArray14[this.anInt2832] = true;
		}
		if (!this.aBooleanArray11[this.anInt2832]) {
			IDirect3DDevice.SetSamplerState(this.aLong119, this.anInt2832, 2, 1);
			this.aBooleanArray11[this.anInt2832] = true;
		}
	}

	@OriginalMember(owner = "client!apn", name = "aij", descriptor = "(Lclient!ahr;)V", line = 672)
	final void method19562(@OriginalArg(0) Class116_Sub2 arg0) {
		this.method19554(arg0);
		if (!this.aBooleanArray14[this.anInt2832]) {
			IDirect3DDevice.SetSamplerState(this.aLong119, this.anInt2832, 1, 1);
			this.aBooleanArray14[this.anInt2832] = true;
		}
		if (!this.aBooleanArray11[this.anInt2832]) {
			IDirect3DDevice.SetSamplerState(this.aLong119, this.anInt2832, 2, 1);
			this.aBooleanArray11[this.anInt2832] = true;
		}
	}

	@OriginalMember(owner = "client!apn", name = "acw", descriptor = "()V", line = 684)
	@Override
	public void method20735() {
		if (this.aBooleanArray12[this.anInt2832]) {
			this.aBooleanArray12[this.anInt2832] = false;
			IDirect3DDevice.SetTexture(this.aLong119, this.anInt2832, 0L);
			this.method20646();
			this.method20645();
		}
	}

	@OriginalMember(owner = "client!apn", name = "us", descriptor = "()V", line = 684)
	@Override
	public void method20641() {
		if (this.aBooleanArray12[this.anInt2832]) {
			this.aBooleanArray12[this.anInt2832] = false;
			IDirect3DDevice.SetTexture(this.aLong119, this.anInt2832, 0L);
			this.method20646();
			this.method20645();
		}
	}

	@OriginalMember(owner = "client!apn", name = "vh", descriptor = "()V", line = 693)
	@Override
	void method20711() {
		if (this.aLong118 != 0L || this.aClass377Array3[this.anInt2832] == Class377.aClass377_2) {
			IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, 24, 0);
			this.anIntArray245[this.anInt2832] = 0;
			return;
		}
		if (this.aClass377Array3[this.anInt2832] == Class377.aClass377_1) {
			IDirect3DDevice.SetTransform(this.aLong119, this.anInt2832 + 16, this.aClass442Array6[this.anInt2832].method29056(this.aFloatArray68));
		} else {
			IDirect3DDevice.SetTransform(this.aLong119, this.anInt2832 + 16, this.aClass442Array6[this.anInt2832].method29038(this.aFloatArray68));
		}
		@Pc(58) int local58 = method19571(this.aClass377Array3[this.anInt2832]);
		if (local58 != this.anIntArray245[this.anInt2832]) {
			IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, 24, local58);
			this.anIntArray245[this.anInt2832] = local58;
		}
	}

	@OriginalMember(owner = "client!apn", name = "adk", descriptor = "()V", line = 693)
	@Override
	void method20665() {
		if (this.aLong118 != 0L || this.aClass377Array3[this.anInt2832] == Class377.aClass377_2) {
			IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, 24, 0);
			this.anIntArray245[this.anInt2832] = 0;
			return;
		}
		if (this.aClass377Array3[this.anInt2832] == Class377.aClass377_1) {
			IDirect3DDevice.SetTransform(this.aLong119, this.anInt2832 + 16, this.aClass442Array6[this.anInt2832].method29056(this.aFloatArray68));
		} else {
			IDirect3DDevice.SetTransform(this.aLong119, this.anInt2832 + 16, this.aClass442Array6[this.anInt2832].method29038(this.aFloatArray68));
		}
		@Pc(58) int local58 = method19571(this.aClass377Array3[this.anInt2832]);
		if (local58 != this.anIntArray245[this.anInt2832]) {
			IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, 24, local58);
			this.anIntArray245[this.anInt2832] = local58;
		}
	}

	@OriginalMember(owner = "client!apn", name = "ads", descriptor = "()V", line = 693)
	@Override
	void method20695() {
		if (this.aLong118 != 0L || this.aClass377Array3[this.anInt2832] == Class377.aClass377_2) {
			IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, 24, 0);
			this.anIntArray245[this.anInt2832] = 0;
			return;
		}
		if (this.aClass377Array3[this.anInt2832] == Class377.aClass377_1) {
			IDirect3DDevice.SetTransform(this.aLong119, this.anInt2832 + 16, this.aClass442Array6[this.anInt2832].method29056(this.aFloatArray68));
		} else {
			IDirect3DDevice.SetTransform(this.aLong119, this.anInt2832 + 16, this.aClass442Array6[this.anInt2832].method29038(this.aFloatArray68));
		}
		@Pc(58) int local58 = method19571(this.aClass377Array3[this.anInt2832]);
		if (local58 != this.anIntArray245[this.anInt2832]) {
			IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, 24, local58);
			this.anIntArray245[this.anInt2832] = local58;
		}
	}

	@OriginalMember(owner = "client!apn", name = "vo", descriptor = "()V", line = 708)
	@Override
	void method20644() {
	}

	@OriginalMember(owner = "client!apn", name = "ada", descriptor = "()V", line = 708)
	@Override
	void method20742() {
	}

	@OriginalMember(owner = "client!apn", name = "vb", descriptor = "()V", line = 711)
	@Override
	void method20645() {
		if (this.aBoolean434) {
			@Pc(17) int local17 = this.aBooleanArray12[this.anInt2832] ? method19564(this.aClass388Array6[this.anInt2832]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, 1, local17);
		}
	}

	@OriginalMember(owner = "client!apn", name = "adr", descriptor = "()V", line = 711)
	@Override
	void method20743() {
		if (this.aBoolean434) {
			@Pc(17) int local17 = this.aBooleanArray12[this.anInt2832] ? method19564(this.aClass388Array6[this.anInt2832]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, 1, local17);
		}
	}

	@OriginalMember(owner = "client!apn", name = "ve", descriptor = "()V", line = 718)
	@Override
	void method20646() {
		if (this.aBoolean434) {
			@Pc(17) int local17 = this.aBooleanArray12[this.anInt2832] ? method19564(this.aClass388Array5[this.anInt2832]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, 4, local17);
		}
	}

	@OriginalMember(owner = "client!apn", name = "adt", descriptor = "()V", line = 718)
	@Override
	void method20730() {
		if (this.aBoolean434) {
			@Pc(17) int local17 = this.aBooleanArray12[this.anInt2832] ? method19564(this.aClass388Array5[this.anInt2832]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, 4, local17);
		}
	}

	@OriginalMember(owner = "client!apn", name = "ade", descriptor = "()V", line = 718)
	@Override
	void method20745() {
		if (this.aBoolean434) {
			@Pc(17) int local17 = this.aBooleanArray12[this.anInt2832] ? method19564(this.aClass388Array5[this.anInt2832]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, 4, local17);
		}
	}

	@OriginalMember(owner = "client!apn", name = "adc", descriptor = "()V", line = 718)
	@Override
	void method20660() {
		if (this.aBoolean434) {
			@Pc(17) int local17 = this.aBooleanArray12[this.anInt2832] ? method19564(this.aClass388Array5[this.anInt2832]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, 4, local17);
		}
	}

	@OriginalMember(owner = "client!apn", name = "adh", descriptor = "()V", line = 718)
	@Override
	void method20744() {
		if (this.aBoolean434) {
			@Pc(17) int local17 = this.aBooleanArray12[this.anInt2832] ? method19564(this.aClass388Array5[this.anInt2832]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, 4, local17);
		}
	}

	@OriginalMember(owner = "client!apn", name = "ua", descriptor = "(ILclient!lp;ZZ)V", line = 725)
	@Override
	final void method20642(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!this.aBoolean434) {
			return;
		}
		@Pc(4) int local4 = 0;
		@Pc(8) byte local8;
		switch(arg0) {
			case 1:
				local8 = 3;
				break;
			case 2:
				local8 = 26;
				break;
			default:
				local8 = 2;
		}
		if (arg2) {
			local4 |= 0x20;
		}
		if (arg3) {
			local4 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, local8, method19570(arg1) | local4);
	}

	@OriginalMember(owner = "client!apn", name = "acv", descriptor = "(ILclient!lp;ZZ)V", line = 725)
	@Override
	final void method20737(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!this.aBoolean434) {
			return;
		}
		@Pc(4) int local4 = 0;
		@Pc(8) byte local8;
		switch(arg0) {
			case 1:
				local8 = 3;
				break;
			case 2:
				local8 = 26;
				break;
			default:
				local8 = 2;
		}
		if (arg2) {
			local4 |= 0x20;
		}
		if (arg3) {
			local4 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, local8, method19570(arg1) | local4);
	}

	@OriginalMember(owner = "client!apn", name = "aci", descriptor = "(ILclient!lp;ZZ)V", line = 725)
	@Override
	final void method20738(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!this.aBoolean434) {
			return;
		}
		@Pc(4) int local4 = 0;
		@Pc(8) byte local8;
		switch(arg0) {
			case 1:
				local8 = 3;
				break;
			case 2:
				local8 = 26;
				break;
			default:
				local8 = 2;
		}
		if (arg2) {
			local4 |= 0x20;
		}
		if (arg3) {
			local4 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, local8, method19570(arg1) | local4);
	}

	@OriginalMember(owner = "client!apn", name = "ach", descriptor = "(ILclient!lp;ZZ)V", line = 725)
	@Override
	final void method20739(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!this.aBoolean434) {
			return;
		}
		@Pc(4) int local4 = 0;
		@Pc(8) byte local8;
		switch(arg0) {
			case 1:
				local8 = 3;
				break;
			case 2:
				local8 = 26;
				break;
			default:
				local8 = 2;
		}
		if (arg2) {
			local4 |= 0x20;
		}
		if (arg3) {
			local4 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, local8, method19570(arg1) | local4);
	}

	@OriginalMember(owner = "client!apn", name = "ue", descriptor = "(ILclient!lp;Z)V", line = 746)
	@Override
	final void method20702(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean434) {
			return;
		}
		@Pc(4) int local4 = 0;
		@Pc(8) byte local8;
		switch(arg0) {
			case 1:
				local8 = 6;
				break;
			case 2:
				local8 = 27;
				break;
			default:
				local8 = 5;
		}
		if (arg2) {
			local4 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, local8, method19570(arg1) | local4);
	}

	@OriginalMember(owner = "client!apn", name = "agh", descriptor = "(ILclient!lp;Z)V", line = 746)
	@Override
	final void method20775(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean434) {
			return;
		}
		@Pc(4) int local4 = 0;
		@Pc(8) byte local8;
		switch(arg0) {
			case 1:
				local8 = 6;
				break;
			case 2:
				local8 = 27;
				break;
			default:
				local8 = 5;
		}
		if (arg2) {
			local4 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, local8, method19570(arg1) | local4);
	}

	@OriginalMember(owner = "client!apn", name = "agn", descriptor = "(ILclient!lp;Z)V", line = 746)
	@Override
	final void method20648(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean434) {
			return;
		}
		@Pc(4) int local4 = 0;
		@Pc(8) byte local8;
		switch(arg0) {
			case 1:
				local8 = 6;
				break;
			case 2:
				local8 = 27;
				break;
			default:
				local8 = 5;
		}
		if (arg2) {
			local4 |= 0x10;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong119, this.anInt2832, local8, method19570(arg1) | local4);
	}

	@OriginalMember(owner = "client!apn", name = "vn", descriptor = "()V", line = 766)
	@Override
	final void method20643() {
		if (this.aBoolean434) {
			IDirect3DDevice.SetRenderState(this.aLong119, 60, this.anInt2833);
		}
	}

	@OriginalMember(owner = "client!apn", name = "add", descriptor = "()V", line = 766)
	@Override
	final void method20677() {
		if (this.aBoolean434) {
			IDirect3DDevice.SetRenderState(this.aLong119, 60, this.anInt2833);
		}
	}

	@OriginalMember(owner = "client!apn", name = "adv", descriptor = "()V", line = 766)
	@Override
	final void method20625() {
		if (this.aBoolean434) {
			IDirect3DDevice.SetRenderState(this.aLong119, 60, this.anInt2833);
		}
	}

	@OriginalMember(owner = "client!apn", name = "adm", descriptor = "()V", line = 766)
	@Override
	final void method20741() {
		if (this.aBoolean434) {
			IDirect3DDevice.SetRenderState(this.aLong119, 60, this.anInt2833);
		}
	}

	@OriginalMember(owner = "client!apn", name = "aiz", descriptor = "(Lclient!lv;)I", line = 772)
	static final int method19563(@OriginalArg(0) Class388 arg0) {
		switch(arg0.anInt4590) {
			case 0:
				return 2;
			case 1:
				return 7;
			case 2:
				return 26;
			case 3:
				return 4;
			case 4:
				return 10;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apn", name = "age", descriptor = "(Lclient!lv;)I", line = 772)
	static final int method19564(@OriginalArg(0) Class388 arg0) {
		switch(arg0.anInt4590) {
			case 0:
				return 2;
			case 1:
				return 7;
			case 2:
				return 26;
			case 3:
				return 4;
			case 4:
				return 10;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apn", name = "ail", descriptor = "(Lclient!lv;)I", line = 772)
	static final int method19565(@OriginalArg(0) Class388 arg0) {
		switch(arg0.anInt4590) {
			case 0:
				return 2;
			case 1:
				return 7;
			case 2:
				return 26;
			case 3:
				return 4;
			case 4:
				return 10;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apn", name = "ais", descriptor = "(Lclient!lv;)I", line = 772)
	static final int method19566(@OriginalArg(0) Class388 arg0) {
		switch(arg0.anInt4590) {
			case 0:
				return 2;
			case 1:
				return 7;
			case 2:
				return 26;
			case 3:
				return 4;
			case 4:
				return 10;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apn", name = "ait", descriptor = "(Lclient!lv;)I", line = 772)
	static final int method19567(@OriginalArg(0) Class388 arg0) {
		switch(arg0.anInt4590) {
			case 0:
				return 2;
			case 1:
				return 7;
			case 2:
				return 26;
			case 3:
				return 4;
			case 4:
				return 10;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apn", name = "aif", descriptor = "(Lclient!lv;)I", line = 772)
	static final int method19568(@OriginalArg(0) Class388 arg0) {
		switch(arg0.anInt4590) {
			case 0:
				return 2;
			case 1:
				return 7;
			case 2:
				return 26;
			case 3:
				return 4;
			case 4:
				return 10;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apn", name = "aio", descriptor = "(Lclient!lp;)I", line = 789)
	static final int method19569(@OriginalArg(0) Class383 arg0) {
		switch(arg0.anInt4585) {
			case 0:
				return 2;
			case 1:
				return 0;
			case 2:
				return 1;
			case 3:
				return 3;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apn", name = "agm", descriptor = "(Lclient!lp;)I", line = 789)
	static final int method19570(@OriginalArg(0) Class383 arg0) {
		switch(arg0.anInt4585) {
			case 0:
				return 2;
			case 1:
				return 0;
			case 2:
				return 1;
			case 3:
				return 3;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apn", name = "agw", descriptor = "(Lclient!lh;)I", line = 804)
	static final int method19571(@OriginalArg(0) Class377 arg0) {
		switch(arg0.anInt4575) {
			case 0:
				return 4;
			case 1:
				return 256;
			case 2:
				return 1;
			case 3:
			default:
				return 0;
			case 4:
				return 2;
			case 5:
				return 3;
		}
	}

	@OriginalMember(owner = "client!apn", name = "aiq", descriptor = "(Lclient!lh;)I", line = 804)
	static final int method19572(@OriginalArg(0) Class377 arg0) {
		switch(arg0.anInt4575) {
			case 0:
				return 4;
			case 1:
				return 256;
			case 2:
				return 1;
			case 3:
			default:
				return 0;
			case 4:
				return 2;
			case 5:
				return 3;
		}
	}

	@OriginalMember(owner = "client!apn", name = "aic", descriptor = "(Lclient!lh;)I", line = 804)
	static final int method19573(@OriginalArg(0) Class377 arg0) {
		switch(arg0.anInt4575) {
			case 0:
				return 4;
			case 1:
				return 256;
			case 2:
				return 1;
			case 3:
			default:
				return 0;
			case 4:
				return 2;
			case 5:
				return 3;
		}
	}

	@OriginalMember(owner = "client!apn", name = "vj", descriptor = "(I)V", line = 821)
	@Override
	void method20628(@OriginalArg(0) int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong119, 168, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "aev", descriptor = "(I)V", line = 821)
	@Override
	void method20729(@OriginalArg(0) int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong119, 168, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "vu", descriptor = "()V", line = 825)
	@Override
	void method20650() {
		IDirect3DDevice.method27704(this.aLong119, 15, this.aBoolean435);
		IDirect3DDevice.SetRenderState(this.aLong119, 24, this.aByte68 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.MultiSampleType <= 0) {
			return;
		}
		if (this.aBoolean435 && this.aByte68 != 0) {
			if (this.aBoolean418) {
				IDirect3DDevice.SetRenderState(this.aLong119, 181, method20606('S', 'S', 'A', 'A'));
			} else if (this.aBoolean411) {
				IDirect3DDevice.SetRenderState(this.aLong119, 181, method20606('A', 'T', 'O', 'C'));
			} else if (this.aBoolean417) {
				IDirect3DDevice.SetRenderState(this.aLong119, 154, method20606('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean418 || this.aBoolean411) {
			IDirect3DDevice.SetRenderState(this.aLong119, 181, 0);
		} else if (this.aBoolean417) {
			IDirect3DDevice.method27700(this.aLong119, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!apn", name = "ael", descriptor = "()V", line = 825)
	@Override
	void method20747() {
		IDirect3DDevice.method27704(this.aLong119, 15, this.aBoolean435);
		IDirect3DDevice.SetRenderState(this.aLong119, 24, this.aByte68 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.MultiSampleType <= 0) {
			return;
		}
		if (this.aBoolean435 && this.aByte68 != 0) {
			if (this.aBoolean418) {
				IDirect3DDevice.SetRenderState(this.aLong119, 181, method20606('S', 'S', 'A', 'A'));
			} else if (this.aBoolean411) {
				IDirect3DDevice.SetRenderState(this.aLong119, 181, method20606('A', 'T', 'O', 'C'));
			} else if (this.aBoolean417) {
				IDirect3DDevice.SetRenderState(this.aLong119, 154, method20606('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean418 || this.aBoolean411) {
			IDirect3DDevice.SetRenderState(this.aLong119, 181, 0);
		} else if (this.aBoolean417) {
			IDirect3DDevice.method27700(this.aLong119, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!apn", name = "aex", descriptor = "()V", line = 825)
	@Override
	void method20746() {
		IDirect3DDevice.method27704(this.aLong119, 15, this.aBoolean435);
		IDirect3DDevice.SetRenderState(this.aLong119, 24, this.aByte68 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.MultiSampleType <= 0) {
			return;
		}
		if (this.aBoolean435 && this.aByte68 != 0) {
			if (this.aBoolean418) {
				IDirect3DDevice.SetRenderState(this.aLong119, 181, method20606('S', 'S', 'A', 'A'));
			} else if (this.aBoolean411) {
				IDirect3DDevice.SetRenderState(this.aLong119, 181, method20606('A', 'T', 'O', 'C'));
			} else if (this.aBoolean417) {
				IDirect3DDevice.SetRenderState(this.aLong119, 154, method20606('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean418 || this.aBoolean411) {
			IDirect3DDevice.SetRenderState(this.aLong119, 181, 0);
		} else if (this.aBoolean417) {
			IDirect3DDevice.method27700(this.aLong119, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!apn", name = "vt", descriptor = "()V", line = 841)
	@Override
	void method20651() {
		switch(this.aClass380_3.anInt4581) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong119, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong119, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong119, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong119, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong119, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong119, 20, 1);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong119, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong119, 20, 6);
		}
		switch(this.anInt2834) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong119, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong119, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong119, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong119, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong119, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong119, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong119, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong119, 208, 2);
		}
	}

	@OriginalMember(owner = "client!apn", name = "aep", descriptor = "()V", line = 841)
	@Override
	void method20748() {
		switch(this.aClass380_3.anInt4581) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong119, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong119, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong119, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong119, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong119, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong119, 20, 1);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong119, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong119, 20, 6);
		}
		switch(this.anInt2834) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong119, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong119, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong119, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong119, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong119, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong119, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong119, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong119, 208, 2);
		}
	}

	@OriginalMember(owner = "client!apn", name = "vi", descriptor = "()V", line = 896)
	@Override
	void method20652() {
		IDirect3DDevice.method27704(this.aLong119, 27, this.aBoolean452);
	}

	@OriginalMember(owner = "client!apn", name = "agt", descriptor = "()V", line = 896)
	@Override
	void method20770() {
		IDirect3DDevice.method27704(this.aLong119, 27, this.aBoolean452);
	}

	@OriginalMember(owner = "client!apn", name = "agf", descriptor = "()V", line = 896)
	@Override
	void method20771() {
		IDirect3DDevice.method27704(this.aLong119, 27, this.aBoolean452);
	}

	@OriginalMember(owner = "client!apn", name = "agz", descriptor = "()V", line = 896)
	@Override
	void method20749() {
		IDirect3DDevice.method27704(this.aLong119, 27, this.aBoolean452);
	}

	@OriginalMember(owner = "client!apn", name = "agj", descriptor = "()V", line = 896)
	@Override
	void method20696() {
		IDirect3DDevice.method27704(this.aLong119, 27, this.aBoolean452);
	}

	@OriginalMember(owner = "client!apn", name = "ahg", descriptor = "()V", line = 900)
	void method19574() {
		IDirect3DDevice.SetRenderState(this.aLong119, 22, this.anInt2843);
	}

	@OriginalMember(owner = "client!apn", name = "vs", descriptor = "()V", line = 904)
	@Override
	void method20667() {
		if (this.aBoolean434) {
			IDirect3DDevice.method27704(this.aLong119, 28, this.aBoolean451 && this.aBoolean450 && this.anInt2841 >= 0);
		}
	}

	@OriginalMember(owner = "client!apn", name = "aeo", descriptor = "()V", line = 904)
	@Override
	void method20621() {
		if (this.aBoolean434) {
			IDirect3DDevice.method27704(this.aLong119, 28, this.aBoolean451 && this.aBoolean450 && this.anInt2841 >= 0);
		}
	}

	@OriginalMember(owner = "client!apn", name = "aec", descriptor = "()V", line = 904)
	@Override
	void method20750() {
		if (this.aBoolean434) {
			IDirect3DDevice.method27704(this.aLong119, 28, this.aBoolean451 && this.aBoolean450 && this.anInt2841 >= 0);
		}
	}

	@OriginalMember(owner = "client!apn", name = "aer", descriptor = "()V", line = 904)
	@Override
	void method20751() {
		if (this.aBoolean434) {
			IDirect3DDevice.method27704(this.aLong119, 28, this.aBoolean451 && this.aBoolean450 && this.anInt2841 >= 0);
		}
	}

	@OriginalMember(owner = "client!apn", name = "aen", descriptor = "()V", line = 904)
	@Override
	void method20752() {
		if (this.aBoolean434) {
			IDirect3DDevice.method27704(this.aLong119, 28, this.aBoolean451 && this.aBoolean450 && this.anInt2841 >= 0);
		}
	}

	@OriginalMember(owner = "client!apn", name = "vx", descriptor = "()V", line = 910)
	@Override
	void method20684() {
		this.aFloat206 = this.aFloat202 - (float) this.anInt2824;
		this.aFloat205 = this.aFloat206 - (float) this.anInt2841;
		if (this.aFloat205 < this.aFloat201) {
			this.aFloat205 = this.aFloat201;
		}
		if (this.aBoolean434) {
			IDirect3DDevice.method27700(this.aLong119, 36, this.aFloat205);
			IDirect3DDevice.method27700(this.aLong119, 37, this.aFloat206);
			IDirect3DDevice.SetRenderState(this.aLong119, 34, this.anInt2840);
		}
	}

	@OriginalMember(owner = "client!apn", name = "aei", descriptor = "()V", line = 910)
	@Override
	void method20653() {
		this.aFloat206 = this.aFloat202 - (float) this.anInt2824;
		this.aFloat205 = this.aFloat206 - (float) this.anInt2841;
		if (this.aFloat205 < this.aFloat201) {
			this.aFloat205 = this.aFloat201;
		}
		if (this.aBoolean434) {
			IDirect3DDevice.method27700(this.aLong119, 36, this.aFloat205);
			IDirect3DDevice.method27700(this.aLong119, 37, this.aFloat206);
			IDirect3DDevice.SetRenderState(this.aLong119, 34, this.anInt2840);
		}
	}

	@OriginalMember(owner = "client!apn", name = "vw", descriptor = "(Z)V", line = 921)
	@Override
	void method20655(@OriginalArg(0) boolean arg0) {
		IDirect3DDevice.method27704(this.aLong119, 161, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "aeb", descriptor = "(Z)V", line = 921)
	@Override
	void method20626(@OriginalArg(0) boolean arg0) {
		IDirect3DDevice.method27704(this.aLong119, 161, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "vf", descriptor = "(Z)Lclient!lc;", line = 925)
	@Override
	final Interface38 method20772(@OriginalArg(0) boolean arg0) {
		return new Class423(this, Class206.aClass206_22, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "aey", descriptor = "(Z)Lclient!lc;", line = 925)
	@Override
	final Interface38 method20697(@OriginalArg(0) boolean arg0) {
		return new Class423(this, Class206.aClass206_22, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "vz", descriptor = "(Z)Lclient!kp;", line = 929)
	@Override
	final Interface36 method20656(@OriginalArg(0) boolean arg0) {
		return new Class425(this, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "aem", descriptor = "(Z)Lclient!kp;", line = 929)
	@Override
	final Interface36 method20753(@OriginalArg(0) boolean arg0) {
		return new Class425(this, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "aez", descriptor = "(Z)Lclient!kp;", line = 929)
	@Override
	final Interface36 method20754(@OriginalArg(0) boolean arg0) {
		return new Class425(this, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "aef", descriptor = "([Lclient!lz;)Lclient!kt;", line = 933)
	@Override
	Class113 method20755(@OriginalArg(0) Class391[] arg0) {
		return new Class113_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "vg", descriptor = "([Lclient!lz;)Lclient!kt;", line = 933)
	@Override
	Class113 method20657(@OriginalArg(0) Class391[] arg0) {
		return new Class113_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "aeq", descriptor = "([Lclient!lz;)Lclient!kt;", line = 933)
	@Override
	Class113 method20757(@OriginalArg(0) Class391[] arg0) {
		return new Class113_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "aeh", descriptor = "([Lclient!lz;)Lclient!kt;", line = 933)
	@Override
	Class113 method20756(@OriginalArg(0) Class391[] arg0) {
		return new Class113_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!apn", name = "va", descriptor = "(Lclient!kt;)V", line = 937)
	@Override
	public void method20658(@OriginalArg(0) Class113 arg0) {
		@Pc(2) Class113_Sub1 local2 = (Class113_Sub1) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong119, local2.aLong37);
	}

	@OriginalMember(owner = "client!apn", name = "aew", descriptor = "(Lclient!kt;)V", line = 937)
	@Override
	public void method20701(@OriginalArg(0) Class113 arg0) {
		@Pc(2) Class113_Sub1 local2 = (Class113_Sub1) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong119, local2.aLong37);
	}

	@OriginalMember(owner = "client!apn", name = "aej", descriptor = "(Lclient!kt;)V", line = 937)
	@Override
	public void method20682(@OriginalArg(0) Class113 arg0) {
		@Pc(2) Class113_Sub1 local2 = (Class113_Sub1) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong119, local2.aLong37);
	}

	@OriginalMember(owner = "client!apn", name = "aed", descriptor = "(Lclient!kt;)V", line = 937)
	@Override
	public void method20758(@OriginalArg(0) Class113 arg0) {
		@Pc(2) Class113_Sub1 local2 = (Class113_Sub1) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong119, local2.aLong37);
	}

	@OriginalMember(owner = "client!apn", name = "vk", descriptor = "(ILclient!kp;)V", line = 942)
	@Override
	public void method20670(@OriginalArg(0) int arg0, @OriginalArg(1) Interface36 arg1) {
		@Pc(2) Class425 local2 = (Class425) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong119, arg0, local2.aLong270, 0, local2.method28763());
	}

	@OriginalMember(owner = "client!apn", name = "aft", descriptor = "(ILclient!kp;)V", line = 942)
	@Override
	public void method20760(@OriginalArg(0) int arg0, @OriginalArg(1) Interface36 arg1) {
		@Pc(2) Class425 local2 = (Class425) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong119, arg0, local2.aLong270, 0, local2.method28763());
	}

	@OriginalMember(owner = "client!apn", name = "aet", descriptor = "(ILclient!kp;)V", line = 942)
	@Override
	public void method20759(@OriginalArg(0) int arg0, @OriginalArg(1) Interface36 arg1) {
		@Pc(2) Class425 local2 = (Class425) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong119, arg0, local2.aLong270, 0, local2.method28763());
	}

	@OriginalMember(owner = "client!apn", name = "vv", descriptor = "(Lclient!lc;)V", line = 947)
	@Override
	void method20659(@OriginalArg(0) Interface38 arg0) {
		IDirect3DDevice.SetIndices(this.aLong119, ((Class423) arg0).aLong269);
	}

	@OriginalMember(owner = "client!apn", name = "afu", descriptor = "(Lclient!lc;)V", line = 947)
	@Override
	void method20761(@OriginalArg(0) Interface38 arg0) {
		IDirect3DDevice.SetIndices(this.aLong119, ((Class423) arg0).aLong269);
	}

	@OriginalMember(owner = "client!apn", name = "agx", descriptor = "(Lclient!lq;II)V", line = 951)
	@Override
	public final void method20773(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass105_Sub2_2 != null) {
			this.aClass105_Sub2_2.method9641();
		}
		IDirect3DDevice.DrawPrimitive(this.aLong119, method19587(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!apn", name = "wt", descriptor = "(Lclient!lq;II)V", line = 951)
	@Override
	public final void method20661(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass105_Sub2_2 != null) {
			this.aClass105_Sub2_2.method9641();
		}
		IDirect3DDevice.DrawPrimitive(this.aLong119, method19587(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!apn", name = "aff", descriptor = "(Lclient!lc;Lclient!lq;IIII)V", line = 956)
	@Override
	final void method20762(@OriginalArg(0) Interface38 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass105_Sub2_2 != null) {
			this.aClass105_Sub2_2.method9641();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong119, ((Class423) arg0).aLong269, 4, 0, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apn", name = "wy", descriptor = "(Lclient!lc;Lclient!lq;IIII)V", line = 956)
	@Override
	final void method20662(@OriginalArg(0) Interface38 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass105_Sub2_2 != null) {
			this.aClass105_Sub2_2.method9641();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong119, ((Class423) arg0).aLong269, 4, 0, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apn", name = "afv", descriptor = "(Lclient!lc;Lclient!lq;IIII)V", line = 956)
	@Override
	final void method20763(@OriginalArg(0) Interface38 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass105_Sub2_2 != null) {
			this.aClass105_Sub2_2.method9641();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong119, ((Class423) arg0).aLong269, 4, 0, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apn", name = "wk", descriptor = "(Lclient!lq;IIII)V", line = 961)
	@Override
	public final void method20663(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass105_Sub2_2 != null) {
			this.aClass105_Sub2_2.method9641();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong119, method19587(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!apn", name = "agy", descriptor = "(Lclient!lq;IIII)V", line = 961)
	@Override
	public final void method20724(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass105_Sub2_2 != null) {
			this.aClass105_Sub2_2.method9641();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong119, method19587(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!apn", name = "ahc", descriptor = "(Ljava/lang/String;)[B", line = 966)
	byte[] method19575(@OriginalArg(0) String arg0) {
		return this.method20403("dx", arg0);
	}

	@OriginalMember(owner = "client!apn", name = "aik", descriptor = "(Ljava/lang/String;)[B", line = 966)
	byte[] method19576(@OriginalArg(0) String arg0) {
		return this.method20403("dx", arg0);
	}

	@OriginalMember(owner = "client!apn", name = "aiu", descriptor = "(Ljava/lang/String;)[B", line = 966)
	byte[] method19577(@OriginalArg(0) String arg0) {
		return this.method20403("dx", arg0);
	}

	@OriginalMember(owner = "client!apn", name = "ry", descriptor = "(Ljava/lang/String;)Lclient!hi;", line = 970)
	@Override
	public Class112 method20613(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method19575(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class292 local11 = this.method20404(local3);
			return new Class112_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!apn", name = "xz", descriptor = "(Ljava/lang/String;)Lclient!hi;", line = 970)
	@Override
	public Class112 method20694(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method19575(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class292 local11 = this.method20404(local3);
			return new Class112_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!apn", name = "xm", descriptor = "(Ljava/lang/String;)Lclient!hi;", line = 970)
	@Override
	public Class112 method20725(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method19575(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class292 local11 = this.method20404(local3);
			return new Class112_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!apn", name = "xr", descriptor = "(Ljava/lang/String;)Lclient!hi;", line = 970)
	@Override
	public Class112 method20673(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method19575(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class292 local11 = this.method20404(local3);
			return new Class112_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!apn", name = "xu", descriptor = "(Ljava/lang/String;)Lclient!hi;", line = 970)
	@Override
	public Class112 method20692(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method19575(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class292 local11 = this.method20404(local3);
			return new Class112_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!apn", name = "s", descriptor = "(I)V", line = 977)
	@Override
	public final synchronized void method20368(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2710; local1++) {
			IUnknown.Release(this.aLongArray13[local1]);
		}
		this.anInt2710 = 0;
		super.method20368(arg0);
	}

	@OriginalMember(owner = "client!apn", name = "ey", descriptor = "(I)V", line = 977)
	@Override
	public final synchronized void method20381(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2710; local1++) {
			IUnknown.Release(this.aLongArray13[local1]);
		}
		this.anInt2710 = 0;
		super.method20368(arg0);
	}

	@OriginalMember(owner = "client!apn", name = "eb", descriptor = "(I)V", line = 977)
	@Override
	public final synchronized void method20165(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2710; local1++) {
			IUnknown.Release(this.aLongArray13[local1]);
		}
		this.anInt2710 = 0;
		super.method20368(arg0);
	}

	@OriginalMember(owner = "client!apn", name = "ez", descriptor = "(I)V", line = 977)
	@Override
	public final synchronized void method20158(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2710; local1++) {
			IUnknown.Release(this.aLongArray13[local1]);
		}
		this.anInt2710 = 0;
		super.method20368(arg0);
	}

	@OriginalMember(owner = "client!apn", name = "eg", descriptor = "(I)V", line = 977)
	@Override
	public final synchronized void method20108(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2710; local1++) {
			IUnknown.Release(this.aLongArray13[local1]);
		}
		this.anInt2710 = 0;
		super.method20368(arg0);
	}

	@OriginalMember(owner = "client!apn", name = "aht", descriptor = "(Lclient!dt;Lclient!dl;)I", line = 983)
	static final int method19578(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		switch(arg1.anInt3582 * -1414205941) {
			case 0:
				if (arg0 == Class212.aClass212_18) {
					return 113;
				}
			case 1:
			case 3:
			default:
				break;
			case 2:
				if (arg0 == Class212.aClass212_18) {
					return 116;
				}
				break;
			case 4:
				switch(arg0.anInt3678 * -939549997) {
					case 0:
						return 21;
					case 1:
						return 51;
					case 2:
						return v.anInt4265 * -822548177;
					case 3:
						return 77;
					case 4:
						return 22;
					case 5:
					default:
						break;
					case 6:
						return 50;
					case 7:
						return v.anInt4264 * 612563925;
					case 8:
						return 28;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!apn", name = "aib", descriptor = "(Lclient!dt;Lclient!dl;)I", line = 983)
	static final int method19579(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		switch(arg1.anInt3582 * -1414205941) {
			case 0:
				if (arg0 == Class212.aClass212_18) {
					return 113;
				}
			case 1:
			case 3:
			default:
				break;
			case 2:
				if (arg0 == Class212.aClass212_18) {
					return 116;
				}
				break;
			case 4:
				switch(arg0.anInt3678 * -939549997) {
					case 0:
						return 21;
					case 1:
						return 51;
					case 2:
						return v.anInt4265 * -822548177;
					case 3:
						return 77;
					case 4:
						return 22;
					case 5:
					default:
						break;
					case 6:
						return 50;
					case 7:
						return v.anInt4264 * 612563925;
					case 8:
						return 28;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!apn", name = "aii", descriptor = "(Lclient!dt;Lclient!dl;)I", line = 983)
	static final int method19580(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		switch(arg1.anInt3582 * -1414205941) {
			case 0:
				if (arg0 == Class212.aClass212_18) {
					return 113;
				}
			case 1:
			case 3:
			default:
				break;
			case 2:
				if (arg0 == Class212.aClass212_18) {
					return 116;
				}
				break;
			case 4:
				switch(arg0.anInt3678 * -939549997) {
					case 0:
						return 21;
					case 1:
						return 51;
					case 2:
						return v.anInt4265 * -822548177;
					case 3:
						return 77;
					case 4:
						return 22;
					case 5:
					default:
						break;
					case 6:
						return 50;
					case 7:
						return v.anInt4264 * 612563925;
					case 8:
						return 28;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!apn", name = "aig", descriptor = "(Lclient!dl;)I", line = 1025)
	static final int method19581(@OriginalArg(0) Class206 arg0) {
		if (arg0 == Class206.aClass206_22) {
			return 80;
		} else if (arg0 == Class206.aClass206_21) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!apn", name = "ahn", descriptor = "(Lclient!dl;)I", line = 1025)
	static final int method19582(@OriginalArg(0) Class206 arg0) {
		if (arg0 == Class206.aClass206_22) {
			return 80;
		} else if (arg0 == Class206.aClass206_21) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!apn", name = "aia", descriptor = "(Lclient!dl;)I", line = 1025)
	static final int method19583(@OriginalArg(0) Class206 arg0) {
		if (arg0 == Class206.aClass206_22) {
			return 80;
		} else if (arg0 == Class206.aClass206_21) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!apn", name = "aih", descriptor = "(Lclient!dl;)I", line = 1025)
	static final int method19584(@OriginalArg(0) Class206 arg0) {
		if (arg0 == Class206.aClass206_22) {
			return 80;
		} else if (arg0 == Class206.aClass206_21) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!apn", name = "aie", descriptor = "(Lclient!dl;)I", line = 1025)
	static final int method19585(@OriginalArg(0) Class206 arg0) {
		if (arg0 == Class206.aClass206_22) {
			return 80;
		} else if (arg0 == Class206.aClass206_21) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!apn", name = "air", descriptor = "(Lclient!dl;)I", line = 1025)
	static final int method19586(@OriginalArg(0) Class206 arg0) {
		if (arg0 == Class206.aClass206_22) {
			return 80;
		} else if (arg0 == Class206.aClass206_21) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!apn", name = "ahr", descriptor = "(Lclient!lq;)I", line = 1031)
	static final int method19587(@OriginalArg(0) Class384 arg0) {
		switch(arg0.anInt4586) {
			case 0:
				return 1;
			case 1:
				return 6;
			case 2:
				return 2;
			case 3:
				return 4;
			case 4:
				return 5;
			case 5:
				return 3;
			default:
				throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!apn", name = "fy", descriptor = "(Z)V", line = 1048)
	@Override
	public void method20180() {
	}

	@OriginalMember(owner = "client!apn", name = "et", descriptor = "(Z)V", line = 1048)
	@Override
	public void method20149(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!apn", name = "ahb", descriptor = "(IIJILclient!jagdx/D3DDISPLAYMODE;Lclient!jagdx/D3DPRESENT_PARAMETERS;)Z", line = 1051)
	static boolean method19588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) D3DDISPLAYMODE arg4, @OriginalArg(5) D3DPRESENT_PARAMETERS arg5) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			if (p.method27707(IDirect3D.GetAdapterDisplayMode(arg2, arg0, arg4))) {
				return false;
			}
			label76: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(24) int local24 = 0; local24 < anIntArray248.length; local24++) {
						if (IDirect3D.CheckDeviceType(arg2, arg0, arg1, arg4.Format, anIntArray248[local24], true) == 0 && IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 1, 1, anIntArray248[local24]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray248[local24], true, local5) == 0)) {
							for (@Pc(65) int local65 = 0; local65 < anIntArray247.length; local65++) {
								if (IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 2, 1, anIntArray247[local65]) == 0 && IDirect3D.CheckDepthStencilMatch(arg2, arg0, arg1, arg4.Format, anIntArray248[local24], anIntArray247[local65]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray247[local24], true, local5) == 0)) {
									local3 = anIntArray248[local24];
									local1 = anIntArray247[local65];
									break label76;
								}
							}
						}
					}
				}
				arg3--;
			}
			if (arg3 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg5.BackBufferFormat = local3;
			arg5.AutoDepthStencilFormat = local1;
			arg5.MultiSampleType = local5;
			arg5.MultiSampleQuality = 0;
			return true;
		} catch (@Pc(144) Throwable local144) {
			return false;
		}
	}

	@OriginalMember(owner = "client!apn", name = "aiw", descriptor = "(IIJILclient!jagdx/D3DDISPLAYMODE;Lclient!jagdx/D3DPRESENT_PARAMETERS;)Z", line = 1051)
	static boolean method19589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) D3DDISPLAYMODE arg4, @OriginalArg(5) D3DPRESENT_PARAMETERS arg5) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			if (p.method27707(IDirect3D.GetAdapterDisplayMode(arg2, arg0, arg4))) {
				return false;
			}
			label76: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(24) int local24 = 0; local24 < anIntArray248.length; local24++) {
						if (IDirect3D.CheckDeviceType(arg2, arg0, arg1, arg4.Format, anIntArray248[local24], true) == 0 && IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 1, 1, anIntArray248[local24]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray248[local24], true, local5) == 0)) {
							for (@Pc(65) int local65 = 0; local65 < anIntArray247.length; local65++) {
								if (IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 2, 1, anIntArray247[local65]) == 0 && IDirect3D.CheckDepthStencilMatch(arg2, arg0, arg1, arg4.Format, anIntArray248[local24], anIntArray247[local65]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray247[local24], true, local5) == 0)) {
									local3 = anIntArray248[local24];
									local1 = anIntArray247[local65];
									break label76;
								}
							}
						}
					}
				}
				arg3--;
			}
			if (arg3 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg5.BackBufferFormat = local3;
			arg5.AutoDepthStencilFormat = local1;
			arg5.MultiSampleType = local5;
			arg5.MultiSampleQuality = 0;
			return true;
		} catch (@Pc(144) Throwable local144) {
			return false;
		}
	}

	@OriginalMember(owner = "client!apn", name = "ahy", descriptor = "(J)V", line = 1100)
	synchronized void method19590(@OriginalArg(0) long arg0) {
		if (this.anInt2710 == this.anInt2712) {
			this.anInt2712 *= 2;
			@Pc(14) long[] local14 = new long[this.anInt2712];
			System.arraycopy(this.aLongArray13, 0, local14, 0, this.anInt2710);
			this.aLongArray13 = local14;
		}
		this.aLongArray13[this.anInt2710] = arg0;
		this.anInt2710++;
	}

	@OriginalMember(owner = "client!apn", name = "aiv", descriptor = "(J)V", line = 1100)
	synchronized void method19591(@OriginalArg(0) long arg0) {
		if (this.anInt2710 == this.anInt2712) {
			this.anInt2712 *= 2;
			@Pc(14) long[] local14 = new long[this.anInt2712];
			System.arraycopy(this.aLongArray13, 0, local14, 0, this.anInt2710);
			this.aLongArray13 = local14;
		}
		this.aLongArray13[this.anInt2710] = arg0;
		this.anInt2710++;
	}

	@OriginalMember(owner = "client!apn", name = "aix", descriptor = "(J)V", line = 1100)
	synchronized void method19592(@OriginalArg(0) long arg0) {
		if (this.anInt2710 == this.anInt2712) {
			this.anInt2712 *= 2;
			@Pc(14) long[] local14 = new long[this.anInt2712];
			System.arraycopy(this.aLongArray13, 0, local14, 0, this.anInt2710);
			this.aLongArray13 = local14;
		}
		this.aLongArray13[this.anInt2710] = arg0;
		this.anInt2710++;
	}

	@OriginalMember(owner = "client!apn", name = "ain", descriptor = "(J)V", line = 1100)
	synchronized void method19593(@OriginalArg(0) long arg0) {
		if (this.anInt2710 == this.anInt2712) {
			this.anInt2712 *= 2;
			@Pc(14) long[] local14 = new long[this.anInt2712];
			System.arraycopy(this.aLongArray13, 0, local14, 0, this.anInt2710);
			this.aLongArray13 = local14;
		}
		this.aLongArray13[this.anInt2710] = arg0;
		this.anInt2710++;
	}

	@OriginalMember(owner = "client!apn", name = "wg", descriptor = "(I)V", line = 1111)
	@Override
	void method20622(@OriginalArg(0) int arg0) {
		if (!this.aBoolean421) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong119, 8, local10);
		}
	}

	@OriginalMember(owner = "client!apn", name = "afx", descriptor = "(I)V", line = 1111)
	@Override
	void method20709(@OriginalArg(0) int arg0) {
		if (!this.aBoolean421) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong119, 8, local10);
		}
	}

	@OriginalMember(owner = "client!apn", name = "afm", descriptor = "(I)V", line = 1111)
	@Override
	void method20764(@OriginalArg(0) int arg0) {
		if (!this.aBoolean421) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong119, 8, local10);
		}
	}

	@OriginalMember(owner = "client!apn", name = "afr", descriptor = "(I)V", line = 1111)
	@Override
	void method20765(@OriginalArg(0) int arg0) {
		if (!this.aBoolean421) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong119, 8, local10);
		}
	}

	@OriginalMember(owner = "client!apn", name = "n", descriptor = "()Ljava/lang/String;", line = 1118)
	@Override
	public String method20059() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2844 + local3;
		@Pc(27) String local27 = local15 + this.anInt2848 + local3;
		@Pc(39) String local39 = local27 + this.anInt2849 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean453 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method20630() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method20681() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean458 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean457 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean414 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean422 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean416 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean415 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean454 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean455 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean456 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean411 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean417 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean418 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean419 ? 1 : 0) + local3;
		return local311 + (this.aBoolean420 ? 1 : 0);
	}

	@OriginalMember(owner = "client!apn", name = "fh", descriptor = "()Ljava/lang/String;", line = 1118)
	@Override
	public String method20176() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2844 + local3;
		@Pc(27) String local27 = local15 + this.anInt2848 + local3;
		@Pc(39) String local39 = local27 + this.anInt2849 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean453 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method20630() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method20681() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean458 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean457 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean414 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean422 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean416 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean415 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean454 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean455 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean456 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean411 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean417 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean418 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean419 ? 1 : 0) + local3;
		return local311 + (this.aBoolean420 ? 1 : 0);
	}

	@OriginalMember(owner = "client!apn", name = "fn", descriptor = "()Ljava/lang/String;", line = 1118)
	@Override
	public String method20177() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2844 + local3;
		@Pc(27) String local27 = local15 + this.anInt2848 + local3;
		@Pc(39) String local39 = local27 + this.anInt2849 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean453 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method20630() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method20681() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean458 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean457 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean414 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean422 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean416 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean415 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean454 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean455 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean456 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean411 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean417 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean418 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean419 ? 1 : 0) + local3;
		return local311 + (this.aBoolean420 ? 1 : 0);
	}
}
