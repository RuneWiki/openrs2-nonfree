package com.jagex;

import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afw")
public class Class53_Sub6 extends Class53 {

	@OriginalMember(owner = "client!afw", name = "g", descriptor = "Lclient!wq;")
	static Class559 aClass559_3 = new Class559();

	@OriginalMember(owner = "client!afw", name = "l", descriptor = "I")
	static int anInt1228 = 0;

	@OriginalMember(owner = "client!afw", name = "s", descriptor = "I")
	int anInt1227;

	@OriginalMember(owner = "client!afw", name = "x", descriptor = "I")
	int anInt1229;

	@OriginalMember(owner = "client!afw", name = "h", descriptor = "Lclient!act;")
	Class26_Sub1_Sub1_Sub1 aClass26_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!afw", name = "u", descriptor = "I")
	int anInt1230;

	@OriginalMember(owner = "client!afw", name = "y", descriptor = "I")
	int anInt1231;

	@OriginalMember(owner = "client!afw", name = "<init>", descriptor = "()V", line = 16)
	Class53_Sub6() {
	}

	@OriginalMember(owner = "client!afw", name = "x", descriptor = "()Lclient!afw;", line = 19)
	static Class53_Sub6 method11233() {
		@Pc(4) Class53_Sub6 local4 = (Class53_Sub6) aClass559_3.method32832();
		if (local4 == null) {
			return new Class53_Sub6();
		} else {
			anInt1228 -= -1785386157;
			return local4;
		}
	}

	@OriginalMember(owner = "client!afw", name = "h", descriptor = "()Lclient!afw;", line = 19)
	static Class53_Sub6 method11234() {
		@Pc(4) Class53_Sub6 local4 = (Class53_Sub6) aClass559_3.method32832();
		if (local4 == null) {
			return new Class53_Sub6();
		} else {
			anInt1228 -= -1785386157;
			return local4;
		}
	}

	@OriginalMember(owner = "client!afw", name = "l", descriptor = "()Lclient!afw;", line = 19)
	static Class53_Sub6 method11235() {
		@Pc(4) Class53_Sub6 local4 = (Class53_Sub6) aClass559_3.method32832();
		if (local4 == null) {
			return new Class53_Sub6();
		} else {
			anInt1228 -= -1785386157;
			return local4;
		}
	}

	@OriginalMember(owner = "client!afw", name = "s", descriptor = "(Lclient!afw;)V", line = 28)
	static void method11236(@OriginalArg(0) Class53_Sub6 arg0) {
		arg0.aClass26_Sub1_Sub1_Sub1_1 = null;
		if (anInt1228 * 1669222619 < 20) {
			aClass559_3.method32819(arg0);
			anInt1228 += -1785386157;
		}
	}

	@OriginalMember(owner = "client!afw", name = "a", descriptor = "(JIZI)Ljava/lang/String;", line = 40)
	public static String method11237(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class312.method25816(arg0);
			local5 = Class599.aCalendar3;
		} else {
			Class313.method25819(arg0);
			local5 = Class599.aCalendar2;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(18) int local18 = local5.get(2);
		@Pc(22) int local22 = local5.get(1);
		@Pc(26) int local26 = local5.get(11);
		@Pc(30) int local30 = local5.get(12);
		return arg1 == 3 ? Class279.method25422(arg0, arg1, arg2) : Integer.toString(local14 / 10) + local14 % 10 + "-" + Class599.aStringArrayArray1[arg1][local18] + "-" + local22 + " " + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
	}
}
