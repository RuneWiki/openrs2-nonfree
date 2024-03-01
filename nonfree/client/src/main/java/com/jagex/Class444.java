package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public class Class444 implements Interface47 {

	@OriginalMember(owner = "client!no", name = "up", descriptor = "I")
	public static int anInt4895;

	@OriginalMember(owner = "client!no", name = "n", descriptor = "Lclient!eb;")
	Class240 aClass240_83 = new Class240(64);

	@OriginalMember(owner = "client!no", name = "e", descriptor = "Lclient!py;")
	Class497 aClass497_116;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!py;)V", line = 12)
	public Class444(@OriginalArg(0) Class497 arg0) {
		this.aClass497_116 = arg0;
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(II)Lclient!na;", line = 17)
	@Override
	public Class431 method28875(@OriginalArg(0) int arg0) {
		@Pc(6) Class431 local6 = (Class431) this.aClass240_83.method25839((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass497_116.method30044(1, arg0);
		local6 = new Class431();
		local6.anInt4791 = arg0 * 402822681;
		if (local18 != null) {
			local6.method28767(new Class93_Sub41(local18));
		}
		local6.method28769();
		this.aClass240_83.method25830(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!no", name = "m", descriptor = "(I)Lclient!na;", line = 17)
	@Override
	public Class431 method28876(@OriginalArg(0) int arg0) {
		@Pc(6) Class431 local6 = (Class431) this.aClass240_83.method25839((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass497_116.method30044(1, arg0);
		local6 = new Class431();
		local6.anInt4791 = arg0 * 402822681;
		if (local18 != null) {
			local6.method28767(new Class93_Sub41(local18));
		}
		local6.method28769();
		this.aClass240_83.method25830(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!no", name = "k", descriptor = "(I)Lclient!na;", line = 17)
	@Override
	public Class431 method28877(@OriginalArg(0) int arg0) {
		@Pc(6) Class431 local6 = (Class431) this.aClass240_83.method25839((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass497_116.method30044(1, arg0);
		local6 = new Class431();
		local6.anInt4791 = arg0 * 402822681;
		if (local18 != null) {
			local6.method28767(new Class93_Sub41(local18));
		}
		local6.method28769();
		this.aClass240_83.method25830(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!no", name = "n", descriptor = "(I)V", line = 29)
	public void method28878() {
		this.aClass240_83.method25833();
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "()V", line = 29)
	public void method28879() {
		this.aClass240_83.method25833();
	}

	@OriginalMember(owner = "client!no", name = "w", descriptor = "()V", line = 29)
	public void method28880() {
		this.aClass240_83.method25833();
	}

	@OriginalMember(owner = "client!no", name = "w", descriptor = "(Ljava/lang/CharSequence;II[BII)I", line = 128)
	public static int method28883(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 - arg1;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(14) char local14 = arg0.charAt(local5 + arg1);
			if (local14 > 0 && local14 < 128 || !(local14 < 160 || local14 > 255)) {
				arg3[arg4 + local5] = (byte) local14;
			} else if (local14 == 8364) {
				arg3[local5 + arg4] = -128;
			} else if (local14 == 8218) {
				arg3[arg4 + local5] = -126;
			} else if (local14 == 402) {
				arg3[local5 + arg4] = -125;
			} else if (local14 == 8222) {
				arg3[arg4 + local5] = -124;
			} else if (local14 == 8230) {
				arg3[arg4 + local5] = -123;
			} else if (local14 == 8224) {
				arg3[arg4 + local5] = -122;
			} else if (local14 == 8225) {
				arg3[local5 + arg4] = -121;
			} else if (local14 == 710) {
				arg3[arg4 + local5] = -120;
			} else if (local14 == 8240) {
				arg3[local5 + arg4] = -119;
			} else if (local14 == 352) {
				arg3[local5 + arg4] = -118;
			} else if (local14 == 8249) {
				arg3[local5 + arg4] = -117;
			} else if (local14 == 338) {
				arg3[arg4 + local5] = -116;
			} else if (local14 == 381) {
				arg3[local5 + arg4] = -114;
			} else if (local14 == 8216) {
				arg3[local5 + arg4] = -111;
			} else if (local14 == 8217) {
				arg3[arg4 + local5] = -110;
			} else if (local14 == 8220) {
				arg3[local5 + arg4] = -109;
			} else if (local14 == 8221) {
				arg3[local5 + arg4] = -108;
			} else if (local14 == 8226) {
				arg3[local5 + arg4] = -107;
			} else if (local14 == 8211) {
				arg3[local5 + arg4] = -106;
			} else if (local14 == 8212) {
				arg3[arg4 + local5] = -105;
			} else if (local14 == 732) {
				arg3[arg4 + local5] = -104;
			} else if (local14 == 8482) {
				arg3[arg4 + local5] = -103;
			} else if (local14 == 353) {
				arg3[local5 + arg4] = -102;
			} else if (local14 == 8250) {
				arg3[local5 + arg4] = -101;
			} else if (local14 == 339) {
				arg3[local5 + arg4] = -100;
			} else if (local14 == 382) {
				arg3[arg4 + local5] = -98;
			} else if (local14 == 376) {
				arg3[local5 + arg4] = -97;
			} else {
				arg3[arg4 + local5] = 63;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!no", name = "aj", descriptor = "(Lclient!yf;ZZB)V", line = 5021)
	static final void method28881(@OriginalArg(0) Class681 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(7) int local7 = arg0.anIntArray520[arg0.anInt5889 * -709694321];
		@Pc(20) int local20 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (local20 < 0 || local20 >= arg0.anIntArray518[local7]) {
			throw new RuntimeException();
		} else if (!arg1) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.anIntArrayArray67[local7][local20];
		} else if (arg2) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.anIntArrayArray67[local7][local20];
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local20;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local20;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.anIntArrayArray67[local7][local20];
		}
	}

	@OriginalMember(owner = "client!no", name = "ags", descriptor = "(Lclient!yf;B)V", line = 10727)
	static final void method28888(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class47 local18 = (Class47) Class277.aClass32_Sub12_1.method18261(local12);
		if (local18.anInt175 * 858499729 == -1 && local18.anInt174 * -391282687 >= 0) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.anInt174 * -391282687;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local12;
		}
	}

	@OriginalMember(owner = "client!no", name = "ahd", descriptor = "(Lclient!yf;B)V", line = 10972)
	static final void method28884(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= 1189701933;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(17) Class93_Sub1_Sub15 local17 = Class220.method25541(local13);
		if (local17 != null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local17.anInt3087 * 812782679;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = Class123_Sub1.method9095(local17.aLong190 * -9166377137725744335L, Class106.aClass717_8.anInt5963 * -1156137245);
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local17.anInt3088 * 933094649;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local17.aString109 == null ? "" : local17.aString109;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local17.aString110 == null ? "" : local17.aString110;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local17.aString111 == null ? "" : local17.aString111;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local17.aString108 == null ? "" : local17.aString108;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local17.anInt3089 * -92607533;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local17.aString112 == null ? "" : local17.aString112;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local17.aClass443_1 == null ? -1 : local17.aClass443_1.method36920();
			return;
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!no", name = "asa", descriptor = "(Lclient!yf;I)V", line = 13050)
	static final void method28886(@OriginalArg(0) Class681 arg0) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub19_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1 ? 1 : 0);
		Class610.method32021();
		client.aClass532_1.method30532().method33003();
		Class106_Sub1.method5148();
		client.aBoolean601 = false;
	}

	@OriginalMember(owner = "client!no", name = "bav", descriptor = "(Lclient!yf;S)V", line = 14241)
	static final void method28885(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!no", name = "bas", descriptor = "(Lclient!yf;B)V", line = 14284)
	static final void method28882(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub6_1.method16543(local12);
	}

	@OriginalMember(owner = "client!no", name = "bcn", descriptor = "(Lclient!yf;I)V", line = 14646)
	static final void method28887(@OriginalArg(0) Class681 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < Class569.aClass143_Sub1Array2.length; local5++) {
			if (Class569.aClass143_Sub1Array2[local5] != null && Class569.aClass143_Sub1Array2[local5].method11085()) {
				local1 += Class569.aClass143_Sub1Array2[local5].method11074();
				local3 += Class569.aClass143_Sub1Array2[local5].method11076();
			}
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local1 == 0 ? 0 : local3 * 100 / local1;
	}
}
