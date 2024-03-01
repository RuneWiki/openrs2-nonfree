package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akv")
public class Class18_Sub2_Sub1 extends Class18_Sub2 {

	@OriginalMember(owner = "client!akv", name = "l", descriptor = "[I")
	static final int[] anIntArray249 = new int[6];

	@OriginalMember(owner = "client!akv", name = "h", descriptor = "[[I")
	static final int[][] anIntArrayArray42 = new int[6][];

	@OriginalMember(owner = "client!akv", name = "a", descriptor = "Lclient!jk;")
	Interface27 anInterface27_4;

	@OriginalMember(owner = "client!akv", name = "p", descriptor = "Lclient!abv;")
	final Class21_Sub3 aClass21_Sub3_31;

	@OriginalMember(owner = "client!akv", name = "g", descriptor = "I")
	final int anInt2459;

	@OriginalMember(owner = "client!akv", name = "<init>", descriptor = "(Lclient!abv;I)V", line = 14)
	Class18_Sub2_Sub1(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_Sub3_31 = arg0;
		this.anInt2459 = arg1;
	}

	@OriginalMember(owner = "client!akv", name = "p", descriptor = "()Lclient!jk;", line = 20)
	@Override
	Interface27 method17012() {
		if (this.anInterface27_4 == null) {
			@Pc(6) Interface11 local6 = this.aClass21_Sub3_31.anInterface11_6;
			@Pc(14) Class133 local14 = this.aClass21_Sub3_31.aClass134_7.method22906(this.anInt2459);
			if (local14 == null) {
				return null;
			}
			if (local14.anIntArray329 == null) {
				return null;
			}
			anIntArray249[0] = local14.anIntArray329[0];
			anIntArray249[1] = local14.anIntArray329[1];
			anIntArray249[2] = local14.anIntArray329[2];
			anIntArray249[3] = local14.anIntArray329[3];
			anIntArray249[4] = local14.anIntArray329[4];
			anIntArray249[5] = local14.anIntArray329[5];
			@Pc(67) int local67;
			for (local67 = 0; local67 < 6; local67++) {
				if (anIntArray249[local67] < 0) {
					return null;
				}
				if (!local6.method21977(anIntArray249[local67], Class459.aClass459_2, 1.0F, local14.anInt3355 * -1912965795, local14.anInt3355 * -1912965795)) {
					return null;
				}
			}
			local67 = 0;
			while (true) {
				if (local67 >= 6) {
					this.anInterface27_4 = this.aClass21_Sub3_31.method17508(local14.anInt3355 * -1912965795, local14.aByte111 != 0, anIntArrayArray42);
					break;
				}
				anIntArrayArray42[local67] = local6.method21969(anIntArray249[local67], 1.0F, local14.anInt3355 * -1912965795, local14.anInt3355 * -1912965795);
				if (anIntArrayArray42[local67] == null || anIntArrayArray42[local67].length != local14.anInt3355 * -1912965795 * local14.anInt3355 * -1912965795) {
					return null;
				}
				local67++;
			}
		}
		return this.anInterface27_4;
	}

	@OriginalMember(owner = "client!akv", name = "a", descriptor = "()Lclient!jk;", line = 20)
	@Override
	Interface27 method17014() {
		if (this.anInterface27_4 == null) {
			@Pc(6) Interface11 local6 = this.aClass21_Sub3_31.anInterface11_6;
			@Pc(14) Class133 local14 = this.aClass21_Sub3_31.aClass134_7.method22906(this.anInt2459);
			if (local14 == null) {
				return null;
			}
			if (local14.anIntArray329 == null) {
				return null;
			}
			anIntArray249[0] = local14.anIntArray329[0];
			anIntArray249[1] = local14.anIntArray329[1];
			anIntArray249[2] = local14.anIntArray329[2];
			anIntArray249[3] = local14.anIntArray329[3];
			anIntArray249[4] = local14.anIntArray329[4];
			anIntArray249[5] = local14.anIntArray329[5];
			@Pc(67) int local67;
			for (local67 = 0; local67 < 6; local67++) {
				if (anIntArray249[local67] < 0) {
					return null;
				}
				if (!local6.method21977(anIntArray249[local67], Class459.aClass459_2, 1.0F, local14.anInt3355 * -1912965795, local14.anInt3355 * -1912965795)) {
					return null;
				}
			}
			local67 = 0;
			while (true) {
				if (local67 >= 6) {
					this.anInterface27_4 = this.aClass21_Sub3_31.method17508(local14.anInt3355 * -1912965795, local14.aByte111 != 0, anIntArrayArray42);
					break;
				}
				anIntArrayArray42[local67] = local6.method21969(anIntArray249[local67], 1.0F, local14.anInt3355 * -1912965795, local14.anInt3355 * -1912965795);
				if (anIntArrayArray42[local67] == null || anIntArrayArray42[local67].length != local14.anInt3355 * -1912965795 * local14.anInt3355 * -1912965795) {
					return null;
				}
				local67++;
			}
		}
		return this.anInterface27_4;
	}

