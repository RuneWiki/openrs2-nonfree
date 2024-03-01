package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public class Class281 implements Interface31 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "I")
	public static final int anInt4335 = 1;

	@OriginalMember(owner = "client!km", name = "g", descriptor = "I")
	public static final int anInt4337 = 2;

	@OriginalMember(owner = "client!km", name = "p", descriptor = "I")
	public static final int anInt4341 = 0;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "Lclient!kh;")
	public final Class277 aClass277_13;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "Lclient!kg;")
	public final Class276 aClass276_13;

	@OriginalMember(owner = "client!km", name = "x", descriptor = "I")
	public final int anInt4338;

	@OriginalMember(owner = "client!km", name = "s", descriptor = "I")
	public final int anInt4339;

	@OriginalMember(owner = "client!km", name = "u", descriptor = "I")
	public final int anInt4336;

	@OriginalMember(owner = "client!km", name = "y", descriptor = "I")
	public final int anInt4342;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "I")
	public final int anInt4340;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!kh;Lclient!kg;IIIII)V", line = 17)
	Class281(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass277_13 = arg0;
		this.aClass276_13 = arg1;
		this.anInt4338 = arg2 * -2041597631;
		this.anInt4339 = arg3 * 1498452503;
		this.anInt4336 = arg4 * -1828990705;
		this.anInt4342 = arg5 * -1720960523;
		this.anInt4340 = arg6 * -2139974087;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)Lclient!ke;", line = 39)
	@Override
	public Class274 method25540() {
		return Class274.aClass274_10;
	}

	@OriginalMember(owner = "client!km", name = "g", descriptor = "()Lclient!ke;", line = 39)
	@Override
	public Class274 method25539() {
		return Class274.aClass274_10;
	}

	@OriginalMember(owner = "client!km", name = "h", descriptor = "(Ljava/lang/CharSequence;B)[B", line = 81)
	public static byte[] method25434(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) byte[] local5 = new byte[local2];
		for (@Pc(7) int local7 = 0; local7 < local2; local7++) {
			@Pc(14) char local14 = arg0.charAt(local7);
			if (local14 > 0 && local14 < 128 || !(local14 < 160 || local14 > 255)) {
				local5[local7] = (byte) local14;
			} else if (local14 == 8364) {
				local5[local7] = -128;
			} else if (local14 == 8218) {
				local5[local7] = -126;
			} else if (local14 == 402) {
				local5[local7] = -125;
			} else if (local14 == 8222) {
				local5[local7] = -124;
			} else if (local14 == 8230) {
				local5[local7] = -123;
			} else if (local14 == 8224) {
				local5[local7] = -122;
			} else if (local14 == 8225) {
				local5[local7] = -121;
			} else if (local14 == 710) {
				local5[local7] = -120;
			} else if (local14 == 8240) {
				local5[local7] = -119;
			} else if (local14 == 352) {
				local5[local7] = -118;
			} else if (local14 == 8249) {
				local5[local7] = -117;
			} else if (local14 == 338) {
				local5[local7] = -116;
			} else if (local14 == 381) {
				local5[local7] = -114;
			} else if (local14 == 8216) {
				local5[local7] = -111;
			} else if (local14 == 8217) {
				local5[local7] = -110;
			} else if (local14 == 8220) {
				local5[local7] = -109;
			} else if (local14 == 8221) {
				local5[local7] = -108;
			} else if (local14 == 8226) {
				local5[local7] = -107;
			} else if (local14 == 8211) {
				local5[local7] = -106;
			} else if (local14 == 8212) {
				local5[local7] = -105;
			} else if (local14 == 732) {
				local5[local7] = -104;
			} else if (local14 == 8482) {
				local5[local7] = -103;
			} else if (local14 == 353) {
				local5[local7] = -102;
			} else if (local14 == 8250) {
				local5[local7] = -101;
			} else if (local14 == 339) {
				local5[local7] = -100;
			} else if (local14 == 382) {
				local5[local7] = -98;
			} else if (local14 == 376) {
				local5[local7] = -97;
			} else {
				local5[local7] = 63;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!km", name = "av", descriptor = "(Lclient!vs;I)V", line = 4050)
	static final void method25436(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray41[arg0.anIntArray497[arg0.anInt5318 * -2140198955]] = arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
	}

	@OriginalMember(owner = "client!km", name = "bt", descriptor = "(Lclient!vs;I)V", line = 4204)
	static final void method25431(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		if (local8.aClass178_18.anInt3491 * 18828465 != -1) {
			@Pc(32) Class178 local32 = local8.method32511();
			local32.aClass178Array5[local8.aClass178_18.anInt3491 * 18828465] = null;
			Class223.method24442(local32);
		} else if (arg0.aBoolean822) {
			throw new RuntimeException("");
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!km", name = "wk", descriptor = "(Lclient!vs;B)V", line = 8101)
	static final void method25435(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aBoolean596 ? 1 : 0;
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = client.aString152 == null ? "" : client.aString152;
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = client.aString153 == null ? "" : client.aString153;
	}

	@OriginalMember(owner = "client!km", name = "anp", descriptor = "(Lclient!vs;I)V", line = 11511)
	static final void method25433(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!km", name = "arg", descriptor = "(Lclient!vs;I)V", line = 12133)
	static final void method25432(@OriginalArg(0) Class536 arg0) {
		@Pc(1) String local1 = null;
		if (Class128.aClass140_1 != null) {
			local1 = Class128.aClass140_1.method23015();
		}
		if (local1 == null) {
			local1 = "";
		}
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local1;
	}
}
