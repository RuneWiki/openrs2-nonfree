package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public class Class318 implements Interface61 {

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_57;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "Ljava/lang/String;")
	final String aString204;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!ny;Ljava/lang/String;)V", line = 11)
	Class318(@OriginalArg(0) Class359 arg0, @OriginalArg(1) String arg1) {
		this.aClass359_57 = arg0;
		this.aString204 = arg1;
	}

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "()I", line = 17)
	@Override
	public int method26158() {
		return this.aClass359_57.method26712(this.aString204) ? 100 : 0;
	}

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "(I)I", line = 17)
	@Override
	public int method26162() {
		return this.aClass359_57.method26712(this.aString204) ? 100 : 0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(S)Lclient!yn;", line = 22)
	@Override
	public Class604 method26159() {
		return Class604.aClass604_2;
	}

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "()Lclient!yn;", line = 22)
	@Override
	public Class604 method26161() {
		return Class604.aClass604_2;
	}

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "()Lclient!yn;", line = 22)
	@Override
	public Class604 method26160() {
		return Class604.aClass604_2;
	}

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I", line = 161)
	public static int method25854(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		if (local2 == 0) {
			return local5;
		} else if (local5 == 0) {
			return local2;
		} else {
			@Pc(19) int[] local19 = new int[local2 + 1];
			@Pc(24) int[] local24 = new int[local2 + 1];
			@Pc(26) int local26 = 0;
			while (local26 <= local2) {
				local19[local26] = local26++;
			}
			for (local26 = 1; local26 <= local5; local26++) {
				local24[0] = local26;
				@Pc(50) char local50 = arg1.charAt(local26 - 1);
				for (@Pc(52) int local52 = 1; local52 <= local2; local52++) {
					local24[local52] = Math.min(Math.min(local24[local52 - 1] + 1, local19[local52] + 1), local19[local52 - 1] + (arg0.charAt(local52 - 1) == local50 ? 0 : 1));
				}
				@Pc(92) int[] local92 = local19;
				local19 = local24;
				local24 = local92;
			}
			return local19[local2];
		}
	}

	@OriginalMember(owner = "client!mf", name = "bb", descriptor = "(IB)Z", line = 1440)
	static boolean method25857(@OriginalArg(0) int arg0) {
		return arg0 == 44 || arg0 == 45 || arg0 == 46 || arg0 == 47 || arg0 == 48 || arg0 == 49 || arg0 == 50 || arg0 == 51 || arg0 == 52 || arg0 == 53 || arg0 == 15;
	}

	@OriginalMember(owner = "client!mf", name = "eo", descriptor = "(II)Z", line = 1690)
	public static boolean method25855(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 19 || arg0 == 15 || arg0 == 16 || arg0 == 4 || arg0 == 1;
	}

	@OriginalMember(owner = "client!mf", name = "aqi", descriptor = "(Lclient!vs;B)V", line = 11857)
	static final void method25856(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class63_Sub1 local16 = Class200.method24148(local12);
		if (local16 != null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt1515 * -1021417267;
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local16.aString51;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.method13057();
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local16.method13053();
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt1512 * -191487467;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt1520 * -39887861;
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local16.aString52;
			return;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
	}
}
