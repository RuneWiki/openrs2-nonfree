package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public class Class399 {

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "Lclient!mh;")
	Class399 aClass399_1;

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "Lclient!li;")
	Interface41 anInterface41_1;

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "F")
	float aFloat264;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "F")
	float aFloat265;

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "F")
	float aFloat267;

	@OriginalMember(owner = "client!mh", name = "y", descriptor = "F")
	float aFloat266;

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "J")
	long aLong267;

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "J")
	long aLong268;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(IFLjava/lang/Object;Lclient!ll;Lclient!li;Lclient!mh;)V", line = 15)
	Class399(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) Class379 arg3, @OriginalArg(4) Interface41 arg4, @OriginalArg(5) Class399 arg5) {
		this.aClass399_1 = arg5;
		this.anInterface41_1 = arg4;
		this.aFloat264 = 1.0F;
		this.aFloat265 = arg1;
		this.aFloat267 = -1.0F;
		this.aFloat266 = -1.0F;
		this.aLong267 = -4481104531038263255L;
		this.aLong268 = 712730124581831467L;
	}

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "(I)F", line = 27)
	float method28456() {
		return this.aFloat265;
	}

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "()F", line = 27)
	float method28457() {
		return this.aFloat265;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)F", line = 31)
	public float method28458() {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class399 local3 = this; local3 != null; local3 = local3.method28474()) {
			local1 *= local3.method28456();
		}
		return local1;
	}

	@OriginalMember(owner = "client!mh", name = "x", descriptor = "()F", line = 31)
	public float method28459() {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class399 local3 = this; local3 != null; local3 = local3.method28474()) {
			local1 *= local3.method28456();
		}
		return local1;
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "()F", line = 31)
	public float method28460() {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class399 local3 = this; local3 != null; local3 = local3.method28474()) {
			local1 *= local3.method28456();
		}
		return local1;
	}

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "()F", line = 31)
	public float method28461() {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class399 local3 = this; local3 != null; local3 = local3.method28474()) {
			local1 *= local3.method28456();
		}
		return local1;
	}

	@OriginalMember(owner = "client!mh", name = "r", descriptor = "()F", line = 31)
	public float method28462() {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class399 local3 = this; local3 != null; local3 = local3.method28474()) {
			local1 *= local3.method28456();
		}
		return local1;
	}

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "()V", line = 41)
	void method28463() {
		if (this.anInterface41_1 != null) {
			@Pc(8) float local8 = this.anInterface41_1.method26249();
			if (local8 != this.aFloat264 && this.aFloat266 < 0.0F) {
				this.aFloat267 = this.aFloat264;
				this.aFloat266 = local8;
				this.aLong267 = Class280.method26667() * 4481104531038263255L;
				this.aLong268 = this.aLong267 * 1232882733767576371L + 2513963836655059764L;
			}
		}
		if (this.aFloat266 >= 0.0F) {
			@Pc(47) long local47 = Class280.method26667();
			if (local47 > this.aLong268 * -4099439640659305347L) {
				this.aFloat264 = this.aFloat266;
				this.aFloat266 = -1.0F;
			} else {
				@Pc(68) float local68 = this.aFloat266 - this.aFloat267;
				@Pc(78) long local78 = this.aLong268 * -4099439640659305347L - this.aLong267 * -3255428938666341401L;
				@Pc(83) float local83 = local68 / (float) local78;
				this.aFloat264 = this.aFloat267 + (float) (local47 - this.aLong267 * -3255428938666341401L) * local83;
				if (this.aFloat264 == this.aFloat266) {
					this.aFloat266 = -1.0F;
				}
			}
		}
		this.aFloat264 = Math.min(1.0F, Math.max(this.aFloat264, 0.0F));
	}

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "(B)V", line = 41)
	void method28464() {
		if (this.anInterface41_1 != null) {
			@Pc(8) float local8 = this.anInterface41_1.method26249();
			if (local8 != this.aFloat264 && this.aFloat266 < 0.0F) {
				this.aFloat267 = this.aFloat264;
				this.aFloat266 = local8;
				this.aLong267 = Class280.method26667() * 4481104531038263255L;
				this.aLong268 = this.aLong267 * 1232882733767576371L + 2513963836655059764L;
			}
		}
		if (this.aFloat266 >= 0.0F) {
			@Pc(47) long local47 = Class280.method26667();
			if (local47 > this.aLong268 * -4099439640659305347L) {
				this.aFloat264 = this.aFloat266;
				this.aFloat266 = -1.0F;
			} else {
				@Pc(68) float local68 = this.aFloat266 - this.aFloat267;
				@Pc(78) long local78 = this.aLong268 * -4099439640659305347L - this.aLong267 * -3255428938666341401L;
				@Pc(83) float local83 = local68 / (float) local78;
				this.aFloat264 = this.aFloat267 + (float) (local47 - this.aLong267 * -3255428938666341401L) * local83;
				if (this.aFloat264 == this.aFloat266) {
					this.aFloat266 = -1.0F;
				}
			}
		}
		this.aFloat264 = Math.min(1.0F, Math.max(this.aFloat264, 0.0F));
	}

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "()F", line = 70)
	public float method28465() {
		@Pc(2) float local2 = this.aFloat264;
		for (@Pc(5) Class399 local5 = this.aClass399_1; local5 != null; local5 = local5.method28474()) {
			local2 *= local5.method28469();
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "(I)F", line = 70)
	public float method28466() {
		@Pc(2) float local2 = this.aFloat264;
		for (@Pc(5) Class399 local5 = this.aClass399_1; local5 != null; local5 = local5.method28474()) {
			local2 *= local5.method28469();
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "()F", line = 70)
	public float method28467() {
		@Pc(2) float local2 = this.aFloat264;
		for (@Pc(5) Class399 local5 = this.aClass399_1; local5 != null; local5 = local5.method28474()) {
			local2 *= local5.method28469();
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "()F", line = 70)
	public float method28468() {
		@Pc(2) float local2 = this.aFloat264;
		for (@Pc(5) Class399 local5 = this.aClass399_1; local5 != null; local5 = local5.method28474()) {
			local2 *= local5.method28469();
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mh", name = "y", descriptor = "(I)F", line = 81)
	public float method28469() {
		return this.aFloat264;
	}

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "(FB)V", line = 85)
	public void method28470(@OriginalArg(0) float arg0) {
		if (this.anInterface41_1 == null) {
			this.aFloat266 = arg0;
			this.aFloat267 = this.aFloat264;
			this.aLong267 = Class280.method26667() * 4481104531038263255L;
			this.aLong268 = this.aLong267 * 1232882733767576371L + 2513963836655059764L;
		}
	}

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "(F)V", line = 85)
	public void method28471(@OriginalArg(0) float arg0) {
		if (this.anInterface41_1 == null) {
			this.aFloat266 = arg0;
			this.aFloat267 = this.aFloat264;
			this.aLong267 = Class280.method26667() * 4481104531038263255L;
			this.aLong268 = this.aLong267 * 1232882733767576371L + 2513963836655059764L;
		}
	}

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "(F)V", line = 85)
	public void method28472(@OriginalArg(0) float arg0) {
		if (this.anInterface41_1 == null) {
			this.aFloat266 = arg0;
			this.aFloat267 = this.aFloat264;
			this.aLong267 = Class280.method26667() * 4481104531038263255L;
			this.aLong268 = this.aLong267 * 1232882733767576371L + 2513963836655059764L;
		}
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "()Lclient!mh;", line = 94)
	public Class399 method28473() {
		return this.aClass399_1;
	}

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "(I)Lclient!mh;", line = 94)
	public Class399 method28474() {
		return this.aClass399_1;
	}

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "(I)Z", line = 117)
	static boolean method28475() {
		return Class589.anInt5459 * 1832109523 == -1 ? Class258.method26231(Class589.aString234, Class589.aString233) : Class246.method26127();
	}

	@OriginalMember(owner = "client!mh", name = "y", descriptor = "(IB)V", line = 153)
	static void method28476(@OriginalArg(0) int arg0) {
		@Pc(2) Class232 local2 = Class412.aClass232_81;
		synchronized (Class412.aClass232_81) {
			Class412.aClass232_81.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!mh", name = "mb", descriptor = "(Lclient!yf;S)V", line = 6838)
	static final void method28477(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class529.method30721(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!mh", name = "qm", descriptor = "(Lclient!yf;I)V", line = 7592)
	static final void method28478(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.method25376(local11).method13649();
	}

	@OriginalMember(owner = "client!mh", name = "afy", descriptor = "(Lclient!yf;B)V", line = 10422)
	static final void method28479(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(17) Class77_Sub1_Sub19 local17 = Class615.aClass465_1.method29551(local12);
		if (local17.anIntArray287 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local17.anIntArray287.length;
		}
	}
}
