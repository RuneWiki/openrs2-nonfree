package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class Class307 implements Interface36 {

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "Lclient!akw;")
	final Class21_Sub3_Sub2 aClass21_Sub3_Sub2_13;

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
	final int anInt4474;

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
	final int anInt4473;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "Lclient!dj;")
	final Class127 aClass127_30;

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "J")
	long aLong261;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lclient!akw;Lclient!dj;III)V", line = 16)
	Class307(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass21_Sub3_Sub2_13 = arg0;
		this.anInt4474 = arg2;
		this.anInt4473 = arg3;
		this.aClass127_30 = arg1;
		this.aLong261 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass21_Sub3_Sub2_13.aLong104, arg2, arg3, Class21_Sub3_Sub2.method17834(this.aClass127_30), arg4, 0, false);
		this.aClass21_Sub3_Sub2_13.method17583(this);
	}

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "()I", line = 26)
	@Override
	public int method27213() {
		return this.anInt4474;
	}

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "()I", line = 26)
	@Override
	public int method27217() {
		return this.anInt4474;
	}

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "()I", line = 26)
	@Override
	public int method27214() {
		return this.anInt4474;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "()I", line = 30)
	@Override
	public int method27212() {
		return this.anInt4473;
	}

	@OriginalMember(owner = "client!lt", name = "x", descriptor = "()I", line = 30)
	@Override
	public int method27211() {
		return this.anInt4473;
	}

	@OriginalMember(owner = "client!lt", name = "u", descriptor = "()I", line = 30)
	@Override
	public int method27215() {
		return this.anInt4473;
	}

	@OriginalMember(owner = "client!lt", name = "s", descriptor = "()I", line = 30)
	@Override
	public int method27216() {
		return this.anInt4473;
	}

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "()J", line = 34)
	@Override
	public long method25774() {
		return this.aLong261;
	}

	@OriginalMember(owner = "client!lt", name = "r", descriptor = "()J", line = 34)
	@Override
	public long method25776() {
		return this.aLong261;
	}

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "()J", line = 34)
	@Override
	public long method25777() {
		return this.aLong261;
	}

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "()V", line = 38)
	@Override
	public void method27209() {
		if (this.aLong261 != 0L) {
			IUnknown.Release(this.aLong261);
			this.aLong261 = 0L;
		}
		this.aClass21_Sub3_Sub2_13.method17430(this);
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "()V", line = 38)
	@Override
	public void method27210() {
		if (this.aLong261 != 0L) {
			IUnknown.Release(this.aLong261);
			this.aLong261 = 0L;
		}
		this.aClass21_Sub3_Sub2_13.method17430(this);
	}

	@OriginalMember(owner = "client!lt", name = "y", descriptor = "()V", line = 38)
	@Override
	public void method27208() {
		if (this.aLong261 != 0L) {
			IUnknown.Release(this.aLong261);
			this.aLong261 = 0L;
		}
		this.aClass21_Sub3_Sub2_13.method17430(this);
	}

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "()V", line = 46)
	@Override
	public void method25775() {
		if (this.aLong261 != 0L) {
			this.aClass21_Sub3_Sub2_13.method17837(this.aLong261);
			this.aLong261 = 0L;
		}
	}

	@OriginalMember(owner = "client!lt", name = "j", descriptor = "()V", line = 46)
	@Override
	public void method25773() {
		if (this.aLong261 != 0L) {
			this.aClass21_Sub3_Sub2_13.method17837(this.aLong261);
			this.aLong261 = 0L;
		}
	}

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "()V", line = 46)
	@Override
	public void method25772() {
		if (this.aLong261 != 0L) {
			this.aClass21_Sub3_Sub2_13.method17837(this.aLong261);
			this.aLong261 = 0L;
		}
	}

	@OriginalMember(owner = "client!lt", name = "z", descriptor = "()V", line = 46)
	@Override
	public void method25771() {
		if (this.aLong261 != 0L) {
			this.aClass21_Sub3_Sub2_13.method17837(this.aLong261);
			this.aLong261 = 0L;
		}
	}

	@OriginalMember(owner = "client!lt", name = "finalize", descriptor = "()V", line = 53)
	@Override
	void finalize() {
		this.method25771();
	}

	@OriginalMember(owner = "client!lt", name = "hh", descriptor = "()V", line = 53)
	void method25749() {
		this.method25771();
	}
}
