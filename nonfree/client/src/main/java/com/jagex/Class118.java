package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public class Class118 implements Interface46 {

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "Lclient!my;")
	public final Class410 aClass410_8;

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "Lclient!mk;")
	public final Class402 aClass402_8;

	@OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
	public final int anInt2926;

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
	public final int anInt2920;

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "I")
	public final int anInt2922;

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
	public final int anInt2923;

	@OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
	public final int anInt2924;

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
	public final int anInt2925;

	@OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
	public final int anInt2921;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!my;Lclient!mk;IIIIIII)V", line = 16)
	Class118(@OriginalArg(0) Class410 arg0, @OriginalArg(1) Class402 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.aClass410_8 = arg0;
		this.aClass402_8 = arg1;
		this.anInt2926 = arg2 * 1028805713;
		this.anInt2920 = arg3 * 28068005;
		this.anInt2922 = arg4 * -2012120213;
		this.anInt2923 = arg5 * 399024885;
		this.anInt2924 = arg6 * -1930743129;
		this.anInt2925 = arg7 * -1927661395;
		this.anInt2921 = arg8 * -820848567;
	}

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "(I)[Lclient!zl;", line = 20)
	public static Class694[] method21255() {
		return new Class694[] { Class694.aClass694_7, Class694.aClass694_3, Class694.aClass694_6, Class694.aClass694_2, Class694.aClass694_10, Class694.aClass694_9, Class694.aClass694_8, Class694.aClass694_5, Class694.aClass694_4 };
	}

	@OriginalMember(owner = "client!mq", name = "t", descriptor = "(Lclient!akv;)Lclient!mq;", line = 29)
	static Class118 method21256(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(6) Class410 local6 = Class683.method36094()[arg0.method22478()];
		@Pc(13) Class402 local13 = Class700.method36485()[arg0.method22478()];
		@Pc(17) int local17 = arg0.method22487();
		@Pc(21) int local21 = arg0.method22487();
		@Pc(25) int local25 = arg0.method22483();
		@Pc(29) int local29 = arg0.method22483();
		@Pc(33) int local33 = arg0.method22487();
		@Pc(37) int local37 = arg0.method22549();
		@Pc(41) int local41 = arg0.method22500();
		return new Class118(local6, local13, local17, local21, local25, local29, local33, local37, local41);
	}

	@OriginalMember(owner = "client!mq", name = "v", descriptor = "(Lclient!akv;)Lclient!mq;", line = 29)
	static Class118 method21257(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(6) Class410 local6 = Class683.method36094()[arg0.method22478()];
		@Pc(13) Class402 local13 = Class700.method36485()[arg0.method22478()];
		@Pc(17) int local17 = arg0.method22487();
		@Pc(21) int local21 = arg0.method22487();
		@Pc(25) int local25 = arg0.method22483();
		@Pc(29) int local29 = arg0.method22483();
		@Pc(33) int local33 = arg0.method22487();
		@Pc(37) int local37 = arg0.method22549();
		@Pc(41) int local41 = arg0.method22500();
		return new Class118(local6, local13, local17, local21, local25, local29, local33, local37, local41);
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)Lclient!mt;", line = 42)
	@Override
	public Class406 method28557() {
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "()Lclient!mt;", line = 42)
	@Override
	public Class406 method28558() {
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "()Lclient!mt;", line = 42)
	@Override
	public Class406 method28559() {
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "()Lclient!mt;", line = 42)
	@Override
	public Class406 method28560() {
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "mh", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6717)
	static final void method21258(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		@Pc(18) int[] local18 = Class139.method14334(local13, arg2);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray14 = Class73.method1040(local13, arg2);
		arg0.anIntArray399 = local18;
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!mq", name = "amw", descriptor = "(Lclient!yf;I)V", line = 11847)
	static final void method21259(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		Class597.aClass107_Sub1_2.method8817();
	}
}
