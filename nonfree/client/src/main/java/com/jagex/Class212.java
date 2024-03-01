package com.jagex;

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public class Class212 {

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!gw", name = "z", descriptor = "I")
	static int anInt3704;

	@OriginalMember(owner = "client!gw", name = "p", descriptor = "Lclient!gw;")
	static final Class212 aClass212_3 = new Class212(0);

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "Lclient!gw;")
	static final Class212 aClass212_4 = new Class212(1);

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(I)V", line = 7)
	Class212(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!gw", name = "bf", descriptor = "(III)V", line = 305)
	static void method24255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(16, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!gw", name = "age", descriptor = "(Lclient!vs;I)V", line = 9963)
	static final void method24254(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(15) Class3_Sub1_Sub4 local15 = Class58.method12390(local12);
		if (local15 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anInt2652 * 1214831777;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anInt2654 * 1120229487;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anInt2653 * 363486565;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anInt2655 * -1121810567;
		}
	}
}
