package com.jagex;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acy")
public class Class71 {

	@OriginalMember(owner = "client!acy", name = "p", descriptor = "Ljava/util/Random;")
	static Random aRandom1;

	@OriginalMember(owner = "client!acy", name = "c", descriptor = "Ljava/lang/Object;")
	static final Object anObject3 = new Object();

	@OriginalMember(owner = "client!acy", name = "v", descriptor = "[I")
	static int[] anIntArray15 = new int[33];

	static {
		anIntArray15[0] = 0;
		@Pc(12) int local12 = 2;
		for (@Pc(14) int local14 = 1; local14 < 33; local14++) {
			anIntArray15[local14] = local12 - 1;
			local12 += local12;
		}
	}

	@OriginalMember(owner = "client!acy", name = "<init>", descriptor = "()V", line = 19)
	Class71() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!acy", name = "r", descriptor = "(I)I", line = 24)
	public static int method1000(@OriginalArg(0) int arg0) {
		return anIntArray15[arg0];
	}

	@OriginalMember(owner = "client!acy", name = "g", descriptor = "(I)I", line = 28)
	public static int method1001(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(19) int local19 = (local9 & 0x33333333) + (local9 >>> 2 & 0x33333333);
		@Pc(27) int local27 = local19 + (local19 >>> 4) & 0xF0F0F0F;
		@Pc(33) int local33 = local27 + (local27 >>> 8);
		@Pc(39) int local39 = local33 + (local33 >>> 16);
		return local39 & 0xFF;
	}

	@OriginalMember(owner = "client!acy", name = "z", descriptor = "(III)I", line = 37)
	public static int method1002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class239.method25926(arg2 - arg1 + 1);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 & ~local11;
	}

	@OriginalMember(owner = "client!acy", name = "i", descriptor = "(III)I", line = 43)
	public static int method1003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class239.method25926(arg2 - arg1 + 1);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 | local11;
	}

	@OriginalMember(owner = "client!acy", name = "j", descriptor = "(III)I", line = 43)
	public static int method1004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class239.method25926(arg2 - arg1 + 1);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 | local11;
	}

	@OriginalMember(owner = "client!acy", name = "k", descriptor = "(I)I", line = 60)
	public static int method1005(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 >>> 1;
		@Pc(9) int local9 = local3 | local3 >>> 1;
		@Pc(15) int local15 = local9 | local9 >>> 2;
		@Pc(21) int local21 = local15 | local15 >>> 4;
		@Pc(27) int local27 = local21 | local21 >>> 8;
		@Pc(33) int local33 = local27 | local27 >>> 16;
		return arg0 & ~local33;
	}

	@OriginalMember(owner = "client!acy", name = "e", descriptor = "(I)I", line = 60)
	public static int method1006(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 >>> 1;
		@Pc(9) int local9 = local3 | local3 >>> 1;
		@Pc(15) int local15 = local9 | local9 >>> 2;
		@Pc(21) int local21 = local15 | local15 >>> 4;
		@Pc(27) int local27 = local21 | local21 >>> 8;
		@Pc(33) int local33 = local27 | local27 >>> 16;
		return arg0 & ~local33;
	}

	@OriginalMember(owner = "client!acy", name = "u", descriptor = "(I)I", line = 60)
	public static int method1007(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 >>> 1;
		@Pc(9) int local9 = local3 | local3 >>> 1;
		@Pc(15) int local15 = local9 | local9 >>> 2;
		@Pc(21) int local21 = local15 | local15 >>> 4;
		@Pc(27) int local27 = local21 | local21 >>> 8;
		@Pc(33) int local33 = local27 | local27 >>> 16;
		return arg0 & ~local33;
	}

	@OriginalMember(owner = "client!acy", name = "o", descriptor = "(I)Z", line = 70)
	public static boolean method1008(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!acy", name = "f", descriptor = "(I)Z", line = 70)
	public static boolean method1009(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!acy", name = "b", descriptor = "(I)Z", line = 70)
	public static boolean method1010(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!acy", name = "n", descriptor = "(II)I", line = 99)
	public static int method1011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		while (arg1 > 0) {
			local1 = local1 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local1;
	}

	@OriginalMember(owner = "client!acy", name = "m", descriptor = "(II)I", line = 99)
	public static int method1012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		while (arg1 > 0) {
			local1 = local1 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local1;
	}

	@OriginalMember(owner = "client!acy", name = "a", descriptor = "(II)I", line = 99)
	public static int method1013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		while (arg1 > 0) {
			local1 = local1 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local1;
	}

	@OriginalMember(owner = "client!acy", name = "aj", descriptor = "(II)I", line = 109)
	static int method1014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >> 31 & arg1 - 1;
		return (arg0 + (arg0 >>> 31)) % arg1 + local7;
	}

	@OriginalMember(owner = "client!acy", name = "h", descriptor = "(II)I", line = 109)
	static int method1015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >> 31 & arg1 - 1;
		return (arg0 + (arg0 >>> 31)) % arg1 + local7;
	}

	@OriginalMember(owner = "client!acy", name = "apo", descriptor = "(Lclient!yf;I)V", line = 12221)
	static final void method1016(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub26_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 0 ? 0 : 1);
		Class667.method33150();
		client.aClass517_1.method30486();
	}

	@OriginalMember(owner = "client!acy", name = "asm", descriptor = "(Lclient!yf;B)V", line = 12634)
	static final void method1017(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) int[] local16 = Class34.method555(local12);
		Class684.method36252(local16, 0, arg0.anIntArray536, arg0.anInt5784 * 2088438307, 3);
		arg0.anInt5784 += 926998689;
	}

	@OriginalMember(owner = "client!acy", name = "ayf", descriptor = "(Lclient!yf;B)V", line = 13600)
	static final void method1018(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
	}
}
