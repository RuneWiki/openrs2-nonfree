package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apt")
public class Class101_Sub1_Sub1 extends Class101_Sub1 {

	@OriginalMember(owner = "client!apt", name = "<init>", descriptor = "(Lclient!pw;Lclient!pw;Lclient!apx;)V", line = 9)
	Class101_Sub1_Sub1(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class478 arg1, @OriginalArg(2) Class118_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!apt", name = "o", descriptor = "(IIIII)V", line = 13)
	@Override
	void method20896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = this.aClass83_23.method18121();
		@Pc(17) int local17 = ((Class118_Sub1_Sub1) this.aClass118_5).anInt2933 * 1408960135 * Class285.method26724() / 10 % local3;
		this.aClass83_23.method18133(local17 + (arg0 - local3), arg1, arg2 + local3 - local17, arg3);
	}

	@OriginalMember(owner = "client!apt", name = "b", descriptor = "(IIII)V", line = 13)
	@Override
	void method20897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = this.aClass83_23.method18121();
		@Pc(17) int local17 = ((Class118_Sub1_Sub1) this.aClass118_5).anInt2933 * 1408960135 * Class285.method26724() / 10 % local3;
		this.aClass83_23.method18133(local17 + (arg0 - local3), arg1, arg2 + local3 - local17, arg3);
	}

	@OriginalMember(owner = "client!apt", name = "c", descriptor = "(ILjava/lang/String;IIB)Z", line = 55)
	public static boolean method20899(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class680.aClass25_8 = new Class25();
		Class680.aClass25_8.anInt122 = arg0 * 1619197921;
		Class680.aClass25_8.aString5 = arg1;
		Class680.aClass25_8.anInt120 = arg2 * 1852523987;
		Class680.aClass25_8.anInt121 = arg3 * -102059163;
		return true;
	}
}
