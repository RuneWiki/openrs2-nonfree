package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gc")
public class Class193 {

	@OriginalMember(owner = "client!gc", name = "os", descriptor = "I")
	public static int anInt3683;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "Lclient!gc;")
	static final Class193 aClass193_15 = new Class193(0);

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "Lclient!gc;")
	static final Class193 aClass193_2 = new Class193(1);

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "Lclient!gc;")
	static final Class193 aClass193_9 = new Class193(2);

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "Lclient!gc;")
	static final Class193 aClass193_4 = new Class193(3);

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "Lclient!gc;")
	static final Class193 aClass193_5 = new Class193(4);

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "Lclient!gc;")
	static final Class193 aClass193_6 = new Class193(5);

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "Lclient!gc;")
	static final Class193 aClass193_7 = new Class193(6);

	@OriginalMember(owner = "client!gc", name = "u", descriptor = "Lclient!gc;")
	static final Class193 aClass193_8 = new Class193(7);

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "Lclient!gc;")
	static final Class193 aClass193_12 = new Class193(8);

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "Lclient!gc;")
	static final Class193 aClass193_3 = new Class193(9);

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "Lclient!gc;")
	static final Class193 aClass193_10 = new Class193(10);

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "Lclient!gc;")
	static final Class193 aClass193_11 = new Class193(11);

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "Lclient!gc;")
	static final Class193 aClass193_1 = new Class193(12);

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "Lclient!gc;")
	static final Class193 aClass193_13 = new Class193(13);

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "Lclient!gc;")
	static final Class193 aClass193_14 = new Class193(14);

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	final int anInt3682;

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "(I)V", line = 21)
	Class193(@OriginalArg(0) int arg0) {
		this.anInt3682 = arg0 * 1824212117;
	}

	@OriginalMember(owner = "client!gc", name = "bm", descriptor = "(Lclient!vs;I)V", line = 4191)
	static final void method24068(@OriginalArg(0) Class536 arg0) {
		if (arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 0) {
			arg0.anInt5318 += arg0.anIntArray497[arg0.anInt5318 * -2140198955] * -836839043;
		}
	}

	@OriginalMember(owner = "client!gc", name = "dm", descriptor = "(Lclient!vs;I)V", line = 4727)
	static final void method24069(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class78.method21586(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!gc", name = "fr", descriptor = "(Lclient!vs;I)V", line = 5123)
	static final void method24070(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class399.method27567(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!gc", name = "gb", descriptor = "(Lclient!vs;I)V", line = 5294)
	static final void method24073(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class505.method29518(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!gc", name = "yl", descriptor = "(Lclient!vs;I)V", line = 8475)
	static final void method24074(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.anInt3194 * 963130851 == 2 && local12 >= 0 && local12 < client.anInt3042 * -1645830611) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aClass313Array1[local12].anInt4532 * 1978462757;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!gc", name = "agr", descriptor = "(Lclient!vs;B)V", line = 10151)
	static final void method24071(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (Class58_Sub1.aClass581_15 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			@Pc(19) Class3 local19 = Class58_Sub1.aClass581_15.method33217((long) local12);
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local19 == null ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!gc", name = "atu", descriptor = "(Lclient!vs;I)V", line = 12402)
	static final void method24072(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub23_1.method13747() ? 1 : 0;
	}
}
