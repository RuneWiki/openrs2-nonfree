package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abq")
public abstract class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!abq", name = "og", descriptor = "I")
	public static int anInt2889;

	@OriginalMember(owner = "client!abq", name = "<init>", descriptor = "()V", line = 4)
	Class19_Sub2() {
	}

	@OriginalMember(owner = "client!abq", name = "ar", descriptor = "(III)V", line = 239)
	static void method21425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(6, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!abq", name = "au", descriptor = "(Lclient!mq;I)V", line = 1126)
	static void method21426(@OriginalArg(0) Class328 arg0) {
		Class250.aClass328_98.method26104(arg0);
	}

	@OriginalMember(owner = "client!abq", name = "hs", descriptor = "(Lclient!act;I)V", line = 3792)
	static final void method21422(@OriginalArg(0) Class26_Sub1_Sub1_Sub1 arg0) {
		@Pc(2) Class71 local2 = arg0.aClass71_3;
		if (arg0.anInt2386 * -557111183 == client.anInt3034 || !local2.method20021() || local2.method20090(1)) {
			@Pc(27) int local27 = arg0.anInt2386 * -557111183 - arg0.anInt2372 * 1696493467;
			@Pc(34) int local34 = client.anInt3034 - arg0.anInt2372 * 1696493467;
			@Pc(45) int local45 = arg0.anInt2368 * -497043968 + arg0.method16630() * 256;
			@Pc(56) int local56 = arg0.anInt2370 * 204784128 + arg0.method16630() * 256;
			@Pc(67) int local67 = arg0.anInt2369 * 873263616 + arg0.method16630() * 256;
			@Pc(78) int local78 = arg0.anInt2380 * 2139980288 + arg0.method16630() * 256;
			@Pc(82) Class320 local82 = arg0.method21431().aClass320_61;
			arg0.method21437((float) ((local34 * local67 + local45 * (local27 - local34)) / local27), (float) local82.aFloat260, (float) ((local78 * local34 + (local27 - local34) * local56) / local27));
		}
		arg0.anInt2384 = 0;
		arg0.method16634(arg0.anInt2373 * -1746471787, false);
	}

	@OriginalMember(owner = "client!abq", name = "hy", descriptor = "(Lclient!act;I)V", line = 4003)
	static final void method21423(@OriginalArg(0) Class26_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anIntArray242 == null && arg0.anIntArray240 == null) {
			return;
		}
		@Pc(10) boolean local10 = true;
		@Pc(14) Class464 local14 = client.aClass370_1.method26942();
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray242.length; local16++) {
			@Pc(23) int local23 = -1;
			if (arg0.anIntArray242 != null) {
				local23 = arg0.anIntArray242[local16];
			}
			if (local23 != -1) {
				local10 = false;
				@Pc(53) Class320 local53 = arg0.method21431().aClass320_61;
				@Pc(85) int local85;
				@Pc(100) int local100;
				@Pc(62) int local62;
				if ((local23 & -1073741824) == -1073741824) {
					local62 = local23 & 0xFFFFFFF;
					@Pc(66) int local66 = local62 >> 14;
					@Pc(70) int local70 = local62 & 0x3FFF;
					local85 = (int) local53.aFloat259 - ((local66 - local14.anInt5071 * -1567811631) * 512 + 256);
					local100 = (int) local53.aFloat261 - ((local70 - local14.anInt5073 * 1360175441) * 512 + 256);
				} else {
					@Pc(121) Class320 local121;
					if ((local23 & 0x8000) == 0) {
						@Pc(152) Class3_Sub29 local152 = (Class3_Sub29) client.aClass581_21.method33217((long) local23);
						if (local152 == null) {
							arg0.method16637(local16, -1);
							continue;
						}
						@Pc(159) Class26_Sub1_Sub1_Sub1_Sub1 local159 = (Class26_Sub1_Sub1_Sub1_Sub1) local152.anObject2;
						local121 = local159.method21431().aClass320_61;
						local85 = (int) local53.aFloat259 - (int) local121.aFloat259;
						local100 = (int) local53.aFloat261 - (int) local121.aFloat261;
					} else {
						local62 = local23 & 0x7FFF;
						@Pc(114) Class26_Sub1_Sub1_Sub1_Sub2 local114 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local62];
						if (local114 == null) {
							arg0.method16637(local16, -1);
							continue;
						}
						local121 = local114.method21431().aClass320_61;
						local85 = (int) local53.aFloat259 - (int) local121.aFloat259;
						local100 = (int) local53.aFloat261 - (int) local121.aFloat261;
					}
				}
				if (local85 != 0 || local100 != 0) {
					arg0.method16637(local16, (int) (Math.atan2((double) local85, (double) local100) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method16637(local16, -1)) {
				local10 = false;
			}
		}
		if (local10) {
			arg0.anIntArray242 = null;
			arg0.anIntArray240 = null;
		}
	}

	@OriginalMember(owner = "client!abq", name = "ie", descriptor = "(IIIII)V", line = 5935)
	static final void method21424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = client.anInt3059 * -2063554533;
		@Pc(7) int local7 = client.anInt3117 * -677873325;
		@Pc(20) Class6 local20;
		if (client.anInt3105 * -963655717 == 1) {
			local20 = Class145.aClass6Array11[client.anInt3104 * -321576297 / 100];
			local20.method16783(local3 - 8, local7 - 8);
		}
		if (client.anInt3105 * -963655717 == 2) {
			local20 = Class145.aClass6Array11[client.anInt3104 * -321576297 / 100 + 4];
			local20.method16783(local3 - 8, local7 - 8);
		}
	}

	@OriginalMember(owner = "client!abq", name = "aba", descriptor = "(Lclient!vs;I)V", line = 9020)
	static final void method21421(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class85.method21638((char) local12) ? 1 : 0;
	}

	@OriginalMember(owner = "client!abq", name = "at", descriptor = "(II)V")
	abstract void method21411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!abq", name = "w", descriptor = "()I")
	public abstract int method21412();

	@OriginalMember(owner = "client!abq", name = "o", descriptor = "(II)I")
	public abstract int method21413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!abq", name = "i", descriptor = "(II)V")
	abstract void method21414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!abq", name = "f", descriptor = "(II)V")
	abstract void method21415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!abq", name = "ah", descriptor = "(II)I")
	public abstract int method21416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!abq", name = "k", descriptor = "(II)V")
	abstract void method21417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!abq", name = "af", descriptor = "()I")
	public abstract int method21418();

	@OriginalMember(owner = "client!abq", name = "ak", descriptor = "()I")
	public abstract int method21419();

	@OriginalMember(owner = "client!abq", name = "aa", descriptor = "(II)I")
	public abstract int method21420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
