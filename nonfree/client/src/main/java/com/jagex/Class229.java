package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public class Class229 implements Interface19 {

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "Lclient!dw;")
	Class14 aClass14_8;

	@OriginalMember(owner = "client!hu", name = "x", descriptor = "I")
	int anInt3736;

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "J")
	long aLong246 = 2186169520567569241L;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_45;

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "Lclient!ny;")
	final Class359 aClass359_44;

	@OriginalMember(owner = "client!hu", name = "p", descriptor = "Lclient!km;")
	final Class281 aClass281_1;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!ny;Lclient!ny;Lclient!km;)V", line = 21)
	Class229(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) Class281 arg2) {
		this.aClass359_45 = arg0;
		this.aClass359_44 = arg1;
		this.aClass281_1 = arg2;
	}

	@OriginalMember(owner = "client!hu", name = "p", descriptor = "(IIZI)I", line = 26)
	public static int method24532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg2);
		if (local4 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray178.length) {
			return local4.anIntArray178[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZI)V", line = 28)
	@Override
	public void method24606(@OriginalArg(0) boolean arg0) {
		@Pc(15) int local15 = this.aClass281_1.aClass277_13.method25394(0, client.anInt3032 * 581921171) + this.aClass281_1.anInt4338 * 1073077953;
		@Pc(31) int local31 = this.aClass281_1.aClass276_13.method25383(0, client.anInt3131 * -645382887) + this.aClass281_1.anInt4339 * -2143042137;
		@Pc(41) String local41;
		switch(this.aClass281_1.anInt4340 * -2114029559) {
			case 0:
				local41 = Class5.aClass221_4.method24411();
				break;
			case 1:
				local41 = "" + Class5.aClass221_4.method24391() + "%";
				break;
			case 2:
				local41 = Class5.aClass221_4.method24385();
				break;
			default:
				local41 = "";
		}
		@Pc(67) int local67 = Class5.aClass221_4.method24391();
		if (this.aLong246 * 3583359186433585943L < 0L || local67 == 0 || this.anInt3736 * 378264821 != local67) {
			this.aLong246 = Class176.method23413() * -2186169520567569241L;
			this.anInt3736 = local67 * 1531506525;
		}
		if (this.aClass281_1.anInt4340 * -2114029559 != 1 && Class176.method23413() - this.aLong246 * 3583359186433585943L > 10000L) {
			local41 = local41 + " (" + Class5.aClass221_4.method24392().anInt3725 * 2076865137 + ")";
		}
		this.aClass14_8.method3282(local41, local15, local31, this.aClass281_1.anInt4342 * -238949795, -1);
	}

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "(Z)V", line = 28)
	@Override
	public void method24605(@OriginalArg(0) boolean arg0) {
		@Pc(15) int local15 = this.aClass281_1.aClass277_13.method25394(0, client.anInt3032 * 581921171) + this.aClass281_1.anInt4338 * 1073077953;
		@Pc(31) int local31 = this.aClass281_1.aClass276_13.method25383(0, client.anInt3131 * -645382887) + this.aClass281_1.anInt4339 * -2143042137;
		@Pc(41) String local41;
		switch(this.aClass281_1.anInt4340 * -2114029559) {
			case 0:
				local41 = Class5.aClass221_4.method24411();
				break;
			case 1:
				local41 = "" + Class5.aClass221_4.method24391() + "%";
				break;
			case 2:
				local41 = Class5.aClass221_4.method24385();
				break;
			default:
				local41 = "";
		}
		@Pc(67) int local67 = Class5.aClass221_4.method24391();
		if (this.aLong246 * 3583359186433585943L < 0L || local67 == 0 || this.anInt3736 * 378264821 != local67) {
			this.aLong246 = Class176.method23413() * -2186169520567569241L;
			this.anInt3736 = local67 * 1531506525;
		}
		if (this.aClass281_1.anInt4340 * -2114029559 != 1 && Class176.method23413() - this.aLong246 * 3583359186433585943L > 10000L) {
			local41 = local41 + " (" + Class5.aClass221_4.method24392().anInt3725 * 2076865137 + ")";
		}
		this.aClass14_8.method3282(local41, local15, local31, this.aClass281_1.anInt4342 * -238949795, -1);
	}

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "(I)Z", line = 65)
	@Override
	public boolean method24602() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass359_45.method26674(this.aClass281_1.anInt4336 * -369820177)) {
			local1 = false;
		}
		if (!this.aClass359_44.method26674(this.aClass281_1.anInt4336 * -369820177)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hu", name = "y", descriptor = "()Z", line = 65)
	@Override
	public boolean method24610() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass359_45.method26674(this.aClass281_1.anInt4336 * -369820177)) {
			local1 = false;
		}
		if (!this.aClass359_44.method26674(this.aClass281_1.anInt4336 * -369820177)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hu", name = "u", descriptor = "()V", line = 72)
	@Override
	public void method24609() {
		@Pc(9) Class611 local9 = Class179.method23534(this.aClass359_44, this.aClass281_1.anInt4336 * -369820177);
		this.aClass14_8 = Class613.aClass21_13.method17096(local9, (Class15_Sub1[]) Class137.method22939(this.aClass359_45, this.aClass281_1.anInt4336 * -369820177), true);
	}

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "()V", line = 72)
	@Override
	public void method24603() {
		@Pc(9) Class611 local9 = Class179.method23534(this.aClass359_44, this.aClass281_1.anInt4336 * -369820177);
		this.aClass14_8 = Class613.aClass21_13.method17096(local9, (Class15_Sub1[]) Class137.method22939(this.aClass359_45, this.aClass281_1.anInt4336 * -369820177), true);
	}

	@OriginalMember(owner = "client!hu", name = "x", descriptor = "()V", line = 72)
	@Override
	public void method24608() {
		@Pc(9) Class611 local9 = Class179.method23534(this.aClass359_44, this.aClass281_1.anInt4336 * -369820177);
		this.aClass14_8 = Class613.aClass21_13.method17096(local9, (Class15_Sub1[]) Class137.method22939(this.aClass359_45, this.aClass281_1.anInt4336 * -369820177), true);
	}

	@OriginalMember(owner = "client!hu", name = "s", descriptor = "()V", line = 72)
	@Override
	public void method24607() {
		@Pc(9) Class611 local9 = Class179.method23534(this.aClass359_44, this.aClass281_1.anInt4336 * -369820177);
		this.aClass14_8 = Class613.aClass21_13.method17096(local9, (Class15_Sub1[]) Class137.method22939(this.aClass359_45, this.aClass281_1.anInt4336 * -369820177), true);
	}

	@OriginalMember(owner = "client!hu", name = "p", descriptor = "(I)V", line = 72)
	@Override
	public void method24604() {
		@Pc(9) Class611 local9 = Class179.method23534(this.aClass359_44, this.aClass281_1.anInt4336 * -369820177);
		this.aClass14_8 = Class613.aClass21_13.method17096(local9, (Class15_Sub1[]) Class137.method22939(this.aClass359_45, this.aClass281_1.anInt4336 * -369820177), true);
	}
}
