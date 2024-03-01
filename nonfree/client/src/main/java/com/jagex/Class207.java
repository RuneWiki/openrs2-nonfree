package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public class Class207 {

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "Lclient!gr;")
	static final Class207 aClass207_2 = new Class207(0, 4);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "Lclient!gr;")
	static final Class207 aClass207_1 = new Class207(1, 5);

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "Lclient!gr;")
	static final Class207 aClass207_3 = new Class207(2, 6);

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
	final int anInt3696;

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
	public final int anInt3697;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(II)V", line = 15)
	Class207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3696 = arg0 * 1105653473;
		this.anInt3697 = arg1 * 378368981;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)Z", line = 20)
	public static boolean method24224() {
		@Pc(4) Class3_Sub43 local4 = (Class3_Sub43) Class610.aClass553_57.method32768();
		return local4 != null;
	}

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "(I)Lclient!gr;", line = 22)
	public static Class207 method24217(@OriginalArg(0) int arg0) {
		@Pc(2) Class207[] local2 = Class414.method27752();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class207 local12 = local2[local4];
			if (arg0 == local12.anInt3696 * 1840960801) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "(I)Lclient!gr;", line = 22)
	public static Class207 method24218(@OriginalArg(0) int arg0) {
		@Pc(2) Class207[] local2 = Class414.method27752();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class207 local12 = local2[local4];
			if (arg0 == local12.anInt3696 * 1840960801) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "(I)Lclient!gr;", line = 22)
	public static Class207 method24219(@OriginalArg(0) int arg0) {
		@Pc(2) Class207[] local2 = Class414.method27752();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class207 local12 = local2[local4];
			if (arg0 == local12.anInt3696 * 1840960801) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gr", name = "x", descriptor = "(I)Lclient!gr;", line = 22)
	public static Class207 method24220(@OriginalArg(0) int arg0) {
		@Pc(2) Class207[] local2 = Class414.method27752();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class207 local12 = local2[local4];
			if (arg0 == local12.anInt3696 * 1840960801) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "([BI)Ljava/lang/String;", line = 52)
	public static String method24222(@OriginalArg(0) byte[] arg0) {
		return Class106.method21918(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!gr", name = "dn", descriptor = "(ZI)V", line = 803)
	public static void method24223(@OriginalArg(0) boolean arg0) {
		Class58_Sub1.aBoolean316 = arg0;
	}

	@OriginalMember(owner = "client!gr", name = "ah", descriptor = "(Lclient!vs;B)V", line = 4022)
	static final void method24221(@OriginalArg(0) Class536 arg0) throws Exception_Sub5 {
		@Pc(9) Class290 local9 = (Class290) arg0.aClass3_Sub1_Sub6_2.anObjectArray4[arg0.anInt5318 * -2140198955];
		@Pc(33) Interface6 local33 = (Interface6) (arg0.anIntArray497[arg0.anInt5318 * -2140198955] == 0 ? arg0.aMap15.get(local9.aClass11_1.aClass43_3) : arg0.aMap16.get(local9.aClass11_1.aClass43_3));
		local33.method32411(local9, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
	}
}
