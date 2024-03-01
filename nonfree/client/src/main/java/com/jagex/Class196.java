package com.jagex;

import java.lang.management.GarbageCollectorMXBean;
import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public class Class196 {

	@OriginalMember(owner = "client!gf", name = "vh", descriptor = "Ljava/lang/management/GarbageCollectorMXBean;")
	static GarbageCollectorMXBean aGarbageCollectorMXBean1;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "Ljava/util/Map;")
	static final Map aMap9 = new HashMap();

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!xn;")
	static final Class581 aClass581_27 = new Class581(1024);

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "Lclient!wc;")
	static final Class546 aClass546_14 = new Class546();

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	static int anInt3685 = 0;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V", line = 16)
	Class196() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Lclient!sd;", line = 20)
	static Class451 method24108(@OriginalArg(0) int arg0) {
		@Pc(2) Class451[] local2 = Class188.method23977();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class451 local12 = local2[local4];
			if (local12.anInt5023 * 1253090117 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gf", name = "z", descriptor = "()I", line = 21)
	static int method24095() {
		return (anInt3685 += 572433983) * -2017048129 - 1;
	}

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "()I", line = 21)
	static int method24096() {
		return (anInt3685 += 572433983) * -2017048129 - 1;
	}

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "(Ljava/lang/String;)V", line = 25)
	public static void method24097(@OriginalArg(0) String arg0) {
		Class121.method22823(0, 0, "", "", "", arg0);
	}

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "(I)[Lclient!uh;", line = 25)
	static Class502[] method24111() {
		return new Class502[] { Class502.aClass502_5, Class502.aClass502_6, Class502.aClass502_10, Class502.aClass502_8, Class502.aClass502_12, Class502.aClass502_14, Class502.aClass502_4, Class502.aClass502_1, Class502.aClass502_3, Class502.aClass502_9, Class502.aClass502_11, Class502.aClass502_2, Class502.aClass502_7, Class502.aClass502_13 };
	}

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "(ILjava/lang/String;)V", line = 29)
	public static void method24098(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Class121.method22823(arg0, 0, "", "", "", arg1);
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(ILjava/lang/String;)V", line = 29)
	public static void method24099(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Class121.method22823(arg0, 0, "", "", "", arg1);
	}

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "(B)[Lclient!wg;", line = 30)
	public static Class550[] method24114() {
		return new Class550[] { Class550.aClass550_16, Class550.aClass550_12, Class550.aClass550_8, Class550.aClass550_15, Class550.aClass550_9, Class550.aClass550_7, Class550.aClass550_20, Class550.aClass550_17, Class550.aClass550_19, Class550.aClass550_14, Class550.aClass550_2, Class550.aClass550_4, Class550.aClass550_10, Class550.aClass550_11, Class550.aClass550_3, Class550.aClass550_13, Class550.aClass550_6, Class550.aClass550_5, Class550.aClass550_18 };
	}

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 33)
	public static void method24093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5) {
		Class3_Sub11.method18310(arg0, arg1, arg2, arg3, arg4, arg5, null, -1);
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 33)
	public static void method24100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5) {
		Class3_Sub11.method18310(arg0, arg1, arg2, arg3, arg4, arg5, null, -1);
	}

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 37)
	public static void method24101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7) {
		@Pc(5) Class214 local5 = (Class214) aMap9.get(arg0);
		if (local5 == null) {
			local5 = new Class214();
			aMap9.put(arg0, local5);
		}
		@Pc(29) Class3_Sub1_Sub18 local29 = local5.method24275(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		aClass581_27.method33241(local29, (long) (local29.anInt2704 * 178210753));
		aClass546_14.method32621(local29);
		client.anInt3035 = client.anInt3138 * -556377989;
	}

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 37)
	public static void method24102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7) {
		@Pc(5) Class214 local5 = (Class214) aMap9.get(arg0);
		if (local5 == null) {
			local5 = new Class214();
			aMap9.put(arg0, local5);
		}
		@Pc(29) Class3_Sub1_Sub18 local29 = local5.method24275(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		aClass581_27.method33241(local29, (long) (local29.anInt2704 * 178210753));
		aClass546_14.method32621(local29);
		client.anInt3035 = client.anInt3138 * -556377989;
	}

	@OriginalMember(owner = "client!gf", name = "w", descriptor = "(I)Lclient!amy;", line = 54)
	public static Class3_Sub1_Sub18 method24103(@OriginalArg(0) int arg0) {
		return (Class3_Sub1_Sub18) aClass581_27.method33217((long) arg0);
	}

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "(I)Lclient!amy;", line = 54)
	public static Class3_Sub1_Sub18 method24105(@OriginalArg(0) int arg0) {
		return (Class3_Sub1_Sub18) aClass581_27.method33217((long) arg0);
	}

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "(I)I", line = 58)
	public static int method24094(@OriginalArg(0) int arg0) {
		@Pc(5) Class214 local5 = (Class214) aMap9.get(arg0);
		return local5 == null ? 0 : local5.method24270();
	}

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "(I)I", line = 58)
	public static int method24104(@OriginalArg(0) int arg0) {
		@Pc(5) Class214 local5 = (Class214) aMap9.get(arg0);
		return local5 == null ? 0 : local5.method24270();
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "()V", line = 64)
	public static void method24106() {
		aMap9.clear();
		aClass581_27.method33222();
		aClass546_14.method32620();
		anInt3685 = 0;
	}

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "(I)I", line = 78)
	public static int method24107(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub1_Sub18 local5 = (Class3_Sub1_Sub18) aClass581_27.method33217((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (aClass546_14.aClass3_Sub1_62 == local5.aClass3_Sub1_66) {
			return -1;
		} else {
			return ((Class3_Sub1_Sub18) local5.aClass3_Sub1_66).anInt2704 * 178210753;
		}
	}

	@OriginalMember(owner = "client!gf", name = "el", descriptor = "(II)Z", line = 1702)
	static boolean method24112(@OriginalArg(0) int arg0) {
		return arg0 == 18 || arg0 == 3;
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(Lclient!vs;B)V", line = 3984)
	static final void method24116(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		if (arg0.anIntArray496[arg0.anInt5319 * 960738381] != arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1]) {
			arg0.anInt5318 += arg0.anIntArray497[arg0.anInt5318 * -2140198955] * -836839043;
		}
	}

	@OriginalMember(owner = "client!gf", name = "kr", descriptor = "(Lclient!vs;I)V", line = 5916)
	static final void method24115(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(19) byte[] local19 = new byte[] { (byte) arg0.anIntArray496[arg0.anInt5319 * 960738381] };
		@Pc(35) byte[] local35 = new byte[] { (byte) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] };
		@Pc(45) int local45 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(49) Class178 local49 = Class375.method27235(local45);
		Class435.method27995(local49, local19, local35, arg0);
	}

	@OriginalMember(owner = "client!gf", name = "uw", descriptor = "(Lclient!vs;I)V", line = 7739)
	static final void method24109(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class440.method28240(local13, local23, false);
	}

	@OriginalMember(owner = "client!gf", name = "ww", descriptor = "(Lclient!vs;S)V", line = 8048)
	static final void method24110(@OriginalArg(0) Class536 arg0) {
		@Pc(2) Class3_Sub1_Sub7 local2 = Class3_Sub45.method13020();
		if (Class215.method24288(local2) == 4) {
			@Pc(14) Class3_Sub29 local14 = (Class3_Sub29) client.aClass581_21.method33217(local2.method19010());
			if (local14 != null) {
				arg0.aClass26_Sub1_Sub1_Sub1_4 = (Class26_Sub1_Sub1_Sub1) local14.anObject2;
				arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 1;
				return;
			}
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
	}

	@OriginalMember(owner = "client!gf", name = "ars", descriptor = "(Lclient!vs;I)V", line = 12060)
	static final void method24113(@OriginalArg(0) Class536 arg0) {
		client.aClass178_13 = null;
		client.aClass178_11 = null;
	}
}
