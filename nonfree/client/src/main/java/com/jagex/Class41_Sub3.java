package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aez")
public class Class41_Sub3 extends Class41 implements Interface27 {

	@OriginalMember(owner = "client!aez", name = "n", descriptor = "I")
	static final int anInt1125 = 34069;

	@OriginalMember(owner = "client!aez", name = "<init>", descriptor = "(Lclient!akk;IZ[[I)V", line = 13)
	Class41_Sub3(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Class121.aClass121_17, Class127.aClass127_23, arg1 * arg1 * 6, arg2);
		@Pc(13) int local13;
		for (local13 = 0; local13 < 6; local13++) {
			for (@Pc(18) int local18 = 0; local18 < arg3[local13].length; local18++) {
				@Pc(30) int local30 = arg3[local13][local18];
				arg3[local13][local18] = local30 & 0xFF00FF00 | (local30 & 0xFF) << 16 | local30 >> 16 & 0xFF;
			}
		}
		this.aClass21_Sub3_Sub1_9.method17513(this);
		if (arg2) {
			for (local13 = 0; local13 < 6; local13++) {
				this.method9884(local13 + 34069, arg1, arg1, arg3[local13]);
			}
		} else {
			for (local13 = 0; local13 < 6; local13++) {
				OpenGL.glTexImage2Di(local13 + 34069, 0, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), arg1, arg1, 0, Class21_Sub3_Sub1.method16337(this.aClass121_14), this.aClass21_Sub3_Sub1_9.anInt2346, arg3[local13], 0);
			}
		}
	}

	@OriginalMember(owner = "client!aez", name = "ao", descriptor = "()V", line = 34)
	@Override
	public void method9872() {
		super.method9872();
	}

	@OriginalMember(owner = "client!aez", name = "au", descriptor = "()V", line = 34)
	@Override
	public void method9873() {
		super.method9872();
	}

	@OriginalMember(owner = "client!aez", name = "ab", descriptor = "()V", line = 34)
	@Override
	public void method9868() {
		super.method9872();
	}

	@OriginalMember(owner = "client!aez", name = "ap", descriptor = "(Lclient!jn;)V", line = 38)
	@Override
	public void method9867(@OriginalArg(0) Class259 arg0) {
		super.method9867(arg0);
	}

	@OriginalMember(owner = "client!aez", name = "ay", descriptor = "(Lclient!jn;)V", line = 38)
	@Override
	public void method9874(@OriginalArg(0) Class259 arg0) {
		super.method9867(arg0);
	}

	@OriginalMember(owner = "client!aez", name = "b", descriptor = "()V", line = 42)
	@Override
	public void method27210() {
		super.method27209();
	}

	@OriginalMember(owner = "client!aez", name = "y", descriptor = "()V", line = 42)
	@Override
	public void method27208() {
		super.method27209();
	}

	@OriginalMember(owner = "client!aez", name = "g", descriptor = "()V", line = 42)
	@Override
	public void method27209() {
		super.method27209();
	}
}
