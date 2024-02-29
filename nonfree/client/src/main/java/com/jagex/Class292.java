package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public class Class292 {

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	static final int anInt4006 = 4;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
	static final int anInt4007 = 256;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
	static final int anInt4008 = 2;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Ljava/lang/String;")
	String aString182;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "[Lclient!hf;")
	Class297[] aClass297Array1;

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "[Lclient!hf;")
	Class297[] aClass297Array2;

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "[Lclient!hq;")
	Class307[] aClass307Array1;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([B)V", line = 13)
	public Class292(@OriginalArg(0) byte[] arg0) throws Exception_Sub5 {
		this.method27008(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "([BB)V", line = 18)
	void method27008(@OriginalArg(0) byte[] arg0) throws Exception_Sub5 {
		@Pc(4) Class294 local4 = new Class294(arg0);
		@Pc(8) int local8 = local4.method27023();
		if (local8 != 4) {
			throw new Exception_Sub5(this, local8, 4);
		}
		this.aString182 = local4.method27025();
		this.aClass297Array1 = new Class297[local4.method27023()];
		this.aClass297Array2 = new Class297[local4.method27023()];
		this.aClass307Array1 = new Class307[local4.method27023()];
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.aClass297Array1.length; local43++) {
			this.aClass297Array1[local43] = new Class297();
			this.aClass297Array1[local43].method27052(local4);
		}
		for (local43 = 0; local43 < this.aClass297Array2.length; local43++) {
			this.aClass297Array2[local43] = new Class297();
			this.aClass297Array2[local43].method27052(local4);
		}
		for (local43 = 0; local43 < this.aClass307Array1.length; local43++) {
			this.aClass307Array1[local43] = new Class307();
			this.aClass307Array1[local43].method27253(local4);
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "([B)V", line = 18)
	void method27009(@OriginalArg(0) byte[] arg0) throws Exception_Sub5 {
		@Pc(4) Class294 local4 = new Class294(arg0);
		@Pc(8) int local8 = local4.method27023();
		if (local8 != 4) {
			throw new Exception_Sub5(this, local8, 4);
		}
		this.aString182 = local4.method27025();
		this.aClass297Array1 = new Class297[local4.method27023()];
		this.aClass297Array2 = new Class297[local4.method27023()];
		this.aClass307Array1 = new Class307[local4.method27023()];
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.aClass297Array1.length; local43++) {
			this.aClass297Array1[local43] = new Class297();
			this.aClass297Array1[local43].method27052(local4);
		}
		for (local43 = 0; local43 < this.aClass297Array2.length; local43++) {
			this.aClass297Array2[local43] = new Class297();
			this.aClass297Array2[local43].method27052(local4);
		}
		for (local43 = 0; local43 < this.aClass307Array1.length; local43++) {
			this.aClass307Array1[local43] = new Class307();
			this.aClass307Array1[local43].method27253(local4);
		}
	}

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "([SILclient!jh;II)I", line = 35)
	public static int method27010(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class342 arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(16) int local16 = arg2.method27779(arg0, local1 + arg1);
			local1 <<= 0x1;
			local1 += local16;
			local3 |= local16 << local5;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "(Lclient!arc;II)V", line = 210)
	static void method27011(@OriginalArg(0) Class77_Sub39_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class595 local3 = client.aClass517_1.method30409();
		@Pc(13) boolean local13 = arg0.method22189(1) == 1;
		if (local13) {
			Class152.anIntArray223[(Class152.anInt2401 += 375555833) * -1852482743 - 1] = arg1;
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
					Class152.aByteArray38[arg1] = Class671.aClass671_5.aByte175;
					local189 = arg0.method22189(2);
					switch(local189) {
						case 0:
							local36.method21182(local171, local176 + 1, Class152.aByteArray38[arg1]);
							break;
						case 1:
							local36.method21182(local171 - 1, local176, Class152.aByteArray38[arg1]);
							break;
						case 2:
							local36.method21182(local171 + 1, local176, Class152.aByteArray38[arg1]);
							break;
						case 3:
							local36.method21182(local171, local176 - 1, Class152.aByteArray38[arg1]);
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
				local36.method21182(local171, local176, Class152.aByteArray38[arg1]);
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
				local36.method21182(local166, local171, Class152.aByteArray38[arg1]);
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
						Class152.aByteArray38[arg1] = (byte) (local171 - 1);
						local36.method21182(local453, local460, Class152.aByteArray38[arg1]);
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
						Class152.aByteArray38[arg1] = (byte) (local166 - 1);
						local36.method21182(local453, local460, Class152.aByteArray38[arg1]);
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
			@Pc(58) Class526 local58 = Class152.aClass526Array1[arg1] = new Class526();
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

	@OriginalMember(owner = "client!ha", name = "vo", descriptor = "(Lclient!yf;I)V", line = 8370)
	static final void method27012(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class55.aClass124_1.method11094(local12);
	}

	@OriginalMember(owner = "client!ha", name = "xp", descriptor = "(Lclient!yf;I)V", line = 8783)
	static final void method27013(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(47) String local47 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		if (local23 == -1) {
			throw new RuntimeException();
		}
		@Pc(60) Class36 local60 = (Class36) Class663.aClass35_Sub21_1.method18319(local23);
		if (local60.aClass498_2.method36479() != local13) {
			throw new RuntimeException();
		} else if (local60.aClass498_1.method36479() == Class498.aClass498_158.method36479()) {
			@Pc(84) int[] local84 = local60.method631(local47);
			if (local33 < 0 || local84 == null || local84.length <= local33) {
				throw new RuntimeException();
			}
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local84[local33];
		} else {
			throw new RuntimeException();
		}
	}
}
