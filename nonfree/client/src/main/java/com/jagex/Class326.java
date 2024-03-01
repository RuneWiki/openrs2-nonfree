package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public class Class326 {

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
	public static final int anInt4567 = 14;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
	public static final int anInt4568 = 13;

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
	public static final int anInt4569 = 7;

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
	public static final int anInt4570 = 2;

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
	public static final int anInt4571 = 6;

	@OriginalMember(owner = "client!mo", name = "x", descriptor = "I")
	public static final int anInt4572 = 19;

	@OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
	public static final int anInt4573 = 18;

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
	public static final int anInt4574 = 8;

	@OriginalMember(owner = "client!mo", name = "y", descriptor = "I")
	public static final int anInt4575 = 11;

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
	public static final int anInt4576 = 3;

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
	public static final int anInt4577 = 12;

	@OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
	public static final int anInt4578 = 10;

	@OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
	public static final int anInt4579 = 15;

	@OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
	public static final int anInt4580 = 0;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
	public static final int anInt4581 = 17;

	@OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
	public static final int anInt4582 = 9;

	@OriginalMember(owner = "client!mo", name = "z", descriptor = "I")
	public static final int anInt4583 = 5;

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
	public static final int anInt4584 = 4;

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
	public static final int anInt4585 = 16;

	@OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
	public static final int anInt4586 = 1;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V", line = 25)
	Class326() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!mo", name = "an", descriptor = "(Lclient!vs;I)V", line = 4028)
	static final void method26007(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		if (arg0.anIntArray496[arg0.anInt5319 * 960738381] <= arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1]) {
			arg0.anInt5318 += arg0.anIntArray497[arg0.anInt5318 * -2140198955] * -836839043;
		}
	}

	@OriginalMember(owner = "client!mo", name = "fh", descriptor = "(Lclient!vs;B)V", line = 4991)
	static final void method26008(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class285.method25475(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!mo", name = "gj", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5166)
	static final void method26009(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		if (arg0.anInt3492 * -107621169 == 5) {
			Class461.method28592(arg0, arg1, arg2);
		}
	}
}
