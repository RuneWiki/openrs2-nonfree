package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adf")
public class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!adf", name = "e", descriptor = "I")
	static final int anInt248 = 34072;

	@OriginalMember(owner = "client!adf", name = "k", descriptor = "I")
	static final int anInt249 = 34070;

	@OriginalMember(owner = "client!adf", name = "o", descriptor = "I")
	static final int anInt250 = 34074;

	@OriginalMember(owner = "client!adf", name = "i", descriptor = "I")
	static final int anInt251 = 34069;

	@OriginalMember(owner = "client!adf", name = "f", descriptor = "I")
	static final int anInt252 = 34073;

	@OriginalMember(owner = "client!adf", name = "u", descriptor = "I")
	static final int anInt253 = 34071;

	@OriginalMember(owner = "client!adf", name = "b", descriptor = "I")
	final int anInt254;

	@OriginalMember(owner = "client!adf", name = "<init>", descriptor = "(Lclient!aeq;Lclient!dt;Lclient!dl;I)V", line = 17)
	Class78_Sub1(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, false);
		this.anInt254 = arg3;
		this.aClass86_Sub3_31.method6195(this);
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			OpenGL.glTexImage2Dub(local20 + 34069, 0, Class86_Sub3.method6292(this.aClass212_16, this.aClass206_17), arg3, arg3, 0, Class86_Sub3.method6289(this.aClass212_16), 5121, null, 0);
		}
		this.method17453(true);
	}

	@OriginalMember(owner = "client!adf", name = "<init>", descriptor = "(Lclient!aeq;Lclient!dt;Lclient!dl;IZ[[I)V", line = 25)
	Class78_Sub1(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[][] arg5) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, arg4);
		this.anInt254 = arg3;
		this.aClass86_Sub3_31.method6195(this);
		@Pc(22) int local22;
		if (arg4) {
			for (local22 = 0; local22 < 6; local22++) {
				method17483(local22 + 34069, Class86_Sub3.method6292(this.aClass212_16, this.aClass206_17), arg3, arg3, 32993, this.aClass86_Sub3_31.anInt685, arg5[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, Class86_Sub3.method6292(this.aClass212_16, this.aClass206_17), arg3, arg3, 0, 32993, this.aClass86_Sub3_31.anInt685, arg5[local22], 0);
			}
		}
		this.method17453(true);
	}

	@OriginalMember(owner = "client!adf", name = "<init>", descriptor = "(Lclient!aeq;Lclient!dt;Lclient!dl;IZ[[BLclient!dt;)V", line = 38)
	Class78_Sub1(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) Class212 arg6) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, arg4);
		this.anInt254 = arg3;
		this.aClass86_Sub3_31.method6195(this);
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			OpenGL.glTexImage2Dub(local20 + 34069, 0, Class86_Sub3.method6292(this.aClass212_16, this.aClass206_17), arg3, arg3, 0, Class86_Sub3.method6289(arg6), 5121, arg5[local20], 0);
		}
		this.method17453(true);
	}

	@OriginalMember(owner = "client!adf", name = "av", descriptor = "(II)Lclient!df;", line = 48)
	Interface21 method1385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class167(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!adf", name = "at", descriptor = "(II)Lclient!df;", line = 48)
	Interface21 method1386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class167(this, arg0, arg1);
	}
}
