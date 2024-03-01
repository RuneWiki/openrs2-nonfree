package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class Class310 implements Interface35 {

	@OriginalMember(owner = "client!lw", name = "p", descriptor = "Lclient!akw;")
	final Class21_Sub3_Sub2 aClass21_Sub3_Sub2_14;

	@OriginalMember(owner = "client!lw", name = "l", descriptor = "I")
	final int anInt4526;

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "I")
	final int anInt4527;

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "Lclient!cw;")
	final Class121 aClass121_26;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "Lclient!dj;")
	final Class127 aClass127_31;

	@OriginalMember(owner = "client!lw", name = "x", descriptor = "J")
	long aLong262;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!akw;Lclient!cw;Lclient!dj;III)V", line = 17)
	Class310(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass21_Sub3_Sub2_14 = arg0;
		this.anInt4526 = arg3;
		this.anInt4527 = arg4;
		this.aClass121_26 = arg1;
		this.aClass127_31 = arg2;
		this.aLong262 = IDirect3DDevice.CreateRenderTarget(this.aClass21_Sub3_Sub2_14.aLong104, arg3, arg4, Class21_Sub3_Sub2.method17833(this.aClass121_26, this.aClass127_31), arg5, 0, false);
		this.aClass21_Sub3_Sub2_14.method17583(this);
	}

	@OriginalMember(owner = "client!lw", name = "l", descriptor = "()I", line = 28)
	@Override
	public int method27213() {
		return this.anInt4526;
	}

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "()I", line = 28)
	@Override
	public int method27214() {
		return this.anInt4526;
	}

	@OriginalMember(owner = "client!lw", name = "p", descriptor = "()I", line = 28)
	@Override
	public int method27217() {
		return this.anInt4526;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "()I", line = 32)
	@Override
	public int method27212() {
		return this.anInt4527;
	}

	@OriginalMember(owner = "client!lw", name = "x", descriptor = "()I", line = 32)
	@Override
	public int method27211() {
		return this.anInt4527;
	}

	@OriginalMember(owner = "client!lw", name = "s", descriptor = "()I", line = 32)
	@Override
	public int method27216() {
		return this.anInt4527;
	}

	@OriginalMember(owner = "client!lw", name = "u", descriptor = "()I", line = 32)
	@Override
	public int method27215() {
		return this.anInt4527;
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "()J", line = 36)
	@Override
	public long method25774() {
		return this.aLong262;
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "()J", line = 36)
	@Override
	public long method25777() {
		return this.aLong262;
	}

	@OriginalMember(owner = "client!lw", name = "r", descriptor = "()J", line = 36)
	@Override
	public long method25776() {
		return this.aLong262;
	}

	@OriginalMember(owner = "client!lw", name = "y", descriptor = "()V", line = 40)
	@Override
	public void method27208() {
		if (this.aLong262 != 0L) {
			IUnknown.Release(this.aLong262);
			this.aLong262 = 0L;
		}
		this.aClass21_Sub3_Sub2_14.method17430(this);
	}

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "()V", line = 40)
	@Override
	public void method27209() {
		if (this.aLong262 != 0L) {
			IUnknown.Release(this.aLong262);
			this.aLong262 = 0L;
		}
		this.aClass21_Sub3_Sub2_14.method17430(this);
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "()V", line = 40)
	@Override
	public void method27210() {
		if (this.aLong262 != 0L) {
			IUnknown.Release(this.aLong262);
			this.aLong262 = 0L;
		}
		this.aClass21_Sub3_Sub2_14.method17430(this);
	}

	@OriginalMember(owner = "client!lw", name = "z", descriptor = "()V", line = 48)
	@Override
	public void method25771() {
		if (this.aLong262 != 0L) {
			this.aClass21_Sub3_Sub2_14.method17837(this.aLong262);
			this.aLong262 = 0L;
		}
	}

	@OriginalMember(owner = "client!lw", name = "n", descriptor = "()V", line = 48)
	@Override
	public void method25772() {
		if (this.aLong262 != 0L) {
			this.aClass21_Sub3_Sub2_14.method17837(this.aLong262);
			this.aLong262 = 0L;
		}
	}

	@OriginalMember(owner = "client!lw", name = "j", descriptor = "()V", line = 48)
	@Override
	public void method25773() {
		if (this.aLong262 != 0L) {
			this.aClass21_Sub3_Sub2_14.method17837(this.aLong262);
			this.aLong262 = 0L;
		}
	}

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "()V", line = 48)
	@Override
	public void method25775() {
		if (this.aLong262 != 0L) {
			this.aClass21_Sub3_Sub2_14.method17837(this.aLong262);
			this.aLong262 = 0L;
		}
	}

	@OriginalMember(owner = "client!lw", name = "finalize", descriptor = "()V", line = 55)
	@Override
	void finalize() {
		this.method25771();
	}

	@OriginalMember(owner = "client!lw", name = "hh", descriptor = "()V", line = 55)
	void method25778() {
		this.method25771();
	}
}
