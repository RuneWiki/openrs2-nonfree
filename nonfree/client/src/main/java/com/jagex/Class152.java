package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public class Class152 {

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
	static final int anInt2398 = 1;

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
	static final int anInt2400 = 2;

	@OriginalMember(owner = "client!ao", name = "v", descriptor = "[B")
	static byte[] aByteArray37 = new byte[2048];

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "[B")
	static byte[] aByteArray38 = new byte[2048];

	@OriginalMember(owner = "client!ao", name = "y", descriptor = "[Lclient!akv;")
	static Class77_Sub39[] aClass77_Sub39Array2 = new Class77_Sub39[2048];

	@OriginalMember(owner = "client!ao", name = "w", descriptor = "[Lclient!akv;")
	static Class77_Sub39[] aClass77_Sub39Array1 = new Class77_Sub39[2048];

	@OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
	public static int anInt2399 = 0;

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "[I")
	static int[] anIntArray221 = new int[2048];

	@OriginalMember(owner = "client!ao", name = "x", descriptor = "I")
	static int anInt2402 = 0;

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "[I")
	static int[] anIntArray222 = new int[2048];

	@OriginalMember(owner = "client!ao", name = "s", descriptor = "[Lclient!s;")
	static Class526[] aClass526Array1 = new Class526[2048];

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
	static int anInt2401 = 0;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "[I")
	static int[] anIntArray223 = new int[2048];

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "([Ljava/lang/String;[IIII)V", line = 13)
	static void method17431(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) String local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (local14 == null || arg0[local40] != null && arg0[local40].compareTo(local14) < (local40 & 0x1)) {
				@Pc(62) String local62 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local62;
				@Pc(76) int local76 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local76;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method17431(arg0, arg1, arg2, local10 - 1);
		method17431(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "(IB)Lclient!is;", line = 16)
	public static Class330 method17432(@OriginalArg(0) int arg0) {
		if (Class330.aClass330_5.anInt4095 * 1266327829 == arg0) {
			return Class330.aClass330_5;
		} else if (arg0 == Class330.aClass330_3.anInt4095 * 1266327829) {
			return Class330.aClass330_3;
		} else if (arg0 == Class330.aClass330_4.anInt4095 * 1266327829) {
			return Class330.aClass330_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "(II)Ljava/lang/String;", line = 17)
	public static String method17433(@OriginalArg(0) int arg0) {
		return "<img=" + arg0 + ">";
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V", line = 37)
	Class152() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(Lclient!arc;)V", line = 42)
	static final void method17434(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		arg0.method22187();
		@Pc(6) int local6 = client.anInt3389 * -643758853;
		@Pc(19) Class104_Sub1_Sub1_Sub1_Sub2 local19 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local6] = new Class104_Sub1_Sub1_Sub1_Sub2(client.aClass517_1.method30435());
		local19.anInt2867 = local6 * -2061161143;
		@Pc(29) int local29 = arg0.method22189(30);
		@Pc(34) byte local34 = (byte) (local29 >> 28);
		@Pc(40) int local40 = local29 >> 14 & 0x3FFF;
		@Pc(44) int local44 = local29 & 0x3FFF;
		@Pc(48) Class595 local48 = client.aClass517_1.method30409();
		local19.anIntArray274[0] = local40 - local48.anInt5504 * -424199969;
		local19.anIntArray275[0] = local44 - local48.anInt5506 * -1166289421;
		local19.method24106((float) ((local19.anIntArray274[0] << 9) + (local19.method21095() << 8)), local19.method24082().aClass447_61.aFloat276, (float) ((local19.anIntArray275[0] << 9) + (local19.method21095() << 8)));
		Class669.anInt5790 = (local19.aByte100 = local19.aByte99 = local34) * -2078297599;
		if (client.aClass517_1.method30441().method29665(local19.anIntArray274[0], local19.anIntArray275[0])) {
			local19.aByte99++;
		}
		if (aClass77_Sub39Array2[local6] != null) {
			local19.method21163(aClass77_Sub39Array2[local6]);
		}
		if (aClass77_Sub39Array1[local6] != null) {
			local19.method21166(aClass77_Sub39Array1[local6]);
		}
		anInt2399 = 0;
		anIntArray221[(anInt2399 += 76736439) * -1843550713 - 1] = local6;
		aByteArray37[local6] = 0;
		anInt2402 = 0;
		for (@Pc(175) int local175 = 1; local175 < 2048; local175++) {
			if (local6 != local175) {
				@Pc(187) int local187 = arg0.method22189(18);
				@Pc(193) int local193 = local187 >> 16 & 0x3;
				@Pc(199) int local199 = local187 >> 8 & 0xFF;
				@Pc(203) int local203 = local187 & 0xFF;
				@Pc(211) Class526 local211 = aClass526Array1[local175] = new Class526();
				local211.anInt5166 = (local203 + (local199 << 14) + (local193 << 28)) * 186312257;
				local211.anInt5164 = 0;
				local211.anInt5165 = -587751205;
				local211.aClass282_5 = Class282.aClass282_4;
				local211.aBoolean783 = false;
				anIntArray222[(anInt2402 += -989241915) * 918952205 - 1] = local175;
				aByteArray37[local175] = 0;
			}
		}
		arg0.method22192();
		@Pc(261) Class331 local261 = Class597.aClass107_Sub1_2.method8880();
		if (local261 == Class331.aClass331_4) {
			@Pc(269) Class115_Sub1 local269 = (Class115_Sub1) Class597.aClass107_Sub1_2.method8871();
			local269.method9836();
		}
		@Pc(276) Class321 local276 = Class597.aClass107_Sub1_2.method8879();
		if (Class321.aClass321_4 == local276) {
			@Pc(284) Class149_Sub4 local284 = (Class149_Sub4) Class597.aClass107_Sub1_2.method8873();
			local284.method16843();
		}
	}

	@OriginalMember(owner = "client!ao", name = "s", descriptor = "(Lclient!arc;)V", line = 42)
	static final void method17435(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		arg0.method22187();
		@Pc(6) int local6 = client.anInt3389 * -643758853;
		@Pc(19) Class104_Sub1_Sub1_Sub1_Sub2 local19 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local6] = new Class104_Sub1_Sub1_Sub1_Sub2(client.aClass517_1.method30435());
		local19.anInt2867 = local6 * -2061161143;
		@Pc(29) int local29 = arg0.method22189(30);
		@Pc(34) byte local34 = (byte) (local29 >> 28);
		@Pc(40) int local40 = local29 >> 14 & 0x3FFF;
		@Pc(44) int local44 = local29 & 0x3FFF;
		@Pc(48) Class595 local48 = client.aClass517_1.method30409();
		local19.anIntArray274[0] = local40 - local48.anInt5504 * -424199969;
		local19.anIntArray275[0] = local44 - local48.anInt5506 * -1166289421;
		local19.method24106((float) ((local19.anIntArray274[0] << 9) + (local19.method21095() << 8)), local19.method24082().aClass447_61.aFloat276, (float) ((local19.anIntArray275[0] << 9) + (local19.method21095() << 8)));
		Class669.anInt5790 = (local19.aByte100 = local19.aByte99 = local34) * -2078297599;
		if (client.aClass517_1.method30441().method29665(local19.anIntArray274[0], local19.anIntArray275[0])) {
			local19.aByte99++;
		}
		if (aClass77_Sub39Array2[local6] != null) {
			local19.method21163(aClass77_Sub39Array2[local6]);
		}
		if (aClass77_Sub39Array1[local6] != null) {
			local19.method21166(aClass77_Sub39Array1[local6]);
		}
		anInt2399 = 0;
		anIntArray221[(anInt2399 += 76736439) * -1843550713 - 1] = local6;
		aByteArray37[local6] = 0;
		anInt2402 = 0;
		for (@Pc(175) int local175 = 1; local175 < 2048; local175++) {
			if (local6 != local175) {
				@Pc(187) int local187 = arg0.method22189(18);
				@Pc(193) int local193 = local187 >> 16 & 0x3;
				@Pc(199) int local199 = local187 >> 8 & 0xFF;
				@Pc(203) int local203 = local187 & 0xFF;
				@Pc(211) Class526 local211 = aClass526Array1[local175] = new Class526();
				local211.anInt5166 = (local203 + (local199 << 14) + (local193 << 28)) * 186312257;
				local211.anInt5164 = 0;
				local211.anInt5165 = -587751205;
				local211.aClass282_5 = Class282.aClass282_4;
				local211.aBoolean783 = false;
				anIntArray222[(anInt2402 += -989241915) * 918952205 - 1] = local175;
				aByteArray37[local175] = 0;
			}
		}
		arg0.method22192();
		@Pc(261) Class331 local261 = Class597.aClass107_Sub1_2.method8880();
		if (local261 == Class331.aClass331_4) {
			@Pc(269) Class115_Sub1 local269 = (Class115_Sub1) Class597.aClass107_Sub1_2.method8871();
			local269.method9836();
		}
		@Pc(276) Class321 local276 = Class597.aClass107_Sub1_2.method8879();
		if (Class321.aClass321_4 == local276) {
			@Pc(284) Class149_Sub4 local284 = (Class149_Sub4) Class597.aClass107_Sub1_2.method8873();
			local284.method16843();
		}
	}

	@OriginalMember(owner = "client!ao", name = "w", descriptor = "(Ljava/lang/CharSequence;II)I", line = 80)
	public static int method17436(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		return Class526.method30676(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "(Lclient!arc;I)V", line = 91)
	static final void method17437(@OriginalArg(0) Class77_Sub39_Sub1 arg0, @OriginalArg(1) int arg1) {
		anInt2401 = 0;
		Class499.method30212(arg0);
		Class486.method29980(arg0);
		if (arg0.anInt3089 * 31645619 != arg1) {
			throw new RuntimeException(arg0.anInt3089 * 31645619 + " " + arg1);
		}
	}

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "(Lclient!arc;I)V", line = 91)
	static final void method17438(@OriginalArg(0) Class77_Sub39_Sub1 arg0, @OriginalArg(1) int arg1) {
		anInt2401 = 0;
		Class499.method30212(arg0);
		Class486.method29980(arg0);
		if (arg0.anInt3089 * 31645619 != arg1) {
			throw new RuntimeException(arg0.anInt3089 * 31645619 + " " + arg1);
		}
	}

	@OriginalMember(owner = "client!ao", name = "z", descriptor = "(Lclient!arc;I)V", line = 91)
	static final void method17439(@OriginalArg(0) Class77_Sub39_Sub1 arg0, @OriginalArg(1) int arg1) {
		anInt2401 = 0;
		Class499.method30212(arg0);
		Class486.method29980(arg0);
		if (arg0.anInt3089 * 31645619 != arg1) {
			throw new RuntimeException(arg0.anInt3089 * 31645619 + " " + arg1);
		}
	}

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "(Lclient!arc;)I", line = 200)
	static int method17440(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		@Pc(4) int local4 = arg0.method22189(2);
		@Pc(9) int local9;
		if (local4 == 0) {
			local9 = 0;
		} else if (local4 == 1) {
			local9 = arg0.method22189(5);
		} else if (local4 == 2) {
			local9 = arg0.method22189(8);
		} else {
			local9 = arg0.method22189(11);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "(Lclient!arc;)I", line = 200)
	static int method17441(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		@Pc(4) int local4 = arg0.method22189(2);
		@Pc(9) int local9;
		if (local4 == 0) {
			local9 = 0;
		} else if (local4 == 1) {
			local9 = arg0.method22189(5);
		} else if (local4 == 2) {
			local9 = arg0.method22189(8);
		} else {
			local9 = arg0.method22189(11);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "(Lclient!arc;)I", line = 200)
	static int method17442(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		@Pc(4) int local4 = arg0.method22189(2);
		@Pc(9) int local9;
		if (local4 == 0) {
			local9 = 0;
		} else if (local4 == 1) {
			local9 = arg0.method22189(5);
		} else if (local4 == 2) {
			local9 = arg0.method22189(8);
		} else {
			local9 = arg0.method22189(11);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "(Lclient!arc;I)V", line = 210)
	static void method17443(@OriginalArg(0) Class77_Sub39_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class595 local3 = client.aClass517_1.method30409();
		@Pc(13) boolean local13 = arg0.method22189(1) == 1;
		if (local13) {
			anIntArray223[(anInt2401 += 375555833) * -1852482743 - 1] = arg1;
		}
		@Pc(32) int local32 = arg0.method22189(2);
		@Pc(36) Class104_Sub1_Sub1_Sub1_Sub2 local36 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		if (local32 != 0) {
			@Pc(161) int local161;
			@Pc(166) int local166;
			@Pc(171) int local171;
			@Pc(176) int local176;
			@Pc(189) int local189;
			if (local32 == 1) {
				local161 = arg0.method22189(3);
				local166 = arg0.method22189(1);
				local171 = local36.anIntArray274[0];
				local176 = local36.anIntArray275[0];
				if (local166 == 1) {
					aByteArray38[arg1] = Class671.aClass671_5.aByte175;
					local189 = arg0.method22189(2);
					switch(local189) {
						case 0:
							local36.method21182(local171, local176 + 1, aByteArray38[arg1]);
							break;
						case 1:
							local36.method21182(local171 - 1, local176, aByteArray38[arg1]);
							break;
						case 2:
							local36.method21182(local171 + 1, local176, aByteArray38[arg1]);
							break;
						case 3:
							local36.method21182(local171, local176 - 1, aByteArray38[arg1]);
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
				local36.method21182(local171, local176, aByteArray38[arg1]);
			} else if (local32 == 2) {
				local161 = arg0.method22189(4);
				local166 = local36.anIntArray274[0];
				local171 = local36.anIntArray275[0];
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
				local36.method21182(local166, local171, aByteArray38[arg1]);
			} else {
				local161 = arg0.method22189(1);
				@Pc(442) int local442;
				@Pc(453) int local453;
				@Pc(460) int local460;
				if (local161 == 0) {
					local166 = arg0.method22189(15);
					local171 = local166 >> 12 & 0x7;
					local176 = (byte) (local166 >> 10) & 0x3;
					local189 = local166 >> 5 & 0x1F;
					if (local189 > 15) {
						local189 -= 32;
					}
					local442 = local166 & 0x1F;
					if (local442 > 15) {
						local442 -= 32;
					}
					local453 = local189 + local36.anIntArray274[0];
					local460 = local442 + local36.anIntArray275[0];
					if (local171 == Class671.aClass671_3.anInt5793 * -848448635) {
						local36.method21186(local453, local460);
					} else {
						aByteArray38[arg1] = (byte) (local171 - 1);
						local36.method21182(local453, local460, aByteArray38[arg1]);
					}
					local36.aByte100 = local36.aByte99 = (byte) (local176 + local36.aByte100 & 0x3);
					if (client.aClass517_1.method30441().method29665(local453, local460)) {
						local36.aByte99++;
					}
					if (arg1 == client.anInt3389 * -643758853 && local36.aByte100 != Class669.anInt5790 * -878424575) {
						Class669.anInt5790 = local36.aByte100 * -2078297599;
					}
				} else {
					local166 = arg0.method22189(3);
					local171 = arg0.method22189(30);
					local176 = local171 >> 28 & 0x3;
					local189 = local171 >> 14 & 0x3FFF;
					local442 = local171 & 0x3FFF;
					local453 = (local189 + local3.anInt5504 * -424199969 + local36.anIntArray274[0] & 0x3FFF) - local3.anInt5504 * -424199969;
					local460 = (local36.anIntArray275[0] + local3.anInt5506 * -1166289421 + local442 & 0x3FFF) - local3.anInt5506 * -1166289421;
					if (Class671.aClass671_3.anInt5793 * -848448635 == local166) {
						local36.method21186(local453, local460);
					} else {
						aByteArray38[arg1] = (byte) (local166 - 1);
						local36.method21182(local453, local460, aByteArray38[arg1]);
					}
					local36.aByte100 = local36.aByte99 = (byte) (local176 + local36.aByte100 & 0x3);
					if (client.aClass517_1.method30441().method29665(local453, local460)) {
						local36.aByte99++;
					}
					if (arg1 == client.anInt3389 * -643758853) {
						Class669.anInt5790 = local36.aByte100 * -2078297599;
					}
				}
			}
		} else if (!local13) {
			if (client.anInt3389 * -643758853 == arg1) {
				throw new RuntimeException();
			}
			@Pc(58) Class526 local58 = aClass526Array1[arg1] = new Class526();
			Class671.method33202();
			local58.anInt5166 = ((local36.anIntArray275[0] + local3.anInt5506 * -1166289421 >> 6) + (local36.aByte100 << 28) + (local3.anInt5504 * -424199969 + local36.anIntArray274[0] >> 6 << 14)) * 186312257;
			if (local36.anInt2910 * -2025203045 == -1) {
				local58.anInt5164 = local36.aClass503_7.method30242() * 252679473;
			} else {
				local58.anInt5164 = local36.anInt2910 * -982249813;
			}
			local58.anInt5165 = local36.anInt2880 * 101449423;
			local58.aClass282_5 = local36.aClass282_1;
			local58.aBoolean783 = local36.aBoolean486;
			if (local36.anInt2914 * -785793877 > 0) {
				Class576.method31612(local36);
			}
			client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[arg1] = null;
			if (arg0.method22189(1) != 0) {
				Class249.method26164(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(Lclient!arc;I)Z", line = 381)
	static boolean method17444(@OriginalArg(0) Class77_Sub39_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.method22189(2);
		@Pc(21) int local21;
		@Pc(26) int local26;
		@Pc(118) int local118;
		@Pc(122) int local122;
		@Pc(128) int local128;
		@Pc(132) int local132;
		if (local4 == 0) {
			if (arg0.method22189(1) != 0) {
				Class249.method26164(arg0, arg1);
			}
			local21 = arg0.method22189(6);
			local26 = arg0.method22189(6);
			@Pc(36) boolean local36 = arg0.method22189(1) == 1;
			if (local36) {
				anIntArray223[(anInt2401 += 375555833) * -1852482743 - 1] = arg1;
			}
			if (client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException();
			}
			@Pc(62) Class526 local62 = aClass526Array1[arg1];
			@Pc(73) Class104_Sub1_Sub1_Sub1_Sub2 local73 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[arg1] = new Class104_Sub1_Sub1_Sub1_Sub2(client.aClass517_1.method30435());
			local73.anInt2867 = arg1 * -2061161143;
			if (aClass77_Sub39Array2[arg1] != null) {
				local73.method21163(aClass77_Sub39Array2[arg1]);
			}
			if (aClass77_Sub39Array1[arg1] != null) {
				local73.method21166(aClass77_Sub39Array1[arg1]);
			}
			local73.method21070(local62.anInt5164 * -23485487, true);
			local73.anInt2880 = local62.anInt5165 * -767670225;
			local118 = local62.anInt5166 * 1272457665;
			local122 = local118 >> 28;
			local128 = local118 >> 14 & 0xFF;
			local132 = local118 & 0xFF;
			@Pc(136) Class595 local136 = client.aClass517_1.method30409();
			@Pc(147) int local147 = (local128 << 6) + local21 - local136.anInt5504 * -424199969;
			@Pc(158) int local158 = (local132 << 6) + local26 - local136.anInt5506 * -1166289421;
			local73.aClass282_1 = local62.aClass282_5;
			local73.aBoolean486 = local62.aBoolean783;
			local73.aByteArray47[0] = aByteArray38[arg1];
			local73.aByte100 = local73.aByte99 = (byte) local122;
			if (client.aClass517_1.method30441().method29665(local147, local158)) {
				local73.aByte99++;
			}
			local73.method21186(local147, local158);
			aClass526Array1[arg1] = null;
			return true;
		} else if (local4 == 1) {
			local21 = arg0.method22189(2);
			local26 = aClass526Array1[arg1].anInt5166 * 1272457665;
			aClass526Array1[arg1].anInt5166 = ((((local26 >> 28) + local21 & 0x3) << 28) + (local26 & 0xFFFFFFF)) * 186312257;
			return false;
		} else {
			@Pc(260) int local260;
			@Pc(267) int local267;
			@Pc(290) int local290;
			if (local4 != 2) {
				local21 = arg0.method22189(20);
				local26 = local21 >> 18 & 0x3;
				local260 = local21 >> 16 & 0x3;
				local267 = local21 >> 8 & 0xFF;
				local290 = local21 & 0xFF;
				local118 = aClass526Array1[arg1].anInt5166 * 1272457665;
				aByteArray38[arg1] = (byte) (local26 - 1);
				assert aByteArray38[arg1] >= 0 && aByteArray38[arg1] <= 3;
				local122 = local260 + (local118 >> 28) & 0x3;
				local128 = (local118 >> 14) + local267 & 0xFF;
				local132 = local118 + local290 & 0xFF;
				Class457.method29479(Class671.method33202(), local26 - 1);
				aClass526Array1[arg1].anInt5166 = (local132 + (local128 << 14) + (local122 << 28)) * 186312257;
				return false;
			}
			local21 = arg0.method22189(5);
			local26 = local21 >> 3 & 0x3;
			local260 = local21 & 0x7;
			local267 = aClass526Array1[arg1].anInt5166 * 1272457665;
			assert aByteArray38[arg1] >= 0 && aByteArray38[arg1] <= 3;
			local290 = local26 + (local267 >> 28) & 0x3;
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
			Class457.method29479(Class671.method33202(), aByteArray38[arg1]);
			aClass526Array1[arg1].anInt5166 = ((local118 << 14) + (local290 << 28) + local122) * 186312257;
			return false;
		}
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "(Lclient!arc;)V", line = 472)
	static final void method17445(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		for (@Pc(1) int local1 = 0; local1 < anInt2401 * -1852482743; local1++) {
			arg0.method22483();
			@Pc(14) int local14 = anIntArray223[local1];
			@Pc(18) Class104_Sub1_Sub1_Sub1_Sub2 local18 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = arg0.method22478();
			if ((local22 & 0x20) != 0) {
				local22 += arg0.method22478() << 8;
			}
			if ((local22 & 0x800) != 0) {
				local22 += arg0.method22478() << 16;
			}
			Class37.method656(arg0, local14, local18, local22);
		}
	}

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "(Lclient!arc;)V", line = 472)
	static final void method17446(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		for (@Pc(1) int local1 = 0; local1 < anInt2401 * -1852482743; local1++) {
			arg0.method22483();
			@Pc(14) int local14 = anIntArray223[local1];
			@Pc(18) Class104_Sub1_Sub1_Sub1_Sub2 local18 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = arg0.method22478();
			if ((local22 & 0x20) != 0) {
				local22 += arg0.method22478() << 8;
			}
			if ((local22 & 0x800) != 0) {
				local22 += arg0.method22478() << 16;
			}
			Class37.method656(arg0, local14, local18, local22);
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(Lclient!arc;)V", line = 472)
	static final void method17447(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		for (@Pc(1) int local1 = 0; local1 < anInt2401 * -1852482743; local1++) {
			arg0.method22483();
			@Pc(14) int local14 = anIntArray223[local1];
			@Pc(18) Class104_Sub1_Sub1_Sub1_Sub2 local18 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = arg0.method22478();
			if ((local22 & 0x20) != 0) {
				local22 += arg0.method22478() << 8;
			}
			if ((local22 & 0x800) != 0) {
				local22 += arg0.method22478() << 16;
			}
			Class37.method656(arg0, local14, local18, local22);
		}
	}

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "(Lclient!arc;)V", line = 472)
	static final void method17448(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		for (@Pc(1) int local1 = 0; local1 < anInt2401 * -1852482743; local1++) {
			arg0.method22483();
			@Pc(14) int local14 = anIntArray223[local1];
			@Pc(18) Class104_Sub1_Sub1_Sub1_Sub2 local18 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = arg0.method22478();
			if ((local22 & 0x20) != 0) {
				local22 += arg0.method22478() << 8;
			}
			if ((local22 & 0x800) != 0) {
				local22 += arg0.method22478() << 16;
			}
			Class37.method656(arg0, local14, local18, local22);
		}
	}

	@OriginalMember(owner = "client!ao", name = "el", descriptor = "(IB)Z", line = 1736)
	static boolean method17449(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 17 || arg0 == 3 || arg0 == 6 || arg0 == 0;
	}

	@OriginalMember(owner = "client!ao", name = "fy", descriptor = "(I)V", line = 2384)
	static void method17450() {
		@Pc(1) int local1 = 0;
		if (Class35_Sub6.aClass77_Sub35_45 != null) {
			local1 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub21_1.method15716();
		}
		@Pc(23) int local23;
		@Pc(34) int local34;
		if (local1 == 2) {
			local23 = Class402.anInt4694 * -166028671 > 800 ? 800 : Class402.anInt4694 * -166028671;
			local34 = client.anInt3365 * 8272787 > 600 ? 600 : client.anInt3365 * 8272787;
			Class149_Sub4.anInt2368 = local23 * 919220057;
			client.anInt3366 = (-166028671 * Class402.anInt4694 - local23) / 2 * -138655283;
			Class19.anInt108 = local34 * 533696347;
			client.anInt3367 = 0;
		} else if (local1 == 1) {
			local23 = Class402.anInt4694 * -166028671 > 1024 ? 1024 : Class402.anInt4694 * -166028671;
			local34 = client.anInt3365 * 8272787 > 768 ? 768 : client.anInt3365 * 8272787;
			Class149_Sub4.anInt2368 = local23 * 919220057;
			client.anInt3366 = (Class402.anInt4694 * -166028671 - local23) / 2 * -138655283;
			Class19.anInt108 = local34 * 533696347;
			client.anInt3367 = 0;
		} else {
			Class149_Sub4.anInt2368 = Class402.anInt4694 * -1855494695;
			client.anInt3366 = 0;
			Class19.anInt108 = client.anInt3365 * -1459402175;
			client.anInt3367 = 0;
		}
	}

	@OriginalMember(owner = "client!ao", name = "bw", descriptor = "(Lclient!yf;I)V", line = 4673)
	static final void method17451(@OriginalArg(0) Class665 arg0) {
		@Pc(14) Class277 local14 = Class155.method23628(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		local14.aClass277Array3 = null;
		local14.aClass277Array4 = null;
		Class461.method29531(local14);
	}

	@OriginalMember(owner = "client!ao", name = "ahj", descriptor = "(Lclient!yf;B)V", line = 10788)
	static final void method17452(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(15) Class77_Sub1_Sub8 local15 = Class136.method13911(local12);
		if (local15 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local15.anInt3006 * 646871815;
		}
	}
}
