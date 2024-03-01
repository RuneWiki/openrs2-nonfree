package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public class Class458 implements Interface56 {

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "Lclient!sl;")
	public static final Class458 aClass458_4 = new Class458(0);

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "Lclient!sl;")
	public static final Class458 aClass458_3 = new Class458(1);

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "Lclient!sl;")
	public static final Class458 aClass458_5 = new Class458(2);

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
	final int anInt5065;

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "()[Lclient!sl;", line = 14)
	public static Class458[] method28522() {
		return new Class458[] { aClass458_3, aClass458_5, aClass458_4 };
	}

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "()[Lclient!sl;", line = 14)
	public static Class458[] method28523() {
		return new Class458[] { aClass458_3, aClass458_5, aClass458_4 };
	}

	@OriginalMember(owner = "client!sl", name = "u", descriptor = "()[Lclient!sl;", line = 14)
	public static Class458[] method28524() {
		return new Class458[] { aClass458_3, aClass458_5, aClass458_4 };
	}

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(I)V", line = 17)
	Class458(@OriginalArg(0) int arg0) {
		this.anInt5065 = arg0 * 311620375;
	}

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "()I", line = 22)
	@Override
	public int method33766() {
		return this.anInt5065 * 906720423;
	}

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "()I", line = 22)
	@Override
	public int method33767() {
		return this.anInt5065 * 906720423;
	}

	@OriginalMember(owner = "client!sl", name = "x", descriptor = "()I", line = 22)
	@Override
	public int method33764() {
		return this.anInt5065 * 906720423;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)I", line = 22)
	@Override
	public int method33765() {
		return this.anInt5065 * 906720423;
	}

	@OriginalMember(owner = "client!sl", name = "aw", descriptor = "(IIIB)V", line = 259)
	static void method28530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(9, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
		local4.anInt2695 = arg2 * 378120307;
	}

	@OriginalMember(owner = "client!sl", name = "bt", descriptor = "(IIS)V", line = 311)
	static void method28531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class3_Sub1_Sub11 local3 = Class60_Sub34.method14470(14, 0L);
		local3.method19155();
		local3.anInt2693 = arg0 * 1666161167;
		local3.anInt2695 = arg1 * 378120307;
	}

	@OriginalMember(owner = "client!sl", name = "om", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6788)
	static final void method28528(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray32 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!sl", name = "pm", descriptor = "(Lclient!vs;I)V", line = 6860)
	static final void method28525(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3500 * 610124465;
	}

	@OriginalMember(owner = "client!sl", name = "akf", descriptor = "(Lclient!vs;I)V", line = 10896)
	static final void method28526(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		arg0.anInt5319 -= 1248498196;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(43) int local43 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		@Pc(51) Class320 local51 = Class320.method25891((float) local13, (float) local23, (float) local33);
		if (local51.aFloat259 == -1.0F) {
			local51.aFloat259 = Float.POSITIVE_INFINITY;
		}
		if (local51.aFloat260 == -1.0F) {
			local51.aFloat260 = Float.POSITIVE_INFINITY;
		}
		if (-1.0F == local51.aFloat261) {
			local51.aFloat261 = Float.POSITIVE_INFINITY;
		}
		Class80.aClass23_Sub1_1.method5808(local51);
		Class80.aClass23_Sub1_1.method5805((float) local43 / 1000.0F);
		local51.method25874();
	}

	@OriginalMember(owner = "client!sl", name = "ake", descriptor = "(Lclient!vs;I)V", line = 11076)
	static final void method28527(@OriginalArg(0) Class536 arg0) {
		@Pc(17) boolean local17 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1;
		if (local17) {
			Class375.method27232(3);
		} else {
			Class375.method27232(5);
		}
	}

	@OriginalMember(owner = "client!sl", name = "asz", descriptor = "(Lclient!vs;I)V", line = 12288)
	static final void method28529(@OriginalArg(0) Class536 arg0) {
		@Pc(1) boolean local1 = true;
		if (client.aBoolean565) {
			try {
				@Pc(7) Object local7 = Class300.aClass300_9.method25641();
				if (local7 != null) {
					local1 = (Boolean) local7;
				}
			} catch (@Pc(15) Throwable local15) {
			}
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local1 ? 1 : 0;
	}
}
