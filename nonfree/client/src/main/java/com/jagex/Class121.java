package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public class Class121 {

	@OriginalMember(owner = "client!cw", name = "p", descriptor = "Lclient!cw;")
	public static final Class121 aClass121_18 = new Class121(6, 3);

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "Lclient!cw;")
	public static final Class121 aClass121_17 = new Class121(8, 4);

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "Lclient!cw;")
	public static final Class121 aClass121_23 = new Class121(4, 1);

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "Lclient!cw;")
	public static final Class121 aClass121_19 = new Class121(7, 1);

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "Lclient!cw;")
	public static final Class121 aClass121_20 = new Class121(5, 2);

	@OriginalMember(owner = "client!cw", name = "x", descriptor = "Lclient!cw;")
	public static final Class121 aClass121_21 = new Class121(1, 1);

	@OriginalMember(owner = "client!cw", name = "s", descriptor = "Lclient!cw;")
	static final Class121 aClass121_22 = new Class121(9, 3);

	@OriginalMember(owner = "client!cw", name = "u", descriptor = "Lclient!cw;")
	static final Class121 aClass121_16 = new Class121(2, 4);

	@OriginalMember(owner = "client!cw", name = "y", descriptor = "Lclient!cw;")
	public static final Class121 aClass121_24 = new Class121(3, 1);

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "Lclient!cw;")
	public static final Class121 aClass121_25 = new Class121(0, 1);

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
	public final int anInt3210;

	@OriginalMember(owner = "client!cw", name = "z", descriptor = "I")
	public final int anInt3211;

	@OriginalMember(owner = "client!cw", name = "p", descriptor = "(Lclient!oy;B)V", line = 16)
	public static void method22822(@OriginalArg(0) Interface42 arg0) {
		if (Class369.anInterface42_1 != null) {
			throw new IllegalStateException("");
		}
		Class369.anInterface42_1 = arg0;
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(II)V", line = 18)
	Class121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3210 = arg0 * 480732975;
		this.anInt3211 = arg1 * 1719497481;
	}

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 33)
	public static void method22823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5) {
		Class3_Sub11.method18310(arg0, arg1, arg2, arg3, arg4, arg5, null, -1);
	}

	@OriginalMember(owner = "client!cw", name = "x", descriptor = "(IIB)I", line = 160)
	public static int method22825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!cw", name = "aee", descriptor = "(Lclient!vs;B)V", line = 9733)
	static final void method22827(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class13_Sub23.aClass343_1.method26476(local13).aCharArray1[local23];
	}

	@OriginalMember(owner = "client!cw", name = "ld", descriptor = "(Lclient!fo;I)Z", line = 11151)
	static boolean method22826(@OriginalArg(0) Class178 arg0) {
		@Pc(2) Class3_Sub38 local2 = client.method22372(arg0);
		if (local2.method11818() > 0) {
			return true;
		} else if (local2.method11810()) {
			return true;
		} else {
			return arg0.aClass178_14 != null;
		}
	}

	@OriginalMember(owner = "client!cw", name = "apa", descriptor = "(Lclient!vs;I)V", line = 11663)
	static final void method22824(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub23_1.method13748();
	}

	@OriginalMember(owner = "client!cw", name = "auw", descriptor = "(Lclient!vs;I)V", line = 12559)
	static final void method22828(@OriginalArg(0) Class536 arg0) {
		Class13_Sub12.method16900(arg0.aClass26_Sub1_Sub1_Sub1_4, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381], true);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) client.aFloatArray96[0];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) client.aFloatArray96[1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) client.aFloatArray96[2];
	}
}
