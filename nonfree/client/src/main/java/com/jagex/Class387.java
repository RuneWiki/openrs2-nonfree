package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public class Class387 {

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "Lclient!tf;")
	Class478 aClass478_7;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Lclient!wi;")
	Class71 aClass71_9;

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "Lclient!dh;")
	Class20 aClass20_6;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	int anInt4748;

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "Lclient!amd;")
	Class3_Sub1_Sub3 aClass3_Sub1_Sub3_5;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "[Z")
	boolean[] aBooleanArray30;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "Lclient!sp;")
	Class462 aClass462_2;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "Z")
	boolean aBoolean747 = false;

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
	int anInt4746 = 636609293;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
	int anInt4749 = 0;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Z")
	boolean aBoolean748 = false;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Z")
	boolean aBoolean746 = false;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "Lclient!sj;")
	Class457 aClass457_9;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	int anInt4745;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	int anInt4750;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
	int anInt4747;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Lclient!ahn;")
	Class26_Sub1 aClass26_Sub1_24;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "B")
	byte aByte155;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "Z")
	boolean aBoolean749;

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "Lclient!wi;")
	Class71 aClass71_8;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!de;Lclient!sj;Lclient!su;IIILclient!ahn;ZII)V", line = 47)
	Class387(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class457 arg1, @OriginalArg(2) Class467 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class26_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass457_9 = arg1;
		this.anInt4745 = arg2.anInt5092 * -155985397;
		this.anInt4750 = arg3 * 1703749443;
		this.anInt4747 = arg4 * 1665908215;
		this.aClass26_Sub1_24 = arg6;
		this.aBoolean748 = arg8 != -1;
		this.aByte155 = (byte) arg5;
		this.aBoolean747 = arg7;
		this.aBoolean749 = arg0.method17409() && arg2.aBoolean789 && !this.aBoolean747;
		this.aClass71_8 = new Class71_Sub3(arg6, false);
		this.method27372(false, arg8, 1, this.aBoolean748 ? arg9 : 0);
	}

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;", line = 57)
	public static String method27400(@OriginalArg(0) CharSequence arg0) {
		@Pc(4) String local4 = Class205.method24186(Class230.method24544(arg0));
		if (local4 == null) {
			local4 = "";
		}
		return local4;
	}

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "(III)V", line = 62)
	public void method27366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass71_9 = null;
		if (arg1 > 0) {
			this.aClass71_9 = new Class71_Sub3(this.aClass26_Sub1_24, false);
			this.aClass71_9.method20030(arg0, arg1, 1, false);
		} else {
			this.aBoolean748 = true;
			this.method27372(false, arg0, 1, 0);
		}
	}

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "(II)V", line = 62)
	public void method27378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass71_9 = null;
		if (arg1 > 0) {
			this.aClass71_9 = new Class71_Sub3(this.aClass26_Sub1_24, false);
			this.aClass71_9.method20030(arg0, arg1, 1, false);
		} else {
			this.aBoolean748 = true;
			this.method27372(false, arg0, 1, 0);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I", line = 74)
	int method27367() {
		return this.anInt4749 * 1879060639;
	}

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "()I", line = 74)
	int method27379() {
		return this.anInt4749 * 1879060639;
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "()I", line = 74)
	int method27380() {
		return this.anInt4749 * 1879060639;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(Lclient!sp;)V", line = 78)
	void method27371(@OriginalArg(0) Class462 arg0) {
		this.aClass462_2 = arg0;
		this.aClass20_6 = null;
	}

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "(Lclient!sp;)V", line = 78)
	void method27381(@OriginalArg(0) Class462 arg0) {
		this.aClass462_2 = arg0;
		this.aClass20_6 = null;
	}

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "(Lclient!sp;I)V", line = 78)
	void method27389(@OriginalArg(0) Class462 arg0) {
		this.aClass462_2 = arg0;
		this.aClass20_6 = null;
	}

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "(Lclient!sp;)V", line = 78)
	void method27395(@OriginalArg(0) Class462 arg0) {
		this.aClass462_2 = arg0;
		this.aClass20_6 = null;
	}

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "()I", line = 83)
	int method27365() {
		return -this.method27367();
	}

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "(B)I", line = 83)
	int method27369() {
		return -this.method27367();
	}

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "()I", line = 83)
	int method27384() {
		return -this.method27367();
	}

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "()I", line = 83)
	int method27386() {
		return -this.method27367();
	}

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "(I)Lclient!su;", line = 87)
	Class467 method27370() {
		return this.aClass457_9.method28510(this.anInt4745 * -921030407);
	}

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "(Lclient!de;IZZ)Lclient!dh;", line = 91)
	final Class20 method27387(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class467 local8 = this.aClass457_9.method28510(this.anInt4745 * -921030407);
		if (local8.anIntArray464 != null) {
			local8 = local8.method28716(Class424.aClass165_1, client.anInt3065 * -1773414811 == 2 ? Class131.anInterface8_3 : Class424.aClass165_1);
		}
		if (local8 == null) {
			this.method27375(arg0);
			this.anInt4746 = 636609293;
			return null;
		}
		if (!this.aBoolean748 && this.anInt4746 * 1481137211 != local8.anInt5092 * 1978606771) {
			this.method27372(true, -1, 0, 0);
			this.aBoolean746 = false;
			this.aClass20_6 = null;
		}
		this.method27376(this.aClass26_Sub1_24);
		if (arg3) {
			arg3 &= this.aBoolean749 & !this.aBoolean746 & Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() != 0;
		}
		if (arg2 && !arg3) {
			this.anInt4746 = local8.anInt5092 * -1983026711;
			return null;
		}
		@Pc(106) Class320 local106 = this.aClass26_Sub1_24.method21431().aClass320_61;
		@Pc(110) Class438 local110 = client.aClass370_1.method26950();
		if (arg3) {
			local110.method28084(this.aClass3_Sub1_Sub3_5, this.aByte155, (int) local106.aFloat259, (int) local106.aFloat261, this.aBooleanArray30);
			this.aBoolean746 = false;
		}
		@Pc(136) Class17 local136 = local110.aClass17Array3[this.aByte155];
		@Pc(144) Class17 local144;
		if (this.aBoolean747) {
			local144 = local110.aClass17Array1[0];
		} else {
			local144 = this.aByte155 < 3 ? local110.aClass17Array3[this.aByte155 + 1] : null;
		}
		@Pc(161) Class20 local161 = null;
		if (this.aClass71_8.method20021()) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local161 = local8.method28680(arg0, arg1, this.anInt4750 * -2124800661 == 11 ? 10 : this.anInt4750 * -2124800661, this.anInt4750 * -2124800661 == 11 ? this.anInt4747 * -1918233657 + 4 : this.anInt4747 * -1918233657, local136, local144, (int) local106.aFloat259, local136.method3583((int) local106.aFloat259, (int) local106.aFloat261), (int) local106.aFloat261, this.aClass71_8, this.aClass462_2);
			if (local161 == null) {
				this.aBooleanArray30 = null;
				this.aClass3_Sub1_Sub3_5 = null;
				this.anInt4749 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray30 == null) {
						this.aBooleanArray30 = new boolean[4];
					}
					this.aClass3_Sub1_Sub3_5 = local161.method5357(this.aClass3_Sub1_Sub3_5);
					local110.method28191(this.aClass3_Sub1_Sub3_5, this.aByte155, (int) local106.aFloat259, (int) local106.aFloat261, this.aBooleanArray30);
					this.aBoolean746 = true;
				}
				this.anInt4749 = local161.method5466() * -1120605345;
				local161.method5356();
			}
			this.aClass20_6 = null;
		} else if (this.aClass20_6 != null && (this.aClass20_6.method5327() & arg1) == arg1 && local8.anInt5092 * 1978606771 == this.anInt4746 * 1481137211) {
			local161 = this.aClass20_6;
		} else {
			if (this.aClass20_6 != null) {
				arg1 |= this.aClass20_6.method5327();
			}
			@Pc(371) Class576 local371 = local8.method28679(arg0, arg1, this.anInt4750 * -2124800661 == 11 ? 10 : this.anInt4750 * -2124800661, this.anInt4750 * -2124800661 == 11 ? this.anInt4747 * -1918233657 + 4 : this.anInt4747 * -1918233657, local136, local144, (int) local106.aFloat259, local136.method3583((int) local106.aFloat259, (int) local106.aFloat261), (int) local106.aFloat261, arg3, this.aClass462_2);
			if (local371 == null) {
				this.aBooleanArray30 = null;
				this.aClass3_Sub1_Sub3_5 = null;
				this.aClass20_6 = null;
				this.anInt4749 = 0;
			} else {
				this.aClass20_6 = local161 = (Class20) local371.anObject27;
				if (arg3) {
					this.aClass3_Sub1_Sub3_5 = (Class3_Sub1_Sub3) local371.anObject26;
					this.aBooleanArray30 = null;
					local110.method28191(this.aClass3_Sub1_Sub3_5, this.aByte155, (int) local106.aFloat259, (int) local106.aFloat261, null);
					this.aBoolean746 = true;
				}
				this.anInt4749 = local161.method5466() * -1120605345;
				local161.method5356();
			}
		}
		this.anInt4746 = local8.anInt5092 * -1983026711;
		return local161;
	}

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "(Lclient!de;IZZ)Lclient!dh;", line = 91)
	final Class20 method27388(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class467 local8 = this.aClass457_9.method28510(this.anInt4745 * -921030407);
		if (local8.anIntArray464 != null) {
			local8 = local8.method28716(Class424.aClass165_1, client.anInt3065 * -1773414811 == 2 ? Class131.anInterface8_3 : Class424.aClass165_1);
		}
		if (local8 == null) {
			this.method27375(arg0);
			this.anInt4746 = 636609293;
			return null;
		}
		if (!this.aBoolean748 && this.anInt4746 * 1481137211 != local8.anInt5092 * 1978606771) {
			this.method27372(true, -1, 0, 0);
			this.aBoolean746 = false;
			this.aClass20_6 = null;
		}
		this.method27376(this.aClass26_Sub1_24);
		if (arg3) {
			arg3 &= this.aBoolean749 & !this.aBoolean746 & Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() != 0;
		}
		if (arg2 && !arg3) {
			this.anInt4746 = local8.anInt5092 * -1983026711;
			return null;
		}
		@Pc(106) Class320 local106 = this.aClass26_Sub1_24.method21431().aClass320_61;
		@Pc(110) Class438 local110 = client.aClass370_1.method26950();
		if (arg3) {
			local110.method28084(this.aClass3_Sub1_Sub3_5, this.aByte155, (int) local106.aFloat259, (int) local106.aFloat261, this.aBooleanArray30);
			this.aBoolean746 = false;
		}
		@Pc(136) Class17 local136 = local110.aClass17Array3[this.aByte155];
		@Pc(144) Class17 local144;
		if (this.aBoolean747) {
			local144 = local110.aClass17Array1[0];
		} else {
			local144 = this.aByte155 < 3 ? local110.aClass17Array3[this.aByte155 + 1] : null;
		}
		@Pc(161) Class20 local161 = null;
		if (this.aClass71_8.method20021()) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local161 = local8.method28680(arg0, arg1, this.anInt4750 * -2124800661 == 11 ? 10 : this.anInt4750 * -2124800661, this.anInt4750 * -2124800661 == 11 ? this.anInt4747 * -1918233657 + 4 : this.anInt4747 * -1918233657, local136, local144, (int) local106.aFloat259, local136.method3583((int) local106.aFloat259, (int) local106.aFloat261), (int) local106.aFloat261, this.aClass71_8, this.aClass462_2);
			if (local161 == null) {
				this.aBooleanArray30 = null;
				this.aClass3_Sub1_Sub3_5 = null;
				this.anInt4749 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray30 == null) {
						this.aBooleanArray30 = new boolean[4];
					}
					this.aClass3_Sub1_Sub3_5 = local161.method5357(this.aClass3_Sub1_Sub3_5);
					local110.method28191(this.aClass3_Sub1_Sub3_5, this.aByte155, (int) local106.aFloat259, (int) local106.aFloat261, this.aBooleanArray30);
					this.aBoolean746 = true;
				}
				this.anInt4749 = local161.method5466() * -1120605345;
				local161.method5356();
			}
			this.aClass20_6 = null;
		} else if (this.aClass20_6 != null && (this.aClass20_6.method5327() & arg1) == arg1 && local8.anInt5092 * 1978606771 == this.anInt4746 * 1481137211) {
			local161 = this.aClass20_6;
		} else {
			if (this.aClass20_6 != null) {
				arg1 |= this.aClass20_6.method5327();
			}
			@Pc(371) Class576 local371 = local8.method28679(arg0, arg1, this.anInt4750 * -2124800661 == 11 ? 10 : this.anInt4750 * -2124800661, this.anInt4750 * -2124800661 == 11 ? this.anInt4747 * -1918233657 + 4 : this.anInt4747 * -1918233657, local136, local144, (int) local106.aFloat259, local136.method3583((int) local106.aFloat259, (int) local106.aFloat261), (int) local106.aFloat261, arg3, this.aClass462_2);
			if (local371 == null) {
				this.aBooleanArray30 = null;
				this.aClass3_Sub1_Sub3_5 = null;
				this.aClass20_6 = null;
				this.anInt4749 = 0;
			} else {
				this.aClass20_6 = local161 = (Class20) local371.anObject27;
				if (arg3) {
					this.aClass3_Sub1_Sub3_5 = (Class3_Sub1_Sub3) local371.anObject26;
					this.aBooleanArray30 = null;
					local110.method28191(this.aClass3_Sub1_Sub3_5, this.aByte155, (int) local106.aFloat259, (int) local106.aFloat261, null);
					this.aBoolean746 = true;
				}
				this.anInt4749 = local161.method5466() * -1120605345;
				local161.method5356();
			}
		}
		this.anInt4746 = local8.anInt5092 * -1983026711;
		return local161;
	}

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "(Lclient!de;IZZB)Lclient!dh;", line = 91)
	final Class20 method27399(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class467 local8 = this.aClass457_9.method28510(this.anInt4745 * -921030407);
		if (local8.anIntArray464 != null) {
			local8 = local8.method28716(Class424.aClass165_1, client.anInt3065 * -1773414811 == 2 ? Class131.anInterface8_3 : Class424.aClass165_1);
		}
		if (local8 == null) {
			this.method27375(arg0);
			this.anInt4746 = 636609293;
			return null;
		}
		if (!this.aBoolean748 && this.anInt4746 * 1481137211 != local8.anInt5092 * 1978606771) {
			this.method27372(true, -1, 0, 0);
			this.aBoolean746 = false;
			this.aClass20_6 = null;
		}
		this.method27376(this.aClass26_Sub1_24);
		if (arg3) {
			arg3 &= this.aBoolean749 & !this.aBoolean746 & Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() != 0;
		}
		if (arg2 && !arg3) {
			this.anInt4746 = local8.anInt5092 * -1983026711;
			return null;
		}
		@Pc(106) Class320 local106 = this.aClass26_Sub1_24.method21431().aClass320_61;
		@Pc(110) Class438 local110 = client.aClass370_1.method26950();
		if (arg3) {
			local110.method28084(this.aClass3_Sub1_Sub3_5, this.aByte155, (int) local106.aFloat259, (int) local106.aFloat261, this.aBooleanArray30);
			this.aBoolean746 = false;
		}
		@Pc(136) Class17 local136 = local110.aClass17Array3[this.aByte155];
		@Pc(144) Class17 local144;
		if (this.aBoolean747) {
			local144 = local110.aClass17Array1[0];
		} else {
			local144 = this.aByte155 < 3 ? local110.aClass17Array3[this.aByte155 + 1] : null;
		}
		@Pc(161) Class20 local161 = null;
		if (this.aClass71_8.method20021()) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local161 = local8.method28680(arg0, arg1, this.anInt4750 * -2124800661 == 11 ? 10 : this.anInt4750 * -2124800661, this.anInt4750 * -2124800661 == 11 ? this.anInt4747 * -1918233657 + 4 : this.anInt4747 * -1918233657, local136, local144, (int) local106.aFloat259, local136.method3583((int) local106.aFloat259, (int) local106.aFloat261), (int) local106.aFloat261, this.aClass71_8, this.aClass462_2);
			if (local161 == null) {
				this.aBooleanArray30 = null;
				this.aClass3_Sub1_Sub3_5 = null;
				this.anInt4749 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray30 == null) {
						this.aBooleanArray30 = new boolean[4];
					}
					this.aClass3_Sub1_Sub3_5 = local161.method5357(this.aClass3_Sub1_Sub3_5);
					local110.method28191(this.aClass3_Sub1_Sub3_5, this.aByte155, (int) local106.aFloat259, (int) local106.aFloat261, this.aBooleanArray30);
					this.aBoolean746 = true;
				}
				this.anInt4749 = local161.method5466() * -1120605345;
				local161.method5356();
			}
			this.aClass20_6 = null;
		} else if (this.aClass20_6 != null && (this.aClass20_6.method5327() & arg1) == arg1 && local8.anInt5092 * 1978606771 == this.anInt4746 * 1481137211) {
			local161 = this.aClass20_6;
		} else {
			if (this.aClass20_6 != null) {
				arg1 |= this.aClass20_6.method5327();
			}
			@Pc(371) Class576 local371 = local8.method28679(arg0, arg1, this.anInt4750 * -2124800661 == 11 ? 10 : this.anInt4750 * -2124800661, this.anInt4750 * -2124800661 == 11 ? this.anInt4747 * -1918233657 + 4 : this.anInt4747 * -1918233657, local136, local144, (int) local106.aFloat259, local136.method3583((int) local106.aFloat259, (int) local106.aFloat261), (int) local106.aFloat261, arg3, this.aClass462_2);
			if (local371 == null) {
				this.aBooleanArray30 = null;
				this.aClass3_Sub1_Sub3_5 = null;
				this.aClass20_6 = null;
				this.anInt4749 = 0;
			} else {
				this.aClass20_6 = local161 = (Class20) local371.anObject27;
				if (arg3) {
					this.aClass3_Sub1_Sub3_5 = (Class3_Sub1_Sub3) local371.anObject26;
					this.aBooleanArray30 = null;
					local110.method28191(this.aClass3_Sub1_Sub3_5, this.aByte155, (int) local106.aFloat259, (int) local106.aFloat261, null);
					this.aBoolean746 = true;
				}
				this.anInt4749 = local161.method5466() * -1120605345;
				local161.method5356();
			}
		}
		this.anInt4746 = local8.anInt5092 * -1983026711;
		return local161;
	}

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "(Lclient!de;Lclient!dh;Lclient!mu;IIIIZ)V", line = 171)
	void method27383(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(2) Class135[] local2 = arg1.method5378();
		@Pc(5) Class109[] local5 = arg1.method5379();
		if ((this.aClass478_7 == null || this.aClass478_7.aBoolean794) && (local2 != null || local5 != null)) {
			@Pc(25) Class467 local25 = this.aClass457_9.method28510(this.anInt4745 * -921030407);
			if (local25.anIntArray464 != null) {
				local25 = local25.method28716(Class424.aClass165_1, client.anInt3065 * -1773414811 == 2 ? Class131.anInterface8_3 : Class424.aClass165_1);
			}
			if (local25 != null) {
				this.aClass478_7 = Class478.method28854(client.anInt3034, true);
			}
		}
		if (this.aClass478_7 == null) {
			return;
		}
		arg1.method5463(arg2);
		if (arg7) {
			this.aClass478_7.method28857(arg0, (long) client.anInt3034, local2, local5, false);
		} else {
			this.aClass478_7.method28836((long) client.anInt3034);
		}
		this.aClass478_7.method28842(this.aByte155, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "(Lclient!de;Lclient!dh;Lclient!mu;IIIIZI)V", line = 171)
	void method27385(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(2) Class135[] local2 = arg1.method5378();
		@Pc(5) Class109[] local5 = arg1.method5379();
		if ((this.aClass478_7 == null || this.aClass478_7.aBoolean794) && (local2 != null || local5 != null)) {
			@Pc(25) Class467 local25 = this.aClass457_9.method28510(this.anInt4745 * -921030407);
			if (local25.anIntArray464 != null) {
				local25 = local25.method28716(Class424.aClass165_1, client.anInt3065 * -1773414811 == 2 ? Class131.anInterface8_3 : Class424.aClass165_1);
			}
			if (local25 != null) {
				this.aClass478_7 = Class478.method28854(client.anInt3034, true);
			}
		}
		if (this.aClass478_7 == null) {
			return;
		}
		arg1.method5463(arg2);
		if (arg7) {
			this.aClass478_7.method28857(arg0, (long) client.anInt3034, local2, local5, false);
		} else {
			this.aClass478_7.method28836((long) client.anInt3034);
		}
		this.aClass478_7.method28842(this.aByte155, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "(B)Z", line = 187)
	boolean method27373() {
		return this.aBoolean749;
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "()Z", line = 187)
	boolean method27390() {
		return this.aBoolean749;
	}

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "()Z", line = 187)
	boolean method27391() {
		return this.aBoolean749;
	}

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "(Lclient!de;I)V", line = 191)
	void method27374(@OriginalArg(0) Class21 arg0) {
		this.method27399(arg0, 262144, true, true);
	}

	@OriginalMember(owner = "client!pe", name = "at", descriptor = "(Lclient!de;)V", line = 191)
	void method27392(@OriginalArg(0) Class21 arg0) {
		this.method27399(arg0, 262144, true, true);
	}

	@OriginalMember(owner = "client!pe", name = "af", descriptor = "(Lclient!de;)V", line = 191)
	void method27393(@OriginalArg(0) Class21 arg0) {
		this.method27399(arg0, 262144, true, true);
	}

	@OriginalMember(owner = "client!pe", name = "aa", descriptor = "(Lclient!de;)V", line = 195)
	void method27368(@OriginalArg(0) Class21 arg0) {
		if (this.aClass3_Sub1_Sub3_5 != null) {
			@Pc(7) Class320 local7 = this.aClass26_Sub1_24.method21431().aClass320_61;
			client.aClass370_1.method26950().method28084(this.aClass3_Sub1_Sub3_5, this.aByte155, (int) local7.aFloat259, (int) local7.aFloat261, this.aBooleanArray30);
			this.aBooleanArray30 = null;
			this.aClass3_Sub1_Sub3_5 = null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Lclient!de;I)V", line = 195)
	void method27375(@OriginalArg(0) Class21 arg0) {
		if (this.aClass3_Sub1_Sub3_5 != null) {
			@Pc(7) Class320 local7 = this.aClass26_Sub1_24.method21431().aClass320_61;
			client.aClass370_1.method26950().method28084(this.aClass3_Sub1_Sub3_5, this.aByte155, (int) local7.aFloat259, (int) local7.aFloat261, this.aBooleanArray30);
			this.aBooleanArray30 = null;
			this.aClass3_Sub1_Sub3_5 = null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "ak", descriptor = "(Lclient!de;)V", line = 195)
	void method27382(@OriginalArg(0) Class21 arg0) {
		if (this.aClass3_Sub1_Sub3_5 != null) {
			@Pc(7) Class320 local7 = this.aClass26_Sub1_24.method21431().aClass320_61;
			client.aClass370_1.method26950().method28084(this.aClass3_Sub1_Sub3_5, this.aByte155, (int) local7.aFloat259, (int) local7.aFloat261, this.aBooleanArray30);
			this.aBooleanArray30 = null;
			this.aClass3_Sub1_Sub3_5 = null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(Lclient!ahn;I)V", line = 204)
	void method27376(@OriginalArg(0) Class26_Sub1 arg0) {
		if (this.aClass71_9 != null && this.aClass71_9.method20021()) {
			this.aClass71_9.method20042(client.anInt3034 - this.anInt4748 * -1647894185);
			if (!this.aClass71_9.method20032()) {
				this.aClass71_8 = this.aClass71_9;
				this.aBoolean748 = true;
				this.anInt4748 = client.anInt3034 * 796875367;
				return;
			}
		}
		if (!this.aClass71_8.method20021()) {
			this.method27372(false, -1, 0, 0);
		} else if (this.aClass71_8.method20042(client.anInt3034 - this.anInt4748 * -1647894185)) {
			if (Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() == 2) {
				this.aBoolean746 = false;
			}
			if (this.aClass71_8.method20039()) {
				this.aClass71_8.method20038(-1);
				this.aBoolean748 = false;
				this.method27372(false, -1, 0, 0);
			}
		}
		this.anInt4748 = client.anInt3034 * 796875367;
	}

	@OriginalMember(owner = "client!pe", name = "aj", descriptor = "(Lclient!ahn;)V", line = 204)
	void method27377(@OriginalArg(0) Class26_Sub1 arg0) {
		if (this.aClass71_9 != null && this.aClass71_9.method20021()) {
			this.aClass71_9.method20042(client.anInt3034 - this.anInt4748 * -1647894185);
			if (!this.aClass71_9.method20032()) {
				this.aClass71_8 = this.aClass71_9;
				this.aBoolean748 = true;
				this.anInt4748 = client.anInt3034 * 796875367;
				return;
			}
		}
		if (!this.aClass71_8.method20021()) {
			this.method27372(false, -1, 0, 0);
		} else if (this.aClass71_8.method20042(client.anInt3034 - this.anInt4748 * -1647894185)) {
			if (Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() == 2) {
				this.aBoolean746 = false;
			}
			if (this.aClass71_8.method20039()) {
				this.aClass71_8.method20038(-1);
				this.aBoolean748 = false;
				this.method27372(false, -1, 0, 0);
			}
		}
		this.anInt4748 = client.anInt3034 * 796875367;
	}

	@OriginalMember(owner = "client!pe", name = "an", descriptor = "(Lclient!ahn;)V", line = 204)
	void method27396(@OriginalArg(0) Class26_Sub1 arg0) {
		if (this.aClass71_9 != null && this.aClass71_9.method20021()) {
			this.aClass71_9.method20042(client.anInt3034 - this.anInt4748 * -1647894185);
			if (!this.aClass71_9.method20032()) {
				this.aClass71_8 = this.aClass71_9;
				this.aBoolean748 = true;
				this.anInt4748 = client.anInt3034 * 796875367;
				return;
			}
		}
		if (!this.aClass71_8.method20021()) {
			this.method27372(false, -1, 0, 0);
		} else if (this.aClass71_8.method20042(client.anInt3034 - this.anInt4748 * -1647894185)) {
			if (Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() == 2) {
				this.aBoolean746 = false;
			}
			if (this.aClass71_8.method20039()) {
				this.aClass71_8.method20038(-1);
				this.aBoolean748 = false;
				this.method27372(false, -1, 0, 0);
			}
		}
		this.anInt4748 = client.anInt3034 * 796875367;
	}

	@OriginalMember(owner = "client!pe", name = "ah", descriptor = "(Lclient!ahn;)V", line = 204)
	void method27397(@OriginalArg(0) Class26_Sub1 arg0) {
		if (this.aClass71_9 != null && this.aClass71_9.method20021()) {
			this.aClass71_9.method20042(client.anInt3034 - this.anInt4748 * -1647894185);
			if (!this.aClass71_9.method20032()) {
				this.aClass71_8 = this.aClass71_9;
				this.aBoolean748 = true;
				this.anInt4748 = client.anInt3034 * 796875367;
				return;
			}
		}
		if (!this.aClass71_8.method20021()) {
			this.method27372(false, -1, 0, 0);
		} else if (this.aClass71_8.method20042(client.anInt3034 - this.anInt4748 * -1647894185)) {
			if (Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() == 2) {
				this.aBoolean746 = false;
			}
			if (this.aClass71_8.method20039()) {
				this.aClass71_8.method20038(-1);
				this.aBoolean748 = false;
				this.method27372(false, -1, 0, 0);
			}
		}
		this.anInt4748 = client.anInt3034 * 796875367;
	}

	@OriginalMember(owner = "client!pe", name = "as", descriptor = "(Lclient!ahn;)V", line = 204)
	void method27398(@OriginalArg(0) Class26_Sub1 arg0) {
		if (this.aClass71_9 != null && this.aClass71_9.method20021()) {
			this.aClass71_9.method20042(client.anInt3034 - this.anInt4748 * -1647894185);
			if (!this.aClass71_9.method20032()) {
				this.aClass71_8 = this.aClass71_9;
				this.aBoolean748 = true;
				this.anInt4748 = client.anInt3034 * 796875367;
				return;
			}
		}
		if (!this.aClass71_8.method20021()) {
			this.method27372(false, -1, 0, 0);
		} else if (this.aClass71_8.method20042(client.anInt3034 - this.anInt4748 * -1647894185)) {
			if (Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() == 2) {
				this.aBoolean746 = false;
			}
			if (this.aClass71_8.method20039()) {
				this.aClass71_8.method20038(-1);
				this.aBoolean748 = false;
				this.method27372(false, -1, 0, 0);
			}
		}
		this.anInt4748 = client.anInt3034 * 796875367;
	}

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "(ZIIII)V", line = 228)
	void method27372(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1 = arg1;
		@Pc(3) boolean local3 = false;
		if (arg1 == -1) {
			@Pc(15) Class467 local15 = this.aClass457_9.method28510(this.anInt4745 * -921030407);
			@Pc(17) Class467 local17 = local15;
			if (local15.anIntArray464 != null) {
				local15 = local15.method28716(Class424.aClass165_1, client.anInt3065 * -1773414811 == 2 ? Class131.anInterface8_3 : Class424.aClass165_1);
			}
			if (local15 == null) {
				return;
			}
			if (local17 == local15) {
				local17 = null;
			}
			if (local15.method28723()) {
				if (!local15.aBoolean781 || Class510.aClass3_Sub45_37.aClass60_Sub14_1.method13486() == 1) {
					if (arg0 && this.aClass71_8.method20021() && local15.method28705(this.aClass71_8.method20103())) {
						return;
					}
					if (local15.anInt5092 * 1978606771 != this.anInt4746 * 1481137211) {
						local3 = local15.aBoolean787;
					}
					local1 = local15.method28688();
					if (local15.method28687()) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			} else if (local17 != null && local17.method28723() && (!local17.aBoolean781 || Class510.aClass3_Sub45_37.aClass60_Sub14_1.method13486() == 1)) {
				if (arg0 && this.aClass71_8.method20021() && local17.method28705(this.aClass71_8.method20103())) {
					return;
				}
				if (local15.anInt5092 * 1978606771 != this.anInt4746 * 1481137211) {
					local3 = local17.aBoolean787;
				}
				local1 = local17.method28688();
				if (local17.method28687()) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (local1 == -1) {
			this.aClass71_8.method20028(-1, false);
		} else {
			this.aClass71_8.method20030(local1, arg3, arg2, local3);
			this.anInt4748 = client.anInt3034 * 796875367;
			this.aBoolean746 = false;
			this.aClass20_6 = null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "ai", descriptor = "(ZIII)V", line = 228)
	void method27394(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1 = arg1;
		@Pc(3) boolean local3 = false;
		if (arg1 == -1) {
			@Pc(15) Class467 local15 = this.aClass457_9.method28510(this.anInt4745 * -921030407);
			@Pc(17) Class467 local17 = local15;
			if (local15.anIntArray464 != null) {
				local15 = local15.method28716(Class424.aClass165_1, client.anInt3065 * -1773414811 == 2 ? Class131.anInterface8_3 : Class424.aClass165_1);
			}
			if (local15 == null) {
				return;
			}
			if (local17 == local15) {
				local17 = null;
			}
			if (local15.method28723()) {
				if (!local15.aBoolean781 || Class510.aClass3_Sub45_37.aClass60_Sub14_1.method13486() == 1) {
					if (arg0 && this.aClass71_8.method20021() && local15.method28705(this.aClass71_8.method20103())) {
						return;
					}
					if (local15.anInt5092 * 1978606771 != this.anInt4746 * 1481137211) {
						local3 = local15.aBoolean787;
					}
					local1 = local15.method28688();
					if (local15.method28687()) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			} else if (local17 != null && local17.method28723() && (!local17.aBoolean781 || Class510.aClass3_Sub45_37.aClass60_Sub14_1.method13486() == 1)) {
				if (arg0 && this.aClass71_8.method20021() && local17.method28705(this.aClass71_8.method20103())) {
					return;
				}
				if (local15.anInt5092 * 1978606771 != this.anInt4746 * 1481137211) {
					local3 = local17.aBoolean787;
				}
				local1 = local17.method28688();
				if (local17.method28687()) {
					arg2 = 0;
				} else {
					arg2 = 1;
				}
			}
		}
		if (local1 == -1) {
			this.aClass71_8.method20028(-1, false);
		} else {
			this.aClass71_8.method20030(local1, arg3, arg2, local3);
			this.anInt4748 = client.anInt3034 * 796875367;
			this.aBoolean746 = false;
			this.aClass20_6 = null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "auk", descriptor = "(Lclient!vs;B)V", line = 12525)
	static final void method27401(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		Class3_Sub14.method11265(arg0.aClass26_Sub1_Sub1_Sub1_4.aClass186_3, local13 & 0xFFFF, local23, local33, arg0.aBoolean822, arg0);
	}
}
