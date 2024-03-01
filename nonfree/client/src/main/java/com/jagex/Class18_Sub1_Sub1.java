package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ako")
public class Class18_Sub1_Sub1 extends Class18_Sub1 {

	@OriginalMember(owner = "client!ako", name = "l", descriptor = "[I")
	static final int[] anIntArray232 = new int[6];

	@OriginalMember(owner = "client!ako", name = "h", descriptor = "[[I")
	static final int[][] anIntArrayArray41 = new int[6][];

	@OriginalMember(owner = "client!ako", name = "a", descriptor = "Lclient!aae;")
	Class4_Sub2 aClass4_Sub2_1;

	@OriginalMember(owner = "client!ako", name = "p", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_31;

	@OriginalMember(owner = "client!ako", name = "g", descriptor = "I")
	final int anInt2353;

	@OriginalMember(owner = "client!ako", name = "<init>", descriptor = "(Lclient!abt;I)V", line = 14)
	Class18_Sub1_Sub1(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_Sub2_31 = arg0;
		this.anInt2353 = arg1;
	}

	@OriginalMember(owner = "client!ako", name = "p", descriptor = "()Lclient!aae;", line = 20)
	@Override
	Class4_Sub2 method16877() {
		if (this.aClass4_Sub2_1 == null) {
			@Pc(6) Interface11 local6 = this.aClass21_Sub2_31.anInterface11_6;
			@Pc(14) Class133 local14 = this.aClass21_Sub2_31.aClass134_7.method22906(this.anInt2353);
			if (local14 == null) {
				return null;
			}
			if (local14.anIntArray329 == null) {
				return null;
			}
			anIntArray232[0] = local14.anIntArray329[0];
			anIntArray232[1] = local14.anIntArray329[1];
			anIntArray232[2] = local14.anIntArray329[2];
			anIntArray232[3] = local14.anIntArray329[3];
			anIntArray232[4] = local14.anIntArray329[4];
			anIntArray232[5] = local14.anIntArray329[5];
			@Pc(67) int local67;
			for (local67 = 0; local67 < 6; local67++) {
				if (anIntArray232[local67] < 0) {
					return null;
				}
				if (!local6.method21977(anIntArray232[local67], Class459.aClass459_2, 1.0F, local14.anInt3355 * -1912965795, local14.anInt3355 * -1912965795)) {
					return null;
				}
			}
			local67 = 0;
			while (true) {
				if (local67 >= 6) {
					this.aClass4_Sub2_1 = new Class4_Sub2(this.aClass21_Sub2_31, Class121.aClass121_18, Class127.aClass127_23, local14.anInt3355 * -1912965795, local14.aByte111 != 0, anIntArrayArray41);
					break;
				}
				anIntArrayArray41[local67] = local6.method21969(anIntArray232[local67], 1.0F, local14.anInt3355 * -1912965795, local14.anInt3355 * -1912965795);
				if (anIntArrayArray41[local67] == null || anIntArrayArray41[local67].length != local14.anInt3355 * -1912965795 * local14.anInt3355 * -1912965795) {
					return null;
				}
				local67++;
			}
		}
		return this.aClass4_Sub2_1;
	}

	@OriginalMember(owner = "client!ako", name = "l", descriptor = "()Lclient!aae;", line = 20)
	@Override
	Class4_Sub2 method16878() {
		if (this.aClass4_Sub2_1 == null) {
			@Pc(6) Interface11 local6 = this.aClass21_Sub2_31.anInterface11_6;
			@Pc(14) Class133 local14 = this.aClass21_Sub2_31.aClass134_7.method22906(this.anInt2353);
			if (local14 == null) {
				return null;
			}
			if (local14.anIntArray329 == null) {
				return null;
			}
			anIntArray232[0] = local14.anIntArray329[0];
			anIntArray232[1] = local14.anIntArray329[1];
			anIntArray232[2] = local14.anIntArray329[2];
			anIntArray232[3] = local14.anIntArray329[3];
			anIntArray232[4] = local14.anIntArray329[4];
			anIntArray232[5] = local14.anIntArray329[5];
			@Pc(67) int local67;
			for (local67 = 0; local67 < 6; local67++) {
				if (anIntArray232[local67] < 0) {
					return null;
				}
				if (!local6.method21977(anIntArray232[local67], Class459.aClass459_2, 1.0F, local14.anInt3355 * -1912965795, local14.anInt3355 * -1912965795)) {
					return null;
				}
			}
			local67 = 0;
			while (true) {
				if (local67 >= 6) {
					this.aClass4_Sub2_1 = new Class4_Sub2(this.aClass21_Sub2_31, Class121.aClass121_18, Class127.aClass127_23, local14.anInt3355 * -1912965795, local14.aByte111 != 0, anIntArrayArray41);
					break;
				}
				anIntArrayArray41[local67] = local6.method21969(anIntArray232[local67], 1.0F, local14.anInt3355 * -1912965795, local14.anInt3355 * -1912965795);
				if (anIntArrayArray41[local67] == null || anIntArrayArray41[local67].length != local14.anInt3355 * -1912965795 * local14.anInt3355 * -1912965795) {
					return null;
				}
				local67++;
			}
		}
		return this.aClass4_Sub2_1;
	}

	@OriginalMember(owner = "client!ako", name = "g", descriptor = "()Lclient!aae;", line = 20)
	@Override
	Class4_Sub2 method16876() {
		if (this.aClass4_Sub2_1 == null) {
			@Pc(6) Interface11 local6 = this.aClass21_Sub2_31.anInterface11_6;
			@Pc(14) Class133 local14 = this.aClass21_Sub2_31.aClass134_7.method22906(this.anInt2353);
			if (local14 == null) {
				return null;
			}
			if (local14.anIntArray329 == null) {
				return null;
			}
			anIntArray232[0] = local14.anIntArray329[0];
			anIntArray232[1] = local14.anIntArray329[1];
			anIntArray232[2] = local14.anIntArray329[2];
			anIntArray232[3] = local14.anIntArray329[3];
			anIntArray232[4] = local14.anIntArray329[4];
			anIntArray232[5] = local14.anIntArray329[5];
			@Pc(67) int local67;
			for (local67 = 0; local67 < 6; local67++) {
				if (anIntArray232[local67] < 0) {
					return null;
				}
				if (!local6.method21977(anIntArray232[local67], Class459.aClass459_2, 1.0F, local14.anInt3355 * -1912965795, local14.anInt3355 * -1912965795)) {
					return null;
				}
			}
			local67 = 0;
			while (true) {
				if (local67 >= 6) {
					this.aClass4_Sub2_1 = new Class4_Sub2(this.aClass21_Sub2_31, Class121.aClass121_18, Class127.aClass127_23, local14.anInt3355 * -1912965795, local14.aByte111 != 0, anIntArrayArray41);
					break;
				}
				anIntArrayArray41[local67] = local6.method21969(anIntArray232[local67], 1.0F, local14.anInt3355 * -1912965795, local14.anInt3355 * -1912965795);
				if (anIntArrayArray41[local67] == null || anIntArrayArray41[local67].length != local14.anInt3355 * -1912965795 * local14.anInt3355 * -1912965795) {
					return null;
				}
				local67++;
			}
		}
		return this.aClass4_Sub2_1;
	}

	@OriginalMember(owner = "client!ako", name = "a", descriptor = "()Lclient!aae;", line = 20)
	@Override
	Class4_Sub2 method16879() {
		if (this.aClass4_Sub2_1 == null) {
			@Pc(6) Interface11 local6 = this.aClass21_Sub2_31.anInterface11_6;
			@Pc(14) Class133 local14 = this.aClass21_Sub2_31.aClass134_7.method22906(this.anInt2353);
			if (local14 == null) {
				return null;
			}
			if (local14.anIntArray329 == null) {
				return null;
			}
			anIntArray232[0] = local14.anIntArray329[0];
			anIntArray232[1] = local14.anIntArray329[1];
			anIntArray232[2] = local14.anIntArray329[2];
			anIntArray232[3] = local14.anIntArray329[3];
			anIntArray232[4] = local14.anIntArray329[4];
			anIntArray232[5] = local14.anIntArray329[5];
			@Pc(67) int local67;
			for (local67 = 0; local67 < 6; local67++) {
				if (anIntArray232[local67] < 0) {
					return null;
				}
				if (!local6.method21977(anIntArray232[local67], Class459.aClass459_2, 1.0F, local14.anInt3355 * -1912965795, local14.anInt3355 * -1912965795)) {
					return null;
				}
			}
			local67 = 0;
			while (true) {
				if (local67 >= 6) {
					this.aClass4_Sub2_1 = new Class4_Sub2(this.aClass21_Sub2_31, Class121.aClass121_18, Class127.aClass127_23, local14.anInt3355 * -1912965795, local14.aByte111 != 0, anIntArrayArray41);
					break;
				}
				anIntArrayArray41[local67] = local6.method21969(anIntArray232[local67], 1.0F, local14.anInt3355 * -1912965795, local14.anInt3355 * -1912965795);
				if (anIntArrayArray41[local67] == null || anIntArrayArray41[local67].length != local14.anInt3355 * -1912965795 * local14.anInt3355 * -1912965795) {
					return null;
				}
				local67++;
			}
		}
		return this.aClass4_Sub2_1;
	}
}
