package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apx")
public class Class118_Sub1_Sub1 extends Class118_Sub1 {

	@OriginalMember(owner = "client!apx", name = "i", descriptor = "I")
	public final int anInt2933;

	@OriginalMember(owner = "client!apx", name = "<init>", descriptor = "(Lclient!my;Lclient!mk;IIIIIIIIIIIIII)V", line = 9)
	Class118_Sub1_Sub1(@OriginalArg(0) Class410 arg0, @OriginalArg(1) Class402 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
		this.anInt2933 = arg15 * 1494146871;
	}

	@OriginalMember(owner = "client!apx", name = "r", descriptor = "(Lclient!akv;)Lclient!mq;", line = 14)
	public static Class118 method21262(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(4) Class118_Sub1 local4 = (Class118_Sub1) Class35.method18320(arg0);
		@Pc(8) int local8 = arg0.method22487();
		return new Class118_Sub1_Sub1(local4.aClass410_8, local4.aClass402_8, local4.anInt2926 * -2127596367, local4.anInt2920 * -1055236307, local4.anInt2922 * -1607607997, local4.anInt2923 * -228886179, local4.anInt2924 * -81046249, local4.anInt2925 * -120853723, local4.anInt2921 * 1210620409, local4.anInt2928 * 1333388775, local4.anInt2927 * -2081665769, local4.anInt2932 * 845449995, local4.anInt2930 * -773478983, local4.anInt2931 * -1674677163, local4.anInt2929 * 2123496001, local8);
	}

	@OriginalMember(owner = "client!apx", name = "g", descriptor = "(Lclient!akv;)Lclient!mq;", line = 14)
	public static Class118 method21263(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(4) Class118_Sub1 local4 = (Class118_Sub1) Class35.method18320(arg0);
		@Pc(8) int local8 = arg0.method22487();
		return new Class118_Sub1_Sub1(local4.aClass410_8, local4.aClass402_8, local4.anInt2926 * -2127596367, local4.anInt2920 * -1055236307, local4.anInt2922 * -1607607997, local4.anInt2923 * -228886179, local4.anInt2924 * -81046249, local4.anInt2925 * -120853723, local4.anInt2921 * 1210620409, local4.anInt2928 * 1333388775, local4.anInt2927 * -2081665769, local4.anInt2932 * 845449995, local4.anInt2930 * -773478983, local4.anInt2931 * -1674677163, local4.anInt2929 * 2123496001, local8);
	}

	@OriginalMember(owner = "client!apx", name = "w", descriptor = "()Lclient!mt;", line = 20)
	@Override
	public Class406 method28560() {
		return Class406.aClass406_10;
	}

	@OriginalMember(owner = "client!apx", name = "l", descriptor = "()Lclient!mt;", line = 20)
	@Override
	public Class406 method28558() {
		return Class406.aClass406_10;
	}

	@OriginalMember(owner = "client!apx", name = "y", descriptor = "()Lclient!mt;", line = 20)
	@Override
	public Class406 method28559() {
		return Class406.aClass406_10;
	}

	@OriginalMember(owner = "client!apx", name = "c", descriptor = "(I)Lclient!mt;", line = 20)
	@Override
	public Class406 method28557() {
		return Class406.aClass406_10;
	}
}
