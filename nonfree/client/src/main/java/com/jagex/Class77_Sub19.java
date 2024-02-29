package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajs")
public class Class77_Sub19 extends Class77 {

	@OriginalMember(owner = "client!ajs", name = "l", descriptor = "I")
	int anInt1520 = -1373916441;

	@OriginalMember(owner = "client!ajs", name = "y", descriptor = "I")
	int anInt1522 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ajs", name = "w", descriptor = "I")
	int anInt1519 = -956623339;

	@OriginalMember(owner = "client!ajs", name = "t", descriptor = "I")
	int anInt1518 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ajs", name = "q", descriptor = "I")
	int anInt1521 = 1277578821;

	@OriginalMember(owner = "client!ajs", name = "x", descriptor = "I")
	int anInt1517 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ajs", name = "d", descriptor = "I")
	int anInt1523 = -78427811;

	@OriginalMember(owner = "client!ajs", name = "s", descriptor = "I")
	int anInt1524 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ajs", name = "r", descriptor = "Lclient!akg;")
	Class77_Sub30 aClass77_Sub30_1;

	@OriginalMember(owner = "client!ajs", name = "d", descriptor = "(IB)V", line = 112)
	public static void method13486(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(6, (long) arg0);
		local4.method21544();
	}

	@OriginalMember(owner = "client!ajs", name = "<init>", descriptor = "(Lclient!akg;)V", line = 996)
	Class77_Sub19(@OriginalArg(0) Class77_Sub30 arg0) {
		this.aClass77_Sub30_1 = arg0;
	}

	@OriginalMember(owner = "client!ajs", name = "p", descriptor = "(IIB)Z", line = 1001)
	boolean method13487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= this.anInt1520 * -1485127895 && arg0 <= this.anInt1522 * -43310397 && arg1 >= this.anInt1519 * -1594951997 && arg1 <= this.anInt1518 * -873067821) {
			return true;
		} else {
			return arg0 >= this.anInt1521 * 1124363123 && arg0 <= this.anInt1517 * -673751099 && arg1 >= this.anInt1523 * 1891151115 && arg1 <= this.anInt1524 * -540011139;
		}
	}

	@OriginalMember(owner = "client!ajs", name = "gl", descriptor = "(Lclient!gm;Lclient!gh;ZILclient!yf;I)V", line = 5738)
	static final void method13488(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class665 arg4) {
		arg4.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg4.anIntArray536[arg4.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg4.anIntArray536[arg4.anInt5784 * 2088438307 + 1];
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class35_Sub4.method16775(arg0.anInt3863 * -1278450723);
			Class552.method30999(arg0.anInt3863 * -1278450723);
			Class651.method32898(arg0.anInt3863 * -1278450723);
		}
		if (local13 == -1) {
			arg0.anInt3888 = -214166091;
			arg0.anInt3889 = -931070365;
			arg0.anInt3936 = 407876511;
			return;
		}
		arg0.anInt3936 = local13 * -407876511;
		arg0.anInt3934 = local23 * -681314511;
		arg0.aBoolean683 = arg2;
		@Pc(82) Class18 local82 = (Class18) Class537.aClass35_Sub7_1.method18319(local13);
		arg0.anInt3892 = local82.anInt63 * -1631892637;
		arg0.anInt3893 = local82.anInt64 * 1489888717;
		arg0.anInt3946 = local82.anInt65 * -596442839;
		arg0.anInt3891 = local82.anInt73 * -489359023;
		arg0.anInt3932 = local82.anInt67 * -997351333;
		arg0.anInt3896 = local82.anInt62 * -639324193;
		arg0.anInt3900 = arg3 * 406000645;
		if (arg0.anInt3931 * -1843491229 > 0) {
			arg0.anInt3896 = arg0.anInt3896 * -720602720 / (arg0.anInt3931 * -1843491229) * -2116337403;
		} else if (arg0.anInt3865 * -1855456835 > 0) {
			arg0.anInt3896 = arg0.anInt3896 * -720602720 / (arg0.anInt3865 * -1855456835) * -2116337403;
		}
	}

	@OriginalMember(owner = "client!ajs", name = "oo", descriptor = "(Lclient!yf;B)V", line = 7170)
	static final void method13489(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class161.method24335(local16, local22, arg0);
	}
}
