package com.jagex;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
class Class197 implements Runnable {

	// $FF: synthetic field
	@OriginalMember(owner = "client!cv", name = "this$0", descriptor = "Lclient!ahx;")
	final Class117_Sub2 this$0;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!ahx;)V", line = 28)
	Class197(@OriginalArg(0) Class117_Sub2 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!cv", name = "run", descriptor = "()V", line = 32)
	@Override
	public void run() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean221) {
					@Pc(9) HashMap local9 = this.this$0.method10903();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class501 local20;
						do {
							if (!local13.hasNext()) {
								Class281.method26679(50L);
								continue label36;
							}
							local20 = (Class501) local13.next();
						} while (local20.aBoolean770);
						@Pc(30) Class485[] local30 = (Class485[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method29940();
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class293.method27014(null, local49);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cv", name = "r", descriptor = "()V", line = 32)
	public void method25470() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean221) {
					@Pc(9) HashMap local9 = this.this$0.method10903();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class501 local20;
						do {
							if (!local13.hasNext()) {
								Class281.method26679(50L);
								continue label36;
							}
							local20 = (Class501) local13.next();
						} while (local20.aBoolean770);
						@Pc(30) Class485[] local30 = (Class485[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method29940();
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class293.method27014(null, local49);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "()V", line = 32)
	public void method25471() {
		label36: while (true) {
			try {
				if (!this.this$0.aBoolean221) {
					@Pc(9) HashMap local9 = this.this$0.method10903();
					@Pc(13) Iterator local13 = local9.keySet().iterator();
					while (true) {
						@Pc(20) Class501 local20;
						do {
							if (!local13.hasNext()) {
								Class281.method26679(50L);
								continue label36;
							}
							local20 = (Class501) local13.next();
						} while (local20.aBoolean770);
						@Pc(30) Class485[] local30 = (Class485[]) local9.get(local20);
						for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
							local30[local32].method29940();
						}
					}
				}
			} catch (@Pc(49) Exception local49) {
				Class293.method27014(null, local49);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "([I[Ljava/lang/Object;III)V", line = 187)
	public static void method25472(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = Integer.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < local14 + (local47 & local45)) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) Object local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method25472(arg0, arg1, arg2, local10 - 1);
		method25472(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!cv", name = "r", descriptor = "(I)Lclient!aar;", line = 463)
	static Class17 method25473() {
		@Pc(8) Class17 local8;
		if (!Class683.aBoolean863) {
			local8 = Class346.aClass17_12;
		} else if (Class503.aClass94_11 == null || Class315.aClass17_11 == null) {
			local8 = Class346.aClass17_12;
		} else {
			local8 = Class315.aClass17_11;
		}
		Class683.anInt5819 = local8.anInt52 * 1660152313 + local8.anInt51 * -1129366907;
		return local8;
	}

	@OriginalMember(owner = "client!cv", name = "jw", descriptor = "(Lclient!ae;I)Z", line = 6371)
	static final boolean method25474(@OriginalArg(0) Class82 arg0) throws IOException {
		@Pc(3) Class139 local3 = arg0.method2022();
		@Pc(6) Class77_Sub39_Sub1 local6 = arg0.aClass77_Sub39_Sub1_1;
		if (local3 == null) {
			return false;
		}
		@Pc(87) int local87;
		if (arg0.aClass418_1 == null) {
			if (arg0.aBoolean51) {
				if (!local3.method14347(1)) {
					return false;
				}
				local3.method14339(arg0.aClass77_Sub39_Sub1_1.aByteArray53, 0, 1);
				arg0.anInt325 += 1204530481;
				arg0.anInt323 = 0;
				arg0.aBoolean51 = false;
			}
			local6.anInt3089 = 0;
			if (local6.method22175()) {
				if (!local3.method14347(1)) {
					return false;
				}
				local3.method14339(arg0.aClass77_Sub39_Sub1_1.aByteArray53, 1, 1);
				arg0.anInt325 += 1204530481;
				arg0.anInt323 = 0;
			}
			arg0.aBoolean51 = true;
			@Pc(83) Class418[] local83 = Class614.method32336();
			local87 = local6.method22181();
			if (local87 < 0 || local87 >= local83.length) {
				throw new IOException(local87 + " " + local6.anInt3089 * 31645619);
			}
			arg0.aClass418_1 = local83[local87];
			arg0.anInt327 = arg0.aClass418_1.anInt4723 * 1109978041;
		}
		if (arg0.anInt327 * -1013636781 == -1) {
			if (!local3.method14347(1)) {
				return false;
			}
			local3.method14339(local6.aByteArray53, 0, 1);
			arg0.anInt327 = (local6.aByteArray53[0] & 0xFF) * -1220818213;
			arg0.anInt325 += 1204530481;
			arg0.anInt323 = 0;
		}
		if (-1013636781 * arg0.anInt327 == -2) {
			if (!local3.method14347(2)) {
				return false;
			}
			local3.method14339(local6.aByteArray53, 0, 2);
			local6.anInt3089 = 0;
			arg0.anInt327 = local6.method22483() * -1220818213;
			arg0.anInt325 += -1885906334;
			arg0.anInt323 = 0;
		}
		if (arg0.anInt327 * -1013636781 > 0) {
			if (!local3.method14347(arg0.anInt327 * -1013636781)) {
				return false;
			}
			local6.anInt3089 = 0;
			local3.method14339(local6.aByteArray53, 0, arg0.anInt327 * -1013636781);
			arg0.anInt325 += arg0.anInt327 * -1461618717;
			arg0.anInt323 = 0;
		}
		arg0.aClass418_2 = arg0.aClass418_3;
		arg0.aClass418_3 = arg0.aClass418_4;
		arg0.aClass418_4 = arg0.aClass418_1;
		if (Class418.aClass418_149 == arg0.aClass418_1) {
			arg0.aClass418_1 = null;
			return false;
		}
		@Pc(272) int local272;
		@Pc(280) int local280;
		if (arg0.aClass418_1 == Class418.aClass418_15) {
			local272 = local6.method22478();
			local87 = local272 >> 5;
			local280 = local272 & 0x1F;
			if (local280 == 0) {
				client.aClass73Array1[local87] = null;
				arg0.aClass418_1 = null;
				return true;
			}
			@Pc(296) Class73 local296 = new Class73();
			local296.anInt215 = local280 * -1436385891;
			local296.anInt216 = local6.method22478() * -1644634955;
			if (local296.anInt216 * -1562758755 >= 0 && local296.anInt216 * -1562758755 < Class515.aClass83Array8.length) {
				if (local296.anInt215 * 652406965 == 1 || local296.anInt215 * 652406965 == 10) {
					local296.anInt208 = local6.method22483() * -1459486341;
					local296.anInt207 = local6.method22483() * 595344883;
					local6.anInt3089 += -1254908436;
				} else if (local296.anInt215 * 652406965 >= 2 && local296.anInt215 * 652406965 <= 6) {
					if (local296.anInt215 * 652406965 == 2) {
						local296.anInt210 = 1543031040;
						local296.anInt211 = 953385216;
					}
					if (local296.anInt215 * 652406965 == 3) {
						local296.anInt210 = 0;
						local296.anInt211 = 953385216;
					}
					if (local296.anInt215 * 652406965 == 4) {
						local296.anInt210 = -1208905216;
						local296.anInt211 = 953385216;
					}
					if (local296.anInt215 * 652406965 == 5) {
						local296.anInt210 = 1543031040;
						local296.anInt211 = 0;
					}
					if (local296.anInt215 * 652406965 == 6) {
						local296.anInt210 = 1543031040;
						local296.anInt211 = 1906770432;
					}
					local296.anInt215 = 1422195514;
					local296.anInt209 = local6.method22478() * -57576317;
					@Pc(439) Class595 local439 = client.aClass517_1.method30409();
					local296.anInt210 += (local6.method22483() - local439.anInt5504 * -424199969 << 9) * 22804681;
					local296.anInt211 += (local6.method22483() - -1166289421 * local439.anInt5506 << 9) * -1707551871;
					local296.anInt212 = (local6.method22478() << 2) * 1649564799;
					local296.anInt214 = local6.method22483() * -1641499169;
				}
				local296.anInt213 = local6.method22500() * -864989343;
				client.aClass73Array1[local87] = local296;
			}
			arg0.aClass418_1 = null;
			return true;
		}
		@Pc(522) boolean local522;
		if (Class418.aClass418_82 == arg0.aClass418_1) {
			client.anInt3483 = client.anInt3413 * -771492423;
			local522 = local6.method22478() == 1;
			@Pc(527) Class365 local527 = new Class365(local6);
			@Pc(531) Class368 local531;
			if (local522) {
				local531 = Class199.aClass368_2;
			} else {
				local531 = Class22.aClass368_1;
			}
			local527.method28136(local531);
			arg0.aClass418_1 = null;
			return true;
		}
		@Pc(563) int local563;
		if (Class418.aClass418_8 == arg0.aClass418_1) {
			local272 = local6.method22483();
			local87 = local6.method22483();
			local280 = local6.method22598();
			local563 = local6.method22648();
			Class605.method32077();
			Class134.method13701(local563, local280, local272, local87);
			arg0.aClass418_1 = null;
			return true;
		} else if (Class418.aClass418_191 == arg0.aClass418_1) {
			local272 = local6.method22612();
			local87 = local6.method22483();
			local280 = local6.method22648();
			local563 = local6.method22621();
			Class605.method32077();
			Class247.method26132(local280, local87, local563, local272);
			arg0.aClass418_1 = null;
			return true;
		} else {
			@Pc(669) int local669;
			@Pc(630) String local630;
			@Pc(628) String local628;
			@Pc(645) long local645;
			@Pc(640) String local640;
			@Pc(659) Class416 local659;
			@Pc(650) long local650;
			@Pc(667) boolean local667;
			@Pc(725) String local725;
			@Pc(665) long local665;
			if (Class418.aClass418_87 == arg0.aClass418_1) {
				local522 = local6.method22478() == 1;
				local628 = local6.method22523();
				local630 = local628;
				if (local522) {
					local630 = local6.method22523();
				}
				local640 = local6.method22523();
				local645 = local6.method22483();
				local650 = local6.method22492();
				local659 = (Class416) Class457.method29479(Class416.method28667(), local6.method22478());
				local665 = (local645 << 32) + local650;
				local667 = false;
				local669 = 0;
				while (true) {
					if (local669 >= 100) {
						if (local659.aBoolean746) {
							if (client.aBoolean620 && !client.aBoolean616 || client.aBoolean599) {
								local667 = true;
							} else if (Class19.method408(local630)) {
								local667 = true;
							}
						}
						break;
					}
					if (local665 == client.aLongArray23[local669]) {
						local667 = true;
						break;
					}
					local669++;
				}
				if (!local667) {
					client.aLongArray23[client.anInt3425 * 292282647] = local665;
					client.anInt3425 = (client.anInt3425 * 292282647 + 1) % 100 * -315136345;
					local725 = Class37.method643(Class552.method30998(local6));
					if (local659.anInt4720 * -512635923 == -1) {
						Class245.method26121(9, 0, local628, local630, local628, local725, local640, -1, local659);
					} else {
						Class245.method26121(9, 0, Class152.method17433(local659.anInt4720 * -512635923) + local628, Class152.method17433(local659.anInt4720 * -512635923) + local630, local628, local725, local640, -1, local659);
					}
				}
				arg0.aClass418_1 = null;
				return true;
			} else if (Class418.aClass418_28 == arg0.aClass418_1) {
				Class118_Sub3.aClass687_1 = Class35_Sub22.method18345(local6.method22478());
				arg0.aClass418_1 = null;
				return true;
			} else if (arg0.aClass418_1 == Class418.aClass418_144) {
				Class605.method32077();
				Class264.method26451(Class96_Sub6.method7162());
				arg0.aClass418_1 = null;
				return true;
			} else if (Class418.aClass418_178 == arg0.aClass418_1) {
				local272 = local6.method22483();
				local87 = local6.method22483();
				local280 = local6.method22483();
				Class94_Sub4.aClass261_1.method26303(local272, local87, local280);
				arg0.aClass418_1 = null;
				return true;
			} else if (Class418.aClass418_6 == arg0.aClass418_1) {
				local272 = local6.method22483();
				if (local272 == 65535) {
					local272 = -1;
				}
				Class94_Sub4.aClass261_1.method26337(local272, 255);
				arg0.aClass418_1 = null;
				return true;
			} else if (Class418.aClass418_130 == arg0.aClass418_1) {
				local272 = local6.method22645();
				local87 = local6.method22483();
				Class605.method32077();
				Class649.method32880(local272, local87);
				arg0.aClass418_1 = null;
				return true;
			} else if (Class418.aClass418_57 == arg0.aClass418_1) {
				client.aClass632_2 = (Class632) Class457.method29479(Class632.method32644(), local6.method22591());
				if (client.aClass632_2 == null) {
					client.aClass632_2 = Class632.aClass632_3;
				}
				arg0.aClass418_1 = null;
				return true;
			} else {
				@Pc(992) int local992;
				@Pc(967) boolean local967;
				@Pc(1040) int local1040;
				@Pc(1013) String local1013;
				@Pc(958) boolean local958;
				if (Class418.aClass418_90 == arg0.aClass418_1) {
					local272 = local6.method22483();
					@Pc(925) Class104_Sub1_Sub1_Sub1_Sub2 local925;
					if (local272 == client.anInt3389 * -643758853) {
						local925 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3;
					} else {
						local925 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local272];
					}
					if (local925 == null) {
						arg0.aClass418_1 = null;
						return true;
					}
					local280 = local6.method22483();
					@Pc(950) Class416 local950 = (Class416) Class457.method29479(Class416.method28667(), local6.method22478());
					local958 = (local280 & 0x8000) != 0;
					if (local925.aString82 != null && local925.aClass628_1 != null) {
						local967 = false;
						if (local950.aBoolean746) {
							if (!local958 && (client.aBoolean620 && !client.aBoolean616 || client.aBoolean599)) {
								local967 = true;
							} else if (Class19.method408(local925.aString82)) {
								local967 = true;
							}
						}
						if (!local967) {
							local992 = -1;
							if (local958) {
								local280 &= 0x7FFF;
								@Pc(1002) Class404 local1002 = Class341.method27752(local6);
								local992 = local1002.anInt4703 * -1791556207;
								local1013 = local1002.aClass77_Sub1_Sub13_1.method22309(local6);
							} else {
								local1013 = Class37.method643(Class552.method30998(local6));
							}
							local925.method21195(local1013.trim(), local280 >> 8, local280 & 0xFF);
							if (local950.aBoolean745) {
								local1040 = local958 ? 17 : 1;
							} else {
								local1040 = local958 ? 17 : 2;
							}
							if (-512635923 * local950.anInt4720 == -1) {
								Class245.method26121(local1040, 0, local925.method21176(true), local925.method21181(false), local925.aString85, local1013, null, local992, local950);
							} else {
								Class245.method26121(local1040, 0, Class152.method17433(local950.anInt4720 * -512635923) + local925.method21176(true), Class152.method17433(local950.anInt4720 * -512635923) + local925.method21181(false), local925.aString85, local1013, null, local992, local950);
							}
						}
					}
					arg0.aClass418_1 = null;
					return true;
				} else if (arg0.aClass418_1 == Class418.aClass418_42) {
					local272 = local6.method22645();
					if (local272 != Class497.anInt5063 * 846473929) {
						Class497.anInt5063 = local272 * -1461317767;
						Class675.method35962(Class135.aClass135_32, -1, -1);
					}
					arg0.aClass418_1 = null;
					return true;
				} else {
					@Pc(1154) byte local1154;
					if (Class418.aClass418_152 == arg0.aClass418_1) {
						local1154 = local6.method22601();
						local87 = local6.method22617();
						Class605.method32077();
						Class202.method25546(local87, local1154);
						arg0.aClass418_1 = null;
						return true;
					} else if (arg0.aClass418_1 == Class418.aClass418_40) {
						client.anInt3470 = local6.method22627() * 1894467917;
						arg0.aClass418_1 = null;
						return true;
					} else {
						@Pc(1208) Class595 local1208;
						if (arg0.aClass418_1 == Class418.aClass418_93) {
							local272 = local6.method22653();
							Class605.method32077();
							if (local272 == -1) {
								Class70.anInt203 = 1899572639;
								Class142.anInt2017 = 309821991;
							} else {
								local1208 = client.aClass517_1.method30409();
								local280 = local272 >> 14 & 0x3FFF;
								local563 = local272 & 0x3FFF;
								local280 -= local1208.anInt5504 * -424199969;
								if (local280 < 0) {
									local280 = 0;
								} else if (local280 >= client.aClass517_1.method30411()) {
									local280 = client.aClass517_1.method30411();
								}
								local563 -= local1208.anInt5506 * -1166289421;
								if (local563 < 0) {
									local563 = 0;
								} else if (local563 >= client.aClass517_1.method30417()) {
									local563 = client.aClass517_1.method30417();
								}
								Class70.anInt203 = ((local280 << 9) + 256) * -1899572639;
								Class142.anInt2017 = ((local563 << 9) + 256) * -309821991;
							}
							arg0.aClass418_1 = null;
							return true;
						} else if (arg0.aClass418_1 == Class418.aClass418_99) {
							local272 = local6.method22483();
							client.anInt3417 = 1319341991;
							client.anInt3381 = local272 * 1139557399;
							client.anInt3443 = -287535830;
							client.aClass478_88.method29730(client.anInt3381 * -1450626137);
							Class35_Sub17.method17430();
							Class704.method36562();
							local87 = local6.method22483();
							client.anInt3489 = local87 * 824489645;
							local280 = local6.method22478();
							Class705.aClass77_Sub39_17 = new Class77_Sub39(local280);
							Class705.aClass77_Sub39_17.method22452(local6.aByteArray53, local6.anInt3089 * 31645619, local280);
							local6.anInt3089 += local280 * -1387468933;
							arg0.aClass418_1 = null;
							return false;
						} else if (arg0.aClass418_1 == Class418.aClass418_160) {
							if (Class222.method25761(client.anInt3390 * -1850530127)) {
								client.anInt3481 = (int) ((float) local6.method22483() * 2.5F) * 1961509087;
							} else {
								client.anInt3481 = local6.method22483() * -1284269534;
							}
							client.anInt3506 = client.anInt3413 * 1022906699;
							arg0.aClass418_1 = null;
							return true;
						} else {
							@Pc(1558) int local1558;
							@Pc(1565) int local1565;
							@Pc(1554) boolean local1554;
							if (arg0.aClass418_1 == Class418.aClass418_72) {
								client.anInt3503 = client.anInt3413 * 1316164627;
								if (arg0.anInt327 * -1013636781 == 0) {
									client.aString163 = null;
									client.aString162 = null;
									Class462.anInt4970 = 0;
									Class204.aClass50Array1 = null;
									arg0.aClass418_1 = null;
									return true;
								}
								client.aString162 = local6.method22523();
								local522 = local6.method22478() == 1;
								if (local522) {
									local6.method22523();
								}
								client.aString163 = local6.method22523();
								Class622.aByte173 = local6.method22481();
								local87 = local6.method22478();
								if (local87 == 255) {
									arg0.aClass418_1 = null;
									return true;
								}
								Class462.anInt4970 = local87 * -492511455;
								@Pc(1456) Class50[] local1456 = new Class50[100];
								for (local563 = 0; local563 < Class462.anInt4970 * -217094943; local563++) {
									local1456[local563] = new Class50();
									local1456[local563].aString10 = local6.method22523();
									local522 = local6.method22478() == 1;
									if (local522) {
										local1456[local563].aString9 = local6.method22523();
									} else {
										local1456[local563].aString9 = local1456[local563].aString10;
									}
									local1456[local563].aString8 = Class471.method29622(local1456[local563].aString9, Class33.aClass53_11);
									local1456[local563].anInt180 = local6.method22483() * 2127144567;
									local1456[local563].aByte2 = local6.method22481();
									local1456[local563].aString11 = local6.method22523();
									if (local1456[local563].aString9.equals(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aString82)) {
										Class47.aByte1 = local1456[local563].aByte2;
									}
								}
								local1554 = false;
								local1558 = Class462.anInt4970 * -217094943;
								while (local1558 > 0) {
									local1554 = true;
									local1558--;
									for (local1565 = 0; local1565 < local1558; local1565++) {
										if (local1456[local1565].aString8.compareTo(local1456[local1565 + 1].aString8) > 0) {
											@Pc(1584) Class50 local1584 = local1456[local1565];
											local1456[local1565] = local1456[local1565 + 1];
											local1456[local1565 + 1] = local1584;
											local1554 = false;
										}
									}
									if (local1554) {
										break;
									}
								}
								Class204.aClass50Array1 = local1456;
								arg0.aClass418_1 = null;
								return true;
							} else if (Class418.aClass418_89 == arg0.aClass418_1) {
								Class94_Sub4.aClass261_1.method26315(local6.method22483());
								arg0.aClass418_1 = null;
								return true;
							} else if (Class418.aClass418_151 == arg0.aClass418_1) {
								Class94_Sub4.aClass261_1.method26363();
								arg0.aClass418_1 = null;
								return true;
							} else if (Class418.aClass418_102 == arg0.aClass418_1) {
								local272 = local6.method22478();
								@Pc(1654) Class697 local1654 = (Class697) Class457.method29479(Class294.method27019(), local272);
								if (local1654 == null) {
									local1654 = Class697.aClass697_5;
								}
								Class516.method30380(local1654);
								arg0.aClass418_1 = null;
								return true;
							} else {
								@Pc(1702) int local1702;
								@Pc(1713) long local1713;
								@Pc(1718) Class77_Sub26 local1718;
								@Pc(1735) Class77_Sub26 local1735;
								if (arg0.aClass418_1 == Class418.aClass418_84) {
									local272 = local6.method22621();
									if (local272 == 65535) {
										local272 = -1;
									}
									local87 = local6.method22612();
									if (local87 == 65535) {
										local87 = -1;
									}
									local280 = local6.method22500();
									local563 = local6.method22648();
									Class605.method32077();
									for (local1702 = local272; local1702 <= local87; local1702++) {
										local1713 = ((long) local280 << 32) + (long) local1702;
										local1718 = (Class77_Sub26) client.aClass12_18.method173(local1713);
										if (local1718 != null) {
											local1735 = new Class77_Sub26(local563, local1718.anInt1559 * -1799641075);
											local1718.method24063();
										} else if (local1702 == -1) {
											local1735 = new Class77_Sub26(local563, Class155.method23628(local280).aClass77_Sub26_2.anInt1559 * -1799641075);
										} else {
											local1735 = new Class77_Sub26(local563, -1);
										}
										client.aClass12_18.method184(local1735, local1713);
									}
									arg0.aClass418_1 = null;
									return true;
								}
								@Pc(1774) String local1774;
								if (arg0.aClass418_1 == Class418.aClass418_169) {
									local1774 = local6.method22523();
									Class289.method26980(local1774);
									arg0.aClass418_1 = null;
									return true;
								}
								@Pc(1812) long local1812;
								@Pc(1826) Class416 local1826;
								if (Class418.aClass418_86 == arg0.aClass418_1) {
									local522 = local6.method22478() == 1;
									local628 = local6.method22523();
									local630 = local628;
									if (local522) {
										local630 = local6.method22523();
									}
									local1812 = local6.method22483();
									local1713 = local6.method22492();
									local1826 = (Class416) Class457.method29479(Class416.method28667(), local6.method22478());
									local1040 = local6.method22483();
									local665 = (local1812 << 32) + local1713;
									local667 = false;
									local669 = 0;
									while (true) {
										if (local669 >= 100) {
											if (local1826.aBoolean746 && Class19.method408(local630)) {
												local667 = true;
											}
											break;
										}
										if (client.aLongArray23[local669] == local665) {
											local667 = true;
											break;
										}
										local669++;
									}
									if (!local667) {
										client.aLongArray23[client.anInt3425 * 292282647] = local665;
										client.anInt3425 = (client.anInt3425 * 292282647 + 1) % 100 * -315136345;
										local725 = RuntimeException_Sub4.aClass41_2.method688(local1040).method22309(local6);
										if (local1826.anInt4720 * -512635923 == -1) {
											Class245.method26121(18, 0, local628, local630, local628, local725, null, local1040, local1826);
										} else {
											Class245.method26121(18, 0, Class152.method17433(local1826.anInt4720 * -512635923) + local628, Class152.method17433(local1826.anInt4720 * -512635923) + local630, local628, local725, null, local1040, local1826);
										}
									}
									arg0.aClass418_1 = null;
									return true;
								} else if (arg0.aClass418_1 == Class418.aClass418_148) {
									local272 = local6.method22612();
									local628 = local6.method22523();
									Class605.method32077();
									Class149.method23149(local272, local628);
									arg0.aClass418_1 = null;
									return true;
								} else if (Class418.aClass418_67 == arg0.aClass418_1) {
									if (!client.aBoolean630) {
										try {
											local272 = local6.method22598();
											local87 = local6.method22478();
											client.aClass248_1.method26141(local87).method26424(local272);
										} catch (@Pc(1994) RuntimeException local1994) {
											Class293.method27014(null, local1994);
											Class464.method29549(arg0);
										}
									}
									arg0.aClass418_1 = null;
									return true;
								} else {
									@Pc(2032) boolean local2032;
									if (Class418.aClass418_29 == arg0.aClass418_1) {
										client.anInt3508 = client.anInt3413 * 1382189519;
										local272 = local6.anInt3089 * 31645619;
										local87 = local6.method22483();
										local2032 = local6.method22478() == 1;
										@Pc(2037) Class241 local2037 = client.aClass243_1.method26054(local87);
										@Pc(2041) Class9 local2041 = local2037.method26002();
										if (local2041 == null || local2032) {
											local2037.method25999(client.anInterface26_1);
											local2041 = local2037.method26002();
										}
										while (arg0.anInt327 * -1013636781 - (local6.anInt3089 * 31645619 - local272) > 0) {
											@Pc(2070) Class438 local2070 = Class562.aClass80_Sub1_Sub1_2.method1949(local6);
											local2041.method128(local2070.anInt4927 * -608978823, local2070.anObject19);
										}
										arg0.aClass418_1 = null;
										return true;
									} else if (Class418.aClass418_43 == arg0.aClass418_1) {
										local272 = local6.method22478();
										@Pc(2100) Class699 local2100 = (Class699) Class457.method29479(Class110.method9150(), local272);
										if (local2100 == null) {
											local2100 = Class699.aClass699_4;
										}
										Class309.method27273(local2100);
										arg0.aClass418_1 = null;
										return true;
									} else if (arg0.aClass418_1 == Class418.aClass418_95) {
										local272 = local6.method22648();
										local87 = local6.method22612();
										local280 = local6.method22648();
										local563 = local6.method22648();
										local1702 = local6.method22653();
										@Pc(2143) Class595 local2143 = new Class595(local6.method22645());
										local1565 = local6.method22617();
										local992 = local6.method22598();
										local1040 = local6.method22648();
										Class605.method32077();
										Class698.method36475(local280, new Class77_Sub38_Sub4(local1565, local992, new Class672(local2143, local87)), new int[] { local563, local272, local1040, local1702 }, false);
										arg0.aClass418_1 = null;
										return true;
									} else {
										@Pc(2283) int local2283;
										@Pc(2241) int local2241;
										@Pc(2227) boolean local2227;
										@Pc(2214) long local2214;
										if (Class418.aClass418_131 == arg0.aClass418_1) {
											local522 = local6.method22478() == 1;
											local2214 = local6.method22483();
											local1812 = local6.method22492();
											local1713 = (local2214 << 32) + local1812;
											local2227 = false;
											@Pc(2233) Class77_Sub25 local2233 = local522 ? Class574.aClass77_Sub25_2 : Class494.aClass77_Sub25_1;
											if (local2233 == null) {
												local2227 = true;
											} else {
												for (local2241 = 0; local2241 < 100; local2241++) {
													if (client.aLongArray23[local2241] == local1713) {
														local2227 = true;
														break;
													}
												}
											}
											if (!local2227) {
												client.aLongArray23[client.anInt3425 * 292282647] = local1713;
												client.anInt3425 = (client.anInt3425 * 292282647 + 1) % 100 * -315136345;
												@Pc(2277) String local2277 = Class552.method30998(local6);
												local2283 = local522 ? 43 : 46;
												Class245.method26121(local2283, 0, "", "", "", local2277, local2233.aString49, -1, null);
											}
											arg0.aClass418_1 = null;
											return true;
										} else if (arg0.aClass418_1 == Class418.aClass418_81) {
											local272 = local6.method22478();
											local87 = local6.method22591();
											local280 = local87 >> 2;
											local563 = local87 & 0x3;
											local1702 = client.anIntArray326[local280];
											local1558 = local6.method22653();
											local1565 = local6.method22653();
											local992 = local1565 >> 28 & 0x3;
											local1040 = local1565 >> 14 & 0x3FFF;
											local2241 = local1565 & 0x3FFF;
											@Pc(2352) Class595 local2352 = client.aClass517_1.method30409();
											local1040 -= local2352.anInt5504 * -424199969;
											local2241 -= local2352.anInt5506 * -1166289421;
											Class40.method686(local992, local1040, local2241, local1702, local280, local563, local1558, local272);
											arg0.aClass418_1 = null;
											return true;
										} else if (Class418.aClass418_30 == arg0.aClass418_1) {
											Class597.aClass107_Sub1_2.method8940(local6, arg0.anInt327 * -1013636781);
											client.anInt3509 = client.anInt3413 * -1756281117;
											arg0.aClass418_1 = null;
											return true;
										} else if (arg0.aClass418_1 == Class418.aClass418_157) {
											client.aClass248_1.method26151();
											local272 = local6.method22478();
											for (local87 = 0; local87 < local272; local87++) {
												local280 = local6.method22500();
												@Pc(2427) Class264 local2427 = new Class264(local280);
												client.aClass248_1.method26143(local2427);
												local1702 = local6.method22478();
												for (local1558 = 0; local1558 < local1702; local1558++) {
													local2427.method26425(local6.method22500());
												}
												local1558 = local6.method22478();
												for (local1565 = 0; local1565 < local1558; local1565++) {
													local2427.method26408(local6.method22500());
												}
												for (local1565 = 0; local1565 < local1702; local1565++) {
													@Pc(2477) byte local2477 = local6.method22481();
													local2427.method26416(local1565, local2477);
													for (local1040 = 0; local1040 < local1558; local1040++) {
														if (local6.method22478() == 0) {
															local2427.method26449(local1565, local1040, null);
														} else {
															local2427.method26449(local1565, local1040, local6.method22500());
														}
													}
												}
											}
											client.aBoolean630 = false;
											arg0.aClass418_1 = null;
											return true;
										} else if (Class418.aClass418_92 == arg0.aClass418_1) {
											Class56.aClass93_Sub1_1.method6441();
											arg0.aClass418_1 = null;
											return false;
										} else if (Class418.aClass418_194 == arg0.aClass418_1) {
											local272 = local6.method22598();
											local87 = local6.method22591();
											if (local272 == 255) {
												local272 = -1;
												local87 = -1;
											}
											Class498.method30204(local272, local87);
											arg0.aClass418_1 = null;
											return true;
										} else if (arg0.aClass418_1 == Class418.aClass418_65) {
											if (!client.aBoolean630) {
												try {
													local272 = local6.method22589();
													local87 = local6.method22598();
													local2032 = local6.method22589() == 1;
													client.aClass248_1.method26141(local87).method26412(local272, local2032);
												} catch (@Pc(2593) RuntimeException local2593) {
													Class293.method27014(null, local2593);
													Class464.method29549(arg0);
												}
											}
											arg0.aClass418_1 = null;
											return true;
										} else if (arg0.aClass418_1 == Class418.aClass418_79) {
											arg0.aClass418_1 = null;
											return true;
										} else if (arg0.aClass418_1 == Class418.aClass418_56) {
											local272 = local6.method22621();
											local87 = local6.method22653();
											Class55.aClass124_1.aClass608_1.method32136((Class343) Class61.aClass35_Sub11_1.method18319(local272), local87);
											arg0.aClass418_1 = null;
											return true;
										} else if (arg0.aClass418_1 == Class418.aClass418_120) {
											client.anInt3507 = client.anInt3413 * -2062176397;
											@Pc(2655) Class242 local2655 = new Class242(local6, client.anInterface26_1);
											local2655.method26016(client.aClass243_1);
											arg0.aClass418_1 = null;
											return true;
										} else if (Class418.aClass418_76 == arg0.aClass418_1) {
											Class699.method36480(Class428.aClass428_10);
											arg0.aClass418_1 = null;
											return true;
										} else if (Class418.aClass418_198 == arg0.aClass418_1) {
											local522 = local6.method22598() == 1;
											local87 = local6.method22648();
											Class605.method32077();
											Class251.method26173(local87, local522);
											arg0.aClass418_1 = null;
											return true;
										} else if (arg0.aClass418_1 == Class418.aClass418_154) {
											local272 = local6.method22653();
											local87 = local6.method22478();
											local87 = -local87 - 2;
											Class605.method32077();
											Class25.method456(local272, 5, local87, 0);
											arg0.aClass418_1 = null;
											return true;
										} else if (Class418.aClass418_85 == arg0.aClass418_1) {
											local272 = local6.method22500();
											Class605.method32077();
											Class25.method456(local272, 5, client.anInt3389 * -643758853, 0);
											arg0.aClass418_1 = null;
											return true;
										} else if (Class418.aClass418_159 == arg0.aClass418_1) {
											local272 = local6.method22483();
											if (local272 == 65535) {
												local272 = -1;
											}
											local87 = local6.method22478();
											local280 = local6.method22483();
											local563 = local6.method22478();
											Class94_Sub4.aClass261_1.method26335(Class239.aClass239_10, local272, local87, local563, Class220.aClass220_2.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, 256, local280);
											arg0.aClass418_1 = null;
											return true;
										} else if (Class418.aClass418_46 == arg0.aClass418_1) {
											if (!client.aBoolean630) {
												try {
													local1154 = local6.method22603();
													local87 = local6.method22645();
													local280 = local6.method22478();
													client.aClass248_1.method26141(local280).method26432(local87, local1154);
												} catch (@Pc(2836) RuntimeException local2836) {
													Class293.method27014(null, local2836);
													Class464.method29549(arg0);
												}
											}
											arg0.aClass418_1 = null;
											return true;
										} else if (Class418.aClass418_27 == arg0.aClass418_1) {
											local272 = local6.method22612();
											local628 = local6.method22523();
											Class605.method32077();
											Class149.method23149(local272, local628);
											arg0.aClass418_1 = null;
											return true;
										} else {
											@Pc(2892) String local2892;
											if (Class418.aClass418_19 == arg0.aClass418_1) {
												local272 = local6.method22537();
												local87 = local6.method22500();
												local280 = local6.method22478();
												local640 = "";
												local2892 = local640;
												if ((local280 & 0x1) != 0) {
													local640 = local6.method22523();
													if ((local280 & 0x2) == 0) {
														local2892 = local640;
													} else {
														local2892 = local6.method22523();
													}
												}
												@Pc(2917) String local2917 = local6.method22523();
												if (local272 == 99) {
													Class51.method764(local2917);
												} else if (local272 == 98) {
													Class104_Sub1_Sub1_Sub2.method11486(local2917);
												} else if (local2892.equals("") || !Class19.method408(local2892)) {
													Class302.method27128(local272, local87, local640, local2892, local640, local2917, null);
												} else {
													arg0.aClass418_1 = null;
													return true;
												}
												arg0.aClass418_1 = null;
												return true;
											} else if (Class418.aClass418_94 == arg0.aClass418_1) {
												local272 = local6.method22612();
												if (local272 == 65535) {
													local272 = -1;
												}
												local87 = local6.method22598();
												Class94_Sub4.aClass261_1.method26368(local272, local87);
												arg0.aClass418_1 = null;
												return true;
											} else {
												@Pc(3021) Class416 local3021;
												@Pc(3035) Class104_Sub1_Sub1_Sub1_Sub1 local3035;
												@Pc(3031) long local3031;
												@Pc(3103) int local3103;
												@Pc(3033) boolean local3033;
												@Pc(3007) long local3007;
												if (Class418.aClass418_71 == arg0.aClass418_1) {
													local522 = local6.method22478() == 1;
													local628 = local6.method22523();
													local3007 = local6.method22483();
													local645 = local6.method22492();
													local3021 = (Class416) Class457.method29479(Class416.method28667(), local6.method22478());
													local992 = local6.method22483();
													local3031 = local645 + (local3007 << 32);
													local3033 = false;
													local3035 = null;
													@Pc(3041) Class77_Sub25 local3041 = local522 ? Class574.aClass77_Sub25_2 : Class494.aClass77_Sub25_1;
													if (local3041 == null) {
														local3033 = true;
													} else {
														local669 = 0;
														while (true) {
															if (local669 >= 100) {
																if (local3021.aBoolean746 && Class19.method408(local628)) {
																	local3033 = true;
																}
																break;
															}
															if (local3031 == client.aLongArray23[local669]) {
																local3033 = true;
																break;
															}
															local669++;
														}
													}
													if (!local3033) {
														client.aLongArray23[client.anInt3425 * 292282647] = local3031;
														client.anInt3425 = (client.anInt3425 * 292282647 + 1) % 100 * -315136345;
														local725 = RuntimeException_Sub4.aClass41_2.method688(local992).method22309(local6);
														local3103 = local522 ? 42 : 45;
														if (local3021.anInt4720 * -512635923 == -1) {
															Class245.method26121(local3103, 0, local628, local628, local628, local725, local3041.aString49, local992, local3021);
														} else {
															Class245.method26121(local3103, 0, Class152.method17433(local3021.anInt4720 * -512635923) + local628, Class152.method17433(local3021.anInt4720 * -512635923) + local628, local628, local725, local3041.aString49, local992, local3021);
														}
													}
													arg0.aClass418_1 = null;
													return true;
												}
												@Pc(3189) byte[] local3189;
												@Pc(3198) boolean local3198;
												if (Class418.aClass418_166 == arg0.aClass418_1) {
													if (Class706.aBoolean868 && Class184.aFrame1 != null) {
														Class196.method25463(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub9_2.method15194(), -1, -1, false);
													}
													local3189 = new byte[arg0.anInt327 * -1013636781 - 1];
													local3198 = local6.method22478() == 1;
													local6.method22182(local3189, 0, arg0.anInt327 * -1013636781 - 1);
													@Pc(3214) Class77_Sub39 local3214 = new Class77_Sub39(local3189);
													local640 = local3214.method22523();
													if (local3198) {
														local2892 = local3214.method22523();
														if (local2892.length() == 0) {
															local2892 = local640;
														}
														if (!client.aBoolean588 || Class293.aString184.startsWith("mac") || !Class244.method26113(local640, 1, Class413.aClass413_8.method28593())) {
															Class474.method29663(local2892, true, client.aBoolean591);
														}
													} else {
														Class474.method29663(local640, true, client.aBoolean591);
													}
													arg0.aClass418_1 = null;
													return true;
												} else if (Class418.aClass418_44 == arg0.aClass418_1) {
													local272 = local6.method22653();
													if (local272 != Class250.anInt3804 * 1816697759) {
														Class250.anInt3804 = local272 * -2075541409;
														Class675.method35962(Class135.aClass135_26, -1, -1);
													}
													arg0.aClass418_1 = null;
													return true;
												} else if (arg0.aClass418_1 == Class418.aClass418_165) {
													local272 = local6.method22483();
													if (local272 == 65535) {
														local272 = -1;
													}
													local87 = local6.method22478();
													local280 = local6.method22483();
													local563 = local6.method22478();
													local1702 = local6.method22483();
													Class94_Sub4.aClass261_1.method26335(Class239.aClass239_10, local272, local87, local563, Class220.aClass220_8.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, local1702, local280);
													arg0.aClass418_1 = null;
													return true;
												} else if (arg0.aClass418_1 == Class418.aClass418_128) {
													local272 = local6.method22483();
													Class133.method13670(local272);
													arg0.aClass418_1 = null;
													return true;
												} else if (arg0.aClass418_1 == Class418.aClass418_18) {
													client.anInt3453 = -1587880047;
													client.anInt3499 = client.anInt3413 * -664271315;
													arg0.aClass418_1 = null;
													return true;
												} else if (Class418.aClass418_64 == arg0.aClass418_1) {
													Class699.method36480(Class428.aClass428_4);
													arg0.aClass418_1 = null;
													return true;
												} else if (arg0.aClass418_1 == Class418.aClass418_49) {
													local272 = local6.method22645();
													local87 = local6.method22653();
													Class605.method32077();
													@Pc(3399) Class277 local3399 = Class155.method23628(local272);
													local3399.anInt3859 = local87 * 667449465;
													arg0.aClass418_1 = null;
													return true;
												} else {
													@Pc(3469) boolean local3469;
													if (Class418.aClass418_190 == arg0.aClass418_1) {
														local522 = local6.method22478() == 1;
														local628 = local6.method22523();
														local630 = local628;
														if (local522) {
															local630 = local6.method22523();
														}
														local640 = local6.method22523();
														local645 = local6.method22483();
														local650 = local6.method22492();
														local659 = (Class416) Class457.method29479(Class416.method28667(), local6.method22478());
														local2241 = local6.method22483();
														@Pc(3467) long local3467 = (local645 << 32) + local650;
														local3469 = false;
														local3103 = 0;
														while (true) {
															if (local3103 >= 100) {
																if (local659.aBoolean746 && Class19.method408(local630)) {
																	local3469 = true;
																}
																break;
															}
															if (client.aLongArray23[local3103] == local3467) {
																local3469 = true;
																break;
															}
															local3103++;
														}
														if (!local3469) {
															client.aLongArray23[client.anInt3425 * 292282647] = local3467;
															client.anInt3425 = (client.anInt3425 * 292282647 + 1) % 100 * -315136345;
															@Pc(3520) String local3520 = RuntimeException_Sub4.aClass41_2.method688(local2241).method22309(local6);
															if (local659.anInt4720 * -512635923 == -1) {
																Class245.method26121(20, 0, local628, local630, local628, local3520, local640, local2241, local659);
															} else {
																Class245.method26121(20, 0, Class152.method17433(local659.anInt4720 * -512635923) + local628, Class152.method17433(local659.anInt4720 * -512635923) + local630, local628, local3520, local640, local2241, local659);
															}
														}
														arg0.aClass418_1 = null;
														return true;
													} else if (arg0.aClass418_1 == Class418.aClass418_25) {
														local272 = local6.method22648();
														local87 = local6.method22645();
														local280 = local6.method22621();
														if (local280 == 65535) {
															local280 = -1;
														}
														Class605.method32077();
														Class651.method32953(local272, local280, local87);
														@Pc(3613) Class18 local3613 = (Class18) Class537.aClass35_Sub7_1.method18319(local280);
														Class247.method26132(local272, local3613.anInt63 * -993244079, local3613.anInt64 * 1327637973, local3613.anInt62 * -528739693);
														Class427.method28798(local272, local3613.anInt73 * -1667459827, local3613.anInt67 * 610101213, local3613.anInt65 * 102672307);
														arg0.aClass418_1 = null;
														return true;
													} else if (arg0.aClass418_1 == Class418.aClass418_180) {
														Class605.method32077();
														Class638.method32718();
														arg0.aClass418_1 = null;
														return true;
													} else if (arg0.aClass418_1 == Class418.aClass418_73) {
														Class276.aClass93_1 = new Class93(Class55.aClass80_Sub1_Sub2_1);
														arg0.aClass418_1 = null;
														return true;
													} else if (Class418.aClass418_53 == arg0.aClass418_1) {
														Class699.method36480(Class428.aClass428_2);
														arg0.aClass418_1 = null;
														return true;
													} else if (arg0.aClass418_1 == Class418.aClass418_185) {
														if (!client.aBoolean630) {
															try {
																local272 = local6.method22589();
																local87 = local6.method22478();
																local280 = local6.method22478();
																client.aClass248_1.method26141(local280).method26446(local272, local87);
															} catch (@Pc(3716) RuntimeException local3716) {
																Class293.method27014(null, local3716);
																Class464.method29549(arg0);
															}
														}
														arg0.aClass418_1 = null;
														return true;
													} else if (arg0.aClass418_1 == Class418.aClass418_9) {
														local272 = local6.method22589();
														Class544.aClass620_1.method32412(local272);
														local87 = local6.method22591();
														local280 = local6.method22645();
														Class55.aClass124_1.aClass623Array1[local272].method32447(local280);
														Class55.aClass124_1.aClass623Array1[local272].method32465(local87);
														client.anIntArray335[(client.anInt3523 += -1020312221) * 293889099 - 1 & 0x3F] = local272;
														arg0.aClass418_1 = null;
														return true;
													} else if (Class418.aClass418_61 == arg0.aClass418_1) {
														local272 = local6.method22648();
														local87 = local6.method22612();
														Class605.method32077();
														Class96_Sub8.method7198(local272, local87);
														arg0.aClass418_1 = null;
														return true;
													} else {
														@Pc(3865) int local3865;
														@Pc(3818) byte local3818;
														@Pc(3882) boolean local3882;
														@Pc(3899) int local3899;
														if (arg0.aClass418_1 == Class418.aClass418_70) {
															local1154 = local6.method22600();
															local3818 = local6.method22603();
															local280 = local6.method22478();
															local563 = local6.method22621();
															local1702 = local6.method22483();
															local1558 = local6.method22483();
															local1565 = local6.method22483();
															local992 = local6.method22621();
															local1040 = local6.method22591();
															local2241 = local6.method22589() * 4;
															local2283 = local6.method22478();
															if (local2283 == 255) {
																local2283 = -1;
															}
															local3865 = local6.method22487();
															local669 = local6.method22612();
															local3103 = local6.method22625();
															local3882 = (local280 & 0x1) != 0;
															@Pc(3891) boolean local3891 = (local280 & 0x2) != 0;
															local3899 = local3891 ? local280 >> 2 : -1;
															if (local3891) {
																local1040 = (byte) local1040;
															} else {
																local1040 *= 4;
															}
															@Pc(3913) Class595 local3913 = client.aClass517_1.method30409();
															@Pc(3920) int local3920 = local669 - local3913.anInt5504 * -848399938;
															@Pc(3927) int local3927 = local1565 - local3913.anInt5506 * 1962388454;
															local272 = local1154 + local3920;
															local87 = local3818 + local3927;
															if (local3920 >= 0 && local3927 >= 0 && local3920 < client.aClass517_1.method30411() * 2 && local3927 < client.aClass517_1.method30411() * 2 && local272 >= 0 && local87 >= 0 && local272 < client.aClass517_1.method30417() * 2 && local87 < client.aClass517_1.method30417() * 2 && local1558 != 65535) {
																local3920 *= 256;
																local3927 = local3927 * 256;
																local272 *= 256;
																local87 *= 256;
																local1040 <<= 0x2;
																local2241 <<= 0x2;
																local992 <<= 0x2;
																Class427.method28800(local1558, local3865, local3103, local3899, local1040, local2241, local3920, local3927, local272, local87, local1702, local563, local2283, local992, local3882, 0);
															}
															arg0.aClass418_1 = null;
															return true;
														} else if (Class418.aClass418_20 == arg0.aClass418_1) {
															local1774 = local6.method22523();
															@Pc(4039) Object[] local4039 = new Object[local1774.length() + 1];
															for (local280 = local1774.length() - 1; local280 >= 0; local280--) {
																if (local1774.charAt(local280) == 's') {
																	local4039[local280 + 1] = local6.method22523();
																} else {
																	local4039[local280 + 1] = Integer.valueOf(local6.method22500());
																}
															}
															local4039[0] = Integer.valueOf(local6.method22500());
															Class605.method32077();
															@Pc(4089) Class77_Sub41 local4089 = new Class77_Sub41();
															local4089.anObjectArray4 = local4039;
															Class72.method1019(local4089);
															arg0.aClass418_1 = null;
															return true;
														} else if (arg0.aClass418_1 == Class418.aClass418_197) {
															if (!client.aBoolean630) {
																try {
																	local272 = local6.method22591();
																	client.aClass248_1.method26149(local272);
																} catch (@Pc(4116) RuntimeException local4116) {
																	Class293.method27014(null, local4116);
																	Class464.method29549(arg0);
																}
															}
															arg0.aClass418_1 = null;
															return true;
														} else if (Class418.aClass418_163 == arg0.aClass418_1) {
															Class142.aString58 = arg0.anInt327 * -1013636781 > 2 ? local6.method22523() : Class44.aClass44_133.method713(Class128.aClass667_3);
															client.anInt3543 = (-1013636781 * arg0.anInt327 > 0 ? local6.method22483() : -1) * -490303723;
															if (client.anInt3543 * 1361725501 == 65535) {
																client.anInt3543 = 490303723;
															}
															arg0.aClass418_1 = null;
															return true;
														} else if (Class418.aClass418_113 == arg0.aClass418_1) {
															Class699.method36480(Class428.aClass428_3);
															arg0.aClass418_1 = null;
															return true;
														} else if (arg0.aClass418_1 == Class418.aClass418_101) {
															local272 = local6.method22617();
															local87 = local6.method22591();
															local280 = local6.method22591();
															local563 = local6.method22589();
															local1702 = local6.method22478();
															Class605.method32077();
															client.aBooleanArray16[local280] = true;
															client.anIntArray342[local280] = local563;
															client.anIntArray343[local280] = local1702;
															client.anIntArray344[local280] = local87;
															client.anIntArray319[local280] = local272;
															arg0.aClass418_1 = null;
															return true;
														} else if (Class418.aClass418_111 == arg0.aClass418_1) {
															local272 = local6.method22645();
															local87 = local6.method22645();
															local280 = local6.method22612();
															Class605.method32077();
															Class25.method456(local272, 3, local280, local87);
															arg0.aClass418_1 = null;
															return true;
														} else if (Class418.aClass418_117 == arg0.aClass418_1) {
															local272 = local6.method22500();
															local87 = local6.method22653();
															Class605.method32077();
															@Pc(4287) Class77_Sub38 local4287 = (Class77_Sub38) client.aClass12_20.method173((long) local272);
															@Pc(4293) Class77_Sub38 local4293 = (Class77_Sub38) client.aClass12_20.method173((long) local87);
															if (local4293 != null) {
																Class77_Sub41.method14838(local4293, local4287 == null || local4293.anInt3113 * 1225863589 != local4287.anInt3113 * 1225863589, false);
															}
															if (local4287 != null) {
																local4287.method24063();
																client.aClass12_20.method184(local4287, (long) local87);
															}
															@Pc(4329) Class277 local4329 = Class155.method23628(local272);
															if (local4329 != null) {
																Class461.method29531(local4329);
															}
															local4329 = Class155.method23628(local87);
															if (local4329 != null) {
																Class461.method29531(local4329);
																Class145.method15080(Class35_Sub11.aClass273Array1[local4329.anInt3863 * -1278450723 >>> 16], local4329, true);
															}
															if (-993629849 * client.anInt3459 != -1) {
																Class611.method32232(client.anInt3459 * -993629849, 1);
															}
															arg0.aClass418_1 = null;
															return true;
														} else if (arg0.aClass418_1 == Class418.aClass418_196) {
															client.anInt3479 = local6.method22487() * 11678093;
															client.anInt3506 = client.anInt3413 * 1022906699;
															arg0.aClass418_1 = null;
															return true;
														} else if (Class418.aClass418_173 == arg0.aClass418_1) {
															local272 = local6.method22478();
															local87 = local6.method22549();
															if (client.aClass536Array1[local272] != null) {
																client.aClass536Array1[local272].method30833(client.aClass517_1.method30435());
																client.aClass536Array1[local272] = null;
															}
															if (local87 != -1) {
																client.aClass536Array1[local272] = new Class536(Class284.aClass86_9, local6, local87);
															}
															arg0.aClass418_1 = null;
															return true;
														} else if (Class418.aClass418_68 == arg0.aClass418_1) {
															local272 = local6.method22483();
															local87 = local6.method22483();
															Class94_Sub4.aClass261_1.method26305(local272, local87);
															arg0.aClass418_1 = null;
															return true;
														} else {
															@Pc(4567) String local4567;
															if (Class418.aClass418_100 == arg0.aClass418_1) {
																local522 = local6.method22478() == 1;
																local628 = local6.method22523();
																local630 = local628;
																if (local522) {
																	local630 = local6.method22523();
																}
																local1812 = local6.method22483();
																local1713 = local6.method22492();
																local1826 = (Class416) Class457.method29479(Class416.method28667(), local6.method22478());
																local3031 = local1713 + (local1812 << 32);
																local3033 = false;
																local3865 = 0;
																while (true) {
																	if (local3865 >= 100) {
																		if (local1826.aBoolean746) {
																			if (client.aBoolean620 && !client.aBoolean616 || client.aBoolean599) {
																				local3033 = true;
																			} else if (Class19.method408(local630)) {
																				local3033 = true;
																			}
																		}
																		break;
																	}
																	if (local3031 == client.aLongArray23[local3865]) {
																		local3033 = true;
																		break;
																	}
																	local3865++;
																}
																if (!local3033) {
																	client.aLongArray23[client.anInt3425 * 292282647] = local3031;
																	client.anInt3425 = (client.anInt3425 * 292282647 + 1) % 100 * -315136345;
																	local4567 = Class37.method643(Class552.method30998(local6));
																	local669 = local1826.aBoolean745 ? 7 : 3;
																	if (local1826.anInt4720 * -512635923 == -1) {
																		Class245.method26121(local669, 0, local628, local630, local628, local4567, null, -1, local1826);
																	} else {
																		Class245.method26121(local669, 0, Class152.method17433(local1826.anInt4720 * -512635923) + local628, Class152.method17433(local1826.anInt4720 * -512635923) + local630, local628, local4567, null, -1, local1826);
																	}
																}
																arg0.aClass418_1 = null;
																return true;
															} else if (Class418.aClass418_48 == arg0.aClass418_1) {
																local272 = local6.method22500();
																local3198 = local6.method22589() == 1;
																Class605.method32077();
																Class77_Sub40.method14758(local272, local3198);
																arg0.aClass418_1 = null;
																return true;
															} else if (Class418.aClass418_34 == arg0.aClass418_1) {
																local272 = local6.method22483();
																if (local272 == 65535) {
																	local272 = -1;
																}
																local87 = local6.method22478();
																local280 = local6.method22483();
																local563 = local6.method22478();
																local1702 = local6.method22483();
																Class94_Sub4.aClass261_1.method26335(Class239.aClass239_10, local272, local87, local563, Class220.aClass220_8.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, local1702, local280);
																arg0.aClass418_1 = null;
																return true;
															} else if (Class418.aClass418_137 == arg0.aClass418_1) {
																if (!client.aBoolean630) {
																	try {
																		local1154 = local6.method22600();
																		local87 = local6.method22500();
																		local280 = local6.method22591();
																		client.aClass248_1.method26141(local280).method26420(local87, local1154);
																	} catch (@Pc(4741) RuntimeException local4741) {
																		Class293.method27014(null, local4741);
																		Class464.method29549(arg0);
																	}
																}
																arg0.aClass418_1 = null;
																return true;
															} else if (arg0.aClass418_1 == Class418.aClass418_17) {
																local272 = local6.method22500();
																Class605.method32077();
																Class25.method456(local272, 3, client.anInt3389 * -643758853, 0);
																arg0.aClass418_1 = null;
																return true;
															} else if (Class418.aClass418_192 == arg0.aClass418_1) {
																client.anInt3483 = client.anInt3413 * -771492423;
																local522 = local6.method22478() == 1;
																if (arg0.anInt327 * -1013636781 != 1) {
																	if (local522) {
																		Class199.aClass368_2 = new Class368(local6);
																	} else {
																		Class22.aClass368_1 = new Class368(local6);
																	}
																	arg0.aClass418_1 = null;
																	return true;
																}
																if (local522) {
																	Class199.aClass368_2 = null;
																} else {
																	Class22.aClass368_1 = null;
																}
																arg0.aClass418_1 = null;
																return true;
															} else if (Class418.aClass418_98 == arg0.aClass418_1) {
																local272 = local6.method22621();
																local87 = local6.method22478();
																@Pc(4845) int[] local4845 = new int[4];
																for (local563 = 0; local563 < 4; local563++) {
																	local4845[local563] = local6.method22653();
																}
																@Pc(4864) Class77_Sub6 local4864 = (Class77_Sub6) client.aClass12_22.method173((long) local272);
																if (local4864 != null) {
																	Class96_Sub5.method7145((Class104_Sub1_Sub1_Sub1) local4864.anObject5, local4845, local87, true);
																}
																arg0.aClass418_1 = null;
																return true;
															} else if (Class418.aClass418_77 == arg0.aClass418_1) {
																local272 = local6.method22478();
																local87 = local6.method22617();
																local2032 = (local272 & 0x1) == 1;
																Class301.method27118(local87, local2032);
																client.anIntArray334[(client.anInt3498 += -1459399321) * 816576087 - 1 & 0x3F] = local87;
																arg0.aClass418_1 = null;
																return true;
															} else if (Class418.aClass418_164 == arg0.aClass418_1) {
																local272 = local6.method22645();
																local87 = local6.method22617();
																Class55.aClass124_1.aClass608_1.method32135((Class75) Class562.aClass80_Sub1_Sub1_2.method18319(local87), local272);
																arg0.aClass418_1 = null;
																return true;
															} else if (Class418.aClass418_58 == arg0.aClass418_1) {
																local272 = local6.method22483();
																Class94_Sub4.aClass261_1.method26295(local272);
																arg0.aClass418_1 = null;
																return true;
															} else if (arg0.aClass418_1 == Class418.aClass418_118) {
																local272 = local6.method22483();
																local628 = local6.method22523();
																local280 = local6.method22483();
																local563 = local6.method22483();
																local958 = local6.method22478() == 1;
																Class8.aClass25_3 = Class680.aClass25_8;
																Exception_Sub1.aBoolean376 = local958;
																Class101_Sub1_Sub1.method20899(local272, local628, local280, local563);
																local3 = null;
																Class668.method33179(1);
																arg0.aClass418_1 = null;
																return false;
															} else if (Class418.aClass418_11 == arg0.aClass418_1) {
																local272 = local6.method22483();
																local87 = local6.method22478();
																local2032 = (local87 & 0x1) != 0;
																local1554 = (local87 & 0x2) != 0;
																Class681.method36080(local272, local2032);
																local1702 = local6.method22483();
																for (local1558 = 0; local1558 < local1702; local1558++) {
																	local1565 = local6.method22483();
																	local992 = local6.method22478();
																	if (local992 == 255) {
																		local992 = local6.method22500();
																	}
																	@Pc(5076) Class9 local5076 = null;
																	if (local1554) {
																		local2241 = local6.method22478();
																		if (local2241 > 0) {
																			local5076 = new Class9(Class77_Sub23.aClass80_Sub1_Sub2_2);
																			while (local2241-- > 0) {
																				@Pc(5097) Class438 local5097 = Class77_Sub23.aClass80_Sub1_Sub2_2.method1949(local6);
																				local5076.method128(local5097.anInt4927 * -608978823, local5097.anObject19);
																			}
																		}
																	}
																	Class192.method25434(local272, local1558, local1565 - 1, local992, local5076, local2032);
																}
																client.anIntArray334[(client.anInt3498 += -1459399321) * 816576087 - 1 & 0x3F] = local272;
																arg0.aClass418_1 = null;
																return true;
															} else if (Class418.aClass418_63 == arg0.aClass418_1) {
																Class699.method36480(Class428.aClass428_6);
																arg0.aClass418_1 = null;
																return true;
															} else if (arg0.aClass418_1 == Class418.aClass418_135) {
																Class699.method36480(Class428.aClass428_8);
																arg0.aClass418_1 = null;
																return true;
															} else if (arg0.aClass418_1 == Class418.aClass418_142) {
																local6.method22589();
																local272 = local6.method22645();
																local87 = local6.method22653();
																local280 = local6.method22653();
																local563 = local6.method22617();
																local1702 = local6.method22648();
																Class605.method32077();
																@Pc(5212) int[] local5212 = new int[] { local272, local280, local87, local1702 };
																client.anInt3459 = local563 * -1328962985;
																Class667.method33165(local563, local5212);
																Class290.method27000(false);
																Class469.method29595(client.anInt3459 * -993629849, local5212);
																for (local1565 = 0; local1565 < 108; local1565++) {
																	client.aBooleanArray17[local1565] = true;
																}
																arg0.aClass418_1 = null;
																return true;
															} else if (Class418.aClass418_138 == arg0.aClass418_1) {
																local522 = local6.method22589() == 1;
																Class605.method32077();
																Class661.aBoolean856 = local522;
																arg0.aClass418_1 = null;
																return true;
															} else if (Class418.aClass418_96 == arg0.aClass418_1) {
																Class94.method7655(local6.method22523());
																arg0.aClass418_1 = null;
																return true;
															} else if (arg0.aClass418_1 == Class418.aClass418_106) {
																local272 = local6.method22645();
																local87 = local6.method22645();
																Class605.method32077();
																Class51.method763(local87, local272);
																arg0.aClass418_1 = null;
																return true;
															} else if (arg0.aClass418_1 == Class418.aClass418_12) {
																Class118_Sub2.method10266(client.aClass517_1.anInt5122 * -1855809205);
																arg0.aClass418_1 = null;
																return true;
															} else if (Class418.aClass418_147 == arg0.aClass418_1) {
																local522 = local6.method22478() == 1;
																if (local522) {
																	Class264.method26451(3);
																} else {
																	Class264.method26451(2);
																}
																arg0.aClass418_1 = null;
																return true;
															} else if (arg0.aClass418_1 == Class418.aClass418_54) {
																local272 = local6.method22648();
																local87 = local6.method22653();
																local280 = local6.method22621();
																Class605.method32077();
																Class25.method456(local87, 5, local280, local272);
																arg0.aClass418_1 = null;
																return true;
															} else if (Class418.aClass418_52 == arg0.aClass418_1) {
																local272 = local6.method22483();
																if (local272 == 65535) {
																	local272 = -1;
																}
																local87 = local6.method22478();
																local280 = local6.method22483();
																local563 = local6.method22478();
																local1702 = local6.method22483();
																local1558 = local6.method22483();
																@Pc(5430) Class496 local5430 = Class94_Sub4.aClass261_1.method26331(Class239.aClass239_10, Class94_Sub4.aClass261_1, local272, local87, local563, Class220.aClass220_8.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, local1702, false);
																if (local5430 != null) {
																	Class94_Sub4.aClass261_1.method26286(local5430, local1558, local280);
																}
																arg0.aClass418_1 = null;
																return true;
															} else {
																@Pc(5480) boolean local5480;
																@Pc(5471) Class416 local5471;
																if (arg0.aClass418_1 == Class418.aClass418_16) {
																	local1774 = local6.method22523();
																	local2214 = local6.method22483();
																	local1812 = local6.method22492();
																	local5471 = (Class416) Class457.method29479(Class416.method28667(), local6.method22478());
																	local5480 = local6.method22478() == 1;
																	local992 = local6.method22483();
																	local3031 = local1812 + (local2214 << 32);
																	local3033 = false;
																	if (client.aClass243_1 == null) {
																		local3033 = true;
																	} else {
																		local3865 = 0;
																		while (true) {
																			if (local3865 >= 100) {
																				if (local5471.aBoolean746 && Class19.method408(local1774)) {
																					local3033 = true;
																				}
																				break;
																			}
																			if (client.aLongArray23[local3865] == local3031) {
																				local3033 = true;
																				break;
																			}
																			local3865++;
																		}
																	}
																	if (!local3033) {
																		client.aLongArray23[client.anInt3425 * 292282647] = local3031;
																		client.anInt3425 = (client.anInt3425 * 292282647 + 1) % 100 * -315136345;
																		local4567 = RuntimeException_Sub4.aClass41_2.method688(local992).method22309(local6);
																		local669 = local5480 ? 23 : 25;
																		if (local5471.anInt4720 * -512635923 == -1) {
																			Class245.method26121(local669, 0, local1774, local1774, local1774, local4567, client.aClass243_1.method26058(), local992, local5471);
																		} else {
																			Class245.method26121(local669, 0, Class152.method17433(local5471.anInt4720 * -512635923) + local1774, Class152.method17433(local5471.anInt4720 * -512635923) + local1774, local1774, local4567, client.aClass243_1.method26058(), local992, local5471);
																		}
																	}
																	arg0.aClass418_1 = null;
																	return true;
																} else if (Class418.aClass418_105 == arg0.aClass418_1) {
																	Class699.method36480(Class428.aClass428_9);
																	arg0.aClass418_1 = null;
																	return true;
																} else if (arg0.aClass418_1 == Class418.aClass418_45) {
																	if (!client.aBoolean630) {
																		try {
																			local272 = local6.method22591();
																			local87 = local6.method22478();
																			client.aClass248_1.method26141(local272).method26438(local87);
																		} catch (@Pc(5652) RuntimeException local5652) {
																			Class293.method27014(null, local5652);
																			Class464.method29549(arg0);
																		}
																	}
																	arg0.aClass418_1 = null;
																	return true;
																} else if (arg0.aClass418_1 == Class418.aClass418_124) {
																	@Pc(5672) Class651 local5672 = new Class651();
																	local3198 = local5672.method32894(local6);
																	client.aClass517_1.method30443().method32252(client.aClass517_1, local3198 ? local5672 : null, local5672.method32951());
																	arg0.aClass418_1 = null;
																	return true;
																} else if (Class418.aClass418_60 == arg0.aClass418_1) {
																	local272 = local6.method22653();
																	local87 = local6.method22483();
																	Class605.method32077();
																	Class691.method36350(local87, local272);
																	arg0.aClass418_1 = null;
																	return true;
																} else if (arg0.aClass418_1 == Class418.aClass418_66) {
																	Class619.method32395(Class589.aBoolean814);
																	arg0.aClass418_1 = null;
																	return false;
																} else if (Class418.aClass418_161 == arg0.aClass418_1) {
																	Class699.method36480(Class428.aClass428_12);
																	arg0.aClass418_1 = null;
																	return true;
																} else if (Class418.aClass418_177 == arg0.aClass418_1) {
																	local272 = local6.method22617();
																	local87 = local6.method22612();
																	local280 = local6.method22653();
																	local563 = local6.method22612();
																	Class605.method32077();
																	Class25.method456(local280, 7, local563 << 16 | local272, local87);
																	arg0.aClass418_1 = null;
																	return true;
																} else if (Class418.aClass418_104 == arg0.aClass418_1) {
																	local272 = local6.method22483();
																	local87 = local6.method22483();
																	local280 = local6.method22483();
																	Class605.method32077();
																	if (Class35_Sub11.aClass273Array1[local272] != null) {
																		for (local563 = local87; local563 < local280; local563++) {
																			local1702 = local6.method22492();
																			if (local563 < Class35_Sub11.aClass273Array1[local272].aClass277Array2.length && Class35_Sub11.aClass273Array1[local272].aClass277Array2[local563] != null) {
																				Class35_Sub11.aClass273Array1[local272].aClass277Array2[local563].anInt3862 = local1702 * 1391502683;
																			}
																		}
																	}
																	arg0.aClass418_1 = null;
																	return true;
																} else if (arg0.aClass418_1 == Class418.aClass418_41) {
																	local272 = local6.method22500();
																	local87 = local6.method22645();
																	Class605.method32077();
																	Class25.method456(local87, 1, local272, -1);
																	arg0.aClass418_1 = null;
																	return true;
																} else if (arg0.aClass418_1 == Class418.aClass418_37) {
																	client.anInt3507 = client.anInt3413 * -2062176397;
																	if (arg0.anInt327 * -1013636781 == 0) {
																		client.aClass243_1 = null;
																	} else {
																		client.aClass243_1 = new Class243(0L, local6, true, client.anInterface26_1);
																	}
																	arg0.aClass418_1 = null;
																	return true;
																} else if (Class418.aClass418_7 == arg0.aClass418_1) {
																	local272 = local6.method22621();
																	local87 = local6.method22598();
																	Class55.aClass124_1.aClass608_1.method32136((Class343) Class61.aClass35_Sub11_1.method18319(local272), local87);
																	arg0.aClass418_1 = null;
																	return true;
																} else if (Class418.aClass418_171 == arg0.aClass418_1) {
																	local272 = local6.method22500();
																	local87 = local6.method22645();
																	local280 = local6.method22500();
																	local563 = local6.method22500();
																	local1702 = local6.method22617();
																	local1558 = local6.method22598();
																	local1565 = local6.method22653();
																	Class605.method32077();
																	Class698.method36475(local563, new Class77_Sub38(local1702, local1558), new int[] { local280, local1565, local87, local272 }, false);
																	arg0.aClass418_1 = null;
																	return true;
																} else if (arg0.aClass418_1 == Class418.aClass418_115) {
																	local272 = local6.method22478();
																	local87 = local6.method22500();
																	local280 = local6.method22617();
																	local563 = local6.method22627();
																	@Pc(6022) Class77_Sub6 local6022 = (Class77_Sub6) client.aClass12_22.method173((long) local280);
																	if (local6022 != null) {
																		@Pc(6029) Class104_Sub1_Sub1_Sub1_Sub1 local6029 = (Class104_Sub1_Sub1_Sub1_Sub1) local6022.anObject5;
																		if (local6029.aClass323_1 == null) {
																			local6029.aClass323_1 = new Class323(local6029.aClass333_1);
																		}
																		local6029.aClass323_1.anIntArray433[local272] = local87;
																		local6029.aClass323_1.aShortArray113[local272] = (short) local563;
																	}
																	arg0.aClass418_1 = null;
																	return true;
																} else if (Class418.aClass418_158 == arg0.aClass418_1) {
																	if (Class276.aClass93_1 == null) {
																		Class276.aClass93_1 = new Class93(Class55.aClass80_Sub1_Sub2_1);
																	}
																	@Pc(6075) Class438 local6075 = Class55.aClass80_Sub1_Sub2_1.method1949(local6);
																	Class276.aClass93_1.anInterface3_2.method128(local6075.anInt4927 * -608978823, local6075.anObject19);
																	client.anIntArray346[(client.anInt3385 += 882640195) * -1669615765 - 1 & 0x3F] = local6075.anInt4927 * -608978823;
																	arg0.aClass418_1 = null;
																	return true;
																} else if (arg0.aClass418_1 == Class418.aClass418_47) {
																	Class468.anInt4988 = (local6.method22600() << 3) * 128230813;
																	Class421.anInt4804 = local6.method22598() * -1705392999;
																	Class86.anInt2797 = (local6.method22603() << 3) * 1849161643;
																	while (local6.anInt3089 * 31645619 < arg0.anInt327 * -1013636781) {
																		@Pc(6149) Class428 local6149 = Class281.method26682()[local6.method22478()];
																		Class699.method36480(local6149);
																	}
																	arg0.aClass418_1 = null;
																	return true;
																} else if (Class418.aClass418_150 == arg0.aClass418_1) {
																	Class86.anInt2797 = (local6.method22481() << 3) * 1849161643;
																	Class421.anInt4804 = local6.method22478() * -1705392999;
																	Class468.anInt4988 = (local6.method22603() << 3) * 128230813;
																	@Pc(6188) Class595 local6188 = client.aClass517_1.method30409();
																	for (@Pc(6193) Class77_Sub9 local6193 = (Class77_Sub9) client.aClass12_19.method190(); local6193 != null; local6193 = (Class77_Sub9) client.aClass12_19.method192()) {
																		local280 = (int) (local6193.aLong229 * 8258869577519436579L >> 28 & 0x3L);
																		local563 = (int) (local6193.aLong229 * 8258869577519436579L & 0x3FFFL);
																		local1702 = local563 - local6188.anInt5504 * -424199969;
																		local1558 = (int) (local6193.aLong229 * 8258869577519436579L >> 14 & 0x3FFFL);
																		local1565 = local1558 - local6188.anInt5506 * -1166289421;
																		if (local280 == Class421.anInt4804 * -1729998935 && local1702 >= Class468.anInt4988 * -370014027 && local1702 < Class468.anInt4988 * -370014027 + 8 && local1565 >= Class86.anInt2797 * -765768957 && local1565 < Class86.anInt2797 * -765768957 + 8) {
																			local6193.method24063();
																			if (local1702 >= 0 && local1565 >= 0 && local1702 < client.aClass517_1.method30411() && local1565 < client.aClass517_1.method30417()) {
																				Class138.method14218(Class421.anInt4804 * -1729998935, local1702, local1565);
																			}
																		}
																	}
																	@Pc(6302) Class77_Sub4 local6302;
																	for (local6302 = (Class77_Sub4) Class77_Sub4.aClass695_17.method36395(); local6302 != null; local6302 = (Class77_Sub4) Class77_Sub4.aClass695_17.method36406()) {
																		if (local6302.anInt1452 * -1522052283 >= Class468.anInt4988 * -370014027 && local6302.anInt1452 * -1522052283 < Class468.anInt4988 * -370014027 + 8 && local6302.anInt1454 * -1246362377 >= Class86.anInt2797 * -765768957 && local6302.anInt1454 * -1246362377 < Class86.anInt2797 * -765768957 + 8 && Class421.anInt4804 * -1729998935 == local6302.anInt1456 * -511427777) {
																			local6302.aBoolean324 = true;
																		}
																	}
																	for (local6302 = (Class77_Sub4) Class77_Sub4.aClass695_18.method36395(); local6302 != null; local6302 = (Class77_Sub4) Class77_Sub4.aClass695_18.method36406()) {
																		if (local6302.anInt1452 * -1522052283 >= Class468.anInt4988 * -370014027 && local6302.anInt1452 * -1522052283 < Class468.anInt4988 * -370014027 + 8 && local6302.anInt1454 * -1246362377 >= Class86.anInt2797 * -765768957 && local6302.anInt1454 * -1246362377 < Class86.anInt2797 * -765768957 + 8 && Class421.anInt4804 * -1729998935 == local6302.anInt1456 * -511427777) {
																			local6302.aBoolean324 = true;
																		}
																	}
																	arg0.aClass418_1 = null;
																	return true;
																} else {
																	@Pc(6466) long local6466;
																	@Pc(6468) boolean local6468;
																	if (arg0.aClass418_1 == Class418.aClass418_182) {
																		local1774 = local6.method22523();
																		local2214 = local6.method22483();
																		local1812 = local6.method22492();
																		local5471 = (Class416) Class457.method29479(Class416.method28667(), local6.method22478());
																		local5480 = local6.method22478() == 1;
																		local6466 = local1812 + (local2214 << 32);
																		local6468 = false;
																		if (client.aClass243_1 == null) {
																			local6468 = true;
																		} else {
																			local2283 = 0;
																			while (true) {
																				if (local2283 >= 100) {
																					if (local5471.aBoolean746) {
																						if (client.aBoolean620 && !client.aBoolean616 || client.aBoolean599) {
																							local6468 = true;
																						} else if (Class19.method408(local1774)) {
																							local6468 = true;
																						}
																					}
																					break;
																				}
																				if (local6466 == client.aLongArray23[local2283]) {
																					local6468 = true;
																					break;
																				}
																				local2283++;
																			}
																		}
																		if (!local6468) {
																			client.aLongArray23[client.anInt3425 * 292282647] = local6466;
																			client.anInt3425 = (client.anInt3425 * 292282647 + 1) % 100 * -315136345;
																			@Pc(6531) String local6531 = Class37.method643(Class552.method30998(local6));
																			local3865 = local5480 ? 22 : 24;
																			if (local5471.anInt4720 * -512635923 == -1) {
																				Class245.method26121(local3865, 0, local1774, local1774, local1774, local6531, client.aClass243_1.method26058(), -1, local5471);
																			} else {
																				Class245.method26121(local3865, 0, Class152.method17433(local5471.anInt4720 * -512635923) + local1774, Class152.method17433(local5471.anInt4720 * -512635923) + local1774, local1774, local6531, client.aClass243_1.method26058(), -1, local5471);
																			}
																		}
																		arg0.aClass418_1 = null;
																		return true;
																	} else if (arg0.aClass418_1 == Class418.aClass418_21) {
																		Class55.aClass124_1.aClass608_1.method32134();
																		client.anInt3497 += 1330702400;
																		arg0.aClass418_1 = null;
																		return true;
																	} else if (arg0.aClass418_1 == Class418.aClass418_13) {
																		local272 = local6.method22598();
																		local87 = local6.method22653();
																		Class605.method32077();
																		Class291.method27003(local87, local272);
																		arg0.aClass418_1 = null;
																		return true;
																	} else if (arg0.aClass418_1 == Class418.aClass418_59) {
																		local272 = local6.method22653();
																		local87 = local6.method22589();
																		local280 = local6.method22612();
																		local563 = local6.method22645();
																		local1702 = local6.method22621();
																		local1558 = local6.method22653();
																		local1565 = local6.method22645();
																		local992 = local6.method22645();
																		Class605.method32077();
																		Class698.method36475(local1565, new Class77_Sub38_Sub1(local280, local87, local1702), new int[] { local1558, local992, local272, local563 }, false);
																		arg0.aClass418_1 = null;
																		return true;
																	} else if (arg0.aClass418_1 == Class418.aClass418_116) {
																		client.anInt3478 = local6.method22478() * -1948788837;
																		client.anInt3506 = client.anInt3413 * 1022906699;
																		arg0.aClass418_1 = null;
																		return true;
																	} else if (arg0.aClass418_1 == Class418.aClass418_10) {
																		local272 = local6.method22645();
																		local87 = local6.method22645();
																		Class605.method32077();
																		Class251.method26172(local87, local272);
																		arg0.aClass418_1 = null;
																		return true;
																	} else if (Class418.aClass418_78 == arg0.aClass418_1) {
																		local272 = local6.method22653();
																		local87 = local6.method22612();
																		local280 = local6.method22621();
																		local563 = local6.method22478();
																		Class605.method32077();
																		Class110.method9161(local272, local563, local280, local87);
																		arg0.aClass418_1 = null;
																		return true;
																	} else if (Class418.aClass418_108 == arg0.aClass418_1) {
																		Class94_Sub4.aClass261_1.method26312(Class220.aClass220_2.method25727());
																		arg0.aClass418_1 = null;
																		return true;
																	} else if (Class418.aClass418_140 == arg0.aClass418_1) {
																		local272 = local6.method22483();
																		Class94_Sub4.aClass261_1.method26292(local272);
																		arg0.aClass418_1 = null;
																		return true;
																	} else if (arg0.aClass418_1 == Class418.aClass418_24) {
																		local1774 = local6.method22523();
																		local628 = Class37.method643(Class552.method30998(local6));
																		Class302.method27128(6, 0, local1774, local1774, local1774, local628, null);
																		arg0.aClass418_1 = null;
																		return true;
																	} else if (arg0.aClass418_1 == Class418.aClass418_32) {
																		local272 = local6.method22645();
																		local1208 = new Class595(local6.method22653());
																		local280 = local6.method22589();
																		local563 = local280 >> 2;
																		local1702 = local280 & 0x3;
																		local1558 = local6.method22653();
																		local1565 = local6.method22500();
																		local992 = local6.method22653();
																		local1040 = local6.method22621();
																		local2241 = local6.method22500();
																		local2283 = local6.method22589();
																		local3865 = local6.method22653();
																		Class605.method32077();
																		Class698.method36475(local1558, new Class77_Sub38_Sub3(local1040, local2283, new Class678(local1208, local563, local1702, local3865)), new int[] { local1565, local2241, local272, local992 }, false);
																		arg0.aClass418_1 = null;
																		return true;
																	} else if (Class418.aClass418_136 == arg0.aClass418_1) {
																		local272 = local6.method22621();
																		local87 = local6.method22645();
																		Class605.method32077();
																		Class202.method25546(local272, local87);
																		arg0.aClass418_1 = null;
																		return true;
																	} else if (arg0.aClass418_1 == Class418.aClass418_188) {
																		client.aClass632_1 = (Class632) Class457.method29479(Class632.method32644(), local6.method22591());
																		if (client.aClass632_1 == null) {
																			client.aClass632_1 = Class632.aClass632_3;
																		}
																		arg0.aClass418_1 = null;
																		return true;
																	} else if (Class418.aClass418_36 == arg0.aClass418_1) {
																		local272 = local6.method22478();
																		local272 = -local272 - 2;
																		client.aMap15.remove(local272);
																		arg0.aClass418_1 = null;
																		return true;
																	} else if (Class418.aClass418_186 == arg0.aClass418_1) {
																		if (!client.aBoolean630) {
																			try {
																				local272 = local6.method22648();
																				local3818 = local6.method22603();
																				client.aClass248_1.method26147(new Class264(local272), local3818);
																			} catch (@Pc(7042) RuntimeException local7042) {
																				Class293.method27014(null, local7042);
																				Class464.method29549(arg0);
																			}
																		}
																		arg0.aClass418_1 = null;
																		return true;
																	} else if (Class418.aClass418_119 == arg0.aClass418_1) {
																		for (local272 = 0; local272 < client.aClass104_Sub1_Sub1_Sub1_Sub2Array1.length; local272++) {
																			if (client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local272] != null) {
																				client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local272].anIntArray272 = null;
																				client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local272].aClass151_3.method23401(-1);
																			}
																		}
																		for (local272 = 0; local272 < client.anInt3438 * 759971875; local272++) {
																			((Class104_Sub1_Sub1_Sub1) client.aClass77_Sub6Array1[local272].anObject5).anIntArray272 = null;
																			((Class104_Sub1_Sub1_Sub1) client.aClass77_Sub6Array1[local272].anObject5).aClass151_3.method23401(-1);
																		}
																		arg0.aClass418_1 = null;
																		return true;
																	} else if (Class418.aClass418_134 == arg0.aClass418_1) {
																		Class11.method170();
																		arg0.aClass418_1 = null;
																		return false;
																	} else {
																		@Pc(7135) Class77_Sub39_Sub1 local7135;
																		if (Class418.aClass418_97 == arg0.aClass418_1) {
																			local7135 = new Class77_Sub39_Sub1(arg0.anInt327 * -1013636781);
																			System.arraycopy(arg0.aClass77_Sub39_Sub1_1.aByteArray53, arg0.aClass77_Sub39_Sub1_1.anInt3089 * 31645619, local7135.aByteArray53, 0, arg0.anInt327 * -1013636781);
																			Class96_Sub11.method19914();
																			if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub40_1.method16206() == 1) {
																				Class196.aClass514_1.method30351(new Class516(Class505.aClass505_5, local7135));
																			} else {
																				client.aClass517_1.method30488(new Class516(Class505.aClass505_5, local7135));
																			}
																			arg0.aClass418_1 = null;
																			return false;
																		} else if (Class418.aClass418_189 == arg0.aClass418_1) {
																			local272 = local6.method22589();
																			Class605.method32077();
																			client.anInt3488 = local272 * -1931733099;
																			arg0.aClass418_1 = null;
																			return true;
																		} else if (arg0.aClass418_1 == Class418.aClass418_80) {
																			Class276.aClass93_1 = null;
																			arg0.aClass418_1 = null;
																			return true;
																		} else if (Class418.aClass418_187 == arg0.aClass418_1) {
																			local272 = local6.method22621();
																			local87 = local6.method22483();
																			Class605.method32077();
																			Class115_Sub3.method21239(local87, local272, 0);
																			arg0.aClass418_1 = null;
																			return true;
																		} else if (Class418.aClass418_26 == arg0.aClass418_1) {
																			local1774 = local6.method22523();
																			local87 = local6.method22483();
																			local280 = local6.method22483();
																			local563 = local6.method22483();
																			Class8.aClass25_4.aString5 = local1774;
																			Class8.aClass25_4.anInt122 = local87 * 1619197921;
																			Class8.aClass25_4.anInt120 = local280 * 1852523987;
																			Class8.aClass25_4.anInt121 = local563 * -102059163;
																			arg0.aClass418_1 = null;
																			return true;
																		} else if (arg0.aClass418_1 == Class418.aClass418_145) {
																			Class400.method28485(local6, arg0.anInt327 * -1013636781);
																			arg0.aClass418_1 = null;
																			return true;
																		} else {
																			@Pc(7342) Class77_Sub6 local7342;
																			if (Class418.aClass418_74 == arg0.aClass418_1) {
																				local522 = local6.method22478() == 1;
																				local628 = local6.method22523();
																				local3007 = local6.method22483();
																				local645 = local6.method22492();
																				local3021 = (Class416) Class457.method29479(Class416.method28667(), local6.method22478());
																				local6466 = (local3007 << 32) + local645;
																				local6468 = false;
																				local7342 = null;
																				@Pc(7348) Class77_Sub25 local7348 = local522 ? Class574.aClass77_Sub25_2 : Class494.aClass77_Sub25_1;
																				if (local7348 == null) {
																					local6468 = true;
																				} else {
																					local3865 = 0;
																					while (true) {
																						if (local3865 >= 100) {
																							if (local3021.aBoolean746) {
																								if (client.aBoolean620 && !client.aBoolean616 || client.aBoolean599) {
																									local6468 = true;
																								} else if (Class19.method408(local628)) {
																									local6468 = true;
																								}
																							}
																							break;
																						}
																						if (client.aLongArray23[local3865] == local6466) {
																							local6468 = true;
																							break;
																						}
																						local3865++;
																					}
																				}
																				if (!local6468) {
																					client.aLongArray23[client.anInt3425 * 292282647] = local6466;
																					client.anInt3425 = (client.anInt3425 * 292282647 + 1) % 100 * -315136345;
																					local4567 = Class37.method643(Class552.method30998(local6));
																					local669 = local522 ? 41 : 44;
																					if (local3021.anInt4720 * -512635923 == -1) {
																						Class245.method26121(local669, 0, local628, local628, local628, local4567, local7348.aString49, -1, local3021);
																					} else {
																						Class245.method26121(local669, 0, Class152.method17433(local3021.anInt4720 * -512635923) + local628, Class152.method17433(local3021.anInt4720 * -512635923) + local628, local628, local4567, local7348.aString49, -1, local3021);
																					}
																				}
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_183) {
																				local272 = local6.method22500();
																				Class386.aClass355_1 = new Class355(local272);
																				@Pc(7496) Thread local7496 = new Thread(Class386.aClass355_1);
																				local7496.setPriority(1);
																				local7496.start();
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_107 == arg0.aClass418_1) {
																				Class468.anInt4988 = (local6.method22481() << 3) * 128230813;
																				Class421.anInt4804 = local6.method22598() * -1705392999;
																				Class86.anInt2797 = (local6.method22481() << 3) * 1849161643;
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_143) {
																				local272 = local6.method22500();
																				local87 = local6.method22500();
																				@Pc(7555) Class77_Sub20 local7555 = Class365.method28132(Class414.aClass414_116, arg0.aClass16_1);
																				local7555.aClass77_Sub39_Sub1_2.method22578(client.anInt3362 * 1720947399);
																				local7555.aClass77_Sub39_Sub1_2.method22417(local272);
																				local7555.aClass77_Sub39_Sub1_2.method22635(local87);
																				arg0.method2004(local7555);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_193) {
																				local272 = local6.method22627();
																				local87 = local6.method22645();
																				local280 = local6.method22625();
																				Class605.method32077();
																				Class519.method30567(local87, local272, local280);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_174) {
																				local272 = local6.method22589();
																				local87 = local6.method22478();
																				local280 = local6.method22621() << 2;
																				local563 = local6.method22598();
																				local1702 = local6.method22598();
																				Class605.method32077();
																				Class87.method4253(local1702, local272, local280, local87, local563, true);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_176) {
																				local522 = local6.method22478() == 1;
																				@Pc(7673) byte[] local7673 = new byte[arg0.anInt327 * -1013636781 - 1];
																				local6.method22533(local7673, 0, arg0.anInt327 * -1013636781 - 1);
																				Class117.method10869(local522, local7673);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_139) {
																				local1774 = local6.method22523();
																				local2032 = local6.method22478() == 1;
																				if (local2032) {
																					local628 = local6.method22523();
																				} else {
																					local628 = local1774;
																				}
																				local563 = local6.method22483();
																				@Pc(7727) byte local7727 = local6.method22481();
																				local967 = false;
																				if (local7727 == -128) {
																					local967 = true;
																				}
																				if (local967) {
																					if (Class462.anInt4970 * -217094943 == 0) {
																						arg0.aClass418_1 = null;
																						return true;
																					}
																					local5480 = false;
																					for (local1565 = 0; local1565 < Class462.anInt4970 * -217094943 && (!Class204.aClass50Array1[local1565].aString9.equals(local628) || Class204.aClass50Array1[local1565].anInt180 * 1829245767 != local563); local1565++) {
																					}
																					if (local1565 < Class462.anInt4970 * -217094943) {
																						while (local1565 < Class462.anInt4970 * -217094943 - 1) {
																							Class204.aClass50Array1[local1565] = Class204.aClass50Array1[local1565 + 1];
																							local1565++;
																						}
																						Class462.anInt4970 -= -492511455;
																						Class204.aClass50Array1[Class462.anInt4970 * -217094943] = null;
																					}
																				} else {
																					local1013 = local6.method22523();
																					@Pc(7814) Class50 local7814 = new Class50();
																					local7814.aString10 = local1774;
																					local7814.aString9 = local628;
																					local7814.aString8 = Class471.method29622(local7814.aString9, Class33.aClass53_11);
																					local7814.anInt180 = local563 * 2127144567;
																					local7814.aByte2 = local7727;
																					local7814.aString11 = local1013;
																					for (local1040 = Class462.anInt4970 * -217094943 - 1; local1040 >= 0; local1040--) {
																						local2241 = Class204.aClass50Array1[local1040].aString8.compareTo(local7814.aString8);
																						if (local2241 == 0) {
																							Class204.aClass50Array1[local1040].anInt180 = local563 * 2127144567;
																							Class204.aClass50Array1[local1040].aByte2 = local7727;
																							Class204.aClass50Array1[local1040].aString11 = local1013;
																							if (local628.equals(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aString82)) {
																								Class47.aByte1 = local7727;
																							}
																							client.anInt3503 = client.anInt3413 * 1316164627;
																							arg0.aClass418_1 = null;
																							return true;
																						}
																						if (local2241 < 0) {
																							break;
																						}
																					}
																					if (Class462.anInt4970 * -217094943 >= Class204.aClass50Array1.length) {
																						arg0.aClass418_1 = null;
																						return true;
																					}
																					for (local2241 = Class462.anInt4970 * -217094943 - 1; local2241 > local1040; local2241--) {
																						Class204.aClass50Array1[local2241 + 1] = Class204.aClass50Array1[local2241];
																					}
																					if (Class462.anInt4970 * -217094943 == 0) {
																						Class204.aClass50Array1 = new Class50[100];
																					}
																					Class204.aClass50Array1[local1040 + 1] = local7814;
																					Class462.anInt4970 += -492511455;
																					if (local628.equals(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aString82)) {
																						Class47.aByte1 = local7727;
																					}
																				}
																				client.anInt3503 = client.anInt3413 * 1316164627;
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_141 == arg0.aClass418_1) {
																				Class699.method36480(Class428.aClass428_15);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_23 == arg0.aClass418_1) {
																				while (local6.anInt3089 * 31645619 < arg0.anInt327 * -1013636781) {
																					local272 = local6.method22478();
																					local3198 = (local272 & 0x1) == 1;
																					local630 = local6.method22523();
																					local640 = local6.method22523();
																					local2892 = local6.method22523();
																					for (local1558 = 0; local1558 < client.anInt3532 * 2103713403; local1558++) {
																						@Pc(8019) Class217 local8019 = client.aClass217Array1[local1558];
																						if (local3198) {
																							if (local640.equals(local8019.aString169)) {
																								local8019.aString169 = local630;
																								local8019.aString171 = local640;
																								local630 = null;
																								break;
																							}
																						} else if (local630.equals(local8019.aString169)) {
																							local8019.aString169 = local630;
																							local8019.aString171 = local640;
																							local8019.aString170 = local2892;
																							local630 = null;
																							break;
																						}
																					}
																					if (local630 != null && client.anInt3532 * 2103713403 < 400) {
																						@Pc(8066) Class217 local8066 = new Class217();
																						client.aClass217Array1[client.anInt3532 * 2103713403] = local8066;
																						local8066.aString169 = local630;
																						local8066.aString171 = local640;
																						local8066.aString170 = local2892;
																						local8066.aBoolean642 = (local272 & 0x2) == 2;
																						client.anInt3532 += 1662324915;
																					}
																				}
																				client.anInt3499 = client.anInt3413 * -664271315;
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_168) {
																				client.anInt3504 = client.anInt3413 * 930325597;
																				local522 = local6.method22478() == 1;
																				if (arg0.anInt327 * -1013636781 != 1) {
																					if (local522) {
																						Class574.aClass77_Sub25_2 = new Class77_Sub25(local6);
																					} else {
																						Class494.aClass77_Sub25_1 = new Class77_Sub25(local6);
																					}
																					arg0.aClass418_1 = null;
																					return true;
																				}
																				if (local522) {
																					Class574.aClass77_Sub25_2 = null;
																				} else {
																					Class494.aClass77_Sub25_1 = null;
																				}
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_179 == arg0.aClass418_1) {
																				local272 = local6.method22483();
																				Class94_Sub4.aClass261_1.method26290(local272);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_170) {
																				local1154 = local6.method22603();
																				local87 = local6.method22617();
																				Class55.aClass124_1.aClass608_1.method32135((Class75) Class562.aClass80_Sub1_Sub1_2.method18319(local87), local1154);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_123 == arg0.aClass418_1) {
																				local272 = local6.method22478();
																				@Pc(8217) Class698 local8217 = (Class698) Class457.method29479(Class47.method740(), local272);
																				if (local8217 == null) {
																					local8217 = Class698.aClass698_5;
																				}
																				Class460.method29521(local8217);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_132 == arg0.aClass418_1) {
																				Class699.method36480(Class428.aClass428_14);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_62) {
																				client.anInt3518 = local6.method22591() * -905836865;
																				client.anInt3403 = local6.method22598() * -81702317;
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_181) {
																				local1154 = local6.method22481();
																				Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21160(local6, local1154);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_88 == arg0.aClass418_1) {
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_31) {
																				local272 = local6.method22500();
																				local87 = local6.method22645();
																				Class605.method32077();
																				Class25.method456(local87, 2, local272, -1);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_162 == arg0.aClass418_1) {
																				while (local6.anInt3089 * 31645619 < arg0.anInt327 * -1013636781) {
																					local522 = local6.method22478() == 1;
																					local628 = local6.method22523();
																					local630 = local6.method22523();
																					local563 = local6.method22483();
																					local1702 = local6.method22478();
																					local1558 = local6.method22478();
																					local5480 = (local1558 & 0x2) != 0;
																					local2227 = (local1558 & 0x1) != 0;
																					@Pc(8378) String local8378 = "";
																					local2241 = -1;
																					local2283 = 0;
																					if (local563 > 0) {
																						local8378 = local6.method22523();
																						local2241 = local6.method22478();
																						local2283 = local6.method22500();
																					}
																					local4567 = local6.method22523();
																					for (local669 = 0; local669 < client.anInt3529 * -1979292205; local669++) {
																						@Pc(8411) Class162 local8411 = client.aClass162Array1[local669];
																						if (local522) {
																							if (local630.equals(local8411.aString131)) {
																								local8411.aString131 = local628;
																								local8411.aString129 = local630;
																								local628 = null;
																								break;
																							}
																						} else if (local628.equals(local8411.aString131)) {
																							if (local8411.anInt3260 * -721928209 != local563) {
																								local3882 = true;
																								for (@Pc(8431) Class131_Sub3 local8431 = (Class131_Sub3) client.aClass703_8.method36536(); local8431 != null; local8431 = (Class131_Sub3) client.aClass703_8.method36537()) {
																									if (local8431.aString45.equals(local628)) {
																										if (local563 != 0 && local8431.aShort100 == 0) {
																											local8431.method23056();
																											local3882 = false;
																										} else if (local563 == 0 && local8431.aShort100 != 0) {
																											local8431.method23056();
																											local3882 = false;
																										}
																									}
																								}
																								if (local3882) {
																									client.aClass703_8.method36525(new Class131_Sub3(local628, local563));
																								}
																								local8411.anInt3260 = local563 * -1335963889;
																							}
																							local8411.aString129 = local630;
																							local8411.aString128 = local8378;
																							local8411.anInt3262 = local1702 * 1873554437;
																							local8411.anInt3261 = local2241 * -1407318909;
																							local8411.aBoolean556 = local5480;
																							local8411.aBoolean557 = local2227;
																							local8411.aString130 = local4567;
																							local8411.anInt3263 = local2283 * 748324665;
																							local628 = null;
																							break;
																						}
																					}
																					if (local628 != null && client.anInt3529 * -1979292205 < 400) {
																						@Pc(8541) Class162 local8541 = new Class162();
																						client.aClass162Array1[client.anInt3529 * -1979292205] = local8541;
																						local8541.aString131 = local628;
																						local8541.aString129 = local630;
																						local8541.anInt3260 = local563 * -1335963889;
																						local8541.aString128 = local8378;
																						local8541.anInt3262 = local1702 * 1873554437;
																						local8541.anInt3261 = local2241 * -1407318909;
																						local8541.aBoolean556 = local5480;
																						local8541.aBoolean557 = local2227;
																						local8541.aString130 = local4567;
																						local8541.anInt3263 = local2283 * 748324665;
																						client.anInt3529 += 1605909083;
																					}
																				}
																				client.anInt3453 = 1119207202;
																				client.anInt3499 = client.anInt3413 * -664271315;
																				local522 = false;
																				local87 = client.anInt3529 * -1979292205;
																				while (local87 > 0) {
																					local522 = true;
																					local87--;
																					for (local280 = 0; local280 < local87; local280++) {
																						local1554 = false;
																						@Pc(8618) Class162 local8618 = client.aClass162Array1[local280];
																						@Pc(8624) Class162 local8624 = client.aClass162Array1[local280 + 1];
																						if (local8618.anInt3260 * -721928209 != Class680.aClass25_8.anInt122 * -1664252895 && Class680.aClass25_8.anInt122 * -1664252895 == local8624.anInt3260 * -721928209) {
																							local1554 = true;
																						}
																						if (!local1554 && local8618.anInt3260 * -721928209 == 0 && local8624.anInt3260 * -721928209 != 0) {
																							local1554 = true;
																						}
																						if (!local1554 && !local8618.aBoolean556 && local8624.aBoolean556) {
																							local1554 = true;
																						}
																						if (!local1554 && !local8618.aBoolean557 && local8624.aBoolean557) {
																							local1554 = true;
																						}
																						if (local1554) {
																							@Pc(8685) Class162 local8685 = client.aClass162Array1[local280];
																							client.aClass162Array1[local280] = client.aClass162Array1[local280 + 1];
																							client.aClass162Array1[local280 + 1] = local8685;
																							local522 = false;
																						}
																					}
																					if (local522) {
																						break;
																					}
																				}
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_109 == arg0.aClass418_1) {
																				local272 = local6.method22478();
																				local87 = local6.method22478();
																				if (local6.method22478() == 0) {
																					client.aClass497ArrayArray1[local272][local87] = new Class497();
																				} else {
																					local6.anInt3089 -= -1387468933;
																					client.aClass497ArrayArray1[local272][local87] = new Class497(local6, null);
																				}
																				client.anInt3505 = client.anInt3413 * 1017147843;
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_35) {
																				local272 = local6.method22617();
																				local87 = local6.method22648();
																				local280 = local6.method22621();
																				client.aClass517_1.method30435().method31241(local280, local87, local272);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_121 == arg0.aClass418_1) {
																				if (!client.aBoolean630) {
																					try {
																						local272 = local6.method22589();
																						local87 = local6.method22591();
																						local280 = local6.method22598();
																						client.aClass248_1.method26141(local280).method26427(local87, local272);
																					} catch (@Pc(8818) RuntimeException local8818) {
																						Class293.method27014(null, local8818);
																						Class464.method29549(arg0);
																					}
																				}
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_22 == arg0.aClass418_1) {
																				local272 = local6.method22591();
																				local87 = local6.method22591();
																				local280 = local6.method22591();
																				local563 = local6.method22483() << 2;
																				local1702 = local6.method22591();
																				Class605.method32077();
																				Class600.method32038(local87, local272, local563, local1702, local280);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_39) {
																				local272 = local6.method22648();
																				local628 = local6.method22523();
																				Class605.method32077();
																				Class241.method26005(local272, local628);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_122) {
																				local272 = local6.method22591();
																				local87 = local6.method22648();
																				local280 = local6.method22648();
																				local563 = local6.method22478();
																				local1702 = local6.method22591();
																				local1558 = local87 >> 28;
																				local1565 = local87 >> 14 & 0x3FFF;
																				local992 = local87 & 0x3FFF;
																				Class94_Sub4.aClass261_1.method26357(local280, local563, true, local1558, local1565 << 9, local992 << 9, local1702 << 9, local272 << 9);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_175) {
																				Class96_Sub3.anInt810 = local6.method22496() * -1278504939;
																				client.aBoolean620 = local6.method22478() == 1;
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_172 == arg0.aClass418_1) {
																				if (Class706.aBoolean868 && Class184.aFrame1 != null) {
																					Class196.method25463(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub9_2.method15194(), -1, -1, false);
																				}
																				local3189 = new byte[arg0.anInt327 * -1013636781];
																				local6.method22182(local3189, 0, arg0.anInt327 * -1013636781);
																				local628 = Class386.method28347(local3189, 0, arg0.anInt327 * -1013636781);
																				Class474.method29663(local628, true, client.aBoolean591);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_38) {
																				Class699.method36480(Class428.aClass428_13);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_125 == arg0.aClass418_1) {
																				client.anInt3504 = client.anInt3413 * 930325597;
																				local522 = local6.method22478() == 1;
																				@Pc(9067) Class367 local9067 = new Class367(local6);
																				@Pc(9071) Class77_Sub25 local9071;
																				if (local522) {
																					local9071 = Class574.aClass77_Sub25_2;
																				} else {
																					local9071 = Class494.aClass77_Sub25_1;
																				}
																				local9067.method28144(local9071);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_156) {
																				local1774 = local6.method22523();
																				Class509.method30282(local1774, false, false);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_14) {
																				if (!client.aBoolean630) {
																					try {
																						local272 = local6.method22591();
																						local87 = local6.method22478();
																						local280 = local6.method22591();
																						client.aClass248_1.method26141(local87).method26449(local280, local272, null);
																					} catch (@Pc(9130) RuntimeException local9130) {
																						Class293.method27014(null, local9130);
																						Class464.method29549(arg0);
																					}
																				}
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_33) {
																				if (client.anInt3459 * -993629849 != -1) {
																					Class611.method32232(client.anInt3459 * -993629849, 0);
																				}
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_69 == arg0.aClass418_1) {
																				local272 = local6.method22483();
																				local87 = local6.method22478();
																				local2032 = (local87 & 0x1) != 0;
																				local1554 = (local87 & 0x2) != 0;
																				while (local6.anInt3089 * 31645619 < arg0.anInt327 * -1013636781) {
																					local1702 = local6.method22537();
																					local1558 = local6.method22483();
																					local1565 = 0;
																					@Pc(9212) Class9 local9212 = null;
																					if (local1558 != 0) {
																						local1565 = local6.method22478();
																						if (local1565 == 255) {
																							local1565 = local6.method22500();
																						}
																						if (local1554) {
																							local1040 = local6.method22478();
																							if (local1040 > 0) {
																								local9212 = new Class9(Class77_Sub23.aClass80_Sub1_Sub2_2);
																								while (local1040-- > 0) {
																									@Pc(9246) Class438 local9246 = Class77_Sub23.aClass80_Sub1_Sub2_2.method1949(local6);
																									local9212.method128(local9246.anInt4927 * -608978823, local9246.anObject19);
																								}
																							}
																						}
																					}
																					Class192.method25434(local272, local1702, local1558 - 1, local1565, local9212, local2032);
																				}
																				client.anIntArray334[(client.anInt3498 += -1459399321) * 816576087 - 1 & 0x3F] = local272;
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_146 == arg0.aClass418_1) {
																				local272 = local6.method22621();
																				if (local272 == 65535) {
																					local272 = -1;
																				}
																				local87 = local6.method22648();
																				local280 = local6.method22617();
																				if (local280 == 65535) {
																					local280 = -1;
																				}
																				local563 = local6.method22483();
																				Class605.method32077();
																				for (local1702 = local272; local1702 <= local280; local1702++) {
																					local1713 = (long) local1702 + ((long) local87 << 32);
																					local1718 = (Class77_Sub26) client.aClass12_18.method173(local1713);
																					if (local1718 != null) {
																						local1735 = new Class77_Sub26(local1718.anInt1558 * 1837782131, local563);
																						local1718.method24063();
																					} else if (local1702 == -1) {
																						local1735 = new Class77_Sub26(Class155.method23628(local87).aClass77_Sub26_2.anInt1558 * 1837782131, local563);
																					} else {
																						local1735 = new Class77_Sub26(0, local563);
																					}
																					client.aClass12_18.method184(local1735, local1713);
																				}
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_184) {
																				local272 = local6.method22653();
																				Class605.method32077();
																				@Pc(9403) Class77_Sub38 local9403 = (Class77_Sub38) client.aClass12_20.method173((long) local272);
																				if (local9403 != null) {
																					Class77_Sub41.method14838(local9403, true, false);
																				}
																				if (client.aClass277_5 != null) {
																					Class461.method29531(client.aClass277_5);
																					client.aClass277_5 = null;
																				}
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_126 == arg0.aClass418_1) {
																				local272 = local6.method22621();
																				local87 = local6.method22598();
																				local280 = local6.method22617();
																				if (local280 == 65535) {
																					local280 = -1;
																				}
																				local563 = local6.method22598();
																				local1702 = local6.method22483();
																				local1558 = local6.method22500();
																				local1565 = local563 & 0x7;
																				local992 = local563 >> 3 & 0xF;
																				if (local992 == 15) {
																					local992 = -1;
																				}
																				@Pc(9482) boolean local9482 = (local563 >> 7 & 0x1) == 1;
																				@Pc(9567) int local9567;
																				@Pc(9569) int local9569;
																				if (local1558 >> 30 == 0) {
																					@Pc(9746) Class234 local9746;
																					@Pc(9675) Class679 local9675;
																					@Pc(9693) Class234 local9693;
																					if (local1558 >> 29 != 0) {
																						local2241 = local1558 & 0xFFFF;
																						local7342 = (Class77_Sub6) client.aClass12_22.method173((long) local2241);
																						if (local7342 != null) {
																							local3035 = (Class104_Sub1_Sub1_Sub1_Sub1) local7342.anObject5;
																							@Pc(9648) Class535 local9648 = local3035.aClass535Array3[local87];
																							if (local280 == 65535) {
																								local280 = -1;
																							}
																							@Pc(9655) boolean local9655 = true;
																							local9567 = local9648.anInt5185 * -1183861629;
																							if (local280 != -1 && local9567 != -1) {
																								if (local280 == local9567) {
																									local9675 = (Class679) Class482.aClass35_Sub4_1.method18319(local280);
																									if (local9675.aBoolean860 && local9675.anInt5810 * -811043807 != -1) {
																										local9693 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local9675.anInt5810 * -811043807);
																										@Pc(9698) int local9698 = local9693.anInt3773 * 629077835;
																										if (local9698 == 0 || local9698 == 2) {
																											local9655 = false;
																										} else if (local9698 == 1) {
																											local9655 = true;
																										}
																									}
																								} else {
																									local9675 = (Class679) Class482.aClass35_Sub4_1.method18319(local280);
																									@Pc(9725) Class679 local9725 = (Class679) Class482.aClass35_Sub4_1.method18319(local9567);
																									if (local9675.anInt5810 * -811043807 != -1 && -811043807 * local9725.anInt5810 != -1) {
																										local9746 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local9675.anInt5810 * -811043807);
																										@Pc(9755) Class234 local9755 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local9725.anInt5810 * -811043807);
																										if (local9746.anInt3768 * 995056269 < local9755.anInt3768 * 995056269) {
																											local9655 = false;
																										}
																									}
																								}
																							}
																							if (local9655) {
																								local9648.anInt5185 = local280 * 496843307;
																								local9648.anInt5184 = local1702 * 1188140141;
																								local9648.anInt5186 = local992 * 1026088823;
																								if (local280 == -1) {
																									local9648.aClass151_9.method23401(-1);
																								} else {
																									local9675 = (Class679) Class482.aClass35_Sub4_1.method18319(local280);
																									local3899 = local9675.aBoolean860 ? 0 : 2;
																									if (local9482) {
																										local3899 = 1;
																									}
																									local9648.aClass151_9.method23413(local9675.anInt5810 * -811043807, local272, local3899, false);
																								}
																							}
																						}
																					} else if (local1558 >> 28 != 0) {
																						local2241 = local1558 & 0xFFFF;
																						@Pc(9837) Class104_Sub1_Sub1_Sub1_Sub2 local9837;
																						if (client.anInt3389 * -643758853 == local2241) {
																							local9837 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3;
																						} else {
																							local9837 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local2241];
																						}
																						if (local9837 != null) {
																							@Pc(9849) Class535 local9849 = local9837.aClass535Array3[local87];
																							if (local280 == 65535) {
																								local280 = -1;
																							}
																							local3469 = true;
																							local3103 = local9849.anInt5185 * -1183861629;
																							@Pc(9876) Class679 local9876;
																							if (local280 != -1 && local3103 != -1) {
																								if (local3103 == local280) {
																									local9876 = (Class679) Class482.aClass35_Sub4_1.method18319(local280);
																									if (local9876.aBoolean860 && local9876.anInt5810 * -811043807 != -1) {
																										@Pc(9894) Class234 local9894 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local9876.anInt5810 * -811043807);
																										local3899 = local9894.anInt3773 * 629077835;
																										if (local3899 == 0 || local3899 == 2) {
																											local3469 = false;
																										} else if (local3899 == 1) {
																											local3469 = true;
																										}
																									}
																								} else {
																									local9876 = (Class679) Class482.aClass35_Sub4_1.method18319(local280);
																									local9675 = (Class679) Class482.aClass35_Sub4_1.method18319(local3103);
																									if (local9876.anInt5810 * -811043807 != -1 && -811043807 * local9675.anInt5810 != -1) {
																										local9693 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local9876.anInt5810 * -811043807);
																										local9746 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local9675.anInt5810 * -811043807);
																										if (local9693.anInt3768 * 995056269 < local9746.anInt3768 * 995056269) {
																											local3469 = false;
																										}
																									}
																								}
																							}
																							if (local3469) {
																								local9849.anInt5185 = local280 * 496843307;
																								local9849.anInt5184 = local1702 * 1188140141;
																								local9849.anInt5186 = local992 * 1026088823;
																								local9849.anInt5183 = local1565 * -1172805917;
																								if (local280 == -1) {
																									local9849.aClass151_9.method23401(-1);
																								} else {
																									local9876 = (Class679) Class482.aClass35_Sub4_1.method18319(local280);
																									local9569 = local9876.aBoolean860 ? 0 : 2;
																									if (local9482) {
																										local9569 = 1;
																									}
																									local9849.aClass151_9.method23413(local9876.anInt5810 * -811043807, local272, local9569, false);
																								}
																							}
																						}
																					}
																				} else {
																					@Pc(9491) Class595 local9491 = client.aClass517_1.method30409();
																					local2283 = local1558 >> 28 & 0x3;
																					local3865 = (local1558 >> 14 & 0x3FFF) - local9491.anInt5504 * -424199969;
																					local669 = (local1558 & 0x3FFF) - local9491.anInt5506 * -1166289421;
																					if (local3865 >= 0 && local669 >= 0 && local3865 < client.aClass517_1.method30411() && local669 < client.aClass517_1.method30417()) {
																						if (local280 == -1) {
																							@Pc(9544) Class77_Sub1_Sub5 local9544 = (Class77_Sub1_Sub5) client.aClass12_21.method173((long) (local3865 << 16 | local669));
																							if (local9544 != null) {
																								local9544.aClass104_Sub1_Sub1_Sub5_1.method23997();
																								local9544.method24063();
																							}
																						} else {
																							local3103 = local3865 * 512 + 256;
																							local9567 = local669 * 512 + 256;
																							local9569 = local2283;
																							if (local2283 < 3 && client.aClass517_1.method30441().method29665(local3865, local669)) {
																								local9569 = local2283 + 1;
																							}
																							@Pc(9608) Class104_Sub1_Sub1_Sub5 local9608 = new Class104_Sub1_Sub1_Sub5(client.aClass517_1.method30435(), local280, local272, local2283, local9569, local3103, Class277.method26658(local3103, local9567, local2283) - local1702, local9567, local3865, local3865, local669, local669, local1565, local9482, 0);
																							client.aClass12_21.method184(new Class77_Sub1_Sub5(local9608), (long) (local3865 << 16 | local669));
																						}
																					}
																				}
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_103 == arg0.aClass418_1) {
																				local272 = local6.method22648();
																				local87 = local6.method22648();
																				Class605.method32077();
																				Class460.method29522(local272, local87);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_55 == arg0.aClass418_1) {
																				Class40.method684(local6, arg0.anInt327 * -1013636781);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_127) {
																				local272 = local6.method22612();
																				local3818 = local6.method22601();
																				Class605.method32077();
																				Class691.method36350(local272, local3818);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_114) {
																				local272 = local6.method22653();
																				local87 = local6.method22483();
																				local280 = local6.method22653();
																				local563 = local6.method22645();
																				local1702 = local6.method22591();
																				local1558 = local6.method22483();
																				local1565 = local6.method22645();
																				local992 = local6.method22653();
																				Class605.method32077();
																				Class698.method36475(local280, new Class77_Sub38_Sub2(local1558, local1702, local87), new int[] { local272, local563, local992, local1565 }, false);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_155 == arg0.aClass418_1) {
																				Class699.method36480(Class428.aClass428_11);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_195 == arg0.aClass418_1) {
																				local6.anInt3089 += -194424460;
																				if (local6.method22576()) {
																					Class639.method32723(local6, local6.anInt3089 * 31645619 - 28);
																				}
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_153) {
																				local7135 = new Class77_Sub39_Sub1(arg0.anInt327 * -1013636781);
																				System.arraycopy(arg0.aClass77_Sub39_Sub1_1.aByteArray53, arg0.aClass77_Sub39_Sub1_1.anInt3089 * 31645619, local7135.aByteArray53, 0, arg0.anInt327 * -1013636781);
																				Class96_Sub11.method19914();
																				if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub40_1.method16206() == 1) {
																					Class196.aClass514_1.method30351(new Class516(Class505.aClass505_2, local7135));
																				} else {
																					client.aClass517_1.method30488(new Class516(Class505.aClass505_2, local7135));
																				}
																				arg0.aClass418_1 = null;
																				return false;
																			} else if (Class418.aClass418_75 == arg0.aClass418_1) {
																				Class156.anInt3233 = local6.method22478() * 1050310007;
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_112 == arg0.aClass418_1) {
																				Class699.method36480(Class428.aClass428_1);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_91 == arg0.aClass418_1) {
																				local272 = local6.method22612();
																				if (local272 == 65535) {
																					local272 = -1;
																				}
																				local628 = local6.method22523();
																				local280 = local6.method22591();
																				local563 = local6.method22478();
																				if (local280 >= 1 && local280 <= 8) {
																					if (local628.equalsIgnoreCase("null")) {
																						local628 = null;
																					}
																					client.aStringArray24[local280 - 1] = local628;
																					client.anIntArray332[local280 - 1] = local272;
																					client.aBooleanArray18[local280 - 1] = local563 == 0;
																				}
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_129) {
																				local1774 = local6.method22523();
																				local87 = local6.method22483();
																				local630 = RuntimeException_Sub4.aClass41_2.method688(local87).method22309(local6);
																				Class245.method26121(19, 0, local1774, local1774, local1774, local630, null, local87, null);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_167 == arg0.aClass418_1) {
																				local272 = local6.method22478();
																				@Pc(10409) Class694 local10409 = (Class694) Class457.method29479(Class118.method21255(), local272);
																				if (local10409 == null) {
																					local10409 = Class694.aClass694_4;
																				}
																				Class440.method28947(local10409);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_51 == arg0.aClass418_1) {
																				Class699.method36480(Class428.aClass428_7);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (arg0.aClass418_1 == Class418.aClass418_50) {
																				if (!client.aBoolean630) {
																					try {
																						for (local1154 = local6.method22481(); local1154 != -1; local1154 = local6.method22481()) {
																							for (local3818 = local6.method22481(); local3818 != -1; local3818 = local6.method22481()) {
																								for (@Pc(10457) byte local10457 = local6.method22481(); local10457 != -1; local10457 = local6.method22481()) {
																									client.aClass248_1.method26141(local1154).method26449(local3818, local10457, local6.method22500());
																								}
																							}
																						}
																					} catch (@Pc(10489) RuntimeException local10489) {
																						Class293.method27014(null, local10489);
																						Class464.method29549(arg0);
																					}
																				}
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_110 == arg0.aClass418_1) {
																				Class619.method32395(false);
																				arg0.aClass418_1 = null;
																				return false;
																			} else if (Class418.aClass418_133 == arg0.aClass418_1) {
																				local272 = local6.method22612();
																				if (local272 == 65535) {
																					local272 = -1;
																				}
																				local87 = local6.method22478();
																				Class94_Sub4.aClass261_1.method26354(local272, local87);
																				arg0.aClass418_1 = null;
																				return true;
																			} else if (Class418.aClass418_83 == arg0.aClass418_1) {
																				local272 = local6.method22478();
																				@Pc(10553) int local10553 = -local272 - 2;
																				local3818 = local6.method22481();
																				@Pc(10563) Class104_Sub1_Sub1_Sub1_Sub2 local10563 = (Class104_Sub1_Sub1_Sub1_Sub2) client.aMap15.get(local10553);
																				if (local10563 == null) {
																					local10563 = new Class104_Sub1_Sub1_Sub1_Sub2(null);
																					local10563.anInt2867 = local10553 * -2061161143;
																					client.aMap15.put(local10553, local10563);
																				}
																				local10563.method21160(local6, local3818);
																				arg0.aClass418_1 = null;
																				return true;
																			} else {
																				Class293.method27014((arg0.aClass418_1 == null ? -1 : arg0.aClass418_1.anInt4722 * -1228959953) + Class184.aString133 + (arg0.aClass418_3 == null ? -1 : arg0.aClass418_3.anInt4722 * -1228959953) + Class184.aString133 + (arg0.aClass418_2 == null ? -1 : arg0.aClass418_2.anInt4722 * -1228959953) + " " + arg0.anInt327 * -1013636781, new RuntimeException());
																				Class619.method32395(false);
																				return true;
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cv", name = "nz", descriptor = "(Lclient!yf;I)V", line = 7051)
	static final void method25475(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class26.method464(local11, local14, arg0);
	}
}
