package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zx")
public class Class151 {

	@OriginalMember(owner = "client!zx", name = "c", descriptor = "I")
	public static final int anInt3155 = 1;

	@OriginalMember(owner = "client!zx", name = "v", descriptor = "I")
	public static final int anInt3156 = 2;

	@OriginalMember(owner = "client!zx", name = "p", descriptor = "I")
	public static final int anInt3159 = 0;

	@OriginalMember(owner = "client!zx", name = "l", descriptor = "Lclient!et;")
	Class234 aClass234_5;

	@OriginalMember(owner = "client!zx", name = "w", descriptor = "I")
	int anInt3157;

	@OriginalMember(owner = "client!zx", name = "t", descriptor = "I")
	int anInt3158;

	@OriginalMember(owner = "client!zx", name = "y", descriptor = "I")
	int anInt3160;

	@OriginalMember(owner = "client!zx", name = "q", descriptor = "I")
	int anInt3161;

	@OriginalMember(owner = "client!zx", name = "x", descriptor = "I")
	int anInt3163;

	@OriginalMember(owner = "client!zx", name = "d", descriptor = "Z")
	boolean aBoolean512 = false;

	@OriginalMember(owner = "client!zx", name = "s", descriptor = "Z")
	boolean aBoolean511 = false;

	@OriginalMember(owner = "client!zx", name = "r", descriptor = "I")
	int anInt3162 = 0;

	@OriginalMember(owner = "client!zx", name = "g", descriptor = "Z")
	boolean aBoolean510 = false;

	@OriginalMember(owner = "client!zx", name = "j", descriptor = "Lclient!zf;")
	final Class688 aClass688_9;

	@OriginalMember(owner = "client!zx", name = "i", descriptor = "Lclient!zf;")
	final Class688 aClass688_10;

	@OriginalMember(owner = "client!zx", name = "p", descriptor = "(Lclient!pw;III)Lclient!aar;", line = 18)
	public static Class17 method23390(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class316.method27377(arg0, arg1, arg2, null);
	}

	@OriginalMember(owner = "client!zx", name = "ak", descriptor = "(Lclient!anb;)V", line = 26)
	public static void method23391(@OriginalArg(0) Class35_Sub2 arg0) {
		Class474.aClass35_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!zx", name = "au", descriptor = "(Lclient!anb;)V", line = 26)
	public static void method23392(@OriginalArg(0) Class35_Sub2 arg0) {
		Class474.aClass35_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!zx", name = "<init>", descriptor = "(Z)V", line = 29)
	Class151(@OriginalArg(0) boolean arg0) {
		this.aBoolean511 = arg0;
		this.aClass688_9 = new Class688();
		if (this.aBoolean511) {
			this.aClass688_10 = new Class688();
		} else {
			this.aClass688_10 = null;
		}
	}

	@OriginalMember(owner = "client!zx", name = "c", descriptor = "(Lclient!zx;B)V", line = 37)
	public final void method23393(@OriginalArg(0) Class151 arg0) {
		this.aClass234_5 = arg0.aClass234_5;
		this.aBoolean512 = arg0.aBoolean512;
		this.aBoolean511 = arg0.aBoolean511;
		this.anInt3157 = arg0.anInt3157;
		this.anInt3158 = arg0.anInt3158;
		this.anInt3161 = arg0.anInt3161;
		this.anInt3163 = arg0.anInt3163;
		this.anInt3160 = arg0.anInt3160;
		this.method23479();
	}

	@OriginalMember(owner = "client!zx", name = "ax", descriptor = "(Lclient!zx;)V", line = 37)
	public final void method23394(@OriginalArg(0) Class151 arg0) {
		this.aClass234_5 = arg0.aClass234_5;
		this.aBoolean512 = arg0.aBoolean512;
		this.aBoolean511 = arg0.aBoolean511;
		this.anInt3157 = arg0.anInt3157;
		this.anInt3158 = arg0.anInt3158;
		this.anInt3161 = arg0.anInt3161;
		this.anInt3163 = arg0.anInt3163;
		this.anInt3160 = arg0.anInt3160;
		this.method23479();
	}

	@OriginalMember(owner = "client!zx", name = "ar", descriptor = "(Lclient!zx;)V", line = 37)
	public final void method23395(@OriginalArg(0) Class151 arg0) {
		this.aClass234_5 = arg0.aClass234_5;
		this.aBoolean512 = arg0.aBoolean512;
		this.aBoolean511 = arg0.aBoolean511;
		this.anInt3157 = arg0.anInt3157;
		this.anInt3158 = arg0.anInt3158;
		this.anInt3161 = arg0.anInt3161;
		this.anInt3163 = arg0.anInt3163;
		this.anInt3160 = arg0.anInt3160;
		this.method23479();
	}

	@OriginalMember(owner = "client!zx", name = "v", descriptor = "(B)Z", line = 49)
	public final boolean method23396() {
		return this.aClass234_5 != null;
	}

	@OriginalMember(owner = "client!zx", name = "ad", descriptor = "()Lclient!et;", line = 53)
	public final Class234 method23397() {
		return this.aClass234_5;
	}

	@OriginalMember(owner = "client!zx", name = "l", descriptor = "(I)Lclient!et;", line = 53)
	public final Class234 method23398() {
		return this.aClass234_5;
	}

	@OriginalMember(owner = "client!zx", name = "y", descriptor = "(I)I", line = 57)
	public final int method23399() {
		return this.aClass234_5 == null ? -1 : this.aClass234_5.anInt3766 * -1686227895;
	}

	@OriginalMember(owner = "client!zx", name = "ac", descriptor = "()I", line = 57)
	public final int method23400() {
		return this.aClass234_5 == null ? -1 : this.aClass234_5.anInt3766 * -1686227895;
	}

	@OriginalMember(owner = "client!zx", name = "w", descriptor = "(II)V", line = 61)
	public final void method23401(@OriginalArg(0) int arg0) {
		this.method23413(arg0, 0, 0, false);
	}

	@OriginalMember(owner = "client!zx", name = "at", descriptor = "(I)V", line = 61)
	public final void method23402(@OriginalArg(0) int arg0) {
		this.method23413(arg0, 0, 0, false);
	}

	@OriginalMember(owner = "client!zx", name = "av", descriptor = "(I)V", line = 61)
	public final void method23403(@OriginalArg(0) int arg0) {
		this.method23413(arg0, 0, 0, false);
	}

	@OriginalMember(owner = "client!zx", name = "as", descriptor = "(II)V", line = 65)
	public final void method23404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23413(arg0, arg1, 0, false);
	}

	@OriginalMember(owner = "client!zx", name = "t", descriptor = "(III)V", line = 65)
	public final void method23405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23413(arg0, arg1, 0, false);
	}

