package com.jagex;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abh")
public class Class32 {

	@OriginalMember(owner = "client!abh", name = "l", descriptor = "[I")
	public static int[] anIntArray12;

	@OriginalMember(owner = "client!abh", name = "p", descriptor = "I")
	static final int anInt126 = 12;

	@OriginalMember(owner = "client!abh", name = "v", descriptor = "I")
	static int anInt127;

	@OriginalMember(owner = "client!abh", name = "y", descriptor = "[I")
	public static int[] anIntArray13;

	@OriginalMember(owner = "client!abh", name = "c", descriptor = "I")
	public static int anInt128;

	@OriginalMember(owner = "client!abh", name = "w", descriptor = "Lclient!qd;")
	static Class484 aClass484_1 = new Class484(16, Class467.aClass467_1);

	@OriginalMember(owner = "client!abh", name = "<init>", descriptor = "()V", line = 16)
	Class32() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!abh", name = "p", descriptor = "(IIB)V", line = 21)
	public static void method526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (anInt128 * 327132075 != arg0) {
			anIntArray12 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				anIntArray12[local9] = (local9 << 12) / arg0;
			}
			anInt128 = arg0 * 1521368835;
		}
		if (arg1 == anInt127 * 123414429) {
			return;
		}
		if (arg1 == anInt128 * 327132075) {
			anIntArray13 = anIntArray12;
		} else {
			anIntArray13 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				anIntArray13[local9] = (local9 << 12) / arg1;
			}
		}
		anInt127 = arg1 * 914593461;
	}

	@OriginalMember(owner = "client!abh", name = "v", descriptor = "(II)V", line = 21)
	public static void method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (anInt128 * 327132075 != arg0) {
			anIntArray12 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				anIntArray12[local9] = (local9 << 12) / arg0;
			}
			anInt128 = arg0 * 1521368835;
		}
		if (arg1 == anInt127 * 123414429) {
			return;
		}
		if (arg1 == anInt128 * 327132075) {
			anIntArray13 = anIntArray12;
		} else {
			anIntArray13 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				anIntArray13[local9] = (local9 << 12) / arg1;
			}
		}
		anInt127 = arg1 * 914593461;
	}

	@OriginalMember(owner = "client!abh", name = "l", descriptor = "(II)V", line = 21)
	public static void method528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (anInt128 * 327132075 != arg0) {
			anIntArray12 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				anIntArray12[local9] = (local9 << 12) / arg0;
			}
			anInt128 = arg0 * 1521368835;
		}
		if (arg1 == anInt127 * 123414429) {
			return;
		}
		if (arg1 == anInt128 * 327132075) {
			anIntArray13 = anIntArray12;
		} else {
			anIntArray13 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				anIntArray13[local9] = (local9 << 12) / arg1;
			}
		}
		anInt127 = arg1 * 914593461;
	}

	@OriginalMember(owner = "client!abh", name = "c", descriptor = "(II)[B", line = 37)
	public static byte[] method529(@OriginalArg(0) int arg0) {
		@Pc(7) byte[] local7 = (byte[]) aClass484_1.method29843(arg0);
		if (local7 == null) {
			local7 = new byte[512];
			@Pc(18) Random local18 = new Random((long) arg0);
			@Pc(20) int local20;
			for (local20 = 0; local20 < 255; local20++) {
				local7[local20] = (byte) local20;
			}
			for (local20 = 0; local20 < 255; local20++) {
				@Pc(39) int local39 = 255 - local20;
				@Pc(44) int local44 = Class96_Sub20.method7745(local18, local39);
				@Pc(48) byte local48 = local7[local44];
				local7[local44] = local7[local39];
				local7[local39] = local7[511 - local20] = local48;
			}
			aClass484_1.method29844(arg0, local7);
		}
		return local7;
	}
}
