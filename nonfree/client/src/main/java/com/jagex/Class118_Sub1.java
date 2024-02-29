package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahf")
public class Class118_Sub1 extends Class118 {

	@OriginalMember(owner = "client!ahf", name = "ha", descriptor = "Lclient!aoe;")
	public static Class35_Sub18 aClass35_Sub18_4;

	@OriginalMember(owner = "client!ahf", name = "d", descriptor = "I")
	public final int anInt2928;

	@OriginalMember(owner = "client!ahf", name = "s", descriptor = "I")
	public final int anInt2927;

	@OriginalMember(owner = "client!ahf", name = "r", descriptor = "I")
	public final int anInt2932;

	@OriginalMember(owner = "client!ahf", name = "g", descriptor = "I")
	public final int anInt2930;

	@OriginalMember(owner = "client!ahf", name = "z", descriptor = "I")
	public final int anInt2931;

	@OriginalMember(owner = "client!ahf", name = "j", descriptor = "I")
	public final int anInt2929;

	@OriginalMember(owner = "client!ahf", name = "<init>", descriptor = "(Lclient!my;Lclient!mk;IIIIIIIIIIIII)V", line = 14)
	Class118_Sub1(@OriginalArg(0) Class410 arg0, @OriginalArg(1) Class402 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt2928 = arg9 * 766336471;
		this.anInt2927 = arg10 * -2109621593;
		this.anInt2932 = arg11 * -1143117661;
		this.anInt2930 = arg12 * -1156263799;
		this.anInt2931 = arg13 * 335735037;
		this.anInt2929 = arg14 * 833295809;
	}

	@OriginalMember(owner = "client!ahf", name = "x", descriptor = "(Lclient!akv;)Lclient!mq;", line = 24)
	public static Class118 method21260(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) Class118 local3 = Class35_Sub19.method17775(arg0);
		@Pc(7) int local7 = arg0.method22549();
		@Pc(11) int local11 = arg0.method22549();
		@Pc(15) int local15 = arg0.method22549();
		@Pc(19) int local19 = arg0.method22549();
		@Pc(23) int local23 = arg0.method22549();
		@Pc(27) int local27 = arg0.method22549();
		return new Class118_Sub1(local3.aClass410_8, local3.aClass402_8, local3.anInt2926 * -2127596367, local3.anInt2920 * -1055236307, local3.anInt2922 * -1607607997, local3.anInt2923 * -228886179, local3.anInt2924 * -81046249, local3.anInt2925 * -120853723, local3.anInt2921 * 1210620409, local7, local11, local15, local19, local23, local27);
	}

	@OriginalMember(owner = "client!ahf", name = "d", descriptor = "(Lclient!akv;)Lclient!mq;", line = 24)
	public static Class118 method21261(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) Class118 local3 = Class35_Sub19.method17775(arg0);
		@Pc(7) int local7 = arg0.method22549();
		@Pc(11) int local11 = arg0.method22549();
		@Pc(15) int local15 = arg0.method22549();
		@Pc(19) int local19 = arg0.method22549();
		@Pc(23) int local23 = arg0.method22549();
		@Pc(27) int local27 = arg0.method22549();
		return new Class118_Sub1(local3.aClass410_8, local3.aClass402_8, local3.anInt2926 * -2127596367, local3.anInt2920 * -1055236307, local3.anInt2922 * -1607607997, local3.anInt2923 * -228886179, local3.anInt2924 * -81046249, local3.anInt2925 * -120853723, local3.anInt2921 * 1210620409, local7, local11, local15, local19, local23, local27);
	}

	@OriginalMember(owner = "client!ahf", name = "c", descriptor = "(I)Lclient!mt;", line = 35)
	@Override
	public Class406 method28557() {
		return Class406.aClass406_4;
	}

	@OriginalMember(owner = "client!ahf", name = "w", descriptor = "()Lclient!mt;", line = 35)
	@Override
	public Class406 method28560() {
		return Class406.aClass406_4;
	}

	@OriginalMember(owner = "client!ahf", name = "y", descriptor = "()Lclient!mt;", line = 35)
	@Override
	public Class406 method28559() {
		return Class406.aClass406_4;
	}

	@OriginalMember(owner = "client!ahf", name = "l", descriptor = "()Lclient!mt;", line = 35)
	@Override
	public Class406 method28558() {
		return Class406.aClass406_4;
	}
}
