package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afm")
public abstract class Class96_Sub11 extends Class96 {

	@OriginalMember(owner = "client!afm", name = "hg", descriptor = "Lclient!anb;")
	public static Class35_Sub2 aClass35_Sub2_3;

	@OriginalMember(owner = "client!afm", name = "c", descriptor = "I")
	final int anInt2769;

	@OriginalMember(owner = "client!afm", name = "v", descriptor = "I")
	final int anInt2767;

	@OriginalMember(owner = "client!afm", name = "l", descriptor = "I")
	final int anInt2768;

	@OriginalMember(owner = "client!afm", name = "<init>", descriptor = "(Lclient!akv;)V", line = 14)
	Class96_Sub11(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt2769 = arg0.method22483() * 596976741;
		this.anInt2767 = arg0.method22483() * -362414937;
		this.anInt2768 = arg0.method22478() * -471861621;
	}

	@OriginalMember(owner = "client!afm", name = "l", descriptor = "(I)Z", line = 21)
	@Override
	boolean method19903() {
		@Pc(8) Class679 local8 = (Class679) Class482.aClass35_Sub4_1.method18319(this.anInt2769 * 1538714989);
		@Pc(12) boolean local12 = local8.method36057();
		@Pc(21) Class234 local21 = (Class234) aClass35_Sub2_3.method18319(local8.anInt5810 * -811043807);
		return local12 & local21.method25888();
	}

	@OriginalMember(owner = "client!afm", name = "q", descriptor = "()Z", line = 21)
	@Override
	boolean method19905() {
		@Pc(8) Class679 local8 = (Class679) Class482.aClass35_Sub4_1.method18319(this.anInt2769 * 1538714989);
		@Pc(12) boolean local12 = local8.method36057();
		@Pc(21) Class234 local21 = (Class234) aClass35_Sub2_3.method18319(local8.anInt5810 * -811043807);
		return local12 & local21.method25888();
	}

	@OriginalMember(owner = "client!afm", name = "t", descriptor = "()Z", line = 21)
	@Override
	boolean method19904() {
		@Pc(8) Class679 local8 = (Class679) Class482.aClass35_Sub4_1.method18319(this.anInt2769 * 1538714989);
		@Pc(12) boolean local12 = local8.method36057();
		@Pc(21) Class234 local21 = (Class234) aClass35_Sub2_3.method18319(local8.anInt5810 * -811043807);
		return local12 & local21.method25888();
	}

	@OriginalMember(owner = "client!afm", name = "gj", descriptor = "(B)V", line = 2499)
	static final void method19914() {
		client.anInt3381 = -1139557399;
		client.anInt3443 = -143767915;
		Class705.aClass77_Sub39_17 = null;
		Class93_Sub1.method6436();
	}

	@OriginalMember(owner = "client!afm", name = "anj", descriptor = "(Lclient!yf;I)V", line = 11910)
	static final void method19915(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5781 -= 85613153;
		arg0.anInt5784 -= 617999126;
		Class653.method32976((String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147], (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147 + 1], arg0.anIntArray536[arg0.anInt5784 * 2088438307], arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] == 1, (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147 + 2]);
	}
}
