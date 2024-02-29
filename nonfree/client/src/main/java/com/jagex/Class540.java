package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public class Class540 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!sq", name = "this$0", descriptor = "Lclient!sx;")
	final Class546 this$0;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!sx;)V", line = 78)
	Class540(@OriginalArg(0) Class546 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!sq", name = "ai", descriptor = "(I)V", line = 998)
	static void method30913() {
		Class589.aClass82_3.method1999();
		Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
		Class589.aClass82_3.aClass418_4 = null;
		Class589.aClass82_3.aClass418_3 = null;
		Class589.aClass82_3.aClass418_2 = null;
		Class589.aClass82_3.anInt323 = 0;
		client.anInt3481 = 0;
		client.anInt3453 = 0;
		client.anInt3529 = 0;
		client.anInt3532 = 0;
		client.aString163 = null;
		Class462.anInt4970 = 0;
		Class204.aClass50Array1 = null;
		Class22.aClass368_1 = null;
		Class199.aClass368_2 = null;
		client.aBoolean630 = true;
		Class542.method30943();
		for (@Pc(42) int local42 = 0; local42 < Class55.aClass124_1.aClass623Array1.length; local42++) {
			@Pc(56) Class623 local56 = new Class623(Class544.aClass620_1.method32412(local42), false);
			local56.method32447(0);
			local56.method32465(0);
			Class55.aClass124_1.aClass623Array1[local42] = local56;
		}
		Class55.aClass124_1.aClass608_1.method32134();
		Class143_Sub20.method15693();
		Class47.method744(Class589.aClass82_3);
	}

	@OriginalMember(owner = "client!sq", name = "al", descriptor = "(I)V", line = 1031)
	static void method30914() {
		if (client.anInt3390 * -1850530127 == 1) {
			Class518.method30561();
		}
		client.aClass82_1.method2014();
		method30913();
		Class77_Sub36.aBoolean351 = true;
		Class651.method32889();
		@Pc(17) int local17;
		for (local17 = 0; local17 < client.aClass73Array1.length; local17++) {
			client.aClass73Array1[local17] = null;
		}
		client.aBoolean619 = false;
		client.anInt3391 = ((int) (Math.random() * 100.0D) - 50) * 249179819;
		client.anInt3424 = ((int) (Math.random() * 110.0D) - 55) * 1002553817;
		client.anInt3426 = ((int) (Math.random() * 80.0D) - 40) * -503740369;
		client.anInt3462 = ((int) (Math.random() * 120.0D) - 60) * -1536818227;
		client.anInt3380 = ((int) (Math.random() * 30.0D) - 20) * -1403451729;
		client.aFloat247 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Class597.method31928();
		for (local17 = 0; local17 < 2048; local17++) {
			client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local17] = null;
		}
		Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 = null;
		client.anInt3527 = 0;
		client.anInt3438 = 0;
		client.aClass12_22.method188();
		client.aClass695_45.method36380();
		client.aClass12_21.method188();
		client.aClass703_7.method36521();
		client.aClass12_19.method188();
		Class77_Sub4.aClass695_17 = new Class695();
		Class77_Sub4.aClass695_18 = new Class695();
		Class96_Sub7.anInt829 = 0;
		Class96_Sub9.anInt833 = 0;
		Class127_Sub2.anInt1420 = 0;
		Class337.anInt4132 = 0;
		Class80.anInt319 = 0;
		Class650.anInt5741 = 0;
		Class605.anInt5562 = 0;
		Class111.anInt1096 = 0;
		Class56.anInt190 = 0;
		Class250.anInt3805 = 0;
		if (-993629849 * client.anInt3459 != -1) {
			Class248.method26154(client.anInt3459 * -993629849);
		}
		for (@Pc(161) Class77_Sub38 local161 = (Class77_Sub38) client.aClass12_20.method190(); local161 != null; local161 = (Class77_Sub38) client.aClass12_20.method192()) {
			if (!local161.method24066()) {
				local161 = (Class77_Sub38) client.aClass12_20.method190();
				if (local161 == null) {
					break;
				}
			}
			Class77_Sub41.method14838(local161, true, false);
		}
		client.anInt3459 = 1328962985;
		client.aClass12_20 = new Class12(8);
		Class696.method36463();
		client.aClass277_5 = null;
		for (local17 = 0; local17 < 8; local17++) {
			client.aStringArray24[local17] = null;
			client.aBooleanArray18[local17] = false;
			client.anIntArray332[local17] = -1;
		}
		Class681.method36081();
		client.aBoolean632 = true;
		for (local17 = 0; local17 < 108; local17++) {
			client.aBooleanArray17[local17] = true;
		}
		for (local17 = 0; local17 < 3; local17++) {
			for (@Pc(239) int local239 = 0; local239 < 8; local239++) {
				client.aClass497ArrayArray1[local17][local239] = new Class497();
			}
		}
		client.aClass517_1.method30443().method32293();
		client.aBoolean612 = true;
		Class599.aShortArray146 = Class333.aShortArray116 = Class18.aShortArray4 = new short[256];
		Class142.aString58 = Class44.aClass44_133.method713(Class128.aClass667_3);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2, Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_1.method15438());
		client.anInt3435 = 0;
		Class494.method30053();
		Class39.aClass639_3 = null;
		Class265.aLong250 = 0L;
	}

	@OriginalMember(owner = "client!sq", name = "ig", descriptor = "([[[Lclient!ty;IIIZB)Z", line = 4965)
	static final boolean method30915(@OriginalArg(0) Class567[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) byte[][][] local3 = client.aClass517_1.method30454();
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (client.anInt3447 * 1373322351 & 0xFF);
		if (local3[Class669.anInt5790 * -878424575][arg2][arg3] == local14) {
			return false;
		}
		@Pc(31) Class474 local31 = client.aClass517_1.method30441();
		if ((local31.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][arg2][arg3] & 0x4) == 0) {
			return false;
		}
		@Pc(49) byte local49 = 0;
		@Pc(51) int local51 = 0;
		client.anIntArray321[local49] = arg2;
		@Pc(58) int local58 = local49 + 1;
		client.anIntArray322[local49] = arg3;
		local3[Class669.anInt5790 * -878424575][arg2][arg3] = local14;
		while (local58 != local51) {
			@Pc(79) int local79 = client.anIntArray321[local51] & 0xFFFF;
			@Pc(87) int local87 = client.anIntArray321[local51] >> 16 & 0xFF;
			@Pc(95) int local95 = client.anIntArray321[local51] >> 24 & 0xFF;
			@Pc(101) int local101 = client.anIntArray322[local51] & 0xFFFF;
			@Pc(109) int local109 = client.anIntArray322[local51] >> 16 & 0xFF;
			local51 = local51 + 1 & 0xFFF;
			@Pc(117) boolean local117 = false;
			if ((local31.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local79][local101] & 0x4) == 0) {
				local117 = true;
			}
			@Pc(135) boolean local135 = false;
			@Pc(144) int local144;
			@Pc(190) int local190;
			@Pc(228) int local228;
			if (arg0 != null) {
				label240: for (local144 = Class669.anInt5790 * -878424575 + 1; local144 <= 3; local144++) {
					if (arg0[local144] != null && (local31.aByteArrayArrayArray13[local144][local79][local101] & 0x8) == 0) {
						@Pc(320) Class104_Sub1_Sub1 local320;
						@Pc(330) int local330;
						@Pc(334) int local334;
						@Pc(345) int local345;
						@Pc(308) Class567 local308;
						@Pc(315) Class559 local315;
						if (local117 && arg0[local144][local79][local101] != null) {
							if (arg0[local144][local79][local101].aClass104_Sub1_Sub2_2 != null) {
								local190 = Class485.method29974(local87);
								if (local190 == arg0[local144][local79][local101].aClass104_Sub1_Sub2_2.aShort86 || arg0[local144][local79][local101].aClass104_Sub1_Sub2_1 != null && arg0[local144][local79][local101].aClass104_Sub1_Sub2_1.aShort86 == local190) {
									continue;
								}
								if (local95 != 0) {
									local228 = Class485.method29974(local95);
									if (local228 == arg0[local144][local79][local101].aClass104_Sub1_Sub2_2.aShort86 || arg0[local144][local79][local101].aClass104_Sub1_Sub2_1 != null && local228 == arg0[local144][local79][local101].aClass104_Sub1_Sub2_1.aShort86) {
										continue;
									}
								}
								if (local109 != 0) {
									local228 = Class485.method29974(local109);
									if (arg0[local144][local79][local101].aClass104_Sub1_Sub2_2.aShort86 == local228 || arg0[local144][local79][local101].aClass104_Sub1_Sub2_1 != null && arg0[local144][local79][local101].aClass104_Sub1_Sub2_1.aShort86 == local228) {
										continue;
									}
								}
							}
							local308 = arg0[local144][local79][local101];
							if (local308.aClass559_3 != null) {
								for (local315 = local308.aClass559_3; local315 != null; local315 = local315.aClass559_1) {
									local320 = local315.aClass104_Sub1_Sub1_1;
									if (local320 instanceof Interface61) {
										@Pc(326) Interface61 local326 = (Interface61) local320;
										local330 = local326.method13057();
										local334 = local326.method13058();
										if (local330 == 21) {
											local330 = 19;
										}
										local345 = local330 | local334 << 6;
										if (local87 == local345 || local95 != 0 && local95 == local345 || local109 != 0 && local345 == local109) {
											continue label240;
										}
									}
								}
							}
						}
						local308 = arg0[local144][local79][local101];
						if (local308 != null && local308.aClass559_3 != null) {
							for (local315 = local308.aClass559_3; local315 != null; local315 = local315.aClass559_1) {
								local320 = local315.aClass104_Sub1_Sub1_1;
								if (local320.aShort129 != local320.aShort131 || local320.aShort132 != local320.aShort130) {
									@Pc(400) short local400 = local320.aShort131;
									@Pc(403) short local403 = local320.aShort129;
									@Pc(406) short local406 = local320.aShort132;
									@Pc(409) short local409 = local320.aShort130;
									@Pc(420) int local420 = Math.max(0, Math.min(local400, local3[local144].length - 1));
									local334 = Math.max(0, Math.min(local406, local3[local144][0].length - 1));
									local330 = Math.max(0, Math.min(local403, local3[local144].length - 1));
									local345 = Math.max(0, Math.min(local409, local3[local144][0].length - 1));
									while (local420 <= local330) {
										while (local334 <= local345) {
											local3[local144][local420][local334] = local14;
											local334++;
										}
										local420++;
									}
								}
							}
						}
						local3[local144][local79][local101] = local14;
						local135 = true;
					}
				}
			}
			if (local135) {
				local144 = client.aClass517_1.method30435().aClass88Array1[Class669.anInt5790 * -878424575 + 1].method5500(local79, local101);
				if (client.anIntArray329[arg1] < local144) {
					client.anIntArray329[arg1] = local144;
				}
				local190 = local79 << 9;
				local228 = local101 << 9;
				if (client.anIntArray324[arg1] > local190) {
					client.anIntArray324[arg1] = local190;
				} else if (client.anIntArray330[arg1] < local190) {
					client.anIntArray330[arg1] = local190;
				}
				if (client.anIntArray331[arg1] > local228) {
					client.anIntArray331[arg1] = local228;
				} else if (client.anIntArray325[arg1] < local228) {
					client.anIntArray325[arg1] = local228;
				}
			}
			if (!local117) {
				if (local79 >= 1 && local14 != local3[Class669.anInt5790 * -878424575][local79 - 1][local101]) {
					client.anIntArray321[local58] = local79 - 1 | 0x120000 | 0xD3000000;
					client.anIntArray322[local58] = local101 | 0x130000;
					local58 = local58 + 1 & 0xFFF;
					local3[Class669.anInt5790 * -878424575][local79 - 1][local101] = local14;
				}
				local101++;
				if (local101 < client.aClass517_1.method30417()) {
					if (local79 - 1 >= 0 && local3[Class669.anInt5790 * -878424575][local79 - 1][local101] != local14 && (local31.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local79 - 1][local101 - 1] & 0x4) == 0) {
						client.anIntArray321[local58] = local79 - 1 | 0x120000 | 0x52000000;
						client.anIntArray322[local58] = local101 | 0x130000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class669.anInt5790 * -878424575][local79 - 1][local101] = local14;
					}
					if (local3[Class669.anInt5790 * -878424575][local79][local101] != local14) {
						client.anIntArray321[local58] = local79 | 0x520000 | 0x13000000;
						client.anIntArray322[local58] = local101 | 0x530000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class669.anInt5790 * -878424575][local79][local101] = local14;
					}
					if (local79 + 1 < client.aClass517_1.method30411() && local3[Class669.anInt5790 * -878424575][local79 + 1][local101] != local14 && (local31.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local79 + 1][local101 - 1] & 0x4) == 0) {
						client.anIntArray321[local58] = local79 + 1 | 0x520000 | 0x92000000;
						client.anIntArray322[local58] = local101 | 0x530000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class669.anInt5790 * -878424575][local79 + 1][local101] = local14;
					}
				}
				local101--;
				if (local79 + 1 < client.aClass517_1.method30411() && local3[Class669.anInt5790 * -878424575][local79 + 1][local101] != local14) {
					client.anIntArray321[local58] = local79 + 1 | 0x920000 | 0x53000000;
					client.anIntArray322[local58] = local101 | 0x930000;
					local58 = local58 + 1 & 0xFFF;
					local3[Class669.anInt5790 * -878424575][local79 + 1][local101] = local14;
				}
				local101--;
				if (local101 >= 0) {
					if (local79 - 1 >= 0 && local14 != local3[Class669.anInt5790 * -878424575][local79 - 1][local101] && (local31.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local79 - 1][local101 + 1] & 0x4) == 0) {
						client.anIntArray321[local58] = local79 - 1 | 0xD20000 | 0x12000000;
						client.anIntArray322[local58] = local101 | 0xD30000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class669.anInt5790 * -878424575][local79 - 1][local101] = local14;
					}
					if (local3[Class669.anInt5790 * -878424575][local79][local101] != local14) {
						client.anIntArray321[local58] = local79 | 0xD20000 | 0x93000000;
						client.anIntArray322[local58] = local101 | 0xD30000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class669.anInt5790 * -878424575][local79][local101] = local14;
					}
					if (local79 + 1 < client.aClass517_1.method30411() && local3[Class669.anInt5790 * -878424575][local79 + 1][local101] != local14 && (local31.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local79 + 1][local101 + 1] & 0x4) == 0) {
						client.anIntArray321[local58] = local79 + 1 | 0x920000 | 0xD2000000;
						client.anIntArray322[local58] = local101 | 0x930000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class669.anInt5790 * -878424575][local79 + 1][local101] = local14;
					}
				}
			}
		}
		if (client.anIntArray329[arg1] != -1000000) {
			client.anIntArray329[arg1] += 40;
			client.anIntArray324[arg1] -= 512;
			client.anIntArray330[arg1] += 512;
			client.anIntArray325[arg1] += 512;
			client.anIntArray331[arg1] -= 512;
		}
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "gz", descriptor = "(Lclient!yf;I)V", line = 5631)
	static final void method30916(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class199.method25495(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!sq", name = "hs", descriptor = "(Lclient!yf;I)V", line = 5886)
	static final void method30917(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class385.method28342(local11, local14, arg0);
	}
}
