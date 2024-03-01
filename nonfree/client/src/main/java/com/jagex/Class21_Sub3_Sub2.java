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
import jagdx.g;
import jagdx.p;
import jagdx.u;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akw")
public class Class21_Sub3_Sub2 extends Class21_Sub3 {

	@OriginalMember(owner = "client!akw", name = "id", descriptor = "[I")
	static final int[] anIntArray253 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!akw", name = "il", descriptor = "[I")
	static final int[] anIntArray251 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!akw", name = "hy", descriptor = "Lclient!aci;")
	Class25_Sub1 aClass25_Sub1_2;

	@OriginalMember(owner = "client!akw", name = "hr", descriptor = "J")
	long aLong107;

	@OriginalMember(owner = "client!akw", name = "hl", descriptor = "Z")
	boolean aBoolean457;

	@OriginalMember(owner = "client!akw", name = "gl", descriptor = "J")
	long aLong103 = 0L;

	@OriginalMember(owner = "client!akw", name = "gu", descriptor = "J")
	long aLong104 = 0L;

	@OriginalMember(owner = "client!akw", name = "hi", descriptor = "Lclient!wk;")
	Class553 aClass553_38 = new Class553();

	@OriginalMember(owner = "client!akw", name = "hk", descriptor = "Z")
	boolean aBoolean451 = false;

	@OriginalMember(owner = "client!akw", name = "ha", descriptor = "J")
	long aLong102 = 0L;

	@OriginalMember(owner = "client!akw", name = "hg", descriptor = "J")
	long aLong105 = 0L;

	@OriginalMember(owner = "client!akw", name = "hc", descriptor = "J")
	long aLong106 = 0L;

	@OriginalMember(owner = "client!akw", name = "hd", descriptor = "Z")
	boolean aBoolean450 = false;

	@OriginalMember(owner = "client!akw", name = "hh", descriptor = "[F")
	final float[] aFloatArray80 = new float[16];

	@OriginalMember(owner = "client!akw", name = "hm", descriptor = "I")
	int anInt2531 = 128;

	@OriginalMember(owner = "client!akw", name = "ib", descriptor = "I")
	int anInt2532 = 0;

	@OriginalMember(owner = "client!akw", name = "ik", descriptor = "[J")
	long[] aLongArray6 = new long[this.anInt2531];

	@OriginalMember(owner = "client!akw", name = "gi", descriptor = "I")
	final int anInt2529;

	@OriginalMember(owner = "client!akw", name = "gb", descriptor = "I")
	final int anInt2530;

	@OriginalMember(owner = "client!akw", name = "gg", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS2;

	@OriginalMember(owner = "client!akw", name = "hf", descriptor = "Lclient!jagdx/D3DCAPS;")
	final D3DCAPS aD3DCAPS1;

	@OriginalMember(owner = "client!akw", name = "hp", descriptor = "Z")
	final boolean aBoolean452;

	@OriginalMember(owner = "client!akw", name = "ht", descriptor = "Z")
	final boolean aBoolean454;

	@OriginalMember(owner = "client!akw", name = "hv", descriptor = "Z")
	final boolean aBoolean459;

	@OriginalMember(owner = "client!akw", name = "hq", descriptor = "Z")
	final boolean aBoolean453;

	@OriginalMember(owner = "client!akw", name = "he", descriptor = "Z")
	final boolean aBoolean455;

	@OriginalMember(owner = "client!akw", name = "hj", descriptor = "Z")
	final boolean aBoolean458;

	@OriginalMember(owner = "client!akw", name = "hu", descriptor = "Z")
	final boolean aBoolean456;

	@OriginalMember(owner = "client!akw", name = "ho", descriptor = "[Z")
	boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!akw", name = "hb", descriptor = "[Z")
	boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!akw", name = "hz", descriptor = "[Z")
	boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!akw", name = "hs", descriptor = "[Lclient!jn;")
	Class259[] aClass259Array1;

	@OriginalMember(owner = "client!akw", name = "hx", descriptor = "[Z")
	boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!akw", name = "hn", descriptor = "[I")
	int[] anIntArray252;

	@OriginalMember(owner = "client!akw", name = "hw", descriptor = "Lclient!mq;")
	Class328 aClass328_94;

	@OriginalMember(owner = "client!akw", name = "pj", descriptor = "()Z", line = 57)
	@Override
	public boolean method17432() {
		return (this.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!akw", name = "uq", descriptor = "()Z", line = 57)
	@Override
	public boolean method17600() {
		return (this.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!akw", name = "ph", descriptor = "()Z", line = 61)
	@Override
	public boolean method17433() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!akw", name = "adq", descriptor = "()Z", line = 61)
	@Override
	public boolean method17664() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!akw", name = "adi", descriptor = "()Z", line = 61)
	@Override
	public boolean method17633() {
		return (this.aD3DCAPS1.PixelShaderVersion & 0xFFFF) >= 257;
	}

	@OriginalMember(owner = "client!akw", name = "ada", descriptor = "(Ljava/awt/Canvas;Lclient!ds;Lclient!di;Lclient!ny;Ljava/lang/Integer;)Lclient!de;", line = 66)
	static Class21 method17818(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) Class359 arg3, @OriginalArg(4) Integer arg4) {
		@Pc(1) Class21_Sub3_Sub2 local1 = null;
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
				if (!method17836(local3, local5, local7, arg4, local151)) {
					throw new RuntimeException("");
				}
				@Pc(186) int local186 = 0;
				if ((local11.DevCaps & 0x100000) != 0) {
					local186 |= 0x10;
				}
				@Pc(207) long local207;
				try {
					local207 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local186 | 0x40, local151);
				} catch (@Pc(209) u local209) {
					local207 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local186 & 0xFFEFFFFF | 0x20, local151);
				}
				local1 = new Class21_Sub3_Sub2(local3, local5, local7, local207, local151, local11, arg1, arg2, arg3, arg4);
				if (!local1.aHashtable6.containsKey(arg0)) {
					Class66_Sub1.method13213(arg0);
					local1.method17040(arg0, new Class19_Sub2_Sub1_Sub1(local1, arg0, arg0.getWidth(), arg0.getHeight(), true));
				}
				local1.method17042(arg0);
				local1.method17585();
				return local1;
			}
		} catch (@Pc(267) RuntimeException local267) {
			if (local1 != null) {
				local1.method17021();
			}
			throw local267;
		}
	}

	@OriginalMember(owner = "client!akw", name = "aev", descriptor = "(Ljava/awt/Canvas;Lclient!ds;Lclient!di;Lclient!ny;Ljava/lang/Integer;)Lclient!de;", line = 66)
	static Class21 method17826(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) Class359 arg3, @OriginalArg(4) Integer arg4) {
		@Pc(1) Class21_Sub3_Sub2 local1 = null;
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
				if (!method17836(local3, local5, local7, arg4, local151)) {
					throw new RuntimeException("");
				}
				@Pc(186) int local186 = 0;
				if ((local11.DevCaps & 0x100000) != 0) {
					local186 |= 0x10;
				}
				@Pc(207) long local207;
				try {
					local207 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local186 | 0x40, local151);
				} catch (@Pc(209) u local209) {
					local207 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local186 & 0xFFEFFFFF | 0x20, local151);
				}
				local1 = new Class21_Sub3_Sub2(local3, local5, local7, local207, local151, local11, arg1, arg2, arg3, arg4);
				if (!local1.aHashtable6.containsKey(arg0)) {
					Class66_Sub1.method13213(arg0);
					local1.method17040(arg0, new Class19_Sub2_Sub1_Sub1(local1, arg0, arg0.getWidth(), arg0.getHeight(), true));
				}
				local1.method17042(arg0);
				local1.method17585();
				return local1;
			}
		} catch (@Pc(267) RuntimeException local267) {
			if (local1 != null) {
				local1.method17021();
			}
			throw local267;
		}
	}

