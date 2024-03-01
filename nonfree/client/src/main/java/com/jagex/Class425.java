package com.jagex;

import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public class Class425 implements Interface47 {

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "Lclient!yj;")
	final Class600 aClass600_1;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "(Lclient!ags;Lclient!ags;I)V", line = 30)
	public static void method27900(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class3_Sub1 arg1) {
		if (arg0.aClass3_Sub1_67 != null) {
			arg0.method33669();
		}
		arg0.aClass3_Sub1_67 = arg1.aClass3_Sub1_67;
		arg0.aClass3_Sub1_66 = arg1;
		arg0.aClass3_Sub1_67.aClass3_Sub1_66 = arg0;
		arg0.aClass3_Sub1_66.aClass3_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!yj;)V", line = 88)
	Class425(@OriginalArg(0) Class600 arg0) {
		this.aClass600_1 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "()V", line = 93)
	@Override
	public void method28242() {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_101, client.aClass82_2.aClass577_2);
		local5.aClass3_Sub41_Sub1_1.method20303(this.aClass600_1.method33765());
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "(B)V", line = 93)
	@Override
	public void method28244() {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_101, client.aClass82_2.aClass577_2);
		local5.aClass3_Sub41_Sub1_1.method20303(this.aClass600_1.method33765());
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "()V", line = 93)
	@Override
	public void method28243() {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_101, client.aClass82_2.aClass577_2);
		local5.aClass3_Sub41_Sub1_1.method20303(this.aClass600_1.method33765());
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "()V", line = 93)
	@Override
	public void method28241() {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_101, client.aClass82_2.aClass577_2);
		local5.aClass3_Sub41_Sub1_1.method20303(this.aClass600_1.method33765());
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "(Lclient!de;IIB)V", line = 590)
	static void method27899(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Class250.aClass328_97 == null) {
			return;
		}
		@Pc(10) Class464 local10 = client.aClass370_1.method26942();
		@Pc(13) Class328 local13 = arg0.method17333();
		Class592.method33350(arg0);
		local13.method26056(Class250.aClass332_53);
		local13.method26046(Class250.aClass328_97);
		local13.method26049();
		@Pc(30) int local30 = arg1 - Class250.anInt3814 * 526030743;
		@Pc(36) int local36 = arg2 - Class250.anInt3815 * -2061516899;
		if (client.aClass370_1.method26950() == null) {
			return;
		}
		@Pc(53) int local53;
		@Pc(166) int local166;
		@Pc(173) int local173;
		@Pc(221) int local221;
		if (!client.aBoolean596 || (Class162.anInt3446 * -1948586859 & 0x40) != 0) {
			@Pc(51) int local51 = -1;
			local53 = -1;
			@Pc(65) float local65 = (float) local30 * 2.0F / (float) (Class250.anInt3805 * 1138137437) - 1.0F;
			@Pc(77) float local77 = (float) local36 * 2.0F / (float) (Class250.anInt3817 * -981714459) - 1.0F;
			local13.method26052(local65, local77, -1.0F, Class250.aFloatArray99);
			@Pc(91) float local91 = Class250.aFloatArray99[0] / Class250.aFloatArray99[3];
			@Pc(99) float local99 = Class250.aFloatArray99[1] / Class250.aFloatArray99[3];
			@Pc(107) float local107 = Class250.aFloatArray99[2] / Class250.aFloatArray99[3];
			local13.method26052(local65, local77, 1.0F, Class250.aFloatArray99);
			@Pc(121) float local121 = Class250.aFloatArray99[0] / Class250.aFloatArray99[3];
			@Pc(129) float local129 = Class250.aFloatArray99[1] / Class250.aFloatArray99[3];
			@Pc(137) float local137 = Class250.aFloatArray99[2] / Class250.aFloatArray99[3];
			@Pc(147) float local147 = Class460.method28582(local91, local99, local107, local121, local129, local137, 4);
			if (local147 > 0.0F) {
				@Pc(155) float local155 = local121 - local91;
				@Pc(159) float local159 = local137 - local107;
				local166 = (int) (local91 + local147 * local155);
				local173 = (int) (local107 + local159 * local147);
				local51 = local166 + (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16630() - 1 << 8) >> 9;
				local53 = local173 + (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16630() - 1 << 8) >> 9;
				@Pc(200) byte local200 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101;
				if (local200 < 3 && (client.aClass370_1.method27075().aByteArrayArrayArray12[1][local166 >> 9][local173 >> 9] & 0x2) != 0) {
					local221 = local200 + 1;
				}
			}
			if (local51 != -1 && local53 != -1) {
				if (client.aBoolean596 && (Class162.anInt3446 * -1948586859 & 0x40) != 0) {
					@Pc(245) Class178 local245 = Class11_Sub2.method1219(Class616.anInt5552 * -944851473, client.anInt3122 * -2059988435);
					if (local245 == null) {
						Class44_Sub2.method15142();
					} else {
						Class531.method32488(client.aString153, " " + Class1.aString2 + " ", Class484.anInt5179 * -823340541, 59, -1, 0L, local51, local53, true, false, (long) (local51 << 0 | local53), true);
					}
				} else {
					if (Class338.aBoolean719) {
						Class531.method32488(Class601.aClass601_165.method33512(Class469.aClass530_2), "", -1, 60, -1, 0L, local51, local53, true, false, (long) (local51 << 0 | local53), true);
					}
					Class531.method32488(Class3_Sub31.aString48, "", client.anInt3118 * -409056437, 23, -1, 0L, local51, local53, true, false, (long) (local51 << 0 | local53), true);
				}
			}
		}
		@Pc(331) Class410 local331 = client.aClass370_1.method26950().aClass410_1;
		local53 = arg1;
		@Pc(335) int local335 = arg2;
		@Pc(338) List local338 = local331.aList15;
		@Pc(341) Iterator local341 = local338.iterator();
		while (true) {
			@Pc(378) int local378;
			@Pc(383) int local383;
			@Pc(1360) Interface43 local1360;
			@Pc(1369) Class467 local1369;
			@Pc(466) int local466;
			@Pc(1478) String[] local1478;
			do {
				@Pc(348) Class446 local348;
				do {
					do {
						do {
							@Pc(542) int var25;
							@Pc(658) int var26;
							@Pc(413) int var37;
							@Pc(874) int var62;
							while (true) {
								@Pc(514) Class320 var23;
								@Pc(528) int var24;
								@Pc(478) int var49;
								while (true) {
									do {
										do {
											if (!local341.hasNext()) {
												return;
											}
											local348 = (Class446) local341.next();
										} while (!client.aBoolean578 && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 != local348.aClass26_Sub1_25.aByte101);
									} while (!local348.method28341(arg0, local53, local335));
									if (local348.aClass26_Sub1_25 instanceof Class26_Sub1_Sub1) {
										local378 = ((Class26_Sub1_Sub1) local348.aClass26_Sub1_25).aShort94;
										local383 = ((Class26_Sub1_Sub1) local348.aClass26_Sub1_25).aShort93;
									} else {
										@Pc(389) Class320 local389 = local348.aClass26_Sub1_25.method21431().aClass320_61;
										local378 = (int) local389.aFloat259 >> 9;
										local383 = (int) local389.aFloat261 >> 9;
									}
									if (!(local348.aClass26_Sub1_25 instanceof Class26_Sub1_Sub1_Sub1_Sub2)) {
										break;
									}
									@Pc(409) Class26_Sub1_Sub1_Sub1_Sub2 local409 = (Class26_Sub1_Sub1_Sub1_Sub2) local348.aClass26_Sub1_25;
									var37 = local409.method16630();
									@Pc(417) Class320 local417 = local409.method21431().aClass320_61;
									if ((var37 & 0x1) == 0 && ((int) local417.aFloat259 & 0x1FF) == 0 && ((int) local417.aFloat261 & 0x1FF) == 0 || (var37 & 0x1) == 1 && ((int) local417.aFloat259 & 0x1FF) == 256 && ((int) local417.aFloat261 & 0x1FF) == 256) {
										local466 = (int) local417.aFloat259 - (local409.method16630() - 1 << 8);
										var49 = (int) local417.aFloat261 - (local409.method16630() - 1 << 8);
										for (local166 = 0; local166 < client.anInt3163 * 1758488217; local166++) {
											@Pc(493) Class3_Sub29 local493 = (Class3_Sub29) client.aClass581_21.method33217((long) client.anIntArray303[local166]);
											if (local493 != null) {
												@Pc(500) Class26_Sub1_Sub1_Sub1_Sub1 local500 = (Class26_Sub1_Sub1_Sub1_Sub1) local493.anObject2;
												if (client.anInt3034 != local500.anInt2382 * 1953066469 && local500.aBoolean415) {
													var23 = local500.method21431().aClass320_61;
													var24 = (int) var23.aFloat259 - (local500.aClass571_1.anInt5389 * 2130228951 - 1 << 8);
													var25 = (int) var23.aFloat261 - (local500.aClass571_1.anInt5389 * 2130228951 - 1 << 8);
													if (var24 >= local466 && local500.aClass571_1.anInt5389 * 2130228951 <= local409.method16630() - (var24 - local466 >> 9) && var25 >= var49 && local500.aClass571_1.anInt5389 * 2130228951 <= local409.method16630() - (var25 - var49 >> 9)) {
														Class424.method27891(local500, local348.aClass26_Sub1_25.aByte101 != Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101);
														local500.anInt2382 = client.anInt3034 * -1869346835;
													}
												}
											}
										}
										local166 = Class52.anInt1127 * 701602229;
										@Pc(603) int[] local603 = Class52.anIntArray167;
										for (local221 = 0; local221 < local166; local221++) {
											@Pc(614) Class26_Sub1_Sub1_Sub1_Sub2 local614 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local603[local221]];
											if (local614 != null && local614.anInt2382 * 1953066469 != client.anInt3034 && local409 != local614 && local614.aBoolean415) {
												@Pc(634) Class320 local634 = local614.method21431().aClass320_61;
												var25 = (int) local634.aFloat259 - (local614.method16630() - 1 << 8);
												var26 = (int) local634.aFloat261 - (local614.method16630() - 1 << 8);
												if (var25 >= local466 && local614.method16630() <= local409.method16630() - (var25 - local466 >> 9) && var26 >= var49 && local614.method16630() <= local409.method16630() - (var26 - var49 >> 9)) {
													Class162.method23273(local614, local348.aClass26_Sub1_25.aByte101 != Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101);
													local614.anInt2382 = client.anInt3034 * -1869346835;
												}
											}
										}
									}
									if (local409.anInt2382 * 1953066469 != client.anInt3034) {
										Class162.method23273(local409, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 != local348.aClass26_Sub1_25.aByte101);
										local409.anInt2382 = client.anInt3034 * -1869346835;
										break;
									}
								}
								if (!(local348.aClass26_Sub1_25 instanceof Class26_Sub1_Sub1_Sub1_Sub1)) {
									break;
								}
								@Pc(741) Class26_Sub1_Sub1_Sub1_Sub1 local741 = (Class26_Sub1_Sub1_Sub1_Sub1) local348.aClass26_Sub1_25;
								if (local741.aClass571_1 == null) {
									break;
								}
								@Pc(748) Class320 local748 = local741.method21431().aClass320_61;
								if ((local741.aClass571_1.anInt5389 * 2130228951 & 0x1) == 0 && ((int) local748.aFloat259 & 0x1FF) == 0 && ((int) local748.aFloat261 & 0x1FF) == 0 || (local741.aClass571_1.anInt5389 * 2130228951 & 0x1) == 1 && ((int) local748.aFloat259 & 0x1FF) == 256 && ((int) local748.aFloat261 & 0x1FF) == 256) {
									@Pc(807) int local807 = (int) local748.aFloat259 - (local741.aClass571_1.anInt5389 * 2130228951 - 1 << 8);
									local466 = (int) local748.aFloat261 - (local741.aClass571_1.anInt5389 * 2130228951 - 1 << 8);
									for (var49 = 0; var49 < client.anInt3163 * 1758488217; var49++) {
										@Pc(836) Class3_Sub29 local836 = (Class3_Sub29) client.aClass581_21.method33217((long) client.anIntArray303[var49]);
										if (local836 != null) {
											@Pc(843) Class26_Sub1_Sub1_Sub1_Sub1 local843 = (Class26_Sub1_Sub1_Sub1_Sub1) local836.anObject2;
											if (local843.anInt2382 * 1953066469 != client.anInt3034 && local843 != local741 && local843.aBoolean415) {
												@Pc(860) Class320 local860 = local843.method21431().aClass320_61;
												var62 = (int) local860.aFloat259 - (local843.aClass571_1.anInt5389 * 2130228951 - 1 << 8);
												var24 = (int) local860.aFloat261 - (local843.aClass571_1.anInt5389 * 2130228951 - 1 << 8);
												if (var62 >= local807 && local843.aClass571_1.anInt5389 * 2130228951 <= local741.aClass571_1.anInt5389 * 2130228951 - (var62 - local807 >> 9) && var24 >= local466 && local843.aClass571_1.anInt5389 * 2130228951 <= local741.aClass571_1.anInt5389 * 2130228951 - (var24 - local466 >> 9)) {
													Class424.method27891(local843, local348.aClass26_Sub1_25.aByte101 != Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101);
													local843.anInt2382 = client.anInt3034 * -1869346835;
												}
											}
										}
									}
									var49 = Class52.anInt1127 * 701602229;
									@Pc(953) int[] local953 = Class52.anIntArray167;
									for (local173 = 0; local173 < var49; local173++) {
										@Pc(964) Class26_Sub1_Sub1_Sub1_Sub2 local964 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local953[local173]];
										if (local964 != null && local964.anInt2382 * 1953066469 != client.anInt3034 && local964.aBoolean415) {
											var23 = local964.method21431().aClass320_61;
											var24 = (int) var23.aFloat259 - (local964.method16630() - 1 << 8);
											var25 = (int) var23.aFloat261 - (local964.method16630() - 1 << 8);
											if (var24 >= local807 && local964.method16630() <= local741.aClass571_1.anInt5389 * 2130228951 - (var24 - local807 >> 9) && var25 >= local466 && local964.method16630() <= local741.aClass571_1.anInt5389 * 2130228951 - (var25 - local466 >> 9)) {
												Class162.method23273(local964, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 != local348.aClass26_Sub1_25.aByte101);
												local964.anInt2382 = client.anInt3034 * -1869346835;
											}
										}
									}
								}
								if (client.anInt3034 != local741.anInt2382 * 1953066469) {
									Class424.method27891(local741, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 != local348.aClass26_Sub1_25.aByte101);
									local741.anInt2382 = client.anInt3034 * -1869346835;
									break;
								}
							}
							if (local348.aClass26_Sub1_25 instanceof Class26_Sub1_Sub5_Sub1) {
								@Pc(1094) int local1094 = local10.anInt5071 * -1567811631 + local378;
								var37 = local10.anInt5073 * 1360175441 + local383;
								@Pc(1117) Class3_Sub13 local1117 = (Class3_Sub13) client.aClass581_19.method33217((long) (local348.aClass26_Sub1_25.aByte101 << 28 | var37 << 14 | local1094));
								if (local1117 != null) {
									local466 = 0;
									@Pc(1127) Class3_Sub4 local1127 = (Class3_Sub4) local1117.aClass553_17.method32727();
									while (local1127 != null) {
										@Pc(1137) Class594 local1137 = Class44_Sub3.aClass596_1.method33435(local1127.anInt1163 * 212444761);
										if (local1137.aBoolean845) {
											local173 = local1137.anInt5514 * -651326929;
										} else if (local1137.aBoolean843) {
											local173 = Class44.aClass483_5.anInt5159 * 601732047;
										} else {
											local173 = Class44.aClass483_5.anInt5160 * -867495587;
										}
										if (client.aBoolean596 && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 == local348.aClass26_Sub1_25.aByte101) {
											@Pc(1182) Class630 local1182 = Class354.anInt4634 * 670813509 == -1 ? null : Class3_Sub20.aClass625_1.method33783(Class354.anInt4634 * 670813509);
											if ((Class162.anInt3446 * -1948586859 & 0x1) != 0 && (local1182 == null || local1137.method33375(Class354.anInt4634 * 670813509, local1182.anInt5585 * 100041865) != local1182.anInt5585 * 100041865)) {
												Class531.method32488(client.aString153, client.aString152 + " " + Class1.aString2 + " " + Class271.method25310(local173) + local1137.aString243, Class484.anInt5179 * -823340541, 17, -1, (long) (local1127.anInt1163 * 212444761), local378, local383, true, false, (long) local466, false);
											}
										}
										if (local348.aClass26_Sub1_25.aByte101 == Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101) {
											@Pc(1254) String[] local1254 = local1137.aStringArray23;
											for (var62 = local1254.length - 1; var62 >= 0; var62--) {
												if (local1254[var62] != null) {
													@Pc(1268) short local1268 = 0;
													var25 = client.anInt3145 * 687914897;
													if (var62 == 0) {
														local1268 = 18;
													}
													if (var62 == 1) {
														local1268 = 19;
													}
													if (var62 == 2) {
														local1268 = 20;
													}
													if (var62 == 3) {
														local1268 = 21;
													}
													if (var62 == 4) {
														local1268 = 22;
													}
													if (var62 == 5) {
														local1268 = 1004;
													}
													var26 = local1137.method33377(var62);
													if (var26 != -1) {
														var25 = var26;
													}
													Class531.method32488(local1254[var62], Class271.method25310(local173) + local1137.aString243, var25, local1268, -1, (long) (local1127.anInt1163 * 212444761), local378, local383, true, false, (long) local466, false);
												}
											}
										}
										local1127 = (Class3_Sub4) local1117.aClass553_17.method32716();
										local466++;
									}
								}
							}
						} while (!(local348.aClass26_Sub1_25 instanceof Interface43));
						local1360 = (Interface43) local348.aClass26_Sub1_25;
						local1369 = client.aClass370_1.method26954().method28510(local1360.method11163());
						if (local1369.anIntArray464 != null) {
							local1369 = local1369.method28716(Class424.aClass165_1, Class424.aClass165_1);
						}
					} while (local1369 == null);
					if (client.aBoolean596 && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 == local348.aClass26_Sub1_25.aByte101) {
						@Pc(1404) Class630 local1404 = Class354.anInt4634 * 670813509 == -1 ? null : Class3_Sub20.aClass625_1.method33783(Class354.anInt4634 * 670813509);
						if ((Class162.anInt3446 * -1948586859 & 0x4) != 0 && (local1404 == null || local1369.method28683(Class354.anInt4634 * 670813509, local1404.anInt5585 * 100041865) != local1404.anInt5585 * 100041865)) {
							Class531.method32488(client.aString153, client.aString152 + " " + Class1.aString2 + " " + Class271.method25310(65535) + local1369.aString226, Class484.anInt5179 * -823340541, 2, -1, Class157.method23194(local1360, local378, local383), local378, local383, true, false, (long) local1360.hashCode(), false);
						}
					}
				} while (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 != local348.aClass26_Sub1_25.aByte101);
				local1478 = local1369.aStringArray18;
			} while (local1478 == null);
			for (local466 = local1478.length - 1; local466 >= 0; local466--) {
				if (local1478[local466] != null) {
					@Pc(1495) short local1495 = 0;
					local166 = client.anInt3145 * 687914897;
					if (local466 == 0) {
						local1495 = 3;
					}
					if (local466 == 1) {
						local1495 = 4;
					}
					if (local466 == 2) {
						local1495 = 5;
					}
					if (local466 == 3) {
						local1495 = 6;
					}
					if (local466 == 4) {
						local1495 = 1001;
					}
					if (local466 == 5) {
						local1495 = 1002;
					}
					local173 = local1369.method28675(local466);
					if (local173 != -1) {
						local166 = local173;
					}
					Class531.method32488(local1478[local466], Class271.method25310(65535) + local1369.aString226, local166, local1495, -1, Class157.method23194(local1360, local378, local383), local378, local383, true, false, (long) local1360.hashCode(), false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "abl", descriptor = "(Lclient!vs;I)V", line = 8949)
	static final void method27896(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5315 -= 1580027550;
		@Pc(14) String local14 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575];
		@Pc(25) String local25 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 1];
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1 != null && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1.aBoolean805) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local25;
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local14;
		}
	}

	@OriginalMember(owner = "client!rb", name = "ags", descriptor = "(Lclient!vs;S)V", line = 10117)
	static final void method27897(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		Class10.method720(local13, local23 >> 14 & 0x3FFF, local23 & 0x3FFF, true);
	}

	@OriginalMember(owner = "client!rb", name = "aqz", descriptor = "(Lclient!vs;B)V", line = 11962)
	static final void method27898(@OriginalArg(0) Class536 arg0) {
	}
}
