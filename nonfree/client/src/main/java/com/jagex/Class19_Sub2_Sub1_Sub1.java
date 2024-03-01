package com.jagex;

import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;
import jagdx.p;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aek")
public class Class19_Sub2_Sub1_Sub1 extends Class19_Sub2_Sub1 implements Interface33 {

	@OriginalMember(owner = "client!aek", name = "g", descriptor = "J")
	long aLong31;

	@OriginalMember(owner = "client!aek", name = "l", descriptor = "J")
	long aLong32;

	@OriginalMember(owner = "client!aek", name = "h", descriptor = "J")
	long aLong33;

	@OriginalMember(owner = "client!aek", name = "b", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!aek", name = "u", descriptor = "Z")
	boolean aBoolean196 = false;

	@OriginalMember(owner = "client!aek", name = "y", descriptor = "Z")
	boolean aBoolean195 = false;

	@OriginalMember(owner = "client!aek", name = "a", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas1;

	@OriginalMember(owner = "client!aek", name = "p", descriptor = "Lclient!akw;")
	final Class21_Sub3_Sub2 aClass21_Sub3_Sub2_9;

	@OriginalMember(owner = "client!aek", name = "x", descriptor = "I")
	int anInt976;

	@OriginalMember(owner = "client!aek", name = "s", descriptor = "I")
	int anInt977;

	@OriginalMember(owner = "client!aek", name = "<init>", descriptor = "(Lclient!akw;Ljava/awt/Canvas;IIZ)V", line = 22)
	Class19_Sub2_Sub1_Sub1(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0);
		this.aCanvas1 = arg1;
		this.aClass21_Sub3_Sub2_9 = arg0;
		this.anInt976 = arg2;
		this.anInt977 = arg3;
		this.aBoolean195 = arg4;
		this.method8889();
	}

	@OriginalMember(owner = "client!aek", name = "m", descriptor = "()V", line = 32)
	@Override
	public void method8889() {
		if (this.aLong31 == 0L) {
			this.aD3DPRESENT_PARAMETERS1 = new D3DPRESENT_PARAMETERS(this.aCanvas1);
			this.aD3DPRESENT_PARAMETERS1.Windowed = true;
			this.aD3DPRESENT_PARAMETERS1.BackBufferCount = 1;
			this.aD3DPRESENT_PARAMETERS1.PresentationInterval = Integer.MIN_VALUE;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = this.anInt976;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = this.anInt977;
			if (this.aBoolean195) {
				this.aLong31 = IDirect3DDevice.GetSwapChain(this.aClass21_Sub3_Sub2_9.aLong104, 0);
				this.aLong33 = IDirect3DSwapChain.GetBackBuffer(this.aLong31, 0, 0);
				this.aLong32 = IDirect3DDevice.GetDepthStencilSurface(this.aClass21_Sub3_Sub2_9.aLong104);
			} else if (Class21_Sub3_Sub2.method17836(this.aClass21_Sub3_Sub2_9.anInt2529, this.aClass21_Sub3_Sub2_9.anInt2530, this.aClass21_Sub3_Sub2_9.aLong103, this.aClass21_Sub3_Sub2_9.anInt2522, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(81) int local81 = this.aD3DPRESENT_PARAMETERS1.AutoDepthStencilFormat;
				this.aLong31 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass21_Sub3_Sub2_9.aLong104, this.aD3DPRESENT_PARAMETERS1);
				this.aLong33 = IDirect3DSwapChain.GetBackBuffer(this.aLong31, 0, 0);
				this.aLong32 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass21_Sub3_Sub2_9.aLong104, this.anInt976, this.anInt977, local81, this.aD3DPRESENT_PARAMETERS1.MultiSampleType, this.aD3DPRESENT_PARAMETERS1.MultiSampleQuality, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass21_Sub3_Sub2_9.method17820(this);
		}
		if (this.aBoolean196) {
			this.method21393();
		}
	}

	@OriginalMember(owner = "client!aek", name = "v", descriptor = "()V", line = 32)
	@Override
	public void method8890() {
		if (this.aLong31 == 0L) {
			this.aD3DPRESENT_PARAMETERS1 = new D3DPRESENT_PARAMETERS(this.aCanvas1);
			this.aD3DPRESENT_PARAMETERS1.Windowed = true;
			this.aD3DPRESENT_PARAMETERS1.BackBufferCount = 1;
			this.aD3DPRESENT_PARAMETERS1.PresentationInterval = Integer.MIN_VALUE;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = this.anInt976;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = this.anInt977;
			if (this.aBoolean195) {
				this.aLong31 = IDirect3DDevice.GetSwapChain(this.aClass21_Sub3_Sub2_9.aLong104, 0);
				this.aLong33 = IDirect3DSwapChain.GetBackBuffer(this.aLong31, 0, 0);
				this.aLong32 = IDirect3DDevice.GetDepthStencilSurface(this.aClass21_Sub3_Sub2_9.aLong104);
			} else if (Class21_Sub3_Sub2.method17836(this.aClass21_Sub3_Sub2_9.anInt2529, this.aClass21_Sub3_Sub2_9.anInt2530, this.aClass21_Sub3_Sub2_9.aLong103, this.aClass21_Sub3_Sub2_9.anInt2522, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(81) int local81 = this.aD3DPRESENT_PARAMETERS1.AutoDepthStencilFormat;
				this.aLong31 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass21_Sub3_Sub2_9.aLong104, this.aD3DPRESENT_PARAMETERS1);
				this.aLong33 = IDirect3DSwapChain.GetBackBuffer(this.aLong31, 0, 0);
				this.aLong32 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass21_Sub3_Sub2_9.aLong104, this.anInt976, this.anInt977, local81, this.aD3DPRESENT_PARAMETERS1.MultiSampleType, this.aD3DPRESENT_PARAMETERS1.MultiSampleQuality, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass21_Sub3_Sub2_9.method17820(this);
		}
		if (this.aBoolean196) {
			this.method21393();
		}
	}

	@OriginalMember(owner = "client!aek", name = "t", descriptor = "()V", line = 32)
	@Override
	public void method8888() {
		if (this.aLong31 == 0L) {
			this.aD3DPRESENT_PARAMETERS1 = new D3DPRESENT_PARAMETERS(this.aCanvas1);
			this.aD3DPRESENT_PARAMETERS1.Windowed = true;
			this.aD3DPRESENT_PARAMETERS1.BackBufferCount = 1;
			this.aD3DPRESENT_PARAMETERS1.PresentationInterval = Integer.MIN_VALUE;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = this.anInt976;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = this.anInt977;
			if (this.aBoolean195) {
				this.aLong31 = IDirect3DDevice.GetSwapChain(this.aClass21_Sub3_Sub2_9.aLong104, 0);
				this.aLong33 = IDirect3DSwapChain.GetBackBuffer(this.aLong31, 0, 0);
				this.aLong32 = IDirect3DDevice.GetDepthStencilSurface(this.aClass21_Sub3_Sub2_9.aLong104);
			} else if (Class21_Sub3_Sub2.method17836(this.aClass21_Sub3_Sub2_9.anInt2529, this.aClass21_Sub3_Sub2_9.anInt2530, this.aClass21_Sub3_Sub2_9.aLong103, this.aClass21_Sub3_Sub2_9.anInt2522, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(81) int local81 = this.aD3DPRESENT_PARAMETERS1.AutoDepthStencilFormat;
				this.aLong31 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass21_Sub3_Sub2_9.aLong104, this.aD3DPRESENT_PARAMETERS1);
				this.aLong33 = IDirect3DSwapChain.GetBackBuffer(this.aLong31, 0, 0);
				this.aLong32 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass21_Sub3_Sub2_9.aLong104, this.anInt976, this.anInt977, local81, this.aD3DPRESENT_PARAMETERS1.MultiSampleType, this.aD3DPRESENT_PARAMETERS1.MultiSampleQuality, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass21_Sub3_Sub2_9.method17820(this);
		}
		if (this.aBoolean196) {
			this.method21393();
		}
	}

	@OriginalMember(owner = "client!aek", name = "p", descriptor = "()I", line = 57)
	@Override
	public int method21390() {
		return this.anInt976;
	}

	@OriginalMember(owner = "client!aek", name = "d", descriptor = "()I", line = 57)
	@Override
	public int method21405() {
		return this.anInt976;
	}

	@OriginalMember(owner = "client!aek", name = "q", descriptor = "()I", line = 57)
	@Override
	public int method21389() {
		return this.anInt976;
	}

	@OriginalMember(owner = "client!aek", name = "s", descriptor = "()I", line = 61)
	@Override
	public int method21404() {
		return this.anInt977;
	}

	@OriginalMember(owner = "client!aek", name = "x", descriptor = "()I", line = 61)
	@Override
	public int method21394() {
		return this.anInt977;
	}

	@OriginalMember(owner = "client!aek", name = "a", descriptor = "()I", line = 61)
	@Override
	public int method21391() {
		return this.anInt977;
	}

	@OriginalMember(owner = "client!aek", name = "l", descriptor = "()Z", line = 65)
	@Override
	public boolean method21393() {
		this.aBoolean196 = true;
		if (this.aLong31 == 0L) {
			if (this.aClass21_Sub3_Sub2_9.aBoolean451) {
				return false;
			}
			this.method8889();
		}
		if (p.method25091(IDirect3DDevice.SetRenderTarget(this.aClass21_Sub3_Sub2_9.aLong104, 0, this.aLong33))) {
			return false;
		} else if (p.method25091(IDirect3DDevice.SetDepthStencilSurface(this.aClass21_Sub3_Sub2_9.aLong104, this.aLong32))) {
			return false;
		} else {
			return super.method21393();
		}
	}

	@OriginalMember(owner = "client!aek", name = "u", descriptor = "()Z", line = 65)
	@Override
	public boolean method21396() {
		this.aBoolean196 = true;
		if (this.aLong31 == 0L) {
			if (this.aClass21_Sub3_Sub2_9.aBoolean451) {
				return false;
			}
			this.method8889();
		}
		if (p.method25091(IDirect3DDevice.SetRenderTarget(this.aClass21_Sub3_Sub2_9.aLong104, 0, this.aLong33))) {
			return false;
		} else if (p.method25091(IDirect3DDevice.SetDepthStencilSurface(this.aClass21_Sub3_Sub2_9.aLong104, this.aLong32))) {
			return false;
		} else {
			return super.method21393();
		}
	}

	@OriginalMember(owner = "client!aek", name = "y", descriptor = "()Z", line = 65)
	@Override
	public boolean method21397() {
		this.aBoolean196 = true;
		if (this.aLong31 == 0L) {
			if (this.aClass21_Sub3_Sub2_9.aBoolean451) {
				return false;
			}
			this.method8889();
		}
		if (p.method25091(IDirect3DDevice.SetRenderTarget(this.aClass21_Sub3_Sub2_9.aLong104, 0, this.aLong33))) {
			return false;
		} else if (p.method25091(IDirect3DDevice.SetDepthStencilSurface(this.aClass21_Sub3_Sub2_9.aLong104, this.aLong32))) {
			return false;
		} else {
			return super.method21393();
		}
	}

	@OriginalMember(owner = "client!aek", name = "h", descriptor = "()Z", line = 76)
	@Override
	boolean method21400() {
		this.aBoolean196 = false;
		return p.method25092(IDirect3DDevice.SetDepthStencilSurface(this.aClass21_Sub3_Sub2_9.aLong104, 0L));
	}

	@OriginalMember(owner = "client!aek", name = "b", descriptor = "()Z", line = 76)
	@Override
	boolean method21403() {
		this.aBoolean196 = false;
		return p.method25092(IDirect3DDevice.SetDepthStencilSurface(this.aClass21_Sub3_Sub2_9.aLong104, 0L));
	}

	@OriginalMember(owner = "client!aek", name = "j", descriptor = "()Z", line = 76)
	@Override
	boolean method21401() {
		this.aBoolean196 = false;
		return p.method25092(IDirect3DDevice.SetDepthStencilSurface(this.aClass21_Sub3_Sub2_9.aLong104, 0L));
	}

	@OriginalMember(owner = "client!aek", name = "z", descriptor = "()Z", line = 76)
	@Override
	boolean method21398() {
		this.aBoolean196 = false;
		return p.method25092(IDirect3DDevice.SetDepthStencilSurface(this.aClass21_Sub3_Sub2_9.aLong104, 0L));
	}

	@OriginalMember(owner = "client!aek", name = "c", descriptor = "()Z", line = 76)
	@Override
	boolean method21399() {
		this.aBoolean196 = false;
		return p.method25092(IDirect3DDevice.SetDepthStencilSurface(this.aClass21_Sub3_Sub2_9.aLong104, 0L));
	}

	@OriginalMember(owner = "client!aek", name = "w", descriptor = "()I", line = 81)
	@Override
	public int method21412() {
		return IDirect3DSwapChain.Present(this.aLong31, 0);
	}

	@OriginalMember(owner = "client!aek", name = "af", descriptor = "()I", line = 81)
	@Override
	public int method21418() {
		return IDirect3DSwapChain.Present(this.aLong31, 0);
	}

	@OriginalMember(owner = "client!aek", name = "ak", descriptor = "()I", line = 81)
	@Override
	public int method21419() {
		return IDirect3DSwapChain.Present(this.aLong31, 0);
	}

	@OriginalMember(owner = "client!aek", name = "o", descriptor = "(II)I", line = 85)
	@Override
	public int method21413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DSwapChain.Present(this.aLong31, 0);
	}

	@OriginalMember(owner = "client!aek", name = "aa", descriptor = "(II)I", line = 85)
	@Override
	public int method21420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DSwapChain.Present(this.aLong31, 0);
	}

	@OriginalMember(owner = "client!aek", name = "ah", descriptor = "(II)I", line = 85)
	@Override
	public int method21416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DSwapChain.Present(this.aLong31, 0);
	}

	@OriginalMember(owner = "client!aek", name = "i", descriptor = "(II)V", line = 89)
	@Override
	void method21414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method21392();
		this.anInt976 = arg0;
		this.anInt977 = arg1;
		if (this.aBoolean195) {
			this.aClass21_Sub3_Sub2_9.method17840(this.anInt976, this.anInt977);
		}
		this.method8889();
		super.method21414(arg0, arg1);
	}

