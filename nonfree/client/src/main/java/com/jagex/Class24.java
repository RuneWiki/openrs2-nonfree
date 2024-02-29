package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aay")
public class Class24 implements Interface12, Interface6 {

	@OriginalMember(owner = "client!aay", name = "p", descriptor = "[[Ljava/lang/Object;")
	Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!aay", name = "c", descriptor = "[[Lclient!qu;")
	Class498[][] aClass498ArrayArray1;

	@OriginalMember(owner = "client!aay", name = "p", descriptor = "(FLclient!oo;Lclient!ot;Lclient!oo;Lclient!oo;Lclient!oo;FFFI)V", line = 13)
	public static void method437(@OriginalArg(0) float arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class452 arg2, @OriginalArg(3) Class447 arg3, @OriginalArg(4) Class447 arg4, @OriginalArg(5) Class447 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		if (arg3.method29143(arg1)) {
			return;
		}
		@Pc(9) Class447 local9 = Class447.method29120(0.0F, 0.0F, 0.0F);
		@Pc(14) Class447 local14 = Class447.method29124(Class447.method29160(arg3, arg1));
		local14.method29198(arg2);
		@Pc(21) Class447 local21 = Class447.method29160(local14, local9);
		@Pc(24) float local24 = local21.method29170();
		if (arg5.aFloat277 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat277) || local24 > arg7 || local24 < arg8) {
			arg1.method29136(arg3);
			arg4.method29137();
			return;
		}
		arg2.method29307();
		@Pc(54) Class447 local54 = Class447.method29120(1.0F, 0.0F, 0.0F);
		@Pc(59) Class447 local59 = Class447.method29120(0.0F, 1.0F, 0.0F);
		@Pc(64) Class447 local64 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local54.method29198(arg2);
		local59.method29198(arg2);
		local64.method29198(arg2);
		@Pc(84) Class447 local84 = Class447.method29120(Class447.method29165(local54, arg4), Class447.method29165(local59, arg4), Class447.method29165(local64, arg4));
		@Pc(87) Class447 local87 = Class447.method29124(local84);
		@Pc(104) Class447 local104 = Class447.method29120(arg5.aFloat277 * local21.aFloat277, arg5.aFloat276 * local21.aFloat276, arg5.aFloat278 * local21.aFloat278);
		local87.method29152(local104, arg0);
		local87.method29191(arg6);
		@Pc(116) Class447 local116 = Class447.method29194(local54, local87.aFloat277);
		local116.method29152(local59, local87.aFloat276);
		local116.method29152(local64, local87.aFloat278);
		arg4.method29136(local116);
		arg1.method29146(Class447.method29194(arg4, arg0));
	}

	@OriginalMember(owner = "client!aay", name = "<init>", descriptor = "()V", line = 15)
	Class24() {
	}

	@OriginalMember(owner = "client!aay", name = "p", descriptor = "(Lclient!akv;B)V", line = 19)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method443(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!aay", name = "l", descriptor = "(Lclient!akv;)V", line = 19)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method443(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!aay", name = "y", descriptor = "(Lclient!akv;)V", line = 19)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method443(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!aay", name = "v", descriptor = "(Lclient!akv;)V", line = 19)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method443(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!aay", name = "r", descriptor = "(I)[Ljava/lang/Object;", line = 26)
	public Object[] method438(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray1 == null ? null : this.anObjectArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!aay", name = "q", descriptor = "(II)[Ljava/lang/Object;", line = 26)
	public Object[] method439(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray1 == null ? null : this.anObjectArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!aay", name = "s", descriptor = "(I)[Ljava/lang/Object;", line = 26)
	public Object[] method440(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray1 == null ? null : this.anObjectArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!aay", name = "i", descriptor = "(I)[Ljava/lang/Object;", line = 26)
	public Object[] method441(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray1 == null ? null : this.anObjectArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!aay", name = "j", descriptor = "(I)[Ljava/lang/Object;", line = 26)
	public Object[] method442(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray1 == null ? null : this.anObjectArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!aay", name = "d", descriptor = "(Lclient!akv;II)V", line = 31)
	void method443(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 3) {
			return;
		}
		@Pc(6) int local6 = arg0.method22478();
		if (this.anObjectArrayArray1 == null) {
			this.anObjectArrayArray1 = new Object[local6][];
			this.aClass498ArrayArray1 = new Class498[local6][];
		}
		for (@Pc(22) int local22 = arg0.method22478(); local22 != 255; local22 = arg0.method22478()) {
			@Pc(29) int local29 = arg0.method22478();
			@Pc(32) Class498[] local32 = new Class498[local29];
			for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
				local32[local34] = (Class498) Class457.method29479(Class498.method30187(), arg0.method22537());
			}
			this.anObjectArrayArray1[local22] = Class274.method26547(arg0, local32);
			this.aClass498ArrayArray1[local22] = local32;
		}
	}

	@OriginalMember(owner = "client!aay", name = "k", descriptor = "(Lclient!akv;I)V", line = 31)
	void method444(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 3) {
			return;
		}
		@Pc(6) int local6 = arg0.method22478();
		if (this.anObjectArrayArray1 == null) {
			this.anObjectArrayArray1 = new Object[local6][];
			this.aClass498ArrayArray1 = new Class498[local6][];
		}
		for (@Pc(22) int local22 = arg0.method22478(); local22 != 255; local22 = arg0.method22478()) {
			@Pc(29) int local29 = arg0.method22478();
			@Pc(32) Class498[] local32 = new Class498[local29];
			for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
				local32[local34] = (Class498) Class457.method29479(Class498.method30187(), arg0.method22537());
			}
			this.anObjectArrayArray1[local22] = Class274.method26547(arg0, local32);
			this.aClass498ArrayArray1[local22] = local32;
		}
	}

	@OriginalMember(owner = "client!aay", name = "c", descriptor = "(I)V", line = 52)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!aay", name = "t", descriptor = "()V", line = 52)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!aay", name = "w", descriptor = "()V", line = 52)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!aay", name = "g", descriptor = "(I)V", line = 53)
	@Override
	public void method32873(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aay", name = "x", descriptor = "(II)V", line = 53)
	@Override
	public void method32874(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aay", name = "z", descriptor = "(I)V", line = 53)
	@Override
	public void method32872(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aay", name = "bj", descriptor = "(Lclient!aqm;B)Ljava/lang/String;", line = 1361)
	static String method445(@OriginalArg(0) Class77_Sub1_Sub7 arg0) {
		if (arg0.aString94 == null || arg0.aString94.length() == 0) {
			return arg0.aString93 == null || arg0.aString93.length() <= 0 ? arg0.aString92 : arg0.aString92 + Class44.aClass44_2.method713(Class128.aClass667_3) + arg0.aString93;
		} else if (arg0.aString93 == null || arg0.aString93.length() <= 0) {
			return arg0.aString92 + Class44.aClass44_2.method713(Class128.aClass667_3) + arg0.aString94;
		} else {
			return arg0.aString92 + Class44.aClass44_2.method713(Class128.aClass667_3) + arg0.aString93 + Class44.aClass44_2.method713(Class128.aClass667_3) + arg0.aString94;
		}
	}
}
