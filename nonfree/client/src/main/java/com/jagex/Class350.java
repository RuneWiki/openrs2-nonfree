package com.jagex;

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public class Class350 {

	@OriginalMember(owner = "client!nn", name = "w", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "Lclient!rn;")
	static Class436 aClass436_2;

	@OriginalMember(owner = "client!nn", name = "bf", descriptor = "Lclient!co;")
	public static Class6 aClass6_27;

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "Lclient!nn;")
	static final Class350 aClass350_1 = new Class350(3);

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "Lclient!nn;")
	static final Class350 aClass350_2 = new Class350(0);

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "Lclient!nn;")
	static final Class350 aClass350_3 = new Class350(2);

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "Lclient!nn;")
	static final Class350 aClass350_4 = new Class350(1);

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "Lclient!nn;")
	static final Class350 aClass350_5 = new Class350(4);

	@OriginalMember(owner = "client!nn", name = "x", descriptor = "Lclient!nn;")
	static final Class350 aClass350_6 = new Class350(5);

	@OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
	final int anInt4631;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(I)V", line = 14)
	Class350(@OriginalArg(0) int arg0) {
		this.anInt4631 = arg0 * -1143946753;
	}

	@OriginalMember(owner = "client!nn", name = "hw", descriptor = "(Lclient!vs;I)V", line = 5430)
	static final void method26582(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class174.method23395(local11, local14, true, 1, arg0);
	}

	@OriginalMember(owner = "client!nn", name = "rd", descriptor = "(Lclient!vs;I)V", line = 7290)
	static final void method26579(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local16.aString169;
	}

	@OriginalMember(owner = "client!nn", name = "adv", descriptor = "(Lclient!vs;S)V", line = 9232)
	static final void method26580(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) Class594 local17 = Class44_Sub3.aClass596_1.method33435(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.aBoolean845 ? 1 : 0;
	}

	@OriginalMember(owner = "client!nn", name = "aqm", descriptor = "(Lclient!vs;B)V", line = 11981)
	static final void method26581(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		Class586.method33284(3, local13 << 16 | local23, local33, "");
	}
}
