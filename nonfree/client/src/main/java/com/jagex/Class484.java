package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public class Class484 {

	@OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
	public static final int anInt5162 = 4;

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
	public static final int anInt5163 = 2;

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
	public static final int anInt5164 = 3;

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
	public static final int anInt5165 = 0;

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
	public static final int anInt5166 = 1;

	@OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
	public static final int anInt5167 = 2;

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
	public static final int anInt5168 = 3;

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
	static final int anInt5169 = 3;

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
	static final int anInt5171 = 100;

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
	public static final int anInt5173 = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
	public static final int anInt5178 = 1;

	@OriginalMember(owner = "client!tl", name = "pc", descriptor = "I")
	static int anInt5179;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
	public int anInt5161;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
	public int anInt5170;

	@OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
	public int anInt5172;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
	public int anInt5174;

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
	public int anInt5175;

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
	public int anInt5176;

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
	public int anInt5177;

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray58 = new int[3][4];

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(Lclient!ahb;I)Lclient!kv;", line = 14)
	public static Class44 method29111(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(4) Class44_Sub2 local4 = (Class44_Sub2) Class14_Sub1.method1411(arg0);
		@Pc(8) int local8 = arg0.method20272();
		return new Class44_Sub2_Sub1(local4.aClass277_8, local4.aClass276_7, local4.anInt2200 * 55371565, local4.anInt2195 * 2009354057, local4.anInt2198 * 338285097, local4.anInt2199 * -1628722519, local4.anInt2196 * -1540009787, local4.anInt2197 * 1924731995, local4.anInt2201 * 328557495, local4.anInt2206 * 1521274851, local4.anInt2204 * -414002189, local4.anInt2208 * 1160134893, local4.anInt2207 * -103928767, local4.anInt2205 * 1650026639, local4.anInt2203 * 1363405685, local8);
	}

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!ny;)V", line = 27)
	public Class484(@OriginalArg(0) Class359 arg0) {
		@Pc(14) byte[] local14 = arg0.method26705(Class474.aClass474_10.anInt5121 * 152686723);
		if (local14 == null) {
		}
		this.method29108(new Class3_Sub41(local14));
	}

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "(Lclient!ahb;I)V", line = 35)
	void method29108(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5172 = arg0.method20275() * 1698477091;
			} else if (local3 == 2) {
				this.anInt5161 = arg0.method20275() * -929236497;
			} else if (local3 == 3) {
				this.anInt5170 = arg0.method20275() * 372752537;
			} else if (local3 == 4) {
				this.anInt5174 = arg0.method20269() * 1506323781;
			} else if (local3 == 5) {
				this.anInt5175 = arg0.method20269() * 976189751;
			} else if (local3 == 6) {
				this.anInt5176 = arg0.method20275() * 26282981;
			} else if (local3 == 7) {
				this.anInt5177 = arg0.method20275() * 540773975;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray58[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method20271();
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "ld", descriptor = "(Ljava/lang/String;Lclient!vs;B)[Ljava/lang/Object;", line = 6114)
	static final Object[] method29109(@OriginalArg(0) String arg0, @OriginalArg(1) Class536 arg1) {
		@Pc(5) Object[] local5 = new Object[arg0.length() + 1];
		@Pc(10) int local10;
		for (local10 = local5.length - 1; local10 >= 1; local10--) {
			if (arg0.charAt(local10 - 1) == 's') {
				local5[local10] = arg1.anObjectArray42[(arg1.anInt5315 -= 790013775) * 996806575];
			} else if (arg0.charAt(local10 - 1) == 167) {
				local5[local10] = Long.valueOf(arg1.aLongArray18[(arg1.anInt5316 -= 2125691367) * 196643287]);
			} else {
				local5[local10] = Integer.valueOf(arg1.anIntArray496[(arg1.anInt5319 -= 312124549) * 960738381]);
			}
		}
		local10 = arg1.anIntArray496[(arg1.anInt5319 -= 312124549) * 960738381];
		if (local10 == -1) {
			local5 = null;
		} else {
			local5[0] = Integer.valueOf(local10);
		}
		return local5;
	}

	@OriginalMember(owner = "client!tl", name = "za", descriptor = "(Lclient!vs;I)V", line = 8693)
	static final void method29110(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass3_Sub30_3.method11623((String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575]);
	}

	@OriginalMember(owner = "client!tl", name = "ait", descriptor = "(Lclient!vs;I)V", line = 10618)
	static final void method29112(@OriginalArg(0) Class536 arg0) {
		Class389.method27407();
	}
}
