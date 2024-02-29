package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ana")
public class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!ana", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;Lclient!pw;Lclient!pw;)V", line = 12)
	public Class35_Sub1(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) Class478 arg2, @OriginalArg(3) Class478 arg3) {
		super(arg0, arg1, arg2, Class647.aClass647_76, 64, new Class137_Sub1(arg3));
	}

	@OriginalMember(owner = "client!ana", name = "u", descriptor = "()V", line = 16)
	@Override
	public void method18332() {
		super.method18331();
		((Class137) this.anInterface5_26).method14106();
	}

	@OriginalMember(owner = "client!ana", name = "j", descriptor = "()V", line = 16)
	@Override
	public void method18329() {
		super.method18331();
		((Class137) this.anInterface5_26).method14106();
	}

	@OriginalMember(owner = "client!ana", name = "i", descriptor = "()V", line = 16)
	@Override
	public void method18330() {
		super.method18331();
		((Class137) this.anInterface5_26).method14106();
	}

	@OriginalMember(owner = "client!ana", name = "k", descriptor = "()V", line = 16)
	@Override
	public void method18328() {
		super.method18331();
		((Class137) this.anInterface5_26).method14106();
	}

	@OriginalMember(owner = "client!ana", name = "d", descriptor = "(I)V", line = 16)
	@Override
	public void method18331() {
		super.method18331();
		((Class137) this.anInterface5_26).method14106();
	}

	@OriginalMember(owner = "client!ana", name = "g", descriptor = "(IS)V", line = 21)
	@Override
	public void method18333(@OriginalArg(0) int arg0) {
		super.method18333(arg0);
		((Class137) this.anInterface5_26).method14108(arg0);
	}

	@OriginalMember(owner = "client!ana", name = "e", descriptor = "(I)V", line = 21)
	@Override
	public void method18334(@OriginalArg(0) int arg0) {
		super.method18333(arg0);
		((Class137) this.anInterface5_26).method14108(arg0);
	}

	@OriginalMember(owner = "client!ana", name = "f", descriptor = "(I)V", line = 21)
	@Override
	public void method18335(@OriginalArg(0) int arg0) {
		super.method18333(arg0);
		((Class137) this.anInterface5_26).method14108(arg0);
	}

	@OriginalMember(owner = "client!ana", name = "a", descriptor = "()V", line = 26)
	@Override
	public void method18340() {
		super.method18336();
		((Class137) this.anInterface5_26).method14110();
	}

	@OriginalMember(owner = "client!ana", name = "z", descriptor = "(I)V", line = 26)
	@Override
	public void method18336() {
		super.method18336();
		((Class137) this.anInterface5_26).method14110();
	}

	@OriginalMember(owner = "client!ana", name = "o", descriptor = "()V", line = 26)
	@Override
	public void method18337() {
		super.method18336();
		((Class137) this.anInterface5_26).method14110();
	}

	@OriginalMember(owner = "client!ana", name = "b", descriptor = "()V", line = 26)
	@Override
	public void method18338() {
		super.method18336();
		((Class137) this.anInterface5_26).method14110();
	}

	@OriginalMember(owner = "client!ana", name = "n", descriptor = "()V", line = 26)
	@Override
	public void method18339() {
		super.method18336();
		((Class137) this.anInterface5_26).method14110();
	}

	@OriginalMember(owner = "client!ana", name = "m", descriptor = "()V", line = 26)
	@Override
	public void method18341() {
		super.method18336();
		((Class137) this.anInterface5_26).method14110();
	}

	@OriginalMember(owner = "client!ana", name = "am", descriptor = "(Lclient!yf;I)V", line = 4547)
	static final void method16309(@OriginalArg(0) Class665 arg0) {
		@Pc(9) int local9 = arg0.anIntArray535[arg0.anInt5786 * 662605117] >> 16;
		@Pc(19) int local19 = arg0.anIntArray535[arg0.anInt5786 * 662605117] & 0xFFFF;
		@Pc(32) int local32 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (local32 < 0 || local32 > 5000) {
			throw new RuntimeException();
		}
		arg0.anIntArray534[local9] = local32;
		@Pc(48) byte local48 = -1;
		if (local19 == Class498.aClass498_113.method36479()) {
			local48 = 0;
		}
		for (@Pc(56) int local56 = 0; local56 < local32; local56++) {
			arg0.anIntArrayArray64[local9][local56] = local48;
		}
	}

	@OriginalMember(owner = "client!ana", name = "aaw", descriptor = "(Lclient!yf;I)V", line = 9278)
	static final void method16310(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = arg0.aClass368_3.aStringArray31[local12];
	}

	@OriginalMember(owner = "client!ana", name = "als", descriptor = "(Lclient!yf;B)V", line = 11602)
	static final void method16311(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class597.aClass107_Sub1_2.method8870().anInt4130 * 964723235;
	}
}
