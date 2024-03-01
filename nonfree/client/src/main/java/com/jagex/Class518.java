package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uz")
public class Class518 {

	@OriginalMember(owner = "client!uz", name = "g", descriptor = "F")
	float aFloat322;

	@OriginalMember(owner = "client!uz", name = "a", descriptor = "F")
	float aFloat323;

	@OriginalMember(owner = "client!uz", name = "x", descriptor = "I")
	int anInt5273;

	@OriginalMember(owner = "client!uz", name = "z", descriptor = "I")
	int anInt5274;

	@OriginalMember(owner = "client!uz", name = "h", descriptor = "Lclient!mh;")
	Class320 aClass320_65;

	@OriginalMember(owner = "client!uz", name = "p", descriptor = "I")
	int anInt5275;

	@OriginalMember(owner = "client!uz", name = "s", descriptor = "I")
	int anInt5276;

	@OriginalMember(owner = "client!uz", name = "u", descriptor = "F")
	float aFloat324;

	@OriginalMember(owner = "client!uz", name = "y", descriptor = "F")
	float aFloat325;

	@OriginalMember(owner = "client!uz", name = "b", descriptor = "F")
	float aFloat326;

	@OriginalMember(owner = "client!uz", name = "c", descriptor = "I")
	int anInt5277;

	@OriginalMember(owner = "client!uz", name = "j", descriptor = "I")
	int anInt5278;

	@OriginalMember(owner = "client!uz", name = "n", descriptor = "I")
	int anInt5279;

	@OriginalMember(owner = "client!uz", name = "e", descriptor = "I")
	int anInt5280;

	@OriginalMember(owner = "client!uz", name = "r", descriptor = "I")
	int anInt5281;

	@OriginalMember(owner = "client!uz", name = "l", descriptor = "F")
	float aFloat327;

	@OriginalMember(owner = "client!uz", name = "m", descriptor = "I")
	int anInt5282;

	@OriginalMember(owner = "client!uz", name = "d", descriptor = "[I")
	int[] anIntArray491 = new int[3];

	@OriginalMember(owner = "client!uz", name = "q", descriptor = "[F")
	float[] aFloatArray114 = new float[3];

	@OriginalMember(owner = "client!uz", name = "<init>", descriptor = "()V", line = 28)
	public Class518() {
		this.method29678();
	}

