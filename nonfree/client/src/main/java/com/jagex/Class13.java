package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aal")
public class Class13 implements Interface75 {

	@OriginalMember(owner = "client!aal", name = "p", descriptor = "Lclient!aal;")
	public static final Class13 aClass13_4 = new Class13(2, 0);

	@OriginalMember(owner = "client!aal", name = "c", descriptor = "Lclient!aal;")
	public static final Class13 aClass13_3 = new Class13(0, 1);

	@OriginalMember(owner = "client!aal", name = "v", descriptor = "Lclient!aal;")
	public static final Class13 aClass13_2 = new Class13(1, 2);

	@OriginalMember(owner = "client!aal", name = "l", descriptor = "Lclient!aal;")
	public static final Class13 aClass13_1 = new Class13(3, 3);

	@OriginalMember(owner = "client!aal", name = "y", descriptor = "I")
	public final int anInt39;

	@OriginalMember(owner = "client!aal", name = "w", descriptor = "I")
	final int anInt40;

	@OriginalMember(owner = "client!aal", name = "p", descriptor = "(Lclient!yb;Lclient!ye;IB)I", line = 11)
	public static int method205(@OriginalArg(0) Class661 arg0, @OriginalArg(1) Class664 arg1, @OriginalArg(2) int arg2) {
		return Class661.aClass661_5 == arg0 ? 43594 : arg2 + 40000;
	}

	@OriginalMember(owner = "client!aal", name = "<init>", descriptor = "(II)V", line = 15)
	Class13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt39 = arg0 * -354486817;
		this.anInt40 = arg1 * -1887796061;
	}

	@OriginalMember(owner = "client!aal", name = "c", descriptor = "()I", line = 21)
	@Override
	public int method36479() {
		return this.anInt40 * -589672693;
	}

	@OriginalMember(owner = "client!aal", name = "l", descriptor = "()I", line = 21)
	@Override
	public int method36478() {
		return this.anInt40 * -589672693;
	}

	@OriginalMember(owner = "client!aal", name = "y", descriptor = "()I", line = 21)
	@Override
	public int method36477() {
		return this.anInt40 * -589672693;
	}

	@OriginalMember(owner = "client!aal", name = "gy", descriptor = "(ZI)V", line = 2650)
	public static final void method206(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			Class555.aClass35_Sub17_3.method18331();
			Class65.aClass35_Sub13_1.method18331();
			Class333.aClass35_Sub14_1.method18331();
			client.aClass517_1.method30444().method18331();
			Class578.aClass35_Sub3_1.method18331();
			Class537.aClass35_Sub7_1.method18331();
			Class96_Sub11.aClass35_Sub2_3.method18331();
			Class482.aClass35_Sub4_1.method18331();
			Class61.aClass35_Sub11_1.method18331();
			Class562.aClass80_Sub1_Sub1_2.method1653();
			Class539.aClass80_Sub1_Sub2_6.method1963();
			Class55.aClass80_Sub1_Sub2_1.method1963();
			Class308.aClass80_Sub1_Sub2_3.method1963();
			Class528.aClass80_Sub1_Sub2_5.method1963();
			Class77_Sub23.aClass80_Sub1_Sub2_2.method1963();
			Class96_Sub23.aClass35_Sub15_1.method18331();
			Class118_Sub1.aClass35_Sub18_4.method18331();
			Class251.aClass35_Sub10_3.method18331();
			Class77_Sub13_Sub12.aClass35_Sub22_1.method18331();
			Class214.aClass35_Sub6_1.method18331();
			Class497.aClass35_Sub9_1.method18331();
			Class96_Sub10.aClass35_Sub20_1.method18331();
			Class648.aClass35_Sub5_1.method18331();
			Class629.aClass35_Sub1_1.method18331();
			Class476.aClass35_Sub16_1.method18331();
			Class658.method33059();
			Class142.method14874();
			Class367.aClass415_1.method28648();
			Class560.method31286();
			if (client.aClass661_1 != Class661.aClass661_5) {
				for (@Pc(92) int local92 = 0; local92 < Class331.aByteArrayArray14.length; local92++) {
					Class331.aByteArrayArray14[local92] = null;
				}
				client.anInt3393 = 0;
			}
			client.aClass517_1.method30443().method32262();
			Class560.method31285();
			Class209.method25586();
			Class112.aClass405_3.method28532();
			Class392.aClass398_1.method28450();
			Class674.aClass232_92.method25850();
			client.aClass232_63.method25850();
			client.aClass232_64.method25850();
			client.aClass232_66.method25850();
			Class75_Sub1.aClass35_1.method18331();
			Class149.aClass35_10.method18331();
			client.aClass232_65.method25850();
		}
		Class285.method26718();
		Class143_Sub38.method16161();
	}

	@OriginalMember(owner = "client!aal", name = "ak", descriptor = "(Lclient!yf;I)V", line = 4452)
	static final void method207(@OriginalArg(0) Class665 arg0) {
		@Pc(9) Class343 local9 = (Class343) arg0.aClass77_Sub1_Sub9_2.anObjectArray5[arg0.anInt5786 * 662605117];
		@Pc(33) Interface18 local33 = (Interface18) (arg0.anIntArray535[arg0.anInt5786 * 662605117] == 0 ? arg0.aMap22.get(local9.aClass75_1.aClass127_3) : arg0.aMap23.get(local9.aClass75_1.aClass127_3));
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local33.method35935(local9);
	}

	@OriginalMember(owner = "client!aal", name = "ja", descriptor = "(Lclient!yf;I)V", line = 6230)
	static final void method208(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class265.method26460(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!aal", name = "alb", descriptor = "(Lclient!yf;I)V", line = 11566)
	static final void method209(@OriginalArg(0) Class665 arg0) {
		Class256.method26217(arg0, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3);
	}

	@OriginalMember(owner = "client!aal", name = "awr", descriptor = "(Lclient!yf;I)V", line = 13266)
	static final void method210(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1.method16264(local12);
	}
}
