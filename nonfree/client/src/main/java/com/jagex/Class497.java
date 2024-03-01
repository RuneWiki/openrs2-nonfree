package com.jagex;

import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public class Class497 {

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "Lclient!ua;")
	public static final Class497 aClass497_2 = new Class497(1);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Lclient!ua;")
	public static final Class497 aClass497_3 = new Class497(2);

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!ua;")
	public static final Class497 aClass497_5 = new Class497(4);

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!ua;")
	public static final Class497 aClass497_4 = new Class497(8);

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!ua;")
	public static final Class497 aClass497_11 = new Class497(16);

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "Lclient!ua;")
	public static final Class497 aClass497_6 = new Class497(32);

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "Lclient!ua;")
	public static final Class497 aClass497_7 = new Class497(64);

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "Lclient!ua;")
	public static final Class497 aClass497_8 = new Class497(128);

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "Lclient!ua;")
	static final Class497 aClass497_1 = new Class497(256);

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!ua;")
	static final Class497 aClass497_10 = new Class497(512);

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Lclient!ua;")
	static final Class497 aClass497_9 = new Class497(1024);

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "Lclient!ua;")
	static final Class497 aClass497_12 = new Class497(2048);

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!ua;")
	static final Class497 aClass497_13 = new Class497(4096);

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Lclient!ua;")
	static final Class497 aClass497_14 = new Class497(8192);

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!ua;")
	static final Class497 aClass497_15 = new Class497(16384);

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
	public final int anInt5230;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V", line = 21)
	Class497(@OriginalArg(0) int arg0) {
		this.anInt5230 = arg0 * -1210555045;
	}

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V", line = 23)
	public static void method29341(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) {
		Class391.anApplet1 = arg0;
		Class391.aString215 = arg1;
	}

	@OriginalMember(owner = "client!ua", name = "ic", descriptor = "(IIIIIIIB)V", line = 5948)
	static final void method29340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (client.anInt3065 * -1773414811 != 4) {
			return;
		}
		@Pc(9) int local9 = Class52.anInt1127 * 701602229;
		@Pc(11) int[] local11 = Class52.anIntArray167;
		@Pc(13) int local13;
		for (local13 = 0; local13 < local9; local13++) {
			@Pc(22) Class26_Sub1_Sub1_Sub1_Sub2 local22 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local11[local13]];
			if (local22 != null) {
				local22.method16660(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			}
		}
		for (local13 = 0; local13 < client.anInt3163 * 1758488217; local13++) {
			@Pc(48) int local48 = client.anIntArray303[local13];
			@Pc(54) Class3_Sub29 local54 = (Class3_Sub29) client.aClass581_21.method33217((long) local48);
			if (local54 != null) {
				((Class26_Sub1_Sub1_Sub1) local54.anObject2).method16660(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "ji", descriptor = "(Lclient!fo;III)V", line = 9518)
	public static void method29339(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray21 != null) {
			@Pc(10) Class3_Sub17 local10 = new Class3_Sub17();
			local10.aClass178_2 = arg0;
			local10.anObjectArray1 = arg0.anObjectArray21;
			Class410.method27671(local10);
		}
		client.aBoolean596 = true;
		Class616.anInt5552 = arg0.anInt3570 * -1228382611;
		client.anInt3122 = arg0.anInt3491 * -968201451;
		Class162.anInt3446 = arg1 * 1505132221;
		Class354.anInt4634 = arg2 * -1762345587;
		client.anInt3123 = arg0.anInt3559 * 1635955049;
		Class484.anInt5179 = arg0.anInt3544 * 1933075195;
		client.anInt3159 = arg0.anInt3502 * -1823767019;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "ahj", descriptor = "(Lclient!vs;I)V", line = 10401)
	static final void method29337(@OriginalArg(0) Class536 arg0) {
		System.out.println(arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575]);
	}

	@OriginalMember(owner = "client!ua", name = "alp", descriptor = "(Lclient!vs;B)V", line = 11167)
	static final void method29338(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class190.anInt3676 * 467379839;
	}

	@OriginalMember(owner = "client!ua", name = "mq", descriptor = "(Lclient!fo;I)Ljava/lang/String;", line = 11636)
	static String method29342(@OriginalArg(0) Class178 arg0) {
		if (client.method22372(arg0).method11806() == 0) {
			return null;
		} else if (arg0.aString172 == null || arg0.aString172.trim().length() == 0) {
			return client.aBoolean610 ? "Hidden-use" : null;
		} else {
			return arg0.aString172;
		}
	}
}
