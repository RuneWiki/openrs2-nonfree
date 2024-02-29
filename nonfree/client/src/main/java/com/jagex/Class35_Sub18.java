package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoe")
public class Class35_Sub18 extends Class35 {

	@OriginalMember(owner = "client!aoe", name = "w", descriptor = "I")
	public static final int anInt2426 = 64;

	@OriginalMember(owner = "client!aoe", name = "t", descriptor = "I")
	public static final int anInt2427 = 64;

	@OriginalMember(owner = "client!aoe", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;Lclient!pw;Lclient!pw;)V", line = 15)
	public Class35_Sub18(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) Class478 arg2, @OriginalArg(3) Class478 arg3) {
		super(arg0, arg1, arg2, Class647.aClass647_65, 64, new Class54_Sub1(arg3, 64));
	}

	@OriginalMember(owner = "client!aoe", name = "ao", descriptor = "(III)V", line = 19)
	public void method17668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method18326(arg0);
		((Class54) this.anInterface5_26).method17786(arg1);
	}

	@OriginalMember(owner = "client!aoe", name = "d", descriptor = "(I)V", line = 24)
	@Override
	public void method18331() {
		super.method18331();
		((Class54) this.anInterface5_26).method17788();
	}

	@OriginalMember(owner = "client!aoe", name = "j", descriptor = "()V", line = 24)
	@Override
	public void method18329() {
		super.method18331();
		((Class54) this.anInterface5_26).method17788();
	}

	@OriginalMember(owner = "client!aoe", name = "k", descriptor = "()V", line = 24)
	@Override
	public void method18328() {
		super.method18331();
		((Class54) this.anInterface5_26).method17788();
	}

	@OriginalMember(owner = "client!aoe", name = "u", descriptor = "()V", line = 24)
	@Override
	public void method18332() {
		super.method18331();
		((Class54) this.anInterface5_26).method17788();
	}

	@OriginalMember(owner = "client!aoe", name = "i", descriptor = "()V", line = 24)
	@Override
	public void method18330() {
		super.method18331();
		((Class54) this.anInterface5_26).method17788();
	}

	@OriginalMember(owner = "client!aoe", name = "g", descriptor = "(IS)V", line = 29)
	@Override
	public void method18333(@OriginalArg(0) int arg0) {
		super.method18333(arg0);
		((Class54) this.anInterface5_26).method17793(arg0);
	}

	@OriginalMember(owner = "client!aoe", name = "f", descriptor = "(I)V", line = 29)
	@Override
	public void method18335(@OriginalArg(0) int arg0) {
		super.method18333(arg0);
		((Class54) this.anInterface5_26).method17793(arg0);
	}

	@OriginalMember(owner = "client!aoe", name = "e", descriptor = "(I)V", line = 29)
	@Override
	public void method18334(@OriginalArg(0) int arg0) {
		super.method18333(arg0);
		((Class54) this.anInterface5_26).method17793(arg0);
	}

	@OriginalMember(owner = "client!aoe", name = "m", descriptor = "()V", line = 34)
	@Override
	public void method18341() {
		super.method18336();
		((Class54) this.anInterface5_26).method17796();
	}

	@OriginalMember(owner = "client!aoe", name = "n", descriptor = "()V", line = 34)
	@Override
	public void method18339() {
		super.method18336();
		((Class54) this.anInterface5_26).method17796();
	}

	@OriginalMember(owner = "client!aoe", name = "z", descriptor = "(I)V", line = 34)
	@Override
	public void method18336() {
		super.method18336();
		((Class54) this.anInterface5_26).method17796();
	}

	@OriginalMember(owner = "client!aoe", name = "o", descriptor = "()V", line = 34)
	@Override
	public void method18337() {
		super.method18336();
		((Class54) this.anInterface5_26).method17796();
	}

	@OriginalMember(owner = "client!aoe", name = "a", descriptor = "()V", line = 34)
	@Override
	public void method18340() {
		super.method18336();
		((Class54) this.anInterface5_26).method17796();
	}

	@OriginalMember(owner = "client!aoe", name = "b", descriptor = "()V", line = 34)
	@Override
	public void method18338() {
		super.method18336();
		((Class54) this.anInterface5_26).method17796();
	}

	@OriginalMember(owner = "client!aoe", name = "auu", descriptor = "(Lclient!yf;B)V", line = 12958)
	static final void method17669(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class302 local18 = (Class302) Class251.aClass35_Sub10_3.method18319(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local18.anInt4019 * 1747122653;
	}
}
