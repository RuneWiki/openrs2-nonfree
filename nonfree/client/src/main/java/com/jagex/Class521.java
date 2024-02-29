package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public class Class521 {

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
	static final int anInt5129 = 0;

	@OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
	static final int anInt5130 = 1;

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "I")
	static final int anInt5131 = 2;

	@OriginalMember(owner = "client!rv", name = "al", descriptor = "Lclient!cy;")
	static Class83 aClass83_32;

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
	static final int anInt5136 = 512;

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
	static final int anInt5138 = 128;

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
	static final int anInt5147 = 24;

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
	static final int anInt5148 = 24;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
	static final int anInt5149 = 192;

	@OriginalMember(owner = "client!rv", name = "ag", descriptor = "Lclient!cy;")
	static Class83 aClass83_33;

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
	static final int anInt5150 = 13;

	@OriginalMember(owner = "client!rv", name = "aj", descriptor = "I")
	static final int anInt5151 = 16;

	@OriginalMember(owner = "client!rv", name = "ai", descriptor = "Lclient!dv;")
	static Class84 aClass84_6;

	@OriginalMember(owner = "client!rv", name = "ao", descriptor = "[I")
	static final int[] anIntArray479 = new int[4];

	@OriginalMember(owner = "client!rv", name = "z", descriptor = "I")
	int anInt5128;

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
	int anInt5139;

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
	int anInt5140;

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
	int anInt5141;

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
	int anInt5142;

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "Lclient!cy;")
	Class83 aClass83_34;

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
	final int anInt5152;

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "I")
	final int anInt5134;

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
	final int anInt5135;

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "Z")
	final boolean aBoolean782;

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
	final int anInt5143;

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "I")
	final int anInt5137;

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "I")
	final int anInt5133;

	@OriginalMember(owner = "client!rv", name = "w", descriptor = "I")
	final int anInt5132;

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
	int anInt5144;

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
	int anInt5145;

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
	int anInt5146;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(IIIIIIIZIII)V", line = 66)
	public Class521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt5152 = arg2;
		this.anInt5134 = arg3;
		this.anInt5135 = arg4;
		this.aBoolean782 = arg7;
		this.anInt5143 = arg1;
		this.anInt5137 = arg6;
		this.anInt5133 = arg5;
		this.anInt5132 = arg0;
		this.anInt5144 = arg8;
		this.anInt5145 = arg9;
		this.anInt5146 = arg10;
	}

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "()V", line = 81)
	static void method30579() {
		aClass84_6 = null;
		aClass83_32 = null;
	}

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "()V", line = 81)
	static void method30580() {
		aClass84_6 = null;
		aClass83_32 = null;
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "()V", line = 81)
	static void method30581() {
		aClass84_6 = null;
		aClass83_32 = null;
	}

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "(IIII)Z", line = 89)
	boolean method30582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean782) {
			this.anInt5140 = 1073741823;
			local7 = this.anInt5152;
			local12 = this.anInt5134;
			local17 = this.anInt5135;
		} else {
			local7 = this.anInt5152 - arg0;
			local12 = this.anInt5134 - arg1;
			local17 = this.anInt5135 - arg2;
			this.anInt5140 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5140 == 0) {
				this.anInt5140 = 1;
			}
			local7 = (local7 << 8) / this.anInt5140;
			local12 = (local12 << 8) / this.anInt5140;
			local17 = (local17 << 8) / this.anInt5140;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5142 = this.anInt5133 * arg3 / (this.aBoolean782 ? 1024 : this.anInt5140);
		} else {
			this.anInt5142 = 0;
		}
		if (this.anInt5142 < 8) {
			this.aClass83_34 = null;
			return false;
		}
		@Pc(143) int local143 = Class199.method25492(this.anInt5142);
		if (local143 > arg3) {
			local143 = Class462.method29538(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5141) {
			this.anInt5141 = local143;
		}
		this.anInt5139 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt5128 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass83_34 = null;
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "(IIII)Z", line = 89)
	boolean method30583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean782) {
			this.anInt5140 = 1073741823;
			local7 = this.anInt5152;
			local12 = this.anInt5134;
			local17 = this.anInt5135;
		} else {
			local7 = this.anInt5152 - arg0;
			local12 = this.anInt5134 - arg1;
			local17 = this.anInt5135 - arg2;
			this.anInt5140 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5140 == 0) {
				this.anInt5140 = 1;
			}
			local7 = (local7 << 8) / this.anInt5140;
			local12 = (local12 << 8) / this.anInt5140;
			local17 = (local17 << 8) / this.anInt5140;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5142 = this.anInt5133 * arg3 / (this.aBoolean782 ? 1024 : this.anInt5140);
		} else {
			this.anInt5142 = 0;
		}
		if (this.anInt5142 < 8) {
			this.aClass83_34 = null;
			return false;
		}
		@Pc(143) int local143 = Class199.method25492(this.anInt5142);
		if (local143 > arg3) {
			local143 = Class462.method29538(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5141) {
			this.anInt5141 = local143;
		}
		this.anInt5139 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt5128 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass83_34 = null;
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(IIII)Z", line = 89)
	boolean method30584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean782) {
			this.anInt5140 = 1073741823;
			local7 = this.anInt5152;
			local12 = this.anInt5134;
			local17 = this.anInt5135;
		} else {
			local7 = this.anInt5152 - arg0;
			local12 = this.anInt5134 - arg1;
			local17 = this.anInt5135 - arg2;
			this.anInt5140 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5140 == 0) {
				this.anInt5140 = 1;
			}
			local7 = (local7 << 8) / this.anInt5140;
			local12 = (local12 << 8) / this.anInt5140;
			local17 = (local17 << 8) / this.anInt5140;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5142 = this.anInt5133 * arg3 / (this.aBoolean782 ? 1024 : this.anInt5140);
		} else {
			this.anInt5142 = 0;
		}
		if (this.anInt5142 < 8) {
			this.aClass83_34 = null;
			return false;
		}
		@Pc(143) int local143 = Class199.method25492(this.anInt5142);
		if (local143 > arg3) {
			local143 = Class462.method29538(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5141) {
			this.anInt5141 = local143;
		}
		this.anInt5139 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt5128 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass83_34 = null;
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "v", descriptor = "(Lclient!dx;Lclient!rv;)Z", line = 128)
	boolean method30585(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class521 arg1) {
		return this.aClass83_34 != null || this.method30591(arg0, arg1);
	}

	@OriginalMember(owner = "client!rv", name = "z", descriptor = "(Lclient!dx;Lclient!rv;)Z", line = 128)
	boolean method30586(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class521 arg1) {
		return this.aClass83_34 != null || this.method30591(arg0, arg1);
	}

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "(Lclient!dx;IIIIIIIIII)V", line = 132)
	void method30587(@OriginalArg(0) Class86 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int arg6) {
		if (this.aClass83_34 == null) {
			return;
		}
		@Pc(6) float[] local6 = new float[3];
		@Pc(15) float local15 = (float) -(this.anInt5152 - arg3 << 16);
		@Pc(23) float local23 = (float) (this.anInt5134 - arg4 << 15);
		@Pc(32) float local32 = (float) -(this.anInt5135 - arg5 << 16);
		@Pc(35) float[] local35 = new float[3];
		arg0.method20294().method29453(local35);
		@Pc(46) float local46 = local15 + local35[0];
		@Pc(52) float local52 = local23 + local35[1];
		@Pc(58) float local58 = local32 + local35[2];
		arg0.method20148(local46, local52, local58, local6);
		if (local6[2] < 0.0F) {
			return;
		}
		@Pc(82) int local82 = (int) (local6[0] - (float) (this.anInt5142 / 2));
		@Pc(93) int local93 = (int) (local6[1] - (float) (this.anInt5142 / 2));
		if (local93 < arg2 && local93 + this.anInt5142 > 0 && local82 < arg1 && local82 + this.anInt5142 > 0) {
			this.aClass83_34.method18129(local82, local93, this.anInt5142, this.anInt5142, 0, arg6 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "(Lclient!dx;IIIIIIIIII)V", line = 132)
	void method30588(@OriginalArg(0) Class86 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int arg6) {
		if (this.aClass83_34 == null) {
			return;
		}
		@Pc(6) float[] local6 = new float[3];
		@Pc(15) float local15 = (float) -(this.anInt5152 - arg3 << 16);
		@Pc(23) float local23 = (float) (this.anInt5134 - arg4 << 15);
		@Pc(32) float local32 = (float) -(this.anInt5135 - arg5 << 16);
		@Pc(35) float[] local35 = new float[3];
		arg0.method20294().method29453(local35);
		@Pc(46) float local46 = local15 + local35[0];
		@Pc(52) float local52 = local23 + local35[1];
		@Pc(58) float local58 = local32 + local35[2];
		arg0.method20148(local46, local52, local58, local6);
		if (local6[2] < 0.0F) {
			return;
		}
		@Pc(82) int local82 = (int) (local6[0] - (float) (this.anInt5142 / 2));
		@Pc(93) int local93 = (int) (local6[1] - (float) (this.anInt5142 / 2));
		if (local93 < arg2 && local93 + this.anInt5142 > 0 && local82 < arg1 && local82 + this.anInt5142 > 0) {
			this.aClass83_34.method18129(local82, local93, this.anInt5142, this.anInt5142, 0, arg6 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "(Lclient!dx;IIIIIIIIII)V", line = 132)
	void method30589(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (this.aClass83_34 == null) {
			return;
		}
		@Pc(6) float[] local6 = new float[3];
		@Pc(15) float local15 = (float) -(this.anInt5152 - arg7 << 16);
		@Pc(23) float local23 = (float) (this.anInt5134 - arg8 << 15);
		@Pc(32) float local32 = (float) -(this.anInt5135 - arg9 << 16);
		@Pc(35) float[] local35 = new float[3];
		arg0.method20294().method29453(local35);
		@Pc(46) float local46 = local15 + local35[0];
		@Pc(52) float local52 = local23 + local35[1];
		@Pc(58) float local58 = local32 + local35[2];
		arg0.method20148(local46, local52, local58, local6);
		if (local6[2] < 0.0F) {
			return;
		}
		@Pc(82) int local82 = (int) (local6[0] - (float) (this.anInt5142 / 2));
		@Pc(93) int local93 = (int) (local6[1] - (float) (this.anInt5142 / 2));
		if (local93 < arg4 && local93 + this.anInt5142 > 0 && local82 < arg3 && local82 + this.anInt5142 > 0) {
			this.aClass83_34.method18129(local82, local93, this.anInt5142, this.anInt5142, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "(Lclient!dx;IIIIIIIIII)V", line = 132)
	void method30590(@OriginalArg(0) Class86 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int arg6) {
		if (this.aClass83_34 == null) {
			return;
		}
		@Pc(6) float[] local6 = new float[3];
		@Pc(15) float local15 = (float) -(this.anInt5152 - arg3 << 16);
		@Pc(23) float local23 = (float) (this.anInt5134 - arg4 << 15);
		@Pc(32) float local32 = (float) -(this.anInt5135 - arg5 << 16);
		@Pc(35) float[] local35 = new float[3];
		arg0.method20294().method29453(local35);
		@Pc(46) float local46 = local15 + local35[0];
		@Pc(52) float local52 = local23 + local35[1];
		@Pc(58) float local58 = local32 + local35[2];
		arg0.method20148(local46, local52, local58, local6);
		if (local6[2] < 0.0F) {
			return;
		}
		@Pc(82) int local82 = (int) (local6[0] - (float) (this.anInt5142 / 2));
		@Pc(93) int local93 = (int) (local6[1] - (float) (this.anInt5142 / 2));
		if (local93 < arg2 && local93 + this.anInt5142 > 0 && local82 < arg1 && local82 + this.anInt5142 > 0) {
			this.aClass83_34.method18129(local82, local93, this.anInt5142, this.anInt5142, 0, arg6 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "(Lclient!dx;Lclient!rv;)Z", line = 154)
	boolean method30591(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class521 arg1) {
		if (this.aClass83_34 == null) {
			if (this.anInt5132 == 0) {
				if (Class108.anInterface24_11.method4231(Class596.aClass596_2, this.anInt5143, Class609.aClass609_2, 0.7F, this.anInt5141, this.anInt5141)) {
					@Pc(32) int[] local32 = Class108.anInterface24_11.method4225(Class596.aClass596_2, this.anInt5143, 0.7F, this.anInt5141, this.anInt5141);
					this.aClass83_34 = arg0.method20010(local32, 0, this.anInt5141, this.anInt5141, this.anInt5141);
				}
			} else if (this.anInt5132 == 2) {
				this.method30593(arg0, arg1);
			} else if (this.anInt5132 == 1) {
				this.method30597(arg0, arg1);
			}
		}
		return this.aClass83_34 != null;
	}

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "(Lclient!dx;Lclient!rv;)Z", line = 154)
	boolean method30592(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class521 arg1) {
		if (this.aClass83_34 == null) {
			if (this.anInt5132 == 0) {
				if (Class108.anInterface24_11.method4231(Class596.aClass596_2, this.anInt5143, Class609.aClass609_2, 0.7F, this.anInt5141, this.anInt5141)) {
					@Pc(32) int[] local32 = Class108.anInterface24_11.method4225(Class596.aClass596_2, this.anInt5143, 0.7F, this.anInt5141, this.anInt5141);
					this.aClass83_34 = arg0.method20010(local32, 0, this.anInt5141, this.anInt5141, this.anInt5141);
				}
			} else if (this.anInt5132 == 2) {
				this.method30593(arg0, arg1);
			} else if (this.anInt5132 == 1) {
				this.method30597(arg0, arg1);
			}
		}
		return this.aClass83_34 != null;
	}

	@OriginalMember(owner = "client!rv", name = "w", descriptor = "(Lclient!dx;Lclient!rv;)V", line = 172)
	void method30593(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class521 arg1) {
		@Pc(5) Class216 local5 = Class216.method25655(Class466.aClass478_124, this.anInt5143, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20142(anIntArray479);
		arg0.method20151(0, 0, this.anInt5141, this.anInt5141);
		arg0.method20125(2, 0);
		arg0.method20088(0, 0, this.anInt5141, this.anInt5141, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean782) {
				local35 = -arg1.anInt5152;
				local37 = -arg1.anInt5134;
				local39 = -arg1.anInt5135;
			} else {
				local35 = this.anInt5152 - arg1.anInt5152;
				local37 = this.anInt5134 - arg1.anInt5134;
				local39 = this.anInt5135 - arg1.anInt5135;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5139 != 0) {
			local84 = -this.anInt5139 & 0x3FFF;
			local88 = Class436.anIntArray464[local84];
			local92 = Class436.anIntArray463[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5128 != 0) {
			local84 = -this.anInt5128 & 0x3FFF;
			local88 = Class436.anIntArray464[local84];
			local92 = Class436.anIntArray463[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20255(1.0F);
		arg0.method20126(this.anInt5137, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method25691(this.anInt5144 & 0x3FFF, this.anInt5145 & 0x3FFF, this.anInt5146 & 0x3FFF);
		@Pc(190) Class84 local190 = arg0.method20115(local5, 2048, 0, 64, 768);
		local88 = local190.method6822() - local190.method6906();
		local92 = local190.method6825() - local190.method6824();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5141 * 1024 / local102;
		@Pc(219) Class442 local219 = arg0.method20124();
		@Pc(222) Class442 local222 = arg0.method20282();
		local222.method29011((float) (this.anInt5141 / 2), (float) (this.anInt5141 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method19940().method23491(), (float) arg0.method19940().method23493(), 1024.0F);
		arg0.method20123(local222);
		@Pc(258) Class455 local258 = new Class455();
		arg0.method20121(local258);
		@Pc(264) Class455 local264 = arg0.method20370();
		local264.method29428(0.0F, 0.0F, (float) (50 - local190.method6826()));
		local190.method6813(local264, null, 1);
		this.aClass83_34 = arg0.method20105(0, 0, this.anInt5141, this.anInt5141, true);
		this.aClass83_34.method18176(0, 0, 3);
		arg0.method20123(local219);
		arg0.method20151(anIntArray479[0], anIntArray479[1], anIntArray479[2], anIntArray479[3]);
	}

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "(Lclient!dx;Lclient!rv;)V", line = 172)
	void method30594(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class521 arg1) {
		@Pc(5) Class216 local5 = Class216.method25655(Class466.aClass478_124, this.anInt5143, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20142(anIntArray479);
		arg0.method20151(0, 0, this.anInt5141, this.anInt5141);
		arg0.method20125(2, 0);
		arg0.method20088(0, 0, this.anInt5141, this.anInt5141, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean782) {
				local35 = -arg1.anInt5152;
				local37 = -arg1.anInt5134;
				local39 = -arg1.anInt5135;
			} else {
				local35 = this.anInt5152 - arg1.anInt5152;
				local37 = this.anInt5134 - arg1.anInt5134;
				local39 = this.anInt5135 - arg1.anInt5135;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5139 != 0) {
			local84 = -this.anInt5139 & 0x3FFF;
			local88 = Class436.anIntArray464[local84];
			local92 = Class436.anIntArray463[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5128 != 0) {
			local84 = -this.anInt5128 & 0x3FFF;
			local88 = Class436.anIntArray464[local84];
			local92 = Class436.anIntArray463[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20255(1.0F);
		arg0.method20126(this.anInt5137, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method25691(this.anInt5144 & 0x3FFF, this.anInt5145 & 0x3FFF, this.anInt5146 & 0x3FFF);
		@Pc(190) Class84 local190 = arg0.method20115(local5, 2048, 0, 64, 768);
		local88 = local190.method6822() - local190.method6906();
		local92 = local190.method6825() - local190.method6824();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5141 * 1024 / local102;
		@Pc(219) Class442 local219 = arg0.method20124();
		@Pc(222) Class442 local222 = arg0.method20282();
		local222.method29011((float) (this.anInt5141 / 2), (float) (this.anInt5141 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method19940().method23491(), (float) arg0.method19940().method23493(), 1024.0F);
		arg0.method20123(local222);
		@Pc(258) Class455 local258 = new Class455();
		arg0.method20121(local258);
		@Pc(264) Class455 local264 = arg0.method20370();
		local264.method29428(0.0F, 0.0F, (float) (50 - local190.method6826()));
		local190.method6813(local264, null, 1);
		this.aClass83_34 = arg0.method20105(0, 0, this.anInt5141, this.anInt5141, true);
		this.aClass83_34.method18176(0, 0, 3);
		arg0.method20123(local219);
		arg0.method20151(anIntArray479[0], anIntArray479[1], anIntArray479[2], anIntArray479[3]);
	}

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "(Lclient!dx;Lclient!rv;)V", line = 172)
	void method30595(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class521 arg1) {
		@Pc(5) Class216 local5 = Class216.method25655(Class466.aClass478_124, this.anInt5143, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20142(anIntArray479);
		arg0.method20151(0, 0, this.anInt5141, this.anInt5141);
		arg0.method20125(2, 0);
		arg0.method20088(0, 0, this.anInt5141, this.anInt5141, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean782) {
				local35 = -arg1.anInt5152;
				local37 = -arg1.anInt5134;
				local39 = -arg1.anInt5135;
			} else {
				local35 = this.anInt5152 - arg1.anInt5152;
				local37 = this.anInt5134 - arg1.anInt5134;
				local39 = this.anInt5135 - arg1.anInt5135;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5139 != 0) {
			local84 = -this.anInt5139 & 0x3FFF;
			local88 = Class436.anIntArray464[local84];
			local92 = Class436.anIntArray463[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5128 != 0) {
			local84 = -this.anInt5128 & 0x3FFF;
			local88 = Class436.anIntArray464[local84];
			local92 = Class436.anIntArray463[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20255(1.0F);
		arg0.method20126(this.anInt5137, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method25691(this.anInt5144 & 0x3FFF, this.anInt5145 & 0x3FFF, this.anInt5146 & 0x3FFF);
		@Pc(190) Class84 local190 = arg0.method20115(local5, 2048, 0, 64, 768);
		local88 = local190.method6822() - local190.method6906();
		local92 = local190.method6825() - local190.method6824();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5141 * 1024 / local102;
		@Pc(219) Class442 local219 = arg0.method20124();
		@Pc(222) Class442 local222 = arg0.method20282();
		local222.method29011((float) (this.anInt5141 / 2), (float) (this.anInt5141 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method19940().method23491(), (float) arg0.method19940().method23493(), 1024.0F);
		arg0.method20123(local222);
		@Pc(258) Class455 local258 = new Class455();
		arg0.method20121(local258);
		@Pc(264) Class455 local264 = arg0.method20370();
		local264.method29428(0.0F, 0.0F, (float) (50 - local190.method6826()));
		local190.method6813(local264, null, 1);
		this.aClass83_34 = arg0.method20105(0, 0, this.anInt5141, this.anInt5141, true);
		this.aClass83_34.method18176(0, 0, 3);
		arg0.method20123(local219);
		arg0.method20151(anIntArray479[0], anIntArray479[1], anIntArray479[2], anIntArray479[3]);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Lclient!dx;Lclient!rv;)V", line = 233)
	void method30596(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class521 arg1) {
		method30599(arg0);
		method30602(arg0);
		arg0.method20142(anIntArray479);
		arg0.method20151(0, 0, this.anInt5141, this.anInt5141);
		arg0.method20125(2, 0);
		arg0.method20088(0, 0, this.anInt5141, this.anInt5141, this.anInt5137 | 0xFF000000, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean782) {
				local33 = -arg1.anInt5152;
				local35 = -arg1.anInt5134;
				local37 = -arg1.anInt5135;
			} else {
				local33 = arg1.anInt5152 - this.anInt5152;
				local35 = arg1.anInt5134 - this.anInt5134;
				local37 = arg1.anInt5135 - this.anInt5135;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(96) int local96;
		if (this.anInt5139 != 0) {
			local81 = Class436.anIntArray464[this.anInt5139];
			local86 = Class436.anIntArray463[this.anInt5139];
			local96 = local35 * local86 - local37 * local81 >> 14;
			local37 = local35 * local81 + local37 * local86 >> 14;
			local35 = local96;
		}
		if (this.anInt5128 != 0) {
			local81 = Class436.anIntArray464[this.anInt5128];
			local86 = Class436.anIntArray463[this.anInt5128];
			local96 = local37 * local81 + local33 * local86 >> 14;
			local37 = local37 * local86 - local33 * local81 >> 14;
			local33 = local96;
		}
		@Pc(149) Class84 local149 = aClass84_6.method6794((byte) 0, 51200, true);
		local149.method6890((short) 0, (short) this.anInt5143);
		arg0.method20255(1.0F);
		arg0.method20126(16777215, 1.0F, 1.0F, (float) local33, (float) local35, (float) local37);
		local86 = this.anInt5141 * 1024 / (local149.method6822() - local149.method6906());
		if (this.anInt5137 != 0) {
			local86 = local86 * 13 / 16;
		}
		@Pc(192) Class442 local192 = arg0.method20124();
		@Pc(195) Class442 local195 = arg0.method20282();
		local195.method29011((float) (this.anInt5141 / 2), (float) (this.anInt5141 / 2), (float) local86, (float) local86, 50.0F, 50000.0F, (float) arg0.method19940().method23491(), (float) arg0.method19940().method23493(), 1024.0F);
		arg0.method20123(local195);
		arg0.method20121(new Class455());
		@Pc(236) Class455 local236 = new Class455();
		local236.method29428(0.0F, 0.0F, (float) (50 - local149.method6826()));
		local149.method6813(local236, null, 1);
		@Pc(257) int local257 = this.anInt5141 * 13 / 16;
		@Pc(264) int local264 = (this.anInt5141 - local257) / 2;
		aClass83_33.method18129(local264, local264, local257, local257, 0, this.anInt5137 | 0xFF000000, 1);
		this.aClass83_34 = arg0.method20105(0, 0, this.anInt5141, this.anInt5141, true);
		arg0.method20125(2, 0);
		arg0.method20088(0, 0, this.anInt5141, this.anInt5141, 0, 0);
		aClass83_32.method18129(0, 0, this.anInt5141, this.anInt5141, 1, 0, 0);
		this.aClass83_34.method18176(0, 0, 3);
		arg0.method20123(local192);
		arg0.method20151(anIntArray479[0], anIntArray479[1], anIntArray479[2], anIntArray479[3]);
	}

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "(Lclient!dx;Lclient!rv;)V", line = 233)
	void method30597(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class521 arg1) {
		method30599(arg0);
		method30602(arg0);
		arg0.method20142(anIntArray479);
		arg0.method20151(0, 0, this.anInt5141, this.anInt5141);
		arg0.method20125(2, 0);
		arg0.method20088(0, 0, this.anInt5141, this.anInt5141, this.anInt5137 | 0xFF000000, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean782) {
				local33 = -arg1.anInt5152;
				local35 = -arg1.anInt5134;
				local37 = -arg1.anInt5135;
			} else {
				local33 = arg1.anInt5152 - this.anInt5152;
				local35 = arg1.anInt5134 - this.anInt5134;
				local37 = arg1.anInt5135 - this.anInt5135;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(96) int local96;
		if (this.anInt5139 != 0) {
			local81 = Class436.anIntArray464[this.anInt5139];
			local86 = Class436.anIntArray463[this.anInt5139];
			local96 = local35 * local86 - local37 * local81 >> 14;
			local37 = local35 * local81 + local37 * local86 >> 14;
			local35 = local96;
		}
		if (this.anInt5128 != 0) {
			local81 = Class436.anIntArray464[this.anInt5128];
			local86 = Class436.anIntArray463[this.anInt5128];
			local96 = local37 * local81 + local33 * local86 >> 14;
			local37 = local37 * local86 - local33 * local81 >> 14;
			local33 = local96;
		}
		@Pc(149) Class84 local149 = aClass84_6.method6794((byte) 0, 51200, true);
		local149.method6890((short) 0, (short) this.anInt5143);
		arg0.method20255(1.0F);
		arg0.method20126(16777215, 1.0F, 1.0F, (float) local33, (float) local35, (float) local37);
		local86 = this.anInt5141 * 1024 / (local149.method6822() - local149.method6906());
		if (this.anInt5137 != 0) {
			local86 = local86 * 13 / 16;
		}
		@Pc(192) Class442 local192 = arg0.method20124();
		@Pc(195) Class442 local195 = arg0.method20282();
		local195.method29011((float) (this.anInt5141 / 2), (float) (this.anInt5141 / 2), (float) local86, (float) local86, 50.0F, 50000.0F, (float) arg0.method19940().method23491(), (float) arg0.method19940().method23493(), 1024.0F);
		arg0.method20123(local195);
		arg0.method20121(new Class455());
		@Pc(236) Class455 local236 = new Class455();
		local236.method29428(0.0F, 0.0F, (float) (50 - local149.method6826()));
		local149.method6813(local236, null, 1);
		@Pc(257) int local257 = this.anInt5141 * 13 / 16;
		@Pc(264) int local264 = (this.anInt5141 - local257) / 2;
		aClass83_33.method18129(local264, local264, local257, local257, 0, this.anInt5137 | 0xFF000000, 1);
		this.aClass83_34 = arg0.method20105(0, 0, this.anInt5141, this.anInt5141, true);
		arg0.method20125(2, 0);
		arg0.method20088(0, 0, this.anInt5141, this.anInt5141, 0, 0);
		aClass83_32.method18129(0, 0, this.anInt5141, this.anInt5141, 1, 0, 0);
		this.aClass83_34.method18176(0, 0, 3);
		arg0.method20123(local192);
		arg0.method20151(anIntArray479[0], anIntArray479[1], anIntArray479[2], anIntArray479[3]);
	}

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "(Lclient!dx;Lclient!rv;)V", line = 233)
	void method30598(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class521 arg1) {
		method30599(arg0);
		method30602(arg0);
		arg0.method20142(anIntArray479);
		arg0.method20151(0, 0, this.anInt5141, this.anInt5141);
		arg0.method20125(2, 0);
		arg0.method20088(0, 0, this.anInt5141, this.anInt5141, this.anInt5137 | 0xFF000000, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean782) {
				local33 = -arg1.anInt5152;
				local35 = -arg1.anInt5134;
				local37 = -arg1.anInt5135;
			} else {
				local33 = arg1.anInt5152 - this.anInt5152;
				local35 = arg1.anInt5134 - this.anInt5134;
				local37 = arg1.anInt5135 - this.anInt5135;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(96) int local96;
		if (this.anInt5139 != 0) {
			local81 = Class436.anIntArray464[this.anInt5139];
			local86 = Class436.anIntArray463[this.anInt5139];
			local96 = local35 * local86 - local37 * local81 >> 14;
			local37 = local35 * local81 + local37 * local86 >> 14;
			local35 = local96;
		}
		if (this.anInt5128 != 0) {
			local81 = Class436.anIntArray464[this.anInt5128];
			local86 = Class436.anIntArray463[this.anInt5128];
			local96 = local37 * local81 + local33 * local86 >> 14;
			local37 = local37 * local86 - local33 * local81 >> 14;
			local33 = local96;
		}
		@Pc(149) Class84 local149 = aClass84_6.method6794((byte) 0, 51200, true);
		local149.method6890((short) 0, (short) this.anInt5143);
		arg0.method20255(1.0F);
		arg0.method20126(16777215, 1.0F, 1.0F, (float) local33, (float) local35, (float) local37);
		local86 = this.anInt5141 * 1024 / (local149.method6822() - local149.method6906());
		if (this.anInt5137 != 0) {
			local86 = local86 * 13 / 16;
		}
		@Pc(192) Class442 local192 = arg0.method20124();
		@Pc(195) Class442 local195 = arg0.method20282();
		local195.method29011((float) (this.anInt5141 / 2), (float) (this.anInt5141 / 2), (float) local86, (float) local86, 50.0F, 50000.0F, (float) arg0.method19940().method23491(), (float) arg0.method19940().method23493(), 1024.0F);
		arg0.method20123(local195);
		arg0.method20121(new Class455());
		@Pc(236) Class455 local236 = new Class455();
		local236.method29428(0.0F, 0.0F, (float) (50 - local149.method6826()));
		local149.method6813(local236, null, 1);
		@Pc(257) int local257 = this.anInt5141 * 13 / 16;
		@Pc(264) int local264 = (this.anInt5141 - local257) / 2;
		aClass83_33.method18129(local264, local264, local257, local257, 0, this.anInt5137 | 0xFF000000, 1);
		this.aClass83_34 = arg0.method20105(0, 0, this.anInt5141, this.anInt5141, true);
		arg0.method20125(2, 0);
		arg0.method20088(0, 0, this.anInt5141, this.anInt5141, 0, 0);
		aClass83_32.method18129(0, 0, this.anInt5141, this.anInt5141, 1, 0, 0);
		this.aClass83_34.method18176(0, 0, 3);
		arg0.method20123(local192);
		arg0.method20151(anIntArray479[0], anIntArray479[1], anIntArray479[2], anIntArray479[3]);
	}

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "(Lclient!dx;)V", line = 295)
	static void method30599(@OriginalArg(0) Class86 arg0) {
		if (aClass84_6 != null) {
			return;
		}
		@Pc(8) Class216 local8 = new Class216(580, 1104, 1);
		local8.method25673((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
		local8.method25665(0, 128, 0);
		local8.method25665(0, -128, 0);
		for (@Pc(34) int local34 = 0; local34 <= 24; local34++) {
			@Pc(43) int local43 = local34 * 8192 / 24;
			@Pc(47) int local47 = Class436.anIntArray464[local43];
			@Pc(51) int local51 = Class436.anIntArray463[local43];
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(68) int local68;
			@Pc(76) int local76;
			@Pc(84) int local84;
			for (local53 = 1; local53 < 24; local53++) {
				local62 = local53 * 8192 / 24;
				local68 = Class436.anIntArray463[local62] >> 7;
				local76 = Class436.anIntArray464[local62] * local47 >> 21;
				local84 = Class436.anIntArray464[local62] * local51 >> 21;
				local8.method25665(local84, local68, -local76);
			}
			if (local34 > 0) {
				local53 = local34 * 23 + 2;
				local62 = local53 - 23;
				local8.method25667(0, local62, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				for (local68 = 1; local68 < 23; local68++) {
					local76 = local62 + 1;
					local84 = local53 + 1;
					local8.method25667(local62, local76, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local8.method25667(local76, local84, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local62 = local76;
					local53 = local84;
				}
				local8.method25667(local53, local62, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
			}
		}
		local8.anInt3738 = local8.anInt3732;
		local8.anIntArray355 = null;
		local8.anIntArray354 = null;
		local8.aByteArray66 = null;
		aClass84_6 = arg0.method20115(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "(Lclient!dx;)V", line = 295)
	static void method30600(@OriginalArg(0) Class86 arg0) {
		if (aClass84_6 != null) {
			return;
		}
		@Pc(8) Class216 local8 = new Class216(580, 1104, 1);
		local8.method25673((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
		local8.method25665(0, 128, 0);
		local8.method25665(0, -128, 0);
		for (@Pc(34) int local34 = 0; local34 <= 24; local34++) {
			@Pc(43) int local43 = local34 * 8192 / 24;
			@Pc(47) int local47 = Class436.anIntArray464[local43];
			@Pc(51) int local51 = Class436.anIntArray463[local43];
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(68) int local68;
			@Pc(76) int local76;
			@Pc(84) int local84;
			for (local53 = 1; local53 < 24; local53++) {
				local62 = local53 * 8192 / 24;
				local68 = Class436.anIntArray463[local62] >> 7;
				local76 = Class436.anIntArray464[local62] * local47 >> 21;
				local84 = Class436.anIntArray464[local62] * local51 >> 21;
				local8.method25665(local84, local68, -local76);
			}
			if (local34 > 0) {
				local53 = local34 * 23 + 2;
				local62 = local53 - 23;
				local8.method25667(0, local62, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				for (local68 = 1; local68 < 23; local68++) {
					local76 = local62 + 1;
					local84 = local53 + 1;
					local8.method25667(local62, local76, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local8.method25667(local76, local84, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local62 = local76;
					local53 = local84;
				}
				local8.method25667(local53, local62, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
			}
		}
		local8.anInt3738 = local8.anInt3732;
		local8.anIntArray355 = null;
		local8.anIntArray354 = null;
		local8.aByteArray66 = null;
		aClass84_6 = arg0.method20115(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!dx;)V", line = 295)
	static void method30601(@OriginalArg(0) Class86 arg0) {
		if (aClass84_6 != null) {
			return;
		}
		@Pc(8) Class216 local8 = new Class216(580, 1104, 1);
		local8.method25673((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
		local8.method25665(0, 128, 0);
		local8.method25665(0, -128, 0);
		for (@Pc(34) int local34 = 0; local34 <= 24; local34++) {
			@Pc(43) int local43 = local34 * 8192 / 24;
			@Pc(47) int local47 = Class436.anIntArray464[local43];
			@Pc(51) int local51 = Class436.anIntArray463[local43];
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(68) int local68;
			@Pc(76) int local76;
			@Pc(84) int local84;
			for (local53 = 1; local53 < 24; local53++) {
				local62 = local53 * 8192 / 24;
				local68 = Class436.anIntArray463[local62] >> 7;
				local76 = Class436.anIntArray464[local62] * local47 >> 21;
				local84 = Class436.anIntArray464[local62] * local51 >> 21;
				local8.method25665(local84, local68, -local76);
			}
			if (local34 > 0) {
				local53 = local34 * 23 + 2;
				local62 = local53 - 23;
				local8.method25667(0, local62, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				for (local68 = 1; local68 < 23; local68++) {
					local76 = local62 + 1;
					local84 = local53 + 1;
					local8.method25667(local62, local76, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local8.method25667(local76, local84, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local62 = local76;
					local53 = local84;
				}
				local8.method25667(local53, local62, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
			}
		}
		local8.anInt3738 = local8.anInt3732;
		local8.anIntArray355 = null;
		local8.anIntArray354 = null;
		local8.aByteArray66 = null;
		aClass84_6 = arg0.method20115(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "(Lclient!dx;)V", line = 338)
	static void method30602(@OriginalArg(0) Class86 arg0) {
		if (aClass83_32 != null) {
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
		aClass83_32 = arg0.method20010(local7, 0, 128, 128, 128);
		aClass83_33 = arg0.method20010(local4, 0, 128, 128, 128);
	}

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "(Lclient!dx;)V", line = 338)
	static void method30603(@OriginalArg(0) Class86 arg0) {
		if (aClass83_32 != null) {
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
		aClass83_32 = arg0.method20010(local7, 0, 128, 128, 128);
		aClass83_33 = arg0.method20010(local4, 0, 128, 128, 128);
	}
}
