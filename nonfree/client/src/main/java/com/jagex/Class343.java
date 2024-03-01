package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public class Class343 {

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
	static final int anInt4606 = 0;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
	static final int anInt4607 = 32768;

	@OriginalMember(owner = "client!nf", name = "fo", descriptor = "Lclient!ny;")
	public static Class359 aClass359_63;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Lclient!ew;")
	final Class161 aClass161_35 = new Class161(64);

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_62;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_61;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!vk;Lclient!ny;Lclient!ny;)V", line = 15)
	public Class343(@OriginalArg(0) Class530 arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) Class359 arg2) {
		this.aClass359_62 = arg1;
		this.aClass359_61 = arg2;
		if (this.aClass359_62 != null) {
			this.aClass359_62.method26682(0);
		}
		if (this.aClass359_61 != null) {
			this.aClass359_61.method26682(0);
		}
	}

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "(II)Lclient!amt;", line = 27)
	public Class3_Sub1_Sub14 method26476(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub14 local6 = (Class3_Sub1_Sub14) this.aClass161_35.method23219((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass359_61.method26713(0, arg0 & 0x7FFF);
		} else {
			local22 = this.aClass359_62.method26713(0, arg0);
		}
		local6 = new Class3_Sub1_Sub14();
		if (local22 != null) {
			local6.method19323(new Class3_Sub41(local22));
		}
		if (arg0 >= 32768) {
			local6.method19331();
		}
		this.aClass161_35.method23222(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)Lclient!amt;", line = 27)
	public Class3_Sub1_Sub14 method26477(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub14 local6 = (Class3_Sub1_Sub14) this.aClass161_35.method23219((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass359_61.method26713(0, arg0 & 0x7FFF);
		} else {
			local22 = this.aClass359_62.method26713(0, arg0);
		}
		local6 = new Class3_Sub1_Sub14();
		if (local22 != null) {
			local6.method19323(new Class3_Sub41(local22));
		}
		if (arg0 >= 32768) {
			local6.method19331();
		}
		this.aClass161_35.method23222(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!nf", name = "dk", descriptor = "(Lclient!de;Lclient!agk;Lclient!se;III)Z", line = 368)
	static boolean method26483(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub26 arg1, @OriginalArg(2) Class452 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Class58_Sub1.aBoolean314 && !client.aBoolean590 && !Class58_Sub1.method12407(arg1.anInt1303 * -582755297, arg1.anInt1306 * 1667122095)) {
			return false;
		}
		@Pc(17) int local17 = Integer.MAX_VALUE;
		@Pc(19) int local19 = Integer.MIN_VALUE;
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		if (arg2.anIntArray458 != null) {
			local17 = (arg1.anInt1303 * -582755297 + arg2.anInt5044 * 931070665 - Class58_Sub1.anInt1422) * (Class58_Sub1.anInt1426 - Class58_Sub1.anInt1410) / (Class58_Sub1.anInt1423 - Class58_Sub1.anInt1422) + Class58_Sub1.anInt1410;
			local19 = Class58_Sub1.anInt1410 + (Class58_Sub1.anInt1426 - Class58_Sub1.anInt1410) * (arg1.anInt1303 * -582755297 + arg2.anInt5029 * -1797323007 - Class58_Sub1.anInt1422) / (Class58_Sub1.anInt1423 - Class58_Sub1.anInt1422);
			local23 = Class58_Sub1.anInt1427 - (arg1.anInt1306 * 1667122095 + arg2.anInt5045 * -1023948257 - Class58_Sub1.anInt1424) * (Class58_Sub1.anInt1427 - Class58_Sub1.anInt1425) / (Class58_Sub1.anInt1405 - Class58_Sub1.anInt1424);
			local21 = Class58_Sub1.anInt1427 - (arg1.anInt1306 * 1667122095 + arg2.anInt5037 * 294573617 - Class58_Sub1.anInt1424) * (Class58_Sub1.anInt1427 - Class58_Sub1.anInt1425) / (Class58_Sub1.anInt1405 - Class58_Sub1.anInt1424);
		}
		@Pc(116) Class6 local116 = null;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		@Pc(122) int local122 = 0;
		@Pc(124) int local124 = 0;
		if (arg2.anInt5026 * -2127909191 != -1) {
			if (arg1.aBoolean300 && arg2.anInt5027 * 234440891 != -1) {
				local116 = arg2.method28398(arg0, true);
			} else {
				local116 = arg2.method28398(arg0, false);
			}
			if (local116 != null) {
				local118 = arg1.anInt1305 * -7401377 - (local116.method16772() + 1 >> 1);
				if (local118 < local17) {
					local17 = local118;
				}
				local120 = arg1.anInt1305 * -7401377 + (local116.method16772() + 1 >> 1);
				if (local120 > local19) {
					local19 = local120;
				}
				local122 = arg1.anInt1308 * -891551457 - (local116.method16779() + 1 >> 1);
				if (local122 < local21) {
					local21 = local122;
				}
				local124 = arg1.anInt1308 * -891551457 + (local116.method16779() + 1 >> 1);
				if (local124 > local23) {
					local23 = local124;
				}
			}
		}
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(235) int local235 = 0;
		@Pc(237) int local237 = 0;
		@Pc(239) int local239 = 0;
		if (arg2.aString224 != null) {
			Class274.method25356(arg2.anInt5041 * 404639277);
			if (Class3_Sub3.aClass14_5 != null) {
				local239 = Class340.aClass611_10.method33606(arg2.aString224, Class128.anInt3317 * 2037417253, 0, null);
				local229 = Class340.aClass611_10.method33586(arg2.aString224, Class128.anInt3317 * 2037417253, null);
				local225 = (Class58_Sub1.anInt1426 - Class58_Sub1.anInt1410) * arg2.anInt5050 * 1894745027 / (Class58_Sub1.anInt1423 - Class58_Sub1.anInt1422) + (arg1.anInt1305 * -7401377 - local229 / 2);
				local227 = arg1.anInt1308 * -891551457 - (Class58_Sub1.anInt1427 - Class58_Sub1.anInt1425) * arg2.anInt5051 * 1362640291 / (Class58_Sub1.anInt1405 - Class58_Sub1.anInt1424);
				if (local116 == null) {
					local227 -= local239 / 2;
				} else {
					local227 -= (local116.method16779() >> 1) + local239;
				}
				local231 = local225 - local229 / 2 + arg3;
				if (local231 < local17) {
					local17 = local231;
				}
				local233 = arg3 + local229 / 2 + local225;
				if (local233 > local19) {
					local19 = local233;
				}
				local235 = arg4 + local227;
				if (local235 < local21) {
					local21 = local235;
				}
				local237 = arg4 + local227 + local239;
				if (local237 > local23) {
					local23 = local237;
				}
			}
		}
		if (local19 < Class58_Sub1.anInt1410 || local17 > Class58_Sub1.anInt1426 || local23 < Class58_Sub1.anInt1425 || local21 > Class58_Sub1.anInt1427) {
			return true;
		}
		Class58_Sub1.method12410(arg0, arg1, arg2);
		if (local116 != null) {
			@Pc(408) Class472 local408 = (Class472) Class58_Sub1.aHashMap3.get(arg1.anInt1304 * 1865552421);
			if (local408 == null) {
				local408 = (Class472) Class58_Sub1.aHashMap4.get(arg2.anInt5054 * -589352987);
			}
			if (local408 != null) {
				@Pc(444) int local444;
				if (local408.anInt5118 * 250493265 > Class58_Sub1.anInt1439 * -242378493 / 2) {
					local444 = (Class58_Sub1.anInt1439 * -1676973571 - local408.anInt5118 * -548726865) / (Class58_Sub1.anInt1439 * -242378493);
				} else {
					local444 = local408.anInt5118 * -548726865 / (Class58_Sub1.anInt1439 * -242378493);
				}
				@Pc(460) int local460 = local444 << 24 | 0xFFFF00;
				if (arg0 instanceof Class21_Sub3) {
					arg0.method17063(arg1.anInt1305 * -7401377 - local116.method16782() / 2 - 7, arg1.anInt1308 * -891551457 - local116.method16782() / 2 - 7, local116.method16782() + 14, local116.method16782() + 14, local460);
					arg0.method17063(arg1.anInt1305 * -7401377 - local116.method16782() / 2 - 5, arg1.anInt1308 * -891551457 - local116.method16782() / 2 - 5, local116.method16782() + 10, local116.method16782() + 10, local460);
					arg0.method17063(arg1.anInt1305 * -7401377 - local116.method16782() / 2 - 3, arg1.anInt1308 * -891551457 - local116.method16782() / 2 - 3, local116.method16782() + 6, local116.method16782() + 6, local460);
					arg0.method17063(arg1.anInt1305 * -7401377 - local116.method16782() / 2 - 1, arg1.anInt1308 * -891551457 - local116.method16782() / 2 - 1, local116.method16782() + 2, local116.method16782() + 2, local460);
					arg0.method17063(arg1.anInt1305 * -7401377 - local116.method16782() / 2, arg1.anInt1308 * -891551457 - local116.method16782() / 2, local116.method16782(), local116.method16782(), local460);
				} else {
					arg0.method17064(arg1.anInt1305 * -7401377, arg1.anInt1308 * -891551457, local116.method16782() / 2 + 7, local460);
					arg0.method17064(arg1.anInt1305 * -7401377, arg1.anInt1308 * -891551457, local116.method16782() / 2 + 5, local460);
					arg0.method17064(arg1.anInt1305 * -7401377, arg1.anInt1308 * -891551457, local116.method16782() / 2 + 3, local460);
					arg0.method17064(arg1.anInt1305 * -7401377, arg1.anInt1308 * -891551457, local116.method16782() / 2 + 1, local460);
					arg0.method17064(arg1.anInt1305 * -7401377, arg1.anInt1308 * -891551457, local116.method16782() / 2, local460);
				}
			}
			local116.method16783(arg1.anInt1305 * -7401377 - (local116.method16772() >> 1), arg1.anInt1308 * -891551457 - (local116.method16779() >> 1));
		}
		if (arg2.aString224 != null && Class3_Sub3.aClass14_5 != null) {
			Class13_Sub19.method7197(arg0, arg1, arg2, local225, local227, local239, local229);
		}
		if (arg2.anInt5026 * -2127909191 != -1 || arg2.aString224 != null) {
			@Pc(764) Class3_Sub10 local764 = new Class3_Sub10(arg1);
			local764.anInt1220 = local118 * 1043141073;
			local764.anInt1214 = local120 * -1300190211;
			local764.anInt1215 = local122 * -190619361;
			local764.anInt1219 = local124 * 687886947;
			local764.anInt1217 = local231 * -120575679;
			local764.anInt1218 = local233 * 1967039075;
			local764.anInt1213 = local235 * 1579808205;
			local764.anInt1216 = local237 * 2105674693;
			Class269.aClass553_55.method32702(local764);
		}
		return false;
	}

	@OriginalMember(owner = "client!nf", name = "eb", descriptor = "(B)Lclient!agk;", line = 832)
	public static Class3_Sub26 method26480() {
		if (Class58_Sub1.aClass553_23 == null || Class58_Sub1.aClass554_1 == null) {
			return null;
		}
		Class58_Sub1.aClass554_1.method32775(Class58_Sub1.aClass553_23);
		@Pc(15) Class3_Sub26 local15 = (Class3_Sub26) Class58_Sub1.aClass554_1.method32778();
		if (local15 == null) {
			return null;
		} else {
			@Pc(27) Class452 local27 = Class58_Sub1.aClass454_2.method28448(local15.anInt1304 * 1865552421);
			return local27 != null && local27.aBoolean776 && local27.method28402(Class58_Sub1.anInterface9_2, Class58_Sub1.anInterface8_2) ? local15 : Class340.method26441();
		}
	}

	@OriginalMember(owner = "client!nf", name = "ji", descriptor = "(Lclient!fo;Lclient!vs;I)V", line = 5843)
	static final void method26482(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class536 arg1) {
		arg1.anInt5319 -= 624249098;
		@Pc(15) int local15 = arg1.anIntArray496[arg1.anInt5319 * 960738381] - 1;
		@Pc(25) int local25 = arg1.anIntArray496[arg1.anInt5319 * 960738381 + 1];
		if (local15 < 0 || local15 > 9) {
			throw new RuntimeException();
		}
		Class131.method22899(arg0, local15, local25, arg1);
	}

	@OriginalMember(owner = "client!nf", name = "wj", descriptor = "(Lclient!vs;B)V", line = 8222)
	static final void method26478(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(47) String local47 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (local23 == -1) {
			throw new RuntimeException();
		}
		@Pc(59) Class574 local59 = Class438.aClass589_1.method33297(local23);
		if (local59.aChar13 != local13) {
			throw new RuntimeException();
		} else if (local59.aChar14 == 's') {
			@Pc(80) int[] local80 = local59.method33085(local47);
			if (local33 < 0 || local80 == null || local80.length <= local33) {
				throw new RuntimeException();
			}
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local80[local33];
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nf", name = "zk", descriptor = "(Lclient!vs;I)V", line = 8613)
	static final void method26479(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass245_4.anInt3785 * 840311933;
	}

	@OriginalMember(owner = "client!nf", name = "ahb", descriptor = "(Lclient!vs;B)V", line = 10233)
	static final void method26481(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) int local16 = Class214.method24282(local12);
		if (local16 < 0) {
			throw new RuntimeException();
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16;
	}

	@OriginalMember(owner = "client!nf", name = "asm", descriptor = "(Lclient!vs;I)V", line = 12332)
	static final void method26484(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (client.aBoolean565) {
			try {
				Class300.aClass300_15.method25650(new Object[] { local13 });
			} catch (@Pc(27) Throwable local27) {
			}
		}
	}
}
