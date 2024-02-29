package com.jagex;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yc")
public class Class662 {

	@OriginalMember(owner = "client!yc", name = "t", descriptor = "I")
	static int anInt5779;

	@OriginalMember(owner = "client!yc", name = "ef", descriptor = "Lclient!tb;")
	public static Class141 aClass141_1;

	@OriginalMember(owner = "client!yc", name = "p", descriptor = "Lclient!gm;")
	Class277 aClass277_12;

	@OriginalMember(owner = "client!yc", name = "c", descriptor = "Lclient!gh;")
	Class273 aClass273_4;

	@OriginalMember(owner = "client!yc", name = "<init>", descriptor = "()V", line = 10)
	Class662() {
	}

	@OriginalMember(owner = "client!yc", name = "y", descriptor = "()Lclient!gm;", line = 13)
	Class277 method33088() {
		return this.aClass273_4.method26538(this.aClass277_12.anInt3863 * -1278450723);
	}

	@OriginalMember(owner = "client!yc", name = "l", descriptor = "()Lclient!gm;", line = 13)
	Class277 method33089() {
		return this.aClass273_4.method26538(this.aClass277_12.anInt3863 * -1278450723);
	}

	@OriginalMember(owner = "client!yc", name = "p", descriptor = "(B)Lclient!gm;", line = 13)
	Class277 method33090() {
		return this.aClass273_4.method26538(this.aClass277_12.anInt3863 * -1278450723);
	}

