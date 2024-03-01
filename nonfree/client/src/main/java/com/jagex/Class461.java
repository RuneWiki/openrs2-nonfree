package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public class Class461 implements Interface56 {

	@OriginalMember(owner = "client!so", name = "bz", descriptor = "I")
	public static int anInt5067;

	@OriginalMember(owner = "client!so", name = "p", descriptor = "Lclient!so;")
	static final Class461 aClass461_5 = new Class461(0);

	@OriginalMember(owner = "client!so", name = "a", descriptor = "Lclient!so;")
	static final Class461 aClass461_2 = new Class461(1);

	@OriginalMember(owner = "client!so", name = "g", descriptor = "Lclient!so;")
	static final Class461 aClass461_1 = new Class461(2);

	@OriginalMember(owner = "client!so", name = "l", descriptor = "Lclient!so;")
	static final Class461 aClass461_4 = new Class461(3);

	@OriginalMember(owner = "client!so", name = "h", descriptor = "Lclient!so;")
	static final Class461 aClass461_6 = new Class461(4);

	@OriginalMember(owner = "client!so", name = "x", descriptor = "Lclient!so;")
	static final Class461 aClass461_3 = new Class461(5);

	@OriginalMember(owner = "client!so", name = "s", descriptor = "I")
	final int anInt5066;

	@OriginalMember(owner = "client!so", name = "g", descriptor = "()[Lclient!so;", line = 17)
	public static Class461[] method28587() {
		return new Class461[] { aClass461_1, aClass461_3, aClass461_5, aClass461_2, aClass461_4, aClass461_6 };
	}

	@OriginalMember(owner = "client!so", name = "s", descriptor = "()[Lclient!so;", line = 17)
	public static Class461[] method28588() {
		return new Class461[] { aClass461_1, aClass461_3, aClass461_5, aClass461_2, aClass461_4, aClass461_6 };
	}

	@OriginalMember(owner = "client!so", name = "u", descriptor = "()[Lclient!so;", line = 17)
	public static Class461[] method28589() {
		return new Class461[] { aClass461_1, aClass461_3, aClass461_5, aClass461_2, aClass461_4, aClass461_6 };
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(I)V", line = 20)
	Class461(@OriginalArg(0) int arg0) {
		this.anInt5066 = arg0 * -195665321;
	}

	@OriginalMember(owner = "client!so", name = "l", descriptor = "()I", line = 25)
	@Override
	public int method33767() {
		return this.anInt5066 * 1382394215;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)I", line = 25)
	@Override
	public int method33765() {
		return this.anInt5066 * 1382394215;
	}

	@OriginalMember(owner = "client!so", name = "x", descriptor = "()I", line = 25)
	@Override
	public int method33764() {
		return this.anInt5066 * 1382394215;
	}

	@OriginalMember(owner = "client!so", name = "h", descriptor = "()I", line = 25)
	@Override
	public int method33766() {
		return this.anInt5066 * 1382394215;
	}

	@OriginalMember(owner = "client!so", name = "n", descriptor = "(II)V", line = 222)
	static void method28597(@OriginalArg(0) int arg0) {
		Class325.anInt4566 = arg0 * -1020900425;
		Class3_Sub8.aClass161_3.method23224();
	}

	@OriginalMember(owner = "client!so", name = "cf", descriptor = "(Lclient!vs;I)V", line = 4569)
	static final void method28590(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class108.method21943(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!so", name = "es", descriptor = "(Lclient!vs;I)V", line = 4938)
	static final void method28591(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class33.method7567(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!so", name = "ge", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5155)
	static final void method28592(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(12) int local12 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381];
		arg0.anInt3559 = 1433497693;
		if (arg0.anInt3476 * -1129554023 != local12) {
			arg0.anInt3476 = local12 * 1383761065;
			Class223.method24442(arg0);
		}
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class44_Sub1.method8408(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!so", name = "ku", descriptor = "(Lclient!fo;ILclient!vs;I)V", line = 6018)
	static final void method28596(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class536 arg2) {
		if (arg0.aByteArrayArray12 == null) {
			throw new RuntimeException();
		}
		if (arg0.anIntArray371 == null) {
			arg0.anIntArray371 = new int[arg0.aByteArrayArray12.length];
		}
		arg0.anIntArray371[arg1] = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!so", name = "qk", descriptor = "(Lclient!vs;I)V", line = 6985)
	static final void method28593(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(20) Class169 local20 = local11.method23435(Class613.aClass21_13);
		if (local20 != null) {
			local13 = local20.anInt3457 * -165923349;
			local15 = local20.anInt3456 * 1164759253;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local13;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15;
	}

	@OriginalMember(owner = "client!so", name = "amo", descriptor = "(Lclient!vs;B)V", line = 11259)
	static final void method28594(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		@Pc(16) long local16 = Class286.method25484();
		if (local16 == 0L) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 5;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class221.method24414(local16, local13);
		}
	}

	@OriginalMember(owner = "client!so", name = "aqj", descriptor = "(Lclient!vs;I)V", line = 11898)
	static final void method28595(@OriginalArg(0) Class536 arg0) {
		@Pc(2) Class63_Sub1 local2 = Class287.method25502();
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local2 == null ? 0 : local2.anInt1515 * -1021417267;
	}

	@OriginalMember(owner = "client!so", name = "avl", descriptor = "(Lclient!vs;I)V", line = 12708)
	static final void method28598(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anInt5315 -= 1580027550;
		@Pc(27) String local27 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575];
		@Pc(38) String local38 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 1];
		if (local27.length() <= 500 && local38.length() <= 500) {
			Class65.method13152(local12, local27, local38);
		}
	}
}
