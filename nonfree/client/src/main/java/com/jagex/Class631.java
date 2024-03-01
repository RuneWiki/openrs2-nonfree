package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zv")
public class Class631 {

	@OriginalMember(owner = "client!zv", name = "p", descriptor = "I")
	public static final int anInt5586 = 8;

	@OriginalMember(owner = "client!zv", name = "<init>", descriptor = "()V", line = 6)
	Class631() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zv", name = "s", descriptor = "(Lclient!akp;I)V", line = 268)
	public static void method33858(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class3_Sub20 local8 = (Class3_Sub20) Class3_Sub20.aClass581_9.method33217((long) (arg0.anInt2355 * 144783765));
		if (local8 == null) {
			return;
		}
		if (local8.aClass366_3 != null) {
			local8.aClass366_3.method26819(100);
			Class510.aClass183_1.method23684(local8.aClass366_3);
			local8.aClass366_3 = null;
		}
		local8.method33656();
	}

	@OriginalMember(owner = "client!zv", name = "vb", descriptor = "(Lclient!vs;B)V", line = 7995)
	static final void method33857(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 1248498196;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(43) int local43 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		@Pc(49) int local49 = local13 + (local23 << 14);
		@Pc(55) int local55 = local49 + (local33 << 28);
		@Pc(59) int local59 = local55 + local43;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local59;
	}

	@OriginalMember(owner = "client!zv", name = "acw", descriptor = "(Lclient!vs;S)V", line = 9039)
	static final void method33859(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		@Pc(19) StringBuilder local19 = new StringBuilder(local13.length());
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < local13.length(); local23++) {
			@Pc(31) char local31 = local13.charAt(local23);
			if (local31 == '<') {
				local21 = true;
			} else if (local31 == '>') {
				local21 = false;
			} else if (!local21) {
				local19.append(local31);
			}
		}
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local19.toString();
	}
}
