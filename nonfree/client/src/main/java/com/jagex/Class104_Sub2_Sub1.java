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
import jagdx.e;
import jagdx.m;
import jagdx.u;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqd")
public class Class104_Sub2_Sub1 extends Class104_Sub2 {

	@OriginalMember(owner = "client!aqd", name = "if", descriptor = "I")
	static final int anInt2732 = 3;

	@OriginalMember(owner = "client!aqd", name = "ic", descriptor = "[I")
	static final int[] anIntArray228 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!aqd", name = "jd", descriptor = "[I")
	static final int[] anIntArray229 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!aqd", name = "io", descriptor = "Lclient!agt;")
	Class116_Sub2 aClass116_Sub2_2;

	@OriginalMember(owner = "client!aqd", name = "iq", descriptor = "J")
	long aLong120;

	@OriginalMember(owner = "client!aqd", name = "il", descriptor = "Z")
	boolean aBoolean440;

	@OriginalMember(owner = "client!aqd", name = "hf", descriptor = "J")
	long aLong117 = 0L;

	@OriginalMember(owner = "client!aqd", name = "hr", descriptor = "J")
	long aLong121 = 0L;

	@OriginalMember(owner = "client!aqd", name = "hp", descriptor = "Lclient!aat;")
	Class22 aClass22_33 = new Class22();

	@OriginalMember(owner = "client!aqd", name = "hy", descriptor = "Z")
	boolean aBoolean431 = false;

	@OriginalMember(owner = "client!aqd", name = "he", descriptor = "J")
	long aLong118 = 0L;

	@OriginalMember(owner = "client!aqd", name = "hn", descriptor = "J")
	long aLong122 = 0L;

	@OriginalMember(owner = "client!aqd", name = "hi", descriptor = "J")
	long aLong119 = 0L;

	@OriginalMember(owner = "client!aqd", name = "hw", descriptor = "Z")
	boolean aBoolean441 = false;

	@OriginalMember(owner = "client!aqd", name = "iw", descriptor = "[F")
	final float[] aFloatArray50 = new float[16];

	@OriginalMember(owner = "client!aqd", name = "ip", descriptor = "I")
	int anInt2734 = 128;

	@OriginalMember(owner = "client!aqd", name = "id", descriptor = "I")
	int anInt2733 = 0;

	@OriginalMember(owner = "client!aqd", name = "ia", descriptor = "[J")
	long[] aLongArray14 = new long[this.anInt2734];

	@OriginalMember(owner = "client!aqd", name = "ih", descriptor = "J")
	long aLong123 = 0L;

	@OriginalMember(owner = "client!aqd", name = "iy", descriptor = "[J")
	long[] aLongArray13 = new long[3];

	@OriginalMember(owner = "client!aqd", name = "ii", descriptor = "[J")
	long[] aLongArray15 = new long[3];

	@OriginalMember(owner = "client!aqd", name = "iz", descriptor = "[I")
	int[] anIntArray227 = new int[3];

	@OriginalMember(owner = "client!aqd", name = "ik", descriptor = "I")
	int anInt2735 = 0;

	@OriginalMember(owner = "client!aqd", name = "im", descriptor = "I")
	int anInt2736 = 0;

	@OriginalMember(owner = "client!aqd", name = "hx", descriptor = "I")
	final int anInt2731;

	@OriginalMember(owner = "client!aqd", name = "hq", descriptor = "I")
	final int anInt2730;

	@OriginalMember(owner = "client!aqd", name = "hh", descriptor = "Lclient!jagdx/D3DDISPLAYMODE;")
	final D3DDISPLAYMODE aD3DDISPLAYMODE1;

	@OriginalMember(owner = "client!aqd", name = "hs", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS2;

	@OriginalMember(owner = "client!aqd", name = "ig", descriptor = "Lclient!jagdx/D3DCAPS;")
	final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!aqd", name = "iv", descriptor = "Z")
	final boolean aBoolean435;

	@OriginalMember(owner = "client!aqd", name = "in", descriptor = "Z")
	final boolean aBoolean432;

	@OriginalMember(owner = "client!aqd", name = "iu", descriptor = "Z")
	final boolean aBoolean433;

	@OriginalMember(owner = "client!aqd", name = "ie", descriptor = "Z")
	final boolean aBoolean436;

	@OriginalMember(owner = "client!aqd", name = "ir", descriptor = "Z")
	final boolean aBoolean437;

	@OriginalMember(owner = "client!aqd", name = "it", descriptor = "Z")
	final boolean aBoolean438;

	@OriginalMember(owner = "client!aqd", name = "ix", descriptor = "Z")
	final boolean aBoolean434;

	@OriginalMember(owner = "client!aqd", name = "is", descriptor = "Z")
	final boolean aBoolean430;

	@OriginalMember(owner = "client!aqd", name = "ib", descriptor = "Z")
	final boolean aBoolean439;

	@OriginalMember(owner = "client!aqd", name = "ht", descriptor = "[Z")
	boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!aqd", name = "hc", descriptor = "[Z")
	boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!aqd", name = "ho", descriptor = "[Z")
	boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!aqd", name = "hv", descriptor = "[Lclient!lt;")
	Class405[] aClass405Array1;

	@OriginalMember(owner = "client!aqd", name = "hj", descriptor = "[Z")
	boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!aqd", name = "hz", descriptor = "[I")
	int[] anIntArray226;

	@OriginalMember(owner = "client!aqd", name = "ij", descriptor = "Lclient!pq;")
	Class489 aClass489_68;

	@OriginalMember(owner = "client!aqd", name = "rx", descriptor = "()Z", line = 68)
	@Override
	public boolean method20885() {
		return (this.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqd", name = "wt", descriptor = "()Z", line = 68)
	@Override
	public boolean method21047() {
		return (this.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqd", name = "ry", descriptor = "()Z", line = 72)
	@Override
	public boolean method20886() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqd", name = "ww", descriptor = "()Z", line = 72)
	@Override
	public boolean method21064() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqd", name = "wh", descriptor = "()Z", line = 72)
	@Override
	public boolean method21062() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqd", name = "wd", descriptor = "()Z", line = 72)
	@Override
	public boolean method21063() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqd", name = "ws", descriptor = "()Z", line = 72)
	@Override
	public boolean method21168() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqd", name = "wx", descriptor = "()Z", line = 72)
	@Override
	public boolean method21061() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!aqd", name = "rg", descriptor = "(Z)Z", line = 76)
	@Override
	public boolean method20887(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean430;
		} else {
			return this.aBoolean430 && this.aBoolean439;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "xy", descriptor = "(Z)Z", line = 76)
	@Override
	public boolean method21067(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean430;
		} else {
			return this.aBoolean430 && this.aBoolean439;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "wi", descriptor = "(Z)Z", line = 76)
	@Override
	public boolean method21065(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean430;
		} else {
			return this.aBoolean430 && this.aBoolean439;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "wy", descriptor = "(Z)Z", line = 76)
	@Override
	public boolean method20940(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean430;
		} else {
			return this.aBoolean430 && this.aBoolean439;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "xm", descriptor = "(Z)Z", line = 76)
	@Override
	public boolean method21011(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean430;
		} else {
			return this.aBoolean430 && this.aBoolean439;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "xl", descriptor = "(Z)Z", line = 76)
	@Override
	public boolean method21038(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aBoolean430;
		} else {
			return this.aBoolean430 && this.aBoolean439;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ais", descriptor = "(Ljava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;Ljava/lang/Integer;)Lclient!dh;", line = 82)
	static Class104 method19544(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface48 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Class497 arg6, @OriginalArg(7) Integer arg7) {
		@Pc(1) Class104_Sub2_Sub1 local1 = null;
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
				if (!method19539(local3, local5, local7, arg7, local175, local151)) {
					throw new RuntimeException("");
				}
				@Pc(191) int local191 = 0;
				if ((local11.DevCaps & 0x100000) != 0) {
					local191 |= 0x10;
				}
				@Pc(212) long local212;
				try {
					local212 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 | 0x40, local151);
				} catch (@Pc(214) u local214) {
					local212 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 & 0xFFEFFFFF | 0x20, local151);
				}
				local1 = new Class104_Sub2_Sub1(local3, local5, local7, local212, local175, local151, local11, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
				if (!local1.aHashtable6.containsKey(arg0)) {
					Class451.method28952(arg0);
					local1.method20437(arg0, new Class112_Sub2_Sub1_Sub1(local1, arg0, arg0.getWidth(), arg0.getHeight(), true));
				}
				local1.method20439(arg0);
				local1.method20897();
				return local1;
			}
		} catch (@Pc(276) RuntimeException local276) {
			if (local1 != null) {
				local1.method20668();
			}
			throw local276;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aiy", descriptor = "(Ljava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;Ljava/lang/Integer;)Lclient!dh;", line = 82)
	static Class104 method19554(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface48 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Class497 arg6, @OriginalArg(7) Integer arg7) {
		@Pc(1) Class104_Sub2_Sub1 local1 = null;
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
				if (!method19539(local3, local5, local7, arg7, local175, local151)) {
					throw new RuntimeException("");
				}
				@Pc(191) int local191 = 0;
				if ((local11.DevCaps & 0x100000) != 0) {
					local191 |= 0x10;
				}
				@Pc(212) long local212;
				try {
					local212 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 | 0x40, local151);
				} catch (@Pc(214) u local214) {
					local212 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 & 0xFFEFFFFF | 0x20, local151);
				}
				local1 = new Class104_Sub2_Sub1(local3, local5, local7, local212, local175, local151, local11, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
				if (!local1.aHashtable6.containsKey(arg0)) {
					Class451.method28952(arg0);
					local1.method20437(arg0, new Class112_Sub2_Sub1_Sub1(local1, arg0, arg0.getWidth(), arg0.getHeight(), true));
				}
				local1.method20439(arg0);
				local1.method20897();
				return local1;
			}
		} catch (@Pc(276) RuntimeException local276) {
			if (local1 != null) {
				local1.method20668();
			}
			throw local276;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahu", descriptor = "(Ljava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;Ljava/lang/Integer;)Lclient!dh;", line = 82)
	static Class104 method19566(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface48 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Class497 arg6, @OriginalArg(7) Integer arg7) {
		@Pc(1) Class104_Sub2_Sub1 local1 = null;
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
				if (!method19539(local3, local5, local7, arg7, local175, local151)) {
					throw new RuntimeException("");
				}
				@Pc(191) int local191 = 0;
				if ((local11.DevCaps & 0x100000) != 0) {
					local191 |= 0x10;
				}
				@Pc(212) long local212;
				try {
					local212 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 | 0x40, local151);
				} catch (@Pc(214) u local214) {
					local212 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local191 & 0xFFEFFFFF | 0x20, local151);
				}
				local1 = new Class104_Sub2_Sub1(local3, local5, local7, local212, local175, local151, local11, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
				if (!local1.aHashtable6.containsKey(arg0)) {
					Class451.method28952(arg0);
					local1.method20437(arg0, new Class112_Sub2_Sub1_Sub1(local1, arg0, arg0.getWidth(), arg0.getHeight(), true));
				}
				local1.method20439(arg0);
				local1.method20897();
				return local1;
			}
		} catch (@Pc(276) RuntimeException local276) {
			if (local1 != null) {
				local1.method20668();
			}
			throw local276;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "<init>", descriptor = "(IIJJLclient!jagdx/D3DDISPLAYMODE;Lclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;I)V", line = 135)
	Class104_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) long arg3, @OriginalArg(4) D3DDISPLAYMODE arg4, @OriginalArg(5) D3DPRESENT_PARAMETERS arg5, @OriginalArg(6) D3DCAPS arg6, @OriginalArg(7) Class225 arg7, @OriginalArg(8) Interface24 arg8, @OriginalArg(9) Interface48 arg9, @OriginalArg(10) Interface46 arg10, @OriginalArg(11) Interface47 arg11, @OriginalArg(12) Class497 arg12, @OriginalArg(13) int arg13) {
		super(arg7, arg8, arg9, arg10, arg11, arg12, arg13, 0);
		try {
			this.anInt2731 = arg0;
			this.anInt2730 = arg1;
			this.aLong117 = arg2;
			this.aLong121 = arg3;
			this.aD3DDISPLAYMODE1 = arg4;
			this.aD3DPRESENT_PARAMETERS2 = arg5;
			this.aD3DCAPS1 = arg6;
			this.aLong118 = D3DLIGHT.Create();
			this.aLong122 = D3DLIGHT.Create();
			this.aLong119 = D3DLIGHT.Create();
			this.anInt2954 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.anInt2920 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean435 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean483 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean471 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean432 = (this.aD3DCAPS1.TextureCaps & 0x8000) != 0;
			this.aBoolean433 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean436 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean475 = this.aD3DCAPS1.NumSimultaneousRTs > 0;
			this.aBoolean469 = this.aBoolean475;
			this.aBoolean473 = this.aD3DCAPS1.NumSimultaneousRTs > 0;
			this.aBoolean479 = this.anInt2951 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong117, this.anInt2731, this.anInt2730, this.aD3DPRESENT_PARAMETERS2.BackBufferFormat, true, 2) == 0;
			this.aBoolean485 = this.aD3DCAPS1.NumSimultaneousRTs > 0 && this.anInt2951 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong117, this.anInt2731, this.anInt2730, 113, true, 2) == 0;
			this.aBoolean437 = IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, this.aD3DPRESENT_PARAMETERS2.BackBufferFormat, 0, 1, method21010('A', 'T', 'O', 'C')) == 0;
			this.aBoolean438 = IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, this.aD3DPRESENT_PARAMETERS2.BackBufferFormat, 0, 1, method21010('A', '2', 'M', '1')) == 0;
			this.aBoolean434 = IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, this.aD3DPRESENT_PARAMETERS2.BackBufferFormat, 0, 1, method21010('S', 'S', 'A', 'A')) == 0;
			this.aBoolean460 = (this.aD3DCAPS1.PrimitiveMiscCaps & 0x20000) != 0;
			this.aBoolean430 = IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, this.aD3DDISPLAYMODE1.Format, 524288, 3, 113) == 0;
			this.aBoolean439 = IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, this.aD3DDISPLAYMODE1.Format, 524288, 3, 116) == 0;
			this.aBooleanArray14 = new boolean[this.anInt2954];
			this.aBooleanArray15 = new boolean[this.anInt2954];
			this.aBooleanArray17 = new boolean[this.anInt2954];
			this.aClass405Array1 = new Class405[this.anInt2954];
			this.aBooleanArray16 = new boolean[this.anInt2954];
			this.anIntArray226 = new int[this.anInt2954];
			@Pc(401) Class470 local401 = new Class470();
			local401.method29420(1.0F, -1.0F, 0.5F);
			local401.method29387(0.0F, 0.0F, 0.5F);
			this.aClass489_68 = new Class489();
			this.aClass489_68.method29842(local401);
			IDirect3DDevice.BeginScene(this.aLong121);
		} catch (@Pc(426) Throwable local426) {
			local426.printStackTrace();
			this.method20877();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!aqd", name = "sm", descriptor = "()V", line = 187)
	@Override
	void method21033() {
		for (@Pc(5) Class93_Sub15 local5 = (Class93_Sub15) this.aClass22_33.method445(); local5 != null; local5 = (Class93_Sub15) this.aClass22_33.method415()) {
			@Pc(11) Interface53 local11 = (Interface53) local5.anObject5;
			local11.method10400();
			if (local11 == this.aClass112_6) {
				local11.method23739();
			}
		}
		super.method21033();
	}

	@OriginalMember(owner = "client!aqd", name = "yn", descriptor = "()V", line = 187)
	@Override
	void method21091() {
		for (@Pc(5) Class93_Sub15 local5 = (Class93_Sub15) this.aClass22_33.method445(); local5 != null; local5 = (Class93_Sub15) this.aClass22_33.method415()) {
			@Pc(11) Interface53 local11 = (Interface53) local5.anObject5;
			local11.method10400();
			if (local11 == this.aClass112_6) {
				local11.method23739();
			}
		}
		super.method21033();
	}

	@OriginalMember(owner = "client!aqd", name = "yg", descriptor = "()V", line = 187)
	@Override
	void method21156() {
		for (@Pc(5) Class93_Sub15 local5 = (Class93_Sub15) this.aClass22_33.method445(); local5 != null; local5 = (Class93_Sub15) this.aClass22_33.method415()) {
			@Pc(11) Interface53 local11 = (Interface53) local5.anObject5;
			local11.method10400();
			if (local11 == this.aClass112_6) {
				local11.method23739();
			}
		}
		super.method21033();
	}

	@OriginalMember(owner = "client!aqd", name = "sx", descriptor = "()V", line = 196)
	@Override
	void method20901() {
		this.method20425();
		for (@Pc(7) Class93_Sub15 local7 = (Class93_Sub15) this.aClass22_33.method445(); local7 != null; local7 = (Class93_Sub15) this.aClass22_33.method415()) {
			@Pc(13) Interface53 local13 = (Interface53) local7.anObject5;
			local13.method23738();
		}
		super.method20901();
	}

	@OriginalMember(owner = "client!aqd", name = "ys", descriptor = "()V", line = 196)
	@Override
	void method21089() {
		this.method20425();
		for (@Pc(7) Class93_Sub15 local7 = (Class93_Sub15) this.aClass22_33.method445(); local7 != null; local7 = (Class93_Sub15) this.aClass22_33.method415()) {
			@Pc(13) Interface53 local13 = (Interface53) local7.anObject5;
			local13.method23738();
		}
		super.method20901();
	}

	@OriginalMember(owner = "client!aqd", name = "yj", descriptor = "()V", line = 196)
	@Override
	void method21088() {
		this.method20425();
		for (@Pc(7) Class93_Sub15 local7 = (Class93_Sub15) this.aClass22_33.method445(); local7 != null; local7 = (Class93_Sub15) this.aClass22_33.method415()) {
			@Pc(13) Interface53 local13 = (Interface53) local7.anObject5;
			local13.method23738();
		}
		super.method20901();
	}

	@OriginalMember(owner = "client!aqd", name = "yk", descriptor = "()V", line = 196)
	@Override
	void method21090() {
		this.method20425();
		for (@Pc(7) Class93_Sub15 local7 = (Class93_Sub15) this.aClass22_33.method445(); local7 != null; local7 = (Class93_Sub15) this.aClass22_33.method415()) {
			@Pc(13) Interface53 local13 = (Interface53) local7.anObject5;
			local13.method23738();
		}
		super.method20901();
	}

	@OriginalMember(owner = "client!aqd", name = "aig", descriptor = "(II)Z", line = 205)
	boolean method19536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong121);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong121, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong121, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong121, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong121, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong121, 0L);
			this.method20901();
			this.aD3DPRESENT_PARAMETERS2.BackBufferWidth = arg0;
			this.aD3DPRESENT_PARAMETERS2.BackBufferHeight = arg1;
			this.aD3DPRESENT_PARAMETERS2.BackBufferCount = 1;
			if (method19539(this.anInt2731, this.anInt2730, this.aLong117, this.anInt2951, this.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong121, this.aD3DPRESENT_PARAMETERS2);
				if (e.method27716(local15)) {
					this.aBoolean431 = false;
					this.method21033();
					this.method21161();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aqd", name = "ahz", descriptor = "(II)Z", line = 205)
	boolean method19542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong121);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong121, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong121, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong121, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong121, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong121, 0L);
			this.method20901();
			this.aD3DPRESENT_PARAMETERS2.BackBufferWidth = arg0;
			this.aD3DPRESENT_PARAMETERS2.BackBufferHeight = arg1;
			this.aD3DPRESENT_PARAMETERS2.BackBufferCount = 1;
			if (method19539(this.anInt2731, this.anInt2730, this.aLong117, this.anInt2951, this.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong121, this.aD3DPRESENT_PARAMETERS2);
				if (e.method27716(local15)) {
					this.aBoolean431 = false;
					this.method21033();
					this.method21161();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aqd", name = "aio", descriptor = "(II)Z", line = 205)
	boolean method19548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong121);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong121, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong121, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong121, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong121, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong121, 0L);
			this.method20901();
			this.aD3DPRESENT_PARAMETERS2.BackBufferWidth = arg0;
			this.aD3DPRESENT_PARAMETERS2.BackBufferHeight = arg1;
			this.aD3DPRESENT_PARAMETERS2.BackBufferCount = 1;
			if (method19539(this.anInt2731, this.anInt2730, this.aLong117, this.anInt2951, this.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong121, this.aD3DPRESENT_PARAMETERS2);
				if (e.method27716(local15)) {
					this.aBoolean431 = false;
					this.method21033();
					this.method21161();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aqd", name = "aid", descriptor = "(II)Z", line = 205)
	boolean method19556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong121);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong121, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong121, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong121, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong121, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong121, 0L);
			this.method20901();
			this.aD3DPRESENT_PARAMETERS2.BackBufferWidth = arg0;
			this.aD3DPRESENT_PARAMETERS2.BackBufferHeight = arg1;
			this.aD3DPRESENT_PARAMETERS2.BackBufferCount = 1;
			if (method19539(this.anInt2731, this.anInt2730, this.aLong117, this.anInt2951, this.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong121, this.aD3DPRESENT_PARAMETERS2);
				if (e.method27716(local15)) {
					this.aBoolean431 = false;
					this.method21033();
					this.method21161();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aqd", name = "sw", descriptor = "()V", line = 231)
	@Override
	void method21161() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2954; local1++) {
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 2, 1);
			this.aClass405Array1[local1] = Class405.aClass405_6;
			@Pc(48) boolean[] local48 = this.aBooleanArray14;
			this.aBooleanArray15[local1] = true;
			local48[local1] = true;
			this.aBooleanArray16[local1] = false;
			this.anIntArray226[local1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong121, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong121, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong121, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong121, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong121, 24, 0);
		IDirect3DDevice.method27710(this.aLong121, 206, this.aBoolean460);
		IDirect3DDevice.SetRenderState(this.aLong121, 181, 0);
		this.method19530();
		IDirect3DDevice.SetRenderState(this.aLong121, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong121, 145, 1);
		IDirect3DDevice.method27709(this.aLong121, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong121, 35, 3);
		IDirect3DDevice.method27709(this.aLong121, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong118, 3);
		D3DLIGHT.SetType(this.aLong122, 3);
		D3DLIGHT.SetType(this.aLong119, 1);
		this.aBoolean441 = false;
		super.method21161();
	}

	@OriginalMember(owner = "client!aqd", name = "xt", descriptor = "()V", line = 231)
	@Override
	void method21085() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2954; local1++) {
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong121, local1, 2, 1);
			this.aClass405Array1[local1] = Class405.aClass405_6;
			@Pc(48) boolean[] local48 = this.aBooleanArray14;
			this.aBooleanArray15[local1] = true;
			local48[local1] = true;
			this.aBooleanArray16[local1] = false;
			this.anIntArray226[local1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong121, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong121, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong121, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong121, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong121, 24, 0);
		IDirect3DDevice.method27710(this.aLong121, 206, this.aBoolean460);
		IDirect3DDevice.SetRenderState(this.aLong121, 181, 0);
		this.method19530();
		IDirect3DDevice.SetRenderState(this.aLong121, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong121, 145, 1);
		IDirect3DDevice.method27709(this.aLong121, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong121, 35, 3);
		IDirect3DDevice.method27709(this.aLong121, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong118, 3);
		D3DLIGHT.SetType(this.aLong122, 3);
		D3DLIGHT.SetType(this.aLong119, 1);
		this.aBoolean441 = false;
		super.method21161();
	}

	@OriginalMember(owner = "client!aqd", name = "f", descriptor = "()Lclient!cz;", line = 266)
	@Override
	public Class219 method20571() {
		@Pc(3) D3DADAPTER_IDENTIFIER local3 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong117, this.anInt2731, 0, local3);
		return new Class219(local3.VendorID, this.method21208() ? "Direct3D FF" : "Direct3D", 9, local3.Description, local3.DriverVersion, this.method21208());
	}

	@OriginalMember(owner = "client!aqd", name = "eq", descriptor = "()Lclient!cz;", line = 266)
	@Override
	public Class219 method20553() {
		@Pc(3) D3DADAPTER_IDENTIFIER local3 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong117, this.anInt2731, 0, local3);
		return new Class219(local3.VendorID, this.method21208() ? "Direct3D FF" : "Direct3D", 9, local3.Description, local3.DriverVersion, this.method21208());
	}

	@OriginalMember(owner = "client!aqd", name = "l", descriptor = "(II)V", line = 272)
	@Override
	void method20415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub4 {
		if (this.aBoolean431) {
			if (!this.method19542(this.aClass112_Sub2_6.method23736(), this.aClass112_Sub2_6.method23737())) {
				return;
			}
			((Class112_Sub2_Sub1_Sub1) this.aClass112_Sub2_6).method10400();
		} else {
			IDirect3DDevice.EndScene(this.aLong121);
		}
		@Pc(25) int local25 = this.aClass112_Sub2_6.method23755();
		if (e.method27715(local25)) {
			this.aBoolean431 = true;
			this.aClass112_Sub2_6.method23738();
		} else {
			IDirect3DDevice.BeginScene(this.aLong121);
			if (this.anInterface24_6 != null) {
				this.anInterface24_6.method6778();
			}
		}
	}

	@OriginalMember(owner = "client!aqd", name = "eg", descriptor = "(II)V", line = 272)
	@Override
	void method20782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub4 {
		if (this.aBoolean431) {
			if (!this.method19542(this.aClass112_Sub2_6.method23736(), this.aClass112_Sub2_6.method23737())) {
				return;
			}
			((Class112_Sub2_Sub1_Sub1) this.aClass112_Sub2_6).method10400();
		} else {
			IDirect3DDevice.EndScene(this.aLong121);
		}
		@Pc(25) int local25 = this.aClass112_Sub2_6.method23755();
		if (e.method27715(local25)) {
			this.aBoolean431 = true;
			this.aClass112_Sub2_6.method23738();
		} else {
			IDirect3DDevice.BeginScene(this.aLong121);
			if (this.anInterface24_6 != null) {
				this.anInterface24_6.method6778();
			}
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ez", descriptor = "(II)V", line = 272)
	@Override
	void method20585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub4 {
		if (this.aBoolean431) {
			if (!this.method19542(this.aClass112_Sub2_6.method23736(), this.aClass112_Sub2_6.method23737())) {
				return;
			}
			((Class112_Sub2_Sub1_Sub1) this.aClass112_Sub2_6).method10400();
		} else {
			IDirect3DDevice.EndScene(this.aLong121);
		}
		@Pc(25) int local25 = this.aClass112_Sub2_6.method23755();
		if (e.method27715(local25)) {
			this.aBoolean431 = true;
			this.aClass112_Sub2_6.method23738();
		} else {
			IDirect3DDevice.BeginScene(this.aLong121);
			if (this.anInterface24_6 != null) {
				this.anInterface24_6.method6778();
			}
		}
	}

	@OriginalMember(owner = "client!aqd", name = "u", descriptor = "()V", line = 288)
	@Override
	public void method20416() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong121);
		if (e.method27716(IDirect3DEventQuery.Issue(local3))) {
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

	@OriginalMember(owner = "client!aqd", name = "ef", descriptor = "()V", line = 288)
	@Override
	public void method20556() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong121);
		if (e.method27716(IDirect3DEventQuery.Issue(local3))) {
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

	@OriginalMember(owner = "client!aqd", name = "et", descriptor = "()V", line = 288)
	@Override
	public void method20557() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong121);
		if (e.method27716(IDirect3DEventQuery.Issue(local3))) {
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

	@OriginalMember(owner = "client!aqd", name = "p", descriptor = "()V", line = 300)
	@Override
	void method20668() {
		super.method20668();
		if (this.aLong118 != 0L) {
			D3DLIGHT.Destroy(this.aLong118);
			this.aLong118 = 0L;
		}
		if (this.aLong122 != 0L) {
			D3DLIGHT.Destroy(this.aLong122);
			this.aLong122 = 0L;
		}
		if (this.aLong119 != 0L) {
			D3DLIGHT.Destroy(this.aLong119);
			this.aLong119 = 0L;
		}
		if (this.aLong121 != 0L) {
			IDirect3DDevice.Destroy(this.aLong121);
			this.aLong121 = 0L;
		}
		if (this.aLong117 != 0L) {
			IUnknown.Release(this.aLong117);
			this.aLong117 = 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "er", descriptor = "()V", line = 300)
	@Override
	void method20758() {
		super.method20668();
		if (this.aLong118 != 0L) {
			D3DLIGHT.Destroy(this.aLong118);
			this.aLong118 = 0L;
		}
		if (this.aLong122 != 0L) {
			D3DLIGHT.Destroy(this.aLong122);
			this.aLong122 = 0L;
		}
		if (this.aLong119 != 0L) {
			D3DLIGHT.Destroy(this.aLong119);
			this.aLong119 = 0L;
		}
		if (this.aLong121 != 0L) {
			IDirect3DDevice.Destroy(this.aLong121);
			this.aLong121 = 0L;
		}
		if (this.aLong117 != 0L) {
			IUnknown.Release(this.aLong117);
			this.aLong117 = 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ew", descriptor = "()V", line = 300)
	@Override
	void method20559() {
		super.method20668();
		if (this.aLong118 != 0L) {
			D3DLIGHT.Destroy(this.aLong118);
			this.aLong118 = 0L;
		}
		if (this.aLong122 != 0L) {
			D3DLIGHT.Destroy(this.aLong122);
			this.aLong122 = 0L;
		}
		if (this.aLong119 != 0L) {
			D3DLIGHT.Destroy(this.aLong119);
			this.aLong119 = 0L;
		}
		if (this.aLong121 != 0L) {
			IDirect3DDevice.Destroy(this.aLong121);
			this.aLong121 = 0L;
		}
		if (this.aLong117 != 0L) {
			IUnknown.Release(this.aLong117);
			this.aLong117 = 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ea", descriptor = "()V", line = 300)
	@Override
	void method20558() {
		super.method20668();
		if (this.aLong118 != 0L) {
			D3DLIGHT.Destroy(this.aLong118);
			this.aLong118 = 0L;
		}
		if (this.aLong122 != 0L) {
			D3DLIGHT.Destroy(this.aLong122);
			this.aLong122 = 0L;
		}
		if (this.aLong119 != 0L) {
			D3DLIGHT.Destroy(this.aLong119);
			this.aLong119 = 0L;
		}
		if (this.aLong121 != 0L) {
			IDirect3DDevice.Destroy(this.aLong121);
			this.aLong121 = 0L;
		}
		if (this.aLong117 != 0L) {
			IUnknown.Release(this.aLong117);
			this.aLong117 = 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "finalize", descriptor = "()V", line = 324)
	@Override
	void finalize() {
		super.finalize();
	}

	@OriginalMember(owner = "client!aqd", name = "hl", descriptor = "()V", line = 324)
	@Override
	void method20789() {
		super.finalize();
	}

	@OriginalMember(owner = "client!aqd", name = "sr", descriptor = "()F", line = 328)
	@Override
	public float method20882() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!aqd", name = "yx", descriptor = "()F", line = 328)
	@Override
	public float method21097() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!aqd", name = "am", descriptor = "()Lclient!afq;", line = 332)
	@Override
	public Class112_Sub1 method20444() {
		return new Class112_Sub1_Sub3_Sub2(this);
	}

	@OriginalMember(owner = "client!aqd", name = "ng", descriptor = "()Lclient!afq;", line = 332)
	@Override
	public Class112_Sub1 method20784() {
		return new Class112_Sub1_Sub3_Sub2(this);
	}

	@OriginalMember(owner = "client!aqd", name = "nt", descriptor = "()Lclient!afq;", line = 332)
	@Override
	public Class112_Sub1 method20785() {
		return new Class112_Sub1_Sub3_Sub2(this);
	}

	@OriginalMember(owner = "client!aqd", name = "gq", descriptor = "(Ljava/awt/Canvas;II)Lclient!afy;", line = 336)
	@Override
	Class112_Sub2 method20591(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class112_Sub2_Sub1_Sub1(this, arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!aqd", name = "ad", descriptor = "(Ljava/awt/Canvas;II)Lclient!afy;", line = 336)
	@Override
	Class112_Sub2 method20443(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class112_Sub2_Sub1_Sub1(this, arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!aqd", name = "au", descriptor = "(IILclient!ck;Lclient!dg;I)Lclient!dp;", line = 340)
	@Override
	public Interface18 method20445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4) {
		return new Class459(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!aqd", name = "nn", descriptor = "(IILclient!ck;Lclient!dg;I)Lclient!dp;", line = 340)
	@Override
	public Interface18 method20873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4) {
		return new Class459(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!aqd", name = "ar", descriptor = "(II)Lclient!dw;", line = 344)
	@Override
	public Interface19 method20420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class473(this, Class226.aClass226_26, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!aqd", name = "nk", descriptor = "(II)Lclient!dw;", line = 344)
	@Override
	public Interface19 method20678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class473(this, Class226.aClass226_26, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!aqd", name = "ap", descriptor = "(III)Lclient!dw;", line = 348)
	@Override
	public Interface19 method20655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class473(this, Class226.aClass226_26, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "nq", descriptor = "(III)Lclient!dw;", line = 348)
	@Override
	public Interface19 method20788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class473(this, Class226.aClass226_26, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "aha", descriptor = "(Lclient!oz;)Lclient!ake;", line = 352)
	Class93_Sub15 method19528(@OriginalArg(0) Interface53 arg0) {
		for (@Pc(5) Class93_Sub15 local5 = (Class93_Sub15) this.aClass22_33.method445(); local5 != null; local5 = (Class93_Sub15) this.aClass22_33.method415()) {
			if (local5.anObject5 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aqd", name = "aif", descriptor = "(Lclient!oz;)Lclient!ake;", line = 352)
	Class93_Sub15 method19557(@OriginalArg(0) Interface53 arg0) {
		for (@Pc(5) Class93_Sub15 local5 = (Class93_Sub15) this.aClass22_33.method445(); local5 != null; local5 = (Class93_Sub15) this.aClass22_33.method415()) {
			if (local5.anObject5 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aqd", name = "aiw", descriptor = "(Lclient!oz;)Lclient!ake;", line = 352)
	Class93_Sub15 method19559(@OriginalArg(0) Interface53 arg0) {
		for (@Pc(5) Class93_Sub15 local5 = (Class93_Sub15) this.aClass22_33.method445(); local5 != null; local5 = (Class93_Sub15) this.aClass22_33.method415()) {
			if (local5.anObject5 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aqd", name = "ail", descriptor = "(Lclient!oz;)Lclient!ake;", line = 352)
	Class93_Sub15 method19575(@OriginalArg(0) Interface53 arg0) {
		for (@Pc(5) Class93_Sub15 local5 = (Class93_Sub15) this.aClass22_33.method445(); local5 != null; local5 = (Class93_Sub15) this.aClass22_33.method415()) {
			if (local5.anObject5 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aqd", name = "ahx", descriptor = "(Lclient!oz;)V", line = 359)
	void method19518(@OriginalArg(0) Interface53 arg0) {
		if (this.method19528(arg0) == null) {
			this.aClass22_33.method407(new Class93_Sub15(arg0));
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aiz", descriptor = "(Lclient!oz;)V", line = 359)
	void method19560(@OriginalArg(0) Interface53 arg0) {
		if (this.method19528(arg0) == null) {
			this.aClass22_33.method407(new Class93_Sub15(arg0));
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aij", descriptor = "(Lclient!oz;)V", line = 363)
	void method19520(@OriginalArg(0) Interface53 arg0) {
		@Pc(3) Class93_Sub15 local3 = this.method19528(arg0);
		if (local3 != null) {
			local3.method23969();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahb", descriptor = "(Lclient!oz;)V", line = 363)
	void method19523(@OriginalArg(0) Interface53 arg0) {
		@Pc(3) Class93_Sub15 local3 = this.method19528(arg0);
		if (local3 != null) {
			local3.method23969();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aie", descriptor = "(Lclient!oz;)V", line = 363)
	void method19540(@OriginalArg(0) Interface53 arg0) {
		@Pc(3) Class93_Sub15 local3 = this.method19528(arg0);
		if (local3 != null) {
			local3.method23969();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aic", descriptor = "(Lclient!oz;)V", line = 363)
	void method19549(@OriginalArg(0) Interface53 arg0) {
		@Pc(3) Class93_Sub15 local3 = this.method19528(arg0);
		if (local3 != null) {
			local3.method23969();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aim", descriptor = "(Lclient!oz;)V", line = 363)
	void method19561(@OriginalArg(0) Interface53 arg0) {
		@Pc(3) Class93_Sub15 local3 = this.method19528(arg0);
		if (local3 != null) {
			local3.method23969();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aq", descriptor = "(IIII)[I", line = 368)
	@Override
	public int[] method20448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20501();
		@Pc(3) int[] local3 = null;
		@Pc(8) long local8 = IDirect3DDevice.GetRenderTarget(this.aLong121, 0);
		@Pc(18) long local18 = IDirect3DDevice.CreateRenderTarget(this.aLong121, arg2, arg3, 21, 0, 0, true);
		@Pc(33) int local33 = IDirect3DDevice.StretchRect(this.aLong121, local8, arg0, arg1, arg2, arg3, local18, 0, 0, arg2, arg3, 1);
		this.method20889(arg2 * arg3 * 4);
		if (e.method27716(local33)) {
			local3 = new int[arg2 * arg3];
			IDirect3DSurface.Download(local18, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong132);
			this.aByteBuffer7.clear();
			this.aByteBuffer7.asIntBuffer().get(local3);
		}
		IUnknown.Release(local8);
		IUnknown.Release(local18);
		return local3;
	}

	@OriginalMember(owner = "client!aqd", name = "gl", descriptor = "(IIII)[I", line = 368)
	@Override
	public int[] method20592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20501();
		@Pc(3) int[] local3 = null;
		@Pc(8) long local8 = IDirect3DDevice.GetRenderTarget(this.aLong121, 0);
		@Pc(18) long local18 = IDirect3DDevice.CreateRenderTarget(this.aLong121, arg2, arg3, 21, 0, 0, true);
		@Pc(33) int local33 = IDirect3DDevice.StretchRect(this.aLong121, local8, arg0, arg1, arg2, arg3, local18, 0, 0, arg2, arg3, 1);
		this.method20889(arg2 * arg3 * 4);
		if (e.method27716(local33)) {
			local3 = new int[arg2 * arg3];
			IDirect3DSurface.Download(local18, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong132);
			this.aByteBuffer7.clear();
			this.aByteBuffer7.asIntBuffer().get(local3);
		}
		IUnknown.Release(local8);
		IUnknown.Release(local18);
		return local3;
	}

	@OriginalMember(owner = "client!aqd", name = "ax", descriptor = "()V", line = 385)
	@Override
	public void method20449() {
	}

	@OriginalMember(owner = "client!aqd", name = "gk", descriptor = "()V", line = 385)
	@Override
	public void method20690() {
	}

	@OriginalMember(owner = "client!aqd", name = "gp", descriptor = "()V", line = 385)
	@Override
	public void method20581() {
	}

	@OriginalMember(owner = "client!aqd", name = "gy", descriptor = "()V", line = 385)
	@Override
	public void method20596() {
	}

	@OriginalMember(owner = "client!aqd", name = "go", descriptor = "()V", line = 385)
	@Override
	public void method20593() {
	}

	@OriginalMember(owner = "client!aqd", name = "gc", descriptor = "()Z", line = 388)
	@Override
	public boolean method20787() {
		return true;
	}

	@OriginalMember(owner = "client!aqd", name = "gf", descriptor = "()Z", line = 388)
	@Override
	public boolean method20749() {
		return true;
	}

	@OriginalMember(owner = "client!aqd", name = "av", descriptor = "()Z", line = 388)
	@Override
	public boolean method20659() {
		return true;
	}

	@OriginalMember(owner = "client!aqd", name = "aho", descriptor = "(II)V", line = 392)
	void method19547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20425();
		this.method20718(arg0, arg1);
		this.aLong123 = IDirect3DDevice.CreateRenderTarget(this.aLong121, arg0, arg1, method19534(Class206.aClass206_22, Class226.aClass226_22), 0, 0, false);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.aLongArray15[local21] = IDirect3DDevice.CreateOffscreenPlainSurface(this.aLong121, arg0, arg1, method19534(Class206.aClass206_22, Class226.aClass226_22), 2);
		}
		this.method20889(arg0 * arg1 * 4);
	}

	@OriginalMember(owner = "client!aqd", name = "aik", descriptor = "(II)V", line = 392)
	void method19562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20425();
		this.method20718(arg0, arg1);
		this.aLong123 = IDirect3DDevice.CreateRenderTarget(this.aLong121, arg0, arg1, method19534(Class206.aClass206_22, Class226.aClass226_22), 0, 0, false);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.aLongArray15[local21] = IDirect3DDevice.CreateOffscreenPlainSurface(this.aLong121, arg0, arg1, method19534(Class206.aClass206_22, Class226.aClass226_22), 2);
		}
		this.method20889(arg0 * arg1 * 4);
	}

	@OriginalMember(owner = "client!aqd", name = "ao", descriptor = "()Z", line = 402)
	@Override
	public boolean method20495() {
		if (this.aBoolean431) {
			return false;
		} else {
			return this.aLongArray13[this.anInt2736] == 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "gg", descriptor = "()Z", line = 402)
	@Override
	public boolean method20534() {
		if (this.aBoolean431) {
			return false;
		} else {
			return this.aLongArray13[this.anInt2736] == 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "gr", descriptor = "()Z", line = 402)
	@Override
	public boolean method20604() {
		if (this.aBoolean431) {
			return false;
		} else {
			return this.aLongArray13[this.anInt2736] == 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "gx", descriptor = "()Z", line = 402)
	@Override
	public boolean method20601() {
		if (this.aBoolean431) {
			return false;
		} else {
			return this.aLongArray13[this.anInt2736] == 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ge", descriptor = "()Z", line = 402)
	@Override
	public boolean method20602() {
		if (this.aBoolean431) {
			return false;
		} else {
			return this.aLongArray13[this.anInt2736] == 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aj", descriptor = "()Z", line = 412)
	@Override
	public boolean method20452() {
		return true;
	}

	@OriginalMember(owner = "client!aqd", name = "gs", descriptor = "()Z", line = 412)
	@Override
	public boolean method20875() {
		return true;
	}

	@OriginalMember(owner = "client!aqd", name = "gt", descriptor = "()Z", line = 412)
	@Override
	public boolean method20606() {
		return true;
	}

	@OriginalMember(owner = "client!aqd", name = "gh", descriptor = "()Z", line = 412)
	@Override
	public boolean method20607() {
		return true;
	}

	@OriginalMember(owner = "client!aqd", name = "ay", descriptor = "()Z", line = 416)
	@Override
	public boolean method20603() {
		return false;
	}

	@OriginalMember(owner = "client!aqd", name = "gv", descriptor = "()Z", line = 416)
	@Override
	public boolean method20432() {
		return false;
	}

	@OriginalMember(owner = "client!aqd", name = "gm", descriptor = "()Z", line = 416)
	@Override
	public boolean method20608() {
		return false;
	}

	@OriginalMember(owner = "client!aqd", name = "aa", descriptor = "(III)V", line = 420)
	@Override
	public void method20462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aLong123 == 0L) {
			this.method19547(arg1, arg2);
		}
		@Pc(13) long local13 = IDirect3DDevice.GetRenderTarget(this.aLong121, 0);
		if (e.method27715(IDirect3DDevice.StretchRect(this.aLong121, local13, 0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), this.aLong123, this.anInt2899 * 1081362515, this.anInt2903 * -779214253, this.anInt2904 * 406942099, this.anInt2898 * -88050601, 2))) {
		}
		IUnknown.Release(local13);
		IDirect3DDevice.GetRenderTargetData(this.aLong121, this.aLong123, this.aLongArray15[this.anInt2736]);
		@Pc(63) long local63 = IDirect3DDevice.CreateEventQuery(this.aLong121);
		if (e.method27716(IDirect3DEventQuery.Issue(local63))) {
			this.aLongArray13[this.anInt2736] = local63;
		}
		this.anIntArray227[this.anInt2736] = arg0;
		if (++this.anInt2736 >= 3) {
			this.anInt2736 = 0;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "gd", descriptor = "(III)V", line = 420)
	@Override
	public void method20612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aLong123 == 0L) {
			this.method19547(arg1, arg2);
		}
		@Pc(13) long local13 = IDirect3DDevice.GetRenderTarget(this.aLong121, 0);
		if (e.method27715(IDirect3DDevice.StretchRect(this.aLong121, local13, 0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), this.aLong123, this.anInt2899 * 1081362515, this.anInt2903 * -779214253, this.anInt2904 * 406942099, this.anInt2898 * -88050601, 2))) {
		}
		IUnknown.Release(local13);
		IDirect3DDevice.GetRenderTargetData(this.aLong121, this.aLong123, this.aLongArray15[this.anInt2736]);
		@Pc(63) long local63 = IDirect3DDevice.CreateEventQuery(this.aLong121);
		if (e.method27716(IDirect3DEventQuery.Issue(local63))) {
			this.aLongArray13[this.anInt2736] = local63;
		}
		this.anIntArray227[this.anInt2736] = arg0;
		if (++this.anInt2736 >= 3) {
			this.anInt2736 = 0;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "gz", descriptor = "(III)V", line = 420)
	@Override
	public void method20686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aLong123 == 0L) {
			this.method19547(arg1, arg2);
		}
		@Pc(13) long local13 = IDirect3DDevice.GetRenderTarget(this.aLong121, 0);
		if (e.method27715(IDirect3DDevice.StretchRect(this.aLong121, local13, 0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), this.aLong123, this.anInt2899 * 1081362515, this.anInt2903 * -779214253, this.anInt2904 * 406942099, this.anInt2898 * -88050601, 2))) {
		}
		IUnknown.Release(local13);
		IDirect3DDevice.GetRenderTargetData(this.aLong121, this.aLong123, this.aLongArray15[this.anInt2736]);
		@Pc(63) long local63 = IDirect3DDevice.CreateEventQuery(this.aLong121);
		if (e.method27716(IDirect3DEventQuery.Issue(local63))) {
			this.aLongArray13[this.anInt2736] = local63;
		}
		this.anIntArray227[this.anInt2736] = arg0;
		if (++this.anInt2736 >= 3) {
			this.anInt2736 = 0;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ab", descriptor = "()I", line = 435)
	@Override
	public int method20801() {
		if (this.aLongArray13[this.anInt2735] == 0L) {
			return -1;
		} else if (e.method27716(IDirect3DEventQuery.IsSignaled(this.aLongArray13[this.anInt2735]))) {
			return this.anIntArray227[this.anInt2735];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "gw", descriptor = "()I", line = 435)
	@Override
	public int method20651() {
		if (this.aLongArray13[this.anInt2735] == 0L) {
			return -1;
		} else if (e.method27716(IDirect3DEventQuery.IsSignaled(this.aLongArray13[this.anInt2735]))) {
			return this.anIntArray227[this.anInt2735];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "gj", descriptor = "()I", line = 435)
	@Override
	public int method20775() {
		if (this.aLongArray13[this.anInt2735] == 0L) {
			return -1;
		} else if (e.method27716(IDirect3DEventQuery.IsSignaled(this.aLongArray13[this.anInt2735]))) {
			return this.anIntArray227[this.anInt2735];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "gb", descriptor = "()V", line = 440)
	@Override
	public void method20614() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray13[local1] != 0L) {
				IUnknown.Release(this.aLongArray13[local1]);
				this.aLongArray13[local1] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "az", descriptor = "()V", line = 440)
	@Override
	public void method20455() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray13[local1] != 0L) {
				IUnknown.Release(this.aLongArray13[local1]);
				this.aLongArray13[local1] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "hm", descriptor = "()V", line = 440)
	@Override
	public void method20616() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray13[local1] != 0L) {
				IUnknown.Release(this.aLongArray13[local1]);
				this.aLongArray13[local1] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "gi", descriptor = "()V", line = 440)
	@Override
	public void method20615() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray13[local1] != 0L) {
				IUnknown.Release(this.aLongArray13[local1]);
				this.aLongArray13[local1] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "af", descriptor = "(II)J", line = 451)
	@Override
	public long method20457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method19519(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqd", name = "hk", descriptor = "(II)J", line = 451)
	@Override
	public long method20483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method19519(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqd", name = "ha", descriptor = "(II)J", line = 451)
	@Override
	public long method20800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method19519(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqd", name = "hu", descriptor = "(II)J", line = 451)
	@Override
	public long method20619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method19519(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aqd", name = "an", descriptor = "(II[I[I)V", line = 455)
	@Override
	public void method20459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method19519(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "hx", descriptor = "(II[I[I)V", line = 455)
	@Override
	public void method20623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method19519(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "hq", descriptor = "(II[I[I)V", line = 455)
	@Override
	public void method20624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method19519(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "ahg", descriptor = "(II[I[I)J", line = 459)
	long method19519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (this.aLongArray13[this.anInt2735] != 0L) {
			IUnknown.Release(this.aLongArray13[this.anInt2735]);
			this.aLongArray13[this.anInt2735] = 0L;
		}
		this.aByteBuffer7.clear();
		IDirect3DSurface.Download(this.aLongArray15[this.anInt2735], 0, 0, arg0, arg1, arg0 * 4, 0, this.aLong132);
		if (++this.anInt2735 >= 3) {
			this.anInt2735 = 0;
		}
		if (arg2 == null) {
			return this.aLong132;
		} else {
			this.aByteBuffer7.asIntBuffer().get(arg2);
			return 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aih", descriptor = "(II[I[I)J", line = 459)
	long method19563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (this.aLongArray13[this.anInt2735] != 0L) {
			IUnknown.Release(this.aLongArray13[this.anInt2735]);
			this.aLongArray13[this.anInt2735] = 0L;
		}
		this.aByteBuffer7.clear();
		IDirect3DSurface.Download(this.aLongArray15[this.anInt2735], 0, 0, arg0, arg1, arg0 * 4, 0, this.aLong132);
		if (++this.anInt2735 >= 3) {
			this.anInt2735 = 0;
		}
		if (arg2 == null) {
			return this.aLong132;
		} else {
			this.aByteBuffer7.asIntBuffer().get(arg2);
			return 0L;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "hd", descriptor = "(J)V", line = 475)
	@Override
	public void method20622(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!aqd", name = "hb", descriptor = "(J)V", line = 475)
	@Override
	public void method20620(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!aqd", name = "hg", descriptor = "(J)V", line = 475)
	@Override
	public void method20621(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!aqd", name = "ak", descriptor = "(J)V", line = 475)
	@Override
	public void method20458(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!aqd", name = "bl", descriptor = "()V", line = 478)
	@Override
	public void method20425() {
		if (this.aLong123 != 0L) {
			IUnknown.Release(this.aLong123);
			this.aLong123 = 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			if (this.aLongArray13[local13] != 0L) {
				IUnknown.Release(this.aLongArray13[local13]);
				this.aLongArray13[local13] = 0L;
			}
			if (this.aLongArray15[local13] != 0L) {
				IUnknown.Release(this.aLongArray15[local13]);
				this.aLongArray15[local13] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "hr", descriptor = "()V", line = 478)
	@Override
	public void method20626() {
		if (this.aLong123 != 0L) {
			IUnknown.Release(this.aLong123);
			this.aLong123 = 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			if (this.aLongArray13[local13] != 0L) {
				IUnknown.Release(this.aLongArray13[local13]);
				this.aLongArray13[local13] = 0L;
			}
			if (this.aLongArray15[local13] != 0L) {
				IUnknown.Release(this.aLongArray15[local13]);
				this.aLongArray15[local13] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "hf", descriptor = "()V", line = 478)
	@Override
	public void method20794() {
		if (this.aLong123 != 0L) {
			IUnknown.Release(this.aLong123);
			this.aLong123 = 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			if (this.aLongArray13[local13] != 0L) {
				IUnknown.Release(this.aLongArray13[local13]);
				this.aLongArray13[local13] = 0L;
			}
			if (this.aLongArray15[local13] != 0L) {
				IUnknown.Release(this.aLongArray15[local13]);
				this.aLongArray15[local13] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "hh", descriptor = "()V", line = 478)
	@Override
	public void method20461() {
		if (this.aLong123 != 0L) {
			IUnknown.Release(this.aLong123);
			this.aLong123 = 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			if (this.aLongArray13[local13] != 0L) {
				IUnknown.Release(this.aLongArray13[local13]);
				this.aLongArray13[local13] = 0L;
			}
			if (this.aLongArray15[local13] != 0L) {
				IUnknown.Release(this.aLongArray15[local13]);
				this.aLongArray15[local13] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "hs", descriptor = "()V", line = 478)
	@Override
	public void method20627() {
		if (this.aLong123 != 0L) {
			IUnknown.Release(this.aLong123);
			this.aLong123 = 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			if (this.aLongArray13[local13] != 0L) {
				IUnknown.Release(this.aLongArray13[local13]);
				this.aLongArray13[local13] = 0L;
			}
			if (this.aLongArray15[local13] != 0L) {
				IUnknown.Release(this.aLongArray15[local13]);
				this.aLongArray15[local13] = 0L;
			}
		}
		this.anInt2736 = 0;
		this.anInt2735 = 0;
	}

	@OriginalMember(owner = "client!aqd", name = "lw", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;", line = 497)
	@Override
	public Class107 method20436(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqd", name = "lj", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;", line = 497)
	@Override
	public Class107 method20738(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqd", name = "lz", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;", line = 497)
	@Override
	public Class107 method20740(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqd", name = "dl", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;", line = 497)
	@Override
	public Class107 method20734(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aqd", name = "bm", descriptor = "(II)V", line = 501)
	@Override
	public void method20774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		IDirect3DDevice.Clear(this.aLong121, arg0, arg1, 1.0F, 0);
	}

	@OriginalMember(owner = "client!aqd", name = "ir", descriptor = "(II)V", line = 501)
	@Override
	public void method20649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		IDirect3DDevice.Clear(this.aLong121, arg0, arg1, 1.0F, 0);
	}

	@OriginalMember(owner = "client!aqd", name = "sa", descriptor = "()V", line = 505)
	@Override
	void method20925() {
		if (this.aClass112_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong121, this.anInt2929 + this.anInt2925, this.anInt2939 + this.anInt2926, this.anInt2927, this.anInt2928, this.aFloat204, this.aFloat205);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "zu", descriptor = "()V", line = 505)
	@Override
	void method21121() {
		if (this.aClass112_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong121, this.anInt2929 + this.anInt2925, this.anInt2939 + this.anInt2926, this.anInt2927, this.anInt2928, this.aFloat204, this.aFloat205);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ze", descriptor = "()V", line = 505)
	@Override
	void method21122() {
		if (this.aClass112_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong121, this.anInt2929 + this.anInt2925, this.anInt2939 + this.anInt2926, this.anInt2927, this.anInt2928, this.aFloat204, this.aFloat205);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "zv", descriptor = "()V", line = 505)
	@Override
	void method21123() {
		if (this.aClass112_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong121, this.anInt2929 + this.anInt2925, this.anInt2939 + this.anInt2926, this.anInt2927, this.anInt2928, this.aFloat204, this.aFloat205);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "zc", descriptor = "()V", line = 505)
	@Override
	void method20890() {
		if (this.aClass112_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong121, this.anInt2929 + this.anInt2925, this.anInt2939 + this.anInt2926, this.anInt2927, this.anInt2928, this.aFloat204, this.aFloat205);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "zz", descriptor = "()V", line = 509)
	@Override
	void method20923() {
		IDirect3DDevice.SetScissorRect(this.aLong121, this.anInt2929 + this.anInt2921, this.anInt2939 + this.anInt2940, this.anInt2958, this.anInt2930);
	}

	@OriginalMember(owner = "client!aqd", name = "sb", descriptor = "()V", line = 509)
	@Override
	void method20883() {
		IDirect3DDevice.SetScissorRect(this.aLong121, this.anInt2929 + this.anInt2921, this.anInt2939 + this.anInt2940, this.anInt2958, this.anInt2930);
	}

	@OriginalMember(owner = "client!aqd", name = "zp", descriptor = "()V", line = 509)
	@Override
	void method20894() {
		IDirect3DDevice.SetScissorRect(this.aLong121, this.anInt2929 + this.anInt2921, this.anInt2939 + this.anInt2940, this.anInt2958, this.anInt2930);
	}

	@OriginalMember(owner = "client!aqd", name = "zs", descriptor = "()V", line = 509)
	@Override
	void method21160() {
		IDirect3DDevice.SetScissorRect(this.aLong121, this.anInt2929 + this.anInt2921, this.anInt2939 + this.anInt2940, this.anInt2958, this.anInt2930);
	}

	@OriginalMember(owner = "client!aqd", name = "sj", descriptor = "()V", line = 513)
	@Override
	void method20927() {
		IDirect3DDevice.method27710(this.aLong121, 174, this.aBoolean481);
	}

	@OriginalMember(owner = "client!aqd", name = "zl", descriptor = "()V", line = 513)
	@Override
	void method21056() {
		IDirect3DDevice.method27710(this.aLong121, 174, this.aBoolean481);
	}

	@OriginalMember(owner = "client!aqd", name = "zb", descriptor = "()V", line = 513)
	@Override
	void method21256() {
		IDirect3DDevice.method27710(this.aLong121, 174, this.aBoolean481);
	}

	@OriginalMember(owner = "client!aqd", name = "ahh", descriptor = "(J)V", line = 517)
	final void method19555(@OriginalArg(0) long arg0) {
		this.aLong120 = arg0;
		IDirect3DDevice.SetVertexShader(this.aLong121, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "aip", descriptor = "(J)V", line = 517)
	final void method19564(@OriginalArg(0) long arg0) {
		this.aLong120 = arg0;
		IDirect3DDevice.SetVertexShader(this.aLong121, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ahd", descriptor = "(J)V", line = 522)
	final void method19521(@OriginalArg(0) long arg0) {
		IDirect3DDevice.SetPixelShader(this.aLong121, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "aiu", descriptor = "(J)V", line = 522)
	final void method19543(@OriginalArg(0) long arg0) {
		IDirect3DDevice.SetPixelShader(this.aLong121, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "xs", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V", line = 526)
	@Override
	public void method21050(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		IDirect3DDevice.SetTransform(this.aLong121, 256, arg0.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 2, arg1.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 3, arg2.aFloatArray116);
	}

	@OriginalMember(owner = "client!aqd", name = "rn", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V", line = 526)
	@Override
	public void method20895(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		IDirect3DDevice.SetTransform(this.aLong121, 256, arg0.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 2, arg1.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 3, arg2.aFloatArray116);
	}

	@OriginalMember(owner = "client!aqd", name = "xr", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V", line = 526)
	@Override
	public void method21076(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		IDirect3DDevice.SetTransform(this.aLong121, 256, arg0.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 2, arg1.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 3, arg2.aFloatArray116);
	}

	@OriginalMember(owner = "client!aqd", name = "xb", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V", line = 526)
	@Override
	public void method21194(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		IDirect3DDevice.SetTransform(this.aLong121, 256, arg0.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 2, arg1.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 3, arg2.aFloatArray116);
	}

	@OriginalMember(owner = "client!aqd", name = "xe", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V", line = 526)
	@Override
	public void method21079(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		IDirect3DDevice.SetTransform(this.aLong121, 256, arg0.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 2, arg1.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 3, arg2.aFloatArray116);
	}

	@OriginalMember(owner = "client!aqd", name = "xc", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V", line = 526)
	@Override
	public void method21077(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2) {
		IDirect3DDevice.SetTransform(this.aLong121, 256, arg0.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 2, arg1.aFloatArray116);
		IDirect3DDevice.SetTransform(this.aLong121, 3, arg2.aFloatArray116);
	}

	@OriginalMember(owner = "client!aqd", name = "ti", descriptor = "(Lclient!pq;)V", line = 532)
	@Override
	public void method20934(@OriginalArg(0) Class489 arg0) {
		arg0.method29953(this.aClass489_68);
	}

	@OriginalMember(owner = "client!aqd", name = "aai", descriptor = "(Lclient!pq;)V", line = 532)
	@Override
	public void method21143(@OriginalArg(0) Class489 arg0) {
		arg0.method29953(this.aClass489_68);
	}

	@OriginalMember(owner = "client!aqd", name = "aap", descriptor = "(Lclient!pq;)V", line = 532)
	@Override
	public void method21144(@OriginalArg(0) Class489 arg0) {
		arg0.method29953(this.aClass489_68);
	}

	@OriginalMember(owner = "client!aqd", name = "abg", descriptor = "()V", line = 536)
	@Override
	void method21165() {
		IDirect3DDevice.method27710(this.aLong121, 7, this.aBoolean465 && this.aBoolean458);
	}

	@OriginalMember(owner = "client!aqd", name = "abn", descriptor = "()V", line = 536)
	@Override
	void method21166() {
		IDirect3DDevice.method27710(this.aLong121, 7, this.aBoolean465 && this.aBoolean458);
	}

	@OriginalMember(owner = "client!aqd", name = "abj", descriptor = "()V", line = 536)
	@Override
	void method21167() {
		IDirect3DDevice.method27710(this.aLong121, 7, this.aBoolean465 && this.aBoolean458);
	}

	@OriginalMember(owner = "client!aqd", name = "aba", descriptor = "()V", line = 536)
	@Override
	void method21109() {
		IDirect3DDevice.method27710(this.aLong121, 7, this.aBoolean465 && this.aBoolean458);
	}

	@OriginalMember(owner = "client!aqd", name = "tp", descriptor = "()V", line = 536)
	@Override
	void method20944() {
		IDirect3DDevice.method27710(this.aLong121, 7, this.aBoolean465 && this.aBoolean458);
	}

	@OriginalMember(owner = "client!aqd", name = "ahl", descriptor = "()V", line = 540)
	@Override
	void method21293() {
		IDirect3DDevice.method27710(this.aLong121, 14, this.aBoolean463 && this.aBoolean464);
	}

	@OriginalMember(owner = "client!aqd", name = "tv", descriptor = "()V", line = 540)
	@Override
	void method20945() {
		IDirect3DDevice.method27710(this.aLong121, 14, this.aBoolean463 && this.aBoolean464);
	}

	@OriginalMember(owner = "client!aqd", name = "tg", descriptor = "()V", line = 544)
	@Override
	void method21162() {
		if (this.aBoolean462) {
			IDirect3DDevice.method27710(this.aLong121, 137, this.aBoolean466 && !this.aBoolean468);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "abm", descriptor = "()V", line = 544)
	@Override
	void method21172() {
		if (this.aBoolean462) {
			IDirect3DDevice.method27710(this.aLong121, 137, this.aBoolean466 && !this.aBoolean468);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "abp", descriptor = "()V", line = 544)
	@Override
	void method21171() {
		if (this.aBoolean462) {
			IDirect3DDevice.method27710(this.aLong121, 137, this.aBoolean466 && !this.aBoolean468);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "tq", descriptor = "()V", line = 550)
	@Override
	void method20918() {
		if (this.aBoolean462) {
			D3DLIGHT.SetAmbient(this.aLong118, this.aFloat214 * this.aFloat211, this.aFloat210 * this.aFloat211, this.aFloat217 * this.aFloat211, 0.0F);
			this.aBoolean441 = false;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "abx", descriptor = "()V", line = 550)
	@Override
	void method20964() {
		if (this.aBoolean462) {
			D3DLIGHT.SetAmbient(this.aLong118, this.aFloat214 * this.aFloat211, this.aFloat210 * this.aFloat211, this.aFloat217 * this.aFloat211, 0.0F);
			this.aBoolean441 = false;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "tx", descriptor = "()V", line = 557)
	@Override
	void method20949() {
		if (!this.aBoolean462) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean467 ? this.aFloat212 : 0.0F;
		@Pc(19) float local19 = this.aBoolean467 ? -this.aFloat213 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong118, local10 * this.aFloat214, local10 * this.aFloat210, local10 * this.aFloat217, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong122, local19 * this.aFloat214, local19 * this.aFloat210, local19 * this.aFloat217, 0.0F);
		this.aBoolean441 = false;
	}

	@OriginalMember(owner = "client!aqd", name = "abk", descriptor = "()V", line = 557)
	@Override
	void method21174() {
		if (!this.aBoolean462) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean467 ? this.aFloat212 : 0.0F;
		@Pc(19) float local19 = this.aBoolean467 ? -this.aFloat213 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong118, local10 * this.aFloat214, local10 * this.aFloat210, local10 * this.aFloat217, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong122, local19 * this.aFloat214, local19 * this.aFloat210, local19 * this.aFloat217, 0.0F);
		this.aBoolean441 = false;
	}

	@OriginalMember(owner = "client!aqd", name = "aby", descriptor = "()V", line = 557)
	@Override
	void method21175() {
		if (!this.aBoolean462) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean467 ? this.aFloat212 : 0.0F;
		@Pc(19) float local19 = this.aBoolean467 ? -this.aFloat213 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong118, local10 * this.aFloat214, local10 * this.aFloat210, local10 * this.aFloat217, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong122, local19 * this.aFloat214, local19 * this.aFloat210, local19 * this.aFloat217, 0.0F);
		this.aBoolean441 = false;
	}

	@OriginalMember(owner = "client!aqd", name = "tk", descriptor = "()V", line = 567)
	@Override
	void method21236() {
		if (this.aBoolean462) {
			D3DLIGHT.SetDirection(this.aLong118, -this.aFloatArray63[0], -this.aFloatArray63[1], -this.aFloatArray63[2]);
			D3DLIGHT.SetDirection(this.aLong122, -this.aFloatArray61[0], -this.aFloatArray61[1], -this.aFloatArray61[2]);
			this.aBoolean441 = false;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "abe", descriptor = "()V", line = 567)
	@Override
	void method21207() {
		if (this.aBoolean462) {
			D3DLIGHT.SetDirection(this.aLong118, -this.aFloatArray63[0], -this.aFloatArray63[1], -this.aFloatArray63[2]);
			D3DLIGHT.SetDirection(this.aLong122, -this.aFloatArray61[0], -this.aFloatArray61[1], -this.aFloatArray61[2]);
			this.aBoolean441 = false;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "abs", descriptor = "()V", line = 567)
	@Override
	void method21178() {
		if (this.aBoolean462) {
			D3DLIGHT.SetDirection(this.aLong118, -this.aFloatArray63[0], -this.aFloatArray63[1], -this.aFloatArray63[2]);
			D3DLIGHT.SetDirection(this.aLong122, -this.aFloatArray61[0], -this.aFloatArray61[1], -this.aFloatArray61[2]);
			this.aBoolean441 = false;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "abd", descriptor = "()V", line = 567)
	@Override
	void method21176() {
		if (this.aBoolean462) {
			D3DLIGHT.SetDirection(this.aLong118, -this.aFloatArray63[0], -this.aFloatArray63[1], -this.aFloatArray63[2]);
			D3DLIGHT.SetDirection(this.aLong122, -this.aFloatArray61[0], -this.aFloatArray61[1], -this.aFloatArray61[2]);
			this.aBoolean441 = false;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "abt", descriptor = "()V", line = 567)
	@Override
	void method21177() {
		if (this.aBoolean462) {
			D3DLIGHT.SetDirection(this.aLong118, -this.aFloatArray63[0], -this.aFloatArray63[1], -this.aFloatArray63[2]);
			D3DLIGHT.SetDirection(this.aLong122, -this.aFloatArray61[0], -this.aFloatArray61[1], -this.aFloatArray61[2]);
			this.aBoolean441 = false;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "td", descriptor = "()V", line = 575)
	@Override
	void method20952() {
		this.method20949();
		this.method20951();
	}

	@OriginalMember(owner = "client!aqd", name = "ach", descriptor = "()V", line = 575)
	@Override
	void method21184() {
		this.method20949();
		this.method20951();
	}

	@OriginalMember(owner = "client!aqd", name = "acm", descriptor = "()V", line = 575)
	@Override
	void method21181() {
		this.method20949();
		this.method20951();
	}

	@OriginalMember(owner = "client!aqd", name = "ack", descriptor = "()V", line = 575)
	@Override
	void method21180() {
		this.method20949();
		this.method20951();
	}

	@OriginalMember(owner = "client!aqd", name = "act", descriptor = "()V", line = 575)
	@Override
	void method21182() {
		this.method20949();
		this.method20951();
	}

	@OriginalMember(owner = "client!aqd", name = "aci", descriptor = "()V", line = 575)
	@Override
	void method21183() {
		this.method20949();
		this.method20951();
	}

	@OriginalMember(owner = "client!aqd", name = "acb", descriptor = "()V", line = 575)
	@Override
	void method21075() {
		this.method20949();
		this.method20951();
	}

	@OriginalMember(owner = "client!aqd", name = "tl", descriptor = "()V", line = 580)
	@Override
	void method20951() {
		if (!this.aBoolean462 || this.aBoolean441) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong121, 0, false);
		IDirect3DDevice.LightEnable(this.aLong121, 1, false);
		IDirect3DDevice.SetLight(this.aLong121, 0, this.aLong118);
		IDirect3DDevice.SetLight(this.aLong121, 1, this.aLong122);
		IDirect3DDevice.LightEnable(this.aLong121, 0, true);
		IDirect3DDevice.LightEnable(this.aLong121, 1, true);
		this.aBoolean441 = true;
	}

	@OriginalMember(owner = "client!aqd", name = "aca", descriptor = "()V", line = 580)
	@Override
	void method21125() {
		if (!this.aBoolean462 || this.aBoolean441) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong121, 0, false);
		IDirect3DDevice.LightEnable(this.aLong121, 1, false);
		IDirect3DDevice.SetLight(this.aLong121, 0, this.aLong118);
		IDirect3DDevice.SetLight(this.aLong121, 1, this.aLong122);
		IDirect3DDevice.LightEnable(this.aLong121, 0, true);
		IDirect3DDevice.LightEnable(this.aLong121, 1, true);
		this.aBoolean441 = true;
	}

	@OriginalMember(owner = "client!aqd", name = "acd", descriptor = "()V", line = 580)
	@Override
	void method21179() {
		if (!this.aBoolean462 || this.aBoolean441) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong121, 0, false);
		IDirect3DDevice.LightEnable(this.aLong121, 1, false);
		IDirect3DDevice.SetLight(this.aLong121, 0, this.aLong118);
		IDirect3DDevice.SetLight(this.aLong121, 1, this.aLong122);
		IDirect3DDevice.LightEnable(this.aLong121, 0, true);
		IDirect3DDevice.LightEnable(this.aLong121, 1, true);
		this.aBoolean441 = true;
	}

	@OriginalMember(owner = "client!aqd", name = "um", descriptor = "()V", line = 594)
	@Override
	void method20953() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2934; local1++) {
			@Pc(10) Class93_Sub16 local10 = this.aClass93_Sub16Array19[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method13539();
			@Pc(24) float local24 = local10.method13525() / 255.0F;
			D3DLIGHT.SetPosition(this.aLong119, (float) local10.method13520(), (float) local10.method13521(), (float) local10.method13522());
			D3DLIGHT.SetDiffuse(this.aLong119, (float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong119, 0.0F, 0.0F, 1.0F / (float) (local10.method13523() * local10.method13523()));
			D3DLIGHT.SetRange(this.aLong119, (float) local10.method13523());
			IDirect3DDevice.SetLight(this.aLong121, local14, this.aLong119);
			IDirect3DDevice.LightEnable(this.aLong121, local14, true);
		}
		while (local1 < this.anInt2933) {
			IDirect3DDevice.LightEnable(this.aLong121, local1 + 2, false);
			local1++;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "acu", descriptor = "()V", line = 594)
	@Override
	void method21190() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2934; local1++) {
			@Pc(10) Class93_Sub16 local10 = this.aClass93_Sub16Array19[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method13539();
			@Pc(24) float local24 = local10.method13525() / 255.0F;
			D3DLIGHT.SetPosition(this.aLong119, (float) local10.method13520(), (float) local10.method13521(), (float) local10.method13522());
			D3DLIGHT.SetDiffuse(this.aLong119, (float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong119, 0.0F, 0.0F, 1.0F / (float) (local10.method13523() * local10.method13523()));
			D3DLIGHT.SetRange(this.aLong119, (float) local10.method13523());
			IDirect3DDevice.SetLight(this.aLong121, local14, this.aLong119);
			IDirect3DDevice.LightEnable(this.aLong121, local14, true);
		}
		while (local1 < this.anInt2933) {
			IDirect3DDevice.LightEnable(this.aLong121, local1 + 2, false);
			local1++;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "acg", descriptor = "()V", line = 594)
	@Override
	void method20968() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2934; local1++) {
			@Pc(10) Class93_Sub16 local10 = this.aClass93_Sub16Array19[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method13539();
			@Pc(24) float local24 = local10.method13525() / 255.0F;
			D3DLIGHT.SetPosition(this.aLong119, (float) local10.method13520(), (float) local10.method13521(), (float) local10.method13522());
			D3DLIGHT.SetDiffuse(this.aLong119, (float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong119, 0.0F, 0.0F, 1.0F / (float) (local10.method13523() * local10.method13523()));
			D3DLIGHT.SetRange(this.aLong119, (float) local10.method13523());
			IDirect3DDevice.SetLight(this.aLong121, local14, this.aLong119);
			IDirect3DDevice.LightEnable(this.aLong121, local14, true);
		}
		while (local1 < this.anInt2933) {
			IDirect3DDevice.LightEnable(this.aLong121, local1 + 2, false);
			local1++;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "uq", descriptor = "(Lclient!ck;Lclient!dg;)Z", line = 613)
	@Override
	boolean method20954(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return e.method27716(IDirect3D.GetAdapterDisplayMode(this.aLong117, this.anInt2731, local3)) && e.method27716(IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, local3.Format, 0, 3, method19534(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqd", name = "acz", descriptor = "(Lclient!ck;Lclient!dg;)Z", line = 613)
	@Override
	boolean method21191(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return e.method27716(IDirect3D.GetAdapterDisplayMode(this.aLong117, this.anInt2731, local3)) && e.method27716(IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, local3.Format, 0, 3, method19534(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqd", name = "acp", descriptor = "(Lclient!ck;Lclient!dg;)Z", line = 618)
	@Override
	boolean method21192(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return e.method27716(IDirect3D.GetAdapterDisplayMode(this.aLong117, this.anInt2731, local3)) && e.method27716(IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, local3.Format, 0, 4, method19534(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqd", name = "acq", descriptor = "(Lclient!ck;Lclient!dg;)Z", line = 618)
	@Override
	boolean method21193(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return e.method27716(IDirect3D.GetAdapterDisplayMode(this.aLong117, this.anInt2731, local3)) && e.method27716(IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, local3.Format, 0, 4, method19534(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqd", name = "acr", descriptor = "(Lclient!ck;Lclient!dg;)Z", line = 618)
	@Override
	boolean method21259(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return e.method27716(IDirect3D.GetAdapterDisplayMode(this.aLong117, this.anInt2731, local3)) && e.method27716(IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, local3.Format, 0, 4, method19534(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqd", name = "uc", descriptor = "(Lclient!ck;Lclient!dg;)Z", line = 618)
	@Override
	boolean method21218(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return e.method27716(IDirect3D.GetAdapterDisplayMode(this.aLong117, this.anInt2731, local3)) && e.method27716(IDirect3D.CheckDeviceFormat(this.aLong117, this.anInt2731, this.anInt2730, local3.Format, 0, 4, method19534(arg0, arg1)));
	}

	@OriginalMember(owner = "client!aqd", name = "ada", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!lz;", line = 623)
	@Override
	Interface38 method21205(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "adh", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!lz;", line = 623)
	@Override
	Interface38 method21206(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "uz", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!lz;", line = 623)
	@Override
	Interface38 method20958(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "adz", descriptor = "(IIZ[III)Lclient!lz;", line = 627)
	@Override
	Interface38 method21209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqd", name = "uj", descriptor = "(IIZ[III)Lclient!lz;", line = 627)
	@Override
	Interface38 method20961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqd", name = "ads", descriptor = "(IIZ[III)Lclient!lz;", line = 627)
	@Override
	Interface38 method21066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqd", name = "adg", descriptor = "(IIZ[III)Lclient!lz;", line = 627)
	@Override
	Interface38 method21246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqd", name = "adb", descriptor = "(Lclient!ck;IIZ[BII)Lclient!lz;", line = 631)
	@Override
	Interface38 method21025(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqd", name = "ug", descriptor = "(Lclient!ck;IIZ[BII)Lclient!lz;", line = 631)
	@Override
	Interface38 method20903(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqd", name = "adi", descriptor = "(Lclient!ck;IIZ[BII)Lclient!lz;", line = 631)
	@Override
	Interface38 method21244(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqd", name = "ub", descriptor = "(Lclient!ck;IIZ[FII)Lclient!lz;", line = 635)
	@Override
	Interface38 method20960(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqd", name = "ahv", descriptor = "(Lclient!ck;IIZ[FII)Lclient!lz;", line = 635)
	@Override
	Interface38 method21187(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqd", name = "ahf", descriptor = "(Lclient!ck;IIZ[FII)Lclient!lz;", line = 635)
	@Override
	Interface38 method21294(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class135_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aqd", name = "uy", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!mo;", line = 639)
	@Override
	Interface42 method21017(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class135_Sub3_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "ade", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!mo;", line = 639)
	@Override
	Interface42 method21214(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class135_Sub3_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "adf", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!mo;", line = 639)
	@Override
	Interface42 method21023(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class135_Sub3_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aqd", name = "ut", descriptor = "(IZ[[I)Lclient!mr;", line = 643)
	@Override
	Interface44 method20962(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class135_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "adn", descriptor = "(IZ[[I)Lclient!mr;", line = 643)
	@Override
	Interface44 method21211(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class135_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "adk", descriptor = "(IZ[[I)Lclient!mr;", line = 643)
	@Override
	Interface44 method21055(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class135_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "ado", descriptor = "(IZ[[I)Lclient!mr;", line = 643)
	@Override
	Interface44 method21213(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class135_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "adr", descriptor = "(Lclient!ck;IIIZ[B)Lclient!ll;", line = 647)
	@Override
	Interface35 method21078(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class135_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqd", name = "uk", descriptor = "(Lclient!ck;IIIZ[B)Lclient!ll;", line = 647)
	@Override
	Interface35 method21126(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class135_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqd", name = "ahn", descriptor = "(Lclient!op;)V", line = 651)
	final void method19524(@OriginalArg(0) Class135 arg0) {
		IDirect3DDevice.SetTexture(this.aLong121, this.anInt2949, arg0.method11329());
		if (this.aBoolean462 && !this.aBooleanArray17[this.anInt2949]) {
			this.aBooleanArray17[this.anInt2949] = true;
			this.method20980();
			this.method21185();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aib", descriptor = "(Lclient!op;)V", line = 651)
	final void method19551(@OriginalArg(0) Class135 arg0) {
		IDirect3DDevice.SetTexture(this.aLong121, this.anInt2949, arg0.method11329());
		if (this.aBoolean462 && !this.aBooleanArray17[this.anInt2949]) {
			this.aBooleanArray17[this.anInt2949] = true;
			this.method20980();
			this.method21185();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ain", descriptor = "(Lclient!op;)V", line = 651)
	final void method19574(@OriginalArg(0) Class135 arg0) {
		IDirect3DDevice.SetTexture(this.aLong121, this.anInt2949, arg0.method11329());
		if (this.aBoolean462 && !this.aBooleanArray17[this.anInt2949]) {
			this.aBooleanArray17[this.anInt2949] = true;
			this.method20980();
			this.method21185();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aja", descriptor = "(Lclient!aiy;)V", line = 660)
	final void method19516(@OriginalArg(0) Class135_Sub3 arg0) {
		this.method19524(arg0);
		if (this.aBooleanArray14[this.anInt2949] != arg0.aBoolean253) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, arg0.aBoolean253 ? 1 : 3);
			this.aBooleanArray14[this.anInt2949] = arg0.aBoolean253;
		}
		if (this.aBooleanArray15[this.anInt2949] != arg0.aBoolean254) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, arg0.aBoolean254 ? 1 : 3);
			this.aBooleanArray15[this.anInt2949] = arg0.aBoolean254;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahp", descriptor = "(Lclient!aiy;)V", line = 660)
	final void method19525(@OriginalArg(0) Class135_Sub3 arg0) {
		this.method19524(arg0);
		if (this.aBooleanArray14[this.anInt2949] != arg0.aBoolean253) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, arg0.aBoolean253 ? 1 : 3);
			this.aBooleanArray14[this.anInt2949] = arg0.aBoolean253;
		}
		if (this.aBooleanArray15[this.anInt2949] != arg0.aBoolean254) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, arg0.aBoolean254 ? 1 : 3);
			this.aBooleanArray15[this.anInt2949] = arg0.aBoolean254;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aiv", descriptor = "(Lclient!aiy;)V", line = 660)
	final void method19531(@OriginalArg(0) Class135_Sub3 arg0) {
		this.method19524(arg0);
		if (this.aBooleanArray14[this.anInt2949] != arg0.aBoolean253) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, arg0.aBoolean253 ? 1 : 3);
			this.aBooleanArray14[this.anInt2949] = arg0.aBoolean253;
		}
		if (this.aBooleanArray15[this.anInt2949] != arg0.aBoolean254) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, arg0.aBoolean254 ? 1 : 3);
			this.aBooleanArray15[this.anInt2949] = arg0.aBoolean254;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahe", descriptor = "(Lclient!ahy;)V", line = 672)
	final void method19526(@OriginalArg(0) Class135_Sub1 arg0) {
		this.method19524(arg0);
		if (!this.aBooleanArray14[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, 1);
			this.aBooleanArray14[this.anInt2949] = true;
		}
		if (!this.aBooleanArray15[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, 1);
			this.aBooleanArray15[this.anInt2949] = true;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajp", descriptor = "(Lclient!ahy;)V", line = 672)
	final void method19527(@OriginalArg(0) Class135_Sub1 arg0) {
		this.method19524(arg0);
		if (!this.aBooleanArray14[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, 1);
			this.aBooleanArray14[this.anInt2949] = true;
		}
		if (!this.aBooleanArray15[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, 1);
			this.aBooleanArray15[this.anInt2949] = true;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajy", descriptor = "(Lclient!ahy;)V", line = 672)
	final void method19567(@OriginalArg(0) Class135_Sub1 arg0) {
		this.method19524(arg0);
		if (!this.aBooleanArray14[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, 1);
			this.aBooleanArray14[this.anInt2949] = true;
		}
		if (!this.aBooleanArray15[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, 1);
			this.aBooleanArray15[this.anInt2949] = true;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajs", descriptor = "(Lclient!ahy;)V", line = 672)
	final void method19568(@OriginalArg(0) Class135_Sub1 arg0) {
		this.method19524(arg0);
		if (!this.aBooleanArray14[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, 1);
			this.aBooleanArray14[this.anInt2949] = true;
		}
		if (!this.aBooleanArray15[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, 1);
			this.aBooleanArray15[this.anInt2949] = true;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajv", descriptor = "(Lclient!ahy;)V", line = 672)
	final void method19569(@OriginalArg(0) Class135_Sub1 arg0) {
		this.method19524(arg0);
		if (!this.aBooleanArray14[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, 1);
			this.aBooleanArray14[this.anInt2949] = true;
		}
		if (!this.aBooleanArray15[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, 1);
			this.aBooleanArray15[this.anInt2949] = true;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajk", descriptor = "(Lclient!ahy;)V", line = 672)
	final void method19570(@OriginalArg(0) Class135_Sub1 arg0) {
		this.method19524(arg0);
		if (!this.aBooleanArray14[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 1, 1);
			this.aBooleanArray14[this.anInt2949] = true;
		}
		if (!this.aBooleanArray15[this.anInt2949]) {
			IDirect3DDevice.SetSamplerState(this.aLong121, this.anInt2949, 2, 1);
			this.aBooleanArray15[this.anInt2949] = true;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ud", descriptor = "()V", line = 684)
	@Override
	public void method21019() {
		if (this.aBooleanArray17[this.anInt2949]) {
			this.aBooleanArray17[this.anInt2949] = false;
			IDirect3DDevice.SetTexture(this.aLong121, this.anInt2949, 0L);
			this.method20980();
			this.method21185();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "adq", descriptor = "()V", line = 684)
	@Override
	public void method20988() {
		if (this.aBooleanArray17[this.anInt2949]) {
			this.aBooleanArray17[this.anInt2949] = false;
			IDirect3DDevice.SetTexture(this.aLong121, this.anInt2949, 0L);
			this.method20980();
			this.method21185();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aef", descriptor = "()V", line = 693)
	@Override
	void method21054() {
		if (this.aLong120 != 0L || this.aClass425Array3[this.anInt2949] == Class425.aClass425_3) {
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 24, 0);
			this.anIntArray226[this.anInt2949] = 0;
			return;
		}
		if (this.aClass425Array3[this.anInt2949] == Class425.aClass425_1) {
			IDirect3DDevice.SetTransform(this.aLong121, this.anInt2949 + 16, this.aClass489Array5[this.anInt2949].method29871(this.aFloatArray50));
		} else {
			IDirect3DDevice.SetTransform(this.aLong121, this.anInt2949 + 16, this.aClass489Array5[this.anInt2949].method29827(this.aFloatArray50));
		}
		@Pc(58) int local58 = method19529(this.aClass425Array3[this.anInt2949]);
		if (local58 != this.anIntArray226[this.anInt2949]) {
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 24, local58);
			this.anIntArray226[this.anInt2949] = local58;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aej", descriptor = "()V", line = 693)
	@Override
	void method21238() {
		if (this.aLong120 != 0L || this.aClass425Array3[this.anInt2949] == Class425.aClass425_3) {
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 24, 0);
			this.anIntArray226[this.anInt2949] = 0;
			return;
		}
		if (this.aClass425Array3[this.anInt2949] == Class425.aClass425_1) {
			IDirect3DDevice.SetTransform(this.aLong121, this.anInt2949 + 16, this.aClass489Array5[this.anInt2949].method29871(this.aFloatArray50));
		} else {
			IDirect3DDevice.SetTransform(this.aLong121, this.anInt2949 + 16, this.aClass489Array5[this.anInt2949].method29827(this.aFloatArray50));
		}
		@Pc(58) int local58 = method19529(this.aClass425Array3[this.anInt2949]);
		if (local58 != this.anIntArray226[this.anInt2949]) {
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 24, local58);
			this.anIntArray226[this.anInt2949] = local58;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vo", descriptor = "()V", line = 693)
	@Override
	void method20978() {
		if (this.aLong120 != 0L || this.aClass425Array3[this.anInt2949] == Class425.aClass425_3) {
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 24, 0);
			this.anIntArray226[this.anInt2949] = 0;
			return;
		}
		if (this.aClass425Array3[this.anInt2949] == Class425.aClass425_1) {
			IDirect3DDevice.SetTransform(this.aLong121, this.anInt2949 + 16, this.aClass489Array5[this.anInt2949].method29871(this.aFloatArray50));
		} else {
			IDirect3DDevice.SetTransform(this.aLong121, this.anInt2949 + 16, this.aClass489Array5[this.anInt2949].method29827(this.aFloatArray50));
		}
		@Pc(58) int local58 = method19529(this.aClass425Array3[this.anInt2949]);
		if (local58 != this.anIntArray226[this.anInt2949]) {
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 24, local58);
			this.anIntArray226[this.anInt2949] = local58;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aea", descriptor = "()V", line = 708)
	@Override
	void method21239() {
	}

	@OriginalMember(owner = "client!aqd", name = "aee", descriptor = "()V", line = 708)
	@Override
	void method21241() {
	}

	@OriginalMember(owner = "client!aqd", name = "vv", descriptor = "()V", line = 708)
	@Override
	void method20979() {
	}

	@OriginalMember(owner = "client!aqd", name = "aed", descriptor = "()V", line = 708)
	@Override
	void method21240() {
	}

	@OriginalMember(owner = "client!aqd", name = "aep", descriptor = "()V", line = 711)
	@Override
	void method20975() {
		if (this.aBoolean462) {
			@Pc(17) int local17 = this.aBooleanArray17[this.anInt2949] ? method19550(this.aClass421Array5[this.anInt2949]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 1, local17);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vw", descriptor = "()V", line = 711)
	@Override
	void method21185() {
		if (this.aBoolean462) {
			@Pc(17) int local17 = this.aBooleanArray17[this.anInt2949] ? method19550(this.aClass421Array5[this.anInt2949]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 1, local17);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aek", descriptor = "()V", line = 711)
	@Override
	void method21242() {
		if (this.aBoolean462) {
			@Pc(17) int local17 = this.aBooleanArray17[this.anInt2949] ? method19550(this.aClass421Array5[this.anInt2949]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 1, local17);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aem", descriptor = "()V", line = 711)
	@Override
	void method21243() {
		if (this.aBoolean462) {
			@Pc(17) int local17 = this.aBooleanArray17[this.anInt2949] ? method19550(this.aClass421Array5[this.anInt2949]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 1, local17);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aeq", descriptor = "()V", line = 718)
	@Override
	void method21235() {
		if (this.aBoolean462) {
			@Pc(17) int local17 = this.aBooleanArray17[this.anInt2949] ? method19550(this.aClass421Array6[this.anInt2949]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 4, local17);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vt", descriptor = "()V", line = 718)
	@Override
	void method20980() {
		if (this.aBoolean462) {
			@Pc(17) int local17 = this.aBooleanArray17[this.anInt2949] ? method19550(this.aClass421Array6[this.anInt2949]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 4, local17);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "afq", descriptor = "()V", line = 718)
	@Override
	void method20946() {
		if (this.aBoolean462) {
			@Pc(17) int local17 = this.aBooleanArray17[this.anInt2949] ? method19550(this.aClass421Array6[this.anInt2949]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, 4, local17);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ur", descriptor = "(ILclient!mn;ZZ)V", line = 725)
	@Override
	final void method20959(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!this.aBoolean462) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, local8, method19522(arg1) | local4);
	}

	@OriginalMember(owner = "client!aqd", name = "aen", descriptor = "(ILclient!mn;ZZ)V", line = 725)
	@Override
	final void method21227(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!this.aBoolean462) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, local8, method19522(arg1) | local4);
	}

	@OriginalMember(owner = "client!aqd", name = "uo", descriptor = "(ILclient!mn;Z)V", line = 746)
	@Override
	final void method20971(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean462) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, local8, method19522(arg1) | local4);
	}

	@OriginalMember(owner = "client!aqd", name = "aes", descriptor = "(ILclient!mn;Z)V", line = 746)
	@Override
	final void method21229(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean462) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, local8, method19522(arg1) | local4);
	}

	@OriginalMember(owner = "client!aqd", name = "aer", descriptor = "(ILclient!mn;Z)V", line = 746)
	@Override
	final void method21169(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean462) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong121, this.anInt2949, local8, method19522(arg1) | local4);
	}

	@OriginalMember(owner = "client!aqd", name = "vr", descriptor = "()V", line = 766)
	@Override
	final void method20977() {
		if (this.aBoolean462) {
			IDirect3DDevice.SetRenderState(this.aLong121, 60, this.anInt2945);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aeg", descriptor = "()V", line = 766)
	@Override
	final void method21152() {
		if (this.aBoolean462) {
			IDirect3DDevice.SetRenderState(this.aLong121, 60, this.anInt2945);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ael", descriptor = "()V", line = 766)
	@Override
	final void method20990() {
		if (this.aBoolean462) {
			IDirect3DDevice.SetRenderState(this.aLong121, 60, this.anInt2945);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aei", descriptor = "()V", line = 766)
	@Override
	final void method21237() {
		if (this.aBoolean462) {
			IDirect3DDevice.SetRenderState(this.aLong121, 60, this.anInt2945);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahs", descriptor = "(Lclient!mk;)I", line = 772)
	static final int method19550(@OriginalArg(0) Class421 arg0) {
		switch(arg0.anInt4771) {
			case 0:
				return 10;
			case 1:
				return 7;
			case 2:
				return 26;
			case 3:
				return 2;
			case 4:
				return 4;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajg", descriptor = "(Lclient!mk;)I", line = 772)
	static final int method19553(@OriginalArg(0) Class421 arg0) {
		switch(arg0.anInt4771) {
			case 0:
				return 10;
			case 1:
				return 7;
			case 2:
				return 26;
			case 3:
				return 2;
			case 4:
				return 4;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajh", descriptor = "(Lclient!mk;)I", line = 772)
	static final int method19571(@OriginalArg(0) Class421 arg0) {
		switch(arg0.anInt4771) {
			case 0:
				return 10;
			case 1:
				return 7;
			case 2:
				return 26;
			case 3:
				return 2;
			case 4:
				return 4;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajj", descriptor = "(Lclient!mk;)I", line = 772)
	static final int method19572(@OriginalArg(0) Class421 arg0) {
		switch(arg0.anInt4771) {
			case 0:
				return 10;
			case 1:
				return 7;
			case 2:
				return 26;
			case 3:
				return 2;
			case 4:
				return 4;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aht", descriptor = "(Lclient!mn;)I", line = 789)
	static final int method19522(@OriginalArg(0) Class422 arg0) {
		switch(arg0.anInt4772) {
			case 0:
				return 1;
			case 1:
				return 2;
			case 2:
				return 3;
			case 3:
				return 0;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajb", descriptor = "(Lclient!mn;)I", line = 789)
	static final int method19537(@OriginalArg(0) Class422 arg0) {
		switch(arg0.anInt4772) {
			case 0:
				return 1;
			case 1:
				return 2;
			case 2:
				return 3;
			case 3:
				return 0;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajq", descriptor = "(Lclient!mn;)I", line = 789)
	static final int method19545(@OriginalArg(0) Class422 arg0) {
		switch(arg0.anInt4772) {
			case 0:
				return 1;
			case 1:
				return 2;
			case 2:
				return 3;
			case 3:
				return 0;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajz", descriptor = "(Lclient!mn;)I", line = 789)
	static final int method19573(@OriginalArg(0) Class422 arg0) {
		switch(arg0.anInt4772) {
			case 0:
				return 1;
			case 1:
				return 2;
			case 2:
				return 3;
			case 3:
				return 0;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahi", descriptor = "(Lclient!mv;)I", line = 804)
	static final int method19529(@OriginalArg(0) Class425 arg0) {
		switch(arg0.anInt4774) {
			case 0:
				return 2;
			case 1:
				return 3;
			case 2:
				return 4;
			case 3:
				return 1;
			case 4:
				return 256;
			default:
				return 0;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajn", descriptor = "(Lclient!mv;)I", line = 804)
	static final int method19541(@OriginalArg(0) Class425 arg0) {
		switch(arg0.anInt4774) {
			case 0:
				return 2;
			case 1:
				return 3;
			case 2:
				return 4;
			case 3:
				return 1;
			case 4:
				return 256;
			default:
				return 0;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aju", descriptor = "(Lclient!mv;)I", line = 804)
	static final int method19576(@OriginalArg(0) Class425 arg0) {
		switch(arg0.anInt4774) {
			case 0:
				return 2;
			case 1:
				return 3;
			case 2:
				return 4;
			case 3:
				return 1;
			case 4:
				return 256;
			default:
				return 0;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajd", descriptor = "(Lclient!mv;)I", line = 804)
	static final int method19577(@OriginalArg(0) Class425 arg0) {
		switch(arg0.anInt4774) {
			case 0:
				return 2;
			case 1:
				return 3;
			case 2:
				return 4;
			case 3:
				return 1;
			case 4:
				return 256;
			default:
				return 0;
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vy", descriptor = "(I)V", line = 821)
	@Override
	void method20985(@OriginalArg(0) int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong121, 168, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ahr", descriptor = "(I)V", line = 821)
	@Override
	void method20947(@OriginalArg(0) int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong121, 168, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ahk", descriptor = "(I)V", line = 821)
	@Override
	void method21045(@OriginalArg(0) int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong121, 168, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ahq", descriptor = "(I)V", line = 821)
	@Override
	void method21297(@OriginalArg(0) int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong121, 168, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ve", descriptor = "()V", line = 825)
	@Override
	void method20986() {
		IDirect3DDevice.method27710(this.aLong121, 15, this.aBoolean461);
		IDirect3DDevice.SetRenderState(this.aLong121, 24, this.aByte76 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.MultiSampleType <= 0) {
			return;
		}
		if (this.aBoolean461 && this.aByte76 != 0) {
			if (this.aBoolean434) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21010('S', 'S', 'A', 'A'));
			} else if (this.aBoolean437) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21010('A', 'T', 'O', 'C'));
			} else if (this.aBoolean438) {
				IDirect3DDevice.SetRenderState(this.aLong121, 154, method21010('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean434 || this.aBoolean437) {
			IDirect3DDevice.SetRenderState(this.aLong121, 181, 0);
		} else if (this.aBoolean438) {
			IDirect3DDevice.method27709(this.aLong121, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "afg", descriptor = "()V", line = 825)
	@Override
	void method21251() {
		IDirect3DDevice.method27710(this.aLong121, 15, this.aBoolean461);
		IDirect3DDevice.SetRenderState(this.aLong121, 24, this.aByte76 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.MultiSampleType <= 0) {
			return;
		}
		if (this.aBoolean461 && this.aByte76 != 0) {
			if (this.aBoolean434) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21010('S', 'S', 'A', 'A'));
			} else if (this.aBoolean437) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21010('A', 'T', 'O', 'C'));
			} else if (this.aBoolean438) {
				IDirect3DDevice.SetRenderState(this.aLong121, 154, method21010('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean434 || this.aBoolean437) {
			IDirect3DDevice.SetRenderState(this.aLong121, 181, 0);
		} else if (this.aBoolean438) {
			IDirect3DDevice.method27709(this.aLong121, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "afe", descriptor = "()V", line = 825)
	@Override
	void method21249() {
		IDirect3DDevice.method27710(this.aLong121, 15, this.aBoolean461);
		IDirect3DDevice.SetRenderState(this.aLong121, 24, this.aByte76 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.MultiSampleType <= 0) {
			return;
		}
		if (this.aBoolean461 && this.aByte76 != 0) {
			if (this.aBoolean434) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21010('S', 'S', 'A', 'A'));
			} else if (this.aBoolean437) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21010('A', 'T', 'O', 'C'));
			} else if (this.aBoolean438) {
				IDirect3DDevice.SetRenderState(this.aLong121, 154, method21010('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean434 || this.aBoolean437) {
			IDirect3DDevice.SetRenderState(this.aLong121, 181, 0);
		} else if (this.aBoolean438) {
			IDirect3DDevice.method27709(this.aLong121, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "afm", descriptor = "()V", line = 825)
	@Override
	void method21250() {
		IDirect3DDevice.method27710(this.aLong121, 15, this.aBoolean461);
		IDirect3DDevice.SetRenderState(this.aLong121, 24, this.aByte76 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.MultiSampleType <= 0) {
			return;
		}
		if (this.aBoolean461 && this.aByte76 != 0) {
			if (this.aBoolean434) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21010('S', 'S', 'A', 'A'));
			} else if (this.aBoolean437) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21010('A', 'T', 'O', 'C'));
			} else if (this.aBoolean438) {
				IDirect3DDevice.SetRenderState(this.aLong121, 154, method21010('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean434 || this.aBoolean437) {
			IDirect3DDevice.SetRenderState(this.aLong121, 181, 0);
		} else if (this.aBoolean438) {
			IDirect3DDevice.method27709(this.aLong121, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "afa", descriptor = "()V", line = 825)
	@Override
	void method21001() {
		IDirect3DDevice.method27710(this.aLong121, 15, this.aBoolean461);
		IDirect3DDevice.SetRenderState(this.aLong121, 24, this.aByte76 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.MultiSampleType <= 0) {
			return;
		}
		if (this.aBoolean461 && this.aByte76 != 0) {
			if (this.aBoolean434) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21010('S', 'S', 'A', 'A'));
			} else if (this.aBoolean437) {
				IDirect3DDevice.SetRenderState(this.aLong121, 181, method21010('A', 'T', 'O', 'C'));
			} else if (this.aBoolean438) {
				IDirect3DDevice.SetRenderState(this.aLong121, 154, method21010('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean434 || this.aBoolean437) {
			IDirect3DDevice.SetRenderState(this.aLong121, 181, 0);
		} else if (this.aBoolean438) {
			IDirect3DDevice.method27709(this.aLong121, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vm", descriptor = "()V", line = 841)
	@Override
	void method20987() {
		switch(this.aClass415_3.anInt4761) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 6);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 2);
		}
		switch(this.anInt2948) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 2);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "afr", descriptor = "()V", line = 841)
	@Override
	void method21255() {
		switch(this.aClass415_3.anInt4761) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 6);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 2);
		}
		switch(this.anInt2948) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 2);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "afc", descriptor = "()V", line = 841)
	@Override
	void method21253() {
		switch(this.aClass415_3.anInt4761) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 6);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 2);
		}
		switch(this.anInt2948) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 2);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "afb", descriptor = "()V", line = 841)
	@Override
	void method21254() {
		switch(this.aClass415_3.anInt4761) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 6);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong121, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 20, 2);
		}
		switch(this.anInt2948) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong121, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong121, 208, 2);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vg", descriptor = "()V", line = 896)
	@Override
	void method21104() {
		IDirect3DDevice.method27710(this.aLong121, 27, this.aBoolean480);
	}

	@OriginalMember(owner = "client!aqd", name = "afh", descriptor = "()V", line = 896)
	@Override
	void method21036() {
		IDirect3DDevice.method27710(this.aLong121, 27, this.aBoolean480);
	}

	@OriginalMember(owner = "client!aqd", name = "afd", descriptor = "()V", line = 896)
	@Override
	void method21258() {
		IDirect3DDevice.method27710(this.aLong121, 27, this.aBoolean480);
	}

	@OriginalMember(owner = "client!aqd", name = "afw", descriptor = "()V", line = 896)
	@Override
	void method21031() {
		IDirect3DDevice.method27710(this.aLong121, 27, this.aBoolean480);
	}

	@OriginalMember(owner = "client!aqd", name = "afl", descriptor = "()V", line = 896)
	@Override
	void method20992() {
		IDirect3DDevice.method27710(this.aLong121, 27, this.aBoolean480);
	}

	@OriginalMember(owner = "client!aqd", name = "ahy", descriptor = "()V", line = 900)
	void method19530() {
		IDirect3DDevice.SetRenderState(this.aLong121, 22, this.anInt2950);
	}

	@OriginalMember(owner = "client!aqd", name = "aji", descriptor = "()V", line = 900)
	void method19578() {
		IDirect3DDevice.SetRenderState(this.aLong121, 22, this.anInt2950);
	}

	@OriginalMember(owner = "client!aqd", name = "ajc", descriptor = "()V", line = 900)
	void method19579() {
		IDirect3DDevice.SetRenderState(this.aLong121, 22, this.anInt2950);
	}

	@OriginalMember(owner = "client!aqd", name = "aft", descriptor = "()V", line = 904)
	@Override
	void method21265() {
		if (this.aBoolean462) {
			IDirect3DDevice.method27710(this.aLong121, 28, this.aBoolean478 && this.aBoolean477 && this.anInt2947 >= 0);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vz", descriptor = "()V", line = 904)
	@Override
	void method20906() {
		if (this.aBoolean462) {
			IDirect3DDevice.method27710(this.aLong121, 28, this.aBoolean478 && this.aBoolean477 && this.anInt2947 >= 0);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vh", descriptor = "()V", line = 910)
	@Override
	void method21051() {
		this.aFloat209 = this.aFloat208 - (float) this.anInt2956;
		this.aFloat216 = this.aFloat209 - (float) this.anInt2947;
		if (this.aFloat216 < this.aFloat215) {
			this.aFloat216 = this.aFloat215;
		}
		if (this.aBoolean462) {
			IDirect3DDevice.method27709(this.aLong121, 36, this.aFloat216);
			IDirect3DDevice.method27709(this.aLong121, 37, this.aFloat209);
			IDirect3DDevice.SetRenderState(this.aLong121, 34, this.anInt2957);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "afu", descriptor = "()V", line = 910)
	@Override
	void method21264() {
		this.aFloat209 = this.aFloat208 - (float) this.anInt2956;
		this.aFloat216 = this.aFloat209 - (float) this.anInt2947;
		if (this.aFloat216 < this.aFloat215) {
			this.aFloat216 = this.aFloat215;
		}
		if (this.aBoolean462) {
			IDirect3DDevice.method27709(this.aLong121, 36, this.aFloat216);
			IDirect3DDevice.method27709(this.aLong121, 37, this.aFloat209);
			IDirect3DDevice.SetRenderState(this.aLong121, 34, this.anInt2957);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "vj", descriptor = "(Z)V", line = 921)
	@Override
	void method21223(@OriginalArg(0) boolean arg0) {
		IDirect3DDevice.method27710(this.aLong121, 161, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "afn", descriptor = "(Z)V", line = 921)
	@Override
	void method20996(@OriginalArg(0) boolean arg0) {
		IDirect3DDevice.method27710(this.aLong121, 161, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "afj", descriptor = "(Z)V", line = 921)
	@Override
	void method21110(@OriginalArg(0) boolean arg0) {
		IDirect3DDevice.method27710(this.aLong121, 161, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "vc", descriptor = "(Z)Lclient!ml;", line = 925)
	@Override
	final Interface40 method20995(@OriginalArg(0) boolean arg0) {
		return new Class469(this, Class226.aClass226_23, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "afp", descriptor = "(Z)Lclient!ml;", line = 925)
	@Override
	final Interface40 method21267(@OriginalArg(0) boolean arg0) {
		return new Class469(this, Class226.aClass226_23, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "vn", descriptor = "(Z)Lclient!lr;", line = 929)
	@Override
	final Interface37 method21013(@OriginalArg(0) boolean arg0) {
		return new Class465(this, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "agv", descriptor = "(Z)Lclient!lr;", line = 929)
	@Override
	final Interface37 method21029(@OriginalArg(0) boolean arg0) {
		return new Class465(this, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "aga", descriptor = "(Z)Lclient!lr;", line = 929)
	@Override
	final Interface37 method21269(@OriginalArg(0) boolean arg0) {
		return new Class465(this, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "vf", descriptor = "([Lclient!lk;)Lclient!lo;", line = 933)
	@Override
	Class145 method20993(@OriginalArg(0) Class400[] arg0) {
		return new Class145_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "agi", descriptor = "([Lclient!lk;)Lclient!lo;", line = 933)
	@Override
	Class145 method21270(@OriginalArg(0) Class400[] arg0) {
		return new Class145_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "agg", descriptor = "([Lclient!lk;)Lclient!lo;", line = 933)
	@Override
	Class145 method21271(@OriginalArg(0) Class400[] arg0) {
		return new Class145_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "vk", descriptor = "(Lclient!lo;)V", line = 937)
	@Override
	public void method21106(@OriginalArg(0) Class145 arg0) {
		@Pc(2) Class145_Sub2 local2 = (Class145_Sub2) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong121, local2.aLong48);
	}

	@OriginalMember(owner = "client!aqd", name = "agx", descriptor = "(Lclient!lo;)V", line = 937)
	@Override
	public void method21272(@OriginalArg(0) Class145 arg0) {
		@Pc(2) Class145_Sub2 local2 = (Class145_Sub2) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong121, local2.aLong48);
	}

	@OriginalMember(owner = "client!aqd", name = "agj", descriptor = "(Lclient!lo;)V", line = 937)
	@Override
	public void method21273(@OriginalArg(0) Class145 arg0) {
		@Pc(2) Class145_Sub2 local2 = (Class145_Sub2) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong121, local2.aLong48);
	}

	@OriginalMember(owner = "client!aqd", name = "wn", descriptor = "(ILclient!lr;)V", line = 942)
	@Override
	public void method21048(@OriginalArg(0) int arg0, @OriginalArg(1) Interface37 arg1) {
		@Pc(2) Class465 local2 = (Class465) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong121, arg0, local2.aLong279, 0, local2.method29316());
	}

	@OriginalMember(owner = "client!aqd", name = "age", descriptor = "(ILclient!lr;)V", line = 942)
	@Override
	public void method21274(@OriginalArg(0) int arg0, @OriginalArg(1) Interface37 arg1) {
		@Pc(2) Class465 local2 = (Class465) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong121, arg0, local2.aLong279, 0, local2.method29316());
	}

	@OriginalMember(owner = "client!aqd", name = "agk", descriptor = "(ILclient!lr;)V", line = 942)
	@Override
	public void method21275(@OriginalArg(0) int arg0, @OriginalArg(1) Interface37 arg1) {
		@Pc(2) Class465 local2 = (Class465) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong121, arg0, local2.aLong279, 0, local2.method29316());
	}

	@OriginalMember(owner = "client!aqd", name = "wa", descriptor = "(Lclient!ml;)V", line = 947)
	@Override
	void method21030(@OriginalArg(0) Interface40 arg0) {
		IDirect3DDevice.SetIndices(this.aLong121, ((Class469) arg0).aLong280);
	}

	@OriginalMember(owner = "client!aqd", name = "agm", descriptor = "(Lclient!ml;)V", line = 947)
	@Override
	void method21203(@OriginalArg(0) Interface40 arg0) {
		IDirect3DDevice.SetIndices(this.aLong121, ((Class469) arg0).aLong280);
	}

	@OriginalMember(owner = "client!aqd", name = "agz", descriptor = "(Lclient!ms;II)V", line = 951)
	@Override
	public final void method21282(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawPrimitive(this.aLong121, method19552(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "wz", descriptor = "(Lclient!ms;II)V", line = 951)
	@Override
	public final void method21005(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawPrimitive(this.aLong121, method19552(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "agp", descriptor = "(Lclient!ms;II)V", line = 951)
	@Override
	public final void method20998(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawPrimitive(this.aLong121, method19552(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!aqd", name = "wj", descriptor = "(Lclient!ml;Lclient!ms;IIII)V", line = 956)
	@Override
	final void method21006(@OriginalArg(0) Interface40 arg0, @OriginalArg(1) Class424 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong121, ((Class469) arg0).aLong280, 4, 0, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqd", name = "agh", descriptor = "(Lclient!ml;Lclient!ms;IIII)V", line = 956)
	@Override
	final void method21283(@OriginalArg(0) Interface40 arg0, @OriginalArg(1) Class424 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong121, ((Class469) arg0).aLong280, 4, 0, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aqd", name = "we", descriptor = "(Lclient!ms;IIII)V", line = 961)
	@Override
	public final void method21007(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong121, method19552(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aqd", name = "agq", descriptor = "(Lclient!ms;IIII)V", line = 961)
	@Override
	public final void method20942(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong121, method19552(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aqd", name = "agr", descriptor = "(Lclient!ms;IIII)V", line = 961)
	@Override
	public final void method21285(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong121, method19552(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aqd", name = "agt", descriptor = "(Lclient!ms;IIII)V", line = 961)
	@Override
	public final void method21286(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass116_Sub2_2 != null) {
			this.aClass116_Sub2_2.method8497();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong121, method19552(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aqd", name = "air", descriptor = "(Ljava/lang/String;)[B", line = 966)
	byte[] method19532(@OriginalArg(0) String arg0) {
		return this.method20893("dx", arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ajo", descriptor = "(Ljava/lang/String;)[B", line = 966)
	byte[] method19533(@OriginalArg(0) String arg0) {
		return this.method20893("dx", arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ajw", descriptor = "(Ljava/lang/String;)[B", line = 966)
	byte[] method19565(@OriginalArg(0) String arg0) {
		return this.method20893("dx", arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ajt", descriptor = "(Ljava/lang/String;)[B", line = 966)
	byte[] method19580(@OriginalArg(0) String arg0) {
		return this.method20893("dx", arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "xz", descriptor = "(Ljava/lang/String;)Lclient!ho;", line = 970)
	@Override
	public Class115 method21072(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method19532(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class314 local11 = this.method20899(local3);
			return new Class115_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "rc", descriptor = "(Ljava/lang/String;)Lclient!ho;", line = 970)
	@Override
	public Class115 method20892(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method19532(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class314 local11 = this.method20899(local3);
			return new Class115_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "xi", descriptor = "(Ljava/lang/String;)Lclient!ho;", line = 970)
	@Override
	public Class115 method21039(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method19532(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class314 local11 = this.method20899(local3);
			return new Class115_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "en", descriptor = "(I)V", line = 977)
	@Override
	public final synchronized void method20561(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2733; local1++) {
			IUnknown.Release(this.aLongArray14[local1]);
		}
		this.anInt2733 = 0;
		super.method20419(arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "d", descriptor = "(I)V", line = 977)
	@Override
	public final synchronized void method20419(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2733; local1++) {
			IUnknown.Release(this.aLongArray14[local1]);
		}
		this.anInt2733 = 0;
		super.method20419(arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "ajm", descriptor = "(Lclient!ck;Lclient!dg;)I", line = 983)
	static final int method19517(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		switch(arg1.anInt3645 * 2069827685) {
			case 0:
				if (arg0 == Class206.aClass206_22) {
					return 116;
				}
				break;
			case 3:
				if (arg0 == Class206.aClass206_22) {
					return 113;
				}
				break;
			case 7:
				switch(arg0.anInt3388 * 811184495) {
					case 0:
						return 77;
					case 1:
						return m.anInt4351 * -633586647;
					case 2:
						return 22;
					case 3:
						return 51;
					case 4:
						return 21;
					case 5:
					default:
						break;
					case 6:
						return 28;
					case 7:
						return 50;
					case 8:
						return m.anInt4352 * -97527085;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!aqd", name = "aix", descriptor = "(Lclient!ck;Lclient!dg;)I", line = 983)
	static final int method19534(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		switch(arg1.anInt3645 * 2069827685) {
			case 0:
				if (arg0 == Class206.aClass206_22) {
					return 116;
				}
				break;
			case 3:
				if (arg0 == Class206.aClass206_22) {
					return 113;
				}
				break;
			case 7:
				switch(arg0.anInt3388 * 811184495) {
					case 0:
						return 77;
					case 1:
						return m.anInt4351 * -633586647;
					case 2:
						return 22;
					case 3:
						return 51;
					case 4:
						return 21;
					case 5:
					default:
						break;
					case 6:
						return 28;
					case 7:
						return 50;
					case 8:
						return m.anInt4352 * -97527085;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!aqd", name = "aje", descriptor = "(Lclient!ck;Lclient!dg;)I", line = 983)
	static final int method19535(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		switch(arg1.anInt3645 * 2069827685) {
			case 0:
				if (arg0 == Class206.aClass206_22) {
					return 116;
				}
				break;
			case 3:
				if (arg0 == Class206.aClass206_22) {
					return 113;
				}
				break;
			case 7:
				switch(arg0.anInt3388 * 811184495) {
					case 0:
						return 77;
					case 1:
						return m.anInt4351 * -633586647;
					case 2:
						return 22;
					case 3:
						return 51;
					case 4:
						return 21;
					case 5:
					default:
						break;
					case 6:
						return 28;
					case 7:
						return 50;
					case 8:
						return m.anInt4352 * -97527085;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!aqd", name = "ajx", descriptor = "(Lclient!ck;Lclient!dg;)I", line = 983)
	static final int method19581(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		switch(arg1.anInt3645 * 2069827685) {
			case 0:
				if (arg0 == Class206.aClass206_22) {
					return 116;
				}
				break;
			case 3:
				if (arg0 == Class206.aClass206_22) {
					return 113;
				}
				break;
			case 7:
				switch(arg0.anInt3388 * 811184495) {
					case 0:
						return 77;
					case 1:
						return m.anInt4351 * -633586647;
					case 2:
						return 22;
					case 3:
						return 51;
					case 4:
						return 21;
					case 5:
					default:
						break;
					case 6:
						return 28;
					case 7:
						return 50;
					case 8:
						return m.anInt4352 * -97527085;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!aqd", name = "ajf", descriptor = "(Lclient!ck;Lclient!dg;)I", line = 983)
	static final int method19582(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		switch(arg1.anInt3645 * 2069827685) {
			case 0:
				if (arg0 == Class206.aClass206_22) {
					return 116;
				}
				break;
			case 3:
				if (arg0 == Class206.aClass206_22) {
					return 113;
				}
				break;
			case 7:
				switch(arg0.anInt3388 * 811184495) {
					case 0:
						return 77;
					case 1:
						return m.anInt4351 * -633586647;
					case 2:
						return 22;
					case 3:
						return 51;
					case 4:
						return 21;
					case 5:
					default:
						break;
					case 6:
						return 28;
					case 7:
						return 50;
					case 8:
						return m.anInt4352 * -97527085;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!aqd", name = "ait", descriptor = "(Lclient!dg;)I", line = 1025)
	static final int method19558(@OriginalArg(0) Class226 arg0) {
		if (arg0 == Class226.aClass226_23) {
			return 80;
		} else if (arg0 == Class226.aClass226_26) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajl", descriptor = "(Lclient!dg;)I", line = 1025)
	static final int method19583(@OriginalArg(0) Class226 arg0) {
		if (arg0 == Class226.aClass226_23) {
			return 80;
		} else if (arg0 == Class226.aClass226_26) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ajr", descriptor = "(Lclient!dg;)I", line = 1025)
	static final int method19584(@OriginalArg(0) Class226 arg0) {
		if (arg0 == Class226.aClass226_23) {
			return 80;
		} else if (arg0 == Class226.aClass226_26) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqd", name = "akn", descriptor = "(Lclient!dg;)I", line = 1025)
	static final int method19585(@OriginalArg(0) Class226 arg0) {
		if (arg0 == Class226.aClass226_23) {
			return 80;
		} else if (arg0 == Class226.aClass226_26) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ako", descriptor = "(Lclient!dg;)I", line = 1025)
	static final int method19586(@OriginalArg(0) Class226 arg0) {
		if (arg0 == Class226.aClass226_23) {
			return 80;
		} else if (arg0 == Class226.aClass226_26) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqd", name = "aiq", descriptor = "(Lclient!ms;)I", line = 1031)
	static final int method19552(@OriginalArg(0) Class424 arg0) {
		switch(arg0.anInt4773) {
			case 0:
				return 5;
			case 1:
				return 4;
			case 2:
				return 3;
			case 3:
				return 6;
			case 4:
				return 1;
			case 5:
				return 2;
			default:
				throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqd", name = "akz", descriptor = "(Lclient!ms;)I", line = 1031)
	static final int method19587(@OriginalArg(0) Class424 arg0) {
		switch(arg0.anInt4773) {
			case 0:
				return 5;
			case 1:
				return 4;
			case 2:
				return 3;
			case 3:
				return 6;
			case 4:
				return 1;
			case 5:
				return 2;
			default:
				throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aqd", name = "fk", descriptor = "(Z)V", line = 1048)
	@Override
	public void method20587() {
	}

	@OriginalMember(owner = "client!aqd", name = "eh", descriptor = "(Z)V", line = 1048)
	@Override
	public void method20552(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aqd", name = "fh", descriptor = "(Z)V", line = 1048)
	@Override
	public void method20588() {
	}

	@OriginalMember(owner = "client!aqd", name = "fr", descriptor = "(Z)V", line = 1048)
	@Override
	public void method20589() {
	}

	@OriginalMember(owner = "client!aqd", name = "gu", descriptor = "(Z)V", line = 1048)
	@Override
	public void method20590() {
	}

	@OriginalMember(owner = "client!aqd", name = "akf", descriptor = "(IIJILclient!jagdx/D3DDISPLAYMODE;Lclient!jagdx/D3DPRESENT_PARAMETERS;)Z", line = 1051)
	static boolean method19538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) D3DDISPLAYMODE arg4, @OriginalArg(5) D3DPRESENT_PARAMETERS arg5) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			if (e.method27715(IDirect3D.GetAdapterDisplayMode(arg2, arg0, arg4))) {
				return false;
			}
			label76: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(24) int local24 = 0; local24 < anIntArray229.length; local24++) {
						if (IDirect3D.CheckDeviceType(arg2, arg0, arg1, arg4.Format, anIntArray229[local24], true) == 0 && IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 1, 1, anIntArray229[local24]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray229[local24], true, local5) == 0)) {
							for (@Pc(65) int local65 = 0; local65 < anIntArray228.length; local65++) {
								if (IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 2, 1, anIntArray228[local65]) == 0 && IDirect3D.CheckDepthStencilMatch(arg2, arg0, arg1, arg4.Format, anIntArray229[local24], anIntArray228[local65]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray228[local24], true, local5) == 0)) {
									local3 = anIntArray229[local24];
									local1 = anIntArray228[local65];
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

	@OriginalMember(owner = "client!aqd", name = "aii", descriptor = "(IIJILclient!jagdx/D3DDISPLAYMODE;Lclient!jagdx/D3DPRESENT_PARAMETERS;)Z", line = 1051)
	static boolean method19539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) D3DDISPLAYMODE arg4, @OriginalArg(5) D3DPRESENT_PARAMETERS arg5) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			if (e.method27715(IDirect3D.GetAdapterDisplayMode(arg2, arg0, arg4))) {
				return false;
			}
			label76: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(24) int local24 = 0; local24 < anIntArray229.length; local24++) {
						if (IDirect3D.CheckDeviceType(arg2, arg0, arg1, arg4.Format, anIntArray229[local24], true) == 0 && IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 1, 1, anIntArray229[local24]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray229[local24], true, local5) == 0)) {
							for (@Pc(65) int local65 = 0; local65 < anIntArray228.length; local65++) {
								if (IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, arg4.Format, 2, 1, anIntArray228[local65]) == 0 && IDirect3D.CheckDepthStencilMatch(arg2, arg0, arg1, arg4.Format, anIntArray229[local24], anIntArray228[local65]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray228[local24], true, local5) == 0)) {
									local3 = anIntArray229[local24];
									local1 = anIntArray228[local65];
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

	@OriginalMember(owner = "client!aqd", name = "aia", descriptor = "(J)V", line = 1100)
	synchronized void method19546(@OriginalArg(0) long arg0) {
		if (this.anInt2733 == this.anInt2734) {
			this.anInt2734 *= 2;
			@Pc(14) long[] local14 = new long[this.anInt2734];
			System.arraycopy(this.aLongArray14, 0, local14, 0, this.anInt2733);
			this.aLongArray14 = local14;
		}
		this.aLongArray14[this.anInt2733] = arg0;
		this.anInt2733++;
	}

	@OriginalMember(owner = "client!aqd", name = "akq", descriptor = "(J)V", line = 1100)
	synchronized void method19588(@OriginalArg(0) long arg0) {
		if (this.anInt2733 == this.anInt2734) {
			this.anInt2734 *= 2;
			@Pc(14) long[] local14 = new long[this.anInt2734];
			System.arraycopy(this.aLongArray14, 0, local14, 0, this.anInt2733);
			this.aLongArray14 = local14;
		}
		this.aLongArray14[this.anInt2733] = arg0;
		this.anInt2733++;
	}

	@OriginalMember(owner = "client!aqd", name = "wp", descriptor = "(I)V", line = 1111)
	@Override
	void method21009(@OriginalArg(0) int arg0) {
		if (!this.aBoolean440) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong121, 8, local10);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "agy", descriptor = "(I)V", line = 1111)
	@Override
	void method21289(@OriginalArg(0) int arg0) {
		if (!this.aBoolean440) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong121, 8, local10);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahm", descriptor = "(I)V", line = 1111)
	@Override
	void method21284(@OriginalArg(0) int arg0) {
		if (!this.aBoolean440) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong121, 8, local10);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "ahc", descriptor = "(I)V", line = 1111)
	@Override
	void method21291(@OriginalArg(0) int arg0) {
		if (!this.aBoolean440) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong121, 8, local10);
		}
	}

	@OriginalMember(owner = "client!aqd", name = "g", descriptor = "()Ljava/lang/String;", line = 1118)
	@Override
	public String method20431() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2951 + local3;
		@Pc(27) String local27 = local15 + this.anInt2954 + local3;
		@Pc(39) String local39 = local27 + this.anInt2920 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean479 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method20885() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method20886() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean471 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean483 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean435 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean432 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean433 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean436 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean475 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean473 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean485 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean437 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean434 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean460 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean430 ? 1 : 0) + local3;
		return local311 + (this.aBoolean439 ? 1 : 0);
	}

	@OriginalMember(owner = "client!aqd", name = "fl", descriptor = "()Ljava/lang/String;", line = 1118)
	@Override
	public String method20582() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2951 + local3;
		@Pc(27) String local27 = local15 + this.anInt2954 + local3;
		@Pc(39) String local39 = local27 + this.anInt2920 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean479 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method20885() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method20886() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean471 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean483 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean435 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean432 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean433 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean436 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean475 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean473 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean485 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean437 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean434 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean460 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean430 ? 1 : 0) + local3;
		return local311 + (this.aBoolean439 ? 1 : 0);
	}

	@OriginalMember(owner = "client!aqd", name = "fb", descriptor = "()Ljava/lang/String;", line = 1118)
	@Override
	public String method20865() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2951 + local3;
		@Pc(27) String local27 = local15 + this.anInt2954 + local3;
		@Pc(39) String local39 = local27 + this.anInt2920 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean479 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method20885() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method20886() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean471 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean483 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean435 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean432 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean433 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean436 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean475 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean473 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean485 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean437 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean434 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean460 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean430 ? 1 : 0) + local3;
		return local311 + (this.aBoolean439 ? 1 : 0);
	}

	@OriginalMember(owner = "client!aqd", name = "fo", descriptor = "()Ljava/lang/String;", line = 1118)
	@Override
	public String method20584() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2951 + local3;
		@Pc(27) String local27 = local15 + this.anInt2954 + local3;
		@Pc(39) String local39 = local27 + this.anInt2920 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean479 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method20885() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method20886() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean471 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean483 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean435 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean432 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean433 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean436 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean475 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean473 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean485 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean437 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean434 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean460 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean430 ? 1 : 0) + local3;
		return local311 + (this.aBoolean439 ? 1 : 0);
	}

	@OriginalMember(owner = "client!aqd", name = "fy", descriptor = "()Ljava/lang/String;", line = 1118)
	@Override
	public String method20769() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2951 + local3;
		@Pc(27) String local27 = local15 + this.anInt2954 + local3;
		@Pc(39) String local39 = local27 + this.anInt2920 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean479 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method20885() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method20886() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean471 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean483 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean435 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean432 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean433 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean436 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean475 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean473 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean485 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean437 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean434 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean460 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean430 ? 1 : 0) + local3;
		return local311 + (this.aBoolean439 ? 1 : 0);
	}
}
