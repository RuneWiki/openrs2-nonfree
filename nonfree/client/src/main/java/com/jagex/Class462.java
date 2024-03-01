package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public class Class462 {

	@OriginalMember(owner = "client!sp", name = "bi", descriptor = "Lclient!yx;")
	static Class611 aClass611_11;

	@OriginalMember(owner = "client!sp", name = "fe", descriptor = "Lclient!ny;")
	public static Class359 aClass359_82;

	@OriginalMember(owner = "client!sp", name = "tx", descriptor = "I")
	static int anInt5068;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "J")
	long aLong276;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "[I")
	int[] anIntArray461;

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "[S")
	short[] aShortArray114;

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "[S")
	short[] aShortArray115;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(J[I[S[S)V", line = 9)
	public Class462(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aLong276 = arg0 * 369006148481089979L;
		this.anIntArray461 = arg1;
		this.aShortArray114 = arg2;
		this.aShortArray115 = arg3;
	}

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "(Ljava/lang/CharSequence;IZI)Z", line = 47)
	static boolean method28603(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
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
			@Pc(56) int local56;
			if (local35 >= '0' && local35 <= '9') {
				local56 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local56 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local56 = local35 - 'W';
			} else {
				return false;
			}
			if (local56 >= arg1) {
				return false;
			}
			if (local19) {
				local56 = -local56;
			}
			@Pc(91) int local91 = arg1 * local23 + local56;
			if (local91 / arg1 != local23) {
				return false;
			}
			local23 = local91;
			local21 = true;
		}
		return local21;
	}

	@OriginalMember(owner = "client!sp", name = "kv", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5946)
	static final void method28601(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 -= 624249098;
		@Pc(7) byte local7 = 10;
		@Pc(21) byte[] local21 = new byte[] { (byte) arg2.anIntArray496[arg2.anInt5319 * 960738381] };
		@Pc(37) byte[] local37 = new byte[] { (byte) arg2.anIntArray496[arg2.anInt5319 * 960738381 + 1] };
		Class370.method27078(arg0, local7, local21, local37, arg2);
	}

	@OriginalMember(owner = "client!sp", name = "kd", descriptor = "(Lclient!vs;I)V", line = 6043)
	static final void method28599(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		Class445.method28340(local11, arg0);
	}

	@OriginalMember(owner = "client!sp", name = "lo", descriptor = "(B)V", line = 11396)
	public static final void method28600() {
		@Pc(2) Class82 local2 = Class406.method27657();
		@Pc(8) Class3_Sub23 local8 = Class269.method25284(Class311.aClass311_61, local2.aClass577_2);
		local8.aClass3_Sub41_Sub1_1.method20250(0);
		local2.method21601(local8);
	}

	@OriginalMember(owner = "client!sp", name = "aul", descriptor = "(Lclient!vs;I)V", line = 12501)
	static final void method28602(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass26_Sub1_Sub1_Sub1_4.anInt2366 * 1245863;
	}
}
