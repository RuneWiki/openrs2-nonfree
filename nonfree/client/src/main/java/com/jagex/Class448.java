package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public class Class448 {

	@OriginalMember(owner = "client!s", name = "fl", descriptor = "Lclient!ny;")
	public static Class359 aClass359_76;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "Lclient!s;")
	static final Class448 aClass448_2 = new Class448();

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Lclient!s;")
	static final Class448 aClass448_3 = new Class448();

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 284)
	Class448() {
	}

	@OriginalMember(owner = "client!s", name = "ap", descriptor = "(Lclient!aml;I)Ljava/lang/String;", line = 1111)
	public static String method28361(@OriginalArg(0) Class3_Sub1_Sub7 arg0) {
		if (Class250.aBoolean688 || arg0 == null) {
			return "";
		} else {
			@Pc(10) int[] local10 = Class156.method23180(arg0);
			return local10 == null ? "" : Class228.method24519(local10);
		}
	}

	@OriginalMember(owner = "client!s", name = "gg", descriptor = "(Lclient!vs;I)V", line = 5315)
	static final void method28362(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class3_Sub40.method19103(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!s", name = "aow", descriptor = "(Lclient!vs;I)V", line = 11607)
	static final void method28364(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373();
	}

	@OriginalMember(owner = "client!s", name = "aqw", descriptor = "(Lclient!vs;B)V", line = 12013)
	static final void method28363(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		Class586.method33284(7, local13 << 16 | local23, local33, "");
	}
}
