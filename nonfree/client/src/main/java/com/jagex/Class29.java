package com.jagex;

import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public abstract class Class29 implements Interface22 {

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "J")
	long aLong27 = 0L;

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "Lclient!akw;")
	final Class21_Sub3_Sub2 aClass21_Sub3_Sub2_8;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "Lclient!cw;")
	final Class121 aClass121_12;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!dj;")
	final Class127 aClass127_13;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "Z")
	boolean aBoolean194;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!akw;Lclient!cw;Lclient!dj;ZI)V", line = 16)
	Class29(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass21_Sub3_Sub2_8 = arg0;
		this.aClass121_12 = arg1;
		this.aClass127_13 = arg2;
		this.aBoolean194 = arg3;
		this.aClass21_Sub3_Sub2_8.method17583(this);
	}

	@OriginalMember(owner = "client!lg", name = "aw", descriptor = "()J", line = 25)
	long method8720() {
		return this.aLong27;
	}

	@OriginalMember(owner = "client!lg", name = "bs", descriptor = "()J", line = 25)
	long method8727() {
		return this.aLong27;
	}

	@OriginalMember(owner = "client!lg", name = "ap", descriptor = "(Lclient!jn;)V", line = 29)
	public void method9867(@OriginalArg(0) Class259 arg0) {
	}

	@OriginalMember(owner = "client!lg", name = "ay", descriptor = "(Lclient!jn;)V", line = 29)
	public void method9874(@OriginalArg(0) Class259 arg0) {
	}

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "()V", line = 32)
	@Override
	public void method27209() {
		if (this.aLong27 != 0L) {
			IUnknown.Release(this.aLong27);
			this.aLong27 = 0L;
		}
		this.aClass21_Sub3_Sub2_8.method17430(this);
	}

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "()V", line = 32)
	@Override
	public void method27208() {
		if (this.aLong27 != 0L) {
			IUnknown.Release(this.aLong27);
			this.aLong27 = 0L;
		}
		this.aClass21_Sub3_Sub2_8.method17430(this);
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "()V", line = 32)
	@Override
	public void method27210() {
		if (this.aLong27 != 0L) {
			IUnknown.Release(this.aLong27);
			this.aLong27 = 0L;
		}
		this.aClass21_Sub3_Sub2_8.method17430(this);
	}

	@OriginalMember(owner = "client!lg", name = "bp", descriptor = "()V", line = 40)
	void method8719() {
		if (this.aLong27 != 0L) {
			this.aClass21_Sub3_Sub2_8.method17837(this.aLong27);
			this.aLong27 = 0L;
		}
	}

	@OriginalMember(owner = "client!lg", name = "bd", descriptor = "()V", line = 40)
	void method8722() {
		if (this.aLong27 != 0L) {
			this.aClass21_Sub3_Sub2_8.method17837(this.aLong27);
			this.aLong27 = 0L;
		}
	}

	@OriginalMember(owner = "client!lg", name = "bw", descriptor = "()V", line = 40)
	void method8725() {
		if (this.aLong27 != 0L) {
			this.aClass21_Sub3_Sub2_8.method17837(this.aLong27);
			this.aLong27 = 0L;
		}
	}

	@OriginalMember(owner = "client!lg", name = "ac", descriptor = "()V", line = 40)
	void method8726() {
		if (this.aLong27 != 0L) {
			this.aClass21_Sub3_Sub2_8.method17837(this.aLong27);
			this.aLong27 = 0L;
		}
	}

	@OriginalMember(owner = "client!lg", name = "finalize", descriptor = "()V", line = 47)
	@Override
	void finalize() {
		this.method8726();
	}

	@OriginalMember(owner = "client!lg", name = "hh", descriptor = "()V", line = 47)
	void method8723() {
		this.method8726();
	}
}
