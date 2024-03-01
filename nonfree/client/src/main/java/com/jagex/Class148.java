package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
class Class148 implements Interface51 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!eh", name = "this$0", descriptor = "Lclient!ft;")
	final Class183 this$0;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "(II)V", line = 55)
	static void method23117(@OriginalArg(0) int arg0) {
		Class68.aClass161_10.method23240(arg0);
	}

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "(II)V", line = 128)
	public static void method23120(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(9, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "(IIIILclient!su;Lclient!akj;Lclient!akp;I)V", line = 166)
	public static void method23119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class467 arg4, @OriginalArg(5) Class26_Sub1_Sub1_Sub1_Sub1 arg5, @OriginalArg(6) Class26_Sub1_Sub1_Sub1_Sub2 arg6) {
		@Pc(3) Class3_Sub20 local3 = new Class3_Sub20();
		local3.anInt1273 = arg0 * 763078137;
		local3.anInt1267 = (arg1 << 9) * -735670761;
		local3.anInt1277 = (arg2 << 9) * -422346841;
		if (arg4 != null) {
			local3.aClass467_1 = arg4;
			@Pc(32) int local32 = arg4.anInt5080 * -1872348475;
			@Pc(37) int local37 = arg4.anInt5113 * 1824726069;
			if (arg3 == 1 || arg3 == 3) {
				local32 = arg4.anInt5113 * 1824726069;
				local37 = arg4.anInt5080 * -1872348475;
			}
			local3.anInt1268 = (local32 + arg1 << 9) * -654381141;
			local3.anInt1269 = (arg2 + local37 << 9) * 1507604409;
			local3.anInt1280 = arg4.anInt5105 * 2004054355;
			local3.anInt1271 = (arg4.anInt5106 * 505687689 << 9) * -1052962945;
			local3.anInt1281 = arg4.anInt5108 * -1065560879;
			local3.anInt1282 = arg4.anInt5109 * -123176127;
			local3.anInt1283 = arg4.anInt5091 * 1310331181;
			local3.anIntArray182 = arg4.anIntArray466;
			local3.anInt1279 = arg4.anInt5111 * -1775116361;
			local3.anInt1278 = arg4.anInt5078 * 293404733;
			local3.anInt1270 = (-683858179 * arg4.anInt5107 << 9) * -334779901;
			if (arg4.anIntArray464 != null) {
				local3.aBoolean299 = true;
				local3.method11391();
			}
			if (local3.anIntArray182 != null) {
				local3.anInt1284 = (local3.anInt1282 * 1458644985 + (int) (Math.random() * (double) (local3.anInt1283 * 538321471 - local3.anInt1282 * 1458644985))) * 55542789;
			}
			Class3_Sub20.aClass553_19.method32702(local3);
			Class510.aClass183_1.method23582(local3.anInt1280 * 1695234699);
			Class510.aClass183_1.method23581(local3.anIntArray182);
		} else if (arg5 != null) {
			local3.aClass26_Sub1_Sub1_Sub1_Sub1_1 = arg5;
			@Pc(192) Class571 local192 = arg5.aClass571_1;
			if (local192.anIntArray508 != null) {
				local3.aBoolean299 = true;
				local192 = local192.method33044(Class424.aClass165_1, Class424.aClass165_1);
			}
			if (local192 != null) {
				local3.anInt1268 = (arg1 + local192.anInt5389 * 2130228951 << 9) * -654381141;
				local3.anInt1269 = (local192.anInt5389 * 2130228951 + arg2 << 9) * 1507604409;
				local3.anInt1280 = Class575.method33149(arg5) * -798499549;
				local3.anInt1271 = (-677198669 * local192.anInt5408 << 9) * -1052962945;
				local3.anInt1281 = local192.anInt5391 * 384575587;
				local3.anInt1279 = local192.anInt5416 * 1557710679;
				local3.anInt1278 = local192.anInt5415 * -500099159;
				local3.anInt1270 = (local192.anInt5409 * -1344295181 << 9) * -334779901;
				Class510.aClass183_1.method23582(local192.anInt5390 * -1049731571);
				Class510.aClass183_1.method23582(local192.anInt5397 * -1305326865);
				Class510.aClass183_1.method23582(local192.anInt5407 * -346579751);
				Class510.aClass183_1.method23582(local192.anInt5392 * 1837682201);
			}
			Class3_Sub20.aClass553_18.method32702(local3);
		} else if (arg6 != null) {
			local3.aClass26_Sub1_Sub1_Sub1_Sub2_1 = arg6;
			local3.anInt1268 = (arg1 + arg6.method16630() << 9) * -654381141;
			local3.anInt1269 = (arg2 + arg6.method16630() << 9) * 1507604409;
			local3.anInt1280 = Class512.method29596(arg6) * -798499549;
			local3.anInt1271 = (arg6.anInt2400 * -1667184633 << 9) * -1052962945;
			local3.anInt1281 = arg6.anInt2401 * -935013707;
			local3.anInt1279 = 1911383808;
			local3.anInt1278 = 650401536;
			local3.anInt1270 = 0;
			Class3_Sub20.aClass581_9.method33241(local3, (long) (arg6.anInt2355 * 144783765));
			Class510.aClass183_1.method23582(arg6.anInt2396 * 1181218839);
			Class510.aClass183_1.method23582(arg6.anInt2397 * -836187453);
			Class510.aClass183_1.method23582(arg6.anInt2398 * 2130384603);
			Class510.aClass183_1.method23582(arg6.anInt2399 * -1444661245);
		}
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!ft;)V", line = 586)
	Class148(@OriginalArg(0) Class183 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "(Lclient!tn;IIZ)V", line = 588)
	@Override
	public void method23110(@OriginalArg(0) Interface52 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		this.this$0.method23564().add(arg0);
		if (arg2) {
			this.this$0.method23566().method23222(arg0, (long) arg1);
		} else {
			this.this$0.method23662().method23239(arg0, (long) arg1, arg0.method29118());
		}
	}

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "(Lclient!tn;IIZ)V", line = 588)
	@Override
	public void method23109(@OriginalArg(0) Interface52 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		this.this$0.method23564().add(arg0);
		if (arg2) {
			this.this$0.method23566().method23222(arg0, (long) arg1);
		} else {
			this.this$0.method23662().method23239(arg0, (long) arg1, arg0.method29118());
		}
	}

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "(Lclient!tn;IIZ)V", line = 588)
	@Override
	public void method23111(@OriginalArg(0) Interface52 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		this.this$0.method23564().add(arg0);
		if (arg2) {
			this.this$0.method23566().method23222(arg0, (long) arg1);
		} else {
			this.this$0.method23662().method23239(arg0, (long) arg1, arg0.method29118());
		}
	}

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "(Lclient!tn;IIZ)V", line = 588)
	@Override
	public void method23108(@OriginalArg(0) Interface52 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		this.this$0.method23564().add(arg0);
		if (arg2) {
			this.this$0.method23566().method23222(arg0, (long) arg1);
		} else {
			this.this$0.method23662().method23239(arg0, (long) arg1, arg0.method29118());
		}
	}

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "(Lclient!tn;IIZI)V", line = 588)
	@Override
	public void method23112(@OriginalArg(0) Interface52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.this$0.method23564().add(arg0);
		if (arg3) {
			this.this$0.method23566().method23222(arg0, (long) arg2);
		} else {
			this.this$0.method23662().method23239(arg0, (long) arg2, arg0.method29118());
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!tn;I)V", line = 598)
	@Override
	public void method23107(@OriginalArg(0) Interface52 arg0) {
		if (arg0 != null) {
			this.this$0.method23662().method23219((long) arg0.method29120());
		}
	}

	@OriginalMember(owner = "client!eh", name = "at", descriptor = "(I)V", line = 660)
	public static final void method23113() {
		Class265.aClass47_1.method9221();
		@Pc(4) int local4;
		for (local4 = 0; local4 < 32; local4++) {
			Class390.aLongArray11[local4] = 0L;
		}
		for (local4 = 0; local4 < 32; local4++) {
			Class390.aLongArray12[local4] = 0L;
		}
		Class390.anInt3021 = 0;
	}

	@OriginalMember(owner = "client!eh", name = "am", descriptor = "(Lclient!vs;S)V", line = 4145)
	static final void method23114(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5316 -= 2125691367;
	}

	@OriginalMember(owner = "client!eh", name = "hu", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 5501)
	static final void method23116(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 -= 624249098;
		arg0.anInt3569 = arg2.anIntArray496[arg2.anInt5319 * 960738381] * 19301303;
		arg0.anInt3566 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 1] * -1333251399;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!eh", name = "po", descriptor = "(Lclient!vs;S)V", line = 6795)
	static final void method23118(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class458.method28528(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!eh", name = "akw", descriptor = "(Lclient!vs;I)V", line = 10946)
	static final void method23115(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (Class80.aClass23_Sub1_1.method5887() != Class204.aClass204_3 || Class80.aClass23_Sub1_1.method5830() != Class208.aClass208_3) {
			throw new RuntimeException();
		}
		@Pc(31) Class30_Sub3 local31 = (Class30_Sub3) Class80.aClass23_Sub1_1.method5827();
		@Pc(36) Class69_Sub5 local36 = (Class69_Sub5) Class80.aClass23_Sub1_1.method5799();
		@Pc(40) Class320 local40 = local31.method7841();
		@Pc(43) Class320 local43 = Class320.method25906(local40);
		local43.aFloat260 += local12;
		@Pc(56) Class320 local56 = Class320.method25928(local36.method20203(), local43);
		local56.method25890();
		@Pc(63) float local63 = local31.method7824().method25861();
		Class336.method26371(local36.method20203(), local56, local40, local63, Class525.aClass320Array3);
		if (Class525.aClass320Array3[0] == null) {
			throw new RuntimeException("");
		}
		@Pc(90) Class320 local90;
		if (Class525.aClass320Array3[1] == null) {
			local90 = Class525.aClass320Array3[0];
		} else if (Class320.method25928(local36.method20203(), Class525.aClass320Array3[0]).method25861() < Class320.method25928(local36.method20203(), Class525.aClass320Array3[1]).method25861()) {
			local90 = Class525.aClass320Array3[1];
		} else {
			local90 = Class525.aClass320Array3[0];
		}
		@Pc(131) float local131 = Class456.method28485(local40.aFloat259 - local90.aFloat259, local40.aFloat261 - local90.aFloat261);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) ((double) local131 * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!eh", name = "asv", descriptor = "(Lclient!vs;I)V", line = 12229)
	static final void method23121(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub32_1.method14015();
	}
}
