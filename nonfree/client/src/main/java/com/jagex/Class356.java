package com.jagex;

import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public class Class356 implements Interface4 {

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_104;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!py;)V", line = 174)
	Class356(@OriginalArg(0) Class497 arg0) {
		this.aClass497_104 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;", line = 179)
	@Override
	public Interface13 method27700(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class369(arg0, this.aClass497_104);
	}

	@OriginalMember(owner = "client!ja", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;", line = 179)
	@Override
	public Interface13 method27703(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class369(arg0, this.aClass497_104);
	}

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;", line = 179)
	@Override
	public Interface13 method27702(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class369(arg0, this.aClass497_104);
	}

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;", line = 179)
	@Override
	public Interface13 method27704(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class369(arg0, this.aClass497_104);
	}

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "(B)Ljava/lang/Class;", line = 183)
	@Override
	public Class method27701() {
		return Class369.class;
	}

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "()Ljava/lang/Class;", line = 183)
	@Override
	public Class method27705() {
		return Class369.class;
	}

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "(Lclient!dh;IIB)V", line = 587)
	static void method27708(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Class454.aClass489_97 == null) {
			return;
		}
		@Pc(10) Class611 local10 = client.aClass532_1.method30443();
		@Pc(13) Class489 local13 = arg0.method20507();
		Class448.method28919(arg0);
		local13.method29842(Class454.aClass470_53);
		local13.method29953(Class454.aClass489_97);
		local13.method29844();
		@Pc(30) int local30 = arg1 - Class454.anInt5053 * -1957887265;
		@Pc(36) int local36 = arg2 - Class454.anInt5050 * -2083758407;
		if (client.aClass532_1.method30459() == null) {
			return;
		}
		@Pc(52) int local52;
		@Pc(165) int local165;
		@Pc(172) int local172;
		@Pc(220) int local220;
		if (!client.aBoolean625 || (Class253.anInt3851 * 735260021 & 0x40) != 0) {
			@Pc(50) int local50 = -1;
			local52 = -1;
			@Pc(64) float local64 = (float) local30 * 2.0F / (float) (Class454.anInt5051 * 1376888697) - 1.0F;
			@Pc(76) float local76 = (float) local36 * 2.0F / (float) (Class454.anInt5052 * 1520343609) - 1.0F;
			local13.method29847(local64, local76, -1.0F, Class454.aFloatArray107);
			@Pc(90) float local90 = Class454.aFloatArray107[0] / Class454.aFloatArray107[3];
			@Pc(98) float local98 = Class454.aFloatArray107[1] / Class454.aFloatArray107[3];
			@Pc(106) float local106 = Class454.aFloatArray107[2] / Class454.aFloatArray107[3];
			local13.method29847(local64, local76, 1.0F, Class454.aFloatArray107);
			@Pc(120) float local120 = Class454.aFloatArray107[0] / Class454.aFloatArray107[3];
			@Pc(128) float local128 = Class454.aFloatArray107[1] / Class454.aFloatArray107[3];
			@Pc(136) float local136 = Class454.aFloatArray107[2] / Class454.aFloatArray107[3];
			@Pc(146) float local146 = Class480.method29752(local90, local98, local106, local120, local128, local136, 4);
			if (local146 > 0.0F) {
				@Pc(154) float local154 = local120 - local90;
				@Pc(158) float local158 = local136 - local106;
				local165 = (int) (local146 * local154 + local90);
				local172 = (int) (local106 + local146 * local158);
				local50 = local165 + (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method19997() - 1 << 8) >> 9;
				local52 = local172 + (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method19997() - 1 << 8) >> 9;
				@Pc(199) byte local199 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100;
				if (local199 < 3 && (client.aClass532_1.method30509().aByteArrayArrayArray12[1][local165 >> 9][local172 >> 9] & 0x2) != 0) {
					local220 = local199 + 1;
				}
			}
			if (local50 != -1 && local52 != -1) {
				if (client.aBoolean625 && (Class253.anInt3851 * 735260021 & 0x40) != 0) {
					@Pc(244) Class312 local244 = Class124_Sub2.method9308(Class148.anInt1394 * -278883695, client.anInt3523 * 1573685689);
					if (local244 == null) {
						Class624.method32160();
					} else {
						Class280.method26458(client.aString145, " " + Class430.aString206 + " ", Class271.anInt3885 * -308125347, 59, -1, 0L, local50, local52, true, false, (long) (local50 << 0 | local52), true);
					}
				} else {
					if (Class620.aBoolean843) {
						Class280.method26458(Class74.aClass74_134.method1259(Class106.aClass717_8), "", -1, 60, -1, 0L, local50, local52, true, false, (long) (local50 << 0 | local52), true);
					}
					Class280.method26458(Class511.aString220, "", client.anInt3518 * -2102645197, 23, -1, 0L, local50, local52, true, false, (long) (local50 << 0 | local52), true);
				}
			}
		}
		@Pc(331) Class569 local331 = client.aClass532_1.method30459().aClass569_2;
		local52 = arg1;
		@Pc(335) int local335 = arg2;
		@Pc(338) List local338 = local331.aList22;
		@Pc(341) Iterator local341 = local338.iterator();
		while (true) {
			@Pc(378) int local378;
			@Pc(383) int local383;
			@Pc(1364) Interface61 local1364;
			@Pc(1374) Class610 local1374;
			@Pc(467) int local467;
			@Pc(1481) String[] local1481;
			do {
				@Pc(348) Class573 local348;
				do {
					do {
						do {
							@Pc(543) int var25;
							@Pc(659) int var26;
							@Pc(413) int var37;
							@Pc(876) int var62;
							while (true) {
								@Pc(515) Class472 var23;
								@Pc(529) int var24;
								@Pc(479) int var49;
								while (true) {
									do {
										do {
											if (!local341.hasNext()) {
												return;
											}
											local348 = (Class573) local341.next();
										} while (!client.aBoolean605 && local348.aClass132_Sub1_25.aByte100 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100);
									} while (!local348.method31337(arg0, local52, local335));
									if (local348.aClass132_Sub1_25 instanceof Class132_Sub1_Sub1) {
										local378 = ((Class132_Sub1_Sub1) local348.aClass132_Sub1_25).aShort129;
										local383 = ((Class132_Sub1_Sub1) local348.aClass132_Sub1_25).aShort128;
									} else {
										@Pc(389) Class472 local389 = local348.aClass132_Sub1_25.method24229().aClass472_61;
										local378 = (int) local389.aFloat317 >> 9;
										local383 = (int) local389.aFloat319 >> 9;
									}
									if (!(local348.aClass132_Sub1_25 instanceof Class132_Sub1_Sub1_Sub1_Sub2)) {
										break;
									}
									@Pc(409) Class132_Sub1_Sub1_Sub1_Sub2 local409 = (Class132_Sub1_Sub1_Sub1_Sub2) local348.aClass132_Sub1_25;
									var37 = local409.method19997();
									@Pc(417) Class472 local417 = local409.method24229().aClass472_61;
									if ((var37 & 0x1) == 0 && ((int) local417.aFloat317 & 0x1FF) == 0 && ((int) local417.aFloat319 & 0x1FF) == 0 || (var37 & 0x1) == 1 && ((int) local417.aFloat317 & 0x1FF) == 256 && ((int) local417.aFloat319 & 0x1FF) == 256) {
										local467 = (int) local417.aFloat317 - (local409.method19997() - 1 << 8);
										var49 = (int) local417.aFloat319 - (local409.method19997() - 1 << 8);
										for (local165 = 0; local165 < client.anInt3540 * 568731113; local165++) {
											@Pc(494) Class93_Sub15 local494 = (Class93_Sub15) client.aClass16_18.method215((long) client.anIntArray323[local165]);
											if (local494 != null) {
												@Pc(501) Class132_Sub1_Sub1_Sub1_Sub1 local501 = (Class132_Sub1_Sub1_Sub1_Sub1) local494.anObject5;
												if (client.anInt3485 != local501.anInt2765 * -1318108809 && local501.aBoolean453) {
													var23 = local501.method24229().aClass472_61;
													var24 = (int) var23.aFloat317 - (local501.aClass336_1.anInt4154 * 447008399 - 1 << 8);
													var25 = (int) var23.aFloat319 - (local501.aClass336_1.anInt4154 * 447008399 - 1 << 8);
													if (var24 >= local467 && local501.aClass336_1.anInt4154 * 447008399 <= local409.method19997() - (var24 - local467 >> 9) && var25 >= var49 && local501.aClass336_1.anInt4154 * 447008399 <= local409.method19997() - (var25 - var49 >> 9)) {
														Class660.method32821(local501, local348.aClass132_Sub1_25.aByte100 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100);
														local501.anInt2765 = client.anInt3485 * -604510137;
													}
												}
											}
										}
										local165 = Class174.anInt3293 * -1081967415;
										@Pc(604) int[] local604 = Class174.anIntArray278;
										for (local220 = 0; local220 < local165; local220++) {
											@Pc(615) Class132_Sub1_Sub1_Sub1_Sub2 local615 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local604[local220]];
											if (local615 != null && client.anInt3485 != local615.anInt2765 * -1318108809 && local615 != local409 && local615.aBoolean453) {
												@Pc(635) Class472 local635 = local615.method24229().aClass472_61;
												var25 = (int) local635.aFloat317 - (local615.method19997() - 1 << 8);
												var26 = (int) local635.aFloat319 - (local615.method19997() - 1 << 8);
												if (var25 >= local467 && local615.method19997() <= local409.method19997() - (var25 - local467 >> 9) && var26 >= var49 && local615.method19997() <= local409.method19997() - (var26 - var49 >> 9)) {
													Class282.method26467(local615, local348.aClass132_Sub1_25.aByte100 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100);
													local615.anInt2765 = client.anInt3485 * -604510137;
												}
											}
										}
									}
									if (local409.anInt2765 * -1318108809 != client.anInt3485) {
										Class282.method26467(local409, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 != local348.aClass132_Sub1_25.aByte100);
										local409.anInt2765 = client.anInt3485 * -604510137;
										break;
									}
								}
								if (!(local348.aClass132_Sub1_25 instanceof Class132_Sub1_Sub1_Sub1_Sub1)) {
									break;
								}
								@Pc(742) Class132_Sub1_Sub1_Sub1_Sub1 local742 = (Class132_Sub1_Sub1_Sub1_Sub1) local348.aClass132_Sub1_25;
								if (local742.aClass336_1 == null) {
									break;
								}
								@Pc(750) Class472 local750 = local742.method24229().aClass472_61;
								if ((local742.aClass336_1.anInt4154 * 447008399 & 0x1) == 0 && ((int) local750.aFloat317 & 0x1FF) == 0 && ((int) local750.aFloat319 & 0x1FF) == 0 || (local742.aClass336_1.anInt4154 * 447008399 & 0x1) == 1 && ((int) local750.aFloat317 & 0x1FF) == 256 && ((int) local750.aFloat319 & 0x1FF) == 256) {
									@Pc(808) int local808 = (int) local750.aFloat317 - (local742.aClass336_1.anInt4154 * 447008399 - 1 << 8);
									local467 = (int) local750.aFloat319 - (local742.aClass336_1.anInt4154 * 447008399 - 1 << 8);
									for (var49 = 0; var49 < client.anInt3540 * 568731113; var49++) {
										@Pc(837) Class93_Sub15 local837 = (Class93_Sub15) client.aClass16_18.method215((long) client.anIntArray323[var49]);
										if (local837 != null) {
											@Pc(845) Class132_Sub1_Sub1_Sub1_Sub1 local845 = (Class132_Sub1_Sub1_Sub1_Sub1) local837.anObject5;
											if (client.anInt3485 != local845.anInt2765 * -1318108809 && local742 != local845 && local845.aBoolean453) {
												@Pc(862) Class472 local862 = local845.method24229().aClass472_61;
												var62 = (int) local862.aFloat317 - (local845.aClass336_1.anInt4154 * 447008399 - 1 << 8);
												var24 = (int) local862.aFloat319 - (local845.aClass336_1.anInt4154 * 447008399 - 1 << 8);
												if (var62 >= local808 && local845.aClass336_1.anInt4154 * 447008399 <= local742.aClass336_1.anInt4154 * 447008399 - (var62 - local808 >> 9) && var24 >= local467 && local845.aClass336_1.anInt4154 * 447008399 <= local742.aClass336_1.anInt4154 * 447008399 - (var24 - local467 >> 9)) {
													Class660.method32821(local845, local348.aClass132_Sub1_25.aByte100 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100);
													local845.anInt2765 = client.anInt3485 * -604510137;
												}
											}
										}
									}
									var49 = Class174.anInt3293 * -1081967415;
									@Pc(955) int[] local955 = Class174.anIntArray278;
									for (local172 = 0; local172 < var49; local172++) {
										@Pc(966) Class132_Sub1_Sub1_Sub1_Sub2 local966 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local955[local172]];
										if (local966 != null && client.anInt3485 != local966.anInt2765 * -1318108809 && local966.aBoolean453) {
											var23 = local966.method24229().aClass472_61;
											var24 = (int) var23.aFloat317 - (local966.method19997() - 1 << 8);
											var25 = (int) var23.aFloat319 - (local966.method19997() - 1 << 8);
											if (var24 >= local808 && local966.method19997() <= local742.aClass336_1.anInt4154 * 447008399 - (var24 - local808 >> 9) && var25 >= local467 && local966.method19997() <= local742.aClass336_1.anInt4154 * 447008399 - (var25 - local467 >> 9)) {
												Class282.method26467(local966, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 != local348.aClass132_Sub1_25.aByte100);
												local966.anInt2765 = client.anInt3485 * -604510137;
											}
										}
									}
								}
								if (client.anInt3485 != local742.anInt2765 * -1318108809) {
									Class660.method32821(local742, local348.aClass132_Sub1_25.aByte100 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100);
									local742.anInt2765 = client.anInt3485 * -604510137;
									break;
								}
							}
							if (local348.aClass132_Sub1_25 instanceof Class132_Sub1_Sub5_Sub1) {
								@Pc(1096) int local1096 = local10.anInt5623 * 270611681 + local378;
								var37 = local10.anInt5624 * -1994307635 + local383;
								@Pc(1119) Class93_Sub5 local1119 = (Class93_Sub5) client.aClass16_20.method215((long) (local348.aClass132_Sub1_25.aByte100 << 28 | var37 << 14 | local1096));
								if (local1119 != null) {
									local467 = 0;
									@Pc(1129) Class93_Sub3 local1129 = (Class93_Sub3) local1119.aClass22_17.method413();
									while (local1129 != null) {
										@Pc(1140) Class47 local1140 = (Class47) Class277.aClass32_Sub12_1.method18261(local1129.anInt1405 * -308533965);
										if (local1140.aBoolean20) {
											local172 = local1140.anInt187 * 454881133;
										} else if (local1140.aBoolean21) {
											local172 = Class288.aClass636_1.anInt5729 * -605634533;
										} else {
											local172 = Class288.aClass636_1.anInt5728 * -180353715;
										}
										if (client.aBoolean625 && Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 == local348.aClass132_Sub1_25.aByte100) {
											@Pc(1186) Class87 local1186 = (Class87) (Class650.anInt5797 * -759562015 == -1 ? null : Class124.aClass32_Sub21_7.method18261(Class650.anInt5797 * -759562015));
											if ((Class253.anInt3851 * 735260021 & 0x1) != 0 && (local1186 == null || local1140.method945(Class650.anInt5797 * -759562015, local1186.anInt265 * 951920133) != local1186.anInt265 * 951920133)) {
												Class280.method26458(client.aString145, client.aString142 + " " + Class430.aString206 + " " + Class306.method26823(local172) + local1140.aString6, Class271.anInt3885 * -308125347, 17, -1, (long) (-308533965 * local1129.anInt1405), local378, local383, true, false, (long) local467, false);
											}
										}
										if (local348.aClass132_Sub1_25.aByte100 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
											@Pc(1258) String[] local1258 = local1140.aStringArray4;
											for (var62 = local1258.length - 1; var62 >= 0; var62--) {
												if (local1258[var62] != null) {
													@Pc(1271) short local1271 = 0;
													var25 = client.anInt3521 * 1255649659;
													if (var62 == 0) {
														local1271 = 18;
													}
													if (var62 == 1) {
														local1271 = 19;
													}
													if (var62 == 2) {
														local1271 = 20;
													}
													if (var62 == 3) {
														local1271 = 21;
													}
													if (var62 == 4) {
														local1271 = 22;
													}
													if (var62 == 5) {
														local1271 = 1004;
													}
													var26 = local1140.method910(var62);
													if (var26 != -1) {
														var25 = var26;
													}
													Class280.method26458(local1258[var62], Class306.method26823(local172) + local1140.aString6, var25, local1271, -1, (long) (local1129.anInt1405 * -308533965), local378, local383, true, false, (long) local467, false);
												}
											}
										}
										local1129 = (Class93_Sub3) local1119.aClass22_17.method424();
										local467++;
									}
								}
							}
						} while (!(local348.aClass132_Sub1_25 instanceof Interface61));
						local1364 = (Interface61) local348.aClass132_Sub1_25;
						local1374 = (Class610) client.aClass532_1.method30466().method18261(local1364.method13423());
						if (local1374.anIntArray492 != null) {
							local1374 = local1374.method31982(Class624.aClass120_1, Class624.aClass120_1);
						}
					} while (local1374 == null);
					if (client.aBoolean625 && Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 == local348.aClass132_Sub1_25.aByte100) {
						@Pc(1409) Class87 local1409 = (Class87) (Class650.anInt5797 * -759562015 == -1 ? null : Class124.aClass32_Sub21_7.method18261(Class650.anInt5797 * -759562015));
						if ((Class253.anInt3851 * 735260021 & 0x4) != 0 && (local1409 == null || local1374.method31986(Class650.anInt5797 * -759562015, local1409.anInt265 * 951920133) != local1409.anInt265 * 951920133)) {
							Class280.method26458(client.aString145, client.aString142 + " " + Class430.aString206 + " " + Class306.method26823(65535) + local1374.aString233, Class271.anInt3885 * -308125347, 2, -1, Class497.method30129(local1364, local378, local383), local378, local383, true, false, (long) local1364.hashCode(), false);
						}
					}
				} while (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 != local348.aClass132_Sub1_25.aByte100);
				local1481 = local1374.aStringArray32;
			} while (local1481 == null);
			for (local467 = local1481.length - 1; local467 >= 0; local467--) {
				if (local1481[local467] != null) {
					@Pc(1497) short local1497 = 0;
					local165 = client.anInt3521 * 1255649659;
					if (local467 == 0) {
						local1497 = 3;
					}
					if (local467 == 1) {
						local1497 = 4;
					}
					if (local467 == 2) {
						local1497 = 5;
					}
					if (local467 == 3) {
						local1497 = 6;
					}
					if (local467 == 4) {
						local1497 = 1001;
					}
					if (local467 == 5) {
						local1497 = 1002;
					}
					local172 = local1374.method31991(local467);
					if (local172 != -1) {
						local165 = local172;
					}
					Class280.method26458(local1481[local467], Class306.method26823(65535) + local1374.aString233, local165, local1497, -1, Class497.method30129(local1364, local378, local383), local378, local383, true, false, (long) local1364.hashCode(), false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "gz", descriptor = "(Lclient!yf;I)V", line = 6204)
	static final void method27707(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class286.method26537(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "ke", descriptor = "(I)V", line = 10976)
	static final void method27706() {
		if (client.anInt3526 * -703563959 == -1) {
			return;
		}
		@Pc(9) int local9 = Class82.aClass153_1.method14058();
		@Pc(13) int local13 = Class82.aClass153_1.method14064();
		@Pc(18) Class93_Sub23 local18 = (Class93_Sub23) client.aClass22_45.method445();
		if (local18 != null) {
			local9 = local18.method22873();
			local13 = local18.method22874();
		}
		if (client.aClass312_5 != null && client.aClass312_3 == Class255.aClass312_8) {
			client.aBoolean614 = true;
			client.anInt3530 = 0;
			client.anInt3479 = 0;
			client.anInt3438 = client.anInt3408 * -437804959;
			client.anInt3532 = client.anInt3416 * -928837465;
		}
		Class550.method31032(null, client.anInt3526 * -703563959, 0, 0, client.anInt3408 * -1378711501, client.anInt3416 * 2091353777, 0, 0, local9, local13);
		if (Class378.aClass312_10 != null) {
			Class169.method18344(local9, local13);
		}
	}
}
