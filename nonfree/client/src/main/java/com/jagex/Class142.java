package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public class Class142 {

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
	int anInt3428;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
	int anInt3430;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
	int anInt3431;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
	int anInt3432;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	final int anInt3429;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Lclient!si;")
	final Class456 aClass456_1;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 18)
	Class142(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt3429 = arg0.method20375() * -1449427667;
		this.aClass456_1 = (Class456) Class356.method26649(Class3_Sub26.method11536(), arg0.method20269());
	}

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "(IIII)V", line = 24)
	void method23034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class60_Sub21.method13693(arg0, arg1, arg2, this.aClass456_1.anInt5062 * 82326105, this.anInt3429 * 485546661, this.aClass456_1.anInt5061 * 821735799, arg3);
		this.anInt3432 = arg0 * 303181903;
		this.anInt3430 = arg1 * 703900237;
		this.anInt3431 = arg2 * -1399979227;
		this.anInt3428 = arg3 * -1200252159;
	}

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "(IIIII)V", line = 24)
	void method23035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class60_Sub21.method13693(arg0, arg1, arg2, this.aClass456_1.anInt5062 * 82326105, this.anInt3429 * 485546661, this.aClass456_1.anInt5061 * 821735799, arg3);
		this.anInt3432 = arg0 * 303181903;
		this.anInt3430 = arg1 * 703900237;
		this.anInt3431 = arg2 * -1399979227;
		this.anInt3428 = arg3 * -1200252159;
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(IIII)V", line = 24)
	void method23039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class60_Sub21.method13693(arg0, arg1, arg2, this.aClass456_1.anInt5062 * 82326105, this.anInt3429 * 485546661, this.aClass456_1.anInt5061 * 821735799, arg3);
		this.anInt3432 = arg0 * 303181903;
		this.anInt3430 = arg1 * 703900237;
		this.anInt3431 = arg2 * -1399979227;
		this.anInt3428 = arg3 * -1200252159;
	}

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "(IIII)V", line = 24)
	void method23040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class60_Sub21.method13693(arg0, arg1, arg2, this.aClass456_1.anInt5062 * 82326105, this.anInt3429 * 485546661, this.aClass456_1.anInt5061 * 821735799, arg3);
		this.anInt3432 = arg0 * 303181903;
		this.anInt3430 = arg1 * 703900237;
		this.anInt3431 = arg2 * -1399979227;
		this.anInt3428 = arg3 * -1200252159;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 32)
	void method23036() {
		Class60_Sub21.method13693(this.anInt3432 * 716629679, this.anInt3430 * -773284219, this.anInt3431 * 1297244333, this.aClass456_1.anInt5062 * 82326105, -1, this.aClass456_1.anInt5061 * 821735799, this.anInt3428 * -261921535);
	}

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "()V", line = 32)
	void method23037() {
		Class60_Sub21.method13693(this.anInt3432 * 716629679, this.anInt3430 * -773284219, this.anInt3431 * 1297244333, this.aClass456_1.anInt5062 * 82326105, -1, this.aClass456_1.anInt5061 * 821735799, this.anInt3428 * -261921535);
	}

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "()V", line = 32)
	void method23041() {
		Class60_Sub21.method13693(this.anInt3432 * 716629679, this.anInt3430 * -773284219, this.anInt3431 * 1297244333, this.aClass456_1.anInt5062 * 82326105, -1, this.aClass456_1.anInt5061 * 821735799, this.anInt3428 * -261921535);
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(B)Z", line = 36)
	boolean method23038() {
		if (this.anInt3429 * 485546661 < 0) {
			return true;
		}
		@Pc(12) Class467 local12 = Class629.aClass457_11.method28510(this.anInt3429 * 485546661);
		@Pc(21) boolean local21 = local12.method28691(this.aClass456_1.anInt5061 * 821735799);
		@Pc(25) int[] local25 = local12.method28677();
		if (local25 != null) {
			@Pc(29) int[] local29 = local25;
			for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
				@Pc(39) int local39 = local29[local31];
				local21 &= Class110.aClass436_1.method27999(local39).method28236();
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "()Z", line = 36)
	boolean method23042() {
		if (this.anInt3429 * 485546661 < 0) {
			return true;
		}
		@Pc(12) Class467 local12 = Class629.aClass457_11.method28510(this.anInt3429 * 485546661);
		@Pc(21) boolean local21 = local12.method28691(this.aClass456_1.anInt5061 * 821735799);
		@Pc(25) int[] local25 = local12.method28677();
		if (local25 != null) {
			@Pc(29) int[] local29 = local25;
			for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
				@Pc(39) int local39 = local29[local31];
				local21 &= Class110.aClass436_1.method27999(local39).method28236();
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "()Z", line = 36)
	boolean method23043() {
		if (this.anInt3429 * 485546661 < 0) {
			return true;
		}
		@Pc(12) Class467 local12 = Class629.aClass457_11.method28510(this.anInt3429 * 485546661);
		@Pc(21) boolean local21 = local12.method28691(this.aClass456_1.anInt5061 * 821735799);
		@Pc(25) int[] local25 = local12.method28677();
		if (local25 != null) {
			@Pc(29) int[] local29 = local25;
			for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
				@Pc(39) int local39 = local29[local31];
				local21 &= Class110.aClass436_1.method27999(local39).method28236();
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "()Z", line = 36)
	boolean method23044() {
		if (this.anInt3429 * 485546661 < 0) {
			return true;
		}
		@Pc(12) Class467 local12 = Class629.aClass457_11.method28510(this.anInt3429 * 485546661);
		@Pc(21) boolean local21 = local12.method28691(this.aClass456_1.anInt5061 * 821735799);
		@Pc(25) int[] local25 = local12.method28677();
		if (local25 != null) {
			@Pc(29) int[] local29 = local25;
			for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
				@Pc(39) int local39 = local29[local31];
				local21 &= Class110.aClass436_1.method27999(local39).method28236();
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([BII)I", line = 54)
	public static int method23047(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Class30_Sub2.method16472(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!eb", name = "hf", descriptor = "(Lclient!vs;I)V", line = 5451)
	static final void method23048(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class408.method27666(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!eb", name = "wq", descriptor = "(Lclient!vs;S)V", line = 8107)
	static final void method23045(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(28) Class574 local28 = Class438.aClass589_1.method33297(local13);
		if (local28.aChar14 != 's') {
		}
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local28.method33097(local23);
	}

	@OriginalMember(owner = "client!eb", name = "aaw", descriptor = "(Lclient!vs;S)V", line = 8730)
	static final void method23049(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aClass367Array1[local12].anInt4657 * 1923901489;
	}

	@OriginalMember(owner = "client!eb", name = "ane", descriptor = "(Lclient!vs;S)V", line = 11365)
	static final void method23050(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) int local17 = Class510.aClass3_Sub45_37.aClass60_Sub33_2.method14179();
		if (local17 != local12) {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub33_2, local12);
			Class26_Sub1_Sub1_Sub1.method16728();
			client.aBoolean573 = false;
		}
	}

	@OriginalMember(owner = "client!eb", name = "aoj", descriptor = "(Lclient!vs;I)V", line = 11535)
	static final void method23046(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub3_1.method12813() == 1 ? 1 : 0;
	}
}
