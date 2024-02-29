package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uz")
public class Class588 {

	@OriginalMember(owner = "client!uz", name = "<init>", descriptor = "()V", line = 8)
	Class588() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!uz", name = "c", descriptor = "(FLclient!oo;Lclient!ot;Lclient!oo;Lclient!oo;Lclient!oo;FFF)V", line = 13)
	public static void method31742(@OriginalArg(0) float arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class452 arg2, @OriginalArg(3) Class447 arg3, @OriginalArg(4) Class447 arg4, @OriginalArg(5) Class447 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
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

	@OriginalMember(owner = "client!uz", name = "bd", descriptor = "(IB)Z", line = 1400)
	static boolean method31743(@OriginalArg(0) int arg0) {
		return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
	}

	@OriginalMember(owner = "client!uz", name = "awm", descriptor = "(Lclient!yf;I)V", line = 13338)
	static final void method31744(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1.method16264(local12);
	}
}
