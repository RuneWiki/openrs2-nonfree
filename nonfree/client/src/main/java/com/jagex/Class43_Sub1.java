package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!fv;IZZ)V", line = 31)
	Class43_Sub1(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class43_Sub5) null);
	}

	@OriginalMember(owner = "client!aea", name = "u", descriptor = "(Lclient!cy;B)Ljava/lang/Object;", line = 33)
	@Override
	Object method9490(@OriginalArg(0) Class11 arg0) {
		return Class339.aClass339_5 == arg0.aClass339_3 ? -1 : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!aea", name = "y", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 33)
	@Override
	Object method9494(@OriginalArg(0) Class11 arg0) {
		return Class339.aClass339_5 == arg0.aClass339_3 ? -1 : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 33)
	@Override
	Object method9495(@OriginalArg(0) Class11 arg0) {
		return Class339.aClass339_5 == arg0.aClass339_3 ? -1 : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!aea", name = "s", descriptor = "(ILclient!xn;I)V", line = 248)
	static final void method8381(@OriginalArg(0) int arg0, @OriginalArg(1) Class581 arg1) {
		if (arg0 != -1 && arg1.method33217((long) arg0) == null) {
			arg1.method33241(new Class3(), (long) arg0);
		}
	}

	@OriginalMember(owner = "client!aea", name = "p", descriptor = "(Lclient!ny;Lclient!ny;Lclient!ny;Lclient!ny;B)V", line = 255)
	public static void method8382(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) Class359 arg3) {
		Class504.aClass359_93 = arg0;
		Class178.aClass359_36 = arg1;
		Class585.aClass359_106 = arg2;
		Class178.aClass186Array1 = new Class186[Class504.aClass359_93.method26683()];
		Class16.aBooleanArray3 = new boolean[Class504.aClass359_93.method26683()];
	}

	@OriginalMember(owner = "client!aea", name = "iq", descriptor = "([[[Lclient!rj;IIIZI)Z", line = 4728)
	static final boolean method8380(@OriginalArg(0) Class432[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) byte[][][] local3 = client.aClass370_1.method26957();
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (client.anInt3100 * -630801869 & 0xFF);
		if (local3[Class141.anInt3427 * 1197232991][arg2][arg3] == local14) {
			return false;
		}
		@Pc(31) Class346 local31 = client.aClass370_1.method27075();
		if ((local31.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][arg2][arg3] & 0x4) == 0) {
			return false;
		}
		@Pc(49) byte local49 = 0;
		@Pc(51) int local51 = 0;
		client.anIntArray297[local49] = arg2;
		@Pc(58) int local58 = local49 + 1;
		client.anIntArray298[local49] = arg3;
		local3[Class141.anInt3427 * 1197232991][arg2][arg3] = local14;
		while (local58 != local51) {
			@Pc(79) int local79 = client.anIntArray297[local51] & 0xFFFF;
			@Pc(87) int local87 = client.anIntArray297[local51] >> 16 & 0xFF;
			@Pc(95) int local95 = client.anIntArray297[local51] >> 24 & 0xFF;
			@Pc(101) int local101 = client.anIntArray298[local51] & 0xFFFF;
			@Pc(109) int local109 = client.anIntArray298[local51] >> 16 & 0xFF;
			local51 = local51 + 1 & 0xFFF;
			@Pc(117) boolean local117 = false;
			if ((local31.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local79][local101] & 0x4) == 0) {
				local117 = true;
			}
			@Pc(135) boolean local135 = false;
			@Pc(143) int local143;
			@Pc(186) int local186;
			@Pc(225) int local225;
			if (arg0 != null) {
				label240: for (local143 = Class141.anInt3427 * 1197232991 + 1; local143 <= 3; local143++) {
					if (arg0[local143] != null && (local31.aByteArrayArrayArray12[local143][local79][local101] & 0x8) == 0) {
						@Pc(317) Class26_Sub1_Sub1 local317;
						@Pc(327) int local327;
						@Pc(331) int local331;
						@Pc(342) int local342;
						@Pc(305) Class432 local305;
						@Pc(311) Class437 local311;
						if (local117 && arg0[local143][local79][local101] != null) {
							if (arg0[local143][local79][local101].aClass26_Sub1_Sub3_1 != null) {
								local186 = Class13_Sub18.method6714(local87);
								if (local186 == arg0[local143][local79][local101].aClass26_Sub1_Sub3_1.aShort55 || arg0[local143][local79][local101].aClass26_Sub1_Sub3_2 != null && arg0[local143][local79][local101].aClass26_Sub1_Sub3_2.aShort55 == local186) {
									continue;
								}
								if (local95 != 0) {
									local225 = Class13_Sub18.method6714(local95);
									if (local225 == arg0[local143][local79][local101].aClass26_Sub1_Sub3_1.aShort55 || arg0[local143][local79][local101].aClass26_Sub1_Sub3_2 != null && arg0[local143][local79][local101].aClass26_Sub1_Sub3_2.aShort55 == local225) {
										continue;
									}
								}
								if (local109 != 0) {
									local225 = Class13_Sub18.method6714(local109);
									if (arg0[local143][local79][local101].aClass26_Sub1_Sub3_1.aShort55 == local225 || arg0[local143][local79][local101].aClass26_Sub1_Sub3_2 != null && arg0[local143][local79][local101].aClass26_Sub1_Sub3_2.aShort55 == local225) {
										continue;
									}
								}
							}
							local305 = arg0[local143][local79][local101];
							if (local305.aClass437_1 != null) {
								for (local311 = local305.aClass437_1; local311 != null; local311 = local311.aClass437_3) {
									local317 = local311.aClass26_Sub1_Sub1_1;
									if (local317 instanceof Interface43) {
										@Pc(323) Interface43 local323 = (Interface43) local317;
										local327 = local323.method11146();
										local331 = local323.method11147();
										if (local327 == 21) {
											local327 = 19;
										}
										local342 = local327 | local331 << 6;
										if (local342 == local87 || local95 != 0 && local342 == local95 || local109 != 0 && local109 == local342) {
											continue label240;
										}
									}
								}
							}
						}
						local305 = arg0[local143][local79][local101];
						if (local305 != null && local305.aClass437_1 != null) {
							for (local311 = local305.aClass437_1; local311 != null; local311 = local311.aClass437_3) {
								local317 = local311.aClass26_Sub1_Sub1_1;
								if (local317.aShort92 != local317.aShort94 || local317.aShort93 != local317.aShort91) {
									@Pc(399) short local399 = local317.aShort94;
									@Pc(402) short local402 = local317.aShort92;
									@Pc(405) short local405 = local317.aShort93;
									@Pc(408) short local408 = local317.aShort91;
									@Pc(419) int local419 = Math.max(0, Math.min(local399, local3[local143].length - 1));
									local331 = Math.max(0, Math.min(local405, local3[local143][0].length - 1));
									local327 = Math.max(0, Math.min(local402, local3[local143].length - 1));
									local342 = Math.max(0, Math.min(local408, local3[local143][0].length - 1));
									while (local419 <= local327) {
										while (local331 <= local342) {
											local3[local143][local419][local331] = local14;
											local331++;
										}
										local419++;
									}
								}
							}
						}
						local3[local143][local79][local101] = local14;
						local135 = true;
					}
				}
			}
			if (local135) {
				@Pc(499) int local499 = Class141.anInt3427 * 1197232991;
				local143 = client.aClass370_1.method26950().aClass17Array3[local499 + 1].method3548(local79, local101);
				if (client.anIntArray304[arg1] < local143) {
					client.anIntArray304[arg1] = local143;
				}
				local186 = local79 << 9;
				local225 = local101 << 9;
				if (client.anIntArray305[arg1] > local186) {
					client.anIntArray305[arg1] = local186;
				} else if (client.anIntArray296[arg1] < local186) {
					client.anIntArray296[arg1] = local186;
				}
				if (client.anIntArray307[arg1] > local225) {
					client.anIntArray307[arg1] = local225;
				} else if (client.anIntArray306[arg1] < local225) {
					client.anIntArray306[arg1] = local225;
				}
			}
			if (!local117) {
				if (local79 >= 1 && local3[Class141.anInt3427 * 1197232991][local79 - 1][local101] != local14) {
					client.anIntArray297[local58] = local79 - 1 | 0x120000 | 0xD3000000;
					client.anIntArray298[local58] = local101 | 0x130000;
					local58 = local58 + 1 & 0xFFF;
					local3[Class141.anInt3427 * 1197232991][local79 - 1][local101] = local14;
				}
				local101++;
				if (local101 < client.aClass370_1.method27062()) {
					if (local79 - 1 >= 0 && local3[Class141.anInt3427 * 1197232991][local79 - 1][local101] != local14 && (local31.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local79 - 1][local101 - 1] & 0x4) == 0) {
						client.anIntArray297[local58] = local79 - 1 | 0x120000 | 0x52000000;
						client.anIntArray298[local58] = local101 | 0x130000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class141.anInt3427 * 1197232991][local79 - 1][local101] = local14;
					}
					if (local3[Class141.anInt3427 * 1197232991][local79][local101] != local14) {
						client.anIntArray297[local58] = local79 | 0x520000 | 0x13000000;
						client.anIntArray298[local58] = local101 | 0x530000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class141.anInt3427 * 1197232991][local79][local101] = local14;
					}
					if (local79 + 1 < client.aClass370_1.method26943() && local3[Class141.anInt3427 * 1197232991][local79 + 1][local101] != local14 && (local31.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local79 + 1][local101 - 1] & 0x4) == 0) {
						client.anIntArray297[local58] = local79 + 1 | 0x520000 | 0x92000000;
						client.anIntArray298[local58] = local101 | 0x530000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class141.anInt3427 * 1197232991][local79 + 1][local101] = local14;
					}
				}
				local101--;
				if (local79 + 1 < client.aClass370_1.method26943() && local3[Class141.anInt3427 * 1197232991][local79 + 1][local101] != local14) {
					client.anIntArray297[local58] = local79 + 1 | 0x920000 | 0x53000000;
					client.anIntArray298[local58] = local101 | 0x930000;
					local58 = local58 + 1 & 0xFFF;
					local3[Class141.anInt3427 * 1197232991][local79 + 1][local101] = local14;
				}
				local101--;
				if (local101 >= 0) {
					if (local79 - 1 >= 0 && local3[Class141.anInt3427 * 1197232991][local79 - 1][local101] != local14 && (local31.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local79 - 1][local101 + 1] & 0x4) == 0) {
						client.anIntArray297[local58] = local79 - 1 | 0xD20000 | 0x12000000;
						client.anIntArray298[local58] = local101 | 0xD30000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class141.anInt3427 * 1197232991][local79 - 1][local101] = local14;
					}
					if (local3[Class141.anInt3427 * 1197232991][local79][local101] != local14) {
						client.anIntArray297[local58] = local79 | 0xD20000 | 0x93000000;
						client.anIntArray298[local58] = local101 | 0xD30000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class141.anInt3427 * 1197232991][local79][local101] = local14;
					}
					if (local79 + 1 < client.aClass370_1.method26943() && local3[Class141.anInt3427 * 1197232991][local79 + 1][local101] != local14 && (local31.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local79 + 1][local101 + 1] & 0x4) == 0) {
						client.anIntArray297[local58] = local79 + 1 | 0x920000 | 0xD2000000;
						client.anIntArray298[local58] = local101 | 0x930000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class141.anInt3427 * 1197232991][local79 + 1][local101] = local14;
					}
				}
			}
		}
		if (client.anIntArray304[arg1] != -1000000) {
			client.anIntArray304[arg1] += 40;
			client.anIntArray305[arg1] -= 512;
			client.anIntArray296[arg1] += 512;
			client.anIntArray306[arg1] += 512;
			client.anIntArray307[arg1] -= 512;
		}
		return true;
	}
}
