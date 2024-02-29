package com.jagex;

import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
final class Class483 implements Interface10 {

	@OriginalMember(owner = "client!qc", name = "vz", descriptor = "Ljava/util/List;")
	public static List aList20;

	@OriginalMember(owner = "client!qc", name = "bt", descriptor = "Ljava/lang/String;")
	public static String aString219;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 15)
	@Override
	public Object method30208(@OriginalArg(0) Class77_Sub39 arg0) {
		return arg0.method22500();
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 15)
	@Override
	public Object method30210(@OriginalArg(0) Class77_Sub39 arg0) {
		return arg0.method22500();
	}

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "(Lclient!akv;I)Ljava/lang/Object;", line = 15)
	@Override
	public Object method30209(@OriginalArg(0) Class77_Sub39 arg0) {
		return arg0.method22500();
	}

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 15)
	@Override
	public Object method30211(@OriginalArg(0) Class77_Sub39 arg0) {
		return arg0.method22500();
	}

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "([BIIB)Ljava/lang/String;", line = 42)
	public static String method29836(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) char[] local2 = new char[arg2];
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = arg1;
		@Pc(10) int local10 = arg1 + arg2;
		while (local6 < local10) {
			@Pc(20) int local20 = arg0[local6++] & 0xFF;
			@Pc(28) int local28;
			if (local20 < 128) {
				if (local20 == 0) {
					local28 = 65533;
				} else {
					local28 = local20;
				}
			} else if (local20 < 192) {
				local28 = 65533;
			} else if (local20 < 224) {
				if (local6 < local10 && (arg0[local6] & 0xC0) == 128) {
					local28 = (local20 & 0x1F) << 6 | arg0[local6++] & 0x3F;
					if (local28 < 128) {
						local28 = 65533;
					}
				} else {
					local28 = 65533;
				}
			} else if (local20 < 240) {
				if (local6 + 1 < local10 && (arg0[local6] & 0xC0) == 128 && (arg0[local6 + 1] & 0xC0) == 128) {
					local28 = (local20 & 0xF) << 12 | (arg0[local6++] & 0x3F) << 6 | arg0[local6++] & 0x3F;
					if (local28 < 2048) {
						local28 = 65533;
					}
				} else {
					local28 = 65533;
				}
			} else if (local20 >= 248) {
				local28 = 65533;
			} else if (local6 + 2 < local10 && (arg0[local6] & 0xC0) == 128 && (arg0[local6 + 1] & 0xC0) == 128 && (arg0[local6 + 2] & 0xC0) == 128) {
				local28 = (local20 & 0x7) << 18 | (arg0[local6++] & 0x3F) << 12 | (arg0[local6++] & 0x3F) << 6 | arg0[local6++] & 0x3F;
				if (local28 >= 65536 && local28 <= 1114111) {
					local28 = 65533;
				} else {
					local28 = 65533;
				}
			} else {
				local28 = 65533;
			}
			local2[local4++] = (char) local28;
		}
		return new String(local2, 0, local4);
	}

	@OriginalMember(owner = "client!qc", name = "ag", descriptor = "(Lclient!dx;J)V", line = 408)
	public static void method29837(@OriginalArg(0) Class86 arg0, @OriginalArg(1) long arg1) {
		arg0.method20077();
		Class574.aLinkedList6.clear();
		Class574.aLinkedList7.clear();
		Class574.aLong289 = ((long) (Class574.anInt5400 * 1895832897) + arg1) * -6716390560235218895L;
	}

	@OriginalMember(owner = "client!qc", name = "um", descriptor = "(Lclient!yf;B)V", line = 8328)
	static final void method29838(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(17) Class77_Sub1_Sub2 local17 = (Class77_Sub1_Sub2) Class248.aClass35_Sub19_1.method18319(arg0.anIntArray536[arg0.anInt5784 * 2088438307]);
		@Pc(27) int local27 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(29) int local29 = -1;
		for (@Pc(31) int local31 = 0; local31 < local17.anInt266 * 440511809; local31++) {
			if (local27 == local17.anIntArray21[local31]) {
				local29 = local17.anIntArray20[local31];
				break;
			}
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local29;
	}
}
