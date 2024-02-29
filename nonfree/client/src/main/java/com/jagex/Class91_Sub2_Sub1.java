package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apm")
public class Class91_Sub2_Sub1 extends Class91_Sub2 {

	@OriginalMember(owner = "client!apm", name = "l", descriptor = "[[I")
	static final int[][] anIntArrayArray42 = new int[6][];

	@OriginalMember(owner = "client!apm", name = "c", descriptor = "Lclient!le;")
	Interface40 anInterface40_4;

	@OriginalMember(owner = "client!apm", name = "p", descriptor = "Lclient!aed;")
	final Class86_Sub1 aClass86_Sub1_31;

	@OriginalMember(owner = "client!apm", name = "v", descriptor = "I")
	final int anInt2629;

	@OriginalMember(owner = "client!apm", name = "<init>", descriptor = "(Lclient!aed;I)V", line = 14)
	Class91_Sub2_Sub1(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass86_Sub1_31 = arg0;
		this.anInt2629 = arg1;
	}

	@OriginalMember(owner = "client!apm", name = "v", descriptor = "()Lclient!le;", line = 20)
	@Override
	Interface40 method18667() {
		if (this.anInterface40_4 == null) {
			@Pc(6) Interface24 local6 = this.aClass86_Sub1_31.anInterface24_55;
			@Pc(14) Class215 local14 = this.aClass86_Sub1_31.aClass209_9.method25584(this.anInt2629);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean640) {
				return null;
			}
			if (!local6.method4231(Class596.aClass596_1, this.anInt2629, Class609.aClass609_1, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495)) {
				return null;
			}
			@Pc(60) int[] local60 = local6.method4224(Class596.aClass596_1, this.anInt2629, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495);
			@Pc(70) int local70 = local14.anInt3714 * 1264459495 * local14.anInt3714 * 1264459495;
			if (local60 == null) {
				return null;
			}
			for (@Pc(76) int local76 = 0; local76 < 6; local76++) {
				anIntArrayArray42[local76] = new int[local70];
				System.arraycopy(local60, local70 * local76, anIntArrayArray42[local76], 0, local70);
			}
			this.anInterface40_4 = this.aClass86_Sub1_31.method20638(local14.anInt3714 * 1264459495, local14.aByte120 != 0, anIntArrayArray42);
		}
		return this.anInterface40_4;
	}

	@OriginalMember(owner = "client!apm", name = "p", descriptor = "()Lclient!le;", line = 20)
	@Override
	Interface40 method18668() {
		if (this.anInterface40_4 == null) {
			@Pc(6) Interface24 local6 = this.aClass86_Sub1_31.anInterface24_55;
			@Pc(14) Class215 local14 = this.aClass86_Sub1_31.aClass209_9.method25584(this.anInt2629);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean640) {
				return null;
			}
			if (!local6.method4231(Class596.aClass596_1, this.anInt2629, Class609.aClass609_1, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495)) {
				return null;
			}
			@Pc(60) int[] local60 = local6.method4224(Class596.aClass596_1, this.anInt2629, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495);
			@Pc(70) int local70 = local14.anInt3714 * 1264459495 * local14.anInt3714 * 1264459495;
			if (local60 == null) {
				return null;
			}
			for (@Pc(76) int local76 = 0; local76 < 6; local76++) {
				anIntArrayArray42[local76] = new int[local70];
				System.arraycopy(local60, local70 * local76, anIntArrayArray42[local76], 0, local70);
			}
			this.anInterface40_4 = this.aClass86_Sub1_31.method20638(local14.anInt3714 * 1264459495, local14.aByte120 != 0, anIntArrayArray42);
		}
		return this.anInterface40_4;
	}

	@OriginalMember(owner = "client!apm", name = "c", descriptor = "()Lclient!le;", line = 20)
	@Override
	Interface40 method18665() {
		if (this.anInterface40_4 == null) {
			@Pc(6) Interface24 local6 = this.aClass86_Sub1_31.anInterface24_55;
			@Pc(14) Class215 local14 = this.aClass86_Sub1_31.aClass209_9.method25584(this.anInt2629);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean640) {
				return null;
			}
			if (!local6.method4231(Class596.aClass596_1, this.anInt2629, Class609.aClass609_1, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495)) {
				return null;
			}
			@Pc(60) int[] local60 = local6.method4224(Class596.aClass596_1, this.anInt2629, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495);
			@Pc(70) int local70 = local14.anInt3714 * 1264459495 * local14.anInt3714 * 1264459495;
			if (local60 == null) {
				return null;
			}
			for (@Pc(76) int local76 = 0; local76 < 6; local76++) {
				anIntArrayArray42[local76] = new int[local70];
				System.arraycopy(local60, local70 * local76, anIntArrayArray42[local76], 0, local70);
			}
			this.anInterface40_4 = this.aClass86_Sub1_31.method20638(local14.anInt3714 * 1264459495, local14.aByte120 != 0, anIntArrayArray42);
		}
		return this.anInterface40_4;
	}

	@OriginalMember(owner = "client!apm", name = "l", descriptor = "()Lclient!le;", line = 20)
	@Override
	Interface40 method18664() {
		if (this.anInterface40_4 == null) {
			@Pc(6) Interface24 local6 = this.aClass86_Sub1_31.anInterface24_55;
			@Pc(14) Class215 local14 = this.aClass86_Sub1_31.aClass209_9.method25584(this.anInt2629);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean640) {
				return null;
			}
			if (!local6.method4231(Class596.aClass596_1, this.anInt2629, Class609.aClass609_1, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495)) {
				return null;
			}
			@Pc(60) int[] local60 = local6.method4224(Class596.aClass596_1, this.anInt2629, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495);
			@Pc(70) int local70 = local14.anInt3714 * 1264459495 * local14.anInt3714 * 1264459495;
			if (local60 == null) {
				return null;
			}
			for (@Pc(76) int local76 = 0; local76 < 6; local76++) {
				anIntArrayArray42[local76] = new int[local70];
				System.arraycopy(local60, local70 * local76, anIntArrayArray42[local76], 0, local70);
			}
			this.anInterface40_4 = this.aClass86_Sub1_31.method20638(local14.anInt3714 * 1264459495, local14.aByte120 != 0, anIntArrayArray42);
		}
		return this.anInterface40_4;
	}

	@OriginalMember(owner = "client!apm", name = "y", descriptor = "()Lclient!le;", line = 20)
	@Override
	Interface40 method18666() {
		if (this.anInterface40_4 == null) {
			@Pc(6) Interface24 local6 = this.aClass86_Sub1_31.anInterface24_55;
			@Pc(14) Class215 local14 = this.aClass86_Sub1_31.aClass209_9.method25584(this.anInt2629);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean640) {
				return null;
			}
			if (!local6.method4231(Class596.aClass596_1, this.anInt2629, Class609.aClass609_1, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495)) {
				return null;
			}
			@Pc(60) int[] local60 = local6.method4224(Class596.aClass596_1, this.anInt2629, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495);
			@Pc(70) int local70 = local14.anInt3714 * 1264459495 * local14.anInt3714 * 1264459495;
			if (local60 == null) {
				return null;
			}
			for (@Pc(76) int local76 = 0; local76 < 6; local76++) {
				anIntArrayArray42[local76] = new int[local70];
				System.arraycopy(local60, local70 * local76, anIntArrayArray42[local76], 0, local70);
			}
			this.anInterface40_4 = this.aClass86_Sub1_31.method20638(local14.anInt3714 * 1264459495, local14.aByte120 != 0, anIntArrayArray42);
		}
		return this.anInterface40_4;
	}
}
