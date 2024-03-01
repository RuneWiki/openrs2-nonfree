package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public class Class386 {

	@OriginalMember(owner = "client!pd", name = "ak", descriptor = "Lclient!co;")
	static Class6 aClass6_29;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	static final int anInt4720 = 0;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	static final int anInt4721 = 1;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	static final int anInt4722 = 2;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
	static final int anInt4728 = 24;

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
	static final int anInt4738 = 24;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	static final int anInt4739 = 13;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	static final int anInt4740 = 192;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
	static final int anInt4741 = 512;

	@OriginalMember(owner = "client!pd", name = "aa", descriptor = "Lclient!co;")
	static Class6 aClass6_31;

	@OriginalMember(owner = "client!pd", name = "at", descriptor = "I")
	static final int anInt4742 = 16;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	static final int anInt4743 = 128;

	@OriginalMember(owner = "client!pd", name = "af", descriptor = "Lclient!dh;")
	static Class20 aClass20_5;

	@OriginalMember(owner = "client!pd", name = "ah", descriptor = "[I")
	static final int[] anIntArray429 = new int[4];

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
	int anInt4730;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
	int anInt4731;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
	int anInt4732;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	int anInt4733;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	int anInt4734;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "Lclient!co;")
	Class6 aClass6_30;

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
	final int anInt4725;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
	final int anInt4726;

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
	final int anInt4727;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Z")
	final boolean aBoolean745;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	final int anInt4723;

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
	final int anInt4729;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
	final int anInt4724;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
	final int anInt4744;

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
	int anInt4735;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
	int anInt4736;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
	int anInt4737;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIIIZIII)V", line = 65)
	public Class386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt4725 = arg2;
		this.anInt4726 = arg3;
		this.anInt4727 = arg4;
		this.aBoolean745 = arg7;
		this.anInt4723 = arg1;
		this.anInt4729 = arg6;
		this.anInt4724 = arg5;
		this.anInt4744 = arg0;
		this.anInt4735 = arg8;
		this.anInt4736 = arg9;
		this.anInt4737 = arg10;
	}

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "()V", line = 80)
	static void method27338() {
		aClass20_5 = null;
		aClass6_31 = null;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "()V", line = 80)
	static void method27348() {
		aClass20_5 = null;
		aClass6_31 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)Z", line = 88)
	boolean method27339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean745) {
			this.anInt4733 = 1073741823;
			local7 = this.anInt4725;
			local12 = this.anInt4726;
			local17 = this.anInt4727;
		} else {
			local7 = this.anInt4725 - arg0;
			local12 = this.anInt4726 - arg1;
			local17 = this.anInt4727 - arg2;
			this.anInt4733 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4733 == 0) {
				this.anInt4733 = 1;
			}
			local7 = (local7 << 8) / this.anInt4733;
			local12 = (local12 << 8) / this.anInt4733;
			local17 = (local17 << 8) / this.anInt4733;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4734 = this.anInt4724 * arg3 / (this.aBoolean745 ? 1024 : this.anInt4733);
		} else {
			this.anInt4734 = 0;
		}
		if (this.anInt4734 < 8) {
			this.aClass6_30 = null;
			return false;
		}
		@Pc(143) int local143 = Class302.method25670(this.anInt4734);
		if (local143 > arg3) {
			local143 = Class525.method32379(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4731) {
			this.anInt4731 = local143;
		}
		this.anInt4730 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt4732 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass6_30 = null;
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "(IIII)Z", line = 88)
	boolean method27341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean745) {
			this.anInt4733 = 1073741823;
			local7 = this.anInt4725;
			local12 = this.anInt4726;
			local17 = this.anInt4727;
		} else {
			local7 = this.anInt4725 - arg0;
			local12 = this.anInt4726 - arg1;
			local17 = this.anInt4727 - arg2;
			this.anInt4733 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4733 == 0) {
				this.anInt4733 = 1;
			}
			local7 = (local7 << 8) / this.anInt4733;
			local12 = (local12 << 8) / this.anInt4733;
			local17 = (local17 << 8) / this.anInt4733;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4734 = this.anInt4724 * arg3 / (this.aBoolean745 ? 1024 : this.anInt4733);
		} else {
			this.anInt4734 = 0;
		}
		if (this.anInt4734 < 8) {
			this.aClass6_30 = null;
			return false;
		}
		@Pc(143) int local143 = Class302.method25670(this.anInt4734);
		if (local143 > arg3) {
			local143 = Class525.method32379(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4731) {
			this.anInt4731 = local143;
		}
		this.anInt4730 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt4732 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass6_30 = null;
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "(IIII)Z", line = 88)
	boolean method27351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean745) {
			this.anInt4733 = 1073741823;
			local7 = this.anInt4725;
			local12 = this.anInt4726;
			local17 = this.anInt4727;
		} else {
			local7 = this.anInt4725 - arg0;
			local12 = this.anInt4726 - arg1;
			local17 = this.anInt4727 - arg2;
			this.anInt4733 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4733 == 0) {
				this.anInt4733 = 1;
			}
			local7 = (local7 << 8) / this.anInt4733;
			local12 = (local12 << 8) / this.anInt4733;
			local17 = (local17 << 8) / this.anInt4733;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4734 = this.anInt4724 * arg3 / (this.aBoolean745 ? 1024 : this.anInt4733);
		} else {
			this.anInt4734 = 0;
		}
		if (this.anInt4734 < 8) {
			this.aClass6_30 = null;
			return false;
		}
		@Pc(143) int local143 = Class302.method25670(this.anInt4734);
		if (local143 > arg3) {
			local143 = Class525.method32379(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4731) {
			this.anInt4731 = local143;
		}
		this.anInt4730 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt4732 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass6_30 = null;
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(IIII)Z", line = 88)
	boolean method27352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean745) {
			this.anInt4733 = 1073741823;
			local7 = this.anInt4725;
			local12 = this.anInt4726;
			local17 = this.anInt4727;
		} else {
			local7 = this.anInt4725 - arg0;
			local12 = this.anInt4726 - arg1;
			local17 = this.anInt4727 - arg2;
			this.anInt4733 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4733 == 0) {
				this.anInt4733 = 1;
			}
			local7 = (local7 << 8) / this.anInt4733;
			local12 = (local12 << 8) / this.anInt4733;
			local17 = (local17 << 8) / this.anInt4733;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4734 = this.anInt4724 * arg3 / (this.aBoolean745 ? 1024 : this.anInt4733);
		} else {
			this.anInt4734 = 0;
		}
		if (this.anInt4734 < 8) {
			this.aClass6_30 = null;
			return false;
		}
		@Pc(143) int local143 = Class302.method25670(this.anInt4734);
		if (local143 > arg3) {
			local143 = Class525.method32379(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4731) {
			this.anInt4731 = local143;
		}
		this.anInt4730 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt4732 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass6_30 = null;
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "(IIII)Z", line = 88)
	boolean method27354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean745) {
			this.anInt4733 = 1073741823;
			local7 = this.anInt4725;
			local12 = this.anInt4726;
			local17 = this.anInt4727;
		} else {
			local7 = this.anInt4725 - arg0;
			local12 = this.anInt4726 - arg1;
			local17 = this.anInt4727 - arg2;
			this.anInt4733 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4733 == 0) {
				this.anInt4733 = 1;
			}
			local7 = (local7 << 8) / this.anInt4733;
			local12 = (local12 << 8) / this.anInt4733;
			local17 = (local17 << 8) / this.anInt4733;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4734 = this.anInt4724 * arg3 / (this.aBoolean745 ? 1024 : this.anInt4733);
		} else {
			this.anInt4734 = 0;
		}
		if (this.anInt4734 < 8) {
			this.aClass6_30 = null;
			return false;
		}
		@Pc(143) int local143 = Class302.method25670(this.anInt4734);
		if (local143 > arg3) {
			local143 = Class525.method32379(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4731) {
			this.anInt4731 = local143;
		}
		this.anInt4730 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt4732 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass6_30 = null;
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "(Lclient!de;Lclient!pd;)Z", line = 127)
	boolean method27346(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class386 arg1) {
		return this.aClass6_30 != null || this.method27342(arg0, arg1);
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(Lclient!de;Lclient!pd;)Z", line = 127)
	boolean method27349(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class386 arg1) {
		return this.aClass6_30 != null || this.method27342(arg0, arg1);
	}

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "(Lclient!de;Lclient!pd;)Z", line = 127)
	boolean method27353(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class386 arg1) {
		return this.aClass6_30 != null || this.method27342(arg0, arg1);
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(Lclient!de;Lclient!pd;)Z", line = 127)
	boolean method27364(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class386 arg1) {
		return this.aClass6_30 != null || this.method27342(arg0, arg1);
	}

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "(Lclient!de;IIIIIIIIII)V", line = 131)
	void method27340(@OriginalArg(0) Class21 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int arg6) {
		if (this.aClass6_30 == null) {
			return;
		}
		@Pc(6) float[] local6 = new float[3];
		@Pc(15) float local15 = (float) -(this.anInt4725 - arg3 << 16);
		@Pc(23) float local23 = (float) (this.anInt4726 - arg4 << 15);
		@Pc(32) float local32 = (float) -(this.anInt4727 - arg5 << 16);
		@Pc(35) float[] local35 = new float[3];
		arg0.method17107().method26223(local35);
		@Pc(46) float local46 = local15 + local35[0];
		@Pc(52) float local52 = local23 + local35[1];
		@Pc(58) float local58 = local32 + local35[2];
		arg0.method17138(local46, local52, local58, local6);
		if (local6[2] < 0.0F) {
			return;
		}
		@Pc(82) int local82 = (int) (local6[0] - (float) (this.anInt4734 / 2));
		@Pc(93) int local93 = (int) (local6[1] - (float) (this.anInt4734 / 2));
		if (local93 < arg2 && local93 + this.anInt4734 > 0 && local82 < arg1 && local82 + this.anInt4734 > 0) {
			this.aClass6_30.method16824(local82, local93, this.anInt4734, this.anInt4734, 0, arg6 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "(Lclient!de;IIIIIIIIII)V", line = 131)
	void method27355(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (this.aClass6_30 == null) {
			return;
		}
		@Pc(6) float[] local6 = new float[3];
		@Pc(15) float local15 = (float) -(this.anInt4725 - arg7 << 16);
		@Pc(23) float local23 = (float) (this.anInt4726 - arg8 << 15);
		@Pc(32) float local32 = (float) -(this.anInt4727 - arg9 << 16);
		@Pc(35) float[] local35 = new float[3];
		arg0.method17107().method26223(local35);
		@Pc(46) float local46 = local15 + local35[0];
		@Pc(52) float local52 = local23 + local35[1];
		@Pc(58) float local58 = local32 + local35[2];
		arg0.method17138(local46, local52, local58, local6);
		if (local6[2] < 0.0F) {
			return;
		}
		@Pc(82) int local82 = (int) (local6[0] - (float) (this.anInt4734 / 2));
		@Pc(93) int local93 = (int) (local6[1] - (float) (this.anInt4734 / 2));
		if (local93 < arg4 && local93 + this.anInt4734 > 0 && local82 < arg3 && local82 + this.anInt4734 > 0) {
			this.aClass6_30.method16824(local82, local93, this.anInt4734, this.anInt4734, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "(Lclient!de;IIIIIIIIII)V", line = 131)
	void method27356(@OriginalArg(0) Class21 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int arg6) {
		if (this.aClass6_30 == null) {
			return;
		}
		@Pc(6) float[] local6 = new float[3];
		@Pc(15) float local15 = (float) -(this.anInt4725 - arg3 << 16);
		@Pc(23) float local23 = (float) (this.anInt4726 - arg4 << 15);
		@Pc(32) float local32 = (float) -(this.anInt4727 - arg5 << 16);
		@Pc(35) float[] local35 = new float[3];
		arg0.method17107().method26223(local35);
		@Pc(46) float local46 = local15 + local35[0];
		@Pc(52) float local52 = local23 + local35[1];
		@Pc(58) float local58 = local32 + local35[2];
		arg0.method17138(local46, local52, local58, local6);
		if (local6[2] < 0.0F) {
			return;
		}
		@Pc(82) int local82 = (int) (local6[0] - (float) (this.anInt4734 / 2));
		@Pc(93) int local93 = (int) (local6[1] - (float) (this.anInt4734 / 2));
		if (local93 < arg2 && local93 + this.anInt4734 > 0 && local82 < arg1 && local82 + this.anInt4734 > 0) {
			this.aClass6_30.method16824(local82, local93, this.anInt4734, this.anInt4734, 0, arg6 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "(Lclient!de;IIIIIIIIII)V", line = 131)
	void method27357(@OriginalArg(0) Class21 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int arg6) {
		if (this.aClass6_30 == null) {
			return;
		}
		@Pc(6) float[] local6 = new float[3];
		@Pc(15) float local15 = (float) -(this.anInt4725 - arg3 << 16);
		@Pc(23) float local23 = (float) (this.anInt4726 - arg4 << 15);
		@Pc(32) float local32 = (float) -(this.anInt4727 - arg5 << 16);
		@Pc(35) float[] local35 = new float[3];
		arg0.method17107().method26223(local35);
		@Pc(46) float local46 = local15 + local35[0];
		@Pc(52) float local52 = local23 + local35[1];
		@Pc(58) float local58 = local32 + local35[2];
		arg0.method17138(local46, local52, local58, local6);
		if (local6[2] < 0.0F) {
			return;
		}
		@Pc(82) int local82 = (int) (local6[0] - (float) (this.anInt4734 / 2));
		@Pc(93) int local93 = (int) (local6[1] - (float) (this.anInt4734 / 2));
		if (local93 < arg2 && local93 + this.anInt4734 > 0 && local82 < arg1 && local82 + this.anInt4734 > 0) {
			this.aClass6_30.method16824(local82, local93, this.anInt4734, this.anInt4734, 0, arg6 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "(Lclient!de;Lclient!pd;)Z", line = 153)
	boolean method27342(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class386 arg1) {
		if (this.aClass6_30 == null) {
			if (this.anInt4744 == 0) {
				if (Class451.anInterface11_10.method21977(this.anInt4723, Class459.aClass459_1, 0.7F, this.anInt4731, this.anInt4731)) {
					@Pc(30) int[] local30 = Class451.anInterface11_10.method21974(this.anInt4723, 0.7F, this.anInt4731, this.anInt4731);
					this.aClass6_30 = arg0.method17113(local30, 0, this.anInt4731, this.anInt4731, this.anInt4731);
				}
			} else if (this.anInt4744 == 2) {
				this.method27343(arg0, arg1);
			} else if (this.anInt4744 == 1) {
				this.method27344(arg0, arg1);
			}
		}
		return this.aClass6_30 != null;
	}

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "(Lclient!de;Lclient!pd;)V", line = 171)
	void method27337(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class386 arg1) {
		@Pc(5) Class138 local5 = Class138.method22955(Class134.aClass359_34, this.anInt4723, 0);
		if (local5 == null) {
			return;
		}
		arg0.method17060(anIntArray429);
		arg0.method17079(0, 0, this.anInt4731, this.anInt4731);
		arg0.method17061(2, 0);
		arg0.method17050(0, 0, this.anInt4731, this.anInt4731, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean745) {
				local35 = -arg1.anInt4725;
				local37 = -arg1.anInt4726;
				local39 = -arg1.anInt4727;
			} else {
				local35 = this.anInt4725 - arg1.anInt4725;
				local37 = this.anInt4726 - arg1.anInt4726;
				local39 = this.anInt4727 - arg1.anInt4727;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt4730 != 0) {
			local84 = -this.anInt4730 & 0x3FFF;
			local88 = Class317.anIntArray419[local84];
			local92 = Class317.anIntArray420[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt4732 != 0) {
			local84 = -this.anInt4732 & 0x3FFF;
			local88 = Class317.anIntArray419[local84];
			local92 = Class317.anIntArray420[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method17111(1.0F);
		arg0.method17132(this.anInt4729, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method22972(this.anInt4735 & 0x3FFF, this.anInt4736 & 0x3FFF, this.anInt4737 & 0x3FFF);
		@Pc(190) Class20 local190 = arg0.method17100(local5, 2048, 0, 64, 768);
		local88 = local190.method5358() - local190.method5363();
		local92 = local190.method5486() - local190.method5466();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt4731 * 1024 / local102;
		@Pc(219) Class328 local219 = arg0.method17110();
		@Pc(222) Class328 local222 = arg0.method17333();
		local222.method26060((float) (this.anInt4731 / 2), (float) (this.anInt4731 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method17037().method21390(), (float) arg0.method17037().method21391(), 1024.0F);
		arg0.method17322(local222);
		@Pc(258) Class332 local258 = new Class332();
		arg0.method17106(local258);
		@Pc(264) Class332 local264 = arg0.method17098();
		local264.method26201(0.0F, 0.0F, (float) (50 - local190.method5450()));
		local190.method5352(local264, null, 1);
		this.aClass6_30 = arg0.method17090(0, 0, this.anInt4731, this.anInt4731, true);
		this.aClass6_30.method16780(0, 0, 3);
		arg0.method17322(local219);
		arg0.method17079(anIntArray429[0], anIntArray429[1], anIntArray429[2], anIntArray429[3]);
	}

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "(Lclient!de;Lclient!pd;)V", line = 171)
	void method27343(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class386 arg1) {
		@Pc(5) Class138 local5 = Class138.method22955(Class134.aClass359_34, this.anInt4723, 0);
		if (local5 == null) {
			return;
		}
		arg0.method17060(anIntArray429);
		arg0.method17079(0, 0, this.anInt4731, this.anInt4731);
		arg0.method17061(2, 0);
		arg0.method17050(0, 0, this.anInt4731, this.anInt4731, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean745) {
				local35 = -arg1.anInt4725;
				local37 = -arg1.anInt4726;
				local39 = -arg1.anInt4727;
			} else {
				local35 = this.anInt4725 - arg1.anInt4725;
				local37 = this.anInt4726 - arg1.anInt4726;
				local39 = this.anInt4727 - arg1.anInt4727;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt4730 != 0) {
			local84 = -this.anInt4730 & 0x3FFF;
			local88 = Class317.anIntArray419[local84];
			local92 = Class317.anIntArray420[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt4732 != 0) {
			local84 = -this.anInt4732 & 0x3FFF;
			local88 = Class317.anIntArray419[local84];
			local92 = Class317.anIntArray420[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method17111(1.0F);
		arg0.method17132(this.anInt4729, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method22972(this.anInt4735 & 0x3FFF, this.anInt4736 & 0x3FFF, this.anInt4737 & 0x3FFF);
		@Pc(190) Class20 local190 = arg0.method17100(local5, 2048, 0, 64, 768);
		local88 = local190.method5358() - local190.method5363();
		local92 = local190.method5486() - local190.method5466();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt4731 * 1024 / local102;
		@Pc(219) Class328 local219 = arg0.method17110();
		@Pc(222) Class328 local222 = arg0.method17333();
		local222.method26060((float) (this.anInt4731 / 2), (float) (this.anInt4731 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method17037().method21390(), (float) arg0.method17037().method21391(), 1024.0F);
		arg0.method17322(local222);
		@Pc(258) Class332 local258 = new Class332();
		arg0.method17106(local258);
		@Pc(264) Class332 local264 = arg0.method17098();
		local264.method26201(0.0F, 0.0F, (float) (50 - local190.method5450()));
		local190.method5352(local264, null, 1);
		this.aClass6_30 = arg0.method17090(0, 0, this.anInt4731, this.anInt4731, true);
		this.aClass6_30.method16780(0, 0, 3);
		arg0.method17322(local219);
		arg0.method17079(anIntArray429[0], anIntArray429[1], anIntArray429[2], anIntArray429[3]);
	}

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "(Lclient!de;Lclient!pd;)V", line = 232)
	void method27344(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class386 arg1) {
		method27345(arg0);
		method27358(arg0);
		arg0.method17060(anIntArray429);
		arg0.method17079(0, 0, this.anInt4731, this.anInt4731);
		arg0.method17061(2, 0);
		arg0.method17050(0, 0, this.anInt4731, this.anInt4731, this.anInt4729 | 0xFF000000, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean745) {
				local33 = -arg1.anInt4725;
				local35 = -arg1.anInt4726;
				local37 = -arg1.anInt4727;
			} else {
				local33 = arg1.anInt4725 - this.anInt4725;
				local35 = arg1.anInt4726 - this.anInt4726;
				local37 = arg1.anInt4727 - this.anInt4727;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(96) int local96;
		if (this.anInt4730 != 0) {
			local81 = Class317.anIntArray419[this.anInt4730];
			local86 = Class317.anIntArray420[this.anInt4730];
			local96 = local35 * local86 - local37 * local81 >> 14;
			local37 = local35 * local81 + local37 * local86 >> 14;
			local35 = local96;
		}
		if (this.anInt4732 != 0) {
			local81 = Class317.anIntArray419[this.anInt4732];
			local86 = Class317.anIntArray420[this.anInt4732];
			local96 = local37 * local81 + local33 * local86 >> 14;
			local37 = local37 * local86 - local33 * local81 >> 14;
			local33 = local96;
		}
		@Pc(149) Class20 local149 = aClass20_5.method5430((byte) 0, 51200, true);
		local149.method5372((short) 0, (short) this.anInt4723);
		arg0.method17111(1.0F);
		arg0.method17132(16777215, 1.0F, 1.0F, (float) local33, (float) local35, (float) local37);
		local86 = this.anInt4731 * 1024 / (local149.method5358() - local149.method5363());
		if (this.anInt4729 != 0) {
			local86 = local86 * 13 / 16;
		}
		@Pc(192) Class328 local192 = arg0.method17110();
		@Pc(195) Class328 local195 = arg0.method17333();
		local195.method26060((float) (this.anInt4731 / 2), (float) (this.anInt4731 / 2), (float) local86, (float) local86, 50.0F, 50000.0F, (float) arg0.method17037().method21390(), (float) arg0.method17037().method21391(), 1024.0F);
		arg0.method17322(local195);
		arg0.method17106(new Class332());
		@Pc(236) Class332 local236 = new Class332();
		local236.method26201(0.0F, 0.0F, (float) (50 - local149.method5450()));
		local149.method5352(local236, null, 1);
		@Pc(257) int local257 = this.anInt4731 * 13 / 16;
		@Pc(264) int local264 = (this.anInt4731 - local257) / 2;
		aClass6_29.method16824(local264, local264, local257, local257, 0, this.anInt4729 | 0xFF000000, 1);
		this.aClass6_30 = arg0.method17090(0, 0, this.anInt4731, this.anInt4731, true);
		arg0.method17061(2, 0);
		arg0.method17050(0, 0, this.anInt4731, this.anInt4731, 0, 0);
		aClass6_31.method16824(0, 0, this.anInt4731, this.anInt4731, 1, 0, 0);
		this.aClass6_30.method16780(0, 0, 3);
		arg0.method17322(local192);
		arg0.method17079(anIntArray429[0], anIntArray429[1], anIntArray429[2], anIntArray429[3]);
	}

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "(Lclient!de;Lclient!pd;)V", line = 232)
	void method27359(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class386 arg1) {
		method27345(arg0);
		method27358(arg0);
		arg0.method17060(anIntArray429);
		arg0.method17079(0, 0, this.anInt4731, this.anInt4731);
		arg0.method17061(2, 0);
		arg0.method17050(0, 0, this.anInt4731, this.anInt4731, this.anInt4729 | 0xFF000000, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean745) {
				local33 = -arg1.anInt4725;
				local35 = -arg1.anInt4726;
				local37 = -arg1.anInt4727;
			} else {
				local33 = arg1.anInt4725 - this.anInt4725;
				local35 = arg1.anInt4726 - this.anInt4726;
				local37 = arg1.anInt4727 - this.anInt4727;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(96) int local96;
		if (this.anInt4730 != 0) {
			local81 = Class317.anIntArray419[this.anInt4730];
			local86 = Class317.anIntArray420[this.anInt4730];
			local96 = local35 * local86 - local37 * local81 >> 14;
			local37 = local35 * local81 + local37 * local86 >> 14;
			local35 = local96;
		}
		if (this.anInt4732 != 0) {
			local81 = Class317.anIntArray419[this.anInt4732];
			local86 = Class317.anIntArray420[this.anInt4732];
			local96 = local37 * local81 + local33 * local86 >> 14;
			local37 = local37 * local86 - local33 * local81 >> 14;
			local33 = local96;
		}
		@Pc(149) Class20 local149 = aClass20_5.method5430((byte) 0, 51200, true);
		local149.method5372((short) 0, (short) this.anInt4723);
		arg0.method17111(1.0F);
		arg0.method17132(16777215, 1.0F, 1.0F, (float) local33, (float) local35, (float) local37);
		local86 = this.anInt4731 * 1024 / (local149.method5358() - local149.method5363());
		if (this.anInt4729 != 0) {
			local86 = local86 * 13 / 16;
		}
		@Pc(192) Class328 local192 = arg0.method17110();
		@Pc(195) Class328 local195 = arg0.method17333();
		local195.method26060((float) (this.anInt4731 / 2), (float) (this.anInt4731 / 2), (float) local86, (float) local86, 50.0F, 50000.0F, (float) arg0.method17037().method21390(), (float) arg0.method17037().method21391(), 1024.0F);
		arg0.method17322(local195);
		arg0.method17106(new Class332());
		@Pc(236) Class332 local236 = new Class332();
		local236.method26201(0.0F, 0.0F, (float) (50 - local149.method5450()));
		local149.method5352(local236, null, 1);
		@Pc(257) int local257 = this.anInt4731 * 13 / 16;
		@Pc(264) int local264 = (this.anInt4731 - local257) / 2;
		aClass6_29.method16824(local264, local264, local257, local257, 0, this.anInt4729 | 0xFF000000, 1);
		this.aClass6_30 = arg0.method17090(0, 0, this.anInt4731, this.anInt4731, true);
		arg0.method17061(2, 0);
		arg0.method17050(0, 0, this.anInt4731, this.anInt4731, 0, 0);
		aClass6_31.method16824(0, 0, this.anInt4731, this.anInt4731, 1, 0, 0);
		this.aClass6_30.method16780(0, 0, 3);
		arg0.method17322(local192);
		arg0.method17079(anIntArray429[0], anIntArray429[1], anIntArray429[2], anIntArray429[3]);
	}

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "(Lclient!de;)V", line = 294)
	static void method27345(@OriginalArg(0) Class21 arg0) {
		if (aClass20_5 != null) {
			return;
		}
		@Pc(8) Class138 local8 = new Class138(580, 1104, 1);
		local8.method22950((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
		local8.method22958(0, 128, 0);
		local8.method22958(0, -128, 0);
		for (@Pc(34) int local34 = 0; local34 <= 24; local34++) {
			@Pc(43) int local43 = local34 * 8192 / 24;
			@Pc(47) int local47 = Class317.anIntArray419[local43];
			@Pc(51) int local51 = Class317.anIntArray420[local43];
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(68) int local68;
			@Pc(76) int local76;
			@Pc(84) int local84;
			for (local53 = 1; local53 < 24; local53++) {
				local62 = local53 * 8192 / 24;
				local68 = Class317.anIntArray420[local62] >> 7;
				local76 = Class317.anIntArray419[local62] * local47 >> 21;
				local84 = Class317.anIntArray419[local62] * local51 >> 21;
				local8.method22958(local84, local68, -local76);
			}
			if (local34 > 0) {
				local53 = local34 * 23 + 2;
				local62 = local53 - 23;
				local8.method22959(0, local62, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				for (local68 = 1; local68 < 23; local68++) {
					local76 = local62 + 1;
					local84 = local53 + 1;
					local8.method22959(local62, local76, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local8.method22959(local76, local84, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local62 = local76;
					local53 = local84;
				}
				local8.method22959(local53, local62, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
			}
		}
		local8.anInt3411 = local8.anInt3410;
		local8.anIntArray334 = null;
		local8.anIntArray330 = null;
		local8.aByteArray63 = null;
		aClass20_5 = arg0.method17100(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "(Lclient!de;)V", line = 294)
	static void method27350(@OriginalArg(0) Class21 arg0) {
		if (aClass20_5 != null) {
			return;
		}
		@Pc(8) Class138 local8 = new Class138(580, 1104, 1);
		local8.method22950((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
		local8.method22958(0, 128, 0);
		local8.method22958(0, -128, 0);
		for (@Pc(34) int local34 = 0; local34 <= 24; local34++) {
			@Pc(43) int local43 = local34 * 8192 / 24;
			@Pc(47) int local47 = Class317.anIntArray419[local43];
			@Pc(51) int local51 = Class317.anIntArray420[local43];
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(68) int local68;
			@Pc(76) int local76;
			@Pc(84) int local84;
			for (local53 = 1; local53 < 24; local53++) {
				local62 = local53 * 8192 / 24;
				local68 = Class317.anIntArray420[local62] >> 7;
				local76 = Class317.anIntArray419[local62] * local47 >> 21;
				local84 = Class317.anIntArray419[local62] * local51 >> 21;
				local8.method22958(local84, local68, -local76);
			}
			if (local34 > 0) {
				local53 = local34 * 23 + 2;
				local62 = local53 - 23;
				local8.method22959(0, local62, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				for (local68 = 1; local68 < 23; local68++) {
					local76 = local62 + 1;
					local84 = local53 + 1;
					local8.method22959(local62, local76, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local8.method22959(local76, local84, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local62 = local76;
					local53 = local84;
				}
				local8.method22959(local53, local62, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
			}
		}
		local8.anInt3411 = local8.anInt3410;
		local8.anIntArray334 = null;
		local8.anIntArray330 = null;
		local8.aByteArray63 = null;
		aClass20_5 = arg0.method17100(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "(Lclient!de;)V", line = 294)
	static void method27360(@OriginalArg(0) Class21 arg0) {
		if (aClass20_5 != null) {
			return;
		}
		@Pc(8) Class138 local8 = new Class138(580, 1104, 1);
		local8.method22950((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
		local8.method22958(0, 128, 0);
		local8.method22958(0, -128, 0);
		for (@Pc(34) int local34 = 0; local34 <= 24; local34++) {
			@Pc(43) int local43 = local34 * 8192 / 24;
			@Pc(47) int local47 = Class317.anIntArray419[local43];
			@Pc(51) int local51 = Class317.anIntArray420[local43];
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(68) int local68;
			@Pc(76) int local76;
			@Pc(84) int local84;
			for (local53 = 1; local53 < 24; local53++) {
				local62 = local53 * 8192 / 24;
				local68 = Class317.anIntArray420[local62] >> 7;
				local76 = Class317.anIntArray419[local62] * local47 >> 21;
				local84 = Class317.anIntArray419[local62] * local51 >> 21;
				local8.method22958(local84, local68, -local76);
			}
			if (local34 > 0) {
				local53 = local34 * 23 + 2;
				local62 = local53 - 23;
				local8.method22959(0, local62, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				for (local68 = 1; local68 < 23; local68++) {
					local76 = local62 + 1;
					local84 = local53 + 1;
					local8.method22959(local62, local76, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local8.method22959(local76, local84, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local62 = local76;
					local53 = local84;
				}
				local8.method22959(local53, local62, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
			}
		}
		local8.anInt3411 = local8.anInt3410;
		local8.anIntArray334 = null;
		local8.anIntArray330 = null;
		local8.aByteArray63 = null;
		aClass20_5 = arg0.method17100(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(Lclient!de;)V", line = 294)
	static void method27361(@OriginalArg(0) Class21 arg0) {
		if (aClass20_5 != null) {
			return;
		}
		@Pc(8) Class138 local8 = new Class138(580, 1104, 1);
		local8.method22950((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
		local8.method22958(0, 128, 0);
		local8.method22958(0, -128, 0);
		for (@Pc(34) int local34 = 0; local34 <= 24; local34++) {
			@Pc(43) int local43 = local34 * 8192 / 24;
			@Pc(47) int local47 = Class317.anIntArray419[local43];
			@Pc(51) int local51 = Class317.anIntArray420[local43];
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(68) int local68;
			@Pc(76) int local76;
			@Pc(84) int local84;
			for (local53 = 1; local53 < 24; local53++) {
				local62 = local53 * 8192 / 24;
				local68 = Class317.anIntArray420[local62] >> 7;
				local76 = Class317.anIntArray419[local62] * local47 >> 21;
				local84 = Class317.anIntArray419[local62] * local51 >> 21;
				local8.method22958(local84, local68, -local76);
			}
			if (local34 > 0) {
				local53 = local34 * 23 + 2;
				local62 = local53 - 23;
				local8.method22959(0, local62, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				for (local68 = 1; local68 < 23; local68++) {
					local76 = local62 + 1;
					local84 = local53 + 1;
					local8.method22959(local62, local76, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local8.method22959(local76, local84, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local62 = local76;
					local53 = local84;
				}
				local8.method22959(local53, local62, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
			}
		}
		local8.anInt3411 = local8.anInt3410;
		local8.anIntArray334 = null;
		local8.anIntArray330 = null;
		local8.aByteArray63 = null;
		aClass20_5 = arg0.method17100(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!pd", name = "af", descriptor = "(Lclient!de;)V", line = 337)
	static void method27347(@OriginalArg(0) Class21 arg0) {
		if (aClass6_31 != null) {
			return;
		}
		@Pc(4) int[] local4 = new int[16384];
		@Pc(7) int[] local7 = new int[16384];
		for (@Pc(9) int local9 = 0; local9 < 64; local9++) {
			@Pc(16) int local16 = 64 - local9;
			@Pc(20) int local20 = local16 * local16;
			@Pc(26) int local26 = 128 - local9 - 1;
			@Pc(30) int local30 = local9 * 128;
			@Pc(34) int local34 = local26 * 128;
			for (@Pc(36) int local36 = 0; local36 < 64; local36++) {
				@Pc(43) int local43 = 64 - local36;
				@Pc(47) int local47 = local43 * local43;
				@Pc(53) int local53 = 128 - local36 - 1;
				@Pc(63) int local63 = 256 - (local47 + local20 << 8) / 4096;
				local63 = local63 * 3072 / 1536;
				if (local63 < 0) {
					local63 = 0;
				} else if (local63 > 255) {
					local63 = 255;
				}
				@Pc(83) int local83 = local63 / 2;
				local7[local30 + local36] = local7[local30 + local53] = local7[local34 + local36] = local7[local34 + local53] = (local63 | 0xFF00) << 16;
				local4[local30 + local36] = local4[local30 + local53] = local4[local34 + local36] = local4[local34 + local53] = 127 - local83 << 24 | 0xFFFFFF;
			}
		}
		aClass6_31 = arg0.method17113(local7, 0, 128, 128, 128);
		aClass6_29 = arg0.method17113(local4, 0, 128, 128, 128);
	}

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "(Lclient!de;)V", line = 337)
	static void method27358(@OriginalArg(0) Class21 arg0) {
		if (aClass6_31 != null) {
			return;
		}
		@Pc(4) int[] local4 = new int[16384];
		@Pc(7) int[] local7 = new int[16384];
		for (@Pc(9) int local9 = 0; local9 < 64; local9++) {
			@Pc(16) int local16 = 64 - local9;
			@Pc(20) int local20 = local16 * local16;
			@Pc(26) int local26 = 128 - local9 - 1;
			@Pc(30) int local30 = local9 * 128;
			@Pc(34) int local34 = local26 * 128;
			for (@Pc(36) int local36 = 0; local36 < 64; local36++) {
				@Pc(43) int local43 = 64 - local36;
				@Pc(47) int local47 = local43 * local43;
				@Pc(53) int local53 = 128 - local36 - 1;
				@Pc(63) int local63 = 256 - (local47 + local20 << 8) / 4096;
				local63 = local63 * 3072 / 1536;
				if (local63 < 0) {
					local63 = 0;
				} else if (local63 > 255) {
					local63 = 255;
				}
				@Pc(83) int local83 = local63 / 2;
				local7[local30 + local36] = local7[local30 + local53] = local7[local34 + local36] = local7[local34 + local53] = (local63 | 0xFF00) << 16;
				local4[local30 + local36] = local4[local30 + local53] = local4[local34 + local36] = local4[local34 + local53] = 127 - local83 << 24 | 0xFFFFFF;
			}
		}
		aClass6_31 = arg0.method17113(local7, 0, 128, 128, 128);
		aClass6_29 = arg0.method17113(local4, 0, 128, 128, 128);
	}

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "(Lclient!de;)V", line = 337)
	static void method27362(@OriginalArg(0) Class21 arg0) {
		if (aClass6_31 != null) {
			return;
		}
		@Pc(4) int[] local4 = new int[16384];
		@Pc(7) int[] local7 = new int[16384];
		for (@Pc(9) int local9 = 0; local9 < 64; local9++) {
			@Pc(16) int local16 = 64 - local9;
			@Pc(20) int local20 = local16 * local16;
			@Pc(26) int local26 = 128 - local9 - 1;
			@Pc(30) int local30 = local9 * 128;
			@Pc(34) int local34 = local26 * 128;
			for (@Pc(36) int local36 = 0; local36 < 64; local36++) {
				@Pc(43) int local43 = 64 - local36;
				@Pc(47) int local47 = local43 * local43;
				@Pc(53) int local53 = 128 - local36 - 1;
				@Pc(63) int local63 = 256 - (local47 + local20 << 8) / 4096;
				local63 = local63 * 3072 / 1536;
				if (local63 < 0) {
					local63 = 0;
				} else if (local63 > 255) {
					local63 = 255;
				}
				@Pc(83) int local83 = local63 / 2;
				local7[local30 + local36] = local7[local30 + local53] = local7[local34 + local36] = local7[local34 + local53] = (local63 | 0xFF00) << 16;
				local4[local30 + local36] = local4[local30 + local53] = local4[local34 + local36] = local4[local34 + local53] = 127 - local83 << 24 | 0xFFFFFF;
			}
		}
		aClass6_31 = arg0.method17113(local7, 0, 128, 128, 128);
		aClass6_29 = arg0.method17113(local4, 0, 128, 128, 128);
	}

	@OriginalMember(owner = "client!pd", name = "at", descriptor = "(Lclient!de;)V", line = 337)
	static void method27363(@OriginalArg(0) Class21 arg0) {
		if (aClass6_31 != null) {
			return;
		}
		@Pc(4) int[] local4 = new int[16384];
		@Pc(7) int[] local7 = new int[16384];
		for (@Pc(9) int local9 = 0; local9 < 64; local9++) {
			@Pc(16) int local16 = 64 - local9;
			@Pc(20) int local20 = local16 * local16;
			@Pc(26) int local26 = 128 - local9 - 1;
			@Pc(30) int local30 = local9 * 128;
			@Pc(34) int local34 = local26 * 128;
			for (@Pc(36) int local36 = 0; local36 < 64; local36++) {
				@Pc(43) int local43 = 64 - local36;
				@Pc(47) int local47 = local43 * local43;
				@Pc(53) int local53 = 128 - local36 - 1;
				@Pc(63) int local63 = 256 - (local47 + local20 << 8) / 4096;
				local63 = local63 * 3072 / 1536;
				if (local63 < 0) {
					local63 = 0;
				} else if (local63 > 255) {
					local63 = 255;
				}
				@Pc(83) int local83 = local63 / 2;
				local7[local30 + local36] = local7[local30 + local53] = local7[local34 + local36] = local7[local34 + local53] = (local63 | 0xFF00) << 16;
				local4[local30 + local36] = local4[local30 + local53] = local4[local34 + local36] = local4[local34 + local53] = 127 - local83 << 24 | 0xFFFFFF;
			}
		}
		aClass6_31 = arg0.method17113(local7, 0, 128, 128, 128);
		aClass6_29 = arg0.method17113(local4, 0, 128, 128, 128);
	}
}
