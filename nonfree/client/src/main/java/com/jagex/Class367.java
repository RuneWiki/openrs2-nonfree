package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
final class Class367 implements Interface21 {

	@OriginalMember(owner = "client!js", name = "e", descriptor = "(IB)Lclient!alc;", line = 22)
	public static Class154_Sub1 method27961(@OriginalArg(0) int arg0) {
		return Class632.aBoolean851 && arg0 >= Class607.anInt5560 * 1855382415 && arg0 <= Class361.anInt4571 * 977343673 ? Class632.aClass154_Sub1Array2[arg0 - Class607.anInt5560 * 1855382415] : null;
	}

	@OriginalMember(owner = "client!js", name = "m", descriptor = "(Ljava/lang/String;B)V", line = 30)
	public static void method27960(@OriginalArg(0) String arg0) {
		Class227.method25614(0, 0, "", "", "", arg0, null);
	}

	@OriginalMember(owner = "client!js", name = "h", descriptor = "(Lclient!akl;B)[I", line = 250)
	static int[] method27959(@OriginalArg(0) Class93_Sub22 arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(518);
		@Pc(7) int[] local7 = new int[4];
		@Pc(9) int local9;
		for (local9 = 0; local9 < 4; local9++) {
			local7[local9] = (int) (Math.random() * 9.9999999E7D);
		}
		local4.method22510(10);
		local4.method22395(local7[0]);
		local4.method22395(local7[1]);
		local4.method22395(local7[2]);
		local4.method22395(local7[3]);
		for (local9 = 0; local9 < 10; local9++) {
			local4.method22395((int) (Math.random() * 9.9999999E7D));
		}
		local4.method22454((int) (Math.random() * 9.9999999E7D));
		local4.method22416(Class95.aBigInteger2, Class95.aBigInteger4);
		arg0.aClass93_Sub41_Sub2_1.method22405(local4.aByteArray58, 0, local4.anInt3070 * 212851357);
		return local7;
	}

	@OriginalMember(owner = "client!js", name = "w", descriptor = "(Lclient!qe;II)Lclient!ec;", line = 526)
	@Override
	public Class108 method27954(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		return (Class108) ((Interface11) Class96.aMap9.get(arg0)).method18261(arg1);
	}

	@OriginalMember(owner = "client!js", name = "i", descriptor = "(Lclient!qe;I)Lclient!ec;", line = 526)
	@Override
	public Class108 method27952(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		return (Class108) ((Interface11) Class96.aMap9.get(arg0)).method18261(arg1);
	}

	@OriginalMember(owner = "client!js", name = "j", descriptor = "(Lclient!qe;I)Lclient!ec;", line = 526)
	@Override
	public Class108 method27955(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		return (Class108) ((Interface11) Class96.aMap9.get(arg0)).method18261(arg1);
	}

	@OriginalMember(owner = "client!js", name = "t", descriptor = "(Lclient!qe;I)Lclient!ec;", line = 526)
	@Override
	public Class108 method27956(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		return (Class108) ((Interface11) Class96.aMap9.get(arg0)).method18261(arg1);
	}

	@OriginalMember(owner = "client!js", name = "ag", descriptor = "(I)Lclient!kh;", line = 530)
	@Override
	public Class379 method27958(@OriginalArg(0) int arg0) {
		return (Class379) Class30.aClass32_Sub16_1.method18261(arg0);
	}

	@OriginalMember(owner = "client!js", name = "ae", descriptor = "(I)Lclient!kh;", line = 530)
	@Override
	public Class379 method27957(@OriginalArg(0) int arg0) {
		return (Class379) Class30.aClass32_Sub16_1.method18261(arg0);
	}

	@OriginalMember(owner = "client!js", name = "l", descriptor = "(IB)Lclient!kh;", line = 530)
	@Override
	public Class379 method27953(@OriginalArg(0) int arg0) {
		return (Class379) Class30.aClass32_Sub16_1.method18261(arg0);
	}
}
