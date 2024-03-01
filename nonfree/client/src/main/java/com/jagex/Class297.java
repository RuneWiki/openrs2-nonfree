package com.jagex;

import jagdx.IDirect3DTexture;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class Class297 implements Interface35, Interface36 {

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "J")
	long aLong258;

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
	final int anInt4393;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "Lclient!aeg;")
	final Class29_Sub1_Sub1 aClass29_Sub1_Sub1_1;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!aeg;I)V", line = 92)
	Class297(@OriginalArg(0) Class29_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt4393 = arg1;
		this.aClass29_Sub1_Sub1_1 = arg0;
		this.aClass29_Sub1_Sub1_1.aClass21_Sub3_Sub2_8.method17583(this);
	}

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "()I", line = 99)
	@Override
	public int method27213() {
		return this.aClass29_Sub1_Sub1_1.method8961();
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "()I", line = 99)
	@Override
	public int method27214() {
		return this.aClass29_Sub1_Sub1_1.method8961();
	}

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "()I", line = 99)
	@Override
	public int method27217() {
		return this.aClass29_Sub1_Sub1_1.method8961();
	}

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "()I", line = 103)
	@Override
	public int method27211() {
		return this.aClass29_Sub1_Sub1_1.method8931();
	}

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "()I", line = 103)
	@Override
	public int method27216() {
		return this.aClass29_Sub1_Sub1_1.method8931();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "()I", line = 103)
	@Override
	public int method27212() {
		return this.aClass29_Sub1_Sub1_1.method8931();
	}

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "()I", line = 103)
	@Override
	public int method27215() {
		return this.aClass29_Sub1_Sub1_1.method8931();
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "()J", line = 107)
	@Override
	public long method25774() {
		if (this.aLong258 == 0L) {
			this.aLong258 = IDirect3DTexture.GetSurfaceLevel(this.aClass29_Sub1_Sub1_1.aLong27, this.anInt4393);
		}
		return this.aLong258;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "()J", line = 107)
	@Override
	public long method25777() {
		if (this.aLong258 == 0L) {
			this.aLong258 = IDirect3DTexture.GetSurfaceLevel(this.aClass29_Sub1_Sub1_1.aLong27, this.anInt4393);
		}
		return this.aLong258;
	}

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "()J", line = 107)
	@Override
	public long method25776() {
		if (this.aLong258 == 0L) {
			this.aLong258 = IDirect3DTexture.GetSurfaceLevel(this.aClass29_Sub1_Sub1_1.aLong27, this.anInt4393);
		}
		return this.aLong258;
	}

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "()V", line = 112)
	@Override
	public void method27208() {
		if (this.aLong258 != 0L) {
			IUnknown.Release(this.aLong258);
			this.aLong258 = 0L;
		}
		this.aClass29_Sub1_Sub1_1.aClass21_Sub3_Sub2_8.method17430(this);
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "()V", line = 112)
	@Override
	public void method27209() {
		if (this.aLong258 != 0L) {
			IUnknown.Release(this.aLong258);
			this.aLong258 = 0L;
		}
		this.aClass29_Sub1_Sub1_1.aClass21_Sub3_Sub2_8.method17430(this);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "()V", line = 112)
	@Override
	public void method27210() {
		if (this.aLong258 != 0L) {
			IUnknown.Release(this.aLong258);
			this.aLong258 = 0L;
		}
		this.aClass29_Sub1_Sub1_1.aClass21_Sub3_Sub2_8.method17430(this);
	}

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "()V", line = 120)
	@Override
	public void method25771() {
		if (this.aLong258 != 0L) {
			this.aClass29_Sub1_Sub1_1.aClass21_Sub3_Sub2_8.method17837(this.aLong258);
			this.aLong258 = 0L;
		}
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "()V", line = 120)
	@Override
	public void method25775() {
		if (this.aLong258 != 0L) {
			this.aClass29_Sub1_Sub1_1.aClass21_Sub3_Sub2_8.method17837(this.aLong258);
			this.aLong258 = 0L;
		}
	}

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "()V", line = 120)
	@Override
	public void method25773() {
		if (this.aLong258 != 0L) {
			this.aClass29_Sub1_Sub1_1.aClass21_Sub3_Sub2_8.method17837(this.aLong258);
			this.aLong258 = 0L;
		}
	}

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "()V", line = 120)
	@Override
	public void method25772() {
		if (this.aLong258 != 0L) {
			this.aClass29_Sub1_Sub1_1.aClass21_Sub3_Sub2_8.method17837(this.aLong258);
			this.aLong258 = 0L;
		}
	}

	@OriginalMember(owner = "client!lf", name = "hh", descriptor = "()V", line = 127)
	void method25628() {
		this.method25771();
	}

	@OriginalMember(owner = "client!lf", name = "finalize", descriptor = "()V", line = 127)
	@Override
	void finalize() {
		this.method25771();
	}
}
