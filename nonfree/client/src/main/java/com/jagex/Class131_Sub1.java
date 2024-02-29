package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aim")
public class Class131_Sub1 extends Class131 {

	@OriginalMember(owner = "client!aim", name = "v", descriptor = "I")
	public int anInt1415;

	@OriginalMember(owner = "client!aim", name = "l", descriptor = "I")
	public int anInt1414;

	@OriginalMember(owner = "client!aim", name = "y", descriptor = "I")
	public int anInt1416;

	@OriginalMember(owner = "client!aim", name = "w", descriptor = "I")
	public int anInt1417;

	@OriginalMember(owner = "client!aim", name = "<init>", descriptor = "(IIII)V", line = 11)
	Class131_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1415 = arg0 * -1298926391;
		this.anInt1414 = arg1 * -2109868659;
		this.anInt1416 = arg2 * -1172909789;
		this.anInt1417 = arg3 * -1343905849;
	}

	@OriginalMember(owner = "client!aim", name = "y", descriptor = "(IIIII)V", line = 19)
	void method12540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1415 = arg0 * -1298926391;
		this.anInt1414 = arg1 * -2109868659;
		this.anInt1416 = arg2 * -1172909789;
		this.anInt1417 = arg3 * -1343905849;
	}

	@OriginalMember(owner = "client!aim", name = "w", descriptor = "(IIII)V", line = 19)
	void method12541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1415 = arg0 * -1298926391;
		this.anInt1414 = arg1 * -2109868659;
		this.anInt1416 = arg2 * -1172909789;
		this.anInt1417 = arg3 * -1343905849;
	}

	@OriginalMember(owner = "client!aim", name = "t", descriptor = "(IIII)V", line = 19)
	void method12542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1415 = arg0 * -1298926391;
		this.anInt1414 = arg1 * -2109868659;
		this.anInt1416 = arg2 * -1172909789;
		this.anInt1417 = arg3 * -1343905849;
	}

	@OriginalMember(owner = "client!aim", name = "dc", descriptor = "(IIIZI)V", line = 799)
	public static void method12543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) Class77_Sub1_Sub8 local1 = Class136_Sub1.aClass77_Sub1_Sub8_2;
		Class136_Sub1.method13902(arg0);
		Class136_Sub1.aBoolean338 = false;
		if (Class136_Sub1.aClass77_Sub1_Sub8_2 != local1) {
			Class208.method25580();
		}
		Class136_Sub1.anInt1699 = arg1 * 2119321151;
		Class136_Sub1.anInt1705 = arg2 * 177934039;
		Class136_Sub1.aBoolean344 = arg3;
	}

	@OriginalMember(owner = "client!aim", name = "amp", descriptor = "(Lclient!yf;I)V", line = 11810)
	static final void method12544(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		Class597.aClass107_Sub1_2.method8799((float) arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] / 1000.0F);
	}

	@OriginalMember(owner = "client!aim", name = "aww", descriptor = "(Lclient!yf;B)V", line = 13308)
	static final void method12545(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1.method16264(local12);
	}
}
