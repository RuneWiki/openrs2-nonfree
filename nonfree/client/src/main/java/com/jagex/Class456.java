package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public class Class456 implements Interface56 {

	@OriginalMember(owner = "client!si", name = "bm", descriptor = "Lclient!co;")
	public static Class6 aClass6_34;

	@OriginalMember(owner = "client!si", name = "p", descriptor = "Lclient!si;")
	public static final Class456 aClass456_4 = new Class456(0, 0);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "Lclient!si;")
	public static final Class456 aClass456_5 = new Class456(1, 0);

	@OriginalMember(owner = "client!si", name = "g", descriptor = "Lclient!si;")
	public static final Class456 aClass456_3 = new Class456(2, 0);

	@OriginalMember(owner = "client!si", name = "l", descriptor = "Lclient!si;")
	public static final Class456 aClass456_14 = new Class456(3, 0);

	@OriginalMember(owner = "client!si", name = "h", descriptor = "Lclient!si;")
	public static final Class456 aClass456_6 = new Class456(9, 2);

	@OriginalMember(owner = "client!si", name = "x", descriptor = "Lclient!si;")
	public static final Class456 aClass456_7 = new Class456(4, 1);

	@OriginalMember(owner = "client!si", name = "s", descriptor = "Lclient!si;")
	public static final Class456 aClass456_8 = new Class456(5, 1);

	@OriginalMember(owner = "client!si", name = "u", descriptor = "Lclient!si;")
	public static final Class456 aClass456_9 = new Class456(6, 1);

	@OriginalMember(owner = "client!si", name = "y", descriptor = "Lclient!si;")
	public static final Class456 aClass456_10 = new Class456(7, 1);

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Lclient!si;")
	public static final Class456 aClass456_11 = new Class456(8, 1);

	@OriginalMember(owner = "client!si", name = "c", descriptor = "Lclient!si;")
	static final Class456 aClass456_12 = new Class456(12, 2);

	@OriginalMember(owner = "client!si", name = "z", descriptor = "Lclient!si;")
	public static final Class456 aClass456_13 = new Class456(13, 2);

	@OriginalMember(owner = "client!si", name = "j", descriptor = "Lclient!si;")
	static final Class456 aClass456_16 = new Class456(14, 2);

	@OriginalMember(owner = "client!si", name = "n", descriptor = "Lclient!si;")
	static final Class456 aClass456_15 = new Class456(15, 2);

	@OriginalMember(owner = "client!si", name = "e", descriptor = "Lclient!si;")
	static final Class456 aClass456_2 = new Class456(16, 2);

	@OriginalMember(owner = "client!si", name = "r", descriptor = "Lclient!si;")
	static final Class456 aClass456_20 = new Class456(17, 2);

	@OriginalMember(owner = "client!si", name = "d", descriptor = "Lclient!si;")
	static final Class456 aClass456_17 = new Class456(18, 2);

	@OriginalMember(owner = "client!si", name = "q", descriptor = "Lclient!si;")
	static final Class456 aClass456_18 = new Class456(19, 2);

	@OriginalMember(owner = "client!si", name = "m", descriptor = "Lclient!si;")
	static final Class456 aClass456_24 = new Class456(20, 2);

	@OriginalMember(owner = "client!si", name = "v", descriptor = "Lclient!si;")
	static final Class456 aClass456_19 = new Class456(21, 2);

	@OriginalMember(owner = "client!si", name = "t", descriptor = "Lclient!si;")
	public static final Class456 aClass456_21 = new Class456(10, 2);

	@OriginalMember(owner = "client!si", name = "w", descriptor = "Lclient!si;")
	public static final Class456 aClass456_22 = new Class456(11, 2);

	@OriginalMember(owner = "client!si", name = "o", descriptor = "Lclient!si;")
	public static final Class456 aClass456_23 = new Class456(22, 3);

	@OriginalMember(owner = "client!si", name = "i", descriptor = "I")
	public final int anInt5061;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "I")
	public final int anInt5062;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "(FFI)F", line = 30)
	public static float method28485(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		@Pc(5) double local5 = Math.atan2((double) arg0, (double) arg1);
		if (local5 < 0.0D) {
			local5 = local5 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local5;
	}

	@OriginalMember(owner = "client!si", name = "j", descriptor = "()[Lclient!si;", line = 35)
	public static Class456[] method28472() {
		return new Class456[] { aClass456_24, aClass456_12, aClass456_23, aClass456_18, aClass456_5, aClass456_11, aClass456_4, aClass456_7, aClass456_9, aClass456_2, aClass456_10, aClass456_21, aClass456_20, aClass456_17, aClass456_15, aClass456_19, aClass456_16, aClass456_3, aClass456_22, aClass456_13, aClass456_14, aClass456_6, aClass456_8 };
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "()[Lclient!si;", line = 35)
	public static Class456[] method28473() {
		return new Class456[] { aClass456_24, aClass456_12, aClass456_23, aClass456_18, aClass456_5, aClass456_11, aClass456_4, aClass456_7, aClass456_9, aClass456_2, aClass456_10, aClass456_21, aClass456_20, aClass456_17, aClass456_15, aClass456_19, aClass456_16, aClass456_3, aClass456_22, aClass456_13, aClass456_14, aClass456_6, aClass456_8 };
	}

	@OriginalMember(owner = "client!si", name = "z", descriptor = "()[Lclient!si;", line = 35)
	public static Class456[] method28476() {
		return new Class456[] { aClass456_24, aClass456_12, aClass456_23, aClass456_18, aClass456_5, aClass456_11, aClass456_4, aClass456_7, aClass456_9, aClass456_2, aClass456_10, aClass456_21, aClass456_20, aClass456_17, aClass456_15, aClass456_19, aClass456_16, aClass456_3, aClass456_22, aClass456_13, aClass456_14, aClass456_6, aClass456_8 };
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "()[Lclient!si;", line = 35)
	public static Class456[] method28477() {
		return new Class456[] { aClass456_24, aClass456_12, aClass456_23, aClass456_18, aClass456_5, aClass456_11, aClass456_4, aClass456_7, aClass456_9, aClass456_2, aClass456_10, aClass456_21, aClass456_20, aClass456_17, aClass456_15, aClass456_19, aClass456_16, aClass456_3, aClass456_22, aClass456_13, aClass456_14, aClass456_6, aClass456_8 };
	}

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(II)V", line = 38)
	Class456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5061 = arg0 * 1564440647;
		this.anInt5062 = arg1 * -151783959;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)I", line = 44)
	@Override
	public int method33765() {
		return this.anInt5061 * 821735799;
	}

	@OriginalMember(owner = "client!si", name = "l", descriptor = "()I", line = 44)
	@Override
	public int method33767() {
		return this.anInt5061 * 821735799;
	}

	@OriginalMember(owner = "client!si", name = "x", descriptor = "()I", line = 44)
	@Override
	public int method33764() {
		return this.anInt5061 * 821735799;
	}

	@OriginalMember(owner = "client!si", name = "h", descriptor = "()I", line = 44)
	@Override
	public int method33766() {
		return this.anInt5061 * 821735799;
	}

	@OriginalMember(owner = "client!si", name = "n", descriptor = "(I)Z", line = 48)
	public static boolean method28478(@OriginalArg(0) int arg0) {
		return arg0 >= aClass456_4.anInt5061 * 821735799 && arg0 <= aClass456_14.anInt5061 * 821735799 || aClass456_6.anInt5061 * 821735799 == arg0;
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "(I)Z", line = 52)
	static boolean method28474(@OriginalArg(0) int arg0) {
		return arg0 >= aClass456_7.anInt5061 * 821735799 && arg0 <= aClass456_11.anInt5061 * 821735799;
	}

	@OriginalMember(owner = "client!si", name = "r", descriptor = "(I)Z", line = 52)
	static boolean method28479(@OriginalArg(0) int arg0) {
		return arg0 >= aClass456_7.anInt5061 * 821735799 && arg0 <= aClass456_11.anInt5061 * 821735799;
	}

	@OriginalMember(owner = "client!si", name = "v", descriptor = "(I)Z", line = 56)
	public static boolean method28475(@OriginalArg(0) int arg0) {
		return arg0 >= aClass456_12.anInt5061 * 821735799 && arg0 <= aClass456_20.anInt5061 * 821735799;
	}

	@OriginalMember(owner = "client!si", name = "q", descriptor = "(I)Z", line = 56)
	public static boolean method28480(@OriginalArg(0) int arg0) {
		return arg0 >= aClass456_12.anInt5061 * 821735799 && arg0 <= aClass456_20.anInt5061 * 821735799;
	}

	@OriginalMember(owner = "client!si", name = "m", descriptor = "(I)Z", line = 56)
	public static boolean method28481(@OriginalArg(0) int arg0) {
		return arg0 >= aClass456_12.anInt5061 * 821735799 && arg0 <= aClass456_20.anInt5061 * 821735799;
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(I)Z", line = 56)
	public static boolean method28482(@OriginalArg(0) int arg0) {
		return arg0 >= aClass456_12.anInt5061 * 821735799 && arg0 <= aClass456_20.anInt5061 * 821735799;
	}

	@OriginalMember(owner = "client!si", name = "li", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6211)
	static final void method28483(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray20 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!si", name = "xt", descriptor = "(Lclient!vs;B)V", line = 8319)
	static final void method28487(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.anInt3194 * 963130851 == 2 && local12 < client.anInt3042 * -1645830611) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aClass313Array1[local12].anInt4533 * 1863162189;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!si", name = "ard", descriptor = "(Lclient!vs;B)V", line = 12148)
	static final void method28486(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class276.anInt4321 * -1474261961;
	}

	@OriginalMember(owner = "client!si", name = "avt", descriptor = "(Lclient!iu;S)Lclient!cn;", line = 12704)
	static Interface6 method28484(@OriginalArg(0) Class245 arg0) {
		return new Class526(arg0);
	}
}
