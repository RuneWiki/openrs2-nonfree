package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaq")
public class Class19 {

	@OriginalMember(owner = "client!aaq", name = "m", descriptor = "I")
	public static final int anInt3215 = 2;

	@OriginalMember(owner = "client!aaq", name = "e", descriptor = "I")
	public static final int anInt3220 = 0;

	@OriginalMember(owner = "client!aaq", name = "n", descriptor = "I")
	public static final int anInt3222 = 1;

	@OriginalMember(owner = "client!aaq", name = "hu", descriptor = "Lclient!aoh;")
	public static Class32_Sub7 aClass32_Sub7_5;

	@OriginalMember(owner = "client!aaq", name = "k", descriptor = "Lclient!fg;")
	Class263 aClass263_5;

	@OriginalMember(owner = "client!aaq", name = "f", descriptor = "I")
	int anInt3216;

	@OriginalMember(owner = "client!aaq", name = "w", descriptor = "I")
	int anInt3217;

	@OriginalMember(owner = "client!aaq", name = "l", descriptor = "I")
	int anInt3218;

	@OriginalMember(owner = "client!aaq", name = "z", descriptor = "I")
	int anInt3219;

	@OriginalMember(owner = "client!aaq", name = "u", descriptor = "I")
	int anInt3223;

	@OriginalMember(owner = "client!aaq", name = "p", descriptor = "Z")
	boolean aBoolean532 = false;

	@OriginalMember(owner = "client!aaq", name = "d", descriptor = "Z")
	boolean aBoolean530 = false;

	@OriginalMember(owner = "client!aaq", name = "c", descriptor = "I")
	int anInt3221 = 0;

	@OriginalMember(owner = "client!aaq", name = "r", descriptor = "Z")
	boolean aBoolean531 = false;

	@OriginalMember(owner = "client!aaq", name = "o", descriptor = "Lclient!aau;")
	final Class23 aClass23_10;

	@OriginalMember(owner = "client!aaq", name = "y", descriptor = "Lclient!aao;")
	final Class17 aClass17_5;

	@OriginalMember(owner = "client!aaq", name = "s", descriptor = "Lclient!aau;")
	final Class23 aClass23_9;

	@OriginalMember(owner = "client!aaq", name = "n", descriptor = "(I)Lclient!ajq;", line = 19)
	static Class149_Sub5 method23635() {
		@Pc(4) Class149_Sub5 local4 = (Class149_Sub5) Class149_Sub5.aClass21_3.method381();
		if (local4 == null) {
			return new Class149_Sub5();
		} else {
			Class149_Sub5.anInt1448 -= 1630361431;
			return local4;
		}
	}

	@OriginalMember(owner = "client!aaq", name = "as", descriptor = "(Lclient!aos;)V", line = 28)
	public static void method23580(@OriginalArg(0) Class32_Sub17 arg0) {
		RuntimeException_Sub2.aClass32_Sub17_24 = arg0;
	}

	@OriginalMember(owner = "client!aaq", name = "at", descriptor = "(Lclient!aos;)V", line = 28)
	public static void method23583(@OriginalArg(0) Class32_Sub17 arg0) {
		RuntimeException_Sub2.aClass32_Sub17_24 = arg0;
	}

	@OriginalMember(owner = "client!aaq", name = "aw", descriptor = "(Lclient!aos;)V", line = 28)
	public static void method23615(@OriginalArg(0) Class32_Sub17 arg0) {
		RuntimeException_Sub2.aClass32_Sub17_24 = arg0;
	}

	@OriginalMember(owner = "client!aaq", name = "<init>", descriptor = "(Z)V", line = 31)
	Class19(@OriginalArg(0) boolean arg0) {
		this.aBoolean530 = arg0;
		this.aClass23_10 = new Class23();
		this.aClass17_5 = new Class17();
		if (this.aBoolean530) {
			this.aClass23_9 = new Class23();
		} else {
			this.aClass23_9 = null;
		}
	}

	@OriginalMember(owner = "client!aaq", name = "n", descriptor = "(Lclient!aaq;I)V", line = 40)
	public final void method23576(@OriginalArg(0) Class19 arg0) {
		this.aClass263_5 = arg0.aClass263_5;
		this.aBoolean532 = arg0.aBoolean532;
		this.aBoolean530 = arg0.aBoolean530;
		this.anInt3217 = arg0.anInt3217;
		this.anInt3218 = arg0.anInt3218;
		this.anInt3223 = arg0.anInt3223;
		this.anInt3219 = arg0.anInt3219;
		this.anInt3216 = arg0.anInt3216;
		this.method23579();
	}

	@OriginalMember(owner = "client!aaq", name = "ad", descriptor = "(Lclient!aaq;)V", line = 40)
	public final void method23577(@OriginalArg(0) Class19 arg0) {
		this.aClass263_5 = arg0.aClass263_5;
		this.aBoolean532 = arg0.aBoolean532;
		this.aBoolean530 = arg0.aBoolean530;
		this.anInt3217 = arg0.anInt3217;
		this.anInt3218 = arg0.anInt3218;
		this.anInt3223 = arg0.anInt3223;
		this.anInt3219 = arg0.anInt3219;
		this.anInt3216 = arg0.anInt3216;
		this.method23579();
	}

	@OriginalMember(owner = "client!aaq", name = "au", descriptor = "()Z", line = 52)
	public final boolean method23550() {
		return this.aClass263_5 != null;
	}

	@OriginalMember(owner = "client!aaq", name = "m", descriptor = "(I)Z", line = 52)
	public final boolean method23552() {
		return this.aClass263_5 != null;
	}

	@OriginalMember(owner = "client!aaq", name = "am", descriptor = "()Z", line = 52)
	public final boolean method23585() {
		return this.aClass263_5 != null;
	}

	@OriginalMember(owner = "client!aaq", name = "ar", descriptor = "()Z", line = 52)
	public final boolean method23586() {
		return this.aClass263_5 != null;
	}

	@OriginalMember(owner = "client!aaq", name = "k", descriptor = "(I)Lclient!fg;", line = 56)
	public final Class263 method23553() {
		return this.aClass263_5;
	}

	@OriginalMember(owner = "client!aaq", name = "ap", descriptor = "()Lclient!fg;", line = 56)
	public final Class263 method23587() {
		return this.aClass263_5;
	}

	@OriginalMember(owner = "client!aaq", name = "aq", descriptor = "()Lclient!fg;", line = 56)
	public final Class263 method23588() {
		return this.aClass263_5;
	}

	@OriginalMember(owner = "client!aaq", name = "ax", descriptor = "()Lclient!fg;", line = 56)
	public final Class263 method23589() {
		return this.aClass263_5;
	}

	@OriginalMember(owner = "client!aaq", name = "f", descriptor = "(B)I", line = 60)
	public final int method23554() {
		return this.aClass263_5 == null ? -1 : this.aClass263_5.anInt3869 * 1707631335;
	}

