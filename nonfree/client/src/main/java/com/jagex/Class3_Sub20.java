package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!age")
public class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!age", name = "t", descriptor = "I")
	static final int anInt1265 = 0;

	@OriginalMember(owner = "client!age", name = "i", descriptor = "I")
	static final int anInt1266 = 3;

	@OriginalMember(owner = "client!age", name = "l", descriptor = "I")
	static final int anInt1272 = 512;

	@OriginalMember(owner = "client!age", name = "w", descriptor = "I")
	static final int anInt1274 = 1;

	@OriginalMember(owner = "client!age", name = "o", descriptor = "I")
	static final int anInt1275 = 2;

	@OriginalMember(owner = "client!age", name = "hc", descriptor = "Lclient!zo;")
	public static Class625 aClass625_1;

	@OriginalMember(owner = "client!age", name = "h", descriptor = "Lclient!wk;")
	static Class553 aClass553_19 = new Class553();

	@OriginalMember(owner = "client!age", name = "s", descriptor = "Lclient!wk;")
	static Class553 aClass553_18 = new Class553();

	@OriginalMember(owner = "client!age", name = "u", descriptor = "Lclient!xn;")
	static Class581 aClass581_9 = new Class581(16);

	@OriginalMember(owner = "client!age", name = "v", descriptor = "Lclient!akp;")
	Class26_Sub1_Sub1_Sub1_Sub2 aClass26_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!age", name = "m", descriptor = "Lclient!akj;")
	Class26_Sub1_Sub1_Sub1_Sub1 aClass26_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!age", name = "b", descriptor = "I")
	int anInt1267;

	@OriginalMember(owner = "client!age", name = "aa", descriptor = "Lclient!oh;")
	Class366 aClass366_3;

	@OriginalMember(owner = "client!age", name = "c", descriptor = "I")
	int anInt1268;

	@OriginalMember(owner = "client!age", name = "z", descriptor = "I")
	int anInt1269;

	@OriginalMember(owner = "client!age", name = "e", descriptor = "I")
	int anInt1270;

	@OriginalMember(owner = "client!age", name = "r", descriptor = "I")
	int anInt1271;

	@OriginalMember(owner = "client!age", name = "q", descriptor = "Lclient!su;")
	Class467 aClass467_1;

	@OriginalMember(owner = "client!age", name = "y", descriptor = "I")
	int anInt1273;

	@OriginalMember(owner = "client!age", name = "k", descriptor = "Z")
	boolean aBoolean299;

	@OriginalMember(owner = "client!age", name = "x", descriptor = "I")
	int anInt1277;

	@OriginalMember(owner = "client!age", name = "at", descriptor = "I")
	int anInt1278;

	@OriginalMember(owner = "client!age", name = "af", descriptor = "I")
	int anInt1279;

	@OriginalMember(owner = "client!age", name = "ak", descriptor = "I")
	int anInt1280;

	@OriginalMember(owner = "client!age", name = "d", descriptor = "I")
	int anInt1281;

	@OriginalMember(owner = "client!age", name = "ah", descriptor = "Lclient!oh;")
	Class366 aClass366_4;

	@OriginalMember(owner = "client!age", name = "an", descriptor = "I")
	int anInt1282;

	@OriginalMember(owner = "client!age", name = "aj", descriptor = "I")
	int anInt1283;

	@OriginalMember(owner = "client!age", name = "as", descriptor = "[I")
	int[] anIntArray182;

	@OriginalMember(owner = "client!age", name = "ai", descriptor = "I")
	int anInt1284;

	@OriginalMember(owner = "client!age", name = "j", descriptor = "Lclient!mh;")
	Class320 aClass320_47 = new Class320(0.0F, 0.0F, 0.0F);

	@OriginalMember(owner = "client!age", name = "n", descriptor = "Lclient!mh;")
	Class320 aClass320_46 = new Class320(0.0F, 0.0F, 0.0F);

	@OriginalMember(owner = "client!age", name = "f", descriptor = "I")
	int anInt1276 = 0;

	@OriginalMember(owner = "client!age", name = "<init>", descriptor = "()V", line = 53)
	Class3_Sub20() {
	}

	@OriginalMember(owner = "client!age", name = "n", descriptor = "(Z)V", line = 56)
	public static void method11393(@OriginalArg(0) boolean arg0) {
		@Pc(4) Class3_Sub20 local4;
		for (local4 = (Class3_Sub20) aClass553_19.method32768(); local4 != null; local4 = (Class3_Sub20) aClass553_19.method32709()) {
			if (local4.aClass366_3 != null) {
				local4.aClass366_3.method26819(150);
				Class510.aClass183_1.method23684(local4.aClass366_3);
				local4.aClass366_3 = null;
			}
			if (local4.aClass366_4 != null) {
				local4.aClass366_4.method26819(150);
				Class510.aClass183_1.method23684(local4.aClass366_4);
				local4.aClass366_4 = null;
			}
			local4.method33656();
		}
		if (!arg0) {
			return;
		}
		for (local4 = (Class3_Sub20) aClass553_18.method32768(); local4 != null; local4 = (Class3_Sub20) aClass553_18.method32709()) {
			if (local4.aClass366_3 != null) {
				local4.aClass366_3.method26819(150);
				Class510.aClass183_1.method23684(local4.aClass366_3);
				local4.aClass366_3 = null;
			}
			local4.method33656();
		}
		for (local4 = (Class3_Sub20) aClass581_9.method33221(); local4 != null; local4 = (Class3_Sub20) aClass581_9.method33231()) {
			if (local4.aClass366_3 != null) {
				local4.aClass366_3.method26819(150);
				Class510.aClass183_1.method23684(local4.aClass366_3);
				local4.aClass366_3 = null;
			}
			local4.method33656();
		}
	}

	@OriginalMember(owner = "client!age", name = "j", descriptor = "(Z)V", line = 56)
	public static void method11405(@OriginalArg(0) boolean arg0) {
		@Pc(4) Class3_Sub20 local4;
		for (local4 = (Class3_Sub20) aClass553_19.method32768(); local4 != null; local4 = (Class3_Sub20) aClass553_19.method32709()) {
			if (local4.aClass366_3 != null) {
				local4.aClass366_3.method26819(150);
				Class510.aClass183_1.method23684(local4.aClass366_3);
				local4.aClass366_3 = null;
			}
			if (local4.aClass366_4 != null) {
				local4.aClass366_4.method26819(150);
				Class510.aClass183_1.method23684(local4.aClass366_4);
				local4.aClass366_4 = null;
			}
			local4.method33656();
		}
		if (!arg0) {
			return;
		}
		for (local4 = (Class3_Sub20) aClass553_18.method32768(); local4 != null; local4 = (Class3_Sub20) aClass553_18.method32709()) {
			if (local4.aClass366_3 != null) {
				local4.aClass366_3.method26819(150);
				Class510.aClass183_1.method23684(local4.aClass366_3);
				local4.aClass366_3 = null;
			}
			local4.method33656();
		}
		for (local4 = (Class3_Sub20) aClass581_9.method33221(); local4 != null; local4 = (Class3_Sub20) aClass581_9.method33231()) {
			if (local4.aClass366_3 != null) {
				local4.aClass366_3.method26819(150);
				Class510.aClass183_1.method23684(local4.aClass366_3);
				local4.aClass366_3 = null;
			}
			local4.method33656();
		}
	}

	@OriginalMember(owner = "client!age", name = "i", descriptor = "()V", line = 90)
	public static void method11394() {
		@Pc(4) Class3_Sub20 local4;
		for (local4 = (Class3_Sub20) aClass553_19.method32768(); local4 != null; local4 = (Class3_Sub20) aClass553_19.method32709()) {
			if (local4.aBoolean299) {
				local4.method11391();
			}
		}
		for (local4 = (Class3_Sub20) aClass553_18.method32768(); local4 != null; local4 = (Class3_Sub20) aClass553_18.method32709()) {
			if (local4.aBoolean299) {
				local4.method11391();
			}
		}
	}

	@OriginalMember(owner = "client!age", name = "k", descriptor = "()V", line = 90)
	public static void method11396() {
		@Pc(4) Class3_Sub20 local4;
		for (local4 = (Class3_Sub20) aClass553_19.method32768(); local4 != null; local4 = (Class3_Sub20) aClass553_19.method32709()) {
			if (local4.aBoolean299) {
				local4.method11391();
			}
		}
		for (local4 = (Class3_Sub20) aClass553_18.method32768(); local4 != null; local4 = (Class3_Sub20) aClass553_18.method32709()) {
			if (local4.aBoolean299) {
				local4.method11391();
			}
		}
	}

	@OriginalMember(owner = "client!age", name = "f", descriptor = "()V", line = 90)
	public static void method11398() {
		@Pc(4) Class3_Sub20 local4;
		for (local4 = (Class3_Sub20) aClass553_19.method32768(); local4 != null; local4 = (Class3_Sub20) aClass553_19.method32709()) {
			if (local4.aBoolean299) {
				local4.method11391();
			}
		}
		for (local4 = (Class3_Sub20) aClass553_18.method32768(); local4 != null; local4 = (Class3_Sub20) aClass553_18.method32709()) {
			if (local4.aBoolean299) {
				local4.method11391();
			}
		}
	}

	@OriginalMember(owner = "client!age", name = "g", descriptor = "(I)V", line = 99)
	void method11391() {
		@Pc(4) int local4 = this.anInt1280 * 1695234699;
		if (this.aClass467_1 != null) {
			@Pc(22) Class467 local22 = this.aClass467_1.method28716(Class424.aClass165_1, client.anInt3065 * -1773414811 == 2 ? Class131.anInterface8_3 : Class424.aClass165_1);
			if (local22 == null) {
				this.anInt1280 = 798499549;
				this.anInt1271 = 0;
				this.anInt1281 = 0;
				this.anInt1282 = 0;
				this.anInt1283 = 0;
				this.anIntArray182 = null;
				this.anInt1279 = 1911383808;
				this.anInt1278 = 650401536;
				this.anInt1270 = 0;
			} else {
				this.anInt1280 = local22.anInt5105 * 2004054355;
				this.anInt1271 = (local22.anInt5106 * 505687689 << 9) * -1052962945;
				this.anInt1281 = local22.anInt5108 * -1065560879;
				this.anInt1282 = local22.anInt5109 * -123176127;
				this.anInt1283 = local22.anInt5091 * 1310331181;
				this.anIntArray182 = local22.anIntArray466;
				this.anInt1279 = local22.anInt5111 * -1775116361;
				this.anInt1278 = local22.anInt5078 * 293404733;
			}
		} else if (this.aClass26_Sub1_Sub1_Sub1_Sub1_1 != null) {
			@Pc(113) int local113 = Class575.method33149(this.aClass26_Sub1_Sub1_Sub1_Sub1_1);
			if (local4 != local113) {
				this.anInt1280 = local113 * -798499549;
				@Pc(125) Class571 local125 = this.aClass26_Sub1_Sub1_Sub1_Sub1_1.aClass571_1;
				if (local125.anIntArray508 != null) {
					local125 = local125.method33044(Class424.aClass165_1, Class424.aClass165_1);
				}
				if (local125 == null) {
					this.anInt1270 = 0;
					this.anInt1271 = 0;
					this.anInt1281 = 0;
					this.anInt1279 = 1911383808;
					this.anInt1278 = 650401536;
				} else {
					this.anInt1271 = (local125.anInt5408 * -677198669 << 9) * -1052962945;
					this.anInt1270 = (local125.anInt5409 * -1344295181 << 9) * -334779901;
					this.anInt1281 = local125.anInt5391 * 384575587;
					this.anInt1279 = local125.anInt5416 * 1557710679;
					this.anInt1278 = local125.anInt5415 * -500099159;
				}
			}
		} else if (this.aClass26_Sub1_Sub1_Sub1_Sub2_1 != null) {
			this.anInt1280 = Class512.method29596(this.aClass26_Sub1_Sub1_Sub1_Sub2_1) * -798499549;
			this.anInt1271 = (this.aClass26_Sub1_Sub1_Sub1_Sub2_1.anInt2400 * -1667184633 << 9) * -1052962945;
			this.anInt1270 = 0;
			this.anInt1281 = this.aClass26_Sub1_Sub1_Sub1_Sub2_1.anInt2401 * -935013707;
			this.anInt1279 = 1911383808;
			this.anInt1278 = 650401536;
		}
		if (this.anInt1280 * 1695234699 != local4 && this.aClass366_3 != null && this.aClass366_3 != null) {
			this.aClass366_3.method26819(100);
			Class510.aClass183_1.method23684(this.aClass366_3);
			this.aClass366_3 = null;
		}
	}

	@OriginalMember(owner = "client!age", name = "at", descriptor = "()V", line = 99)
	void method11392() {
		@Pc(4) int local4 = this.anInt1280 * 1695234699;
		if (this.aClass467_1 != null) {
			@Pc(22) Class467 local22 = this.aClass467_1.method28716(Class424.aClass165_1, client.anInt3065 * -1773414811 == 2 ? Class131.anInterface8_3 : Class424.aClass165_1);
			if (local22 == null) {
				this.anInt1280 = 798499549;
				this.anInt1271 = 0;
				this.anInt1281 = 0;
				this.anInt1282 = 0;
				this.anInt1283 = 0;
				this.anIntArray182 = null;
				this.anInt1279 = 1911383808;
				this.anInt1278 = 650401536;
				this.anInt1270 = 0;
			} else {
				this.anInt1280 = local22.anInt5105 * 2004054355;
				this.anInt1271 = (local22.anInt5106 * 505687689 << 9) * -1052962945;
				this.anInt1281 = local22.anInt5108 * -1065560879;
				this.anInt1282 = local22.anInt5109 * -123176127;
				this.anInt1283 = local22.anInt5091 * 1310331181;
				this.anIntArray182 = local22.anIntArray466;
				this.anInt1279 = local22.anInt5111 * -1775116361;
				this.anInt1278 = local22.anInt5078 * 293404733;
			}
		} else if (this.aClass26_Sub1_Sub1_Sub1_Sub1_1 != null) {
			@Pc(113) int local113 = Class575.method33149(this.aClass26_Sub1_Sub1_Sub1_Sub1_1);
			if (local4 != local113) {
				this.anInt1280 = local113 * -798499549;
				@Pc(125) Class571 local125 = this.aClass26_Sub1_Sub1_Sub1_Sub1_1.aClass571_1;
				if (local125.anIntArray508 != null) {
					local125 = local125.method33044(Class424.aClass165_1, Class424.aClass165_1);
				}
				if (local125 == null) {
					this.anInt1270 = 0;
					this.anInt1271 = 0;
					this.anInt1281 = 0;
					this.anInt1279 = 1911383808;
					this.anInt1278 = 650401536;
				} else {
					this.anInt1271 = (local125.anInt5408 * -677198669 << 9) * -1052962945;
					this.anInt1270 = (local125.anInt5409 * -1344295181 << 9) * -334779901;
					this.anInt1281 = local125.anInt5391 * 384575587;
					this.anInt1279 = local125.anInt5416 * 1557710679;
					this.anInt1278 = local125.anInt5415 * -500099159;
				}
			}
		} else if (this.aClass26_Sub1_Sub1_Sub1_Sub2_1 != null) {
			this.anInt1280 = Class512.method29596(this.aClass26_Sub1_Sub1_Sub1_Sub2_1) * -798499549;
			this.anInt1271 = (this.aClass26_Sub1_Sub1_Sub1_Sub2_1.anInt2400 * -1667184633 << 9) * -1052962945;
			this.anInt1270 = 0;
			this.anInt1281 = this.aClass26_Sub1_Sub1_Sub1_Sub2_1.anInt2401 * -935013707;
			this.anInt1279 = 1911383808;
			this.anInt1278 = 650401536;
		}
		if (this.anInt1280 * 1695234699 != local4 && this.aClass366_3 != null && this.aClass366_3 != null) {
			this.aClass366_3.method26819(100);
			Class510.aClass183_1.method23684(this.aClass366_3);
			this.aClass366_3 = null;
		}
	}

	@OriginalMember(owner = "client!age", name = "af", descriptor = "()V", line = 99)
	void method11403() {
		@Pc(4) int local4 = this.anInt1280 * 1695234699;
		if (this.aClass467_1 != null) {
			@Pc(22) Class467 local22 = this.aClass467_1.method28716(Class424.aClass165_1, client.anInt3065 * -1773414811 == 2 ? Class131.anInterface8_3 : Class424.aClass165_1);
			if (local22 == null) {
				this.anInt1280 = 798499549;
				this.anInt1271 = 0;
				this.anInt1281 = 0;
				this.anInt1282 = 0;
				this.anInt1283 = 0;
				this.anIntArray182 = null;
				this.anInt1279 = 1911383808;
				this.anInt1278 = 650401536;
				this.anInt1270 = 0;
			} else {
				this.anInt1280 = local22.anInt5105 * 2004054355;
				this.anInt1271 = (local22.anInt5106 * 505687689 << 9) * -1052962945;
				this.anInt1281 = local22.anInt5108 * -1065560879;
				this.anInt1282 = local22.anInt5109 * -123176127;
				this.anInt1283 = local22.anInt5091 * 1310331181;
				this.anIntArray182 = local22.anIntArray466;
				this.anInt1279 = local22.anInt5111 * -1775116361;
				this.anInt1278 = local22.anInt5078 * 293404733;
			}
		} else if (this.aClass26_Sub1_Sub1_Sub1_Sub1_1 != null) {
			@Pc(113) int local113 = Class575.method33149(this.aClass26_Sub1_Sub1_Sub1_Sub1_1);
			if (local4 != local113) {
				this.anInt1280 = local113 * -798499549;
				@Pc(125) Class571 local125 = this.aClass26_Sub1_Sub1_Sub1_Sub1_1.aClass571_1;
				if (local125.anIntArray508 != null) {
					local125 = local125.method33044(Class424.aClass165_1, Class424.aClass165_1);
				}
				if (local125 == null) {
					this.anInt1270 = 0;
					this.anInt1271 = 0;
					this.anInt1281 = 0;
					this.anInt1279 = 1911383808;
					this.anInt1278 = 650401536;
				} else {
					this.anInt1271 = (local125.anInt5408 * -677198669 << 9) * -1052962945;
					this.anInt1270 = (local125.anInt5409 * -1344295181 << 9) * -334779901;
					this.anInt1281 = local125.anInt5391 * 384575587;
					this.anInt1279 = local125.anInt5416 * 1557710679;
					this.anInt1278 = local125.anInt5415 * -500099159;
				}
			}
		} else if (this.aClass26_Sub1_Sub1_Sub1_Sub2_1 != null) {
			this.anInt1280 = Class512.method29596(this.aClass26_Sub1_Sub1_Sub1_Sub2_1) * -798499549;
			this.anInt1271 = (this.aClass26_Sub1_Sub1_Sub1_Sub2_1.anInt2400 * -1667184633 << 9) * -1052962945;
			this.anInt1270 = 0;
			this.anInt1281 = this.aClass26_Sub1_Sub1_Sub1_Sub2_1.anInt2401 * -935013707;
			this.anInt1279 = 1911383808;
			this.anInt1278 = 650401536;
		}
		if (this.anInt1280 * 1695234699 != local4 && this.aClass366_3 != null && this.aClass366_3 != null) {
			this.aClass366_3.method26819(100);
			Class510.aClass183_1.method23684(this.aClass366_3);
			this.aClass366_3 = null;
		}
	}

	@OriginalMember(owner = "client!age", name = "aa", descriptor = "(Lclient!akj;)V", line = 254)
	public static void method11397(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(4) Class3_Sub20 local4 = (Class3_Sub20) aClass553_18.method32768(); local4 != null; local4 = (Class3_Sub20) aClass553_18.method32709()) {
			if (arg0 == local4.aClass26_Sub1_Sub1_Sub1_Sub1_1) {
				if (local4.aClass366_3 != null) {
					local4.aClass366_3.method26819(100);
					Class510.aClass183_1.method23684(local4.aClass366_3);
					local4.aClass366_3 = null;
				}
				local4.method33656();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!age", name = "ak", descriptor = "(Lclient!akj;)V", line = 254)
	public static void method11411(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(4) Class3_Sub20 local4 = (Class3_Sub20) aClass553_18.method32768(); local4 != null; local4 = (Class3_Sub20) aClass553_18.method32709()) {
			if (arg0 == local4.aClass26_Sub1_Sub1_Sub1_Sub1_1) {
				if (local4.aClass366_3 != null) {
					local4.aClass366_3.method26819(100);
					Class510.aClass183_1.method23684(local4.aClass366_3);
					local4.aClass366_3 = null;
				}
				local4.method33656();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!age", name = "an", descriptor = "(Lclient!akp;)V", line = 268)
	public static void method11395(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class3_Sub20 local8 = (Class3_Sub20) aClass581_9.method33217((long) (arg0.anInt2355 * 144783765));
		if (local8 == null) {
			return;
		}
		if (local8.aClass366_3 != null) {
			local8.aClass366_3.method26819(100);
			Class510.aClass183_1.method23684(local8.aClass366_3);
			local8.aClass366_3 = null;
		}
		local8.method33656();
	}

	@OriginalMember(owner = "client!age", name = "ah", descriptor = "(Lclient!akp;)V", line = 268)
	public static void method11401(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class3_Sub20 local8 = (Class3_Sub20) aClass581_9.method33217((long) (arg0.anInt2355 * 144783765));
		if (local8 == null) {
			return;
		}
		if (local8.aClass366_3 != null) {
			local8.aClass366_3.method26819(100);
			Class510.aClass183_1.method23684(local8.aClass366_3);
			local8.aClass366_3 = null;
		}
		local8.method33656();
	}

	@OriginalMember(owner = "client!age", name = "aj", descriptor = "(Lclient!akp;)V", line = 280)
	public static void method11399(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class3_Sub20 local8 = (Class3_Sub20) aClass581_9.method33217((long) (arg0.anInt2355 * 144783765));
		if (local8 == null) {
			Class148.method23119(arg0.aByte101, arg0.anIntArray241[0], arg0.anIntArray239[0], 0, null, null, arg0);
		} else {
			local8.method11391();
		}
	}

	@OriginalMember(owner = "client!age", name = "ai", descriptor = "(Lclient!akj;)I", line = 286)
	static int method11402(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub1 arg0) {
		@Pc(2) Class571 local2 = arg0.aClass571_1;
		if (local2.anIntArray508 != null) {
			local2 = local2.method33044(Class424.aClass165_1, Class424.aClass165_1);
			if (local2 == null) {
				return -1;
			}
		}
		@Pc(21) int local21 = local2.anInt5407 * -346579751;
		@Pc(25) Class445 local25 = arg0.method16690();
		@Pc(30) int local30 = arg0.aClass71_Sub1_3.method20103();
		if (local30 == -1 || arg0.aClass71_Sub1_3.aBoolean351) {
			local21 = local2.anInt5390 * -1049731571;
		} else if (local30 == local25.anInt4992 * -1713051549 || local25.anInt4997 * 1647125495 == local30 || local25.anInt4979 * -1610219699 == local30 || local30 == local25.anInt4974 * -1291917697) {
			local21 = local2.anInt5392 * 1837682201;
		} else if (local25.anInt4967 * 1572273339 == local30 || local30 == local25.anInt4987 * -1259453855 || local25.anInt4983 * 1145375145 == local30 || local25.anInt4982 * -1520360879 == local30) {
			local21 = local2.anInt5397 * -1305326865;
		}
		return local21;
	}

	@OriginalMember(owner = "client!age", name = "as", descriptor = "(Lclient!akj;)I", line = 286)
	static int method11404(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub1 arg0) {
		@Pc(2) Class571 local2 = arg0.aClass571_1;
		if (local2.anIntArray508 != null) {
			local2 = local2.method33044(Class424.aClass165_1, Class424.aClass165_1);
			if (local2 == null) {
				return -1;
			}
		}
		@Pc(21) int local21 = local2.anInt5407 * -346579751;
		@Pc(25) Class445 local25 = arg0.method16690();
		@Pc(30) int local30 = arg0.aClass71_Sub1_3.method20103();
		if (local30 == -1 || arg0.aClass71_Sub1_3.aBoolean351) {
			local21 = local2.anInt5390 * -1049731571;
		} else if (local30 == local25.anInt4992 * -1713051549 || local25.anInt4997 * 1647125495 == local30 || local25.anInt4979 * -1610219699 == local30 || local30 == local25.anInt4974 * -1291917697) {
			local21 = local2.anInt5392 * 1837682201;
		} else if (local25.anInt4967 * 1572273339 == local30 || local30 == local25.anInt4987 * -1259453855 || local25.anInt4983 * 1145375145 == local30 || local25.anInt4982 * -1520360879 == local30) {
			local21 = local2.anInt5397 * -1305326865;
		}
		return local21;
	}

	@OriginalMember(owner = "client!age", name = "aq", descriptor = "(Lclient!akj;)I", line = 286)
	static int method11406(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub1 arg0) {
		@Pc(2) Class571 local2 = arg0.aClass571_1;
		if (local2.anIntArray508 != null) {
			local2 = local2.method33044(Class424.aClass165_1, Class424.aClass165_1);
			if (local2 == null) {
				return -1;
			}
		}
		@Pc(21) int local21 = local2.anInt5407 * -346579751;
		@Pc(25) Class445 local25 = arg0.method16690();
		@Pc(30) int local30 = arg0.aClass71_Sub1_3.method20103();
		if (local30 == -1 || arg0.aClass71_Sub1_3.aBoolean351) {
			local21 = local2.anInt5390 * -1049731571;
		} else if (local30 == local25.anInt4992 * -1713051549 || local25.anInt4997 * 1647125495 == local30 || local25.anInt4979 * -1610219699 == local30 || local30 == local25.anInt4974 * -1291917697) {
			local21 = local2.anInt5392 * 1837682201;
		} else if (local25.anInt4967 * 1572273339 == local30 || local30 == local25.anInt4987 * -1259453855 || local25.anInt4983 * 1145375145 == local30 || local25.anInt4982 * -1520360879 == local30) {
			local21 = local2.anInt5397 * -1305326865;
		}
		return local21;
	}

	@OriginalMember(owner = "client!age", name = "av", descriptor = "(Lclient!akp;)I", line = 301)
	static int method11407(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(4) int local4 = arg0.anInt2398 * 2130384603;
		@Pc(8) Class445 local8 = arg0.method16690();
		@Pc(13) int local13 = arg0.aClass71_Sub1_3.method20103();
		if (local13 == -1 || arg0.aClass71_Sub1_3.aBoolean351) {
			local4 = arg0.anInt2396 * 1181218839;
		} else if (local8.anInt4992 * -1713051549 == local13 || local8.anInt4997 * 1647125495 == local13 || local13 == local8.anInt4979 * -1610219699 || local8.anInt4974 * -1291917697 == local13) {
			local4 = arg0.anInt2399 * -1444661245;
		} else if (local8.anInt4967 * 1572273339 == local13 || local13 == local8.anInt4987 * -1259453855 || local13 == local8.anInt4983 * 1145375145 || local13 == local8.anInt4982 * -1520360879) {
			local4 = arg0.anInt2397 * -836187453;
		}
		return local4;
	}

	@OriginalMember(owner = "client!age", name = "ax", descriptor = "(Lclient!akp;)I", line = 301)
	static int method11408(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(4) int local4 = arg0.anInt2398 * 2130384603;
		@Pc(8) Class445 local8 = arg0.method16690();
		@Pc(13) int local13 = arg0.aClass71_Sub1_3.method20103();
		if (local13 == -1 || arg0.aClass71_Sub1_3.aBoolean351) {
			local4 = arg0.anInt2396 * 1181218839;
		} else if (local8.anInt4992 * -1713051549 == local13 || local8.anInt4997 * 1647125495 == local13 || local13 == local8.anInt4979 * -1610219699 || local8.anInt4974 * -1291917697 == local13) {
			local4 = arg0.anInt2399 * -1444661245;
		} else if (local8.anInt4967 * 1572273339 == local13 || local13 == local8.anInt4987 * -1259453855 || local13 == local8.anInt4983 * 1145375145 || local13 == local8.anInt4982 * -1520360879) {
			local4 = arg0.anInt2397 * -836187453;
		}
		return local4;
	}

	@OriginalMember(owner = "client!age", name = "az", descriptor = "(IIII)V", line = 311)
	public static void method11390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class3_Sub20 local4;
		for (local4 = (Class3_Sub20) aClass553_19.method32768(); local4 != null; local4 = (Class3_Sub20) aClass553_19.method32709()) {
			Class535.method32538(local4, arg0, arg1, arg2, arg3);
		}
		@Pc(29) byte local29;
		@Pc(34) Class445 local34;
		@Pc(40) int local40;
		@Pc(115) int local115;
		@Pc(219) Class320 local219;
		for (local4 = (Class3_Sub20) aClass553_18.method32768(); local4 != null; local4 = (Class3_Sub20) aClass553_18.method32709()) {
			local29 = 1;
			local34 = local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.method16690();
			local40 = local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.aClass71_Sub1_3.method20103();
			if (local40 == -1 || local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.aClass71_Sub1_3.aBoolean351) {
				local29 = 0;
			} else if (local34.anInt4992 * -1713051549 == local40 || local34.anInt4997 * 1647125495 == local40 || local34.anInt4979 * -1610219699 == local40 || local34.anInt4974 * -1291917697 == local40) {
				local29 = 2;
			} else if (local40 == local34.anInt4967 * 1572273339 || local40 == local34.anInt4987 * -1259453855 || local34.anInt4983 * 1145375145 == local40 || local40 == local34.anInt4982 * -1520360879) {
				local29 = 3;
			}
			if (local4.anInt1276 * -2021885853 != local29) {
				local115 = Class575.method33149(local4.aClass26_Sub1_Sub1_Sub1_Sub1_1);
				@Pc(119) Class571 local119 = local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.aClass571_1;
				if (local119.anIntArray508 != null) {
					local119 = local119.method33044(Class424.aClass165_1, Class424.aClass165_1);
				}
				if (local119 == null || local115 == -1) {
					local4.anInt1280 = 798499549;
					local4.anInt1276 = local29 * -1209939637;
				} else if (local115 == local4.anInt1280 * 1695234699) {
					local4.anInt1276 = local29 * -1209939637;
					local4.anInt1281 = local119.anInt5391 * 384575587;
				} else {
					@Pc(151) boolean local151 = false;
					if (local4.aClass366_3 == null) {
						local151 = true;
					} else {
						local4.anInt1281 -= -1639808512;
						if (local4.anInt1281 * 319712961 <= 0) {
							local4.aClass366_3.method26819(100);
							Class510.aClass183_1.method23684(local4.aClass366_3);
							local4.aClass366_3 = null;
							local151 = true;
						}
					}
					if (local151) {
						local4.anInt1281 = local119.anInt5391 * 384575587;
						local4.anInt1280 = local115 * -798499549;
						local4.anInt1276 = local29 * -1209939637;
					}
				}
			}
			local219 = local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.method21431().aClass320_61;
			local4.anInt1267 = (int) local219.aFloat259 * -735670761;
			local4.anInt1268 = ((int) local219.aFloat259 + (local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.method16630() << 8)) * -654381141;
			local4.anInt1277 = (int) local219.aFloat261 * -422346841;
			local4.anInt1269 = ((int) local219.aFloat261 + (local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.method16630() << 8)) * 1507604409;
			local4.anInt1273 = local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.aByte101 * 763078137;
			Class535.method32538(local4, arg0, arg1, arg2, arg3);
		}
		for (local4 = (Class3_Sub20) aClass581_9.method33221(); local4 != null; local4 = (Class3_Sub20) aClass581_9.method33231()) {
			local29 = 1;
			local34 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.method16690();
			local40 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.aClass71_Sub1_3.method20103();
			if (local40 == -1 || local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.aClass71_Sub1_3.aBoolean351) {
				local29 = 0;
			} else if (local40 == local34.anInt4992 * -1713051549 || local34.anInt4997 * 1647125495 == local40 || local34.anInt4979 * -1610219699 == local40 || local40 == local34.anInt4974 * -1291917697) {
				local29 = 2;
			} else if (local40 == local34.anInt4967 * 1572273339 || local40 == local34.anInt4987 * -1259453855 || local40 == local34.anInt4983 * 1145375145 || local40 == local34.anInt4982 * -1520360879) {
				local29 = 3;
			}
			if (local29 != local4.anInt1276 * -2021885853) {
				local115 = Class512.method29596(local4.aClass26_Sub1_Sub1_Sub1_Sub2_1);
				if (local4.anInt1280 * 1695234699 == local115) {
					local4.anInt1281 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.anInt2401 * -935013707;
					local4.anInt1276 = local29 * -1209939637;
				} else {
					@Pc(384) boolean local384 = false;
					if (local4.aClass366_3 == null) {
						local384 = true;
					} else {
						local4.anInt1281 -= -1639808512;
						if (local4.anInt1281 * 319712961 <= 0) {
							local4.aClass366_3.method26819(100);
							Class510.aClass183_1.method23684(local4.aClass366_3);
							local4.aClass366_3 = null;
							local384 = true;
						}
					}
					if (local384) {
						local4.anInt1281 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.anInt2401 * -935013707;
						local4.anInt1280 = local115 * -798499549;
						local4.anInt1276 = local29 * -1209939637;
					}
				}
			}
			local219 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.method21431().aClass320_61;
			local4.anInt1267 = (int) local219.aFloat259 * -735670761;
			local4.anInt1268 = ((int) local219.aFloat259 + (local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.method16630() << 8)) * -654381141;
			local4.anInt1277 = (int) local219.aFloat261 * -422346841;
			local4.anInt1269 = ((int) local219.aFloat261 + (local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.method16630() << 8)) * 1507604409;
			local4.anInt1273 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.aByte101 * 763078137;
			Class535.method32538(local4, arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!age", name = "al", descriptor = "(IIII)V", line = 311)
	public static void method11409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class3_Sub20 local4;
		for (local4 = (Class3_Sub20) aClass553_19.method32768(); local4 != null; local4 = (Class3_Sub20) aClass553_19.method32709()) {
			Class535.method32538(local4, arg0, arg1, arg2, arg3);
		}
		@Pc(29) byte local29;
		@Pc(34) Class445 local34;
		@Pc(40) int local40;
		@Pc(115) int local115;
		@Pc(219) Class320 local219;
		for (local4 = (Class3_Sub20) aClass553_18.method32768(); local4 != null; local4 = (Class3_Sub20) aClass553_18.method32709()) {
			local29 = 1;
			local34 = local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.method16690();
			local40 = local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.aClass71_Sub1_3.method20103();
			if (local40 == -1 || local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.aClass71_Sub1_3.aBoolean351) {
				local29 = 0;
			} else if (local34.anInt4992 * -1713051549 == local40 || local34.anInt4997 * 1647125495 == local40 || local34.anInt4979 * -1610219699 == local40 || local34.anInt4974 * -1291917697 == local40) {
				local29 = 2;
			} else if (local40 == local34.anInt4967 * 1572273339 || local40 == local34.anInt4987 * -1259453855 || local34.anInt4983 * 1145375145 == local40 || local40 == local34.anInt4982 * -1520360879) {
				local29 = 3;
			}
			if (local4.anInt1276 * -2021885853 != local29) {
				local115 = Class575.method33149(local4.aClass26_Sub1_Sub1_Sub1_Sub1_1);
				@Pc(119) Class571 local119 = local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.aClass571_1;
				if (local119.anIntArray508 != null) {
					local119 = local119.method33044(Class424.aClass165_1, Class424.aClass165_1);
				}
				if (local119 == null || local115 == -1) {
					local4.anInt1280 = 798499549;
					local4.anInt1276 = local29 * -1209939637;
				} else if (local115 == local4.anInt1280 * 1695234699) {
					local4.anInt1276 = local29 * -1209939637;
					local4.anInt1281 = local119.anInt5391 * 384575587;
				} else {
					@Pc(151) boolean local151 = false;
					if (local4.aClass366_3 == null) {
						local151 = true;
					} else {
						local4.anInt1281 -= -1639808512;
						if (local4.anInt1281 * 319712961 <= 0) {
							local4.aClass366_3.method26819(100);
							Class510.aClass183_1.method23684(local4.aClass366_3);
							local4.aClass366_3 = null;
							local151 = true;
						}
					}
					if (local151) {
						local4.anInt1281 = local119.anInt5391 * 384575587;
						local4.anInt1280 = local115 * -798499549;
						local4.anInt1276 = local29 * -1209939637;
					}
				}
			}
			local219 = local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.method21431().aClass320_61;
			local4.anInt1267 = (int) local219.aFloat259 * -735670761;
			local4.anInt1268 = ((int) local219.aFloat259 + (local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.method16630() << 8)) * -654381141;
			local4.anInt1277 = (int) local219.aFloat261 * -422346841;
			local4.anInt1269 = ((int) local219.aFloat261 + (local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.method16630() << 8)) * 1507604409;
			local4.anInt1273 = local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.aByte101 * 763078137;
			Class535.method32538(local4, arg0, arg1, arg2, arg3);
		}
		for (local4 = (Class3_Sub20) aClass581_9.method33221(); local4 != null; local4 = (Class3_Sub20) aClass581_9.method33231()) {
			local29 = 1;
			local34 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.method16690();
			local40 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.aClass71_Sub1_3.method20103();
			if (local40 == -1 || local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.aClass71_Sub1_3.aBoolean351) {
				local29 = 0;
			} else if (local40 == local34.anInt4992 * -1713051549 || local34.anInt4997 * 1647125495 == local40 || local34.anInt4979 * -1610219699 == local40 || local40 == local34.anInt4974 * -1291917697) {
				local29 = 2;
			} else if (local40 == local34.anInt4967 * 1572273339 || local40 == local34.anInt4987 * -1259453855 || local40 == local34.anInt4983 * 1145375145 || local40 == local34.anInt4982 * -1520360879) {
				local29 = 3;
			}
			if (local29 != local4.anInt1276 * -2021885853) {
				local115 = Class512.method29596(local4.aClass26_Sub1_Sub1_Sub1_Sub2_1);
				if (local4.anInt1280 * 1695234699 == local115) {
					local4.anInt1281 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.anInt2401 * -935013707;
					local4.anInt1276 = local29 * -1209939637;
				} else {
					@Pc(384) boolean local384 = false;
					if (local4.aClass366_3 == null) {
						local384 = true;
					} else {
						local4.anInt1281 -= -1639808512;
						if (local4.anInt1281 * 319712961 <= 0) {
							local4.aClass366_3.method26819(100);
							Class510.aClass183_1.method23684(local4.aClass366_3);
							local4.aClass366_3 = null;
							local384 = true;
						}
					}
					if (local384) {
						local4.anInt1281 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.anInt2401 * -935013707;
						local4.anInt1280 = local115 * -798499549;
						local4.anInt1276 = local29 * -1209939637;
					}
				}
			}
			local219 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.method21431().aClass320_61;
			local4.anInt1267 = (int) local219.aFloat259 * -735670761;
			local4.anInt1268 = ((int) local219.aFloat259 + (local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.method16630() << 8)) * -654381141;
			local4.anInt1277 = (int) local219.aFloat261 * -422346841;
			local4.anInt1269 = ((int) local219.aFloat261 + (local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.method16630() << 8)) * 1507604409;
			local4.anInt1273 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.aByte101 * 763078137;
			Class535.method32538(local4, arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!age", name = "ap", descriptor = "(Lclient!age;IIII)V", line = 405)
	static void method11400(@OriginalArg(0) Class3_Sub20 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		if (arg0.anInt1280 * 1695234699 == -1 && arg0.anIntArray182 == null) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt1281 * 319712961;
		if (arg0.anInt1271 * 2129834111 != 0 && Class510.aClass3_Sub45_37.aClass60_Sub33_4.method14179() != 0 && arg0.anInt1273 * -1591342007 == arg1) {
			if (arg0.aClass366_3 != null && (arg0.aClass366_3.method26844() == Class378.aClass378_8 || arg0.aClass366_3.method26844() == Class378.aClass378_2)) {
				Class510.aClass183_1.method23684(arg0.aClass366_3);
				arg0.aClass366_3 = null;
			}
			@Pc(103) int local103;
			@Pc(123) int local123;
			@Pc(204) int local204;
			if (arg0.aClass366_3 != null) {
				local204 = (int) ((float) (arg0.anInt1267 * 369723815) + (float) (arg0.anInt1268 * -1607691517 - arg0.anInt1267 * 369723815) * 0.5F);
				local103 = (int) ((float) (arg0.anInt1277 * 313866263) + (float) (arg0.anInt1269 * 299015817 - arg0.anInt1277 * 313866263) * 0.5F);
				arg0.aClass320_47.aFloat259 = local204;
				arg0.aClass320_47.aFloat261 = local103;
			} else if (arg0.anInt1280 * 1695234699 >= 0) {
				@Pc(83) short local83 = 256;
				local103 = (int) ((float) (arg0.anInt1267 * 369723815) + (float) (arg0.anInt1268 * -1607691517 - arg0.anInt1267 * 369723815) * 0.5F);
				local123 = (int) ((float) (arg0.anInt1277 * 313866263) + (float) (arg0.anInt1269 * 299015817 - arg0.anInt1277 * 313866263) * 0.5F);
				arg0.aClass320_47.aFloat259 = local103;
				arg0.aClass320_47.aFloat261 = local123;
				arg0.aClass366_3 = Class510.aClass183_1.method23686(Class160.aClass160_2, arg0, arg0.anInt1280 * 1695234699, -1, 0, Class141.aClass141_5.method23024(), Class158.aClass158_5, (float) (arg0.anInt1270 * 447860907), (float) (arg0.anInt1271 * 2129834111), arg0.aClass320_47, 0, local83, false);
				if (arg0.aClass366_3 != null) {
					@Pc(173) float local173 = (float) local15 / 255.0F;
					arg0.aClass366_3.method26828(local173, 150);
					arg0.aClass366_3.method26818();
				}
			}
			if (arg0.aClass366_4 != null) {
				local204 = (int) ((float) (arg0.anInt1267 * 369723815) + (float) (arg0.anInt1268 * -1607691517 - arg0.anInt1267 * 369723815) * 0.5F);
				local103 = (int) ((float) (arg0.anInt1269 * 299015817 - arg0.anInt1277 * 313866263) * 0.5F + (float) (arg0.anInt1277 * 313866263));
				arg0.aClass320_46.aFloat259 = local204;
				arg0.aClass320_46.aFloat261 = local103;
				if (arg0.aClass366_4.method26844() == Class378.aClass378_8 || arg0.aClass366_4.method26844() == Class378.aClass378_2) {
					Class510.aClass183_1.method23684(arg0.aClass366_4);
					arg0.aClass366_4 = null;
				}
			} else if (arg0.anIntArray182 != null && (arg0.anInt1284 -= arg2 * 55542789) * -1359959859 <= 0) {
				local204 = arg0.anInt1279 * 78634583 == 256 && arg0.anInt1278 * -925341849 == 256 ? 256 : (int) (Math.random() * (double) (arg0.anInt1279 * 78634583 - arg0.anInt1278 * -925341849)) + arg0.anInt1278 * -925341849;
				local103 = (int) (Math.random() * (double) arg0.anIntArray182.length);
				local123 = (int) ((float) (arg0.anInt1268 * -1607691517 - arg0.anInt1267 * 369723815) * 0.5F + (float) (arg0.anInt1267 * 369723815));
				@Pc(334) int local334 = (int) ((float) (arg0.anInt1269 * 299015817 - arg0.anInt1277 * 313866263) * 0.5F + (float) (arg0.anInt1277 * 313866263));
				arg0.aClass320_46.aFloat259 = local123;
				arg0.aClass320_46.aFloat261 = local334;
				arg0.aClass366_4 = Class510.aClass183_1.method23686(Class160.aClass160_3, arg0, arg0.anIntArray182[local103], 0, local15, Class141.aClass141_8.method23024(), Class158.aClass158_5, (float) (arg0.anInt1270 * 447860907), (float) (arg0.anInt1271 * 2129834111 + arg0.anInt1270 * 447860907), arg0.aClass320_46, 0, local204, false);
				if (arg0.aClass366_4 != null) {
					arg0.aClass366_4.method26818();
				}
				arg0.anInt1284 = (arg0.anInt1282 * 1458644985 + (int) (Math.random() * (double) (arg0.anInt1283 * 538321471 - arg0.anInt1282 * 1458644985))) * 55542789;
			}
		} else if (arg0.aClass366_3 != null) {
			arg0.aClass366_3.method26819(100);
			Class510.aClass183_1.method23684(arg0.aClass366_3);
			arg0.aClass366_3 = null;
		}
	}

	@OriginalMember(owner = "client!age", name = "ao", descriptor = "(Lclient!age;IIII)V", line = 405)
	static void method11410(@OriginalArg(0) Class3_Sub20 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		if (arg0.anInt1280 * 1695234699 == -1 && arg0.anIntArray182 == null) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt1281 * 319712961;
		if (arg0.anInt1271 * 2129834111 != 0 && Class510.aClass3_Sub45_37.aClass60_Sub33_4.method14179() != 0 && arg0.anInt1273 * -1591342007 == arg1) {
			if (arg0.aClass366_3 != null && (arg0.aClass366_3.method26844() == Class378.aClass378_8 || arg0.aClass366_3.method26844() == Class378.aClass378_2)) {
				Class510.aClass183_1.method23684(arg0.aClass366_3);
				arg0.aClass366_3 = null;
			}
			@Pc(103) int local103;
			@Pc(123) int local123;
			@Pc(204) int local204;
			if (arg0.aClass366_3 != null) {
				local204 = (int) ((float) (arg0.anInt1267 * 369723815) + (float) (arg0.anInt1268 * -1607691517 - arg0.anInt1267 * 369723815) * 0.5F);
				local103 = (int) ((float) (arg0.anInt1277 * 313866263) + (float) (arg0.anInt1269 * 299015817 - arg0.anInt1277 * 313866263) * 0.5F);
				arg0.aClass320_47.aFloat259 = local204;
				arg0.aClass320_47.aFloat261 = local103;
			} else if (arg0.anInt1280 * 1695234699 >= 0) {
				@Pc(83) short local83 = 256;
				local103 = (int) ((float) (arg0.anInt1267 * 369723815) + (float) (arg0.anInt1268 * -1607691517 - arg0.anInt1267 * 369723815) * 0.5F);
				local123 = (int) ((float) (arg0.anInt1277 * 313866263) + (float) (arg0.anInt1269 * 299015817 - arg0.anInt1277 * 313866263) * 0.5F);
				arg0.aClass320_47.aFloat259 = local103;
				arg0.aClass320_47.aFloat261 = local123;
				arg0.aClass366_3 = Class510.aClass183_1.method23686(Class160.aClass160_2, arg0, arg0.anInt1280 * 1695234699, -1, 0, Class141.aClass141_5.method23024(), Class158.aClass158_5, (float) (arg0.anInt1270 * 447860907), (float) (arg0.anInt1271 * 2129834111), arg0.aClass320_47, 0, local83, false);
				if (arg0.aClass366_3 != null) {
					@Pc(173) float local173 = (float) local15 / 255.0F;
					arg0.aClass366_3.method26828(local173, 150);
					arg0.aClass366_3.method26818();
				}
			}
			if (arg0.aClass366_4 != null) {
				local204 = (int) ((float) (arg0.anInt1267 * 369723815) + (float) (arg0.anInt1268 * -1607691517 - arg0.anInt1267 * 369723815) * 0.5F);
				local103 = (int) ((float) (arg0.anInt1269 * 299015817 - arg0.anInt1277 * 313866263) * 0.5F + (float) (arg0.anInt1277 * 313866263));
				arg0.aClass320_46.aFloat259 = local204;
				arg0.aClass320_46.aFloat261 = local103;
				if (arg0.aClass366_4.method26844() == Class378.aClass378_8 || arg0.aClass366_4.method26844() == Class378.aClass378_2) {
					Class510.aClass183_1.method23684(arg0.aClass366_4);
					arg0.aClass366_4 = null;
				}
			} else if (arg0.anIntArray182 != null && (arg0.anInt1284 -= arg2 * 55542789) * -1359959859 <= 0) {
				local204 = arg0.anInt1279 * 78634583 == 256 && arg0.anInt1278 * -925341849 == 256 ? 256 : (int) (Math.random() * (double) (arg0.anInt1279 * 78634583 - arg0.anInt1278 * -925341849)) + arg0.anInt1278 * -925341849;
				local103 = (int) (Math.random() * (double) arg0.anIntArray182.length);
				local123 = (int) ((float) (arg0.anInt1268 * -1607691517 - arg0.anInt1267 * 369723815) * 0.5F + (float) (arg0.anInt1267 * 369723815));
				@Pc(334) int local334 = (int) ((float) (arg0.anInt1269 * 299015817 - arg0.anInt1277 * 313866263) * 0.5F + (float) (arg0.anInt1277 * 313866263));
				arg0.aClass320_46.aFloat259 = local123;
				arg0.aClass320_46.aFloat261 = local334;
				arg0.aClass366_4 = Class510.aClass183_1.method23686(Class160.aClass160_3, arg0, arg0.anIntArray182[local103], 0, local15, Class141.aClass141_8.method23024(), Class158.aClass158_5, (float) (arg0.anInt1270 * 447860907), (float) (arg0.anInt1271 * 2129834111 + arg0.anInt1270 * 447860907), arg0.aClass320_46, 0, local204, false);
				if (arg0.aClass366_4 != null) {
					arg0.aClass366_4.method26818();
				}
				arg0.anInt1284 = (arg0.anInt1282 * 1458644985 + (int) (Math.random() * (double) (arg0.anInt1283 * 538321471 - arg0.anInt1282 * 1458644985))) * 55542789;
			}
		} else if (arg0.aClass366_3 != null) {
			arg0.aClass366_3.method26819(100);
			Class510.aClass183_1.method23684(arg0.aClass366_3);
			arg0.aClass366_3 = null;
		}
	}
}
