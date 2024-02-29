package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahi")
public class Class114_Sub2 extends Class114 implements Interface40 {

	@OriginalMember(owner = "client!ahi", name = "z", descriptor = "I")
	static final int anInt1172 = 34069;

	@OriginalMember(owner = "client!ahi", name = "<init>", descriptor = "(Lclient!apr;IZ[[I)V", line = 13)
	Class114_Sub2(@OriginalArg(0) Class86_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Class212.aClass212_18, Class206.aClass206_23, arg1 * arg1 * 6, arg2);
		@Pc(13) int local13;
		for (local13 = 0; local13 < 6; local13++) {
			for (@Pc(18) int local18 = 0; local18 < arg3[local13].length; local18++) {
				@Pc(30) int local30 = arg3[local13][local18];
				arg3[local13][local18] = local30 & 0xFF00FF00 | (local30 & 0xFF) << 16 | local30 >> 16 & 0xFF;
			}
		}
		this.aClass86_Sub1_Sub2_6.method20542(this);
		if (arg2) {
			for (local13 = 0; local13 < 6; local13++) {
				this.method10575(local13 + 34069, arg1, arg1, arg3[local13]);
			}
		} else {
			for (local13 = 0; local13 < 6; local13++) {
				OpenGL.glTexImage2Di(local13 + 34069, 0, Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13), arg1, arg1, 0, Class86_Sub1_Sub2.method20810(this.aClass212_13), this.aClass86_Sub1_Sub2_6.anInt2854, arg3[local13], 0);
			}
		}
	}

	@OriginalMember(owner = "client!ahi", name = "ay", descriptor = "()V", line = 34)
	@Override
	public void method10865() {
		super.method10865();
	}

	@OriginalMember(owner = "client!ahi", name = "an", descriptor = "()V", line = 34)
	@Override
	public void method10867() {
		super.method10865();
	}

	@OriginalMember(owner = "client!ahi", name = "ab", descriptor = "()V", line = 34)
	@Override
	public void method10864() {
		super.method10865();
	}

	@OriginalMember(owner = "client!ahi", name = "ap", descriptor = "()V", line = 34)
	@Override
	public void method10866() {
		super.method10865();
	}

	@OriginalMember(owner = "client!ahi", name = "aa", descriptor = "()V", line = 34)
	@Override
	public void method10868() {
		super.method10865();
	}

	@OriginalMember(owner = "client!ahi", name = "aw", descriptor = "(Lclient!lo;)V", line = 38)
	@Override
	public void method10854(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!ahi", name = "af", descriptor = "(Lclient!lo;)V", line = 38)
	@Override
	public void method10856(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!ahi", name = "az", descriptor = "(Lclient!lo;)V", line = 38)
	@Override
	public void method10855(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!ahi", name = "v", descriptor = "()V", line = 42)
	@Override
	public void method30322() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahi", name = "s", descriptor = "()V", line = 42)
	@Override
	public void method30320() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahi", name = "r", descriptor = "()V", line = 42)
	@Override
	public void method30321() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahi", name = "g", descriptor = "()V", line = 42)
	@Override
	public void method30319() {
		super.method30322();
	}
}