	@OriginalMember(owner = "client!aaq", name = "av", descriptor = "()I", line = 60)
	public final int method23590() {
		return this.aClass263_5 == null ? -1 : this.aClass263_5.anInt3869 * 1707631335;
	}

	@OriginalMember(owner = "client!aaq", name = "w", descriptor = "(II)V", line = 64)
	public final void method23568(@OriginalArg(0) int arg0) {
		this.method23559(arg0, 0, 0, false);
	}

	@OriginalMember(owner = "client!aaq", name = "l", descriptor = "(III)V", line = 68)
	public final void method23556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method23559(arg0, arg1, 0, false);
	}

	@OriginalMember(owner = "client!aaq", name = "u", descriptor = "(IZI)V", line = 72)
	public final void method23557(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method23559(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!aaq", name = "z", descriptor = "(IZZB)V", line = 76)
	public final void method23558(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method23560(arg0, 0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aaq", name = "ao", descriptor = "(IZZ)V", line = 76)
	public final void method23591(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method23560(arg0, 0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aaq", name = "aj", descriptor = "(IZZ)V", line = 76)
	public final void method23592(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method23560(arg0, 0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aaq", name = "p", descriptor = "(IIIZS)V", line = 80)
	public final void method23559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method23560(arg0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!aaq", name = "ay", descriptor = "(IIIZ)V", line = 80)
	public final void method23593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method23560(arg0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!aaq", name = "d", descriptor = "(IIIZZI)V", line = 84)
	final void method23560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method23554()) {
			return;
		}
		if (arg0 == -1) {
			this.aClass263_5 = null;
		} else {
			if (this.aClass263_5 == null || arg0 != this.aClass263_5.anInt3869 * 1707631335) {
				this.aClass263_5 = (Class263) RuntimeException_Sub2.aClass32_Sub17_24.method18261(arg0);
				if (this.aClass263_5 == null || this.aClass263_5.anIntArray364 == null && !this.aClass263_5.method26188()) {
					this.aClass263_5 = null;
					return;
				}
			} else if (this.aClass263_5.anInt3868 * 23893545 == 0) {
				return;
			}
			this.anInt3218 = 0;
			this.anInt3217 = arg1 * 1368247043;
			this.anInt3221 = arg2 * -2102109211;
			this.aBoolean531 = arg4;
			if (this.aClass263_5.method26188()) {
				if (arg3) {
					this.anInt3216 = 594453757;
				} else {
					this.anInt3216 = 0;
				}
				this.method23619(this.aClass263_5, this.anInt3216 * 1550739371);
			} else {
				if (arg3) {
					this.anInt3223 = (int) (Math.random() * (double) this.aClass263_5.anIntArray364.length) * 1904490681;
					this.anInt3216 = (int) (Math.random() * (double) this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071]) * -594453757;
				} else {
					this.anInt3223 = 0;
					this.anInt3216 = 0;
				}
				this.anInt3219 = this.anInt3223 * 753020423 + -1138701553;
				if (this.anInt3219 * -907361297 < 0 || this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray364.length) {
					this.anInt3219 = 1138701553;
				}
				if (this.anInt3217 * 234452907 == 0) {
					this.method23613(this.aClass263_5, this.anInt3223 * -1046590071);
				}
			}
			this.aBoolean532 = false;
		}
		this.method23579();
	}

	@OriginalMember(owner = "client!aaq", name = "ab", descriptor = "(IIIZZ)V", line = 84)
	final void method23584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method23554()) {
			return;
		}
		if (arg0 == -1) {
			this.aClass263_5 = null;
		} else {
			if (this.aClass263_5 == null || arg0 != this.aClass263_5.anInt3869 * 1707631335) {
				this.aClass263_5 = (Class263) RuntimeException_Sub2.aClass32_Sub17_24.method18261(arg0);
				if (this.aClass263_5 == null || this.aClass263_5.anIntArray364 == null && !this.aClass263_5.method26188()) {
					this.aClass263_5 = null;
					return;
				}
			} else if (this.aClass263_5.anInt3868 * 23893545 == 0) {
				return;
			}
			this.anInt3218 = 0;
			this.anInt3217 = arg1 * 1368247043;
			this.anInt3221 = arg2 * -2102109211;
			this.aBoolean531 = arg4;
			if (this.aClass263_5.method26188()) {
				if (arg3) {
					this.anInt3216 = 594453757;
				} else {
					this.anInt3216 = 0;
				}
				this.method23619(this.aClass263_5, this.anInt3216 * 1550739371);
			} else {
				if (arg3) {
					this.anInt3223 = (int) (Math.random() * (double) this.aClass263_5.anIntArray364.length) * 1904490681;
					this.anInt3216 = (int) (Math.random() * (double) this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071]) * -594453757;
				} else {
					this.anInt3223 = 0;
					this.anInt3216 = 0;
				}
				this.anInt3219 = this.anInt3223 * 753020423 + -1138701553;
				if (this.anInt3219 * -907361297 < 0 || this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray364.length) {
					this.anInt3219 = 1138701553;
				}
				if (this.anInt3217 * 234452907 == 0) {
					this.method23613(this.aClass263_5, this.anInt3223 * -1046590071);
				}
			}
			this.aBoolean532 = false;
		}
		this.method23579();
	}

	@OriginalMember(owner = "client!aaq", name = "aa", descriptor = "(IIIZZ)V", line = 84)
	final void method23596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method23554()) {
			return;
		}
		if (arg0 == -1) {
			this.aClass263_5 = null;
		} else {
			if (this.aClass263_5 == null || arg0 != this.aClass263_5.anInt3869 * 1707631335) {
				this.aClass263_5 = (Class263) RuntimeException_Sub2.aClass32_Sub17_24.method18261(arg0);
				if (this.aClass263_5 == null || this.aClass263_5.anIntArray364 == null && !this.aClass263_5.method26188()) {
					this.aClass263_5 = null;
					return;
				}
			} else if (this.aClass263_5.anInt3868 * 23893545 == 0) {
				return;
			}
			this.anInt3218 = 0;
			this.anInt3217 = arg1 * 1368247043;
			this.anInt3221 = arg2 * -2102109211;
			this.aBoolean531 = arg4;
			if (this.aClass263_5.method26188()) {
				if (arg3) {
					this.anInt3216 = 594453757;
				} else {
					this.anInt3216 = 0;
				}
				this.method23619(this.aClass263_5, this.anInt3216 * 1550739371);
			} else {
				if (arg3) {
					this.anInt3223 = (int) (Math.random() * (double) this.aClass263_5.anIntArray364.length) * 1904490681;
					this.anInt3216 = (int) (Math.random() * (double) this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071]) * -594453757;
				} else {
					this.anInt3223 = 0;
					this.anInt3216 = 0;
				}
				this.anInt3219 = this.anInt3223 * 753020423 + -1138701553;
				if (this.anInt3219 * -907361297 < 0 || this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray364.length) {
					this.anInt3219 = 1138701553;
				}
				if (this.anInt3217 * 234452907 == 0) {
					this.method23613(this.aClass263_5, this.anInt3223 * -1046590071);
				}
			}
			this.aBoolean532 = false;
		}
		this.method23579();
	}

	@OriginalMember(owner = "client!aaq", name = "az", descriptor = "(IIIZZ)V", line = 84)
	final void method23598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method23554()) {
			return;
		}
		if (arg0 == -1) {
			this.aClass263_5 = null;
		} else {
			if (this.aClass263_5 == null || arg0 != this.aClass263_5.anInt3869 * 1707631335) {
				this.aClass263_5 = (Class263) RuntimeException_Sub2.aClass32_Sub17_24.method18261(arg0);
				if (this.aClass263_5 == null || this.aClass263_5.anIntArray364 == null && !this.aClass263_5.method26188()) {
					this.aClass263_5 = null;
					return;
				}
			} else if (this.aClass263_5.anInt3868 * 23893545 == 0) {
				return;
			}
			this.anInt3218 = 0;
			this.anInt3217 = arg1 * 1368247043;
			this.anInt3221 = arg2 * -2102109211;
			this.aBoolean531 = arg4;
			if (this.aClass263_5.method26188()) {
				if (arg3) {
					this.anInt3216 = 594453757;
				} else {
					this.anInt3216 = 0;
				}
				this.method23619(this.aClass263_5, this.anInt3216 * 1550739371);
			} else {
				if (arg3) {
					this.anInt3223 = (int) (Math.random() * (double) this.aClass263_5.anIntArray364.length) * 1904490681;
					this.anInt3216 = (int) (Math.random() * (double) this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071]) * -594453757;
				} else {
					this.anInt3223 = 0;
					this.anInt3216 = 0;
				}
				this.anInt3219 = this.anInt3223 * 753020423 + -1138701553;
				if (this.anInt3219 * -907361297 < 0 || this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray364.length) {
					this.anInt3219 = 1138701553;
				}
				if (this.anInt3217 * 234452907 == 0) {
					this.method23613(this.aClass263_5, this.anInt3223 * -1046590071);
				}
			}
			this.aBoolean532 = false;
		}
		this.method23579();
	}

	@OriginalMember(owner = "client!aaq", name = "c", descriptor = "(B)Z", line = 130)
	public final boolean method23561() {
		return this.anInt3217 * 234452907 != 0;
	}

	@OriginalMember(owner = "client!aaq", name = "af", descriptor = "()Z", line = 130)
	public final boolean method23626() {
		return this.anInt3217 * 234452907 != 0;
	}

	@OriginalMember(owner = "client!aaq", name = "an", descriptor = "()I", line = 134)
	public final int method23555() {
		return this.anInt3217 * 234452907;
	}

	@OriginalMember(owner = "client!aaq", name = "ak", descriptor = "()I", line = 134)
	public final int method23597() {
		return this.anInt3217 * 234452907;
	}

	@OriginalMember(owner = "client!aaq", name = "r", descriptor = "(S)I", line = 134)
	public final int method23604() {
		return this.anInt3217 * 234452907;
	}

	@OriginalMember(owner = "client!aaq", name = "v", descriptor = "(IB)V", line = 138)
	public final void method23563(@OriginalArg(0) int arg0) {
		this.anInt3217 = arg0 * 1368247043;
	}

	@OriginalMember(owner = "client!aaq", name = "bf", descriptor = "(I)V", line = 138)
	public final void method23599(@OriginalArg(0) int arg0) {
		this.anInt3217 = arg0 * 1368247043;
	}

	@OriginalMember(owner = "client!aaq", name = "o", descriptor = "(I)I", line = 142)
	public final int method23564() {
		if (!this.method23578()) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		if (this.method23578()) {
			if (this.aClass263_5.method26188()) {
				local5 |= this.aClass17_5.anInt59 * 1170162993;
			} else {
				local5 |= this.aClass23_10.anInt71 * 2023242135;
				if (this.aBoolean530 && this.aClass263_5.anIntArray365 != null) {
					local5 |= this.aClass23_9.anInt71 * 2023242135;
				}
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!aaq", name = "bl", descriptor = "()I", line = 142)
	public final int method23601() {
		if (!this.method23578()) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		if (this.method23578()) {
			if (this.aClass263_5.method26188()) {
				local5 |= this.aClass17_5.anInt59 * 1170162993;
			} else {
				local5 |= this.aClass23_10.anInt71 * 2023242135;
				if (this.aBoolean530 && this.aClass263_5.anIntArray365 != null) {
					local5 |= this.aClass23_9.anInt71 * 2023242135;
				}
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!aaq", name = "s", descriptor = "(Lclient!do;II)V", line = 159)
	public final void method23565(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass263_5 == null) {
			return;
		}
		if (this.aClass263_5.anIntArray364 == null) {
			if (this.aClass263_5.method26188() && this.method23578()) {
				arg0.method6839(this.aClass17_5.aClass93_Sub1_Sub5_1, this.anInt3216 * 1550739371, arg1, this.aClass263_5.aBoolean671);
			}
		} else if (this.method23578()) {
			arg0.method6838(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205, this.aClass23_10.aClass93_Sub1_Sub10_1, this.aClass23_10.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071], arg1, this.aClass263_5.aBoolean671);
			if (this.aBoolean530 && this.aClass263_5.anIntArray365 != null && this.aClass23_9.aBoolean11) {
				arg0.method6838(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205, this.aClass23_9.aClass93_Sub1_Sub10_1, this.aClass23_9.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071], arg1, this.aClass263_5.aBoolean671);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bk", descriptor = "(Lclient!do;I)V", line = 159)
	public final void method23602(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass263_5 == null) {
			return;
		}
		if (this.aClass263_5.anIntArray364 == null) {
			if (this.aClass263_5.method26188() && this.method23578()) {
				arg0.method6839(this.aClass17_5.aClass93_Sub1_Sub5_1, this.anInt3216 * 1550739371, arg1, this.aClass263_5.aBoolean671);
			}
		} else if (this.method23578()) {
			arg0.method6838(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205, this.aClass23_10.aClass93_Sub1_Sub10_1, this.aClass23_10.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071], arg1, this.aClass263_5.aBoolean671);
			if (this.aBoolean530 && this.aClass263_5.anIntArray365 != null && this.aClass23_9.aBoolean11) {
				arg0.method6838(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205, this.aClass23_9.aClass93_Sub1_Sub10_1, this.aClass23_9.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071], arg1, this.aClass263_5.aBoolean671);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bh", descriptor = "(Lclient!do;I)V", line = 159)
	public final void method23603(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass263_5 == null) {
			return;
		}
		if (this.aClass263_5.anIntArray364 == null) {
			if (this.aClass263_5.method26188() && this.method23578()) {
				arg0.method6839(this.aClass17_5.aClass93_Sub1_Sub5_1, this.anInt3216 * 1550739371, arg1, this.aClass263_5.aBoolean671);
			}
		} else if (this.method23578()) {
			arg0.method6838(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205, this.aClass23_10.aClass93_Sub1_Sub10_1, this.aClass23_10.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071], arg1, this.aClass263_5.aBoolean671);
			if (this.aBoolean530 && this.aClass263_5.anIntArray365 != null && this.aClass23_9.aBoolean11) {
				arg0.method6838(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205, this.aClass23_9.aClass93_Sub1_Sub10_1, this.aClass23_9.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071], arg1, this.aClass263_5.aBoolean671);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "y", descriptor = "(Lclient!do;IIB)V", line = 174)
	public final void method23566(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass263_5.anIntArray364 != null && this.method23578()) {
			arg0.method6840(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205, this.aClass23_10.aClass93_Sub1_Sub10_1, this.aClass23_10.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071], arg1, arg2, this.aClass263_5.aBoolean671, null);
			if (this.aBoolean530 && this.aClass263_5.anIntArray365 != null && this.aClass23_9.aBoolean11) {
				arg0.method6840(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205, this.aClass23_9.aClass93_Sub1_Sub10_1, this.aClass23_9.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071], arg1, arg2, this.aClass263_5.aBoolean671, null);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bx", descriptor = "(Lclient!do;II)V", line = 174)
	public final void method23569(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass263_5.anIntArray364 != null && this.method23578()) {
			arg0.method6840(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205, this.aClass23_10.aClass93_Sub1_Sub10_1, this.aClass23_10.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071], arg1, arg2, this.aClass263_5.aBoolean671, null);
			if (this.aBoolean530 && this.aClass263_5.anIntArray365 != null && this.aClass23_9.aBoolean11) {
				arg0.method6840(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205, this.aClass23_9.aClass93_Sub1_Sub10_1, this.aClass23_9.anInt73 * -278335347, this.anInt3216 * 1550739371, this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071], arg1, arg2, this.aClass263_5.aBoolean671, null);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "q", descriptor = "(Lclient!do;B)V", line = 183)
	public final void method23567(@OriginalArg(0) Class109 arg0) {
		if (this.aClass263_5.anIntArray364 != null && this.method23578()) {
			arg0.method7012(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205);
			if (this.aBoolean530 && this.aClass263_5.anIntArray365 != null && this.aClass23_9.aBoolean11) {
				arg0.method7012(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bd", descriptor = "(Lclient!do;)V", line = 183)
	public final void method23605(@OriginalArg(0) Class109 arg0) {
		if (this.aClass263_5.anIntArray364 != null && this.method23578()) {
			arg0.method7012(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205);
			if (this.aBoolean530 && this.aClass263_5.anIntArray365 != null && this.aClass23_9.aBoolean11) {
				arg0.method7012(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bc", descriptor = "(Lclient!do;)V", line = 183)
	public final void method23606(@OriginalArg(0) Class109 arg0) {
		if (this.aClass263_5.anIntArray364 != null && this.method23578()) {
			arg0.method7012(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205);
			if (this.aBoolean530 && this.aClass263_5.anIntArray365 != null && this.aClass23_9.aBoolean11) {
				arg0.method7012(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bi", descriptor = "(Lclient!do;)V", line = 183)
	public final void method23607(@OriginalArg(0) Class109 arg0) {
		if (this.aClass263_5.anIntArray364 != null && this.method23578()) {
			arg0.method7012(this.aClass23_10.aClass93_Sub1_Sub10_2, this.aClass23_10.anInt72 * -1424564205);
			if (this.aBoolean530 && this.aClass263_5.anIntArray365 != null && this.aClass23_9.aBoolean11) {
				arg0.method7012(this.aClass23_9.aClass93_Sub1_Sub10_2, this.aClass23_9.anInt72 * -1424564205);
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bn", descriptor = "(Lclient!do;Lclient!aaq;Lclient!aaq;)V", line = 192)
	public static final void method23608(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) Class19 arg2) {
		if (!arg1.method23578() || !arg2.method23578()) {
			return;
		}
		@Pc(10) Class263 local10 = arg1.aClass263_5;
		@Pc(13) Class263 local13 = arg2.aClass263_5;
		if (local10.anIntArray364 == null) {
			if (local10.method26188()) {
				if (local13.anIntArray364 != null) {
					arg0.method6843(arg1.aClass17_5.aClass93_Sub1_Sub5_1, arg1.anInt3216 * 1550739371, arg2.aClass23_10.aClass93_Sub1_Sub10_2, arg2.aClass23_10.anInt72 * -1424564205, arg2.aClass23_10.aClass93_Sub1_Sub10_1, arg2.aClass23_10.anInt73 * -278335347, arg2.anInt3216 * 1550739371, local13.anIntArray369[arg2.anInt3223 * -1046590071], local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean671 | local13.aBoolean671);
				} else if (local13.method26188()) {
					arg0.method6816(arg1.aClass17_5.aClass93_Sub1_Sub5_1, arg1.anInt3216 * 1550739371, arg2.aClass17_5.aClass93_Sub1_Sub5_1, arg2.anInt3216 * 1550739371, local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean671);
				}
			}
		} else if (local13.anIntArray364 != null) {
			arg0.method6831(arg1.aClass23_10.aClass93_Sub1_Sub10_2, arg1.aClass23_10.anInt72 * -1424564205, arg1.aClass23_10.aClass93_Sub1_Sub10_1, arg1.aClass23_10.anInt73 * -278335347, arg1.anInt3216 * 1550739371, local10.anIntArray369[arg1.anInt3223 * -1046590071], arg2.aClass23_10.aClass93_Sub1_Sub10_2, arg2.aClass23_10.anInt72 * -1424564205, arg2.aClass23_10.aClass93_Sub1_Sub10_1, arg2.aClass23_10.anInt73 * -278335347, arg2.anInt3216 * 1550739371, local13.anIntArray369[arg2.anInt3223 * -1046590071], local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean671 | local13.aBoolean671);
		} else if (local13.method26188()) {
			arg0.method6844(arg1.aClass23_10.aClass93_Sub1_Sub10_2, arg1.aClass23_10.anInt72 * -1424564205, arg1.aClass23_10.aClass93_Sub1_Sub10_1, arg1.aClass23_10.anInt73 * -278335347, arg1.anInt3216 * 1550739371, local10.anIntArray369[arg1.anInt3223 * -1046590071], arg2.aClass17_5.aClass93_Sub1_Sub5_1, arg2.anInt3216 * 1550739371, local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean671 | local13.aBoolean671);
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bt", descriptor = "(Lclient!do;Lclient!aaq;Lclient!aaq;)V", line = 192)
	public static final void method23609(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) Class19 arg2) {
		if (!arg1.method23578() || !arg2.method23578()) {
			return;
		}
		@Pc(10) Class263 local10 = arg1.aClass263_5;
		@Pc(13) Class263 local13 = arg2.aClass263_5;
		if (local10.anIntArray364 == null) {
			if (local10.method26188()) {
				if (local13.anIntArray364 != null) {
					arg0.method6843(arg1.aClass17_5.aClass93_Sub1_Sub5_1, arg1.anInt3216 * 1550739371, arg2.aClass23_10.aClass93_Sub1_Sub10_2, arg2.aClass23_10.anInt72 * -1424564205, arg2.aClass23_10.aClass93_Sub1_Sub10_1, arg2.aClass23_10.anInt73 * -278335347, arg2.anInt3216 * 1550739371, local13.anIntArray369[arg2.anInt3223 * -1046590071], local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean671 | local13.aBoolean671);
				} else if (local13.method26188()) {
					arg0.method6816(arg1.aClass17_5.aClass93_Sub1_Sub5_1, arg1.anInt3216 * 1550739371, arg2.aClass17_5.aClass93_Sub1_Sub5_1, arg2.anInt3216 * 1550739371, local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean671);
				}
			}
		} else if (local13.anIntArray364 != null) {
			arg0.method6831(arg1.aClass23_10.aClass93_Sub1_Sub10_2, arg1.aClass23_10.anInt72 * -1424564205, arg1.aClass23_10.aClass93_Sub1_Sub10_1, arg1.aClass23_10.anInt73 * -278335347, arg1.anInt3216 * 1550739371, local10.anIntArray369[arg1.anInt3223 * -1046590071], arg2.aClass23_10.aClass93_Sub1_Sub10_2, arg2.aClass23_10.anInt72 * -1424564205, arg2.aClass23_10.aClass93_Sub1_Sub10_1, arg2.aClass23_10.anInt73 * -278335347, arg2.anInt3216 * 1550739371, local13.anIntArray369[arg2.anInt3223 * -1046590071], local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean671 | local13.aBoolean671);
		} else if (local13.method26188()) {
			arg0.method6844(arg1.aClass23_10.aClass93_Sub1_Sub10_2, arg1.aClass23_10.anInt72 * -1424564205, arg1.aClass23_10.aClass93_Sub1_Sub10_1, arg1.aClass23_10.anInt73 * -278335347, arg1.anInt3216 * 1550739371, local10.anIntArray369[arg1.anInt3223 * -1046590071], arg2.aClass17_5.aClass93_Sub1_Sub5_1, arg2.anInt3216 * 1550739371, local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean671 | local13.aBoolean671);
		}
	}

	@OriginalMember(owner = "client!aaq", name = "b", descriptor = "(I)Z", line = 215)
	public final boolean method23581() {
		return this.aBoolean532;
	}

	@OriginalMember(owner = "client!aaq", name = "be", descriptor = "()Z", line = 215)
	public final boolean method23600() {
		return this.aBoolean532;
	}

	@OriginalMember(owner = "client!aaq", name = "bq", descriptor = "()Z", line = 215)
	public final boolean method23610() {
		return this.aBoolean532;
	}

	@OriginalMember(owner = "client!aaq", name = "bm", descriptor = "()Z", line = 215)
	public final boolean method23611() {
		return this.aBoolean532;
	}

	@OriginalMember(owner = "client!aaq", name = "bb", descriptor = "()Z", line = 215)
	public final boolean method23612() {
		return this.aBoolean532;
	}

	@OriginalMember(owner = "client!aaq", name = "bu", descriptor = "()V", line = 219)
	public final void method23594() {
		this.anInt3218 = 0;
	}

	@OriginalMember(owner = "client!aaq", name = "bw", descriptor = "()V", line = 219)
	public final void method23616() {
		this.anInt3218 = 0;
	}

	@OriginalMember(owner = "client!aaq", name = "h", descriptor = "(S)V", line = 219)
	public final void method23628() {
		this.anInt3218 = 0;
	}

	@OriginalMember(owner = "client!aaq", name = "by", descriptor = "()V", line = 219)
	public final void method23631() {
		this.anInt3218 = 0;
	}

	@OriginalMember(owner = "client!aaq", name = "bv", descriptor = "()V", line = 223)
	public final void method23551() {
		this.method23595(0);
	}

	@OriginalMember(owner = "client!aaq", name = "a", descriptor = "(I)V", line = 223)
	public final void method23570() {
		this.method23595(0);
	}

	@OriginalMember(owner = "client!aaq", name = "bz", descriptor = "()V", line = 223)
	public final void method23571() {
		this.method23595(0);
	}

	@OriginalMember(owner = "client!aaq", name = "bo", descriptor = "()V", line = 223)
	public final void method23617() {
		this.method23595(0);
	}

	@OriginalMember(owner = "client!aaq", name = "g", descriptor = "(IB)V", line = 227)
	public final void method23595(@OriginalArg(0) int arg0) {
		if (this.aClass263_5.method26188()) {
			this.method23572(arg0);
			return;
		}
		this.anInt3223 = 0;
		this.anInt3219 = (this.aClass263_5.anIntArray364.length > 1 ? 1 : -1) * -1138701553;
		this.anInt3216 = 0;
		this.aBoolean532 = false;
		this.anInt3217 = arg0 * 1368247043;
		this.anInt3218 = 0;
		if (this.aClass263_5 != null & this.aClass263_5.anIntArray364 != null) {
			this.method23613(this.aClass263_5, this.anInt3223 * -1046590071);
			this.method23579();
		}
	}

	@OriginalMember(owner = "client!aaq", name = "br", descriptor = "(I)V", line = 227)
	public final void method23620(@OriginalArg(0) int arg0) {
		if (this.aClass263_5.method26188()) {
			this.method23572(arg0);
			return;
		}
		this.anInt3223 = 0;
		this.anInt3219 = (this.aClass263_5.anIntArray364.length > 1 ? 1 : -1) * -1138701553;
		this.anInt3216 = 0;
		this.aBoolean532 = false;
		this.anInt3217 = arg0 * 1368247043;
		this.anInt3218 = 0;
		if (this.aClass263_5 != null & this.aClass263_5.anIntArray364 != null) {
			this.method23613(this.aClass263_5, this.anInt3223 * -1046590071);
			this.method23579();
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bg", descriptor = "(I)V", line = 227)
	public final void method23621(@OriginalArg(0) int arg0) {
		if (this.aClass263_5.method26188()) {
			this.method23572(arg0);
			return;
		}
		this.anInt3223 = 0;
		this.anInt3219 = (this.aClass263_5.anIntArray364.length > 1 ? 1 : -1) * -1138701553;
		this.anInt3216 = 0;
		this.aBoolean532 = false;
		this.anInt3217 = arg0 * 1368247043;
		this.anInt3218 = 0;
		if (this.aClass263_5 != null & this.aClass263_5.anIntArray364 != null) {
			this.method23613(this.aClass263_5, this.anInt3223 * -1046590071);
			this.method23579();
		}
	}

	@OriginalMember(owner = "client!aaq", name = "ba", descriptor = "(I)V", line = 227)
	public final void method23622(@OriginalArg(0) int arg0) {
		if (this.aClass263_5.method26188()) {
			this.method23572(arg0);
			return;
		}
		this.anInt3223 = 0;
		this.anInt3219 = (this.aClass263_5.anIntArray364.length > 1 ? 1 : -1) * -1138701553;
		this.anInt3216 = 0;
		this.aBoolean532 = false;
		this.anInt3217 = arg0 * 1368247043;
		this.anInt3218 = 0;
		if (this.aClass263_5 != null & this.aClass263_5.anIntArray364 != null) {
			this.method23613(this.aClass263_5, this.anInt3223 * -1046590071);
			this.method23579();
		}
	}

	@OriginalMember(owner = "client!aaq", name = "i", descriptor = "(II)V", line = 245)
	final void method23572(@OriginalArg(0) int arg0) {
		this.aBoolean532 = false;
		this.anInt3217 = arg0 * 1368247043;
		this.anInt3218 = 0;
		this.anInt3216 = 0;
		if (this.aClass263_5 != null) {
			this.method23619(this.aClass263_5, this.anInt3216 * 1550739371);
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bp", descriptor = "(I)V", line = 245)
	final void method23582(@OriginalArg(0) int arg0) {
		this.aBoolean532 = false;
		this.anInt3217 = arg0 * 1368247043;
		this.anInt3218 = 0;
		this.anInt3216 = 0;
		if (this.aClass263_5 != null) {
			this.method23619(this.aClass263_5, this.anInt3216 * 1550739371);
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bj", descriptor = "(I)V", line = 245)
	final void method23624(@OriginalArg(0) int arg0) {
		this.aBoolean532 = false;
		this.anInt3217 = arg0 * 1368247043;
		this.anInt3218 = 0;
		this.anInt3216 = 0;
		if (this.aClass263_5 != null) {
			this.method23619(this.aClass263_5, this.anInt3216 * 1550739371);
		}
	}

	@OriginalMember(owner = "client!aaq", name = "j", descriptor = "(II)Z", line = 255)
	public final boolean method23573(@OriginalArg(0) int arg0) {
		if (this.aClass263_5 == null || arg0 == 0) {
			return false;
		} else if (this.aClass263_5.method26188()) {
			return this.method23562(arg0);
		} else {
			if (this.anInt3217 * 234452907 > 0) {
				if (this.anInt3217 * 234452907 > arg0) {
					this.anInt3217 -= arg0 * 1368247043;
					return false;
				}
				arg0 -= this.anInt3217 * 234452907;
				this.anInt3217 = 0;
				this.method23613(this.aClass263_5, this.anInt3223 * -1046590071);
			}
			arg0 += this.anInt3216 * 1550739371;
			@Pc(69) boolean local69 = this.aClass263_5.aBoolean669 | Class263.aBoolean670;
			if (arg0 > 100 && this.aClass263_5.anInt3872 * 1979961975 > 0) {
				@Pc(89) int local89 = this.aClass263_5.anIntArray364.length - this.aClass263_5.anInt3872 * 1979961975;
				while (this.anInt3223 * -1046590071 < local89 && arg0 > this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071]) {
					arg0 -= this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071];
					this.anInt3223 += 1904490681;
				}
				if (this.anInt3223 * -1046590071 >= local89) {
					@Pc(131) int local131 = 0;
					for (@Pc(133) int local133 = local89; local133 < this.aClass263_5.anIntArray364.length; local133++) {
						local131 += this.aClass263_5.anIntArray369[local133];
					}
					if (this.anInt3221 * 916351469 == 0) {
						this.anInt3218 += arg0 / local131 * 254052143;
					}
					arg0 %= local131;
				}
				this.anInt3219 = this.anInt3223 * 753020423 + -1138701553;
				if (this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray364.length) {
					if (this.aClass263_5.anInt3872 * 1979961975 == -1 && this.aBoolean531) {
						this.anInt3219 = 0;
					} else {
						this.anInt3219 -= this.aClass263_5.anInt3872 * -1526877703;
					}
					if (this.anInt3219 * -907361297 < 0 || this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray364.length) {
						this.anInt3219 = 1138701553;
					}
				}
				local69 = true;
			}
			while (arg0 > this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071]) {
				local69 = true;
				arg0 -= this.aClass263_5.anIntArray369[(this.anInt3223 += 1904490681) * -1046590071 - 1];
				if (this.anInt3223 * -1046590071 >= this.aClass263_5.anIntArray364.length) {
					if (this.aClass263_5.anInt3872 * 1979961975 != -1 && this.anInt3221 * 916351469 != 2) {
						this.anInt3223 -= this.aClass263_5.anInt3872 * 724115455;
						if (this.anInt3221 * 916351469 == 0) {
							this.anInt3218 += 254052143;
						}
					}
					if (this.anInt3218 * -1234690097 >= this.aClass263_5.anInt3870 * -708698247 || this.anInt3223 * -1046590071 < 0 || this.anInt3223 * -1046590071 >= this.aClass263_5.anIntArray364.length) {
						this.aBoolean532 = true;
						break;
					}
				}
				this.method23613(this.aClass263_5, this.anInt3223 * -1046590071);
				this.anInt3219 = this.anInt3223 * 753020423 + -1138701553;
				if (this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray364.length) {
					if (this.aClass263_5.anInt3872 * 1979961975 == -1 && this.aBoolean531) {
						this.anInt3219 = 0;
					} else {
						this.anInt3219 -= this.aClass263_5.anInt3872 * -1526877703;
					}
					if (this.anInt3219 * -907361297 < 0 || this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray364.length) {
						this.anInt3219 = 1138701553;
					}
				}
			}
			this.anInt3216 = arg0 * -594453757;
			if (local69) {
				this.method23579();
			}
			return local69;
		}
	}

	@OriginalMember(owner = "client!aaq", name = "bs", descriptor = "(I)Z", line = 255)
	public final boolean method23625(@OriginalArg(0) int arg0) {
		if (this.aClass263_5 == null || arg0 == 0) {
			return false;
		} else if (this.aClass263_5.method26188()) {
			return this.method23562(arg0);
		} else {
			if (this.anInt3217 * 234452907 > 0) {
				if (this.anInt3217 * 234452907 > arg0) {
					this.anInt3217 -= arg0 * 1368247043;
					return false;
				}
				arg0 -= this.anInt3217 * 234452907;
				this.anInt3217 = 0;
				this.method23613(this.aClass263_5, this.anInt3223 * -1046590071);
			}
			arg0 += this.anInt3216 * 1550739371;
			@Pc(69) boolean local69 = this.aClass263_5.aBoolean669 | Class263.aBoolean670;
			if (arg0 > 100 && this.aClass263_5.anInt3872 * 1979961975 > 0) {
				@Pc(89) int local89 = this.aClass263_5.anIntArray364.length - this.aClass263_5.anInt3872 * 1979961975;
				while (this.anInt3223 * -1046590071 < local89 && arg0 > this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071]) {
					arg0 -= this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071];
					this.anInt3223 += 1904490681;
				}
				if (this.anInt3223 * -1046590071 >= local89) {
					@Pc(131) int local131 = 0;
					for (@Pc(133) int local133 = local89; local133 < this.aClass263_5.anIntArray364.length; local133++) {
						local131 += this.aClass263_5.anIntArray369[local133];
					}
					if (this.anInt3221 * 916351469 == 0) {
						this.anInt3218 += arg0 / local131 * 254052143;
					}
					arg0 %= local131;
				}
				this.anInt3219 = this.anInt3223 * 753020423 + -1138701553;
				if (this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray364.length) {
					if (this.aClass263_5.anInt3872 * 1979961975 == -1 && this.aBoolean531) {
						this.anInt3219 = 0;
					} else {
						this.anInt3219 -= this.aClass263_5.anInt3872 * -1526877703;
					}
					if (this.anInt3219 * -907361297 < 0 || this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray364.length) {
						this.anInt3219 = 1138701553;
					}
				}
				local69 = true;
			}
			while (arg0 > this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071]) {
				local69 = true;
				arg0 -= this.aClass263_5.anIntArray369[(this.anInt3223 += 1904490681) * -1046590071 - 1];
				if (this.anInt3223 * -1046590071 >= this.aClass263_5.anIntArray364.length) {
					if (this.aClass263_5.anInt3872 * 1979961975 != -1 && this.anInt3221 * 916351469 != 2) {
						this.anInt3223 -= this.aClass263_5.anInt3872 * 724115455;
						if (this.anInt3221 * 916351469 == 0) {
							this.anInt3218 += 254052143;
						}
					}
					if (this.anInt3218 * -1234690097 >= this.aClass263_5.anInt3870 * -708698247 || this.anInt3223 * -1046590071 < 0 || this.anInt3223 * -1046590071 >= this.aClass263_5.anIntArray364.length) {
						this.aBoolean532 = true;
						break;
					}
				}
				this.method23613(this.aClass263_5, this.anInt3223 * -1046590071);
				this.anInt3219 = this.anInt3223 * 753020423 + -1138701553;
				if (this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray364.length) {
					if (this.aClass263_5.anInt3872 * 1979961975 == -1 && this.aBoolean531) {
						this.anInt3219 = 0;
					} else {
						this.anInt3219 -= this.aClass263_5.anInt3872 * -1526877703;
					}
					if (this.anInt3219 * -907361297 < 0 || this.anInt3219 * -907361297 >= this.aClass263_5.anIntArray364.length) {
						this.anInt3219 = 1138701553;
					}
				}
			}
			this.anInt3216 = arg0 * -594453757;
			if (local69) {
				this.method23579();
			}
			return local69;
		}
	}

	@OriginalMember(owner = "client!aaq", name = "t", descriptor = "(IB)Z", line = 317)
	boolean method23562(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub1_Sub5 local5 = this.aClass17_5.aClass93_Sub1_Sub5_1;
		if (local5 == null) {
			return false;
		}
		if (this.anInt3216 * 1550739371 < 0) {
			this.anInt3216 = (local5.method21542() + (int) (Math.random() * (double) local5.method21544())) * -594453757;
		}
		@Pc(34) int local34 = this.method23604();
		if (local34 > 0) {
			if (local34 > arg0) {
				this.method23563(local34 - arg0);
				return false;
			}
			arg0 -= local34;
			this.method23563(0);
		}
		@Pc(61) boolean local61 = arg0 != 0;
		for (@Pc(63) int local63 = 0; local63 < arg0; local63++) {
			this.method23619(this.aClass263_5, this.anInt3216 * 1550739371);
			this.anInt3216 += -594453757;
			if (this.anInt3216 * 1550739371 >= local5.method21543()) {
				if (this.aClass263_5.anInt3872 * 1979961975 == -1 || this.anInt3221 * 916351469 == 2) {
					this.aBoolean532 = true;
				} else {
					@Pc(112) int local112 = local5.method21544() - this.aClass263_5.anInt3872 * 1979961975;
					this.anInt3216 = local112 * -594453757;
					if (this.anInt3221 * 916351469 == 0) {
						this.anInt3218 += 254052143;
					}
					if (this.anInt3218 * -1234690097 >= this.aClass263_5.anInt3870 * -708698247) {
						this.aBoolean532 = true;
					}
				}
			}
		}
		return local61;
	}

	@OriginalMember(owner = "client!aaq", name = "cl", descriptor = "(I)Z", line = 317)
	boolean method23614(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub1_Sub5 local5 = this.aClass17_5.aClass93_Sub1_Sub5_1;
		if (local5 == null) {
			return false;
		}
		if (this.anInt3216 * 1550739371 < 0) {
			this.anInt3216 = (local5.method21542() + (int) (Math.random() * (double) local5.method21544())) * -594453757;
		}
		@Pc(34) int local34 = this.method23604();
		if (local34 > 0) {
			if (local34 > arg0) {
				this.method23563(local34 - arg0);
				return false;
			}
			arg0 -= local34;
			this.method23563(0);
		}
		@Pc(61) boolean local61 = arg0 != 0;
		for (@Pc(63) int local63 = 0; local63 < arg0; local63++) {
			this.method23619(this.aClass263_5, this.anInt3216 * 1550739371);
			this.anInt3216 += -594453757;
			if (this.anInt3216 * 1550739371 >= local5.method21543()) {
				if (this.aClass263_5.anInt3872 * 1979961975 == -1 || this.anInt3221 * 916351469 == 2) {
					this.aBoolean532 = true;
				} else {
					@Pc(112) int local112 = local5.method21544() - this.aClass263_5.anInt3872 * 1979961975;
					this.anInt3216 = local112 * -594453757;
					if (this.anInt3221 * 916351469 == 0) {
						this.anInt3218 += 254052143;
					}
					if (this.anInt3218 * -1234690097 >= this.aClass263_5.anInt3870 * -708698247) {
						this.aBoolean532 = true;
					}
				}
			}
		}
		return local61;
	}

	@OriginalMember(owner = "client!aaq", name = "cg", descriptor = "(I)Z", line = 317)
	boolean method23627(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub1_Sub5 local5 = this.aClass17_5.aClass93_Sub1_Sub5_1;
		if (local5 == null) {
			return false;
		}
		if (this.anInt3216 * 1550739371 < 0) {
			this.anInt3216 = (local5.method21542() + (int) (Math.random() * (double) local5.method21544())) * -594453757;
		}
		@Pc(34) int local34 = this.method23604();
		if (local34 > 0) {
			if (local34 > arg0) {
				this.method23563(local34 - arg0);
				return false;
			}
			arg0 -= local34;
			this.method23563(0);
		}
		@Pc(61) boolean local61 = arg0 != 0;
		for (@Pc(63) int local63 = 0; local63 < arg0; local63++) {
			this.method23619(this.aClass263_5, this.anInt3216 * 1550739371);
			this.anInt3216 += -594453757;
			if (this.anInt3216 * 1550739371 >= local5.method21543()) {
				if (this.aClass263_5.anInt3872 * 1979961975 == -1 || this.anInt3221 * 916351469 == 2) {
					this.aBoolean532 = true;
				} else {
					@Pc(112) int local112 = local5.method21544() - this.aClass263_5.anInt3872 * 1979961975;
					this.anInt3216 = local112 * -594453757;
					if (this.anInt3221 * 916351469 == 0) {
						this.anInt3218 += 254052143;
					}
					if (this.anInt3218 * -1234690097 >= this.aClass263_5.anInt3870 * -708698247) {
						this.aBoolean532 = true;
					}
				}
			}
		}
		return local61;
	}

	@OriginalMember(owner = "client!aaq", name = "ae", descriptor = "(II)Z", line = 354)
	public final boolean method23575(@OriginalArg(0) int arg0) {
		@Pc(14) int local14;
		if (this.aClass263_5 == null | (local14 = arg0 - this.anInt3217 * 234452907) <= 0) {
			return false;
		} else if (this.aClass263_5.method26188()) {
			return true;
		} else {
			return this.aClass263_5.aBoolean669 | this.anInt3216 * 1550739371 + local14 > this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071];
		}
	}

	@OriginalMember(owner = "client!aaq", name = "ce", descriptor = "(I)Z", line = 354)
	public final boolean method23618(@OriginalArg(0) int arg0) {
		@Pc(14) int local14;
		if (this.aClass263_5 == null | (local14 = arg0 - this.anInt3217 * 234452907) <= 0) {
			return false;
		} else if (this.aClass263_5.method26188()) {
			return true;
		} else {
			return this.aClass263_5.aBoolean669 | this.anInt3216 * 1550739371 + local14 > this.aClass263_5.anIntArray369[this.anInt3223 * -1046590071];
		}
	}

	@OriginalMember(owner = "client!aaq", name = "ag", descriptor = "(Lclient!fg;II)V", line = 359)
	void method23613(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aaq", name = "ai", descriptor = "(Lclient!fg;I)V", line = 359)
	void method23623(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aaq", name = "ah", descriptor = "(Lclient!fg;II)V", line = 362)
	void method23619(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1) {
		this.method23613(arg0, arg1);
	}

	@OriginalMember(owner = "client!aaq", name = "cu", descriptor = "(Lclient!fg;I)V", line = 362)
	void method23629(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1) {
		this.method23613(arg0, arg1);
	}

	@OriginalMember(owner = "client!aaq", name = "cn", descriptor = "()Z", line = 366)
	final boolean method23574() {
		if (this.aClass263_5 == null) {
			return false;
		}
		@Pc(28) boolean local28;
		if (this.aClass263_5.method26188()) {
			local28 = this.aClass17_5.method237(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5);
		} else {
			local28 = this.aClass23_10.method495(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5, this.anInt3223 * -1046590071, this.anInt3219 * -907361297, this.aClass263_5.anIntArray364);
			if (local28 && this.aBoolean530 && this.aClass263_5.anIntArray365 != null) {
				this.aClass23_9.method495(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5, this.anInt3223 * -1046590071, this.anInt3219 * -907361297, this.aClass263_5.anIntArray365);
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!aaq", name = "al", descriptor = "(B)Z", line = 366)
	final boolean method23578() {
		if (this.aClass263_5 == null) {
			return false;
		}
		@Pc(28) boolean local28;
		if (this.aClass263_5.method26188()) {
			local28 = this.aClass17_5.method237(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5);
		} else {
			local28 = this.aClass23_10.method495(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5, this.anInt3223 * -1046590071, this.anInt3219 * -907361297, this.aClass263_5.anIntArray364);
			if (local28 && this.aBoolean530 && this.aClass263_5.anIntArray365 != null) {
				this.aClass23_9.method495(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5, this.anInt3223 * -1046590071, this.anInt3219 * -907361297, this.aClass263_5.anIntArray365);
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!aaq", name = "ci", descriptor = "()Z", line = 366)
	final boolean method23630() {
		if (this.aClass263_5 == null) {
			return false;
		}
		@Pc(28) boolean local28;
		if (this.aClass263_5.method26188()) {
			local28 = this.aClass17_5.method237(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5);
		} else {
			local28 = this.aClass23_10.method495(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5, this.anInt3223 * -1046590071, this.anInt3219 * -907361297, this.aClass263_5.anIntArray364);
			if (local28 && this.aBoolean530 && this.aClass263_5.anIntArray365 != null) {
				this.aClass23_9.method495(RuntimeException_Sub2.aClass32_Sub17_24, this.aClass263_5, this.anInt3223 * -1046590071, this.anInt3219 * -907361297, this.aClass263_5.anIntArray365);
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!aaq", name = "ac", descriptor = "(I)V", line = 381)
	final void method23579() {
		if (this.aClass263_5 == null || this.aClass263_5.method26188()) {
			this.aClass17_5.method236();
		} else {
			this.aClass23_10.method496();
			if (this.aBoolean530) {
				this.aClass23_9.method496();
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "cv", descriptor = "()V", line = 381)
	final void method23632() {
		if (this.aClass263_5 == null || this.aClass263_5.method26188()) {
			this.aClass17_5.method236();
		} else {
			this.aClass23_10.method496();
			if (this.aBoolean530) {
				this.aClass23_9.method496();
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "cp", descriptor = "()V", line = 381)
	final void method23633() {
		if (this.aClass263_5 == null || this.aClass263_5.method26188()) {
			this.aClass17_5.method236();
		} else {
			this.aClass23_10.method496();
			if (this.aBoolean530) {
				this.aClass23_9.method496();
			}
		}
	}

	@OriginalMember(owner = "client!aaq", name = "kc", descriptor = "(II)V", line = 11842)
	static final void method23634(@OriginalArg(0) int arg0) {
		if (Class383.method28145(arg0, null)) {
			Class432.method28789(Class166_Sub1.aClass320Array1[arg0].aClass312Array3, -1);
		}
	}

	@OriginalMember(owner = "client!aaq", name = "aok", descriptor = "(Lclient!yf;I)V", line = 12472)
	static final void method23636(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		Class65.aClass123_Sub1_2.method8946(local12);
	}
}
