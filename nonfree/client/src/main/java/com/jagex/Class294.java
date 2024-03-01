package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public class Class294 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	static final int anInt4373 = 1;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
	static final int anInt4374 = 8;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	static final int anInt4375 = 5;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	static final int anInt4376 = 4;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	static final int anInt4377 = 6;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
	static final int anInt4378 = 7;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
	static final int anInt4379 = 12;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
	static final int anInt4380 = 10;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
	static final int anInt4381 = 17;

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
	static final int anInt4382 = 16;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	static final int anInt4383 = 14;

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
	static final int anInt4384 = 15;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	static final int anInt4385 = 11;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	static final int anInt4386 = 13;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	static final int anInt4387 = 9;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
	static final int anInt4388 = 3;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	static final int anInt4389 = 2;

	@OriginalMember(owner = "client!lc", name = "ak", descriptor = "I")
	static int anInt4390;

	@OriginalMember(owner = "client!lc", name = "fu", descriptor = "Lclient!ny;")
	public static Class359 aClass359_54;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 22)
	Class294() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)[I", line = 61)
	public static int[] method25565() {
		return new int[] { Class568.anInt5378 * 1732591297, Class568.anInt5372 * -349930659, Class568.anInt5373 * -779866773 };
	}

	@OriginalMember(owner = "client!lc", name = "qh", descriptor = "(Lclient!vs;I)V", line = 7005)
	static final void method25566(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3559 * 1976441867;
	}

	@OriginalMember(owner = "client!lc", name = "aid", descriptor = "(Lclient!vs;I)V", line = 10507)
	static final void method25564(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
	}
}
