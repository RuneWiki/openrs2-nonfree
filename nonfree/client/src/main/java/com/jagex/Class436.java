package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public class Class436 {

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
	public static final int anInt4912 = 14;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	public static final int anInt4913 = 16383;

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
	public static final int anInt4914 = 16383;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "D")
	public static final double aDouble9 = 2607.5945876176133D;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
	public static final int anInt4915 = 16384;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
	public static final int anInt4916 = 1024;

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
	public static final int anInt4917 = 2048;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
	public static final int anInt4918 = 4096;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
	public static final int anInt4919 = 14;

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
	public static final int anInt4920 = 6144;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
	public static final int anInt4921 = 10240;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
	public static final int anInt4922 = 12288;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
	public static final int anInt4923 = 14336;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
	public static final int anInt4924 = 16384;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
	public static final int anInt4925 = 8192;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
	public static final int anInt4926 = 16384;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "[I")
	public static final int[] anIntArray464 = new int[16384];

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "[I")
	public static final int[] anIntArray463 = new int[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray464[local9] = (int) (Math.sin((double) local9 * local7) * 16384.0D);
			anIntArray463[local9] = (int) (Math.cos((double) local9 * local7) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 31)
	Class436() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "(I)F", line = 36)
	public static float method28911(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x3FFF;
		return (float) ((double) ((float) local3 / 16384.0F) * 6.283185307179586D);
	}
}
