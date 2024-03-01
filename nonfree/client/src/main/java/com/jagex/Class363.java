package com.jagex;

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public class Class363 {

	@OriginalMember(owner = "client!ob", name = "as", descriptor = "[I")
	static int[] anIntArray423;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!ob;")
	static final Class363 aClass363_1 = new Class363();

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!ob;")
	public static final Class363 aClass363_2 = new Class363();

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "Lclient!ob;")
	public static final Class363 aClass363_3 = new Class363();

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Lclient!ob;")
	static final Class363 aClass363_4 = new Class363();

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 9)
	Class363() {
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!wn;IIIII)Ljava/awt/Frame;", line = 29)
	public static Frame method26781(@OriginalArg(0) Class556 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == 0) {
			@Pc(6) Class573[] local6 = Class360.method26766(arg0);
			if (local6 == null) {
				return null;
			}
			@Pc(13) boolean local13 = false;
			for (@Pc(15) int local15 = 0; local15 < local6.length; local15++) {
				if (local6[local15].anInt5423 * 1081330127 == arg1 && local6[local15].anInt5424 * 1418262355 == arg2 && (arg4 == 0 || arg4 == local6[local15].anInt5422 * 1459817545) && (!local13 || local6[local15].anInt5425 * 1293089211 > arg3)) {
					arg3 = local6[local15].anInt5425 * 1293089211;
					local13 = true;
				}
			}
			if (!local13) {
				return null;
			}
		}
		@Pc(75) Frame local75 = new Frame("Jagex Full Screen");
		local75.setResizable(false);
		arg0.method32799(local75, arg1, arg2, arg3, arg4);
		return local75;
	}

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "([J[IIII)V", line = 112)
	static void method26780(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) long local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(46) int local46 = local14 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < (long) (local48 & local46) + local14) {
				@Pc(66) long local66 = arg0[local48];
				arg0[local48] = arg0[local10];
				arg0[local10] = local66;
				@Pc(80) int local80 = arg1[local48];
				arg1[local48] = arg1[local10];
				arg1[local10++] = local80;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method26780(arg0, arg1, arg2, local10 - 1);
		method26780(arg0, arg1, local10 + 1, arg3);
	}
}
