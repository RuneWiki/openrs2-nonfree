package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yl")
public class Class602 {

	@OriginalMember(owner = "client!yl", name = "h", descriptor = "[I")
	public static int[] anIntArray519;

	@OriginalMember(owner = "client!yl", name = "a", descriptor = "I")
	public static int anInt5523;

	@OriginalMember(owner = "client!yl", name = "g", descriptor = "I")
	static int anInt5524;

	@OriginalMember(owner = "client!yl", name = "l", descriptor = "[I")
	public static int[] anIntArray520;

	@OriginalMember(owner = "client!yl", name = "p", descriptor = "I")
	static final int anInt5525 = 12;

	@OriginalMember(owner = "client!yl", name = "r", descriptor = "Lclient!hd;")
	static Class218 aClass218_20;

	@OriginalMember(owner = "client!yl", name = "fm", descriptor = "Lclient!ny;")
	public static Class359 aClass359_112;

	@OriginalMember(owner = "client!yl", name = "e", descriptor = "Lclient!co;")
	static Class6 aClass6_37;

	@OriginalMember(owner = "client!yl", name = "x", descriptor = "Lclient!nr;")
	static Class354 aClass354_2 = new Class354(16, Class360.aClass360_2);

	@OriginalMember(owner = "client!yl", name = "p", descriptor = "([BZB)Ljava/lang/Object;", line = 12)
	public static Object method33519(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0.length > 136) {
			@Pc(11) ByteBuffer local11 = ByteBuffer.allocateDirect(arg0.length);
			local11.position(0);
			local11.put(arg0);
			return local11;
		} else if (arg1) {
			return Arrays.copyOf(arg0, arg0.length);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!yl", name = "<init>", descriptor = "()V", line = 16)
	Class602() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!yl", name = "g", descriptor = "(II)V", line = 21)
	public static void method33520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (anInt5523 * -1178159305 != arg0) {
			anIntArray520 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				anIntArray520[local9] = (local9 << 12) / arg0;
			}
			anInt5523 = arg0 * -524112249;
		}
		if (anInt5524 * -242530625 == arg1) {
			return;
		}
		if (arg1 == anInt5523 * -1178159305) {
			anIntArray519 = anIntArray520;
		} else {
			anIntArray519 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				anIntArray519[local9] = (local9 << 12) / arg1;
			}
		}
		anInt5524 = arg1 * 98249023;
	}

	@OriginalMember(owner = "client!yl", name = "p", descriptor = "(IIS)V", line = 21)
	public static void method33521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (anInt5523 * -1178159305 != arg0) {
			anIntArray520 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				anIntArray520[local9] = (local9 << 12) / arg0;
			}
			anInt5523 = arg0 * -524112249;
		}
		if (anInt5524 * -242530625 == arg1) {
			return;
		}
		if (arg1 == anInt5523 * -1178159305) {
			anIntArray519 = anIntArray520;
		} else {
			anIntArray519 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				anIntArray519[local9] = (local9 << 12) / arg1;
			}
		}
		anInt5524 = arg1 * 98249023;
	}

	@OriginalMember(owner = "client!yl", name = "a", descriptor = "(II)[B", line = 37)
	public static byte[] method33518(@OriginalArg(0) int arg0) {
		@Pc(7) byte[] local7 = (byte[]) aClass354_2.method26608(arg0);
		if (local7 == null) {
			local7 = new byte[512];
			@Pc(19) Random local19 = new Random((long) arg0);
			@Pc(21) int local21;
			for (local21 = 0; local21 < 255; local21++) {
				local7[local21] = (byte) local21;
			}
			for (local21 = 0; local21 < 255; local21++) {
				@Pc(40) int local40 = 255 - local21;
				@Pc(45) int local45 = Class301.method25665(local19, local40);
				@Pc(49) byte local49 = local7[local45];
				local7[local45] = local7[local40];
				local7[local40] = local7[511 - local21] = local49;
			}
			aClass354_2.method26620(arg0, local7);
		}
		return local7;
	}

	@OriginalMember(owner = "client!yl", name = "s", descriptor = "(I)V", line = 146)
	public static void method33522() {
		if (Class190.anInt3648 * -1033304397 == 102) {
			Class190.anInt3648 = 1175275698;
		}
	}

	@OriginalMember(owner = "client!yl", name = "h", descriptor = "(Lclient!and;II)V", line = 209)
	static void method33517(@OriginalArg(0) Class3_Sub41_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class464 local3 = client.aClass370_1.method26942();
		@Pc(13) boolean local13 = arg0.method19825(1) == 1;
		if (local13) {
			Class52.anIntArray166[(Class52.anInt1129 += -415617507) * -1804860363 - 1] = arg1;
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
							local36.method16732(local171, local176 + 1, Class52.aByteArray20[arg1]);
							break;
						case 1:
							local36.method16732(local171 - 1, local176, Class52.aByteArray20[arg1]);
							break;
						case 2:
							local36.method16732(local171 + 1, local176, Class52.aByteArray20[arg1]);
							break;
						case 3:
							local36.method16732(local171, local176 - 1, Class52.aByteArray20[arg1]);
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
				local36.method16732(local171, local176, Class52.aByteArray20[arg1]);
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
				local36.method16732(local166, local171, Class52.aByteArray20[arg1]);
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
						Class52.aByteArray20[arg1] = (byte) (local171 - 1);
						local36.method16732(local449, local456, Class52.aByteArray20[arg1]);
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
						Class52.aByteArray20[arg1] = (byte) (local166 - 1);
						local36.method16732(local449, local456, Class52.aByteArray20[arg1]);
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
			@Pc(58) Class85 local58 = Class52.aClass85Array1[arg1] = new Class85();
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

	@OriginalMember(owner = "client!yl", name = "at", descriptor = "(Lclient!de;B)V", line = 885)
	static void method33525(@OriginalArg(0) Class21 arg0) {
		if (Class250.aBoolean688) {
			Class445.method28336(arg0);
		} else {
			Class492.method29291(arg0);
		}
	}

	@OriginalMember(owner = "client!yl", name = "aik", descriptor = "(Lclient!vs;I)V", line = 10511)
	static final void method33524(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class594.method33424(client.anInt3039 * 1115111877) ? 1 : 0;
	}

	@OriginalMember(owner = "client!yl", name = "arj", descriptor = "(Lclient!vs;B)V", line = 12160)
	static final void method33523(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class19_Sub2.anInt2889 * 2027727681;
	}
}
