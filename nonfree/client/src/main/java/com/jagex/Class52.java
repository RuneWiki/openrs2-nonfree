package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public class Class52 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "I")
	static final int anInt1126 = 1;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "I")
	static final int anInt1128 = 2;

	@OriginalMember(owner = "client!af", name = "fc", descriptor = "Lclient!ny;")
	public static Class359 aClass359_16;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "[B")
	static byte[] aByteArray19 = new byte[2048];

	@OriginalMember(owner = "client!af", name = "l", descriptor = "[B")
	static byte[] aByteArray20 = new byte[2048];

	@OriginalMember(owner = "client!af", name = "h", descriptor = "[Lclient!ahb;")
	static Class3_Sub41[] aClass3_Sub41Array1 = new Class3_Sub41[2048];

	@OriginalMember(owner = "client!af", name = "x", descriptor = "[Lclient!ahb;")
	static Class3_Sub41[] aClass3_Sub41Array2 = new Class3_Sub41[2048];

	@OriginalMember(owner = "client!af", name = "s", descriptor = "I")
	public static int anInt1127 = 0;

	@OriginalMember(owner = "client!af", name = "u", descriptor = "[I")
	static int[] anIntArray167 = new int[2048];

	@OriginalMember(owner = "client!af", name = "y", descriptor = "I")
	static int anInt1130 = 0;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "[I")
	static int[] anIntArray165 = new int[2048];

	@OriginalMember(owner = "client!af", name = "c", descriptor = "[Lclient!b;")
	static Class85[] aClass85Array1 = new Class85[2048];

	@OriginalMember(owner = "client!af", name = "z", descriptor = "I")
	static int anInt1129 = 0;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "[I")
	static int[] anIntArray166 = new int[2048];

	@OriginalMember(owner = "client!af", name = "p", descriptor = "(II)Lclient!gl;", line = 14)
	static Class201 method9917(@OriginalArg(0) int arg0) {
		if (Class201.aClass201_5.anInt3690 * 1292616825 == arg0) {
			return Class201.aClass201_5;
		} else if (Class201.aClass201_4.anInt3690 * 1292616825 == arg0) {
			return Class201.aClass201_4;
		} else if (Class201.aClass201_3.anInt3690 * 1292616825 == arg0) {
			return Class201.aClass201_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 36)
	Class52() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Lclient!zh;", line = 49)
	public static Class619 method9920(@OriginalArg(0) int arg0) {
		@Pc(2) Class619[] local2 = Class76.method21537();
		@Pc(4) Class619[] local4 = local2;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Class619 local14 = local4[local6];
			if (arg0 == local14.anInt5567 * 1159937181) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!af", name = "x", descriptor = "(I)V", line = 164)
	static void method9918() {
		@Pc(2) Class161 local2 = Class519.aClass161_58;
		synchronized (Class519.aClass161_58) {
			Class519.aClass161_58.method23245();
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(Lclient!and;)I", line = 199)
	static int method9905(@OriginalArg(0) Class3_Sub41_Sub1 arg0) {
		@Pc(4) int local4 = arg0.method19825(2);
		@Pc(9) int local9;
		if (local4 == 0) {
			local9 = 0;
		} else if (local4 == 1) {
			local9 = arg0.method19825(5);
		} else if (local4 == 2) {
			local9 = arg0.method19825(8);
		} else {
			local9 = arg0.method19825(11);
		}
		return local9;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(Lclient!and;)I", line = 199)
	static int method9906(@OriginalArg(0) Class3_Sub41_Sub1 arg0) {
		@Pc(4) int local4 = arg0.method19825(2);
		@Pc(9) int local9;
		if (local4 == 0) {
			local9 = 0;
		} else if (local4 == 1) {
			local9 = arg0.method19825(5);
		} else if (local4 == 2) {
			local9 = arg0.method19825(8);
		} else {
			local9 = arg0.method19825(11);
		}
		return local9;
	}

	@OriginalMember(owner = "client!af", name = "z", descriptor = "(Lclient!and;)I", line = 199)
	static int method9910(@OriginalArg(0) Class3_Sub41_Sub1 arg0) {
		@Pc(4) int local4 = arg0.method19825(2);
		@Pc(9) int local9;
		if (local4 == 0) {
			local9 = 0;
		} else if (local4 == 1) {
			local9 = arg0.method19825(5);
		} else if (local4 == 2) {
			local9 = arg0.method19825(8);
		} else {
			local9 = arg0.method19825(11);
		}
		return local9;
	}

	@OriginalMember(owner = "client!af", name = "j", descriptor = "(Lclient!and;I)V", line = 209)
	static void method9904(@OriginalArg(0) Class3_Sub41_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class464 local3 = client.aClass370_1.method26942();
		@Pc(13) boolean local13 = arg0.method19825(1) == 1;
		if (local13) {
			anIntArray166[(anInt1129 += -415617507) * -1804860363 - 1] = arg1;
		}
		@Pc(32) int local32 = arg0.method19825(2);
		@Pc(36) Class26_Sub1_Sub1_Sub1_Sub2 local36 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		if (local32 != 0) {
			@Pc(161) int local161;
			@Pc(166) int local166;
			@Pc(171) int local171;
			@Pc(176) int local176;
			@Pc(184) int local184;
			if (local32 == 1) {
				local161 = arg0.method19825(3);
				local166 = arg0.method19825(1);
				local171 = local36.anIntArray241[0];
				local176 = local36.anIntArray239[0];
				if (local166 == 1) {
					local184 = arg0.method19825(2);
					switch(local184) {
						case 0:
							local36.method16732(local171, local176 + 1, aByteArray20[arg1]);
							break;
						case 1:
							local36.method16732(local171 - 1, local176, aByteArray20[arg1]);
							break;
						case 2:
							local36.method16732(local171 + 1, local176, aByteArray20[arg1]);
							break;
						case 3:
							local36.method16732(local171, local176 - 1, aByteArray20[arg1]);
					}
				}
				if (local161 == 0) {
					local171--;
					local176--;
				} else if (local161 == 1) {
					local176--;
				} else if (local161 == 2) {
					local171++;
					local176--;
				} else if (local161 == 3) {
					local171--;
				} else if (local161 == 4) {
					local171++;
				} else if (local161 == 5) {
					local171--;
					local176++;
				} else if (local161 == 6) {
					local176++;
				} else if (local161 == 7) {
					local171++;
					local176++;
				}
				local36.method16732(local171, local176, aByteArray20[arg1]);
			} else if (local32 == 2) {
				local161 = arg0.method19825(4);
				local166 = local36.anIntArray241[0];
				local171 = local36.anIntArray239[0];
				if (local161 == 0) {
					local166 -= 2;
					local171 -= 2;
				} else if (local161 == 1) {
					local166--;
					local171 -= 2;
				} else if (local161 == 2) {
					local171 -= 2;
				} else if (local161 == 3) {
					local166++;
					local171 -= 2;
				} else if (local161 == 4) {
					local166 += 2;
					local171 -= 2;
				} else if (local161 == 5) {
					local166 -= 2;
					local171--;
				} else if (local161 == 6) {
					local166 += 2;
					local171--;
				} else if (local161 == 7) {
					local166 -= 2;
				} else if (local161 == 8) {
					local166 += 2;
				} else if (local161 == 9) {
					local166 -= 2;
					local171++;
				} else if (local161 == 10) {
					local166 += 2;
					local171++;
				} else if (local161 == 11) {
					local166 -= 2;
					local171 += 2;
				} else if (local161 == 12) {
					local166--;
					local171 += 2;
				} else if (local161 == 13) {
					local171 += 2;
				} else if (local161 == 14) {
					local166++;
					local171 += 2;
				} else if (local161 == 15) {
					local166 += 2;
					local171 += 2;
				}
				local36.method16732(local166, local171, aByteArray20[arg1]);
			} else {
				local161 = arg0.method19825(1);
				@Pc(438) int local438;
				@Pc(449) int local449;
				@Pc(456) int local456;
				if (local161 == 0) {
					local166 = arg0.method19825(15);
					local171 = local166 >> 12 & 0x7;
					local176 = (byte) (local166 >> 10) & 0x3;
					local184 = local166 >> 5 & 0x1F;
					if (local184 > 15) {
						local184 -= 32;
					}
					local438 = local166 & 0x1F;
					if (local438 > 15) {
						local438 -= 32;
					}
					local449 = local36.anIntArray241[0] + local184;
					local456 = local36.anIntArray239[0] + local438;
					if (local171 == Class538.aClass538_5.anInt5322 * -375894407) {
						local36.method16738(local449, local456);
					} else {
						aByteArray20[arg1] = (byte) (local171 - 1);
						local36.method16732(local449, local456, aByteArray20[arg1]);
					}
					local36.aByte101 = local36.aByte102 = (byte) (local176 + local36.aByte101 & 0x3);
					if (client.aClass370_1.method27075().method26504(local449, local456)) {
						local36.aByte102++;
					}
					if (client.anInt3115 * 2077649275 == arg1 && Class141.anInt3427 * 1197232991 != local36.aByte101) {
						Class141.anInt3427 = local36.aByte101 * -147142497;
					}
				} else {
					local166 = arg0.method19825(3);
					local171 = arg0.method19825(30);
					local176 = local171 >> 28 & 0x3;
					local184 = local171 >> 14 & 0x3FFF;
					local438 = local171 & 0x3FFF;
					local449 = (local3.anInt5071 * -1567811631 + local36.anIntArray241[0] + local184 & 0x3FFF) - local3.anInt5071 * -1567811631;
					local456 = (local3.anInt5073 * 1360175441 + local36.anIntArray239[0] + local438 & 0x3FFF) - local3.anInt5073 * 1360175441;
					if (local166 == Class538.aClass538_5.anInt5322 * -375894407) {
						local36.method16738(local449, local456);
					} else {
						aByteArray20[arg1] = (byte) (local166 - 1);
						local36.method16732(local449, local456, aByteArray20[arg1]);
					}
					local36.aByte101 = local36.aByte102 = (byte) (local176 + local36.aByte101 & 0x3);
					if (client.aClass370_1.method27075().method26504(local449, local456)) {
						local36.aByte102++;
					}
					if (arg1 == client.anInt3115 * 2077649275) {
						Class141.anInt3427 = local36.aByte101 * -147142497;
					}
				}
			}
		} else if (!local13) {
			if (client.anInt3115 * 2077649275 == arg1) {
				throw new RuntimeException();
			}
			@Pc(58) Class85 local58 = aClass85Array1[arg1] = new Class85();
			Class72.method14644();
			local58.anInt2926 = ((local3.anInt5073 * 1360175441 + local36.anIntArray239[0] >> 6) + (local36.aByte101 << 28) + (local36.anIntArray241[0] + local3.anInt5071 * -1567811631 >> 6 << 14)) * 1407132619;
			if (local36.anInt2395 * 1668894213 == -1) {
				local58.anInt2924 = local36.aClass106_7.method21910() * -576297963;
			} else {
				local58.anInt2924 = local36.anInt2395 * 1940609641;
			}
			local58.anInt2925 = local36.anInt2364 * -1761249735;
			local58.aBoolean533 = local36.aBoolean420;
			local58.aBoolean532 = local36.aBoolean419;
			if (local36.anInt2400 * -1667184633 > 0) {
				Class631.method33858(local36);
			}
			client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg1] = null;
			if (arg0.method19825(1) != 0) {
				Class163.method23299(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "n", descriptor = "(Lclient!and;I)V", line = 209)
	static void method9908(@OriginalArg(0) Class3_Sub41_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class464 local3 = client.aClass370_1.method26942();
		@Pc(13) boolean local13 = arg0.method19825(1) == 1;
		if (local13) {
			anIntArray166[(anInt1129 += -415617507) * -1804860363 - 1] = arg1;
		}
		@Pc(32) int local32 = arg0.method19825(2);
		@Pc(36) Class26_Sub1_Sub1_Sub1_Sub2 local36 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		if (local32 != 0) {
			@Pc(161) int local161;
			@Pc(166) int local166;
			@Pc(171) int local171;
			@Pc(176) int local176;
			@Pc(184) int local184;
			if (local32 == 1) {
				local161 = arg0.method19825(3);
				local166 = arg0.method19825(1);
				local171 = local36.anIntArray241[0];
				local176 = local36.anIntArray239[0];
				if (local166 == 1) {
					local184 = arg0.method19825(2);
					switch(local184) {
						case 0:
							local36.method16732(local171, local176 + 1, aByteArray20[arg1]);
							break;
						case 1:
							local36.method16732(local171 - 1, local176, aByteArray20[arg1]);
							break;
						case 2:
							local36.method16732(local171 + 1, local176, aByteArray20[arg1]);
							break;
						case 3:
							local36.method16732(local171, local176 - 1, aByteArray20[arg1]);
					}
				}
				if (local161 == 0) {
					local171--;
					local176--;
				} else if (local161 == 1) {
					local176--;
				} else if (local161 == 2) {
					local171++;
					local176--;
				} else if (local161 == 3) {
					local171--;
				} else if (local161 == 4) {
					local171++;
				} else if (local161 == 5) {
					local171--;
					local176++;
				} else if (local161 == 6) {
					local176++;
				} else if (local161 == 7) {
					local171++;
					local176++;
				}
				local36.method16732(local171, local176, aByteArray20[arg1]);
			} else if (local32 == 2) {
				local161 = arg0.method19825(4);
				local166 = local36.anIntArray241[0];
				local171 = local36.anIntArray239[0];
				if (local161 == 0) {
					local166 -= 2;
					local171 -= 2;
				} else if (local161 == 1) {
					local166--;
					local171 -= 2;
				} else if (local161 == 2) {
					local171 -= 2;
				} else if (local161 == 3) {
					local166++;
					local171 -= 2;
				} else if (local161 == 4) {
					local166 += 2;
					local171 -= 2;
				} else if (local161 == 5) {
					local166 -= 2;
					local171--;
				} else if (local161 == 6) {
					local166 += 2;
					local171--;
				} else if (local161 == 7) {
					local166 -= 2;
				} else if (local161 == 8) {
					local166 += 2;
				} else if (local161 == 9) {
					local166 -= 2;
					local171++;
				} else if (local161 == 10) {
					local166 += 2;
					local171++;
				} else if (local161 == 11) {
					local166 -= 2;
					local171 += 2;
				} else if (local161 == 12) {
					local166--;
					local171 += 2;
				} else if (local161 == 13) {
					local171 += 2;
				} else if (local161 == 14) {
					local166++;
					local171 += 2;
				} else if (local161 == 15) {
					local166 += 2;
					local171 += 2;
				}
				local36.method16732(local166, local171, aByteArray20[arg1]);
			} else {
				local161 = arg0.method19825(1);
				@Pc(438) int local438;
				@Pc(449) int local449;
				@Pc(456) int local456;
				if (local161 == 0) {
					local166 = arg0.method19825(15);
					local171 = local166 >> 12 & 0x7;
					local176 = (byte) (local166 >> 10) & 0x3;
					local184 = local166 >> 5 & 0x1F;
					if (local184 > 15) {
						local184 -= 32;
					}
					local438 = local166 & 0x1F;
					if (local438 > 15) {
						local438 -= 32;
					}
					local449 = local36.anIntArray241[0] + local184;
					local456 = local36.anIntArray239[0] + local438;
					if (local171 == Class538.aClass538_5.anInt5322 * -375894407) {
						local36.method16738(local449, local456);
					} else {
						aByteArray20[arg1] = (byte) (local171 - 1);
						local36.method16732(local449, local456, aByteArray20[arg1]);
					}
					local36.aByte101 = local36.aByte102 = (byte) (local176 + local36.aByte101 & 0x3);
					if (client.aClass370_1.method27075().method26504(local449, local456)) {
						local36.aByte102++;
					}
					if (client.anInt3115 * 2077649275 == arg1 && Class141.anInt3427 * 1197232991 != local36.aByte101) {
						Class141.anInt3427 = local36.aByte101 * -147142497;
					}
				} else {
					local166 = arg0.method19825(3);
					local171 = arg0.method19825(30);
					local176 = local171 >> 28 & 0x3;
					local184 = local171 >> 14 & 0x3FFF;
					local438 = local171 & 0x3FFF;
					local449 = (local3.anInt5071 * -1567811631 + local36.anIntArray241[0] + local184 & 0x3FFF) - local3.anInt5071 * -1567811631;
					local456 = (local3.anInt5073 * 1360175441 + local36.anIntArray239[0] + local438 & 0x3FFF) - local3.anInt5073 * 1360175441;
					if (local166 == Class538.aClass538_5.anInt5322 * -375894407) {
						local36.method16738(local449, local456);
					} else {
						aByteArray20[arg1] = (byte) (local166 - 1);
						local36.method16732(local449, local456, aByteArray20[arg1]);
					}
					local36.aByte101 = local36.aByte102 = (byte) (local176 + local36.aByte101 & 0x3);
					if (client.aClass370_1.method27075().method26504(local449, local456)) {
						local36.aByte102++;
					}
					if (arg1 == client.anInt3115 * 2077649275) {
						Class141.anInt3427 = local36.aByte101 * -147142497;
					}
				}
			}
		} else if (!local13) {
			if (client.anInt3115 * 2077649275 == arg1) {
				throw new RuntimeException();
			}
			@Pc(58) Class85 local58 = aClass85Array1[arg1] = new Class85();
			Class72.method14644();
			local58.anInt2926 = ((local3.anInt5073 * 1360175441 + local36.anIntArray239[0] >> 6) + (local36.aByte101 << 28) + (local36.anIntArray241[0] + local3.anInt5071 * -1567811631 >> 6 << 14)) * 1407132619;
			if (local36.anInt2395 * 1668894213 == -1) {
				local58.anInt2924 = local36.aClass106_7.method21910() * -576297963;
			} else {
				local58.anInt2924 = local36.anInt2395 * 1940609641;
			}
			local58.anInt2925 = local36.anInt2364 * -1761249735;
			local58.aBoolean533 = local36.aBoolean420;
			local58.aBoolean532 = local36.aBoolean419;
			if (local36.anInt2400 * -1667184633 > 0) {
				Class631.method33858(local36);
			}
			client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg1] = null;
			if (arg0.method19825(1) != 0) {
				Class163.method23299(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "r", descriptor = "(Lclient!and;I)Z", line = 379)
	static boolean method9903(@OriginalArg(0) Class3_Sub41_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.method19825(2);
		@Pc(22) int local22;
		@Pc(27) int local27;
		@Pc(118) int local118;
		@Pc(122) int local122;
		@Pc(128) int local128;
		@Pc(132) int local132;
		if (local4 == 0) {
			if (arg0.method19825(1) != 0) {
				Class163.method23299(arg0, arg1);
			}
			local22 = arg0.method19825(6);
			local27 = arg0.method19825(6);
			@Pc(37) boolean local37 = arg0.method19825(1) == 1;
			if (local37) {
				anIntArray166[(anInt1129 += -415617507) * -1804860363 - 1] = arg1;
			}
			if (client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException();
			}
			@Pc(63) Class85 local63 = aClass85Array1[arg1];
			@Pc(74) Class26_Sub1_Sub1_Sub1_Sub2 local74 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg1] = new Class26_Sub1_Sub1_Sub1_Sub2(client.aClass370_1.method26950());
			local74.anInt2355 = arg1 * -400995907;
			if (aClass3_Sub41Array1[arg1] != null) {
				local74.method16763(aClass3_Sub41Array1[arg1]);
			}
			if (aClass3_Sub41Array2[arg1] != null) {
				local74.method16731(aClass3_Sub41Array2[arg1]);
			}
			local74.method16634(local63.anInt2924 * 166218557, true);
			local74.anInt2364 = local63.anInt2925 * 1065719817;
			local118 = local63.anInt2926 * 1438607843;
			local122 = local118 >> 28;
			local128 = local118 >> 14 & 0xFF;
			local132 = local118 & 0xFF;
			@Pc(136) Class464 local136 = client.aClass370_1.method26942();
			@Pc(147) int local147 = local22 + (local128 << 6) - local136.anInt5071 * -1567811631;
			@Pc(158) int local158 = (local132 << 6) + local27 - local136.anInt5073 * 1360175441;
			local74.aBoolean420 = local63.aBoolean533;
			local74.aBoolean419 = local63.aBoolean532;
			local74.aByteArray41[0] = aByteArray20[arg1];
			local74.aByte101 = local74.aByte102 = (byte) local122;
			if (client.aClass370_1.method27075().method26504(local147, local158)) {
				local74.aByte102++;
			}
			local74.method16738(local147, local158);
			aClass85Array1[arg1] = null;
			return true;
		} else if (local4 == 1) {
			local22 = arg0.method19825(2);
			local27 = aClass85Array1[arg1].anInt2926 * 1438607843;
			aClass85Array1[arg1].anInt2926 = ((((local27 >> 28) + local22 & 0x3) << 28) + (local27 & 0xFFFFFFF)) * 1407132619;
			return false;
		} else {
			@Pc(260) int local260;
			@Pc(267) int local267;
			@Pc(290) int local290;
			if (local4 != 2) {
				local22 = arg0.method19825(20);
				local27 = local22 >> 18 & 0x3;
				local260 = local22 >> 16 & 0x3;
				local267 = local22 >> 8 & 0xFF;
				local290 = local22 & 0xFF;
				local118 = aClass85Array1[arg1].anInt2926 * 1438607843;
				aByteArray20[arg1] = (byte) (local27 - 1);
				assert aByteArray20[arg1] >= 0 && aByteArray20[arg1] <= 3;
				local122 = (local118 >> 28) + local260 & 0x3;
				local128 = (local118 >> 14) + local267 & 0xFF;
				local132 = local290 + local118 & 0xFF;
				Class356.method26649(Class72.method14644(), local27 - 1);
				aClass85Array1[arg1].anInt2926 = ((local122 << 28) + (local128 << 14) + local132) * 1407132619;
				return false;
			}
			local22 = arg0.method19825(5);
			local27 = local22 >> 3 & 0x3;
			local260 = local22 & 0x7;
			local267 = aClass85Array1[arg1].anInt2926 * 1438607843;
			assert aByteArray20[arg1] >= 0 && aByteArray20[arg1] <= 3;
			local290 = local27 + (local267 >> 28) & 0x3;
			local118 = local267 >> 14 & 0xFF;
			local122 = local267 & 0xFF;
			if (local260 == 0) {
				local118--;
				local122--;
			}
			if (local260 == 1) {
				local122--;
			}
			if (local260 == 2) {
				local118++;
				local122--;
			}
			if (local260 == 3) {
				local118--;
			}
			if (local260 == 4) {
				local118++;
			}
			if (local260 == 5) {
				local118--;
				local122++;
			}
			if (local260 == 6) {
				local122++;
			}
			if (local260 == 7) {
				local118++;
				local122++;
			}
			Class356.method26649(Class72.method14644(), aByteArray20[arg1]);
			aClass85Array1[arg1].anInt2926 = ((local290 << 28) + (local118 << 14) + local122) * 1407132619;
			return false;
		}
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(Lclient!and;I)Z", line = 379)
	static boolean method9909(@OriginalArg(0) Class3_Sub41_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.method19825(2);
		@Pc(22) int local22;
		@Pc(27) int local27;
		@Pc(118) int local118;
		@Pc(122) int local122;
		@Pc(128) int local128;
		@Pc(132) int local132;
		if (local4 == 0) {
			if (arg0.method19825(1) != 0) {
				Class163.method23299(arg0, arg1);
			}
			local22 = arg0.method19825(6);
			local27 = arg0.method19825(6);
			@Pc(37) boolean local37 = arg0.method19825(1) == 1;
			if (local37) {
				anIntArray166[(anInt1129 += -415617507) * -1804860363 - 1] = arg1;
			}
			if (client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException();
			}
			@Pc(63) Class85 local63 = aClass85Array1[arg1];
			@Pc(74) Class26_Sub1_Sub1_Sub1_Sub2 local74 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg1] = new Class26_Sub1_Sub1_Sub1_Sub2(client.aClass370_1.method26950());
			local74.anInt2355 = arg1 * -400995907;
			if (aClass3_Sub41Array1[arg1] != null) {
				local74.method16763(aClass3_Sub41Array1[arg1]);
			}
			if (aClass3_Sub41Array2[arg1] != null) {
				local74.method16731(aClass3_Sub41Array2[arg1]);
			}
			local74.method16634(local63.anInt2924 * 166218557, true);
			local74.anInt2364 = local63.anInt2925 * 1065719817;
			local118 = local63.anInt2926 * 1438607843;
			local122 = local118 >> 28;
			local128 = local118 >> 14 & 0xFF;
			local132 = local118 & 0xFF;
			@Pc(136) Class464 local136 = client.aClass370_1.method26942();
			@Pc(147) int local147 = local22 + (local128 << 6) - local136.anInt5071 * -1567811631;
			@Pc(158) int local158 = (local132 << 6) + local27 - local136.anInt5073 * 1360175441;
			local74.aBoolean420 = local63.aBoolean533;
			local74.aBoolean419 = local63.aBoolean532;
			local74.aByteArray41[0] = aByteArray20[arg1];
			local74.aByte101 = local74.aByte102 = (byte) local122;
			if (client.aClass370_1.method27075().method26504(local147, local158)) {
				local74.aByte102++;
			}
			local74.method16738(local147, local158);
			aClass85Array1[arg1] = null;
			return true;
		} else if (local4 == 1) {
			local22 = arg0.method19825(2);
			local27 = aClass85Array1[arg1].anInt2926 * 1438607843;
			aClass85Array1[arg1].anInt2926 = ((((local27 >> 28) + local22 & 0x3) << 28) + (local27 & 0xFFFFFFF)) * 1407132619;
			return false;
		} else {
			@Pc(260) int local260;
			@Pc(267) int local267;
			@Pc(290) int local290;
			if (local4 != 2) {
				local22 = arg0.method19825(20);
				local27 = local22 >> 18 & 0x3;
				local260 = local22 >> 16 & 0x3;
				local267 = local22 >> 8 & 0xFF;
				local290 = local22 & 0xFF;
				local118 = aClass85Array1[arg1].anInt2926 * 1438607843;
				aByteArray20[arg1] = (byte) (local27 - 1);
				assert aByteArray20[arg1] >= 0 && aByteArray20[arg1] <= 3;
				local122 = (local118 >> 28) + local260 & 0x3;
				local128 = (local118 >> 14) + local267 & 0xFF;
				local132 = local290 + local118 & 0xFF;
				Class356.method26649(Class72.method14644(), local27 - 1);
				aClass85Array1[arg1].anInt2926 = ((local122 << 28) + (local128 << 14) + local132) * 1407132619;
				return false;
			}
			local22 = arg0.method19825(5);
			local27 = local22 >> 3 & 0x3;
			local260 = local22 & 0x7;
			local267 = aClass85Array1[arg1].anInt2926 * 1438607843;
			assert aByteArray20[arg1] >= 0 && aByteArray20[arg1] <= 3;
			local290 = local27 + (local267 >> 28) & 0x3;
			local118 = local267 >> 14 & 0xFF;
			local122 = local267 & 0xFF;
			if (local260 == 0) {
				local118--;
				local122--;
			}
			if (local260 == 1) {
				local122--;
			}
			if (local260 == 2) {
				local118++;
				local122--;
			}
			if (local260 == 3) {
				local118--;
			}
			if (local260 == 4) {
				local118++;
			}
			if (local260 == 5) {
				local118--;
				local122++;
			}
			if (local260 == 6) {
				local122++;
			}
			if (local260 == 7) {
				local118++;
				local122++;
			}
			Class356.method26649(Class72.method14644(), aByteArray20[arg1]);
			aClass85Array1[arg1].anInt2926 = ((local290 << 28) + (local118 << 14) + local122) * 1407132619;
			return false;
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(Lclient!and;I)Z", line = 379)
	static boolean method9915(@OriginalArg(0) Class3_Sub41_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.method19825(2);
		@Pc(22) int local22;
		@Pc(27) int local27;
		@Pc(118) int local118;
		@Pc(122) int local122;
		@Pc(128) int local128;
		@Pc(132) int local132;
		if (local4 == 0) {
			if (arg0.method19825(1) != 0) {
				Class163.method23299(arg0, arg1);
			}
			local22 = arg0.method19825(6);
			local27 = arg0.method19825(6);
			@Pc(37) boolean local37 = arg0.method19825(1) == 1;
			if (local37) {
				anIntArray166[(anInt1129 += -415617507) * -1804860363 - 1] = arg1;
			}
			if (client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException();
			}
			@Pc(63) Class85 local63 = aClass85Array1[arg1];
			@Pc(74) Class26_Sub1_Sub1_Sub1_Sub2 local74 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg1] = new Class26_Sub1_Sub1_Sub1_Sub2(client.aClass370_1.method26950());
			local74.anInt2355 = arg1 * -400995907;
			if (aClass3_Sub41Array1[arg1] != null) {
				local74.method16763(aClass3_Sub41Array1[arg1]);
			}
			if (aClass3_Sub41Array2[arg1] != null) {
				local74.method16731(aClass3_Sub41Array2[arg1]);
			}
			local74.method16634(local63.anInt2924 * 166218557, true);
			local74.anInt2364 = local63.anInt2925 * 1065719817;
			local118 = local63.anInt2926 * 1438607843;
			local122 = local118 >> 28;
			local128 = local118 >> 14 & 0xFF;
			local132 = local118 & 0xFF;
			@Pc(136) Class464 local136 = client.aClass370_1.method26942();
			@Pc(147) int local147 = local22 + (local128 << 6) - local136.anInt5071 * -1567811631;
			@Pc(158) int local158 = (local132 << 6) + local27 - local136.anInt5073 * 1360175441;
			local74.aBoolean420 = local63.aBoolean533;
			local74.aBoolean419 = local63.aBoolean532;
			local74.aByteArray41[0] = aByteArray20[arg1];
			local74.aByte101 = local74.aByte102 = (byte) local122;
			if (client.aClass370_1.method27075().method26504(local147, local158)) {
				local74.aByte102++;
			}
			local74.method16738(local147, local158);
			aClass85Array1[arg1] = null;
			return true;
		} else if (local4 == 1) {
			local22 = arg0.method19825(2);
			local27 = aClass85Array1[arg1].anInt2926 * 1438607843;
			aClass85Array1[arg1].anInt2926 = ((((local27 >> 28) + local22 & 0x3) << 28) + (local27 & 0xFFFFFFF)) * 1407132619;
			return false;
		} else {
			@Pc(260) int local260;
			@Pc(267) int local267;
			@Pc(290) int local290;
			if (local4 != 2) {
				local22 = arg0.method19825(20);
				local27 = local22 >> 18 & 0x3;
				local260 = local22 >> 16 & 0x3;
				local267 = local22 >> 8 & 0xFF;
				local290 = local22 & 0xFF;
				local118 = aClass85Array1[arg1].anInt2926 * 1438607843;
				aByteArray20[arg1] = (byte) (local27 - 1);
				assert aByteArray20[arg1] >= 0 && aByteArray20[arg1] <= 3;
				local122 = (local118 >> 28) + local260 & 0x3;
				local128 = (local118 >> 14) + local267 & 0xFF;
				local132 = local290 + local118 & 0xFF;
				Class356.method26649(Class72.method14644(), local27 - 1);
				aClass85Array1[arg1].anInt2926 = ((local122 << 28) + (local128 << 14) + local132) * 1407132619;
				return false;
			}
			local22 = arg0.method19825(5);
			local27 = local22 >> 3 & 0x3;
			local260 = local22 & 0x7;
			local267 = aClass85Array1[arg1].anInt2926 * 1438607843;
			assert aByteArray20[arg1] >= 0 && aByteArray20[arg1] <= 3;
			local290 = local27 + (local267 >> 28) & 0x3;
			local118 = local267 >> 14 & 0xFF;
			local122 = local267 & 0xFF;
			if (local260 == 0) {
				local118--;
				local122--;
			}
			if (local260 == 1) {
				local122--;
			}
			if (local260 == 2) {
				local118++;
				local122--;
			}
			if (local260 == 3) {
				local118--;
			}
			if (local260 == 4) {
				local118++;
			}
			if (local260 == 5) {
				local118--;
				local122++;
			}
			if (local260 == 6) {
				local122++;
			}
			if (local260 == 7) {
				local118++;
				local122++;
			}
			Class356.method26649(Class72.method14644(), aByteArray20[arg1]);
			aClass85Array1[arg1].anInt2926 = ((local290 << 28) + (local118 << 14) + local122) * 1407132619;
			return false;
		}
	}

	@OriginalMember(owner = "client!af", name = "q", descriptor = "(Lclient!and;)V", line = 470)
	static final void method9911(@OriginalArg(0) Class3_Sub41_Sub1 arg0) {
		for (@Pc(1) int local1 = 0; local1 < anInt1129 * -1804860363; local1++) {
			arg0.method20271();
			@Pc(14) int local14 = anIntArray166[local1];
			@Pc(18) Class26_Sub1_Sub1_Sub1_Sub2 local18 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = arg0.method20269();
			if ((local22 & 0x20) != 0) {
				local22 += arg0.method20269() << 8;
			}
			if ((local22 & 0x4000) != 0) {
				local22 += arg0.method20269() << 16;
			}
			Class312.method25813(arg0, local14, local18, local22);
		}
	}

	@OriginalMember(owner = "client!af", name = "m", descriptor = "(Lclient!and;)V", line = 470)
	static final void method9912(@OriginalArg(0) Class3_Sub41_Sub1 arg0) {
		for (@Pc(1) int local1 = 0; local1 < anInt1129 * -1804860363; local1++) {
			arg0.method20271();
			@Pc(14) int local14 = anIntArray166[local1];
			@Pc(18) Class26_Sub1_Sub1_Sub1_Sub2 local18 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = arg0.method20269();
			if ((local22 & 0x20) != 0) {
				local22 += arg0.method20269() << 8;
			}
			if ((local22 & 0x4000) != 0) {
				local22 += arg0.method20269() << 16;
			}
			Class312.method25813(arg0, local14, local18, local22);
		}
	}

	@OriginalMember(owner = "client!af", name = "v", descriptor = "(Lclient!and;ILclient!akp;I)V", line = 482)
	static final void method9913(@OriginalArg(0) Class3_Sub41_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26_Sub1_Sub1_Sub1_Sub2 arg2, @OriginalArg(3) int arg3) {
		@Pc(8) String local8;
		if ((arg3 & 0x200) != 0) {
			local8 = arg0.method20283();
			if (arg2 == Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3) {
				Class121.method22823(2, 0, arg2.method16735(true), arg2.method16750(false), arg2.aString77, local8);
			}
			arg2.method16745(local8, 0, 0);
		}
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(79) boolean local79;
		@Pc(40) int local40;
		if ((arg3 & 0x1000) != 0) {
			local40 = arg0.method20315();
			local44 = arg0.method20325();
			if (local40 == 65535) {
				local40 = -1;
			}
			local53 = arg0.method20317();
			local57 = local53 & 0x7;
			local63 = local53 >> 3 & 0xF;
			if (local63 == 15) {
				local63 = -1;
			}
			local79 = (local53 >> 7 & 0x1) == 1;
			arg2.method16639(local40, local44, local57, local63, local79, 2);
		}
		@Pc(110) int local110;
		if ((arg3 & 0x80) != 0) {
			local40 = arg0.method20310();
			@Pc(152) int local152;
			if (local40 > 0) {
				for (local44 = 0; local44 < local40; local44++) {
					local57 = -1;
					local110 = -1;
					local53 = arg0.method20334();
					if (local53 == 32767) {
						local53 = arg0.method20334();
						local63 = arg0.method20334();
						local57 = arg0.method20334();
						local110 = arg0.method20334();
					} else if (local53 == 32766) {
						local53 = -1;
						local63 = arg0.method20269();
					} else {
						local63 = arg0.method20334();
					}
					local152 = arg0.method20334();
					arg2.method16632(local53, local63, local57, local110, client.anInt3034, local152);
				}
			}
			local44 = arg0.method20310();
			if (local44 > 0) {
				for (local53 = 0; local53 < local44; local53++) {
					local57 = arg0.method20334();
					local63 = arg0.method20334();
					if (local63 == 32767) {
						arg2.method16643(local57);
					} else {
						local110 = arg0.method20334();
						local152 = arg0.method20317();
						@Pc(201) int local201 = local63 > 0 ? arg0.method20304() : local152;
						arg2.method16671(local57, client.anInt3034, local63, local110, local152, local201);
					}
				}
			}
		}
		if ((arg3 & 0x200000) != 0) {
			local40 = arg0.method20313();
			local44 = arg0.method20325();
			if (local40 == 65535) {
				local40 = -1;
			}
			local53 = arg0.method20304();
			local57 = local53 & 0x7;
			local63 = local53 >> 3 & 0xF;
			if (local63 == 15) {
				local63 = -1;
			}
			local79 = (local53 >> 7 & 0x1) == 1;
			arg2.method16639(local40, local44, local57, local63, local79, 4);
		}
		if ((arg3 & 0x40000) != 0) {
			local8 = arg0.method20283();
			local44 = arg0.method20304();
			if ((local44 & 0x1) != 0) {
				Class121.method22823(2, local44, arg2.method16735(true), arg2.method16750(false), arg2.aString77, local8);
			}
			arg2.method16745(local8, 0, 0);
		}
		@Pc(324) byte[] local324;
		@Pc(329) Class3_Sub41 local329;
		if ((arg3 & 0x4) != 0) {
			local40 = arg0.method20269();
			local324 = new byte[local40];
			local329 = new Class3_Sub41(local324);
			arg0.method20326(local324, 0, local40);
			aClass3_Sub41Array1[arg1] = local329;
			arg2.method16763(local329);
		}
		if ((arg3 & 0x80000) != 0) {
			local40 = arg0.method20313();
			local44 = arg0.method20323();
			if (local40 == 65535) {
				local40 = -1;
			}
			local53 = arg0.method20310();
			local57 = local53 & 0x7;
			local63 = local53 >> 3 & 0xF;
			if (local63 == 15) {
				local63 = -1;
			}
			local79 = (local53 >> 7 & 0x1) == 1;
			arg2.method16639(local40, local44, local57, local63, local79, 3);
		}
		@Pc(446) Class342 local446;
		@Pc(452) Class304 local452;
		if ((arg3 & 0x10000) != 0) {
			arg2.anInterface58_5.method33320();
			arg0.anInt2803 += -1837960662;
			local40 = arg0.aByteArray51[(arg0.anInt2803 += -918980331) * 62066237 - 1] & 0xFF;
			for (local44 = 0; local44 < local40; local44++) {
				local53 = arg0.method20269();
				local446 = (Class342) Class371.method27203(Class342.class, local53);
				local452 = Class429.aClass70_Sub1_Sub1_2.method14718(arg0, local446);
				arg2.anInterface58_5.method33310(local452.anInt4428 * 1628864065, local452.anObject17);
			}
		}
		if ((arg3 & 0x40) != 0) {
			local40 = arg0.method20314();
			if (local40 == 65535) {
				local40 = -1;
			}
			arg2.anInt2364 = local40 * -1954799489;
		}
		if ((arg3 & 0x10) != 0) {
			arg2.anInt2368 = arg0.method20390() * -1185991597;
			arg2.anInt2370 = arg0.method20390() * 364644769;
			arg2.anInt2369 = arg0.method20308() * -91651127;
			arg2.anInt2380 = arg0.method20390() * -511588031;
			arg2.anInt2372 = (arg0.method20315() + client.anInt3034) * -1076797805;
			arg2.anInt2386 = (arg0.method20271() + client.anInt3034) * 454793361;
			arg2.anInt2373 = arg0.method20313() * 1204696765;
			arg2.anInt2368 += arg2.anIntArray241[0] * -1185991597;
			arg2.anInt2370 += arg2.anIntArray239[0] * 364644769;
			arg2.anInt2369 += arg2.anIntArray241[0] * -91651127;
			arg2.anInt2380 += arg2.anIntArray239[0] * -511588031;
			arg2.anInt2362 = 2015411311;
			arg2.anInt2385 = 0;
		}
		if ((arg3 & 0x400000) != 0) {
			arg0.anInt2803 += -1837960662;
			local40 = arg0.aByteArray51[(arg0.anInt2803 += -918980331) * 62066237 - 1] & 0xFF;
			for (local44 = 0; local44 < local40; local44++) {
				local53 = arg0.method20317();
				local446 = (Class342) Class371.method27203(Class342.class, local53);
				local452 = Class429.aClass70_Sub1_Sub1_2.method14718(arg0, local446);
				arg2.anInterface58_5.method33310(local452.anInt4428 * 1628864065, local452.anObject17);
			}
		}
		if ((arg3 & 0x2000) != 0) {
			local40 = arg0.method20313();
			local44 = arg0.method20324();
			if (local40 == 65535) {
				local40 = -1;
			}
			local53 = arg0.method20304();
			local57 = local53 & 0x7;
			local63 = local53 >> 3 & 0xF;
			if (local63 == 15) {
				local63 = -1;
			}
			local79 = (local53 >> 7 & 0x1) == 1;
			arg2.method16639(local40, local44, local57, local63, local79, 1);
		}
		@Pc(719) int[] local719;
		@Pc(722) int[] local722;
		if ((arg3 & 0x20000) != 0) {
			local40 = arg0.method20310();
			local719 = new int[local40];
			local722 = new int[local40];
			for (local57 = 0; local57 < local40; local57++) {
				local63 = arg0.method20313();
				if ((local63 & 0xC000) == 49152) {
					local110 = arg0.method20314();
					local719[local57] = local63 << 16 | local110;
				} else {
					local719[local57] = local63;
				}
				local722[local57] = arg0.method20313();
			}
			arg2.method16651(local719, local722);
		}
		if ((arg3 & 0x8000) != 0) {
			local40 = arg0.method20310();
			local719 = new int[local40];
			local722 = new int[local40];
			@Pc(783) int[] local783 = new int[local40];
			for (local63 = 0; local63 < local40; local63++) {
				local719[local63] = arg0.method20375();
				local722[local63] = arg0.method20317();
				local783[local63] = arg0.method20315();
			}
			Class227.method24505(arg2, local719, local722, local783);
		}
		if ((arg3 & 0x100000) != 0) {
			arg2.aBoolean419 = arg0.method20317() == 1;
		}
		if ((arg3 & 0x400) != 0) {
			arg2.aBoolean420 = arg0.method20317() == 1;
		}
		if ((arg3 & 0x800) != 0) {
			local40 = arg0.method20317();
			local324 = new byte[local40];
			local329 = new Class3_Sub41(local324);
			arg0.method20384(local324, 0, local40);
			aClass3_Sub41Array2[arg1] = local329;
			arg2.method16731(local329);
		}
		if ((arg3 & 0x1) != 0) {
			local40 = arg0.method20313();
			local44 = arg0.method20275();
			if (local40 == 65535) {
				local40 = -1;
			}
			local53 = arg0.method20310();
			local57 = local53 & 0x7;
			local63 = local53 >> 3 & 0xF;
			if (local63 == 15) {
				local63 = -1;
			}
			local79 = (local53 >> 7 & 0x1) == 1;
			arg2.method16639(local40, local44, local57, local63, local79, 0);
		}
		if ((arg3 & 0x8) != 0) {
			@Pc(938) int[] local938 = new int[4];
			for (local44 = 0; local44 < 4; local44++) {
				local938[local44] = arg0.method20375();
			}
			local44 = arg0.method20310();
			Class435.method27993(arg2, local938, local44, false);
		}
		if ((arg3 & 0x800000) != 0) {
			arg2.aByte74 = arg0.method20307();
			arg2.aByte72 = arg0.method20308();
			arg2.aByte75 = arg0.method20308();
			arg2.aByte76 = (byte) arg0.method20304();
			arg2.anInt2374 = (client.anInt3034 + arg0.method20313()) * -601452769;
			arg2.anInt2375 = (client.anInt3034 + arg0.method20313()) * -1061195387;
		}
		if ((arg3 & 0x2) == 0) {
			return;
		}
		arg2.anInt2395 = arg0.method20315() * -1905570099;
		if (arg2.anInt2362 * -162520433 == 0) {
			arg2.method16633(arg2.anInt2395 * 1668894213);
			arg2.anInt2395 = 1905570099;
		}
	}

	@OriginalMember(owner = "client!af", name = "t", descriptor = "(Lclient!and;ILclient!akp;I)V", line = 482)
	static final void method9914(@OriginalArg(0) Class3_Sub41_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26_Sub1_Sub1_Sub1_Sub2 arg2, @OriginalArg(3) int arg3) {
		@Pc(8) String local8;
		if ((arg3 & 0x200) != 0) {
			local8 = arg0.method20283();
			if (arg2 == Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3) {
				Class121.method22823(2, 0, arg2.method16735(true), arg2.method16750(false), arg2.aString77, local8);
			}
			arg2.method16745(local8, 0, 0);
		}
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(79) boolean local79;
		@Pc(40) int local40;
		if ((arg3 & 0x1000) != 0) {
			local40 = arg0.method20315();
			local44 = arg0.method20325();
			if (local40 == 65535) {
				local40 = -1;
			}
			local53 = arg0.method20317();
			local57 = local53 & 0x7;
			local63 = local53 >> 3 & 0xF;
			if (local63 == 15) {
				local63 = -1;
			}
			local79 = (local53 >> 7 & 0x1) == 1;
			arg2.method16639(local40, local44, local57, local63, local79, 2);
		}
		@Pc(110) int local110;
		if ((arg3 & 0x80) != 0) {
			local40 = arg0.method20310();
			@Pc(152) int local152;
			if (local40 > 0) {
				for (local44 = 0; local44 < local40; local44++) {
					local57 = -1;
					local110 = -1;
					local53 = arg0.method20334();
					if (local53 == 32767) {
						local53 = arg0.method20334();
						local63 = arg0.method20334();
						local57 = arg0.method20334();
						local110 = arg0.method20334();
					} else if (local53 == 32766) {
						local53 = -1;
						local63 = arg0.method20269();
					} else {
						local63 = arg0.method20334();
					}
					local152 = arg0.method20334();
					arg2.method16632(local53, local63, local57, local110, client.anInt3034, local152);
				}
			}
			local44 = arg0.method20310();
			if (local44 > 0) {
				for (local53 = 0; local53 < local44; local53++) {
					local57 = arg0.method20334();
					local63 = arg0.method20334();
					if (local63 == 32767) {
						arg2.method16643(local57);
					} else {
						local110 = arg0.method20334();
						local152 = arg0.method20317();
						@Pc(201) int local201 = local63 > 0 ? arg0.method20304() : local152;
						arg2.method16671(local57, client.anInt3034, local63, local110, local152, local201);
					}
				}
			}
		}
		if ((arg3 & 0x200000) != 0) {
			local40 = arg0.method20313();
			local44 = arg0.method20325();
			if (local40 == 65535) {
				local40 = -1;
			}
			local53 = arg0.method20304();
			local57 = local53 & 0x7;
			local63 = local53 >> 3 & 0xF;
			if (local63 == 15) {
				local63 = -1;
			}
			local79 = (local53 >> 7 & 0x1) == 1;
			arg2.method16639(local40, local44, local57, local63, local79, 4);
		}
		if ((arg3 & 0x40000) != 0) {
			local8 = arg0.method20283();
			local44 = arg0.method20304();
			if ((local44 & 0x1) != 0) {
				Class121.method22823(2, local44, arg2.method16735(true), arg2.method16750(false), arg2.aString77, local8);
			}
			arg2.method16745(local8, 0, 0);
		}
		@Pc(324) byte[] local324;
		@Pc(329) Class3_Sub41 local329;
		if ((arg3 & 0x4) != 0) {
			local40 = arg0.method20269();
			local324 = new byte[local40];
			local329 = new Class3_Sub41(local324);
			arg0.method20326(local324, 0, local40);
			aClass3_Sub41Array1[arg1] = local329;
			arg2.method16763(local329);
		}
		if ((arg3 & 0x80000) != 0) {
			local40 = arg0.method20313();
			local44 = arg0.method20323();
			if (local40 == 65535) {
				local40 = -1;
			}
			local53 = arg0.method20310();
			local57 = local53 & 0x7;
			local63 = local53 >> 3 & 0xF;
			if (local63 == 15) {
				local63 = -1;
			}
			local79 = (local53 >> 7 & 0x1) == 1;
			arg2.method16639(local40, local44, local57, local63, local79, 3);
		}
		@Pc(446) Class342 local446;
		@Pc(452) Class304 local452;
		if ((arg3 & 0x10000) != 0) {
			arg2.anInterface58_5.method33320();
			arg0.anInt2803 += -1837960662;
			local40 = arg0.aByteArray51[(arg0.anInt2803 += -918980331) * 62066237 - 1] & 0xFF;
			for (local44 = 0; local44 < local40; local44++) {
				local53 = arg0.method20269();
				local446 = (Class342) Class371.method27203(Class342.class, local53);
				local452 = Class429.aClass70_Sub1_Sub1_2.method14718(arg0, local446);
				arg2.anInterface58_5.method33310(local452.anInt4428 * 1628864065, local452.anObject17);
			}
		}
		if ((arg3 & 0x40) != 0) {
			local40 = arg0.method20314();
			if (local40 == 65535) {
				local40 = -1;
			}
			arg2.anInt2364 = local40 * -1954799489;
		}
		if ((arg3 & 0x10) != 0) {
			arg2.anInt2368 = arg0.method20390() * -1185991597;
			arg2.anInt2370 = arg0.method20390() * 364644769;
			arg2.anInt2369 = arg0.method20308() * -91651127;
			arg2.anInt2380 = arg0.method20390() * -511588031;
			arg2.anInt2372 = (arg0.method20315() + client.anInt3034) * -1076797805;
			arg2.anInt2386 = (arg0.method20271() + client.anInt3034) * 454793361;
			arg2.anInt2373 = arg0.method20313() * 1204696765;
			arg2.anInt2368 += arg2.anIntArray241[0] * -1185991597;
			arg2.anInt2370 += arg2.anIntArray239[0] * 364644769;
			arg2.anInt2369 += arg2.anIntArray241[0] * -91651127;
			arg2.anInt2380 += arg2.anIntArray239[0] * -511588031;
			arg2.anInt2362 = 2015411311;
			arg2.anInt2385 = 0;
		}
		if ((arg3 & 0x400000) != 0) {
			arg0.anInt2803 += -1837960662;
			local40 = arg0.aByteArray51[(arg0.anInt2803 += -918980331) * 62066237 - 1] & 0xFF;
			for (local44 = 0; local44 < local40; local44++) {
				local53 = arg0.method20317();
				local446 = (Class342) Class371.method27203(Class342.class, local53);
				local452 = Class429.aClass70_Sub1_Sub1_2.method14718(arg0, local446);
				arg2.anInterface58_5.method33310(local452.anInt4428 * 1628864065, local452.anObject17);
			}
		}
		if ((arg3 & 0x2000) != 0) {
			local40 = arg0.method20313();
			local44 = arg0.method20324();
			if (local40 == 65535) {
				local40 = -1;
			}
			local53 = arg0.method20304();
			local57 = local53 & 0x7;
			local63 = local53 >> 3 & 0xF;
			if (local63 == 15) {
				local63 = -1;
			}
			local79 = (local53 >> 7 & 0x1) == 1;
			arg2.method16639(local40, local44, local57, local63, local79, 1);
		}
		@Pc(719) int[] local719;
		@Pc(722) int[] local722;
		if ((arg3 & 0x20000) != 0) {
			local40 = arg0.method20310();
			local719 = new int[local40];
			local722 = new int[local40];
			for (local57 = 0; local57 < local40; local57++) {
				local63 = arg0.method20313();
				if ((local63 & 0xC000) == 49152) {
					local110 = arg0.method20314();
					local719[local57] = local63 << 16 | local110;
				} else {
					local719[local57] = local63;
				}
				local722[local57] = arg0.method20313();
			}
			arg2.method16651(local719, local722);
		}
		if ((arg3 & 0x8000) != 0) {
			local40 = arg0.method20310();
			local719 = new int[local40];
			local722 = new int[local40];
			@Pc(783) int[] local783 = new int[local40];
			for (local63 = 0; local63 < local40; local63++) {
				local719[local63] = arg0.method20375();
				local722[local63] = arg0.method20317();
				local783[local63] = arg0.method20315();
			}
			Class227.method24505(arg2, local719, local722, local783);
		}
		if ((arg3 & 0x100000) != 0) {
			arg2.aBoolean419 = arg0.method20317() == 1;
		}
		if ((arg3 & 0x400) != 0) {
			arg2.aBoolean420 = arg0.method20317() == 1;
		}
		if ((arg3 & 0x800) != 0) {
			local40 = arg0.method20317();
			local324 = new byte[local40];
			local329 = new Class3_Sub41(local324);
			arg0.method20384(local324, 0, local40);
			aClass3_Sub41Array2[arg1] = local329;
			arg2.method16731(local329);
		}
		if ((arg3 & 0x1) != 0) {
			local40 = arg0.method20313();
			local44 = arg0.method20275();
			if (local40 == 65535) {
				local40 = -1;
			}
			local53 = arg0.method20310();
			local57 = local53 & 0x7;
			local63 = local53 >> 3 & 0xF;
			if (local63 == 15) {
				local63 = -1;
			}
			local79 = (local53 >> 7 & 0x1) == 1;
			arg2.method16639(local40, local44, local57, local63, local79, 0);
		}
		if ((arg3 & 0x8) != 0) {
			@Pc(938) int[] local938 = new int[4];
			for (local44 = 0; local44 < 4; local44++) {
				local938[local44] = arg0.method20375();
			}
			local44 = arg0.method20310();
			Class435.method27993(arg2, local938, local44, false);
		}
		if ((arg3 & 0x800000) != 0) {
			arg2.aByte74 = arg0.method20307();
			arg2.aByte72 = arg0.method20308();
			arg2.aByte75 = arg0.method20308();
			arg2.aByte76 = (byte) arg0.method20304();
			arg2.anInt2374 = (client.anInt3034 + arg0.method20313()) * -601452769;
			arg2.anInt2375 = (client.anInt3034 + arg0.method20313()) * -1061195387;
		}
		if ((arg3 & 0x2) == 0) {
			return;
		}
		arg2.anInt2395 = arg0.method20315() * -1905570099;
		if (arg2.anInt2362 * -162520433 == 0) {
			arg2.method16633(arg2.anInt2395 * 1668894213);
			arg2.anInt2395 = 1905570099;
		}
	}

	@OriginalMember(owner = "client!af", name = "w", descriptor = "()V", line = 705)
	static void method9907() {
		anInt1127 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2048; local3++) {
			aClass3_Sub41Array1[local3] = null;
			aClass3_Sub41Array2[local3] = null;
			aByteArray20[local3] = Class538.aClass538_3.aByte171;
			aClass85Array1[local3] = null;
		}
	}

	@OriginalMember(owner = "client!af", name = "o", descriptor = "()V", line = 705)
	static void method9916() {
		anInt1127 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2048; local3++) {
			aClass3_Sub41Array1[local3] = null;
			aClass3_Sub41Array2[local3] = null;
			aByteArray20[local3] = Class538.aClass538_3.aByte171;
			aClass85Array1[local3] = null;
		}
	}

	@OriginalMember(owner = "client!af", name = "adl", descriptor = "(Lclient!vs;B)V", line = 9316)
	static final void method9919(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		client.anInt3186 = arg0.anIntArray496[arg0.anInt5319 * 960738381] * 910210619;
		Class13_Sub22.aClass566_1 = Class378.method27245(arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1]);
		if (Class13_Sub22.aClass566_1 == null) {
			Class13_Sub22.aClass566_1 = Class566.aClass566_3;
		}
		client.anInt3126 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2] * -1933606323;
		@Pc(46) Class82 local46 = Class406.method27657();
		@Pc(52) Class3_Sub23 local52 = Class269.method25284(Class311.aClass311_48, local46.aClass577_2);
		local52.aClass3_Sub41_Sub1_1.method20250(client.anInt3186 * -1581600013);
		local52.aClass3_Sub41_Sub1_1.method20250(Class13_Sub22.aClass566_1.anInt5371 * 1519418413);
		local52.aClass3_Sub41_Sub1_1.method20250(client.anInt3126 * -1610512763);
		local46.method21601(local52);
	}
}
