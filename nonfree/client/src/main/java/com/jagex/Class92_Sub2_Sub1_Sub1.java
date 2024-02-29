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

@OriginalClass("client!aip")
public class Class92_Sub2_Sub1_Sub1 extends Class92_Sub2_Sub1 implements Interface49 {

	@OriginalMember(owner = "client!aip", name = "v", descriptor = "J")
	long aLong50;

	@OriginalMember(owner = "client!aip", name = "l", descriptor = "J")
	long aLong51;

	@OriginalMember(owner = "client!aip", name = "d", descriptor = "Lclient!jagdx/D3DPRESENT_PARAMETERS;")
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS1;

	@OriginalMember(owner = "client!aip", name = "y", descriptor = "J")
	long aLong52;

	@OriginalMember(owner = "client!aip", name = "q", descriptor = "Z")
	boolean aBoolean303 = false;

	@OriginalMember(owner = "client!aip", name = "x", descriptor = "Z")
	boolean aBoolean304 = false;

	@OriginalMember(owner = "client!aip", name = "c", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas1;

	@OriginalMember(owner = "client!aip", name = "p", descriptor = "Lclient!apn;")
	final Class86_Sub1_Sub1 aClass86_Sub1_Sub1_9;

	@OriginalMember(owner = "client!aip", name = "w", descriptor = "I")
	int anInt1422;

	@OriginalMember(owner = "client!aip", name = "t", descriptor = "I")
	int anInt1421;

	@OriginalMember(owner = "client!aip", name = "<init>", descriptor = "(Lclient!apn;Ljava/awt/Canvas;IIZ)V", line = 22)
	Class92_Sub2_Sub1_Sub1(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0);
		this.aCanvas1 = arg1;
		this.aClass86_Sub1_Sub1_9 = arg0;
		this.anInt1422 = arg2;
		this.anInt1421 = arg3;
		this.aBoolean304 = arg4;
		this.method12664();
	}

	@OriginalMember(owner = "client!aip", name = "o", descriptor = "()V", line = 32)
	@Override
	public void method12663() {
		if (this.aLong50 == 0L) {
			this.aD3DPRESENT_PARAMETERS1 = new D3DPRESENT_PARAMETERS(this.aCanvas1);
			this.aD3DPRESENT_PARAMETERS1.Windowed = true;
			this.aD3DPRESENT_PARAMETERS1.BackBufferCount = 1;
			this.aD3DPRESENT_PARAMETERS1.PresentationInterval = Integer.MIN_VALUE;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = this.anInt1422;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = this.anInt1421;
			if (this.aBoolean304) {
				this.aLong50 = IDirect3DDevice.GetSwapChain(this.aClass86_Sub1_Sub1_9.aLong119, 0);
				this.aLong52 = IDirect3DSwapChain.GetBackBuffer(this.aLong50, 0, 0);
				this.aLong51 = IDirect3DDevice.GetDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119);
			} else if (Class86_Sub1_Sub1.method19588(this.aClass86_Sub1_Sub1_9.anInt2713, this.aClass86_Sub1_Sub1_9.anInt2709, this.aClass86_Sub1_Sub1_9.aLong113, this.aClass86_Sub1_Sub1_9.anInt2844, this.aClass86_Sub1_Sub1_9.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(84) int local84 = this.aD3DPRESENT_PARAMETERS1.AutoDepthStencilFormat;
				this.aLong50 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass86_Sub1_Sub1_9.aLong119, this.aD3DPRESENT_PARAMETERS1);
				this.aLong52 = IDirect3DSwapChain.GetBackBuffer(this.aLong50, 0, 0);
				this.aLong51 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119, this.anInt1422, this.anInt1421, local84, this.aD3DPRESENT_PARAMETERS1.MultiSampleType, this.aD3DPRESENT_PARAMETERS1.MultiSampleQuality, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass86_Sub1_Sub1_9.method19539(this);
		}
		if (this.aBoolean303) {
			this.method23508();
		}
	}

