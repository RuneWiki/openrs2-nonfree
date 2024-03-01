package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public class Class364 {

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 10)
	Class364() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V", line = 15)
	public static void method26782(@OriginalArg(0) boolean arg0) {
		Class510.aClass183_1.method23624();
		if (!Class594.method33424(client.anInt3039 * 1115111877)) {
			return;
		}
		@Pc(11) Class82[] local11 = client.aClass82Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(21) Class82 local21 = local11[local13];
			local21.anInt2919 += -1363934375;
			if (local21.anInt2919 * 2119570665 < 50 && !arg0) {
				return;
			}
			local21.anInt2919 = 0;
			if (!local21.aBoolean531 && local21.method21621() != null) {
				@Pc(52) Class3_Sub23 local52 = Class269.method25284(Class311.aClass311_89, local21.aClass577_2);
				local21.method21601(local52);
				try {
					local21.method21617();
				} catch (@Pc(61) IOException local61) {
					local21.aBoolean531 = true;
				}
			}
		}
		Class510.aClass183_1.method23624();
	}

	@OriginalMember(owner = "client!oe", name = "bp", descriptor = "(Lclient!vs;B)V", line = 4177)
	static final void method26783(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5316 -= -43584562;
		if (arg0.aLongArray18[arg0.anInt5316 * 196643287] <= arg0.aLongArray18[arg0.anInt5316 * 196643287 + 1]) {
			arg0.anInt5318 += arg0.anIntArray497[arg0.anInt5318 * -2140198955] * -836839043;
		}
	}

	@OriginalMember(owner = "client!oe", name = "oe", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6767)
	static final void method26785(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray31 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!oe", name = "aed", descriptor = "(Lclient!vs;I)V", line = 9667)
	static final void method26784(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class622.aClass580_2.method33211(local12).method19278();
	}

	@OriginalMember(owner = "client!oe", name = "ahu", descriptor = "(Lclient!vs;I)V", line = 10349)
	static final void method26786(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= -2110095453;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(25) int local25 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] << 1;
		@Pc(35) int local35 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(45) int local45 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		@Pc(55) int local55 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 4];
		@Pc(65) int local65 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 5];
		@Pc(75) int local75 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 6];
		if (local13 >= 0 && local13 < 2 && client.anIntArrayArrayArray15[local13] != null && local25 >= 0 && local25 < client.anIntArrayArrayArray15[local13].length) {
			client.anIntArrayArrayArray15[local13][local25] = new int[] { (local35 >> 14 & 0x3FFF) << 9, local45 << 2, (local35 & 0x3FFF) << 9, local75 };
			client.anIntArrayArrayArray15[local13][local25 + 1] = new int[] { (local55 >> 14 & 0x3FFF) << 9, local65 << 2, (local55 & 0x3FFF) << 9 };
		}
	}
}
