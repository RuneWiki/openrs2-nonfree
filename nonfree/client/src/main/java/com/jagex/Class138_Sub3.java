package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aip")
final class Class138_Sub3 extends Class138 {

	@OriginalMember(owner = "client!aip", name = "x", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!aip", name = "e", descriptor = "(CI)B", line = 12)
	public static byte method11406(@OriginalArg(0) char arg0) {
		@Pc(13) byte local13;
		if (arg0 > 0 && arg0 < 128 || !(arg0 < 160 || arg0 > 255)) {
			local13 = (byte) arg0;
		} else if (arg0 == 8364) {
			local13 = -128;
		} else if (arg0 == 8218) {
			local13 = -126;
		} else if (arg0 == 402) {
			local13 = -125;
		} else if (arg0 == 8222) {
			local13 = -124;
		} else if (arg0 == 8230) {
			local13 = -123;
		} else if (arg0 == 8224) {
			local13 = -122;
		} else if (arg0 == 8225) {
			local13 = -121;
		} else if (arg0 == 710) {
			local13 = -120;
		} else if (arg0 == 8240) {
			local13 = -119;
		} else if (arg0 == 352) {
			local13 = -118;
		} else if (arg0 == 8249) {
			local13 = -117;
		} else if (arg0 == 338) {
			local13 = -116;
		} else if (arg0 == 381) {
			local13 = -114;
		} else if (arg0 == 8216) {
			local13 = -111;
		} else if (arg0 == 8217) {
			local13 = -110;
		} else if (arg0 == 8220) {
			local13 = -109;
		} else if (arg0 == 8221) {
			local13 = -108;
		} else if (arg0 == 8226) {
			local13 = -107;
		} else if (arg0 == 8211) {
			local13 = -106;
		} else if (arg0 == 8212) {
			local13 = -105;
		} else if (arg0 == 732) {
			local13 = -104;
		} else if (arg0 == 8482) {
			local13 = -103;
		} else if (arg0 == 353) {
			local13 = -102;
		} else if (arg0 == 8250) {
			local13 = -101;
		} else if (arg0 == 339) {
			local13 = -100;
		} else if (arg0 == 382) {
			local13 = -98;
		} else if (arg0 == 376) {
			local13 = -97;
		} else {
			local13 = 63;
		}
		return local13;
	}

	@OriginalMember(owner = "client!aip", name = "<init>", descriptor = "(Lclient!xq;IZZ)V", line = 41)
	Class138_Sub3(@OriginalArg(0) Class667 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class138_Sub1) null);
	}

	@OriginalMember(owner = "client!aip", name = "w", descriptor = "(Lclient!ec;I)Ljava/lang/Object;", line = 43)
	@Override
	Object method11522(@OriginalArg(0) Class108 arg0) {
		return arg0.aClass519_6 == Class519.aClass519_8 ? -1 : arg0.aClass519_6.method30317();
	}

	@OriginalMember(owner = "client!aip", name = "u", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 43)
	@Override
	Object method11523(@OriginalArg(0) Class108 arg0) {
		return arg0.aClass519_6 == Class519.aClass519_8 ? -1 : arg0.aClass519_6.method30317();
	}

	@OriginalMember(owner = "client!aip", name = "l", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 43)
	@Override
	Object method11524(@OriginalArg(0) Class108 arg0) {
		return arg0.aClass519_6 == Class519.aClass519_8 ? -1 : arg0.aClass519_6.method30317();
	}
}