	@OriginalMember(owner = "client!aip", name = "e", descriptor = "()V", line = 32)
	@Override
	public void method12664() {
		if (this.aLong50 == 0L) {
			this.aD3DPRESENT_PARAMETERS1 = new D3DPRESENT_PARAMETERS(this.aCanvas1);
			this.aD3DPRESENT_PARAMETERS1.Windowed = true;
			this.aD3DPRESENT_PARAMETERS1.BackBufferCount = 1;
			this.aD3DPRESENT_PARAMETERS1.PresentationInterval = Integer.MIN_VALUE;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = this.anInt1422;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = this.anInt1421;
			if (this.aBoolean304) {
				this.aLong50 = IDirect3DDevice.GetSwapChain(this.aClass86_Sub1_Sub1_9.aLong119, 0);
				this.aLong52 = IDirect3DSwapChain.GetBackBuffer(this.aLong50, 0, 0);
				this.aLong51 = IDirect3DDevice.GetDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119);
			} else if (Class86_Sub1_Sub1.method19588(this.aClass86_Sub1_Sub1_9.anInt2713, this.aClass86_Sub1_Sub1_9.anInt2709, this.aClass86_Sub1_Sub1_9.aLong113, this.aClass86_Sub1_Sub1_9.anInt2844, this.aClass86_Sub1_Sub1_9.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(84) int local84 = this.aD3DPRESENT_PARAMETERS1.AutoDepthStencilFormat;
				this.aLong50 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass86_Sub1_Sub1_9.aLong119, this.aD3DPRESENT_PARAMETERS1);
				this.aLong52 = IDirect3DSwapChain.GetBackBuffer(this.aLong50, 0, 0);
				this.aLong51 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119, this.anInt1422, this.anInt1421, local84, this.aD3DPRESENT_PARAMETERS1.MultiSampleType, this.aD3DPRESENT_PARAMETERS1.MultiSampleQuality, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass86_Sub1_Sub1_9.method19539(this);
		}
		if (this.aBoolean303) {
			this.method23508();
		}
	}

	@OriginalMember(owner = "client!aip", name = "b", descriptor = "()V", line = 32)
	@Override
	public void method12665() {
		if (this.aLong50 == 0L) {
			this.aD3DPRESENT_PARAMETERS1 = new D3DPRESENT_PARAMETERS(this.aCanvas1);
			this.aD3DPRESENT_PARAMETERS1.Windowed = true;
			this.aD3DPRESENT_PARAMETERS1.BackBufferCount = 1;
			this.aD3DPRESENT_PARAMETERS1.PresentationInterval = Integer.MIN_VALUE;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = this.anInt1422;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = this.anInt1421;
			if (this.aBoolean304) {
				this.aLong50 = IDirect3DDevice.GetSwapChain(this.aClass86_Sub1_Sub1_9.aLong119, 0);
				this.aLong52 = IDirect3DSwapChain.GetBackBuffer(this.aLong50, 0, 0);
				this.aLong51 = IDirect3DDevice.GetDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119);
			} else if (Class86_Sub1_Sub1.method19588(this.aClass86_Sub1_Sub1_9.anInt2713, this.aClass86_Sub1_Sub1_9.anInt2709, this.aClass86_Sub1_Sub1_9.aLong113, this.aClass86_Sub1_Sub1_9.anInt2844, this.aClass86_Sub1_Sub1_9.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(84) int local84 = this.aD3DPRESENT_PARAMETERS1.AutoDepthStencilFormat;
				this.aLong50 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass86_Sub1_Sub1_9.aLong119, this.aD3DPRESENT_PARAMETERS1);
				this.aLong52 = IDirect3DSwapChain.GetBackBuffer(this.aLong50, 0, 0);
				this.aLong51 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119, this.anInt1422, this.anInt1421, local84, this.aD3DPRESENT_PARAMETERS1.MultiSampleType, this.aD3DPRESENT_PARAMETERS1.MultiSampleQuality, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass86_Sub1_Sub1_9.method19539(this);
		}
		if (this.aBoolean303) {
			this.method23508();
		}
	}

