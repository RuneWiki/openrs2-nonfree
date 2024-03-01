package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class562 {

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
	static final int anInt5362 = 23;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
	static final int anInt5363 = 16;

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
	static final int anInt5364 = 0;

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
	static final int anInt5365 = 1;

	@OriginalMember(owner = "client!wt", name = "x", descriptor = "I")
	static final int anInt5366 = 6;

	@OriginalMember(owner = "client!wt", name = "s", descriptor = "I")
	static final int anInt5367 = 50;

	@OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
	static final int anInt5368 = 4096;

	@OriginalMember(owner = "client!wt", name = "u", descriptor = "Lclient!wp;")
	static Class558 aClass558_1 = new Class558();

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V", line = 15)
	Class562() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!wt", name = "p", descriptor = "([BI[BII)I", line = 20)
	public static int method32867(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class558 local2 = aClass558_1;
		synchronized (aClass558_1) {
			aClass558_1.aByteArray99 = arg2;
			aClass558_1.anInt5341 = arg4 * -807985703;
			aClass558_1.aByteArray100 = arg0;
			aClass558_1.anInt5355 = 0;
			aClass558_1.anInt5344 = arg1 * -41184201;
			aClass558_1.anInt5336 = 0;
			aClass558_1.anInt5343 = 0;
			aClass558_1.anInt5342 = 0;
			aClass558_1.anInt5345 = 0;
			method32869(aClass558_1);
			@Pc(43) int local43 = arg1 - aClass558_1.anInt5344 * -1281072761;
			aClass558_1.aByteArray99 = null;
			aClass558_1.aByteArray100 = null;
			return local43;
		}
	}

	@OriginalMember(owner = "client!wt", name = "y", descriptor = "([BI[BII)I", line = 20)
	public static int method32875(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(2) Class558 local2 = aClass558_1;
		synchronized (aClass558_1) {
			aClass558_1.aByteArray99 = arg2;
			aClass558_1.anInt5341 = arg3 * -807985703;
			aClass558_1.aByteArray100 = arg0;
			aClass558_1.anInt5355 = 0;
			aClass558_1.anInt5344 = arg1 * -41184201;
			aClass558_1.anInt5336 = 0;
			aClass558_1.anInt5343 = 0;
			aClass558_1.anInt5342 = 0;
			aClass558_1.anInt5345 = 0;
			method32869(aClass558_1);
			@Pc(43) int local43 = arg1 - aClass558_1.anInt5344 * -1281072761;
			aClass558_1.aByteArray99 = null;
			aClass558_1.aByteArray100 = null;
			return local43;
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "([BI[BII)I", line = 20)
	public static int method32876(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(2) Class558 local2 = aClass558_1;
		synchronized (aClass558_1) {
			aClass558_1.aByteArray99 = arg2;
			aClass558_1.anInt5341 = arg3 * -807985703;
			aClass558_1.aByteArray100 = arg0;
			aClass558_1.anInt5355 = 0;
			aClass558_1.anInt5344 = arg1 * -41184201;
			aClass558_1.anInt5336 = 0;
			aClass558_1.anInt5343 = 0;
			aClass558_1.anInt5342 = 0;
			aClass558_1.anInt5345 = 0;
			method32869(aClass558_1);
			@Pc(43) int local43 = arg1 - aClass558_1.anInt5344 * -1281072761;
			aClass558_1.aByteArray99 = null;
			aClass558_1.aByteArray100 = null;
			return local43;
		}
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(Lclient!wp;)V", line = 40)
	static void method32866(@OriginalArg(0) Class558 arg0) {
		@Pc(2) byte local2 = arg0.aByte172;
		@Pc(7) int local7 = arg0.anInt5340 * 1618478355;
		@Pc(12) int local12 = arg0.anInt5353 * 1956265681;
		@Pc(17) int local17 = arg0.anInt5350 * 938338749;
		@Pc(19) int[] local19 = Class194.anIntArray387;
		@Pc(24) int local24 = arg0.anInt5354 * 485042115;
		@Pc(27) byte[] local27 = arg0.aByteArray100;
		@Pc(32) int local32 = arg0.anInt5355 * -686287521;
		@Pc(37) int local37 = arg0.anInt5344 * -1281072761;
		@Pc(39) int local39 = local37;
		@Pc(46) int local46 = arg0.anInt5356 * 862783245 + 1;
		label63: while (true) {
			if (local7 > 0) {
				while (true) {
					if (local37 == 0) {
						break label63;
					}
					if (local7 == 1) {
						if (local37 == 0) {
							local7 = 1;
							break label63;
						}
						local27[local32] = local2;
						local32++;
						local37--;
						break;
					}
					local27[local32] = local2;
					local7--;
					local32++;
					local37--;
				}
			}
			while (local12 != local46) {
				local2 = (byte) local17;
				local24 = local19[local24];
				@Pc(90) byte local90 = (byte) local24;
				local24 >>= 0x8;
				local12++;
				if (local90 == local17) {
					if (local12 != local46) {
						local7 = 2;
						local24 = local19[local24];
						local90 = (byte) local24;
						local24 >>= 0x8;
						local12++;
						if (local12 != local46) {
							if (local90 == local17) {
								local7 = 3;
								local24 = local19[local24];
								local90 = (byte) local24;
								local24 >>= 0x8;
								local12++;
								if (local12 != local46) {
									if (local90 == local17) {
										local24 = local19[local24];
										local90 = (byte) local24;
										local24 >>= 0x8;
										local12++;
										local7 = (local90 & 0xFF) + 4;
										local24 = local19[local24];
										local17 = (byte) local24;
										local24 >>= 0x8;
										local12++;
									} else {
										local17 = local90;
									}
								}
							} else {
								local17 = local90;
							}
						}
						continue label63;
					}
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				} else {
					local17 = local90;
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				}
			}
			local7 = 0;
			break;
		}
		@Pc(211) int local211 = arg0.anInt5345 * -702134147;
		arg0.anInt5345 += (local39 - local37) * -430214955;
		if (arg0.anInt5345 * -702134147 < local211) {
		}
		arg0.aByte172 = local2;
		arg0.anInt5340 = local7 * -1832612581;
		arg0.anInt5353 = local12 * -599991759;
		arg0.anInt5350 = local17 * -1644586603;
		Class194.anIntArray387 = local19;
		arg0.anInt5354 = local24 * 186482923;
		arg0.aByteArray100 = local27;
		arg0.anInt5355 = local32 * -570063201;
		arg0.anInt5344 = local37 * -41184201;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!wp;)V", line = 40)
	static void method32873(@OriginalArg(0) Class558 arg0) {
		@Pc(2) byte local2 = arg0.aByte172;
		@Pc(7) int local7 = arg0.anInt5340 * 1618478355;
		@Pc(12) int local12 = arg0.anInt5353 * 1956265681;
		@Pc(17) int local17 = arg0.anInt5350 * 938338749;
		@Pc(19) int[] local19 = Class194.anIntArray387;
		@Pc(24) int local24 = arg0.anInt5354 * 485042115;
		@Pc(27) byte[] local27 = arg0.aByteArray100;
		@Pc(32) int local32 = arg0.anInt5355 * -686287521;
		@Pc(37) int local37 = arg0.anInt5344 * -1281072761;
		@Pc(39) int local39 = local37;
		@Pc(46) int local46 = arg0.anInt5356 * 862783245 + 1;
		label63: while (true) {
			if (local7 > 0) {
				while (true) {
					if (local37 == 0) {
						break label63;
					}
					if (local7 == 1) {
						if (local37 == 0) {
							local7 = 1;
							break label63;
						}
						local27[local32] = local2;
						local32++;
						local37--;
						break;
					}
					local27[local32] = local2;
					local7--;
					local32++;
					local37--;
				}
			}
			while (local12 != local46) {
				local2 = (byte) local17;
				local24 = local19[local24];
				@Pc(90) byte local90 = (byte) local24;
				local24 >>= 0x8;
				local12++;
				if (local90 == local17) {
					if (local12 != local46) {
						local7 = 2;
						local24 = local19[local24];
						local90 = (byte) local24;
						local24 >>= 0x8;
						local12++;
						if (local12 != local46) {
							if (local90 == local17) {
								local7 = 3;
								local24 = local19[local24];
								local90 = (byte) local24;
								local24 >>= 0x8;
								local12++;
								if (local12 != local46) {
									if (local90 == local17) {
										local24 = local19[local24];
										local90 = (byte) local24;
										local24 >>= 0x8;
										local12++;
										local7 = (local90 & 0xFF) + 4;
										local24 = local19[local24];
										local17 = (byte) local24;
										local24 >>= 0x8;
										local12++;
									} else {
										local17 = local90;
									}
								}
							} else {
								local17 = local90;
							}
						}
						continue label63;
					}
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				} else {
					local17 = local90;
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				}
			}
			local7 = 0;
			break;
		}
		@Pc(211) int local211 = arg0.anInt5345 * -702134147;
		arg0.anInt5345 += (local39 - local37) * -430214955;
		if (arg0.anInt5345 * -702134147 < local211) {
		}
		arg0.aByte172 = local2;
		arg0.anInt5340 = local7 * -1832612581;
		arg0.anInt5353 = local12 * -599991759;
		arg0.anInt5350 = local17 * -1644586603;
		Class194.anIntArray387 = local19;
		arg0.anInt5354 = local24 * 186482923;
		arg0.aByteArray100 = local27;
		arg0.anInt5355 = local32 * -570063201;
		arg0.anInt5344 = local37 * -41184201;
	}

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "(Lclient!wp;)V", line = 151)
	static void method32869(@OriginalArg(0) Class558 arg0) {
		@Pc(37) int local37 = 0;
		@Pc(39) int[] local39 = null;
		@Pc(41) int[] local41 = null;
		@Pc(43) int[] local43 = null;
		arg0.anInt5347 = -554041233;
		if (Class194.anIntArray387 == null) {
			Class194.anIntArray387 = new int[arg0.anInt5347 * 1705571168];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(61) byte local61 = method32870(arg0);
				if (local61 == 23) {
					return;
				}
				local61 = method32870(arg0);
				local61 = method32870(arg0);
				local61 = method32870(arg0);
				local61 = method32870(arg0);
				local61 = method32870(arg0);
				local61 = method32870(arg0);
				local61 = method32870(arg0);
				local61 = method32870(arg0);
				local61 = method32870(arg0);
				local61 = method32871(arg0);
				if (local61 != 0) {
				}
				arg0.anInt5348 = 0;
				local61 = method32870(arg0);
				arg0.anInt5348 = (arg0.anInt5348 * -1676117189 << 8 | local61 & 0xFF) * 379758067;
				local61 = method32870(arg0);
				arg0.anInt5348 = (arg0.anInt5348 * -1676117189 << 8 | local61 & 0xFF) * 379758067;
				local61 = method32870(arg0);
				arg0.anInt5348 = (arg0.anInt5348 * -1676117189 << 8 | local61 & 0xFF) * 379758067;
				@Pc(153) int local153;
				for (local153 = 0; local153 < 16; local153++) {
					local61 = method32871(arg0);
					if (local61 == 1) {
						arg0.aBooleanArray36[local153] = true;
					} else {
						arg0.aBooleanArray36[local153] = false;
					}
				}
				for (local153 = 0; local153 < 256; local153++) {
					arg0.aBooleanArray35[local153] = false;
				}
				@Pc(199) int local199;
				for (local153 = 0; local153 < 16; local153++) {
					if (arg0.aBooleanArray36[local153]) {
						for (local199 = 0; local199 < 16; local199++) {
							local61 = method32871(arg0);
							if (local61 == 1) {
								arg0.aBooleanArray35[local153 * 16 + local199] = true;
							}
						}
					}
				}
				method32881(arg0);
				@Pc(230) int local230 = arg0.anInt5352 * -151193097 + 2;
				@Pc(234) int local234 = method32872(3, arg0);
				@Pc(238) int local238 = method32872(15, arg0);
				for (local153 = 0; local153 < local238; local153++) {
					local199 = 0;
					while (true) {
						local61 = method32871(arg0);
						if (local61 == 0) {
							arg0.aByteArray104[local153] = (byte) local199;
							break;
						}
						local199++;
					}
				}
				@Pc(264) byte[] local264 = new byte[6];
				@Pc(266) byte local266 = 0;
				while (local266 < local234) {
					local264[local266] = local266++;
				}
				for (local153 = 0; local153 < local238; local153++) {
					local266 = arg0.aByteArray104[local153];
					@Pc(293) byte local293 = local264[local266];
					while (local266 > 0) {
						local264[local266] = local264[local266 - 1];
						local266--;
					}
					local264[0] = local293;
					arg0.aByteArray101[local153] = local293;
				}
				@Pc(322) int local322;
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(329) int local329 = method32872(5, arg0);
					for (local153 = 0; local153 < local230; local153++) {
						while (true) {
							local61 = method32871(arg0);
							if (local61 == 0) {
								arg0.aByteArrayArray28[local322][local153] = (byte) local329;
								break;
							}
							local61 = method32871(arg0);
							if (local61 == 0) {
								local329++;
							} else {
								local329--;
							}
						}
					}
				}
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(368) byte local368 = 32;
					@Pc(370) byte local370 = 0;
					for (local153 = 0; local153 < local230; local153++) {
						if (arg0.aByteArrayArray28[local322][local153] > local370) {
							local370 = arg0.aByteArrayArray28[local322][local153];
						}
						if (arg0.aByteArrayArray28[local322][local153] < local368) {
							local368 = arg0.aByteArrayArray28[local322][local153];
						}
					}
					method32879(arg0.anIntArrayArray63[local322], arg0.anIntArrayArray64[local322], arg0.anIntArrayArray65[local322], arg0.aByteArrayArray28[local322], local368, local370, local230);
					arg0.anIntArray503[local322] = local368;
				}
				@Pc(441) int local441 = arg0.anInt5352 * -151193097 + 1;
				@Pc(443) int local443 = -1;
				@Pc(445) byte local445 = 0;
				for (local153 = 0; local153 <= 255; local153++) {
					arg0.anIntArray500[local153] = 0;
				}
				@Pc(459) int local459 = 4095;
				@Pc(461) int local461;
				@Pc(465) int local465;
				for (local461 = 15; local461 >= 0; local461--) {
					for (local465 = 15; local465 >= 0; local465--) {
						arg0.aByteArray103[local459] = (byte) (local461 * 16 + local465);
						local459--;
					}
					arg0.anIntArray502[local461] = local459 + 1;
				}
				@Pc(491) int local491 = 0;
				@Pc(501) byte local501;
				if (local445 == 0) {
					local443++;
					local445 = 50;
					local501 = arg0.aByteArray101[local443];
					local37 = arg0.anIntArray503[local501];
					local39 = arg0.anIntArrayArray63[local501];
					local43 = arg0.anIntArrayArray65[local501];
					local41 = arg0.anIntArrayArray64[local501];
				}
				@Pc(522) int local522 = local445 - 1;
				@Pc(524) int local524 = local37;
				@Pc(528) int local528;
				@Pc(538) byte local538;
				for (local528 = method32872(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
					local524++;
					local538 = method32871(arg0);
				}
				@Pc(553) int local553 = local43[local528 - local41[local524]];
				while (true) {
					while (local553 != local441) {
						if (local553 == 0 || local553 == 1) {
							@Pc(564) int local564 = -1;
							@Pc(566) int local566 = 1;
							do {
								if (local553 == 0) {
									local564 += local566;
								} else if (local553 == 1) {
									local564 += local566 * 2;
								}
								local566 *= 2;
								if (local522 == 0) {
									local443++;
									local522 = 50;
									local501 = arg0.aByteArray101[local443];
									local37 = arg0.anIntArray503[local501];
									local39 = arg0.anIntArrayArray63[local501];
									local43 = arg0.anIntArrayArray65[local501];
									local41 = arg0.anIntArrayArray64[local501];
								}
								local522--;
								local524 = local37;
								for (local528 = method32872(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
									local524++;
									local538 = method32871(arg0);
								}
								local553 = local43[local528 - local41[local524]];
							} while (local553 == 0 || local553 == 1);
							local564++;
							local61 = arg0.aByteArray102[arg0.aByteArray103[arg0.anIntArray502[0]] & 0xFF];
							arg0.anIntArray500[local61 & 0xFF] += local564;
							while (local564 > 0) {
								Class194.anIntArray387[local491] = local61 & 0xFF;
								local491++;
								local564--;
							}
						} else {
							@Pc(694) int local694 = local553 - 1;
							@Pc(702) int local702;
							if (local694 < 16) {
								local702 = arg0.anIntArray502[0];
								local61 = arg0.aByteArray103[local702 + local694];
								while (local694 > 3) {
									@Pc(716) int local716 = local702 + local694;
									arg0.aByteArray103[local716] = arg0.aByteArray103[local716 - 1];
									arg0.aByteArray103[local716 - 1] = arg0.aByteArray103[local716 - 2];
									arg0.aByteArray103[local716 - 2] = arg0.aByteArray103[local716 - 3];
									arg0.aByteArray103[local716 - 3] = arg0.aByteArray103[local716 - 4];
									local694 -= 4;
								}
								while (local694 > 0) {
									arg0.aByteArray103[local702 + local694] = arg0.aByteArray103[local702 + local694 - 1];
									local694--;
								}
								arg0.aByteArray103[local702] = local61;
							} else {
								@Pc(792) int local792 = local694 / 16;
								@Pc(796) int local796 = local694 % 16;
								local702 = arg0.anIntArray502[local792] + local796;
								local61 = arg0.aByteArray103[local702];
								while (local702 > arg0.anIntArray502[local792]) {
									arg0.aByteArray103[local702] = arg0.aByteArray103[local702 - 1];
									local702--;
								}
								@Pc(831) int local831 = arg0.anIntArray502[local792]++;
								while (local792 > 0) {
									local831 = arg0.anIntArray502[local792]--;
									arg0.aByteArray103[arg0.anIntArray502[local792]] = arg0.aByteArray103[arg0.anIntArray502[local792 - 1] + 16 - 1];
									local792--;
								}
								local831 = arg0.anIntArray502[0]--;
								arg0.aByteArray103[arg0.anIntArray502[0]] = local61;
								if (arg0.anIntArray502[0] == 0) {
									local459 = 4095;
									for (local461 = 15; local461 >= 0; local461--) {
										for (local465 = 15; local465 >= 0; local465--) {
											arg0.aByteArray103[local459] = arg0.aByteArray103[arg0.anIntArray502[local461] + local465];
											local459--;
										}
										arg0.anIntArray502[local461] = local459 + 1;
									}
								}
							}
							arg0.anIntArray500[arg0.aByteArray102[local61 & 0xFF] & 0xFF]++;
							Class194.anIntArray387[local491] = arg0.aByteArray102[local61 & 0xFF] & 0xFF;
							local491++;
							if (local522 == 0) {
								local443++;
								local522 = 50;
								local501 = arg0.aByteArray101[local443];
								local37 = arg0.anIntArray503[local501];
								local39 = arg0.anIntArrayArray63[local501];
								local43 = arg0.anIntArrayArray65[local501];
								local41 = arg0.anIntArrayArray64[local501];
							}
							local522--;
							local524 = local37;
							for (local528 = method32872(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
								local524++;
								local538 = method32871(arg0);
							}
							local553 = local43[local528 - local41[local524]];
						}
					}
					arg0.anInt5340 = 0;
					arg0.aByte172 = 0;
					arg0.anIntArray501[0] = 0;
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray501[local153] = arg0.anIntArray500[local153 - 1];
					}
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray501[local153] += arg0.anIntArray501[local153 - 1];
					}
					for (local153 = 0; local153 < local491; local153++) {
						local61 = (byte) (Class194.anIntArray387[local153] & 0xFF);
						Class194.anIntArray387[arg0.anIntArray501[local61 & 0xFF]] |= local153 << 8;
						arg0.anIntArray501[local61 & 0xFF]++;
					}
					arg0.anInt5354 = (Class194.anIntArray387[arg0.anInt5348 * -1676117189] >> 8) * 186482923;
					arg0.anInt5353 = 0;
					arg0.anInt5354 = Class194.anIntArray387[arg0.anInt5354 * 485042115] * 186482923;
					arg0.anInt5350 = (byte) (arg0.anInt5354 * 485042115 & 0xFF) * -1644586603;
					arg0.anInt5354 = (arg0.anInt5354 * 485042115 >> 8) * 186482923;
					arg0.anInt5353 += -599991759;
					arg0.anInt5356 = local491 * -1367662651;
					method32873(arg0);
					if (arg0.anInt5353 * 1956265681 == arg0.anInt5356 * 862783245 + 1 && arg0.anInt5340 * 1618478355 == 0) {
						local56 = true;
						break;
					}
					local56 = false;
					break;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!wt", name = "z", descriptor = "(Lclient!wp;)V", line = 151)
	static void method32877(@OriginalArg(0) Class558 arg0) {
		@Pc(37) int local37 = 0;
		@Pc(39) int[] local39 = null;
		@Pc(41) int[] local41 = null;
		@Pc(43) int[] local43 = null;
		arg0.anInt5347 = -554041233;
		if (Class194.anIntArray387 == null) {
			Class194.anIntArray387 = new int[arg0.anInt5347 * 1705571168];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(61) byte local61 = method32870(arg0);
				if (local61 == 23) {
					return;
				}
				local61 = method32870(arg0);
				local61 = method32870(arg0);
				local61 = method32870(arg0);
				local61 = method32870(arg0);
				local61 = method32870(arg0);
				local61 = method32870(arg0);
				local61 = method32870(arg0);
				local61 = method32870(arg0);
				local61 = method32870(arg0);
				local61 = method32871(arg0);
				if (local61 != 0) {
				}
				arg0.anInt5348 = 0;
				local61 = method32870(arg0);
				arg0.anInt5348 = (arg0.anInt5348 * -1676117189 << 8 | local61 & 0xFF) * 379758067;
				local61 = method32870(arg0);
				arg0.anInt5348 = (arg0.anInt5348 * -1676117189 << 8 | local61 & 0xFF) * 379758067;
				local61 = method32870(arg0);
				arg0.anInt5348 = (arg0.anInt5348 * -1676117189 << 8 | local61 & 0xFF) * 379758067;
				@Pc(153) int local153;
				for (local153 = 0; local153 < 16; local153++) {
					local61 = method32871(arg0);
					if (local61 == 1) {
						arg0.aBooleanArray36[local153] = true;
					} else {
						arg0.aBooleanArray36[local153] = false;
					}
				}
				for (local153 = 0; local153 < 256; local153++) {
					arg0.aBooleanArray35[local153] = false;
				}
				@Pc(199) int local199;
				for (local153 = 0; local153 < 16; local153++) {
					if (arg0.aBooleanArray36[local153]) {
						for (local199 = 0; local199 < 16; local199++) {
							local61 = method32871(arg0);
							if (local61 == 1) {
								arg0.aBooleanArray35[local153 * 16 + local199] = true;
							}
						}
					}
				}
				method32881(arg0);
				@Pc(230) int local230 = arg0.anInt5352 * -151193097 + 2;
				@Pc(234) int local234 = method32872(3, arg0);
				@Pc(238) int local238 = method32872(15, arg0);
				for (local153 = 0; local153 < local238; local153++) {
					local199 = 0;
					while (true) {
						local61 = method32871(arg0);
						if (local61 == 0) {
							arg0.aByteArray104[local153] = (byte) local199;
							break;
						}
						local199++;
					}
				}
				@Pc(264) byte[] local264 = new byte[6];
				@Pc(266) byte local266 = 0;
				while (local266 < local234) {
					local264[local266] = local266++;
				}
				for (local153 = 0; local153 < local238; local153++) {
					local266 = arg0.aByteArray104[local153];
					@Pc(293) byte local293 = local264[local266];
					while (local266 > 0) {
						local264[local266] = local264[local266 - 1];
						local266--;
					}
					local264[0] = local293;
					arg0.aByteArray101[local153] = local293;
				}
				@Pc(322) int local322;
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(329) int local329 = method32872(5, arg0);
					for (local153 = 0; local153 < local230; local153++) {
						while (true) {
							local61 = method32871(arg0);
							if (local61 == 0) {
								arg0.aByteArrayArray28[local322][local153] = (byte) local329;
								break;
							}
							local61 = method32871(arg0);
							if (local61 == 0) {
								local329++;
							} else {
								local329--;
							}
						}
					}
				}
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(368) byte local368 = 32;
					@Pc(370) byte local370 = 0;
					for (local153 = 0; local153 < local230; local153++) {
						if (arg0.aByteArrayArray28[local322][local153] > local370) {
							local370 = arg0.aByteArrayArray28[local322][local153];
						}
						if (arg0.aByteArrayArray28[local322][local153] < local368) {
							local368 = arg0.aByteArrayArray28[local322][local153];
						}
					}
					method32879(arg0.anIntArrayArray63[local322], arg0.anIntArrayArray64[local322], arg0.anIntArrayArray65[local322], arg0.aByteArrayArray28[local322], local368, local370, local230);
					arg0.anIntArray503[local322] = local368;
				}
				@Pc(441) int local441 = arg0.anInt5352 * -151193097 + 1;
				@Pc(443) int local443 = -1;
				@Pc(445) byte local445 = 0;
				for (local153 = 0; local153 <= 255; local153++) {
					arg0.anIntArray500[local153] = 0;
				}
				@Pc(459) int local459 = 4095;
				@Pc(461) int local461;
				@Pc(465) int local465;
				for (local461 = 15; local461 >= 0; local461--) {
					for (local465 = 15; local465 >= 0; local465--) {
						arg0.aByteArray103[local459] = (byte) (local461 * 16 + local465);
						local459--;
					}
					arg0.anIntArray502[local461] = local459 + 1;
				}
				@Pc(491) int local491 = 0;
				@Pc(501) byte local501;
				if (local445 == 0) {
					local443++;
					local445 = 50;
					local501 = arg0.aByteArray101[local443];
					local37 = arg0.anIntArray503[local501];
					local39 = arg0.anIntArrayArray63[local501];
					local43 = arg0.anIntArrayArray65[local501];
					local41 = arg0.anIntArrayArray64[local501];
				}
				@Pc(522) int local522 = local445 - 1;
				@Pc(524) int local524 = local37;
				@Pc(528) int local528;
				@Pc(538) byte local538;
				for (local528 = method32872(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
					local524++;
					local538 = method32871(arg0);
				}
				@Pc(553) int local553 = local43[local528 - local41[local524]];
				while (true) {
					while (local553 != local441) {
						if (local553 == 0 || local553 == 1) {
							@Pc(564) int local564 = -1;
							@Pc(566) int local566 = 1;
							do {
								if (local553 == 0) {
									local564 += local566;
								} else if (local553 == 1) {
									local564 += local566 * 2;
								}
								local566 *= 2;
								if (local522 == 0) {
									local443++;
									local522 = 50;
									local501 = arg0.aByteArray101[local443];
									local37 = arg0.anIntArray503[local501];
									local39 = arg0.anIntArrayArray63[local501];
									local43 = arg0.anIntArrayArray65[local501];
									local41 = arg0.anIntArrayArray64[local501];
								}
								local522--;
								local524 = local37;
								for (local528 = method32872(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
									local524++;
									local538 = method32871(arg0);
								}
								local553 = local43[local528 - local41[local524]];
							} while (local553 == 0 || local553 == 1);
							local564++;
							local61 = arg0.aByteArray102[arg0.aByteArray103[arg0.anIntArray502[0]] & 0xFF];
							arg0.anIntArray500[local61 & 0xFF] += local564;
							while (local564 > 0) {
								Class194.anIntArray387[local491] = local61 & 0xFF;
								local491++;
								local564--;
							}
						} else {
							@Pc(694) int local694 = local553 - 1;
							@Pc(702) int local702;
							if (local694 < 16) {
								local702 = arg0.anIntArray502[0];
								local61 = arg0.aByteArray103[local702 + local694];
								while (local694 > 3) {
									@Pc(716) int local716 = local702 + local694;
									arg0.aByteArray103[local716] = arg0.aByteArray103[local716 - 1];
									arg0.aByteArray103[local716 - 1] = arg0.aByteArray103[local716 - 2];
									arg0.aByteArray103[local716 - 2] = arg0.aByteArray103[local716 - 3];
									arg0.aByteArray103[local716 - 3] = arg0.aByteArray103[local716 - 4];
									local694 -= 4;
								}
								while (local694 > 0) {
									arg0.aByteArray103[local702 + local694] = arg0.aByteArray103[local702 + local694 - 1];
									local694--;
								}
								arg0.aByteArray103[local702] = local61;
							} else {
								@Pc(792) int local792 = local694 / 16;
								@Pc(796) int local796 = local694 % 16;
								local702 = arg0.anIntArray502[local792] + local796;
								local61 = arg0.aByteArray103[local702];
								while (local702 > arg0.anIntArray502[local792]) {
									arg0.aByteArray103[local702] = arg0.aByteArray103[local702 - 1];
									local702--;
								}
								@Pc(831) int local831 = arg0.anIntArray502[local792]++;
								while (local792 > 0) {
									local831 = arg0.anIntArray502[local792]--;
									arg0.aByteArray103[arg0.anIntArray502[local792]] = arg0.aByteArray103[arg0.anIntArray502[local792 - 1] + 16 - 1];
									local792--;
								}
								local831 = arg0.anIntArray502[0]--;
								arg0.aByteArray103[arg0.anIntArray502[0]] = local61;
								if (arg0.anIntArray502[0] == 0) {
									local459 = 4095;
									for (local461 = 15; local461 >= 0; local461--) {
										for (local465 = 15; local465 >= 0; local465--) {
											arg0.aByteArray103[local459] = arg0.aByteArray103[arg0.anIntArray502[local461] + local465];
											local459--;
										}
										arg0.anIntArray502[local461] = local459 + 1;
									}
								}
							}
							arg0.anIntArray500[arg0.aByteArray102[local61 & 0xFF] & 0xFF]++;
							Class194.anIntArray387[local491] = arg0.aByteArray102[local61 & 0xFF] & 0xFF;
							local491++;
							if (local522 == 0) {
								local443++;
								local522 = 50;
								local501 = arg0.aByteArray101[local443];
								local37 = arg0.anIntArray503[local501];
								local39 = arg0.anIntArrayArray63[local501];
								local43 = arg0.anIntArrayArray65[local501];
								local41 = arg0.anIntArrayArray64[local501];
							}
							local522--;
							local524 = local37;
							for (local528 = method32872(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
								local524++;
								local538 = method32871(arg0);
							}
							local553 = local43[local528 - local41[local524]];
						}
					}
					arg0.anInt5340 = 0;
					arg0.aByte172 = 0;
					arg0.anIntArray501[0] = 0;
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray501[local153] = arg0.anIntArray500[local153 - 1];
					}
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray501[local153] += arg0.anIntArray501[local153 - 1];
					}
					for (local153 = 0; local153 < local491; local153++) {
						local61 = (byte) (Class194.anIntArray387[local153] & 0xFF);
						Class194.anIntArray387[arg0.anIntArray501[local61 & 0xFF]] |= local153 << 8;
						arg0.anIntArray501[local61 & 0xFF]++;
					}
					arg0.anInt5354 = (Class194.anIntArray387[arg0.anInt5348 * -1676117189] >> 8) * 186482923;
					arg0.anInt5353 = 0;
					arg0.anInt5354 = Class194.anIntArray387[arg0.anInt5354 * 485042115] * 186482923;
					arg0.anInt5350 = (byte) (arg0.anInt5354 * 485042115 & 0xFF) * -1644586603;
					arg0.anInt5354 = (arg0.anInt5354 * 485042115 >> 8) * 186482923;
					arg0.anInt5353 += -599991759;
					arg0.anInt5356 = local491 * -1367662651;
					method32873(arg0);
					if (arg0.anInt5353 * 1956265681 == arg0.anInt5356 * 862783245 + 1 && arg0.anInt5340 * 1618478355 == 0) {
						local56 = true;
						break;
					}
					local56 = false;
					break;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "(Lclient!wp;)B", line = 447)
	static byte method32870(@OriginalArg(0) Class558 arg0) {
		return (byte) method32872(8, arg0);
	}

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "(Lclient!wp;)B", line = 447)
	static byte method32878(@OriginalArg(0) Class558 arg0) {
		return (byte) method32872(8, arg0);
	}

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "(Lclient!wp;)B", line = 451)
	static byte method32871(@OriginalArg(0) Class558 arg0) {
		return (byte) method32872(1, arg0);
	}

	@OriginalMember(owner = "client!wt", name = "x", descriptor = "(ILclient!wp;)I", line = 456)
	static int method32872(@OriginalArg(0) int arg0, @OriginalArg(1) Class558 arg1) {
		while (arg1.anInt5336 * 954291641 < arg0) {
			arg1.anInt5343 = (arg1.anInt5343 * 1916921715 << 8 | arg1.aByteArray99[arg1.anInt5341 * 894931561] & 0xFF) * -742222405;
			arg1.anInt5336 += 437322824;
			arg1.anInt5341 += -807985703;
			arg1.anInt5342 += -1142794973;
			if (arg1.anInt5342 * -1113554293 == 0) {
			}
		}
		@Pc(23) int local23 = arg1.anInt5343 * 1916921715 >> arg1.anInt5336 * 954291641 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt5336 -= arg0 * 591536265;
		return local23;
	}

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "(ILclient!wp;)I", line = 456)
	static int method32880(@OriginalArg(0) int arg0, @OriginalArg(1) Class558 arg1) {
		while (arg1.anInt5336 * 954291641 < arg0) {
			arg1.anInt5343 = (arg1.anInt5343 * 1916921715 << 8 | arg1.aByteArray99[arg1.anInt5341 * 894931561] & 0xFF) * -742222405;
			arg1.anInt5336 += 437322824;
			arg1.anInt5341 += -807985703;
			arg1.anInt5342 += -1142794973;
			if (arg1.anInt5342 * -1113554293 == 0) {
			}
		}
		@Pc(23) int local23 = arg1.anInt5343 * 1916921715 >> arg1.anInt5336 * 954291641 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt5336 -= arg0 * 591536265;
		return local23;
	}

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "(ILclient!wp;)I", line = 456)
	static int method32883(@OriginalArg(0) int arg0, @OriginalArg(1) Class558 arg1) {
		while (arg1.anInt5336 * 954291641 < arg0) {
			arg1.anInt5343 = (arg1.anInt5343 * 1916921715 << 8 | arg1.aByteArray99[arg1.anInt5341 * 894931561] & 0xFF) * -742222405;
			arg1.anInt5336 += 437322824;
			arg1.anInt5341 += -807985703;
			arg1.anInt5342 += -1142794973;
			if (arg1.anInt5342 * -1113554293 == 0) {
			}
		}
		@Pc(23) int local23 = arg1.anInt5343 * 1916921715 >> arg1.anInt5336 * 954291641 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt5336 -= arg0 * 591536265;
		return local23;
	}

	@OriginalMember(owner = "client!wt", name = "r", descriptor = "(Lclient!wp;)V", line = 472)
	static void method32874(@OriginalArg(0) Class558 arg0) {
		arg0.anInt5352 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray35[local4]) {
				arg0.aByteArray102[arg0.anInt5352 * -151193097] = (byte) local4;
				arg0.anInt5352 += 1663014855;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "s", descriptor = "(Lclient!wp;)V", line = 472)
	static void method32881(@OriginalArg(0) Class558 arg0) {
		arg0.anInt5352 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray35[local4]) {
				arg0.aByteArray102[arg0.anInt5352 * -151193097] = (byte) local4;
				arg0.anInt5352 += 1663014855;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(Lclient!wp;)V", line = 472)
	static void method32882(@OriginalArg(0) Class558 arg0) {
		arg0.anInt5352 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray35[local4]) {
				arg0.aByteArray102[arg0.anInt5352 * -151193097] = (byte) local4;
				arg0.anInt5352 += 1663014855;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "q", descriptor = "([I[I[I[BIII)V", line = 486)
	static void method32868(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = arg4; local3 <= arg5; local3++) {
			for (@Pc(8) int local8 = 0; local8 < arg6; local8++) {
				if (arg3[local8] == local3) {
					arg2[local1] = local8;
					local1++;
				}
			}
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg1[local3] = 0;
		}
		for (local3 = 0; local3 < arg6; local3++) {
			arg1[arg3[local3] + 1]++;
		}
		for (local3 = 1; local3 < 23; local3++) {
			arg1[local3] += arg1[local3 - 1];
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg0[local3] = 0;
		}
		@Pc(85) int local85 = 0;
		for (local3 = arg4; local3 <= arg5; local3++) {
			local85 += arg1[local3 + 1] - arg1[local3];
			arg0[local3] = local85 - 1;
			local85 <<= 0x1;
		}
		for (local3 = arg4 + 1; local3 <= arg5; local3++) {
			arg1[local3] = (arg0[local3 - 1] + 1 << 1) - arg1[local3];
		}
	}

	@OriginalMember(owner = "client!wt", name = "u", descriptor = "([I[I[I[BIII)V", line = 486)
	static void method32879(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = arg4; local3 <= arg5; local3++) {
			for (@Pc(8) int local8 = 0; local8 < arg6; local8++) {
				if (arg3[local8] == local3) {
					arg2[local1] = local8;
					local1++;
				}
			}
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg1[local3] = 0;
		}
		for (local3 = 0; local3 < arg6; local3++) {
			arg1[arg3[local3] + 1]++;
		}
		for (local3 = 1; local3 < 23; local3++) {
			arg1[local3] += arg1[local3 - 1];
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg0[local3] = 0;
		}
		@Pc(85) int local85 = 0;
		for (local3 = arg4; local3 <= arg5; local3++) {
			local85 += arg1[local3 + 1] - arg1[local3];
			arg0[local3] = local85 - 1;
			local85 <<= 0x1;
		}
		for (local3 = arg4 + 1; local3 <= arg5; local3++) {
			arg1[local3] = (arg0[local3 - 1] + 1 << 1) - arg1[local3];
		}
	}

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "([I[I[I[BIII)V", line = 486)
	static void method32884(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = arg4; local3 <= arg5; local3++) {
			for (@Pc(8) int local8 = 0; local8 < arg6; local8++) {
				if (arg3[local8] == local3) {
					arg2[local1] = local8;
					local1++;
				}
			}
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg1[local3] = 0;
		}
		for (local3 = 0; local3 < arg6; local3++) {
			arg1[arg3[local3] + 1]++;
		}
		for (local3 = 1; local3 < 23; local3++) {
			arg1[local3] += arg1[local3 - 1];
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg0[local3] = 0;
		}
		@Pc(85) int local85 = 0;
		for (local3 = arg4; local3 <= arg5; local3++) {
			local85 += arg1[local3 + 1] - arg1[local3];
			arg0[local3] = local85 - 1;
			local85 <<= 0x1;
		}
		for (local3 = arg4 + 1; local3 <= arg5; local3++) {
			arg1[local3] = (arg0[local3 - 1] + 1 << 1) - arg1[local3];
		}
	}
}
