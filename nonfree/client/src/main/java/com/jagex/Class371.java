package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jx")
public class Class371 {

	@OriginalMember(owner = "client!jx", name = "n", descriptor = "I")
	static final int anInt4593 = 2048;

	@OriginalMember(owner = "client!jx", name = "k", descriptor = "I")
	static final int anInt4594 = 6;

	@OriginalMember(owner = "client!jx", name = "m", descriptor = "I")
	static final int anInt4595 = 2;

	@OriginalMember(owner = "client!jx", name = "e", descriptor = "I")
	static final int anInt4596 = 11;

	@OriginalMember(owner = "client!jx", name = "f", descriptor = "[I")
	static int[] anIntArray432 = new int[512];

	static {
		@Pc(4) byte local4 = 9;
		for (@Pc(8) int local8 = local4 - 1; local8 >= 0; local8--) {
			@Pc(18) int local18 = 0x1 << local4 - local8 - 1;
			@Pc(24) int local24 = 0x1 << local4 - local8;
			for (@Pc(26) int local26 = local18; local26 < local24; local26++) {
				anIntArray432[local26] = (local24 - local26 << 6 >>> local4 - local8 - 1) + (local8 << 6);
			}
		}
	}

	@OriginalMember(owner = "client!jx", name = "e", descriptor = "(IJ)Lclient!ars;", line = 47)
	static Class93_Sub1_Sub11 method28006(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		Class93_Sub1_Sub11.aBoolean506 = false;
		@Pc(11) Class93_Sub1_Sub11 local11 = (Class93_Sub1_Sub11) Class93_Sub1_Sub11.aClass16_17.method215((long) arg0 << 56 | arg1);
		if (local11 == null) {
			local11 = new Class93_Sub1_Sub11(arg0, arg1);
			Class93_Sub1_Sub11.aClass16_17.method221(local11, local11.aLong232 * -3750704643647536275L);
			Class93_Sub1_Sub11.aBoolean506 = true;
		}
		return local11;
	}

	@OriginalMember(owner = "client!jx", name = "m", descriptor = "(B)V", line = 93)
	public static final void method28004() {
		@Pc(4) Class93_Sub8 local4;
		for (local4 = (Class93_Sub8) Class93_Sub8.aClass22_18.method445(); local4 != null; local4 = (Class93_Sub8) Class93_Sub8.aClass22_18.method415()) {
			if (local4.aBoolean309) {
				local4.method23969();
			} else {
				local4.aBoolean308 = true;
				if (local4.anInt1462 * -1824529811 >= 0 && local4.anInt1464 * 275343381 >= 0 && local4.anInt1462 * -1824529811 < client.aClass532_1.method30444() && local4.anInt1464 * 275343381 < client.aClass532_1.method30474()) {
					Class593.method31720(local4);
				}
			}
		}
		for (local4 = (Class93_Sub8) Class93_Sub8.aClass22_19.method445(); local4 != null; local4 = (Class93_Sub8) Class93_Sub8.aClass22_19.method415()) {
			if (local4.aBoolean309) {
				local4.method23969();
			} else {
				local4.aBoolean308 = true;
			}
		}
	}

	@OriginalMember(owner = "client!jx", name = "dd", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5478)
	static final void method28000(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		@Pc(12) int local12 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091];
		arg0.anInt4045 = -678873919;
		if (arg0.anInt3995 * -1566573331 != local12) {
			arg0.anInt3995 = local12 * 2027274469;
			Class354.method27696(arg0);
		}
		if (arg0.anInt3970 * 532402067 == -1 && !arg1.aBoolean708) {
			Class542.method30937(arg0.anInt3953 * -1549590237);
		}
	}

	@OriginalMember(owner = "client!jx", name = "vb", descriptor = "(Lclient!yf;B)V", line = 8748)
	static final void method28008(@OriginalArg(0) Class681 arg0) {
		Class328.method27325(arg0);
	}

	@OriginalMember(owner = "client!jx", name = "aer", descriptor = "(Lclient!yf;I)V", line = 10274)
	static final void method28001(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local13 & -1 - (0x1 << local23);
	}

	@OriginalMember(owner = "client!jx", name = "afe", descriptor = "(Lclient!yf;I)V", line = 10497)
	static final void method28002(@OriginalArg(0) Class681 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local13.toLowerCase();
	}

	@OriginalMember(owner = "client!jx", name = "anf", descriptor = "(Lclient!yf;B)V", line = 12192)
	static final void method28005(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.anInt3484 * 1974760385 - client.anInt3576 * 522759457;
	}

	@OriginalMember(owner = "client!jx", name = "axj", descriptor = "(Lclient!yf;I)V", line = 13912)
	static final void method28007(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!jx", name = "ayd", descriptor = "(Lclient!yf;I)V", line = 14036)
	static final void method28003(@OriginalArg(0) Class681 arg0) {
	}
}
