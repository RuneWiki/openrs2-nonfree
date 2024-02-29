package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pz")
public class Class481 implements Interface75 {

	@OriginalMember(owner = "client!pz", name = "p", descriptor = "Lclient!pz;")
	static final Class481 aClass481_2 = new Class481(0);

	@OriginalMember(owner = "client!pz", name = "c", descriptor = "Lclient!pz;")
	static final Class481 aClass481_3 = new Class481(1);

	@OriginalMember(owner = "client!pz", name = "v", descriptor = "Lclient!pz;")
	static final Class481 aClass481_1 = new Class481(2);

	@OriginalMember(owner = "client!pz", name = "l", descriptor = "I")
	final int anInt5015;

	@OriginalMember(owner = "client!pz", name = "v", descriptor = "()[Lclient!pz;", line = 14)
	public static Class481[] method29822() {
		return new Class481[] { aClass481_1, aClass481_2, aClass481_3 };
	}

	@OriginalMember(owner = "client!pz", name = "<init>", descriptor = "(I)V", line = 17)
	Class481(@OriginalArg(0) int arg0) {
		this.anInt5015 = arg0 * -1324809533;
	}

	@OriginalMember(owner = "client!pz", name = "c", descriptor = "()I", line = 22)
	@Override
	public int method36479() {
		return this.anInt5015 * 931544555;
	}

	@OriginalMember(owner = "client!pz", name = "y", descriptor = "()I", line = 22)
	@Override
	public int method36477() {
		return this.anInt5015 * 931544555;
	}

	@OriginalMember(owner = "client!pz", name = "l", descriptor = "()I", line = 22)
	@Override
	public int method36478() {
		return this.anInt5015 * 931544555;
	}

	@OriginalMember(owner = "client!pz", name = "p", descriptor = "(Lclient!aas;Lclient!akv;I)Lclient!aau;", line = 44)
	public static Class20 method29823(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		return Class551.method30996(arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!pz", name = "t", descriptor = "(II)V", line = 97)
	public static void method29824(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(23, (long) arg0);
		local4.method21544();
	}

	@OriginalMember(owner = "client!pz", name = "sb", descriptor = "(Lclient!yf;I)V", line = 7832)
	static final void method29825(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >>> 16];
		@Pc(27) Class277 local27 = Class578.method31654(local22, local16);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local27 == null ? -1 : -1278450723 * local27.anInt3863;
	}
}
