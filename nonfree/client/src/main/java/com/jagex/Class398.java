package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public class Class398 implements Interface45 {

	@OriginalMember(owner = "client!mg", name = "aj", descriptor = "I")
	static int anInt4682;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Lclient!er;")
	Class232 aClass232_78 = new Class232(64);

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "Lclient!pw;")
	Class478 aClass478_112;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!pw;)V", line = 12)
	public Class398(@OriginalArg(0) Class478 arg0) {
		this.aClass478_112 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "(I)Lclient!mc;", line = 17)
	@Override
	public Class395 method28447(@OriginalArg(0) int arg0) {
		@Pc(6) Class395 local6 = (Class395) this.aClass232_78.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass478_112.method29725(1, arg0);
		local6 = new Class395();
		local6.anInt4621 = arg0 * 297771901;
		if (local18 != null) {
			local6.method28405(new Class77_Sub39(local18));
		}
		local6.method28414();
		this.aClass232_78.method25844(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "(I)Lclient!mc;", line = 17)
	@Override
	public Class395 method28448(@OriginalArg(0) int arg0) {
		@Pc(6) Class395 local6 = (Class395) this.aClass232_78.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass478_112.method29725(1, arg0);
		local6 = new Class395();
		local6.anInt4621 = arg0 * 297771901;
		if (local18 != null) {
			local6.method28405(new Class77_Sub39(local18));
		}
		local6.method28414();
		this.aClass232_78.method25844(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "(II)Lclient!mc;", line = 17)
	@Override
	public Class395 method28446(@OriginalArg(0) int arg0) {
		@Pc(6) Class395 local6 = (Class395) this.aClass232_78.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass478_112.method29725(1, arg0);
		local6 = new Class395();
		local6.anInt4621 = arg0 * 297771901;
		if (local18 != null) {
			local6.method28405(new Class77_Sub39(local18));
		}
		local6.method28414();
		this.aClass232_78.method25844(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!mg", name = "y", descriptor = "()V", line = 29)
	public void method28449() {
		this.aClass232_78.method25850();
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V", line = 29)
	public void method28450() {
		this.aClass232_78.method25850();
	}

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "(Ljava/lang/CharSequence;I)[B", line = 72)
	public static byte[] method28451(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) byte[] local5 = new byte[local2];
		for (@Pc(7) int local7 = 0; local7 < local2; local7++) {
			@Pc(14) char local14 = arg0.charAt(local7);
			if (local14 > '\u0000' && local14 < '\u0080' || !(local14 < ' ' || local14 > 'ÿ')) {
				local5[local7] = (byte) local14;
			} else if (local14 == '€') {
				local5[local7] = -128;
			} else if (local14 == '‚') {
				local5[local7] = -126;
			} else if (local14 == 'ƒ') {
				local5[local7] = -125;
			} else if (local14 == '„') {
				local5[local7] = -124;
			} else if (local14 == '…') {
				local5[local7] = -123;
			} else if (local14 == '†') {
				local5[local7] = -122;
			} else if (local14 == '‡') {
				local5[local7] = -121;
			} else if (local14 == 'ˆ') {
				local5[local7] = -120;
			} else if (local14 == '‰') {
				local5[local7] = -119;
			} else if (local14 == 'Š') {
				local5[local7] = -118;
			} else if (local14 == '‹') {
				local5[local7] = -117;
			} else if (local14 == 'Œ') {
				local5[local7] = -116;
			} else if (local14 == 'Ž') {
				local5[local7] = -114;
			} else if (local14 == '‘') {
				local5[local7] = -111;
			} else if (local14 == '’') {
				local5[local7] = -110;
			} else if (local14 == '“') {
				local5[local7] = -109;
			} else if (local14 == '”') {
				local5[local7] = -108;
			} else if (local14 == '•') {
				local5[local7] = -107;
			} else if (local14 == '–') {
				local5[local7] = -106;
			} else if (local14 == '—') {
				local5[local7] = -105;
			} else if (local14 == '˜') {
				local5[local7] = -104;
			} else if (local14 == '™') {
				local5[local7] = -103;
			} else if (local14 == 'š') {
				local5[local7] = -102;
			} else if (local14 == '›') {
				local5[local7] = -101;
			} else if (local14 == 'œ') {
				local5[local7] = -100;
			} else if (local14 == 'ž') {
				local5[local7] = -98;
			} else if (local14 == 'Ÿ') {
				local5[local7] = -97;
			} else {
				local5[local7] = 63;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;", line = 221)
	public static String[] method28452(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(4) int local4 = Class408.method28556(arg0, arg1);
		@Pc(9) String[] local9 = new String[local4 + 1];
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local4; local15++) {
			@Pc(20) int local20;
			for (local20 = local13; arg0.charAt(local20) != arg1; local20++) {
			}
			local9[local11++] = arg0.substring(local13, local20);
			local13 = local20 + 1;
		}
		local9[local4] = arg0.substring(local13);
		return local9;
	}

	@OriginalMember(owner = "client!mg", name = "bt", descriptor = "(Lclient!gm;II)Ljava/lang/String;", line = 1593)
	static String method28453(@OriginalArg(0) Class277 arg0, @OriginalArg(1) int arg1) {
		if (!client.method25376(arg0).method13646(arg1) && arg0.anObjectArray40 == null) {
			return null;
		} else if (arg0.aStringArray25 == null || arg0.aStringArray25.length <= arg1 || arg0.aStringArray25[arg1] == null || arg0.aStringArray25[arg1].trim().length() == 0) {
			return client.aBoolean600 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray25[arg1];
		}
	}

	@OriginalMember(owner = "client!mg", name = "ami", descriptor = "(Lclient!yf;I)V", line = 11772)
	static final void method28454(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(24) float local24 = Class436.method28911(arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1]);
		@Pc(29) Class77_Sub1_Sub12 local29 = Class597.aClass107_Sub1_2.method8856(local13);
		if (local29 == null) {
			throw new RuntimeException("");
		} else if (local29 instanceof Class77_Sub1_Sub12_Sub1) {
			((Class77_Sub1_Sub12_Sub1) local29).method22987(local24);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!mg", name = "aqw", descriptor = "(Lclient!yf;B)V", line = 12411)
	static final void method28455(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class94_Sub1.method6563();
	}
}