	@OriginalMember(owner = "client!akw", name = "aes", descriptor = "(Ljava/awt/Canvas;Lclient!ds;Lclient!di;Lclient!ny;Ljava/lang/Integer;)Lclient!de;", line = 66)
	static Class21 method17850(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) Class359 arg3, @OriginalArg(4) Integer arg4) {
		@Pc(1) Class21_Sub3_Sub2 local1 = null;
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
				if (!method17836(local3, local5, local7, arg4, local151)) {
					throw new RuntimeException("");
				}
				@Pc(186) int local186 = 0;
				if ((local11.DevCaps & 0x100000) != 0) {
					local186 |= 0x10;
				}
				@Pc(207) long local207;
				try {
					local207 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local186 | 0x40, local151);
				} catch (@Pc(209) u local209) {
					local207 = IDirect3D.CreateDeviceContext(local7, local3, local5, arg0, local186 & 0xFFEFFFFF | 0x20, local151);
				}
				local1 = new Class21_Sub3_Sub2(local3, local5, local7, local207, local151, local11, arg1, arg2, arg3, arg4);
				if (!local1.aHashtable6.containsKey(arg0)) {
					Class66_Sub1.method13213(arg0);
					local1.method17040(arg0, new Class19_Sub2_Sub1_Sub1(local1, arg0, arg0.getWidth(), arg0.getHeight(), true));
				}
				local1.method17042(arg0);
				local1.method17585();
				return local1;
			}
		} catch (@Pc(267) RuntimeException local267) {
			if (local1 != null) {
				local1.method17021();
			}
			throw local267;
		}
	}

	@OriginalMember(owner = "client!akw", name = "<init>", descriptor = "(IIJJLclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/D3DCAPS;Lclient!ds;Lclient!di;Lclient!ny;I)V", line = 118)
	Class21_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) long arg3, @OriginalArg(4) D3DPRESENT_PARAMETERS arg4, @OriginalArg(5) D3DCAPS arg5, @OriginalArg(6) Class134 arg6, @OriginalArg(7) Interface11 arg7, @OriginalArg(8) Class359 arg8, @OriginalArg(9) int arg9) {
		super(arg6, arg7, arg8, arg9, 0);
		try {
			this.anInt2529 = arg0;
			this.anInt2530 = arg1;
			this.aLong103 = arg2;
			this.aLong104 = arg3;
			this.aD3DPRESENT_PARAMETERS2 = arg4;
			this.aD3DCAPS1 = arg5;
			this.aLong102 = D3DLIGHT.Create();
			this.aLong105 = D3DLIGHT.Create();
			this.aLong106 = D3DLIGHT.Create();
			this.anInt2525 = this.aD3DCAPS1.MaxSimultaneousTextures;
			this.anInt2526 = this.aD3DCAPS1.MaxActiveLights > 0 ? this.aD3DCAPS1.MaxActiveLights : 8;
			this.aBoolean452 = (this.aD3DCAPS1.TextureCaps & 0x2) == 0;
			this.aBoolean441 = (this.aD3DCAPS1.TextureCaps & 0x800) != 0;
			this.aBoolean438 = (this.aD3DCAPS1.TextureCaps & 0x2000) != 0;
			this.aBoolean454 = (this.aD3DCAPS1.TextureCaps & 0x8000) != 0;
			this.aBoolean459 = (this.aD3DCAPS1.TextureCaps & 0x10000) != 0;
			this.aBoolean453 = (this.aD3DCAPS1.TextureCaps & 0x4000) != 0;
			this.aBoolean443 = this.aD3DCAPS1.NumSimultaneousRTs > 0;
			this.aBoolean447 = this.aBoolean443;
			this.aBoolean444 = this.aD3DCAPS1.NumSimultaneousRTs > 0;
			this.aBoolean439 = this.anInt2522 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong103, this.anInt2529, this.anInt2530, this.aD3DPRESENT_PARAMETERS2.BackBufferFormat, true, 2) == 0;
			this.aBoolean445 = this.aD3DCAPS1.NumSimultaneousRTs > 0 && this.anInt2522 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong103, this.anInt2529, this.anInt2530, 113, true, 2) == 0;
			this.aBoolean455 = IDirect3D.CheckDeviceFormat(this.aLong103, this.anInt2529, this.anInt2530, this.aD3DPRESENT_PARAMETERS2.BackBufferFormat, 0, 1, method17559('A', 'T', 'O', 'C')) == 0;
			this.aBoolean458 = IDirect3D.CheckDeviceFormat(this.aLong103, this.anInt2529, this.anInt2530, this.aD3DPRESENT_PARAMETERS2.BackBufferFormat, 0, 1, method17559('A', '2', 'M', '1')) == 0;
			this.aBoolean456 = IDirect3D.CheckDeviceFormat(this.aLong103, this.anInt2529, this.anInt2530, this.aD3DPRESENT_PARAMETERS2.BackBufferFormat, 0, 1, method17559('S', 'S', 'A', 'A')) == 0;
			this.aBoolean448 = (this.aD3DCAPS1.PrimitiveMiscCaps & 0x20000) != 0;
			this.aBooleanArray18 = new boolean[this.anInt2525];
			this.aBooleanArray17 = new boolean[this.anInt2525];
			this.aBooleanArray15 = new boolean[this.anInt2525];
			this.aClass259Array1 = new Class259[this.anInt2525];
			this.aBooleanArray16 = new boolean[this.anInt2525];
			this.anIntArray252 = new int[this.anInt2525];
			this.aBoolean423 = false;
			@Pc(339) Class332 local339 = new Class332();
			local339.method26199(1.0F, -1.0F, 0.5F);
			local339.method26203(0.0F, 0.0F, 0.5F);
			this.aClass328_94 = new Class328();
			this.aClass328_94.method26056(local339);
			IDirect3DDevice.BeginScene(this.aLong104);
		} catch (@Pc(364) Throwable local364) {
			local364.printStackTrace();
			this.method17020();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!akw", name = "py", descriptor = "()V", line = 168)
	@Override
	void method17446() {
		for (@Pc(5) Class3_Sub29 local5 = (Class3_Sub29) this.aClass553_38.method32768(); local5 != null; local5 = (Class3_Sub29) this.aClass553_38.method32709()) {
			@Pc(11) Interface33 local11 = (Interface33) local5.anObject2;
			local11.method8889();
			if (local11 == this.aClass19_6) {
				local11.method21393();
			}
		}
		super.method17446();
	}

	@OriginalMember(owner = "client!akw", name = "vd", descriptor = "()V", line = 168)
	@Override
	void method17568() {
		for (@Pc(5) Class3_Sub29 local5 = (Class3_Sub29) this.aClass553_38.method32768(); local5 != null; local5 = (Class3_Sub29) this.aClass553_38.method32709()) {
			@Pc(11) Interface33 local11 = (Interface33) local5.anObject2;
			local11.method8889();
			if (local11 == this.aClass19_6) {
				local11.method21393();
			}
		}
		super.method17446();
	}

	@OriginalMember(owner = "client!akw", name = "vq", descriptor = "()V", line = 168)
	@Override
	void method17573() {
		for (@Pc(5) Class3_Sub29 local5 = (Class3_Sub29) this.aClass553_38.method32768(); local5 != null; local5 = (Class3_Sub29) this.aClass553_38.method32709()) {
			@Pc(11) Interface33 local11 = (Interface33) local5.anObject2;
			local11.method8889();
			if (local11 == this.aClass19_6) {
				local11.method21393();
			}
		}
		super.method17446();
	}

	@OriginalMember(owner = "client!akw", name = "vo", descriptor = "()V", line = 168)
	@Override
	void method17661() {
		for (@Pc(5) Class3_Sub29 local5 = (Class3_Sub29) this.aClass553_38.method32768(); local5 != null; local5 = (Class3_Sub29) this.aClass553_38.method32709()) {
			@Pc(11) Interface33 local11 = (Interface33) local5.anObject2;
			local11.method8889();
			if (local11 == this.aClass19_6) {
				local11.method21393();
			}
		}
		super.method17446();
	}

	@OriginalMember(owner = "client!akw", name = "va", descriptor = "()V", line = 168)
	@Override
	void method17622() {
		for (@Pc(5) Class3_Sub29 local5 = (Class3_Sub29) this.aClass553_38.method32768(); local5 != null; local5 = (Class3_Sub29) this.aClass553_38.method32709()) {
			@Pc(11) Interface33 local11 = (Interface33) local5.anObject2;
			local11.method8889();
			if (local11 == this.aClass19_6) {
				local11.method21393();
			}
		}
		super.method17446();
	}

	@OriginalMember(owner = "client!akw", name = "vh", descriptor = "()V", line = 168)
	@Override
	void method17623() {
		for (@Pc(5) Class3_Sub29 local5 = (Class3_Sub29) this.aClass553_38.method32768(); local5 != null; local5 = (Class3_Sub29) this.aClass553_38.method32709()) {
			@Pc(11) Interface33 local11 = (Interface33) local5.anObject2;
			local11.method8889();
			if (local11 == this.aClass19_6) {
				local11.method21393();
			}
		}
		super.method17446();
	}

	@OriginalMember(owner = "client!akw", name = "vp", descriptor = "()V", line = 168)
	@Override
	void method17579() {
		for (@Pc(5) Class3_Sub29 local5 = (Class3_Sub29) this.aClass553_38.method32768(); local5 != null; local5 = (Class3_Sub29) this.aClass553_38.method32709()) {
			@Pc(11) Interface33 local11 = (Interface33) local5.anObject2;
			local11.method8889();
			if (local11 == this.aClass19_6) {
				local11.method21393();
			}
		}
		super.method17446();
	}

	@OriginalMember(owner = "client!akw", name = "pw", descriptor = "()V", line = 177)
	@Override
	void method17734() {
		for (@Pc(5) Class3_Sub29 local5 = (Class3_Sub29) this.aClass553_38.method32768(); local5 != null; local5 = (Class3_Sub29) this.aClass553_38.method32709()) {
			@Pc(11) Interface33 local11 = (Interface33) local5.anObject2;
			local11.method21392();
		}
		super.method17734();
	}

	@OriginalMember(owner = "client!akw", name = "vt", descriptor = "()V", line = 177)
	@Override
	void method17725() {
		for (@Pc(5) Class3_Sub29 local5 = (Class3_Sub29) this.aClass553_38.method32768(); local5 != null; local5 = (Class3_Sub29) this.aClass553_38.method32709()) {
			@Pc(11) Interface33 local11 = (Interface33) local5.anObject2;
			local11.method21392();
		}
		super.method17734();
	}

	@OriginalMember(owner = "client!akw", name = "vs", descriptor = "()V", line = 177)
	@Override
	void method17779() {
		for (@Pc(5) Class3_Sub29 local5 = (Class3_Sub29) this.aClass553_38.method32768(); local5 != null; local5 = (Class3_Sub29) this.aClass553_38.method32709()) {
			@Pc(11) Interface33 local11 = (Interface33) local5.anObject2;
			local11.method21392();
		}
		super.method17734();
	}

	@OriginalMember(owner = "client!akw", name = "vf", descriptor = "()V", line = 177)
	@Override
	void method17618() {
		for (@Pc(5) Class3_Sub29 local5 = (Class3_Sub29) this.aClass553_38.method32768(); local5 != null; local5 = (Class3_Sub29) this.aClass553_38.method32709()) {
			@Pc(11) Interface33 local11 = (Interface33) local5.anObject2;
			local11.method21392();
		}
		super.method17734();
	}

	@OriginalMember(owner = "client!akw", name = "aeg", descriptor = "(II)Z", line = 185)
	boolean method17840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong104);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong104, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong104, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong104, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong104, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong104, 0L);
			this.method17734();
			this.aD3DPRESENT_PARAMETERS2.BackBufferWidth = arg0;
			this.aD3DPRESENT_PARAMETERS2.BackBufferHeight = arg1;
			this.aD3DPRESENT_PARAMETERS2.BackBufferCount = 1;
			if (method17836(this.anInt2529, this.anInt2530, this.aLong103, this.anInt2522, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong104, this.aD3DPRESENT_PARAMETERS2);
				if (p.method25092(local15)) {
					this.aBoolean451 = false;
					this.method17446();
					this.method17443();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!akw", name = "aei", descriptor = "(II)Z", line = 185)
	boolean method17851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong104);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong104, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong104, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong104, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong104, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong104, 0L);
			this.method17734();
			this.aD3DPRESENT_PARAMETERS2.BackBufferWidth = arg0;
			this.aD3DPRESENT_PARAMETERS2.BackBufferHeight = arg1;
			this.aD3DPRESENT_PARAMETERS2.BackBufferCount = 1;
			if (method17836(this.anInt2529, this.anInt2530, this.aLong103, this.anInt2522, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong104, this.aD3DPRESENT_PARAMETERS2);
				if (p.method25092(local15)) {
					this.aBoolean451 = false;
					this.method17446();
					this.method17443();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!akw", name = "aet", descriptor = "(II)Z", line = 185)
	boolean method17852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = IDirect3DDevice.TestCooperativeLevel(this.aLong104);
		if (local3 == 0 || local3 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong104, 0L);
			@Pc(15) int local15;
			for (local15 = 1; local15 < 4; local15++) {
				IDirect3DDevice.SetRenderTarget(this.aLong104, local15, 0L);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetStreamSource(this.aLong104, local15, 0L, 0, 0);
			}
			for (local15 = 0; local15 < 4; local15++) {
				IDirect3DDevice.SetTexture(this.aLong104, local15, 0L);
			}
			IDirect3DDevice.SetIndices(this.aLong104, 0L);
			this.method17734();
			this.aD3DPRESENT_PARAMETERS2.BackBufferWidth = arg0;
			this.aD3DPRESENT_PARAMETERS2.BackBufferHeight = arg1;
			this.aD3DPRESENT_PARAMETERS2.BackBufferCount = 1;
			if (method17836(this.anInt2529, this.anInt2530, this.aLong103, this.anInt2522, this.aD3DPRESENT_PARAMETERS2)) {
				local15 = IDirect3DDevice.Reset(this.aLong104, this.aD3DPRESENT_PARAMETERS2);
				if (p.method25092(local15)) {
					this.aBoolean451 = false;
					this.method17446();
					this.method17443();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!akw", name = "us", descriptor = "()V", line = 211)
	@Override
	void method17624() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2525; local1++) {
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 2, 1);
			this.aClass259Array1[local1] = Class259.aClass259_5;
			@Pc(48) boolean[] local48 = this.aBooleanArray18;
			this.aBooleanArray17[local1] = true;
			local48[local1] = true;
			this.aBooleanArray16[local1] = false;
			this.anIntArray252[local1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong104, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong104, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong104, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong104, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong104, 24, 0);
		IDirect3DDevice.method25087(this.aLong104, 206, true);
		IDirect3DDevice.SetRenderState(this.aLong104, 181, 0);
		IDirect3DDevice.SetRenderState(this.aLong104, 22, 2);
		IDirect3DDevice.SetRenderState(this.aLong104, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong104, 145, 1);
		IDirect3DDevice.method25086(this.aLong104, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong104, 35, 3);
		IDirect3DDevice.method25086(this.aLong104, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong102, 3);
		D3DLIGHT.SetType(this.aLong105, 3);
		D3DLIGHT.SetType(this.aLong106, 1);
		IDirect3DDevice.SetRenderState(this.aLong104, 206, 1);
		this.aBoolean450 = false;
		super.method17443();
	}

	@OriginalMember(owner = "client!akw", name = "uj", descriptor = "()V", line = 211)
	@Override
	void method17612() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2525; local1++) {
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 2, 1);
			this.aClass259Array1[local1] = Class259.aClass259_5;
			@Pc(48) boolean[] local48 = this.aBooleanArray18;
			this.aBooleanArray17[local1] = true;
			local48[local1] = true;
			this.aBooleanArray16[local1] = false;
			this.anIntArray252[local1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong104, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong104, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong104, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong104, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong104, 24, 0);
		IDirect3DDevice.method25087(this.aLong104, 206, true);
		IDirect3DDevice.SetRenderState(this.aLong104, 181, 0);
		IDirect3DDevice.SetRenderState(this.aLong104, 22, 2);
		IDirect3DDevice.SetRenderState(this.aLong104, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong104, 145, 1);
		IDirect3DDevice.method25086(this.aLong104, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong104, 35, 3);
		IDirect3DDevice.method25086(this.aLong104, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong102, 3);
		D3DLIGHT.SetType(this.aLong105, 3);
		D3DLIGHT.SetType(this.aLong106, 1);
		IDirect3DDevice.SetRenderState(this.aLong104, 206, 1);
		this.aBoolean450 = false;
		super.method17443();
	}

	@OriginalMember(owner = "client!akw", name = "uo", descriptor = "()V", line = 211)
	@Override
	void method17613() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2525; local1++) {
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 2, 1);
			this.aClass259Array1[local1] = Class259.aClass259_5;
			@Pc(48) boolean[] local48 = this.aBooleanArray18;
			this.aBooleanArray17[local1] = true;
			local48[local1] = true;
			this.aBooleanArray16[local1] = false;
			this.anIntArray252[local1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong104, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong104, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong104, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong104, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong104, 24, 0);
		IDirect3DDevice.method25087(this.aLong104, 206, true);
		IDirect3DDevice.SetRenderState(this.aLong104, 181, 0);
		IDirect3DDevice.SetRenderState(this.aLong104, 22, 2);
		IDirect3DDevice.SetRenderState(this.aLong104, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong104, 145, 1);
		IDirect3DDevice.method25086(this.aLong104, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong104, 35, 3);
		IDirect3DDevice.method25086(this.aLong104, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong102, 3);
		D3DLIGHT.SetType(this.aLong105, 3);
		D3DLIGHT.SetType(this.aLong106, 1);
		IDirect3DDevice.SetRenderState(this.aLong104, 206, 1);
		this.aBoolean450 = false;
		super.method17443();
	}

	@OriginalMember(owner = "client!akw", name = "pb", descriptor = "()V", line = 211)
	@Override
	void method17443() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2525; local1++) {
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong104, local1, 2, 1);
			this.aClass259Array1[local1] = Class259.aClass259_5;
			@Pc(48) boolean[] local48 = this.aBooleanArray18;
			this.aBooleanArray17[local1] = true;
			local48[local1] = true;
			this.aBooleanArray16[local1] = false;
			this.anIntArray252[local1] = 0;
		}
		IDirect3DDevice.SetTextureStageState(this.aLong104, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong104, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong104, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong104, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong104, 24, 0);
		IDirect3DDevice.method25087(this.aLong104, 206, true);
		IDirect3DDevice.SetRenderState(this.aLong104, 181, 0);
		IDirect3DDevice.SetRenderState(this.aLong104, 22, 2);
		IDirect3DDevice.SetRenderState(this.aLong104, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong104, 145, 1);
		IDirect3DDevice.method25086(this.aLong104, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong104, 35, 3);
		IDirect3DDevice.method25086(this.aLong104, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong102, 3);
		D3DLIGHT.SetType(this.aLong105, 3);
		D3DLIGHT.SetType(this.aLong106, 1);
		IDirect3DDevice.SetRenderState(this.aLong104, 206, 1);
		this.aBoolean450 = false;
		super.method17443();
	}

	@OriginalMember(owner = "client!akw", name = "h", descriptor = "()Lclient!cr;", line = 247)
	@Override
	public Class117 method17016() {
		@Pc(3) D3DADAPTER_IDENTIFIER local3 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong103, this.anInt2529, 0, local3);
		return new Class117(local3.VendorID, this.method17547() ? "Direct3D FF" : "Direct3D", 9, local3.Description, local3.DriverVersion, this.method17547());
	}

	@OriginalMember(owner = "client!akw", name = "ex", descriptor = "()Lclient!cr;", line = 247)
	@Override
	public Class117 method17143() {
		@Pc(3) D3DADAPTER_IDENTIFIER local3 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong103, this.anInt2529, 0, local3);
		return new Class117(local3.VendorID, this.method17547() ? "Direct3D FF" : "Direct3D", 9, local3.Description, local3.DriverVersion, this.method17547());
	}

	@OriginalMember(owner = "client!akw", name = "eb", descriptor = "(II)V", line = 253)
	@Override
	void method17265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		if (this.aBoolean451) {
			if (!this.method17840(this.aClass19_Sub2_6.method21390(), this.aClass19_Sub2_6.method21391())) {
				return;
			}
			((Class19_Sub2_Sub1_Sub1) this.aClass19_Sub2_6).method8889();
		} else {
			IDirect3DDevice.EndScene(this.aLong104);
		}
		@Pc(25) int local25 = this.aClass19_Sub2_6.method21412();
		if (p.method25091(local25)) {
			this.aBoolean451 = true;
			this.aClass19_Sub2_6.method21392();
		} else {
			IDirect3DDevice.BeginScene(this.aLong104);
			if (this.anInterface11_6 != null) {
				this.anInterface11_6.method21972();
			}
		}
	}

	@OriginalMember(owner = "client!akw", name = "s", descriptor = "(II)V", line = 253)
	@Override
	void method17018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		if (this.aBoolean451) {
			if (!this.method17840(this.aClass19_Sub2_6.method21390(), this.aClass19_Sub2_6.method21391())) {
				return;
			}
			((Class19_Sub2_Sub1_Sub1) this.aClass19_Sub2_6).method8889();
		} else {
			IDirect3DDevice.EndScene(this.aLong104);
		}
		@Pc(25) int local25 = this.aClass19_Sub2_6.method21412();
		if (p.method25091(local25)) {
			this.aBoolean451 = true;
			this.aClass19_Sub2_6.method21392();
		} else {
			IDirect3DDevice.BeginScene(this.aLong104);
			if (this.anInterface11_6 != null) {
				this.anInterface11_6.method21972();
			}
		}
	}

	@OriginalMember(owner = "client!akw", name = "u", descriptor = "()V", line = 270)
	@Override
	public void method17019() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong104);
		if (p.method25092(IDirect3DEventQuery.Issue(local3))) {
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

	@OriginalMember(owner = "client!akw", name = "ej", descriptor = "()V", line = 270)
	@Override
	public void method17148() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong104);
		if (p.method25092(IDirect3DEventQuery.Issue(local3))) {
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

	@OriginalMember(owner = "client!akw", name = "ef", descriptor = "()V", line = 270)
	@Override
	public void method17372() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong104);
		if (p.method25092(IDirect3DEventQuery.Issue(local3))) {
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

	@OriginalMember(owner = "client!akw", name = "ey", descriptor = "()V", line = 270)
	@Override
	public void method17026() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong104);
		if (p.method25092(IDirect3DEventQuery.Issue(local3))) {
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

	@OriginalMember(owner = "client!akw", name = "er", descriptor = "()V", line = 270)
	@Override
	public void method17147() {
		@Pc(3) long local3 = IDirect3DDevice.CreateEventQuery(this.aLong104);
		if (p.method25092(IDirect3DEventQuery.Issue(local3))) {
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

	@OriginalMember(owner = "client!akw", name = "b", descriptor = "()V", line = 282)
	@Override
	void method17021() {
		super.method17021();
		if (this.aLong102 != 0L) {
			D3DLIGHT.Destroy(this.aLong102);
			this.aLong102 = 0L;
		}
		if (this.aLong105 != 0L) {
			D3DLIGHT.Destroy(this.aLong105);
			this.aLong105 = 0L;
		}
		if (this.aLong106 != 0L) {
			D3DLIGHT.Destroy(this.aLong106);
			this.aLong106 = 0L;
		}
		if (this.aLong104 != 0L) {
			IDirect3DDevice.Destroy(this.aLong104);
			this.aLong104 = 0L;
		}
		if (this.aLong103 != 0L) {
			IUnknown.Release(this.aLong103);
			this.aLong103 = 0L;
		}
	}

	@OriginalMember(owner = "client!akw", name = "ew", descriptor = "()V", line = 282)
	@Override
	void method17150() {
		super.method17021();
		if (this.aLong102 != 0L) {
			D3DLIGHT.Destroy(this.aLong102);
			this.aLong102 = 0L;
		}
		if (this.aLong105 != 0L) {
			D3DLIGHT.Destroy(this.aLong105);
			this.aLong105 = 0L;
		}
		if (this.aLong106 != 0L) {
			D3DLIGHT.Destroy(this.aLong106);
			this.aLong106 = 0L;
		}
		if (this.aLong104 != 0L) {
			IDirect3DDevice.Destroy(this.aLong104);
			this.aLong104 = 0L;
		}
		if (this.aLong103 != 0L) {
			IUnknown.Release(this.aLong103);
			this.aLong103 = 0L;
		}
	}

	@OriginalMember(owner = "client!akw", name = "em", descriptor = "()V", line = 282)
	@Override
	void method17151() {
		super.method17021();
		if (this.aLong102 != 0L) {
			D3DLIGHT.Destroy(this.aLong102);
			this.aLong102 = 0L;
		}
		if (this.aLong105 != 0L) {
			D3DLIGHT.Destroy(this.aLong105);
			this.aLong105 = 0L;
		}
		if (this.aLong106 != 0L) {
			D3DLIGHT.Destroy(this.aLong106);
			this.aLong106 = 0L;
		}
		if (this.aLong104 != 0L) {
			IDirect3DDevice.Destroy(this.aLong104);
			this.aLong104 = 0L;
		}
		if (this.aLong103 != 0L) {
			IUnknown.Release(this.aLong103);
			this.aLong103 = 0L;
		}
	}

	@OriginalMember(owner = "client!akw", name = "ec", descriptor = "()V", line = 282)
	@Override
	void method17152() {
		super.method17021();
		if (this.aLong102 != 0L) {
			D3DLIGHT.Destroy(this.aLong102);
			this.aLong102 = 0L;
		}
		if (this.aLong105 != 0L) {
			D3DLIGHT.Destroy(this.aLong105);
			this.aLong105 = 0L;
		}
		if (this.aLong106 != 0L) {
			D3DLIGHT.Destroy(this.aLong106);
			this.aLong106 = 0L;
		}
		if (this.aLong104 != 0L) {
			IDirect3DDevice.Destroy(this.aLong104);
			this.aLong104 = 0L;
		}
		if (this.aLong103 != 0L) {
			IUnknown.Release(this.aLong103);
			this.aLong103 = 0L;
		}
	}

	@OriginalMember(owner = "client!akw", name = "en", descriptor = "()V", line = 282)
	@Override
	void method17149() {
		super.method17021();
		if (this.aLong102 != 0L) {
			D3DLIGHT.Destroy(this.aLong102);
			this.aLong102 = 0L;
		}
		if (this.aLong105 != 0L) {
			D3DLIGHT.Destroy(this.aLong105);
			this.aLong105 = 0L;
		}
		if (this.aLong106 != 0L) {
			D3DLIGHT.Destroy(this.aLong106);
			this.aLong106 = 0L;
		}
		if (this.aLong104 != 0L) {
			IDirect3DDevice.Destroy(this.aLong104);
			this.aLong104 = 0L;
		}
		if (this.aLong103 != 0L) {
			IUnknown.Release(this.aLong103);
			this.aLong103 = 0L;
		}
	}

	@OriginalMember(owner = "client!akw", name = "ea", descriptor = "()V", line = 282)
	@Override
	void method17153() {
		super.method17021();
		if (this.aLong102 != 0L) {
			D3DLIGHT.Destroy(this.aLong102);
			this.aLong102 = 0L;
		}
		if (this.aLong105 != 0L) {
			D3DLIGHT.Destroy(this.aLong105);
			this.aLong105 = 0L;
		}
		if (this.aLong106 != 0L) {
			D3DLIGHT.Destroy(this.aLong106);
			this.aLong106 = 0L;
		}
		if (this.aLong104 != 0L) {
			IDirect3DDevice.Destroy(this.aLong104);
			this.aLong104 = 0L;
		}
		if (this.aLong103 != 0L) {
			IUnknown.Release(this.aLong103);
			this.aLong103 = 0L;
		}
	}

	@OriginalMember(owner = "client!akw", name = "hh", descriptor = "()V", line = 306)
	@Override
	void method17204() {
		super.finalize();
	}

	@OriginalMember(owner = "client!akw", name = "finalize", descriptor = "()V", line = 306)
	@Override
	void finalize() {
		super.finalize();
	}

	@OriginalMember(owner = "client!akw", name = "pt", descriptor = "()F", line = 310)
	@Override
	public float method17577() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!akw", name = "vb", descriptor = "()F", line = 310)
	@Override
	public float method17796() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!akw", name = "vj", descriptor = "()F", line = 310)
	@Override
	public float method17589() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!akw", name = "vz", descriptor = "()F", line = 310)
	@Override
	public float method17588() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!akw", name = "vl", descriptor = "()F", line = 310)
	@Override
	public float method17444() {
		return -0.5F;
	}

	@OriginalMember(owner = "client!akw", name = "aq", descriptor = "()Lclient!abj;", line = 314)
	@Override
	public Class19_Sub1 method17047() {
		return new Class19_Sub1_Sub1_Sub2(this);
	}

	@OriginalMember(owner = "client!akw", name = "la", descriptor = "()Lclient!abj;", line = 314)
	@Override
	public Class19_Sub1 method17324() {
		return new Class19_Sub1_Sub1_Sub2(this);
	}

	@OriginalMember(owner = "client!akw", name = "ff", descriptor = "(Ljava/awt/Canvas;II)Lclient!abq;", line = 318)
	@Override
	Class19_Sub2 method17186(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class19_Sub2_Sub1_Sub1(this, arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!akw", name = "ai", descriptor = "(Ljava/awt/Canvas;II)Lclient!abq;", line = 318)
	@Override
	Class19_Sub2 method17046(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class19_Sub2_Sub1_Sub1(this, arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!akw", name = "fk", descriptor = "(Ljava/awt/Canvas;II)Lclient!abq;", line = 318)
	@Override
	Class19_Sub2 method17187(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class19_Sub2_Sub1_Sub1(this, arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!akw", name = "av", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 322)
	@Override
	public Interface10 method17048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class310(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!akw", name = "ll", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 322)
	@Override
	public Interface10 method17326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class310(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!akw", name = "ld", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 322)
	@Override
	public Interface10 method17257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class310(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!akw", name = "lk", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 322)
	@Override
	public Interface10 method17284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class310(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!akw", name = "lm", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 322)
	@Override
	public Interface10 method17328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class310(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!akw", name = "lv", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 322)
	@Override
	public Interface10 method17276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class310(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!akw", name = "ax", descriptor = "(II)Lclient!dr;", line = 326)
	@Override
	public Interface13 method17049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class307(this, Class127.aClass127_22, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!akw", name = "mv", descriptor = "(II)Lclient!dr;", line = 326)
	@Override
	public Interface13 method17349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class307(this, Class127.aClass127_22, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!akw", name = "ma", descriptor = "(II)Lclient!dr;", line = 326)
	@Override
	public Interface13 method17015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class307(this, Class127.aClass127_22, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!akw", name = "az", descriptor = "(III)Lclient!dr;", line = 330)
	@Override
	public Interface13 method17329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class307(this, Class127.aClass127_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akw", name = "lc", descriptor = "(III)Lclient!dr;", line = 330)
	@Override
	public Interface13 method17330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class307(this, Class127.aClass127_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akw", name = "le", descriptor = "(III)Lclient!dr;", line = 330)
	@Override
	public Interface13 method17306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class307(this, Class127.aClass127_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akw", name = "ael", descriptor = "(Lclient!lb;)Lclient!agn;", line = 334)
	Class3_Sub29 method17819(@OriginalArg(0) Interface33 arg0) {
		for (@Pc(5) Class3_Sub29 local5 = (Class3_Sub29) this.aClass553_38.method32768(); local5 != null; local5 = (Class3_Sub29) this.aClass553_38.method32709()) {
			if (local5.anObject2 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!akw", name = "aej", descriptor = "(Lclient!lb;)Lclient!agn;", line = 334)
	Class3_Sub29 method17853(@OriginalArg(0) Interface33 arg0) {
		for (@Pc(5) Class3_Sub29 local5 = (Class3_Sub29) this.aClass553_38.method32768(); local5 != null; local5 = (Class3_Sub29) this.aClass553_38.method32709()) {
			if (local5.anObject2 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!akw", name = "aeq", descriptor = "(Lclient!lb;)Lclient!agn;", line = 334)
	Class3_Sub29 method17854(@OriginalArg(0) Interface33 arg0) {
		for (@Pc(5) Class3_Sub29 local5 = (Class3_Sub29) this.aClass553_38.method32768(); local5 != null; local5 = (Class3_Sub29) this.aClass553_38.method32709()) {
			if (local5.anObject2 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!akw", name = "aen", descriptor = "(Lclient!lb;)Lclient!agn;", line = 334)
	Class3_Sub29 method17855(@OriginalArg(0) Interface33 arg0) {
		for (@Pc(5) Class3_Sub29 local5 = (Class3_Sub29) this.aClass553_38.method32768(); local5 != null; local5 = (Class3_Sub29) this.aClass553_38.method32709()) {
			if (local5.anObject2 == arg0) {
				return local5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!akw", name = "aef", descriptor = "(Lclient!lb;)V", line = 341)
	void method17820(@OriginalArg(0) Interface33 arg0) {
		if (this.method17819(arg0) == null) {
			this.aClass553_38.method32702(new Class3_Sub29(arg0));
		}
	}

	@OriginalMember(owner = "client!akw", name = "aex", descriptor = "(Lclient!lb;)V", line = 341)
	void method17841(@OriginalArg(0) Interface33 arg0) {
		if (this.method17819(arg0) == null) {
			this.aClass553_38.method32702(new Class3_Sub29(arg0));
		}
	}

	@OriginalMember(owner = "client!akw", name = "aeh", descriptor = "(Lclient!lb;)V", line = 345)
	void method17821(@OriginalArg(0) Interface33 arg0) {
		@Pc(3) Class3_Sub29 local3 = this.method17819(arg0);
		if (local3 != null) {
			local3.method33656();
		}
	}

	@OriginalMember(owner = "client!akw", name = "afs", descriptor = "(Lclient!lb;)V", line = 345)
	void method17849(@OriginalArg(0) Interface33 arg0) {
		@Pc(3) Class3_Sub29 local3 = this.method17819(arg0);
		if (local3 != null) {
			local3.method33656();
		}
	}

	@OriginalMember(owner = "client!akw", name = "afm", descriptor = "(Lclient!lb;)V", line = 345)
	void method17856(@OriginalArg(0) Interface33 arg0) {
		@Pc(3) Class3_Sub29 local3 = this.method17819(arg0);
		if (local3 != null) {
			local3.method33656();
		}
	}

	@OriginalMember(owner = "client!akw", name = "al", descriptor = "(IIII)[I", line = 350)
	@Override
	public int[] method17051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method17028();
		@Pc(3) int[] local3 = null;
		@Pc(8) long local8 = IDirect3DDevice.GetRenderTarget(this.aLong104, 0);
		@Pc(18) long local18 = IDirect3DDevice.CreateRenderTarget(this.aLong104, arg2, arg3, 21, 0, 0, true);
		@Pc(33) int local33 = IDirect3DDevice.StretchRect(this.aLong104, local8, arg0, arg1, arg2, arg3, local18, 0, 0, arg2, arg3, 1);
		if (p.method25092(local33)) {
			local3 = new int[arg2 * arg3];
			IDirect3DSurface.Download(local18, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong101);
			this.aByteBuffer4.clear();
			this.aByteBuffer4.asIntBuffer().get(local3);
		}
		IUnknown.Release(local8);
		IUnknown.Release(local18);
		return local3;
	}

	@OriginalMember(owner = "client!akw", name = "fj", descriptor = "(IIII)[I", line = 350)
	@Override
	public int[] method17188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method17028();
		@Pc(3) int[] local3 = null;
		@Pc(8) long local8 = IDirect3DDevice.GetRenderTarget(this.aLong104, 0);
		@Pc(18) long local18 = IDirect3DDevice.CreateRenderTarget(this.aLong104, arg2, arg3, 21, 0, 0, true);
		@Pc(33) int local33 = IDirect3DDevice.StretchRect(this.aLong104, local8, arg0, arg1, arg2, arg3, local18, 0, 0, arg2, arg3, 1);
		if (p.method25092(local33)) {
			local3 = new int[arg2 * arg3];
			IDirect3DSurface.Download(local18, 0, 0, arg2, arg3, arg2 * 4, 16, this.aLong101);
			this.aByteBuffer4.clear();
			this.aByteBuffer4.asIntBuffer().get(local3);
		}
		IUnknown.Release(local8);
		IUnknown.Release(local18);
		return local3;
	}

	@OriginalMember(owner = "client!akw", name = "fa", descriptor = "()V", line = 366)
	@Override
	public void method17189() {
	}

	@OriginalMember(owner = "client!akw", name = "fq", descriptor = "()V", line = 366)
	@Override
	public void method17377() {
	}

	@OriginalMember(owner = "client!akw", name = "fc", descriptor = "()V", line = 366)
	@Override
	public void method17301() {
	}

	@OriginalMember(owner = "client!akw", name = "ao", descriptor = "()V", line = 366)
	@Override
	public void method17302() {
	}

	@OriginalMember(owner = "client!akw", name = "jk", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;", line = 369)
	@Override
	public Class18 method17288(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!akw", name = "js", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;", line = 369)
	@Override
	public Class18 method17379(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!akw", name = "jv", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;", line = 369)
	@Override
	public Class18 method17289(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!akw", name = "db", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;", line = 369)
	@Override
	public Class18 method17074(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!akw", name = "gx", descriptor = "(II)V", line = 373)
	@Override
	public void method17270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		IDirect3DDevice.Clear(this.aLong104, arg0, arg1, 1.0F, 0);
	}

	@OriginalMember(owner = "client!akw", name = "ad", descriptor = "(II)V", line = 373)
	@Override
	public void method17061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		IDirect3DDevice.Clear(this.aLong104, arg0, arg1, 1.0F, 0);
	}

	@OriginalMember(owner = "client!akw", name = "qh", descriptor = "()V", line = 377)
	@Override
	void method17570() {
		if (this.aClass19_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong104, this.anInt2528 + this.anInt2499, this.anInt2503 + this.anInt2500, this.anInt2501, this.anInt2506, this.aFloat188, this.aFloat189);
		}
	}

	@OriginalMember(owner = "client!akw", name = "wp", descriptor = "()V", line = 377)
	@Override
	void method17571() {
		if (this.aClass19_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong104, this.anInt2528 + this.anInt2499, this.anInt2503 + this.anInt2500, this.anInt2501, this.anInt2506, this.aFloat188, this.aFloat189);
		}
	}

	@OriginalMember(owner = "client!akw", name = "wt", descriptor = "()V", line = 377)
	@Override
	void method17686() {
		if (this.aClass19_6 != null) {
			IDirect3DDevice.SetViewport(this.aLong104, this.anInt2528 + this.anInt2499, this.anInt2503 + this.anInt2500, this.anInt2501, this.anInt2506, this.aFloat188, this.aFloat189);
		}
	}

	@OriginalMember(owner = "client!akw", name = "qe", descriptor = "()V", line = 381)
	@Override
	void method17472() {
		IDirect3DDevice.SetScissorRect(this.aLong104, this.anInt2528 + this.anInt2495, this.anInt2503 + this.anInt2493, this.anInt2496, this.anInt2494);
	}

	@OriginalMember(owner = "client!akw", name = "wu", descriptor = "()V", line = 381)
	@Override
	void method17650() {
		IDirect3DDevice.SetScissorRect(this.aLong104, this.anInt2528 + this.anInt2495, this.anInt2503 + this.anInt2493, this.anInt2496, this.anInt2494);
	}

	@OriginalMember(owner = "client!akw", name = "wo", descriptor = "()V", line = 381)
	@Override
	void method17649() {
		IDirect3DDevice.SetScissorRect(this.aLong104, this.anInt2528 + this.anInt2495, this.anInt2503 + this.anInt2493, this.anInt2496, this.anInt2494);
	}

	@OriginalMember(owner = "client!akw", name = "wk", descriptor = "()V", line = 381)
	@Override
	void method17484() {
		IDirect3DDevice.SetScissorRect(this.aLong104, this.anInt2528 + this.anInt2495, this.anInt2503 + this.anInt2493, this.anInt2496, this.anInt2494);
	}

	@OriginalMember(owner = "client!akw", name = "wq", descriptor = "()V", line = 381)
	@Override
	void method17670() {
		IDirect3DDevice.SetScissorRect(this.aLong104, this.anInt2528 + this.anInt2495, this.anInt2503 + this.anInt2493, this.anInt2496, this.anInt2494);
	}

	@OriginalMember(owner = "client!akw", name = "qw", descriptor = "()V", line = 385)
	@Override
	void method17468() {
		IDirect3DDevice.method25087(this.aLong104, 174, this.aBoolean449);
	}

	@OriginalMember(owner = "client!akw", name = "wf", descriptor = "()V", line = 385)
	@Override
	void method17653() {
		IDirect3DDevice.method25087(this.aLong104, 174, this.aBoolean449);
	}

	@OriginalMember(owner = "client!akw", name = "wh", descriptor = "()V", line = 385)
	@Override
	void method17651() {
		IDirect3DDevice.method25087(this.aLong104, 174, this.aBoolean449);
	}

	@OriginalMember(owner = "client!akw", name = "wl", descriptor = "()V", line = 385)
	@Override
	void method17576() {
		IDirect3DDevice.method25087(this.aLong104, 174, this.aBoolean449);
	}

	@OriginalMember(owner = "client!akw", name = "aez", descriptor = "(J)V", line = 389)
	final void method17838(@OriginalArg(0) long arg0) {
		this.aLong107 = arg0;
		IDirect3DDevice.SetVertexShader(this.aLong104, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "afn", descriptor = "(J)V", line = 389)
	final void method17847(@OriginalArg(0) long arg0) {
		this.aLong107 = arg0;
		IDirect3DDevice.SetVertexShader(this.aLong104, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "afd", descriptor = "(J)V", line = 389)
	final void method17848(@OriginalArg(0) long arg0) {
		this.aLong107 = arg0;
		IDirect3DDevice.SetVertexShader(this.aLong104, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "afo", descriptor = "(J)V", line = 389)
	final void method17857(@OriginalArg(0) long arg0) {
		this.aLong107 = arg0;
		IDirect3DDevice.SetVertexShader(this.aLong104, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "afr", descriptor = "(J)V", line = 389)
	final void method17858(@OriginalArg(0) long arg0) {
		this.aLong107 = arg0;
		IDirect3DDevice.SetVertexShader(this.aLong104, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "aem", descriptor = "(J)V", line = 394)
	final void method17824(@OriginalArg(0) long arg0) {
		IDirect3DDevice.SetPixelShader(this.aLong104, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "afw", descriptor = "(J)V", line = 394)
	final void method17859(@OriginalArg(0) long arg0) {
		IDirect3DDevice.SetPixelShader(this.aLong104, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "afh", descriptor = "(J)V", line = 394)
	final void method17860(@OriginalArg(0) long arg0) {
		IDirect3DDevice.SetPixelShader(this.aLong104, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "afl", descriptor = "(J)V", line = 394)
	final void method17861(@OriginalArg(0) long arg0) {
		IDirect3DDevice.SetPixelShader(this.aLong104, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "pg", descriptor = "(Lclient!mq;Lclient!mq;Lclient!mq;)V", line = 398)
	@Override
	public void method17438(@OriginalArg(0) Class328 arg0, @OriginalArg(1) Class328 arg1, @OriginalArg(2) Class328 arg2) {
		IDirect3DDevice.SetTransform(this.aLong104, 256, arg0.aFloatArray106);
		IDirect3DDevice.SetTransform(this.aLong104, 2, arg1.aFloatArray106);
		IDirect3DDevice.SetTransform(this.aLong104, 3, arg2.aFloatArray106);
	}

	@OriginalMember(owner = "client!akw", name = "um", descriptor = "(Lclient!mq;Lclient!mq;Lclient!mq;)V", line = 398)
	@Override
	public void method17608(@OriginalArg(0) Class328 arg0, @OriginalArg(1) Class328 arg1, @OriginalArg(2) Class328 arg2) {
		IDirect3DDevice.SetTransform(this.aLong104, 256, arg0.aFloatArray106);
		IDirect3DDevice.SetTransform(this.aLong104, 2, arg1.aFloatArray106);
		IDirect3DDevice.SetTransform(this.aLong104, 3, arg2.aFloatArray106);
	}

	@OriginalMember(owner = "client!akw", name = "qu", descriptor = "(Lclient!mq;)V", line = 404)
	@Override
	public void method17483(@OriginalArg(0) Class328 arg0) {
		arg0.method26046(this.aClass328_94);
	}

	@OriginalMember(owner = "client!akw", name = "xl", descriptor = "(Lclient!mq;)V", line = 404)
	@Override
	public void method17668(@OriginalArg(0) Class328 arg0) {
		arg0.method26046(this.aClass328_94);
	}

	@OriginalMember(owner = "client!akw", name = "xi", descriptor = "(Lclient!mq;)V", line = 404)
	@Override
	public void method17669(@OriginalArg(0) Class328 arg0) {
		arg0.method26046(this.aClass328_94);
	}

	@OriginalMember(owner = "client!akw", name = "yn", descriptor = "()V", line = 408)
	@Override
	void method17575() {
		IDirect3DDevice.method25087(this.aLong104, 7, this.aBoolean428);
	}

	@OriginalMember(owner = "client!akw", name = "ry", descriptor = "()V", line = 408)
	@Override
	void method17793() {
		IDirect3DDevice.method25087(this.aLong104, 7, this.aBoolean428);
	}

	@OriginalMember(owner = "client!akw", name = "yq", descriptor = "()V", line = 412)
	@Override
	void method17687() {
		IDirect3DDevice.method25087(this.aLong104, 14, this.aBoolean434 && this.aBoolean429);
	}

	@OriginalMember(owner = "client!akw", name = "rr", descriptor = "()V", line = 412)
	@Override
	void method17490() {
		IDirect3DDevice.method25087(this.aLong104, 14, this.aBoolean434 && this.aBoolean429);
	}

	@OriginalMember(owner = "client!akw", name = "yy", descriptor = "()V", line = 412)
	@Override
	void method17688() {
		IDirect3DDevice.method25087(this.aLong104, 14, this.aBoolean434 && this.aBoolean429);
	}

	@OriginalMember(owner = "client!akw", name = "yk", descriptor = "()V", line = 412)
	@Override
	void method17566() {
		IDirect3DDevice.method25087(this.aLong104, 14, this.aBoolean434 && this.aBoolean429);
	}

	@OriginalMember(owner = "client!akw", name = "rw", descriptor = "()V", line = 416)
	@Override
	void method17493() {
		if (this.aBoolean422) {
			IDirect3DDevice.method25087(this.aLong104, 137, this.aBoolean430 && !this.aBoolean425);
		}
	}

	@OriginalMember(owner = "client!akw", name = "yw", descriptor = "()V", line = 416)
	@Override
	void method17515() {
		if (this.aBoolean422) {
			IDirect3DDevice.method25087(this.aLong104, 137, this.aBoolean430 && !this.aBoolean425);
		}
	}

	@OriginalMember(owner = "client!akw", name = "rc", descriptor = "()V", line = 422)
	@Override
	void method17494() {
		if (this.aBoolean422) {
			D3DLIGHT.SetAmbient(this.aLong102, this.aFloat193 * this.aFloat197, this.aFloat194 * this.aFloat197, this.aFloat185 * this.aFloat197, 0.0F);
			this.aBoolean450 = false;
		}
	}

	@OriginalMember(owner = "client!akw", name = "yz", descriptor = "()V", line = 422)
	@Override
	void method17691() {
		if (this.aBoolean422) {
			D3DLIGHT.SetAmbient(this.aLong102, this.aFloat193 * this.aFloat197, this.aFloat194 * this.aFloat197, this.aFloat185 * this.aFloat197, 0.0F);
			this.aBoolean450 = false;
		}
	}

	@OriginalMember(owner = "client!akw", name = "ya", descriptor = "()V", line = 429)
	@Override
	void method17528() {
		if (!this.aBoolean422) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean431 ? this.aFloat195 : 0.0F;
		@Pc(19) float local19 = this.aBoolean431 ? -this.aFloat196 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong102, local10 * this.aFloat193, local10 * this.aFloat194, local10 * this.aFloat185, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong105, local19 * this.aFloat193, local19 * this.aFloat194, local19 * this.aFloat185, 0.0F);
		this.aBoolean450 = false;
	}

	@OriginalMember(owner = "client!akw", name = "ro", descriptor = "()V", line = 429)
	@Override
	void method17495() {
		if (!this.aBoolean422) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean431 ? this.aFloat195 : 0.0F;
		@Pc(19) float local19 = this.aBoolean431 ? -this.aFloat196 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong102, local10 * this.aFloat193, local10 * this.aFloat194, local10 * this.aFloat185, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong105, local19 * this.aFloat193, local19 * this.aFloat194, local19 * this.aFloat185, 0.0F);
		this.aBoolean450 = false;
	}

	@OriginalMember(owner = "client!akw", name = "yp", descriptor = "()V", line = 429)
	@Override
	void method17693() {
		if (!this.aBoolean422) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean431 ? this.aFloat195 : 0.0F;
		@Pc(19) float local19 = this.aBoolean431 ? -this.aFloat196 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong102, local10 * this.aFloat193, local10 * this.aFloat194, local10 * this.aFloat185, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong105, local19 * this.aFloat193, local19 * this.aFloat194, local19 * this.aFloat185, 0.0F);
		this.aBoolean450 = false;
	}

	@OriginalMember(owner = "client!akw", name = "yo", descriptor = "()V", line = 429)
	@Override
	void method17694() {
		if (!this.aBoolean422) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean431 ? this.aFloat195 : 0.0F;
		@Pc(19) float local19 = this.aBoolean431 ? -this.aFloat196 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong102, local10 * this.aFloat193, local10 * this.aFloat194, local10 * this.aFloat185, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong105, local19 * this.aFloat193, local19 * this.aFloat194, local19 * this.aFloat185, 0.0F);
		this.aBoolean450 = false;
	}

	@OriginalMember(owner = "client!akw", name = "yc", descriptor = "()V", line = 429)
	@Override
	void method17695() {
		if (!this.aBoolean422) {
			return;
		}
		@Pc(10) float local10 = this.aBoolean431 ? this.aFloat195 : 0.0F;
		@Pc(19) float local19 = this.aBoolean431 ? -this.aFloat196 : 0.0F;
		D3DLIGHT.SetDiffuse(this.aLong102, local10 * this.aFloat193, local10 * this.aFloat194, local10 * this.aFloat185, 0.0F);
		D3DLIGHT.SetDiffuse(this.aLong105, local19 * this.aFloat193, local19 * this.aFloat194, local19 * this.aFloat185, 0.0F);
		this.aBoolean450 = false;
	}

	@OriginalMember(owner = "client!akw", name = "rq", descriptor = "()V", line = 439)
	@Override
	void method17496() {
		if (this.aBoolean422) {
			D3DLIGHT.SetDirection(this.aLong102, -this.aFloatArray76[0], -this.aFloatArray76[1], -this.aFloatArray76[2]);
			D3DLIGHT.SetDirection(this.aLong105, -this.aFloatArray77[0], -this.aFloatArray77[1], -this.aFloatArray77[2]);
			this.aBoolean450 = false;
		}
	}

	@OriginalMember(owner = "client!akw", name = "yr", descriptor = "()V", line = 439)
	@Override
	void method17584() {
		if (this.aBoolean422) {
			D3DLIGHT.SetDirection(this.aLong102, -this.aFloatArray76[0], -this.aFloatArray76[1], -this.aFloatArray76[2]);
			D3DLIGHT.SetDirection(this.aLong105, -this.aFloatArray77[0], -this.aFloatArray77[1], -this.aFloatArray77[2]);
			this.aBoolean450 = false;
		}
	}

	@OriginalMember(owner = "client!akw", name = "yu", descriptor = "()V", line = 439)
	@Override
	void method17697() {
		if (this.aBoolean422) {
			D3DLIGHT.SetDirection(this.aLong102, -this.aFloatArray76[0], -this.aFloatArray76[1], -this.aFloatArray76[2]);
			D3DLIGHT.SetDirection(this.aLong105, -this.aFloatArray77[0], -this.aFloatArray77[1], -this.aFloatArray77[2]);
			this.aBoolean450 = false;
		}
	}

	@OriginalMember(owner = "client!akw", name = "rg", descriptor = "()V", line = 447)
	@Override
	void method17536() {
		this.method17495();
		this.method17497();
	}

	@OriginalMember(owner = "client!akw", name = "yv", descriptor = "()V", line = 447)
	@Override
	void method17700() {
		this.method17495();
		this.method17497();
	}

	@OriginalMember(owner = "client!akw", name = "yg", descriptor = "()V", line = 447)
	@Override
	void method17701() {
		this.method17495();
		this.method17497();
	}

	@OriginalMember(owner = "client!akw", name = "ra", descriptor = "()V", line = 452)
	@Override
	void method17497() {
		if (!this.aBoolean422 || this.aBoolean450) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong104, 0, false);
		IDirect3DDevice.LightEnable(this.aLong104, 1, false);
		IDirect3DDevice.SetLight(this.aLong104, 0, this.aLong102);
		IDirect3DDevice.SetLight(this.aLong104, 1, this.aLong105);
		IDirect3DDevice.LightEnable(this.aLong104, 0, true);
		IDirect3DDevice.LightEnable(this.aLong104, 1, true);
		this.aBoolean450 = true;
	}

	@OriginalMember(owner = "client!akw", name = "yt", descriptor = "()V", line = 452)
	@Override
	void method17698() {
		if (!this.aBoolean422 || this.aBoolean450) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong104, 0, false);
		IDirect3DDevice.LightEnable(this.aLong104, 1, false);
		IDirect3DDevice.SetLight(this.aLong104, 0, this.aLong102);
		IDirect3DDevice.SetLight(this.aLong104, 1, this.aLong105);
		IDirect3DDevice.LightEnable(this.aLong104, 0, true);
		IDirect3DDevice.LightEnable(this.aLong104, 1, true);
		this.aBoolean450 = true;
	}

	@OriginalMember(owner = "client!akw", name = "yd", descriptor = "()V", line = 452)
	@Override
	void method17456() {
		if (!this.aBoolean422 || this.aBoolean450) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong104, 0, false);
		IDirect3DDevice.LightEnable(this.aLong104, 1, false);
		IDirect3DDevice.SetLight(this.aLong104, 0, this.aLong102);
		IDirect3DDevice.SetLight(this.aLong104, 1, this.aLong105);
		IDirect3DDevice.LightEnable(this.aLong104, 0, true);
		IDirect3DDevice.LightEnable(this.aLong104, 1, true);
		this.aBoolean450 = true;
	}

	@OriginalMember(owner = "client!akw", name = "yb", descriptor = "()V", line = 452)
	@Override
	void method17598() {
		if (!this.aBoolean422 || this.aBoolean450) {
			return;
		}
		IDirect3DDevice.LightEnable(this.aLong104, 0, false);
		IDirect3DDevice.LightEnable(this.aLong104, 1, false);
		IDirect3DDevice.SetLight(this.aLong104, 0, this.aLong102);
		IDirect3DDevice.SetLight(this.aLong104, 1, this.aLong105);
		IDirect3DDevice.LightEnable(this.aLong104, 0, true);
		IDirect3DDevice.LightEnable(this.aLong104, 1, true);
		this.aBoolean450 = true;
	}

	@OriginalMember(owner = "client!akw", name = "yf", descriptor = "()V", line = 466)
	@Override
	void method17798() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2509; local1++) {
			@Pc(10) Class3_Sub15 local10 = this.aClass3_Sub15Array19[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method11279();
			@Pc(24) float local24 = local10.method11300() / 255.0F;
			D3DLIGHT.SetPosition(this.aLong106, (float) local10.method11280(), (float) local10.method11281(), (float) local10.method11282());
			D3DLIGHT.SetDiffuse(this.aLong106, (float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong106, 0.0F, 0.0F, 1.0F / (float) (local10.method11291() * local10.method11291()));
			D3DLIGHT.SetRange(this.aLong106, (float) local10.method11291());
			IDirect3DDevice.SetLight(this.aLong104, local14, this.aLong106);
			IDirect3DDevice.LightEnable(this.aLong104, local14, true);
		}
		while (local1 < this.anInt2508) {
			IDirect3DDevice.LightEnable(this.aLong104, local1 + 2, false);
			local1++;
		}
	}

	@OriginalMember(owner = "client!akw", name = "yi", descriptor = "()V", line = 466)
	@Override
	void method17704() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2509; local1++) {
			@Pc(10) Class3_Sub15 local10 = this.aClass3_Sub15Array19[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method11279();
			@Pc(24) float local24 = local10.method11300() / 255.0F;
			D3DLIGHT.SetPosition(this.aLong106, (float) local10.method11280(), (float) local10.method11281(), (float) local10.method11282());
			D3DLIGHT.SetDiffuse(this.aLong106, (float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong106, 0.0F, 0.0F, 1.0F / (float) (local10.method11291() * local10.method11291()));
			D3DLIGHT.SetRange(this.aLong106, (float) local10.method11291());
			IDirect3DDevice.SetLight(this.aLong104, local14, this.aLong106);
			IDirect3DDevice.LightEnable(this.aLong104, local14, true);
		}
		while (local1 < this.anInt2508) {
			IDirect3DDevice.LightEnable(this.aLong104, local1 + 2, false);
			local1++;
		}
	}

	@OriginalMember(owner = "client!akw", name = "rb", descriptor = "()V", line = 466)
	@Override
	void method17499() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2509; local1++) {
			@Pc(10) Class3_Sub15 local10 = this.aClass3_Sub15Array19[local1];
			@Pc(14) int local14 = local1 + 2;
			@Pc(18) int local18 = local10.method11279();
			@Pc(24) float local24 = local10.method11300() / 255.0F;
			D3DLIGHT.SetPosition(this.aLong106, (float) local10.method11280(), (float) local10.method11281(), (float) local10.method11282());
			D3DLIGHT.SetDiffuse(this.aLong106, (float) (local18 >> 16 & 0xFF) * local24, (float) (local18 >> 8 & 0xFF) * local24, (float) (local18 & 0xFF) * local24, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong106, 0.0F, 0.0F, 1.0F / (float) (local10.method11291() * local10.method11291()));
			D3DLIGHT.SetRange(this.aLong106, (float) local10.method11291());
			IDirect3DDevice.SetLight(this.aLong104, local14, this.aLong106);
			IDirect3DDevice.LightEnable(this.aLong104, local14, true);
		}
		while (local1 < this.anInt2508) {
			IDirect3DDevice.LightEnable(this.aLong104, local1 + 2, false);
			local1++;
		}
	}

	@OriginalMember(owner = "client!akw", name = "rt", descriptor = "(Lclient!cw;Lclient!dj;)Z", line = 485)
	@Override
	boolean method17768(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return p.method25092(IDirect3D.GetAdapterDisplayMode(this.aLong103, this.anInt2529, local3)) && p.method25092(IDirect3D.CheckDeviceFormat(this.aLong103, this.anInt2529, this.anInt2530, local3.Format, 0, 3, method17833(arg0, arg1)));
	}

	@OriginalMember(owner = "client!akw", name = "zc", descriptor = "(Lclient!cw;Lclient!dj;)Z", line = 485)
	@Override
	boolean method17452(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return p.method25092(IDirect3D.GetAdapterDisplayMode(this.aLong103, this.anInt2529, local3)) && p.method25092(IDirect3D.CheckDeviceFormat(this.aLong103, this.anInt2529, this.anInt2530, local3.Format, 0, 3, method17833(arg0, arg1)));
	}

	@OriginalMember(owner = "client!akw", name = "rh", descriptor = "(Lclient!cw;Lclient!dj;)Z", line = 490)
	@Override
	boolean method17500(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return p.method25092(IDirect3D.GetAdapterDisplayMode(this.aLong103, this.anInt2529, local3)) && p.method25092(IDirect3D.CheckDeviceFormat(this.aLong103, this.anInt2529, this.anInt2530, local3.Format, 0, 4, method17833(arg0, arg1)));
	}

	@OriginalMember(owner = "client!akw", name = "zi", descriptor = "(Lclient!cw;Lclient!dj;)Z", line = 490)
	@Override
	boolean method17706(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1) {
		@Pc(3) D3DDISPLAYMODE local3 = new D3DDISPLAYMODE();
		return p.method25092(IDirect3D.GetAdapterDisplayMode(this.aLong103, this.anInt2529, local3)) && p.method25092(IDirect3D.CheckDeviceFormat(this.aLong103, this.anInt2529, this.anInt2530, local3.Format, 0, 4, method17833(arg0, arg1)));
	}

	@OriginalMember(owner = "client!akw", name = "zj", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!ic;", line = 495)
	@Override
	Interface20 method17713(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class29_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!akw", name = "zm", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!ic;", line = 495)
	@Override
	Interface20 method17714(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class29_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!akw", name = "rn", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!ic;", line = 495)
	@Override
	Interface20 method17504(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class29_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!akw", name = "zw", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!ic;", line = 495)
	@Override
	Interface20 method17715(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class29_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!akw", name = "ru", descriptor = "(IIZ[III)Lclient!ic;", line = 499)
	@Override
	Interface20 method17507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class29_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!akw", name = "zp", descriptor = "(IIZ[III)Lclient!ic;", line = 499)
	@Override
	Interface20 method17709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class29_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!akw", name = "zu", descriptor = "(IIZ[III)Lclient!ic;", line = 499)
	@Override
	Interface20 method17616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class29_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!akw", name = "zv", descriptor = "(Lclient!cw;IIZ[BII)Lclient!ic;", line = 503)
	@Override
	Interface20 method17716(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class29_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!akw", name = "ze", descriptor = "(Lclient!cw;IIZ[BII)Lclient!ic;", line = 503)
	@Override
	Interface20 method17717(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class29_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!akw", name = "rl", descriptor = "(Lclient!cw;IIZ[BII)Lclient!ic;", line = 503)
	@Override
	Interface20 method17505(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class29_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!akw", name = "zn", descriptor = "(Lclient!cw;IIZ[FII)Lclient!ic;", line = 507)
	@Override
	Interface20 method17667(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class29_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!akw", name = "zq", descriptor = "(Lclient!cw;IIZ[FII)Lclient!ic;", line = 507)
	@Override
	Interface20 method17574(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class29_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!akw", name = "rm", descriptor = "(Lclient!cw;IIZ[FII)Lclient!ic;", line = 507)
	@Override
	Interface20 method17506(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class29_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!akw", name = "rv", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!jt;", line = 511)
	@Override
	Interface29 method17510(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class29_Sub1_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!akw", name = "zy", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!jt;", line = 511)
	@Override
	Interface29 method17724(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class29_Sub1_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!akw", name = "za", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!jt;", line = 511)
	@Override
	Interface29 method17757(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class29_Sub1_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!akw", name = "rx", descriptor = "(IZ[[I)Lclient!jk;", line = 515)
	@Override
	Interface27 method17508(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class29_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akw", name = "zb", descriptor = "(IZ[[I)Lclient!jk;", line = 515)
	@Override
	Interface27 method17721(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class29_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akw", name = "zl", descriptor = "(IZ[[I)Lclient!jk;", line = 515)
	@Override
	Interface27 method17722(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class29_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akw", name = "zh", descriptor = "(IZ[[I)Lclient!jk;", line = 515)
	@Override
	Interface27 method17720(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class29_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akw", name = "re", descriptor = "(Lclient!cw;IIIZ[B)Lclient!in;", line = 519)
	@Override
	Interface23 method17509(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class29_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!akw", name = "zf", descriptor = "(Lclient!cw;IIIZ[B)Lclient!in;", line = 519)
	@Override
	Interface23 method17527(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class29_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!akw", name = "zx", descriptor = "(Lclient!cw;IIIZ[B)Lclient!in;", line = 519)
	@Override
	Interface23 method17723(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class29_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!akw", name = "aew", descriptor = "(Lclient!lg;)V", line = 523)
	final void method17827(@OriginalArg(0) Class29 arg0) {
		IDirect3DDevice.SetTexture(this.aLong104, this.anInt2516, arg0.method8720());
		if (this.aBoolean422 && !this.aBooleanArray15[this.anInt2516]) {
			this.aBooleanArray15[this.anInt2516] = true;
			this.method17526();
			this.method17525();
		}
	}

	@OriginalMember(owner = "client!akw", name = "afc", descriptor = "(Lclient!ada;)V", line = 532)
	final void method17823(@OriginalArg(0) Class29_Sub1 arg0) {
		this.method17827(arg0);
		if (this.aBooleanArray18[this.anInt2516] != arg0.aBoolean192) {
			IDirect3DDevice.SetSamplerState(this.aLong104, this.anInt2516, 1, arg0.aBoolean192 ? 1 : 3);
			this.aBooleanArray18[this.anInt2516] = arg0.aBoolean192;
		}
		if (this.aBooleanArray17[this.anInt2516] != arg0.aBoolean193) {
			IDirect3DDevice.SetSamplerState(this.aLong104, this.anInt2516, 2, arg0.aBoolean193 ? 1 : 3);
			this.aBooleanArray17[this.anInt2516] = arg0.aBoolean193;
		}
	}

	@OriginalMember(owner = "client!akw", name = "afa", descriptor = "(Lclient!ada;)V", line = 532)
	final void method17825(@OriginalArg(0) Class29_Sub1 arg0) {
		this.method17827(arg0);
		if (this.aBooleanArray18[this.anInt2516] != arg0.aBoolean192) {
			IDirect3DDevice.SetSamplerState(this.aLong104, this.anInt2516, 1, arg0.aBoolean192 ? 1 : 3);
			this.aBooleanArray18[this.anInt2516] = arg0.aBoolean192;
		}
		if (this.aBooleanArray17[this.anInt2516] != arg0.aBoolean193) {
			IDirect3DDevice.SetSamplerState(this.aLong104, this.anInt2516, 2, arg0.aBoolean193 ? 1 : 3);
			this.aBooleanArray17[this.anInt2516] = arg0.aBoolean193;
		}
	}

	@OriginalMember(owner = "client!akw", name = "aff", descriptor = "(Lclient!ada;)V", line = 532)
	final void method17829(@OriginalArg(0) Class29_Sub1 arg0) {
		this.method17827(arg0);
		if (this.aBooleanArray18[this.anInt2516] != arg0.aBoolean192) {
			IDirect3DDevice.SetSamplerState(this.aLong104, this.anInt2516, 1, arg0.aBoolean192 ? 1 : 3);
			this.aBooleanArray18[this.anInt2516] = arg0.aBoolean192;
		}
		if (this.aBooleanArray17[this.anInt2516] != arg0.aBoolean193) {
			IDirect3DDevice.SetSamplerState(this.aLong104, this.anInt2516, 2, arg0.aBoolean193 ? 1 : 3);
			this.aBooleanArray17[this.anInt2516] = arg0.aBoolean193;
		}
	}

	@OriginalMember(owner = "client!akw", name = "aed", descriptor = "(Lclient!ada;)V", line = 532)
	final void method17845(@OriginalArg(0) Class29_Sub1 arg0) {
		this.method17827(arg0);
		if (this.aBooleanArray18[this.anInt2516] != arg0.aBoolean192) {
			IDirect3DDevice.SetSamplerState(this.aLong104, this.anInt2516, 1, arg0.aBoolean192 ? 1 : 3);
			this.aBooleanArray18[this.anInt2516] = arg0.aBoolean192;
		}
		if (this.aBooleanArray17[this.anInt2516] != arg0.aBoolean193) {
			IDirect3DDevice.SetSamplerState(this.aLong104, this.anInt2516, 2, arg0.aBoolean193 ? 1 : 3);
			this.aBooleanArray17[this.anInt2516] = arg0.aBoolean193;
		}
	}

	@OriginalMember(owner = "client!akw", name = "aeb", descriptor = "(Lclient!adu;)V", line = 544)
	final void method17828(@OriginalArg(0) Class29_Sub2 arg0) {
		this.method17827(arg0);
		if (!this.aBooleanArray18[this.anInt2516]) {
			IDirect3DDevice.SetSamplerState(this.aLong104, this.anInt2516, 1, 1);
			this.aBooleanArray18[this.anInt2516] = true;
		}
		if (!this.aBooleanArray17[this.anInt2516]) {
			IDirect3DDevice.SetSamplerState(this.aLong104, this.anInt2516, 2, 1);
			this.aBooleanArray17[this.anInt2516] = true;
		}
	}

	@OriginalMember(owner = "client!akw", name = "afp", descriptor = "(Lclient!adu;)V", line = 544)
	final void method17843(@OriginalArg(0) Class29_Sub2 arg0) {
		this.method17827(arg0);
		if (!this.aBooleanArray18[this.anInt2516]) {
			IDirect3DDevice.SetSamplerState(this.aLong104, this.anInt2516, 1, 1);
			this.aBooleanArray18[this.anInt2516] = true;
		}
		if (!this.aBooleanArray17[this.anInt2516]) {
			IDirect3DDevice.SetSamplerState(this.aLong104, this.anInt2516, 2, 1);
			this.aBooleanArray17[this.anInt2516] = true;
		}
	}

	@OriginalMember(owner = "client!akw", name = "afk", descriptor = "(Lclient!adu;)V", line = 544)
	final void method17862(@OriginalArg(0) Class29_Sub2 arg0) {
		this.method17827(arg0);
		if (!this.aBooleanArray18[this.anInt2516]) {
			IDirect3DDevice.SetSamplerState(this.aLong104, this.anInt2516, 1, 1);
			this.aBooleanArray18[this.anInt2516] = true;
		}
		if (!this.aBooleanArray17[this.anInt2516]) {
			IDirect3DDevice.SetSamplerState(this.aLong104, this.anInt2516, 2, 1);
			this.aBooleanArray17[this.anInt2516] = true;
		}
	}

	@OriginalMember(owner = "client!akw", name = "aft", descriptor = "(Lclient!adu;)V", line = 544)
	final void method17863(@OriginalArg(0) Class29_Sub2 arg0) {
		this.method17827(arg0);
		if (!this.aBooleanArray18[this.anInt2516]) {
			IDirect3DDevice.SetSamplerState(this.aLong104, this.anInt2516, 1, 1);
			this.aBooleanArray18[this.anInt2516] = true;
		}
		if (!this.aBooleanArray17[this.anInt2516]) {
			IDirect3DDevice.SetSamplerState(this.aLong104, this.anInt2516, 2, 1);
			this.aBooleanArray17[this.anInt2516] = true;
		}
	}

	@OriginalMember(owner = "client!akw", name = "sk", descriptor = "()V", line = 556)
	@Override
	public void method17514() {
		if (this.aBooleanArray15[this.anInt2516]) {
			this.aBooleanArray15[this.anInt2516] = false;
			IDirect3DDevice.SetTexture(this.aLong104, this.anInt2516, 0L);
			this.method17526();
			this.method17525();
		}
	}

	@OriginalMember(owner = "client!akw", name = "aat", descriptor = "()V", line = 556)
	@Override
	public void method17731() {
		if (this.aBooleanArray15[this.anInt2516]) {
			this.aBooleanArray15[this.anInt2516] = false;
			IDirect3DDevice.SetTexture(this.aLong104, this.anInt2516, 0L);
			this.method17526();
			this.method17525();
		}
	}

	@OriginalMember(owner = "client!akw", name = "aaz", descriptor = "()V", line = 556)
	@Override
	public void method17732() {
		if (this.aBooleanArray15[this.anInt2516]) {
			this.aBooleanArray15[this.anInt2516] = false;
			IDirect3DDevice.SetTexture(this.aLong104, this.anInt2516, 0L);
			this.method17526();
			this.method17525();
		}
	}

	@OriginalMember(owner = "client!akw", name = "aaw", descriptor = "()V", line = 556)
	@Override
	public void method17561() {
		if (this.aBooleanArray15[this.anInt2516]) {
			this.aBooleanArray15[this.anInt2516] = false;
			IDirect3DDevice.SetTexture(this.aLong104, this.anInt2516, 0L);
			this.method17526();
			this.method17525();
		}
	}

	@OriginalMember(owner = "client!akw", name = "abx", descriptor = "()V", line = 565)
	@Override
	void method17563() {
		if (this.aLong107 != 0L || this.aClass268Array3[this.anInt2516] == Class268.aClass268_1) {
			IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, 24, 0);
			this.anIntArray252[this.anInt2516] = 0;
			return;
		}
		if (this.aClass268Array3[this.anInt2516] == Class268.aClass268_3) {
			IDirect3DDevice.SetTransform(this.aLong104, this.anInt2516 + 16, this.aClass328Array6[this.anInt2516].method26156(this.aFloatArray80));
		} else {
			IDirect3DDevice.SetTransform(this.aLong104, this.anInt2516 + 16, this.aClass328Array6[this.anInt2516].method26151(this.aFloatArray80));
		}
		@Pc(58) int local58 = method17831(this.aClass268Array3[this.anInt2516]);
		if (local58 != this.anIntArray252[this.anInt2516]) {
			IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, 24, local58);
			this.anIntArray252[this.anInt2516] = local58;
		}
	}

	@OriginalMember(owner = "client!akw", name = "sl", descriptor = "()V", line = 565)
	@Override
	void method17523() {
		if (this.aLong107 != 0L || this.aClass268Array3[this.anInt2516] == Class268.aClass268_1) {
			IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, 24, 0);
			this.anIntArray252[this.anInt2516] = 0;
			return;
		}
		if (this.aClass268Array3[this.anInt2516] == Class268.aClass268_3) {
			IDirect3DDevice.SetTransform(this.aLong104, this.anInt2516 + 16, this.aClass328Array6[this.anInt2516].method26156(this.aFloatArray80));
		} else {
			IDirect3DDevice.SetTransform(this.aLong104, this.anInt2516 + 16, this.aClass328Array6[this.anInt2516].method26151(this.aFloatArray80));
		}
		@Pc(58) int local58 = method17831(this.aClass268Array3[this.anInt2516]);
		if (local58 != this.anIntArray252[this.anInt2516]) {
			IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, 24, local58);
			this.anIntArray252[this.anInt2516] = local58;
		}
	}

	@OriginalMember(owner = "client!akw", name = "abz", descriptor = "()V", line = 580)
	@Override
	void method17759() {
	}

	@OriginalMember(owner = "client!akw", name = "sq", descriptor = "()V", line = 580)
	@Override
	void method17582() {
	}

	@OriginalMember(owner = "client!akw", name = "abk", descriptor = "()V", line = 580)
	@Override
	void method17503() {
	}

	@OriginalMember(owner = "client!akw", name = "abw", descriptor = "()V", line = 580)
	@Override
	void method17450() {
	}

	@OriginalMember(owner = "client!akw", name = "abi", descriptor = "()V", line = 580)
	@Override
	void method17550() {
	}

	@OriginalMember(owner = "client!akw", name = "abl", descriptor = "()V", line = 580)
	@Override
	void method17760() {
	}

	@OriginalMember(owner = "client!akw", name = "abt", descriptor = "()V", line = 583)
	@Override
	void method17498() {
		if (this.aBoolean422) {
			@Pc(17) int local17 = this.aBooleanArray15[this.anInt2516] ? method17846(this.aClass251Array5[this.anInt2516]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, 1, local17);
		}
	}

	@OriginalMember(owner = "client!akw", name = "abv", descriptor = "()V", line = 583)
	@Override
	void method17761() {
		if (this.aBoolean422) {
			@Pc(17) int local17 = this.aBooleanArray15[this.anInt2516] ? method17846(this.aClass251Array5[this.anInt2516]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, 1, local17);
		}
	}

	@OriginalMember(owner = "client!akw", name = "so", descriptor = "()V", line = 583)
	@Override
	void method17525() {
		if (this.aBoolean422) {
			@Pc(17) int local17 = this.aBooleanArray15[this.anInt2516] ? method17846(this.aClass251Array5[this.anInt2516]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, 1, local17);
		}
	}

	@OriginalMember(owner = "client!akw", name = "sh", descriptor = "()V", line = 590)
	@Override
	void method17526() {
		if (this.aBoolean422) {
			@Pc(17) int local17 = this.aBooleanArray15[this.anInt2516] ? method17846(this.aClass251Array6[this.anInt2516]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, 4, local17);
		}
	}

	@OriginalMember(owner = "client!akw", name = "adm", descriptor = "()V", line = 590)
	@Override
	void method17813() {
		if (this.aBoolean422) {
			@Pc(17) int local17 = this.aBooleanArray15[this.anInt2516] ? method17846(this.aClass251Array6[this.anInt2516]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, 4, local17);
		}
	}

	@OriginalMember(owner = "client!akw", name = "adz", descriptor = "()V", line = 590)
	@Override
	void method17753() {
		if (this.aBoolean422) {
			@Pc(17) int local17 = this.aBooleanArray15[this.anInt2516] ? method17846(this.aClass251Array6[this.anInt2516]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, 4, local17);
		}
	}

	@OriginalMember(owner = "client!akw", name = "sd", descriptor = "(ILclient!jg;ZZ)V", line = 597)
	@Override
	final void method17517(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!this.aBoolean422) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, local8, method17830(arg1) | local4);
	}

	@OriginalMember(owner = "client!akw", name = "aay", descriptor = "(ILclient!jg;ZZ)V", line = 597)
	@Override
	final void method17767(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!this.aBoolean422) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, local8, method17830(arg1) | local4);
	}

	@OriginalMember(owner = "client!akw", name = "aam", descriptor = "(ILclient!jg;ZZ)V", line = 597)
	@Override
	final void method17743(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!this.aBoolean422) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, local8, method17830(arg1) | local4);
	}

	@OriginalMember(owner = "client!akw", name = "sr", descriptor = "(ILclient!jg;Z)V", line = 618)
	@Override
	final void method17518(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean422) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, local8, method17830(arg1) | local4);
	}

	@OriginalMember(owner = "client!akw", name = "aas", descriptor = "(ILclient!jg;Z)V", line = 618)
	@Override
	final void method17746(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean422) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, local8, method17830(arg1) | local4);
	}

	@OriginalMember(owner = "client!akw", name = "aan", descriptor = "(ILclient!jg;Z)V", line = 618)
	@Override
	final void method17747(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean422) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, local8, method17830(arg1) | local4);
	}

	@OriginalMember(owner = "client!akw", name = "aak", descriptor = "(ILclient!jg;Z)V", line = 618)
	@Override
	final void method17748(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean422) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, local8, method17830(arg1) | local4);
	}

	@OriginalMember(owner = "client!akw", name = "aah", descriptor = "(ILclient!jg;Z)V", line = 618)
	@Override
	final void method17749(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean422) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, local8, method17830(arg1) | local4);
	}

	@OriginalMember(owner = "client!akw", name = "aac", descriptor = "(ILclient!jg;Z)V", line = 618)
	@Override
	final void method17750(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2) {
		if (!this.aBoolean422) {
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
		IDirect3DDevice.SetTextureStageState(this.aLong104, this.anInt2516, local8, method17830(arg1) | local4);
	}

	@OriginalMember(owner = "client!akw", name = "sm", descriptor = "()V", line = 638)
	@Override
	final void method17678() {
		if (this.aBoolean422) {
			IDirect3DDevice.SetRenderState(this.aLong104, 60, this.anInt2507);
		}
	}

	@OriginalMember(owner = "client!akw", name = "abq", descriptor = "()V", line = 638)
	@Override
	final void method17756() {
		if (this.aBoolean422) {
			IDirect3DDevice.SetRenderState(this.aLong104, 60, this.anInt2507);
		}
	}

	@OriginalMember(owner = "client!akw", name = "aep", descriptor = "(Lclient!ja;)I", line = 644)
	static final int method17846(@OriginalArg(0) Class251 arg0) {
		switch(arg0.anInt3831) {
			case 0:
				return 10;
			case 1:
				return 2;
			case 2:
				return 4;
			case 3:
				return 7;
			case 4:
				return 26;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!akw", name = "afe", descriptor = "(Lclient!ja;)I", line = 644)
	static final int method17864(@OriginalArg(0) Class251 arg0) {
		switch(arg0.anInt3831) {
			case 0:
				return 10;
			case 1:
				return 2;
			case 2:
				return 4;
			case 3:
				return 7;
			case 4:
				return 26;
			default:
				throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!akw", name = "aer", descriptor = "(Lclient!jg;)I", line = 661)
	static final int method17830(@OriginalArg(0) Class255 arg0) {
		switch(arg0.anInt4193) {
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

	@OriginalMember(owner = "client!akw", name = "afg", descriptor = "(Lclient!jg;)I", line = 661)
	static final int method17865(@OriginalArg(0) Class255 arg0) {
		switch(arg0.anInt4193) {
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

	@OriginalMember(owner = "client!akw", name = "afx", descriptor = "(Lclient!jz;)I", line = 676)
	static final int method17822(@OriginalArg(0) Class268 arg0) {
		switch(arg0.anInt4212) {
			case 0:
				return 4;
			case 1:
				return 2;
			case 2:
				return 1;
			case 3:
				return 3;
			case 4:
				return 256;
			default:
				return 0;
		}
	}

	@OriginalMember(owner = "client!akw", name = "aeo", descriptor = "(Lclient!jz;)I", line = 676)
	static final int method17831(@OriginalArg(0) Class268 arg0) {
		switch(arg0.anInt4212) {
			case 0:
				return 4;
			case 1:
				return 2;
			case 2:
				return 1;
			case 3:
				return 3;
			case 4:
				return 256;
			default:
				return 0;
		}
	}

	@OriginalMember(owner = "client!akw", name = "afi", descriptor = "(Lclient!jz;)I", line = 676)
	static final int method17866(@OriginalArg(0) Class268 arg0) {
		switch(arg0.anInt4212) {
			case 0:
				return 4;
			case 1:
				return 2;
			case 2:
				return 1;
			case 3:
				return 3;
			case 4:
				return 256;
			default:
				return 0;
		}
	}

	@OriginalMember(owner = "client!akw", name = "sv", descriptor = "(I)V", line = 693)
	@Override
	void method17532(@OriginalArg(0) int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong104, 168, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "aca", descriptor = "(I)V", line = 693)
	@Override
	void method17529(@OriginalArg(0) int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong104, 168, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "acr", descriptor = "(I)V", line = 693)
	@Override
	void method17776(@OriginalArg(0) int arg0) {
		IDirect3DDevice.SetRenderState(this.aLong104, 168, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "acs", descriptor = "()V", line = 697)
	@Override
	void method17777() {
		IDirect3DDevice.method25087(this.aLong104, 15, this.aBoolean433);
		IDirect3DDevice.SetRenderState(this.aLong104, 24, this.aByte78 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.MultiSampleType <= 0) {
			return;
		}
		if (this.aBoolean433 && this.aByte78 != 0) {
			if (this.aBoolean456) {
				IDirect3DDevice.SetRenderState(this.aLong104, 181, method17559('S', 'S', 'A', 'A'));
			} else if (this.aBoolean455) {
				IDirect3DDevice.SetRenderState(this.aLong104, 181, method17559('A', 'T', 'O', 'C'));
			} else if (this.aBoolean458) {
				IDirect3DDevice.SetRenderState(this.aLong104, 154, method17559('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean456 || this.aBoolean455) {
			IDirect3DDevice.SetRenderState(this.aLong104, 181, 0);
		} else if (this.aBoolean458) {
			IDirect3DDevice.method25086(this.aLong104, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!akw", name = "tm", descriptor = "()V", line = 697)
	@Override
	void method17441() {
		IDirect3DDevice.method25087(this.aLong104, 15, this.aBoolean433);
		IDirect3DDevice.SetRenderState(this.aLong104, 24, this.aByte78 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.MultiSampleType <= 0) {
			return;
		}
		if (this.aBoolean433 && this.aByte78 != 0) {
			if (this.aBoolean456) {
				IDirect3DDevice.SetRenderState(this.aLong104, 181, method17559('S', 'S', 'A', 'A'));
			} else if (this.aBoolean455) {
				IDirect3DDevice.SetRenderState(this.aLong104, 181, method17559('A', 'T', 'O', 'C'));
			} else if (this.aBoolean458) {
				IDirect3DDevice.SetRenderState(this.aLong104, 154, method17559('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean456 || this.aBoolean455) {
			IDirect3DDevice.SetRenderState(this.aLong104, 181, 0);
		} else if (this.aBoolean458) {
			IDirect3DDevice.method25086(this.aLong104, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!akw", name = "acy", descriptor = "()V", line = 697)
	@Override
	void method17778() {
		IDirect3DDevice.method25087(this.aLong104, 15, this.aBoolean433);
		IDirect3DDevice.SetRenderState(this.aLong104, 24, this.aByte78 & 0xFF);
		if (this.aD3DPRESENT_PARAMETERS2.MultiSampleType <= 0) {
			return;
		}
		if (this.aBoolean433 && this.aByte78 != 0) {
			if (this.aBoolean456) {
				IDirect3DDevice.SetRenderState(this.aLong104, 181, method17559('S', 'S', 'A', 'A'));
			} else if (this.aBoolean455) {
				IDirect3DDevice.SetRenderState(this.aLong104, 181, method17559('A', 'T', 'O', 'C'));
			} else if (this.aBoolean458) {
				IDirect3DDevice.SetRenderState(this.aLong104, 154, method17559('A', '2', 'M', '1'));
			}
		} else if (this.aBoolean456 || this.aBoolean455) {
			IDirect3DDevice.SetRenderState(this.aLong104, 181, 0);
		} else if (this.aBoolean458) {
			IDirect3DDevice.method25086(this.aLong104, 154, 1.0F);
		}
	}

	@OriginalMember(owner = "client!akw", name = "tn", descriptor = "()V", line = 713)
	@Override
	void method17534() {
		switch(this.aClass258_3.anInt4195) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong104, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong104, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong104, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong104, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong104, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong104, 20, 1);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong104, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong104, 20, 6);
		}
		switch(this.anInt2478) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong104, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong104, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong104, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong104, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong104, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong104, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong104, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong104, 208, 2);
		}
	}

	@OriginalMember(owner = "client!akw", name = "acl", descriptor = "()V", line = 713)
	@Override
	void method17652() {
		switch(this.aClass258_3.anInt4195) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong104, 19, 9);
				IDirect3DDevice.SetRenderState(this.aLong104, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong104, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong104, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong104, 19, 2);
				IDirect3DDevice.SetRenderState(this.aLong104, 20, 1);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong104, 19, 5);
				IDirect3DDevice.SetRenderState(this.aLong104, 20, 6);
		}
		switch(this.anInt2478) {
			case 0:
				IDirect3DDevice.SetRenderState(this.aLong104, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong104, 208, 1);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(this.aLong104, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong104, 208, 1);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(this.aLong104, 207, 2);
				IDirect3DDevice.SetRenderState(this.aLong104, 208, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(this.aLong104, 207, 1);
				IDirect3DDevice.SetRenderState(this.aLong104, 208, 2);
		}
	}

	@OriginalMember(owner = "client!akw", name = "acq", descriptor = "()V", line = 768)
	@Override
	void method17487() {
		IDirect3DDevice.method25087(this.aLong104, 27, this.aBoolean440);
	}

	@OriginalMember(owner = "client!akw", name = "ack", descriptor = "()V", line = 768)
	@Override
	void method17781() {
		IDirect3DDevice.method25087(this.aLong104, 27, this.aBoolean440);
	}

	@OriginalMember(owner = "client!akw", name = "tc", descriptor = "()V", line = 768)
	@Override
	void method17535() {
		IDirect3DDevice.method25087(this.aLong104, 27, this.aBoolean440);
	}

	@OriginalMember(owner = "client!akw", name = "ts", descriptor = "()V", line = 772)
	@Override
	void method17462() {
		if (this.aBoolean422) {
			IDirect3DDevice.method25087(this.aLong104, 28, this.aBoolean437 && this.aBoolean432 && this.anInt2520 >= 0);
		}
	}

	@OriginalMember(owner = "client!akw", name = "acj", descriptor = "()V", line = 772)
	@Override
	void method17790() {
		if (this.aBoolean422) {
			IDirect3DDevice.method25087(this.aLong104, 28, this.aBoolean437 && this.aBoolean432 && this.anInt2520 >= 0);
		}
	}

	@OriginalMember(owner = "client!akw", name = "tu", descriptor = "()V", line = 778)
	@Override
	void method17538() {
		this.aFloat199 = this.aFloat192 - (float) this.anInt2521;
		this.aFloat198 = this.aFloat199 - (float) this.anInt2520;
		if (this.aFloat198 < this.aFloat184) {
			this.aFloat198 = this.aFloat184;
		}
		if (this.aBoolean422) {
			IDirect3DDevice.method25086(this.aLong104, 36, this.aFloat198);
			IDirect3DDevice.method25086(this.aLong104, 37, this.aFloat199);
			IDirect3DDevice.SetRenderState(this.aLong104, 34, this.anInt2519);
		}
	}

	@OriginalMember(owner = "client!akw", name = "acn", descriptor = "()V", line = 778)
	@Override
	void method17596() {
		this.aFloat199 = this.aFloat192 - (float) this.anInt2521;
		this.aFloat198 = this.aFloat199 - (float) this.anInt2520;
		if (this.aFloat198 < this.aFloat184) {
			this.aFloat198 = this.aFloat184;
		}
		if (this.aBoolean422) {
			IDirect3DDevice.method25086(this.aLong104, 36, this.aFloat198);
			IDirect3DDevice.method25086(this.aLong104, 37, this.aFloat199);
			IDirect3DDevice.SetRenderState(this.aLong104, 34, this.anInt2519);
		}
	}

	@OriginalMember(owner = "client!akw", name = "aci", descriptor = "()V", line = 778)
	@Override
	void method17789() {
		this.aFloat199 = this.aFloat192 - (float) this.anInt2521;
		this.aFloat198 = this.aFloat199 - (float) this.anInt2520;
		if (this.aFloat198 < this.aFloat184) {
			this.aFloat198 = this.aFloat184;
		}
		if (this.aBoolean422) {
			IDirect3DDevice.method25086(this.aLong104, 36, this.aFloat198);
			IDirect3DDevice.method25086(this.aLong104, 37, this.aFloat199);
			IDirect3DDevice.SetRenderState(this.aLong104, 34, this.anInt2519);
		}
	}

	@OriginalMember(owner = "client!akw", name = "acp", descriptor = "(Z)V", line = 789)
	@Override
	void method17792(@OriginalArg(0) boolean arg0) {
		IDirect3DDevice.method25087(this.aLong104, 161, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "ty", descriptor = "(Z)V", line = 789)
	@Override
	void method17770(@OriginalArg(0) boolean arg0) {
		IDirect3DDevice.method25087(this.aLong104, 161, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "acd", descriptor = "(Z)V", line = 789)
	@Override
	void method17791(@OriginalArg(0) boolean arg0) {
		IDirect3DDevice.method25087(this.aLong104, 161, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "tw", descriptor = "(Z)Lclient!jw;", line = 793)
	@Override
	final Interface30 method17648(@OriginalArg(0) boolean arg0) {
		return new Class305(this, Class127.aClass127_21, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "act", descriptor = "(Z)Lclient!jw;", line = 793)
	@Override
	final Interface30 method17465(@OriginalArg(0) boolean arg0) {
		return new Class305(this, Class127.aClass127_21, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "tk", descriptor = "(Z)Lclient!if;", line = 797)
	@Override
	final Interface21 method17542(@OriginalArg(0) boolean arg0) {
		return new Class303(this, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "acb", descriptor = "(Z)Lclient!if;", line = 797)
	@Override
	final Interface21 method17642(@OriginalArg(0) boolean arg0) {
		return new Class303(this, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "to", descriptor = "([Lclient!jb;)Lclient!iy;", line = 801)
	@Override
	Class37 method17590(@OriginalArg(0) Class252[] arg0) {
		return new Class37_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "acv", descriptor = "([Lclient!jb;)Lclient!iy;", line = 801)
	@Override
	Class37 method17795(@OriginalArg(0) Class252[] arg0) {
		return new Class37_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!akw", name = "tz", descriptor = "(Lclient!iy;)V", line = 805)
	@Override
	public void method17738(@OriginalArg(0) Class37 arg0) {
		@Pc(2) Class37_Sub1 local2 = (Class37_Sub1) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong104, local2.aLong21);
	}

	@OriginalMember(owner = "client!akw", name = "ade", descriptor = "(Lclient!iy;)V", line = 805)
	@Override
	public void method17621(@OriginalArg(0) Class37 arg0) {
		@Pc(2) Class37_Sub1 local2 = (Class37_Sub1) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong104, local2.aLong21);
	}

	@OriginalMember(owner = "client!akw", name = "adk", descriptor = "(Lclient!iy;)V", line = 805)
	@Override
	public void method17797(@OriginalArg(0) Class37 arg0) {
		@Pc(2) Class37_Sub1 local2 = (Class37_Sub1) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong104, local2.aLong21);
	}

	@OriginalMember(owner = "client!akw", name = "add", descriptor = "(Lclient!iy;)V", line = 805)
	@Override
	public void method17516(@OriginalArg(0) Class37 arg0) {
		@Pc(2) Class37_Sub1 local2 = (Class37_Sub1) arg0;
		IDirect3DDevice.SetVertexDeclaration(this.aLong104, local2.aLong21);
	}

	@OriginalMember(owner = "client!akw", name = "ado", descriptor = "(ILclient!if;)V", line = 810)
	@Override
	public void method17799(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		@Pc(2) Class303 local2 = (Class303) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong104, arg0, local2.aLong259, 0, local2.method25689());
	}

	@OriginalMember(owner = "client!akw", name = "tl", descriptor = "(ILclient!if;)V", line = 810)
	@Override
	public void method17544(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		@Pc(2) Class303 local2 = (Class303) arg1;
		IDirect3DDevice.SetStreamSource(this.aLong104, arg0, local2.aLong259, 0, local2.method25689());
	}

	@OriginalMember(owner = "client!akw", name = "adt", descriptor = "(Lclient!jw;)V", line = 815)
	@Override
	void method17711(@OriginalArg(0) Interface30 arg0) {
		IDirect3DDevice.SetIndices(this.aLong104, ((Class305) arg0).aLong260);
	}

	@OriginalMember(owner = "client!akw", name = "tb", descriptor = "(Lclient!jw;)V", line = 815)
	@Override
	void method17545(@OriginalArg(0) Interface30 arg0) {
		IDirect3DDevice.SetIndices(this.aLong104, ((Class305) arg0).aLong260);
	}

	@OriginalMember(owner = "client!akw", name = "adn", descriptor = "(Lclient!jw;)V", line = 815)
	@Override
	void method17815(@OriginalArg(0) Interface30 arg0) {
		IDirect3DDevice.SetIndices(this.aLong104, ((Class305) arg0).aLong260);
	}

	@OriginalMember(owner = "client!akw", name = "ads", descriptor = "(Lclient!jw;)V", line = 815)
	@Override
	void method17727(@OriginalArg(0) Interface30 arg0) {
		IDirect3DDevice.SetIndices(this.aLong104, ((Class305) arg0).aLong260);
	}

	@OriginalMember(owner = "client!akw", name = "tv", descriptor = "(Lclient!jr;II)V", line = 819)
	@Override
	public final void method17554(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass25_Sub1_2 != null) {
			this.aClass25_Sub1_2.method6406();
		}
		IDirect3DDevice.DrawPrimitive(this.aLong104, method17835(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!akw", name = "adf", descriptor = "(Lclient!jr;II)V", line = 819)
	@Override
	public final void method17586(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass25_Sub1_2 != null) {
			this.aClass25_Sub1_2.method6406();
		}
		IDirect3DDevice.DrawPrimitive(this.aLong104, method17835(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!akw", name = "tj", descriptor = "(Lclient!jw;Lclient!jr;IIII)V", line = 824)
	@Override
	final void method17817(@OriginalArg(0) Interface30 arg0, @OriginalArg(1) Class263 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass25_Sub1_2 != null) {
			this.aClass25_Sub1_2.method6406();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong104, ((Class305) arg0).aLong260, 4, 0, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!akw", name = "adr", descriptor = "(Lclient!jw;Lclient!jr;IIII)V", line = 824)
	@Override
	final void method17805(@OriginalArg(0) Interface30 arg0, @OriginalArg(1) Class263 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass25_Sub1_2 != null) {
			this.aClass25_Sub1_2.method6406();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong104, ((Class305) arg0).aLong260, 4, 0, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!akw", name = "tf", descriptor = "(Lclient!jr;IIII)V", line = 829)
	@Override
	public final void method17555(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass25_Sub1_2 != null) {
			this.aClass25_Sub1_2.method6406();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong104, method17835(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!akw", name = "adg", descriptor = "(Lclient!jr;IIII)V", line = 829)
	@Override
	public final void method17806(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass25_Sub1_2 != null) {
			this.aClass25_Sub1_2.method6406();
		}
		IDirect3DDevice.DrawIndexedPrimitive(this.aLong104, method17835(arg0), 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!akw", name = "aec", descriptor = "(Ljava/lang/String;)[B", line = 834)
	byte[] method17832(@OriginalArg(0) String arg0) {
		return this.method17436("dx", arg0);
	}

	@OriginalMember(owner = "client!akw", name = "afq", descriptor = "(Ljava/lang/String;)[B", line = 834)
	byte[] method17839(@OriginalArg(0) String arg0) {
		return this.method17436("dx", arg0);
	}

	@OriginalMember(owner = "client!akw", name = "afv", descriptor = "(Ljava/lang/String;)[B", line = 834)
	byte[] method17867(@OriginalArg(0) String arg0) {
		return this.method17436("dx", arg0);
	}

	@OriginalMember(owner = "client!akw", name = "afb", descriptor = "(Ljava/lang/String;)[B", line = 834)
	byte[] method17868(@OriginalArg(0) String arg0) {
		return this.method17436("dx", arg0);
	}

	@OriginalMember(owner = "client!akw", name = "ua", descriptor = "(Ljava/lang/String;)Lclient!fc;", line = 838)
	@Override
	public Class24 method17605(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method17832(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class173 local11 = this.method17437(local3);
			return new Class24_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!akw", name = "ui", descriptor = "(Ljava/lang/String;)Lclient!fc;", line = 838)
	@Override
	public Class24 method17602(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method17832(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class173 local11 = this.method17437(local3);
			return new Class24_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!akw", name = "ur", descriptor = "(Ljava/lang/String;)Lclient!fc;", line = 838)
	@Override
	public Class24 method17603(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method17832(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class173 local11 = this.method17437(local3);
			return new Class24_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!akw", name = "pl", descriptor = "(Ljava/lang/String;)Lclient!fc;", line = 838)
	@Override
	public Class24 method17435(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method17832(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class173 local11 = this.method17437(local3);
			return new Class24_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!akw", name = "uu", descriptor = "(Ljava/lang/String;)Lclient!fc;", line = 838)
	@Override
	public Class24 method17604(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method17832(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class173 local11 = this.method17437(local3);
			return new Class24_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!akw", name = "ut", descriptor = "(Ljava/lang/String;)Lclient!fc;", line = 838)
	@Override
	public Class24 method17758(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method17832(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class173 local11 = this.method17437(local3);
			return new Class24_Sub1(this, local11);
		}
	}

	@OriginalMember(owner = "client!akw", name = "ez", descriptor = "(I)V", line = 845)
	@Override
	public final synchronized void method17154(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2532; local1++) {
			IUnknown.Release(this.aLongArray6[local1]);
		}
		this.anInt2532 = 0;
		super.method17022(arg0);
	}

	@OriginalMember(owner = "client!akw", name = "ep", descriptor = "(I)V", line = 845)
	@Override
	public final synchronized void method17155(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2532; local1++) {
			IUnknown.Release(this.aLongArray6[local1]);
		}
		this.anInt2532 = 0;
		super.method17022(arg0);
	}

	@OriginalMember(owner = "client!akw", name = "c", descriptor = "(I)V", line = 845)
	@Override
	public final synchronized void method17022(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2532; local1++) {
			IUnknown.Release(this.aLongArray6[local1]);
		}
		this.anInt2532 = 0;
		super.method17022(arg0);
	}

	@OriginalMember(owner = "client!akw", name = "aek", descriptor = "(Lclient!cw;Lclient!dj;)I", line = 851)
	static final int method17833(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1) {
		switch(arg1.anInt3314 * -663455835) {
			case 1:
				switch(arg0.anInt3210 * -1309589553) {
					case 0:
						return g.anInt3846 * -126852133;
					case 1:
						return 77;
					case 2:
					default:
						throw new IllegalArgumentException("");
					case 3:
						return g.anInt3845 * 354238237;
					case 4:
						return 28;
					case 5:
						return 51;
					case 6:
						return 22;
					case 7:
						return 50;
					case 8:
						return 21;
				}
			case 4:
				if (arg0 == Class121.aClass121_17) {
					return 116;
				}
				break;
			case 7:
				if (arg0 == Class121.aClass121_17) {
					return 113;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!akw", name = "afy", descriptor = "(Lclient!cw;Lclient!dj;)I", line = 851)
	static final int method17869(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1) {
		switch(arg1.anInt3314 * -663455835) {
			case 1:
				switch(arg0.anInt3210 * -1309589553) {
					case 0:
						return g.anInt3846 * -126852133;
					case 1:
						return 77;
					case 2:
					default:
						throw new IllegalArgumentException("");
					case 3:
						return g.anInt3845 * 354238237;
					case 4:
						return 28;
					case 5:
						return 51;
					case 6:
						return 22;
					case 7:
						return 50;
					case 8:
						return 21;
				}
			case 4:
				if (arg0 == Class121.aClass121_17) {
					return 116;
				}
				break;
			case 7:
				if (arg0 == Class121.aClass121_17) {
					return 113;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!akw", name = "afu", descriptor = "(Lclient!cw;Lclient!dj;)I", line = 851)
	static final int method17870(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1) {
		switch(arg1.anInt3314 * -663455835) {
			case 1:
				switch(arg0.anInt3210 * -1309589553) {
					case 0:
						return g.anInt3846 * -126852133;
					case 1:
						return 77;
					case 2:
					default:
						throw new IllegalArgumentException("");
					case 3:
						return g.anInt3845 * 354238237;
					case 4:
						return 28;
					case 5:
						return 51;
					case 6:
						return 22;
					case 7:
						return 50;
					case 8:
						return 21;
				}
			case 4:
				if (arg0 == Class121.aClass121_17) {
					return 116;
				}
				break;
			case 7:
				if (arg0 == Class121.aClass121_17) {
					return 113;
				}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!akw", name = "aee", descriptor = "(Lclient!dj;)I", line = 893)
	static final int method17834(@OriginalArg(0) Class127 arg0) {
		if (arg0 == Class127.aClass127_21) {
			return 80;
		} else if (arg0 == Class127.aClass127_22) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!akw", name = "afz", descriptor = "(Lclient!dj;)I", line = 893)
	static final int method17871(@OriginalArg(0) Class127 arg0) {
		if (arg0 == Class127.aClass127_21) {
			return 80;
		} else if (arg0 == Class127.aClass127_22) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!akw", name = "afj", descriptor = "(Lclient!dj;)I", line = 893)
	static final int method17872(@OriginalArg(0) Class127 arg0) {
		if (arg0 == Class127.aClass127_21) {
			return 80;
		} else if (arg0 == Class127.aClass127_22) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!akw", name = "age", descriptor = "(Lclient!dj;)I", line = 893)
	static final int method17873(@OriginalArg(0) Class127 arg0) {
		if (arg0 == Class127.aClass127_21) {
			return 80;
		} else if (arg0 == Class127.aClass127_22) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!akw", name = "aey", descriptor = "(Lclient!jr;)I", line = 899)
	static final int method17835(@OriginalArg(0) Class263 arg0) {
		switch(arg0.anInt4206) {
			case 0:
				return 3;
			case 1:
				return 6;
			case 2:
				return 2;
			case 3:
				return 1;
			case 4:
				return 4;
			case 5:
				return 5;
			default:
				throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!akw", name = "agd", descriptor = "(Lclient!jr;)I", line = 899)
	static final int method17844(@OriginalArg(0) Class263 arg0) {
		switch(arg0.anInt4206) {
			case 0:
				return 3;
			case 1:
				return 6;
			case 2:
				return 2;
			case 3:
				return 1;
			case 4:
				return 4;
			case 5:
				return 5;
			default:
				throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!akw", name = "agx", descriptor = "(Lclient!jr;)I", line = 899)
	static final int method17874(@OriginalArg(0) Class263 arg0) {
		switch(arg0.anInt4206) {
			case 0:
				return 3;
			case 1:
				return 6;
			case 2:
				return 2;
			case 3:
				return 1;
			case 4:
				return 4;
			case 5:
				return 5;
			default:
				throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!akw", name = "ee", descriptor = "(Z)V", line = 916)
	@Override
	public void method17142(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!akw", name = "fe", descriptor = "(Z)V", line = 916)
	@Override
	public void method17182() {
	}

	@OriginalMember(owner = "client!akw", name = "fw", descriptor = "(Z)V", line = 916)
	@Override
	public void method17183() {
	}

	@OriginalMember(owner = "client!akw", name = "fo", descriptor = "(Z)V", line = 916)
	@Override
	public void method17184() {
	}

	@OriginalMember(owner = "client!akw", name = "fl", descriptor = "(Z)V", line = 916)
	@Override
	public void method17241() {
	}

	@OriginalMember(owner = "client!akw", name = "aeu", descriptor = "(IIJILclient!jagdx/D3DPRESENT_PARAMETERS;)Z", line = 919)
	static boolean method17836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) D3DPRESENT_PARAMETERS arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (p.method25091(IDirect3D.GetAdapterDisplayMode(arg2, arg0, local9))) {
				return false;
			}
			label76: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(28) int local28 = 0; local28 < anIntArray251.length; local28++) {
						if (IDirect3D.CheckDeviceType(arg2, arg0, arg1, local9.Format, anIntArray251[local28], true) == 0 && IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, local9.Format, 1, 1, anIntArray251[local28]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray251[local28], true, local5) == 0)) {
							for (@Pc(69) int local69 = 0; local69 < anIntArray253.length; local69++) {
								if (IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, local9.Format, 2, 1, anIntArray253[local69]) == 0 && IDirect3D.CheckDepthStencilMatch(arg2, arg0, arg1, local9.Format, anIntArray251[local28], anIntArray253[local69]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray253[local28], true, local5) == 0)) {
									local3 = anIntArray251[local28];
									local1 = anIntArray253[local69];
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
			arg4.BackBufferFormat = local3;
			arg4.AutoDepthStencilFormat = local1;
			arg4.MultiSampleType = local5;
			arg4.MultiSampleQuality = 0;
			return true;
		} catch (@Pc(148) Throwable local148) {
			return false;
		}
	}

	@OriginalMember(owner = "client!akw", name = "agi", descriptor = "(IIJILclient!jagdx/D3DPRESENT_PARAMETERS;)Z", line = 919)
	static boolean method17842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) D3DPRESENT_PARAMETERS arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (p.method25091(IDirect3D.GetAdapterDisplayMode(arg2, arg0, local9))) {
				return false;
			}
			label76: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(28) int local28 = 0; local28 < anIntArray251.length; local28++) {
						if (IDirect3D.CheckDeviceType(arg2, arg0, arg1, local9.Format, anIntArray251[local28], true) == 0 && IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, local9.Format, 1, 1, anIntArray251[local28]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray251[local28], true, local5) == 0)) {
							for (@Pc(69) int local69 = 0; local69 < anIntArray253.length; local69++) {
								if (IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, local9.Format, 2, 1, anIntArray253[local69]) == 0 && IDirect3D.CheckDepthStencilMatch(arg2, arg0, arg1, local9.Format, anIntArray251[local28], anIntArray253[local69]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, anIntArray253[local28], true, local5) == 0)) {
									local3 = anIntArray251[local28];
									local1 = anIntArray253[local69];
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
			arg4.BackBufferFormat = local3;
			arg4.AutoDepthStencilFormat = local1;
			arg4.MultiSampleType = local5;
			arg4.MultiSampleQuality = 0;
			return true;
		} catch (@Pc(148) Throwable local148) {
			return false;
		}
	}

	@OriginalMember(owner = "client!akw", name = "aea", descriptor = "(J)V", line = 969)
	synchronized void method17837(@OriginalArg(0) long arg0) {
		if (this.anInt2532 == this.anInt2531) {
			this.anInt2531 *= 2;
			@Pc(14) long[] local14 = new long[this.anInt2531];
			System.arraycopy(this.aLongArray6, 0, local14, 0, this.anInt2532);
			this.aLongArray6 = local14;
		}
		this.aLongArray6[this.anInt2532] = arg0;
		this.anInt2532++;
	}

	@OriginalMember(owner = "client!akw", name = "th", descriptor = "(I)V", line = 980)
	@Override
	void method17558(@OriginalArg(0) int arg0) {
		if (!this.aBoolean457) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong104, 8, local10);
		}
	}

	@OriginalMember(owner = "client!akw", name = "adl", descriptor = "(I)V", line = 980)
	@Override
	void method17619(@OriginalArg(0) int arg0) {
		if (!this.aBoolean457) {
			@Pc(10) int local10 = (arg0 & 0x2) == 0 ? 3 : 2;
			IDirect3DDevice.SetRenderState(this.aLong104, 8, local10);
		}
	}

	@OriginalMember(owner = "client!akw", name = "fy", descriptor = "()Ljava/lang/String;", line = 987)
	@Override
	public String method17181() {
		@Pc(1) String local1 = "Caps: 3:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2522 + local3;
		@Pc(27) String local27 = local15 + this.anInt2525 + local3;
		@Pc(39) String local39 = local27 + this.anInt2526 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean439 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method17432() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method17433() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean441 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean452 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean454 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean459 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean453 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean443 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean444 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean445 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean455 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean458 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean456 ? 1 : 0) + local3;
		return local279 + (this.aBoolean448 ? 1 : 0);
	}

	@OriginalMember(owner = "client!akw", name = "o", descriptor = "()Ljava/lang/String;", line = 987)
	@Override
	public String method17035() {
		@Pc(1) String local1 = "Caps: 3:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2522 + local3;
		@Pc(27) String local27 = local15 + this.anInt2525 + local3;
		@Pc(39) String local39 = local27 + this.anInt2526 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean439 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method17432() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method17433() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean441 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean452 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean454 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean459 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean453 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean443 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean444 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean445 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean455 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean458 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean456 ? 1 : 0) + local3;
		return local279 + (this.aBoolean448 ? 1 : 0);
	}

	@OriginalMember(owner = "client!akw", name = "fz", descriptor = "()Ljava/lang/String;", line = 987)
	@Override
	public String method17179() {
		@Pc(1) String local1 = "Caps: 3:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2522 + local3;
		@Pc(27) String local27 = local15 + this.anInt2525 + local3;
		@Pc(39) String local39 = local27 + this.anInt2526 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean439 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method17432() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method17433() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean441 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean452 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean454 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean459 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean453 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean443 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean444 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean445 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean455 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean458 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean456 ? 1 : 0) + local3;
		return local279 + (this.aBoolean448 ? 1 : 0);
	}

	@OriginalMember(owner = "client!akw", name = "fv", descriptor = "()Ljava/lang/String;", line = 987)
	@Override
	public String method17180() {
		@Pc(1) String local1 = "Caps: 3:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2522 + local3;
		@Pc(27) String local27 = local15 + this.anInt2525 + local3;
		@Pc(39) String local39 = local27 + this.anInt2526 + local3;
		@Pc(55) String local55 = local39 + (this.aBoolean439 ? 1 : 0) + local3;
		@Pc(71) String local71 = local55 + (this.method17432() ? 1 : 0) + local3;
		@Pc(87) String local87 = local71 + (this.method17433() ? 1 : 0) + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean441 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean452 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean454 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean459 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean453 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean443 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean444 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean445 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean455 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean458 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean456 ? 1 : 0) + local3;
		return local279 + (this.aBoolean448 ? 1 : 0);
	}
}