	@OriginalMember(owner = "client!akv", name = "g", descriptor = "()Lclient!jk;", line = 20)
	@Override
	Interface27 method17011() {
		if (this.anInterface27_4 == null) {
			@Pc(6) Interface11 local6 = this.aClass21_Sub3_31.anInterface11_6;
			@Pc(14) Class133 local14 = this.aClass21_Sub3_31.aClass134_7.method22906(this.anInt2459);
			if (local14 == null) {
				return null;
			}
			if (local14.anIntArray329 == null) {
				return null;
			}
			anIntArray249[0] = local14.anIntArray329[0];
			anIntArray249[1] = local14.anIntArray329[1];
			anIntArray249[2] = local14.anIntArray329[2];
			anIntArray249[3] = local14.anIntArray329[3];
			anIntArray249[4] = local14.anIntArray329[4];
			anIntArray249[5] = local14.anIntArray329[5];
			@Pc(67) int local67;
			for (local67 = 0; local67 < 6; local67++) {
				if (anIntArray249[local67] < 0) {
					return null;
				}
				if (!local6.method21977(anIntArray249[local67], Class459.aClass459_2, 1.0F, local14.anInt3355 * -1912965795, local14.anInt3355 * -1912965795)) {
					return null;
				}
			}
			local67 = 0;
			while (true) {
				if (local67 >= 6) {
					this.anInterface27_4 = this.aClass21_Sub3_31.method17508(local14.anInt3355 * -1912965795, local14.aByte111 != 0, anIntArrayArray42);
					break;
				}
				anIntArrayArray42[local67] = local6.method21969(anIntArray249[local67], 1.0F, local14.anInt3355 * -1912965795, local14.anInt3355 * -1912965795);
				if (anIntArrayArray42[local67] == null || anIntArrayArray42[local67].length != local14.anInt3355 * -1912965795 * local14.anInt3355 * -1912965795) {
					return null;
				}
				local67++;
			}
		}
		return this.anInterface27_4;
	}

	@OriginalMember(owner = "client!akv", name = "l", descriptor = "()Lclient!jk;", line = 20)
	@Override
	Interface27 method17013() {
		if (this.anInterface27_4 == null) {
			@Pc(6) Interface11 local6 = this.aClass21_Sub3_31.anInterface11_6;
			@Pc(14) Class133 local14 = this.aClass21_Sub3_31.aClass134_7.method22906(this.anInt2459);
			if (local14 == null) {
				return null;
			}
			if (local14.anIntArray329 == null) {
				return null;
			}
			anIntArray249[0] = local14.anIntArray329[0];
			anIntArray249[1] = local14.anIntArray329[1];
			anIntArray249[2] = local14.anIntArray329[2];
			anIntArray249[3] = local14.anIntArray329[3];
			anIntArray249[4] = local14.anIntArray329[4];
			anIntArray249[5] = local14.anIntArray329[5];
			@Pc(67) int local67;
			for (local67 = 0; local67 < 6; local67++) {
				if (anIntArray249[local67] < 0) {
					return null;
				}
				if (!local6.method21977(anIntArray249[local67], Class459.aClass459_2, 1.0F, local14.anInt3355 * -1912965795, local14.anInt3355 * -1912965795)) {
					return null;
				}
			}
			local67 = 0;
			while (true) {
				if (local67 >= 6) {
					this.anInterface27_4 = this.aClass21_Sub3_31.method17508(local14.anInt3355 * -1912965795, local14.aByte111 != 0, anIntArrayArray42);
					break;
				}
				anIntArrayArray42[local67] = local6.method21969(anIntArray249[local67], 1.0F, local14.anInt3355 * -1912965795, local14.anInt3355 * -1912965795);
				if (anIntArrayArray42[local67] == null || anIntArrayArray42[local67].length != local14.anInt3355 * -1912965795 * local14.anInt3355 * -1912965795) {
					return null;
				}
				local67++;
			}
		}
		return this.anInterface27_4;
	}
}
