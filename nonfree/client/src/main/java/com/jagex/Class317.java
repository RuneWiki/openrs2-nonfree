package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public class Class317 {

	@OriginalMember(owner = "client!me", name = "h", descriptor = "I")
	public static final int anInt4549 = 16384;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "I")
	public static final int anInt4550 = 16384;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "I")
	public static final int anInt4551 = 10240;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "D")
	public static final double aDouble9 = 2607.5945876176133D;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "I")
	public static final int anInt4552 = 16383;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "I")
	public static final int anInt4553 = 16383;

	@OriginalMember(owner = "client!me", name = "s", descriptor = "I")
	public static final int anInt4554 = 14;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "I")
	public static final int anInt4555 = 14;

	@OriginalMember(owner = "client!me", name = "y", descriptor = "I")
	public static final int anInt4556 = 2048;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	public static final int anInt4557 = 4096;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "I")
	public static final int anInt4558 = 6144;

	@OriginalMember(owner = "client!me", name = "u", descriptor = "I")
	public static final int anInt4559 = 1024;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "I")
	public static final int anInt4560 = 12288;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "I")
	public static final int anInt4561 = 8192;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "I")
	public static final int anInt4562 = 14336;

	@OriginalMember(owner = "client!me", name = "r", descriptor = "I")
	public static final int anInt4563 = 16384;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "[I")
	public static final int[] anIntArray419 = new int[16384];

	@OriginalMember(owner = "client!me", name = "q", descriptor = "[I")
	public static final int[] anIntArray420 = new int[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray419[local9] = (int) (Math.sin((double) local9 * local7) * 16384.0D);
			anIntArray420[local9] = (int) (Math.cos((double) local9 * local7) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V", line = 31)
	Class317() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!me", name = "p", descriptor = "(I)F", line = 36)
	public static float method25842(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x3FFF;
		return (float) ((double) ((float) local3 / 16384.0F) * 6.283185307179586D);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)F", line = 36)
	public static float method25843(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x3FFF;
		return (float) ((double) ((float) local3 / 16384.0F) * 6.283185307179586D);
	}
}