	@OriginalMember(owner = "client!aek", name = "k", descriptor = "(II)V", line = 89)
	@Override
	void method21417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method21392();
		this.anInt976 = arg0;
		this.anInt977 = arg1;
		if (this.aBoolean195) {
			this.aClass21_Sub3_Sub2_9.method17840(this.anInt976, this.anInt977);
		}
		this.method8889();
		super.method21414(arg0, arg1);
	}

	@OriginalMember(owner = "client!aek", name = "at", descriptor = "(II)V", line = 89)
	@Override
	void method21411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method21392();
		this.anInt976 = arg0;
		this.anInt977 = arg1;
		if (this.aBoolean195) {
			this.aClass21_Sub3_Sub2_9.method17840(this.anInt976, this.anInt977);
		}
		this.method8889();
		super.method21414(arg0, arg1);
	}

	@OriginalMember(owner = "client!aek", name = "f", descriptor = "(II)V", line = 89)
	@Override
	void method21415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method21392();
		this.anInt976 = arg0;
		this.anInt977 = arg1;
		if (this.aBoolean195) {
			this.aClass21_Sub3_Sub2_9.method17840(this.anInt976, this.anInt977);
		}
		this.method8889();
		super.method21414(arg0, arg1);
	}

	@OriginalMember(owner = "client!aek", name = "n", descriptor = "()V", line = 98)
	@Override
	public void method21402() {
		if (this.aLong33 != 0L) {
			IUnknown.Release(this.aLong33);
			this.aLong33 = 0L;
		}
		if (this.aLong32 != 0L) {
			IUnknown.Release(this.aLong32);
			this.aLong32 = 0L;
		}
		if (this.aLong31 != 0L) {
			IUnknown.Release(this.aLong31);
			this.aLong31 = 0L;
		}
		this.aClass21_Sub3_Sub2_9.method17821(this);
	}

	@OriginalMember(owner = "client!aek", name = "g", descriptor = "()V", line = 98)
	@Override
	public void method21392() {
		if (this.aLong33 != 0L) {
			IUnknown.Release(this.aLong33);
			this.aLong33 = 0L;
		}
		if (this.aLong32 != 0L) {
			IUnknown.Release(this.aLong32);
			this.aLong32 = 0L;
		}
		if (this.aLong31 != 0L) {
			IUnknown.Release(this.aLong31);
			this.aLong31 = 0L;
		}
		this.aClass21_Sub3_Sub2_9.method17821(this);
	}

	@OriginalMember(owner = "client!aek", name = "r", descriptor = "()V", line = 98)
	@Override
	public void method21395() {
		if (this.aLong33 != 0L) {
			IUnknown.Release(this.aLong33);
			this.aLong33 = 0L;
		}
		if (this.aLong32 != 0L) {
			IUnknown.Release(this.aLong32);
			this.aLong32 = 0L;
		}
		if (this.aLong31 != 0L) {
			IUnknown.Release(this.aLong31);
			this.aLong31 = 0L;
		}
		this.aClass21_Sub3_Sub2_9.method17821(this);
	}

	@OriginalMember(owner = "client!aek", name = "e", descriptor = "()V", line = 98)
	@Override
	public void method21406() {
		if (this.aLong33 != 0L) {
			IUnknown.Release(this.aLong33);
			this.aLong33 = 0L;
		}
		if (this.aLong32 != 0L) {
			IUnknown.Release(this.aLong32);
			this.aLong32 = 0L;
		}
		if (this.aLong31 != 0L) {
			IUnknown.Release(this.aLong31);
			this.aLong31 = 0L;
		}
		this.aClass21_Sub3_Sub2_9.method17821(this);
	}

	@OriginalMember(owner = "client!aek", name = "an", descriptor = "()V", line = 114)
	void method8891() {
		if (this.aLong33 != 0L) {
			IUnknown.Release(this.aLong33);
			this.aLong33 = 0L;
		}
		if (this.aLong32 != 0L) {
			IUnknown.Release(this.aLong32);
			this.aLong32 = 0L;
		}
		if (this.aLong31 != 0L) {
			IUnknown.Release(this.aLong31);
			this.aLong31 = 0L;
		}
		this.aClass21_Sub3_Sub2_9.method17821(this);
	}

	@OriginalMember(owner = "client!aek", name = "aj", descriptor = "()V", line = 114)
	void method8893() {
		if (this.aLong33 != 0L) {
			IUnknown.Release(this.aLong33);
			this.aLong33 = 0L;
		}
		if (this.aLong32 != 0L) {
			IUnknown.Release(this.aLong32);
			this.aLong32 = 0L;
		}
		if (this.aLong31 != 0L) {
			IUnknown.Release(this.aLong31);
			this.aLong31 = 0L;
		}
		this.aClass21_Sub3_Sub2_9.method17821(this);
	}

	@OriginalMember(owner = "client!aek", name = "hh", descriptor = "()V", line = 130)
	void method8892() throws Throwable {
		this.method8891();
		super.finalize();
	}

	@OriginalMember(owner = "client!aek", name = "finalize", descriptor = "()V", line = 130)
	@Override
	void finalize() throws Throwable {
		this.method8891();
		super.finalize();
	}
}
