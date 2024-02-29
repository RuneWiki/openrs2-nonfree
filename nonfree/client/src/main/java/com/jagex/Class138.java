package com.jagex;

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public abstract class Class138 {

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V", line = 9)
	Class138() {
	}

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "(Ljava/awt/Component;Z)Lclient!tt;", line = 12)
	public static Class138 method14204(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		return new Class138_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!tt", name = "z", descriptor = "(Ljava/awt/Component;Z)Lclient!tt;", line = 12)
	public static Class138 method14205(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		return new Class138_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "(Ljava/awt/Component;Z)Lclient!tt;", line = 12)
	public static Class138 method14206(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		return new Class138_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "(I)V", line = 16)
	public static void method14207(@OriginalArg(0) int arg0) {
		Class92.method23486(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "t", descriptor = "(S)Z", line = 25)
	public boolean method14208() {
		return this.method14222() || this.method14242() || this.method14235();
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "()Z", line = 25)
	public boolean method14209() {
		return this.method14222() || this.method14242() || this.method14235();
	}

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "()Z", line = 25)
	public boolean method14210() {
		return this.method14222() || this.method14242() || this.method14235();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "()Z", line = 25)
	public boolean method14211() {
		return this.method14222() || this.method14242() || this.method14235();
	}

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "()Z", line = 25)
	public boolean method14212() {
		return this.method14222() || this.method14242() || this.method14235();
	}

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "()Z", line = 25)
	public boolean method14213() {
		return this.method14222() || this.method14242() || this.method14235();
	}

	@OriginalMember(owner = "client!tt", name = "w", descriptor = "([BB)Ljava/lang/String;", line = 147)
	public static String method14214(@OriginalArg(0) byte[] arg0) {
		return Class386.method28347(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)V", line = 516)
	static void method14215(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class82 local2 = Class230.method25826();
		if (local2.method2022() == null) {
			return;
		}
		@Pc(12) Class77_Sub20 local12 = Class365.method28132(Class414.aClass414_27, local2.aClass16_1);
		local12.aClass77_Sub39_Sub1_2.method22408(Class664.method33107(arg0) + Class664.method33107(arg1) + Class664.method33107(arg2) + 1);
		local12.aClass77_Sub39_Sub1_2.method22440(arg0);
		local12.aClass77_Sub39_Sub1_2.method22440(arg1);
		local12.aClass77_Sub39_Sub1_2.method22440(arg2);
		@Pc(46) int local46 = 0;
		if (arg3) {
			local46 |= 0x1;
		}
		if (arg4) {
			local46 |= 0x2;
		}
		local12.aClass77_Sub39_Sub1_2.method22403(local46);
		local2.method2004(local12);
	}

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "(I)V", line = 649)
	public static final void method14216() {
		Class504.aClass125_2.method12687();
		@Pc(4) int local4;
		for (local4 = 0; local4 < 32; local4++) {
			Class504.aLongArray21[local4] = 0L;
		}
		for (local4 = 0; local4 < 32; local4++) {
			Class504.aLongArray22[local4] = 0L;
		}
		Class504.anInt3369 = 0;
	}

	@OriginalMember(owner = "client!tt", name = "xi", descriptor = "(Lclient!yf;B)V", line = 8642)
	static final void method14217(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass503_7.method30242() >> 3;
	}

	@OriginalMember(owner = "client!tt", name = "ja", descriptor = "(IIIS)V", line = 9387)
	public static void method14218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class595 local3 = client.aClass517_1.method30409();
		@Pc(10) int local10 = arg1 + local3.anInt5504 * -424199969;
		@Pc(17) int local17 = arg2 + local3.anInt5506 * -1166289421;
		if (client.aClass517_1.method30435() == null || client.aClass517_1.method30395() == Class505.aClass505_1 || arg1 < 0 || arg2 < 0 || arg1 >= client.aClass517_1.method30411() || arg2 >= client.aClass517_1.method30417()) {
			return;
		}
		@Pc(52) long local52 = (long) (arg0 << 28 | local17 << 14 | local10);
		@Pc(57) Class77_Sub9 local57 = (Class77_Sub9) client.aClass12_19.method173(local52);
		if (local57 == null) {
			client.aClass517_1.method30435().method31171(arg0, arg1, arg2);
			return;
		}
		@Pc(76) Class77_Sub24 local76 = (Class77_Sub24) local57.aClass695_19.method36395();
		if (local76 == null) {
			client.aClass517_1.method30435().method31171(arg0, arg1, arg2);
			return;
		}
		@Pc(90) int local90 = -1;
		@Pc(92) int local92 = -1;
		@Pc(94) int local94 = -1;
		@Pc(96) Class455 local96 = null;
		@Pc(98) Class455 local98 = null;
		@Pc(100) Class455 local100 = null;
		@Pc(110) Class104_Sub1_Sub5_Sub1 local110 = (Class104_Sub1_Sub5_Sub1) client.aClass517_1.method30435().method31171(arg0, arg1, arg2);
		if (local110 == null) {
			local110 = new Class104_Sub1_Sub5_Sub1(client.aClass517_1.method30435(), arg1 << 9, client.aClass517_1.method30435().aClass88Array1[arg0].method5500(arg1, arg2), arg2 << 9, arg0, arg0);
		} else {
			local90 = local110.anInt3199 * 1392959229;
			local92 = local110.anInt3194 * 382442283;
			local94 = local110.anInt3197 * -866036587;
			local96 = local110.aClass455_47;
			local98 = local110.aClass455_48;
			local100 = local110.aClass455_45;
			local110.anInt3197 = 172960067;
			local110.anInt3194 = -420367235;
			local110.aClass556_23 = client.aClass517_1.method30435();
		}
		local110.anInt3199 = local76.anInt1549 * -639905027;
		local110.anInt3195 = local76.anInt1548 * -2062721087;
		label98: while (true) {
			@Pc(193) Class77_Sub24 local193 = (Class77_Sub24) local57.aClass695_19.method36406();
			if (local193 == null) {
				break;
			}
			if (local193.anInt1549 * -400233975 != local110.anInt3199 * 1392959229) {
				local110.anInt3194 = local193.anInt1549 * 1223845275;
				local110.anInt3196 = local193.anInt1548 * -1513271133;
				while (true) {
					@Pc(225) Class77_Sub24 local225 = (Class77_Sub24) local57.aClass695_19.method36406();
					if (local225 == null) {
						break label98;
					}
					if (local110.anInt3199 * 1392959229 != local225.anInt1549 * -400233975 && local225.anInt1549 * -400233975 != local110.anInt3194 * 382442283) {
						local110.anInt3197 = local225.anInt1549 * -1038856539;
						local110.anInt3198 = local225.anInt1548 * -404094617;
					}
				}
			}
		}
		@Pc(274) int local274 = Class277.method26658((arg1 << 9) + 256, (arg2 << 9) + 256, arg0);
		local110.method24106((float) (arg1 << 9), (float) local274, (float) (arg2 << 9));
		if (local110.anInt3199 * 1392959229 != local90) {
			if (local92 == local110.anInt3199 * 1392959229) {
				local110.aClass455_47 = local98;
			} else if (local110.anInt3199 * 1392959229 == local94) {
				local110.aClass455_47 = local100;
			} else if (((Class18) Class537.aClass35_Sub7_1.method18319(local110.anInt3199 * 1392959229)).aBoolean12) {
				local110.aClass455_47 = Class29.method499();
			} else {
				local110.aClass455_47 = null;
			}
		}
		if (local110.anInt3194 * 382442283 == -1) {
			local110.aClass455_48 = null;
		} else if (local92 != local110.anInt3194 * 382442283) {
			if (local110.anInt3194 * 382442283 == local90) {
				local110.aClass455_48 = local96;
			} else if (local110.anInt3194 * 382442283 == local94) {
				local110.aClass455_48 = local100;
			} else if (((Class18) Class537.aClass35_Sub7_1.method18319(local110.anInt3194 * 382442283)).aBoolean12) {
				local110.aClass455_48 = Class29.method499();
			} else {
				local110.aClass455_48 = null;
			}
		}
		if (local110.anInt3197 * -866036587 == -1) {
			local110.aClass455_45 = null;
		} else if (local94 != local110.anInt3197 * -866036587) {
			if (local110.anInt3197 * -866036587 == local90) {
				local110.aClass455_45 = local96;
			} else if (local92 == local110.anInt3197 * -866036587) {
				local110.aClass455_45 = local98;
			} else if (((Class18) Class537.aClass35_Sub7_1.method18319(local110.anInt3197 * -866036587)).aBoolean12) {
				local110.aClass455_45 = Class29.method499();
			} else {
				local110.aClass455_45 = null;
			}
		}
		local110.anInt3200 = 0;
		local110.aByte100 = (byte) arg0;
		local110.aByte99 = (byte) arg0;
		if (client.aClass517_1.method30441().method29665(arg1, arg2)) {
			local110.aByte99++;
		}
		client.aClass517_1.method30435().method31140(arg0, arg1, arg2, local274, local110);
	}

	@OriginalMember(owner = "client!tt", name = "apy", descriptor = "(Lclient!yf;I)V", line = 12319)
	static final void method14219(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
	}

	@OriginalMember(owner = "client!tt", name = "ac", descriptor = "()V")
	public abstract void method14220();

	@OriginalMember(owner = "client!tt", name = "au", descriptor = "()I")
	public abstract int method14221();

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "(B)Z")
	public abstract boolean method14222();

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "()Z")
	public abstract boolean method14223();

	@OriginalMember(owner = "client!tt", name = "av", descriptor = "()V")
	public abstract void method14224();

	@OriginalMember(owner = "client!tt", name = "x", descriptor = "(I)I")
	public abstract int method14225();

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(B)Lclient!akz;")
	public abstract Class77_Sub42 method14226();

	@OriginalMember(owner = "client!tt", name = "s", descriptor = "(I)V")
	public abstract void method14227();

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "(I)V")
	public abstract void method14228();

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "()Z")
	public abstract boolean method14229();

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "()Z")
	public abstract boolean method14230();

	@OriginalMember(owner = "client!tt", name = "u", descriptor = "()Z")
	public abstract boolean method14231();

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "()Z")
	public abstract boolean method14232();

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "()Z")
	public abstract boolean method14233();

	@OriginalMember(owner = "client!tt", name = "q", descriptor = "(I)I")
	public abstract int method14234();

	@OriginalMember(owner = "client!tt", name = "w", descriptor = "(B)Z")
	public abstract boolean method14235();

	@OriginalMember(owner = "client!tt", name = "ai", descriptor = "()I")
	public abstract int method14236();

	@OriginalMember(owner = "client!tt", name = "ag", descriptor = "()I")
	public abstract int method14237();

	@OriginalMember(owner = "client!tt", name = "al", descriptor = "()I")
	public abstract int method14238();

	@OriginalMember(owner = "client!tt", name = "ao", descriptor = "()I")
	public abstract int method14239();

	@OriginalMember(owner = "client!tt", name = "ak", descriptor = "()I")
	public abstract int method14240();

	@OriginalMember(owner = "client!tt", name = "ad", descriptor = "()V")
	public abstract void method14241();

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "(B)Z")
	public abstract boolean method14242();

	@OriginalMember(owner = "client!tt", name = "ar", descriptor = "()Lclient!akz;")
	public abstract Class77_Sub42 method14243();

	@OriginalMember(owner = "client!tt", name = "ax", descriptor = "()Lclient!akz;")
	public abstract Class77_Sub42 method14244();

	@OriginalMember(owner = "client!tt", name = "aj", descriptor = "()I")
	public abstract int method14245();

	@OriginalMember(owner = "client!tt", name = "at", descriptor = "()Z")
	public abstract boolean method14246();

	@OriginalMember(owner = "client!tt", name = "ae", descriptor = "()Z")
	public abstract boolean method14247();
}
