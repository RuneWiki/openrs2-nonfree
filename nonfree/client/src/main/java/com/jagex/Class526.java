package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public class Class526 {

	@OriginalMember(owner = "client!s", name = "y", descriptor = "Z")
	boolean aBoolean783;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	int anInt5164;

	@OriginalMember(owner = "client!s", name = "v", descriptor = "I")
	int anInt5165;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "I")
	int anInt5166;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!gr;")
	Class282 aClass282_5 = Class282.aClass282_4;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 12)
	Class526() {
	}

	@OriginalMember(owner = "client!s", name = "p", descriptor = "([BIII)I", line = 45)
	static int method30674(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = arg1; local3 < arg2; local3++) {
			local1 = local1 >>> 8 ^ Class77_Sub39.anIntArray286[(local1 ^ arg0[local3]) & 0xFF];
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!s", name = "p", descriptor = "(Lclient!pw;Lclient!dp;Lclient!eo;B)V", line = 52)
	public static void method30675(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Interface24 arg2) {
		Class466.aClass478_124 = arg0;
		Class192.aClass209_10 = arg1;
		Class108.anInterface24_11 = arg2;
	}

	@OriginalMember(owner = "client!s", name = "t", descriptor = "(Ljava/lang/CharSequence;IZI)I", line = 84)
	static int method30676(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(57) int local57;
			if (local35 >= '0' && local35 <= '9') {
				local57 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local57 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local57 = local35 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local57 >= arg1) {
				throw new NumberFormatException();
			}
			if (local19) {
				local57 = -local57;
			}
			@Pc(96) int local96 = local57 + arg1 * local23;
			if (local23 != local96 / arg1) {
				throw new NumberFormatException();
			}
			local23 = local96;
			local21 = true;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!s", name = "ge", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5676)
	static final void method30677(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aBoolean665 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] == 1;
		Class461.method29531(arg0);
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Exception_Sub1.method17634(arg0.anInt3863 * -1278450723);
		}
	}

	@OriginalMember(owner = "client!s", name = "yc", descriptor = "(Lclient!yf;B)V", line = 8926)
	static final void method30678(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		if (local13.startsWith(Class152.method17433(0)) || local13.startsWith(Class152.method17433(1))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class38.method669(local13) ? 1 : 0;
	}

	@OriginalMember(owner = "client!s", name = "aak", descriptor = "(Lclient!yf;S)V", line = 9213)
	static final void method30679(@OriginalArg(0) Class665 arg0) {
		if (Class22.aClass368_1 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
			arg0.aClass368_3 = Class22.aClass368_1;
			arg0.aMap22.put(Class127.aClass127_71, Class92.method23490(arg0.aClass368_3));
		}
	}
}
