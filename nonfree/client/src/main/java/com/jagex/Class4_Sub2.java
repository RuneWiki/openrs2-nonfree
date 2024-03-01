package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aae")
public class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!aae", name = "t", descriptor = "I")
	static final int anInt74 = 34074;

	@OriginalMember(owner = "client!aae", name = "v", descriptor = "I")
	static final int anInt75 = 34073;

	@OriginalMember(owner = "client!aae", name = "q", descriptor = "I")
	static final int anInt76 = 34071;

	@OriginalMember(owner = "client!aae", name = "m", descriptor = "I")
	static final int anInt77 = 34072;

	@OriginalMember(owner = "client!aae", name = "r", descriptor = "I")
	static final int anInt78 = 34069;

	@OriginalMember(owner = "client!aae", name = "d", descriptor = "I")
	static final int anInt79 = 34070;

	@OriginalMember(owner = "client!aae", name = "w", descriptor = "I")
	final int anInt80;

	@OriginalMember(owner = "client!aae", name = "<init>", descriptor = "(Lclient!abt;Lclient!cw;Lclient!dj;I)V", line = 17)
	Class4_Sub2(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, false);
		this.anInt80 = arg3;
		this.aClass21_Sub2_47.method4074(this);
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			OpenGL.glTexImage2Dub(local20 + 34069, 0, Class21_Sub2.method4240(this.aClass121_28, this.aClass127_33), arg3, arg3, 0, Class21_Sub2.method4149(this.aClass121_28), 5121, null, 0);
		}
		this.method33712(true);
	}

	@OriginalMember(owner = "client!aae", name = "<init>", descriptor = "(Lclient!abt;Lclient!cw;Lclient!dj;IZ[[I)V", line = 25)
	Class4_Sub2(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[][] arg5) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, arg4);
		this.anInt80 = arg3;
		this.aClass21_Sub2_47.method4074(this);
		@Pc(22) int local22;
		if (arg4) {
			for (local22 = 0; local22 < 6; local22++) {
				method33721(local22 + 34069, Class21_Sub2.method4240(this.aClass121_28, this.aClass127_33), arg3, arg3, 32993, this.aClass21_Sub2_47.anInt451, arg5[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, Class21_Sub2.method4240(this.aClass121_28, this.aClass127_33), arg3, arg3, 0, 32993, this.aClass21_Sub2_47.anInt451, arg5[local22], 0);
			}
		}
		this.method33712(true);
	}

	@OriginalMember(owner = "client!aae", name = "<init>", descriptor = "(Lclient!abt;Lclient!cw;Lclient!dj;IZ[[BLclient!cw;)V", line = 38)
	Class4_Sub2(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) Class121 arg6) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, arg4);
		this.anInt80 = arg3;
		this.aClass21_Sub2_47.method4074(this);
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			OpenGL.glTexImage2Dub(local20 + 34069, 0, Class21_Sub2.method4240(this.aClass121_28, this.aClass127_33), arg3, arg3, 0, Class21_Sub2.method4149(arg6), 5121, arg5[local20], 0);
		}
		this.method33712(true);
	}

	@OriginalMember(owner = "client!aae", name = "an", descriptor = "(II)Lclient!da;", line = 48)
	Interface10 method493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class91(this, arg0, arg1);
	}
}
