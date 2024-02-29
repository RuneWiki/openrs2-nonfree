package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apf")
public class Class91_Sub1_Sub2 extends Class91_Sub1 {

	@OriginalMember(owner = "client!apf", name = "l", descriptor = "[[I")
	static final int[][] anIntArrayArray41 = new int[6][];

	@OriginalMember(owner = "client!apf", name = "c", descriptor = "Lclient!adf;")
	Class78_Sub1 aClass78_Sub1_2;

	@OriginalMember(owner = "client!apf", name = "p", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_35;

	@OriginalMember(owner = "client!apf", name = "v", descriptor = "I")
	final int anInt2573;

	@OriginalMember(owner = "client!apf", name = "<init>", descriptor = "(Lclient!aeq;I)V", line = 14)
	Class91_Sub1_Sub2(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass86_Sub3_35 = arg0;
		this.anInt2573 = arg1;
	}

	@OriginalMember(owner = "client!apf", name = "l", descriptor = "()Lclient!adf;", line = 20)
	@Override
	Class78_Sub1 method18431() {
		if (this.aClass78_Sub1_2 == null) {
			@Pc(6) Interface24 local6 = this.aClass86_Sub3_35.anInterface24_55;
			@Pc(14) Class215 local14 = this.aClass86_Sub3_35.aClass209_9.method25584(this.anInt2573);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean640) {
				return null;
			}
			if (!local6.method4231(Class596.aClass596_1, this.anInt2573, Class609.aClass609_1, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495)) {
				return null;
			}
			@Pc(60) int[] local60 = local6.method4224(Class596.aClass596_1, this.anInt2573, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495);
			@Pc(70) int local70 = local14.anInt3714 * 1264459495 * local14.anInt3714 * 1264459495;
			if (local60 == null) {
				return null;
			}
			for (@Pc(76) int local76 = 0; local76 < 6; local76++) {
				anIntArrayArray41[local76] = new int[local70];
				System.arraycopy(local60, local70 * local76, anIntArrayArray41[local76], 0, local70);
			}
			this.aClass78_Sub1_2 = new Class78_Sub1(this.aClass86_Sub3_35, Class212.aClass212_24, Class206.aClass206_23, local14.anInt3714 * 1264459495, local14.aByte120 != 0, anIntArrayArray41);
		}
		return this.aClass78_Sub1_2;
	}