	@OriginalMember(owner = "client!yc", name = "p", descriptor = "(Ljava/lang/CharSequence;I)J", line = 16)
	static long method33091(@OriginalArg(0) CharSequence arg0) {
		@Pc(1) long local1 = 0L;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			local1 *= 37L;
			@Pc(17) char local17 = arg0.charAt(local6);
			if (local17 >= 'A' && local17 <= 'Z') {
				local1 += local17 + 1 - 65;
			} else if (local17 >= 'a' && local17 <= 'z') {
				local1 += local17 + 1 - 97;
			} else if (local17 >= '0' && local17 <= '9') {
				local1 += local17 + 27 - 48;
			}
			if (local1 >= 177917621779460413L) {
				break;
			}
		}
		while (local1 % 37L == 0L && local1 != 0L) {
			local1 /= 37L;
		}
		return local1;
	}

	@OriginalMember(owner = "client!yc", name = "c", descriptor = "(III)Z", line = 17)
	boolean method33092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class277 local4 = Class60.method884(arg0, arg1);
		if (local4 == null) {
			this.method33096();
			return false;
		} else {
			this.aClass273_4 = Class35_Sub11.aClass273Array1[arg0 >> 16];
			this.aClass277_12 = local4;
			return true;
		}
	}

	@OriginalMember(owner = "client!yc", name = "w", descriptor = "(II)Z", line = 17)
	boolean method33093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class277 local4 = Class60.method884(arg0, arg1);
		if (local4 == null) {
			this.method33096();
			return false;
		} else {
			this.aClass273_4 = Class35_Sub11.aClass273Array1[arg0 >> 16];
			this.aClass277_12 = local4;
			return true;
		}
	}

	@OriginalMember(owner = "client!yc", name = "t", descriptor = "(II)Z", line = 17)
	boolean method33094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class277 local4 = Class60.method884(arg0, arg1);
		if (local4 == null) {
			this.method33096();
			return false;
		} else {
			this.aClass273_4 = Class35_Sub11.aClass273Array1[arg0 >> 16];
			this.aClass277_12 = local4;
			return true;
		}
	}

	@OriginalMember(owner = "client!yc", name = "p", descriptor = "(Lclient!akv;II)[B", line = 20)
	public static byte[] method33095(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.aByteArray53);
		local5.skip((long) (arg0.anInt3089 * 31645619));
		return Class82.method1997(local5, arg1);
	}

	@OriginalMember(owner = "client!yc", name = "v", descriptor = "(I)V", line = 30)
	void method33096() {
		this.aClass273_4 = null;
		this.aClass277_12 = null;
	}

	@OriginalMember(owner = "client!yc", name = "q", descriptor = "()V", line = 30)
	void method33097() {
		this.aClass273_4 = null;
		this.aClass277_12 = null;
	}

	@OriginalMember(owner = "client!yc", name = "x", descriptor = "()V", line = 30)
	void method33098() {
		this.aClass273_4 = null;
		this.aClass277_12 = null;
	}

	@OriginalMember(owner = "client!yc", name = "gp", descriptor = "(B)V", line = 3127)
	static final void method33099() {
		for (@Pc(5) int local5 = Class55.aClass124_1.aClass608_1.method32131(true); local5 != -1; local5 = Class55.aClass124_1.aClass608_1.method32131(false)) {
			Class220.method25732(local5);
			client.anIntArray333[(client.anInt3497 += -650296415) * -11706271 - 1 & 0x3F] = local5;
		}
		for (@Pc(35) Class77_Sub1_Sub6 local35 = Class256.method26215(); local35 != null; local35 = Class256.method26215()) {
			@Pc(42) int local42 = local35.method21548();
			@Pc(46) long local46 = local35.method21551();
			@Pc(56) Class75 local56;
			if (local42 == 1) {
				local56 = (Class75) Class416.aClass80_Sub1_Sub2_4.method18319((int) local46);
				Class56.aClass93_Sub1_1.method35943(local56, local35.anInt2959 * -1479053575);
				client.anIntArray336[(client.anInt3399 += 92818243) * -2145052309 - 1 & 0x3F] = (int) local46;
			} else if (local42 == 2) {
				local56 = (Class75) Class416.aClass80_Sub1_Sub2_4.method18319((int) local46);
				Class56.aClass93_Sub1_1.method35946(local56, local35.aString89);
				client.anIntArray345[(client.anInt3487 += -2053902573) * 600257307 - 1 & 0x3F] = (int) local46;
			} else {
				@Pc(120) Class277 local120;
				if (local42 == 3) {
					local120 = Class155.method23628((int) local46);
					if (!local35.aString89.equals(local120.aString178)) {
						local120.aString178 = local35.aString89;
						Class461.method29531(local120);
					}
				} else if (local42 == 23) {
					local120 = Class155.method23628((int) local46);
					if ((local35.anInt2959 * -1479053575 == 1) != local120.aBoolean679) {
						local120.aBoolean679 = local35.anInt2959 * -1479053575 == 1;
						Class461.method29531(local120);
					}
				} else {
					@Pc(182) int local182;
					@Pc(187) int local187;
					@Pc(192) int local192;
					if (local42 == 4) {
						local120 = Class155.method23628((int) local46);
						local182 = local35.anInt2959 * -1479053575;
						local187 = local35.anInt2953 * 1817172891;
						local192 = local35.anInt2954 * 1418837181;
						if (local182 != local120.anInt3888 * -1866862435 || local120.anInt3889 * 939166901 != local187 || local192 != local120.anInt3919 * 27898029) {
							local120.anInt3888 = local182 * -214166091;
							local120.anInt3889 = local187 * 931070365;
							local120.anInt3919 = local192 * 1933783845;
							local120.aClass328_2 = null;
							Class461.method29531(local120);
						}
					} else if (local42 == 5) {
						local120 = Class155.method23628((int) local46);
						if (local120.anInt3904 * 1565138829 != local35.anInt2959 * -1479053575) {
							if (local35.anInt2959 * -1479053575 == -1) {
								local120.aClass151_6 = null;
							} else {
								if (local120.aClass151_6 == null) {
									local120.aClass151_6 = new Class151_Sub2();
								}
								local120.aClass151_6.method23401(local35.anInt2959 * -1479053575);
							}
							local120.anInt3904 = local35.anInt2959 * 1248087069;
							Class461.method29531(local120);
						}
					} else if (local42 == 6) {
						@Pc(294) int local294 = local35.anInt2959 * -1479053575;
						local182 = local294 >> 10 & 0x1F;
						local187 = local294 >> 5 & 0x1F;
						local192 = local294 & 0x1F;
						@Pc(322) int local322 = (local187 << 11) + (local182 << 19) + (local192 << 3);
						@Pc(327) Class277 local327 = Class155.method23628((int) local46);
						if (local322 != local327.anInt3883 * 290091559) {
							local327.anInt3883 = local322 * -1996628585;
							Class461.method29531(local327);
						}
					} else if (local42 == 7) {
						local120 = Class155.method23628((int) local46);
						@Pc(360) boolean local360 = local35.anInt2959 * -1479053575 == 1;
						if (local120.aBoolean666 != local360) {
							local120.aBoolean666 = local360;
							Class461.method29531(local120);
						}
					} else if (local42 == 8) {
						local120 = Class155.method23628((int) local46);
						if (local35.anInt2959 * -1479053575 != local120.anInt3892 * 1033849275 || local35.anInt2953 * 1817172891 != local120.anInt3893 * -806242263 || local35.anInt2954 * 1418837181 != local120.anInt3896 * -1230478387) {
							local120.anInt3892 = local35.anInt2959 * -1241099045;
							local120.anInt3893 = local35.anInt2953 * 1519648291;
							local120.anInt3896 = local35.anInt2954 * 1517530289;
							if (local120.anInt3936 * 403396513 != -1) {
								if (local120.anInt3931 * -1843491229 > 0) {
									local120.anInt3896 = -720602720 * local120.anInt3896 / (-1843491229 * local120.anInt3931) * -2116337403;
								} else if (local120.anInt3865 * -1855456835 > 0) {
									local120.anInt3896 = local120.anInt3896 * -720602720 / (local120.anInt3865 * -1855456835) * -2116337403;
								}
							}
							Class461.method29531(local120);
						}
					} else if (local42 == 9) {
						local120 = Class155.method23628((int) local46);
						if (local35.anInt2959 * -1479053575 != local120.anInt3936 * 403396513 || local35.anInt2953 * 1817172891 != local120.anInt3934 * -148110895) {
							local120.anInt3936 = local35.anInt2959 * -2017265575;
							local120.anInt3934 = local35.anInt2953 * -501443157;
							Class461.method29531(local120);
						}
					} else if (local42 == 10) {
						local120 = Class155.method23628((int) local46);
						if (local120.anInt3891 * -495767299 != local35.anInt2959 * -1479053575 || local120.anInt3932 * 1797197351 != local35.anInt2953 * 1817172891 || local35.anInt2954 * 1418837181 != local120.anInt3946 * -1513459333) {
							local120.anInt3891 = local35.anInt2959 * 1865868461;
							local120.anInt3932 = local35.anInt2953 * 97297261;
							local120.anInt3946 = local35.anInt2954 * 1239247143;
							Class461.method29531(local120);
						}
					} else if (local42 == 11) {
						local120 = Class155.method23628((int) local46);
						local120.aByte126 = 0;
						local120.anInt3872 = (local120.anInt3868 = local35.anInt2959 * 1378796175) * -1394902803;
						local120.aByte128 = 0;
						local120.anInt3873 = (local120.anInt3869 = local35.anInt2953 * -2129973849) * 1048318347;
						Class461.method29531(local120);
					} else if (local42 == 12) {
						local120 = Class155.method23628((int) local46);
						local182 = local35.anInt2959 * -1479053575;
						if (local120 != null && local120.anInt3857 * -1960530827 == 0) {
							if (local182 > local120.anInt3882 * -166726847 - local120.anInt3875 * -1279656873) {
								local182 = local120.anInt3882 * -166726847 - local120.anInt3875 * -1279656873;
							}
							if (local182 < 0) {
								local182 = 0;
							}
							if (local120.anInt3880 * 2142374941 != local182) {
								local120.anInt3880 = local182 * 170726965;
								Class461.method29531(local120);
							}
						}
					} else if (local42 == 13) {
						local120 = Class155.method23628((int) local46);
						local120.anInt3954 = local35.anInt2959 * -2138999323;
					} else if (local42 == 14) {
						Class156.aBoolean551 = true;
						Class156.anInt3234 = local35.anInt2959 * -408370053;
						Class156.anInt3235 = local35.anInt2953 * 796998229;
					} else if (local42 == 15) {
						local120 = Class155.method23628((int) local46);
						local120.anInt3910 = local35.anInt2959 * -663837393;
					} else if (local42 == 21) {
						local120 = Class155.method23628((int) local46);
						local120.aBoolean673 = local35.anInt2959 * -1479053575 == 1;
					} else if (local42 == 22) {
						local120 = Class155.method23628((int) local46);
						local120.aBoolean665 = local35.anInt2959 * -1479053575 == 1;
					} else if (local42 == 17) {
						local120 = Class155.method23628((int) local46);
						local182 = (int) (local46 >> 32);
						local120.method26655(local182, (short) (local35.anInt2959 * -1479053575), (short) (local35.anInt2953 * 1817172891));
					} else if (local42 == 20) {
						local120 = Class155.method23628((int) local46);
						local182 = (int) (local46 >> 32);
						local120.method26657(local182, (short) (local35.anInt2959 * -1479053575), (short) (local35.anInt2953 * 1817172891));
					}
				}
			}
		}
	}
}
