package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public class Class273 {

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
	public static final int anInt4298 = 1;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
	static final int anInt4299 = 0;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
	static final int anInt4300 = 1;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	public static final int anInt4301 = 2;

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
	static final int anInt4304 = 1;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
	public static final int anInt4305 = 0;

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
	public static final int anInt4306 = 0;

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "Lclient!ny;")
	static Class359 aClass359_51;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
	static final int anInt4307 = 2;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
	public static final int anInt4313 = 1;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "[Lclient!kd;")
	public static Class273[] aClass273Array1 = new Class273[16];

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
	static int anInt4302 = 0;

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "Lclient!xn;")
	public static Class581 aClass581_31 = new Class581(16);

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "Lclient!ew;")
	static Class161 aClass161_32 = new Class161(64);

	@OriginalMember(owner = "client!kd", name = "at", descriptor = "J")
	public long aLong255;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
	public int anInt4303;

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
	public int anInt4308;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
	int anInt4309;

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
	public int anInt4310;

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
	public int anInt4311;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
	public int anInt4312;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
	public int anInt4314;

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
	public int anInt4317;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
	public int anInt4318;

	@OriginalMember(owner = "client!kd", name = "af", descriptor = "I")
	public int anInt4319;

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
	public int anInt4315 = 0;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
	public int anInt4316 = 0;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "Z")
	boolean aBoolean705 = false;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "(S)Lclient!pg;", line = 11)
	public static Class47 method25343() {
		try {
			return new Class47_Sub2();
		} catch (@Pc(4) Throwable local4) {
			return new Class47_Sub1();
		}
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V", line = 42)
	Class273() {
	}

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "(Lclient!ny;)V", line = 45)
	public static void method25331(@OriginalArg(0) Class359 arg0) {
		aClass359_51 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "(I)Lclient!kd;", line = 49)
	public static Class273 method25332(@OriginalArg(0) int arg0) {
		@Pc(5) Class273 local5 = (Class273) aClass161_32.method23219((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(15) byte[] local15 = aClass359_51.method26713(1, arg0);
		local5 = new Class273();
		local5.anInt4303 = arg0 * 2085218525;
		if (local15 != null) {
			local5.method25337(new Class3_Sub41(local15));
		}
		local5.method25330();
		if (local5.anInt4308 * -1790153647 == 2 && aClass581_31.method33217((long) arg0) == null) {
			aClass581_31.method33241(new Class3_Sub21(anInt4302 * -898241969), (long) arg0);
			aClass273Array1[(anInt4302 += -10687313) * -898241969 - 1] = local5;
		}
		aClass161_32.method23222(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "(I)Lclient!kd;", line = 49)
	public static Class273 method25333(@OriginalArg(0) int arg0) {
		@Pc(5) Class273 local5 = (Class273) aClass161_32.method23219((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(15) byte[] local15 = aClass359_51.method26713(1, arg0);
		local5 = new Class273();
		local5.anInt4303 = arg0 * 2085218525;
		if (local15 != null) {
			local5.method25337(new Class3_Sub41(local15));
		}
		local5.method25330();
		if (local5.anInt4308 * -1790153647 == 2 && aClass581_31.method33217((long) arg0) == null) {
			aClass581_31.method33241(new Class3_Sub21(anInt4302 * -898241969), (long) arg0);
			aClass273Array1[(anInt4302 += -10687313) * -898241969 - 1] = local5;
		}
		aClass161_32.method23222(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Lclient!kd;", line = 49)
	public static Class273 method25334(@OriginalArg(0) int arg0) {
		@Pc(5) Class273 local5 = (Class273) aClass161_32.method23219((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(15) byte[] local15 = aClass359_51.method26713(1, arg0);
		local5 = new Class273();
		local5.anInt4303 = arg0 * 2085218525;
		if (local15 != null) {
			local5.method25337(new Class3_Sub41(local15));
		}
		local5.method25330();
		if (local5.anInt4308 * -1790153647 == 2 && aClass581_31.method33217((long) arg0) == null) {
			aClass581_31.method33241(new Class3_Sub21(anInt4302 * -898241969), (long) arg0);
			aClass273Array1[(anInt4302 += -10687313) * -898241969 - 1] = local5;
		}
		aClass161_32.method23222(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "(Ljava/lang/String;I)V", line = 59)
	public static void method25349(@OriginalArg(0) String arg0) {
		if (client.anInt3039 * 1115111877 != 16) {
			return;
		}
		@Pc(11) Class3_Sub23 local11 = Class269.method25284(Class311.aClass311_13, client.aClass82_1.aClass577_2);
		local11.aClass3_Sub41_Sub1_1.method20251(0);
		@Pc(22) int local22 = local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local11.aClass3_Sub41_Sub1_1.method20260(arg0);
		local11.aClass3_Sub41_Sub1_1.anInt2803 += -2137895021;
		local11.aClass3_Sub41_Sub1_1.method20296(Class338.anIntArray421, local22, local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237);
		local11.aClass3_Sub41_Sub1_1.method20265(local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local22);
		client.aClass82_1.method21601(local11);
		Class13_Sub13.aClass555_1 = Class555.aClass555_2;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(Lclient!ahb;)V", line = 68)
	void method25329(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method25327(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(Lclient!ahb;I)V", line = 68)
	void method25337(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method25327(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "(Lclient!ahb;II)V", line = 75)
	void method25327(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4309 = arg0.method20271() * -764519439;
		} else if (arg1 == 2) {
			arg0.method20269();
		} else if (arg1 == 3) {
			this.anInt4310 = arg0.method20275() * 1433078237;
			this.anInt4311 = arg0.method20275() * -138224291;
			this.anInt4312 = arg0.method20275() * 1905388679;
		} else if (arg1 == 4) {
			this.anInt4318 = arg0.method20269() * 2039735665;
			this.anInt4314 = arg0.method20275() * -1489429111;
		} else if (arg1 == 6) {
			this.anInt4308 = arg0.method20269() * 1484545201;
		} else if (arg1 == 8) {
			this.anInt4315 = -1020283361;
		} else if (arg1 == 9) {
			this.anInt4316 = 1027378109;
		} else if (arg1 == 10) {
			this.aBoolean705 = true;
		}
	}

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "(Lclient!ahb;I)V", line = 75)
	void method25328(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4309 = arg0.method20271() * -764519439;
		} else if (arg1 == 2) {
			arg0.method20269();
		} else if (arg1 == 3) {
			this.anInt4310 = arg0.method20275() * 1433078237;
			this.anInt4311 = arg0.method20275() * -138224291;
			this.anInt4312 = arg0.method20275() * 1905388679;
		} else if (arg1 == 4) {
			this.anInt4318 = arg0.method20269() * 2039735665;
			this.anInt4314 = arg0.method20275() * -1489429111;
		} else if (arg1 == 6) {
			this.anInt4308 = arg0.method20269() * 1484545201;
		} else if (arg1 == 8) {
			this.anInt4315 = -1020283361;
		} else if (arg1 == 9) {
			this.anInt4316 = 1027378109;
		} else if (arg1 == 10) {
			this.aBoolean705 = true;
		}
	}

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "(Lclient!ahb;I)V", line = 75)
	void method25335(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4309 = arg0.method20271() * -764519439;
		} else if (arg1 == 2) {
			arg0.method20269();
		} else if (arg1 == 3) {
			this.anInt4310 = arg0.method20275() * 1433078237;
			this.anInt4311 = arg0.method20275() * -138224291;
			this.anInt4312 = arg0.method20275() * 1905388679;
		} else if (arg1 == 4) {
			this.anInt4318 = arg0.method20269() * 2039735665;
			this.anInt4314 = arg0.method20275() * -1489429111;
		} else if (arg1 == 6) {
			this.anInt4308 = arg0.method20269() * 1484545201;
		} else if (arg1 == 8) {
			this.anInt4315 = -1020283361;
		} else if (arg1 == 9) {
			this.anInt4316 = 1027378109;
		} else if (arg1 == 10) {
			this.aBoolean705 = true;
		}
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V", line = 98)
	void method25330() {
		this.anInt4319 = Class317.anIntArray420[this.anInt4309 * -959236847 << 3] * -2100717103;
		@Pc(17) long local17 = (long) (this.anInt4310 * -1758357899);
		@Pc(23) long local23 = (long) (this.anInt4311 * -595435787);
		@Pc(29) long local29 = (long) (this.anInt4312 * 38476087);
		this.anInt4317 = (int) Math.sqrt((double) (local17 * local17 + local23 * local23 + local29 * local29)) * 664489863;
		if (this.anInt4314 * -1318426439 == 0) {
			this.anInt4314 = -1489429111;
		}
		if (this.anInt4318 * 1308244881 == 0) {
			this.aLong255 = -3658025136815215795L;
		} else if (this.anInt4318 * 1308244881 == 1) {
			this.aLong255 = (long) (this.anInt4317 * -1372966472 / (this.anInt4314 * -1318426439)) * -9192703545393933133L;
			this.aLong255 *= this.aLong255 * -4540577144272405893L;
		} else if (this.anInt4318 * 1308244881 == 2) {
			this.aLong255 = (long) (this.anInt4317 * -1372966472 / (-1318426439 * this.anInt4314)) * -9192703545393933133L;
		}
		if (this.aBoolean705) {
			this.anInt4317 *= -1;
		}
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "()V", line = 98)
	void method25336() {
		this.anInt4319 = Class317.anIntArray420[this.anInt4309 * -959236847 << 3] * -2100717103;
		@Pc(17) long local17 = (long) (this.anInt4310 * -1758357899);
		@Pc(23) long local23 = (long) (this.anInt4311 * -595435787);
		@Pc(29) long local29 = (long) (this.anInt4312 * 38476087);
		this.anInt4317 = (int) Math.sqrt((double) (local17 * local17 + local23 * local23 + local29 * local29)) * 664489863;
		if (this.anInt4314 * -1318426439 == 0) {
			this.anInt4314 = -1489429111;
		}
		if (this.anInt4318 * 1308244881 == 0) {
			this.aLong255 = -3658025136815215795L;
		} else if (this.anInt4318 * 1308244881 == 1) {
			this.aLong255 = (long) (this.anInt4317 * -1372966472 / (this.anInt4314 * -1318426439)) * -9192703545393933133L;
			this.aLong255 *= this.aLong255 * -4540577144272405893L;
		} else if (this.anInt4318 * 1308244881 == 2) {
			this.aLong255 = (long) (this.anInt4317 * -1372966472 / (-1318426439 * this.anInt4314)) * -9192703545393933133L;
		}
		if (this.aBoolean705) {
			this.anInt4317 *= -1;
		}
	}

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "()V", line = 98)
	void method25338() {
		this.anInt4319 = Class317.anIntArray420[this.anInt4309 * -959236847 << 3] * -2100717103;
		@Pc(17) long local17 = (long) (this.anInt4310 * -1758357899);
		@Pc(23) long local23 = (long) (this.anInt4311 * -595435787);
		@Pc(29) long local29 = (long) (this.anInt4312 * 38476087);
		this.anInt4317 = (int) Math.sqrt((double) (local17 * local17 + local23 * local23 + local29 * local29)) * 664489863;
		if (this.anInt4314 * -1318426439 == 0) {
			this.anInt4314 = -1489429111;
		}
		if (this.anInt4318 * 1308244881 == 0) {
			this.aLong255 = -3658025136815215795L;
		} else if (this.anInt4318 * 1308244881 == 1) {
			this.aLong255 = (long) (this.anInt4317 * -1372966472 / (this.anInt4314 * -1318426439)) * -9192703545393933133L;
			this.aLong255 *= this.aLong255 * -4540577144272405893L;
		} else if (this.anInt4318 * 1308244881 == 2) {
			this.aLong255 = (long) (this.anInt4317 * -1372966472 / (-1318426439 * this.anInt4314)) * -9192703545393933133L;
		}
		if (this.aBoolean705) {
			this.anInt4317 *= -1;
		}
	}

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "()V", line = 98)
	void method25339() {
		this.anInt4319 = Class317.anIntArray420[this.anInt4309 * -959236847 << 3] * -2100717103;
		@Pc(17) long local17 = (long) (this.anInt4310 * -1758357899);
		@Pc(23) long local23 = (long) (this.anInt4311 * -595435787);
		@Pc(29) long local29 = (long) (this.anInt4312 * 38476087);
		this.anInt4317 = (int) Math.sqrt((double) (local17 * local17 + local23 * local23 + local29 * local29)) * 664489863;
		if (this.anInt4314 * -1318426439 == 0) {
			this.anInt4314 = -1489429111;
		}
		if (this.anInt4318 * 1308244881 == 0) {
			this.aLong255 = -3658025136815215795L;
		} else if (this.anInt4318 * 1308244881 == 1) {
			this.aLong255 = (long) (this.anInt4317 * -1372966472 / (this.anInt4314 * -1318426439)) * -9192703545393933133L;
			this.aLong255 *= this.aLong255 * -4540577144272405893L;
		} else if (this.anInt4318 * 1308244881 == 2) {
			this.aLong255 = (long) (this.anInt4317 * -1372966472 / (-1318426439 * this.anInt4314)) * -9192703545393933133L;
		}
		if (this.aBoolean705) {
			this.anInt4317 *= -1;
		}
	}

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "(I)V", line = 107)
	public static void method25344() {
		Class3_Sub35_Sub1.method18867();
		Class516.aClass56_Sub2_1.method12564();
		Class516.aClass56_Sub1_1.method12564();
		@Pc(17) Class3_Sub23 local17;
		@Pc(26) int local26;
		if (client.anInt3144 * 259780257 > 0) {
			local17 = Class269.method25284(Class311.aClass311_77, client.aClass82_2.aClass577_2);
			local17.aClass3_Sub41_Sub1_1.method20251(client.anInt3144 * 1039121028);
			for (local26 = 0; local26 < client.anInt3144 * 259780257; local26++) {
				@Pc(35) Interface46 local35 = client.anInterface46Array2[local26];
				@Pc(43) long local43 = local35.method11583() - Class516.aLong283 * -268653979505785509L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				Class516.aLong283 = local35.method11583() * -2488218721681104173L;
				local17.aClass3_Sub41_Sub1_1.method20250(local35.method11582());
				local17.aClass3_Sub41_Sub1_1.method20253((int) local43);
			}
			client.aClass82_2.method21601(local17);
		}
		if (Class516.anInt5272 * 175924049 > 0) {
			Class516.anInt5272 -= -1779251791;
		}
		if (client.aBoolean586 && Class516.anInt5272 * 175924049 <= 0) {
			Class516.anInt5272 = -1225297452;
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
		if (Class516.aBoolean819 != Canvas_Sub1.aBoolean481) {
			Class516.aBoolean819 = Canvas_Sub1.aBoolean481;
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

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "()V", line = 116)
	public static void method25340() {
		aClass161_32.method23224();
	}

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "()V", line = 116)
	public static void method25341() {
		aClass161_32.method23224();
	}

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "()V", line = 116)
	public static void method25342() {
		aClass161_32.method23224();
	}

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "(IIZI)V", line = 821)
	static void method25347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		Class72_Sub1.aBooleanArrayArray11[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!kd", name = "fn", descriptor = "(Lclient!fy;ZIZZI)Lclient!ny;", line = 1915)
	public static Class359 method25350(@OriginalArg(0) Class188 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (Class296.aClass46_Sub1Array1 == null) {
			Class296.aClass46_Sub1Array1 = new Class46_Sub1[Class571.method33068()];
		}
		@Pc(8) Class403 local8 = null;
		@Pc(12) int local12 = arg0.method23965();
		if (client.aClass569_4 != null && !Class482.aBoolean801) {
			local8 = new Class403(local12, client.aClass569_4, Class3_Sub18_Sub2.aClass569Array1[local12], 2000000);
		}
		Class296.aClass46_Sub1Array1[local12] = Class626.aClass334_1.method26278(local12, local8, Class44.aClass403_7, arg0.method23964());
		if (arg3) {
			Class296.aClass46_Sub1Array1[local12].method8538();
		}
		return new Class359(Class296.aClass46_Sub1Array1[local12], arg1, arg2);
	}

	@OriginalMember(owner = "client!kd", name = "zm", descriptor = "(Lclient!vs;I)V", line = 8621)
	static final void method25345(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = arg0.aClass245_4.method24851()[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]];
	}

	@OriginalMember(owner = "client!kd", name = "zf", descriptor = "(Lclient!vs;I)V", line = 8683)
	static final void method25346(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass3_Sub30_3.aClass238Array1[local12].anInt3750 * 485291629;
	}

	@OriginalMember(owner = "client!kd", name = "aka", descriptor = "(Lclient!vs;B)V", line = 10887)
	static final void method25348(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		Class80.aClass23_Sub1_1.method5822(local12);
	}
}
