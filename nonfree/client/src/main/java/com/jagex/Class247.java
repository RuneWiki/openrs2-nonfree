package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public class Class247 {

	@OriginalMember(owner = "client!iw", name = "g", descriptor = "Lclient!ew;")
	Class161 aClass161_28 = new Class161(6291456, 256);

	@OriginalMember(owner = "client!iw", name = "p", descriptor = "Lclient!abv;")
	final Class21_Sub3 aClass21_Sub3_39;

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "Lclient!di;")
	final Interface11 anInterface11_8;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lclient!abv;Lclient!di;)V", line = 13)
	Class247(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Interface11 arg1) {
		this.aClass21_Sub3_39 = arg0;
		this.anInterface11_8 = arg1;
	}

	@OriginalMember(owner = "client!iw", name = "s", descriptor = "(Lclient!dp;)Lclient!ic;", line = 19)
	Interface20 method24900(@OriginalArg(0) Class133 arg0) {
		return this.method24901(arg0, arg0.anInt3355 * -1912965795);
	}

	@OriginalMember(owner = "client!iw", name = "y", descriptor = "(Lclient!dp;)Lclient!ic;", line = 19)
	Interface20 method24903(@OriginalArg(0) Class133 arg0) {
		return this.method24901(arg0, arg0.anInt3355 * -1912965795);
	}

	@OriginalMember(owner = "client!iw", name = "x", descriptor = "(Lclient!dp;)Lclient!ic;", line = 19)
	Interface20 method24904(@OriginalArg(0) Class133 arg0) {
		return this.method24901(arg0, arg0.anInt3355 * -1912965795);
	}

	@OriginalMember(owner = "client!iw", name = "u", descriptor = "(Lclient!dp;)Lclient!ic;", line = 19)
	Interface20 method24906(@OriginalArg(0) Class133 arg0) {
		return this.method24901(arg0, arg0.anInt3355 * -1912965795);
	}

	@OriginalMember(owner = "client!iw", name = "p", descriptor = "(Lclient!dp;)Lclient!ic;", line = 19)
	Interface20 method24907(@OriginalArg(0) Class133 arg0) {
		return this.method24901(arg0, arg0.anInt3355 * -1912965795);
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(Lclient!dp;I)Lclient!ic;", line = 23)
	Interface20 method24899(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9 = (long) (arg1 << 16 | arg0.anInt3351 * -1410868471);
		@Pc(15) Interface20 local15 = (Interface20) this.aClass161_28.method23219(local9);
		if (local15 != null) {
			return local15;
		} else if (this.method24902(arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3355 * -1912965795;
			}
			@Pc(85) Interface20 local85;
			if (arg0.aBoolean618 && this.aClass21_Sub3_39.method17131()) {
				@Pc(99) float[] local99 = this.anInterface11_8.method21983(arg0.anInt3351 * -1410868471, 0.7F, arg1, arg1);
				local85 = this.aClass21_Sub3_39.method17440(Class121.aClass121_17, arg1, arg1, true, local99);
			} else {
				@Pc(63) int[] local63;
				if (arg0.aClass458_2 == Class458.aClass458_4 && Class431.method27957(arg0.aByte118)) {
					local63 = this.anInterface11_8.method21969(arg0.anInt3351 * -1410868471, 0.7F, arg1, arg1);
				} else {
					local63 = this.anInterface11_8.method21974(arg0.anInt3351 * -1410868471, 0.7F, arg1, arg1);
				}
				local85 = this.aClass21_Sub3_39.method17501(arg1, arg1, true, local63);
			}
			local85.method8951(arg0.aByte112 == 1, arg0.aByte116 == 1);
			this.aClass161_28.method23239(local85, local9, arg1 * arg1);
			return local85;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!dp;I)Lclient!ic;", line = 23)
	Interface20 method24901(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9 = (long) (arg1 << 16 | arg0.anInt3351 * -1410868471);
		@Pc(15) Interface20 local15 = (Interface20) this.aClass161_28.method23219(local9);
		if (local15 != null) {
			return local15;
		} else if (this.method24902(arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3355 * -1912965795;
			}
			@Pc(85) Interface20 local85;
			if (arg0.aBoolean618 && this.aClass21_Sub3_39.method17131()) {
				@Pc(99) float[] local99 = this.anInterface11_8.method21983(arg0.anInt3351 * -1410868471, 0.7F, arg1, arg1);
				local85 = this.aClass21_Sub3_39.method17440(Class121.aClass121_17, arg1, arg1, true, local99);
			} else {
				@Pc(63) int[] local63;
				if (arg0.aClass458_2 == Class458.aClass458_4 && Class431.method27957(arg0.aByte118)) {
					local63 = this.anInterface11_8.method21969(arg0.anInt3351 * -1410868471, 0.7F, arg1, arg1);
				} else {
					local63 = this.anInterface11_8.method21974(arg0.anInt3351 * -1410868471, 0.7F, arg1, arg1);
				}
				local85 = this.aClass21_Sub3_39.method17501(arg1, arg1, true, local63);
			}
			local85.method8951(arg0.aByte112 == 1, arg0.aByte116 == 1);
			this.aClass161_28.method23239(local85, local9, arg1 * arg1);
			return local85;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(Lclient!dp;I)Lclient!ic;", line = 23)
	Interface20 method24908(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9 = (long) (arg1 << 16 | arg0.anInt3351 * -1410868471);
		@Pc(15) Interface20 local15 = (Interface20) this.aClass161_28.method23219(local9);
		if (local15 != null) {
			return local15;
		} else if (this.method24902(arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3355 * -1912965795;
			}
			@Pc(85) Interface20 local85;
			if (arg0.aBoolean618 && this.aClass21_Sub3_39.method17131()) {
				@Pc(99) float[] local99 = this.anInterface11_8.method21983(arg0.anInt3351 * -1410868471, 0.7F, arg1, arg1);
				local85 = this.aClass21_Sub3_39.method17440(Class121.aClass121_17, arg1, arg1, true, local99);
			} else {
				@Pc(63) int[] local63;
				if (arg0.aClass458_2 == Class458.aClass458_4 && Class431.method27957(arg0.aByte118)) {
					local63 = this.anInterface11_8.method21969(arg0.anInt3351 * -1410868471, 0.7F, arg1, arg1);
				} else {
					local63 = this.anInterface11_8.method21974(arg0.anInt3351 * -1410868471, 0.7F, arg1, arg1);
				}
				local85 = this.aClass21_Sub3_39.method17501(arg1, arg1, true, local63);
			}
			local85.method8951(arg0.aByte112 == 1, arg0.aByte116 == 1);
			this.aClass161_28.method23239(local85, local9, arg1 * arg1);
			return local85;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iw", name = "g", descriptor = "(Lclient!dp;I)Z", line = 49)
	boolean method24902(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3355 * -1912965795;
		}
		if (arg0.aBoolean618 && this.aClass21_Sub3_39.method17131()) {
			return this.anInterface11_8.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_3, 0.7F, arg1, arg1);
		} else if (arg0.aClass458_2 == Class458.aClass458_4 && Class431.method27957(arg0.aByte118)) {
			return this.anInterface11_8.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_2, 0.7F, arg1, arg1);
		} else {
			return this.anInterface11_8.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_1, 0.7F, arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!iw", name = "z", descriptor = "(Lclient!dp;I)Z", line = 49)
	boolean method24905(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3355 * -1912965795;
		}
		if (arg0.aBoolean618 && this.aClass21_Sub3_39.method17131()) {
			return this.anInterface11_8.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_3, 0.7F, arg1, arg1);
		} else if (arg0.aClass458_2 == Class458.aClass458_4 && Class431.method27957(arg0.aByte118)) {
			return this.anInterface11_8.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_2, 0.7F, arg1, arg1);
		} else {
			return this.anInterface11_8.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_1, 0.7F, arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!iw", name = "j", descriptor = "(Lclient!dp;I)Z", line = 49)
	boolean method24911(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3355 * -1912965795;
		}
		if (arg0.aBoolean618 && this.aClass21_Sub3_39.method17131()) {
			return this.anInterface11_8.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_3, 0.7F, arg1, arg1);
		} else if (arg0.aClass458_2 == Class458.aClass458_4 && Class431.method27957(arg0.aByte118)) {
			return this.anInterface11_8.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_2, 0.7F, arg1, arg1);
		} else {
			return this.anInterface11_8.method21977(arg0.anInt3351 * -1410868471, Class459.aClass459_1, 0.7F, arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!iw", name = "l", descriptor = "()V", line = 60)
	void method24909() {
		this.aClass161_28.method23240(5);
	}

	@OriginalMember(owner = "client!iw", name = "n", descriptor = "()V", line = 60)
	void method24912() {
		this.aClass161_28.method23240(5);
	}

	@OriginalMember(owner = "client!iw", name = "h", descriptor = "()V", line = 64)
	void method24910() {
		this.aClass161_28.method23224();
	}

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "()V", line = 64)
	void method24913() {
		this.aClass161_28.method23224();
	}

	@OriginalMember(owner = "client!iw", name = "r", descriptor = "()V", line = 64)
	void method24914() {
		this.aClass161_28.method23224();
	}
}
