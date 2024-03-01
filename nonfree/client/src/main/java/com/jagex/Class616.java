package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zc")
public class Class616 {

	@OriginalMember(owner = "client!zc", name = "eh", descriptor = "J")
	static long aLong299;

	@OriginalMember(owner = "client!zc", name = "ou", descriptor = "I")
	static int anInt5552;

	@OriginalMember(owner = "client!zc", name = "a", descriptor = "Lclient!ew;")
	final Class161 aClass161_72 = new Class161(64);

	@OriginalMember(owner = "client!zc", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_114;

	@OriginalMember(owner = "client!zc", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;)V", line = 14)
	public Class616(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2) {
		this.aClass359_114 = arg2;
		this.aClass359_114.method26682(Class185.aClass185_37.anInt3631 * -1739932335);
	}

	@OriginalMember(owner = "client!zc", name = "p", descriptor = "(IS)Lclient!zi;", line = 21)
	public Class620 method33684(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_72;
		@Pc(11) Class620 local11;
		synchronized (this.aClass161_72) {
			local11 = (Class620) this.aClass161_72.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_114;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_114) {
			local39 = this.aClass359_114.method26713(Class185.aClass185_37.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class620();
		if (local39 != null) {
			local11.method33753(new Class3_Sub41(local39));
		}
		@Pc(65) Class161 local65 = this.aClass161_72;
		synchronized (this.aClass161_72) {
			this.aClass161_72.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!zc", name = "h", descriptor = "(I)Lclient!zi;", line = 21)
	public Class620 method33687(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_72;
		@Pc(11) Class620 local11;
		synchronized (this.aClass161_72) {
			local11 = (Class620) this.aClass161_72.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_114;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_114) {
			local39 = this.aClass359_114.method26713(Class185.aClass185_37.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class620();
		if (local39 != null) {
			local11.method33753(new Class3_Sub41(local39));
		}
		@Pc(65) Class161 local65 = this.aClass161_72;
		synchronized (this.aClass161_72) {
			this.aClass161_72.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!zc", name = "x", descriptor = "(I)Lclient!zi;", line = 21)
	public Class620 method33688(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_72;
		@Pc(11) Class620 local11;
		synchronized (this.aClass161_72) {
			local11 = (Class620) this.aClass161_72.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_114;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_114) {
			local39 = this.aClass359_114.method26713(Class185.aClass185_37.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class620();
		if (local39 != null) {
			local11.method33753(new Class3_Sub41(local39));
		}
		@Pc(65) Class161 local65 = this.aClass161_72;
		synchronized (this.aClass161_72) {
			this.aClass161_72.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!zc", name = "u", descriptor = "()V", line = 38)
	public void method33683() {
		@Pc(3) Class161 local3 = this.aClass161_72;
		synchronized (this.aClass161_72) {
			this.aClass161_72.method23224();
		}
	}

	@OriginalMember(owner = "client!zc", name = "a", descriptor = "(I)V", line = 38)
	public void method33685() {
		@Pc(3) Class161 local3 = this.aClass161_72;
		synchronized (this.aClass161_72) {
			this.aClass161_72.method23224();
		}
	}

	@OriginalMember(owner = "client!zc", name = "s", descriptor = "()V", line = 38)
	public void method33690() {
		@Pc(3) Class161 local3 = this.aClass161_72;
		synchronized (this.aClass161_72) {
			this.aClass161_72.method23224();
		}
	}

	@OriginalMember(owner = "client!zc", name = "y", descriptor = "()V", line = 38)
	public void method33691() {
		@Pc(3) Class161 local3 = this.aClass161_72;
		synchronized (this.aClass161_72) {
			this.aClass161_72.method23224();
		}
	}

	@OriginalMember(owner = "client!zc", name = "g", descriptor = "(II)V", line = 44)
	public void method33686(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_72;
		synchronized (this.aClass161_72) {
			this.aClass161_72.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!zc", name = "b", descriptor = "(I)V", line = 44)
	public void method33692(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_72;
		synchronized (this.aClass161_72) {
			this.aClass161_72.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!zc", name = "l", descriptor = "(B)V", line = 50)
	public void method33689() {
		@Pc(3) Class161 local3 = this.aClass161_72;
		synchronized (this.aClass161_72) {
			this.aClass161_72.method23245();
		}
	}

	@OriginalMember(owner = "client!zc", name = "y", descriptor = "(B)V", line = 225)
	static void method33693() {
		if (Class67.anInt1836 * 1487902593 <= 0) {
			Class67.aString61 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Class67.aStringArray7.length; local7++) {
			if (Class67.aStringArray7[local7].indexOf("--> ") != -1) {
				local5++;
				if (local5 == Class67.anInt1836 * 1487902593) {
					Class67.aString61 = Class67.aStringArray7[local7].substring(Class67.aStringArray7[local7].indexOf(62) + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!zc", name = "c", descriptor = "(IIIIB)V", line = 311)
	public static void method33694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class3_Sub20 local4;
		for (local4 = (Class3_Sub20) Class3_Sub20.aClass553_19.method32768(); local4 != null; local4 = (Class3_Sub20) Class3_Sub20.aClass553_19.method32709()) {
			Class535.method32538(local4, arg0, arg1, arg2, arg3);
		}
		@Pc(29) byte local29;
		@Pc(34) Class445 local34;
		@Pc(40) int local40;
		@Pc(115) int local115;
		@Pc(219) Class320 local219;
		for (local4 = (Class3_Sub20) Class3_Sub20.aClass553_18.method32768(); local4 != null; local4 = (Class3_Sub20) Class3_Sub20.aClass553_18.method32709()) {
			local29 = 1;
			local34 = local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.method16690();
			local40 = local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.aClass71_Sub1_3.method20103();
			if (local40 == -1 || local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.aClass71_Sub1_3.aBoolean351) {
				local29 = 0;
			} else if (local34.anInt4992 * -1713051549 == local40 || local34.anInt4997 * 1647125495 == local40 || local34.anInt4979 * -1610219699 == local40 || local34.anInt4974 * -1291917697 == local40) {
				local29 = 2;
			} else if (local40 == local34.anInt4967 * 1572273339 || local40 == local34.anInt4987 * -1259453855 || local34.anInt4983 * 1145375145 == local40 || local40 == local34.anInt4982 * -1520360879) {
				local29 = 3;
			}
			if (local4.anInt1276 * -2021885853 != local29) {
				local115 = Class575.method33149(local4.aClass26_Sub1_Sub1_Sub1_Sub1_1);
				@Pc(119) Class571 local119 = local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.aClass571_1;
				if (local119.anIntArray508 != null) {
					local119 = local119.method33044(Class424.aClass165_1, Class424.aClass165_1);
				}
				if (local119 == null || local115 == -1) {
					local4.anInt1280 = 798499549;
					local4.anInt1276 = local29 * -1209939637;
				} else if (local115 == local4.anInt1280 * 1695234699) {
					local4.anInt1276 = local29 * -1209939637;
					local4.anInt1281 = local119.anInt5391 * 384575587;
				} else {
					@Pc(151) boolean local151 = false;
					if (local4.aClass366_3 == null) {
						local151 = true;
					} else {
						local4.anInt1281 -= -1639808512;
						if (local4.anInt1281 * 319712961 <= 0) {
							local4.aClass366_3.method26819(100);
							Class510.aClass183_1.method23684(local4.aClass366_3);
							local4.aClass366_3 = null;
							local151 = true;
						}
					}
					if (local151) {
						local4.anInt1281 = local119.anInt5391 * 384575587;
						local4.anInt1280 = local115 * -798499549;
						local4.anInt1276 = local29 * -1209939637;
					}
				}
			}
			local219 = local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.method21431().aClass320_61;
			local4.anInt1267 = (int) local219.aFloat259 * -735670761;
			local4.anInt1268 = ((int) local219.aFloat259 + (local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.method16630() << 8)) * -654381141;
			local4.anInt1277 = (int) local219.aFloat261 * -422346841;
			local4.anInt1269 = ((int) local219.aFloat261 + (local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.method16630() << 8)) * 1507604409;
			local4.anInt1273 = local4.aClass26_Sub1_Sub1_Sub1_Sub1_1.aByte101 * 763078137;
			Class535.method32538(local4, arg0, arg1, arg2, arg3);
		}
		for (local4 = (Class3_Sub20) Class3_Sub20.aClass581_9.method33221(); local4 != null; local4 = (Class3_Sub20) Class3_Sub20.aClass581_9.method33231()) {
			local29 = 1;
			local34 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.method16690();
			local40 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.aClass71_Sub1_3.method20103();
			if (local40 == -1 || local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.aClass71_Sub1_3.aBoolean351) {
				local29 = 0;
			} else if (local40 == local34.anInt4992 * -1713051549 || local34.anInt4997 * 1647125495 == local40 || local34.anInt4979 * -1610219699 == local40 || local40 == local34.anInt4974 * -1291917697) {
				local29 = 2;
			} else if (local40 == local34.anInt4967 * 1572273339 || local40 == local34.anInt4987 * -1259453855 || local40 == local34.anInt4983 * 1145375145 || local40 == local34.anInt4982 * -1520360879) {
				local29 = 3;
			}
			if (local29 != local4.anInt1276 * -2021885853) {
				local115 = Class512.method29596(local4.aClass26_Sub1_Sub1_Sub1_Sub2_1);
				if (local4.anInt1280 * 1695234699 == local115) {
					local4.anInt1281 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.anInt2401 * -935013707;
					local4.anInt1276 = local29 * -1209939637;
				} else {
					@Pc(384) boolean local384 = false;
					if (local4.aClass366_3 == null) {
						local384 = true;
					} else {
						local4.anInt1281 -= -1639808512;
						if (local4.anInt1281 * 319712961 <= 0) {
							local4.aClass366_3.method26819(100);
							Class510.aClass183_1.method23684(local4.aClass366_3);
							local4.aClass366_3 = null;
							local384 = true;
						}
					}
					if (local384) {
						local4.anInt1281 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.anInt2401 * -935013707;
						local4.anInt1280 = local115 * -798499549;
						local4.anInt1276 = local29 * -1209939637;
					}
				}
			}
			local219 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.method21431().aClass320_61;
			local4.anInt1267 = (int) local219.aFloat259 * -735670761;
			local4.anInt1268 = ((int) local219.aFloat259 + (local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.method16630() << 8)) * -654381141;
			local4.anInt1277 = (int) local219.aFloat261 * -422346841;
			local4.anInt1269 = ((int) local219.aFloat261 + (local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.method16630() << 8)) * 1507604409;
			local4.anInt1273 = local4.aClass26_Sub1_Sub1_Sub1_Sub2_1.aByte101 * 763078137;
			Class535.method32538(local4, arg0, arg1, arg2, arg3);
		}
	}
}
