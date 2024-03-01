package com.jagex;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public class Class516 {

	@OriginalMember(owner = "client!uw", name = "p", descriptor = "J")
	static long aLong283 = 2488218721681104173L;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
	static int anInt5272 = 0;

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "Z")
	static boolean aBoolean819 = true;

	@OriginalMember(owner = "client!uw", name = "l", descriptor = "Lclient!ahf;")
	static final Class56_Sub2 aClass56_Sub2_1 = new Class56_Sub2();

	@OriginalMember(owner = "client!uw", name = "h", descriptor = "Lclient!aha;")
	static final Class56_Sub1 aClass56_Sub1_1 = new Class56_Sub1();

	@OriginalMember(owner = "client!uw", name = "x", descriptor = "Ljava/util/Queue;")
	static Queue aQueue4 = new LinkedList();

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "()V", line = 29)
	Class516() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!uw", name = "u", descriptor = "()V", line = 34)
	public static void method29650() {
		if (Class522.method29819()) {
			Class394.method27447(new Class498());
		}
	}

	@OriginalMember(owner = "client!uw", name = "y", descriptor = "()V", line = 34)
	public static void method29651() {
		if (Class522.method29819()) {
			Class394.method27447(new Class498());
		}
	}

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "()V", line = 34)
	public static void method29653() {
		if (Class522.method29819()) {
			Class394.method27447(new Class498());
		}
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "()V", line = 34)
	public static void method29655() {
		if (Class522.method29819()) {
			Class394.method27447(new Class498());
		}
	}

	@OriginalMember(owner = "client!uw", name = "z", descriptor = "()V", line = 50)
	public static void method29648() {
		Class417.method27820();
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(Lclient!vs;B)V", line = 52)
	static void method29665(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).anInt5252 * -162260681;
	}

	@OriginalMember(owner = "client!uw", name = "n", descriptor = "()V", line = 54)
	public static void method29652() {
		aClass56_Sub2_1.method12583();
		aClass56_Sub1_1.method12583();
		aLong283 = 2488218721681104173L;
		aBoolean819 = true;
	}

	@OriginalMember(owner = "client!uw", name = "j", descriptor = "()V", line = 54)
	public static void method29654() {
		aClass56_Sub2_1.method12583();
		aClass56_Sub1_1.method12583();
		aLong283 = 2488218721681104173L;
		aBoolean819 = true;
	}

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "()V", line = 54)
	public static void method29656() {
		aClass56_Sub2_1.method12583();
		aClass56_Sub1_1.method12583();
		aLong283 = 2488218721681104173L;
		aBoolean819 = true;
	}

	@OriginalMember(owner = "client!uw", name = "r", descriptor = "()V", line = 54)
	public static void method29663() {
		aClass56_Sub2_1.method12583();
		aClass56_Sub1_1.method12583();
		aLong283 = 2488218721681104173L;
		aBoolean819 = true;
	}

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "(Lclient!agg;)V", line = 61)
	public static void method29657(@OriginalArg(0) Class3_Sub22 arg0) {
		if (Class594.method33424(client.anInt3039 * 1115111877)) {
			aClass56_Sub2_1.method12576(arg0);
		} else {
			arg0.method19859();
		}
	}

	@OriginalMember(owner = "client!uw", name = "q", descriptor = "(Lclient!agg;)V", line = 61)
	public static void method29658(@OriginalArg(0) Class3_Sub22 arg0) {
		if (Class594.method33424(client.anInt3039 * 1115111877)) {
			aClass56_Sub2_1.method12576(arg0);
		} else {
			arg0.method19859();
		}
	}

	@OriginalMember(owner = "client!uw", name = "m", descriptor = "()V", line = 69)
	static void method29659() {
		@Pc(2) Queue local2 = aQueue4;
		synchronized (aQueue4) {
			@Pc(9) Point local9;
			if (Class106.aCanvas6.isShowing()) {
				local9 = Class106.aCanvas6.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class3_Sub22_Sub2 local16 = (Class3_Sub22_Sub2) aQueue4.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class106.aCanvas6.isShowing() && Canvas_Sub1.aBoolean481) {
						local16.method19875(local9);
						if (!local16.method19873() && local16.method19854() < Class128.anInt3317 * 2037417253 && local16.method19867() < Class575.anInt5428 * 1261116487 && local16.method19854() >= 0 && local16.method19867() >= 0) {
							@Pc(67) int local67 = local16.method19853();
							if (local16.method19853() == -1) {
								aClass56_Sub1_1.method12576(local16);
							} else if (Class203.method24168(local67)) {
								aClass56_Sub1_1.method11925(local16);
							}
						}
					} else {
						local16.method19859();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "v", descriptor = "()V", line = 69)
	static void method29660() {
		@Pc(2) Queue local2 = aQueue4;
		synchronized (aQueue4) {
			@Pc(9) Point local9;
			if (Class106.aCanvas6.isShowing()) {
				local9 = Class106.aCanvas6.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class3_Sub22_Sub2 local16 = (Class3_Sub22_Sub2) aQueue4.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class106.aCanvas6.isShowing() && Canvas_Sub1.aBoolean481) {
						local16.method19875(local9);
						if (!local16.method19873() && local16.method19854() < Class128.anInt3317 * 2037417253 && local16.method19867() < Class575.anInt5428 * 1261116487 && local16.method19854() >= 0 && local16.method19867() >= 0) {
							@Pc(67) int local67 = local16.method19853();
							if (local16.method19853() == -1) {
								aClass56_Sub1_1.method12576(local16);
							} else if (Class203.method24168(local67)) {
								aClass56_Sub1_1.method11925(local16);
							}
						}
					} else {
						local16.method19859();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "t", descriptor = "()V", line = 69)
	static void method29661() {
		@Pc(2) Queue local2 = aQueue4;
		synchronized (aQueue4) {
			@Pc(9) Point local9;
			if (Class106.aCanvas6.isShowing()) {
				local9 = Class106.aCanvas6.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class3_Sub22_Sub2 local16 = (Class3_Sub22_Sub2) aQueue4.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class106.aCanvas6.isShowing() && Canvas_Sub1.aBoolean481) {
						local16.method19875(local9);
						if (!local16.method19873() && local16.method19854() < Class128.anInt3317 * 2037417253 && local16.method19867() < Class575.anInt5428 * 1261116487 && local16.method19854() >= 0 && local16.method19867() >= 0) {
							@Pc(67) int local67 = local16.method19853();
							if (local16.method19853() == -1) {
								aClass56_Sub1_1.method12576(local16);
							} else if (Class203.method24168(local67)) {
								aClass56_Sub1_1.method11925(local16);
							}
						}
					} else {
						local16.method19859();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "o", descriptor = "()V", line = 97)
	public static void method29649() {
		@Pc(2) Queue local2 = aQueue4;
		synchronized (aQueue4) {
			while (true) {
				@Pc(7) Class3_Sub22_Sub2 local7 = (Class3_Sub22_Sub2) aQueue4.poll();
				if (local7 == null) {
					return;
				}
				local7.method19859();
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "w", descriptor = "()V", line = 97)
	public static void method29662() {
		@Pc(2) Queue local2 = aQueue4;
		synchronized (aQueue4) {
			while (true) {
				@Pc(7) Class3_Sub22_Sub2 local7 = (Class3_Sub22_Sub2) aQueue4.poll();
				if (local7 == null) {
					return;
				}
				local7.method19859();
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "i", descriptor = "()V", line = 107)
	public static void method29664() {
		Class3_Sub35_Sub1.method18867();
		aClass56_Sub2_1.method12564();
		aClass56_Sub1_1.method12564();
		@Pc(17) Class3_Sub23 local17;
		@Pc(26) int local26;
		if (client.anInt3144 * 259780257 > 0) {
			local17 = Class269.method25284(Class311.aClass311_77, client.aClass82_2.aClass577_2);
			local17.aClass3_Sub41_Sub1_1.method20251(client.anInt3144 * 1039121028);
			for (local26 = 0; local26 < client.anInt3144 * 259780257; local26++) {
				@Pc(35) Interface46 local35 = client.anInterface46Array2[local26];
				@Pc(43) long local43 = local35.method11583() - aLong283 * -268653979505785509L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				aLong283 = local35.method11583() * -2488218721681104173L;
				local17.aClass3_Sub41_Sub1_1.method20250(local35.method11582());
				local17.aClass3_Sub41_Sub1_1.method20253((int) local43);
			}
			client.aClass82_2.method21601(local17);
		}
		if (anInt5272 * 175924049 > 0) {
			anInt5272 -= -1779251791;
		}
		if (client.aBoolean586 && anInt5272 * 175924049 <= 0) {
			anInt5272 = -1225297452;
			client.aBoolean586 = false;
			@Pc(112) int local112;
			if (Class72.anInt2086 * 81180077 != 3) {
				local112 = (int) client.aFloat237 >> 3;
				local26 = (int) client.aFloat238 >> 3;
			} else if (Class80.aClass23_Sub1_1.method5887() == Class204.aClass204_3) {
				@Pc(107) Class30_Sub3 local107 = (Class30_Sub3) Class80.aClass23_Sub1_1.method5827();
				local112 = Class185.method23911(local107.aClass335_2);
				local26 = Class360.method26767(local107.aClass335_2);
			} else {
				local112 = 0;
				local26 = 0;
			}
			@Pc(139) Class3_Sub23 local139 = Class269.method25284(Class311.aClass311_71, client.aClass82_2.aClass577_2);
			local139.aClass3_Sub41_Sub1_1.method20312(local26);
			local139.aClass3_Sub41_Sub1_1.method20312(local112);
			client.aClass82_2.method21601(local139);
		}
		if (aBoolean819 != Canvas_Sub1.aBoolean481) {
			aBoolean819 = Canvas_Sub1.aBoolean481;
			local17 = Class269.method25284(Class311.aClass311_3, client.aClass82_2.aClass577_2);
			local17.aClass3_Sub41_Sub1_1.method20250(Canvas_Sub1.aBoolean481 ? 1 : 0);
			client.aClass82_2.method21601(local17);
		}
		if (client.aBoolean573) {
			return;
		}
		local17 = Class269.method25284(Class311.aClass311_31, client.aClass82_2.aClass577_2);
		local17.aClass3_Sub41_Sub1_1.method20250(0);
		local26 = local17.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		@Pc(200) Class3_Sub41 local200 = Class510.aClass3_Sub45_37.method13007();
		local17.aClass3_Sub41_Sub1_1.method20248(local200.aByteArray51, 0, local200.anInt2803 * 62066237);
		local17.aClass3_Sub41_Sub1_1.method20266(local17.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local26);
		client.aClass82_2.method21601(local17);
		client.aBoolean573 = true;
	}

	@OriginalMember(owner = "client!uw", name = "oi", descriptor = "(Lclient!vs;I)V", line = 6709)
	static final void method29666(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class593.method33356(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!uw", name = "ow", descriptor = "(Lclient!vs;B)V", line = 6753)
	static final void method29667(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class530.method32481(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!uw", name = "arc", descriptor = "(Lclient!vs;I)V", line = 12084)
	static final void method29668(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) Class452 local17 = Class107.aClass454_3.method28448(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.anInt5026 * -2127909191;
	}
}