	@OriginalMember(owner = "client!uz", name = "p", descriptor = "(B)V", line = 33)
	void method29678() {
		this.anInt5275 = 825470943;
		this.aFloat323 = -1.0F;
		this.aFloat322 = -1.0F;
		this.aFloat327 = -1.0F;
		this.aClass320_65 = null;
		this.anInt5273 = -1544999859;
		this.anInt5276 = 1190008837;
		this.aFloat324 = -1.0F;
		this.aFloat325 = -1.0F;
		this.aFloat326 = -1.0F;
		this.anInt5277 = -1513719543;
		this.anInt5274 = -1162659595;
		this.anInt5278 = 365100261;
		this.anInt5279 = -975306545;
		this.anInt5280 = -2130168727;
		this.anInt5281 = 1855213223;
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray491.length; local49++) {
			this.anIntArray491[local49] = -1;
			this.aFloatArray114[local49] = 0.0F;
		}
		this.anInt5282 = -1806433224;
	}

	@OriginalMember(owner = "client!uz", name = "w", descriptor = "()V", line = 33)
	void method29699() {
		this.anInt5275 = 825470943;
		this.aFloat323 = -1.0F;
		this.aFloat322 = -1.0F;
		this.aFloat327 = -1.0F;
		this.aClass320_65 = null;
		this.anInt5273 = -1544999859;
		this.anInt5276 = 1190008837;
		this.aFloat324 = -1.0F;
		this.aFloat325 = -1.0F;
		this.aFloat326 = -1.0F;
		this.anInt5277 = -1513719543;
		this.anInt5274 = -1162659595;
		this.anInt5278 = 365100261;
		this.anInt5279 = -975306545;
		this.anInt5280 = -2130168727;
		this.anInt5281 = 1855213223;
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray491.length; local49++) {
			this.anIntArray491[local49] = -1;
			this.aFloatArray114[local49] = 0.0F;
		}
		this.anInt5282 = -1806433224;
	}

	@OriginalMember(owner = "client!uz", name = "a", descriptor = "(Lclient!ahb;B)Z", line = 57)
	public boolean method29691(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20271();
		if (local3 == 0) {
			this.anInt5282 = arg0.method20271() * 1712471671;
			return false;
		}
		if ((local3 & Class497.aClass497_2.anInt5230 * -1678163245) != 0) {
			this.anInt5275 = arg0.method20275() * -825470943;
		}
		if ((local3 & Class497.aClass497_3.anInt5230 * -1678163245) != 0) {
			this.aFloat323 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_5.anInt5230 * -1678163245) != 0) {
			this.aFloat322 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_4.anInt5230 * -1678163245) != 0) {
			this.aFloat327 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_11.anInt5230 * -1678163245) != 0) {
			this.aClass320_65 = Class320.method25895(arg0);
		}
		if ((local3 & Class497.aClass497_6.anInt5230 * -1678163245) != 0) {
			this.anInt5273 = arg0.method20275() * 1544999859;
		}
		if ((local3 & Class497.aClass497_7.anInt5230 * -1678163245) != 0) {
			this.anInt5276 = arg0.method20271() * -1190008837;
		}
		if ((local3 & Class497.aClass497_8.anInt5230 * -1678163245) != 0) {
			this.anInt5277 = arg0.method20271() * 1513719543;
		}
		if ((local3 & Class497.aClass497_1.anInt5230 * -1678163245) != 0) {
			this.aFloat324 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_10.anInt5230 * -1678163245) != 0) {
			this.aFloat325 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_9.anInt5230 * -1678163245) != 0) {
			this.aFloat326 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_12.anInt5230 * -1678163245) != 0) {
			this.anInt5274 = arg0.method20271() * 1162659595;
			this.anInt5278 = arg0.method20272() * -365100261;
			this.anInt5279 = arg0.method20272() * 975306545;
			this.anInt5280 = arg0.method20272() * 2130168727;
			this.anInt5281 = arg0.method20271() * -1855213223;
		}
		if ((local3 & Class497.aClass497_13.anInt5230 * -1678163245) != 0) {
			this.anIntArray491[0] = arg0.method20271();
			this.aFloatArray114[0] = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_14.anInt5230 * -1678163245) != 0) {
			this.anIntArray491[1] = arg0.method20271();
			this.aFloatArray114[1] = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_15.anInt5230 * -1678163245) != 0) {
			this.anIntArray491[2] = arg0.method20271();
			this.aFloatArray114[2] = arg0.method20448();
		}
		this.anInt5282 = arg0.method20271() * 1712471671;
		return true;
	}

	@OriginalMember(owner = "client!uz", name = "i", descriptor = "(Lclient!ahb;)Z", line = 57)
	public boolean method29701(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20271();
		if (local3 == 0) {
			this.anInt5282 = arg0.method20271() * 1712471671;
			return false;
		}
		if ((local3 & Class497.aClass497_2.anInt5230 * -1678163245) != 0) {
			this.anInt5275 = arg0.method20275() * -825470943;
		}
		if ((local3 & Class497.aClass497_3.anInt5230 * -1678163245) != 0) {
			this.aFloat323 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_5.anInt5230 * -1678163245) != 0) {
			this.aFloat322 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_4.anInt5230 * -1678163245) != 0) {
			this.aFloat327 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_11.anInt5230 * -1678163245) != 0) {
			this.aClass320_65 = Class320.method25895(arg0);
		}
		if ((local3 & Class497.aClass497_6.anInt5230 * -1678163245) != 0) {
			this.anInt5273 = arg0.method20275() * 1544999859;
		}
		if ((local3 & Class497.aClass497_7.anInt5230 * -1678163245) != 0) {
			this.anInt5276 = arg0.method20271() * -1190008837;
		}
		if ((local3 & Class497.aClass497_8.anInt5230 * -1678163245) != 0) {
			this.anInt5277 = arg0.method20271() * 1513719543;
		}
		if ((local3 & Class497.aClass497_1.anInt5230 * -1678163245) != 0) {
			this.aFloat324 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_10.anInt5230 * -1678163245) != 0) {
			this.aFloat325 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_9.anInt5230 * -1678163245) != 0) {
			this.aFloat326 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_12.anInt5230 * -1678163245) != 0) {
			this.anInt5274 = arg0.method20271() * 1162659595;
			this.anInt5278 = arg0.method20272() * -365100261;
			this.anInt5279 = arg0.method20272() * 975306545;
			this.anInt5280 = arg0.method20272() * 2130168727;
			this.anInt5281 = arg0.method20271() * -1855213223;
		}
		if ((local3 & Class497.aClass497_13.anInt5230 * -1678163245) != 0) {
			this.anIntArray491[0] = arg0.method20271();
			this.aFloatArray114[0] = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_14.anInt5230 * -1678163245) != 0) {
			this.anIntArray491[1] = arg0.method20271();
			this.aFloatArray114[1] = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_15.anInt5230 * -1678163245) != 0) {
			this.anIntArray491[2] = arg0.method20271();
			this.aFloatArray114[2] = arg0.method20448();
		}
		this.anInt5282 = arg0.method20271() * 1712471671;
		return true;
	}

	@OriginalMember(owner = "client!uz", name = "o", descriptor = "(Lclient!ahb;)Z", line = 57)
	public boolean method29720(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20271();
		if (local3 == 0) {
			this.anInt5282 = arg0.method20271() * 1712471671;
			return false;
		}
		if ((local3 & Class497.aClass497_2.anInt5230 * -1678163245) != 0) {
			this.anInt5275 = arg0.method20275() * -825470943;
		}
		if ((local3 & Class497.aClass497_3.anInt5230 * -1678163245) != 0) {
			this.aFloat323 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_5.anInt5230 * -1678163245) != 0) {
			this.aFloat322 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_4.anInt5230 * -1678163245) != 0) {
			this.aFloat327 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_11.anInt5230 * -1678163245) != 0) {
			this.aClass320_65 = Class320.method25895(arg0);
		}
		if ((local3 & Class497.aClass497_6.anInt5230 * -1678163245) != 0) {
			this.anInt5273 = arg0.method20275() * 1544999859;
		}
		if ((local3 & Class497.aClass497_7.anInt5230 * -1678163245) != 0) {
			this.anInt5276 = arg0.method20271() * -1190008837;
		}
		if ((local3 & Class497.aClass497_8.anInt5230 * -1678163245) != 0) {
			this.anInt5277 = arg0.method20271() * 1513719543;
		}
		if ((local3 & Class497.aClass497_1.anInt5230 * -1678163245) != 0) {
			this.aFloat324 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_10.anInt5230 * -1678163245) != 0) {
			this.aFloat325 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_9.anInt5230 * -1678163245) != 0) {
			this.aFloat326 = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_12.anInt5230 * -1678163245) != 0) {
			this.anInt5274 = arg0.method20271() * 1162659595;
			this.anInt5278 = arg0.method20272() * -365100261;
			this.anInt5279 = arg0.method20272() * 975306545;
			this.anInt5280 = arg0.method20272() * 2130168727;
			this.anInt5281 = arg0.method20271() * -1855213223;
		}
		if ((local3 & Class497.aClass497_13.anInt5230 * -1678163245) != 0) {
			this.anIntArray491[0] = arg0.method20271();
			this.aFloatArray114[0] = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_14.anInt5230 * -1678163245) != 0) {
			this.anIntArray491[1] = arg0.method20271();
			this.aFloatArray114[1] = arg0.method20448();
		}
		if ((local3 & Class497.aClass497_15.anInt5230 * -1678163245) != 0) {
			this.anIntArray491[2] = arg0.method20271();
			this.aFloatArray114[2] = arg0.method20448();
		}
		this.anInt5282 = arg0.method20271() * 1712471671;
		return true;
	}

	@OriginalMember(owner = "client!uz", name = "at", descriptor = "()I", line = 119)
	public int method29677() {
		return this.anInt5275 * 1737962465;
	}

	@OriginalMember(owner = "client!uz", name = "g", descriptor = "(B)I", line = 119)
	public int method29680() {
		return this.anInt5275 * 1737962465;
	}

	@OriginalMember(owner = "client!uz", name = "f", descriptor = "()I", line = 119)
	public int method29702() {
		return this.anInt5275 * 1737962465;
	}

	@OriginalMember(owner = "client!uz", name = "k", descriptor = "()I", line = 119)
	public int method29703() {
		return this.anInt5275 * 1737962465;
	}

	@OriginalMember(owner = "client!uz", name = "l", descriptor = "(I)F", line = 123)
	public float method29681() {
		return this.aFloat323;
	}

	@OriginalMember(owner = "client!uz", name = "ah", descriptor = "()F", line = 123)
	public float method29693() {
		return this.aFloat323;
	}

	@OriginalMember(owner = "client!uz", name = "af", descriptor = "()F", line = 123)
	public float method29705() {
		return this.aFloat323;
	}

	@OriginalMember(owner = "client!uz", name = "ak", descriptor = "()F", line = 123)
	public float method29706() {
		return this.aFloat323;
	}

	@OriginalMember(owner = "client!uz", name = "aa", descriptor = "()F", line = 123)
	public float method29707() {
		return this.aFloat323;
	}

	@OriginalMember(owner = "client!uz", name = "h", descriptor = "(B)F", line = 127)
	public float method29682() {
		return this.aFloat322;
	}

	@OriginalMember(owner = "client!uz", name = "an", descriptor = "()F", line = 127)
	public float method29712() {
		return this.aFloat322;
	}

	@OriginalMember(owner = "client!uz", name = "x", descriptor = "(I)F", line = 131)
	public float method29683() {
		return this.aFloat327;
	}

	@OriginalMember(owner = "client!uz", name = "aj", descriptor = "()F", line = 131)
	public float method29710() {
		return this.aFloat327;
	}

	@OriginalMember(owner = "client!uz", name = "s", descriptor = "(I)Lclient!mh;", line = 135)
	public Class320 method29684() {
		return this.aClass320_65;
	}

	@OriginalMember(owner = "client!uz", name = "as", descriptor = "()Lclient!mh;", line = 135)
	public Class320 method29711() {
		return this.aClass320_65;
	}

	@OriginalMember(owner = "client!uz", name = "u", descriptor = "(S)I", line = 139)
	public int method29685() {
		return this.anInt5273 * 1919292283;
	}

	@OriginalMember(owner = "client!uz", name = "y", descriptor = "(B)I", line = 143)
	public int method29708() {
		return this.anInt5276 * -2001401037;
	}

	@OriginalMember(owner = "client!uz", name = "b", descriptor = "(I)F", line = 147)
	public float method29687() {
		return this.aFloat324;
	}

	@OriginalMember(owner = "client!uz", name = "ai", descriptor = "()F", line = 147)
	public float method29704() {
		return this.aFloat324;
	}

	@OriginalMember(owner = "client!uz", name = "c", descriptor = "(I)F", line = 151)
	public float method29688() {
		return this.aFloat325;
	}

	@OriginalMember(owner = "client!uz", name = "aq", descriptor = "()F", line = 151)
	public float method29713() {
		return this.aFloat325;
	}

	@OriginalMember(owner = "client!uz", name = "av", descriptor = "()F", line = 151)
	public float method29714() {
		return this.aFloat325;
	}

	@OriginalMember(owner = "client!uz", name = "ax", descriptor = "()F", line = 151)
	public float method29715() {
		return this.aFloat325;
	}

	@OriginalMember(owner = "client!uz", name = "az", descriptor = "()F", line = 151)
	public float method29719() {
		return this.aFloat325;
	}

	@OriginalMember(owner = "client!uz", name = "z", descriptor = "(B)F", line = 155)
	public float method29689() {
		return this.aFloat326;
	}

	@OriginalMember(owner = "client!uz", name = "j", descriptor = "(I)I", line = 159)
	public int method29690() {
		return this.anInt5277 * 1128602311;
	}

	@OriginalMember(owner = "client!uz", name = "al", descriptor = "()I", line = 163)
	public int method29717() {
		return this.anInt5274 * 718425251;
	}

	@OriginalMember(owner = "client!uz", name = "n", descriptor = "(B)I", line = 163)
	public int method29724() {
		return this.anInt5274 * 718425251;
	}

	@OriginalMember(owner = "client!uz", name = "ao", descriptor = "()I", line = 167)
	public int method29718() {
		return this.anInt5278 * 122789651;
	}

	@OriginalMember(owner = "client!uz", name = "e", descriptor = "(I)I", line = 167)
	public int method29722() {
		return this.anInt5278 * 122789651;
	}

	@OriginalMember(owner = "client!uz", name = "ap", descriptor = "()I", line = 171)
	public int method29679() {
		return this.anInt5279 * -1752630831;
	}

	@OriginalMember(owner = "client!uz", name = "r", descriptor = "(I)I", line = 171)
	public int method29692() {
		return this.anInt5279 * -1752630831;
	}

	@OriginalMember(owner = "client!uz", name = "au", descriptor = "()I", line = 175)
	public int method29686() {
		return this.anInt5280 * -466656217;
	}

	@OriginalMember(owner = "client!uz", name = "ab", descriptor = "()I", line = 175)
	public int method29709() {
		return this.anInt5280 * -466656217;
	}

	@OriginalMember(owner = "client!uz", name = "ay", descriptor = "()I", line = 175)
	public int method29721() {
		return this.anInt5280 * -466656217;
	}

	@OriginalMember(owner = "client!uz", name = "d", descriptor = "(I)I", line = 175)
	public int method29727() {
		return this.anInt5280 * -466656217;
	}

	@OriginalMember(owner = "client!uz", name = "q", descriptor = "(I)I", line = 179)
	public int method29695() {
		return this.anInt5281 * 1132431081;
	}

	@OriginalMember(owner = "client!uz", name = "ag", descriptor = "()I", line = 179)
	public int method29726() {
		return this.anInt5281 * 1132431081;
	}

	@OriginalMember(owner = "client!uz", name = "ar", descriptor = "(I)I", line = 183)
	public int method29694(@OriginalArg(0) int arg0) {
		return this.anIntArray491[arg0];
	}

	@OriginalMember(owner = "client!uz", name = "m", descriptor = "(II)I", line = 183)
	public int method29696(@OriginalArg(0) int arg0) {
		return this.anIntArray491[arg0];
	}

	@OriginalMember(owner = "client!uz", name = "am", descriptor = "(I)I", line = 183)
	public int method29723(@OriginalArg(0) int arg0) {
		return this.anIntArray491[arg0];
	}

	@OriginalMember(owner = "client!uz", name = "ae", descriptor = "(I)I", line = 183)
	public int method29725(@OriginalArg(0) int arg0) {
		return this.anIntArray491[arg0];
	}

	@OriginalMember(owner = "client!uz", name = "v", descriptor = "(IB)F", line = 187)
	public float method29697(@OriginalArg(0) int arg0) {
		return this.aFloatArray114[arg0];
	}

	@OriginalMember(owner = "client!uz", name = "aw", descriptor = "(I)F", line = 187)
	public float method29700(@OriginalArg(0) int arg0) {
		return this.aFloatArray114[arg0];
	}

	@OriginalMember(owner = "client!uz", name = "ad", descriptor = "(I)F", line = 187)
	public float method29716(@OriginalArg(0) int arg0) {
		return this.aFloatArray114[arg0];
	}

	@OriginalMember(owner = "client!uz", name = "t", descriptor = "(I)I", line = 191)
	public int method29698() {
		return this.anInt5282 * -1839269049;
	}

	@OriginalMember(owner = "client!uz", name = "ac", descriptor = "()I", line = 191)
	public int method29728() {
		return this.anInt5282 * -1839269049;
	}

	@OriginalMember(owner = "client!uz", name = "ns", descriptor = "(Lclient!vs;S)V", line = 6588)
	static final void method29729(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class354.method26625(local11, local14, arg0);
	}
}
