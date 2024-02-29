package com.jagex;

import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ark")
public class Class77_Sub42_Sub1 extends Class77_Sub42 {

	@OriginalMember(owner = "client!ark", name = "r", descriptor = "I")
	static final int anInt3053 = 160;

	@OriginalMember(owner = "client!ark", name = "g", descriptor = "I")
	static final int anInt3054 = 161;

	@OriginalMember(owner = "client!ark", name = "z", descriptor = "I")
	static final int anInt3055 = 162;

	@OriginalMember(owner = "client!ark", name = "h", descriptor = "I")
	static final int anInt3056 = 174;

	@OriginalMember(owner = "client!ark", name = "i", descriptor = "I")
	static final int anInt3057 = 164;

	@OriginalMember(owner = "client!ark", name = "k", descriptor = "I")
	static final int anInt3058 = 165;

	@OriginalMember(owner = "client!ark", name = "u", descriptor = "I")
	static final int anInt3059 = 166;

	@OriginalMember(owner = "client!ark", name = "j", descriptor = "I")
	static final int anInt3060 = 163;

	@OriginalMember(owner = "client!ark", name = "f", descriptor = "I")
	static final int anInt3061 = 168;

	@OriginalMember(owner = "client!ark", name = "o", descriptor = "I")
	static final int anInt3062 = 169;

	@OriginalMember(owner = "client!ark", name = "ac", descriptor = "I")
	static final int anInt3063 = 522;

	@OriginalMember(owner = "client!ark", name = "n", descriptor = "I")
	static final int anInt3064 = 171;

	@OriginalMember(owner = "client!ark", name = "a", descriptor = "I")
	static final int anInt3065 = 172;

	@OriginalMember(owner = "client!ark", name = "m", descriptor = "I")
	static final int anInt3066 = 173;

	@OriginalMember(owner = "client!ark", name = "ad", descriptor = "I")
	static final int anInt3067 = 521;

	@OriginalMember(owner = "client!ark", name = "aj", descriptor = "I")
	static final int anInt3068 = 512;

	@OriginalMember(owner = "client!ark", name = "ai", descriptor = "I")
	static final int anInt3069 = 513;

	@OriginalMember(owner = "client!ark", name = "al", descriptor = "I")
	static final int anInt3070 = 515;

	@OriginalMember(owner = "client!ark", name = "ag", descriptor = "I")
	static final int anInt3071 = 514;

	@OriginalMember(owner = "client!ark", name = "ao", descriptor = "I")
	static final int anInt3072 = 516;

	@OriginalMember(owner = "client!ark", name = "ak", descriptor = "I")
	static final int anInt3073 = 517;

	@OriginalMember(owner = "client!ark", name = "au", descriptor = "I")
	static final int anInt3074 = 518;

	@OriginalMember(owner = "client!ark", name = "ax", descriptor = "I")
	static final int anInt3075 = 519;

	@OriginalMember(owner = "client!ark", name = "ar", descriptor = "I")
	static final int anInt3076 = 520;

	@OriginalMember(owner = "client!ark", name = "b", descriptor = "I")
	static final int anInt3078 = 170;

	@OriginalMember(owner = "client!ark", name = "av", descriptor = "I")
	static final int anInt3079 = 525;

	@OriginalMember(owner = "client!ark", name = "at", descriptor = "I")
	static final int anInt3080 = 672;

	@OriginalMember(owner = "client!ark", name = "ae", descriptor = "I")
	static final int anInt3081 = 674;

	@OriginalMember(owner = "client!ark", name = "aq", descriptor = "I")
	static int anInt3082;

	@OriginalMember(owner = "client!ark", name = "e", descriptor = "I")
	static final int anInt3086 = 167;

	@OriginalMember(owner = "client!ark", name = "ah", descriptor = "[Lclient!ark;")
	static Class77_Sub42_Sub1[] aClass77_Sub42_Sub1Array1 = new Class77_Sub42_Sub1[0];