	@OriginalMember(owner = "client!aip", name = "f", descriptor = "()V", line = 32)
	@Override
	public void method12666() {
		if (this.aLong50 == 0L) {
			this.aD3DPRESENT_PARAMETERS1 = new D3DPRESENT_PARAMETERS(this.aCanvas1);
			this.aD3DPRESENT_PARAMETERS1.Windowed = true;
			this.aD3DPRESENT_PARAMETERS1.BackBufferCount = 1;
			this.aD3DPRESENT_PARAMETERS1.PresentationInterval = Integer.MIN_VALUE;
			this.aD3DPRESENT_PARAMETERS1.BackBufferWidth = this.anInt1422;
			this.aD3DPRESENT_PARAMETERS1.BackBufferHeight = this.anInt1421;
			if (this.aBoolean304) {
				this.aLong50 = IDirect3DDevice.GetSwapChain(this.aClass86_Sub1_Sub1_9.aLong119, 0);
				this.aLong52 = IDirect3DSwapChain.GetBackBuffer(this.aLong50, 0, 0);
				this.aLong51 = IDirect3DDevice.GetDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119);
			} else if (Class86_Sub1_Sub1.method19588(this.aClass86_Sub1_Sub1_9.anInt2713, this.aClass86_Sub1_Sub1_9.anInt2709, this.aClass86_Sub1_Sub1_9.aLong113, this.aClass86_Sub1_Sub1_9.anInt2844, this.aClass86_Sub1_Sub1_9.aD3DDISPLAYMODE1, this.aD3DPRESENT_PARAMETERS1)) {
				@Pc(84) int local84 = this.aD3DPRESENT_PARAMETERS1.AutoDepthStencilFormat;
				this.aLong50 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass86_Sub1_Sub1_9.aLong119, this.aD3DPRESENT_PARAMETERS1);
				this.aLong52 = IDirect3DSwapChain.GetBackBuffer(this.aLong50, 0, 0);
				this.aLong51 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119, this.anInt1422, this.anInt1421, local84, this.aD3DPRESENT_PARAMETERS1.MultiSampleType, this.aD3DPRESENT_PARAMETERS1.MultiSampleQuality, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass86_Sub1_Sub1_9.method19539(this);
		}
		if (this.aBoolean303) {
			this.method23508();
		}
	}

	@OriginalMember(owner = "client!aip", name = "p", descriptor = "()I", line = 57)
	@Override
	public int method23491() {
		return this.anInt1422;
	}

	@OriginalMember(owner = "client!aip", name = "w", descriptor = "()I", line = 57)
	@Override
	public int method23497() {
		return this.anInt1422;
	}

	@OriginalMember(owner = "client!aip", name = "c", descriptor = "()I", line = 61)
	@Override
	public int method23493() {
		return this.anInt1421;
	}

	@OriginalMember(owner = "client!aip", name = "t", descriptor = "()I", line = 61)
	@Override
	public int method23498() {
		return this.anInt1421;
	}

	@OriginalMember(owner = "client!aip", name = "q", descriptor = "()I", line = 61)
	@Override
	public int method23499() {
		return this.anInt1421;
	}

	@OriginalMember(owner = "client!aip", name = "l", descriptor = "()Z", line = 65)
	@Override
	public boolean method23508() {
		this.aBoolean303 = true;
		if (this.aLong50 == 0L) {
			if (this.aClass86_Sub1_Sub1_9.aBoolean412) {
				return false;
			}
			this.method12664();
		}
		if (p.method27707(IDirect3DDevice.SetRenderTarget(this.aClass86_Sub1_Sub1_9.aLong119, 0, this.aLong52))) {
			return false;
		} else if (p.method27707(IDirect3DDevice.SetDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119, this.aLong51))) {
			return false;
		} else {
			return super.method23508();
		}
	}

	@OriginalMember(owner = "client!aip", name = "d", descriptor = "()Z", line = 65)
	@Override
	public boolean method23492() {
		this.aBoolean303 = true;
		if (this.aLong50 == 0L) {
			if (this.aClass86_Sub1_Sub1_9.aBoolean412) {
				return false;
			}
			this.method12664();
		}
		if (p.method27707(IDirect3DDevice.SetRenderTarget(this.aClass86_Sub1_Sub1_9.aLong119, 0, this.aLong52))) {
			return false;
		} else if (p.method27707(IDirect3DDevice.SetDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119, this.aLong51))) {
			return false;
		} else {
			return super.method23508();
		}
	}

	@OriginalMember(owner = "client!aip", name = "r", descriptor = "()Z", line = 65)
	@Override
	public boolean method23495() {
		this.aBoolean303 = true;
		if (this.aLong50 == 0L) {
			if (this.aClass86_Sub1_Sub1_9.aBoolean412) {
				return false;
			}
			this.method12664();
		}
		if (p.method27707(IDirect3DDevice.SetRenderTarget(this.aClass86_Sub1_Sub1_9.aLong119, 0, this.aLong52))) {
			return false;
		} else if (p.method27707(IDirect3DDevice.SetDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119, this.aLong51))) {
			return false;
		} else {
			return super.method23508();
		}
	}

	@OriginalMember(owner = "client!aip", name = "x", descriptor = "()Z", line = 65)
	@Override
	public boolean method23500() {
		this.aBoolean303 = true;
		if (this.aLong50 == 0L) {
			if (this.aClass86_Sub1_Sub1_9.aBoolean412) {
				return false;
			}
			this.method12664();
		}
		if (p.method27707(IDirect3DDevice.SetRenderTarget(this.aClass86_Sub1_Sub1_9.aLong119, 0, this.aLong52))) {
			return false;
		} else if (p.method27707(IDirect3DDevice.SetDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119, this.aLong51))) {
			return false;
		} else {
			return super.method23508();
		}
	}

	@OriginalMember(owner = "client!aip", name = "s", descriptor = "()Z", line = 65)
	@Override
	public boolean method23494() {
		this.aBoolean303 = true;
		if (this.aLong50 == 0L) {
			if (this.aClass86_Sub1_Sub1_9.aBoolean412) {
				return false;
			}
			this.method12664();
		}
		if (p.method27707(IDirect3DDevice.SetRenderTarget(this.aClass86_Sub1_Sub1_9.aLong119, 0, this.aLong52))) {
			return false;
		} else if (p.method27707(IDirect3DDevice.SetDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119, this.aLong51))) {
			return false;
		} else {
			return super.method23508();
		}
	}

	@OriginalMember(owner = "client!aip", name = "y", descriptor = "()Z", line = 76)
	@Override
	boolean method23496() {
		this.aBoolean303 = false;
		return p.method27710(IDirect3DDevice.SetDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119, 0L));
	}

	@OriginalMember(owner = "client!aip", name = "z", descriptor = "()Z", line = 76)
	@Override
	boolean method23504() {
		this.aBoolean303 = false;
		return p.method27710(IDirect3DDevice.SetDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119, 0L));
	}

	@OriginalMember(owner = "client!aip", name = "j", descriptor = "()Z", line = 76)
	@Override
	boolean method23505() {
		this.aBoolean303 = false;
		return p.method27710(IDirect3DDevice.SetDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119, 0L));
	}

	@OriginalMember(owner = "client!aip", name = "g", descriptor = "()Z", line = 76)
	@Override
	boolean method23503() {
		this.aBoolean303 = false;
		return p.method27710(IDirect3DDevice.SetDepthStencilSurface(this.aClass86_Sub1_Sub1_9.aLong119, 0L));
	}

	@OriginalMember(owner = "client!aip", name = "n", descriptor = "()I", line = 81)
	@Override
	public int method23348() {
		return IDirect3DSwapChain.Present(this.aLong50, 0);
	}

	@OriginalMember(owner = "client!aip", name = "aj", descriptor = "()I", line = 81)
	@Override
	public int method23352() {
		return IDirect3DSwapChain.Present(this.aLong50, 0);
	}

	@OriginalMember(owner = "client!aip", name = "ag", descriptor = "()I", line = 81)
	@Override
	public int method23355() {
		return IDirect3DSwapChain.Present(this.aLong50, 0);
	}

	@OriginalMember(owner = "client!aip", name = "al", descriptor = "()I", line = 81)
	@Override
	public int method23354() {
		return IDirect3DSwapChain.Present(this.aLong50, 0);
	}

	@OriginalMember(owner = "client!aip", name = "ai", descriptor = "()I", line = 81)
	@Override
	public int method23347() {
		return IDirect3DSwapChain.Present(this.aLong50, 0);
	}

	@OriginalMember(owner = "client!aip", name = "a", descriptor = "(II)I", line = 85)
	@Override
	public int method23349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DSwapChain.Present(this.aLong50, 0);
	}

	@OriginalMember(owner = "client!aip", name = "ao", descriptor = "(II)I", line = 85)
	@Override
	public int method23353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DSwapChain.Present(this.aLong50, 0);
	}

	@OriginalMember(owner = "client!aip", name = "h", descriptor = "(II)V", line = 89)
	@Override
	void method23351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23506();
		this.anInt1422 = arg0;
		this.anInt1421 = arg1;
		if (this.aBoolean304) {
			this.aClass86_Sub1_Sub1_9.method19532(this.anInt1422, this.anInt1421);
		}
		this.method12664();
		super.method23350(arg0, arg1);
	}

	@OriginalMember(owner = "client!aip", name = "m", descriptor = "(II)V", line = 89)
	@Override
	void method23350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23506();
		this.anInt1422 = arg0;
		this.anInt1421 = arg1;
		if (this.aBoolean304) {
			this.aClass86_Sub1_Sub1_9.method19532(this.anInt1422, this.anInt1421);
		}
		this.method12664();
		super.method23350(arg0, arg1);
	}

	@OriginalMember(owner = "client!aip", name = "k", descriptor = "()V", line = 98)
	@Override
	public void method23507() {
		if (this.aLong52 != 0L) {
			IUnknown.Release(this.aLong52);
			this.aLong52 = 0L;
		}
		if (this.aLong51 != 0L) {
			IUnknown.Release(this.aLong51);
			this.aLong51 = 0L;
		}
		if (this.aLong50 != 0L) {
			IUnknown.Release(this.aLong50);
			this.aLong50 = 0L;
		}
		this.aClass86_Sub1_Sub1_9.method19543(this);
	}

	@OriginalMember(owner = "client!aip", name = "v", descriptor = "()V", line = 98)
	@Override
	public void method23506() {
		if (this.aLong52 != 0L) {
			IUnknown.Release(this.aLong52);
			this.aLong52 = 0L;
		}
		if (this.aLong51 != 0L) {
			IUnknown.Release(this.aLong51);
			this.aLong51 = 0L;
		}
		if (this.aLong50 != 0L) {
			IUnknown.Release(this.aLong50);
			this.aLong50 = 0L;
		}
		this.aClass86_Sub1_Sub1_9.method19543(this);
	}

	@OriginalMember(owner = "client!aip", name = "i", descriptor = "()V", line = 98)
	@Override
	public void method23502() {
		if (this.aLong52 != 0L) {
			IUnknown.Release(this.aLong52);
			this.aLong52 = 0L;
		}
		if (this.aLong51 != 0L) {
			IUnknown.Release(this.aLong51);
			this.aLong51 = 0L;
		}
		if (this.aLong50 != 0L) {
			IUnknown.Release(this.aLong50);
			this.aLong50 = 0L;
		}
		this.aClass86_Sub1_Sub1_9.method19543(this);
	}

	@OriginalMember(owner = "client!aip", name = "u", descriptor = "()V", line = 98)
	@Override
	public void method23501() {
		if (this.aLong52 != 0L) {
			IUnknown.Release(this.aLong52);
			this.aLong52 = 0L;
		}
		if (this.aLong51 != 0L) {
			IUnknown.Release(this.aLong51);
			this.aLong51 = 0L;
		}
		if (this.aLong50 != 0L) {
			IUnknown.Release(this.aLong50);
			this.aLong50 = 0L;
		}
		this.aClass86_Sub1_Sub1_9.method19543(this);
	}

	@OriginalMember(owner = "client!aip", name = "ax", descriptor = "()V", line = 114)
	void method12667() {
		if (this.aLong52 != 0L) {
			IUnknown.Release(this.aLong52);
			this.aLong52 = 0L;
		}
		if (this.aLong51 != 0L) {
			IUnknown.Release(this.aLong51);
			this.aLong51 = 0L;
		}
		if (this.aLong50 != 0L) {
			IUnknown.Release(this.aLong50);
			this.aLong50 = 0L;
		}
		this.aClass86_Sub1_Sub1_9.method19543(this);
	}

	@OriginalMember(owner = "client!aip", name = "ak", descriptor = "()V", line = 114)
	void method12668() {
		if (this.aLong52 != 0L) {
			IUnknown.Release(this.aLong52);
			this.aLong52 = 0L;
		}
		if (this.aLong51 != 0L) {
			IUnknown.Release(this.aLong51);
			this.aLong51 = 0L;
		}
		if (this.aLong50 != 0L) {
			IUnknown.Release(this.aLong50);
			this.aLong50 = 0L;
		}
		this.aClass86_Sub1_Sub1_9.method19543(this);
	}

	@OriginalMember(owner = "client!aip", name = "ar", descriptor = "()V", line = 114)
	void method12669() {
		if (this.aLong52 != 0L) {
			IUnknown.Release(this.aLong52);
			this.aLong52 = 0L;
		}
		if (this.aLong51 != 0L) {
			IUnknown.Release(this.aLong51);
			this.aLong51 = 0L;
		}
		if (this.aLong50 != 0L) {
			IUnknown.Release(this.aLong50);
			this.aLong50 = 0L;
		}
		this.aClass86_Sub1_Sub1_9.method19543(this);
	}

	@OriginalMember(owner = "client!aip", name = "au", descriptor = "()V", line = 114)
	void method12670() {
		if (this.aLong52 != 0L) {
			IUnknown.Release(this.aLong52);
			this.aLong52 = 0L;
		}
		if (this.aLong51 != 0L) {
			IUnknown.Release(this.aLong51);
			this.aLong51 = 0L;
		}
		if (this.aLong50 != 0L) {
			IUnknown.Release(this.aLong50);
			this.aLong50 = 0L;
		}
		this.aClass86_Sub1_Sub1_9.method19543(this);
	}

	@OriginalMember(owner = "client!aip", name = "hc", descriptor = "()V", line = 130)
	void method12671() throws Throwable {
		this.method12668();
		super.finalize();
	}

	@OriginalMember(owner = "client!aip", name = "finalize", descriptor = "()V", line = 130)
	@Override
	void finalize() throws Throwable {
		this.method12668();
		super.finalize();
	}

	@OriginalMember(owner = "client!aip", name = "hd", descriptor = "()V", line = 130)
	void method12672() throws Throwable {
		this.method12668();
		super.finalize();
	}

	@OriginalMember(owner = "client!aip", name = "hp", descriptor = "()V", line = 130)
	void method12673() throws Throwable {
		this.method12668();
		super.finalize();
	}
}
