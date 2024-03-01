package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public class Class112 {

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "Lclient!ew;")
	final Class161 aClass161_13 = new Class161(6291456, 256);

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_44;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "Lclient!di;")
	final Interface11 anInterface11_7;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!abt;Lclient!di;)V", line = 14)
	Class112(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Interface11 arg1) {
		this.aClass21_Sub2_44 = arg0;
		this.anInterface11_7 = arg1;
	}

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "(Lclient!dp;)Lclient!aab;", line = 20)
	Class4_Sub1 method22018(@OriginalArg(0) Class133 arg0) {
		return this.method22026(arg0, arg0.anInt3355 * -1912965795);
	}

	@OriginalMember(owner = "client!cj", name = "x", descriptor = "(Lclient!dp;)Lclient!aab;", line = 20)
	Class4_Sub1 method22022(@OriginalArg(0) Class133 arg0) {
		return this.method22026(arg0, arg0.anInt3355 * -1912965795);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!dp;I)Lclient!aab;", line = 24)
	Class4_Sub1 method22026(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class4_Sub1 local9 = (Class4_Sub1) this.aClass161_13.method23219((long) (arg0.anInt3351 * -1410868471));
		if (local9 != null) {
			return local9;
		} else if (this.method22019(arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3355 * -1912965795;
			}
			@Pc(90) Class4_Sub1 local90;
			if (arg0.aBoolean618 && this.aClass21_Sub2_44.method17131()) {
				@Pc(104) float[] local104 = this.anInterface11_7.method21983(arg0.anInt3351 * -1410868471, 0.7F, arg1, arg1);
				local90 = new Class4_Sub1(this.aClass21_Sub2_44, 3553, Class121.aClass121_17, Class127.aClass127_24, arg1, arg1, arg0.aByte111 != 0, local104, Class121.aClass121_17);
			} else {
				@Pc(57) int[] local57;
				if (arg0.aClass458_2 == Class458.aClass458_4 && Class431.method27957(arg0.aByte118)) {
					local57 = this.anInterface11_7.method21969(arg0.anInt3351 * -1410868471, 0.7F, arg1, arg1);
				} else {
					local57 = this.anInterface11_7.method21974(arg0.anInt3351 * -1410868471, 0.7F, arg1, arg1);
				}
				local90 = new Class4_Sub1(this.aClass21_Sub2_44, 3553, arg1, arg1, arg0.aByte111 != 0, local57, 0, 0, false);
			}
			local90.method14074(arg0.aByte112 == 1, arg0.aByte116 == 1);
			this.aClass161_13.method23239(local90, (long) (arg0.anInt3351 * -1410868471), arg1 * arg1);
			return local90;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "(Lclient!dp;I)Z", line = 49)
	boolean method22019(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3355 * -1912965795;
		}
		if (arg0.aBoolean618 && this.aClass21_Sub2_44.method17131()) {
			return this.anInterface11_7.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_3, 0.7F, arg1, arg1);
		} else if (arg0.aClass458_2 == Class458.aClass458_4 && Class431.method27957(arg0.aByte118)) {
			return this.anInterface11_7.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_2, 0.7F, arg1, arg1);
		} else {
			return this.anInterface11_7.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_1, 0.7F, arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "(Lclient!dp;I)Z", line = 49)
	boolean method22023(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3355 * -1912965795;
		}
		if (arg0.aBoolean618 && this.aClass21_Sub2_44.method17131()) {
			return this.anInterface11_7.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_3, 0.7F, arg1, arg1);
		} else if (arg0.aClass458_2 == Class458.aClass458_4 && Class431.method27957(arg0.aByte118)) {
			return this.anInterface11_7.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_2, 0.7F, arg1, arg1);
		} else {
			return this.anInterface11_7.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_1, 0.7F, arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!cj", name = "y", descriptor = "(Lclient!dp;I)Z", line = 49)
	boolean method22025(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3355 * -1912965795;
		}
		if (arg0.aBoolean618 && this.aClass21_Sub2_44.method17131()) {
			return this.anInterface11_7.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_3, 0.7F, arg1, arg1);
		} else if (arg0.aClass458_2 == Class458.aClass458_4 && Class431.method27957(arg0.aByte118)) {
			return this.anInterface11_7.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_2, 0.7F, arg1, arg1);
		} else {
			return this.anInterface11_7.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_1, 0.7F, arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!cj", name = "u", descriptor = "(Lclient!dp;I)Z", line = 49)
	boolean method22029(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3355 * -1912965795;
		}
		if (arg0.aBoolean618 && this.aClass21_Sub2_44.method17131()) {
			return this.anInterface11_7.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_3, 0.7F, arg1, arg1);
		} else if (arg0.aClass458_2 == Class458.aClass458_4 && Class431.method27957(arg0.aByte118)) {
			return this.anInterface11_7.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_2, 0.7F, arg1, arg1);
		} else {
			return this.anInterface11_7.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_1, 0.7F, arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "()V", line = 60)
	void method22016() {
		this.aClass161_13.method23240(5);
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "()V", line = 60)
	void method22024() {
		this.aClass161_13.method23240(5);
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "()V", line = 60)
	void method22027() {
		this.aClass161_13.method23240(5);
	}

	@OriginalMember(owner = "client!cj", name = "z", descriptor = "()V", line = 60)
	void method22028() {
		this.aClass161_13.method23240(5);
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "()V", line = 64)
	void method22017() {
		this.aClass161_13.method23224();
	}

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "()V", line = 64)
	void method22020() {
		this.aClass161_13.method23224();
	}

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "()V", line = 64)
	void method22021() {
		this.aClass161_13.method23224();
	}

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "()V", line = 64)
	void method22030() {
		this.aClass161_13.method23224();
	}
}
