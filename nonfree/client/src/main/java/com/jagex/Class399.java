package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public class Class399 {

	@OriginalMember(owner = "client!pw", name = "gx", descriptor = "Lclient!re;")
	public static Class428 aClass428_1;

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
	int anInt4799;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
	int anInt4800;

	@OriginalMember(owner = "client!pw", name = "p", descriptor = "Ljava/lang/String;")
	String aString217;

	@OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
	int anInt4801;

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
	int anInt4802;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)Lclient!kd;", line = 49)
	public static Class273 method27566(@OriginalArg(0) int arg0) {
		@Pc(5) Class273 local5 = (Class273) Class273.aClass161_32.method23219((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(15) byte[] local15 = Class273.aClass359_51.method26713(1, arg0);
		local5 = new Class273();
		local5.anInt4303 = arg0 * 2085218525;
		if (local15 != null) {
			local5.method25337(new Class3_Sub41(local15));
		}
		local5.method25330();
		if (local5.anInt4308 * -1790153647 == 2 && Class273.aClass581_31.method33217((long) arg0) == null) {
			Class273.aClass581_31.method33241(new Class3_Sub21(Class273.anInt4302 * -898241969), (long) arg0);
			Class273.aClass273Array1[(Class273.anInt4302 += -10687313) * -898241969 - 1] = local5;
		}
		Class273.aClass161_32.method23222(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!pw", name = "n", descriptor = "(IB)V", line = 133)
	public static void method27569(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(10, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "()V", line = 713)
	Class399() {
	}

	@OriginalMember(owner = "client!pw", name = "p", descriptor = "(I)Ljava/lang/String;", line = 716)
	public String method27556() {
		return this.aString217;
	}

	@OriginalMember(owner = "client!pw", name = "x", descriptor = "()Ljava/lang/String;", line = 716)
	public String method27559() {
		return this.aString217;
	}

	@OriginalMember(owner = "client!pw", name = "s", descriptor = "()Ljava/lang/String;", line = 716)
	public String method27560() {
		return this.aString217;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)I", line = 720)
	public int method27554() {
		return this.anInt4800 * 514072551;
	}

	@OriginalMember(owner = "client!pw", name = "u", descriptor = "()I", line = 720)
	public int method27561() {
		return this.anInt4800 * 514072551;
	}

	@OriginalMember(owner = "client!pw", name = "y", descriptor = "()I", line = 720)
	public int method27562() {
		return this.anInt4800 * 514072551;
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "()I", line = 724)
	public int method27555() {
		return this.anInt4801 * 751470585;
	}

	@OriginalMember(owner = "client!pw", name = "g", descriptor = "(I)I", line = 724)
	public int method27557() {
		return this.anInt4801 * 751470585;
	}

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "(I)I", line = 728)
	public int method27558() {
		return this.anInt4799 * -502258241;
	}

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "()I", line = 732)
	public int method27563() {
		return this.anInt4802 * 954966213;
	}

	@OriginalMember(owner = "client!pw", name = "z", descriptor = "()I", line = 732)
	public int method27564() {
		return this.anInt4802 * 954966213;
	}

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "(I)I", line = 732)
	public int method27565() {
		return this.anInt4802 * 954966213;
	}

	@OriginalMember(owner = "client!pw", name = "ex", descriptor = "(IIII)I", line = 812)
	public static int method27568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Class58_Sub1.anInt1434 * 1235407417 < 100) {
			return -2;
		}
		@Pc(8) int local8 = -2;
		@Pc(10) int local10 = Integer.MAX_VALUE;
		@Pc(14) int local14 = arg1 - Class58_Sub1.anInt1429;
		@Pc(18) int local18 = arg2 - Class58_Sub1.anInt1406;
		for (@Pc(23) Class3_Sub26 local23 = (Class3_Sub26) Class58_Sub1.aClass553_23.method32768(); local23 != null; local23 = (Class3_Sub26) Class58_Sub1.aClass553_23.method32709()) {
			if (arg0 == local23.anInt1304 * 1865552421) {
				@Pc(38) int local38 = local23.anInt1303 * -582755297;
				@Pc(43) int local43 = local23.anInt1306 * 1667122095;
				@Pc(53) int local53 = Class58_Sub1.anInt1429 + local38 << 14 | Class58_Sub1.anInt1406 + local43;
				@Pc(69) int local69 = (local18 - local43) * (local18 - local43) + (local14 - local38) * (local14 - local38);
				if (local8 < 0 || local69 < local10) {
					local8 = local53;
					local10 = local69;
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!pw", name = "fc", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 5108)
	static final void method27567(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(12) int local12 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381];
		@Pc(26) String local26 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		@Pc(31) Class630 local31 = Class3_Sub20.aClass625_1.method33783(local12);
		if (local31.aString248.equals(local26)) {
			arg0.method23445(local12);
		} else {
			arg0.method23476(local12, local26);
		}
	}
}