	@OriginalMember(owner = "client!zx", name = "ah", descriptor = "(II)V", line = 65)
	public final void method23406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23413(arg0, arg1, 0, false);
	}

	@OriginalMember(owner = "client!zx", name = "ae", descriptor = "(II)V", line = 65)
	public final void method23407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23413(arg0, arg1, 0, false);
	}

	@OriginalMember(owner = "client!zx", name = "q", descriptor = "(IZI)V", line = 69)
	public final void method23408(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method23413(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!zx", name = "am", descriptor = "(IZ)V", line = 69)
	public final void method23409(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method23413(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!zx", name = "ay", descriptor = "(IZ)V", line = 69)
	public final void method23410(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method23413(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!zx", name = "aq", descriptor = "(IZ)V", line = 69)
	public final void method23411(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method23413(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!zx", name = "x", descriptor = "(IZZI)V", line = 73)
	public final void method23412(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method23417(arg0, 0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!zx", name = "d", descriptor = "(IIIZB)V", line = 77)
	public final void method23413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method23417(arg0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!zx", name = "af", descriptor = "(IIIZ)V", line = 77)
	public final void method23414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method23417(arg0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!zx", name = "an", descriptor = "(IIIZ)V", line = 77)
	public final void method23415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method23417(arg0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!zx", name = "ab", descriptor = "(IIIZ)V", line = 77)
	public final void method23416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method23417(arg0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!zx", name = "s", descriptor = "(IIIZZI)V", line = 81)
	final void method23417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method23399()) {
			return;
		}
		if (arg0 == -1) {
			this.aClass234_5 = null;
		} else {
			if (this.aClass234_5 == null || arg0 != this.aClass234_5.anInt3766 * -1686227895) {
				this.aClass234_5 = (Class234) Class474.aClass35_Sub2_4.method18319(arg0);
				if (this.aClass234_5 == null || this.aClass234_5.anIntArray375 == null) {
					this.aClass234_5 = null;
					return;
				}
			} else if (this.aClass234_5.anInt3773 * 629077835 == 0) {
				return;
			}
			this.anInt3158 = 0;
			this.anInt3157 = arg1 * -1150119735;
			this.anInt3162 = arg2 * 1768349497;
			this.aBoolean510 = arg4;
			if (arg3) {
				this.anInt3161 = (int) (Math.random() * (double) this.aClass234_5.anIntArray375.length) * 49126185;
				this.anInt3160 = (int) (Math.random() * (double) this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087]) * 1165224707;
			} else {
				this.anInt3161 = 0;
				this.anInt3160 = 0;
			}
			this.anInt3163 = this.anInt3161 * 1049213555 + -362185365;
			if (this.anInt3163 * 892520259 < 0 || this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
				this.anInt3163 = 362185365;
			}
			if (this.anInt3157 * 1500416377 == 0) {
				this.method23472(this.aClass234_5, this.anInt3161 * -1485754087);
			}
			this.aBoolean512 = false;
		}
		this.method23479();
	}

	@OriginalMember(owner = "client!zx", name = "aa", descriptor = "(IIIZZ)V", line = 81)
	final void method23418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method23399()) {
			return;
		}
		if (arg0 == -1) {
			this.aClass234_5 = null;
		} else {
			if (this.aClass234_5 == null || arg0 != this.aClass234_5.anInt3766 * -1686227895) {
				this.aClass234_5 = (Class234) Class474.aClass35_Sub2_4.method18319(arg0);
				if (this.aClass234_5 == null || this.aClass234_5.anIntArray375 == null) {
					this.aClass234_5 = null;
					return;
				}
			} else if (this.aClass234_5.anInt3773 * 629077835 == 0) {
				return;
			}
			this.anInt3158 = 0;
			this.anInt3157 = arg1 * -1150119735;
			this.anInt3162 = arg2 * 1768349497;
			this.aBoolean510 = arg4;
			if (arg3) {
				this.anInt3161 = (int) (Math.random() * (double) this.aClass234_5.anIntArray375.length) * 49126185;
				this.anInt3160 = (int) (Math.random() * (double) this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087]) * 1165224707;
			} else {
				this.anInt3161 = 0;
				this.anInt3160 = 0;
			}
			this.anInt3163 = this.anInt3161 * 1049213555 + -362185365;
			if (this.anInt3163 * 892520259 < 0 || this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
				this.anInt3163 = 362185365;
			}
			if (this.anInt3157 * 1500416377 == 0) {
				this.method23472(this.aClass234_5, this.anInt3161 * -1485754087);
			}
			this.aBoolean512 = false;
		}
		this.method23479();
	}

	@OriginalMember(owner = "client!zx", name = "ap", descriptor = "(IIIZZ)V", line = 81)
	final void method23419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method23399()) {
			return;
		}
		if (arg0 == -1) {
			this.aClass234_5 = null;
		} else {
			if (this.aClass234_5 == null || arg0 != this.aClass234_5.anInt3766 * -1686227895) {
				this.aClass234_5 = (Class234) Class474.aClass35_Sub2_4.method18319(arg0);
				if (this.aClass234_5 == null || this.aClass234_5.anIntArray375 == null) {
					this.aClass234_5 = null;
					return;
				}
			} else if (this.aClass234_5.anInt3773 * 629077835 == 0) {
				return;
			}
			this.anInt3158 = 0;
			this.anInt3157 = arg1 * -1150119735;
			this.anInt3162 = arg2 * 1768349497;
			this.aBoolean510 = arg4;
			if (arg3) {
				this.anInt3161 = (int) (Math.random() * (double) this.aClass234_5.anIntArray375.length) * 49126185;
				this.anInt3160 = (int) (Math.random() * (double) this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087]) * 1165224707;
			} else {
				this.anInt3161 = 0;
				this.anInt3160 = 0;
			}
			this.anInt3163 = this.anInt3161 * 1049213555 + -362185365;
			if (this.anInt3163 * 892520259 < 0 || this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
				this.anInt3163 = 362185365;
			}
			if (this.anInt3157 * 1500416377 == 0) {
				this.method23472(this.aClass234_5, this.anInt3161 * -1485754087);
			}
			this.aBoolean512 = false;
		}
		this.method23479();
	}

	@OriginalMember(owner = "client!zx", name = "e", descriptor = "(Lclient!yf;I)V", line = 95)
	static void method23420(@OriginalArg(0) Class665 arg0) {
		@Pc(16) Class303 local16 = (Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anIntArray428 == null ? 0 : local16.anIntArray428.length;
	}

	@OriginalMember(owner = "client!zx", name = "aw", descriptor = "()Z", line = 116)
	public final boolean method23421() {
		return this.anInt3157 * 1500416377 != 0;
	}

	@OriginalMember(owner = "client!zx", name = "r", descriptor = "(I)Z", line = 116)
	public final boolean method23422() {
		return this.anInt3157 * 1500416377 != 0;
	}

	@OriginalMember(owner = "client!zx", name = "bc", descriptor = "()Z", line = 116)
	public final boolean method23423() {
		return this.anInt3157 * 1500416377 != 0;
	}

	@OriginalMember(owner = "client!zx", name = "az", descriptor = "()Z", line = 116)
	public final boolean method23424() {
		return this.anInt3157 * 1500416377 != 0;
	}

	@OriginalMember(owner = "client!zx", name = "bj", descriptor = "()Z", line = 116)
	public final boolean method23425() {
		return this.anInt3157 * 1500416377 != 0;
	}

	@OriginalMember(owner = "client!zx", name = "g", descriptor = "(I)I", line = 120)
	public final int method23426() {
		return this.anInt3157 * 1500416377;
	}

	@OriginalMember(owner = "client!zx", name = "bv", descriptor = "()I", line = 120)
	public final int method23427() {
		return this.anInt3157 * 1500416377;
	}

	@OriginalMember(owner = "client!zx", name = "z", descriptor = "(IB)V", line = 124)
	public final void method23428(@OriginalArg(0) int arg0) {
		this.anInt3157 = arg0 * -1150119735;
	}

	@OriginalMember(owner = "client!zx", name = "bl", descriptor = "(I)V", line = 124)
	public final void method23429(@OriginalArg(0) int arg0) {
		this.anInt3157 = arg0 * -1150119735;
	}

	@OriginalMember(owner = "client!zx", name = "bb", descriptor = "(I)V", line = 124)
	public final void method23430(@OriginalArg(0) int arg0) {
		this.anInt3157 = arg0 * -1150119735;
	}

	@OriginalMember(owner = "client!zx", name = "ba", descriptor = "(I)V", line = 124)
	public final void method23431(@OriginalArg(0) int arg0) {
		this.anInt3157 = arg0 * -1150119735;
	}

	@OriginalMember(owner = "client!zx", name = "j", descriptor = "(S)I", line = 128)
	public final int method23432() {
		if (!this.method23476()) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		if (this.method23476()) {
			local5 |= this.aClass688_9.anInt5872 * 1996767869;
			if (this.aBoolean511 && this.aClass234_5.anIntArray376 != null) {
				local5 |= this.aClass688_10.anInt5872 * 1996767869;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!zx", name = "bd", descriptor = "()I", line = 128)
	public final int method23433() {
		if (!this.method23476()) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		if (this.method23476()) {
			local5 |= this.aClass688_9.anInt5872 * 1996767869;
			if (this.aBoolean511 && this.aClass234_5.anIntArray376 != null) {
				local5 |= this.aClass688_10.anInt5872 * 1996767869;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!zx", name = "by", descriptor = "()I", line = 128)
	public final int method23434() {
		if (!this.method23476()) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		if (this.method23476()) {
			local5 |= this.aClass688_9.anInt5872 * 1996767869;
			if (this.aBoolean511 && this.aClass234_5.anIntArray376 != null) {
				local5 |= this.aClass688_10.anInt5872 * 1996767869;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!zx", name = "bx", descriptor = "()I", line = 128)
	public final int method23435() {
		if (!this.method23476()) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		if (this.method23476()) {
			local5 |= this.aClass688_9.anInt5872 * 1996767869;
			if (this.aBoolean511 && this.aClass234_5.anIntArray376 != null) {
				local5 |= this.aClass688_10.anInt5872 * 1996767869;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!zx", name = "bw", descriptor = "(Lclient!dv;I)V", line = 140)
	public final void method23436(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass234_5 != null && (this.aClass234_5.anIntArray375 != null && this.method23476())) {
			arg0.method6771(this.aClass688_9.aClass77_Sub1_Sub17_2, this.aClass688_9.anInt5874 * 1321112311, this.aClass688_9.aClass77_Sub1_Sub17_1, this.aClass688_9.anInt5873 * 1289223255, this.anInt3160 * -1237559381, this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087], arg1, this.aClass234_5.aBoolean646);
			if (this.aBoolean511 && this.aClass234_5.anIntArray376 != null && this.aClass688_10.aBoolean864) {
				arg0.method6771(this.aClass688_10.aClass77_Sub1_Sub17_2, this.aClass688_10.anInt5874 * 1321112311, this.aClass688_10.aClass77_Sub1_Sub17_1, this.aClass688_10.anInt5873 * 1289223255, this.anInt3160 * -1237559381, this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087], arg1, this.aClass234_5.aBoolean646);
			}
		}
	}

	@OriginalMember(owner = "client!zx", name = "bi", descriptor = "(Lclient!dv;I)V", line = 140)
	public final void method23437(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass234_5 != null && (this.aClass234_5.anIntArray375 != null && this.method23476())) {
			arg0.method6771(this.aClass688_9.aClass77_Sub1_Sub17_2, this.aClass688_9.anInt5874 * 1321112311, this.aClass688_9.aClass77_Sub1_Sub17_1, this.aClass688_9.anInt5873 * 1289223255, this.anInt3160 * -1237559381, this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087], arg1, this.aClass234_5.aBoolean646);
			if (this.aBoolean511 && this.aClass234_5.anIntArray376 != null && this.aClass688_10.aBoolean864) {
				arg0.method6771(this.aClass688_10.aClass77_Sub1_Sub17_2, this.aClass688_10.anInt5874 * 1321112311, this.aClass688_10.aClass77_Sub1_Sub17_1, this.aClass688_10.anInt5873 * 1289223255, this.anInt3160 * -1237559381, this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087], arg1, this.aClass234_5.aBoolean646);
			}
		}
	}

	@OriginalMember(owner = "client!zx", name = "i", descriptor = "(Lclient!dv;II)V", line = 140)
	public final void method23438(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass234_5 != null && (this.aClass234_5.anIntArray375 != null && this.method23476())) {
			arg0.method6771(this.aClass688_9.aClass77_Sub1_Sub17_2, this.aClass688_9.anInt5874 * 1321112311, this.aClass688_9.aClass77_Sub1_Sub17_1, this.aClass688_9.anInt5873 * 1289223255, this.anInt3160 * -1237559381, this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087], arg1, this.aClass234_5.aBoolean646);
			if (this.aBoolean511 && this.aClass234_5.anIntArray376 != null && this.aClass688_10.aBoolean864) {
				arg0.method6771(this.aClass688_10.aClass77_Sub1_Sub17_2, this.aClass688_10.anInt5874 * 1321112311, this.aClass688_10.aClass77_Sub1_Sub17_1, this.aClass688_10.anInt5873 * 1289223255, this.anInt3160 * -1237559381, this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087], arg1, this.aClass234_5.aBoolean646);
			}
		}
	}

	@OriginalMember(owner = "client!zx", name = "k", descriptor = "(Lclient!dv;III)V", line = 150)
	public final void method23439(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass234_5.anIntArray375 != null && this.method23476()) {
			arg0.method6776(this.aClass688_9.aClass77_Sub1_Sub17_2, this.aClass688_9.anInt5874 * 1321112311, this.aClass688_9.aClass77_Sub1_Sub17_1, this.aClass688_9.anInt5873 * 1289223255, this.anInt3160 * -1237559381, this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087], arg1, arg2, this.aClass234_5.aBoolean646, null);
			if (this.aBoolean511 && this.aClass234_5.anIntArray376 != null && this.aClass688_10.aBoolean864) {
				arg0.method6776(this.aClass688_10.aClass77_Sub1_Sub17_2, this.aClass688_10.anInt5874 * 1321112311, this.aClass688_10.aClass77_Sub1_Sub17_1, this.aClass688_10.anInt5873 * 1289223255, this.anInt3160 * -1237559381, this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087], arg1, arg2, this.aClass234_5.aBoolean646, null);
			}
		}
	}

	@OriginalMember(owner = "client!zx", name = "u", descriptor = "(Lclient!dv;I)V", line = 159)
	public final void method23440(@OriginalArg(0) Class84 arg0) {
		if (this.aClass234_5.anIntArray375 != null && this.method23476()) {
			arg0.method6783(this.aClass688_9.aClass77_Sub1_Sub17_2, this.aClass688_9.anInt5874 * 1321112311);
			if (this.aBoolean511 && this.aClass234_5.anIntArray376 != null && this.aClass688_10.aBoolean864) {
				arg0.method6783(this.aClass688_10.aClass77_Sub1_Sub17_2, this.aClass688_10.anInt5874 * 1321112311);
			}
		}
	}

	@OriginalMember(owner = "client!zx", name = "bg", descriptor = "(Lclient!dv;)V", line = 159)
	public final void method23441(@OriginalArg(0) Class84 arg0) {
		if (this.aClass234_5.anIntArray375 != null && this.method23476()) {
			arg0.method6783(this.aClass688_9.aClass77_Sub1_Sub17_2, this.aClass688_9.anInt5874 * 1321112311);
			if (this.aBoolean511 && this.aClass234_5.anIntArray376 != null && this.aClass688_10.aBoolean864) {
				arg0.method6783(this.aClass688_10.aClass77_Sub1_Sub17_2, this.aClass688_10.anInt5874 * 1321112311);
			}
		}
	}

	@OriginalMember(owner = "client!zx", name = "bs", descriptor = "(Lclient!dv;)V", line = 159)
	public final void method23442(@OriginalArg(0) Class84 arg0) {
		if (this.aClass234_5.anIntArray375 != null && this.method23476()) {
			arg0.method6783(this.aClass688_9.aClass77_Sub1_Sub17_2, this.aClass688_9.anInt5874 * 1321112311);
			if (this.aBoolean511 && this.aClass234_5.anIntArray376 != null && this.aClass688_10.aBoolean864) {
				arg0.method6783(this.aClass688_10.aClass77_Sub1_Sub17_2, this.aClass688_10.anInt5874 * 1321112311);
			}
		}
	}

	@OriginalMember(owner = "client!zx", name = "bz", descriptor = "(Lclient!dv;Lclient!zx;Lclient!zx;)V", line = 168)
	public static final void method23443(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class151 arg1, @OriginalArg(2) Class151 arg2) {
		if (arg1.method23476() && arg2.method23476()) {
			@Pc(10) Class234 local10 = arg1.aClass234_5;
			@Pc(13) Class234 local13 = arg2.aClass234_5;
			arg0.method6778(arg1.aClass688_9.aClass77_Sub1_Sub17_2, arg1.aClass688_9.anInt5874 * 1321112311, arg1.aClass688_9.aClass77_Sub1_Sub17_1, arg1.aClass688_9.anInt5873 * 1289223255, arg1.anInt3160 * -1237559381, local10.anIntArray377[arg1.anInt3161 * -1485754087], arg2.aClass688_9.aClass77_Sub1_Sub17_2, arg2.aClass688_9.anInt5874 * 1321112311, arg2.aClass688_9.aClass77_Sub1_Sub17_1, arg2.aClass688_9.anInt5873 * 1289223255, arg2.anInt3160 * -1237559381, local13.anIntArray377[arg2.anInt3161 * -1485754087], local10.aClass236_1 == null ? null : local10.aClass236_1.aBooleanArray20, local10.aBoolean646 | local13.aBoolean646);
		}
	}

	@OriginalMember(owner = "client!zx", name = "bt", descriptor = "(Lclient!dv;Lclient!zx;Lclient!zx;)V", line = 168)
	public static final void method23444(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class151 arg1, @OriginalArg(2) Class151 arg2) {
		if (arg1.method23476() && arg2.method23476()) {
			@Pc(10) Class234 local10 = arg1.aClass234_5;
			@Pc(13) Class234 local13 = arg2.aClass234_5;
			arg0.method6778(arg1.aClass688_9.aClass77_Sub1_Sub17_2, arg1.aClass688_9.anInt5874 * 1321112311, arg1.aClass688_9.aClass77_Sub1_Sub17_1, arg1.aClass688_9.anInt5873 * 1289223255, arg1.anInt3160 * -1237559381, local10.anIntArray377[arg1.anInt3161 * -1485754087], arg2.aClass688_9.aClass77_Sub1_Sub17_2, arg2.aClass688_9.anInt5874 * 1321112311, arg2.aClass688_9.aClass77_Sub1_Sub17_1, arg2.aClass688_9.anInt5873 * 1289223255, arg2.anInt3160 * -1237559381, local13.anIntArray377[arg2.anInt3161 * -1485754087], local10.aClass236_1 == null ? null : local10.aClass236_1.aBooleanArray20, local10.aBoolean646 | local13.aBoolean646);
		}
	}

	@OriginalMember(owner = "client!zx", name = "f", descriptor = "(B)Z", line = 176)
	public final boolean method23445() {
		return this.aBoolean512;
	}

	@OriginalMember(owner = "client!zx", name = "bu", descriptor = "()Z", line = 176)
	public final boolean method23446() {
		return this.aBoolean512;
	}

	@OriginalMember(owner = "client!zx", name = "bf", descriptor = "()Z", line = 176)
	public final boolean method23447() {
		return this.aBoolean512;
	}

	@OriginalMember(owner = "client!zx", name = "bn", descriptor = "()Z", line = 176)
	public final boolean method23448() {
		return this.aBoolean512;
	}

	@OriginalMember(owner = "client!zx", name = "bp", descriptor = "()V", line = 180)
	public final void method23449() {
		this.anInt3158 = 0;
	}

	@OriginalMember(owner = "client!zx", name = "o", descriptor = "(B)V", line = 180)
	public final void method23450() {
		this.anInt3158 = 0;
	}

	@OriginalMember(owner = "client!zx", name = "bo", descriptor = "()V", line = 180)
	public final void method23451() {
		this.anInt3158 = 0;
	}

	@OriginalMember(owner = "client!zx", name = "bm", descriptor = "()V", line = 180)
	public final void method23452() {
		this.anInt3158 = 0;
	}

	@OriginalMember(owner = "client!zx", name = "bk", descriptor = "()V", line = 180)
	public final void method23453() {
		this.anInt3158 = 0;
	}

	@OriginalMember(owner = "client!zx", name = "br", descriptor = "()V", line = 180)
	public final void method23454() {
		this.anInt3158 = 0;
	}

	@OriginalMember(owner = "client!zx", name = "bq", descriptor = "()V", line = 184)
	public final void method23455() {
		this.method23460(0);
	}

	@OriginalMember(owner = "client!zx", name = "bh", descriptor = "()V", line = 184)
	public final void method23456() {
		this.method23460(0);
	}

	@OriginalMember(owner = "client!zx", name = "b", descriptor = "(I)V", line = 184)
	public final void method23457() {
		this.method23460(0);
	}

	@OriginalMember(owner = "client!zx", name = "be", descriptor = "()V", line = 184)
	public final void method23458() {
		this.method23460(0);
	}

	@OriginalMember(owner = "client!zx", name = "cb", descriptor = "()V", line = 184)
	public final void method23459() {
		this.method23460(0);
	}

	@OriginalMember(owner = "client!zx", name = "n", descriptor = "(II)V", line = 188)
	public final void method23460(@OriginalArg(0) int arg0) {
		this.anInt3161 = 0;
		this.anInt3163 = (this.aClass234_5.anIntArray375.length > 1 ? 1 : -1) * -362185365;
		this.anInt3160 = 0;
		this.aBoolean512 = false;
		this.anInt3157 = arg0 * -1150119735;
		this.anInt3158 = 0;
		if (this.aClass234_5 != null & this.aClass234_5.anIntArray375 != null) {
			this.method23472(this.aClass234_5, this.anInt3161 * -1485754087);
			this.method23479();
		}
	}

	@OriginalMember(owner = "client!zx", name = "cg", descriptor = "(I)V", line = 188)
	public final void method23461(@OriginalArg(0) int arg0) {
		this.anInt3161 = 0;
		this.anInt3163 = (this.aClass234_5.anIntArray375.length > 1 ? 1 : -1) * -362185365;
		this.anInt3160 = 0;
		this.aBoolean512 = false;
		this.anInt3157 = arg0 * -1150119735;
		this.anInt3158 = 0;
		if (this.aClass234_5 != null & this.aClass234_5.anIntArray375 != null) {
			this.method23472(this.aClass234_5, this.anInt3161 * -1485754087);
			this.method23479();
		}
	}

	@OriginalMember(owner = "client!zx", name = "cc", descriptor = "(I)V", line = 188)
	public final void method23462(@OriginalArg(0) int arg0) {
		this.anInt3161 = 0;
		this.anInt3163 = (this.aClass234_5.anIntArray375.length > 1 ? 1 : -1) * -362185365;
		this.anInt3160 = 0;
		this.aBoolean512 = false;
		this.anInt3157 = arg0 * -1150119735;
		this.anInt3158 = 0;
		if (this.aClass234_5 != null & this.aClass234_5.anIntArray375 != null) {
			this.method23472(this.aClass234_5, this.anInt3161 * -1485754087);
			this.method23479();
		}
	}

	@OriginalMember(owner = "client!zx", name = "a", descriptor = "(IB)Z", line = 201)
	public final boolean method23463(@OriginalArg(0) int arg0) {
		if (this.aClass234_5 == null || arg0 == 0) {
			return false;
		}
		if (this.anInt3157 * 1500416377 > 0) {
			if (this.anInt3157 * 1500416377 > arg0) {
				this.anInt3157 -= arg0 * -1150119735;
				return false;
			}
			arg0 -= this.anInt3157 * 1500416377;
			this.anInt3157 = 0;
			this.method23472(this.aClass234_5, this.anInt3161 * -1485754087);
		}
		arg0 += this.anInt3160 * -1237559381;
		@Pc(61) boolean local61 = this.aClass234_5.aBoolean648 | Class234.aBoolean647;
		if (arg0 > 100 && this.aClass234_5.anInt3765 * 1218058879 > 0) {
			@Pc(81) int local81 = this.aClass234_5.anIntArray375.length - this.aClass234_5.anInt3765 * 1218058879;
			while (this.anInt3161 * -1485754087 < local81 && arg0 > this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087]) {
				arg0 -= this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087];
				this.anInt3161 += 49126185;
			}
			if (this.anInt3161 * -1485754087 >= local81) {
				@Pc(123) int local123 = 0;
				for (@Pc(125) int local125 = local81; local125 < this.aClass234_5.anIntArray375.length; local125++) {
					local123 += this.aClass234_5.anIntArray377[local125];
				}
				if (this.anInt3162 * 116154121 == 0) {
					this.anInt3158 += arg0 / local123 * -303458915;
				}
				arg0 %= local123;
			}
			this.anInt3163 = this.anInt3161 * 1049213555 + -362185365;
			if (this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
				if (this.aClass234_5.anInt3765 * 1218058879 == -1 && this.aBoolean510) {
					this.anInt3163 = 0;
				} else {
					this.anInt3163 -= this.aClass234_5.anInt3765 * -1955588587;
				}
				if (this.anInt3163 * 892520259 < 0 || this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
					this.anInt3163 = 362185365;
				}
			}
			local61 = true;
		}
		while (arg0 > this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087]) {
			local61 = true;
			arg0 -= this.aClass234_5.anIntArray377[(this.anInt3161 += 49126185) * -1485754087 - 1];
			if (this.anInt3161 * -1485754087 >= this.aClass234_5.anIntArray375.length) {
				if (this.aClass234_5.anInt3765 * 1218058879 != -1 && this.anInt3162 * 116154121 != 2) {
					this.anInt3161 -= this.aClass234_5.anInt3765 * 1951146839;
					if (this.anInt3162 * 116154121 == 0) {
						this.anInt3158 += -303458915;
					}
				}
				if (this.anInt3158 * 265590965 >= this.aClass234_5.anInt3771 * 1211421917 || this.anInt3161 * -1485754087 < 0 || this.anInt3161 * -1485754087 >= this.aClass234_5.anIntArray375.length) {
					this.aBoolean512 = true;
					break;
				}
			}
			this.method23472(this.aClass234_5, this.anInt3161 * -1485754087);
			this.anInt3163 = this.anInt3161 * 1049213555 + -362185365;
			if (this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
				if (this.aClass234_5.anInt3765 * 1218058879 == -1 && this.aBoolean510) {
					this.anInt3163 = 0;
				} else {
					this.anInt3163 -= this.aClass234_5.anInt3765 * -1955588587;
				}
				if (this.anInt3163 * 892520259 < 0 || this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
					this.anInt3163 = 362185365;
				}
			}
		}
		this.anInt3160 = arg0 * 1165224707;
		if (local61) {
			this.method23479();
		}
		return local61;
	}

	@OriginalMember(owner = "client!zx", name = "cf", descriptor = "(I)Z", line = 201)
	public final boolean method23464(@OriginalArg(0) int arg0) {
		if (this.aClass234_5 == null || arg0 == 0) {
			return false;
		}
		if (this.anInt3157 * 1500416377 > 0) {
			if (this.anInt3157 * 1500416377 > arg0) {
				this.anInt3157 -= arg0 * -1150119735;
				return false;
			}
			arg0 -= this.anInt3157 * 1500416377;
			this.anInt3157 = 0;
			this.method23472(this.aClass234_5, this.anInt3161 * -1485754087);
		}
		arg0 += this.anInt3160 * -1237559381;
		@Pc(61) boolean local61 = this.aClass234_5.aBoolean648 | Class234.aBoolean647;
		if (arg0 > 100 && this.aClass234_5.anInt3765 * 1218058879 > 0) {
			@Pc(81) int local81 = this.aClass234_5.anIntArray375.length - this.aClass234_5.anInt3765 * 1218058879;
			while (this.anInt3161 * -1485754087 < local81 && arg0 > this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087]) {
				arg0 -= this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087];
				this.anInt3161 += 49126185;
			}
			if (this.anInt3161 * -1485754087 >= local81) {
				@Pc(123) int local123 = 0;
				for (@Pc(125) int local125 = local81; local125 < this.aClass234_5.anIntArray375.length; local125++) {
					local123 += this.aClass234_5.anIntArray377[local125];
				}
				if (this.anInt3162 * 116154121 == 0) {
					this.anInt3158 += arg0 / local123 * -303458915;
				}
				arg0 %= local123;
			}
			this.anInt3163 = this.anInt3161 * 1049213555 + -362185365;
			if (this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
				if (this.aClass234_5.anInt3765 * 1218058879 == -1 && this.aBoolean510) {
					this.anInt3163 = 0;
				} else {
					this.anInt3163 -= this.aClass234_5.anInt3765 * -1955588587;
				}
				if (this.anInt3163 * 892520259 < 0 || this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
					this.anInt3163 = 362185365;
				}
			}
			local61 = true;
		}
		while (arg0 > this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087]) {
			local61 = true;
			arg0 -= this.aClass234_5.anIntArray377[(this.anInt3161 += 49126185) * -1485754087 - 1];
			if (this.anInt3161 * -1485754087 >= this.aClass234_5.anIntArray375.length) {
				if (this.aClass234_5.anInt3765 * 1218058879 != -1 && this.anInt3162 * 116154121 != 2) {
					this.anInt3161 -= this.aClass234_5.anInt3765 * 1951146839;
					if (this.anInt3162 * 116154121 == 0) {
						this.anInt3158 += -303458915;
					}
				}
				if (this.anInt3158 * 265590965 >= this.aClass234_5.anInt3771 * 1211421917 || this.anInt3161 * -1485754087 < 0 || this.anInt3161 * -1485754087 >= this.aClass234_5.anIntArray375.length) {
					this.aBoolean512 = true;
					break;
				}
			}
			this.method23472(this.aClass234_5, this.anInt3161 * -1485754087);
			this.anInt3163 = this.anInt3161 * 1049213555 + -362185365;
			if (this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
				if (this.aClass234_5.anInt3765 * 1218058879 == -1 && this.aBoolean510) {
					this.anInt3163 = 0;
				} else {
					this.anInt3163 -= this.aClass234_5.anInt3765 * -1955588587;
				}
				if (this.anInt3163 * 892520259 < 0 || this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
					this.anInt3163 = 362185365;
				}
			}
		}
		this.anInt3160 = arg0 * 1165224707;
		if (local61) {
			this.method23479();
		}
		return local61;
	}

	@OriginalMember(owner = "client!zx", name = "cl", descriptor = "(I)Z", line = 201)
	public final boolean method23465(@OriginalArg(0) int arg0) {
		if (this.aClass234_5 == null || arg0 == 0) {
			return false;
		}
		if (this.anInt3157 * 1500416377 > 0) {
			if (this.anInt3157 * 1500416377 > arg0) {
				this.anInt3157 -= arg0 * -1150119735;
				return false;
			}
			arg0 -= this.anInt3157 * 1500416377;
			this.anInt3157 = 0;
			this.method23472(this.aClass234_5, this.anInt3161 * -1485754087);
		}
		arg0 += this.anInt3160 * -1237559381;
		@Pc(61) boolean local61 = this.aClass234_5.aBoolean648 | Class234.aBoolean647;
		if (arg0 > 100 && this.aClass234_5.anInt3765 * 1218058879 > 0) {
			@Pc(81) int local81 = this.aClass234_5.anIntArray375.length - this.aClass234_5.anInt3765 * 1218058879;
			while (this.anInt3161 * -1485754087 < local81 && arg0 > this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087]) {
				arg0 -= this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087];
				this.anInt3161 += 49126185;
			}
			if (this.anInt3161 * -1485754087 >= local81) {
				@Pc(123) int local123 = 0;
				for (@Pc(125) int local125 = local81; local125 < this.aClass234_5.anIntArray375.length; local125++) {
					local123 += this.aClass234_5.anIntArray377[local125];
				}
				if (this.anInt3162 * 116154121 == 0) {
					this.anInt3158 += arg0 / local123 * -303458915;
				}
				arg0 %= local123;
			}
			this.anInt3163 = this.anInt3161 * 1049213555 + -362185365;
			if (this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
				if (this.aClass234_5.anInt3765 * 1218058879 == -1 && this.aBoolean510) {
					this.anInt3163 = 0;
				} else {
					this.anInt3163 -= this.aClass234_5.anInt3765 * -1955588587;
				}
				if (this.anInt3163 * 892520259 < 0 || this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
					this.anInt3163 = 362185365;
				}
			}
			local61 = true;
		}
		while (arg0 > this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087]) {
			local61 = true;
			arg0 -= this.aClass234_5.anIntArray377[(this.anInt3161 += 49126185) * -1485754087 - 1];
			if (this.anInt3161 * -1485754087 >= this.aClass234_5.anIntArray375.length) {
				if (this.aClass234_5.anInt3765 * 1218058879 != -1 && this.anInt3162 * 116154121 != 2) {
					this.anInt3161 -= this.aClass234_5.anInt3765 * 1951146839;
					if (this.anInt3162 * 116154121 == 0) {
						this.anInt3158 += -303458915;
					}
				}
				if (this.anInt3158 * 265590965 >= this.aClass234_5.anInt3771 * 1211421917 || this.anInt3161 * -1485754087 < 0 || this.anInt3161 * -1485754087 >= this.aClass234_5.anIntArray375.length) {
					this.aBoolean512 = true;
					break;
				}
			}
			this.method23472(this.aClass234_5, this.anInt3161 * -1485754087);
			this.anInt3163 = this.anInt3161 * 1049213555 + -362185365;
			if (this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
				if (this.aClass234_5.anInt3765 * 1218058879 == -1 && this.aBoolean510) {
					this.anInt3163 = 0;
				} else {
					this.anInt3163 -= this.aClass234_5.anInt3765 * -1955588587;
				}
				if (this.anInt3163 * 892520259 < 0 || this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
					this.anInt3163 = 362185365;
				}
			}
		}
		this.anInt3160 = arg0 * 1165224707;
		if (local61) {
			this.method23479();
		}
		return local61;
	}

	@OriginalMember(owner = "client!zx", name = "cp", descriptor = "(I)Z", line = 201)
	public final boolean method23466(@OriginalArg(0) int arg0) {
		if (this.aClass234_5 == null || arg0 == 0) {
			return false;
		}
		if (this.anInt3157 * 1500416377 > 0) {
			if (this.anInt3157 * 1500416377 > arg0) {
				this.anInt3157 -= arg0 * -1150119735;
				return false;
			}
			arg0 -= this.anInt3157 * 1500416377;
			this.anInt3157 = 0;
			this.method23472(this.aClass234_5, this.anInt3161 * -1485754087);
		}
		arg0 += this.anInt3160 * -1237559381;
		@Pc(61) boolean local61 = this.aClass234_5.aBoolean648 | Class234.aBoolean647;
		if (arg0 > 100 && this.aClass234_5.anInt3765 * 1218058879 > 0) {
			@Pc(81) int local81 = this.aClass234_5.anIntArray375.length - this.aClass234_5.anInt3765 * 1218058879;
			while (this.anInt3161 * -1485754087 < local81 && arg0 > this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087]) {
				arg0 -= this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087];
				this.anInt3161 += 49126185;
			}
			if (this.anInt3161 * -1485754087 >= local81) {
				@Pc(123) int local123 = 0;
				for (@Pc(125) int local125 = local81; local125 < this.aClass234_5.anIntArray375.length; local125++) {
					local123 += this.aClass234_5.anIntArray377[local125];
				}
				if (this.anInt3162 * 116154121 == 0) {
					this.anInt3158 += arg0 / local123 * -303458915;
				}
				arg0 %= local123;
			}
			this.anInt3163 = this.anInt3161 * 1049213555 + -362185365;
			if (this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
				if (this.aClass234_5.anInt3765 * 1218058879 == -1 && this.aBoolean510) {
					this.anInt3163 = 0;
				} else {
					this.anInt3163 -= this.aClass234_5.anInt3765 * -1955588587;
				}
				if (this.anInt3163 * 892520259 < 0 || this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
					this.anInt3163 = 362185365;
				}
			}
			local61 = true;
		}
		while (arg0 > this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087]) {
			local61 = true;
			arg0 -= this.aClass234_5.anIntArray377[(this.anInt3161 += 49126185) * -1485754087 - 1];
			if (this.anInt3161 * -1485754087 >= this.aClass234_5.anIntArray375.length) {
				if (this.aClass234_5.anInt3765 * 1218058879 != -1 && this.anInt3162 * 116154121 != 2) {
					this.anInt3161 -= this.aClass234_5.anInt3765 * 1951146839;
					if (this.anInt3162 * 116154121 == 0) {
						this.anInt3158 += -303458915;
					}
				}
				if (this.anInt3158 * 265590965 >= this.aClass234_5.anInt3771 * 1211421917 || this.anInt3161 * -1485754087 < 0 || this.anInt3161 * -1485754087 >= this.aClass234_5.anIntArray375.length) {
					this.aBoolean512 = true;
					break;
				}
			}
			this.method23472(this.aClass234_5, this.anInt3161 * -1485754087);
			this.anInt3163 = this.anInt3161 * 1049213555 + -362185365;
			if (this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
				if (this.aClass234_5.anInt3765 * 1218058879 == -1 && this.aBoolean510) {
					this.anInt3163 = 0;
				} else {
					this.anInt3163 -= this.aClass234_5.anInt3765 * -1955588587;
				}
				if (this.anInt3163 * 892520259 < 0 || this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
					this.anInt3163 = 362185365;
				}
			}
		}
		this.anInt3160 = arg0 * 1165224707;
		if (local61) {
			this.method23479();
		}
		return local61;
	}

	@OriginalMember(owner = "client!zx", name = "cw", descriptor = "(I)Z", line = 201)
	public final boolean method23467(@OriginalArg(0) int arg0) {
		if (this.aClass234_5 == null || arg0 == 0) {
			return false;
		}
		if (this.anInt3157 * 1500416377 > 0) {
			if (this.anInt3157 * 1500416377 > arg0) {
				this.anInt3157 -= arg0 * -1150119735;
				return false;
			}
			arg0 -= this.anInt3157 * 1500416377;
			this.anInt3157 = 0;
			this.method23472(this.aClass234_5, this.anInt3161 * -1485754087);
		}
		arg0 += this.anInt3160 * -1237559381;
		@Pc(61) boolean local61 = this.aClass234_5.aBoolean648 | Class234.aBoolean647;
		if (arg0 > 100 && this.aClass234_5.anInt3765 * 1218058879 > 0) {
			@Pc(81) int local81 = this.aClass234_5.anIntArray375.length - this.aClass234_5.anInt3765 * 1218058879;
			while (this.anInt3161 * -1485754087 < local81 && arg0 > this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087]) {
				arg0 -= this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087];
				this.anInt3161 += 49126185;
			}
			if (this.anInt3161 * -1485754087 >= local81) {
				@Pc(123) int local123 = 0;
				for (@Pc(125) int local125 = local81; local125 < this.aClass234_5.anIntArray375.length; local125++) {
					local123 += this.aClass234_5.anIntArray377[local125];
				}
				if (this.anInt3162 * 116154121 == 0) {
					this.anInt3158 += arg0 / local123 * -303458915;
				}
				arg0 %= local123;
			}
			this.anInt3163 = this.anInt3161 * 1049213555 + -362185365;
			if (this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
				if (this.aClass234_5.anInt3765 * 1218058879 == -1 && this.aBoolean510) {
					this.anInt3163 = 0;
				} else {
					this.anInt3163 -= this.aClass234_5.anInt3765 * -1955588587;
				}
				if (this.anInt3163 * 892520259 < 0 || this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
					this.anInt3163 = 362185365;
				}
			}
			local61 = true;
		}
		while (arg0 > this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087]) {
			local61 = true;
			arg0 -= this.aClass234_5.anIntArray377[(this.anInt3161 += 49126185) * -1485754087 - 1];
			if (this.anInt3161 * -1485754087 >= this.aClass234_5.anIntArray375.length) {
				if (this.aClass234_5.anInt3765 * 1218058879 != -1 && this.anInt3162 * 116154121 != 2) {
					this.anInt3161 -= this.aClass234_5.anInt3765 * 1951146839;
					if (this.anInt3162 * 116154121 == 0) {
						this.anInt3158 += -303458915;
					}
				}
				if (this.anInt3158 * 265590965 >= this.aClass234_5.anInt3771 * 1211421917 || this.anInt3161 * -1485754087 < 0 || this.anInt3161 * -1485754087 >= this.aClass234_5.anIntArray375.length) {
					this.aBoolean512 = true;
					break;
				}
			}
			this.method23472(this.aClass234_5, this.anInt3161 * -1485754087);
			this.anInt3163 = this.anInt3161 * 1049213555 + -362185365;
			if (this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
				if (this.aClass234_5.anInt3765 * 1218058879 == -1 && this.aBoolean510) {
					this.anInt3163 = 0;
				} else {
					this.anInt3163 -= this.aClass234_5.anInt3765 * -1955588587;
				}
				if (this.anInt3163 * 892520259 < 0 || this.anInt3163 * 892520259 >= this.aClass234_5.anIntArray375.length) {
					this.anInt3163 = 362185365;
				}
			}
		}
		this.anInt3160 = arg0 * 1165224707;
		if (local61) {
			this.method23479();
		}
		return local61;
	}

	@OriginalMember(owner = "client!zx", name = "i", descriptor = "(Lclient!dx;I)I", line = 235)
	public static int method23468(@OriginalArg(0) Class86 arg0) {
		Class539.method30908();
		return Class529.aTwitchTV1.StopStreaming();
	}

	@OriginalMember(owner = "client!zx", name = "m", descriptor = "(II)Z", line = 260)
	public final boolean method23469(@OriginalArg(0) int arg0) {
		@Pc(13) int local13;
		return this.aClass234_5 == null | (local13 = arg0 - this.anInt3157 * 1500416377) <= 0 ? false : this.aClass234_5.aBoolean648 | local13 + this.anInt3160 * -1237559381 > this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087];
	}

	@OriginalMember(owner = "client!zx", name = "ck", descriptor = "(I)Z", line = 260)
	public final boolean method23470(@OriginalArg(0) int arg0) {
		@Pc(13) int local13;
		return this.aClass234_5 == null | (local13 = arg0 - this.anInt3157 * 1500416377) <= 0 ? false : this.aClass234_5.aBoolean648 | local13 + this.anInt3160 * -1237559381 > this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087];
	}

	@OriginalMember(owner = "client!zx", name = "ch", descriptor = "(I)Z", line = 260)
	public final boolean method23471(@OriginalArg(0) int arg0) {
		@Pc(13) int local13;
		return this.aClass234_5 == null | (local13 = arg0 - this.anInt3157 * 1500416377) <= 0 ? false : this.aClass234_5.aBoolean648 | local13 + this.anInt3160 * -1237559381 > this.aClass234_5.anIntArray377[this.anInt3161 * -1485754087];
	}

	@OriginalMember(owner = "client!zx", name = "h", descriptor = "(Lclient!et;II)V", line = 264)
	void method23472(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!zx", name = "ag", descriptor = "(Lclient!et;I)V", line = 264)
	void method23473(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!zx", name = "al", descriptor = "(Lclient!et;I)V", line = 264)
	void method23474(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!zx", name = "ao", descriptor = "(Lclient!et;I)V", line = 264)
	void method23475(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!zx", name = "aj", descriptor = "(I)Z", line = 267)
	final boolean method23476() {
		if (this.aClass234_5 == null) {
			return false;
		}
		@Pc(22) boolean local22 = this.aClass688_9.method36291(Class474.aClass35_Sub2_4, this.aClass234_5, this.anInt3161 * -1485754087, this.anInt3163 * 892520259, this.aClass234_5.anIntArray375);
		if (local22 && this.aBoolean511 && this.aClass234_5.anIntArray376 != null) {
			this.aClass688_10.method36291(Class474.aClass35_Sub2_4, this.aClass234_5, this.anInt3161 * -1485754087, this.anInt3163 * 892520259, this.aClass234_5.anIntArray376);
		}
		return local22;
	}

	@OriginalMember(owner = "client!zx", name = "cz", descriptor = "()Z", line = 267)
	final boolean method23477() {
		if (this.aClass234_5 == null) {
			return false;
		}
		@Pc(22) boolean local22 = this.aClass688_9.method36291(Class474.aClass35_Sub2_4, this.aClass234_5, this.anInt3161 * -1485754087, this.anInt3163 * 892520259, this.aClass234_5.anIntArray375);
		if (local22 && this.aBoolean511 && this.aClass234_5.anIntArray376 != null) {
			this.aClass688_10.method36291(Class474.aClass35_Sub2_4, this.aClass234_5, this.anInt3161 * -1485754087, this.anInt3163 * 892520259, this.aClass234_5.anIntArray376);
		}
		return local22;
	}

	@OriginalMember(owner = "client!zx", name = "ca", descriptor = "()Z", line = 267)
	final boolean method23478() {
		if (this.aClass234_5 == null) {
			return false;
		}
		@Pc(22) boolean local22 = this.aClass688_9.method36291(Class474.aClass35_Sub2_4, this.aClass234_5, this.anInt3161 * -1485754087, this.anInt3163 * 892520259, this.aClass234_5.anIntArray375);
		if (local22 && this.aBoolean511 && this.aClass234_5.anIntArray376 != null) {
			this.aClass688_10.method36291(Class474.aClass35_Sub2_4, this.aClass234_5, this.anInt3161 * -1485754087, this.anInt3163 * 892520259, this.aClass234_5.anIntArray376);
		}
		return local22;
	}

	@OriginalMember(owner = "client!zx", name = "ai", descriptor = "(I)V", line = 276)
	final void method23479() {
		this.aClass688_9.method36294();
		if (this.aBoolean511) {
			this.aClass688_10.method36294();
		}
	}

	@OriginalMember(owner = "client!zx", name = "cr", descriptor = "()V", line = 276)
	final void method23480() {
		this.aClass688_9.method36294();
		if (this.aBoolean511) {
			this.aClass688_10.method36294();
		}
	}

	@OriginalMember(owner = "client!zx", name = "cx", descriptor = "()V", line = 276)
	final void method23481() {
		this.aClass688_9.method36294();
		if (this.aBoolean511) {
			this.aClass688_10.method36294();
		}
	}

	@OriginalMember(owner = "client!zx", name = "eq", descriptor = "(IB)V", line = 882)
	public static void method23482(@OriginalArg(0) int arg0) {
		@Pc(5) Class1 local5 = (Class1) Class136_Sub1.aHashMap5.get(arg0);
		if (local5 == null) {
			local5 = new Class1();
		}
		local5.anInt2 = Class136_Sub1.anInt1697 * -1551336507;
		local5.anInt1 = Class136_Sub1.anInt1708 * -1184677759;
		Class136_Sub1.aHashMap5.put(arg0, local5);
	}

	@OriginalMember(owner = "client!zx", name = "bf", descriptor = "(IIII)Lclient!ajt;", line = 1889)
	static Class77_Sub20 method23483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) Class77_Sub20 local1 = null;
		if (arg2 == 0) {
			local1 = Class365.method28132(Class414.aClass414_2, client.aClass82_2.aClass16_1);
		}
		if (arg2 == 1) {
			local1 = Class365.method28132(Class414.aClass414_44, client.aClass82_2.aClass16_1);
		}
		@Pc(22) Class595 local22 = client.aClass517_1.method30409();
		local1.aClass77_Sub39_Sub1_2.method22609(local22.anInt5504 * -424199969 + arg0);
		local1.aClass77_Sub39_Sub1_2.method22610(arg1 + local22.anInt5506 * -1166289421);
		local1.aClass77_Sub39_Sub1_2.method22578(Class485.method29881() ? 1 : 0);
		Class156.anInt3234 = arg0 * -1660827629;
		Class156.anInt3235 = arg1 * 517634255;
		Class156.aBoolean551 = false;
		Class127_Sub3.method12944();
		return local1;
	}
}
