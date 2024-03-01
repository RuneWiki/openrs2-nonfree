package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public class Class563 {

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "I")
	static final int anInt5353 = 24;

	@OriginalMember(owner = "client!sw", name = "n", descriptor = "I")
	static final int anInt5354 = 0;

	@OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
	static final int anInt5355 = 1;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "I")
	static final int anInt5359 = 24;

	@OriginalMember(owner = "client!sw", name = "ah", descriptor = "Lclient!cm;")
	static Class100 aClass100_47;

	@OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
	static final int anInt5362 = 2;

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
	static final int anInt5363 = 512;

	@OriginalMember(owner = "client!sw", name = "ag", descriptor = "Lclient!do;")
	static Class109 aClass109_7;

	@OriginalMember(owner = "client!sw", name = "i", descriptor = "I")
	static final int anInt5372 = 192;

	@OriginalMember(owner = "client!sw", name = "j", descriptor = "I")
	static final int anInt5373 = 128;

	@OriginalMember(owner = "client!sw", name = "t", descriptor = "I")
	static final int anInt5374 = 13;

	@OriginalMember(owner = "client!sw", name = "ae", descriptor = "I")
	static final int anInt5375 = 16;

	@OriginalMember(owner = "client!sw", name = "al", descriptor = "Lclient!cm;")
	static Class100 aClass100_49;

	@OriginalMember(owner = "client!sw", name = "ac", descriptor = "[I")
	static final int[] anIntArray467 = new int[4];

	@OriginalMember(owner = "client!sw", name = "v", descriptor = "I")
	int anInt5364;

	@OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
	int anInt5365;

	@OriginalMember(owner = "client!sw", name = "s", descriptor = "I")
	int anInt5366;

	@OriginalMember(owner = "client!sw", name = "r", descriptor = "I")
	int anInt5368;

	@OriginalMember(owner = "client!sw", name = "q", descriptor = "Lclient!cm;")
	Class100 aClass100_48;

	@OriginalMember(owner = "client!sw", name = "y", descriptor = "I")
	int anInt5371;

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
	final int anInt5377;

	@OriginalMember(owner = "client!sw", name = "u", descriptor = "I")
	final int anInt5360;

	@OriginalMember(owner = "client!sw", name = "p", descriptor = "I")
	final int anInt5361;

	@OriginalMember(owner = "client!sw", name = "z", descriptor = "Z")
	final boolean aBoolean812;

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
	final int anInt5376;

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
	final int anInt5356;

	@OriginalMember(owner = "client!sw", name = "w", descriptor = "I")
	final int anInt5358;

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
	final int anInt5357;

	@OriginalMember(owner = "client!sw", name = "x", descriptor = "I")
	int anInt5369;

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "I")
	int anInt5370;

	@OriginalMember(owner = "client!sw", name = "h", descriptor = "I")
	int anInt5367;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(IIIIIIIZIII)V", line = 66)
	public Class563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt5377 = arg2;
		this.anInt5360 = arg3;
		this.anInt5361 = arg4;
		this.aBoolean812 = arg7;
		this.anInt5376 = arg1;
		this.anInt5356 = arg6;
		this.anInt5358 = arg5;
		this.anInt5357 = arg0;
		this.anInt5369 = arg8;
		this.anInt5370 = arg9;
		this.anInt5367 = arg10;
	}

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "()V", line = 81)
	static void method31195() {
		aClass109_7 = null;
		aClass100_49 = null;
	}

	@OriginalMember(owner = "client!sw", name = "p", descriptor = "()V", line = 81)
	static void method31203() {
		aClass109_7 = null;
		aClass100_49 = null;
	}

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "(IIII)Z", line = 89)
	boolean method31204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean812) {
			this.anInt5365 = 1073741823;
			local7 = this.anInt5377;
			local12 = this.anInt5360;
			local17 = this.anInt5361;
		} else {
			local7 = this.anInt5377 - arg0;
			local12 = this.anInt5360 - arg1;
			local17 = this.anInt5361 - arg2;
			this.anInt5365 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5365 == 0) {
				this.anInt5365 = 1;
			}
			local7 = (local7 << 8) / this.anInt5365;
			local12 = (local12 << 8) / this.anInt5365;
			local17 = (local17 << 8) / this.anInt5365;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5371 = this.anInt5358 * arg3 / (this.aBoolean812 ? 1024 : this.anInt5365);
		} else {
			this.anInt5371 = 0;
		}
		if (this.anInt5371 < 8) {
			this.aClass100_48 = null;
			return false;
		}
		@Pc(143) int local143 = Class134_Sub2.method10212(this.anInt5371);
		if (local143 > arg3) {
			local143 = Class278.method26365(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5366) {
			this.anInt5366 = local143;
		}
		this.anInt5368 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt5364 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass100_48 = null;
		return true;
	}

	@OriginalMember(owner = "client!sw", name = "n", descriptor = "(IIII)Z", line = 89)
	boolean method31214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean812) {
			this.anInt5365 = 1073741823;
			local7 = this.anInt5377;
			local12 = this.anInt5360;
			local17 = this.anInt5361;
		} else {
			local7 = this.anInt5377 - arg0;
			local12 = this.anInt5360 - arg1;
			local17 = this.anInt5361 - arg2;
			this.anInt5365 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5365 == 0) {
				this.anInt5365 = 1;
			}
			local7 = (local7 << 8) / this.anInt5365;
			local12 = (local12 << 8) / this.anInt5365;
			local17 = (local17 << 8) / this.anInt5365;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5371 = this.anInt5358 * arg3 / (this.aBoolean812 ? 1024 : this.anInt5365);
		} else {
			this.anInt5371 = 0;
		}
		if (this.anInt5371 < 8) {
			this.aClass100_48 = null;
			return false;
		}
		@Pc(143) int local143 = Class134_Sub2.method10212(this.anInt5371);
		if (local143 > arg3) {
			local143 = Class278.method26365(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5366) {
			this.anInt5366 = local143;
		}
		this.anInt5368 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt5364 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass100_48 = null;
		return true;
	}

	@OriginalMember(owner = "client!sw", name = "m", descriptor = "(Lclient!dh;Lclient!sw;)Z", line = 128)
	boolean method31196(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		return this.aClass100_48 != null || this.method31215(arg0, arg1);
	}

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(Lclient!dh;Lclient!sw;)Z", line = 128)
	boolean method31205(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		return this.aClass100_48 != null || this.method31215(arg0, arg1);
	}

	@OriginalMember(owner = "client!sw", name = "k", descriptor = "(Lclient!dh;IIIIIIIIII)V", line = 132)
	void method31197(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (this.aClass100_48 == null) {
			return;
		}
		@Pc(6) float[] local6 = new float[3];
		@Pc(15) float local15 = (float) -(this.anInt5377 - arg7 << 16);
		@Pc(23) float local23 = (float) (this.anInt5360 - arg8 << 15);
		@Pc(32) float local32 = (float) -(this.anInt5361 - arg9 << 16);
		@Pc(35) float[] local35 = new float[3];
		arg0.method20517().method29390(local35);
		@Pc(46) float local46 = local15 + local35[0];
		@Pc(52) float local52 = local23 + local35[1];
		@Pc(58) float local58 = local32 + local35[2];
		arg0.method20824(local46, local52, local58, local6);
		if (local6[2] < 0.0F) {
			return;
		}
		@Pc(82) int local82 = (int) (local6[0] - (float) (this.anInt5371 / 2));
		@Pc(93) int local93 = (int) (local6[1] - (float) (this.anInt5371 / 2));
		if (local93 < arg4 && local93 + this.anInt5371 > 0 && local82 < arg3 && local82 + this.anInt5371 > 0) {
			this.aClass100_48.method18176(local82, local93, this.anInt5371, this.anInt5371, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!sw", name = "r", descriptor = "(Lclient!dh;Lclient!sw;)Z", line = 154)
	boolean method31206(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		if (this.aClass100_48 == null) {
			if (this.anInt5357 == 0) {
				if (Class319.anInterface24_8.method6765(Class616.aClass616_2, this.anInt5376, -1, Class609.aClass609_2, 0.7F, this.anInt5366, this.anInt5366)) {
					@Pc(33) int[] local33 = Class319.anInterface24_8.method6780(Class616.aClass616_2, this.anInt5376, 0.7F, this.anInt5366, this.anInt5366);
					this.aClass100_48 = arg0.method20498(local33, 0, this.anInt5366, this.anInt5366, this.anInt5366);
				}
			} else if (this.anInt5357 == 2) {
				this.method31199(arg0, arg1);
			} else if (this.anInt5357 == 1) {
				this.method31201(arg0, arg1);
			}
		}
		return this.aClass100_48 != null;
	}

	@OriginalMember(owner = "client!sw", name = "v", descriptor = "(Lclient!dh;Lclient!sw;)Z", line = 154)
	boolean method31207(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		if (this.aClass100_48 == null) {
			if (this.anInt5357 == 0) {
				if (Class319.anInterface24_8.method6765(Class616.aClass616_2, this.anInt5376, -1, Class609.aClass609_2, 0.7F, this.anInt5366, this.anInt5366)) {
					@Pc(33) int[] local33 = Class319.anInterface24_8.method6780(Class616.aClass616_2, this.anInt5376, 0.7F, this.anInt5366, this.anInt5366);
					this.aClass100_48 = arg0.method20498(local33, 0, this.anInt5366, this.anInt5366, this.anInt5366);
				}
			} else if (this.anInt5357 == 2) {
				this.method31199(arg0, arg1);
			} else if (this.anInt5357 == 1) {
				this.method31201(arg0, arg1);
			}
		}
		return this.aClass100_48 != null;
	}

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "(Lclient!dh;Lclient!sw;)Z", line = 154)
	boolean method31215(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		if (this.aClass100_48 == null) {
			if (this.anInt5357 == 0) {
				if (Class319.anInterface24_8.method6765(Class616.aClass616_2, this.anInt5376, -1, Class609.aClass609_2, 0.7F, this.anInt5366, this.anInt5366)) {
					@Pc(33) int[] local33 = Class319.anInterface24_8.method6780(Class616.aClass616_2, this.anInt5376, 0.7F, this.anInt5366, this.anInt5366);
					this.aClass100_48 = arg0.method20498(local33, 0, this.anInt5366, this.anInt5366, this.anInt5366);
				}
			} else if (this.anInt5357 == 2) {
				this.method31199(arg0, arg1);
			} else if (this.anInt5357 == 1) {
				this.method31201(arg0, arg1);
			}
		}
		return this.aClass100_48 != null;
	}

	@OriginalMember(owner = "client!sw", name = "q", descriptor = "(Lclient!dh;Lclient!sw;)V", line = 172)
	void method31194(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		@Pc(5) Class231 local5 = Class231.method25655(Class280.aClass497_100, this.anInt5376, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20470(anIntArray467);
		arg0.method20467(0, 0, this.anInt5366, this.anInt5366);
		arg0.method20774(2, 0);
		arg0.method20653(0, 0, this.anInt5366, this.anInt5366, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean812) {
				local35 = -arg1.anInt5377;
				local37 = -arg1.anInt5360;
				local39 = -arg1.anInt5361;
			} else {
				local35 = this.anInt5377 - arg1.anInt5377;
				local37 = this.anInt5360 - arg1.anInt5360;
				local39 = this.anInt5361 - arg1.anInt5361;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5368 != 0) {
			local84 = -this.anInt5368 & 0x3FFF;
			local88 = Class464.anIntArray451[local84];
			local92 = Class464.anIntArray452[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5364 != 0) {
			local84 = -this.anInt5364 & 0x3FFF;
			local88 = Class464.anIntArray451[local84];
			local92 = Class464.anIntArray452[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20521(1.0F);
		arg0.method20522(this.anInt5356, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method25670(this.anInt5369 & 0x3FFF, this.anInt5370 & 0x3FFF, this.anInt5367 & 0x3FFF);
		@Pc(190) Class109 local190 = arg0.method20510(local5, 2048, 0, 64, 768);
		local88 = local190.method6864() - local190.method6863();
		local92 = local190.method6829() - local190.method6882();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5366 * 1024 / local102;
		@Pc(219) Class489 local219 = arg0.method20654();
		@Pc(222) Class489 local222 = arg0.method20507();
		local222.method29855((float) (this.anInt5366 / 2), (float) (this.anInt5366 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method20434().method23736(), (float) arg0.method20434().method23737(), 1024.0F);
		arg0.method20519(local222);
		@Pc(258) Class470 local258 = new Class470();
		arg0.method20516(local258);
		@Pc(264) Class470 local264 = arg0.method20508();
		local264.method29385(0.0F, 0.0F, (float) (50 - local190.method6867()));
		local190.method6947(local264, null, 1);
		this.aClass100_48 = arg0.method20613(0, 0, this.anInt5366, this.anInt5366, true);
		this.aClass100_48.method18171(0, 0, 3);
		arg0.method20519(local219);
		arg0.method20467(anIntArray467[0], anIntArray467[1], anIntArray467[2], anIntArray467[3]);
	}

	@OriginalMember(owner = "client!sw", name = "s", descriptor = "(Lclient!dh;Lclient!sw;)V", line = 172)
	void method31198(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		@Pc(5) Class231 local5 = Class231.method25655(Class280.aClass497_100, this.anInt5376, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20470(anIntArray467);
		arg0.method20467(0, 0, this.anInt5366, this.anInt5366);
		arg0.method20774(2, 0);
		arg0.method20653(0, 0, this.anInt5366, this.anInt5366, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean812) {
				local35 = -arg1.anInt5377;
				local37 = -arg1.anInt5360;
				local39 = -arg1.anInt5361;
			} else {
				local35 = this.anInt5377 - arg1.anInt5377;
				local37 = this.anInt5360 - arg1.anInt5360;
				local39 = this.anInt5361 - arg1.anInt5361;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5368 != 0) {
			local84 = -this.anInt5368 & 0x3FFF;
			local88 = Class464.anIntArray451[local84];
			local92 = Class464.anIntArray452[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5364 != 0) {
			local84 = -this.anInt5364 & 0x3FFF;
			local88 = Class464.anIntArray451[local84];
			local92 = Class464.anIntArray452[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20521(1.0F);
		arg0.method20522(this.anInt5356, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method25670(this.anInt5369 & 0x3FFF, this.anInt5370 & 0x3FFF, this.anInt5367 & 0x3FFF);
		@Pc(190) Class109 local190 = arg0.method20510(local5, 2048, 0, 64, 768);
		local88 = local190.method6864() - local190.method6863();
		local92 = local190.method6829() - local190.method6882();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5366 * 1024 / local102;
		@Pc(219) Class489 local219 = arg0.method20654();
		@Pc(222) Class489 local222 = arg0.method20507();
		local222.method29855((float) (this.anInt5366 / 2), (float) (this.anInt5366 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method20434().method23736(), (float) arg0.method20434().method23737(), 1024.0F);
		arg0.method20519(local222);
		@Pc(258) Class470 local258 = new Class470();
		arg0.method20516(local258);
		@Pc(264) Class470 local264 = arg0.method20508();
		local264.method29385(0.0F, 0.0F, (float) (50 - local190.method6867()));
		local190.method6947(local264, null, 1);
		this.aClass100_48 = arg0.method20613(0, 0, this.anInt5366, this.anInt5366, true);
		this.aClass100_48.method18171(0, 0, 3);
		arg0.method20519(local219);
		arg0.method20467(anIntArray467[0], anIntArray467[1], anIntArray467[2], anIntArray467[3]);
	}

	@OriginalMember(owner = "client!sw", name = "w", descriptor = "(Lclient!dh;Lclient!sw;)V", line = 172)
	void method31199(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		@Pc(5) Class231 local5 = Class231.method25655(Class280.aClass497_100, this.anInt5376, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20470(anIntArray467);
		arg0.method20467(0, 0, this.anInt5366, this.anInt5366);
		arg0.method20774(2, 0);
		arg0.method20653(0, 0, this.anInt5366, this.anInt5366, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean812) {
				local35 = -arg1.anInt5377;
				local37 = -arg1.anInt5360;
				local39 = -arg1.anInt5361;
			} else {
				local35 = this.anInt5377 - arg1.anInt5377;
				local37 = this.anInt5360 - arg1.anInt5360;
				local39 = this.anInt5361 - arg1.anInt5361;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5368 != 0) {
			local84 = -this.anInt5368 & 0x3FFF;
			local88 = Class464.anIntArray451[local84];
			local92 = Class464.anIntArray452[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5364 != 0) {
			local84 = -this.anInt5364 & 0x3FFF;
			local88 = Class464.anIntArray451[local84];
			local92 = Class464.anIntArray452[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20521(1.0F);
		arg0.method20522(this.anInt5356, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method25670(this.anInt5369 & 0x3FFF, this.anInt5370 & 0x3FFF, this.anInt5367 & 0x3FFF);
		@Pc(190) Class109 local190 = arg0.method20510(local5, 2048, 0, 64, 768);
		local88 = local190.method6864() - local190.method6863();
		local92 = local190.method6829() - local190.method6882();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5366 * 1024 / local102;
		@Pc(219) Class489 local219 = arg0.method20654();
		@Pc(222) Class489 local222 = arg0.method20507();
		local222.method29855((float) (this.anInt5366 / 2), (float) (this.anInt5366 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method20434().method23736(), (float) arg0.method20434().method23737(), 1024.0F);
		arg0.method20519(local222);
		@Pc(258) Class470 local258 = new Class470();
		arg0.method20516(local258);
		@Pc(264) Class470 local264 = arg0.method20508();
		local264.method29385(0.0F, 0.0F, (float) (50 - local190.method6867()));
		local190.method6947(local264, null, 1);
		this.aClass100_48 = arg0.method20613(0, 0, this.anInt5366, this.anInt5366, true);
		this.aClass100_48.method18171(0, 0, 3);
		arg0.method20519(local219);
		arg0.method20467(anIntArray467[0], anIntArray467[1], anIntArray467[2], anIntArray467[3]);
	}

	@OriginalMember(owner = "client!sw", name = "o", descriptor = "(Lclient!dh;Lclient!sw;)V", line = 172)
	void method31200(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		@Pc(5) Class231 local5 = Class231.method25655(Class280.aClass497_100, this.anInt5376, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20470(anIntArray467);
		arg0.method20467(0, 0, this.anInt5366, this.anInt5366);
		arg0.method20774(2, 0);
		arg0.method20653(0, 0, this.anInt5366, this.anInt5366, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean812) {
				local35 = -arg1.anInt5377;
				local37 = -arg1.anInt5360;
				local39 = -arg1.anInt5361;
			} else {
				local35 = this.anInt5377 - arg1.anInt5377;
				local37 = this.anInt5360 - arg1.anInt5360;
				local39 = this.anInt5361 - arg1.anInt5361;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5368 != 0) {
			local84 = -this.anInt5368 & 0x3FFF;
			local88 = Class464.anIntArray451[local84];
			local92 = Class464.anIntArray452[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5364 != 0) {
			local84 = -this.anInt5364 & 0x3FFF;
			local88 = Class464.anIntArray451[local84];
			local92 = Class464.anIntArray452[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20521(1.0F);
		arg0.method20522(this.anInt5356, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method25670(this.anInt5369 & 0x3FFF, this.anInt5370 & 0x3FFF, this.anInt5367 & 0x3FFF);
		@Pc(190) Class109 local190 = arg0.method20510(local5, 2048, 0, 64, 768);
		local88 = local190.method6864() - local190.method6863();
		local92 = local190.method6829() - local190.method6882();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5366 * 1024 / local102;
		@Pc(219) Class489 local219 = arg0.method20654();
		@Pc(222) Class489 local222 = arg0.method20507();
		local222.method29855((float) (this.anInt5366 / 2), (float) (this.anInt5366 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method20434().method23736(), (float) arg0.method20434().method23737(), 1024.0F);
		arg0.method20519(local222);
		@Pc(258) Class470 local258 = new Class470();
		arg0.method20516(local258);
		@Pc(264) Class470 local264 = arg0.method20508();
		local264.method29385(0.0F, 0.0F, (float) (50 - local190.method6867()));
		local190.method6947(local264, null, 1);
		this.aClass100_48 = arg0.method20613(0, 0, this.anInt5366, this.anInt5366, true);
		this.aClass100_48.method18171(0, 0, 3);
		arg0.method20519(local219);
		arg0.method20467(anIntArray467[0], anIntArray467[1], anIntArray467[2], anIntArray467[3]);
	}

	@OriginalMember(owner = "client!sw", name = "y", descriptor = "(Lclient!dh;Lclient!sw;)V", line = 172)
	void method31210(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		@Pc(5) Class231 local5 = Class231.method25655(Class280.aClass497_100, this.anInt5376, 0);
		if (local5 == null) {
			return;
		}
		arg0.method20470(anIntArray467);
		arg0.method20467(0, 0, this.anInt5366, this.anInt5366);
		arg0.method20774(2, 0);
		arg0.method20653(0, 0, this.anInt5366, this.anInt5366, 0, 0);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean812) {
				local35 = -arg1.anInt5377;
				local37 = -arg1.anInt5360;
				local39 = -arg1.anInt5361;
			} else {
				local35 = this.anInt5377 - arg1.anInt5377;
				local37 = this.anInt5360 - arg1.anInt5360;
				local39 = this.anInt5361 - arg1.anInt5361;
			}
		}
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(102) int local102;
		if (this.anInt5368 != 0) {
			local84 = -this.anInt5368 & 0x3FFF;
			local88 = Class464.anIntArray451[local84];
			local92 = Class464.anIntArray452[local84];
			local102 = local37 * local92 - local39 * local88 >> 14;
			local39 = local37 * local88 + local39 * local92 >> 14;
			local37 = local102;
		}
		if (this.anInt5364 != 0) {
			local84 = -this.anInt5364 & 0x3FFF;
			local88 = Class464.anIntArray451[local84];
			local92 = Class464.anIntArray452[local84];
			local102 = local39 * local88 + local35 * local92 >> 14;
			local39 = local39 * local92 - local35 * local88 >> 14;
			local35 = local102;
		}
		arg0.method20521(1.0F);
		arg0.method20522(this.anInt5356, 1.0F, 1.0F, (float) local35, (float) local37, (float) local39);
		local5.method25670(this.anInt5369 & 0x3FFF, this.anInt5370 & 0x3FFF, this.anInt5367 & 0x3FFF);
		@Pc(190) Class109 local190 = arg0.method20510(local5, 2048, 0, 64, 768);
		local88 = local190.method6864() - local190.method6863();
		local92 = local190.method6829() - local190.method6882();
		local102 = local88 > local92 ? local88 : local92;
		@Pc(216) int local216 = this.anInt5366 * 1024 / local102;
		@Pc(219) Class489 local219 = arg0.method20654();
		@Pc(222) Class489 local222 = arg0.method20507();
		local222.method29855((float) (this.anInt5366 / 2), (float) (this.anInt5366 / 2), (float) local216, (float) local216, 50.0F, 50000.0F, (float) arg0.method20434().method23736(), (float) arg0.method20434().method23737(), 1024.0F);
		arg0.method20519(local222);
		@Pc(258) Class470 local258 = new Class470();
		arg0.method20516(local258);
		@Pc(264) Class470 local264 = arg0.method20508();
		local264.method29385(0.0F, 0.0F, (float) (50 - local190.method6867()));
		local190.method6947(local264, null, 1);
		this.aClass100_48 = arg0.method20613(0, 0, this.anInt5366, this.anInt5366, true);
		this.aClass100_48.method18171(0, 0, 3);
		arg0.method20519(local219);
		arg0.method20467(anIntArray467[0], anIntArray467[1], anIntArray467[2], anIntArray467[3]);
	}

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "(Lclient!dh;Lclient!sw;)V", line = 233)
	void method31201(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		method31208(arg0);
		method31202(arg0);
		arg0.method20470(anIntArray467);
		arg0.method20467(0, 0, this.anInt5366, this.anInt5366);
		arg0.method20774(2, 0);
		arg0.method20653(0, 0, this.anInt5366, this.anInt5366, this.anInt5356 | 0xFF000000, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean812) {
				local33 = -arg1.anInt5377;
				local35 = -arg1.anInt5360;
				local37 = -arg1.anInt5361;
			} else {
				local33 = arg1.anInt5377 - this.anInt5377;
				local35 = arg1.anInt5360 - this.anInt5360;
				local37 = arg1.anInt5361 - this.anInt5361;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(96) int local96;
		if (this.anInt5368 != 0) {
			local81 = Class464.anIntArray451[this.anInt5368];
			local86 = Class464.anIntArray452[this.anInt5368];
			local96 = local35 * local86 - local37 * local81 >> 14;
			local37 = local35 * local81 + local37 * local86 >> 14;
			local35 = local96;
		}
		if (this.anInt5364 != 0) {
			local81 = Class464.anIntArray451[this.anInt5364];
			local86 = Class464.anIntArray452[this.anInt5364];
			local96 = local37 * local81 + local33 * local86 >> 14;
			local37 = local37 * local86 - local33 * local81 >> 14;
			local33 = local96;
		}
		@Pc(149) Class109 local149 = aClass109_7.method6907((byte) 0, 51200, true);
		local149.method6878((short) 0, (short) this.anInt5376);
		arg0.method20521(1.0F);
		arg0.method20522(16777215, 1.0F, 1.0F, (float) local33, (float) local35, (float) local37);
		local86 = this.anInt5366 * 1024 / (local149.method6864() - local149.method6863());
		if (this.anInt5356 != 0) {
			local86 = local86 * 13 / 16;
		}
		@Pc(192) Class489 local192 = arg0.method20654();
		@Pc(195) Class489 local195 = arg0.method20507();
		local195.method29855((float) (this.anInt5366 / 2), (float) (this.anInt5366 / 2), (float) local86, (float) local86, 50.0F, 50000.0F, (float) arg0.method20434().method23736(), (float) arg0.method20434().method23737(), 1024.0F);
		arg0.method20519(local195);
		arg0.method20516(new Class470());
		@Pc(236) Class470 local236 = new Class470();
		local236.method29385(0.0F, 0.0F, (float) (50 - local149.method6867()));
		local149.method6947(local236, null, 1);
		@Pc(257) int local257 = this.anInt5366 * 13 / 16;
		@Pc(264) int local264 = (this.anInt5366 - local257) / 2;
		aClass100_47.method18176(local264, local264, local257, local257, 0, this.anInt5356 | 0xFF000000, 1);
		this.aClass100_48 = arg0.method20613(0, 0, this.anInt5366, this.anInt5366, true);
		arg0.method20774(2, 0);
		arg0.method20653(0, 0, this.anInt5366, this.anInt5366, 0, 0);
		aClass100_49.method18176(0, 0, this.anInt5366, this.anInt5366, 1, 0, 0);
		this.aClass100_48.method18171(0, 0, 3);
		arg0.method20519(local192);
		arg0.method20467(anIntArray467[0], anIntArray467[1], anIntArray467[2], anIntArray467[3]);
	}

	@OriginalMember(owner = "client!sw", name = "x", descriptor = "(Lclient!dh;Lclient!sw;)V", line = 233)
	void method31211(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class563 arg1) {
		method31208(arg0);
		method31202(arg0);
		arg0.method20470(anIntArray467);
		arg0.method20467(0, 0, this.anInt5366, this.anInt5366);
		arg0.method20774(2, 0);
		arg0.method20653(0, 0, this.anInt5366, this.anInt5366, this.anInt5356 | 0xFF000000, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean812) {
				local33 = -arg1.anInt5377;
				local35 = -arg1.anInt5360;
				local37 = -arg1.anInt5361;
			} else {
				local33 = arg1.anInt5377 - this.anInt5377;
				local35 = arg1.anInt5360 - this.anInt5360;
				local37 = arg1.anInt5361 - this.anInt5361;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(96) int local96;
		if (this.anInt5368 != 0) {
			local81 = Class464.anIntArray451[this.anInt5368];
			local86 = Class464.anIntArray452[this.anInt5368];
			local96 = local35 * local86 - local37 * local81 >> 14;
			local37 = local35 * local81 + local37 * local86 >> 14;
			local35 = local96;
		}
		if (this.anInt5364 != 0) {
			local81 = Class464.anIntArray451[this.anInt5364];
			local86 = Class464.anIntArray452[this.anInt5364];
			local96 = local37 * local81 + local33 * local86 >> 14;
			local37 = local37 * local86 - local33 * local81 >> 14;
			local33 = local96;
		}
		@Pc(149) Class109 local149 = aClass109_7.method6907((byte) 0, 51200, true);
		local149.method6878((short) 0, (short) this.anInt5376);
		arg0.method20521(1.0F);
		arg0.method20522(16777215, 1.0F, 1.0F, (float) local33, (float) local35, (float) local37);
		local86 = this.anInt5366 * 1024 / (local149.method6864() - local149.method6863());
		if (this.anInt5356 != 0) {
			local86 = local86 * 13 / 16;
		}
		@Pc(192) Class489 local192 = arg0.method20654();
		@Pc(195) Class489 local195 = arg0.method20507();
		local195.method29855((float) (this.anInt5366 / 2), (float) (this.anInt5366 / 2), (float) local86, (float) local86, 50.0F, 50000.0F, (float) arg0.method20434().method23736(), (float) arg0.method20434().method23737(), 1024.0F);
		arg0.method20519(local195);
		arg0.method20516(new Class470());
		@Pc(236) Class470 local236 = new Class470();
		local236.method29385(0.0F, 0.0F, (float) (50 - local149.method6867()));
		local149.method6947(local236, null, 1);
		@Pc(257) int local257 = this.anInt5366 * 13 / 16;
		@Pc(264) int local264 = (this.anInt5366 - local257) / 2;
		aClass100_47.method18176(local264, local264, local257, local257, 0, this.anInt5356 | 0xFF000000, 1);
		this.aClass100_48 = arg0.method20613(0, 0, this.anInt5366, this.anInt5366, true);
		arg0.method20774(2, 0);
		arg0.method20653(0, 0, this.anInt5366, this.anInt5366, 0, 0);
		aClass100_49.method18176(0, 0, this.anInt5366, this.anInt5366, 1, 0, 0);
		this.aClass100_48.method18171(0, 0, 3);
		arg0.method20519(local192);
		arg0.method20467(anIntArray467[0], anIntArray467[1], anIntArray467[2], anIntArray467[3]);
	}

	@OriginalMember(owner = "client!sw", name = "u", descriptor = "(Lclient!dh;)V", line = 295)
	static void method31208(@OriginalArg(0) Class104 arg0) {
		if (aClass109_7 != null) {
			return;
		}
		@Pc(8) Class231 local8 = new Class231(580, 1104, 1);
		local8.method25659((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
		local8.method25660(0, 128, 0);
		local8.method25660(0, -128, 0);
		for (@Pc(34) int local34 = 0; local34 <= 24; local34++) {
			@Pc(43) int local43 = local34 * 8192 / 24;
			@Pc(47) int local47 = Class464.anIntArray451[local43];
			@Pc(51) int local51 = Class464.anIntArray452[local43];
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(68) int local68;
			@Pc(76) int local76;
			@Pc(84) int local84;
			for (local53 = 1; local53 < 24; local53++) {
				local62 = local53 * 8192 / 24;
				local68 = Class464.anIntArray452[local62] >> 7;
				local76 = Class464.anIntArray451[local62] * local47 >> 21;
				local84 = Class464.anIntArray451[local62] * local51 >> 21;
				local8.method25660(local84, local68, -local76);
			}
			if (local34 > 0) {
				local53 = local34 * 23 + 2;
				local62 = local53 - 23;
				local8.method25690(0, local62, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				for (local68 = 1; local68 < 23; local68++) {
					local76 = local62 + 1;
					local84 = local53 + 1;
					local8.method25690(local62, local76, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local8.method25690(local76, local84, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local62 = local76;
					local53 = local84;
				}
				local8.method25690(local53, local62, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
			}
		}
		local8.anInt3740 = local8.anInt3739;
		local8.anIntArray343 = null;
		local8.anIntArray340 = null;
		local8.aByteArray73 = null;
		aClass109_7 = arg0.method20510(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(Lclient!dh;)V", line = 295)
	static void method31212(@OriginalArg(0) Class104 arg0) {
		if (aClass109_7 != null) {
			return;
		}
		@Pc(8) Class231 local8 = new Class231(580, 1104, 1);
		local8.method25659((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
		local8.method25660(0, 128, 0);
		local8.method25660(0, -128, 0);
		for (@Pc(34) int local34 = 0; local34 <= 24; local34++) {
			@Pc(43) int local43 = local34 * 8192 / 24;
			@Pc(47) int local47 = Class464.anIntArray451[local43];
			@Pc(51) int local51 = Class464.anIntArray452[local43];
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(68) int local68;
			@Pc(76) int local76;
			@Pc(84) int local84;
			for (local53 = 1; local53 < 24; local53++) {
				local62 = local53 * 8192 / 24;
				local68 = Class464.anIntArray452[local62] >> 7;
				local76 = Class464.anIntArray451[local62] * local47 >> 21;
				local84 = Class464.anIntArray451[local62] * local51 >> 21;
				local8.method25660(local84, local68, -local76);
			}
			if (local34 > 0) {
				local53 = local34 * 23 + 2;
				local62 = local53 - 23;
				local8.method25690(0, local62, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				for (local68 = 1; local68 < 23; local68++) {
					local76 = local62 + 1;
					local84 = local53 + 1;
					local8.method25690(local62, local76, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local8.method25690(local76, local84, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local62 = local76;
					local53 = local84;
				}
				local8.method25690(local53, local62, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
			}
		}
		local8.anInt3740 = local8.anInt3739;
		local8.anIntArray343 = null;
		local8.anIntArray340 = null;
		local8.aByteArray73 = null;
		aClass109_7 = arg0.method20510(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!sw", name = "h", descriptor = "(Lclient!dh;)V", line = 295)
	static void method31213(@OriginalArg(0) Class104 arg0) {
		if (aClass109_7 != null) {
			return;
		}
		@Pc(8) Class231 local8 = new Class231(580, 1104, 1);
		local8.method25659((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
		local8.method25660(0, 128, 0);
		local8.method25660(0, -128, 0);
		for (@Pc(34) int local34 = 0; local34 <= 24; local34++) {
			@Pc(43) int local43 = local34 * 8192 / 24;
			@Pc(47) int local47 = Class464.anIntArray451[local43];
			@Pc(51) int local51 = Class464.anIntArray452[local43];
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(68) int local68;
			@Pc(76) int local76;
			@Pc(84) int local84;
			for (local53 = 1; local53 < 24; local53++) {
				local62 = local53 * 8192 / 24;
				local68 = Class464.anIntArray452[local62] >> 7;
				local76 = Class464.anIntArray451[local62] * local47 >> 21;
				local84 = Class464.anIntArray451[local62] * local51 >> 21;
				local8.method25660(local84, local68, -local76);
			}
			if (local34 > 0) {
				local53 = local34 * 23 + 2;
				local62 = local53 - 23;
				local8.method25690(0, local62, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				for (local68 = 1; local68 < 23; local68++) {
					local76 = local62 + 1;
					local84 = local53 + 1;
					local8.method25690(local62, local76, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local8.method25690(local76, local84, local53, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					local62 = local76;
					local53 = local84;
				}
				local8.method25690(local53, local62, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
			}
		}
		local8.anInt3740 = local8.anInt3739;
		local8.anIntArray343 = null;
		local8.anIntArray340 = null;
		local8.aByteArray73 = null;
		aClass109_7 = arg0.method20510(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "(Lclient!dh;)V", line = 338)
	static void method31193(@OriginalArg(0) Class104 arg0) {
		if (aClass100_49 != null) {
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
		aClass100_49 = arg0.method20498(local7, 0, 128, 128, 128);
		aClass100_47 = arg0.method20498(local4, 0, 128, 128, 128);
	}

	@OriginalMember(owner = "client!sw", name = "z", descriptor = "(Lclient!dh;)V", line = 338)
	static void method31202(@OriginalArg(0) Class104 arg0) {
		if (aClass100_49 != null) {
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
		aClass100_49 = arg0.method20498(local7, 0, 128, 128, 128);
		aClass100_47 = arg0.method20498(local4, 0, 128, 128, 128);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!dh;)V", line = 338)
	static void method31209(@OriginalArg(0) Class104 arg0) {
		if (aClass100_49 != null) {
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
		aClass100_49 = arg0.method20498(local7, 0, 128, 128, 128);
		aClass100_47 = arg0.method20498(local4, 0, 128, 128, 128);
	}
}