	@OriginalMember(owner = "client!ark", name = "ab", descriptor = "I")
	int anInt3077;

	@OriginalMember(owner = "client!ark", name = "am", descriptor = "I")
	int anInt3083;

	@OriginalMember(owner = "client!ark", name = "ay", descriptor = "I")
	int anInt3084;

	@OriginalMember(owner = "client!ark", name = "af", descriptor = "J")
	long aLong184;

	@OriginalMember(owner = "client!ark", name = "an", descriptor = "I")
	int anInt3085;

	@OriginalMember(owner = "client!ark", name = "ac", descriptor = "(I)V", line = 47)
	public static void method22372(@OriginalArg(0) int arg0) {
		Class5.anInt18 = arg0 * 48341337;
		aClass77_Sub42_Sub1Array1 = new Class77_Sub42_Sub1[arg0];
		anInt3082 = 0;
	}

	@OriginalMember(owner = "client!ark", name = "ad", descriptor = "(I)V", line = 47)
	public static void method22373(@OriginalArg(0) int arg0) {
		Class5.anInt18 = arg0 * 48341337;
		aClass77_Sub42_Sub1Array1 = new Class77_Sub42_Sub1[arg0];
		anInt3082 = 0;
	}

	@OriginalMember(owner = "client!ark", name = "at", descriptor = "(IIII)Lclient!ark;", line = 53)
	public static Class77_Sub42_Sub1 method22374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class77_Sub42_Sub1[] local2 = aClass77_Sub42_Sub1Array1;
		synchronized (aClass77_Sub42_Sub1Array1) {
			@Pc(12) Class77_Sub42_Sub1 local12;
			if (anInt3082 * 1045872731 == 0) {
				local12 = new Class77_Sub42_Sub1();
			} else {
				local12 = aClass77_Sub42_Sub1Array1[(anInt3082 -= 1321758675) * 1045872731];
			}
			local12.anInt3085 = arg0 * -466592867;
			local12.anInt3077 = arg1 * -1991833173;
			local12.anInt3083 = arg2 * -934260093;
			local12.anInt3084 = arg3 * -220200763;
			local12.aLong184 = Class280.method26667() * 747553093241954833L;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ark", name = "av", descriptor = "(IIII)Lclient!ark;", line = 53)
	public static Class77_Sub42_Sub1 method22375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class77_Sub42_Sub1[] local2 = aClass77_Sub42_Sub1Array1;
		synchronized (aClass77_Sub42_Sub1Array1) {
			@Pc(12) Class77_Sub42_Sub1 local12;
			if (anInt3082 * 1045872731 == 0) {
				local12 = new Class77_Sub42_Sub1();
			} else {
				local12 = aClass77_Sub42_Sub1Array1[(anInt3082 -= 1321758675) * 1045872731];
			}
			local12.anInt3085 = arg0 * -466592867;
			local12.anInt3077 = arg1 * -1991833173;
			local12.anInt3083 = arg2 * -934260093;
			local12.anInt3084 = arg3 * -220200763;
			local12.aLong184 = Class280.method26667() * 747553093241954833L;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ark", name = "ae", descriptor = "(IIII)Lclient!ark;", line = 53)
	public static Class77_Sub42_Sub1 method22376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class77_Sub42_Sub1[] local2 = aClass77_Sub42_Sub1Array1;
		synchronized (aClass77_Sub42_Sub1Array1) {
			@Pc(12) Class77_Sub42_Sub1 local12;
			if (anInt3082 * 1045872731 == 0) {
				local12 = new Class77_Sub42_Sub1();
			} else {
				local12 = aClass77_Sub42_Sub1Array1[(anInt3082 -= 1321758675) * 1045872731];
			}
			local12.anInt3085 = arg0 * -466592867;
			local12.anInt3077 = arg1 * -1991833173;
			local12.anInt3083 = arg2 * -934260093;
			local12.anInt3084 = arg3 * -220200763;
			local12.aLong184 = Class280.method26667() * 747553093241954833L;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ark", name = "<init>", descriptor = "()V", line = 66)
	Class77_Sub42_Sub1() {
	}

	@OriginalMember(owner = "client!ark", name = "b", descriptor = "()V", line = 69)
	@Override
	public void method22729() {
		@Pc(2) Class77_Sub42_Sub1[] local2 = aClass77_Sub42_Sub1Array1;
		synchronized (aClass77_Sub42_Sub1Array1) {
			if (anInt3082 * 1045872731 < Class5.anInt18 * 1605015273 - 1) {
				aClass77_Sub42_Sub1Array1[(anInt3082 += 1321758675) * 1045872731 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ark", name = "t", descriptor = "(B)V", line = 69)
	@Override
	public void method22720() {
		@Pc(2) Class77_Sub42_Sub1[] local2 = aClass77_Sub42_Sub1Array1;
		synchronized (aClass77_Sub42_Sub1Array1) {
			if (anInt3082 * 1045872731 < Class5.anInt18 * 1605015273 - 1) {
				aClass77_Sub42_Sub1Array1[(anInt3082 += 1321758675) * 1045872731 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ark", name = "j", descriptor = "()V", line = 69)
	@Override
	public void method22728() {
		@Pc(2) Class77_Sub42_Sub1[] local2 = aClass77_Sub42_Sub1Array1;
		synchronized (aClass77_Sub42_Sub1Array1) {
			if (anInt3082 * 1045872731 < Class5.anInt18 * 1605015273 - 1) {
				aClass77_Sub42_Sub1Array1[(anInt3082 += 1321758675) * 1045872731 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ark", name = "n", descriptor = "()V", line = 69)
	@Override
	public void method22727() {
		@Pc(2) Class77_Sub42_Sub1[] local2 = aClass77_Sub42_Sub1Array1;
		synchronized (aClass77_Sub42_Sub1Array1) {
			if (anInt3082 * 1045872731 < Class5.anInt18 * 1605015273 - 1) {
				aClass77_Sub42_Sub1Array1[(anInt3082 += 1321758675) * 1045872731 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ark", name = "a", descriptor = "()V", line = 69)
	@Override
	public void method22718() {
		@Pc(2) Class77_Sub42_Sub1[] local2 = aClass77_Sub42_Sub1Array1;
		synchronized (aClass77_Sub42_Sub1Array1) {
			if (anInt3082 * 1045872731 < Class5.anInt18 * 1605015273 - 1) {
				aClass77_Sub42_Sub1Array1[(anInt3082 += 1321758675) * 1045872731 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ark", name = "ah", descriptor = "()I", line = 75)
	public int method22377() {
		return this.anInt3084 * 1731427853;
	}

	@OriginalMember(owner = "client!ark", name = "ak", descriptor = "(I)I", line = 75)
	public int method22378() {
		return this.anInt3084 * 1731427853;
	}

	@OriginalMember(owner = "client!ark", name = "au", descriptor = "(I)I", line = 79)
	public int method22379() {
		return this.anInt3083 * -41153493;
	}

	@OriginalMember(owner = "client!ark", name = "ay", descriptor = "()I", line = 79)
	public int method22380() {
		return this.anInt3083 * -41153493;
	}

	@OriginalMember(owner = "client!ark", name = "am", descriptor = "()I", line = 79)
	public int method22381() {
		return this.anInt3083 * -41153493;
	}

	@OriginalMember(owner = "client!ark", name = "as", descriptor = "()I", line = 79)
	public int method22382() {
		return this.anInt3083 * -41153493;
	}

	@OriginalMember(owner = "client!ark", name = "aq", descriptor = "()I", line = 79)
	public int method22383() {
		return this.anInt3083 * -41153493;
	}

	@OriginalMember(owner = "client!ark", name = "af", descriptor = "()I", line = 79)
	public int method22384() {
		return this.anInt3083 * -41153493;
	}

	@OriginalMember(owner = "client!ark", name = "ax", descriptor = "(I)Z", line = 83)
	public boolean method22385() {
		switch(this.anInt3083 * -41153493) {
			case 160:
			case 161:
			case 162:
			case 163:
			case 164:
			case 165:
			case 166:
			case 167:
			case 168:
			case 169:
			case 170:
			case 171:
			case 172:
			case 173:
			case 174:
			case 672:
			case 674:
				return true;
			default:
				return false;
		}
	}

	@OriginalMember(owner = "client!ark", name = "z", descriptor = "()I", line = 108)
	@Override
	public int method22732() {
		switch(this.anInt3083 * -41153493) {
			case 160:
			case 512:
				return 0;
			case 163:
			case 166:
			case 169:
			case 173:
			case 515:
			case 518:
			case 521:
			case 525:
				return 2;
			default:
				return 1;
		}
	}

	@OriginalMember(owner = "client!ark", name = "l", descriptor = "(I)I", line = 108)
	@Override
	public int method22731() {
		switch(this.anInt3083 * -41153493) {
			case 160:
			case 512:
				return 0;
			case 163:
			case 166:
			case 169:
			case 173:
			case 515:
			case 518:
			case 521:
			case 525:
				return 2;
			default:
				return 1;
		}
	}

	@OriginalMember(owner = "client!ark", name = "p", descriptor = "(B)I", line = 127)
	@Override
	public int method22715() {
		switch(this.anInt3083 * -41153493) {
			case 160:
			case 512:
				return -1;
			case 161:
			case 163:
			case 513:
			case 515:
				return 0;
			case 162:
			case 514:
				return 3;
			case 164:
			case 166:
			case 516:
			case 518:
				return 2;
			case 165:
			case 517:
				return 5;
			case 167:
			case 169:
			case 519:
			case 521:
				return 1;
			case 168:
			case 520:
				return 4;
			case 170:
			case 522:
				return 6;
			default:
				return -2;
		}
	}

	@OriginalMember(owner = "client!ark", name = "x", descriptor = "()I", line = 127)
	@Override
	public int method22722() {
		switch(this.anInt3083 * -41153493) {
			case 160:
			case 512:
				return -1;
			case 161:
			case 163:
			case 513:
			case 515:
				return 0;
			case 162:
			case 514:
				return 3;
			case 164:
			case 166:
			case 516:
			case 518:
				return 2;
			case 165:
			case 517:
				return 5;
			case 167:
			case 169:
			case 519:
			case 521:
				return 1;
			case 168:
			case 520:
				return 4;
			case 170:
			case 522:
				return 6;
			default:
				return -2;
		}
	}

	@OriginalMember(owner = "client!ark", name = "q", descriptor = "()I", line = 127)
	@Override
	public int method22721() {
		switch(this.anInt3083 * -41153493) {
			case 160:
			case 512:
				return -1;
			case 161:
			case 163:
			case 513:
			case 515:
				return 0;
			case 162:
			case 514:
				return 3;
			case 164:
			case 166:
			case 516:
			case 518:
				return 2;
			case 165:
			case 517:
				return 5;
			case 167:
			case 169:
			case 519:
			case 521:
				return 1;
			case 168:
			case 520:
				return 4;
			case 170:
			case 522:
				return 6;
			default:
				return -2;
		}
	}

	@OriginalMember(owner = "client!ark", name = "ar", descriptor = "(Ljava/awt/Point;I)V", line = 163)
	public void method22386(@OriginalArg(0) Point arg0) {
		this.anInt3085 -= arg0.x * -466592867;
		this.anInt3077 -= arg0.y * -1991833173;
	}

	@OriginalMember(owner = "client!ark", name = "an", descriptor = "(Ljava/awt/Point;)V", line = 163)
	public void method22387(@OriginalArg(0) Point arg0) {
		this.anInt3085 -= arg0.x * -466592867;
		this.anInt3077 -= arg0.y * -1991833173;
	}

	@OriginalMember(owner = "client!ark", name = "y", descriptor = "(I)J", line = 168)
	@Override
	public long method22719() {
		return this.aLong184 * 8600395610999017201L;
	}

	@OriginalMember(owner = "client!ark", name = "g", descriptor = "()J", line = 168)
	@Override
	public long method22730() {
		return this.aLong184 * 8600395610999017201L;
	}

	@OriginalMember(owner = "client!ark", name = "c", descriptor = "(B)I", line = 172)
	@Override
	public int method22716() {
		return this.anInt3085 * -570948939;
	}

	@OriginalMember(owner = "client!ark", name = "ag", descriptor = "()I", line = 172)
	@Override
	public int method22725() {
		return this.anInt3085 * -570948939;
	}

	@OriginalMember(owner = "client!ark", name = "d", descriptor = "()I", line = 176)
	@Override
	public int method22723() {
		return this.anInt3077 * 760981763;
	}

	@OriginalMember(owner = "client!ark", name = "v", descriptor = "(I)I", line = 176)
	@Override
	public int method22717() {
		return this.anInt3077 * 760981763;
	}

	@OriginalMember(owner = "client!ark", name = "s", descriptor = "()I", line = 176)
	@Override
	public int method22724() {
		return this.anInt3077 * 760981763;
	}

	@OriginalMember(owner = "client!ark", name = "r", descriptor = "()I", line = 176)
	@Override
	public int method22726() {
		return this.anInt3077 * 760981763;
	}

	@OriginalMember(owner = "client!ark", name = "i", descriptor = "(IILclient!gm;Lclient!cd;III)V", line = 539)
	static void method22388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class277 arg2, @OriginalArg(3) Class90 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = Class152.anInt2399 * -1843550713;
		@Pc(5) int[] local5 = Class152.anIntArray221;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class104_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null && local16.method21191() && !local16.aClass615_1.method32350() && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != local16 && local16.aByte100 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
				@Pc(40) Class447 local40 = local16.method24085().aClass447_61;
				@Pc(50) int local50 = (int) local40.aFloat277 / 128 - arg0 / 128;
				@Pc(60) int local60 = (int) local40.aFloat278 / 128 - arg1 / 128;
				@Pc(62) boolean local62 = false;
				for (@Pc(64) int local64 = 0; local64 < client.anInt3529 * -1979292205; local64++) {
					@Pc(73) Class162 local73 = client.aClass162Array1[local64];
					if (local16.aString82.equals(local73.aString131) && local73.anInt3260 * -721928209 != 0) {
						local62 = true;
						break;
					}
				}
				@Pc(91) boolean local91 = false;
				for (@Pc(93) int local93 = 0; local93 < Class462.anInt4970 * -217094943; local93++) {
					if (local16.aString82.equals(Class204.aClass50Array1[local93].aString9)) {
						local91 = true;
						break;
					}
				}
				@Pc(113) boolean local113 = false;
				if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2911 * 676699829 != 0 && local16.anInt2911 * 676699829 != 0 && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2911 * 676699829 == local16.anInt2911 * 676699829) {
					local113 = true;
				}
				if (local16.aClass628_1 != null && local16.aClass628_1.anInt5660 * 1568742735 != -1 && ((Class333) Class578.aClass35_Sub3_1.method18319(local16.aClass628_1.anInt5660 * 1568742735)).aBoolean717) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[1]);
				} else if (local16.aClass282_1 == Class282.aClass282_2) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[8]);
				} else if (Class282.aClass282_3 == local16.aClass282_1) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[6]);
				} else if (local113) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[4]);
				} else if (local16.aBoolean486) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[7]);
				} else if (local62) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[3]);
				} else if (local91) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[5]);
				} else {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[2]);
				}
			}
		}
	}
}
