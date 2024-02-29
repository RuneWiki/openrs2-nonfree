package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public class Class625 {

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "Lclient!uf;")
	public Interface64 anInterface64_1;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!pw;)V", line = 11)
	public Class625(@OriginalArg(0) Class478 arg0) {
		@Pc(9) byte[] local9 = arg0.method29745(Class614.aClass614_2.anInt5587 * -448671533);
		if (local9 != null) {
			this.method32486(new Class77_Sub39(local9));
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(Lclient!akv;)V", line = 18)
	void method32485(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface64_1 = Class3.method24(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "(Lclient!akv;I)V", line = 18)
	void method32486(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface64_1 = Class3.method24(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "ia", descriptor = "([[I[[IIIIIII)Z", line = 5409)
	static final boolean method32487(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = arg3; local1 <= arg5; local1++) {
			for (@Pc(6) int local6 = arg4; local6 <= arg6; local6++) {
				if (arg2 == arg0[local1][local6] && arg1[local1][local6] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "gw", descriptor = "(Lclient!yf;I)V", line = 5782)
	static final void method32488(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class77_Sub19.method13488(local16, local22, false, 0, arg0);
	}

	@OriginalMember(owner = "client!wo", name = "aek", descriptor = "(Lclient!yf;B)V", line = 9916)
	static final void method32489(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class18 local18 = (Class18) Class537.aClass35_Sub7_1.method18319(local12);
		if (-667959667 * local18.anInt94 == -1 && local18.anInt93 * 344178797 >= 0) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local18.anInt93 * 344178797;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local12;
		}
	}

	@OriginalMember(owner = "client!wo", name = "ayl", descriptor = "(Lclient!yf;I)V", line = 13587)
	static final void method32490(@OriginalArg(0) Class665 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < Class503.aClass126_Sub1Array2.length; local5++) {
			if (Class503.aClass126_Sub1Array2[local5] != null && Class503.aClass126_Sub1Array2[local5].method11614()) {
				local1 += Class503.aClass126_Sub1Array2[local5].method11604();
				local3 += Class503.aClass126_Sub1Array2[local5].method11609();
			}
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local1 == 0 ? 0 : local3 * 100 / local1;
	}
}
