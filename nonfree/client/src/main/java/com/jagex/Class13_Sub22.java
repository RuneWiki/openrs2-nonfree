package com.jagex;

import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acy")
public class Class13_Sub22 extends Class13 {

	@OriginalMember(owner = "client!acy", name = "sc", descriptor = "Lclient!wy;")
	public static Class566 aClass566_1;

	@OriginalMember(owner = "client!acy", name = "a", descriptor = "I")
	final int anInt755;

	@OriginalMember(owner = "client!acy", name = "h", descriptor = "[I")
	final int[] anIntArray91;

	@OriginalMember(owner = "client!acy", name = "g", descriptor = "I")
	final int anInt753;

	@OriginalMember(owner = "client!acy", name = "l", descriptor = "I")
	final int anInt754;

	@OriginalMember(owner = "client!acy", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 17)
	Class13_Sub22(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt755 = arg0.method20271() * -174463641;
		this.anIntArray91 = new int[4];
		this.anInt753 = arg0.method20375() * 752518709;
		Arrays.fill(this.anIntArray91, 0, this.anIntArray91.length, this.anInt753 * 1617763357);
		this.anInt754 = arg0.method20275() * -1278314259;
	}

	@OriginalMember(owner = "client!acy", name = "h", descriptor = "()V", line = 26)
	@Override
	public void method16896() {
		@Pc(8) Class26_Sub1_Sub1_Sub1 local8 = Class131.aClass163Array1[this.anInt755 * 315909719].method23278();
		if (this.anInt754 * 24028389 == 0) {
			Class435.method27993(local8, this.anIntArray91, 0, false);
		} else {
			Class227.method24505(local8, new int[] { this.anInt753 * 1617763357 }, new int[] { 0 }, new int[] { this.anInt754 * 24028389 });
		}
	}

	@OriginalMember(owner = "client!acy", name = "a", descriptor = "(I)V", line = 26)
	@Override
	public void method16888() {
		@Pc(8) Class26_Sub1_Sub1_Sub1 local8 = Class131.aClass163Array1[this.anInt755 * 315909719].method23278();
		if (this.anInt754 * 24028389 == 0) {
			Class435.method27993(local8, this.anIntArray91, 0, false);
		} else {
			Class227.method24505(local8, new int[] { this.anInt753 * 1617763357 }, new int[] { 0 }, new int[] { this.anInt754 * 24028389 });
		}
	}

	@OriginalMember(owner = "client!acy", name = "l", descriptor = "(I)Z", line = 32)
	@Override
	boolean method16890() {
		@Pc(7) Class440 local7 = Class110.aClass436_1.method27999(this.anInt753 * 1617763357);
		return local7.method28236();
	}

	@OriginalMember(owner = "client!acy", name = "x", descriptor = "()Z", line = 32)
	@Override
	boolean method16891() {
		@Pc(7) Class440 local7 = Class110.aClass436_1.method27999(this.anInt753 * 1617763357);
		return local7.method28236();
	}

	@OriginalMember(owner = "client!acy", name = "s", descriptor = "()Z", line = 32)
	@Override
	boolean method16893() {
		@Pc(7) Class440 local7 = Class110.aClass436_1.method27999(this.anInt753 * 1617763357);
		return local7.method28236();
	}

	@OriginalMember(owner = "client!acy", name = "bs", descriptor = "(Lclient!amn;I)Ljava/lang/String;", line = 1383)
	static String method7254(@OriginalArg(0) Class3_Sub1_Sub9 arg0) {
		return arg0.aString112 + Class271.method25310(16777215) + " >";
	}

	@OriginalMember(owner = "client!acy", name = "uq", descriptor = "(Lclient!vs;I)V", line = 7753)
	static final void method7255(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class538.method32565(local13, local23, false);
	}

	@OriginalMember(owner = "client!acy", name = "aci", descriptor = "(Lclient!vs;I)V", line = 9168)
	static final void method7256(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) Class594 local17 = Class44_Sub3.aClass596_1.method33435(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.anInt5501 * -315113939;
	}
}