	@OriginalMember(owner = "client!apf", name = "p", descriptor = "()Lclient!adf;", line = 20)
	@Override
	Class78_Sub1 method18428() {
		if (this.aClass78_Sub1_2 == null) {
			@Pc(6) Interface24 local6 = this.aClass86_Sub3_35.anInterface24_55;
			@Pc(14) Class215 local14 = this.aClass86_Sub3_35.aClass209_9.method25584(this.anInt2573);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean640) {
				return null;
			}
			if (!local6.method4231(Class596.aClass596_1, this.anInt2573, Class609.aClass609_1, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495)) {
				return null;
			}
			@Pc(60) int[] local60 = local6.method4224(Class596.aClass596_1, this.anInt2573, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495);
			@Pc(70) int local70 = local14.anInt3714 * 1264459495 * local14.anInt3714 * 1264459495;
			if (local60 == null) {
				return null;
			}
			for (@Pc(76) int local76 = 0; local76 < 6; local76++) {
				anIntArrayArray41[local76] = new int[local70];
				System.arraycopy(local60, local70 * local76, anIntArrayArray41[local76], 0, local70);
			}
			this.aClass78_Sub1_2 = new Class78_Sub1(this.aClass86_Sub3_35, Class212.aClass212_24, Class206.aClass206_23, local14.anInt3714 * 1264459495, local14.aByte120 != 0, anIntArrayArray41);
		}
		return this.aClass78_Sub1_2;
	}

	@OriginalMember(owner = "client!apf", name = "c", descriptor = "()Lclient!adf;", line = 20)
	@Override
	Class78_Sub1 method18429() {
		if (this.aClass78_Sub1_2 == null) {
			@Pc(6) Interface24 local6 = this.aClass86_Sub3_35.anInterface24_55;
			@Pc(14) Class215 local14 = this.aClass86_Sub3_35.aClass209_9.method25584(this.anInt2573);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean640) {
				return null;
			}
			if (!local6.method4231(Class596.aClass596_1, this.anInt2573, Class609.aClass609_1, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495)) {
				return null;
			}
			@Pc(60) int[] local60 = local6.method4224(Class596.aClass596_1, this.anInt2573, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495);
			@Pc(70) int local70 = local14.anInt3714 * 1264459495 * local14.anInt3714 * 1264459495;
			if (local60 == null) {
				return null;
			}
			for (@Pc(76) int local76 = 0; local76 < 6; local76++) {
				anIntArrayArray41[local76] = new int[local70];
				System.arraycopy(local60, local70 * local76, anIntArrayArray41[local76], 0, local70);
			}
			this.aClass78_Sub1_2 = new Class78_Sub1(this.aClass86_Sub3_35, Class212.aClass212_24, Class206.aClass206_23, local14.anInt3714 * 1264459495, local14.aByte120 != 0, anIntArrayArray41);
		}
		return this.aClass78_Sub1_2;
	}

	@OriginalMember(owner = "client!apf", name = "v", descriptor = "()Lclient!adf;", line = 20)
	@Override
	Class78_Sub1 method18427() {
		if (this.aClass78_Sub1_2 == null) {
			@Pc(6) Interface24 local6 = this.aClass86_Sub3_35.anInterface24_55;
			@Pc(14) Class215 local14 = this.aClass86_Sub3_35.aClass209_9.method25584(this.anInt2573);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean640) {
				return null;
			}
			if (!local6.method4231(Class596.aClass596_1, this.anInt2573, Class609.aClass609_1, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495)) {
				return null;
			}
			@Pc(60) int[] local60 = local6.method4224(Class596.aClass596_1, this.anInt2573, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495);
			@Pc(70) int local70 = local14.anInt3714 * 1264459495 * local14.anInt3714 * 1264459495;
			if (local60 == null) {
				return null;
			}
			for (@Pc(76) int local76 = 0; local76 < 6; local76++) {
				anIntArrayArray41[local76] = new int[local70];
				System.arraycopy(local60, local70 * local76, anIntArrayArray41[local76], 0, local70);
			}
			this.aClass78_Sub1_2 = new Class78_Sub1(this.aClass86_Sub3_35, Class212.aClass212_24, Class206.aClass206_23, local14.anInt3714 * 1264459495, local14.aByte120 != 0, anIntArrayArray41);
		}
		return this.aClass78_Sub1_2;
	}

	@OriginalMember(owner = "client!apf", name = "y", descriptor = "()Lclient!adf;", line = 20)
	@Override
	Class78_Sub1 method18430() {
		if (this.aClass78_Sub1_2 == null) {
			@Pc(6) Interface24 local6 = this.aClass86_Sub3_35.anInterface24_55;
			@Pc(14) Class215 local14 = this.aClass86_Sub3_35.aClass209_9.method25584(this.anInt2573);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean640) {
				return null;
			}
			if (!local6.method4231(Class596.aClass596_1, this.anInt2573, Class609.aClass609_1, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495)) {
				return null;
			}
			@Pc(60) int[] local60 = local6.method4224(Class596.aClass596_1, this.anInt2573, 1.0F, local14.anInt3714 * 1264459495, local14.anInt3714 * 1264459495);
			@Pc(70) int local70 = local14.anInt3714 * 1264459495 * local14.anInt3714 * 1264459495;
			if (local60 == null) {
				return null;
			}
			for (@Pc(76) int local76 = 0; local76 < 6; local76++) {
				anIntArrayArray41[local76] = new int[local70];
				System.arraycopy(local60, local70 * local76, anIntArrayArray41[local76], 0, local70);
			}
			this.aClass78_Sub1_2 = new Class78_Sub1(this.aClass86_Sub3_35, Class212.aClass212_24, Class206.aClass206_23, local14.anInt3714 * 1264459495, local14.aByte120 != 0, anIntArrayArray41);
		}
		return this.aClass78_Sub1_2;
	}
}
