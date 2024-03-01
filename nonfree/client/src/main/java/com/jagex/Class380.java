package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ox")
public class Class380 {

	@OriginalMember(owner = "client!ox", name = "p", descriptor = "Lclient!ox;")
	public static final Class380 aClass380_11 = new Class380(false, false);

	@OriginalMember(owner = "client!ox", name = "a", descriptor = "Lclient!ox;")
	public static final Class380 aClass380_4 = new Class380(true, false);

	@OriginalMember(owner = "client!ox", name = "g", descriptor = "Lclient!ox;")
	public static final Class380 aClass380_5 = new Class380(false, false);

	@OriginalMember(owner = "client!ox", name = "l", descriptor = "Lclient!ox;")
	public static final Class380 aClass380_6 = new Class380(true, false);

	@OriginalMember(owner = "client!ox", name = "h", descriptor = "Lclient!ox;")
	static final Class380 aClass380_7 = new Class380(true, false);

	@OriginalMember(owner = "client!ox", name = "x", descriptor = "Lclient!ox;")
	static final Class380 aClass380_10 = new Class380(true, true);

	@OriginalMember(owner = "client!ox", name = "s", descriptor = "Lclient!ox;")
	static final Class380 aClass380_8 = new Class380(true, true);

	@OriginalMember(owner = "client!ox", name = "u", descriptor = "Lclient!ox;")
	public static final Class380 aClass380_9 = new Class380(false, false);

	@OriginalMember(owner = "client!ox", name = "y", descriptor = "Z")
	boolean aBoolean741;

	@OriginalMember(owner = "client!ox", name = "b", descriptor = "Z")
	boolean aBoolean742;

	@OriginalMember(owner = "client!ox", name = "<init>", descriptor = "(ZZ)V", line = 15)
	Class380(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean741 = arg0;
		this.aBoolean742 = arg1;
	}

	@OriginalMember(owner = "client!ox", name = "p", descriptor = "(I)Z", line = 21)
	boolean method27279() {
		return this.aBoolean741;
	}

	@OriginalMember(owner = "client!ox", name = "g", descriptor = "()Z", line = 21)
	boolean method27280() {
		return this.aBoolean741;
	}

	@OriginalMember(owner = "client!ox", name = "l", descriptor = "()Z", line = 25)
	public boolean method27278() {
		return this.aBoolean742;
	}

	@OriginalMember(owner = "client!ox", name = "a", descriptor = "(I)Z", line = 25)
	public boolean method27281() {
		return this.aBoolean742;
	}

	@OriginalMember(owner = "client!ox", name = "h", descriptor = "()Z", line = 25)
	public boolean method27282() {
		return this.aBoolean742;
	}

	@OriginalMember(owner = "client!ox", name = "l", descriptor = "(BB)C", line = 70)
	public static char method27288(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = arg0 & 0xFF;
		if (local3 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(local3, 16));
		}
		if (local3 >= 128 && local3 < 160) {
			@Pc(31) char local31 = Class535.aCharArray5[local3 - 128];
			if (local31 == 0) {
				local31 = '?';
			}
			local3 = local31;
		}
		return (char) local3;
	}

	@OriginalMember(owner = "client!ox", name = "az", descriptor = "(III)V", line = 178)
	public static void method27289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub1_Sub11 local9 = Class60_Sub34.method14470(17, (long) arg1 << 32 | (long) arg0);
		local9.method19145();
	}

	@OriginalMember(owner = "client!ox", name = "t", descriptor = "(IIIB)I", line = 1576)
	static final int method27286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == arg1) {
			return arg0;
		}
		@Pc(8) int local8 = 128 - arg2;
		@Pc(22) int local22 = (arg1 & 0x7F) * arg2 + (arg0 & 0x7F) * local8 >> 7;
		@Pc(36) int local36 = (arg1 & 0x380) * arg2 + (arg0 & 0x380) * local8 >> 7;
		@Pc(50) int local50 = arg2 * (arg1 & 0xFC00) + local8 * (arg0 & 0xFC00) >> 7;
		return local50 & 0xFC00 | local36 & 0x380 | local22 & 0x7F;
	}

	@OriginalMember(owner = "client!ox", name = "by", descriptor = "(ZLclient!vs;I)V", line = 4248)
	static final void method27283(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class536 arg1) {
		@Pc(8) Class534 local8 = arg1.aBoolean822 ? arg1.aClass534_2 : arg1.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		if (arg0) {
			Class379.method27274(local14, local11);
		} else {
			client.method22802(local14, local11);
		}
	}

	@OriginalMember(owner = "client!ox", name = "jn", descriptor = "(Lclient!vs;I)V", line = 5694)
	static final void method27284(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class13_Sub5.method5646(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ox", name = "rs", descriptor = "(Lclient!vs;I)V", line = 7284)
	static final void method27285(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3557 * 1648318741;
	}

	@OriginalMember(owner = "client!ox", name = "afb", descriptor = "(Lclient!vs;I)V", line = 9923)
	static final void method27287(@OriginalArg(0) Class536 arg0) {
		@Pc(13) Class3_Sub1_Sub4 local13 = Class58.method12390(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		if (local13 == null || local13.aString105 == null) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local13.aString105;
		}
	}
}
