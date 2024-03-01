package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public class Class378 {

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "Lclient!ov;")
	static final Class378 aClass378_6 = new Class378(0);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "Lclient!ov;")
	public static final Class378 aClass378_3 = new Class378(1);

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "Lclient!ov;")
	public static final Class378 aClass378_4 = new Class378(2);

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "Lclient!ov;")
	public static final Class378 aClass378_5 = new Class378(3);

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "Lclient!ov;")
	public static final Class378 aClass378_10 = new Class378(4);

	@OriginalMember(owner = "client!ov", name = "x", descriptor = "Lclient!ov;")
	public static final Class378 aClass378_7 = new Class378(5);

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "Lclient!ov;")
	public static final Class378 aClass378_2 = new Class378(6);

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "Lclient!ov;")
	public static final Class378 aClass378_8 = new Class378(7);

	@OriginalMember(owner = "client!ov", name = "y", descriptor = "Lclient!ov;")
	static final Class378 aClass378_9 = new Class378(8);

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "Lclient!ov;")
	public static final Class378 aClass378_11 = new Class378(9);

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
	public final int anInt4702;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(I)V", line = 17)
	Class378(@OriginalArg(0) int arg0) {
		this.anInt4702 = arg0 * -2071269391;
	}

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "(I)Lclient!agh;", line = 19)
	static Class3_Sub23 method27248() {
		return Class3_Sub23.anInt1297 * 731741969 == 0 ? new Class3_Sub23() : Class3_Sub23.aClass3_Sub23Array1[(Class3_Sub23.anInt1297 -= -1592307215) * 731741969];
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)Lclient!wy;", line = 20)
	public static Class566 method27245(@OriginalArg(0) int arg0) {
		@Pc(2) Class566[] local2 = Exception_Sub5.method14671();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class566 local12 = local2[local4];
			if (local12.anInt5371 * 1519418413 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "(II)Lclient!amy;", line = 54)
	public static Class3_Sub1_Sub18 method27247(@OriginalArg(0) int arg0) {
		return (Class3_Sub1_Sub18) Class196.aClass581_27.method33217((long) arg0);
	}

	@OriginalMember(owner = "client!ov", name = "x", descriptor = "(IIIIIII)I", line = 56)
	public static int method27249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg1;
		} else if (local14 == 1) {
			return 7 - arg0 - (arg3 - 1);
		} else if (local14 == 2) {
			return 7 - arg1 - (arg4 - 1);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ov", name = "yo", descriptor = "(Lclient!vs;B)V", line = 8502)
	static final void method27244(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aClass123Array1[local12].aBoolean613 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ov", name = "aoi", descriptor = "(Lclient!vs;I)V", line = 11575)
	static final void method27246(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub33_4.method14179();
	}
}
